import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class206 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3220 = Calendar.getInstance();

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3231 = " ";

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field3230 = -1;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Ljf;")
    public static class216 field3233 = new class216(30);

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Lol;")
    public static class220 field3234 = new class220();

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lki;ILva;)V")
    public static final void method1417(class152 arg0, int arg1, class138 arg2) {
        field3227++;
        class91 var3 = arg0.method1048(5505);
        if (var3 == null) {
            return;
        }
        int var4 = arg2.field1989;
        int var5 = arg2.field1991;
        if (arg1 != -4) {
            return;
        }
        int var6 = var3.field2946;
        int var7 = 0;
        int var8 = 0;
        if (var3.field2952 > var3.field2946) {
            var6 = var3.field2952;
        }
        int var9 = 0;
        if (arg0.field2243 != null) {
            var9 = class178.field2788.method1488(arg0.field2243, (int[]) null, class89.field1334);
            for (int var10 = 0; var10 < var9; var10++) {
                String var11 = class89.field1334[var10];
                if (var10 < (var9 - 1)) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class260.field4224.method1739(var11);
                if (var12 > var7) {
                    var7 = var12;
                }
            }
            var8 = (var9 - 1) * class260.field4224.method1744() + (class260.field4224.method1742() / 2);
        }
        int var13 = arg2.field1991;
        int var14 = arg2.field1989 - (var8 / 2);
        if (var5 < class207.field3260 + var6) {
            var13 = var6 + (var7 / 2) + var6 / 2 + class207.field3260 + 5;
            var5 = class207.field3260 + var6;
        } else if (var5 > class207.field3249 - var6) {
            var5 = class207.field3249 - var6;
            var13 = class207.field3249 - (var6 / 2) - (var7 / 2) - var6 - 5;
        }
        if (var4 < class207.field3259 + var6) {
            var4 = class207.field3259 + var6;
            var14 = var6 / 2 + var6 + class207.field3259 + class260.field4224.method1744();
        } else if (var4 > (class207.field3257 - var6)) {
            var4 = class207.field3257 - var6;
            var14 = class207.field3257 - var6 - (var6 / 2) - var8;
        }
        int var15 = var6 >> 1;
        int var16 = (int) ((Math.atan2((double) (var5 - arg2.field1991), (double) (var4 - arg2.field1989)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        int var17 = -2;
        var3.method620(var3.field2951 << 3, var3.field2945 << 3, (var5 << 4) + var15, (var4 << 4) + var15, var16, 4096);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (arg0.field2243 != null) {
            var17 = var13 - (var7 / 2) - 5;
            var19 = var7 + var17 + 10;
            var18 = var14 - class260.field4224.method1742() - 3;
            var20 = var18 + (var9 * class260.field4224.method1744());
            if (arg0.field2248 != 0) {
                class151.method1033(var17, var18, var19 - var17, var20 - var18, arg0.field2248, arg0.field2248 >>> 24);
            }
            if (arg0.field2256 != 0) {
                class151.method1035(var17, var18, var19 - var17, -var18 + var20, arg0.field2256, arg0.field2256 >>> 24);
            }
            for (int var21 = 0; var21 < var9; var21++) {
                String var22 = class89.field1334[var21];
                if (var21 < var9 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class260.field4224.method1741(var22, var13, var14, arg0.field2260, true);
                var14 += class260.field4224.method1744();
            }
        }
        if (var5 - var15 >= class50.field633 || (var5 + var15) <= class50.field633 || var4 - var15 >= class71.field1042 || class71.field1042 >= (var4 + var15) && class50.field633 <= var17 || class50.field633 >= var19 || var18 >= class71.field1042 || class71.field1042 >= var20) {
            return;
        }
        if (arg0.field2245[4] != null) {
            class28.method142(arg0.field2259, -105, arg0.field2245[4], 0, (short) 1008, (long) arg2.field1987, 0, -1);
        }
        if (arg0.field2245[3] != null) {
            class28.method142(arg0.field2259, -122, arg0.field2245[3], 0, (short) 1006, (long) arg2.field1987, 0, -1);
        }
        if (arg0.field2245[2] != null) {
            class28.method142(arg0.field2259, arg1 ^ 0x4C, arg0.field2245[2], 0, (short) 1012, (long) arg2.field1987, 0, -1);
        }
        if (arg0.field2245[1] != null) {
            class28.method142(arg0.field2259, 51, arg0.field2245[1], 0, (short) 1010, (long) arg2.field1987, 0, -1);
        }
        if (arg0.field2245[0] != null) {
            class28.method142(arg0.field2259, -80, arg0.field2245[0], 0, (short) 1002, (long) arg2.field1987, 0, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V")
    public static final void method1418(String arg0, int arg1, byte arg2, String arg3) {
        class55.field805 = arg3;
        field3224++;
        class18.field243 = arg1;
        class226.field3515 = arg0;
        if (class226.field3515.equals("") || class55.field805.equals("")) {
            class195.field3080 = 3;
        } else if (class67.field991 == -1) {
            class195.field3080 = -3;
            class229.field3541 = 1;
            class201.field3168 = 0;
            class140.field2010 = 0;
            if (arg2 != -11) {
                method1417((class152) null, -47, (class138) null);
            }
            class170 var4 = new class170(128);
            var4.method1183(10, 984049208);
            var4.method1210((int) (Math.random() * 9.9999999E7D), (byte) -16);
            var4.method1160(-25643, class176.method1256((byte) 127, class226.field3515));
            var4.method1210((int) (Math.random() * 9.9999999E7D), (byte) -16);
            var4.method1168((byte) -37, class55.field805);
            var4.method1210((int) (Math.random() * 9.9999999E7D), (byte) -16);
            var4.method1204(-69, class228.field3529, class175.field2762);
            class150.field2218.field2676 = 0;
            class150.field2218.method1183(24, 984049208);
            class150.field2218.method1183(var4.field2676 + 2, 984049208);
            class150.field2218.method1180(arg2 - 17426, 548);
            class150.field2218.method1174(var4.field2676, 897, 0, var4.field2650);
        } else {
            class183.method1299(arg2 + 12);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3225++;
        int var7 = arg3 + arg6;
        int var8 = arg4 - arg3;
        int var9 = arg2 + arg3;
        if (arg0 != 13270) {
            return;
        }
        for (int var10 = arg6; var10 < var7; var10++) {
            class16.method97(arg0 - 13277, class78.field1180[var10], arg5, arg1, arg2);
        }
        for (int var11 = arg4; var11 > var8; var11--) {
            class16.method97(-7, class78.field1180[var11], arg5, arg1, arg2);
        }
        int var12 = arg5 - arg3;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class78.field1180[var13];
            class16.method97(-7, var14, var9, arg1, arg2);
            class16.method97(-7, var14, arg5, arg1, var12);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLvl;Lvl;)I")
    public static final int method1420(byte arg0, class73 arg1, class73 arg2) {
        field3223++;
        if (arg0 != -78) {
            field3230 = 51;
        }
        int var3 = 0;
        if (arg1.method509(27635, class260.field4241)) {
            var3++;
        }
        if (arg1.method509(arg0 + 27713, class296.field4732)) {
            var3++;
        }
        if (arg1.method509(arg0 + 27713, class225.field3504)) {
            var3++;
        }
        if (arg2.method509(27635, class260.field4241)) {
            var3++;
        }
        if (arg2.method509(27635, class296.field4732)) {
            var3++;
        }
        if (arg2.method509(27635, class225.field3504)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1421(int arg0) {
        if (arg0 == 3077) {
            field3234 = null;
            field3220 = null;
            field3233 = null;
            field3231 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)[Lci;")
    public static final class189[] method1422(int arg0) {
        field3226++;
        class189[] var1 = new class189[class139.field2000];
        if (arg0 < 27) {
            field3230 = -24;
        }
        for (int var2 = 0; var2 < class139.field2000; var2++) {
            var1[var2] = new class91(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], class190.field2959[var2], class229.field3539);
        }
        class115.method762((byte) -21);
        return var1;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)I")
    public static final int method1423(int arg0) {
        if (arg0 != 7244) {
            field3233 = null;
        }
        field3222++;
        return 6;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvl;I)V")
    public static final void method1424(class73 arg0, int arg1) {
        class56.field818 = arg0;
        field3219++;
        if (arg1 != -2) {
            field3233 = null;
        }
    }
}
