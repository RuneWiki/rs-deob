import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class227 implements class58 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lla;")
    public class422 field3635;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lhc;")
    public class70 field3638;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lla;")
    private class422 field3636;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "J")
    private long field3644;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lda;")
    private class400 field3641;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[I")
    public static int[] field3632;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
    public boolean method574(byte arg0) {
        field3642++;
        boolean var2 = true;
        if (!this.field3635.method2621(this.field3638.field1074, -28975)) {
            var2 = false;
        }
        if (!this.field3636.method2621(this.field3638.field1074, -28975)) {
            var2 = false;
        }
        return arg0 <= 96 ? false : var2;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3632 = null;
        if (arg0 <= 120) {
            field3632 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
    public static final void method1585(boolean arg0, int arg1) {
        class511.field7416 = 100;
        field3631++;
        class173.field2953 = arg1;
        class214.field3547 = -1;
        if (!arg0) {
            field3632 = null;
        }
        class167.field2913 = 3;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static final void method1586(byte arg0) {
        field3640++;
        if (arg0 <= 98) {
            method1584(28);
        }
        int var1 = class654.field9289.field5404.method136(3);
        if (var1 == 0) {
            class327.field4817 = null;
            class614.method3507((byte) -81, 0);
        } else if (var1 == 1) {
            class590.method3389((byte) 0, (byte) 96);
            class614.method3507((byte) 21, 512);
            if (class434.field6341 != null) {
                class458.method2800(0);
            }
        } else {
            class590.method3389((byte) (class475.field6901 - 4 & 0xFF), (byte) 67);
            class614.method3507((byte) 118, 2);
        }
        class546.field7807 = class582.field8234;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILraa;ILaa;Lda;IILjava/lang/String;IILpia;I)V")
    public static final void method1587(int arg0, class353 arg1, int arg2, class570 arg3, class400 arg4, int arg5, int arg6, String arg7, int arg8, int arg9, class54 arg10, int arg11) {
        field3633++;
        int var12;
        if (class639.field8978 == 4) {
            var12 = (int) class261.field4064 & 0x3FFF;
        } else {
            var12 = (int) class261.field4064 + class25.field252 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field5230 / 2, arg1.field5280 / 2) + 10;
        int var14 = arg2 * arg2 + arg11 * arg11;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class582.field8226[var12];
        int var16 = class582.field8230[var12];
        if (class639.field8978 != arg0) {
            var15 = var15 * 256 / (class754.field10516 + 256);
            var16 = var16 * 256 / (class754.field10516 + 256);
        }
        int var17 = arg2 * var15 + arg11 * var16 >> 14;
        int var18 = arg2 * var16 - (arg11 * var15) >> 14;
        int var19 = arg10.method506(0, arg7, 100, null);
        int var20 = arg10.method512(0, null, arg0 + 1380, arg7, 100);
        int var21 = var17 - var19 / 2;
        if (var21 >= -arg1.field5230 && arg1.field5230 >= var21 && var18 >= -arg1.field5280 && arg1.field5280 >= var18) {
            arg4.method2468(0, arg5, 0, 0, arg8, arg1.field5280 / 2 + arg8 - var20 - arg6 - var18, arg1.field5230 / 2 + (var21 - -arg5), null, arg7, 0, 50, null, arg3, arg9, 1, var19);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
    public final int method1588(int arg0) {
        field3645++;
        int var2 = class346.field5112.method3981(true);
        if (arg0 != -1046) {
            this.field3638 = null;
        }
        int var3 = var2 * 100;
        if (this.field3643 == var2 && var2 != 0) {
            int var4 = class346.field5112.method3983(arg0 - 29403);
            if (var2 < var4) {
                long var5 = this.field3644 - class346.field5112.method3991(true);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class18.method109(-11121) - this.field3644) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field3643 = var2;
            this.field3644 = class18.method109(-11121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/lang/String;Lha;IIII)V")
    public static final void method1589(int arg0, int arg1, String arg2, class544 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class97.field1435 == null || class421.field6175 == null) {
            if (class101.field1494.method2621(class351.field5134, -28975) && class101.field1494.method2621(class176.field3019, -28975)) {
                class97.field1435 = arg3.method310(class726.method4002(class101.field1494, class351.field5134, 0), true);
                class726 var8 = class726.method4002(class101.field1494, class176.field3019, 0);
                class421.field6175 = arg3.method310(var8, true);
                var8.method4015();
                class505.field7372 = arg3.method310(var8, true);
            } else {
                arg3.method410(arg6, arg0, arg5, arg7, class148.field2315 | 255 - class521.field7526 << 24, 1);
            }
        }
        field3639++;
        if (class97.field1435 != null && class421.field6175 != null) {
            int var9 = (arg5 - class421.field6175.method175() * 2) / class97.field1435.method175();
            for (int var10 = 0; var10 < var9; var10++) {
                class97.field1435.method182(class421.field6175.method175() + arg6 + class97.field1435.method175() * var10, arg0);
            }
            class421.field6175.method182(arg6, arg0);
            class505.field7372.method182(arg5 + arg6 - class505.field7372.method175(), arg0);
        }
        class257.field4034.method2483(class174.field2999 | 0xFF000000, arg6 + 3, arg2, arg0 + 14, arg4 + -858567318, -1);
        arg3.method410(arg6, arg0 + arg7, arg5, arg1 - arg7, -class521.field7526 + 255 << 24 | class148.field2315, 1);
        if (arg4 != 858567256) {
            field3632 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public void method576(int arg0) {
        if (arg0 != -28886) {
            this.field3638 = null;
        }
        field3634++;
        class54 var2 = class273.method1796(-113, this.field3636, this.field3638.field1074);
        this.field3641 = class364.field5573.method424(var2, class726.method4016(this.field3635, this.field3638.field1074), true);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZI)V")
    public abstract void method824(boolean arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIZ)V")
    public abstract void method821(int arg0, byte arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V")
    public final void method575(boolean arg0, boolean arg1) {
        field3637++;
        int var3 = this.field3638.field1081.method3824(class335.field4917, (byte) -125, this.field3638.field1076) + this.field3638.field1082;
        int var4 = this.field3638.field1075.method2088(this.field3638.field1078, (byte) -120, class614.field8651) + this.field3638.field1079;
        this.method824(false, var3, arg1, var4);
        this.method821(var3, (byte) -30, var4, arg1);
        String var5 = class346.field5112.method3978(100);
        if ((class18.method109(-11121) - this.field3644) > 10000L) {
            var5 = var5 + " (" + class346.field5112.method3985(arg0).method2683((byte) 66) + ")";
        }
        if (arg0) {
            this.field3641.method2473(false, -1, var5, var4 + (this.field3638.field1078 / 2) + this.field3638.field1071 + 4, this.field3638.field1073, var3 + (this.field3638.field1076 / 2));
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lla;Lla;Lhc;)V")
    public class227(class422 arg0, class422 arg1, class70 arg2) {
        this.field3635 = arg0;
        this.field3638 = arg2;
        this.field3636 = arg1;
    }
}
