import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class149 implements Runnable {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
    public boolean field2667 = true;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field2662 = new Object();

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
    public int[] field2674 = new int[500];

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public int[] field2675 = new int[500];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field2676 = 0;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Loc;")
    public static class151 field2666 = class137.method873(2, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Loc;")
    public static class151 field2665 = class137.method873(2, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
    public static boolean field2669 = false;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
    public static boolean field2668;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method944(byte arg0) {
        field2665 = null;
        if (arg0 > 122) {
            field2666 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2667) {
            Object var1 = this.field2662;
            synchronized (this.field2662) {
                if (this.field2676 < 500) {
                    this.field2675[this.field2676] = class57.field1149;
                    this.field2674[this.field2676] = class41.field857;
                    this.field2676++;
                }
            }
            class156.method1027(0, 50L);
        }
        field2671++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqe;IIIIII)V")
    public static final void method945(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class61.field1196;
        int var8 = class61.field1204;
        int var9 = arg0.field3141.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var23 = arg0.field3141[var10] - class1.field42;
            int var24 = arg0.field3129[var10] - class116.field2084;
            int var25 = arg0.field3140[var10] - class73.field1426;
            int var26 = arg3 * var25 + arg4 * var23 >> 16;
            int var27 = arg4 * var25 - arg3 * var23 >> 16;
            int var29 = arg2 * var24 - arg1 * var27 >> 16;
            int var30 = arg1 * var24 + arg2 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg0.field3135 != null) {
                class173.field3139[var10] = var26;
                class173.field3133[var10] = var29;
                class173.field3143[var10] = var30;
            }
            class173.field3127[var10] = (var26 << 9) / var30 + var7;
            class173.field3124[var10] = (var29 << 9) / var30 + var8;
        }
        class61.field1201 = 0;
        int var11 = arg0.field3130.length;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = arg0.field3130[var12];
            int var14 = arg0.field3134[var12];
            int var15 = arg0.field3138[var12];
            int var16 = class173.field3127[var13];
            int var17 = class173.field3127[var14];
            int var18 = class173.field3127[var15];
            int var19 = class173.field3124[var13];
            int var20 = class173.field3124[var14];
            int var21 = class173.field3124[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                if (class138.field2510 && class231.method1510(class2.field70, class15.field358, var19, var20, var21, var16, var17, var18)) {
                    class124.field2234 = arg5;
                    class11.field209 = arg6;
                }
                class61.field1206 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > class61.field1203 || var17 > class61.field1203 || var18 > class61.field1203) {
                    class61.field1206 = true;
                }
                if (arg0.field3135 == null || arg0.field3135[var12] == -1) {
                    if (arg0.field3137[var12] != 12345678) {
                        class61.method405(var19, var20, var21, var16, var17, var18, arg0.field3137[var12], arg0.field3144[var12], arg0.field3123[var12]);
                    }
                } else if (class16.field365) {
                    int var22 = class61.field1198.method462(true, arg0.field3135[var12]);
                    class61.method405(var19, var20, var21, var16, var17, var18, class122.method740(var22, arg0.field3137[var12]), class122.method740(var22, arg0.field3144[var12]), class122.method740(var22, arg0.field3123[var12]));
                } else if (arg0.field3126) {
                    class61.method412(var19, var20, var21, var16, var17, var18, arg0.field3137[var12], arg0.field3144[var12], arg0.field3123[var12], class173.field3139[0], class173.field3139[1], class173.field3139[3], class173.field3133[0], class173.field3133[1], class173.field3133[3], class173.field3143[0], class173.field3143[1], class173.field3143[3], arg0.field3135[var12]);
                } else {
                    class61.method412(var19, var20, var21, var16, var17, var18, arg0.field3137[var12], arg0.field3144[var12], arg0.field3123[var12], class173.field3139[var13], class173.field3139[var14], class173.field3139[var15], class173.field3133[var13], class173.field3133[var14], class173.field3133[var15], class173.field3143[var13], class173.field3143[var14], class173.field3143[var15], arg0.field3135[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILbh;I)V")
    public static final void method946(byte arg0, int arg1, class20 arg2, int arg3) {
        field2670++;
        if (arg0 != -96) {
            method945(null, 93, -15, -116, 79, -1, -124);
        }
        if (arg2.field3991 == arg3 && arg3 != -1) {
            class115 var4 = class197.method1233(110, arg3);
            int var5 = var4.field2047;
            if (var5 == 1) {
                arg2.field4022 = 0;
                arg2.field4042 = 0;
                arg2.field4020 = 0;
                arg2.field4004 = arg1;
                class19.method169(var4, arg2.field4029, arg2.field3976, class228.field3975 == arg2, arg2.field4020, arg0 ^ 0x6171);
            }
            if (var5 == 2) {
                arg2.field4042 = 0;
                return;
            }
        } else if (arg3 == -1 || arg2.field3991 == -1 || class197.method1233(-113, arg3).field2061 >= class197.method1233(71, arg2.field3991).field2061) {
            arg2.field3991 = arg3;
            arg2.field4042 = 0;
            arg2.field4022 = 0;
            arg2.field4001 = arg2.field3999;
            arg2.field4004 = arg1;
            arg2.field4020 = 0;
            if (arg2.field3991 == -1) {
                return;
            }
            class19.method169(class197.method1233(-119, arg2.field3991), arg2.field4029, arg2.field3976, class228.field3975 == arg2, arg2.field4020, arg0 - 24783);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)Loc;")
    public static final class151 method947(int arg0, boolean arg1) {
        if (arg1) {
            field2672++;
            return class225.field3916[arg0].method988(-1) <= 0 ? class182.field3305[arg0] : class126.method761(new class151[] { class182.field3305[arg0], class68.field1345, class225.field3916[arg0] }, 10260);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
    public static final int method948(byte arg0, int arg1, int arg2) {
        int var3 = class72.method477(arg1 + 45365, 4, arg2 + 91923, 127) + (class72.method477(arg1 + 10294, 2, arg2 + 37821, 113) - 128 >> 1) + (class72.method477(arg1, 1, arg2, 117) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg0 > -65) {
            method948((byte) -113, 57, -123);
        }
        field2663++;
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2664++;
        if (class124.field2239 < 100) {
            class227.method1426(-10267);
        }
        class221.method1386(arg0, arg2, arg0 + arg4, arg2 + arg3);
        class61.method404();
        class221.method1375(arg0, arg2, arg4, arg3, 0);
        if (class124.field2239 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg0;
            int var7 = arg3 / 2 + arg2 - var5 - 18;
            class221.method1374(var6 - 152, var7, 304, 34, 9179409);
            class221.method1374(var6 - 151, var7 + 1, 302, 32, 0);
            class221.method1375(var6 - 150, var7 - -2, class124.field2239 * 3, 30, 9179409);
            class221.method1375(var6 + class124.field2239 * 3 - 150, var7 - -2, 300 - class124.field2239 * 3, 30, 0);
            class19.field403.method1254(class235.field4333, var6, var5 + var7, 16777215, -1);
            return;
        }
        if (arg1 != 28466) {
            field2669 = true;
        }
        class53.field1078 = (int) ((double) (arg3 * 2) / class188.field3339);
        class58.field1155 = class110.field1943 - (int) ((double) arg4 / class188.field3339);
        class109.field1926 = (int) ((double) (arg4 * 2) / class188.field3339);
        int var8 = class110.field1943 - (int) ((double) arg4 / class188.field3339);
        int var9 = class25.field541 - (int) ((double) arg3 / class188.field3339);
        class233.field4283 = class25.field541 - (int) ((double) arg3 / class188.field3339);
        int var10 = class110.field1943 + (int) ((double) arg4 / class188.field3339);
        int var11 = class25.field541 + (int) ((double) arg3 / class188.field3339);
        class180.method1138(var10, var8, var11, var9, arg0 + arg4, arg2, false, arg0, arg2 + arg3);
        class93.method596(var8, arg2 + arg3, 2, arg2, var10, var9, var11, arg0, arg0 + arg4);
        if (class169.field3083 > 0) {
            class169.field3083--;
        }
        if (!class196.field3482) {
            return;
        }
        int var12 = arg0 + arg4 - 5;
        int var13 = arg2 + arg3 - 8;
        class227.field3955.method1261(class126.method761(new class151[] { class146.field2620, class137.method874(class93.field1737, false) }, 10260), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 32768 && class13.field300) {
            var15 = 16711680;
        }
        if (var16 > 65536 && !class13.field300) {
            var15 = 16711680;
        }
        class227.field3955.method1261(class126.method761(new class151[] { class156.field2834, class137.method874(var16, false), class19.field406 }, 10260), var12, var17, var15, -1);
        var13 = var17 - 15;
    }
}
