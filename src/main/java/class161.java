import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class161 {

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field2227 = -1;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lik;")
    public static class463 field2236 = new class463("", 10);

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
    public static int[] field2245 = new int[5];

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Llp;")
    public static class137 field2244;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lcm;")
    private class382 field2230;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljava/lang/String;")
    private String field2216;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Ljava/lang/String;")
    private String field2231;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
    private int[] field2217;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    private int[] field2218;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
    private int[] field2220;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    private int[] field2225;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    private int[] field2233;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[I")
    private int[] field2235;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
    private int[] field2237;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    private int[] field2240;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "[I")
    public static int[] field2243;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field2226;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field2229;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[[I")
    private int[][] field2219;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
    private int[][] field2224;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[[I")
    private int[][] field2238;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method972(int arg0, int arg1) {
        field2239++;
        if (arg0 < 122) {
            field2236 = null;
        }
        if (arg1 != -1 && class360.field5321[arg1]) {
            class163.field2257.method816(arg1, 100);
            class130.field1650[arg1] = null;
            class360.field5321[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2243 = null;
        field2236 = null;
        field2244 = null;
        if (arg0 != -6) {
            method978(30, (class143) null, (byte[][]) null, 77, (class143) null, (class261) null, (byte[][]) null, 83, (byte) -22, false, (byte[][]) null, (byte[][]) null, (int[][]) null);
        }
        field2245 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILef;I)V")
    private final void method974(int arg0, class385 arg1, int arg2) {
        if (arg0 != -19121) {
            this.method976((class385) null, (byte) -65);
        }
        field2223++;
        if (arg2 == 1) {
            this.field2231 = arg1.method2330(-107);
        } else if (arg2 == 2) {
            this.field2216 = arg1.method2330(-113);
        } else if (arg2 == 3) {
            int var22 = arg1.method2343(arg0 + 19376);
            this.field2224 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2224[var23][0] = arg1.method2323(arg0 + 19032);
                this.field2224[var23][1] = arg1.method2354(255);
                this.field2224[var23][2] = arg1.method2354(255);
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method2343(255);
            this.field2238 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2238[var5][0] = arg1.method2323(-111);
                this.field2238[var5][1] = arg1.method2354(255);
                this.field2238[var5][2] = arg1.method2354(255);
            }
        } else if (arg2 == 5) {
            arg1.method2323(arg0 + 19080);
        } else if (arg2 == 6) {
            arg1.method2343(255);
        } else if (arg2 == 7) {
            arg1.method2343(arg0 + 19376);
            return;
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2343(255);
                return;
            }
            if (arg2 == 10) {
                int var6 = arg1.method2343(255);
                this.field2233 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2233[var7] = arg1.method2354(255);
                }
                return;
            }
            if (arg2 == 12) {
                arg1.method2354(255);
                return;
            }
            if (arg2 != 13) {
                if (arg2 == 14) {
                    int var8 = arg1.method2343(255);
                    this.field2219 = new int[var8][2];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field2219[var9][0] = arg1.method2343(255);
                        this.field2219[var9][1] = arg1.method2343(arg0 + 19376);
                    }
                    return;
                }
                if (arg2 == 15) {
                    arg1.method2323(-84);
                    return;
                }
                if (arg2 == 17) {
                    this.field2227 = arg1.method2323(arg0 + 19105);
                } else if (arg2 == 18) {
                    int var10 = arg1.method2343(arg0 + 19376);
                    this.field2217 = new int[var10];
                    this.field2226 = new String[var10];
                    this.field2220 = new int[var10];
                    this.field2237 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field2217[var11] = arg1.method2354(255);
                        this.field2237[var11] = arg1.method2354(255);
                        this.field2220[var11] = arg1.method2354(255);
                        this.field2226[var11] = arg1.method2332(76);
                    }
                    return;
                } else if (arg2 == 19) {
                    int var12 = arg1.method2343(255);
                    this.field2235 = new int[var12];
                    this.field2240 = new int[var12];
                    this.field2218 = new int[var12];
                    this.field2229 = new String[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field2235[var13] = arg1.method2354(255);
                        this.field2240[var13] = arg1.method2354(class339.method2073(arg0, -19024));
                        this.field2218[var13] = arg1.method2354(255);
                        this.field2229[var13] = arg1.method2332(arg0 + 19197);
                    }
                    return;
                } else if (arg2 == 249) {
                    int var14 = arg1.method2343(arg0 + 19376);
                    if (this.field2230 == null) {
                        int var15 = class196.method1174(75, var14);
                        this.field2230 = new class382(var15);
                    }
                    for (int var16 = 0; var16 < var14; var16++) {
                        boolean var17 = arg1.method2343(255) == 1;
                        int var18 = arg1.method2382((byte) -81);
                        class97 var19;
                        if (var17) {
                            var19 = new class435(arg1.method2332(79));
                        } else {
                            var19 = new class350(arg1.method2354(255));
                        }
                        this.field2230.method2301(27, var19, (long) var18);
                    }
                    return;
                }
                return;
            }
            int var20 = arg1.method2343(255);
            this.field2225 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field2225[var21] = arg1.method2323(arg0 + 19027);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public final void method975(byte arg0) {
        if (this.field2216 == null) {
            this.field2216 = this.field2231;
        }
        if (arg0 >= -36) {
            field2242 = -75;
        }
        field2234++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lef;B)V")
    public final void method976(class385 arg0, byte arg1) {
        field2221++;
        while (true) {
            int var3 = arg0.method2343(255);
            if (var3 == 0) {
                if (arg1 < 58) {
                    field2245 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method974(-19121, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method977(boolean arg0) {
        class375.field5461.method344(class162.field2252, class431.field6332 ? class213.field3200 + 256 : -1);
        if (arg0) {
            field2228++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILs;[[BILs;Ldr;[[BIBZ[[B[[B[[I)V")
    public static final void method978(int arg0, class143 arg1, byte[][] arg2, int arg3, class143 arg4, class261 arg5, byte[][] arg6, int arg7, byte arg8, boolean arg9, byte[][] arg10, byte[][] arg11, int[][] arg12) {
        field2222++;
        if (arg8 <= 56) {
            return;
        }
        if (class405.field6032 == 0 && !class341.field5111) {
            class385.method2355((byte) 96, arg10, arg5, arg6, arg2, arg9, arg1, arg12, arg3, arg4, arg0, arg7, arg11);
        } else {
            class431.method2649(arg4, arg7, arg1, arg3, arg11, 90, arg0, arg2, arg5, arg12, arg6, arg9, arg10);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lmf;IIIII)V")
    public static final void method979(class45 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field559 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class452.field6688[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class21 var13 = class281.field4303[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field559; var14++) {
                            if (arg0.field554[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field554[arg0.field559++] = var13;
                        if (arg0.field559 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field559; var15 < 4; var15++) {
            arg0.field554[var15] = null;
        }
    }
}
