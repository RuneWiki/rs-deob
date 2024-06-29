import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class754 {

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10476 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lpf;")
    public static class728 field10479 = new class728();

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public int field10471;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field10472;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10478;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lrs;")
    public class169 field10477;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Ltba;")
    public final synchronized class320 method4179(int arg0) {
        field10475++;
        class320 var2 = (class320) this.field10477.field2313.method3200((long) this.field10472, arg0 ^ 0xFFFFB1F1);
        if (var2 != null) {
            return var2;
        }
        class320 var3 = class320.method1870(this.field10477.field2302, this.field10472, arg0);
        if (var3 != null) {
            this.field10477.field2313.method3199((byte) 78, var3, (long) this.field10472);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILvj;I)V")
    private final void method4180(int arg0, class26 arg1, int arg2) {
        field10478++;
        if (arg2 <= 46) {
            return;
        }
        if (arg0 == 1) {
            this.field10472 = arg1.method193(2);
        } else if (arg0 == 2) {
            this.field10471 = arg1.method194((byte) 119);
            this.field10470 = arg1.method194((byte) 119);
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lvj;B)V")
    public final void method4181(class26 arg0, byte arg1) {
        if (arg1 != -119) {
            return;
        }
        field10473++;
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method4180(var3, arg0, arg1 + 169);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method4182(byte arg0) {
        if (arg0 != 50) {
            method4183(61);
        }
        field10474++;
        class12 var1 = (class12) class36.field508.method3118((byte) 73);
        boolean var2 = class740.field10315 != null || class392.field5462 > 0;
        int var3 = var1.method63(5245);
        int var4 = var1.method64(arg0 - 51);
        if (var2) {
            class559.field7945 = 1;
        }
        if (var2) {
            class717.field10138 = class627.field8950;
        } else {
            class541.method3220(class627.field8950, true, var4, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static void method4183(int arg0) {
        field10479 = null;
        if (arg0 != 0) {
            field10476 = 52;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)Z")
    public static boolean method4184(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
