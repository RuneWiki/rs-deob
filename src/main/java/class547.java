import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class547 implements class526 {

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lraa;")
    private class679 field7488;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[Lgca;")
    private class160[] field7494;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
    public static int[] field7482 = new int[14];

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7487 = 999999;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "F")
    public static float field7484;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Lr;")
    private class562 field7492;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Z")
    private boolean field7493;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZ)V")
    public static final void method3065(byte arg0, boolean arg1) {
        field7490++;
        for (class502 var2 = (class502) class552.field7525.method2506(68); var2 != null; var2 = (class502) class552.field7525.method2505(-112)) {
            if (var2.field6915 != null) {
                class126.field1759.method1345(var2.field6915);
                var2.field6915 = null;
            }
            if (var2.field6893 != null) {
                class126.field1759.method1345(var2.field6893);
                var2.field6893 = null;
            }
            var2.method242(true);
        }
        if (arg0 <= 87) {
            method3065((byte) -111, true);
        }
        if (!arg1) {
            return;
        }
        for (class502 var3 = (class502) class598.field8232.method2506(68); var3 != null; var3 = (class502) class598.field8232.method2505(-118)) {
            if (var3.field6915 != null) {
                class126.field1759.method1345(var3.field6915);
                var3.field6915 = null;
            }
            var3.method242(true);
        }
        for (class502 var4 = (class502) class140.field1903.method3053((byte) 50); var4 != null; var4 = (class502) class140.field1903.method3056(18113)) {
            if (var4.field6915 != null) {
                class126.field1759.method1345(var4.field6915);
                var4.field6915 = null;
            }
            var4.method242(true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
    public final void method143(int arg0, boolean arg1) {
        boolean var3 = true;
        field7491++;
        class160[] var4 = this.field7494;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class160 var6 = var4[var5];
            if (var6 != null) {
                var6.method374(var3 || this.field7493, (byte) -96);
            }
        }
        this.field7493 = false;
        if (arg0 != -25156) {
            this.method152(109);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(JI)Z")
    public final boolean method150(long arg0, int arg1) {
        field7481++;
        if (arg1 != 5607) {
            field7484 = -0.935349F;
        }
        return ((long) this.field7488.field9646 + arg0) <= class529.method2982((byte) -69);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (class146.field1963 != this.field7492) {
            this.field7493 = true;
            this.field7492 = class146.field1963;
        }
        field7485++;
        this.field7492.method1146(0);
        if (arg0 > -107) {
            return;
        }
        class160[] var2 = this.field7494;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class160 var4 = var2[var3];
            if (var4 != null) {
                var4.method402(122);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
    public static void method3066(int arg0) {
        if (arg0 != 0) {
            field7482 = null;
        }
        field7482 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
    public static final boolean method3067(int arg0, int arg1, int arg2) {
        field7486++;
        if (arg1 != -25879) {
            field7482 = null;
        }
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        field7495++;
        if (!arg0) {
            method3067(-24, 37, 91);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)I")
    public final int method152(int arg0) {
        if (arg0 == -3210) {
            field7483++;
            return this.field7488.field9643;
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lraa;Lkda;)V")
    public class547(class679 arg0, class252 arg1) {
        this.field7488 = arg0;
        this.field7494 = new class160[this.field7488.field9640.length];
        for (int var3 = 0; var3 < this.field7494.length; var3++) {
            this.field7494[var3] = arg1.method1534(this.field7488.field9640[var3], false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I")
    public final int method154(int arg0) {
        field7489++;
        int var2 = 0;
        class160[] var3 = this.field7494;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class160 var5 = var3[var4];
            if (var5 == null || var5.method404(false)) {
                var2++;
            }
        }
        if (arg0 != 19115) {
            this.method143(52, false);
        }
        return var2 * 100 / this.field7494.length;
    }
}
