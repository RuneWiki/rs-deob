import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class784 extends class206 {

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "Ljava/lang/String;")
    public String field11419;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11423 = new String[] { method5677(method5676("Co|\u0013t\u0005")), method5677(method5676("V\"3\u0013K")), method5677(method5676("CyqQ")), method5677(method5676("C\u007fs\u000f")), method5677(method5676("C\u007fs\f")), method5677(method5676("C\u007fs\r")), method5677(method5676("Co|\u0013r\u0005")), method5677(method5676("C\u007fs\u000e")), method5677(method5676("Co|\u0013u\u0005")), method5677(method5676("Co|\u0013w\u0005")), method5677(method5676("Co|\u0013\nDbtI\b\u0005")) };

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field11418;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    public static int field11421;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public static int field11422;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "[Lkq;")
    public static class619[] field11420;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 5)
    public static void method5672(int arg0) {
        try {
            field11420 = null;
            int var1 = -67 / ((arg0 - 55) / 59);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11423[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)I", line = 14)
    public static final int method5673(int arg0, int arg1, int arg2) {
        try {
            field11421++;
            int var3 = arg1;
            while (arg0 > 1) {
                if ((arg0 & 0x1) != 0) {
                    var3 = arg2 * var3;
                }
                arg0 >>= 0x1;
                arg2 *= arg2;
            }
            if (arg0 == 1) {
                return arg2 * var3;
            } else {
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11423[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLub;)V", line = 41)
    public static final void method5674(byte arg0, class22 arg1) {
        try {
            field11422++;
            int var2 = 0;
            arg1.method155(655076648);
            if (arg0 <= -100) {
                for (int var3 = 0; var3 < class3.field34; var3++) {
                    int var4 = class358.field5483[var3];
                    if ((class188.field2579[var4] & 0x1) == 0) {
                        if (var2 > 0) {
                            var2--;
                            class188.field2579[var4] = (byte) class544.method4107(class188.field2579[var4], 2);
                        } else {
                            int var5 = arg1.method156(-10160, 1);
                            if (var5 == 0) {
                                var2 = class268.method2226(arg1, false);
                                class188.field2579[var4] = (byte) class544.method4107(class188.field2579[var4], 2);
                            } else {
                                class275.method2273(43, arg1, var4);
                            }
                        }
                    }
                }
                arg1.method154(3);
                if (var2 != 0) {
                    throw new RuntimeException(field11423[5]);
                }
                arg1.method155(655076648);
                for (int var6 = 0; var6 < class3.field34; var6++) {
                    int var7 = class358.field5483[var6];
                    if ((class188.field2579[var7] & 0x1) != 0) {
                        if (var2 > 0) {
                            class188.field2579[var7] = (byte) class544.method4107(class188.field2579[var7], 2);
                            var2--;
                        } else {
                            int var8 = arg1.method156(-10160, 1);
                            if (var8 == 0) {
                                var2 = class268.method2226(arg1, false);
                                class188.field2579[var7] = (byte) class544.method4107(class188.field2579[var7], 2);
                            } else {
                                class275.method2273(43, arg1, var7);
                            }
                        }
                    }
                }
                arg1.method154(3);
                if (var2 != 0) {
                    throw new RuntimeException(field11423[4]);
                }
                arg1.method155(655076648);
                for (int var9 = 0; var9 < class85.field949; var9++) {
                    int var10 = class534.field7824[var9];
                    if ((class188.field2579[var10] & 0x1) != 0) {
                        if (var2 > 0) {
                            class188.field2579[var10] = (byte) class544.method4107(class188.field2579[var10], 2);
                            var2--;
                        } else {
                            int var11 = arg1.method156(-10160, 1);
                            if (var11 == 0) {
                                var2 = class268.method2226(arg1, false);
                                class188.field2579[var10] = (byte) class544.method4107(class188.field2579[var10], 2);
                            } else if (class423.method3266(var10, (byte) -54, arg1)) {
                                class188.field2579[var10] = (byte) class544.method4107(class188.field2579[var10], 2);
                            }
                        }
                    }
                }
                arg1.method154(3);
                if (var2 != 0) {
                    throw new RuntimeException(field11423[3]);
                }
                arg1.method155(655076648);
                for (int var12 = 0; var12 < class85.field949; var12++) {
                    int var13 = class534.field7824[var12];
                    if ((class188.field2579[var13] & 0x1) == 0) {
                        if (var2 > 0) {
                            class188.field2579[var13] = (byte) class544.method4107(class188.field2579[var13], 2);
                            var2--;
                        } else {
                            int var14 = arg1.method156(-10160, 1);
                            if (var14 == 0) {
                                var2 = class268.method2226(arg1, false);
                                class188.field2579[var13] = (byte) class544.method4107(class188.field2579[var13], 2);
                            } else if (class423.method3266(var13, (byte) -86, arg1)) {
                                class188.field2579[var13] = (byte) class544.method4107(class188.field2579[var13], 2);
                            }
                        }
                    }
                }
                arg1.method154(3);
                if (var2 != 0) {
                    throw new RuntimeException(field11423[7]);
                }
                class3.field34 = 0;
                class85.field949 = 0;
                for (int var15 = 1; var15 < 2048; var15++) {
                    class188.field2579[var15] = (byte) (class188.field2579[var15] >> 1);
                    class726 var16 = class197.field2685[var15];
                    if (var16 == null) {
                        class534.field7824[class85.field949++] = var15;
                    } else {
                        class358.field5483[class3.field34++] = var15;
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field11423[6] + arg0 + ',' + (arg1 == null ? field11423[2] : field11423[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/lang/String;Z)V", line = 243)
    public static final void method5675(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
        try {
            if (arg1 == 1) {
                class377.method3038(arg2, null, false, false, arg3, arg4, arg0);
                field11418++;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11423[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11423[2] : field11423[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V", line = 254)
    public class784() {
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 257)
    public class784(String arg0, int arg1) {
        try {
            this.field11419 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11423[10] + (arg0 == null ? field11423[2] : field11423[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5676(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5677(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
