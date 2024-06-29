import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class363 {

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public int field5231 = -1;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "Lnj;")
    public static class436 field5237 = new class436(512);

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lnj;")
    private class436 field5223;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Ljava/lang/String;")
    private String field5221;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "Ljava/lang/String;")
    private String field5233;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "[I")
    private int[] field5218;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "[I")
    private int[] field5219;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
    private int[] field5222;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "[I")
    private int[] field5224;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "[I")
    private int[] field5227;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "[I")
    private int[] field5228;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "[I")
    private int[] field5229;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "[I")
    private int[] field5234;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field5220;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field5232;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[[I")
    private int[][] field5216;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[[I")
    private int[][] field5217;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "[[I")
    private int[][] field5230;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[Lfca;I)V")
    public static final void method2228(int arg0, class188[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class188 var4 = arg1[var3];
            if (var4 != null && var4.field2414 == arg0 && !client.method1409(var4)) {
                if (var4.field2304 == 0) {
                    method2228(var4.field2387, arg1, 0);
                    if (var4.field2352 != null) {
                        method2228(var4.field2387, var4.field2352, arg2);
                    }
                    class524 var5 = (class524) class54.field742.method2506(92, (long) var4.field2387);
                    if (var5 != null) {
                        class296.method1768(true, var5.field7256);
                    }
                }
                if (var4.field2304 == 6 && var4.field2386 != -1) {
                    class463 var6 = class77.field971.method776(var4.field2386, (byte) 102);
                    if (var6 != null) {
                        var4.field2316 += class323.field4732;
                        while (var4.field2316 > var6.field6319[var4.field2368]) {
                            var4.field2316 -= var6.field6319[var4.field2368];
                            var4.field2368++;
                            if (var6.field6307.length <= var4.field2368) {
                                var4.field2368 -= var6.field6332;
                                if (var4.field2368 < 0 || var6.field6307.length <= var4.field2368) {
                                    var4.field2368 = 0;
                                }
                            }
                            var4.field2343 = var4.field2368 + 1;
                            if (var4.field2343 >= var6.field6307.length) {
                                var4.field2343 -= var6.field6332;
                                if (var4.field2343 < 0 || var6.field6307.length <= var4.field2343) {
                                    var4.field2343 = -1;
                                }
                            }
                            class553.method3100(var4, arg2);
                        }
                    }
                }
            }
        }
        field5225++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdga;I)V")
    private final void method2229(int arg0, class138 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5233 = arg1.method939((byte) 102);
        } else if (arg0 == 2) {
            this.field5221 = arg1.method939((byte) 75);
        } else if (arg0 == 3) {
            int var4 = arg1.method957((byte) -122);
            this.field5230 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5230[var5][0] = arg1.method922((byte) -115);
                this.field5230[var5][1] = arg1.method943(-124);
                this.field5230[var5][2] = arg1.method943(-93);
            }
        } else if (arg0 == 4) {
            int var6 = arg1.method957((byte) -76);
            this.field5217 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5217[var7][0] = arg1.method922((byte) -119);
                this.field5217[var7][1] = arg1.method943(-128);
                this.field5217[var7][2] = arg1.method943(-105);
            }
        } else if (arg0 == 5) {
            arg1.method922((byte) -118);
        } else if (arg0 == 6) {
            arg1.method957((byte) -86);
        } else if (arg0 == 7) {
            arg1.method957((byte) -95);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method957((byte) -75);
            } else if (arg0 == 10) {
                int var8 = arg1.method957((byte) -124);
                this.field5234 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5234[var9] = arg1.method943(-122);
                }
            } else if (arg0 == 12) {
                arg1.method943(-112);
            } else if (arg0 == 13) {
                int var22 = arg1.method957((byte) -62);
                this.field5218 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field5218[var23] = arg1.method922((byte) -124);
                }
            } else if (arg0 == 14) {
                int var20 = arg1.method957((byte) -109);
                this.field5216 = new int[var20][2];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5216[var21][0] = arg1.method957((byte) -107);
                    this.field5216[var21][1] = arg1.method957((byte) -119);
                }
            } else if (arg0 == 15) {
                arg1.method922((byte) -124);
            } else if (arg0 == 17) {
                this.field5231 = arg1.method922((byte) -113);
            } else if (arg0 == 18) {
                int var18 = arg1.method957((byte) -101);
                this.field5232 = new String[var18];
                this.field5224 = new int[var18];
                this.field5219 = new int[var18];
                this.field5229 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5229[var19] = arg1.method943(-102);
                    this.field5219[var19] = arg1.method943(-76);
                    this.field5224[var19] = arg1.method943(-106);
                    this.field5232[var19] = arg1.method907(false);
                }
            } else if (arg0 == 19) {
                int var10 = arg1.method957((byte) -121);
                this.field5227 = new int[var10];
                this.field5220 = new String[var10];
                this.field5222 = new int[var10];
                this.field5228 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field5227[var11] = arg1.method943(-120);
                    this.field5228[var11] = arg1.method943(-108);
                    this.field5222[var11] = arg1.method943(-102);
                    this.field5220[var11] = arg1.method907(false);
                }
            } else if (arg0 == 249) {
                int var12 = arg1.method957((byte) -68);
                if (this.field5223 == null) {
                    int var13 = class306.method1837((byte) -127, var12);
                    this.field5223 = new class436(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method957((byte) -63) == 1;
                    int var16 = arg1.method904(120);
                    class28 var17;
                    if (var15) {
                        var17 = new class61(arg1.method907(false));
                    } else {
                        var17 = new class360(arg1.method943(-128));
                    }
                    this.field5223.method2504((long) var16, -10, var17);
                }
            }
        }
        if (arg2 == 0) {
            field5235++;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdga;)V")
    public final void method2230(int arg0, class138 arg1) {
        while (true) {
            int var3 = arg1.method957((byte) -86);
            if (var3 == 0) {
                field5226++;
                if (arg0 != 5) {
                    this.method2234(false);
                    return;
                }
                return;
            }
            this.method2229(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)V")
    public static final void method2231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class15.field128 = arg0;
        class556.field7593 = arg3;
        class495.field6699 = arg2;
        class198.field2618 = arg4;
        field5214++;
        class18.field164 = arg1;
        if (class15.field128 >= 100) {
            int var6 = class18.field164 * 512 + 256;
            int var7 = class495.field6699 * 512 + 256;
            int var8 = class394.method2340(var6, -1, class432.field5993, var7) - class198.field2618;
            int var9 = var6 - class132.field1679;
            int var10 = var8 - class628.field8545;
            int var11 = var7 - class471.field6379;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class336.field4947 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class261.field3603 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class253.field3493 = 0;
            if (class336.field4947 < 1024) {
                class336.field4947 = 1024;
            }
            if (class336.field4947 > 3072) {
                class336.field4947 = 3072;
            }
        }
        class42.field546 = 2;
        int var13 = -22 / ((arg5 - 76) / 35);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2232(String arg0, String arg1, int arg2) {
        class168.field2105 = 1;
        if (arg2 != 6673) {
            field5237 = null;
        }
        class644.field9129 = -1;
        field5215++;
        class525.method2994(-1, arg1, arg0, false);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public static void method2233(boolean arg0) {
        field5237 = null;
        if (arg0) {
            method2233(false);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
    public final void method2234(boolean arg0) {
        if (this.field5221 == null) {
            this.field5221 = this.field5233;
        }
        if (!arg0) {
            field5236++;
        }
    }
}
