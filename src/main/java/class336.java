import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class336 {

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "Lib;")
    private class1 field4313 = new class1();

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "F")
    public static float field4306;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "F")
    public static float field4309;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "Lib;")
    private class1 field4320;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "Lqc;")
    public static class379 field4314;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)Lib;")
    public final class1 method1944(int arg0) {
        field4317++;
        if (arg0 != 9408) {
            return null;
        }
        class1 var2 = this.field4320;
        if (this.field4313 == var2) {
            this.field4320 = null;
            return null;
        } else {
            this.field4320 = var2.field3;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)Lib;")
    public final class1 method1945(boolean arg0) {
        field4308++;
        class1 var2 = this.field4313.field3;
        if (arg0) {
            this.field4313 = null;
        }
        if (this.field4313 == var2) {
            this.field4320 = null;
            return null;
        } else {
            this.field4320 = var2.field3;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILib;)V")
    public final void method1946(int arg0, class1 arg1) {
        if (arg1.field4 != null) {
            arg1.method1(125);
        }
        field4318++;
        arg1.field3 = this.field4313;
        if (arg0 > -109) {
            field4314 = null;
        }
        arg1.field4 = this.field4313.field4;
        arg1.field4.field3 = arg1;
        arg1.field3.field4 = arg1;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
    public static final boolean method1947(int arg0, int arg1, int arg2) {
        if (arg2 != -13083) {
            field4314 = null;
        }
        field4319++;
        return class90.method546(arg0, 7804, arg1) || class164.method1020(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILrea;)[I")
    public static final int[] method1948(int arg0, class120 arg1) {
        field4311++;
        class26 var2 = new class26(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method184(10, -45);
        var2.method199(true, var3[0]);
        var2.method199(true, var3[1]);
        var2.method199(true, var3[2]);
        var2.method199(true, var3[3]);
        for (int var5 = arg0; var5 < 10; var5++) {
            var2.method199(true, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method147((byte) 53, (int) (Math.random() * 9.9999999E7D));
        var2.method140(class502.field7017, class594.field8564, arg0 - 12623);
        arg1.field1653.method155(0, var2.field330, var2.field279, 67);
        return var3;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(Z)Lib;")
    public final class1 method1949(boolean arg0) {
        field4310++;
        class1 var2 = this.field4313.field4;
        if (this.field4313 == var2) {
            this.field4320 = null;
            return null;
        }
        this.field4320 = var2.field4;
        if (!arg0) {
            field4306 = 0.37283903F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
    public final boolean method1950(int arg0) {
        if (arg0 >= -105) {
            field4314 = null;
        }
        field4321++;
        return this.field4313.field3 == this.field4313;
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)I")
    public final int method1951(int arg0) {
        field4312++;
        int var2 = arg0;
        for (class1 var3 = this.field4313.field3; var3 != this.field4313; var3 = var3.field3) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "(I)Lib;")
    public final class1 method1952(int arg0) {
        field4316++;
        class1 var2 = this.field4313.field3;
        if (this.field4313 == var2) {
            return null;
        } else if (arg0 > -29) {
            return null;
        } else {
            var2.method1(-93);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public static void method1953(byte arg0) {
        if (arg0 <= 103) {
            field4309 = 0.79558086F;
        }
        field4314 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(II)V")
    public static final void method1954(int arg0, int arg1) {
        field4307++;
        if (arg1 == -5) {
            class118 var2 = class126.method814(true, arg0, 4);
            var2.method778(arg1 ^ 0xFFFF92B9);
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
    public class336() {
        this.field4313.field3 = this.field4313;
        this.field4313.field4 = this.field4313;
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(Z)V")
    public final void method1955(boolean arg0) {
        while (true) {
            class1 var2 = this.field4313.field3;
            if (this.field4313 == var2) {
                field4315++;
                this.field4320 = null;
                if (!arg0) {
                    this.method1946(-34, null);
                    return;
                }
                return;
            }
            var2.method1(104);
        }
    }
}
