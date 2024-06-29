import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class34 extends class12 {

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field577 = 10;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field582 = 2048;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    private int field586 = 0;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Ltg;")
    public static class184 field575 = class135.method812("Passwort: ", 3);

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Ltg;")
    private static class184 field576 = class135.method812("To create a new account you need to", 3);

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "Ltg;")
    public static class184 field587 = field576;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lnd;")
    public static class127 field574 = new class127(5);

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lrh;")
    public static class167 field591 = null;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "[S")
    public static short[] field589 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lth;")
    public static class185 field588 = new class185(0, 0);

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "Ltg;")
    private static class184 field592 = class135.method812("Unable to find ", 3);

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public static int field594 = -1;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "Ltg;")
    public static class184 field593 = field592;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
    private int[] field580;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "[I")
    private int[] field581;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
    private final void method205(int arg0) {
        this.field581 = new int[this.field577 + 1];
        ++field583;
        int var2 = 4096 / this.field577;
        this.field580 = new int[this.field577 + 1];
        int var3 = this.field582 * var2 >> 12;
        int var4 = 0;
        if (arg0 == -15920) {
            for (int var5 = 0; ~this.field577 < ~var5; ++var5) {
                this.field580[var5] = var4;
                this.field581[var5] = var4 - -var3;
                var4 += var2;
            }
            this.field580[this.field577] = 4096;
            this.field581[this.field577] = 4096 - -this.field581[0];
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        this.method205(-15920);
        ++field585;
        if (arg0 != 57) {
            field591 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field584;
        if (~class38.field715 != ~arg1 || ~class111.field2019 != ~arg2 || ~class87.field1598 != ~arg0 && class55.field970) {
            class38.field715 = arg1;
            class87.field1598 = arg0;
            if (!class55.field970) {
                class87.field1598 = 0;
            }
            class111.field2019 = arg2;
            class161.method972(25, (byte) 111);
            class69.method405(true, class81.field1460, arg4 ^ 32549);
            int var6 = class129.field2331;
            class129.field2331 = (arg2 + -6) * 8;
            int var7 = class129.field2331 - var6;
            int var8 = class57.field1020;
            int var9 = class129.field2331;
            class57.field1020 = (arg1 - 6) * 8;
            int var10 = class57.field1020 - var8;
            int var11 = class57.field1020;
            for (int var12 = 0; var12 < 32768; ++var12) {
                class158 var28 = class52.field948[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field644[var29] -= var10;
                        var28.field615[var29] -= var7;
                    }
                    var28.field614 -= var7 * 128;
                    var28.field635 -= var10 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class67 var26 = class57.field1024[var13];
                if (var26 != null) {
                    for (int var27 = 0; var27 < 10; ++var27) {
                        var26.field644[var27] -= var10;
                        var26.field615[var27] -= var7;
                    }
                    var26.field614 -= var7 * 128;
                    var26.field635 -= var10 * 128;
                }
            }
            class47.field892 = arg0;
            class46.field872.method212(-9740, arg5, arg3, false);
            byte var14 = 104;
            byte var15 = 0;
            byte var16 = 1;
            byte var17 = 104;
            if (var10 < 0) {
                var15 = 103;
                var14 = -1;
                var16 = -1;
            }
            byte var18 = 1;
            byte var19 = 0;
            if (var7 < 0) {
                var19 = 103;
                var17 = -1;
                var18 = -1;
            }
            for (int var20 = var15; ~var14 != ~var20; var20 += var16) {
                for (int var22 = var19; var17 != var22; var22 += var18) {
                    int var23 = var7 + var22;
                    int var24 = var20 - -var10;
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (~var24 <= -1 && var23 >= 0 && ~var24 > -105 && ~var23 > -105) {
                            class157.field2813[var25][var20][var22] = class157.field2813[var25][var24][var23];
                        } else {
                            class157.field2813[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class186 var21 = (class186) class79.field1429.method404(false); var21 != null; var21 = (class186) class79.field1429.method414(-124)) {
                var21.field3600 -= var7;
                var21.field3605 -= var10;
                if (var21.field3605 < 0 || ~var21.field3600 > -1 || var21.field3605 >= 104 || var21.field3600 >= 104) {
                    var21.method797((byte) -109);
                }
            }
            class91.field1700 = arg4;
            class209.field4012 = false;
            class191.field3712 = -1;
            if (class40.field751 != 0) {
                class40.field751 -= var10;
                class153.field2741 -= var7;
            }
            class51.field936.method407(arg4 + 2);
            class6.field110.method407(arg4 + 2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) 123, arg0);
        ++field579;
        if (arg1 != 17) {
            field592 = null;
        }
        if (super.field224.field53) {
            int var4 = class37.field698[arg0];
            if (this.field586 != 0) {
                for (int var5 = 0; class201.field3889 > var5; ++var5) {
                    int var6 = 0;
                    int var7 = class131.field2381[var5];
                    int var8 = this.field586;
                    if (var8 != 1) {
                        if (~var8 != -3) {
                            if (var8 == 3) {
                                var6 = 2048 - -(-var4 + var7 >> 1);
                            }
                        } else {
                            var6 = 2048 - -(var7 + -4096 + var4 >> 1);
                        }
                    } else {
                        var6 = var7;
                    }
                    short var9 = 0;
                    for (int var10 = 0; ~this.field577 < ~var10; ++var10) {
                        if (~var6 <= ~this.field580[var10] && ~var6 > ~this.field580[var10 - -1]) {
                            if (~var6 > ~this.field581[var10]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field577; ++var12) {
                    if (~var4 <= ~this.field580[var12] && var4 < this.field580[var12 + 1]) {
                        if (~this.field581[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class93.method536(var3, 0, class201.field3889, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public static void method207(int arg0) {
        field574 = null;
        if (arg0 != -105) {
            method207(-87);
        }
        field576 = null;
        field592 = null;
        field593 = null;
        field591 = null;
        field575 = null;
        field587 = null;
        field589 = null;
        field588 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field586 = arg0.method588((byte) -111);
                    }
                } else {
                    this.field582 = arg0.method611(false);
                }
            } else {
                this.field577 = arg0.method588((byte) -69);
            }
            ++field578;
        }
    }
}
