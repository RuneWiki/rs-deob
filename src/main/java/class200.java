import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class200 extends class113 implements class231 {

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "S")
    private short field2935;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "Z")
    private boolean field2952;

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "B")
    private byte field2937;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "Z")
    private boolean field2948;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "B")
    private byte field2954;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "B")
    private byte field2955;

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "Z")
    private boolean field2957;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "Z")
    private boolean field2943;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "Lk;")
    private class485 field2946;

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "Lr;")
    public class159 field2940;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "Z")
    public static boolean field2951 = false;

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "Ljc;")
    public static class374 field2941 = new class374();

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ida", name = "O", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ida", name = "P", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ida", name = "Q", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ida", name = "R", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ida", name = "S", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ida", name = "T", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ida", name = "U", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ida", name = "W", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ida", name = "A", descriptor = "Lpl;")
    private class558 field2944;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ida", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field2967;

    @OriginalMember(owner = "client!ida", name = "V", descriptor = "[I")
    public static int[] field2965;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field2950;
        if (arg0 < 0) {
            return null;
        } else if (this.field2940 == null) {
            return null;
        } else {
            class165 var3 = arg1.method428();
            var3.method353(super.field1594, super.field1596, super.field1598);
            class77 var4 = null;
            if (this.field2952) {
                var4 = class450.method2725(1, 26728);
            }
            this.field2940.method93(var3, var4 == null ? null : var4.field1022[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (arg0 > 95) {
            ++field2949;
            if (this.field2940 != null) {
                this.field2940.method55();
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lqa;IB)Lr;")
    private final class159 method1339(class208 arg0, int arg1, byte arg2) {
        ++field2953;
        if (this.field2940 != null && arg0.method528(this.field2940.method90(), arg1) == 0) {
            return this.field2940;
        } else {
            int var4 = -93 % ((-33 - arg2) / 49);
            class429 var5 = this.method1340(arg1, (byte) -116, false, arg0);
            return var5 != null ? var5.field5765 : null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 > -120) {
            this.field2935 = 103;
        }
        ++field2961;
        return this.field2955;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        ++field2934;
        if (arg1 != 31733) {
            this.field2944 = null;
        }
        if (this.field2944 == null) {
            this.field2944 = class115.method826(this.method1339(arg0, 0, (byte) 121), super.field1594, 21979, super.field1598, super.field1596);
        }
        return this.field2944;
    }

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        this.field2957 = false;
        ++field2945;
        if (arg0 == 1) {
            if (this.field2940 != null) {
                this.field2940.method79(this.field2940.method90() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBZLqa;)Lis;")
    private final class429 method1340(int arg0, byte arg1, boolean arg2, class208 arg3) {
        if (arg1 > -98) {
            this.field2955 = -106;
        }
        ++field2959;
        class145 var5 = class216.field3172.method1505(-24044, this.field2935 & 65535);
        class176 var6;
        class176 var7;
        if (!this.field2948) {
            var6 = class207.field3077[this.field2954];
            if (~this.field2954 <= -4) {
                var7 = null;
            } else {
                var7 = class207.field3077[this.field2954 + 1];
            }
        } else {
            var6 = class114.field1609[this.field2954];
            var7 = class207.field3077[0];
        }
        return var5.method997(super.field1594, this.field2937, 127, arg2, arg0, super.field1598, var7, var6, this.field2955, arg3, super.field1596);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field2936;
        if (arg5 instanceof class200) {
            class200 var8 = (class200) arg5;
            if (this.field2940 != null && var8.field2940 != null) {
                this.field2940.method78(var8.field2940, arg3, arg1, arg4, arg2);
            }
        } else if (arg5 instanceof class27) {
            class27 var9 = (class27) arg5;
            if (this.field2940 != null && var9.field312 != null) {
                this.field2940.method78(var9.field312, arg3, arg1, arg4, arg2);
            }
        }
        if (arg6 != 21130) {
            this.field2955 = 54;
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        ++field2956;
        int var2 = -51 / ((-43 - arg0) / 49);
        return this.field2937;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lqa;Luh;IIIIZIIZ)V")
    public class200(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class213.method1408(arg7, -19, arg8));
        super.field1594 = arg3;
        super.field1598 = arg5;
        this.field2935 = (short) arg1.field2049;
        this.field2952 = arg1.field2056 != 0 && !arg6;
        this.field2937 = (byte) arg7;
        this.field2948 = arg6;
        this.field2954 = (byte) arg2;
        this.field2955 = (byte) arg8;
        this.field2957 = arg9;
        this.field2943 = arg0.method457() && arg1.field2084 && !this.field2948 && ~class56.field668.method2897(class526.field7533, 6373) != -1;
        int var11 = 2048;
        if (this.field2957) {
            var11 |= 65536;
        }
        class429 var12 = this.method1340(var11, (byte) -104, this.field2943, arg0);
        if (var12 != null) {
            this.field2946 = var12.field5763;
            this.field2940 = var12.field5765;
            if (this.field2957) {
                this.field2940 = this.field2940.method94((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        ++field2960;
        if (arg0 != 58) {
            this.field2948 = true;
        }
        return this.field2957;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILqa;IIIIIII)V")
    public static final void method1341(int arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2958;
        if (arg5 == 262144) {
            class231 var9 = (class231) class169.method1205(arg0, arg7, arg4);
            if (var9 != null) {
                class145 var10 = class216.field3172.method1505(-24044, var9.method183(-19248));
                int var11 = var9.method170(-122) & 3;
                int var12 = var9.method173((byte) -105);
                if (var10.field2110 != -1) {
                    class446.method2707(arg1, var10, arg3, arg6, (byte) 124, var11);
                } else {
                    int var13 = arg2;
                    if (var10.field2056 > 0) {
                        var13 = arg8;
                    }
                    if (~var12 == -1 || var12 == 2) {
                        if (var11 == 0) {
                            arg1.method1376(var13, arg6, 4, (byte) -117, arg3);
                        } else if (~var11 != -2) {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    arg1.method1371(arg6, 4, 1, var13, arg3 + 3);
                                }
                            } else {
                                arg1.method1376(var13, arg6 + 3, 4, (byte) -120, arg3);
                            }
                        } else {
                            arg1.method1371(arg6, 4, 1, var13, arg3);
                        }
                    }
                    if (var12 == 3) {
                        if (~var11 == -1) {
                            arg1.method1378(true, arg6, var13, 1, 1, arg3);
                        } else if (var11 == 1) {
                            arg1.method1378(true, arg6 + 3, var13, 1, 1, arg3);
                        } else if (var11 == 2) {
                            arg1.method1378(true, arg6 + 3, var13, 1, 1, arg3 + 3);
                        } else if (~var11 == -4) {
                            arg1.method1378(true, arg6, var13, 1, 1, arg3 + 3);
                        }
                    }
                    if (~var12 == -3) {
                        if (var11 != 0) {
                            if (var11 != 1) {
                                if (~var11 == -3) {
                                    arg1.method1371(arg6, 4, arg5 + -262143, var13, arg3 + 3);
                                } else if (var11 == 3) {
                                    arg1.method1376(var13, arg6, 4, (byte) -90, arg3);
                                }
                            } else {
                                arg1.method1376(var13, arg6 - -3, 4, (byte) -96, arg3);
                            }
                        } else {
                            arg1.method1371(arg6, 4, arg5 ^ 262145, var13, arg3);
                        }
                    }
                }
            }
            class231 var14 = (class231) class624.method3650(arg0, arg7, arg4, field2967 != null ? field2967 : (field2967 = method1345("up")));
            if (var14 != null) {
                class145 var15 = class216.field3172.method1505(-24044, var14.method183(-19248));
                int var16 = 3 & var14.method170(-126);
                int var17 = var14.method173((byte) 73);
                if (~var15.field2110 != 0) {
                    class446.method2707(arg1, var15, arg3, arg6, (byte) 96, var16);
                } else if (~var17 == -10) {
                    int var18 = -1118482;
                    if (var15.field2056 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && var16 != 2) {
                        arg1.method1375(arg3, arg5 ^ 262145, arg3 + 3, arg6 + 3, var18, arg6);
                    } else {
                        arg1.method1375(arg3 + 3, 1, arg3, arg6 + 3, var18, arg6);
                    }
                }
            }
            class231 var19 = (class231) class440.method2560(arg0, arg7, arg4);
            if (var19 != null) {
                class145 var20 = class216.field3172.method1505(-24044, var19.method183(-19248));
                int var21 = 3 & var19.method170(-127);
                if (~var20.field2110 != 0) {
                    class446.method2707(arg1, var20, arg3, arg6, (byte) 96, var21);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        ++field2933;
        Object var3 = null;
        if (arg0 != 115) {
            field2951 = false;
        }
        class485 var5;
        if (this.field2946 == null && this.field2943) {
            class429 var4 = this.method1340(262144, (byte) -123, true, arg1);
            var5 = var4 == null ? null : var4.field5763;
        } else {
            var5 = this.field2946;
            this.field2946 = null;
        }
        if (var5 != null) {
            class46.method290(var5, this.field2954, super.field1594, super.field1598, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        ++field2966;
        if (arg0 <= 40) {
            field2941 = null;
        }
        return this.method1339(arg2, arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)Z")
    public static final boolean method1342(byte arg0, int arg1, int arg2) {
        ++field2942;
        int var3 = 0 % ((-49 - arg0) / 59);
        return ~(arg2 & 2048) != -1 && (arg1 & 55) != 0;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        ++field2962;
        if (arg0 != 0) {
            this.field2952 = true;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        ++field2939;
        if (arg0 != -19248) {
            this.method182((class208) null, -109, false, -78, -82, (class102) null, -5);
        }
        return 65535 & this.field2935;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 != -41) {
            this.field2944 = null;
        }
        ++field2947;
        return this.field2943;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        ++field2963;
        Object var3 = null;
        class485 var5;
        if (this.field2946 == null && this.field2943) {
            class429 var4 = this.method1340(262144, (byte) -107, true, arg1);
            var5 = var4 != null ? var4.field5763 : null;
        } else {
            var5 = this.field2946;
            this.field2946 = null;
        }
        if (var5 != null) {
            class377.method2253(var5, this.field2954, super.field1594, super.field1598, (boolean[]) null);
        }
        if (arg0 >= -36) {
            this.method173((byte) 91);
        }
    }

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "(B)V")
    public static void method1343(byte arg0) {
        field2965 = null;
        field2941 = null;
        if (arg0 != 23) {
            field2951 = false;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        if (arg3 <= 44) {
            return true;
        } else {
            ++field2938;
            class159 var5 = this.method1339(arg1, 131072, (byte) 102);
            if (var5 != null) {
                class165 var6 = arg1.method428();
                var6.method353(super.field1594, super.field1596, super.field1598);
                return var5.method72(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILte;[I[III)Lbba;")
    public static final class97 method1344(int arg0, class527 arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        ++field2964;
        byte[] var6 = new byte[arg4 * arg5];
        for (int var7 = 0; ~var7 > ~arg5; ++var7) {
            int var9 = arg4 * var7 + arg2[var7];
            for (int var10 = 0; ~arg3[var7] < ~var10; ++var10) {
                var6[var9++] = -1;
            }
        }
        int var8 = 126 / ((arg0 - 14) / 50);
        return new class97(arg1, arg4, arg5, var6);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1345(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class572("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
