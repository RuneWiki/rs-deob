import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class253 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
    public static int[] field3700 = new int[3];

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3705 = -1;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lok;")
    public class253 field3707;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lnga;")
    public class513 field3701;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lve;", line = 5)
    public final class503 method1675(int arg0) {
        int var2 = 98 / ((71 - arg0) / 44);
        field3696++;
        return class398.method2487(this.field3703, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lok;", line = 19)
    public final class253 method1676(int arg0, int arg1) {
        field3695++;
        if (arg1 != 18938) {
            this.field3698 = 92;
        }
        return new class253(this.field3703, arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIII)V", line = 31)
    public static final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3694++;
        if (class393.method2476(81, arg5)) {
            if (arg0 != 50) {
                method1678(-98, 78, -24, 97, -127, -122);
            }
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class589.field8295) {
                var14 = class698.field9628;
                var12 = class53.field606;
                var10 = class281.field3998;
                var11 = class426.field5987;
                var13 = class479.field6781;
                class698.field9628 = 1;
            }
            if (class419.field5914[arg5] == null) {
                class526.method3069(arg7 < 0, -1, -13123, arg3, arg8, arg4, arg7, arg2, arg1, arg6, class37.field475[arg5]);
            } else {
                class526.method3069(arg7 < 0, -1, arg0 ^ -13169, arg3, arg8, arg4, arg7, arg2, arg1, arg6, class419.field5914[arg5]);
            }
            if (class589.field8295) {
                if (arg7 >= 0 && class698.field9628 == 2) {
                    class189.method1186(class479.field6781, class53.field606, (byte) -81, class281.field3998, class426.field5987);
                }
                class281.field3998 = var10;
                class698.field9628 = var14;
                class426.field5987 = var11;
                class479.field6781 = var13;
                class53.field606 = var12;
            }
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class583.field8210[var9] = true;
            }
        } else {
            class583.field8210[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)V", line = 102)
    public static final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3699++;
        if (arg1 == arg2) {
            class675.method3732(arg4, (byte) 79, arg1, arg0, arg5);
            return;
        }
        if ((arg0 - arg1) >= class71.field960 && class549.field7665 >= (arg0 + arg1) && arg5 - arg2 >= class143.field2050 && (arg5 + arg2) <= class461.field6495) {
            class448.method2686(0, arg1, arg2, arg5, arg0, arg4);
        } else {
            class408.method2527(arg4, arg3 + 22192, arg0, arg5, arg1, arg2);
        }
        if (arg3 != 3) {
            field3705 = 92;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 126)
    public static void method1679(int arg0) {
        field3700 = null;
        if (arg0 != -1) {
            field3700 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjb;IIILjava/lang/String;Lda;ILqm;IILaa;)V", line = 137)
    public static final void method1680(int arg0, class493 arg1, int arg2, int arg3, int arg4, String arg5, class59 arg6, int arg7, class143 arg8, int arg9, int arg10, class486 arg11) {
        field3697++;
        int var12;
        if (class97.field1168 == 4) {
            var12 = (int) class552.field7773 & 0x3FFF;
        } else {
            var12 = (int) class552.field7773 + class535.field7520 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field7095 / 2, arg1.field7031 / 2) + 10;
        int var14 = arg3 * arg3 + (arg10 * arg10);
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class164.field2258[var12];
        int var16 = class164.field2252[var12];
        if (class97.field1168 != 4) {
            var16 = var16 * 256 / (class180.field2412 + 256);
            var15 = var15 * 256 / (class180.field2412 + 256);
        }
        int var17 = arg3 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - (arg3 * var15) >> 14;
        if (arg4 != 256) {
            return;
        }
        int var19 = arg8.method998(174, 100, arg5, null);
        int var20 = var17 - var19 / 2;
        int var21 = arg8.method996(0, arg5, 100, 0, null);
        if (var20 >= -arg1.field7095 && arg1.field7095 >= var20 && (-arg1.field7031) <= var18 && var18 <= arg1.field7031) {
            arg6.method510(arg1.field7031 / 2 + arg7 - var21 - (var18 - -arg0), arg7, var19, null, 0, arg2, arg11, 1, 0, 50, 0, arg9, arg1.field7095 / 2 + (var20 + arg9), null, arg5, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z", line = 188)
    public static final boolean method1681(int arg0, byte arg1) {
        if (arg1 < 46) {
            return false;
        } else {
            field3708++;
            return (-arg0 & arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(II)V", line = 207)
    public class253(int arg0, int arg1) {
        this.field3693 = arg1;
        this.field3703 = arg0;
    }
}
