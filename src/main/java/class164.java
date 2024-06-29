import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class164 extends class120 {

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Lob;")
    public static class131 field2551 = new class131(5000);

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field2555 = 1;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "B")
    public byte field2545;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Ljava/lang/String;")
    public String field2549;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Ljava/lang/String;")
    public String field2558;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        field2556++;
        if (class170.field2671 == -1 || class274.field4382 == -1) {
            return;
        }
        int var1 = class182.field2883 + ((class122.field1769 - class182.field2883) * class108.field1658 >> 16);
        class108.field1658 += var1;
        if (class108.field1658 >= 65535) {
            if (class200.field3126) {
                class100.field1558 = false;
            } else {
                class100.field1558 = true;
            }
            class108.field1658 = 65535;
            class200.field3126 = true;
        } else {
            class100.field1558 = false;
            class200.field3126 = false;
        }
        float[] var2 = new float[3];
        float var3 = (float) class108.field1658 / 65535.0F;
        int var4 = class23.field279 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class97.field1498[class170.field2671][var4][var5] * 3;
            int var22 = class97.field1498[class170.field2671][var4 + 1][var5] * 3;
            int var23 = (class97.field1498[class170.field2671][var4 + 2][var5] - (class97.field1498[class170.field2671][var4 + 3][var5] - class97.field1498[class170.field2671][var4 + 2][var5])) * 3;
            int var24 = var22 - var21;
            int var25 = var21 + var23 - (var22 * 2);
            int var26 = class97.field1498[class170.field2671][var4][var5];
            int var27 = var22 + class97.field1498[class170.field2671][var4 + 2][var5] - var26 - var23;
            var2[var5] = (((float) var27 * var3 + (float) var25) * var3 + (float) var24) * var3 + (float) var26;
        }
        class66.field918 = (int) var2[0] - (class126.field1869 * 128);
        class54.field750 = (int) var2[2] - (class246.field3943 * 128);
        int var6 = class280.field4435 * 2;
        class96.field1487 = (int) var2[1] * -1;
        float[] var7 = new float[3];
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class97.field1498[class274.field4382][var6][var8] * 3;
            int var15 = class97.field1498[class274.field4382][var6 + 1][var8] * 3;
            int var16 = (class97.field1498[class274.field4382][var6 + 2][var8] + class97.field1498[class274.field4382][var6 + 2][var8] - class97.field1498[class274.field4382][var6 + 3][var8]) * 3;
            int var17 = var15 - var14;
            int var18 = class97.field1498[class274.field4382][var6][var8];
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class97.field1498[class274.field4382][var6 + 2][var8] + var15 - var18 - var16;
            var7[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var17) * var3 + (float) var18;
        }
        float var9 = var7[0] - var2[0];
        float var10 = (var7[1] - var2[1]) * -1.0F;
        float var11 = var7[2] - var2[arg0];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class31.field418 = (float) Math.atan2((double) var10, var12);
        class279.field4432 = -((float) Math.atan2((double) var9, (double) var11));
        class77.field1092 = (int) ((double) class279.field4432 * 325.949D) & 0x7FF;
        class215.field3516 = (int) ((double) class31.field418 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[ILbd;[II)V")
    public static final void method1126(int[] arg0, int[] arg1, class186 arg2, int[] arg3, int arg4) {
        field2557++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field1236.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field1236[var9] = null;
                    } else {
                        class198 var10 = class104.method688(var6, 30091);
                        class205 var11 = arg2.field1236[var9];
                        int var12 = var10.field3086;
                        if (var11 != null) {
                            if (var11.field3205 == var6) {
                                if (var12 == 0) {
                                    var11 = arg2.field1236[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field3211 = var8;
                                    var11.field3206 = 0;
                                    var11.field3210 = 1;
                                    var11.field3209 = 0;
                                    var11.field3208 = 0;
                                    class279.method1870((byte) 65, class149.field2227 == arg2, var10, 0, arg2.field1226, arg2.field1273);
                                } else if (var12 == 2) {
                                    var11.field3208 = 0;
                                }
                            } else if (var10.field3082 >= class104.method688(var11.field3205, 30091).field3082) {
                                var11 = arg2.field1236[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class205 var13 = arg2.field1236[var9] = new class205();
                            var13.field3208 = 0;
                            var13.field3211 = var8;
                            var13.field3205 = var6;
                            var13.field3206 = 0;
                            var13.field3209 = 0;
                            var13.field3210 = 1;
                            class279.method1870((byte) 65, class149.field2227 == arg2, var10, 0, arg2.field1226, arg2.field1273);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4 <= 43) {
            method1130((byte) 5);
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field2551 = null;
        if (arg0 != 15719) {
            method1130((byte) -18);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lhl;")
    public static final class39 method1128(int arg0, int arg1) {
        class39 var2 = (class39) class23.field287.method1428((long) arg0, (byte) -110);
        field2552++;
        if (arg1 != 17237) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class96.field1492.method807((byte) 119, arg0, 1);
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method312(0, arg0, new class25(var3));
            }
            class23.field287.method1424((long) arg0, var4, arg1 ^ 0x889283B4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static final void method1129(int arg0) {
        field2548++;
        class286.field4530.method1420(-1);
        class270.field4298.method1420(-1);
        class209.field3255.method1420(arg0 ^ 0x5F34CA3E);
        if (arg0 != -1597295167) {
            method1130((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static final void method1130(byte arg0) {
        field2550++;
        if (arg0 < 30) {
            return;
        }
        for (int var1 = 0; var1 < field2553; var1++) {
            int var2 = class84.field1316[var1];
            class56 var3 = class100.field1566[var2];
            int var4 = class235.field3766.method201(255);
            if ((var4 & 0x40) != 0) {
                var4 += class235.field3766.method201(255) << 8;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class235.field3766.method197(128);
                int var6 = class235.field3766.method175(96);
                var3.method573(-107, var6, var5, class111.field1684);
                var3.field1220 = class111.field1684 + 300;
                var3.field1255 = class235.field3766.method201(255);
            }
            if ((var4 & 0x10) != 0) {
                var3.field1281 = class235.field3766.method190(-3);
                if (var3.field1281 == 65535) {
                    var3.field1281 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class235.field3766.method201(255);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class235.field3766.method200((byte) -83);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var9[var11] = var12;
                    var8[var11] = class235.field3766.method175(105);
                    var10[var11] = class235.field3766.method198(3);
                }
                class116.method777(0, var8, var10, var3, var9);
            }
            if ((var4 & 0x1) != 0) {
                var3.field1278 = class235.field3766.method189(false);
                var3.field1194 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field1192 = class235.field3766.method171(-1);
                var3.field1225 = class235.field3766.method190(-3);
            }
            if ((var4 & 0x80) != 0) {
                int var13 = class235.field3766.method190(-3);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class235.field3766.method225(-16777216);
                boolean var15 = true;
                if (var13 != -1 && var3.field1280 != -1 && class104.method688(class77.method521(var13, (byte) -42).field985, 30091).field3082 < class104.method688(class77.method521(var3.field1280, (byte) -42).field985, 30091).field3082) {
                    var15 = false;
                }
                if (var15) {
                    var3.field1190 = var14 >> 16;
                    var3.field1266 = (var14 & 0xFFFF) + class111.field1684;
                    var3.field1191 = 1;
                    var3.field1195 = 0;
                    var3.field1292 = 0;
                    var3.field1280 = var13;
                    if (var3.field1266 > class111.field1684) {
                        var3.field1292 = -1;
                    }
                    if (var3.field1280 != -1 && class111.field1684 == var3.field1266) {
                        int var16 = class77.method521(var3.field1280, (byte) -42).field985;
                        if (var16 != -1) {
                            class198 var17 = class104.method688(var16, 30091);
                            if (var17 != null && var17.field3107 != null) {
                                class279.method1870((byte) 65, false, var17, 0, var3.field1226, var3.field1273);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field793.method924(true)) {
                    class5.method29(var3, 25);
                }
                var3.method411(class252.method1691(class235.field3766.method171(-1), (byte) 104), true);
                var3.method576(var3.field793.field2012, -123);
                var3.field1203 = var3.field793.field2011;
                if (var3.field793.method924(true)) {
                    class16.method113((class186) null, class276.field4398, var3.field1272[0], var3, 0, (class181) null, var3.field1257[0], (byte) -49);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var18 = class235.field3766.method190(-3);
                int var19 = class235.field3766.method197(128);
                if (var18 == 65535) {
                    var18 = -1;
                }
                class60.method428(var18, var3, false, var19);
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class235.field3766.method197(128);
                int var21 = class235.field3766.method197(128);
                var3.method573(57, var21, var20, class111.field1684);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        if (arg0 >= -97) {
            method1127(-94);
        }
        field2544++;
        class104.field1608 = new class214[class143.field2099.method812(-45)][];
        class3.field33 = new boolean[class143.field2099.method812(-4)];
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public static final void method1132(byte arg0) {
        if (arg0 != -6) {
            method1127(89);
        }
        field2554++;
        while (true) {
            class48 var1;
            class82 var3;
            do {
                var1 = (class48) class111.field1679.method344((byte) -5);
                if (var1 == null) {
                    return;
                }
                if (var1.field618 < 0) {
                    int var2 = -var1.field618 - 1;
                    if (class45.field574 == var2) {
                        var3 = class149.field2227;
                    } else {
                        var3 = class153.field2277[var2];
                    }
                } else {
                    int var4 = var1.field618 - 1;
                    var3 = class100.field1566[var4];
                }
            } while (var3 == null);
            class181 var5 = class25.method224(var1.field622, arg0 ^ 0xFFFFFFFA);
            int var6;
            int var7;
            if (var1.field613 == 1 || var1.field613 == 3) {
                var6 = var5.field2813;
                var7 = var5.field2829;
            } else {
                var6 = var5.field2829;
                var7 = var5.field2813;
            }
            int var8 = var1.field616 + (var6 + 1 >> 1);
            int var9 = (var6 >> 1) + var1.field616;
            int var10 = var1.field619 + (var7 + 1 >> 1);
            int var11 = (var7 >> 1) + var1.field619;
            int[][] var12 = class200.field3128[class276.field4398];
            int var13 = var12[var8][var11] + var12[var9][var11] - (-var12[var8][var10] + -var12[var9][var10]) >> 2;
            class219 var14 = null;
            int var15 = class47.field604[var1.field610];
            if (var15 == 0) {
                class69 var16 = class104.method684(class276.field4398, var1.field616, var1.field619);
                if (var16 != null) {
                    var14 = var16.field963;
                }
            } else if (var15 == 1) {
                class264 var19 = class261.method1794(class276.field4398, var1.field616, var1.field619);
                if (var19 != null) {
                    var14 = var19.field4266;
                }
            } else if (var15 == 2) {
                class284 var17 = class222.method1514(class276.field4398, var1.field616, var1.field619);
                if (var17 != null) {
                    var14 = var17.field4500;
                }
            } else if (var15 == 3) {
                class17 var18 = class94.method627(class276.field4398, var1.field616, var1.field619);
                if (var18 != null) {
                    var14 = var18.field203;
                }
            }
            if (var14 != null) {
                class96.method645(var1.field609 + 1, 0, -1, 0, class276.field4398, var1.field619, var15, arg0 + 6, var1.field616, var1.field624 + 1);
                var3.field1282 = var1.field619 * 128 + var7 * 64;
                var3.field1269 = var14;
                var3.field1259 = class111.field1684 + var1.field624;
                var3.field1238 = var1.field616 * 128 + (var6 * 64);
                var3.field1251 = class111.field1684 + var1.field609;
                int var20 = var1.field623;
                int var21 = var1.field620;
                int var22 = var1.field615;
                int var23 = var1.field617;
                if (var20 > var23) {
                    int var24 = var20;
                    var20 = var23;
                    var23 = var24;
                }
                var3.field1209 = var13;
                if (var22 > var21) {
                    int var25 = var22;
                    var22 = var21;
                    var21 = var25;
                }
                var3.field1295 = var1.field619 + var21;
                var3.field1294 = var1.field616 + var20;
                var3.field1293 = var1.field619 + var22;
                var3.field1193 = var1.field616 + var23;
            }
        }
    }
}
