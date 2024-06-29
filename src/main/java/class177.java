import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class177 extends class38 {

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    private int field3194 = 0;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    private int field3191 = -32768;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field3200 = 0;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
    public boolean field3211 = false;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Lpj;")
    private class174 field3213;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
    public static int[] field3188 = new int[25];

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Lkh;")
    private static class117 field3208 = class224.method1450((byte) 122, "Unexpected server response)3");

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Lkh;")
    public static class117 field3212 = class224.method1450((byte) 118, " weitere Optionen");

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lkh;")
    public static class117 field3195 = field3208;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[Lvb;")
    public static class232[] field3199 = new class232[256];

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lge;")
    public static class71 field3192 = new class71(64);

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lkh;")
    private static class117 field3219 = class224.method1450((byte) 26, "scroll:");

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lkh;")
    public static class117 field3217 = field3219;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lkh;")
    public static class117 field3218 = field3219;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "[Lch;")
    public static class31[] field3216;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
    public final void method1229(int arg0, byte arg1) {
        if (arg1 >= -94) {
            return;
        }
        field3203++;
        if (this.field3211) {
            return;
        }
        this.field3194 += arg0;
        while (this.field3213.field3148[this.field3200] < this.field3194) {
            this.field3194 -= this.field3213.field3148[this.field3200];
            this.field3200++;
            if (this.field3200 >= this.field3213.field3144.length) {
                this.field3211 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ[B)Z")
    public static final boolean method1230(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field3190++;
        boolean var4 = arg2;
        int var5 = -1;
        class145 var6 = new class145(arg3);
        label68: while (true) {
            int var7 = var6.method999((byte) -104);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var5 += var7;
            boolean var9 = false;
            while (true) {
                int var11;
                class211 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method1003(-126);
                                        if (var17 == 0) {
                                            continue label68;
                                        }
                                        var6.method998(95);
                                    }
                                    int var10 = var6.method1003(-40);
                                    if (var10 == 0) {
                                        continue label68;
                                    }
                                    var8 += var10 - 1;
                                    var11 = var6.method998(114) >> 2;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = arg0 + var12;
                                    int var14 = var8 & 0x3F;
                                    var15 = var14 + arg1;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class48.method379(53, var5);
                } while (var11 == 22 && class167.field3021 && var16.field3821 == 0 && var16.field3811 != 1 && !var16.field3772);
                var9 = true;
                if (!var16.method1388(arg2)) {
                    var4 = false;
                    class4.field50++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
    public final int method134() {
        field3189++;
        return this.field3191;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Lcf;")
    private final class29 method1231(byte arg0) {
        field3201++;
        class20 var2 = class214.method1406(1, this.field3215);
        class29 var3;
        if (this.field3211) {
            var3 = var2.method177(-1, 90);
        } else {
            var3 = var2.method177(this.field3200, 90);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -35) {
                method1236(53);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class166.field2997 == 1) {
            class92.field1696[class174.field3131 / 100].method273(class145.field2641 - 8, class137.field2472 - 8);
        }
        if (class166.field2997 == 2) {
            class92.field1696[class174.field3131 / 100 + 4].method273(class145.field2641 - 8, class137.field2472 + -8);
        }
        field3210++;
        if (arg1 != 15) {
            return;
        }
        class50.method390(1);
        if (!class10.field356) {
            return;
        }
        int var5 = arg3 + 512 - 5;
        int var6 = arg4 + 20;
        class53.field1081.method929(class36.method316((byte) -34, new class117[] { class13.field417, class42.method358(class37.field855, (byte) 34) }), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class167.field3021) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class167.field3021) {
            var9 = 16711680;
        }
        class53.field1081.method929(class36.method316((byte) -34, new class117[] { class8.field124, class42.method358(var8, (byte) 34), class71.field1357 }), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3209++;
        class29 var11 = this.method1231((byte) -35);
        if (var11 != null) {
            var11.method158(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3191 = var11.method134();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lah;I)Lah;")
    public static final class9 method1233(class9 arg0, int arg1) {
        field3204++;
        class9 var2 = class180.method1245((byte) -58, arg0);
        if (var2 == null) {
            var2 = arg0.field266;
        }
        if (arg1 != 0) {
            method1234(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method1234(boolean arg0) {
        field3219 = null;
        field3188 = null;
        field3217 = null;
        field3218 = null;
        field3208 = null;
        field3192 = null;
        field3195 = null;
        field3216 = null;
        field3212 = null;
        if (arg0) {
            field3199 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)Lgg;")
    public static final class73 method1235(int arg0, int arg1, int arg2, byte arg3) {
        field3207++;
        class73 var4 = new class73();
        var4.field1398 = arg0;
        var4.field1397 = arg1;
        class11.field371.method461((long) arg2, (byte) -90, var4);
        class102.method688(arg1, (byte) 112);
        if (arg3 != 71) {
            method1233(null, -36);
        }
        class9 var5 = class119.method837((byte) 125, arg2);
        if (var5 != null) {
            class62.method457(var5, 0);
        }
        if (class191.field3407 != null) {
            class62.method457(class191.field3407, 0);
            class191.field3407 = null;
        }
        class100.field1825 = 0;
        class182.field3289 = false;
        class214.method1407(class32.field761, class111.field2092, 18320, class120.field2266, class98.field1809);
        if (var5 != null) {
            class201.method1338((byte) -87, false, var5);
        }
        class145.method1025(false, arg1);
        if (class92.field1697 != -1) {
            class158.method1122(class92.field1697, 0, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIII)V")
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3205 = arg1;
        this.field3215 = arg0;
        this.field3198 = arg4;
        this.field3193 = arg5 + arg6;
        this.field3214 = arg3;
        this.field3197 = arg2;
        int var8 = class214.method1406(1, this.field3215).field544;
        if (var8 == -1) {
            this.field3211 = true;
        } else {
            this.field3211 = false;
            this.field3213 = class81.method555(var8, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Z")
    public static final boolean method1236(int arg0) {
        field3202++;
        long var1 = class4.method31((byte) 47);
        if (arg0 != 8) {
            method1236(-84);
        }
        int var3 = (int) (var1 - class43.field946);
        if (var3 > 200) {
            var3 = 200;
        }
        class43.field946 = var1;
        class127.field2348 += var3;
        if (class216.field3933 == 0 && class186.field3334 == 0 && class34.field799 == 0 && class45.field968 == 0) {
            return true;
        } else if (class229.field4122 == null) {
            return false;
        } else {
            try {
                if (class127.field2348 > 30000) {
                    throw new IOException();
                }
                while (class186.field3334 < 20 && class45.field968 > 0) {
                    class166 var4 = (class166) class94.field1731.method456((byte) 123);
                    class145 var5 = new class145(4);
                    var5.method1002(false, 1);
                    var5.method1032(arg0 + 247, (int) var4.field389);
                    class229.field4122.method750(0, var5.field2613, -7115, 4);
                    class228.field4108.method461(var4.field389, (byte) -62, var4);
                    class186.field3334++;
                    class45.field968--;
                }
                while (class216.field3933 < 20 && class34.field799 > 0) {
                    class166 var6 = (class166) class36.field825.method713((byte) 79);
                    class145 var7 = new class145(4);
                    var7.method1002(false, 0);
                    var7.method1032(255, (int) var6.field389);
                    class229.field4122.method750(0, var7.field2613, -7115, 4);
                    var6.method1254(false);
                    class71.field1364.method461(var6.field389, (byte) -12, var6);
                    class216.field3933++;
                    class34.field799--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class229.field4122.method751(10364);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class127.field2348 = 0;
                    byte var10 = 0;
                    if (class233.field4197 == null) {
                        var10 = 8;
                    } else if (class95.field1746 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class103.field1880.field2643;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class229.field4122.method753(var11, class103.field1880.field2643, -1, class103.field1880.field2613);
                        if (class200.field3637 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class103.field1880.field2613[class103.field1880.field2643 + var12] = (byte) class228.method1474(class103.field1880.field2613[class103.field1880.field2643 + var12], class200.field3637);
                            }
                        }
                        class103.field1880.field2643 += var11;
                        if (class103.field1880.field2643 < var10) {
                            break;
                        }
                        if (class233.field4197 == null) {
                            class103.field1880.field2643 = 0;
                            int var13 = class103.field1880.method998(106);
                            int var14 = class103.field1880.method1049((byte) 110);
                            int var15 = class103.field1880.method998(61);
                            int var16 = class103.field1880.method1018(-1068451600);
                            long var17 = (long) ((var13 << 16) + var14);
                            class166 var19 = (class166) class228.field4108.method460(var17, 1);
                            class207.field3711 = true;
                            if (var19 == null) {
                                var19 = (class166) class71.field1364.method460(var17, 1);
                                class207.field3711 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            class233.field4197 = var19;
                            class40.field920 = new class145(class233.field4197.field2993 + var16 + var20);
                            class40.field920.method1002(false, var15);
                            class40.field920.method1024(-54, var16);
                            class95.field1746 = 8;
                            class103.field1880.field2643 = 0;
                        } else if (class95.field1746 == 0) {
                            if (class103.field1880.field2613[0] == -1) {
                                class95.field1746 = 1;
                                class103.field1880.field2643 = 0;
                            } else {
                                class233.field4197 = null;
                            }
                        }
                    } else {
                        int var21 = class40.field920.field2613.length - class233.field4197.field2993;
                        int var22 = 512 - class95.field1746;
                        if (var21 - class40.field920.field2643 < var22) {
                            var22 = var21 - class40.field920.field2643;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class229.field4122.method753(var22, class40.field920.field2643, -1, class40.field920.field2613);
                        if (class200.field3637 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class40.field920.field2613[class40.field920.field2643 + var23] = (byte) class228.method1474(class40.field920.field2613[class40.field920.field2643 + var23], class200.field3637);
                            }
                        }
                        class40.field920.field2643 += var22;
                        class95.field1746 += var22;
                        if (class40.field920.field2643 == var21) {
                            if (class233.field4197.field389 == 16711935L) {
                                class40.field910 = class40.field920;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class232 var26 = field3199[var25];
                                    if (var26 != null) {
                                        class40.field910.field2643 = var25 * 8 + 5;
                                        int var27 = class40.field910.method1018(-1068451600);
                                        int var28 = class40.field910.method1018(-1068451600);
                                        var26.method1501(var27, false, var28);
                                    }
                                }
                            } else {
                                class187.field3348.reset();
                                class187.field3348.update(class40.field920.field2613, 0, var21);
                                int var24 = (int) class187.field3348.getValue();
                                if (class233.field4197.field3004 != var24) {
                                    try {
                                        class229.field4122.method748((byte) -84);
                                    } catch (Exception var30) {
                                    }
                                    class1.field4++;
                                    class229.field4122 = null;
                                    class200.field3637 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class5.field85 = 0;
                                class1.field4 = 0;
                                class233.field4197.field3001.method1497(class207.field3711, (int) (class233.field4197.field389 & 0xFFFFL), (byte) 0, (class233.field4197.field389 & 0xFF0000L) == 16711680L, class40.field920.field2613);
                            }
                            class233.field4197.method123((byte) -126);
                            class233.field4197 = null;
                            if (class207.field3711) {
                                class186.field3334--;
                            } else {
                                class216.field3933--;
                            }
                            class95.field1746 = 0;
                            class40.field920 = null;
                        } else {
                            if (class95.field1746 != 512) {
                                break;
                            }
                            class95.field1746 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class229.field4122.method748((byte) -84);
                } catch (Exception var29) {
                }
                class229.field4122 = null;
                class5.field85++;
                return false;
            }
        }
    }
}
