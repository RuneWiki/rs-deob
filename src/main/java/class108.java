import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class108 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field2225 = 65000;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Llh;")
    private class115 field2228 = null;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Llh;")
    private class115 field2223 = null;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[[I")
    public static int[][] field2230 = new int[104][104];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[Lrf;")
    public static class167[] field2235;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[B")
    public final byte[] method742(boolean arg0, int arg1) {
        field2233++;
        class115 var3 = this.field2228;
        synchronized (this.field2228) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2223.method772((byte) -52)) {
                    return null;
                }
                this.field2223.method778(-116, (long) (arg1 * 6));
                this.field2223.method774(class158.field3149, 127, 0, 6);
                if (!arg0) {
                    return null;
                }
                int var6 = ((class158.field3149[1] & 0xFF) << 8) + (class158.field3149[0] << 16 & 0xFF0000) + (class158.field3149[2] & 0xFF);
                int var7 = (class158.field3149[5] & 0xFF) + ((class158.field3149[4] & 0xFF) << 8) + ((class158.field3149[3] & 0xFF) << 16);
                if (var6 < 0 || this.field2225 < var6) {
                    return null;
                } else if (var7 > 0 && this.field2228.method772((byte) -106) / 520L >= (long) var7) {
                    int var10 = 0;
                    byte[] var11 = new byte[var6];
                    int var12 = 0;
                    label74: while (var10 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        int var14 = var6 - var10;
                        this.field2228.method778(52, (long) (var7 * 520));
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2228.method774(class158.field3149, 81, 0, var14 + 8);
                        int var15 = ((class158.field3149[0] & 0xFF) << 8) + (class158.field3149[1] & 0xFF);
                        int var16 = class158.field3149[7] & 0xFF;
                        int var17 = ((class158.field3149[2] & 0xFF) << 8) + (class158.field3149[3] & 0xFF);
                        int var18 = (class158.field3149[6] & 0xFF) + (((class158.field3149[4] & 0xFF) << 16) + ((class158.field3149[5] & 0xFF) << 8));
                        if (arg1 == var15 && var12 == var17 && this.field2231 == var16) {
                            if (var18 >= 0 && this.field2228.method772((byte) -93) / 520L >= (long) var18) {
                                var12++;
                                var7 = var18;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label74;
                                    }
                                    var11[var10++] = class158.field3149[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2227++;
        return "Cache:" + this.field2231;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method743(byte arg0) {
        if (arg0 == -121) {
            field2230 = null;
            field2235 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static final void method744(byte arg0) {
        if (arg0 < 98) {
            return;
        }
        field2232++;
        if (class66.field1340 != null) {
            class65 var1 = class66.field1340;
            synchronized (class66.field1340) {
                class66.field1340 = null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method745(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field2234++;
        class115 var6 = this.field2228;
        synchronized (this.field2228) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field2223.method772((byte) -124)) {
                        return false;
                    }
                    this.field2223.method778(-117, (long) (arg0 * 6));
                    this.field2223.method774(class158.field3149, 94, 0, 6);
                    var8 = ((class158.field3149[4] & 0xFF) << 8) + (class158.field3149[3] << 16 & 0xFF0000) + (class158.field3149[5] & 0xFF);
                    if (var8 <= 0 || this.field2228.method772((byte) -63) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2228.method772((byte) -70) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class158.field3149[5] = (byte) var8;
                int var10 = 0;
                class158.field3149[0] = (byte) (arg1 >> 16);
                if (arg4 < 3) {
                    return true;
                }
                int var12 = 0;
                class158.field3149[3] = (byte) (var8 >> 16);
                class158.field3149[4] = (byte) (var8 >> 8);
                class158.field3149[1] = (byte) (arg1 >> 8);
                class158.field3149[2] = (byte) arg1;
                this.field2223.method778(73, (long) (arg0 * 6));
                this.field2223.method770(class158.field3149, 6, 88, 0);
                while (arg1 > var12) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field2228.method778(-125, (long) (var8 * 520));
                            try {
                                this.field2228.method774(class158.field3149, 92, 0, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = class158.field3149[7] & 0xFF;
                            int var15 = ((class158.field3149[2] & 0xFF) << 8) + (class158.field3149[3] & 0xFF);
                            int var16 = ((class158.field3149[0] & 0xFF) << 8) + (class158.field3149[1] & 0xFF);
                            var13 = ((class158.field3149[4] & 0xFF) << 16) + ((class158.field3149[5] & 0xFF) << 8) + (class158.field3149[6] & 0xFF);
                            if (arg0 == var16 && var10 == var15 && this.field2231 == var14) {
                                if (var13 >= 0 && this.field2228.method772((byte) -95) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field2228.method772((byte) -86) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class158.field3149[2] = (byte) (var10 >> 8);
                    int var19 = arg1 - var12;
                    class158.field3149[3] = (byte) var10;
                    if (arg1 - var12 <= 512) {
                        var13 = 0;
                    }
                    class158.field3149[0] = (byte) (arg0 >> 8);
                    class158.field3149[1] = (byte) arg0;
                    class158.field3149[6] = (byte) var13;
                    class158.field3149[7] = (byte) this.field2231;
                    class158.field3149[4] = (byte) (var13 >> 16);
                    class158.field3149[5] = (byte) (var13 >> 8);
                    var10++;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2228.method778(-28, (long) (var8 * 520));
                    this.field2228.method770(class158.field3149, 8, -105, 0);
                    var8 = var13;
                    this.field2228.method770(arg2, var19, 113, var12);
                    var12 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[BII)Z")
    public final boolean method746(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field2229++;
        class115 var5 = this.field2228;
        synchronized (this.field2228) {
            if (arg2 < 0 || arg2 > this.field2225) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method745(arg3, arg2, arg1, arg0, 70);
            if (!var6) {
                var6 = this.method745(arg3, arg2, arg1, false, 70);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
    public static final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class33.field748 = arg0;
        for (int var5 = -1; var5 < class96.field1928 + class140.field2811; var5++) {
            class4 var21;
            if (var5 == -1) {
                var21 = class15.field423;
            } else if (class140.field2811 <= var5) {
                var21 = class107.field2187[class39.field893[var5 - class140.field2811]];
            } else {
                var21 = class172.field3347[class190.field3678[var5]];
            }
            if (var21 != null && var21.method24(100)) {
                if (var21 instanceof class129) {
                    class97 var22 = ((class129) var21).field2592;
                    if (var22.field1940 != null) {
                        var22 = var22.method674((byte) -99);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class140.field2811 <= var5) {
                    class97 var28 = ((class129) var21).field2592;
                    if (var28.field1940 != null) {
                        var28 = var28.method674((byte) -99);
                    }
                    if (var28.field1969 >= 0 && class121.field2457.length > var28.field1969) {
                        class39.method253((byte) -121, var21.method33(false) + 15, var21);
                        if (class185.field3498 > -1) {
                            class121.field2457[var28.field1969].method1097(class185.field3498 + arg1 - 12, class53.field1109 + -30 + arg3);
                        }
                    }
                    int var29 = 0;
                    class205[] var30 = class135.field2711;
                    while (var30.length > var29) {
                        class205 var32 = var30[var29];
                        if (var32 != null && var32.field3956 == 1 && class39.field893[var5 - class140.field2811] == var32.field3958 && class158.field3150 % 20 < 10) {
                            class39.method253((byte) 21, var21.method33(false) + 15, var21);
                            if (class185.field3498 > -1) {
                                class212.field4106[var32.field3951].method1097(class185.field3498 + arg1 - 12, arg3 - (-class53.field1109 - -28));
                            }
                        }
                        var29++;
                    }
                } else {
                    int var23 = 30;
                    class91 var24 = (class91) var21;
                    if (var24.field1797 != -1 || var24.field1781 != -1) {
                        class39.method253((byte) 86, var21.method33(false) + 15, var21);
                        if (class185.field3498 > -1) {
                            if (var24.field1797 != -1) {
                                class91.field1794[var24.field1797].method1097(class185.field3498 + arg1 - 12, class53.field1109 + arg3 + -var23);
                                var23 += 25;
                            }
                            if (var24.field1781 != -1) {
                                class121.field2457[var24.field1781].method1097(class185.field3498 + arg1 - 12, arg3 - var23 + class53.field1109);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        class205[] var25 = class135.field2711;
                        for (int var26 = 0; var26 < var25.length; var26++) {
                            class205 var27 = var25[var26];
                            if (var27 != null && var27.field3956 == 10 && class190.field3678[var5] == var27.field3958) {
                                class39.method253((byte) 24, var21.method33(false) + 15, var21);
                                if (class185.field3498 > -1) {
                                    class212.field4106[var27.field3951].method1097(class185.field3498 + arg1 - 12, class53.field1109 + arg3 + -var23);
                                }
                            }
                        }
                    }
                }
                if (var21.field223 != null && (class140.field2811 <= var5 || class65.field1319 == 0 || class65.field1319 == 3 || class65.field1319 == 1 && class76.method522(((class91) var21).field1805, (byte) -103))) {
                    class39.method253((byte) 18, var21.method33(false), var21);
                    if (class185.field3498 > -1 && class33.field748 < class51.field1096) {
                        class51.field1094[class33.field748] = class4.field242.method1000(var21.field223) / 2;
                        class51.field1087[class33.field748] = class4.field242.field3072;
                        class51.field1088[class33.field748] = class185.field3498;
                        class51.field1089[class33.field748] = class53.field1109;
                        class51.field1081[class33.field748] = var21.field241;
                        class51.field1093[class33.field748] = var21.field218;
                        class51.field1090[class33.field748] = var21.field239;
                        class51.field1082[class33.field748] = var21.field223;
                        class33.field748++;
                    }
                }
                if (class158.field3150 < var21.field245) {
                    class39.method253((byte) -121, var21.method33(false) + 15, var21);
                    if (class185.field3498 > -1) {
                        class163.method1049(class185.field3498 + arg1 - 15, class53.field1109 + arg3 + -3, var21.field261, 5, 65280);
                        class163.method1049(class185.field3498 + var21.field261 + arg1 - 15, arg3 - -class53.field1109 + -3, 30 - var21.field261, 5, 16711680);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var21.field227[var31] > class158.field3150) {
                        class39.method253((byte) -122, var21.method33(false) / 2, var21);
                        if (class185.field3498 > -1) {
                            if (var31 == 1) {
                                class53.field1109 -= 20;
                            }
                            if (var31 == 2) {
                                class53.field1109 -= 10;
                                class185.field3498 -= 15;
                            }
                            if (var31 == 3) {
                                class185.field3498 += 15;
                                class53.field1109 -= 10;
                            }
                            class5.field277[var21.field228[var31]].method1097(class185.field3498 + arg1 - 12, class53.field1109 + arg3 + -12);
                            class182.field3469.method1003(class142.method938(var21.field263[var31], false), arg1 + class185.field3498 - 1, class53.field1109 + arg3 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field2226++;
        for (int var6 = 0; var6 < class33.field748; var6++) {
            int var7 = class51.field1088[var6];
            int var8 = class51.field1089[var6];
            int var9 = class51.field1094[var6];
            boolean var10 = true;
            int var11 = class51.field1087[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class51.field1089[var20] + -class51.field1087[var20] && class51.field1089[var20] + 2 > var8 - var11 && class51.field1094[var20] + class51.field1088[var20] > -var9 + var7 && var7 + var9 > class51.field1088[var20] - class51.field1094[var20] && class51.field1089[var20] - class51.field1087[var20] < var8) {
                        var10 = true;
                        var8 = class51.field1089[var20] - class51.field1087[var20];
                    }
                }
            }
            class185.field3498 = class51.field1088[var6];
            class53.field1109 = class51.field1089[var6] = var8;
            class92 var12 = class51.field1082[var6];
            if (class31.field710 == 0) {
                int var13 = 16776960;
                if (class51.field1081[var6] < 6) {
                    var13 = class10.field361[class51.field1081[var6]];
                }
                if (class51.field1081[var6] == 6) {
                    var13 = class126.field2545 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class51.field1081[var6] == 7) {
                    var13 = class126.field2545 % 20 >= 10 ? 65535 : 255;
                }
                if (class51.field1081[var6] == 8) {
                    var13 = class126.field2545 % 20 < 10 ? 45056 : 8454016;
                }
                if (class51.field1081[var6] == 9) {
                    int var14 = 150 - class51.field1090[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class51.field1081[var6] == 10) {
                    int var15 = 150 - class51.field1090[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 - (var15 - 100) * 5;
                    }
                }
                if (class51.field1081[var6] == 11) {
                    int var16 = 150 - class51.field1090[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class51.field1093[var6] == 0) {
                    class4.field242.method1003(var12, class185.field3498 + arg1, class53.field1109 + arg3, var13, 0);
                }
                if (class51.field1093[var6] == 1) {
                    class4.field242.method1008(var12, class185.field3498 + arg1, class53.field1109 + arg3, var13, 0, class126.field2545);
                }
                if (class51.field1093[var6] == 2) {
                    class4.field242.method1004(var12, class185.field3498 + arg1, class53.field1109 + arg3, var13, 0, class126.field2545);
                }
                if (class51.field1093[var6] == 3) {
                    class4.field242.method992(var12, class185.field3498 + arg1, arg3 - -class53.field1109, var13, 0, class126.field2545, 150 - class51.field1090[var6]);
                }
                if (class51.field1093[var6] == 4) {
                    int var17 = (150 - class51.field1090[var6]) * (class4.field242.method1000(var12) + 100) / 150;
                    class163.method1038(class185.field3498 + arg1 - 50, arg3, class185.field3498 + arg1 + 50, arg2 + arg3);
                    class4.field242.method987(var12, class185.field3498 + arg1 + 50 - var17, class53.field1109 + arg3, var13, 0);
                    class163.method1040(arg1, arg3, arg1 + arg4, arg2 + arg3);
                }
                if (class51.field1093[var6] == 5) {
                    int var18 = 0;
                    int var19 = 150 - class51.field1090[var6];
                    if (var19 < 25) {
                        var18 = var19 - 25;
                    } else if (var19 > 125) {
                        var18 = var19 - 125;
                    }
                    class163.method1038(arg1, class53.field1109 + arg3 - class4.field242.field3072 - 1, arg1 + arg4, arg3 + class53.field1109 + 5);
                    class4.field242.method1003(var12, class185.field3498 + arg1, arg3 - -var18 + class53.field1109, var13, 0);
                    class163.method1040(arg1, arg3, arg1 + arg4, arg2 + arg3);
                }
            } else {
                class4.field242.method1003(var12, class185.field3498 + arg1, class53.field1109 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Leb;Z)V")
    public static final void method748(class43 arg0, boolean arg1) {
        class212.field4105.method101(arg0, (byte) 125);
        while (true) {
            class43 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class43[][] var7;
            class43 var65;
            do {
                class43 var64;
                do {
                    class43 var63;
                    do {
                        class43 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class43) class212.field4105.method105(-123);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field955);
                                            var3 = var2.field957;
                                            var4 = var2.field965;
                                            var5 = var2.field958;
                                            var6 = var2.field954;
                                            var7 = class31.field698[var5];
                                            if (!var2.field982) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class43 var8 = class31.field698[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field955) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class111.field2266 && var3 > class101.field2081) {
                                                    class43 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field955 && (var9.field982 || (var2.field981 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class111.field2266 && var3 < class179.field3436 - 1) {
                                                    class43 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field955 && (var10.field982 || (var2.field981 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class70.field1447 && var4 > class34.field777) {
                                                    class43 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field955 && (var11.field982 || (var2.field981 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class70.field1447 && var4 < class94.field1899 - 1) {
                                                    class43 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field955 && (var12.field982 || (var2.field981 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field982 = false;
                                            if (var2.field962 != null) {
                                                class43 var13 = var2.field962;
                                                if (var13.field960 == null) {
                                                    if (var13.field961 != null && !class15.method92(0, var3, var4)) {
                                                        class156.method1011(var13.field961, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var3, var4);
                                                    }
                                                } else if (!class15.method92(0, var3, var4)) {
                                                    class1.method2(var13.field960, 0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var3, var4);
                                                }
                                                class48 var14 = var13.field963;
                                                if (var14 != null) {
                                                    var14.field1040.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var14.field1051 - class129.field2601, var14.field1048 - class99.field2020, var14.field1046 - class92.field1829, var14.field1056);
                                                }
                                                for (int var15 = 0; var15 < var13.field979; var15++) {
                                                    class185 var16 = var13.field966[var15];
                                                    if (var16 != null) {
                                                        var16.field3501.method600(var16.field3499, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var16.field3496 - class129.field2601, var16.field3492 - class99.field2020, var16.field3490 - class92.field1829, var16.field3495);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field960 == null) {
                                                if (var2.field961 != null && !class15.method92(var6, var3, var4)) {
                                                    var17 = true;
                                                    class156.method1011(var2.field961, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var3, var4);
                                                }
                                            } else if (!class15.method92(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field960.field1229 != 12345678 || class31.field714 && var5 <= class30.field657) {
                                                    class1.method2(var2.field960, var6, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class48 var20 = var2.field963;
                                            class138 var21 = var2.field953;
                                            if (var20 != null || var21 != null) {
                                                if (class111.field2266 == var3) {
                                                    var18++;
                                                } else if (class111.field2266 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class70.field1447 == var4) {
                                                    var18 += 3;
                                                } else if (class70.field1447 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class15.field433[var18];
                                                var2.field959 = class64.field1288[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field1033 & class6.field294[var18]) == 0) {
                                                    var2.field980 = 0;
                                                } else if (var20.field1033 == 16) {
                                                    var2.field980 = 3;
                                                    var2.field977 = class61.field1272[var18];
                                                    var2.field956 = 3 - var2.field977;
                                                } else if (var20.field1033 == 32) {
                                                    var2.field980 = 6;
                                                    var2.field977 = class127.field2568[var18];
                                                    var2.field956 = 6 - var2.field977;
                                                } else if (var20.field1033 == 64) {
                                                    var2.field980 = 12;
                                                    var2.field977 = class67.field1355[var18];
                                                    var2.field956 = 12 - var2.field977;
                                                } else {
                                                    var2.field980 = 9;
                                                    var2.field977 = class202.field3922[var18];
                                                    var2.field956 = 9 - var2.field977;
                                                }
                                                if ((var20.field1033 & var19) != 0 && !class53.method314(var6, var3, var4, var20.field1033)) {
                                                    var20.field1040.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var20.field1051 - class129.field2601, var20.field1048 - class99.field2020, var20.field1046 - class92.field1829, var20.field1056);
                                                }
                                                if ((var20.field1030 & var19) != 0 && !class53.method314(var6, var3, var4, var20.field1030)) {
                                                    var20.field1053.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var20.field1051 - class129.field2601, var20.field1048 - class99.field2020, var20.field1046 - class92.field1829, var20.field1056);
                                                }
                                            }
                                            if (var21 != null && !class124.method836(var6, var3, var4, var21.field2775.field3511)) {
                                                if ((var21.field2763 & var19) != 0) {
                                                    var21.field2775.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var21.field2765 + var21.field2760 - class129.field2601, var21.field2764 - class99.field2020, var21.field2761 + var21.field2771 - class92.field1829, var21.field2759);
                                                } else if (var21.field2763 == 256) {
                                                    int var22 = var21.field2765 - class129.field2601;
                                                    int var23 = var21.field2764 - class99.field2020;
                                                    int var24 = var21.field2761 - class92.field1829;
                                                    int var25 = var21.field2770;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2775.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var21.field2760 + var22, var23, var21.field2771 + var24, var21.field2759);
                                                    } else if (var21.field2772 != null) {
                                                        var21.field2772.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var22, var23, var24, var21.field2759);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class28 var28 = var2.field969;
                                                if (var28 != null) {
                                                    var28.field633.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var28.field617 - class129.field2601, var28.field620 - class99.field2020, var28.field623 - class92.field1829, var28.field632);
                                                }
                                                class147 var29 = var2.field972;
                                                if (var29 != null && var29.field2912 == 0) {
                                                    if (var29.field2928 != null) {
                                                        var29.field2928.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var29.field2920 - class129.field2601, var29.field2915 - class99.field2020, var29.field2927 - class92.field1829, var29.field2914);
                                                    }
                                                    if (var29.field2913 != null) {
                                                        var29.field2913.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var29.field2920 - class129.field2601, var29.field2915 - class99.field2020, var29.field2927 - class92.field1829, var29.field2914);
                                                    }
                                                    if (var29.field2916 != null) {
                                                        var29.field2916.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var29.field2920 - class129.field2601, var29.field2915 - class99.field2020, var29.field2927 - class92.field1829, var29.field2914);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field981;
                                            if (var30 != 0) {
                                                if (var3 < class111.field2266 && (var30 & 0x4) != 0) {
                                                    class43 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field955) {
                                                        class212.field4105.method101(var31, (byte) 119);
                                                    }
                                                }
                                                if (var4 < class70.field1447 && (var30 & 0x2) != 0) {
                                                    class43 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field955) {
                                                        class212.field4105.method101(var32, (byte) 115);
                                                    }
                                                }
                                                if (var3 > class111.field2266 && (var30 & 0x1) != 0) {
                                                    class43 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field955) {
                                                        class212.field4105.method101(var33, (byte) 117);
                                                    }
                                                }
                                                if (var4 > class70.field1447 && (var30 & 0x8) != 0) {
                                                    class43 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field955) {
                                                        class212.field4105.method101(var34, (byte) -78);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field980 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field979; var36++) {
                                                if (class96.field1931 != var2.field966[var36].field3493 && (var2.field976[var36] & var2.field980) == var2.field977) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class48 var37 = var2.field963;
                                                if (!class53.method314(var6, var3, var4, var37.field1033)) {
                                                    var37.field1040.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var37.field1051 - class129.field2601, var37.field1048 - class99.field2020, var37.field1046 - class92.field1829, var37.field1056);
                                                }
                                                var2.field980 = 0;
                                            }
                                        }
                                        if (!var2.field964) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field979;
                                            var2.field964 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class185 var41 = var2.field966[var40];
                                                if (class96.field1931 != var41.field3493) {
                                                    for (int var42 = var41.field3488; var42 <= var41.field3489; var42++) {
                                                        for (int var43 = var41.field3486; var43 <= var41.field3504; var43++) {
                                                            class43 var44 = var7[var42][var43];
                                                            if (var44.field982) {
                                                                var2.field964 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field980 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field3488) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field3489) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field3486) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field3504) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field980) == var2.field956) {
                                                                    var2.field964 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class175.field3383[var39++] = var41;
                                                    int var46 = class111.field2266 - var41.field3488;
                                                    int var47 = var41.field3489 - class111.field2266;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class70.field1447 - var41.field3486;
                                                    int var49 = var41.field3504 - class70.field1447;
                                                    if (var49 > var48) {
                                                        var41.field3491 = var46 + var49;
                                                    } else {
                                                        var41.field3491 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class185 var53 = class175.field3383[var52];
                                                    if (class96.field1931 != var53.field3493) {
                                                        if (var53.field3491 > var50) {
                                                            var50 = var53.field3491;
                                                            var51 = var52;
                                                        } else if (var53.field3491 == var50) {
                                                            int var54 = var53.field3496 - class129.field2601;
                                                            int var55 = var53.field3490 - class92.field1829;
                                                            int var56 = class175.field3383[var51].field3496 - class129.field2601;
                                                            int var57 = class175.field3383[var51].field3490 - class92.field1829;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class185 var58 = class175.field3383[var51];
                                                var58.field3493 = class96.field1931;
                                                if (!class90.method597(var6, var58.field3488, var58.field3489, var58.field3486, var58.field3504, var58.field3501.field3511)) {
                                                    var58.field3501.method600(var58.field3499, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var58.field3496 - class129.field2601, var58.field3492 - class99.field2020, var58.field3490 - class92.field1829, var58.field3495);
                                                }
                                                for (int var59 = var58.field3488; var59 <= var58.field3489; var59++) {
                                                    for (int var60 = var58.field3486; var60 <= var58.field3504; var60++) {
                                                        class43 var61 = var7[var59][var60];
                                                        if (var61.field980 != 0) {
                                                            class212.field4105.method101(var61, (byte) 121);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field955) {
                                                            class212.field4105.method101(var61, (byte) -27);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field964) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field964 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field955);
                            } while (var2.field980 != 0);
                            if (var3 > class111.field2266 || var3 <= class101.field2081) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field955);
                        if (var3 < class111.field2266 || var3 >= class179.field3436 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field955);
                    if (var4 > class70.field1447 || var4 <= class34.field777) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field955);
                if (var4 < class70.field1447 || var4 >= class94.field1899 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field955);
            var2.field955 = false;
            class144.field2878--;
            class147 var66 = var2.field972;
            if (var66 != null && var66.field2912 != 0) {
                if (var66.field2928 != null) {
                    var66.field2928.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var66.field2920 - class129.field2601, var66.field2915 - class99.field2020 - var66.field2912, var66.field2927 - class92.field1829, var66.field2914);
                }
                if (var66.field2913 != null) {
                    var66.field2913.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var66.field2920 - class129.field2601, var66.field2915 - class99.field2020 - var66.field2912, var66.field2927 - class92.field1829, var66.field2914);
                }
                if (var66.field2916 != null) {
                    var66.field2916.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var66.field2920 - class129.field2601, var66.field2915 - class99.field2020 - var66.field2912, var66.field2927 - class92.field1829, var66.field2914);
                }
            }
            if (var2.field959 != 0) {
                class138 var67 = var2.field953;
                if (var67 != null && !class124.method836(var6, var3, var4, var67.field2775.field3511)) {
                    if ((var67.field2763 & var2.field959) != 0) {
                        var67.field2775.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var67.field2765 + var67.field2760 - class129.field2601, var67.field2764 - class99.field2020, var67.field2761 + var67.field2771 - class92.field1829, var67.field2759);
                    } else if (var67.field2763 == 256) {
                        int var68 = var67.field2765 - class129.field2601;
                        int var69 = var67.field2764 - class99.field2020;
                        int var70 = var67.field2761 - class92.field1829;
                        int var71 = var67.field2770;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field2775.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var67.field2760 + var68, var69, var67.field2771 + var70, var67.field2759);
                        } else if (var67.field2772 != null) {
                            var67.field2772.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var68, var69, var70, var67.field2759);
                        }
                    }
                }
                class48 var74 = var2.field963;
                if (var74 != null) {
                    if ((var74.field1030 & var2.field959) != 0 && !class53.method314(var6, var3, var4, var74.field1030)) {
                        var74.field1053.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var74.field1051 - class129.field2601, var74.field1048 - class99.field2020, var74.field1046 - class92.field1829, var74.field1056);
                    }
                    if ((var74.field1033 & var2.field959) != 0 && !class53.method314(var6, var3, var4, var74.field1033)) {
                        var74.field1040.method600(0, class58.field1219, class89.field1753, class61.field1264, class202.field3915, var74.field1051 - class129.field2601, var74.field1048 - class99.field2020, var74.field1046 - class92.field1829, var74.field1056);
                    }
                }
            }
            if (var5 < class151.field3003 - 1) {
                class43 var75 = class31.field698[var5 + 1][var3][var4];
                if (var75 != null && var75.field955) {
                    class212.field4105.method101(var75, (byte) -42);
                }
            }
            if (var3 < class111.field2266) {
                class43 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field955) {
                    class212.field4105.method101(var76, (byte) -38);
                }
            }
            if (var4 < class70.field1447) {
                class43 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field955) {
                    class212.field4105.method101(var77, (byte) -50);
                }
            }
            if (var3 > class111.field2266) {
                class43 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field955) {
                    class212.field4105.method101(var78, (byte) 116);
                }
            }
            if (var4 > class70.field1447) {
                class43 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field955) {
                    class212.field4105.method101(var79, (byte) 119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILlh;Llh;I)V")
    public class108(int arg0, class115 arg1, class115 arg2, int arg3) {
        this.field2223 = arg2;
        this.field2231 = arg0;
        this.field2228 = arg1;
        this.field2225 = arg3;
    }
}
