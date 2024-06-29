import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class318 extends class279 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    public boolean field5023 = true;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field5030 = -1;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Ldn;")
    public static class228 field5032 = null;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[Lnn;")
    public static class187[] field5036 = new class187[0];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    private int[] field5031;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    public int[] field5040;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field5027;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[[I")
    private int[][] field5035;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 10)
    public final void method2227(byte arg0) {
        if (this.field5040 != null) {
            for (int var2 = 0; var2 < this.field5040.length; var2++) {
                this.field5040[var2] = class214.method1562(this.field5040[var2], 32768);
            }
        }
        field5028++;
        if (arg0 <= 10) {
            field5024 = 124;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I", line = 30)
    public final int method2228(byte arg0) {
        if (arg0 != -109) {
            this.method2238(-12, 62);
        }
        field5041++;
        return this.field5031 == null ? 0 : this.field5031.length;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[ILvl;)V", line = 51)
    public final void method2229(int arg0, int[] arg1, class6 arg2) {
        field5043++;
        if (this.field5031 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field5031.length && var4 < arg1.length; var4++) {
            int var5 = class261.field4099[this.method2238(var4, 126)];
            if (var5 > 0) {
                arg2.method47((byte) -119, (long) arg1[var4], var5);
            }
        }
        int var6 = -117 / ((arg0 - 43) / 55);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)V", line = 81)
    public static final void method2230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5025++;
        if (class286.method2022((byte) -33, arg5) && arg4 < -116) {
            client.method960(class269.field4182[arg5], -1, arg0, arg1, arg6, arg7, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvl;I)Ljava/lang/String;", line = 104)
    public final String method2231(class6 arg0, int arg1) {
        StringBuffer var3 = new StringBuffer(arg1);
        if (this.field5031 != null) {
            for (int var4 = 0; var4 < this.field5031.length; var4++) {
                var3.append(this.field5027[var4]);
                var3.append(class229.method1663(this.field5031[var4], arg0.method55(class267.field4168[this.field5031[var4]], (byte) 64), -73, this.field5035[var4]));
            }
        }
        var3.append(this.field5027[this.field5027.length - 1]);
        field5042++;
        return var3.toString();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I", line = 130)
    public final int method2232(int arg0, int arg1, int arg2) {
        field5039++;
        if (this.field5031 == null || arg2 < 0 || this.field5031.length < arg2) {
            return -1;
        } else if (this.field5035[arg2] == null || arg1 < 0 || arg1 > this.field5035[arg2].length) {
            return -1;
        } else {
            if (arg0 < 3) {
                method2235((class136) null, (byte) -86, (String) null);
            }
            return this.field5035[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 153)
    public static void method2233(byte arg0) {
        field5032 = null;
        if (arg0 == 16) {
            field5036 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLvl;)V", line = 166)
    public final void method2234(byte arg0, class6 arg1) {
        int var3 = 93 % ((-arg0 - 49) / 47);
        field5026++;
        while (true) {
            int var4 = arg1.method58(-288140008);
            if (var4 == 0) {
                return;
            }
            this.method2236(arg1, (byte) -125, var4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcd;BLjava/lang/String;)Ljava/lang/String;", line = 188)
    public static final String method2235(class136 arg0, byte arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label53: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label53;
                                                        }
                                                        String var9 = "";
                                                        if (class270.field4199 != null) {
                                                            if (class270.field4199.field1591 == null) {
                                                                var9 = class290.method2031(class270.field4199.field1596, -127);
                                                            } else {
                                                                var9 = (String) class270.field4199.field1591;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class116.method818(class256.method1854(4, arg0, 8), 98) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class116.method818(class256.method1854(3, arg0, 8), 121) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class116.method818(class256.method1854(2, arg0, 8), 104) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class116.method818(class256.method1854(1, arg0, 8), 78) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class116.method818(class256.method1854(0, arg0, 8), 120) + arg2.substring(var3 + 2);
            }
        }
        field5034++;
        int var10 = -91 / ((-arg1 - 75) / 43);
        return arg2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvl;BI)V", line = 276)
    private final void method2236(class6 arg0, byte arg1, int arg2) {
        field5038++;
        if (arg2 == 1) {
            this.field5027 = class215.method1569(1, arg0.method40(false), '<');
        } else if (arg2 == 2) {
            int var8 = arg0.method58(-288140008);
            this.field5040 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5040[var9] = arg0.method39((byte) 27);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method58(arg1 ^ 0x112CAA9B);
            this.field5031 = new int[var4];
            this.field5035 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method39((byte) 118);
                this.field5031[var5] = var6;
                this.field5035[var5] = new int[class335.field5214[var6]];
                for (int var7 = 0; var7 < class335.field5214[var6]; var7++) {
                    this.field5035[var5][var7] = arg0.method39((byte) 103);
                }
            }
        } else if (arg2 == 4) {
            this.field5023 = false;
        }
        if (arg1 != -125) {
            this.method2237((byte) -25);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)Ljava/lang/String;", line = 349)
    public final String method2237(byte arg0) {
        field5033++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 < 43) {
            this.method2234((byte) 66, (class6) null);
        }
        if (this.field5027 == null) {
            return "";
        }
        var2.append(this.field5027[0]);
        for (int var3 = 1; var3 < this.field5027.length; var3++) {
            var2.append("...");
            var2.append(this.field5027[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 381)
    public final int method2238(int arg0, int arg1) {
        if (arg1 < 117) {
            return -60;
        } else {
            field5029++;
            return this.field5031 == null || arg0 < 0 || this.field5031.length < arg0 ? -1 : this.field5031[arg0];
        }
    }
}
