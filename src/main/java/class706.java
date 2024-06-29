import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class706 {

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "[I")
    private int[] field9702 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field9700 = 100;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lds;")
    public static class16 field9695;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "Lbn;")
    public class469 field9710;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wca", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field9711;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field9696;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "[I")
    private int[] field9706;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "[Lpaa;")
    public static class651[] field9705;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "[S")
    private short[] field9694;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "[S")
    private short[] field9697;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "[S")
    private short[] field9701;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "[S")
    private short[] field9704;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3949(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZLfca;)V", line = 3)
    public final void method3940(boolean arg0, class93 arg1) {
        if (!arg0) {
            this.field9710 = null;
        }
        while (true) {
            int var3 = arg1.method793((byte) 38);
            if (var3 == 0) {
                field9698++;
                return;
            }
            this.method3943(arg1, var3, -42);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Ldc;", line = 28)
    public final class5 method3941(int arg0) {
        field9708++;
        class5[] var2 = new class5[5];
        int var3 = 0;
        class662 var4 = this.field9710.field6345;
        synchronized (this.field9710.field6345) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field9702[var5] != -1) {
                    var2[var3++] = class245.method1636(this.field9702[var5], this.field9710.field6345, 0, 2);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field101 < 13) {
                var2[var6].method35((byte) -124, 2);
            }
        }
        if (arg0 <= 86) {
            return null;
        }
        class5 var7 = new class5(var2, var3);
        if (this.field9704 != null) {
            for (int var8 = 0; var8 < this.field9704.length; var8++) {
                var7.method30((byte) -111, this.field9701[var8], this.field9704[var8]);
            }
        }
        if (this.field9694 != null) {
            for (int var9 = 0; var9 < this.field9694.length; var9++) {
                var7.method26(0, this.field9697[var9], this.field9694[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V", line = 106)
    public static final void method3942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9709++;
        if (~arg0 > arg7 || arg6 < 0 || (class483.field6515 - 1) <= arg0 || (class65.field926 - 1) <= arg6) {
            return;
        }
        if (class325.field4448 == null) {
            return;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                class237 var8 = (class237) class728.method4037(arg1, arg0, arg6);
                if (var8 != null) {
                    if (var8 instanceof class717) {
                        ((class717) var8).field9853.method2052((byte) -121, arg5);
                        return;
                    }
                    int var9 = var8.method1032(false);
                    if (arg4 != 4 && arg4 != 5) {
                        if (arg4 != 6) {
                            if (arg4 == 7) {
                                class300.method1930(4, (arg3 + 2 & 0x3) + 4, arg2, arg0, arg1, arg6, false, arg5, var9);
                            } else if (arg4 == 8) {
                                class300.method1930(4, arg3 + 4, arg2, arg0, arg1, arg6, false, arg5, var9);
                                class300.method1930(4, (arg3 + 2 & 0x3) + 4, arg2, arg0, arg1, arg6, false, arg5, var9);
                                return;
                            }
                            return;
                        }
                        class300.method1930(4, arg3 + 4, arg2, arg0, arg1, arg6, false, arg5, var9);
                        return;
                    }
                    class300.method1930(4, arg3, arg2, arg0, arg1, arg6, false, arg5, var9);
                    return;
                }
            } else if (arg2 == 2) {
                class237 var10 = (class237) class614.method3480(arg1, arg0, arg6, field9711 == null ? (field9711 = method3949("bea")) : field9711);
                if (var10 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if (var10 instanceof class313) {
                        ((class313) var10).field4272.method2052((byte) 40, arg5);
                        return;
                    }
                    class300.method1930(arg4, arg3, arg2, arg0, arg1, arg6, false, arg5, var10.method1032(false));
                    return;
                }
            } else if (arg2 == 3) {
                class237 var11 = (class237) class572.method3313(arg1, arg0, arg6);
                if (var11 == null) {
                    return;
                }
                if (!(var11 instanceof class412)) {
                    class300.method1930(arg4, arg3, arg2, arg0, arg1, arg6, false, arg5, var11.method1032(false));
                    return;
                }
                ((class412) var11).field5636.method2052((byte) -108, arg5);
            } else {
                return;
            }
            return;
        }
        class237 var12 = (class237) class454.method2624(arg1, arg0, arg6);
        class237 var13 = (class237) class29.method188(arg1, arg0, arg6);
        if (var12 != null && arg4 != 2) {
            if (var12 instanceof class263) {
                ((class263) var12).field3691.method2052((byte) 84, arg5);
            } else {
                class300.method1930(arg4, arg3, arg2, arg0, arg1, arg6, false, arg5, var12.method1032(false));
            }
        }
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class263)) {
            class300.method1930(arg4, arg3, arg2, arg0, arg1, arg6, false, arg5, var13.method1032(false));
            return;
        }
        ((class263) var13).field3691.method2052((byte) -125, arg5);
        return;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lfca;II)V", line = 221)
    private final void method3943(class93 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            arg0.method793((byte) 38);
        } else if (arg1 == 2) {
            int var8 = arg0.method793((byte) 27);
            this.field9706 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field9706[var9] = arg0.method763(103);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg0.method793((byte) 102);
                this.field9701 = new short[var4];
                this.field9704 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9704[var5] = (short) arg0.method763(-46);
                    this.field9701[var5] = (short) arg0.method763(arg2 + 157);
                }
            } else if (arg1 == 41) {
                int var6 = arg0.method793((byte) 95);
                this.field9694 = new short[var6];
                this.field9697 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9694[var7] = (short) arg0.method763(109);
                    this.field9697[var7] = (short) arg0.method763(class18.method125(arg2, -44));
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field9702[arg1 - 60] = arg0.method763(82);
            }
        }
        if (arg2 != -42) {
            this.method3947(-25);
        }
        field9703++;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Z", line = 303)
    public final boolean method3944(int arg0) {
        if (arg0 > -70) {
            field9696 = null;
        }
        field9692++;
        boolean var2 = true;
        class662 var3 = this.field9710.field6345;
        synchronized (this.field9710.field6345) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field9702[var4] != -1 && !this.field9710.field6345.method3720(this.field9702[var4], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lct;[[BB)V", line = 329)
    public static final void method3945(class157 arg0, byte[][] arg1, byte arg2) {
        field9691++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field7090; var4++) {
            class204.method1458(-17818);
            for (int var9 = 0; var9 < (class483.field6515 >> 3); var9++) {
                for (int var10 = 0; var10 < (class65.field926 >> 3); var10++) {
                    int var11 = class220.field3229[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = var11 >> 24 & 0x3;
                        if (!arg0.field7093 || var12 == 0) {
                            int var13 = (var11 & 0x7) >> 1;
                            int var14 = (var11 & 0xFFD566) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class201.field3055.length; var17++) {
                                if (class201.field3055[var17] == var16 && arg1[var17] != null) {
                                    class93 var18 = new class93(arg1[var17]);
                                    arg0.method2981(class711.field9798, var9 * 8, var10 * 8, var15, var4, var12, var14, var18, var13, 11193);
                                    arg0.method1221(var12, var13, var14, var3[0] == -1 ? var3 : null, var15, var18, class95.field1472, 8, var9 * 8, var4, var10 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0.field7090; var5++) {
            class204.method1458(-17818);
            for (int var6 = 0; var6 < class483.field6515 >> 3; var6++) {
                for (int var7 = 0; var7 < class65.field926 >> 3; var7++) {
                    int var8 = class220.field3229[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method2973(var5, 3, 8, var7 * 8, 8, var6 * 8);
                    }
                }
            }
        }
        if (arg2 > -124) {
            method3942(119, 103, -81, -100, -42, -36, -52, -112);
        }
        if (var3[0] != -1) {
            class288.field3973 = class780.field10746.method1656(class498.field6811, var3[2], var3[1], var3[0], (byte) -128, var3[3]);
            class58.field817 = var3[4];
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Z", line = 445)
    public final boolean method3946(byte arg0) {
        field9693++;
        if (this.field9706 == null) {
            return true;
        }
        boolean var2 = true;
        class662 var3 = this.field9710.field6345;
        synchronized (this.field9710.field6345) {
            int var4 = 0;
            while (true) {
                if (this.field9706.length <= var4) {
                    break;
                }
                if (!this.field9710.field6345.method3720(this.field9706[var4], 0, 0)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 != -67) {
            this.field9694 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Ldc;", line = 474)
    public final class5 method3947(int arg0) {
        int var2 = 67 / ((arg0 - 70) / 43);
        field9699++;
        if (this.field9706 == null) {
            return null;
        }
        class5[] var3 = new class5[this.field9706.length];
        class662 var4 = this.field9710.field6345;
        synchronized (this.field9710.field6345) {
            int var5 = 0;
            while (true) {
                if (var5 >= this.field9706.length) {
                    break;
                }
                var3[var5] = class245.method1636(this.field9706[var5], this.field9710.field6345, 0, 2);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field9706.length; var6++) {
            if (var3[var6].field101 < 13) {
                var3[var6].method35((byte) -128, 2);
            }
        }
        class5 var7;
        if (var3.length == 1) {
            var7 = var3[0];
        } else {
            var7 = new class5(var3, var3.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field9704 != null) {
            for (int var8 = 0; var8 < this.field9704.length; var8++) {
                var7.method30((byte) 116, this.field9701[var8], this.field9704[var8]);
            }
        }
        if (this.field9694 != null) {
            for (int var9 = 0; var9 < this.field9694.length; var9++) {
                var7.method26(0, this.field9697[var9], this.field9694[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(I)V", line = 562)
    public static void method3948(int arg0) {
        field9695 = null;
        if (arg0 == 0) {
            field9705 = null;
            field9696 = null;
        }
    }
}
