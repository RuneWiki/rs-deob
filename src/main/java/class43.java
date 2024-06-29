import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class43 extends class322 {

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Lqfa;")
    public static class98 field523 = new class98(104, 2);

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Lbg;")
    public static class464 field528 = new class464();

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "Lqfa;")
    public static class98 field530 = new class98(16, -2);

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "Lgca;")
    public static class249 field531;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "[[[Z")
    public static boolean[][][] field527;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field521;
        int var2 = -70 % ((70 - arg0) / 51);
        return super.field4450.method2753(true).method1126(64) ? 3 : 2;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        field530 = null;
        if (arg0) {
            field523 = null;
        }
        field527 = null;
        field528 = null;
        field523 = null;
        field531 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        ++field522;
        super.field4451 = arg1;
        if (arg0 != 0) {
            field530 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(Z)V")
    public static final void method288(boolean arg0) {
        ++field529;
        int[] var1 = new int[class682.field9361.field8546];
        int var2 = 0;
        for (int var3 = 0; var3 < class682.field9361.field8546; ++var3) {
            class551 var5 = class682.field9361.method3424(var3, false);
            if (~var5.field7689 <= -1 || var5.field7711 >= 0) {
                var1[var2++] = var3;
            }
        }
        class655.field8988 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class655.field8988[var4] = var1[var4];
        }
        if (arg0) {
            method289((byte) 4);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        if (arg1 < 10) {
            method289((byte) 67);
        }
        ++field524;
        return 1;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lch;)V")
    public class43(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(ILch;)V")
    public class43(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4451 < 1 || super.field4451 > 3) {
            super.field4451 = this.method17((byte) -84);
        }
        ++field526;
        if (arg0) {
            field530 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public static final void method289(byte arg0) {
        ++field520;
        int var1 = 0;
        if (class557.field7812.field6548.method20(false) == 1) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (class557.field7812.field6522.method2865(false) == 0) {
            var1 |= 64;
        }
        class515.method3030(-247, var1);
        class612.field8588.method556(125, var1);
        class682.field9361.method3423((byte) -27, var1);
        class231.field3110.method2795(var1, 50);
        class220.field2879.method979(var1, (byte) 115);
        if (arg0 <= -105) {
            class27.method165(var1, 28456);
            class362.method2313(var1, false);
            class581.method3305(15094, var1);
            class285.method1873(var1, 0);
            class510.method3014(3);
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(Z)I")
    public final int method290(boolean arg0) {
        ++field519;
        if (arg0) {
            field527 = null;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BIIIIII)V")
    public static final void method291(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class557.field7812.field6527.method3029(false) != 0 && ~arg6 != -1 && class557.field7828 < 50 && ~arg3 != 0) {
            class503.field7212[class557.field7828++] = new class319((byte) 1, arg3, arg6, arg4, arg2, arg1, arg5, (class105) null);
        }
        if (arg0 != 1) {
            field528 = null;
        }
        ++field525;
    }
}
