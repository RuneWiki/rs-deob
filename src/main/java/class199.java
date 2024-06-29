import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class199 {

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Ljh;")
    private class158 field2864 = new class158();

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lmp;")
    private class758 field2855;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lqca;")
    public static class115 field2850 = new class115(8, 0, 4, 1);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lqe;")
    public static class465 field2854 = new class465(104, 7);

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lqe;")
    public static class465 field2861 = new class465(31, 8);

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "[I")
    public static int[] field2866 = new int[4096];

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
    public static boolean field2868;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lrf;I)V")
    private final void method1391(class83 arg0, int arg1) {
        field2858++;
        long var3 = arg0.method803((byte) 108);
        if (arg1 != 512) {
            return;
        }
        for (class26 var5 = (class26) this.field2855.method4203(true, var3); var5 != null; var5 = (class26) this.field2855.method4210(-127)) {
            if (var5.field373.method802(arg0, (byte) -91)) {
                this.method1397(true, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)Z")
    public static final boolean method1392(byte arg0, int arg1, int arg2) {
        field2848++;
        if (arg0 >= -11) {
            method1394(-99, -122, -50, -70);
        }
        return class348.method2186(arg1, (byte) -128, arg2) & class709.method3964(arg1, arg2, 126);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLrf;Ljava/lang/Object;)V")
    public final void method1393(boolean arg0, class83 arg1, Object arg2) {
        field2860++;
        if (!arg0) {
            this.field2855 = null;
        }
        this.method1400(12084, arg2, 1, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)V")
    public static final void method1394(int arg0, int arg1, int arg2, int arg3) {
        class416 var4 = class390.field5454[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class535 var5 = var4.field5845;
        class535 var6 = var4.field5847;
        if (var5 != null) {
            var5.field7560 = (short) (var5.field7560 * arg3 / (0x10 << class440.field6142 - 7));
            var5.field7557 = (short) (var5.field7557 * arg3 / (0x10 << class440.field6142 - 7));
        }
        if (var6 != null) {
            var6.field7560 = (short) (var6.field7560 * arg3 / (0x10 << class440.field6142 - 7));
            var6.field7557 = (short) (var6.field7557 * arg3 / (0x10 << class440.field6142 - 7));
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZZ)V")
    public static final void method1395(boolean arg0, boolean arg1) {
        field2859++;
        if (arg1) {
            if (class401.field5610 != -1) {
                class397.method2465((byte) -112, class401.field5610);
            }
            for (class548 var2 = (class548) class310.field4383.method4209(false); var2 != null; var2 = (class548) class310.field4383.method4207(9356)) {
                if (!var2.method3618(-128)) {
                    var2 = (class548) class310.field4383.method4209(!arg0);
                    if (var2 == null) {
                        break;
                    }
                }
                class740.method4119(var2, true, false, 126);
            }
            class401.field5610 = -1;
            class310.field4383 = new class758(8);
            class494.method2976((byte) 16);
            class401.field5610 = class104.field1739;
            class319.method2050(0, false);
            class237.method1608(true);
            class357.method2231(class401.field5610);
        }
        class566.field7985 = "";
        class47.field696 = "";
        class98.field1675 = false;
        class537.method3146(-1);
        class458.field6611 = -1;
        class194.method1354((byte) 96, class273.field3898);
        class468.field6748 = new class349();
        class468.field6748.field991[0] = class174.field2540 / 2;
        class468.field6748.field648 = class716.field9999 * 512 / 2;
        class468.field6748.field644 = class174.field2540 * 512 / 2;
        class468.field6748.field995[0] = class716.field9999 / 2;
        class260.field3810 = 0;
        class685.field9660 = 0;
        if (class666.field9338 == 2) {
            class685.field9660 = class435.field6080 << 9;
            class260.field3810 = class268.field3874 << 9;
        } else {
            class228.method1567((byte) -37);
        }
        if (!arg0) {
            field2866 = null;
        }
        class246.method1631(false);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public static void method1396(boolean arg0) {
        field2850 = null;
        if (arg0) {
            field2854 = null;
            field2866 = null;
            field2861 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLir;)V")
    private final void method1397(boolean arg0, class26 arg1) {
        if (arg1 != null) {
            arg1.method3617(1);
            arg1.method1553(-115);
            this.field2869 += arg1.field374;
        }
        field2849++;
        if (!arg0) {
            this.field2869 = 79;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method1398(int arg0) {
        for (class26 var2 = (class26) this.field2864.method1196(-125); var2 != null; var2 = (class26) this.field2864.method1204(false)) {
            if (var2.method192((byte) 17)) {
                var2.method3617(1);
                var2.method1553(-104);
                this.field2869 += var2.field374;
            }
        }
        if (arg0 != 1886042633) {
            this.method1404((byte) -93);
        }
        field2867++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
    public static final boolean method1399(int arg0, int arg1, int arg2) {
        int var3 = 28 / ((arg2 - 87) / 38);
        field2856++;
        return class313.method2024(arg0, 2, arg1) | (arg0 & 0x800) != 0 || class554.method3244(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/Object;ILrf;)V")
    private final void method1400(int arg0, Object arg1, int arg2, class83 arg3) {
        field2853++;
        if (this.field2862 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method1391(arg3, 512);
        this.field2869 -= arg2;
        while (this.field2869 < 0) {
            class26 var6 = (class26) this.field2864.method1200(false);
            this.method1397(true, var6);
        }
        class421 var5 = new class421(arg3, arg1, arg2);
        this.field2855.method4211(var5, (byte) 73, arg3.method803((byte) 108));
        if (arg0 != 12084) {
            field2868 = true;
        }
        this.field2864.method1203(var5, -101);
        var5.field3211 = 0L;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILrf;)Ljava/lang/Object;")
    public final Object method1401(int arg0, class83 arg1) {
        if (arg0 != 0) {
            return null;
        }
        field2852++;
        long var3 = arg1.method803((byte) 108);
        for (class26 var5 = (class26) this.field2855.method4203(true, var3); var5 != null; var5 = (class26) this.field2855.method4210(-126)) {
            if (var5.field373.method802(arg1, (byte) -91)) {
                Object var6 = var5.method194(-3640);
                if (var6 != null) {
                    if (var5.method192((byte) 17)) {
                        class421 var7 = new class421(arg1, var6, var5.field374);
                        this.field2855.method4211(var7, (byte) 11, var5.field8991);
                        this.field2864.method1203(var7, -101);
                        var7.field3211 = 0L;
                        var5.method3617(1);
                        var5.method1553(72);
                    } else {
                        this.field2864.method1203(var5, -101);
                        var5.field3211 = 0L;
                    }
                    return var6;
                }
                var5.method3617(1);
                var5.method1553(79);
                this.field2869 += var5.field374;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(III)Z")
    public static final boolean method1402(int arg0, int arg1, int arg2) {
        field2857++;
        if (arg2 != 11322) {
            method1392((byte) 65, 61, -100);
        }
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public final void method1403(int arg0) {
        field2863++;
        this.field2864.method1199(false);
        if (arg0 != -11635) {
            field2868 = false;
        }
        this.field2855.method4204((byte) -100);
        this.field2869 = this.field2862;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I")
    public final int method1404(byte arg0) {
        field2847++;
        int var2 = -31 % ((arg0 + 46) / 40);
        return this.field2869;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
    public final int method1405(int arg0) {
        field2865++;
        if (arg0 != -18964) {
            method1396(true);
        }
        return this.field2862;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
    public final void method1406(byte arg0, int arg1) {
        field2851++;
        if (class510.field7280 != null) {
            for (class26 var3 = (class26) this.field2864.method1196(-125); var3 != null; var3 = (class26) this.field2864.method1204(false)) {
                if (var3.method192((byte) 17)) {
                    if (var3.method194(-3640) == null) {
                        var3.method3617(1);
                        var3.method1553(86);
                        this.field2869 += var3.field374;
                    }
                } else if ((long) arg1 < ++var3.field3211) {
                    class26 var4 = class510.field7280.method435(var3, (byte) 127);
                    this.field2855.method4211(var4, (byte) 117, var3.field8991);
                    class174.method1272(103, var3, var4);
                    var3.method3617(1);
                    var3.method1553(43);
                }
            }
        }
        if (arg0 < 87) {
            this.method1401(-10, null);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
    public class199(int arg0) {
        this.field2862 = arg0;
        this.field2869 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2855 = new class758(var2);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2866[var0] = class396.method2459(125, var0);
        }
        field2868 = false;
    }
}
