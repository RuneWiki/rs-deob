import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class271 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lvu;")
    private class677 field4159;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Ltm;")
    public static class334 field4160 = new class334(85, -1);

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4163 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field4162 = 0;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Z")
    public static boolean[] field4168 = new boolean[200];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Llh;")
    private class205 field4158;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Llh;")
    public final class205 method1783(int arg0) {
        field4164++;
        class205 var2 = this.field4159.field9552.field3449;
        int var3 = 108 % ((arg0 - 42) / 32);
        if (this.field4159.field9552 == var2) {
            this.field4158 = null;
            return null;
        } else {
            this.field4158 = var2.field3449;
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Llh;")
    public final class205 method1784(byte arg0) {
        field4165++;
        if (arg0 <= 21) {
            return null;
        }
        class205 var2 = this.field4158;
        if (this.field4159.field9552 == var2) {
            this.field4158 = null;
            return null;
        } else {
            this.field4158 = var2.field3449;
            return var2;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class271() {
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLoj;)I")
    public static final int method1785(byte arg0, class208 arg1) {
        field4166++;
        String var2 = class208.method1519(false, arg1);
        int[] var3 = null;
        if (class313.method2064(121, arg1.field3488)) {
            var3 = class556.field7917.method741(118, (int) arg1.field3473).field9701;
        } else if (arg1.field3489 != -1) {
            var3 = class556.field7917.method741(-99, arg1.field3489).field9701;
        } else if (class4.method16((byte) -100, arg1.field3488)) {
            class53 var6 = (class53) class332.field4881.method3512(true, (long) ((int) arg1.field3473));
            if (var6 != null) {
                class461 var7 = var6.field847;
                class504 var8 = var7.field6688;
                if (var8.field7308 != null) {
                    var8 = var8.method3046(101, class422.field6216);
                }
                if (var8 != null) {
                    var3 = var8.field7310;
                }
            }
        } else if (class354.method2271(arg1.field3488, 25)) {
            Object var4 = null;
            class595 var5;
            if (arg1.field3488 == 1006) {
                var5 = class576.field8167.method3074(0, (int) arg1.field3473);
            } else {
                var5 = class576.field8167.method3074(0, (int) (arg1.field3473 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field8351 != null) {
                var5 = var5.method3413(-1, class422.field6216);
            }
            if (var5 != null) {
                var3 = var5.field8434;
            }
        }
        if (var3 != null) {
            var2 = var2 + class740.method4144(var3, (byte) 43);
        }
        if (arg0 <= 30) {
            method1786(70, false, -31, null);
        }
        int var9 = class632.field8881.method508(class625.field8753, var2, 173);
        if (arg1.field3481) {
            var9 += class193.field3341.method175() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZILha;)V")
    public static final void method1786(int arg0, boolean arg1, int arg2, class544 arg3) {
        if (arg1) {
            method1786(52, true, 65, null);
        }
        class121.field1865 = new class22[arg2][arg0];
        class565.field8015 = arg3;
        field4157++;
        if (class463.field6739 != null) {
            class142.field2217 = class426.method2660(class463.field6739[5], class463.field6739[2], class463.field6739[3], class463.field6739[0], (byte) 103, class463.field6739[4], class463.field6739[1]);
        }
        class290.field4471 = new class22();
        class457.method2798(-97);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lvu;)V")
    public class271(class677 arg0) {
        this.field4159 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static void method1787(int arg0) {
        if (arg0 == 1006) {
            field4163 = null;
            field4168 = null;
            field4160 = null;
        }
    }
}
