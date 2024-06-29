import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class107 extends class317 {

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    private int field1443 = 4096;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    private int field1438 = 4096;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    private int field1449 = 409;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "[I")
    private int[] field1445 = new int[3];

    @OriginalMember(owner = "client!vn", name = "Y", descriptor = "I")
    private int field1453 = 4096;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "[[I")
    public static int[][] field1447 = new int[5][5000];

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!vn", name = "W", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!vn", name = "X", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(III)V", line = 12)
    public static final void method784(int arg0, int arg1, int arg2) {
        if (arg2 != 256) {
            field1447 = (int[][]) ((int[][]) null);
        }
        if (class122.field1647 > 0) {
            class72.method535(124, class122.field1647);
            class122.field1647 = 0;
        }
        short var3 = 256;
        field1452++;
        int var4 = 0;
        int var5 = class38.field433 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class88.field1247[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class338.field5085[var6++];
                int var11 = class38.field429[arg1 + (var5++)];
                if (var10 == 0) {
                    class292.field4356.field2403[var4++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 238 - var10;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var14 = class100.field1365[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class292.field4356.field2403[var4++] = class47.method303(var12 * class47.method303(var14, 16711935) + (var13 * class47.method303(var11, 16711935)), -16711936) + class47.method303(var12 * class47.method303(65280, var14) + (class47.method303(65280, var11) * var13), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class292.field4356.field2403[var4++] = class38.field429[arg1 + var5++];
            }
            var5 += class38.field433 - 128;
        }
        if (class67.field908) {
            class102.method744(class292.field4356.field2403, arg1, arg0, class292.field4356.field2323, class292.field4356.field2317);
        } else {
            class292.field4356.method844(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BIIIII)V", line = 98)
    public static final void method785(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1444++;
        class190.method1329(class126.field1723[arg5], arg3 + arg4, arg2, (byte) -107, arg3 - arg4);
        int var6 = 0;
        int var7 = arg4 * arg4;
        int var8 = arg1 * arg1;
        int var9 = arg1;
        int var10 = var7 << 1;
        int var11 = arg1 << 1;
        int var12 = 76 % ((-arg0 - 10) / 54);
        int var13 = var8 - ((var11 - 1) * var10);
        int var14 = var8 << 1;
        int var15 = (1 - var11) * var7 + var14;
        int var16 = var7 << 2;
        int var17 = var8 << 2;
        int var18 = ((arg1 << 1) - 3) * var10;
        int var19 = ((var6 << 1) + 3) * var14;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg1 - 1) * var16;
        while (var9 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var20;
                    var20 += var17;
                    var6++;
                    var15 += var19;
                    var19 += var17;
                }
            }
            var9--;
            if (var13 < 0) {
                var15 += var19;
                var19 += var17;
                var6++;
                var13 += var20;
                var20 += var17;
            }
            var15 += -var21;
            var13 += -var18;
            var21 -= var16;
            int var22 = arg5 - var9;
            int var23 = arg5 + var9;
            var18 -= var16;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class190.method1329(class126.field1723[var22], var24, arg2, (byte) -125, var25);
            class190.method1329(class126.field1723[var23], var24, arg2, (byte) -128, var25);
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V", line = 183)
    public static final void method786(byte arg0) {
        class42.field473.method724(0);
        field1439++;
        if (arg0 < 114) {
            field1447 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lcg;II)V", line = 196)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1451++;
        int var4 = -67 % ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field1449 = arg0.method2220((byte) 37);
        } else if (arg2 == 1) {
            this.field1443 = arg0.method2220((byte) 102);
        } else if (arg2 == 2) {
            this.field1438 = arg0.method2220((byte) 124);
        } else if (arg2 == 3) {
            this.field1453 = arg0.method2220((byte) 44);
        } else if (arg2 == 4) {
            int var6 = arg0.method2210((byte) -5);
            this.field1445[2] = class47.method303(var6, 255) >> 12;
            this.field1445[1] = class47.method303(4080, var6 >> 4);
            this.field1445[0] = class47.method303(267386880, var6 << 4);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 679)
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(B)V", line = 264)
    public static void method787(byte arg0) {
        int var1 = -45 % ((-arg0 - 33) / 36);
        field1447 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V", line = 273)
    public static final void method788(int arg0) {
        field1446++;
        if (class198.field2822 == 0 || class198.field2822 == 5) {
            return;
        }
        try {
            if (++class28.field347 > 2000) {
                if (class39.field442 != null) {
                    class39.field442.method1577((byte) -24);
                    class39.field442 = null;
                }
                if (class117.field1593 >= 1) {
                    class68.field939 = -5;
                    class198.field2822 = 0;
                    return;
                }
                if (class54.field726 == class129.field1780) {
                    class129.field1780 = class103.field1411;
                } else {
                    class129.field1780 = class54.field726;
                }
                class28.field347 = 0;
                class117.field1593++;
                class198.field2822 = 1;
            }
            if (class198.field2822 == 1) {
                class125.field1697 = class165.field2258.method618(class129.field1780, class252.field3611, 116);
                class198.field2822 = 2;
            }
            if (class198.field2822 == 2) {
                if (class125.field1697.field4241 == 2) {
                    throw new IOException();
                }
                if (class125.field1697.field4241 != 1) {
                    return;
                }
                class39.field442 = new class223((Socket) class125.field1697.field4244, class165.field2258);
                class125.field1697 = null;
                long var1 = class66.field866 = class77.method584(class141.field1921, 89);
                class90.field1264.field4777 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class90.field1264.method2184((byte) 89, 14);
                class90.field1264.method2184((byte) 89, var3);
                class39.field442.method1575(2, 0, 5000, class90.field1264.field4798);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -88);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -99);
                }
                int var4 = class39.field442.method1570((byte) 100);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -64);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -67);
                }
                if (var4 != 0) {
                    class198.field2822 = 0;
                    class68.field939 = var4;
                    class39.field442.method1577((byte) -128);
                    class39.field442 = null;
                    return;
                }
                class198.field2822 = 3;
            }
            if (class198.field2822 == 3) {
                if (class39.field442.method1572(arg0 ^ 0xFFFFFFFB) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class39.field442.method1573(class157.field2165.field4798, 8, -19451, 0);
                class157.field2165.field4777 = 0;
                class66.field871 = class157.field2165.method2175(false);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class90.field1264.field4777 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class66.field871;
                var5[2] = (int) (class66.field871 >> 32);
                class90.field1264.method2184((byte) 89, 10);
                class90.field1264.method2188(255, var5[0]);
                class90.field1264.method2188(255, var5[1]);
                class90.field1264.method2188(arg0 ^ 0xFFFFFF04, var5[2]);
                class90.field1264.method2188(255, var5[3]);
                class90.field1264.method2202(class77.method584(class141.field1921, 120), -121);
                class90.field1264.method2157((byte) -47, class131.field1797);
                class90.field1264.method2216(class338.field5079, true, class39.field436);
                class312.field4705.field4777 = 0;
                if (class148.field2051 == 40) {
                    class312.field4705.method2184((byte) 89, 18);
                } else {
                    class312.field4705.method2184((byte) 89, 16);
                }
                class312.field4705.method2189(-1, class90.field1264.field4777 + class312.method2139(-90, class165.field2262) + 163);
                class312.field4705.method2188(255, 541);
                class312.field4705.method2184((byte) 89, class142.field1942);
                class312.field4705.method2184((byte) 89, class39.field446 ? 1 : 0);
                class312.field4705.method2184((byte) 89, 1);
                class312.field4705.method2184((byte) 89, class323.method2270(arg0 + 68));
                class312.field4705.method2189(-1, class187.field2592);
                class312.field4705.method2189(-1, class64.field836);
                class312.field4705.method2184((byte) 89, class239.field3394);
                class262.method1789(class312.field4705, 0);
                class312.field4705.method2157((byte) -68, class165.field2262);
                class312.field4705.method2188(255, class169.field2297);
                class312.field4705.method2188(255, class99.method725((byte) 84));
                class301.field4464 = true;
                class312.field4705.method2189(-1, class54.field735);
                class312.field4705.method2188(255, class249.field3577.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class289.field4308.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class221.field3179.method963((byte) 63));
                class312.field4705.method2188(255, class145.field2004.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class259.field3811.method963((byte) 63));
                class312.field4705.method2188(255, class92.field1281.method963((byte) 63));
                class312.field4705.method2188(255, class173.field2349.method963((byte) 63));
                class312.field4705.method2188(255, class249.field3579.method963((byte) 63));
                class312.field4705.method2188(255, class204.field2948.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class1.field5.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class332.field5002.method963((byte) 63));
                class312.field4705.method2188(255, class44.field544.method963((byte) 63));
                class312.field4705.method2188(255, class20.field260.method963((byte) 63));
                class312.field4705.method2188(255, class256.field3708.method963((byte) 63));
                class312.field4705.method2188(255, class159.field2177.method963((byte) 63));
                class312.field4705.method2188(255, class54.field724.method963((byte) 63));
                class312.field4705.method2188(255, class43.field499.method963((byte) 63));
                class312.field4705.method2188(255, class141.field1933.method963((byte) 63));
                class312.field4705.method2188(255, class257.field3776.method963((byte) 63));
                class312.field4705.method2188(255, class162.field2236.method963((byte) 63));
                class312.field4705.method2188(arg0 + 260, class163.field2244.method963((byte) 63));
                class312.field4705.method2188(255, class116.field1569.method963((byte) 63));
                class312.field4705.method2188(arg0 + 260, class204.field2924.method963((byte) 63));
                class312.field4705.method2188(255, class307.field4595.method963((byte) 63));
                class312.field4705.method2188(255, class54.field719.method963((byte) 63));
                class312.field4705.method2188(255, class85.field1234.method963((byte) 63));
                class312.field4705.method2188(255, class44.field543.method963((byte) 63));
                class312.field4705.method2188(255, class209.field3022.method963((byte) 63));
                class312.field4705.method2188(arg0 ^ 0xFFFFFF04, class315.field4751.method963((byte) 63));
                class312.field4705.method2218(-92, 0, class90.field1264.field4777, class90.field1264.field4798);
                class39.field442.method1575(class312.field4705.field4777, 0, arg0 + 5005, class312.field4705.field4798);
                class90.field1264.method2235(338, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class157.field2165.method2235(338, var5);
                class198.field2822 = 4;
            }
            if (~class198.field2822 == arg0) {
                if (class39.field442.method1572(0) < 1) {
                    return;
                }
                int var7 = class39.field442.method1570((byte) 101);
                if (var7 == 21) {
                    class198.field2822 = 7;
                } else if (var7 == 29) {
                    class198.field2822 = 10;
                } else if (var7 == 1) {
                    class68.field939 = var7;
                    class198.field2822 = 5;
                    return;
                } else if (var7 == 2) {
                    class198.field2822 = 8;
                } else if (var7 == 15) {
                    class198.field2822 = 0;
                    class68.field939 = var7;
                    return;
                } else if (var7 == 23 && class117.field1593 < 1) {
                    class28.field347 = 0;
                    class198.field2822 = 1;
                    class117.field1593++;
                    class39.field442.method1577((byte) 79);
                    class39.field442 = null;
                    return;
                } else {
                    class68.field939 = var7;
                    class198.field2822 = 0;
                    class39.field442.method1577((byte) -102);
                    class39.field442 = null;
                    return;
                }
            }
            if (class198.field2822 == 6) {
                class90.field1264.field4777 = 0;
                class90.field1264.method2238(17, (byte) -128);
                class39.field442.method1575(class90.field1264.field4777, 0, arg0 ^ 0xFFFFEC73, class90.field1264.field4798);
                class198.field2822 = 4;
                return;
            }
            if (class198.field2822 == 7) {
                if (class39.field442.method1572(0) >= 1) {
                    class211.field3062 = class39.field442.method1570((byte) 81) * 60 + 180;
                    class68.field939 = 21;
                    class198.field2822 = 0;
                    class39.field442.method1577((byte) 46);
                    class39.field442 = null;
                    return;
                }
                return;
            }
            if (class198.field2822 == 10) {
                if (class39.field442.method1572(0) < 1) {
                    return;
                }
                class207.field2976 = class39.field442.method1570((byte) 65);
                class198.field2822 = 0;
                class68.field939 = 29;
                class39.field442.method1577((byte) 62);
                class39.field442 = null;
                return;
            }
            if (class198.field2822 == 8) {
                if (class39.field442.method1572(arg0 ^ 0xFFFFFFFB) < 14) {
                    return;
                }
                class39.field442.method1573(class157.field2165.field4798, 14, -19451, 0);
                class157.field2165.field4777 = 0;
                class323.field4898 = class157.field2165.method2219(arg0 ^ 0xFFFFBFBB);
                class218.field3114 = class157.field2165.method2219(16448);
                class45.field555 = class157.field2165.method2219(16448) == 1;
                class162.field2228 = class157.field2165.method2219(16448) == 1;
                class289.field4303 = class157.field2165.method2219(16448) == 1;
                class72.field998 = class157.field2165.method2219(16448) == 1;
                class187.field2594 = class157.field2165.method2219(16448) == 1;
                class306.field4593 = class157.field2165.method2220((byte) 112);
                class199.field2835 = class157.field2165.method2219(arg0 + 16453) == 1;
                class66.field869 = class157.field2165.method2219(16448) == 1;
                class162.method1167(2, class66.field869);
                class85.method656(class66.field869, 0);
                if (!class39.field446) {
                    if ((!class45.field555 || class289.field4303) && !class199.field2835) {
                        try {
                            class325.method2277(arg0 ^ 0x52E9, class165.field2258.field1157, "unzap");
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class325.method2277(arg0 - 21225, class165.field2258.field1157, "zap");
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class325.method2277(-21230, class165.field2258.field1157, "loggedin");
                } catch (Throwable var12) {
                }
                class159.field2179 = class157.field2165.method2243((byte) -93);
                class199.field2833 = class157.field2165.method2220((byte) 43);
                class198.field2822 = 9;
            }
            if (class198.field2822 == 9) {
                if (class39.field442.method1572(0) < class199.field2833) {
                    return;
                }
                class157.field2165.field4777 = 0;
                class39.field442.method1573(class157.field2165.field4798, class199.field2833, -19451, 0);
                class198.field2822 = 0;
                class68.field939 = 2;
                class160.method1152(0);
                class237.field3368 = -1;
                class318.method2230(false, true);
                class159.field2179 = -1;
                return;
            }
        } catch (IOException var15) {
            if (class39.field442 != null) {
                class39.field442.method1577((byte) -12);
                class39.field442 = null;
            }
            if (class117.field1593 >= 1) {
                class198.field2822 = 0;
                class68.field939 = -4;
            } else {
                if (class54.field726 == class129.field1780) {
                    class129.field1780 = class103.field1411;
                } else {
                    class129.field1780 = class54.field726;
                }
                class117.field1593++;
                class28.field347 = 0;
                class198.field2822 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lin;I)Ljava/lang/String;", line = 651)
    public static final String method789(class344 arg0, int arg1) {
        field1442++;
        if (arg1 != -2) {
            field1450 = -46;
        }
        if (client.method821(arg0).method2040(-1) == 0) {
            return null;
        } else if (arg0.field5274 == null || arg0.field5274.trim().length() == 0) {
            return class63.field823 ? "Hidden-use" : null;
        } else {
            return arg0.field5274;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[[I", line = 694)
    public final int[][] method53(int arg0, int arg1) {
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        field1441++;
        if (this.field4840.field3352) {
            int[][] var4 = this.method2227(0, 30, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class326.field4933; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1445[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1449 < var13) {
                    var8[var11] = var12;
                    var7[var11] = var6[var11];
                    var10[var11] = var9[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1445[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1449 >= var15) {
                        int var16 = var9[var11];
                        int var17 = var16 - this.field1445[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field1449 >= var17) {
                            var8[var11] = this.field1453 * var12 >> 12;
                            var7[var11] = this.field1438 * var14 >> 12;
                            var10[var11] = this.field1443 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var7[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var7[var11] = var14;
                        var10[var11] = var9[var11];
                    }
                }
            }
        }
        int var18 = 62 / ((-arg0 - 31) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(III)I", line = 789)
    public static final int method790(int arg0, int arg1, int arg2) {
        if (arg0 <= 34) {
            field1450 = 69;
        }
        field1448++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
