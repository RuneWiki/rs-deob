import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class281 extends class96 {

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "I")
    public static int field3589 = 100;

    @OriginalMember(owner = "client!wq", name = "Q", descriptor = "[I")
    public static int[] field3595;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!wq", name = "R", descriptor = "I")
    public static int field3596;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wq", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field3597;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1722(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class169("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field3595 = new int[256];
    }

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "(I)V", line = 7)
    public static void method1719(int arg0) {
        int var1 = 43 % ((-12 - arg0) / 48);
        field3595 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[[I", line = 16)
    public final int[][] method36(int arg0, int arg1) {
        ++field3591;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, arg0 + -61, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class269.field3403 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 63)
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILbt;)V", line = 70)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3594;
        if (~arg0 == arg1) {
            super.field1329 = arg2.method617(2) == 1;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILqa;IIIII)V", line = 91)
    public static final void method1720(int arg0, int arg1, int arg2, class129 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 == 0) {
            ++field3590;
            class323 var9 = (class323) class67.method384(arg4, arg0, arg8);
            if (var9 != null) {
                class402 var10 = class52.field715.method1164(var9.method413(-30502), 0);
                int var11 = 3 & var9.method415(-15317);
                int var12 = var9.method414(17350);
                if (var10.field5379 == -1) {
                    int var13 = arg1;
                    if (~var10.field5347 < -1) {
                        var13 = arg7;
                    }
                    if (var12 == 0 || ~var12 == -3) {
                        if (var11 != 0) {
                            if (var11 == 1) {
                                arg3.method920(1, arg5, arg6, var13, 4);
                            } else if (var11 != 2) {
                                if (~var11 == -4) {
                                    arg3.method920(1, arg5, arg6 - -3, var13, 4);
                                }
                            } else {
                                arg3.method826(var13, 4, arg6, (byte) 53, arg5 + 3);
                            }
                        } else {
                            arg3.method826(var13, 4, arg6, (byte) 53, arg5);
                        }
                    }
                    if (~var12 == -4) {
                        if (~var11 == -1) {
                            arg3.method866(1, -5152, arg5, 1, arg6, var13);
                        } else if (var11 == 1) {
                            arg3.method866(1, -5152, arg5 + 3, 1, arg6, var13);
                        } else if (~var11 != -3) {
                            if (var11 == 3) {
                                arg3.method866(1, -5152, arg5, 1, arg6 + 3, var13);
                            }
                        } else {
                            arg3.method866(1, -5152, arg5 - -3, 1, arg6 + 3, var13);
                        }
                    }
                    if (~var12 == -3) {
                        if (var11 != 0) {
                            if (var11 == 1) {
                                arg3.method826(var13, 4, arg6, (byte) 53, arg5 + 3);
                            } else if (var11 != 2) {
                                if (var11 == 3) {
                                    arg3.method826(var13, 4, arg6, (byte) 53, arg5);
                                }
                            } else {
                                arg3.method920(1, arg5, arg6 + 3, var13, 4);
                            }
                        } else {
                            arg3.method920(1, arg5, arg6, var13, 4);
                        }
                    }
                } else {
                    class51.method306(arg3, (byte) -1, arg5, arg6, var10, var11);
                }
            }
            class323 var14 = (class323) class346.method2038(arg4, arg0, arg8, field3597 != null ? field3597 : (field3597 = method1722("wk")));
            if (var14 != null) {
                class402 var15 = class52.field715.method1164(var14.method413(-30502), 0);
                int var16 = var14.method415(arg2 + -15317) & 3;
                int var17 = var14.method414(17350);
                if (~var15.field5379 != 0) {
                    class51.method306(arg3, (byte) -1, arg5, arg6, var15, var16);
                } else if (var17 == 9) {
                    int var18 = -1118482;
                    if (var15.field5347 > 0) {
                        var18 = -1179648;
                    }
                    if (~var16 != -1 && ~var16 != -3) {
                        arg3.method910(var18, arg5, arg5 - -3, arg6, arg6 - -3, arg2 + -71);
                    } else {
                        arg3.method910(var18, arg5, arg5 + 3, arg6 + 3, arg6, arg2 + -25);
                    }
                }
            }
            class323 var19 = (class323) class205.method1342(arg4, arg0, arg8);
            if (var19 != null) {
                class402 var20 = class52.field715.method1164(var19.method413(arg2 ^ -30502), 0);
                int var21 = var19.method415(-15317) & 3;
                if (~var20.field5379 != 0) {
                    class51.method306(arg3, (byte) -1, arg5, arg6, var20, var21);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "(B)V", line = 226)
    public static final void method1721(byte arg0) {
        class11 var1 = class286.field3657;
        synchronized (class286.field3657) {
            if (arg0 > -71) {
                return;
            }
            class286.field3657.method84(87);
        }
        ++field3592;
        class11 var2 = class324.field4156;
        synchronized (class324.field4156) {
            class324.field4156.method84(-113);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[I", line = 246)
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3596;
            int[] var3 = super.field1331.method397((byte) -110, arg0);
            if (super.field1331.field863) {
                int[] var4 = this.method657(0, arg0, -1);
                for (int var5 = 0; class269.field3403 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }
}
