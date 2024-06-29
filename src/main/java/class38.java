import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 extends class264 {

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    private int field579 = 409;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    private int field580 = 1024;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    private int field568 = 8;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    private int field578 = 204;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    private int field587 = 4;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    private int field591 = 81;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    private int field570 = 1024;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    private int field594 = 0;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
    public static int[] field586 = new int[500];

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lcf;")
    public static class93 field577 = class147.method1066("Veuillez commencer par supprimer ", -48);

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "Z")
    public static boolean field585 = false;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "Z")
    public static boolean field582 = false;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Lhg;")
    public static class177 field569;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "Lhg;")
    public static class177 field572;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "[I")
    private int[] field596;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[[I")
    private int[][] field573;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "[[I")
    private int[][] field588;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
    private final void method219(byte arg0) {
        ++field584;
        Random var2 = new Random((long) this.field568);
        this.field588 = new int[this.field568][this.field587];
        this.field576 = this.field591 / 2;
        this.field589 = 4096 / this.field568;
        this.field571 = 4096 / this.field587;
        int var3 = -81 % ((-58 - arg0) / 43);
        this.field596 = new int[this.field568 + 1];
        int var4 = this.field571 / 2;
        this.field596[0] = 0;
        int var5 = this.field589 / 2;
        this.field573 = new int[this.field568][this.field587 + 1];
        for (int var6 = 0; ~var6 > ~this.field568; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field589;
                int var8 = (-2048 + class42.method238(var2, false, 4096)) * this.field578 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field596[var6] = this.field596[var6 + -1] + var9;
            }
            this.field573[var6][0] = 0;
            for (int var10 = 0; ~var10 > ~this.field587; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field571;
                    int var12 = (class42.method238(var2, false, 4096) + -2048) * this.field579 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field573[var6][var10] = this.field573[var6][var10 + -1] + var13;
                }
                this.field588[var6][var10] = this.field570 > 0 ? -class42.method238(var2, false, this.field570) + 4096 : 4096;
            }
            this.field573[var6][this.field587] = 4096;
        }
        this.field596[this.field568] = 4096;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)Lcf;")
    public static final class93 method220(byte arg0) {
        ++field590;
        if (arg0 >= -66) {
            field595 = 72;
        }
        class93 var1;
        if (class268.field4769 == 1 && class253.field4549 < 2) {
            var1 = class130.method949((byte) -77, new class93[] { class156.field2768, class31.field496, class97.field1738, class19.field260 });
        } else if (class263.field4695 && ~class253.field4549 > -3) {
            var1 = class130.method949((byte) -77, new class93[] { class153.field2683, class31.field496, class66.field1206, class19.field260 });
        } else if (class108.field1851 && class176.field3048[81] && class253.field4549 > 2) {
            var1 = class3.method12(class253.field4549 + -2, -12);
        } else {
            var1 = class3.method12(class253.field4549 + -1, -8);
        }
        if (class253.field4549 > 2) {
            var1 = class130.method949((byte) -77, new class93[] { var1, class7.field96, class148.method1067(-7015, class253.field4549 - 2), class86.field1556 });
        }
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field581;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field570 = arg2.method1891(-121);
                                    }
                                } else {
                                    this.field591 = arg2.method1891(-117);
                                }
                            } else {
                                this.field594 = arg2.method1891(-116);
                            }
                        } else {
                            this.field580 = arg2.method1891(-121);
                        }
                    } else {
                        this.field578 = arg2.method1891(-117);
                    }
                } else {
                    this.field579 = arg2.method1891(-117);
                }
            } else {
                this.field568 = arg2.method1907(16832);
            }
        } else {
            this.field587 = arg2.method1907(16832);
        }
        if (arg0 <= 11) {
            this.method64(-7);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field583;
        int[] var3 = super.field4716.method532((byte) 65, arg0);
        if (super.field4716.field1424) {
            int var4 = 0;
            int var5;
            for (var5 = class67.field1220[arg0] + this.field594; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field568 && var5 >= this.field596[var4]) {
                ++var4;
            }
            int var6 = this.field596[var4 + -1];
            int var7 = var4 + -1;
            boolean var8 = (1 & var4) == 0;
            int var9 = this.field596[var4];
            if (~(this.field576 + var6) > ~var5 && ~(-this.field576 + var9) < ~var5) {
                for (int var10 = 0; ~var10 > ~class176.field3060; ++var10) {
                    int var11 = 0;
                    int var12 = !var8 ? -this.field580 : this.field580;
                    int var13;
                    for (var13 = class144.field2497[var10] - -(this.field571 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field587 && this.field573[var7][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field573[var7][var14];
                    int var16 = this.field573[var7][var11];
                    if (this.field576 + var15 < var13 && ~(-this.field576 + var16) < ~var13) {
                        var3[var10] = this.field588[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class107.method773(var3, 0, class176.field3060, 0);
            }
        }
        if (arg1 >= -83) {
            method222(54, false, -68, 23, 120, 36, -84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V")
    public static void method221(byte arg0) {
        field569 = null;
        field586 = null;
        field577 = null;
        if (arg0 != 66) {
            field574 = 75;
        }
        field572 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field575;
        if (arg0 != -3) {
            this.field570 = 120;
        }
        this.method219((byte) -123);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIIIII)I")
    public static final int method222(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg3 & 1) == -2) {
            int var7 = arg5;
            arg5 = arg6;
            arg6 = var7;
        }
        ++field592;
        int var8 = arg2 & 3;
        if (arg1) {
            method221((byte) -13);
        }
        if (~var8 == -1) {
            return arg4;
        } else if (var8 == 1) {
            return arg0;
        } else {
            return var8 == 2 ? 7 - arg4 + -arg5 + 1 : -arg6 + 8 + -arg0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class38() {
        super(0, true);
    }
}
