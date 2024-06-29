import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class192 {

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[B")
    private byte[] field3354 = new byte[4];

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Leg;")
    private class5 field3363;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "J")
    private long field3352;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lqe;")
    public static class168 field3346 = class66.method448(")1j", 90);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field3357 = -1;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field3360 = -1;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lqe;")
    public static class168 field3349 = class66.method448(")3)3)3", -125);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    private int field3355;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    private int field3359;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3358;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[B")
    private byte[] field3356;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
    public static int[] field3348;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lhh;I)I")
    public static final int method1244(class121 arg0, int arg1) {
        int var2 = arg0.field1981;
        if (arg1 != -1) {
            return -72;
        }
        field3353++;
        if (arg0.field224 == arg0.field223) {
            var2 = arg0.field1994;
        } else if (arg0.field223 == arg0.field161) {
            var2 = arg0.field2005;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field3346 = null;
        field3348 = null;
        int var1 = -98 % ((arg0 - 63) / 59);
        field3349 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqe;IB)V")
    public static final void method1246(class168 arg0, int arg1, byte arg2) {
        boolean var3 = false;
        class168 var4 = arg0.method1093((byte) -117).method1116(0);
        if (arg2 > -101) {
            return;
        }
        for (int var5 = 0; var5 < class132.field2322; var5++) {
            class121 var6 = class104.field1677[class115.field1868[var5]];
            if (var6 != null && var6.field2000 != null && var6.field2000.method1106(-85, var4)) {
                class88.method585(2, 0, var6.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var6.field219[0], (byte) 26, 1);
                var3 = true;
                if (arg1 == 1) {
                    class137.field2419++;
                    class87.field1348.method672(127, 238);
                    class87.field1348.method755(-123, class115.field1868[var5]);
                } else if (arg1 == 4) {
                    class87.field1348.method672(239, 238);
                    class59.field808++;
                    class87.field1348.method753(class115.field1868[var5], -242005080);
                } else if (arg1 == 6) {
                    class87.field1348.method672(10, 238);
                    class98.field1542++;
                    class87.field1348.method755(-121, class115.field1868[var5]);
                } else if (arg1 == 7) {
                    class120.field1959++;
                    class87.field1348.method672(148, 238);
                    class87.field1348.method726(class115.field1868[var5], (byte) 116);
                }
                break;
            }
        }
        if (!var3) {
            class229.method1475(class222.field3816, class50.method347(2, new class168[] { class153.field2657, var4 }), -1, 0);
        }
        field3350++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILoe;BIIZ)V")
    public static final void method1247(int arg0, class256 arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        class161.field2764 = arg3;
        class177.field3120 = arg1;
        class96.field1514 = 10000;
        class221.field3804 = arg4;
        field3351++;
        class135.field2361 = 1;
        class233.field3968 = arg0;
        class243.field4222 = arg5;
        if (arg2 != -77) {
            field3357 = 121;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)[B")
    public final byte[] method1248(int arg0) throws IOException {
        field3361++;
        if (class59.method407(-48) > this.field3352) {
            throw new IOException("fdt");
        }
        if (this.field3347 == 0) {
            if (this.field3363.field57 == 2) {
                throw new IOException("fds");
            }
            if (this.field3363.field57 == 1) {
                this.field3347 = 1;
                this.field3358 = (DataInputStream) this.field3363.field59;
            }
        }
        if (this.field3347 == 1) {
            int var2 = this.field3358.available();
            if (var2 > 0) {
                if (this.field3359 + var2 > 4) {
                    var2 = 4 - this.field3359;
                }
                this.field3359 += this.field3358.read(this.field3354, this.field3359, var2);
                if (this.field3359 == 4) {
                    int var3 = (new class112(this.field3354)).method769((byte) -86);
                    this.field3356 = new byte[var3];
                    this.field3347 = 2;
                }
            }
        }
        if (arg0 > -26) {
            this.field3359 = -67;
        }
        if (this.field3347 == 2) {
            int var4 = this.field3358.available();
            if (var4 > 0) {
                if (this.field3355 + var4 > this.field3356.length) {
                    var4 = this.field3356.length - this.field3355;
                }
                this.field3355 += this.field3358.read(this.field3356, this.field3355, var4);
                if (this.field3356.length == this.field3355) {
                    return this.field3356;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
    public static final boolean method1249(byte arg0) throws IOException {
        field3362++;
        if (class169.field2953 == null) {
            return false;
        }
        int var1 = class169.field2953.method1648(-90);
        if (var1 == 0) {
            return false;
        } else if (arg0 == 34) {
            if (class108.field1740 == -1) {
                var1--;
                class169.field2953.method1652(arg0 ^ 0xFFFFFFDD, 1, class112.field1815.field1780, 0);
                class112.field1815.field1821 = 0;
                class108.field1740 = class112.field1815.method669((byte) -119);
                class31.field377 = class122.field2024[class108.field1740];
            }
            if (class31.field377 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class169.field2953.method1652(-1, 1, class112.field1815.field1780, 0);
                class31.field377 = class112.field1815.field1780[0] & 0xFF;
            }
            if (class31.field377 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class169.field2953.method1652(-1, 2, class112.field1815.field1780, 0);
                class112.field1815.field1821 = 0;
                var1 -= 2;
                class31.field377 = class112.field1815.method731(false);
            }
            if (class31.field377 > var1) {
                return false;
            }
            class112.field1815.field1821 = 0;
            class169.field2953.method1652(-1, class31.field377, class112.field1815.field1780, 0);
            class44.field578 = 0;
            class209.field3630 = class36.field452;
            class36.field452 = class56.field773;
            class56.field773 = class108.field1740;
            if (class108.field1740 == 155) {
                class173.field3024 = class31.field377 / 8;
                for (int var2 = 0; var2 < class173.field3024; var2++) {
                    class150.field2626[var2] = class112.field1815.method759(69);
                    class189.field3299[var2] = class80.method532(class150.field2626[var2], (byte) 91);
                }
                class103.field1667 = class205.field3566;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 220) {
                class147.field2558 = class112.field1815.method772((byte) -50) * 30;
                class202.field3482 = class205.field3566;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 169) {
                long var3 = class112.field1815.method759(12);
                int var5 = class112.field1815.method731(false);
                int var6 = class112.field1815.method758(true);
                boolean var7 = true;
                if (var3 < 0L) {
                    var7 = false;
                    var3 &= Long.MAX_VALUE;
                }
                class168 var8 = class222.field3816;
                if (var5 > 0) {
                    var8 = class112.field1815.method751((byte) -107);
                }
                class168 var9 = class80.method532(var3, (byte) 43).method1116(arg0 ^ 0x22);
                for (int var10 = 0; var10 < class103.field1662; var10++) {
                    if (class56.field768[var10] == var3) {
                        if (class138.field2439[var10] != var5) {
                            class138.field2439[var10] = var5;
                            if (var5 > 0) {
                                class229.method1475(class222.field3816, class50.method347(2, new class168[] { var9, class35.field438 }), arg0 - 35, 5);
                            }
                            if (var5 == 0) {
                                class229.method1475(class222.field3816, class50.method347(2, new class168[] { var9, class9.field96 }), -1, 5);
                            }
                        }
                        class30.field365[var10] = var8;
                        class84.field1289[var10] = var6;
                        class116.field1893[var10] = var7;
                        var9 = null;
                        break;
                    }
                }
                if (var9 != null && class103.field1662 < 200) {
                    class56.field768[class103.field1662] = var3;
                    class32.field382[class103.field1662] = var9;
                    class138.field2439[class103.field1662] = var5;
                    class30.field365[class103.field1662] = var8;
                    class84.field1289[class103.field1662] = var6;
                    class116.field1893[class103.field1662] = var7;
                    class103.field1662++;
                }
                boolean var11 = false;
                class103.field1667 = class205.field3566;
                int var12 = class103.field1662;
                while (var12 > 0) {
                    boolean var13 = true;
                    var12--;
                    for (int var14 = 0; var14 < var12; var14++) {
                        if (class138.field2439[var14] != class83.field1272 && class138.field2439[var14 + 1] == class83.field1272 || class138.field2439[var14] == 0 && class138.field2439[var14 + 1] != 0) {
                            var13 = false;
                            int var15 = class138.field2439[var14];
                            class138.field2439[var14] = class138.field2439[var14 + 1];
                            class138.field2439[var14 + 1] = var15;
                            class168 var16 = class30.field365[var14];
                            class30.field365[var14] = class30.field365[var14 + 1];
                            class30.field365[var14 + 1] = var16;
                            class168 var17 = class32.field382[var14];
                            class32.field382[var14] = class32.field382[var14 + 1];
                            class32.field382[var14 + 1] = var17;
                            long var18 = class56.field768[var14];
                            class56.field768[var14] = class56.field768[var14 + 1];
                            class56.field768[var14 + 1] = var18;
                            int var20 = class84.field1289[var14];
                            class84.field1289[var14] = class84.field1289[var14 + 1];
                            class84.field1289[var14 + 1] = var20;
                            boolean var21 = class116.field1893[var14];
                            class116.field1893[var14] = class116.field1893[var14 + 1];
                            class116.field1893[var14 + 1] = var21;
                        }
                    }
                    if (var13) {
                        break;
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 16) {
                class168 var22 = class112.field1815.method751((byte) -127);
                Object[] var23 = new Object[var22.method1109((byte) 92) + 1];
                for (int var24 = var22.method1109((byte) 54) - 1; var24 >= 0; var24--) {
                    if (var22.method1110(255, var24) == 115) {
                        var23[var24 + 1] = class112.field1815.method751((byte) -128);
                    } else {
                        var23[var24 + 1] = Integer.valueOf(class112.field1815.method769((byte) -86));
                    }
                }
                var23[0] = Integer.valueOf(class112.field1815.method769((byte) -86));
                class147 var25 = new class147();
                var25.field2566 = var23;
                class82.method545(var25, (byte) 106);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 134) {
                int var26 = class112.field1815.method731(false);
                int var27 = class112.field1815.method765((byte) -87);
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var28 = class112.field1815.method767(117);
                class129 var29 = class257.method1713(var28, 127);
                if (var29.field2258) {
                    var29.field2195 = var27;
                    var29.field2187 = var26;
                    class242 var30 = class151.method1005(520, var26);
                    var29.field2186 = var30.field4161;
                    var29.field2246 = var30.field4185;
                    var29.field2154 = var30.field4193;
                    var29.field2161 = var30.field4163;
                    var29.field2124 = var30.field4149;
                    if (var29.field2157 > 0) {
                        var29.field2154 = var29.field2154 * 32 / var29.field2157;
                    } else if (var29.field2166 > 0) {
                        var29.field2154 = var29.field2154 * 32 / var29.field2166;
                    }
                    var29.field2163 = var30.field4189;
                    class65.method443(var29, 0);
                } else if (var26 == -1) {
                    var29.field2180 = 0;
                    class108.field1740 = -1;
                    return true;
                } else {
                    class242 var31 = class151.method1005(520, var26);
                    var29.field2186 = var31.field4161;
                    var29.field2180 = 4;
                    var29.field2124 = var31.field4149;
                    var29.field2259 = var26;
                    var29.field2154 = var31.field4193 * 100 / var27;
                    class65.method443(var29, arg0 ^ 0x22);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 163) {
                int var32 = class112.field1815.method766(22102);
                int var33 = class112.field1815.method772((byte) -50);
                class168 var34 = class112.field1815.method751((byte) -98);
                class44.method294(63, var33);
                class197.method1268(false, var32, var34);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 247) {
                class191.field3336 = class112.field1815.method758(true);
                class108.field1740 = -1;
                class103.field1667 = class205.field3566;
                return true;
            } else if (class108.field1740 == 42 || class108.field1740 == 43 || class108.field1740 == 21 || class108.field1740 == 62 || class108.field1740 == 118 || class108.field1740 == 154 || class108.field1740 == 160 || class108.field1740 == 193 || class108.field1740 == 0 || class108.field1740 == 187 || class108.field1740 == 44 || class108.field1740 == 153) {
                class6.method27(860602820);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 82) {
                class150.field2606 = class112.field1815.method762(false);
                class185.field3260 = class112.field1815.method778(128);
                while (class112.field1815.field1821 < class31.field377) {
                    class108.field1740 = class112.field1815.method758(true);
                    class6.method27(arg0 + 860602786);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 58) {
                if (class31.field377 == 0) {
                    class121.field2015 = class142.field2493;
                } else {
                    class121.field2015 = class112.field1815.method751((byte) -105);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 137) {
                class163.field2803 = 0;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 142) {
                int var35 = class112.field1815.method731(false);
                int var36 = class112.field1815.method758(true);
                int var37 = class112.field1815.method772((byte) -50);
                class222 var38 = class229.field3898[var35];
                if (var38 != null) {
                    class51.method356(var36, 53, var38, var37);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 65) {
                int var39 = class112.field1815.method766(arg0 ^ 0x5674);
                int var40 = class112.field1815.method765((byte) -97);
                class251.method1647((byte) 12, var39, var40);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 117) {
                byte[] var41 = new byte[class31.field377];
                class112.field1815.method670(class31.field377, 88, var41, 0);
                class93.method616(true, 4, class119.method812((byte) -106, class31.field377, 0, var41));
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 195) {
                class251.method1654(false);
                class165.field2809 = class112.field1815.method740(16711680);
                class202.field3482 = class205.field3566;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 107) {
                int var42 = class112.field1815.method758(true);
                int var43 = var42 >> 6;
                class246 var44 = new class246();
                var44.field4269 = var42 & 0x3F;
                var44.field4259 = class112.field1815.method758(true);
                if (var44.field4259 >= 0 && var44.field4259 < class87.field1356.length) {
                    if (var44.field4269 == 1 || var44.field4269 == 10) {
                        var44.field4260 = class112.field1815.method731(false);
                        class112.field1815.field1821 += 3;
                    } else if (var44.field4269 >= 2 && var44.field4269 <= 6) {
                        if (var44.field4269 == 2) {
                            var44.field4257 = 64;
                            var44.field4271 = 64;
                        }
                        if (var44.field4269 == 3) {
                            var44.field4257 = 0;
                            var44.field4271 = 64;
                        }
                        if (var44.field4269 == 4) {
                            var44.field4257 = 128;
                            var44.field4271 = 64;
                        }
                        if (var44.field4269 == 5) {
                            var44.field4257 = 64;
                            var44.field4271 = 0;
                        }
                        if (var44.field4269 == 6) {
                            var44.field4257 = 64;
                            var44.field4271 = 128;
                        }
                        var44.field4269 = 2;
                        var44.field4264 = class112.field1815.method731(false);
                        var44.field4262 = class112.field1815.method731(false);
                        var44.field4270 = class112.field1815.method758(true);
                    }
                    var44.field4272 = class112.field1815.method731(false);
                    if (var44.field4272 == 65535) {
                        var44.field4272 = -1;
                    }
                    class44.field579[var43] = var44;
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 218) {
                int var45 = class112.field1815.method728((byte) 107);
                int var46 = class112.field1815.method731(false);
                int var47 = class112.field1815.method765((byte) -118);
                class44.method294(63, var45);
                class85.method568(var47, true, var46);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 224) {
                class150.field2606 = class112.field1815.method778(arg0 ^ 0xA2);
                class185.field3260 = class112.field1815.method743(arg0 ^ 0xFFFF870B);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 3) {
                int var48 = class112.field1815.method758(true);
                int var49 = class112.field1815.method758(true);
                int var50 = class112.field1815.method758(true);
                int var51 = class112.field1815.method758(true);
                int var52 = class112.field1815.method731(false);
                class138.field2432[var48] = true;
                class60.field827[var48] = var49;
                class80.field1212[var48] = var50;
                class243.field4220[var48] = var51;
                class204.field3546[var48] = var52;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 55) {
                class241.method1571(class112.field1815, (byte) -89);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 204) {
                class168 var53 = class112.field1815.method751((byte) -111);
                if (var53.method1077(-91, class252.field4358)) {
                    class168 var54 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var55 = var54.method1084(32383);
                    boolean var57 = false;
                    for (int var58 = 0; var58 < class173.field3024; var58++) {
                        if (class150.field2626[var58] == var55) {
                            var57 = true;
                            break;
                        }
                    }
                    if (!var57 && class129.field2159 == 0) {
                        class229.method1475(var54, class256.field4485, arg0 - 35, 4);
                    }
                } else if (var53.method1077(arg0 ^ 0xFFFFFF87, client.field533)) {
                    class168 var82 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var83 = var82.method1084(arg0 ^ 0x7E5D);
                    boolean var85 = false;
                    for (int var86 = 0; var86 < class173.field3024; var86++) {
                        if (class150.field2626[var86] == var83) {
                            var85 = true;
                            break;
                        }
                    }
                    if (!var85 && class129.field2159 == 0) {
                        class168 var87 = var53.method1078(var53.method1104(class74.field1130, true) + 1, (byte) -75, var53.method1109((byte) 110) - 9);
                        class229.method1475(var82, var87, arg0 - 35, 8);
                    }
                } else if (var53.method1077(-91, class200.field3455)) {
                    class168 var77 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var78 = var77.method1084(32383);
                    boolean var80 = false;
                    for (int var81 = 0; var81 < class173.field3024; var81++) {
                        if (class150.field2626[var81] == var78) {
                            var80 = true;
                            break;
                        }
                    }
                    if (!var80 && class129.field2159 == 0) {
                        class229.method1475(var77, class222.field3816, -1, 10);
                    }
                } else if (var53.method1077(-91, class169.field2955)) {
                    class168 var76 = var53.method1078(0, (byte) -75, var53.method1104(class169.field2955, true));
                    class229.method1475(class222.field3816, var76, -1, 11);
                } else if (var53.method1077(arg0 ^ 0xFFFFFF87, class26.field314)) {
                    class168 var75 = var53.method1078(0, (byte) -75, var53.method1104(class26.field314, true));
                    if (class129.field2159 == 0) {
                        class229.method1475(class222.field3816, var75, -1, 12);
                    }
                } else if (var53.method1077(-91, class103.field1663)) {
                    class168 var74 = var53.method1078(0, (byte) -75, var53.method1104(class103.field1663, true));
                    if (class129.field2159 == 0) {
                        class229.method1475(class222.field3816, var74, -1, 13);
                    }
                } else if (var53.method1077(-91, class200.field3449)) {
                    class168 var69 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var70 = var69.method1084(32383);
                    boolean var72 = false;
                    for (int var73 = 0; var73 < class173.field3024; var73++) {
                        if (class150.field2626[var73] == var70) {
                            var72 = true;
                            break;
                        }
                    }
                    if (!var72 && class129.field2159 == 0) {
                        class229.method1475(var69, class222.field3816, arg0 ^ 0xFFFFFFDD, 14);
                    }
                } else if (var53.method1077(-91, class233.field3962)) {
                    boolean var64 = false;
                    class168 var65 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var66 = var65.method1084(arg0 ^ 0x7E5D);
                    for (int var68 = 0; var68 < class173.field3024; var68++) {
                        if (class150.field2626[var68] == var66) {
                            var64 = true;
                            break;
                        }
                    }
                    if (!var64 && class129.field2159 == 0) {
                        class229.method1475(var65, class222.field3816, -1, 15);
                    }
                } else if (var53.method1077(arg0 ^ 0xFFFFFF87, class61.field840)) {
                    class168 var59 = var53.method1078(0, (byte) -75, var53.method1104(class74.field1130, true));
                    long var60 = var59.method1084(32383);
                    boolean var62 = false;
                    for (int var63 = 0; var63 < class173.field3024; var63++) {
                        if (class150.field2626[var63] == var60) {
                            var62 = true;
                            break;
                        }
                    }
                    if (!var62 && class129.field2159 == 0) {
                        class229.method1475(var59, class222.field3816, -1, 16);
                    }
                } else {
                    class229.method1475(class222.field3816, var53, -1, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 157) {
                class186.method1212((byte) -93);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 226) {
                for (int var88 = 0; var88 < class104.field1677.length; var88++) {
                    if (class104.field1677[var88] != null) {
                        class104.field1677[var88].field216 = -1;
                    }
                }
                for (int var89 = 0; var89 < class229.field3898.length; var89++) {
                    if (class229.field3898[var89] != null) {
                        class229.field3898[var89].field216 = -1;
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 188) {
                int var90 = class112.field1815.method765((byte) -106);
                class129 var91 = class257.method1713(var90, 126);
                for (int var92 = 0; var92 < var91.field2156.length; var92++) {
                    var91.field2156[var92] = -1;
                    var91.field2156[var92] = 0;
                }
                class65.method443(var91, 0);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 177) {
                int var93 = class112.field1815.method769((byte) -86);
                int var94 = class112.field1815.method772((byte) -50);
                class211.method1363(true, var94, var93);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 97) {
                class251.method1654(false);
                class2.field21 = class112.field1815.method758(true);
                class202.field3482 = class205.field3566;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 52) {
                int var95 = class112.field1815.method731(false);
                if (var95 == 65535) {
                    var95 = -1;
                }
                int var96 = class112.field1815.method758(true);
                int var97 = class112.field1815.method731(false);
                class114.method788(var96, var97, var95, arg0 ^ 0x57);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 179) {
                int var98 = class112.field1815.method769((byte) -86);
                int var99 = class112.field1815.method761((byte) 11);
                int var100 = class112.field1815.method723(4915);
                class129 var101 = class257.method1713(var98, 126);
                var101.field2278 = 0;
                var101.field2167 = 0;
                var101.field2231 = var101.field2200 = var100;
                var101.field2139 = var101.field2254 = var99;
                class65.method443(var101, 0);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 25) {
                class196.method1263(class31.field377, class205.field3559, -45, class112.field1815);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 17) {
                int var102 = class112.field1815.method762(false);
                int var103 = class112.field1815.method766(22102);
                int var104 = class112.field1815.method767(120);
                class114 var105 = (class114) class176.field3079.method1527((long) var104, (byte) -52);
                if (var105 != null) {
                    class158.method1032(var105, (byte) -128, var105.field1853 != var103);
                }
                class121.method824(var103, (byte) -37, var104, var102);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 102) {
                int var106 = class112.field1815.method731(false);
                if (var106 == 65535) {
                    var106 = -1;
                }
                class127.method862(0, var106);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 156) {
                int var107 = class112.field1815.method774(arg0 + 3791);
                int var108 = class112.field1815.method766(22102);
                if (var108 == 65535) {
                    var108 = -1;
                }
                class27.method180((byte) 79, var108, var107);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 151) {
                int var109 = class112.field1815.method728((byte) 92);
                if (var109 == 65535) {
                    var109 = -1;
                }
                int var110 = class112.field1815.method769((byte) -86);
                int var111 = class112.field1815.method728((byte) -110);
                if (var111 == 65535) {
                    var111 = -1;
                }
                int var112 = class112.field1815.method767(97);
                for (int var113 = var109; var113 <= var111; var113++) {
                    long var114 = ((long) var110 << 32) + (long) var113;
                    class190 var116 = class70.field1040.method1527(var114, (byte) -87);
                    if (var116 != null) {
                        var116.method1234(17216);
                    }
                    class70.field1040.method1533(var114, arg0 - 141, new class172(var112));
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 77) {
                class80.method530(false, 17703);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 71) {
                int var117 = class112.field1815.method731(false);
                int var118 = class112.field1815.method730((byte) 89);
                class129 var119 = class257.method1713(var118, 127);
                if (var117 == 65535) {
                    var117 = -1;
                }
                if (var119.field2180 != 2 || var119.field2259 != var117) {
                    var119.field2259 = var117;
                    var119.field2180 = 2;
                    class65.method443(var119, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 60) {
                long var120 = class112.field1815.method759(arg0 + 71);
                long var122 = (long) class112.field1815.method731(false);
                long var124 = (long) class112.field1815.method727(-27619);
                boolean var126 = false;
                long var127 = (var122 << 32) + var124;
                int var129 = class112.field1815.method758(true);
                int var130 = class112.field1815.method731(false);
                int var131 = 0;
                label1146: while (true) {
                    if (var131 >= 100) {
                        if (var129 <= 1) {
                            for (int var132 = 0; var132 < class173.field3024; var132++) {
                                if (class150.field2626[var132] == var120) {
                                    var126 = true;
                                    break label1146;
                                }
                            }
                        }
                        break;
                    }
                    if (class202.field3509[var131] == var127) {
                        var126 = true;
                        break;
                    }
                    var131++;
                }
                if (!var126 && class129.field2159 == 0) {
                    class202.field3509[class257.field4487] = var127;
                    class257.field4487 = (class257.field4487 + 1) % 100;
                    class168 var133 = class120.method821(var130, 123).method1481((byte) -114, class112.field1815);
                    if (var129 == 2) {
                        class94.method626(class50.method347(2, new class168[] { class163.field2796, class80.method532(var120, (byte) -99).method1116(0) }), (byte) 108, null, 18, var130, var133);
                    } else if (var129 == 1) {
                        class94.method626(class50.method347(2, new class168[] { class116.field1896, class80.method532(var120, (byte) 64).method1116(arg0 ^ 0x22) }), (byte) 79, null, 18, var130, var133);
                    } else {
                        class94.method626(class80.method532(var120, (byte) -89).method1116(arg0 ^ 0x22), (byte) 81, null, 18, var130, var133);
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 241) {
                int var134 = class112.field1815.method772((byte) -50);
                int var135 = class112.field1815.method778(128);
                if (var135 == 2) {
                    class157.method1028((byte) 4);
                }
                class137.field2426 = var134;
                class46.method301(var134, (byte) 118);
                class4.method25(false, 121);
                class126.method860((byte) -114, class137.field2426);
                for (int var136 = 0; var136 < 100; var136++) {
                    class194.field3372[var136] = true;
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 181) {
                int var137 = class112.field1815.method765((byte) -95);
                int var138 = class112.field1815.method731(false);
                int var139 = var138 >> 10 & 0x1F;
                int var140 = var138 >> 5 & 0x1F;
                int var141 = var138 & 0x1F;
                class129 var142 = class257.method1713(var137, 127);
                int var143 = (var141 << 3) + ((var139 << 19) + (var140 << 11));
                if (var142.field2137 != var143) {
                    var142.field2137 = var143;
                    class65.method443(var142, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 250) {
                int var144 = class112.field1815.method769((byte) -86);
                class114 var145 = (class114) class176.field3079.method1527((long) var144, (byte) -82);
                if (var145 != null) {
                    class158.method1032(var145, (byte) -127, true);
                }
                if (class211.field3644 != null) {
                    class65.method443(class211.field3644, arg0 - 34);
                    class211.field3644 = null;
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 243) {
                int var146 = class112.field1815.method769((byte) -86);
                int var147 = class112.field1815.method769((byte) -86);
                class114 var148 = (class114) class176.field3079.method1527((long) var146, (byte) -97);
                class114 var149 = (class114) class176.field3079.method1527((long) var147, (byte) -99);
                if (var149 != null) {
                    class158.method1032(var149, (byte) -128, var148 == null || var148.field1853 != var149.field1853);
                }
                if (var148 != null) {
                    var148.method1234(17216);
                    class176.field3079.method1533((long) var147, -6, var148);
                }
                class129 var150 = class257.method1713(var146, 127);
                if (var150 != null) {
                    class65.method443(var150, 0);
                }
                class129 var151 = class257.method1713(var147, arg0 + 92);
                if (var151 != null) {
                    class65.method443(var151, 0);
                    class149.method993(10218, true, var151);
                }
                if (class137.field2426 != -1) {
                    class87.method575((byte) -23, class137.field2426, 1);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 185) {
                int var152 = class112.field1815.method758(true);
                if (class112.field1815.method758(true) == 0) {
                    class162.field2786[var152] = new class119();
                } else {
                    class112.field1815.field1821--;
                    class162.field2786[var152] = new class119(class112.field1815);
                }
                class108.field1740 = -1;
                class96.field1522 = class205.field3566;
                return true;
            } else if (class108.field1740 == 100) {
                int var153 = class112.field1815.method728((byte) 89);
                int var154 = class112.field1815.method728((byte) -114);
                int var155 = class112.field1815.method765((byte) -76);
                int var156 = class112.field1815.method772((byte) -50);
                if (var155 >> 30 != 0) {
                    int var157 = var155 >> 28 & 0x3;
                    int var158 = (var155 >> 14 & 0x3FFF) - class246.field4261;
                    int var159 = (var155 & 0x3FFF) - class125.field2060;
                    if (var158 >= 0 && var159 >= 0 && var158 < 104 && var159 < 104) {
                        int var160 = var158 * 128 + 64;
                        int var161 = var159 * 128 + 64;
                        class154 var162 = new class154(var156, var157, var160, var161, class236.method1535(var160, var157, var161, 0) - var153, var154, class133.field2326);
                        class229.field3896.method311((byte) 16, new class157(var162));
                    }
                } else if (var155 >> 29 != 0) {
                    int var163 = var155 & 0xFFFF;
                    class222 var164 = class229.field3898[var163];
                    if (var164 != null) {
                        var164.field198 = var156;
                        var164.field183 = 0;
                        var164.field217 = 0;
                        var164.field218 = var153;
                        var164.field156 = class133.field2326 + var154;
                        if (var164.field198 == 65535) {
                            var164.field198 = -1;
                        }
                        if (var164.field156 > class133.field2326) {
                            var164.field183 = -1;
                        }
                    }
                } else if (var155 >> 28 != 0) {
                    int var165 = var155 & 0xFFFF;
                    class121 var166;
                    if (class81.field1233 == var165) {
                        var166 = class7.field85;
                    } else {
                        var166 = class104.field1677[var165];
                    }
                    if (var166 != null) {
                        var166.field218 = var153;
                        var166.field183 = 0;
                        var166.field217 = 0;
                        var166.field198 = var156;
                        var166.field156 = class133.field2326 + var154;
                        if (class133.field2326 < var166.field156) {
                            var166.field183 = -1;
                        }
                        if (var166.field198 == 65535) {
                            var166.field198 = -1;
                        }
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 95) {
                int var167 = class112.field1815.method766(22102);
                int var168 = class112.field1815.method772((byte) -50);
                int var169 = class112.field1815.method772((byte) -50);
                int var170 = class112.field1815.method769((byte) -86);
                class129 var171 = class257.method1713(var170, 126);
                if (var171.field2124 != var169 || var171.field2186 != var168 || var171.field2154 != var167) {
                    var171.field2154 = var167;
                    var171.field2186 = var168;
                    var171.field2124 = var169;
                    class65.method443(var171, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 144) {
                int var172 = class112.field1815.method758(true);
                class168 var173 = class112.field1815.method751((byte) -96);
                int var174 = class112.field1815.method762(false);
                if (var172 >= 1 && var172 <= 8) {
                    if (var173.method1106(arg0 ^ 0xFFFFFF83, class150.field2617)) {
                        var173 = null;
                    }
                    class97.field1530[var172 - 1] = var173;
                    class189.field3301[var172 - 1] = var174 == 0;
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 242) {
                long var175 = class112.field1815.method759(41);
                long var177 = (long) class112.field1815.method731(false);
                long var179 = (long) class112.field1815.method727(-27619);
                int var181 = class112.field1815.method758(true);
                long var182 = (var177 << 32) + var179;
                boolean var184 = false;
                int var185 = 0;
                label1198: while (true) {
                    if (var185 >= 100) {
                        if (var181 <= 1) {
                            if (class17.field155 == 1 || class95.field1501 == 1) {
                                var184 = true;
                            } else {
                                for (int var186 = 0; var186 < class173.field3024; var186++) {
                                    if (class150.field2626[var186] == var175) {
                                        var184 = true;
                                        break label1198;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class202.field3509[var185] == var182) {
                        var184 = true;
                        break;
                    }
                    var185++;
                }
                if (!var184 && class129.field2159 == 0) {
                    class202.field3509[class257.field4487] = var182;
                    class257.field4487 = (class257.field4487 + 1) % 100;
                    class168 var187 = class136.method933(class47.method319(32767, class112.field1815).method1103(false));
                    if (var181 == 2 || var181 == 3) {
                        class229.method1475(class50.method347(2, new class168[] { class163.field2796, class80.method532(var175, (byte) -88).method1116(0) }), var187, -1, 7);
                    } else if (var181 == 1) {
                        class229.method1475(class50.method347(2, new class168[] { class116.field1896, class80.method532(var175, (byte) -89).method1116(arg0 ^ 0x22) }), var187, arg0 - 35, 7);
                    } else {
                        class229.method1475(class80.method532(var175, (byte) 105).method1116(0), var187, -1, 3);
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 200) {
                int var188 = class112.field1815.method762(false);
                int var189 = class112.field1815.method762(false);
                int var190 = class112.field1815.method743(-30935);
                class196.field3401 = var189 >> 1;
                class7.field85.method91(var188, -105, var190, (var189 & 0x1) == 1);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 248) {
                int var191 = class112.field1815.field1821 + class31.field377;
                int var192 = class112.field1815.method731(false);
                int var193 = class112.field1815.method731(false);
                if (class137.field2426 != var192) {
                    class137.field2426 = var192;
                    class46.method301(class137.field2426, (byte) 104);
                    class4.method25(false, -87);
                    class126.method860((byte) 7, class137.field2426);
                    for (int var194 = 0; var194 < 100; var194++) {
                        class194.field3372[var194] = true;
                    }
                }
                while (var193-- > 0) {
                    int var203 = class112.field1815.method769((byte) -86);
                    int var204 = class112.field1815.method731(false);
                    int var205 = class112.field1815.method758(true);
                    class114 var206 = (class114) class176.field3079.method1527((long) var203, (byte) -113);
                    if (var206 != null && var206.field1853 != var204) {
                        class158.method1032(var206, (byte) -128, true);
                        var206 = null;
                    }
                    if (var206 == null) {
                        var206 = class121.method824(var204, (byte) -37, var203, var205);
                    }
                    var206.field1859 = true;
                }
                for (class114 var195 = (class114) class176.field3079.method1536(58); var195 != null; var195 = (class114) class176.field3079.method1534(-21389)) {
                    if (var195.field1859) {
                        var195.field1859 = false;
                    } else {
                        class158.method1032(var195, (byte) -127, true);
                    }
                }
                class70.field1040.method1530(-1);
                while (var191 > class112.field1815.field1821) {
                    int var196 = class112.field1815.method769((byte) -86);
                    int var197 = class112.field1815.method731(false);
                    int var198 = class112.field1815.method731(false);
                    int var199 = class112.field1815.method769((byte) -86);
                    for (int var200 = var197; var200 <= var198; var200++) {
                        long var201 = ((long) var196 << 32) + (long) var200;
                        class70.field1040.method1533(var201, 73, new class172(var199));
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 147) {
                long var207 = class112.field1815.method759(51);
                int var209 = class112.field1815.method731(false);
                class168 var210 = class120.method821(var209, 114).method1481((byte) -122, class112.field1815);
                class94.method626(class80.method532(var207, (byte) -118).method1116(arg0 ^ 0x22), (byte) 94, null, 19, var209, var210);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 119) {
                for (int var211 = 0; var211 < class92.field1441.length; var211++) {
                    if (class92.field1441[var211] != class50.field682[var211]) {
                        class92.field1441[var211] = class50.field682[var211];
                        class19.method100(var211, 127);
                        class109.field1750[class86.method571(31, class79.field1191++)] = var211;
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 15) {
                class32.field396 = class205.field3566;
                long var212 = class112.field1815.method759(99);
                if (var212 == 0L) {
                    class108.field1740 = -1;
                    class154.field2690 = null;
                    class104.field1672 = null;
                    class25.field304 = null;
                    class83.field1269 = 0;
                    return true;
                }
                long var214 = class112.field1815.method759(26);
                class25.field304 = class80.method532(var214, (byte) 54);
                class104.field1672 = class80.method532(var212, (byte) 53);
                class204.field3557 = class112.field1815.method750(arg0 ^ 0xFFFFFFAF);
                int var216 = class112.field1815.method758(true);
                if (var216 == 255) {
                    class108.field1740 = -1;
                    return true;
                }
                class83.field1269 = var216;
                class54[] var217 = new class54[100];
                for (int var218 = 0; var218 < class83.field1269; var218++) {
                    var217[var218] = new class54();
                    var217[var218].field3308 = class112.field1815.method759(40);
                    var217[var218].field740 = class80.method532(var217[var218].field3308, (byte) -113);
                    var217[var218].field743 = class112.field1815.method731(false);
                    var217[var218].field739 = class112.field1815.method750(arg0 - 158);
                    var217[var218].field745 = class112.field1815.method751((byte) -76);
                    if (class204.field3556 == var217[var218].field3308) {
                        class106.field1695 = var217[var218].field739;
                    }
                }
                boolean var219 = false;
                int var220 = class83.field1269;
                while (var220 > 0) {
                    var220--;
                    boolean var221 = true;
                    for (int var222 = 0; var222 < var220; var222++) {
                        if (var217[var222].field740.method1115(var217[var222 + 1].field740, 113) > 0) {
                            var221 = false;
                            class54 var223 = var217[var222];
                            var217[var222] = var217[var222 + 1];
                            var217[var222 + 1] = var223;
                        }
                    }
                    if (var221) {
                        break;
                    }
                }
                class154.field2690 = var217;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 30) {
                long var224 = class112.field1815.method759(86);
                class112.field1815.method750(91);
                long var226 = class112.field1815.method759(106);
                long var228 = (long) class112.field1815.method731(false);
                long var230 = (long) class112.field1815.method727(-27619);
                long var232 = (var228 << 32) + var230;
                int var234 = class112.field1815.method758(true);
                int var235 = class112.field1815.method731(false);
                boolean var236 = false;
                int var237 = 0;
                label1269: while (true) {
                    if (var237 >= 100) {
                        if (var234 <= 1) {
                            for (int var238 = 0; var238 < class173.field3024; var238++) {
                                if (class150.field2626[var238] == var224) {
                                    var236 = true;
                                    break label1269;
                                }
                            }
                        }
                        break;
                    }
                    if (class202.field3509[var237] == var232) {
                        var236 = true;
                        break;
                    }
                    var237++;
                }
                if (!var236 && class129.field2159 == 0) {
                    class202.field3509[class257.field4487] = var232;
                    class257.field4487 = (class257.field4487 + 1) % 100;
                    class168 var239 = class120.method821(var235, 121).method1481((byte) -115, class112.field1815);
                    if (var234 == 2 || var234 == 3) {
                        class94.method626(class50.method347(arg0 - 32, new class168[] { class163.field2796, class80.method532(var224, (byte) -119).method1116(0) }), (byte) 104, class80.method532(var226, (byte) -72).method1116(0), 20, var235, var239);
                    } else if (var234 == 1) {
                        class94.method626(class50.method347(arg0 ^ 0x20, new class168[] { class116.field1896, class80.method532(var224, (byte) 41).method1116(0) }), (byte) 78, class80.method532(var226, (byte) -83).method1116(0), 20, var235, var239);
                    } else {
                        class94.method626(class80.method532(var224, (byte) -116).method1116(0), (byte) 127, class80.method532(var226, (byte) 97).method1116(0), 20, var235, var239);
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 19) {
                int var240 = class112.field1815.method772((byte) -50);
                int var241 = class112.field1815.method731(false);
                int var242 = class112.field1815.method762(false);
                class44.method294(63, var240);
                class85.method568(var242, true, var241);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 122) {
                int var243 = class112.field1815.method728((byte) -80);
                int var244 = class112.field1815.method772((byte) -50);
                class103.field1665 = var243;
                class71.field1093 = var244;
                class171.method1134(104);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 31) {
                int var245 = class112.field1815.method765((byte) -65);
                int var246 = class112.field1815.method740(16711680);
                class129 var247 = class257.method1713(var245, 126);
                if (var247.field2239 != var246 || var246 == -1) {
                    var247.field2172 = 0;
                    var247.field2239 = var246;
                    var247.field2229 = 0;
                    class65.method443(var247, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 123) {
                long var248 = class112.field1815.method759(122);
                class168 var250 = class136.method933(class47.method319(32767, class112.field1815).method1103(false));
                class229.method1475(class80.method532(var248, (byte) 117).method1116(arg0 - 34), var250, -1, 6);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 88) {
                class52.method364(1);
                class108.field1740 = -1;
                return false;
            } else if (class108.field1740 == 83) {
                class253.method1670(class112.field1815.method751((byte) -69), -26840);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 175) {
                int var251 = class112.field1815.method758(true);
                int var252 = class112.field1815.method758(true);
                int var253 = class112.field1815.method731(false);
                int var254 = class112.field1815.method758(true);
                int var255 = class112.field1815.method758(true);
                class169.method1126(var253, var251, arg0 - 33, var254, var252, var255);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 73) {
                int var256 = class112.field1815.method769((byte) -86);
                int var257 = class112.field1815.method731(false);
                if (var256 < -70000) {
                    var257 += 32768;
                }
                class129 var258;
                if (var256 < 0) {
                    var258 = null;
                } else {
                    var258 = class257.method1713(var256, arg0 ^ 0x5D);
                }
                if (var258 != null) {
                    for (int var259 = 0; var259 < var258.field2156.length; var259++) {
                        var258.field2156[var259] = 0;
                        var258.field2221[var259] = 0;
                    }
                }
                class59.method408(var257, (byte) 125);
                int var260 = class112.field1815.method731(false);
                for (int var261 = 0; var261 < var260; var261++) {
                    int var262 = class112.field1815.method743(-30935);
                    if (var262 == 255) {
                        var262 = class112.field1815.method730((byte) 97);
                    }
                    int var263 = class112.field1815.method766(22102);
                    if (var258 != null && var261 < var258.field2156.length) {
                        var258.field2156[var261] = var263;
                        var258.field2221[var261] = var262;
                    }
                    class9.method37(var261, var262, var257, var263 - 1, (byte) -59);
                }
                if (var258 != null) {
                    class65.method443(var258, arg0 - 34);
                }
                class251.method1654(false);
                class251.field4346[class86.method571(31, class101.field1609++)] = class86.method571(var257, 32767);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 225) {
                int var264 = class112.field1815.method769((byte) -86);
                class64.field899 = class205.field3559.method1557(var264, (byte) -88);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 161) {
                class80.method530(true, 17703);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 162) {
                int var265 = class112.field1815.method758(true);
                int var266 = class112.field1815.method758(true);
                int var267 = class112.field1815.method731(false);
                int var268 = class112.field1815.method758(true);
                int var269 = class112.field1815.method758(true);
                class155.method1021(var265, var268, arg0 + 31111, var266, var269, true, var267);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 138) {
                class55.method384(-94);
                class251.method1654(false);
                class79.field1191 += 32;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 145) {
                class109.method709(false);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 244) {
                long var270 = class112.field1815.method759(arg0 ^ 0x8);
                int var272 = class112.field1815.method731(false);
                byte var273 = class112.field1815.method750(-89);
                boolean var274 = false;
                if ((var270 & Long.MIN_VALUE) != 0L) {
                    var274 = true;
                }
                if (var274) {
                    if (class83.field1269 == 0) {
                        class108.field1740 = -1;
                        return true;
                    }
                    long var275 = var270 & Long.MAX_VALUE;
                    boolean var277 = false;
                    int var278;
                    for (var278 = 0; var278 < class83.field1269 && (class154.field2690[var278].field3308 != var275 || class154.field2690[var278].field743 != var272); var278++) {
                    }
                    if (var278 < class83.field1269) {
                        while (var278 < class83.field1269 - 1) {
                            class154.field2690[var278] = class154.field2690[var278 + 1];
                            var278++;
                        }
                        class83.field1269--;
                        class154.field2690[class83.field1269] = null;
                    }
                } else {
                    class168 var279 = class112.field1815.method751((byte) -70);
                    class54 var280 = new class54();
                    var280.field3308 = var270;
                    var280.field740 = class80.method532(var280.field3308, (byte) 61);
                    var280.field739 = var273;
                    var280.field743 = var272;
                    var280.field745 = var279;
                    int var281;
                    for (var281 = class83.field1269 - 1; var281 >= 0; var281--) {
                        int var282 = class154.field2690[var281].field740.method1115(var280.field740, 101);
                        if (var282 == 0) {
                            class154.field2690[var281].field743 = var272;
                            class154.field2690[var281].field739 = var273;
                            class154.field2690[var281].field745 = var279;
                            class108.field1740 = -1;
                            class32.field396 = class205.field3566;
                            if (class204.field3556 == var270) {
                                class106.field1695 = var273;
                            }
                            return true;
                        }
                        if (var282 < 0) {
                            break;
                        }
                    }
                    if (class83.field1269 >= class154.field2690.length) {
                        class108.field1740 = -1;
                        return true;
                    }
                    for (int var283 = class83.field1269 - 1; var283 > var281; var283--) {
                        class154.field2690[var283 + 1] = class154.field2690[var283];
                    }
                    if (class83.field1269 == 0) {
                        class154.field2690 = new class54[100];
                    }
                    class154.field2690[var281 + 1] = var280;
                    if (class204.field3556 == var270) {
                        class106.field1695 = var273;
                    }
                    class83.field1269++;
                }
                class108.field1740 = -1;
                class32.field396 = class205.field3566;
                return true;
            } else if (class108.field1740 == 249) {
                int var284 = class112.field1815.method769((byte) -86);
                int var285 = class112.field1815.method731(false);
                if (var284 < -70000) {
                    var285 += 32768;
                }
                class129 var286;
                if (var284 >= 0) {
                    var286 = class257.method1713(var284, 126);
                } else {
                    var286 = null;
                }
                while (class31.field377 > class112.field1815.field1821) {
                    int var287 = class112.field1815.method747((byte) -125);
                    int var288 = class112.field1815.method731(false);
                    int var289 = 0;
                    if (var288 != 0) {
                        var289 = class112.field1815.method758(true);
                        if (var289 == 255) {
                            var289 = class112.field1815.method769((byte) -86);
                        }
                    }
                    if (var286 != null && var287 >= 0 && var287 < var286.field2156.length) {
                        var286.field2156[var287] = var288;
                        var286.field2221[var287] = var289;
                    }
                    class9.method37(var287, var289, var285, var288 - 1, (byte) -59);
                }
                if (var286 != null) {
                    class65.method443(var286, 0);
                }
                class251.method1654(false);
                class251.field4346[class86.method571(31, class101.field1609++)] = class86.method571(var285, 32767);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 143) {
                if (class137.field2426 != -1) {
                    class87.method575((byte) -23, class137.field2426, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 216) {
                int var290 = class112.field1815.method762(false);
                int var291 = class112.field1815.method772((byte) -50);
                class211.method1363(true, var291, var290);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 69) {
                int var292 = class112.field1815.method765((byte) -80);
                class129 var293 = class257.method1713(var292, 126);
                var293.field2180 = 3;
                var293.field2259 = class7.field85.field2001.method954((byte) 127);
                class65.method443(var293, 0);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 98) {
                int var294 = class112.field1815.method772((byte) -50);
                int var295 = class112.field1815.method730((byte) 65);
                int var296 = class112.field1815.method728((byte) -90);
                class129 var297 = class257.method1713(var295, 127);
                class108.field1740 = -1;
                var297.field2181 = (var296 << 16) + var294;
                return true;
            } else if (class108.field1740 == 91) {
                boolean var298 = class112.field1815.method743(-30935) == 1;
                int var299 = class112.field1815.method767(arg0 - 158);
                class129 var300 = class257.method1713(var299, arg0 + 92);
                if (var300.field2289 != var298) {
                    var300.field2289 = var298;
                    class65.method443(var300, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 150) {
                int var301 = class112.field1815.method769((byte) -86);
                class168 var302 = class112.field1815.method751((byte) -122);
                class129 var303 = class257.method1713(var301, arg0 + 93);
                if (!var302.method1111(93, var303.field2164)) {
                    var303.field2164 = var302;
                    class65.method443(var303, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 29) {
                class242.field4198 = class112.field1815.method758(true);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 84) {
                class92.method609(true);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 45) {
                int var304 = class112.field1815.method766(22102);
                class168 var305 = class112.field1815.method751((byte) -74);
                int var306 = class112.field1815.method766(22102);
                class44.method294(63, var306);
                class197.method1268(false, var304, var305);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 191) {
                int var307 = class112.field1815.method772((byte) -50);
                if (var307 == 65535) {
                    var307 = -1;
                }
                int var308 = class112.field1815.method769((byte) -86);
                class129 var309 = class257.method1713(var308, 127);
                if (var309.field2180 != 1 || var309.field2259 != var307) {
                    var309.field2180 = 1;
                    var309.field2259 = var307;
                    class65.method443(var309, 0);
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 228) {
                class251.method1654(false);
                int var310 = class112.field1815.method758(true);
                int var311 = class112.field1815.method769((byte) -86);
                int var312 = class112.field1815.method762(false);
                class179.field3154[var312] = var311;
                class173.field3011[var312] = var310;
                class177.field3119[var312] = 1;
                for (int var313 = 0; var313 < 98; var313++) {
                    if (var311 >= class243.field4216[var313]) {
                        class177.field3119[var312] = var313 + 2;
                    }
                }
                class202.field3489[class86.method571(class194.field3389++, 31)] = var312;
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 76) {
                class21.field251 = class112.field1815.method758(true);
                class108.field1734 = class112.field1815.method758(true);
                class241.field4120 = class112.field1815.method758(true);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 231) {
                int var314 = class112.field1815.method728((byte) 106);
                class99.method652(var314, -128);
                class251.field4346[class86.method571(class101.field1609++, 31)] = class86.method571(var314, 32767);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 165) {
                byte var315 = class112.field1815.method746(-7506);
                int var316 = class112.field1815.method772((byte) -50);
                class251.method1647((byte) 12, var316, var315);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 174) {
                int var317 = class112.field1815.method769((byte) -86);
                int var318 = var317 >> 28 & 0x3;
                int var319 = var317 >> 14 & 0x3FFF;
                int var320 = var317 & 0x3FFF;
                int var321 = class112.field1815.method743(-30935);
                int var322 = var321 >> 2;
                int var323 = var321 & 0x3;
                int var324 = class137.field2422[var322];
                int var325 = class112.field1815.method728((byte) 51);
                if (var325 == 65535) {
                    var325 = -1;
                }
                int var326 = var320 - class125.field2060;
                int var327 = var319 - class246.field4261;
                class13.method50(var325, var324, var323, var326, Integer.MAX_VALUE, var318, var327, var322);
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 116) {
                int var328 = class112.field1815.method772((byte) -50);
                int var329 = class112.field1815.method765((byte) -90);
                class129 var330 = class257.method1713(var329, 126);
                if (var330 != null && var330.field2230 == 0) {
                    if (var330.field2291 - var330.field2210 < var328) {
                        var328 = var330.field2291 - var330.field2210;
                    }
                    if (var328 < 0) {
                        var328 = 0;
                    }
                    if (var330.field2224 != var328) {
                        var330.field2224 = var328;
                        class65.method443(var330, arg0 ^ 0x22);
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 7) {
                class185.field3260 = class112.field1815.method758(true);
                class150.field2606 = class112.field1815.method778(128);
                for (int var331 = class150.field2606; var331 < class150.field2606 + 8; var331++) {
                    for (int var333 = class185.field3260; var333 < class185.field3260 + 8; var333++) {
                        if (class77.field1158[class196.field3401][var331][var333] != null) {
                            class77.field1158[class196.field3401][var331][var333] = null;
                            class158.method1037(var333, true, var331);
                        }
                    }
                }
                for (class23 var332 = (class23) class194.field3386.method315(-31594); var332 != null; var332 = (class23) class194.field3386.method312(1012)) {
                    if (class150.field2606 <= var332.field270 && var332.field270 < class150.field2606 + 8 && var332.field260 >= class185.field3260 && class185.field3260 + 8 > var332.field260 && class196.field3401 == var332.field259) {
                        var332.field261 = 0;
                    }
                }
                class108.field1740 = -1;
                return true;
            } else if (class108.field1740 == 246) {
                long var334 = class112.field1815.method759(58);
                class112.field1815.method750(-116);
                long var336 = class112.field1815.method759(81);
                long var338 = (long) class112.field1815.method731(false);
                long var340 = (long) class112.field1815.method727(-27619);
                long var342 = (var338 << 32) + var340;
                int var344 = class112.field1815.method758(true);
                boolean var345 = false;
                int var346 = 0;
                label1461: while (true) {
                    if (var346 >= 100) {
                        if (var344 <= 1) {
                            if (class17.field155 == 1 || class95.field1501 == 1) {
                                var345 = true;
                            } else {
                                for (int var347 = 0; var347 < class173.field3024; var347++) {
                                    if (class150.field2626[var347] == var334) {
                                        var345 = true;
                                        break label1461;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class202.field3509[var346] == var342) {
                        var345 = true;
                        break;
                    }
                    var346++;
                }
                if (!var345 && class129.field2159 == 0) {
                    class202.field3509[class257.field4487] = var342;
                    class257.field4487 = (class257.field4487 + 1) % 100;
                    class168 var348 = class136.method933(class47.method319(32767, class112.field1815).method1103(false));
                    if (var344 == 2 || var344 == 3) {
                        class158.method1031(var348, class80.method532(var336, (byte) -92).method1116(0), class50.method347(arg0 ^ 0x20, new class168[] { class163.field2796, class80.method532(var334, (byte) -90).method1116(0) }), -1, 9);
                    } else if (var344 == 1) {
                        class158.method1031(var348, class80.method532(var336, (byte) -91).method1116(arg0 ^ 0x22), class50.method347(2, new class168[] { class116.field1896, class80.method532(var334, (byte) 124).method1116(0) }), -1, 9);
                    } else {
                        class158.method1031(var348, class80.method532(var336, (byte) 120).method1116(arg0 - 34), class80.method532(var334, (byte) 90).method1116(0), -1, 9);
                    }
                }
                class108.field1740 = -1;
                return true;
            } else {
                class112.method763(null, "T1 - " + class108.field1740 + "," + class36.field452 + "," + class209.field3630 + " - " + class31.field377, arg0 ^ 0x49);
                class52.method364(1);
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lgj;Ljava/net/URL;)V")
    public class192(class239 arg0, URL arg1) {
        this.field3363 = arg0.method1564(arg1, (byte) 125);
        this.field3347 = 0;
        this.field3352 = class59.method407(-107) + 30000L;
    }
}
