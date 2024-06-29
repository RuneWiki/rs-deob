import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class26 extends class6 {

    @OriginalMember(owner = "mapview!o", name = "z", descriptor = "Lt;")
    public static class31 field293 = class14.method84(121, "Stagnant Water");

    @OriginalMember(owner = "mapview!o", name = "C", descriptor = "Lt;")
    public static class31 field296 = class14.method84(122, "Platelegs Shop");

    @OriginalMember(owner = "mapview!o", name = "y", descriptor = "Lt;")
    public static class31 field292 = class14.method84(115, "Farming patch");

    @OriginalMember(owner = "mapview!o", name = "A", descriptor = "Lt;")
    public static class31 field294 = class14.method84(118, "Loom");

    @OriginalMember(owner = "mapview!o", name = "B", descriptor = "Z")
    public static boolean field295 = false;

    @OriginalMember(owner = "mapview!o", name = "H", descriptor = "Lt;")
    public static class31 field301 = class14.method84(113, "mapscene");

    @OriginalMember(owner = "mapview!o", name = "F", descriptor = "Lt;")
    public static class31 field299 = class14.method84(119, "Makeover Mage");

    @OriginalMember(owner = "mapview!o", name = "D", descriptor = "Lt;")
    public static class31 field297 = class14.method84(119, "Tannery");

    @OriginalMember(owner = "mapview!o", name = "E", descriptor = "J")
    public static volatile long field298 = 0L;

    @OriginalMember(owner = "mapview!o", name = "K", descriptor = "Lt;")
    public static class31 field304 = class14.method84(121, "Saw Mill");

    @OriginalMember(owner = "mapview!o", name = "G", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "mapview!o", name = "I", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "mapview!o", name = "J", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(ZZLjava/io/DataInputStream;)V", line = 7)
    private final void method167(boolean arg0, boolean arg1, DataInputStream arg2) throws IOException {
        if (!arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class19 var7 = new class19(var5 + 5);
        var7.method111(var4, 67);
        if (arg1) {
            method169((Component) null, 108);
        }
        var7.method104(var6, 117);
        arg2.readFully(var7.field168, var7.field164, var5);
        this.method28(var7.field168, 1);
        for (int var8 = 0; ~super.field37 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class19 var12 = new class19(var10 + 5);
            var12.method111(var9, 64);
            var12.method104(var11, -63);
            while (~var10 < -33554433) {
                var10 -= 33554432;
                arg2.readFully(var12.field168, var12.field164, 33554432);
                var12.field164 += 33554432;
            }
            arg2.readFully(var12.field168, var12.field164, var10);
            super.field41[super.field40[var8]] = var12.field168;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([BZZZ)V", line = 71)
    private class26(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method167(arg3, false, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 107)
    public static void method168(int arg0) {
        field304 = null;
        field292 = null;
        field296 = null;
        if (arg0 == 4) {
            field293 = null;
            field301 = null;
            field294 = null;
            field297 = null;
            field299 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([BZZ)V", line = 142)
    public class26(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 173)
    public static final void method169(Component arg0, int arg1) {
        arg0.removeKeyListener(class11.field78);
        arg0.removeFocusListener(class11.field78);
        if (arg1 != -23466) {
            field296 = (class31) null;
        }
    }
}
