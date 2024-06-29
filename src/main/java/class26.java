import java.awt.Frame;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class26 extends class25 {

    @OriginalMember(owner = "mapview!ma", name = "y", descriptor = "Lk;")
    public static class21 field324 = class14.method92((byte) 57, "_");

    @OriginalMember(owner = "mapview!ma", name = "B", descriptor = "Lk;")
    public static class21 field327 = class14.method92((byte) 57, "Prev page");

    @OriginalMember(owner = "mapview!ma", name = "F", descriptor = "Lk;")
    public static class21 field330 = class14.method92((byte) 57, "Potters Wheel");

    @OriginalMember(owner = "mapview!ma", name = "A", descriptor = "[Z")
    public static boolean[] field326 = new boolean[112];

    @OriginalMember(owner = "mapview!ma", name = "E", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "mapview!ma", name = "D", descriptor = "Lk;")
    public static class21 field328 = class14.method92((byte) 57, "u_pass");

    @OriginalMember(owner = "mapview!ma", name = "I", descriptor = "Z")
    public static boolean field333 = false;

    @OriginalMember(owner = "mapview!ma", name = "z", descriptor = "I")
    public static int field325 = 500;

    @OriginalMember(owner = "mapview!ma", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field332;

    @OriginalMember(owner = "mapview!ma", name = "G", descriptor = "[I")
    public static int[] field331;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BZLjava/io/DataInputStream;)V", line = 9)
    private final void method171(byte arg0, boolean arg1, DataInputStream arg2) throws IOException {
        if (arg1) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class11 var7 = new class11(var5 + 5);
        var7.method74(false, var4);
        if (arg0 <= -91) {
            var7.method82(var6, 0);
            arg2.readFully(var7.field173, var7.field169, var5);
            this.method160(1188, var7.field173);
            for (int var8 = 0; var8 < super.field309; ++var8) {
                int var9 = arg2.read();
                int var10 = arg2.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class11 var12 = new class11(var10 - -5);
                var12.method74(false, var9);
                var12.method82(var11, 0);
                while (-33554433 > ~var10) {
                    arg2.readFully(var12.field173, var12.field169, 33554432);
                    var12.field169 += 33554432;
                    var10 -= 33554432;
                }
                arg2.readFully(var12.field173, var12.field169, var10);
                super.field308[super.field307[var8]] = var12.field173;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "([BZZZ)V", line = 84)
    private class26(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method171((byte) -119, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "([BZZ)V", line = 102)
    public class26(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 137)
    public static void method172(byte arg0) {
        field330 = null;
        field332 = null;
        if (arg0 != -8) {
            method172((byte) -102);
        }
        field328 = null;
        field326 = null;
        field324 = null;
        field331 = null;
        field327 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I[Lk;)Lk;", line = 170)
    public static final class21 method173(int arg0, class21[] arg1) {
        if (arg1.length < arg0) {
            throw new IllegalArgumentException();
        } else {
            return class29.method179(arg1, arg1.length, 0, 26405);
        }
    }
}
