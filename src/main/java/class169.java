import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class169 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[J")
    public static long[] field2796 = new long[1000];

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    public static int[] field2797 = new int[50];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lvh;")
    public static class108 field2791;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2791 = null;
        if (arg0 <= -127) {
            field2797 = null;
            field2796 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ldl;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1144(class46 arg0, int arg1, String arg2) {
        if (arg1 >= -89) {
            return null;
        }
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
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
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class231.field3866 != null) {
                                                            if (class231.field3866.field2859 == null) {
                                                                var9 = class136.method952(-128, class231.field3866.field2860);
                                                            } else {
                                                                var9 = (String) class231.field3866.field2859;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class270.method1772(class216.method1439(arg0, 4, -1), 24096) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class270.method1772(class216.method1439(arg0, 3, -1), 24096) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class270.method1772(class216.method1439(arg0, 2, -1), 24096) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class270.method1772(class216.method1439(arg0, 1, -1), 24096) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class270.method1772(class216.method1439(arg0, 0, -1), 24096) + arg2.substring(var3 + 2);
            }
        }
        field2792++;
        return arg2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
    public static final void method1145(byte arg0, int arg1) {
        class4.field46 = new int[arg1];
        class217.field3665 = new int[arg1];
        class201.field3307 = new int[arg1];
        if (arg0 <= -61) {
            class196.field3176 = new int[arg1];
            class78.field1337 = new int[arg1];
            field2793++;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)I")
    public static final int method1146(int arg0, boolean arg1) {
        field2795++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFB4) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        if (var4 < var2) {
            var8 = var4;
        }
        double var12 = var2;
        if (var2 < var4) {
            var12 = var4;
        }
        if (var12 < var6) {
            var12 = var6;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var14 = (var8 + var12) / 2.0D;
        if (!arg1) {
            field2796 = null;
        }
        double var16 = 0.0D;
        if (var8 != var12) {
            if (var14 < 0.5D) {
                var16 = (var12 - var8) / (var8 + var12);
            }
            if (var2 == var12) {
                var10 = (var4 - var6) / (var12 - var8);
            } else if (var4 == var12) {
                var10 = (var6 - var2) / (var12 - var8) + 2.0D;
            } else if (var6 == var12) {
                var10 = (var2 - var4) / (var12 - var8) + 4.0D;
            }
            if (var14 >= 0.5D) {
                var16 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        int var19 = (int) (var16 * 256.0D);
        double var20 = var10 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var18 >> 1) + (var19 >> 5 << 7);
    }
}
