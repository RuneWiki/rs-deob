import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class41 {

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lu;")
    private static class135 field146 = class87.method676((byte) -75, "white:");

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Z")
    public static boolean field143 = false;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Lu;")
    public static class135 field151 = class87.method676((byte) -48, "p11_full");

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lu;")
    public static class135 field150 = field146;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[J")
    public static long[] field148 = new long[200];

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lu;")
    public static class135 field152 = field146;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Lu;")
    public static class135 field154 = class87.method676((byte) -83, "Offline");

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lpd;")
    public static class108 field153;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method38(int arg0) {
        field154 = null;
        if (arg0 != -7513) {
            return;
        }
        field152 = null;
        field151 = null;
        field146 = null;
        field153 = null;
        field150 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)I")
    public static final int method39(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field144++;
        if (arg0 <= 71) {
            return 42;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
    public static final boolean method40(int arg0, int arg1) {
        field149++;
        if (arg0 < 0) {
            return false;
        } else if (arg1 > -23) {
            return true;
        } else {
            int var2 = class69.field1706[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 13;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class8() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
    public class8(int arg0) {
        this.field145 = arg0;
    }
}
