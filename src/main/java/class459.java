import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class459 extends class297 {

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    private int field6461 = 1024;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    private int field6465 = 1024;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    private int field6470 = 0;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    private int field6476 = 4;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    private int field6471 = 81;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    private int field6479 = 409;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    private int field6482 = 204;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    private int field6478 = 8;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Lmu;")
    public static class303 field6462 = new class303(104, 1);

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "Lwq;")
    public static class169 field6480 = new class169(1);

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "Lej;")
    public static class124 field6481 = new class124(20, -1);

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    private int field6468;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    private int field6475;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    private int field6477;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "[I")
    private int[] field6474;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "[[I")
    private int[][] field6463;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "[[I")
    private int[][] field6464;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
    private final void method2721(byte arg0) {
        ++field6466;
        Random var2 = new Random((long) this.field6478);
        this.field6475 = this.field6471 / 2;
        this.field6468 = 4096 / this.field6476;
        this.field6477 = 4096 / this.field6478;
        int var3 = this.field6468 / 2;
        this.field6474 = new int[this.field6478 + 1];
        int var4 = this.field6477 / 2;
        this.field6464 = new int[this.field6478][this.field6476 + 1];
        this.field6463 = new int[this.field6478][this.field6476];
        this.field6474[0] = 0;
        if (arg0 >= -111) {
            this.method2721((byte) 67);
        }
        for (int var5 = 0; var5 < this.field6478; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field6477;
                int var7 = (class37.method463((byte) 90, 4096, var2) - 2048) * this.field6482 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6474[var5] = this.field6474[var5 + -1] + var8;
            }
            this.field6464[var5][0] = 0;
            for (int var9 = 0; this.field6476 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field6468;
                    int var11 = (class37.method463((byte) 117, 4096, var2) - 2048) * this.field6479 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6464[var5][var9] = this.field6464[var5][var9 + -1] + var12;
                }
                this.field6463[var5][var9] = this.field6461 <= 0 ? 4096 : -class37.method463((byte) 124, this.field6461, var2) + 4096;
            }
            this.field6464[var5][this.field6476] = 4096;
        }
        this.field6474[this.field6478] = 4096;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class459() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public static void method2722(int arg0) {
        field6481 = null;
        field6480 = null;
        if (arg0 != -1633784916) {
            field6480 = null;
        }
        field6462 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field6469;
        if (arg2 != 31015) {
            method2723(106, 16);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field6461 = arg0.method1478(arg2 + 842366929);
                                    }
                                } else {
                                    this.field6471 = arg0.method1478(842397944);
                                }
                            } else {
                                this.field6470 = arg0.method1478(842397944);
                            }
                        } else {
                            this.field6465 = arg0.method1478(842397944);
                        }
                    } else {
                        this.field6482 = arg0.method1478(842397944);
                    }
                } else {
                    this.field6479 = arg0.method1478(842397944);
                }
            } else {
                this.field6478 = arg0.method1535(255);
            }
        } else {
            this.field6476 = arg0.method1535(255);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field6473;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int var4 = 0;
            int var5;
            for (var5 = class620.field8445[arg0] + this.field6470; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field6478 < ~var4 && var5 >= this.field6474[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field6474[var4];
            int var9 = this.field6474[var4 - 1];
            if (this.field6475 + var9 < var5 && ~(var8 - this.field6475) < ~var5) {
                for (int var10 = 0; class525.field7275 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field6465 : this.field6465;
                    int var13;
                    for (var13 = (this.field6468 * var12 >> 12) + class733.field9899[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field6476 < ~var11 && ~var13 <= ~this.field6464[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field6464[var6][var14];
                    int var16 = this.field6464[var6][var11];
                    if (~var13 < ~(this.field6475 + var15) && var13 < -this.field6475 + var16) {
                        var3[var10] = this.field6463[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class363.method2321(var3, 0, class525.field7275, 0);
            }
        }
        if (arg1 != 255) {
            method2722(44);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(II)V")
    public static final void method2723(int arg0, int arg1) {
        ++field6467;
        if (class7.field48 != arg1) {
            if (arg0 < 18) {
                field6480 = null;
            }
            class376.field5325 = class175.field2711 = class192.field2848[arg1];
            class316.method2045((byte) -9);
            class554.field7662 = new int[4][class376.field5325 >> 3][class175.field2711 >> 3];
            class616.field8415 = new int[class376.field5325][class175.field2711];
            class172.field2683 = new int[class376.field5325][class175.field2711];
            for (int var2 = 0; var2 < 4; ++var2) {
                class19.field295[var2] = class232.method1620(class175.field2711, 1, class376.field5325);
            }
            class591.field8070 = new byte[4][class376.field5325][class175.field2711];
            class212.method1457(19278, class175.field2711, class376.field5325, 4);
            class136.method1110(class376.field5325 >> 3, 21719, class272.field3822, class175.field2711 >> 3);
            class7.field48 = arg1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        if (arg0 <= 108) {
            method2723(-110, -119);
        }
        ++field6472;
        this.method2721((byte) -125);
    }
}
