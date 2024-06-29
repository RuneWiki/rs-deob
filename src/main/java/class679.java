import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class679 extends class601 {

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    private int field9487 = 204;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    private int field9478 = 8;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private int field9492 = 81;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    private int field9480 = 409;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    private int field9479 = 0;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    private int field9495 = 1024;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    private int field9496 = 4;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    private int field9497 = 1024;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field9481 = 0;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lkaa;")
    public static class47 field9494 = new class47(35, 6);

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    private int field9477;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    private int field9482;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private int field9488;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "[I")
    private int[] field9489;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "[Lhu;")
    public static class133[] field9485;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "[[I")
    private int[][] field9483;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "[[I")
    private int[][] field9486;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field9493;
        if (arg0 != -40) {
            return null;
        } else {
            int[] var3 = super.field7902.method382(arg1, true);
            if (super.field7902.field704) {
                int var4 = 0;
                int var5;
                for (var5 = class250.field3446[arg1] - -this.field9479; var5 < 0; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field9478 && ~var5 <= ~this.field9489[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field9489[var4];
                int var9 = this.field9489[var4 + -1];
                if (var5 > this.field9482 + var9 && ~(-this.field9482 + var8) < ~var5) {
                    for (int var10 = 0; class171.field2624 > var10; ++var10) {
                        int var11 = var7 ? this.field9497 : -this.field9497;
                        int var12 = 0;
                        int var13;
                        for (var13 = class453.field6186[var10] - -(this.field9477 * var11 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~var12 > ~this.field9496 && ~var13 <= ~this.field9483[var6][var12]) {
                            ++var12;
                        }
                        int var14 = var12 + -1;
                        int var15 = this.field9483[var6][var12];
                        int var16 = this.field9483[var6][var14];
                        if (~(this.field9482 + var16) > ~var13 && ~var13 > ~(-this.field9482 + var15)) {
                            var3[var10] = this.field9486[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class335.method2021(var3, 0, class171.field2624, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field9495 = arg0.method3807(arg1 ^ 60);
                                    }
                                } else {
                                    this.field9492 = arg0.method3807(-1);
                                }
                            } else {
                                this.field9479 = arg0.method3807(-1);
                            }
                        } else {
                            this.field9497 = arg0.method3807(arg1 + 60);
                        }
                    } else {
                        this.field9487 = arg0.method3807(arg1 + 60);
                    }
                } else {
                    this.field9480 = arg0.method3807(arg1 ^ 60);
                }
            } else {
                this.field9478 = arg0.method3821((byte) 95);
            }
        } else {
            this.field9496 = arg0.method3821((byte) 115);
        }
        ++field9475;
        if (arg1 != -61) {
            this.method6((class677) null, (byte) -35, -126);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    private final void method3838(int arg0) {
        ++field9484;
        Random var2 = new Random((long) this.field9478);
        this.field9482 = this.field9492 / 2;
        this.field9488 = 4096 / this.field9478;
        this.field9477 = 4096 / this.field9496;
        int var3 = this.field9477 / 2;
        this.field9486 = new int[this.field9478][this.field9496];
        this.field9489 = new int[this.field9478 + 1];
        this.field9483 = new int[this.field9478][this.field9496 - -1];
        int var4 = this.field9488 / 2;
        if (arg0 > -51) {
            method3841(-18, 32, 34, 63);
        }
        this.field9489[0] = 0;
        for (int var5 = 0; ~this.field9478 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field9488;
                int var7 = (class309.method1906(4096, -1, var2) + -2048) * this.field9487 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field9489[var5] = this.field9489[var5 + -1] + var8;
            }
            this.field9483[var5][0] = 0;
            for (int var9 = 0; var9 < this.field9496; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field9477;
                    int var11 = (-2048 + class309.method1906(4096, -1, var2)) * this.field9480 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field9483[var5][var9] = this.field9483[var5][var9 + -1] + var12;
                }
                this.field9486[var5][var9] = ~this.field9495 < -1 ? -class309.method1906(this.field9495, -1, var2) + 4096 : 4096;
            }
            this.field9483[var5][this.field9496] = 4096;
        }
        this.field9489[this.field9478] = 4096;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILvfa;I)V")
    public static final void method3839(int arg0, int arg1, class672 arg2, int arg3) {
        ++field9491;
        if (arg2 != null) {
            if (arg2.field9288 != null) {
                class309 var4 = new class309();
                var4.field4435 = arg2;
                var4.field4439 = arg2.field9288;
                class182.method1249(var4);
            }
            class649.field8631 = arg2.field9200;
            class136.field2168 = arg2.field9277;
            class414.field5733 = arg2.field9231;
            class142.field2268 = true;
            class495.field6680 = arg0;
            class275.field3827 = arg2.field9318;
            class737.field10192 = arg2.field9233;
            class575.field7557 = arg3;
            if (arg1 != 1) {
                method3839(41, 4, (class672) null, 82);
            }
            class399.method2347(arg2, 2260);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.method3838(-88);
        ++field9490;
        if (arg0 != 8351) {
            this.method6((class677) null, (byte) -112, 81);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method3840(byte arg0) {
        field9485 = null;
        field9494 = null;
        if (arg0 != 32) {
            method3840((byte) 125);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
    public static final void method3841(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 29 % ((arg0 - 18) / 37);
        if (arg1 == 1006) {
            class182.method1258(class323.field4591, arg2, arg3);
        } else if (arg1 == 1004) {
            class182.method1258(class256.field3517, arg2, arg3);
        } else if (~arg1 != -1008) {
            if (~arg1 == -1002) {
                class182.method1258(class331.field4724, arg2, arg3);
            } else if (arg1 == 1012) {
                class182.method1258(class167.field2586, arg2, arg3);
            }
        } else {
            class182.method1258(class465.field6409, arg2, arg3);
        }
        ++field9476;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class679() {
        super(0, true);
    }
}
