import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class105 extends class440 {

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    private int field1626 = 16;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    private int field1625 = 0;

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "I")
    private int field1631 = 2000;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    private int field1630 = 0;

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
    private int field1636 = 4096;

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "[I")
    public static int[] field1634 = new int[256];

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "F")
    public static float field1635 = 1024.0F;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "()V")
    public static final void method838() {
        for (int var0 = 0; var0 < class282.field4237; ++var0) {
            class454 var1 = class518.field7307[var0];
            class583.method3316(var1, true);
            class518.field7307[var0] = null;
        }
        class282.field4237 = 0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/io/File;I)[B")
    public static final byte[] method839(int arg0, File arg1, int arg2) {
        ++field1633;
        try {
            byte[] var3 = new byte[arg2];
            class460.method2701(arg2, arg1, 87, var3);
            return arg0 != -738 ? null : var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field1627;
        if (arg0 == 5) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                this.field1636 = arg1.method3847((byte) 118);
                            }
                        } else {
                            this.field1630 = arg1.method3847((byte) 118);
                        }
                    } else {
                        this.field1626 = arg1.method3826(false);
                    }
                } else {
                    this.field1631 = arg1.method3847((byte) 118);
                }
            } else {
                this.field1625 = arg1.method3826(false);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        class31.method354((byte) 95);
        ++field1629;
        if (arg0 != -9) {
            field1635 = -0.7330232F;
        }
    }

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)V")
    public static void method840(int arg0) {
        if (arg0 != -12542) {
            field1634 = null;
        }
        field1634 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field1628;
        int var3 = 5 / ((-56 - arg0) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int var5 = this.field1636 >> 1;
            int[][] var6 = super.field6412.method3249(-29306);
            Random var7 = new Random((long) this.field1625);
            for (int var8 = 0; var8 < this.field1631; ++var8) {
                int var9 = ~this.field1636 >= -1 ? this.field1630 : this.field1630 - (var5 + -class311.method1976(-1, this.field1636, var7));
                int var10 = (4088 & var9) >> 4;
                int var11 = class311.method1976(-1, class549.field7715, var7);
                int var12 = class311.method1976(-1, class221.field3098, var7);
                int var13 = (class453.field6514[var10] * this.field1626 >> 12) + var11;
                int var14 = (class493.field7016[var10] * this.field1626 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = var13 - var11;
                if (var16 != 0 || var15 != 0) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var17 = var16 < var15;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (var11 > var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class311.method1976(-1, 4096, var7) >> 2);
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    int var28 = ~var12 <= ~var14 ? -1 : 1;
                    for (int var29 = var11; ~var13 < ~var29; ++var29) {
                        int var30 = var27 + 1024 - -((var29 - var11) * var26);
                        int var31 = var29 & class420.field6112;
                        int var32 = class651.field9116 & var22;
                        var25 += var24;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        if (var25 > 0) {
                            var25 -= var23;
                            var22 += var28;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lqaa;II)V")
    public static final void method841(class26 arg0, int arg1, int arg2) {
        ++field1632;
        boolean var3 = arg0.method309((byte) 57, 1) == 1;
        if (var3) {
            class568.field7985[class580.field8173++] = arg2;
        }
        int var4 = arg0.method309((byte) 57, 2);
        if (arg1 <= -88) {
            class491 var5 = class141.field2087[arg2];
            if (~var4 == -1) {
                if (var3) {
                    var5.field6975 = false;
                } else if (~class99.field1551 == ~arg2) {
                    throw new RuntimeException("s:lr");
                } else {
                    class94 var6 = class495.field7033[arg2] = new class94();
                    var6.field1499 = (var5.field6262[0] + class203.field2874 >> 6) + ((var5.field3019 << 28) - -(var5.field6271[0] + class109.field1672 >> 6 << 14));
                    if (var5.field6962 != -1) {
                        var6.field1496 = var5.field6962;
                    } else {
                        var6.field1496 = var5.field6209.method2948((byte) -109);
                    }
                    var6.field1500 = var5.field6999;
                    var6.field1497 = var5.field6171;
                    if (~var5.field6986 < -1) {
                        class629.method3506(var5, 1);
                    }
                    class141.field2087[arg2] = null;
                    if (~arg0.method309((byte) 57, 1) != -1) {
                        class189.method1271(arg2, 255, arg0);
                    }
                }
            } else if (var4 == 1) {
                int var7 = arg0.method309((byte) 57, 3);
                int var8 = var5.field6271[0];
                int var9 = var5.field6262[0];
                if (~var7 != -1) {
                    if (var7 != 1) {
                        if (~var7 != -3) {
                            if (var7 == 3) {
                                --var8;
                            } else if (~var7 != -5) {
                                if (~var7 == -6) {
                                    --var8;
                                    ++var9;
                                } else if (~var7 != -7) {
                                    if (var7 == 7) {
                                        ++var8;
                                        ++var9;
                                    }
                                } else {
                                    ++var9;
                                }
                            } else {
                                ++var8;
                            }
                        } else {
                            ++var8;
                            --var9;
                        }
                    } else {
                        --var9;
                    }
                } else {
                    --var9;
                    --var8;
                }
                if (var3) {
                    var5.field6963 = var9;
                    var5.field6975 = true;
                    var5.field6989 = var8;
                } else {
                    var5.method2846(class208.field2924[arg2], -23483, var8, var9);
                }
            } else if (var4 == 2) {
                int var10 = arg0.method309((byte) 57, 4);
                int var11 = var5.field6271[0];
                int var12 = var5.field6262[0];
                if (var10 != 0) {
                    if (~var10 == -2) {
                        var12 -= 2;
                        --var11;
                    } else if (var10 != 2) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (~var10 == -6) {
                                    --var12;
                                    var11 -= 2;
                                } else if (var10 != 6) {
                                    if (var10 != 7) {
                                        if (~var10 != -9) {
                                            if (~var10 != -10) {
                                                if (var10 != 10) {
                                                    if (var10 == 11) {
                                                        var11 -= 2;
                                                        var12 += 2;
                                                    } else if (~var10 == -13) {
                                                        --var11;
                                                        var12 += 2;
                                                    } else if (~var10 == -14) {
                                                        var12 += 2;
                                                    } else if (var10 == 14) {
                                                        var12 += 2;
                                                        ++var11;
                                                    } else if (~var10 == -16) {
                                                        var11 += 2;
                                                        var12 += 2;
                                                    }
                                                } else {
                                                    ++var12;
                                                    var11 += 2;
                                                }
                                            } else {
                                                ++var12;
                                                var11 -= 2;
                                            }
                                        } else {
                                            var11 += 2;
                                        }
                                    } else {
                                        var11 -= 2;
                                    }
                                } else {
                                    var11 += 2;
                                    --var12;
                                }
                            } else {
                                var12 -= 2;
                                var11 += 2;
                            }
                        } else {
                            ++var11;
                            var12 -= 2;
                        }
                    } else {
                        var12 -= 2;
                    }
                } else {
                    var11 -= 2;
                    var12 -= 2;
                }
                if (var3) {
                    var5.field6975 = true;
                    var5.field6989 = var11;
                    var5.field6963 = var12;
                } else {
                    var5.method2846(class208.field2924[arg2], -23483, var11, var12);
                }
            } else {
                int var13 = arg0.method309((byte) 57, 1);
                if (var13 == 0) {
                    int var14 = arg0.method309((byte) 57, 12);
                    int var15 = var14 >> 10;
                    int var16 = 31 & var14 >> 5;
                    if (~var16 < -16) {
                        var16 -= 32;
                    }
                    int var17 = 31 & var14;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field6271[0] + var16;
                    int var19 = var5.field6262[0] + var17;
                    if (!var3) {
                        var5.method2846(class208.field2924[arg2], -23483, var18, var19);
                    } else {
                        var5.field6975 = true;
                        var5.field6989 = var18;
                        var5.field6963 = var19;
                    }
                    var5.field3019 = var5.field3023 = (byte) (var5.field3019 + var15 & 3);
                    if (class261.method1718(var19, 1, var18)) {
                        ++var5.field3023;
                    }
                    if (~class99.field1551 == ~arg2) {
                        class58.field1112 = var5.field3019;
                    }
                } else {
                    int var20 = arg0.method309((byte) 57, 30);
                    int var21 = var20 >> 28;
                    int var22 = 16383 & var20 >> 14;
                    int var23 = 16383 & var20;
                    int var24 = (16383 & var5.field6271[0] + var22 - -class109.field1672) + -class109.field1672;
                    int var25 = (var5.field6262[0] + var23 - -class203.field2874 & 16383) - class203.field2874;
                    if (var3) {
                        var5.field6975 = true;
                        var5.field6989 = var24;
                        var5.field6963 = var25;
                    } else {
                        var5.method2846(class208.field2924[arg2], -23483, var24, var25);
                    }
                    var5.field3019 = var5.field3023 = (byte) (var5.field3019 + var21 & 3);
                    if (class261.method1718(var25, 1, var24)) {
                        ++var5.field3023;
                    }
                    if (~class99.field1551 == ~arg2) {
                        class58.field1112 = var5.field3019;
                    }
                }
            }
        }
    }
}
