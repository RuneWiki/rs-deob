import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class105 implements class12 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lca;")
    private class16 field2539 = new class16();

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    private int field2554 = 0;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "D")
    private double field2559 = 1.0D;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    private int field2561 = 128;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lsd;")
    private class122 field2555;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lkd;")
    private class73[] field2548;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lmb;")
    private static class84 field2546 = class79.method672(true, "Please contact customer support)3");

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lmb;")
    public static class84 field2543 = field2546;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lmb;")
    public static class84 field2547 = class79.method672(true, "Regelversto-8 melden");

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Ls;")
    public static class118 field2552 = new class118(32);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Ljd;")
    public static class66 field2551;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method874(byte arg0) {
        if (arg0 > -111) {
            return;
        }
        for (int var2 = 0; var2 < this.field2548.length; var2++) {
            if (this.field2548[var2] != null) {
                this.field2548[var2].method634();
            }
        }
        field2558++;
        this.field2539 = new class16();
        this.field2554 = this.field2557;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
    public static final boolean method875(byte arg0, int arg1) {
        if (arg0 != -80) {
            field2547 = null;
        }
        field2538++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BD)V")
    public final void method876(byte arg0, double arg1) {
        this.field2559 = arg1;
        this.method874((byte) -119);
        if (arg0 < 35) {
            this.method876((byte) -31, -0.4130181540755471D);
        }
        field2541++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
    public final boolean method71(int arg0, int arg1) {
        field2544++;
        if (arg0 == -26026) {
            return this.field2561 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[BI[Ljc;I)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, class65[] arg8, int arg9) {
        int var10 = 78 % ((arg7 - 40) / 34);
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var16 > 0 && arg3 + var16 < 103) {
                    arg8[arg0].field1591[arg2 + var11][arg3 + var16] = client.method144(arg8[arg0].field1591[arg2 + var11][arg3 + var16], -16777217);
                }
            }
        }
        field2545++;
        class51 var12 = new class51(arg6);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 == var13 && var14 >= arg9 && var14 < arg9 + 8 && arg5 <= var15 && var15 < arg5 + 8) {
                        class122.method998(arg0, 18050, class110.method896((byte) -106, arg1, var15 & 0x7, var14 & 0x7) + arg3, 0, arg1, var12, arg2 + class49.method354(arg1, var15 & 0x7, var14 & 0x7, (byte) -31), 0);
                    } else {
                        class122.method998(0, 18050, -1, 0, 0, var12, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method878(int arg0) {
        field2542++;
        if (class37.field831 == 1) {
            if (class83.field2034 >= 539 && class83.field2034 <= 573 && class47.field1035 >= 169 && class47.field1035 < 205 && class72.field1777[0] != -1) {
                class95.field2365 = true;
                class68.field1654 = 0;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 569 && class83.field2034 <= 599 && class47.field1035 >= 168 && class47.field1035 < 205 && class72.field1777[1] != -1) {
                class89.field2220 = true;
                class68.field1654 = 1;
                class95.field2365 = true;
            }
            if (class83.field2034 >= 597 && class83.field2034 <= 627 && class47.field1035 >= 168 && class47.field1035 < 205 && class72.field1777[2] != -1) {
                class89.field2220 = true;
                class95.field2365 = true;
                class68.field1654 = 2;
            }
            if (class83.field2034 >= 625 && class83.field2034 <= 669 && class47.field1035 >= 168 && class47.field1035 < 203 && class72.field1777[3] != -1) {
                class95.field2365 = true;
                class89.field2220 = true;
                class68.field1654 = 3;
            }
            if (class83.field2034 >= 666 && class83.field2034 <= 696 && class47.field1035 >= 168 && class47.field1035 < 205 && class72.field1777[4] != -1) {
                class95.field2365 = true;
                class68.field1654 = 4;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 694 && class83.field2034 <= 724 && class47.field1035 >= 168 && class47.field1035 < 205 && class72.field1777[5] != -1) {
                class95.field2365 = true;
                class68.field1654 = 5;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 722 && class83.field2034 <= 756 && class47.field1035 >= 169 && class47.field1035 < 205 && class72.field1777[6] != -1) {
                class68.field1654 = 6;
                class95.field2365 = true;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 540 && class83.field2034 <= 574 && class47.field1035 >= 466 && class47.field1035 < 502 && class72.field1777[7] != -1) {
                class95.field2365 = true;
                class68.field1654 = 7;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 572 && class83.field2034 <= 602 && class47.field1035 >= 466 && class47.field1035 < 503 && class72.field1777[8] != -1) {
                class95.field2365 = true;
                class68.field1654 = 8;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 599 && class83.field2034 <= 629 && class47.field1035 >= 466 && class47.field1035 < 503 && class72.field1777[9] != -1) {
                class95.field2365 = true;
                class68.field1654 = 9;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 627 && class83.field2034 <= 671 && class47.field1035 >= 467 && class47.field1035 < 502 && class72.field1777[10] != -1) {
                class95.field2365 = true;
                class89.field2220 = true;
                class68.field1654 = 10;
            }
            if (class83.field2034 >= 669 && class83.field2034 <= 699 && class47.field1035 >= 466 && class47.field1035 < 503 && class72.field1777[11] != -1) {
                class95.field2365 = true;
                class89.field2220 = true;
                class68.field1654 = 11;
            }
            if (class83.field2034 >= 696 && class83.field2034 <= 726 && class47.field1035 >= 466 && class47.field1035 < 503 && class72.field1777[12] != -1) {
                class95.field2365 = true;
                class68.field1654 = 12;
                class89.field2220 = true;
            }
            if (class83.field2034 >= 724 && class83.field2034 <= 758 && class47.field1035 >= 466 && class47.field1035 < 502 && class72.field1777[13] != -1) {
                class68.field1654 = 13;
                class89.field2220 = true;
                class95.field2365 = true;
            }
        }
        if (arg0 != 7) {
            method875((byte) 18, 56);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
    public final int[] method72(int arg0, byte arg1) {
        class73 var3 = this.field2548[arg0];
        field2553++;
        if (var3 != null) {
            if (var3.field1787 != null) {
                this.field2539.method109((byte) 77, var3);
                var3.field1779 = true;
                return var3.field1787;
            }
            boolean var4 = var3.method635(this.field2559, this.field2561, this.field2555);
            if (var4) {
                if (this.field2554 == 0) {
                    class73 var5 = (class73) this.field2539.method102(arg1 + 54);
                    var5.method634();
                } else {
                    this.field2554--;
                }
                this.field2539.method109((byte) 122, var3);
                var3.field1779 = true;
                return var3.field1787;
            }
        }
        return arg1 == -93 ? null : null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method879(int arg0) {
        field2543 = null;
        if (arg0 != -700) {
            method881(null, -91);
        }
        field2552 = null;
        field2547 = null;
        field2546 = null;
        field2551 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)V")
    public final void method880(byte arg0, int arg1) {
        if (arg0 > -69) {
            field2551 = null;
        }
        for (int var3 = 0; var3 < this.field2548.length; var3++) {
            class73 var4 = this.field2548[var3];
            if (var4 != null && var4.field1782 != 0 && var4.field1779) {
                var4.method636(arg1);
                var4.field1779 = false;
            }
        }
        field2549++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method881(Component arg0, int arg1) {
        arg0.addMouseListener(class88.field2209);
        if (arg1 != -540) {
            field2547 = null;
        }
        field2540++;
        arg0.addMouseMotionListener(class88.field2209);
        arg0.addFocusListener(class88.field2209);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method70(int arg0, int arg1) {
        if (arg0 != -25101) {
            this.method880((byte) -108, 55);
        }
        field2550++;
        return this.field2548[arg1] == null ? 0 : this.field2548[arg1].field1784;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
    public final boolean method69(int arg0, boolean arg1) {
        if (!arg1) {
            method875((byte) -35, -106);
        }
        field2556++;
        return this.field2548[arg0].field1789;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lsd;Lsd;IDI)V")
    public class105(class122 arg0, class122 arg1, int arg2, double arg3, int arg4) {
        this.field2559 = arg3;
        this.field2557 = arg2;
        this.field2554 = this.field2557;
        this.field2555 = arg1;
        this.field2561 = arg4;
        int[] var7 = arg0.method1007(0, 0);
        int var8 = var7.length;
        this.field2548 = new class73[arg0.method989(0, -91)];
        for (int var9 = 0; var9 < var8; var9++) {
            class51 var10 = new class51(arg0.method986(var7[var9], 0, (byte) 67));
            this.field2548[var7[var9]] = new class73(var10);
        }
    }
}
