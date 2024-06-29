import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class366 extends class756 implements class450 {

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    private int field5964;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5966 = new String[] { method3033(method3032("v%TF\u0003w;\u000eDB")), method3033(method3032("w'\u0016\u0016")), method3033(method3032("b|TT\u0017")), method3033(method3032("v%T?B")), method3033(method3032("v%T<B")), method3033(method3032("v%T;B")), method3033(method3032("v%T2B")), method3033(method3032("v%T3B")), method3033(method3032("v%T>B")), method3033(method3032("v%T=B")), method3033(method3032("v%T9B")) };

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "Lko;")
    public static class532 field5963 = new class532("", 15);

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lpe;")
    public static class636 field5965 = new class636(0, 2, 2, 1);

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)I", line = 3)
    public final int method3024(byte arg0) {
        try {
            ++field5956;
            return arg0 != 46 ? -12 : this.field5964;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5966[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)J", line = 14)
    public final long method3025(int arg0) {
        try {
            if (arg0 <= 14) {
                field5963 = null;
            }
            ++field5959;
            return super.field11114.getAddress();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5966[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZ)V", line = 25)
    public static final void method3026(int arg0, boolean arg1) {
        try {
            class595.field8594.method2461(class761.field11182.method271());
            if (arg0 <= 75) {
                method3026(-73, false);
            }
            ++field5960;
            int[] var2 = class761.field11182.method212();
            class746.field10997 = var2[0];
            class468.field7187 = var2[1];
            class392.field6246 = var2[3];
            class98.field1437 = var2[2];
            if (!arg1) {
                class761.field11182.method156(class401.field6335, class25.field277, class22.field213, class543.field7990);
                class625.method4563(class784.field11456, -77);
            } else {
                class761.field11182.method156(class304.field4916, class698.field10049, class768.field11242, class690.field9956);
                class625.method4563(class656.field9405, -96);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5966[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)I", line = 56)
    public final int method3027(byte arg0) {
        try {
            if (arg0 <= 30) {
                return -88;
            } else {
                ++field5958;
                return 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5966[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[BII)V", line = 70)
    public final void method3028(int arg0, byte[] arg1, int arg2, int arg3) {
        try {
            ++field5957;
            this.method5470(arg1, arg0);
            this.field5964 = arg2;
            int var5 = 98 % ((12 - arg3) / 50);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5966[5] + arg0 + ',' + (arg1 != null ? field5966[2] : field5966[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([IZ[ILns;[I)V", line = 83)
    public static final void method3029(int[] arg0, boolean arg1, int[] arg2, class426 arg3, int[] arg4) {
        try {
            ++field5961;
            if (arg1) {
                for (int var5 = 0; ~arg4.length < ~var5; ++var5) {
                    int var6 = arg4[var5];
                    int var7 = arg0[var5];
                    int var8 = arg2[var5];
                    for (int var9 = 0; ~var7 != -1 && var9 < arg3.field1176.length; ++var9) {
                        if ((var7 & 1) != 0) {
                            if (~var6 != 0) {
                                class210 var10 = class397.field6293.method2058(var6, (byte) -124);
                                int var11 = var10.field3338;
                                class494 var12 = arg3.field1176[var9];
                                if (var12 != null) {
                                    if (~var12.field7422 == ~var6) {
                                        if (var11 == 0) {
                                            var12 = arg3.field1176[var9] = null;
                                        } else if (~var11 == -2) {
                                            var12.field7423 = 1;
                                            var12.field7427 = var8;
                                            var12.field7433 = 0;
                                            var12.field7424 = 0;
                                            var12.field7434 = 0;
                                            if (!arg3.field1120) {
                                                class531.method3967(-119, var10, 0, arg3);
                                            }
                                        } else if (~var11 == -3) {
                                            var12.field7433 = 0;
                                        }
                                    } else if (var10.field3333 >= class397.field6293.method2058(var12.field7422, (byte) -8).field3333) {
                                        var12 = arg3.field1176[var9] = null;
                                    }
                                }
                                if (var12 == null) {
                                    class494 var13 = arg3.field1176[var9] = new class494();
                                    var13.field7427 = var8;
                                    var13.field7422 = var6;
                                    var13.field7424 = 0;
                                    var13.field7433 = 0;
                                    var13.field7434 = 0;
                                    var13.field7423 = 1;
                                    if (!arg3.field1120) {
                                        class531.method3967(-82, var10, 0, arg3);
                                    }
                                }
                            } else {
                                arg3.field1176[var9] = null;
                            }
                        }
                        var7 >>>= 1;
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field5966[8] + (arg0 != null ? field5966[2] : field5966[1]) + ',' + arg1 + ',' + (arg2 != null ? field5966[2] : field5966[1]) + ',' + (arg3 != null ? field5966[2] : field5966[1]) + ',' + (arg4 != null ? field5966[2] : field5966[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lvf;I[BI)V", line = 183)
    public class366(class159 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field5964 = arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5966[0] + (arg0 != null ? field5966[2] : field5966[1]) + ',' + arg1 + ',' + (arg2 != null ? field5966[2] : field5966[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lvf;ILjaclib/memory/Buffer;)V", line = 192)
    public class366(class159 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        try {
            this.field5964 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5966[0] + (arg0 != null ? field5966[2] : field5966[1]) + ',' + arg1 + ',' + (arg2 != null ? field5966[2] : field5966[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V", line = 200)
    public static final void method3030(int arg0, int arg1) {
        try {
            ++field5962;
            class670 var2 = (class670) class700.field10071.method737((byte) -39, (long) arg1);
            if (var2 != null) {
                var2.field9522 = !var2.field9522;
                var2.field9518.method3063(var2.field9522, true);
            }
            if (arg0 != -28014) {
                method3026(-42, true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5966[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(B)V", line = 222)
    public static void method3031(byte arg0) {
        try {
            field5963 = null;
            field5965 = null;
            if (arg0 != 89) {
                field5965 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5966[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3032(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 106);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3033(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
