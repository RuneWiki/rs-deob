import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class110 extends class11 {

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    private int field1654 = 2000;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    private int field1655 = 4096;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    private int field1652 = 16;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    private int field1662 = 0;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private int field1659 = 0;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "[I")
    public static int[] field1661 = new int[5];

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Lem;")
    public static class150 field1664 = null;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "[I")
    public static int[] field1657;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "[[I")
    public static int[][] field1649;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ldw;IBI)V", line = 3)
    public static final void method799(class502 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field1064 == arg3 && ~arg3 != 0) {
            class104 var4 = class222.field3168.method126(-109, arg3);
            int var5 = var4.field1566;
            if (~var5 == -2) {
                arg0.field1084 = 0;
                arg0.field1089 = 0;
                arg0.field1037 = arg1;
                arg0.field1048 = 0;
                arg0.field1072 = 1;
                class441.method2618(arg0.field1732, arg0.field1735, arg0.field1738, false, var4, arg0.field1048, arg2 ^ -36);
            }
            if (var5 == 2) {
                arg0.field1089 = 0;
            }
        } else if (arg3 == -1 || arg0.field1064 == -1 || ~class222.field3168.method126(-96, arg3).field1570 <= ~class222.field3168.method126(-125, arg0.field1064).field1570) {
            arg0.field1119 = arg0.field1123;
            arg0.field1048 = 0;
            arg0.field1072 = 1;
            arg0.field1037 = arg1;
            arg0.field1089 = 0;
            arg0.field1084 = 0;
            arg0.field1064 = arg3;
            if (arg0.field1064 != -1) {
                class441.method2618(arg0.field1732, arg0.field1735, arg0.field1738, false, class222.field3168.method126(-81, arg0.field1064), arg0.field1048, 76);
            }
        }
        ++field1663;
        if (arg2 != -113) {
            field1651 = 81;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V", line = 62)
    public static final void method800(boolean arg0) {
        class173.field2569.method1066(4080);
        if (arg0) {
            field1649 = null;
        }
        ++field1658;
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V", line = 73)
    public static void method801(int arg0) {
        field1661 = null;
        field1649 = null;
        if (arg0 != -4) {
            method800(false);
        }
        field1664 = null;
        field1657 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)I", line = 87)
    public static final int method802(int arg0, int arg1, int arg2, int arg3) {
        ++field1665;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 + -1;
        int var6 = arg2 / arg1;
        int var7 = arg1 + -1 & arg2;
        int var8 = class200.method1249(1, var4, var6);
        int var9 = class200.method1249(1, var4 - -1, var6);
        int var10 = class200.method1249(1, var4, var6 - -1);
        if (arg0 <= 80) {
            field1664 = null;
        }
        int var11 = class200.method1249(1, var4 + 1, var6 - -1);
        int var12 = class144.method974(arg1, -10850, var5, var9, var8);
        int var13 = class144.method974(arg1, -10850, var5, var11, var10);
        return class144.method974(arg1, -10850, var7, var13, var12);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 347)
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V", line = 128)
    public final void method42(boolean arg0) {
        if (!arg0) {
            method802(-77, -34, -125, -72);
        }
        ++field1650;
        class144.method971((byte) 26);
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(II)[I", line = 139)
    public final int[] method44(int arg0, int arg1) {
        ++field1653;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            method802(-55, -120, 22, -80);
        }
        if (super.field158.field2966) {
            int var4 = this.field1655 >> 1;
            int[][] var5 = super.field158.method1310(3286);
            Random var6 = new Random((long) this.field1659);
            for (int var7 = 0; ~var7 > ~this.field1654; ++var7) {
                int var8 = ~this.field1655 < -1 ? this.field1662 - (-class367.method2213(-837693600, this.field1655, var6) - -var4) : this.field1662;
                int var9 = (var8 & 4089) >> 4;
                int var10 = class367.method2213(-837693600, class90.field1316, var6);
                int var11 = class367.method2213(-837693600, class508.field7537, var6);
                int var12 = (class150.field2284[var9] * this.field1652 >> 12) + var10;
                int var13 = var11 - -(class132.field1928[var9] * this.field1652 >> 12);
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class367.method2213(-837693600, 4096, var6) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class99.field1490;
                        int var31 = var21 & class183.field2683;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lsi;II)V", line = 278)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field1655 = arg0.method2353((byte) 94);
                        }
                    } else {
                        this.field1662 = arg0.method2353((byte) 117);
                    }
                } else {
                    this.field1652 = arg0.method2348(-2);
                }
            } else {
                this.field1654 = arg0.method2353((byte) 113);
            }
        } else {
            this.field1659 = arg0.method2348(-2);
        }
        ++field1660;
        if (arg1 > -40) {
            this.field1659 = 59;
        }
    }
}
