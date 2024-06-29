import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class635 {

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lpaa;")
    private class578 field8772 = new class578();

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "Lje;")
    private class367 field8781 = new class367();

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    private int field8778;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    private int field8780;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "Lfaa;")
    private class139 field8776;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Llh;")
    public static class487 field8770 = new class487(57, 7);

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Ltb;")
    public static class365 field8783 = new class365();

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
    public static int[] field8786 = new int[14];

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Lma;")
    public static class12 field8782;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[Lvv;")
    public static class295[] field8784;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "[Lf;")
    public static class702[] field8775;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(JI)Lpaa;", line = 5)
    public final class578 method3543(long arg0, int arg1) {
        if (arg1 != -24045) {
            method3546(null, (byte) 99);
        }
        field8777++;
        class578 var4 = (class578) this.field8776.method970((byte) 89, arg0);
        if (var4 != null) {
            this.field8781.method2123(var4, arg1 ^ 0x5DEC);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILlj;IIII)Lnea;", line = 29)
    public static final class665 method3544(int arg0, class565 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 54) {
            return null;
        }
        field8773++;
        if (!arg1.field7870 && (!class588.method3342(44, arg4) || !class588.method3342(-97, arg0))) {
            return arg1.field7973 ? new class665(arg1, 34037, arg3, arg5, arg4, arg0, true) : new class665(arg1, arg3, arg5, arg4, arg0, class206.method1334(-1, arg4), class206.method1334(-1, arg0), true);
        } else {
            return new class665(arg1, 3553, arg3, arg5, arg4, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIZ)I", line = 52)
    public static final int method3545(int arg0, int arg1, int arg2, boolean arg3) {
        field8785++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            if (!arg3) {
                method3545(-60, -79, -54, false);
            }
            return 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lac;B)Lkp;", line = 77)
    public static final class452 method3546(class501 arg0, byte arg1) {
        field8774++;
        int var2 = arg0.method2874((byte) -75);
        class594 var3 = class154.method1103((byte) 124)[arg0.method2874((byte) -75)];
        class12 var4 = class568.method3248(-1)[arg0.method2874((byte) -75)];
        int var5 = arg0.method2875(false);
        int var6 = arg0.method2875(false);
        int var7 = arg0.method2845(-1);
        int var8 = arg0.method2845(-1);
        int var9 = arg0.method2840(false);
        int var10 = arg0.method2840(false);
        int var11 = arg0.method2840(false);
        if (arg1 >= -69) {
            return null;
        } else {
            boolean var12 = arg0.method2874((byte) -75) == 1;
            return new class452(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 112)
    public final void method3547(byte arg0) {
        this.field8781.method2119(0);
        field8771++;
        this.field8776.method974(-20470);
        this.field8772 = new class578();
        if (arg0 <= -28) {
            this.field8778 = this.field8780;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(JILpaa;)V", line = 128)
    public final void method3548(long arg0, int arg1, class578 arg2) {
        if (this.field8778 == 0) {
            class578 var5 = this.field8781.method2116(arg1 - 3);
            var5.method2340(99);
            var5.method3301(arg1 ^ 0x49);
            if (this.field8772 == var5) {
                class578 var6 = this.field8781.method2116(4);
                var6.method2340(arg1 ^ 0xFFFFFFB0);
                var6.method3301(72);
            }
        } else {
            this.field8778--;
        }
        if (arg1 != 7) {
            field8786 = null;
        }
        field8779++;
        this.field8776.method968(arg0, arg2, -1);
        this.field8781.method2123(arg2, -1);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(I)V", line = 208)
    public class635(int arg0) {
        this.field8778 = arg0;
        this.field8780 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field8776 = new class139(var2);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V", line = 177)
    public static void method3549(boolean arg0) {
        field8770 = null;
        field8786 = null;
        field8784 = null;
        if (arg0) {
            method3549(false);
        }
        field8783 = null;
        field8782 = null;
        field8775 = null;
    }
}
