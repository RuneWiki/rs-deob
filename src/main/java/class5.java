import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 extends class13 {

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    private int field78 = 81;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    private int field72 = 1024;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field73 = 8;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field69 = 4;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    private int field88 = 204;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    private int field82 = 409;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "I")
    private int field90 = 1024;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "[[[I")
    public static int[][][] field89 = new int[2][][];

    @OriginalMember(owner = "client!il", name = "X", descriptor = "Lbj;")
    public static class131 field87 = new class131(8);

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "Z")
    public static boolean field92 = false;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
    private int[] field85;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "[[I")
    private int[][] field67;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "[[I")
    private int[][] field80;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILuo;)V")
    public static final void method28(int arg0, class345 arg1) {
        if (arg0 != 0) {
            field91 = null;
        }
        ++field83;
        if (~class114.field1640.method636((byte) 29) != -1) {
            if (~class326.field4462 != -1 && class326.field4462 != 2) {
                if (class99.field1378 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class99.field1378 = class345.method2183(var2, arg0 ^ -96, class241.field3426, 0, class163.field2253, 0);
                    class117.field1679 = class99.field1378.method76(class282.method1837(class260.field3643, class403.field5721, (byte) 121, 0), class238.method1617(class212.field2969, class403.field5721, 0), true);
                }
                for (class128 var3 = (class128) class114.field1640.method646(48); var3 != null; var3 = (class128) class114.field1640.method641(false)) {
                    class187.method1216(1, var3.field1795, var3.field1793, var3.field1797, var3.field1803, false, var3.field1796, class99.field1378, arg1, false, var3.field1798 ? class412.field5841.field1934 : null, class117.field1679);
                    var3.method2467((byte) 79);
                }
            } else {
                for (class128 var4 = (class128) class114.field1640.method646(arg0 ^ 48); var4 != null; var4 = (class128) class114.field1640.method641(false)) {
                    class187.method1216(arg0 ^ 1, var4.field1795, var4.field1793, var4.field1797, var4.field1803, false, var4.field1796, arg1, arg1, false, var4.field1798 ? class412.field5841.field1934 : null, class51.field711);
                    var4.method2467((byte) -76);
                }
                class386.method2450((byte) -35);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field79;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = 0;
            int var5;
            for (var5 = class277.field3873[arg1] + this.field86; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field73 > var4 && ~this.field85[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field85[var4];
            int var9 = this.field85[var4 + -1];
            if (this.field70 + var9 < var5 && -this.field70 + var8 > var5) {
                for (int var10 = 0; class269.field3751 > var10; ++var10) {
                    int var11 = !var7 ? -this.field90 : this.field90;
                    int var12 = 0;
                    int var13;
                    for (var13 = class296.field4148[var10] - -(this.field76 * var11 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field69 && this.field67[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field67[var6][var14];
                    int var16 = this.field67[var6][var12];
                    if (~(var15 - -this.field70) > ~var13 && var13 < var16 - this.field70) {
                        var3[var10] = this.field80[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class36.method346(var3, 0, class269.field3751, 0);
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    private final void method30(int arg0) {
        ++field84;
        Random var2 = new Random((long) this.field73);
        this.field76 = 4096 / this.field69;
        this.field74 = 4096 / this.field73;
        this.field70 = this.field78 / 2;
        int var3 = this.field76 / 2;
        this.field85 = new int[this.field73 + 1];
        if (arg0 >= 46) {
            this.field80 = new int[this.field73][this.field69];
            this.field67 = new int[this.field73][this.field69 - -1];
            int var4 = this.field74 / 2;
            this.field85[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field73; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field74;
                    int var7 = (-2048 + class26.method299(4096, (byte) -50, var2)) * this.field88 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field85[var5] = this.field85[var5 + -1] - -var8;
                }
                this.field67[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field69; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field76;
                        int var11 = (class26.method299(4096, (byte) 110, var2) - 2048) * this.field82 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field67[var5][var9] = this.field67[var5][var9 + -1] - -var12;
                    }
                    this.field80[var5][var9] = ~this.field72 >= -1 ? 4096 : 4096 - class26.method299(this.field72, (byte) -125, var2);
                }
                this.field67[var5][this.field69] = 4096;
            }
            this.field85[this.field73] = 4096;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field72 = arg0.method174(255);
                                    }
                                } else {
                                    this.field78 = arg0.method174(255);
                                }
                            } else {
                                this.field86 = arg0.method174(255);
                            }
                        } else {
                            this.field90 = arg0.method174(255);
                        }
                    } else {
                        this.field88 = arg0.method174(255);
                    }
                } else {
                    this.field82 = arg0.method174(255);
                }
            } else {
                this.field73 = arg0.method172((byte) 52);
            }
        } else {
            this.field69 = arg0.method172((byte) 52);
        }
        ++field81;
        if (arg1 < 50) {
            this.method33(-15);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public static void method32(int arg0) {
        field89 = null;
        field91 = null;
        field87 = null;
        if (arg0 != 2) {
            field92 = true;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field75;
        this.method30(89);
        int var2 = -54 / ((2 - arg0) / 51);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
    public static final void method34(int arg0, byte arg1) {
        if (arg1 <= 31) {
            field68 = -119;
        }
        ++field77;
        class239 var2 = class436.method2740(7, arg0, -323285792);
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public static final void method35(int arg0) {
        class369.method2374(true);
        ++field71;
        class7.method39(arg0 + -27101);
        class242.method1642(-26571);
        class191.method1237(121);
        class120.method822(arg0 + -27175);
        if (arg0 != 27175) {
            method28(-51, (class345) null);
        }
        class380.method2423(false);
        class277.method1801((byte) -31);
        class410.method2568((byte) 91);
        class286.method1867(arg0 ^ 27352);
        class233.method1595(arg0 + -27094);
        class399.method2516(false);
        class195.method1261((byte) 73);
        class239.method1621(70);
        class450.method2802(27094);
        class296.method1928(20172);
        class51.method431(38);
        class184.method1201(24122);
        class281.method1834(2);
        class181.method1187(120);
        class133.method923(-45);
        class208.method1348(4670);
        class438.method2752((byte) 114);
        class378.method2420((byte) 101);
        class375.field5348.method900(0);
        class412.field5842.method900(0);
        class425.field5992.method900(0);
        field87.method900(0);
        class177.field2441.method900(0);
    }
}
