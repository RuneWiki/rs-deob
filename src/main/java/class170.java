import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class170 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field2236 = -1;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Z")
    public boolean field2247 = true;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field2254 = -1;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field2244 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field2235 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public int field2266 = 0;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public int field2270 = -1;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    private int field2252 = -1;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Z")
    public boolean field2268 = true;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private int field2250 = -1;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Z")
    public boolean field2275 = false;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    private int field2272 = -1;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field2262 = new String[5];

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field2248 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public int field2258 = -1;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Z")
    public boolean field2256 = true;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public int field2261 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public int field2242 = -1;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field2267 = -1;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Ltj;")
    public static class125 field2269 = class280.method1707((byte) -5);

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Lwt;")
    public static class194 field2278 = new class194("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    private int field2245;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lna;")
    public class34 field2243;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lfe;")
    private class384 field2241;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Ljava/lang/String;")
    public String field2263;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Ljava/lang/String;")
    public String field2273;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
    public int[] field2253;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 8)
    public final String method1067(String arg0, int arg1, byte arg2) {
        if (arg2 != -32) {
            this.field2274 = 4;
        }
        field2238++;
        if (this.field2241 == null) {
            return arg0;
        } else {
            class149 var4 = (class149) this.field2241.method2310((byte) 97, (long) arg1);
            return var4 == null ? arg0 : var4.field1930;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILts;)V", line = 29)
    public static final void method1068(int arg0, class356 arg1) {
        if (arg0 > -34) {
            method1074((byte) 106);
        }
        if (class368.field5533 == arg1.field5157) {
            class61.field909[arg1.field5295] = true;
        }
        field2249++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I", line = 50)
    public final int method1069(int arg0, int arg1, int arg2) {
        field2259++;
        if (this.field2241 == null) {
            return arg2;
        }
        class304 var4 = (class304) this.field2241.method2310((byte) 111, (long) arg1);
        if (arg0 > -30) {
            return 80;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field4412;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 78)
    public final void method1070(int arg0) {
        field2240++;
        if (arg0 != 1 || this.field2253 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2253.length; var2 += 2) {
            if (this.field2244 > this.field2253[var2]) {
                this.field2244 = this.field2253[var2];
            } else if (this.field2253[var2] > this.field2261) {
                this.field2261 = this.field2253[var2];
            }
            if (this.field2248 > this.field2253[var2 + 1]) {
                this.field2248 = this.field2253[var2 + 1];
            } else if (this.field2235 < this.field2253[var2 + 1]) {
                this.field2235 = this.field2253[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lae;Z)V", line = 153)
    public final void method1071(class156 arg0, boolean arg1) {
        if (!arg1) {
            this.field2263 = null;
        }
        field2280++;
        while (true) {
            int var3 = arg0.method941((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method1072(var3, -22830, arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILae;)V", line = 183)
    private final void method1072(int arg0, int arg1, class156 arg2) {
        field2255++;
        if (arg1 != -22830) {
            this.method1071(null, true);
        }
        if (arg0 == 1) {
            this.field2258 = arg2.method993((byte) -70);
        } else if (arg0 == 2) {
            this.field2270 = arg2.method993((byte) -41);
        } else if (arg0 == 3) {
            this.field2273 = arg2.method981(false);
        } else if (arg0 == 4) {
            this.field2237 = arg2.method943(1295851312);
        } else if (arg0 == 5) {
            this.field2254 = arg2.method943(1295851312);
        } else if (arg0 == 6) {
            this.field2266 = arg2.method941((byte) 123);
        } else if (arg0 == 7) {
            int var12 = arg2.method941((byte) 123);
            if ((var12 & 0x2) == 2) {
                this.field2275 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field2268 = false;
                return;
            }
        } else if (arg0 == 8) {
            this.field2247 = arg2.method941((byte) 123) == 1;
            return;
        } else if (arg0 == 9) {
            this.field2267 = arg2.method993((byte) -40);
            if (this.field2267 == 65535) {
                this.field2267 = -1;
            }
            this.field2272 = arg2.method993((byte) -62);
            if (this.field2272 == 65535) {
                this.field2272 = -1;
            }
            this.field2276 = arg2.method950(186);
            this.field2257 = arg2.method950(186);
            return;
        } else if (arg0 < 10 || arg0 > 14) {
            if (arg0 != 15) {
                if (arg0 == 16) {
                    this.field2256 = false;
                    return;
                }
                if (arg0 != 17) {
                    if (arg0 != 18) {
                        if (arg0 != 19) {
                            if (arg0 == 20) {
                                this.field2252 = arg2.method993((byte) -92);
                                if (this.field2252 == 65535) {
                                    this.field2252 = -1;
                                }
                                this.field2236 = arg2.method993((byte) -111);
                                if (this.field2236 == 65535) {
                                    this.field2236 = -1;
                                }
                                this.field2245 = arg2.method950(186);
                                this.field2274 = arg2.method950(arg1 ^ 0xFFFFA668);
                            } else if (arg0 == 21) {
                                this.field2279 = arg2.method950(186);
                                return;
                            } else if (arg0 == 22) {
                                this.field2265 = arg2.method950(186);
                                return;
                            } else if (arg0 == 249) {
                                int var4 = arg2.method941((byte) 124);
                                if (this.field2241 == null) {
                                    int var5 = class340.method2064(arg1 + 22740, var4);
                                    this.field2241 = new class384(var5);
                                }
                                for (int var6 = 0; var6 < var4; var6++) {
                                    boolean var7 = arg2.method941((byte) 127) == 1;
                                    int var8 = arg2.method943(arg1 ^ 0xB2C2B9E2);
                                    class86 var9;
                                    if (var7) {
                                        var9 = new class149(arg2.method981(false));
                                    } else {
                                        var9 = new class304(arg2.method950(186));
                                    }
                                    this.field2241.method2317(-1, (long) var8, var9);
                                }
                                return;
                            }
                            return;
                        }
                        this.field2242 = arg2.method993((byte) -43);
                        return;
                    }
                    this.field2250 = arg2.method993((byte) -48);
                    return;
                }
                this.field2263 = arg2.method981(false);
                return;
            }
            int var10 = arg2.method941((byte) 127);
            this.field2253 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field2253[var11] = arg2.method936((byte) -96);
            }
            this.field2251 = arg2.method950(186);
            this.field2260 = arg2.method950(arg1 ^ 0xFFFFA668);
            return;
        } else {
            this.field2262[arg0 - 10] = arg2.method981(false);
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILeq;)Lqg;", line = 350)
    public final class307 method1073(int arg0, class134 arg1) {
        field2277++;
        class307 var3 = (class307) this.field2243.field554.method40(0, (long) (arg1.field1706 << 29 | 0x20000 | this.field2250));
        if (var3 != null) {
            return var3;
        }
        if (arg0 > -51) {
            field2278 = null;
        }
        this.field2243.field543.method1442(this.field2250, (byte) -117);
        class328 var4 = class328.method1978(this.field2243.field543, this.field2250, 0);
        if (var4 != null) {
            var3 = arg1.method804(var4, true);
            this.field2243.field554.method36(-20960, var3, (long) (arg1.field1706 << 29 | 0x20000 | this.field2250));
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 377)
    public static void method1074(byte arg0) {
        if (arg0 != 98) {
            field2281 = -87;
        }
        field2269 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILeq;Z)Lqg;", line = 398)
    public final class307 method1075(int arg0, class134 arg1, boolean arg2) {
        field2239++;
        int var4 = arg2 ? this.field2270 : this.field2258;
        int var5 = arg1.field1706 << 29 | var4;
        class307 var6 = (class307) this.field2243.field554.method40(arg0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field2243.field543.method1442(var4, (byte) -124)) {
            class328 var7 = class328.method1978(this.field2243.field543, var4, 0);
            if (var7 != null) {
                var6 = arg1.method804(var7, true);
                this.field2243.field554.method36(arg0 - 20960, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILno;)Z", line = 430)
    public final boolean method1076(int arg0, class476 arg1) {
        field2264++;
        int var3;
        if (this.field2272 == -1) {
            if (this.field2267 == -1) {
                return true;
            }
            var3 = arg1.method109(this.field2267, 5687);
        } else {
            var3 = arg1.method108(this.field2272, (byte) 65);
        }
        if (var3 < this.field2276 || this.field2257 < var3) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (~this.field2236 == arg0) {
            if (this.field2252 == -1) {
                return true;
            }
            var5 = arg1.method109(this.field2252, 5687);
        } else {
            var5 = arg1.method108(this.field2236, (byte) -111);
        }
        return this.field2245 <= var5 && this.field2274 >= var5;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 475)
    public static final void method1077(int arg0, int arg1, int arg2) {
        field2271++;
        if (class140.field1835 == 1) {
            class52.method384(arg0, class499.field7611, true, arg1);
        } else if (class140.field1835 == 2) {
            class489.method2934(arg1, true, arg0);
        }
        class499.field7611 = null;
        if (arg2 != 5486) {
            method1077(-106, 100, 106);
        }
        class140.field1835 = 0;
    }
}
