import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class563 {

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Ljn;")
    private class117 field8213 = new class117(64);

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "Lvo;")
    private class345 field8218;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lqca;")
    public static class330 field8207 = new class330(0, -1);

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field8217 = 0;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "[[I")
    public static int[][] field8219 = new int[6][];

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lvo;")
    public static class345 field8216;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static void method3289(byte arg0) {
        if (arg0 < 15) {
            method3293(33);
        }
        field8216 = null;
        field8207 = null;
        field8219 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public final void method3290(int arg0) {
        field8208++;
        class117 var2 = this.field8213;
        synchronized (this.field8213) {
            if (arg0 >= 76) {
                this.field8213.method950((byte) 58);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI[[[Lko;IIZ)Z")
    public static final boolean method3291(boolean arg0, int arg1, class293[][][] arg2, int arg3, int arg4, boolean arg5) {
        field8220++;
        byte var6 = arg5 ? 1 : (byte) (client.field1377 & 0xFF);
        if (class468.field6756[class416.field5926][arg1][arg4] == var6) {
            return false;
        } else if ((class548.field8052[class416.field5926][arg1][arg4] & 0x4) == 0) {
            return false;
        } else {
            if (!arg0) {
                method3293(71);
            }
            byte var7 = 0;
            int var8 = 0;
            class665.field9351[var7] = arg1;
            int var35 = var7 + 1;
            class434.field6251[var7] = arg4;
            class468.field6756[class416.field5926][arg1][arg4] = var6;
            while (var35 != var8) {
                int var9 = class665.field9351[var8] & 0xFFFF;
                int var10 = class665.field9351[var8] >> 16 & 0xFF;
                int var11 = class665.field9351[var8] >> 24 & 0xFF;
                int var12 = class434.field6251[var8] & 0xFFFF;
                int var13 = class434.field6251[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class548.field8052[class416.field5926][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class416.field5926 + 1; var16 <= 3; var16++) {
                    if ((class548.field8052[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field4091 != null) {
                                int var20 = class400.method2430(var10, 78);
                                if (arg2[var16][var9][var12].field4091.field3077 == var20 || arg2[var16][var9][var12].field4095 != null && arg2[var16][var9][var12].field4095.field3077 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class400.method2430(var11, 100);
                                    if (arg2[var16][var9][var12].field4091.field3077 == var21 || arg2[var16][var9][var12].field4095 != null && arg2[var16][var9][var12].field4095.field3077 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class400.method2430(var13, 70);
                                    if (arg2[var16][var9][var12].field4091.field3077 == var22 || arg2[var16][var9][var12].field4095 != null && arg2[var16][var9][var12].field4095.field3077 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class293 var23 = arg2[var16][var9][var12];
                            if (var23.field4097 != null) {
                                for (class198 var24 = var23.field4097; var24 != null; var24 = var24.field3078) {
                                    class144 var25 = var24.field3085;
                                    if (var25 instanceof class394) {
                                        class394 var26 = (class394) var25;
                                        int var27 = var26.method907(false);
                                        int var28 = var26.method904(-15140);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class293 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field4097 != null) {
                            for (class198 var31 = var30.field4097; var31 != null; var31 = var31.field3078) {
                                class144 var32 = var31.field3085;
                                if (var32.field2483 != var32.field2481 || var32.field2486 != var32.field2484) {
                                    for (int var33 = var32.field2481; var33 <= var32.field2483; var33++) {
                                        for (int var34 = var32.field2484; var34 <= var32.field2486; var34++) {
                                            class468.field6756[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class468.field6756[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class687.field9745[class416.field5926 + 1].method3858(var12, var9, (byte) 44);
                    if (var17 > class224.field3362[arg3]) {
                        class224.field3362[arg3] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class213.field3240[arg3]) {
                        class213.field3240[arg3] = var18;
                    } else if (var18 > class80.field1208[arg3]) {
                        class80.field1208[arg3] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class301.field4225[arg3]) {
                        class301.field4225[arg3] = var19;
                    } else if (class677.field9636[arg3] < var19) {
                        class677.field9636[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class468.field6756[class416.field5926][var9 - 1][var12] != var6) {
                        class665.field9351[var35] = class460.method2676(-754974720, class460.method2676(var9 - 1, 1179648));
                        class434.field6251[var35] = class460.method2676(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class468.field6756[class416.field5926][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class580.field8504) {
                        if ((var9 - 1) >= 0 && class468.field6756[class416.field5926][var9 - 1][var12] != var6 && (class548.field8052[class416.field5926][var9][var12] & 0x4) == 0 && (class548.field8052[class416.field5926][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class665.field9351[var35] = class460.method2676(class460.method2676(var9 - 1, 1179648), 1375731712);
                            class434.field6251[var35] = class460.method2676(var12, 1245184);
                            class468.field6756[class416.field5926][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class468.field6756[class416.field5926][var9][var12] != var6) {
                            class665.field9351[var35] = class460.method2676(class460.method2676(5373952, var9), 318767104);
                            class434.field6251[var35] = class460.method2676(var12, 5439488);
                            class468.field6756[class416.field5926][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class430.field6136 && class468.field6756[class416.field5926][var9 + 1][var12] != var6 && (class548.field8052[class416.field5926][var9][var12] & 0x4) == 0 && (class548.field8052[class416.field5926][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class665.field9351[var35] = class460.method2676(-1845493760, class460.method2676(var9 + 1, 5373952));
                            class434.field6251[var35] = class460.method2676(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6756[class416.field5926][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class430.field6136 > (var9 + 1) && class468.field6756[class416.field5926][var9 + 1][var12] != var6) {
                        class665.field9351[var35] = class460.method2676(1392508928, class460.method2676(var9 + 1, 9568256));
                        class434.field6251[var35] = class460.method2676(var12, 9633792);
                        class468.field6756[class416.field5926][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class468.field6756[class416.field5926][var9 - 1][var12] != var6 && (class548.field8052[class416.field5926][var9][var12] & 0x4) == 0 && (class548.field8052[class416.field5926][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class665.field9351[var35] = class460.method2676(301989888, class460.method2676(13762560, var9 - 1));
                            class434.field6251[var35] = class460.method2676(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6756[class416.field5926][var9 - 1][var12] = var6;
                        }
                        if (class468.field6756[class416.field5926][var9][var12] != var6) {
                            class665.field9351[var35] = class460.method2676(-1828716544, class460.method2676(13762560, var9));
                            class434.field6251[var35] = class460.method2676(13828096, var12);
                            class468.field6756[class416.field5926][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class430.field6136 > var9 + 1 && class468.field6756[class416.field5926][var9 + 1][var12] != var6 && (class548.field8052[class416.field5926][var9][var12] & 0x4) == 0 && (class548.field8052[class416.field5926][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class665.field9351[var35] = class460.method2676(class460.method2676(var9 + 1, 9568256), -771751936);
                            class434.field6251[var35] = class460.method2676(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6756[class416.field5926][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class224.field3362[arg3] != -1000000) {
                class224.field3362[arg3] += 40;
                class213.field3240[arg3] -= 512;
                class80.field1208[arg3] += 512;
                class677.field9636[arg3] += 512;
                class301.field4225[arg3] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)Lma;")
    public final class594 method3292(byte arg0, int arg1) {
        field8214++;
        class117 var3 = this.field8213;
        class594 var4;
        synchronized (this.field8213) {
            var4 = (class594) this.field8213.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field8218;
        byte[] var6;
        synchronized (this.field8218) {
            var6 = this.field8218.method2081(-12, class653.method3684(false, arg1), class21.method213(true, arg1));
        }
        class594 var7 = new class594();
        if (var6 != null) {
            var7.method3401(new class465(var6), (byte) 113);
        }
        class117 var8 = this.field8213;
        synchronized (this.field8213) {
            this.field8213.method949((long) arg1, true, var7);
        }
        if (arg0 != 4) {
            field8217 = 76;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public static final void method3293(int arg0) {
        field8209++;
        try {
            int var1 = -19 % ((arg0 - 32) / 35);
            if (class568.field8311 == 1) {
                int var2 = class43.field585.method1824(100);
                if (var2 > 0 && class43.field585.method1803((byte) 93)) {
                    int var3 = var2 - class434.field6249;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class43.field585.method1802(var3, (byte) 108);
                    return;
                }
                class43.field585.method1812(-1);
                class43.field585.method1835((byte) 111);
                class129.field2099 = null;
                if (class586.field8566 == null) {
                    class568.field8311 = 0;
                } else {
                    class568.field8311 = 2;
                }
                class244.field3570 = null;
            }
            if (class568.field8311 == 3) {
                int var4 = class43.field585.method1824(100);
                if (var4 < class309.field4295 && class43.field585.method1803((byte) 90)) {
                    int var5 = class183.field2891 + var4;
                    if (var5 > class309.field4295) {
                        var5 = class309.field4295;
                    }
                    class43.field585.method1802(var5, (byte) -122);
                } else {
                    class568.field8311 = 0;
                    class183.field2891 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class43.field585.method1812(-1);
            class244.field3570 = null;
            class568.field8311 = 0;
            class129.field2099 = null;
            class484.field6903 = null;
            class586.field8566 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3294(int arg0, String arg1) {
        field8211++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 1375731712) {
            method3289((byte) 72);
        }
        while (var4 < var2) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
            var4++;
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
        return var5.toString();
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public static final void method3295(byte arg0) {
        class433.field6238.method936(arg0 - 4);
        if (arg0 == -109) {
            field8212++;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method3296(int arg0) {
        class117 var2 = this.field8213;
        synchronized (this.field8213) {
            this.field8213.method936(-45);
        }
        if (arg0 != 13163) {
            method3294(-88, null);
        }
        field8215++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public final void method3297(int arg0, int arg1) {
        class117 var3 = this.field8213;
        synchronized (this.field8213) {
            int var4 = 40 / ((-arg1 - 50) / 51);
            this.field8213.method936(-107);
            this.field8213 = new class117(arg0);
        }
        field8210++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)V")
    public final void method3298(int arg0, byte arg1) {
        class117 var3 = this.field8213;
        synchronized (this.field8213) {
            if (arg1 <= 123) {
                return;
            }
            this.field8213.method939(28093, arg0);
        }
        field8221++;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lgn;ILvo;)V")
    public class563(class529 arg0, int arg1, class345 arg2) {
        this.field8218 = arg2;
        if (this.field8218 != null) {
            int var4 = this.field8218.method2102(true) - 1;
            this.field8218.method2098(0, var4);
        }
    }
}
