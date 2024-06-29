import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class88 {

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    private int field1409 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lld;")
    private class118 field1400;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
    public static boolean field1398 = false;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
    public static int[] field1405 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lok;")
    private static class146 field1406 = class235.method1724(-12908, "white:");

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lok;")
    public static class146 field1403 = field1406;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lok;")
    public static class146 field1399 = field1406;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lkj;")
    private class171 field1410;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lje;")
    public static class70 field1394;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[[B")
    public static byte[][] field1396;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 6)
    public static final void method608(int arg0, int arg1) {
        field1402++;
        if (class223.field3718 == arg0) {
            class215.field3560.method870((byte) -112, arg1);
        } else {
            class146.field2456 = arg1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lkj;", line = 20)
    public final class171 method609(byte arg0) {
        int var2 = -7 / ((44 - arg0) / 55);
        field1407++;
        this.field1409 = 0;
        return this.method612((byte) 116);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method610(boolean arg0) {
        field1395++;
        class159.field2681.method791(8);
        if (!arg0) {
            method613(69, -113, 87);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 67)
    public static final void method611(int arg0) {
        class195.method1505();
        class9.field187 = null;
        field1397++;
        class127.field2066 = -1;
        if (arg0 != -2543) {
            return;
        }
        class98.method678((byte) -115);
        class240.field3995.method1510((byte) -128);
        class311.field5298 = new class50();
        ((class120) class109.field1747).method821((byte) -87);
        class53.field968 = 0;
        class53.field956 = new class266[255];
        class176.method1353();
        class48.method396();
        class91.method627(-200924);
        class57.method451(false, -91);
        class95.method652(arg0 + 2446);
        for (int var1 = 0; var1 < 2048; var1++) {
            class234 var2 = class75.field1215[var1];
            if (var2 != null) {
                var2.field3905 = null;
            }
        }
        if (class271.field4640) {
            class48.method401(104, 104);
            class284.method2053();
        }
        class93.method640(class196.field3273, class269.field4619, 26714);
        class187.method1463(class196.field3273, (byte) 121);
        field1394 = null;
        class139.field2311 = null;
        class276.field4737 = null;
        class305.field5225 = null;
        class41.field727 = null;
        if (class238.field3973 == 5) {
            class50.method410(class196.field3273, true);
        }
        if (class238.field3973 == 10) {
            class28.method182(false, arg0 + 14795);
        }
        if (class238.field3973 == 30) {
            class1.method4(-41, 25);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Lkj;", line = 131)
    public final class171 method612(byte arg0) {
        field1404++;
        if (this.field1409 > 0 && this.field1400.field1901[this.field1409 - 1] != this.field1410) {
            class171 var2 = this.field1410;
            this.field1410 = var2.field2896;
            return var2;
        }
        if (arg0 < 115) {
            this.method609((byte) 107);
        }
        class171 var3;
        do {
            if (this.field1400.field1907 <= this.field1409) {
                return null;
            }
            var3 = this.field1400.field1901[this.field1409++].field2896;
        } while (this.field1400.field1901[this.field1409 - 1] == var3);
        this.field1410 = var3.field2896;
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lci;", line = 172)
    public static final class194 method613(int arg0, int arg1, int arg2) {
        field1411++;
        if (arg1 > -97) {
            return (class194) null;
        }
        for (class194 var3 = (class194) class32.field601.method1251(-66); var3 != null; var3 = (class194) class32.field601.method1253(58)) {
            if (var3.field3226 && var3.method1498(arg2, arg0, 11052)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V", line = 199)
    public static void method614(boolean arg0) {
        field1396 = (byte[][]) null;
        field1406 = null;
        if (!arg0) {
            field1399 = (class146) null;
        }
        field1394 = null;
        field1403 = null;
        field1405 = null;
        field1399 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILfg;II)Lfg;", line = 215)
    public static final class208 method615(int arg0, int arg1, int arg2, int arg3, class208 arg4, int arg5, int arg6) {
        field1401++;
        if (arg2 != 2) {
            method613(88, 65, -104);
        }
        long var7 = (long) arg1;
        class208 var9 = (class208) class177.field3000.method799((byte) 52, var7);
        if (var9 == null) {
            class130 var10 = class130.method957(class275.field4728, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method961(64, 768, -50, -10, -50);
            class177.field3000.method797(var9, 0, var7);
        }
        int var11 = arg4.method1360();
        int var12 = arg4.method1382();
        int var13 = arg4.method1372();
        int var14 = arg4.method1391();
        class208 var15 = var9.method1367(true, true);
        if (arg3 != 0) {
            var15.method1398(arg3);
        }
        if (class271.field4640) {
            class176 var18 = (class176) var15;
            if (arg0 != class19.method141(arg5 + var11, class203.field3387, arg6 + var13, 123) || class19.method141(arg5 + var12, class203.field3387, arg6 + var14, 124) != arg0) {
                for (int var19 = 0; var19 < var18.field2962; var19++) {
                    var18.field2960[var19] += class19.method141(var18.field2940[var19] + arg5, class203.field3387, var18.field2973[var19] + arg6, 118) - arg0;
                }
                var18.field2967.field1419 = false;
                var18.field2950.field974 = false;
            }
        } else {
            class220 var16 = (class220) var15;
            if (arg0 != class19.method141(arg5 + var11, class203.field3387, arg6 + var13, 120) || arg0 != class19.method141(arg5 + var12, class203.field3387, arg6 + var14, 123)) {
                for (int var17 = 0; var17 < var16.field3625; var17++) {
                    var16.field3655[var17] += class19.method141(var16.field3653[var17] + arg5, class203.field3387, var16.field3636[var17] + arg6, 119) - arg0;
                }
                var16.field3637 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lld;)V", line = 304)
    public class88(class118 arg0) {
        this.field1400 = arg0;
    }
}
