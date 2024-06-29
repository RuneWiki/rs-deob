import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "[Lkh;")
    public volatile class44[] field2420 = new class44[2];

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Z")
    public volatile boolean field2410 = false;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Z")
    public volatile boolean field2416 = false;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    private static int field2414 = 7759444;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Ljd;")
    public static class86 field2415 = class122.method868("Hierhin gehen", true);

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "J")
    public static long field2408 = 0L;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Ljd;")
    public static class86 field2417 = class122.method868("Clientscript error in: ", true);

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljd;")
    public static class86 field2418 = class122.method868("", true);

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Ljd;")
    public static class86 field2419 = class122.method868("mapscene", true);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lgj;")
    public static class224 field2412;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lof;")
    public class254 field2403;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
    public static boolean field2413;

    @OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
    public final void run() {
        field2405++;
        this.field2416 = true;
        try {
            while (!this.field2410) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class44 var2 = this.field2420[var1];
                    if (var2 != null) {
                        var2.method358(-15924);
                    }
                }
                class91.method677(0, 10L);
                class97.method705((Object) null, this.field2403, -4367);
            }
        } catch (Exception var9) {
            class143.method1018(var9, (String) null, 107);
        } finally {
            Object var6 = null;
            this.field2416 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)I")
    public static final int method880(int arg0, byte arg1) {
        field2406++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else {
            if (arg1 != 94) {
                field2419 = null;
            }
            return arg0 == 140 ? 156 : arg0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class106.field2030.field1177; var9++) {
            int var10 = class106.field2030.field1179[var9] - class90.field1847;
            int var11 = arg8 + ((arg6 - arg8) * (var10 - arg7) / (arg2 - arg7));
            int var12 = class38.field894 + class238.field4289 - class106.field2030.field1182[var9] - 1;
            int var13 = class106.field2030.method422(arg1 ^ 0x5FB8, var9);
            int var14 = 16777215;
            int var15 = (arg0 - arg3) * (var12 - arg5) / (arg4 - arg5) + arg3;
            class212 var16 = null;
            if (var13 == 0) {
                if ((double) class202.field3658 == 3.0D) {
                    var16 = class219.field3946;
                }
                if ((double) class202.field3658 == 4.0D) {
                    var16 = class56.field1142;
                }
                if ((double) class202.field3658 == 6.0D) {
                    var16 = class105.field2018;
                }
                if ((double) class202.field3658 == 8.0D) {
                    var16 = class162.field3035;
                }
            }
            if (var13 == 1) {
                if ((double) class202.field3658 == 3.0D) {
                    var16 = class105.field2018;
                }
                if ((double) class202.field3658 == 4.0D) {
                    var16 = class162.field3035;
                }
                if ((double) class202.field3658 == 6.0D) {
                    var16 = class271.field4755;
                }
                if ((double) class202.field3658 == 8.0D) {
                    var16 = class246.field4376;
                }
            }
            if (var13 == 2) {
                if ((double) class202.field3658 == 3.0D) {
                    var16 = class271.field4755;
                }
                if ((double) class202.field3658 == 4.0D) {
                    var16 = class246.field4376;
                }
                if ((double) class202.field3658 == 6.0D) {
                    var16 = class66.field1302;
                }
                var14 = 16755200;
                if ((double) class202.field3658 == 8.0D) {
                    var16 = class221.field3982;
                }
            }
            if (class106.field2030.field1181[var9] != -1) {
                var14 = class106.field2030.field1181[var9];
            }
            if (var16 != null) {
                class86[] var17 = new class86[class106.field2030.field1170[var9].method607(true, 60) + 1];
                class45.field1014.method1755(class106.field2030.field1170[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var15 - (var18 - 1) * var16.method1505() / 2;
                int var20 = var19 + var16.method1500() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class86 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method610(0, var17[var21].method612((byte) 110) - 4, (byte) -81);
                    var16.method1504(var22, var11, var20, var14, true);
                    var20 += var16.method1505();
                }
            }
        }
        field2402++;
        if (arg1 != 24535) {
            method882(-43);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final void method882(int arg0) {
        class60.field1194++;
        class36.field809.method1356(arg0, true);
        field2404++;
        class36.field809.method1428((byte) -96, class84.field1643);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIBII)V")
    public static final void method883(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2411++;
        class206.field3749[0].method447(arg1, arg5);
        class206.field3749[1].method447(arg1, arg5 + arg0 - 16);
        int var6 = (arg0 - 32) * arg0 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg4 / (arg2 - arg0);
        class131.method927(arg1, arg5 + 16, 16, arg0 - 32, class220.field3962);
        class131.method927(arg1, arg5 + var7 + 16, 16, var6, class41.field931);
        class131.method920(arg1, var7 + arg5 + 16, var6, field2414);
        class131.method920(arg1 + 1, var7 + 16 + arg5, var6, field2414);
        class131.method929(arg1, var7 + arg5 + 16, 16, field2414);
        class131.method929(arg1, var7 + arg5 + 17, 16, field2414);
        class131.method920(arg1 + 15, arg5 + 16 + var7, var6, class115.field2196);
        class131.method920(arg1 + 14, arg5 - -17 + var7, var6 - 1, class115.field2196);
        class131.method929(arg1, arg5 + 15 - (-var7 - var6), 16, class115.field2196);
        if (arg3 != 52) {
            method881(82, -24, 68, 61, -93, 44, -55, 84, 119);
        }
        class131.method929(arg1 + 1, arg5 + 14 + var7 + var6, 15, class115.field2196);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field2412 = null;
        field2417 = null;
        if (arg0 <= 111) {
            field2408 = 29L;
        }
        field2419 = null;
        field2418 = null;
        field2415 = null;
    }
}
