import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class93 extends class270 {

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field1463 = 0;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field1462 = 1024;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field1464 = 1024;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    private int field1474 = 409;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field1470 = 204;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    private int field1459 = 81;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private int field1456 = 4;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    private int field1469 = 8;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1465 = new Rectangle[100];

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "[I")
    private int[] field1468;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "[[I")
    private int[][] field1460;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[[I")
    private int[][] field1467;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)Z")
    public static final boolean method783(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1465 = null;
        }
        ++field1457;
        return ~(class278.field4176[1][arg0][arg2] & 2) != -1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.method786(2048);
        if (arg0) {
            ++field1475;
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V")
    public static void method784(byte arg0) {
        field1465 = null;
        if (arg0 != -19) {
            method785(63, (String) null, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field1458;
        if (arg0 != 108) {
            this.field1473 = -67;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field1462 = arg1.method320((byte) -87);
                                    }
                                } else {
                                    this.field1459 = arg1.method320((byte) -87);
                                }
                            } else {
                                this.field1463 = arg1.method320((byte) -87);
                            }
                        } else {
                            this.field1464 = arg1.method320((byte) -87);
                        }
                    } else {
                        this.field1470 = arg1.method320((byte) -87);
                    }
                } else {
                    this.field1474 = arg1.method320((byte) -87);
                }
            } else {
                this.field1469 = arg1.method271((byte) 123);
            }
        } else {
            this.field1456 = arg1.method271((byte) 100);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
    public static final void method785(int arg0, String arg1, String arg2, boolean arg3) {
        class422.field6148 = arg2;
        class441.field6409 = arg1;
        ++field1466;
        class106.field1752 = arg0;
        if (!class441.field6409.equals("") && !class422.field6148.equals("")) {
            if (class419.field6108 != -1) {
                class249.method1794(-5425);
            } else {
                class257.field3719 = 0;
                class148.field2285 = 0;
                class11.field159 = -3;
                class132.field2136 = 1;
                class37 var4 = new class37(128);
                var4.method267(10, arg3);
                var4.method275((int) (Math.random() * 9.9999999E7D), 1414495172);
                var4.method269(98, class437.method2739(37, class441.field6409));
                var4.method275((int) (Math.random() * 9.9999999E7D), 1414495172);
                var4.method265((byte) -88, class422.field6148);
                var4.method275((int) (Math.random() * 9.9999999E7D), 1414495172);
                var4.method303(124, class367.field5223, class372.field5276);
                class13.field216.field565 = 0;
                class13.field216.method267(24, arg3);
                class13.field216.method267(2 - -var4.field565, arg3);
                class13.field216.method324(558, -80);
                class13.field216.method313(0, var4.field578, 25100, var4.field565);
            }
        } else {
            class11.field159 = 3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            return null;
        } else {
            ++field1472;
            int[] var3 = super.field4053.method396(arg1, -71);
            if (super.field4053.field815) {
                int var4 = 0;
                int var5;
                for (var5 = class364.field5185[arg1] + this.field1463; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field1469 < ~var4 && this.field1468[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field1468[var4];
                int var9 = this.field1468[var4 - 1];
                if (this.field1473 + var9 < var5 && -this.field1473 + var8 > var5) {
                    for (int var10 = 0; ~class161.field2445 < ~var10; ++var10) {
                        int var11 = 0;
                        int var12 = var7 ? this.field1464 : -this.field1464;
                        int var13;
                        for (var13 = class136.field2168[var10] - -(this.field1461 * var12 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (var11 < this.field1456 && ~var13 <= ~this.field1467[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1467[var6][var11];
                        int var16 = this.field1467[var6][var14];
                        if (this.field1473 + var16 < var13 && ~(-this.field1473 + var15) < ~var13) {
                            var3[var10] = this.field1460[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class82.method638(var3, 0, class161.field2445, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    private final void method786(int arg0) {
        ++field1455;
        Random var2 = new Random((long) this.field1469);
        this.field1473 = this.field1459 / 2;
        this.field1461 = 4096 / this.field1456;
        this.field1476 = 4096 / this.field1469;
        int var3 = this.field1461 / 2;
        if (arg0 != 2048) {
            method783(6, true, -10);
        }
        this.field1467 = new int[this.field1469][this.field1456 + 1];
        int var4 = this.field1476 / 2;
        this.field1460 = new int[this.field1469][this.field1456];
        this.field1468 = new int[this.field1469 + 1];
        this.field1468[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field1469; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1476;
                int var7 = (class11.method74(4096, 16384, var2) - 2048) * this.field1470 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1468[var5] = this.field1468[var5 - 1] - -var8;
            }
            this.field1467[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1456; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1461;
                    int var11 = (class11.method74(4096, 16384, var2) + -2048) * this.field1474 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1467[var5][var9] = this.field1467[var5][var9 - 1] + var12;
                }
                this.field1460[var5][var9] = ~this.field1462 >= -1 ? 4096 : 4096 - class11.method74(this.field1462, 16384, var2);
            }
            this.field1467[var5][this.field1456] = 4096;
        }
        this.field1468[this.field1469] = 4096;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
    public static final void method787(byte arg0, boolean arg1) {
        if (arg0 != 48) {
            method787((byte) -58, true);
        }
        ++field1471;
        class288.method2028(-1, class321.field4642, arg1, class113.field1819, class277.field4170);
    }
}
