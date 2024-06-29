import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class619 {

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Laq;")
    private class494 field8756 = new class494(64);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lgga;")
    private class513 field8749;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
    public static int[] field8758 = new int[50];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lfm;II)V")
    public static final void method3549(class281 arg0, int arg1, int arg2) {
        field8753++;
        int var3 = -1;
        int var4 = 0;
        if (class594.field8494 < arg0.field4099) {
            class91.method782(4096, arg0);
        } else if (class594.field8494 > arg0.field4060) {
            class205.method1435(-39, false, arg0);
            var3 = class522.field7312;
            var4 = class116.field1989;
        } else {
            class430.method2513(arg0, true);
        }
        if (arg0.field10347 < 512 || arg0.field10350 < 512 || arg0.field10347 >= (class192.field2891 * 512 - 512) || arg0.field10350 >= (class456.field6225 * 512 - 512)) {
            arg0.field4088 = null;
            var3 = -1;
            var4 = 0;
            arg0.field4060 = 0;
            arg0.field4099 = 0;
            arg0.field4064 = -1;
            arg0.field10347 = arg0.field4142[0] * 512 + (arg0.method209(true) * 256);
            arg0.field10350 = arg0.field4136[0] * 512 + arg0.method209(true) * 256;
            arg0.method1785((byte) 67);
            for (int var5 = 0; var5 < arg0.field4043.length; var5++) {
                arg0.field4043[var5].field8710 = -1;
            }
        }
        if (class719.field10041 == arg0 && (arg0.field10347 < 6144 || arg0.field10350 < 6144 || arg0.field10347 >= (class192.field2891 * 512 - 6144) || arg0.field10350 >= (class456.field6225 * 512 - 6144))) {
            var4 = 0;
            arg0.field4099 = 0;
            arg0.field4060 = 0;
            var3 = -1;
            arg0.field4088 = null;
            arg0.field4064 = -1;
            arg0.field10347 = arg0.field4142[0] * 512 + (arg0.method209(true) * 256);
            arg0.field10350 = arg0.field4136[0] * 512 + arg0.method209(true) * 256;
            arg0.method1785((byte) -105);
            for (int var6 = 0; var6 < arg0.field4043.length; var6++) {
                arg0.field4043[var6].field8710 = -1;
            }
        }
        int var7 = class575.method3389((byte) -126, arg0);
        class289.method1824(-8619, arg0);
        class637.method3629(var4, arg0, 0, var3, var7);
        if (arg1 < -70) {
            class102.method841(false, arg0, var3);
            class496.method2906(114, arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
    public static final int method3550(int arg0, int arg1, int arg2) {
        field8751++;
        if (arg1 < 46) {
            method3549(null, 60, -116);
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public final void method3551(int arg0, int arg1) {
        class494 var3 = this.field8756;
        synchronized (this.field8756) {
            if (arg1 != 0) {
                field8758 = null;
            }
            this.field8756.method2888(arg0, 120);
        }
        field8757++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public final void method3552(boolean arg0) {
        field8752++;
        class494 var2 = this.field8756;
        synchronized (this.field8756) {
            this.field8756.method2881((byte) -66);
        }
        if (arg0) {
            field8755 = 95;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method3553(int arg0) {
        field8758 = null;
        if (arg0 != -1) {
            method3553(-46);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
    public final void method3554(boolean arg0, int arg1) {
        field8759++;
        class494 var3 = this.field8756;
        synchronized (this.field8756) {
            if (!arg0) {
                this.method3554(false, 115);
            }
            this.field8756.method2881((byte) -11);
            this.field8756 = new class494(arg1);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method3555(int arg0) {
        field8754++;
        class494 var2 = this.field8756;
        synchronized (this.field8756) {
            this.field8756.method2893((byte) 120);
            if (arg0 != 1486) {
                this.method3554(true, -87);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Lls;")
    public final class168 method3556(int arg0, int arg1) {
        field8750++;
        class494 var3 = this.field8756;
        class168 var4;
        synchronized (this.field8756) {
            if (arg0 != 512) {
                this.method3552(true);
            }
            var4 = (class168) this.field8756.method2882((long) arg1, (byte) -115);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field8749;
        byte[] var6;
        synchronized (this.field8749) {
            var6 = this.field8749.method3019(class717.method3995((byte) 126, arg1), class454.method2668(arg1, -15268), 83);
        }
        class168 var7 = new class168();
        if (var6 != null) {
            var7.method1245(1, new class431(var6));
        }
        class494 var8 = this.field8756;
        synchronized (this.field8756) {
            this.field8756.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class619(class41 arg0, int arg1, class513 arg2) {
        this.field8749 = arg2;
        if (this.field8749 != null) {
            int var4 = this.field8749.method3011((byte) -106) - 1;
            this.field8749.method3007(-1, var4);
        }
    }
}
