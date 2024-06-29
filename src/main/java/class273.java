import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class273 extends class303 {

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    private int field4246 = 4096;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    private int field4248 = 0;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4241 = "Loaded input handler";

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Z")
    public static boolean field4243 = false;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field4240 = -1;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "J")
    public static volatile long field4254 = 0L;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field4247 = 0;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "Lii;")
    public static class213 field4253;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 4)
    public class273() {
        super(1, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILpe;I)V", line = 8)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field4251++;
        if (arg2 == 0) {
            this.field4248 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field4246 = arg1.method731(false);
        }
        if (arg0 != -4004) {
            this.field4246 = 60;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V", line = 47)
    public static void method1967(byte arg0) {
        field4253 = null;
        field4241 = null;
        if (arg0 >= -70) {
            method1967((byte) -12);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V", line = 62)
    public static final void method1968(int arg0, int arg1) {
        field4252++;
        if (arg0 == arg1) {
            return;
        }
        if (arg0 == 1) {
            class91.method657(arg1 ^ 0xFFFFFF9C);
        } else if (arg0 == 2) {
            class280.method1999((byte) -71);
        } else if (arg0 == 3) {
            class163.method1205((byte) 84);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)[Lnb;", line = 87)
    public static final class315[] method1969(int arg0) {
        field4244++;
        class315[] var1 = new class315[class103.field1744];
        for (int var2 = arg0; var2 < class103.field1744; var2++) {
            var1[var2] = new class315(class326.field5064, class52.field820, class246.field3811[var2], class62.field962[var2], class108.field1797[var2], class3.field14[var2], class270.field4198[var2], class251.field3871);
        }
        class233.method1680((byte) -12);
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[I", line = 117)
    public final int[] method67(int arg0, int arg1) {
        field4245++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field4248 <= var6 && this.field4246 >= var6 ? 4096 : 0;
            }
        }
        if (arg0 != -3) {
            method1969(115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 171)
    public static final int method1970(boolean arg0, char arg1, String arg2) {
        int var3 = 0;
        field4239++;
        if (arg0) {
            return 38;
        }
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }
}
