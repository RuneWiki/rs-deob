import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class430 extends class305 {

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "Z")
    private boolean field6376 = true;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "Z")
    private boolean field6371 = true;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "Leg;")
    public static class34 field6378 = new class34("", 10);

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "Lpu;")
    public static class179 field6379 = new class179("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "Lks;")
    public static class23 field6374;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method15(int arg0, int arg1) {
        ++field6380;
        int[] var3 = super.field4677.method2174(arg0, -89);
        if (arg1 != 4688) {
            this.method14(53, (class194) null, (byte) -80);
        }
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, !this.field6376 ? arg0 : -arg0 + class236.field3551, 0);
            if (!this.field6371) {
                class325.method2132(var4, 0, var3, 0, class91.field1471);
            } else {
                for (int var5 = 0; var5 < class91.field1471; ++var5) {
                    var3[var5] = var4[-var5 + class228.field3447];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V", line = 41)
    public class430() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V", line = 48)
    public static void method2679(int arg0) {
        field6374 = null;
        if (arg0 == -212) {
            field6379 = null;
            field6378 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILfh;B)V", line = 62)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field4675 = arg1.method1337((byte) -108) == 1;
                }
            } else {
                this.field6376 = arg1.method1337((byte) 2) == 1;
            }
        } else {
            this.field6371 = ~arg1.method1337((byte) 77) == -2;
        }
        if (arg2 < 76) {
            this.method15(16, -51);
        }
        ++field6375;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)[[I", line = 108)
    public final int[][] method72(int arg0, byte arg1) {
        if (arg1 > -59) {
            this.method15(-7, 107);
        }
        ++field6372;
        int[][] var3 = super.field4674.method2206(-106, arg0);
        if (super.field4674.field5110) {
            int[][] var4 = this.method2015(true, 0, !this.field6376 ? arg0 : -arg0 + class236.field3551);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field6371) {
                for (int var11 = 0; var11 < class91.field1471; ++var11) {
                    var8[var11] = var5[-var11 + class228.field3447];
                    var9[var11] = var6[-var11 + class228.field3447];
                    var10[var11] = var7[-var11 + class228.field3447];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class91.field1471; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(CI)C", line = 175)
    public static final char method2680(char arg0, int arg1) {
        ++field6373;
        if (arg1 <= 24) {
            method2680((char) 65439, -78);
        }
        if (~arg0 != -33 && arg0 != 160 && ~arg0 != -96 && ~arg0 != -46) {
            if (arg0 != '[' && arg0 != ']' && arg0 != '#') {
                if (~arg0 != -225 && arg0 != 225 && ~arg0 != -227 && arg0 != 228 && arg0 != 227 && ~arg0 != -193 && arg0 != 193 && arg0 != 194 && arg0 != 196 && ~arg0 != -196) {
                    if (arg0 != 232 && arg0 != 233 && ~arg0 != -235 && arg0 != 235 && arg0 != 200 && ~arg0 != -202 && arg0 != 202 && ~arg0 != -204) {
                        if (arg0 != 237 && arg0 != 238 && ~arg0 != -240 && arg0 != 205 && arg0 != 206 && arg0 != 207) {
                            if (arg0 != 242 && arg0 != 243 && arg0 != 244 && ~arg0 != -247 && ~arg0 != -246 && ~arg0 != -211 && ~arg0 != -212 && arg0 != 212 && arg0 != 214 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && ~arg0 != -252 && ~arg0 != -253 && ~arg0 != -218 && arg0 != 218 && arg0 != 219 && arg0 != 220) {
                                    if (arg0 != 231 && ~arg0 != -200) {
                                        if (arg0 != 255 && ~arg0 != -377) {
                                            if (~arg0 != -242 && arg0 != 209) {
                                                return arg0 == 223 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }
}
