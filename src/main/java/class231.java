import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class231 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    public static int[] field3717 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field3720 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Luf;")
    public static class168 field3723 = class148.method1019(-1720, "blinken3:");

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[S")
    public static short[] field3729 = new short[] { 43, 47, 13, 24, 3, 11, 9, 49 };

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Luf;")
    public static class168 field3721 = class148.method1019(-1720, "; Expires=");

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field3728 = 2;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[J")
    public static long[] field3718 = new long[1000];

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Luf;")
    public static class168 field3725 = class148.method1019(-1720, "(U1");

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[B")
    public static byte[] field3716 = new byte[32896];

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field3731;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3716[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lf;IIIZ)V", line = 11)
    public void method702(class231 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3719++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()Z", line = 29)
    public boolean method670() {
        field3726++;
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lf;", line = 37)
    public class231 method667(int arg0, int arg1, int arg2) {
        field3730++;
        return this;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 50)
    public void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 30592) {
            method1575(83);
        }
        field3722++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I", line = 79)
    public static final int method1575(int arg0) {
        if (arg0 >= -84) {
            return -118;
        } else {
            field3727++;
            return 16;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 104)
    public static final void method1576(byte arg0) {
        field3731++;
        if (!class87.field1343) {
            return;
        }
        if (arg0 != 52) {
            field3720 = (int[]) null;
        }
        class145.field2266 = null;
        class87.field1343 = false;
        class130.field2022 = null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 128)
    public static void method1577(byte arg0) {
        field3717 = null;
        int var1 = 10 % ((arg0 + 22) / 60);
        field3720 = null;
        field3721 = null;
        field3716 = null;
        field3725 = null;
        field3718 = null;
        field3723 = null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public abstract int method116();
}
