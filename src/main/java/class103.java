import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class103 extends class50 {

    @OriginalMember(owner = "client!qc", name = "Pc", descriptor = "I")
    public int field2303 = 0;

    @OriginalMember(owner = "client!qc", name = "Qc", descriptor = "I")
    public int field2304 = 0;

    @OriginalMember(owner = "client!qc", name = "gd", descriptor = "I")
    public int field2320 = 0;

    @OriginalMember(owner = "client!qc", name = "Zc", descriptor = "I")
    public int field2313 = 0;

    @OriginalMember(owner = "client!qc", name = "fd", descriptor = "I")
    public int field2319 = -1;

    @OriginalMember(owner = "client!qc", name = "ld", descriptor = "I")
    public int field2325 = 0;

    @OriginalMember(owner = "client!qc", name = "od", descriptor = "Z")
    public boolean field2328 = false;

    @OriginalMember(owner = "client!qc", name = "jd", descriptor = "I")
    public int field2323 = -1;

    @OriginalMember(owner = "client!qc", name = "Xc", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!qc", name = "Nc", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!qc", name = "kd", descriptor = "Lkc;")
    public static class67 field2324 = class19.method144("und haben es deaktiviert)3 Benutzen Sie die", 84);

    @OriginalMember(owner = "client!qc", name = "qd", descriptor = "Lkc;")
    public static class67 field2330 = class19.method144("Duell akzeptieren", 88);

    @OriginalMember(owner = "client!qc", name = "Oc", descriptor = "Lgd;")
    public static class44 field2302 = new class44(64);

    @OriginalMember(owner = "client!qc", name = "vd", descriptor = "Lkc;")
    private static class67 field2335 = class19.method144("Add ignore", 75);

    @OriginalMember(owner = "client!qc", name = "xd", descriptor = "Lkc;")
    public static class67 field2337 = field2335;

    @OriginalMember(owner = "client!qc", name = "Rc", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!qc", name = "Sc", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!qc", name = "Tc", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!qc", name = "Uc", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!qc", name = "Vc", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!qc", name = "Yc", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!qc", name = "ad", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!qc", name = "bd", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!qc", name = "cd", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!qc", name = "hd", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!qc", name = "id", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!qc", name = "md", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!qc", name = "nd", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!qc", name = "rd", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!qc", name = "td", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!qc", name = "wd", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!qc", name = "sd", descriptor = "Lsa;")
    public static class113 field2332;

    @OriginalMember(owner = "client!qc", name = "ud", descriptor = "Lvc;")
    public class133 field2334;

    @OriginalMember(owner = "client!qc", name = "Wc", descriptor = "Lfd;")
    public class39 field2310;

    @OriginalMember(owner = "client!qc", name = "dd", descriptor = "Lab;")
    public static class3 field2317;

    @OriginalMember(owner = "client!qc", name = "ed", descriptor = "Lje;")
    public static class63 field2318;

    @OriginalMember(owner = "client!qc", name = "pd", descriptor = "Lkc;")
    public class67 field2329;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lwd;I)V", line = 3)
    public final void method785(class140 arg0, int arg1) {
        arg0.field3347 = 0;
        ++field2331;
        int var3 = arg1;
        int var4 = arg0.method1105(255);
        int[] var5 = new int[12];
        this.field2319 = arg0.method1112((byte) 120);
        this.field2323 = arg0.method1112((byte) 123);
        this.field2303 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method1105(255);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method1105(255);
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var3 = arg0.method1072(83);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class55.method440(var5[var6] + -512, arg1 + 21468).field3079;
                    if (var12 != 0) {
                        this.field2303 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method1105(255);
            if (var11 < 0 || ~var11 <= ~class78.field1855[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field1254 = arg0.method1072(arg1 ^ -87);
        if (super.field1254 == 65535) {
            super.field1254 = -1;
        }
        super.field1220 = arg0.method1072(arg1 + 93);
        if (super.field1220 == 65535) {
            super.field1220 = -1;
        }
        super.field1197 = super.field1220;
        super.field1237 = arg0.method1072(21);
        if (~super.field1237 == -65536) {
            super.field1237 = -1;
        }
        super.field1204 = arg0.method1072(arg1 ^ -79);
        if (~super.field1204 == -65536) {
            super.field1204 = -1;
        }
        super.field1231 = arg0.method1072(108);
        if (super.field1231 == 65535) {
            super.field1231 = -1;
        }
        super.field1221 = arg0.method1072(47);
        if (super.field1221 == 65535) {
            super.field1221 = -1;
        }
        super.field1196 = arg0.method1072(106);
        if (super.field1196 == 65535) {
            super.field1196 = -1;
        }
        this.field2329 = class137.method1065(arg0.method1095(-1952572256), (byte) 107).method528((byte) -26);
        this.field2320 = arg0.method1105(255);
        this.field2304 = arg0.method1072(arg1 ^ -114);
        if (this.field2334 == null) {
            this.field2334 = new class133();
        }
        this.field2334.method1021(var3, var4 == 1, 102, var5, var9);
    }

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)V", line = 124)
    public static final void method786(int arg0) {
        try {
            Graphics var1 = class129.field3020.getGraphics();
            class116.field2744.method162(-1, 553, var1, 205);
        } catch (Exception var2) {
            class129.field3020.repaint();
        }
        ++field2312;
        if (arg0 != 0) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(B)Z", line = 143)
    public final boolean method420(byte arg0) {
        ++field2307;
        if (this.field2334 == null) {
            return false;
        } else {
            if (arg0 != -120) {
                this.field2304 = -122;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(B)V", line = 164)
    public static final void method787(byte arg0) {
        class94.field2154 = null;
        ++field2315;
        if (arg0 != 39) {
            field2311 = -38;
        }
        class76.field1818 = null;
        class108.field2450 = null;
        class50.field1244 = null;
        class18.field343 = null;
        class25.field532 = null;
        class45.field1095 = null;
        class98.field2210 = null;
        class12.field282 = null;
        class132.field3144 = null;
        class133.field3157 = null;
        class29.field613 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lpc;BZ)V", line = 195)
    public static final void method788(class97 arg0, byte arg1, boolean arg2) {
        if (class98.field2213 != null) {
            try {
                class98.field2213.method751(-2);
            } catch (Exception var8) {
            }
            class98.field2213 = null;
        }
        class98.field2213 = arg0;
        ++field2321;
        class48.method396((byte) 75, arg2);
        if (arg1 > -78) {
            field2318 = null;
        }
        class67.field1585.field3347 = 0;
        class100.field2254 = null;
        class66.field1558 = 0;
        class20.field400 = null;
        while (true) {
            class11 var3 = (class11) class111.field2535.method467(0);
            if (var3 == null) {
                while (true) {
                    class11 var4 = (class11) class90.field2050.method467(0);
                    if (var4 == null) {
                        if (class100.field2249 != 0) {
                            try {
                                class140 var5 = new class140(4);
                                var5.method1115((byte) 49, 4);
                                var5.method1115((byte) 49, class100.field2249);
                                var5.method1079(-106701336, 0);
                                class98.field2213.method754(4, 32741, 0, var5.field3325);
                            } catch (IOException var7) {
                                try {
                                    class98.field2213.method751(-2);
                                } catch (Exception var6) {
                                }
                                class98.field2213 = null;
                                ++class29.field618;
                            }
                        }
                        class94.field2161 = 0;
                        class30.field644 = class82.method644(0);
                        return;
                    }
                    class42.field1029.method2(false, var4);
                    class75.field1782.method469(-1, var4.field22, var4);
                    --class77.field1836;
                    ++class52.field1276;
                }
            }
            class108.field2446.method469(-1, var3.field22, var3);
            ++class93.field2132;
            --class55.field1333;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BZI)I", line = 297)
    public static final int method789(byte[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return -18;
        } else {
            ++field2326;
            return class97.method753((byte) -84, arg2, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Lfd;", line = 322)
    public final class39 method190(byte arg0) {
        ++field2305;
        if (this.field2334 == null) {
            return null;
        } else {
            class112 var2 = super.field1216 != -1 && ~super.field1207 == -1 ? class70.method576(12, super.field1216) : null;
            if (arg0 != -93) {
                return null;
            } else {
                class112 var3 = ~super.field1233 == 0 || this.field2328 || super.field1254 == super.field1233 && var2 != null ? null : class70.method576(12, super.field1233);
                class39 var4 = this.field2334.method1022(var2, var3, true, super.field1188, super.field1224);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method325();
                    super.field1213 = var4.field510;
                    if (!this.field2328 && super.field1194 != -1 && ~super.field1193 != 0) {
                        class39 var5 = class119.method942(super.field1194, (byte) 118).method638(super.field1193, -30);
                        if (var5 != null) {
                            var5.method340(0, -super.field1230, 0);
                            class39[] var6 = new class39[] { var4, var5 };
                            var4 = new class39(var6, 2, true);
                        }
                    }
                    if (!this.field2328 && this.field2310 != null) {
                        if (this.field2325 <= class135.field3243) {
                            this.field2310 = null;
                        }
                        if (~this.field2313 >= ~class135.field3243 && ~this.field2325 < ~class135.field3243) {
                            class39 var7 = this.field2310;
                            class39[] var8 = new class39[] { var4, var7 };
                            var7.method340(-super.field1260 + this.field2333, -this.field2309 + this.field2322, this.field2316 - super.field1190);
                            if (~super.field1218 == -513) {
                                var7.method347();
                                var7.method347();
                                var7.method347();
                            } else if (super.field1218 == 1024) {
                                var7.method347();
                                var7.method347();
                            } else if (super.field1218 == 1536) {
                                var7.method347();
                            }
                            var4 = new class39(var8, 2, true);
                            if (~super.field1218 != -513) {
                                if (~super.field1218 != -1025) {
                                    if (~super.field1218 == -1537) {
                                        var7.method347();
                                        var7.method347();
                                        var7.method347();
                                    }
                                } else {
                                    var7.method347();
                                    var7.method347();
                                }
                            } else {
                                var7.method347();
                            }
                            var7.method340(-this.field2333 + super.field1260, -this.field2322 + this.field2309, -this.field2316 + super.field1190);
                        }
                    }
                    var4.field916 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "(I)V", line = 446)
    public static void method790(int arg0) {
        field2317 = null;
        field2332 = null;
        field2302 = null;
        field2330 = null;
        if (arg0 != -20979) {
            method787((byte) 104);
        }
        field2324 = null;
        field2318 = null;
        field2335 = null;
        field2337 = null;
    }
}
