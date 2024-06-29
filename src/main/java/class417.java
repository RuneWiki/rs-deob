import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class417 {

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    private int field5314 = -1;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "Z")
    private boolean field5324 = true;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    private int field5321;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "[Ldn;")
    private class519[] field5316;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    private int field5317;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    private int field5315;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "[Ldn;")
    private class519[] field5331;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "Ldn;")
    private class519 field5313;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "[[S")
    private static short[][] field5309 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "[[S")
    private static short[][] field5323 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "[[S")
    private static short[][] field5325 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "[[[S")
    public static short[][][] field5318 = new short[][][] { field5309, field5323, field5325 };

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "Lon;")
    public static class339 field5308 = new class339(8);

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    private int field5311;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "Liea;")
    private class481 field5320;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "Lnd;")
    public static class547 field5328;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "Lnd;")
    public static class547 field5330;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lha;IB)Z")
    public final boolean method2334(class60 arg0, int arg1, byte arg2) {
        if (this.field5314 != arg1) {
            this.field5314 = arg1;
            int var4 = class113.method890(arg1, 2094889633);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5311 != var4) {
                this.field5320 = null;
                this.field5311 = var4;
            }
            if (this.field5316 != null) {
                this.field5326 = 0;
                int[] var5 = new int[this.field5316.length];
                for (int var6 = 0; var6 < this.field5316.length; var6++) {
                    class519 var7 = this.field5316[var6];
                    if (var7.method3019(this.field5321, this.field5317, this.field5310, this.field5314)) {
                        var5[this.field5326] = var7.field7286;
                        this.field5331[this.field5326++] = var7;
                    }
                }
                class617.method3446(this.field5326 - 1, 14247, this.field5331, var5, 0);
            }
            this.field5324 = true;
        }
        field5322++;
        boolean var8 = false;
        if (arg2 != -44) {
            field5328 = null;
        }
        if (this.field5324) {
            this.field5324 = false;
            for (int var9 = this.field5326 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5331[var9].method3013(arg0, this.field5313);
                var8 |= var10;
                this.field5324 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public static void method2335(int arg0) {
        field5325 = null;
        if (arg0 != 8384) {
            field5325 = null;
        }
        field5323 = null;
        field5309 = null;
        field5318 = null;
        field5330 = null;
        field5308 = null;
        field5328 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(III)B")
    public static final byte method2336(int arg0, int arg1, int arg2) {
        field5327++;
        if (arg2 != 9218) {
            return 105;
        } else if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIIILha;II)V")
    public final void method2337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class60 arg7, int arg8, int arg9) {
        if (arg6 != 1093) {
            field5330 = null;
        }
        field5312++;
        int var11 = arg3 + arg4 & 0x3FFF;
        if (this.field5315 == -1 || this.field5311 == 0) {
            arg7.method528(arg2, arg9, arg1, arg5, arg0, 0);
        } else {
            class537 var12 = class313.field4094.method1072(this.field5315, true);
            if (this.field5320 == null && class313.field4094.method1071((byte) 119, this.field5315)) {
                int[] var13 = var12.field7450 == 2 ? class313.field4094.method1068(this.field5311, 0.7F, this.field5315, arg6 ^ 0xFFFFA336, false, this.field5311) : class313.field4094.method1069(this.field5311, this.field5315, false, this.field5311, 0.7F, 6766);
                this.field5320 = arg7.method435(this.field5311, 0, this.field5311, 121, var13, this.field5311);
            }
            if (var12.field7450 == 2) {
                arg7.method528(arg2, arg9, arg1, arg5, arg0, 0);
            }
            if (this.field5320 != null) {
                int var14 = var12.field7450 == 2 ? 1 : 0;
                int var15 = arg5 * arg8 / -4096;
                int var16;
                for (var16 = (arg1 - arg5) / 2 + (arg5 * var11 / 4096); var16 > arg5; var16 -= arg5) {
                }
                while (arg5 < var15) {
                    var15 -= arg5;
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg1; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field5320.method2761(var17 + arg2, arg9 + var18, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field5326 - 1; var19 >= 0; var19--) {
            this.field5331[var19].method3015(arg7, arg2, arg9, arg1, arg5, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2338(int arg0, String arg1) {
        field5319++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        if (arg0 != 3) {
            field5328 = null;
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
    public final void method2339(int arg0) {
        if (this.field5316 != null) {
            for (int var2 = 0; var2 < this.field5316.length; var2++) {
                this.field5316[var2].method3009();
            }
        }
        field5329++;
        this.field5320 = null;
        if (arg0 != 23143) {
            this.field5317 = -61;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "()V")
    public static final void method2340() {
        for (int var0 = class86.field1189; var0 < class29.field515; var0++) {
            for (int var1 = 0; var1 < class289.field3784; var1++) {
                for (int var2 = 0; var2 < class463.field6223; var2++) {
                    class14 var3 = class197.field2689[var0][var1][var2];
                    if (var3 != null) {
                        class374 var4 = var3.field278;
                        class374 var5 = var3.field283;
                        if (var4 != null && var4.method759(0)) {
                            class739.method4117(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method759(0)) {
                                class739.method4117(var5, var0, var1, var2, 1, 1);
                                var5.method754(30558, 0, var4, class681.field9504, false, 0, 0);
                                var5.method749((byte) -67);
                            }
                            var4.method749((byte) -101);
                        }
                        for (class621 var6 = var3.field289; var6 != null; var6 = var6.field8560) {
                            class556 var8 = var6.field8559;
                            if (var8 != null && var8.method759(0)) {
                                class739.method4117(var8, var0, var1, var2, var8.field7741 + 1 - var8.field7734, var8.field7744 - var8.field7746 + 1);
                                var8.method749((byte) -80);
                            }
                        }
                        class118 var7 = var3.field279;
                        if (var7 != null && var7.method759(0)) {
                            class647.method3630(var7, var0, var1, var2);
                            var7.method749((byte) -56);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I[Ldn;IIII)V")
    public class417(int arg0, class519[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5321 = arg3;
        this.field5310 = arg5;
        this.field5316 = arg1;
        this.field5317 = arg4;
        this.field5315 = arg0;
        if (arg1 == null) {
            this.field5313 = null;
            this.field5331 = null;
        } else {
            this.field5331 = new class519[arg1.length];
            this.field5313 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
