import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class131 extends class554 {

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "Z")
    private boolean field1609 = false;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "Z")
    private boolean field1608;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "[Lmca;")
    private class5[] field1610;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "Lvt;")
    public static class344 field1614 = new class344("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "Lba;")
    public static class607 field1619 = new class607(64);

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        ++field1611;
        if (arg0) {
            super.field7743.method3344(29639, arg2);
            super.field7743.method3291(arg1, 2);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 58) {
            field1619 = null;
        }
        ++field1612;
        if (arg4 == arg5) {
            class31.method183(arg6, arg5, arg1, arg3, 106, arg0, arg2);
        } else if (~class594.field8575 >= ~(-arg5 + arg0) && arg0 - -arg5 <= class355.field4972 && ~(arg3 - arg4) <= ~class535.field7467 && ~(arg3 + arg4) >= ~class113.field1453) {
            class280.method1749(arg5, arg0, arg3, arg2, arg1, arg4, false, arg6);
        } else {
            class220.method1412(arg6, -274246366, arg4, arg5, arg1, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        ++field1617;
        if (arg0 == 4096) {
            if (this.field1609) {
                super.field7743.method3339((byte) 90, 1);
                super.field7743.method3344(29639, (class11) null);
                super.field7743.method1201((byte) -39, class558.field7806);
                super.field7743.method3323(0);
                if (this.field1608) {
                    super.field7743.method3316(class443.field6123, 106, class443.field6123);
                    super.field7743.method3300(true, 0, class93.field1233);
                    super.field7743.method3307(class93.field1233, 0, 16711680);
                } else {
                    super.field7743.method3316(class443.field6123, -72, class443.field6123);
                    super.field7743.method3300(true, 0, class93.field1233);
                    super.field7743.method3339((byte) 90, 2);
                    super.field7743.method3316(class443.field6123, arg0 ^ -4206, class443.field6123);
                    super.field7743.method3300(true, 0, class93.field1233);
                    super.field7743.method3300(true, 1, class17.field173);
                    super.field7743.method3307(class93.field1233, 0, arg0 ^ 16715776);
                    super.field7743.method3344(29639, (class11) null);
                }
                super.field7743.method3339((byte) 90, 0);
                this.field1609 = false;
            } else {
                super.field7743.method3307(class93.field1233, 0, 16711680);
            }
            super.field7743.method3316(class443.field6123, -127, class443.field6123);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lre;)V")
    public class131(class582 arg0) {
        super(arg0);
        if (arg0.field8372) {
            this.field1608 = ~arg0.field8319 > -4;
            int var2 = this.field1608 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (var14 != 2) {
                            if (var14 == 3) {
                                var15 = -var13;
                            } else if (~var14 == -5) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field1610 = new class5[3];
            this.field1610[0] = super.field7743.method1200(64, var4, 15, false);
            this.field1610[1] = super.field7743.method1200(64, var5, 15, false);
            this.field1610[2] = super.field7743.method1200(64, var3, 15, false);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field1618;
        if (!arg1) {
            field1620 = -51;
        }
        if (this.field1609) {
            super.field7743.method3339((byte) 90, 1);
            super.field7743.method3344(29639, this.field1610[arg2 + -1]);
            super.field7743.method3339((byte) 90, 0);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        ++field1613;
        if (arg0 != 61) {
            field1619 = null;
        }
        if (this.field1610 != null && arg1) {
            super.field7743.method3339((byte) 90, 1);
            super.field7743.method1201((byte) -128, class280.field3668);
            class186 var3 = super.field7743.method3299(-8435);
            var3.method366(1024);
            super.field7743.method3321((byte) -121, class191.field2480);
            if (!this.field1608) {
                super.field7743.method3316(class509.field7093, -73, class443.field6123);
                super.field7743.method3300(true, 0, class17.field173);
                super.field7743.method3339((byte) 90, 2);
                super.field7743.method3316(class505.field7041, arg0 + -147, class509.field7093);
                super.field7743.method3300(true, 0, class17.field173);
                super.field7743.method1210(class17.field173, false, true, true, 1);
                super.field7743.method3307(class542.field7574, 0, 16711680);
                super.field7743.method3344(29639, super.field7743.field8356);
            } else {
                super.field7743.method3316(class505.field7041, arg0 ^ -110, class509.field7093);
                super.field7743.method1210(class93.field1233, false, true, true, 0);
                super.field7743.method3307(class542.field7574, 0, 16711680);
            }
            super.field7743.method3339((byte) 90, 0);
            this.field1609 = true;
        } else {
            super.field7743.method3307(class542.field7574, 0, 16711680);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        ++field1615;
        super.field7743.method3316(class443.field6123, -95, class509.field7093);
        if (arg1 < 74) {
            field1614 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 != 4096) {
            return true;
        } else {
            ++field1616;
            return true;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(Z)V")
    public static void method698(boolean arg0) {
        field1614 = null;
        field1619 = null;
        if (arg0) {
            field1614 = null;
        }
    }
}
