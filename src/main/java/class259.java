import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class259 extends class371 {

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    private int field3782 = 409;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field3784 = 204;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    private int field3789 = 81;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    private int field3792 = 0;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    private int field3788 = 1024;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    private int field3803 = 4;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    private int field3804 = 1024;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    private int field3791 = 8;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "Lnj;")
    public static class487 field3794 = new class487(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "[S")
    public static short[] field3797 = new short[] { 11, 25, 45, 46, 47, 51, 48, 5 };

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    private int field3795;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field3796;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lra;")
    public static class262 field3800;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
    private int[] field3787;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[[I")
    private int[][] field3780;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "[[I")
    private int[][] field3801;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) {
        this.method1636(1);
        if (arg0 != -19103) {
            this.field3791 = 112;
        }
        ++field3785;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field3799;
        if (arg0 > -80) {
            this.field3787 = null;
        }
        int[] var3 = super.field5378.method1451(28, arg1);
        if (super.field5378.field3254) {
            int var4 = 0;
            int var5;
            for (var5 = class614.field9004[arg1] + this.field3792; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field3791 < ~var4 && ~var5 <= ~this.field3787[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field3787[var4];
            int var9 = this.field3787[var4 + -1];
            if (~var5 < ~(var9 - -this.field3795) && ~var5 > ~(-this.field3795 + var8)) {
                for (int var10 = 0; ~class41.field455 < ~var10; ++var10) {
                    int var11 = var7 ? this.field3804 : -this.field3804;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3786 * var11 >> 12) + class287.field4215[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field3803 > var12 && ~var13 <= ~this.field3801[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field3801[var6][var12];
                    int var16 = this.field3801[var6][var14];
                    if (var13 > this.field3795 + var16 && ~var13 > ~(-this.field3795 + var15)) {
                        var3[var10] = this.field3780[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class473.method2881(var3, 0, class41.field455, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
    public static final void method1631(boolean arg0) {
        ++field3798;
        if (class644.field9345 == null) {
            Container var1;
            if (class248.field3628 != null) {
                var1 = class248.field3628;
            } else {
                var1 = class328.field4850.field5129;
            }
            class507.field7548 = var1.getSize().width;
            class564.field8356 = var1.getSize().height;
            if (class248.field3628 == var1) {
                Insets var2 = class248.field3628.getInsets();
                class564.field8356 -= var2.top + var2.bottom;
                class507.field7548 -= var2.right + var2.left;
            }
            if (class608.method3540(122) == 1) {
                class467.field6748 = 0;
                class337.field4944 = class461.field6665;
                class124.field1632 = (-class632.field9239 + class507.field7548) / 2;
                class522.field7735 = class632.field9239;
            } else if (class223.field3276 < 96 && class239.field3499 == 0) {
                int var3 = class507.field7548 > 1024 ? 1024 : class507.field7548;
                int var4 = class564.field8356 <= 768 ? class564.field8356 : 768;
                class522.field7735 = var3;
                class124.field1632 = (-var3 + class507.field7548) / 2;
                class467.field6748 = 0;
                class337.field4944 = var4;
            } else {
                class337.field4944 = class564.field8356;
                class124.field1632 = 0;
                class522.field7735 = class507.field7548;
                class467.field6748 = 0;
            }
            if (class643.field9339 != class582.field8561) {
                boolean var10000;
                if (class522.field7735 < 1024 && ~class337.field4944 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class110.field1401.setSize(class522.field7735, class337.field4944);
            if (class379.field5558 != null) {
                class379.field5558.method1023(class110.field1401);
            }
            if (class248.field3628 == var1) {
                Insets var5 = class248.field3628.getInsets();
                class110.field1401.setLocation(class124.field1632 + var5.left, var5.top - -class467.field6748);
            } else {
                class110.field1401.setLocation(class124.field1632, class467.field6748);
            }
            if (!arg0) {
                field3800 = null;
            }
            if (class540.field8007 != -1) {
                class558.method3267(true, (byte) 119);
            }
            class390.method2356((byte) 115);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lhaa;III)V")
    public static final void method1632(class77 arg0, int arg1, int arg2, int arg3) {
        long var4 = class22.field199[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field895 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field890[arg0.field895++] = class29.field260[var8 - 1].field4799;
            var6 += 16L;
        }
        for (int var9 = arg0.field895; var9 < 4; ++var9) {
            arg0.field890[var9] = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(Z)V")
    public static void method1633(boolean arg0) {
        field3800 = null;
        if (!arg0) {
            field3800 = null;
        }
        field3794 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLdda;ILjava/awt/Canvas;Ln;)Lqa;")
    public static final class167 method1634(byte arg0, class597 arg1, int arg2, Canvas arg3, class472 arg4) {
        ++field3790;
        if (!class341.method2115(-1)) {
            throw new RuntimeException("");
        } else if (!class53.method271((byte) -108, "jaggl")) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class540 var8 = new class540(var5, arg3, var6, arg4, arg1, arg2);
                var8.method1150(19933);
                return arg0 != -77 ? null : var8;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1635(int arg0, String arg1) {
        if (arg0 >= -34) {
            return null;
        } else {
            ++field3793;
            String var2 = class216.method1392(class273.method1727(0, arg1), -13929);
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field3781;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field3788 = arg2.method2620(33);
                                    }
                                } else {
                                    this.field3789 = arg2.method2620(114);
                                }
                            } else {
                                this.field3792 = arg2.method2620(112);
                            }
                        } else {
                            this.field3804 = arg2.method2620(30);
                        }
                    } else {
                        this.field3784 = arg2.method2620(100);
                    }
                } else {
                    this.field3782 = arg2.method2620(106);
                }
            } else {
                this.field3791 = arg2.method2561((byte) -69);
            }
        } else {
            this.field3803 = arg2.method2561((byte) -35);
        }
        int var5 = -27 % ((-15 - arg1) / 39);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    private final void method1636(int arg0) {
        ++field3783;
        Random var2 = new Random((long) this.field3791);
        this.field3796 = 4096 / this.field3791;
        this.field3795 = this.field3789 / 2;
        if (arg0 != 1) {
            this.method79((byte) 119, 109);
        }
        this.field3786 = 4096 / this.field3803;
        int var3 = this.field3786 / 2;
        this.field3801 = new int[this.field3791][this.field3803 + 1];
        this.field3780 = new int[this.field3791][this.field3803];
        int var4 = this.field3796 / 2;
        this.field3787 = new int[this.field3791 + 1];
        this.field3787[0] = 0;
        for (int var5 = 0; this.field3791 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3796;
                int var7 = (class296.method1832(false, 4096, var2) + -2048) * this.field3784 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3787[var5] = this.field3787[var5 + -1] + var8;
            }
            this.field3801[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3803; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3786;
                    int var11 = (-2048 + class296.method1832(false, 4096, var2)) * this.field3782 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3801[var5][var9] = this.field3801[var5][var9 + -1] + var12;
                }
                this.field3780[var5][var9] = ~this.field3788 >= -1 ? 4096 : 4096 - class296.method1832(false, this.field3788, var2);
            }
            this.field3801[var5][this.field3803] = 4096;
        }
        this.field3787[this.field3791] = 4096;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lfc;)V")
    public static final void method1637(class323 arg0) {
        if (class318.field4753 < 65535) {
            class535 var1 = arg0.field4799;
            class29.field260[class318.field4753] = arg0;
            class490.field7416[class318.field4753] = false;
            ++class318.field4753;
            int var2 = arg0.field4791;
            if (arg0.field4785) {
                var2 = 0;
            }
            int var3 = arg0.field4791;
            if (arg0.field4795) {
                var3 = class487.field7383 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3143(-112) - var1.method3146(0) + class605.field8913 >> class179.field2726;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3143(-128) + var1.method3146(0) - class605.field8913 >> class179.field2726;
                if (var7 >= class366.field5271) {
                    var7 = class366.field5271 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field4800[var5++];
                    int var10 = (var1.method3151(-102) - var1.method3146(0) + class605.field8913 >> class179.field2726) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class331.field4909) {
                        var11 = class331.field4909 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class22.field199[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class22.field199[var4][var12][var8] = var13 | (long) class318.field4753;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class22.field199[var4][var12][var8] = var13 | (long) class318.field4753 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class22.field199[var4][var12][var8] = var13 | (long) class318.field4753 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class22.field199[var4][var12][var8] = var13 | (long) class318.field4753 << 48;
                        }
                    }
                }
            }
        }
    }
}
