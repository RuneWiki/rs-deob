import java.awt.FontMetrics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class33 {

    @OriginalMember(owner = "mapview!n", name = "y", descriptor = "Lt;")
    public static class31 field290 = class11.method64(-39, "map");

    @OriginalMember(owner = "mapview!n", name = "A", descriptor = "Lt;")
    public static class31 field292 = class11.method64(-60, "Candle Shop");

    @OriginalMember(owner = "mapview!n", name = "F", descriptor = "Lt;")
    public static class31 field297 = class11.method64(107, "overlay)3dat");

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "Lt;")
    public static class31 field296 = class11.method64(-54, "_");

    @OriginalMember(owner = "mapview!n", name = "x", descriptor = "I")
    public static volatile int field289 = 0;

    @OriginalMember(owner = "mapview!n", name = "w", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "Lt;")
    public static class31 field298 = class11.method64(100, "Crafting Shop");

    @OriginalMember(owner = "mapview!n", name = "z", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "mapview!n", name = "B", descriptor = "Ln;")
    public static class26 field293;

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field295;

    @OriginalMember(owner = "mapview!n", name = "C", descriptor = "Ljava/awt/Image;")
    public static Image field294;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 19)
    public static void method148(int arg0) {
        field292 = null;
        field293 = null;
        field295 = null;
        field296 = null;
        field290 = null;
        field298 = null;
        field294 = null;
        if (arg0 == 0) {
            field297 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZZ)V", line = 52)
    private class26(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method149(new DataInputStream(new ByteArrayInputStream(arg0)), 123, arg3);
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZ)V", line = 85)
    public class26(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/io/DataInputStream;IZ)V", line = 104)
    private final void method149(DataInputStream arg0, int arg1, boolean arg2) throws IOException {
        int var4 = arg0.read();
        if (arg2) {
        }
        int var5 = arg0.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class25 var7 = new class25(var5 + 5);
        if (arg1 >= 83) {
            var7.method146((byte) 125, var4);
            var7.method136(var6, -254155608);
            arg0.readFully(var7.field280, var7.field281, var5);
            this.method194(var7.field280, 83);
            for (int var8 = 0; ~super.field395 < ~var8; ++var8) {
                int var9 = arg0.read();
                int var10 = arg0.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class25 var12 = new class25(var10 - -5);
                var12.method146((byte) 122, var9);
                var12.method136(var11, -254155608);
                while (var10 > 33554432) {
                    var10 -= 33554432;
                    arg0.readFully(var12.field280, var12.field281, 33554432);
                    var12.field281 += 33554432;
                }
                arg0.readFully(var12.field280, var12.field281, var10);
                super.field386[super.field393[var8]] = var12.field280;
            }
        }
    }
}
