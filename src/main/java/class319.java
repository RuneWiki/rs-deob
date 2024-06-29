import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class319 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lr;")
    public class151 field4913;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
    public int[] field4910;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    public int[] field4912;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
    public int[] field4915;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "[I")
    public int[] field4919;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public int[] field4921;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
    public int[] field4924;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[Lr;")
    public class151[] field4918;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[[I")
    public int[][] field4911;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[[I")
    public int[][] field4920;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILqf;IJIIII)Z", line = 4)
    public static final boolean method2251(int arg0, int arg1, int arg2, int arg3, class64 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class174.method1365(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIZIIIIIIZLug;I)V", line = 11)
    public static final void method2252(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class25 arg10, int arg11) {
        field4926++;
        if (arg6 >= 0 && arg6 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg9 && !arg2) {
                class146.field2386[arg8][arg6][arg3] = 0;
            }
            while (true) {
                int var12 = arg10.method281(-124);
                if (var12 == 0) {
                    if (arg9) {
                        class277.field4290[0][arg5 + arg6][arg3 + arg4] = class121.field1924[0][arg5 + arg6][arg3 + arg4];
                    } else if (arg8 == 0) {
                        class277.field4290[0][arg5 + arg6][arg3 + arg4] = -class165.method1311(arg7 + 932731, arg11 + 556238, arg0 - 36) * 8;
                    } else {
                        class277.field4290[arg8][arg5 + arg6][arg3 + arg4] = class277.field4290[arg8 - 1][arg5 + arg6][arg3 + arg4] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg10.method281(-125);
                    if (arg9) {
                        class277.field4290[0][arg5 + arg6][arg3 + arg4] = var13 * 8 + class121.field1924[0][arg5 + arg6][arg3 + arg4];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg8 == 0) {
                            class277.field4290[0][arg5 + arg6][arg3 + arg4] = -var13 * 8;
                        } else {
                            class277.field4290[arg8][arg5 + arg6][arg3 + arg4] = class277.field4290[arg8 - 1][arg5 + arg6][arg3 + arg4] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg2) {
                        arg10.method281(arg0 + 111);
                    } else {
                        class19.field314[arg8][arg6][arg3] = arg10.method286((byte) 118);
                        class239.field3722[arg8][arg6][arg3] = (byte) ((var12 - 2) / 4);
                        class337.field5188[arg8][arg6][arg3] = (byte) class301.method2169(var12 + arg1 - 2, 3);
                    }
                } else if (var12 > 81) {
                    if (!arg2) {
                        class197.field3082[arg8][arg6][arg3] = (byte) (var12 - 81);
                    }
                } else if (!arg9 && !arg2) {
                    class146.field2386[arg8][arg6][arg3] = (byte) (var12 - 49);
                }
            }
        } else {
            while (true) {
                int var14 = arg10.method281(-127);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg10.method281(53);
                    break;
                }
                if (var14 <= 49) {
                    arg10.method281(97);
                }
            }
        }
        if (arg0 == -59) {
            ;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[B)V", line = 124)
    private final void method2253(int arg0, byte[] arg1) {
        field4917++;
        class25 var3 = new class25(class143.method1187(9, arg1));
        int var4 = var3.method281(-124);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4923 = 0;
        } else {
            this.field4923 = var3.method262((byte) 127);
        }
        if (arg0 != -23279) {
            return;
        }
        int var5 = 0;
        int var6 = var3.method281(-127);
        int var7 = -1;
        this.field4916 = var3.method314((byte) 47);
        this.field4912 = new int[this.field4916];
        for (int var8 = 0; var8 < this.field4916; var8++) {
            this.field4912[var8] = var5 += var3.method314((byte) 110);
            if (this.field4912[var8] > var7) {
                var7 = this.field4912[var8];
            }
        }
        this.field4925 = var7 + 1;
        this.field4920 = new int[this.field4925][];
        this.field4919 = new int[this.field4925];
        this.field4910 = new int[this.field4925];
        this.field4915 = new int[this.field4925];
        this.field4921 = new int[this.field4925];
        if (var6 != 0) {
            this.field4924 = new int[this.field4925];
            for (int var9 = 0; var9 < this.field4925; var9++) {
                this.field4924[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4916; var10++) {
                this.field4924[this.field4912[var10]] = var3.method262((byte) 94);
            }
            this.field4913 = new class151(this.field4924);
        }
        for (int var11 = 0; var11 < this.field4916; var11++) {
            this.field4915[this.field4912[var11]] = var3.method262((byte) 80);
        }
        for (int var12 = 0; var12 < this.field4916; var12++) {
            this.field4910[this.field4912[var12]] = var3.method262((byte) 28);
        }
        for (int var13 = 0; var13 < this.field4916; var13++) {
            this.field4919[this.field4912[var13]] = var3.method314((byte) 106);
        }
        for (int var14 = 0; var14 < this.field4916; var14++) {
            int var15 = 0;
            int var16 = this.field4912[var14];
            int var17 = -1;
            int var18 = this.field4919[var16];
            this.field4920[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field4920[var16][var19] = var15 += var3.method314((byte) 82);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field4921[var16] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field4920[var16] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4918 = new class151[var7 + 1];
        this.field4911 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field4916; var21++) {
            int var22 = this.field4912[var21];
            int var23 = this.field4919[var22];
            this.field4911[var22] = new int[this.field4921[var22]];
            for (int var24 = 0; var24 < this.field4921[var22]; var24++) {
                this.field4911[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4920[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4920[var22][var25];
                }
                this.field4911[var22][var26] = var3.method262((byte) 91);
            }
            this.field4918[var22] = new class151(this.field4911[var22]);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 311)
    public static final void method2254(byte arg0) {
        field4922++;
        if (arg0 > -47) {
            return;
        }
        if (class323.field4966.toLowerCase().indexOf("microsoft") != -1) {
            class166.field2641[221] = 43;
            class166.field2641[222] = 59;
            class166.field2641[190] = 72;
            class166.field2641[192] = 58;
            class166.field2641[223] = 28;
            class166.field2641[220] = 74;
            class166.field2641[189] = 26;
            class166.field2641[191] = 73;
            class166.field2641[187] = 27;
            class166.field2641[219] = 42;
            class166.field2641[188] = 71;
            class166.field2641[186] = 57;
            return;
        }
        class166.field2641[92] = 74;
        class166.field2641[59] = 57;
        class166.field2641[61] = 27;
        class166.field2641[91] = 42;
        class166.field2641[46] = 72;
        class166.field2641[93] = 43;
        if (class323.field4980 == null) {
            class166.field2641[222] = 59;
            class166.field2641[192] = 58;
        } else {
            class166.field2641[192] = 28;
            class166.field2641[520] = 59;
            class166.field2641[222] = 58;
        }
        class166.field2641[47] = 73;
        class166.field2641[44] = 71;
        class166.field2641[45] = 26;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILqf;JZ)V", line = 362)
    public static final void method2255(int arg0, int arg1, int arg2, int arg3, class64 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class44 var8 = new class44();
        var8.field714 = arg4;
        var8.field709 = arg1 * 128 + 64;
        var8.field708 = arg2 * 128 + 64;
        var8.field705 = arg3;
        var8.field701 = arg5;
        var8.field713 = arg6;
        if (class170.field2689[arg0][arg1][arg2] == null) {
            class170.field2689[arg0][arg1][arg2] = new class329(arg0, arg1, arg2);
        }
        class170.field2689[arg0][arg1][arg2].field5062 = var8;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([BI)V", line = 385)
    public class319(byte[] arg0, int arg1) {
        this.field4914 = class34.method355(arg0, arg0.length, 0);
        if (this.field4914 != arg1) {
            throw new RuntimeException();
        }
        this.method2253(-23279, arg0);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 403)
    public static final void method2256(byte arg0) {
        field4927++;
        if (arg0 <= -64) {
            class187.field2935.method656(0);
        }
    }
}
