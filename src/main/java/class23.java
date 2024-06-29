import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class23 extends class182 {

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lkh;")
    public class117 field584;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Llj;")
    public static class130 field588;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lvb;")
    public static class232 field580;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Lvb;")
    public static class232 field589;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[I")
    public int[] field581;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
    public int[] field586;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "[I")
    public int[] field590;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[I")
    public int[] field591;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnc;IB)V")
    private final void method201(class145 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field584 = arg0.method1038(arg2 ^ 0x16);
        } else if (arg1 == 2) {
            int var4 = arg0.method998(95);
            this.field586 = new int[var4];
            this.field581 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field586[var5] = arg0.method1049((byte) 120);
                int var6 = arg0.method998(117);
                if (var6 == 0) {
                    this.field581[var5] = -1;
                } else {
                    this.field581[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method998(86);
            this.field591 = new int[var7];
            this.field590 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field590[var8] = arg0.method1049((byte) 120);
                int var9 = arg0.method998(arg2 + 66);
                if (var9 == 0) {
                    this.field591[var8] = -1;
                } else {
                    this.field591[var8] = var9;
                }
            }
        }
        field583++;
        if (arg2 != 48) {
            this.field584 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
    public final int method202(boolean arg0, int arg1) {
        field585++;
        if (arg0) {
            this.method202(false, 116);
        }
        if (this.field590 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field590.length; var3++) {
            if (this.field591[var3] == arg1) {
                return this.field590[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
    public static final int method203(int arg0) {
        field592++;
        if (arg0 != -1) {
            method205((byte) -86);
        }
        int var1 = 3;
        if (class150.field2726 < 310) {
            int var2 = class19.field535 >> 7;
            int var3 = class186.field3339 >> 7;
            if ((class233.field4200[class203.field3675][var2][var3] & 0x4) != 0) {
                var1 = class203.field3675;
            }
            int var4 = class93.field1712.field4221 >> 7;
            int var5 = class93.field1712.field4244 >> 7;
            int var6;
            if (var3 >= var4) {
                var6 = var3 - var4;
            } else {
                var6 = var4 - var3;
            }
            int var7;
            if (var5 <= var2) {
                var7 = var2 - var5;
            } else {
                var7 = var5 - var2;
            }
            if (var7 <= var6) {
                int var8 = 32768;
                int var9 = var7 * 65536 / var6;
                while (var3 != var4) {
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    var8 += var9;
                    if ((class233.field4200[class203.field3675][var2][var3] & 0x4) != 0) {
                        var1 = class203.field3675;
                    }
                    if (var8 >= 65536) {
                        if (var5 > var2) {
                            var2++;
                        } else if (var5 < var2) {
                            var2--;
                        }
                        var8 -= 65536;
                        if ((class233.field4200[class203.field3675][var2][var3] & 0x4) != 0) {
                            var1 = class203.field3675;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var2 != var5) {
                    if (var5 > var2) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    if ((class233.field4200[class203.field3675][var2][var3] & 0x4) != 0) {
                        var1 = class203.field3675;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        if ((class233.field4200[class203.field3675][var2][var3] & 0x4) != 0) {
                            var1 = class203.field3675;
                        }
                    }
                }
            }
        }
        if ((class233.field4200[class203.field3675][class93.field1712.field4244 >> 7][class93.field1712.field4221 >> 7] & 0x4) != 0) {
            var1 = class203.field3675;
        }
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILnc;)V")
    public final void method204(int arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method998(114);
            if (var3 == 0) {
                if (arg0 >= -94) {
                    return;
                }
                field579++;
                return;
            }
            this.method201(arg1, var3, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
    public static void method205(byte arg0) {
        field588 = null;
        field580 = null;
        field589 = null;
        if (arg0 != 123) {
            method205((byte) -71);
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(B)V")
    public final void method206(byte arg0) {
        int var2 = 113 % ((-arg0 - 66) / 49);
        if (this.field590 != null) {
            for (int var3 = 0; var3 < this.field590.length; var3++) {
                this.field590[var3] = class40.method352(this.field590[var3], 32768);
            }
        }
        if (this.field586 != null) {
            for (int var4 = 0; var4 < this.field586.length; var4++) {
                this.field586[var4] = class40.method352(this.field586[var4], 32768);
            }
        }
        field593++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public final int method207(int arg0, int arg1) {
        field587++;
        if (this.field586 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field586.length; var3++) {
            if (this.field581[var3] == arg1) {
                return this.field586[var3];
            }
        }
        if (arg0 != 21706) {
            this.method206((byte) -86);
        }
        return -1;
    }
}
