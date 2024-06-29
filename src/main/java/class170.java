import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class170 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field2296 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Ljava/lang/String;")
    public String[] field2310 = new String[5];

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    private int field2308 = -1;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field2297 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field2303 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field2314 = -1;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    private int field2321 = -1;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
    public boolean field2322 = true;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
    public boolean field2309 = false;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field2313 = -1;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public int field2328 = -1;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
    public boolean field2330 = true;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field2299 = -1;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public int field2333 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
    public boolean field2332 = true;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field2325 = -1;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field2336 = -1;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public int field2340 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public int field2339 = -1;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
    public static int[] field2305 = new int[8];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Ljava/lang/String;")
    public String field2320;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2335;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Ljava/lang/String;")
    public String field2337;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[I")
    public int[] field2326;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2305 = null;
        if (arg0 == 4858) {
            field2335 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLfb;)V")
    public final void method1133(byte arg0, class341 arg1) {
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                if (arg0 > -114) {
                    return;
                }
                field2315++;
                return;
            }
            this.method1134(-29, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILfb;)V")
    private final void method1134(int arg0, int arg1, class341 arg2) {
        if (arg1 == 1) {
            this.field2328 = arg2.method2239(-1076227960);
        } else if (arg1 == 2) {
            this.field2325 = arg2.method2239(-1076227960);
        } else if (arg1 == 3) {
            this.field2320 = arg2.method2261((byte) 104);
        } else if (arg1 == 4) {
            this.field2298 = arg2.method2249(32767);
        } else if (arg1 == 5) {
            this.field2339 = arg2.method2249(32767);
        } else if (arg1 == 6) {
            this.field2303 = arg2.method2233((byte) 104);
        } else if (arg1 == 7) {
            int var6 = arg2.method2233((byte) 104);
            if ((var6 & 0x2) == 2) {
                this.field2309 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field2322 = false;
            }
        } else if (arg1 == 8) {
            this.field2332 = arg2.method2233((byte) 104) == 1;
        } else if (arg1 == 9) {
            this.field2308 = arg2.method2239(-1076227960);
            if (this.field2308 == 65535) {
                this.field2308 = -1;
            }
            this.field2313 = arg2.method2239(-1076227960);
            if (this.field2313 == 65535) {
                this.field2313 = -1;
            }
            this.field2338 = arg2.method2232(-19);
            this.field2316 = arg2.method2232(-81);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field2310[arg1 - 10] = arg2.method2261((byte) 112);
        } else if (arg1 == 15) {
            int var4 = arg2.method2233((byte) 104);
            this.field2326 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2326[var5] = arg2.method2212(-2);
            }
            this.field2327 = arg2.method2232(123);
            this.field2319 = arg2.method2232(-69);
        } else if (arg1 == 16) {
            this.field2330 = false;
        } else if (arg1 == 17) {
            this.field2337 = arg2.method2261((byte) 80);
        } else if (arg1 == 18) {
            this.field2336 = arg2.method2239(-1076227960);
        } else if (arg1 == 19) {
            this.field2299 = arg2.method2239(-1076227960);
        } else if (arg1 == 20) {
            this.field2314 = arg2.method2239(-1076227960);
            if (this.field2314 == 65535) {
                this.field2314 = -1;
            }
            this.field2321 = arg2.method2239(-1076227960);
            if (this.field2321 == 65535) {
                this.field2321 = -1;
            }
            this.field2317 = arg2.method2232(112);
            this.field2329 = arg2.method2232(-59);
        } else if (arg1 == 21) {
            this.field2324 = arg2.method2232(-33);
        } else if (arg1 == 22) {
            this.field2306 = arg2.method2232(102);
        }
        field2323++;
        int var7 = -27 % ((64 - arg0) / 54);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z")
    public static final boolean method1135(boolean arg0) {
        if (arg0) {
            field2305 = null;
        }
        field2302++;
        return class402.field5874 > 0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;Lsj;I)Ljava/lang/String;")
    public static final String method1136(String arg0, class248 arg1, int arg2) {
        field2301++;
        if (arg2 == ~arg0.indexOf("%")) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    String var9 = "";
                                                    if (class403.field5877 != null) {
                                                        if (class403.field5877.field3105 == null) {
                                                            var9 = class106.method800(arg2 ^ 0x7, class403.field5877.field3103);
                                                        } else {
                                                            var9 = (String) class403.field5877.field3105;
                                                        }
                                                    }
                                                    arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                }
                                            }
                                            arg0 = arg0.substring(0, var7) + class338.method2199(-88, class72.method589(4, arg2 + 20377, arg1)) + arg0.substring(var7 + 2);
                                        }
                                    }
                                    arg0 = arg0.substring(0, var6) + class338.method2199(-106, class72.method589(3, arg2 + 20377, arg1)) + arg0.substring(var6 + 2);
                                }
                            }
                            arg0 = arg0.substring(0, var5) + class338.method2199(-111, class72.method589(2, 20377, arg1)) + arg0.substring(var5 + 2);
                        }
                    }
                    arg0 = arg0.substring(0, var4) + class338.method2199(-119, class72.method589(1, arg2 ^ 0x4F99, arg1)) + arg0.substring(var4 + 2);
                }
            }
            arg0 = arg0.substring(0, var3) + class338.method2199(-113, class72.method589(0, 20377, arg1)) + arg0.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method1137(byte arg0) {
        field2304++;
        if (arg0 > -77) {
            method1142(false);
        }
        if (this.field2326 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2326.length; var2 += 2) {
            if (this.field2296 > this.field2326[var2]) {
                this.field2296 = this.field2326[var2];
            } else if (this.field2340 < this.field2326[var2]) {
                this.field2340 = this.field2326[var2];
            }
            if (this.field2326[var2 + 1] < this.field2297) {
                this.field2297 = this.field2326[var2 + 1];
            } else if (this.field2333 < this.field2326[var2 + 1]) {
                this.field2333 = this.field2326[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
    public final boolean method1138(int arg0) {
        if (arg0 != -4123) {
            this.field2320 = null;
        }
        field2295++;
        if (this.field2313 == -1 && this.field2308 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field2313 == -1) {
            var3 = class69.method578(this.field2308, 15967);
        } else {
            var3 = class100.field1325[this.field2313];
        }
        if (this.field2338 > var3 || var3 > this.field2316) {
            return false;
        } else if (this.field2321 == -1 && this.field2314 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2321 == -1) {
                var5 = class69.method578(this.field2314, 15967);
            } else {
                var5 = class100.field1325[this.field2321];
            }
            return var5 >= this.field2317 && this.field2329 >= var5;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
    public static final void method1139(int arg0, int arg1) {
        field2311++;
        class395.field5752 = arg1;
        if (arg0 == -1) {
            class244.field3423.method372(126);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILfb;)Ljava/lang/String;")
    public static final String method1140(int arg0, class341 arg1) {
        field2318++;
        int var2 = 76 / ((arg0 + 58) / 44);
        return class257.method1684(0, 32767, arg1);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static final void method1141(int arg0) {
        field2307++;
        if (arg0 != -1 || class126.field1647 == null) {
            return;
        }
        class308.field4573.method48(22754);
        class322.method2118();
        class403.method2571(-1);
        class157.method1045((byte) 51);
        class365.method2412(0);
        class435.method2724(-97);
        if (class193.field2683 != null) {
            class193.field2683.method844(38);
        }
        class133.method953((byte) 13);
        class452.method2808(0);
        class346.method2291(-27281);
        class149.method1030(false, true);
        class41.method301(true);
        for (int var1 = 0; var1 < 2048; var1++) {
            class317 var5 = class176.field2382[var1];
            if (var5 != null) {
                var5.field2204 = null;
                for (int var6 = 0; var6 < var5.field2186.length; var6++) {
                    var5.field2186[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class388.field5670.length; var2++) {
            class163 var3 = class388.field5670[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field2186.length; var4++) {
                    var3.field2186[var4] = null;
                }
            }
        }
        class126.field1647.method2019(0);
        class126.field1647 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static final void method1142(boolean arg0) {
        if (arg0) {
            method1141(24);
        }
        field2312++;
        for (class110 var1 = (class110) class176.field2383.method1575(0); var1 != null; var1 = (class110) class176.field2383.method1573((byte) -128)) {
            class258 var2 = var1.field1431;
            if (class268.field3973 != var2.field5922 || var2.field3788) {
                var1.method2632(true);
                var2.method1709((byte) 122);
            } else if (var2.field3800 <= class231.field3179) {
                var2.method1706(-104, class216.field3021);
                if (var2.field3788) {
                    var1.method2632(!arg0);
                } else {
                    class197.method1306(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZLtj;)Ll;")
    public final class315 method1143(boolean arg0, boolean arg1, class298 arg2) {
        field2334++;
        int var4 = arg0 ? this.field2325 : this.field2328;
        int var5 = arg2.field4492 << 29 | var4;
        if (!arg1) {
            return null;
        }
        class315 var6 = (class315) class136.field1768.method378((byte) 28, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class236.field3286.method1205((byte) -48, var4)) {
            class10 var7 = class10.method88(class236.field3286, var4, 0);
            if (var7 != null) {
                var6 = arg2.method463(var7, true);
                class136.field1768.method367((long) var5, var6, arg1);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLtj;)Ll;")
    public final class315 method1144(byte arg0, class298 arg1) {
        field2331++;
        class315 var3 = (class315) class136.field1768.method378((byte) 28, (long) (this.field2336 | 0x20000 | arg1.field4492 << 29));
        if (var3 != null) {
            return var3;
        }
        class236.field3286.method1205((byte) -48, this.field2336);
        class10 var4 = class10.method88(class236.field3286, this.field2336, 0);
        if (var4 != null) {
            var3 = arg1.method463(var4, true);
            class136.field1768.method367((long) (arg1.field4492 << 29 | this.field2336 | 0x20000), var3, true);
        }
        if (arg0 >= -63) {
            method1142(true);
        }
        return var3;
    }
}
