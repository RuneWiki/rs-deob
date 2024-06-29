import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class52 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lsf;")
    public static class108 field767 = class140.method973(255, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field762 = 0;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "S")
    public static short field773 = 32767;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[J")
    public static long[] field775 = new long[32];

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ldh;")
    public static class171 field774;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public static int[] field764;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BI)V", line = 7)
    public static final void method366(byte[] arg0, int arg1) {
        field772++;
        class249 var2 = new class249(arg0);
        var2.field4314 = arg0.length - 2;
        class196.field3546 = var2.method1712(-1);
        class273.field4795 = new int[class196.field3546];
        class39.field542 = new byte[class196.field3546][];
        class154.field2775 = new int[class196.field3546];
        class236.field4142 = new boolean[class196.field3546];
        class155.field2780 = new int[class196.field3546];
        class88.field1383 = new int[class196.field3546];
        class94.field1512 = new byte[class196.field3546][];
        var2.field4314 = arg0.length - (class196.field3546 * 8) - 7;
        class95.field1519 = var2.method1712(-1);
        class197.field3560 = var2.method1712(~arg1);
        int var3 = (var2.method1731(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class196.field3546; var4++) {
            class154.field2775[var4] = var2.method1712(-1);
        }
        for (int var5 = 0; var5 < class196.field3546; var5++) {
            class88.field1383[var5] = var2.method1712(-1);
        }
        for (int var6 = 0; var6 < class196.field3546; var6++) {
            class155.field2780[var6] = var2.method1712(-1);
        }
        for (int var7 = 0; var7 < class196.field3546; var7++) {
            class273.field4795[var7] = var2.method1712(class84.method565(arg1, -1));
        }
        var2.field4314 = arg0.length + 3 - (var3 * 3 + (class196.field3546 * 8) + 7);
        class321.field5494 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class321.field5494[var8] = var2.method1749(false);
            if (class321.field5494[var8] == 0) {
                class321.field5494[var8] = 1;
            }
        }
        var2.field4314 = arg1;
        for (int var9 = 0; var9 < class196.field3546; var9++) {
            int var10 = class155.field2780[var9];
            int var11 = class273.field4795[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class94.field1512[var9] = var13;
            byte[] var14 = new byte[var12];
            class39.field542[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method1731(true);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1721((byte) 110);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1721((byte) 60);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label97;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method1721((byte) 111);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var20] = var2.method1721((byte) 72);
                    }
                    var20++;
                }
            }
            class236.field4142[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 172)
    public static final void method367(int arg0) {
        if (arg0 >= -73) {
            method369(87, (byte) 20);
        }
        class317.field5451.method639(-112);
        class286.field5000.method639(-93);
        field776++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILrm;Z)Lsf;", line = 191)
    public static final class108 method368(int arg0, class249 arg1, boolean arg2) {
        field763++;
        try {
            if (!arg2) {
                field773 = -127;
            }
            class108 var3 = new class108();
            var3.field1870 = arg1.method1739((byte) -62);
            if (var3.field1870 > arg0) {
                var3.field1870 = arg0;
            }
            var3.field1884 = new byte[var3.field1870];
            arg1.field4314 += class122.field2088.method165(var3.field1884, arg1.field4314, var3.field1870, 0, arg1.field4338, -125);
            return var3;
        } catch (Exception var5) {
            return class229.field3997;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V", line = 218)
    public static final void method369(int arg0, byte arg1) {
        if (class8.field100 == null || class8.field100.length < arg0) {
            class8.field100 = new int[arg0];
        }
        field765++;
        if (arg1 < 33) {
            field771 = 20;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)[B", line = 234)
    public static final synchronized byte[] method370(byte arg0, int arg1) {
        field770++;
        if (arg1 == 100 && class131.field2254 > 0) {
            byte[] var2 = class9.field112[--class131.field2254];
            class9.field112[class131.field2254] = null;
            return var2;
        } else if (arg1 == 5000 && class96.field1547 > 0) {
            byte[] var3 = class328.field5599[--class96.field1547];
            class328.field5599[class96.field1547] = null;
            return var3;
        } else if (arg1 == 30000 && class327.field5584 > 0) {
            byte[] var4 = class168.field3021[--class327.field5584];
            class168.field3021[class327.field5584] = null;
            return var4;
        } else {
            int var5 = -50 % ((-arg0 - 33) / 48);
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 276)
    public static void method371(int arg0) {
        field774 = null;
        field767 = null;
        field775 = null;
        if (arg0 == 255) {
            field764 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 292)
    public static final int method372(int arg0, int arg1) {
        if (arg1 < 67) {
            return 106;
        } else {
            field768++;
            return arg0 & 0x7F;
        }
    }
}
