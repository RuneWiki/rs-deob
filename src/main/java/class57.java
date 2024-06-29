import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
    public boolean field1384 = true;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1383 = new Object();

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field1399 = 0;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    public int[] field1398 = new int[500];

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    public int[] field1396 = new int[500];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
    public static int[] field1392 = new int[5];

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lic;")
    public static class59 field1391 = class59.method433(0, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lic;")
    public static class59 field1394 = class59.method433(0, "welle2:");

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
    public static int[] field1393 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lic;")
    public static class59 field1395 = class59.method433(0, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lic;")
    public static class59 field1390 = class59.method433(0, "");

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1388 = Calendar.getInstance();

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ia", name = "run", descriptor = "()V")
    public final void run() {
        field1387++;
        while (this.field1384) {
            Object var1 = this.field1383;
            synchronized (this.field1383) {
                if (this.field1399 < 500) {
                    this.field1396[this.field1399] = class16.field325;
                    this.field1398[this.field1399] = class145.field3166;
                    this.field1399++;
                }
            }
            class126.method962(false, 50L);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIB)V")
    public static final void method416(int arg0, int arg1, int arg2, byte arg3) {
        class35.method268((byte) 77);
        class129.method980(arg2, arg1, arg2 + class24.field587.field440, arg1 - -class24.field587.field442);
        if (class19.field403 == 2 || class19.field403 == 5) {
            class129.method981(arg2 + 25, arg1 + 5, 0, class142.field3123, class35.field922);
        } else {
            int var4 = class79.field1941 + class130.field2927 & 0x7FF;
            int var5 = 464 - class159.field3650.field1751 / 32;
            int var6 = class159.field3650.field1730 / 32 + 48;
            class43.field1090.method1029(arg2 + 25, arg1 - -5, 146, 151, var6, var5, var4, class49.field1226 + 256, class142.field3123, class35.field922);
            for (int var7 = 0; var7 < class128.field2905; var7++) {
                int var37 = class68.field1742[var7] * 4 + 2 - class159.field3650.field1730 / 32;
                int var38 = class77.field1886[var7] * 4 + 2 - class159.field3650.field1751 / 32;
                class76.method629(var38, var37, false, arg2, arg1, class30.field773[var7]);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class83 var34 = class23.field563[class44.field1127][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class159.field3650.field1730 / 32;
                        int var36 = var33 * 4 + 2 - class159.field3650.field1751 / 32;
                        class76.method629(var36, var35, false, arg2, arg1, class147.field3188[0]);
                    }
                }
            }
            for (int var9 = 0; var9 < class103.field2510; var9++) {
                class90 var29 = class47.field1210[class53.field1309[var9]];
                if (var29 != null && var29.method380(2)) {
                    class125 var30 = var29.field2276;
                    if (var30 != null && var30.field2815 != null) {
                        var30 = var30.method954(200);
                    }
                    if (var30 != null && var30.field2797 && var30.field2836) {
                        int var31 = var29.field1730 / 32 - class159.field3650.field1730 / 32;
                        int var32 = var29.field1751 / 32 - class159.field3650.field1751 / 32;
                        class76.method629(var32, var31, false, arg2, arg1, class147.field3188[1]);
                    }
                }
            }
            for (int var10 = 0; var10 < class43.field1092; var10++) {
                class49 var21 = class91.field2323[class31.field842[var10]];
                if (var21 != null && var21.method380(2)) {
                    int var22 = var21.field1751 / 32 - class159.field3650.field1751 / 32;
                    int var23 = var21.field1730 / 32 - class159.field3650.field1730 / 32;
                    long var24 = var21.field1225.method447(12074);
                    boolean var26 = false;
                    for (int var27 = 0; var27 < class65.field1649; var27++) {
                        if (class84.field2114[var27] == var24 && class90.field2284[var27] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class159.field3650.field1222 != 0 && var21.field1222 != 0 && class159.field3650.field1222 == var21.field1222) {
                        var28 = true;
                    }
                    if (var26) {
                        class76.method629(var22, var23, false, arg2, arg1, class147.field3188[3]);
                    } else if (var28) {
                        class76.method629(var22, var23, false, arg2, arg1, class147.field3188[4]);
                    } else {
                        class76.method629(var22, var23, false, arg2, arg1, class147.field3188[2]);
                    }
                }
            }
            if (class1.field28 != 0 && class23.field561 % 20 < 10) {
                if (class1.field28 == 1 && class95.field2413 >= 0 && class95.field2413 < class47.field1210.length) {
                    class90 var11 = class47.field1210[class95.field2413];
                    if (var11 != null) {
                        int var12 = var11.field1730 / 32 - class159.field3650.field1730 / 32;
                        int var13 = var11.field1751 / 32 - class159.field3650.field1751 / 32;
                        class56.method412(arg1, arg2, var13, (byte) -127, var12, class137.field3048[1]);
                    }
                }
                if (class1.field28 == 2) {
                    int var14 = (class73.field1831 - class89.field2229) * 4 + 2 - class159.field3650.field1730 / 32;
                    int var15 = (class158.field3487 - class68.field1756) * 4 + 2 - class159.field3650.field1751 / 32;
                    class56.method412(arg1, arg2, var15, (byte) -127, var14, class137.field3048[1]);
                }
                if (class1.field28 == 10 && class159.field3665 >= 0 && class91.field2323.length > class159.field3665) {
                    class49 var16 = class91.field2323[class159.field3665];
                    if (var16 != null) {
                        int var17 = var16.field1730 / 32 - class159.field3650.field1730 / 32;
                        int var18 = var16.field1751 / 32 - class159.field3650.field1751 / 32;
                        class56.method412(arg1, arg2, var18, (byte) -127, var17, class137.field3048[1]);
                    }
                }
            }
            if (class88.field2213 != 0) {
                int var19 = class88.field2213 * 4 + 2 - class159.field3650.field1730 / 32;
                int var20 = class53.field1315 * 4 + 2 - class159.field3650.field1751 / 32;
                class76.method629(var20, var19, false, arg2, arg1, class137.field3048[0]);
            }
            class129.method988(arg2 + 4 + 93, arg1 + 78, 3, 3, 16777215);
        }
        if (class19.field403 >= 3) {
            class129.method981(arg2, arg1, 0, class27.field698, class9.field200);
        } else {
            class137.field3061.method1029(arg2, arg1, 33, 33, 25, 25, class79.field1941, 256, class27.field698, class9.field200);
        }
        field1389++;
        if (class49.field1215[arg0]) {
            class24.field587.method111(arg2, arg1);
        }
        int var39 = -59 % ((arg3 - 30) / 51);
        class26.field697[arg0] = true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        field1392 = null;
        field1395 = null;
        if (!arg0) {
            field1395 = null;
        }
        field1391 = null;
        field1390 = null;
        field1388 = null;
        field1393 = null;
        field1394 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        class77.field1889++;
        class125.field2842.method1072(180, -1);
        field1386++;
        for (class41 var1 = (class41) class33.field889.method37(-1); var1 != null; var1 = (class41) class33.field889.method36(-1)) {
            if (var1.field1043 == 0 || var1.field1043 == 3) {
                class47.method369(true, var1, 0);
            }
        }
        if (arg0 >= -34) {
            field1390 = null;
        }
        if (class151.field3287 != null) {
            class42.method320(false, class151.field3287);
            class151.field3287 = null;
        }
    }
}
