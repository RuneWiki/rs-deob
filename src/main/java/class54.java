import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class54 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
    public static int[] field966 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lij;")
    public static class50 field975 = class78.method578(124, "runes");

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    public static int[] field968 = new int[2000];

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lij;")
    private static class50 field970 = class78.method578(127, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lij;")
    public static class50 field973 = field970;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lnb;")
    public static class142 field979;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIZLwg;)Lwg;")
    public static final class98 method429(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class98 arg6) {
        field972++;
        long var7 = (long) arg0;
        class98 var9 = (class98) class161.field2767.method764((byte) 70, var7);
        if (var9 == null) {
            class202 var10 = class202.method1367(class97.field1809, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1362(64, 768, -50, -10, -50);
            class161.field2767.method765((byte) -123, var9, var7);
        }
        int var11 = arg6.method754();
        int var12 = arg6.method745();
        int var13 = arg6.method750();
        int var14 = arg6.method739();
        class98 var15 = var9.method737(true, true);
        if (arg2 != 0) {
            var15.method744(arg2);
        }
        if (arg5) {
            return null;
        }
        class149 var16 = (class149) var15;
        if (class187.method1260((byte) 93, arg1 + var11, arg4 + var13, class201.field3312) != arg3 || class187.method1260((byte) 118, arg1 + var12, arg4 + var14, class201.field3312) != arg3) {
            for (int var17 = 0; var17 < var16.field2568; var17++) {
                var16.field2556[var17] += class187.method1260((byte) 78, var16.field2553[var17] + arg1, var16.field2570[var17] + arg4, class201.field3312) - arg3;
            }
            var16.field2579 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method430(int arg0) {
        class259.field4512 = 0;
        class213.field3523 = -1;
        class10.field204 = 0;
        class205.field3406 = false;
        class137.field2381 = -1;
        field977++;
        class20.field428 = 0;
        class22.field510 = 0;
        class34.field668 = 0;
        class136.field2368 = 0;
        class99.field1827 = -1;
        class87.field1688 = -1;
        class190.field3141.field3581 = 0;
        class119.field2109.field3581 = 0;
        for (int var1 = 0; var1 < class71.field1370.length; var1++) {
            if (class71.field1370[var1] != null) {
                class71.field1370[var1].field3995 = -1;
            }
        }
        if (arg0 <= 76) {
            field973 = null;
        }
        for (int var2 = 0; var2 < class41.field764.length; var2++) {
            if (class41.field764[var2] != null) {
                class41.field764[var2].field3995 = -1;
            }
        }
        class197.method1325(true);
        class130.field2291 = 1;
        class120.method868(48, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class210.field3492[var3] = true;
        }
        class14.field325.method680((byte) -68);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lij;IILij;)V")
    public static final void method431(class50 arg0, int arg1, int arg2, class50 arg3) {
        class18.method137(-1, arg3, arg1, -1, arg0, (class50) null);
        field974++;
        if (arg2 != 0) {
            method432((class44) null, -56, 88, -42, -65, -48, false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Llj;IIIIIZ)V")
    public static final void method432(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        long var7 = 0L;
        if (arg5 == 0) {
            var7 = class176.method1212(arg3, arg4, arg1);
        } else if (arg5 == 1) {
            var7 = class41.method314(arg3, arg4, arg1);
        } else if (arg5 == 2) {
            var7 = class2.method5(arg3, arg4, arg1);
        } else if (arg5 == 3) {
            var7 = class17.method132(arg3, arg4, arg1);
        }
        if (!arg6) {
            return;
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = ((int) var7 & 0x7DAED) >> 14;
        field976++;
        boolean var13 = false;
        int var14 = ((int) var7 & 0x338761) >> 20;
        class243 var15 = class53.method426((byte) -90, var10);
        if (var15.method1656(10669)) {
            class60.method468(arg3, (byte) -127, arg1, var15, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                client.method609(arg3, arg4, arg1);
            } else if (arg5 == 2) {
                class22.method169(arg3, arg4, arg1);
                if (var15.field4174 != 0 && var15.field4223 + arg4 < 104 && (arg1 + var15.field4223) < 104 && (var15.field4235 + arg4) < 104 && (arg1 + var15.field4235) < 104) {
                    arg0.method329(var14, var15.field4223, var15.field4235, arg1, var15.field4232, arg4, -1);
                    return;
                }
            } else {
                if (arg5 == 3) {
                    class210.method1402(arg3, arg4, arg1);
                    if (var15.field4174 == 1) {
                        arg0.method323(arg1, arg4, -262145);
                        return;
                    }
                }
                return;
            }
            return;
        }
        class96.method723(arg3, arg4, arg1);
        if (var15.field4174 != 0) {
            arg0.method332(var12, -60, arg1, arg4, var15.field4232, var14);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILce;II)V")
    public static final void method433(int arg0, class10 arg1, int arg2, int arg3) {
        field971++;
        if (class206.field3413 != null || class205.field3406 || arg1 == null || class223.method1524(arg1, (byte) 50) == null) {
            return;
        }
        class206.field3413 = arg1;
        class60.field1103 = class223.method1524(arg1, (byte) 50);
        class121.field2133 = arg2;
        class126.field2215 = 0;
        class120.field2114 = arg0;
        if (arg3 == 16244) {
            class69.field1296 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method434(int arg0) {
        field966 = null;
        field970 = null;
        field979 = null;
        field975 = null;
        if (arg0 != -1) {
            field966 = null;
        }
        field968 = null;
        field973 = null;
    }
}
