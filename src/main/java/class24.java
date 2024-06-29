import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class24 implements class30 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lln;")
    public static class211 field302;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method169(String arg0, int arg1) {
        field305++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class247.field3533; var2++) {
            if (arg0.equalsIgnoreCase(class334.field4733[var2])) {
                return var2;
            }
        }
        if (arg1 >= -108) {
            method173((byte) 107);
        }
        return -1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lol;IIIII)V")
    public static final void method170(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1911 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class229.field3232[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class12 var11 = class266.field3800[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field1911; var12++) {
                            if (arg0.field1910[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field1910[arg0.field1911++] = var11;
                        if (arg0.field1911 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field1911; var13 < 4; var13++) {
            arg0.field1910[var13] = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
    public final String method171(int[] arg0, int arg1, long arg2, int arg3) {
        field303++;
        if (arg1 == 0) {
            class150 var6 = class8.method62(-81, arg0[0]);
            return var6.method912((int) arg2, (byte) 21);
        } else if (arg1 == 1 || arg1 == 10) {
            class163 var7 = class50.method288(0, (int) arg2);
            return var7.field2238;
        } else if (arg3 >= -2) {
            return null;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class8.method62(113, arg0[0]).method912((int) arg2, (byte) 98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
    public static final void method172(boolean arg0, byte arg1) {
        field304++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class109.field1346;
            var3 = 1;
        } else {
            var2 = class212.field3019;
            var3 = 4;
        }
        int var4 = -126 / ((arg1 - 16) / 57);
        for (int var5 = 0; var5 < var3; var5++) {
            class356.method2270(false);
            for (int var6 = 0; var6 < (class176.field2403 >> 3); var6++) {
                for (int var7 = 0; var7 < (class383.field5395 >> 3); var7++) {
                    int var8 = class330.field4670[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3465157) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class33.field380.length; var14++) {
                                if (class33.field380[var14] == var13 && var2[var14] != null) {
                                    class356.method2271(class102.field1247, (byte) 120, var9, class151.field1873, var2[var14], arg0, (var12 & 0x7) * 8, var10, var6 * 8, (var11 & 0x7) * 8, var5, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method173(byte arg0) {
        field302 = null;
        int var1 = -101 / ((-arg0 - 85) / 40);
    }
}
