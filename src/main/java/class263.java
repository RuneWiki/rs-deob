import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class263 extends class259 {

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "I")
    private int field4655 = 16;

    @OriginalMember(owner = "client!ak", name = "mb", descriptor = "I")
    private int field4658 = 0;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    private int field4643 = 4096;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    private int field4638 = 0;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    private int field4648 = 2000;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Lsg;")
    public static class30 field4640 = class167.method1221((byte) 33, "cookieprefix");

    @OriginalMember(owner = "client!ak", name = "lb", descriptor = "[S")
    public static short[] field4657 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "Lsg;")
    public static class30 field4642 = class167.method1221((byte) 33, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "Lsg;")
    private static class30 field4646 = class167.method1221((byte) 33, "red:");

    @OriginalMember(owner = "client!ak", name = "nb", descriptor = "Lsg;")
    public static class30 field4659 = field4646;

    @OriginalMember(owner = "client!ak", name = "kb", descriptor = "Lsg;")
    public static class30 field4656 = field4646;

    @OriginalMember(owner = "client!ak", name = "pb", descriptor = "Ldl;")
    public static class31 field4661 = null;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ak", name = "ob", descriptor = "Lmc;")
    public static class151 field4660;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "[I")
    public static int[] field4651;

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B)V")
    public static final void method1814(int arg0, byte[] arg1) {
        ++field4653;
        class8 var2 = new class8(arg1);
        var2.field146 = arg1.length - 2;
        class23.field435 = var2.method65((byte) 127);
        class62.field1329 = new int[class23.field435];
        class142.field2752 = new int[class23.field435];
        class222.field3992 = new byte[class23.field435][];
        class250.field4423 = new boolean[class23.field435];
        class197.field3559 = new byte[class23.field435][];
        class37.field895 = new int[class23.field435];
        class2.field33 = new int[class23.field435];
        var2.field146 = arg1.length + -7 + -(class23.field435 * 8);
        class190.field3464 = var2.method65((byte) 126);
        class273.field4774 = var2.method65((byte) 125);
        int var3 = 1 + (255 & var2.method63((byte) 120));
        for (int var4 = 0; class23.field435 > var4; ++var4) {
            class142.field2752[var4] = var2.method65((byte) 122);
        }
        for (int var5 = 0; var5 < class23.field435; ++var5) {
            class37.field895[var5] = var2.method65((byte) 123);
        }
        for (int var6 = 0; class23.field435 > var6; ++var6) {
            class62.field1329[var6] = var2.method65((byte) 118);
        }
        for (int var7 = 0; var7 < class23.field435; ++var7) {
            class2.field33[var7] = var2.method65((byte) 107);
        }
        if (arg0 >= -115) {
            field4659 = null;
        }
        var2.field146 = arg1.length - 7 + -(class23.field435 * 8) + -(var3 * 3) + 3;
        class191.field3475 = new int[var3];
        for (int var8 = 1; ~var8 > ~var3; ++var8) {
            class191.field3475[var8] = var2.method60(23888);
            if (class191.field3475[var8] == 0) {
                class191.field3475[var8] = 1;
            }
        }
        var2.field146 = 0;
        for (int var9 = 0; var9 < class23.field435; ++var9) {
            int var10 = class2.field33[var9];
            int var11 = class62.field1329[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class222.field3992[var9] = var13;
            byte[] var14 = new byte[var12];
            class197.field3559[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method63((byte) 68);
            if ((1 & var16) == 0) {
                for (int var17 = 0; var12 > var17; ++var17) {
                    var13[var17] = var2.method98(1);
                }
                if ((2 & var16) != 0) {
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        byte var19 = var14[var18] = var2.method98(1);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var11 <= var20) {
                        if ((2 & var16) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var11 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; ~var22 > ~var10; ++var22) {
                                byte var23 = var14[var21 - -(var11 * var22)] = var2.method98(1);
                                var15 |= ~var23 != 0;
                            }
                            ++var21;
                        }
                    }
                    for (int var24 = 0; var24 < var10; ++var24) {
                        var13[var11 * var24 + var20] = var2.method98(1);
                    }
                    ++var20;
                }
            }
            class250.field4423[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method1815(byte arg0) {
        field4656 = null;
        field4651 = null;
        field4642 = null;
        field4661 = null;
        field4660 = null;
        field4657 = null;
        field4659 = null;
        field4646 = null;
        field4640 = null;
        if (arg0 < 14) {
            method1819(24, 32);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            field4661 = null;
        }
        ++field4644;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = this.field4643 >> 1;
            int[][] var5 = super.field4581.method1836(0);
            Random var6 = new Random((long) this.field4638);
            for (int var7 = 0; var7 < this.field4648; ++var7) {
                int var8 = ~this.field4643 < -1 ? this.field4658 + class256.method1779(121, var6, this.field4643) + -var4 : this.field4658;
                int var9 = class256.method1779(122, var6, class223.field3999);
                int var10 = 255 & var8 >> 4;
                int var11 = class256.method1779(124, var6, class94.field1911);
                int var12 = (class250.field4420[var10] * this.field4655 >> 12) + var11;
                int var13 = (class201.field3592[var10] * this.field4655 >> 12) + var9;
                int var14 = -var11 + var12;
                int var15 = -var9 + var13;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var13;
                        var13 = var12;
                        var12 = var17;
                        int var18 = var9;
                        var9 = var11;
                        var11 = var18;
                    }
                    if (var9 > var13) {
                        int var19 = var11;
                        int var20 = var9;
                        var9 = var13;
                        var11 = var12;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var11 + var12;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var23 = -var9 + var13;
                    int var24 = var11 >= var12 ? -1 : 1;
                    int var25 = 2048 / var23;
                    int var26 = 1024 - (class256.method1779(125, var6, 4096) >> 2);
                    int var27 = -var23 / 2;
                    for (int var28 = var9; var13 > var28; ++var28) {
                        int var29 = (-var9 + var28) * var25 + var26 + 1024;
                        int var30 = class52.field1174 & var28;
                        var27 += var22;
                        int var31 = var21 & field4649;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var27 < -1) {
                            var27 -= var23;
                            var21 += var24;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B[Lsg;)[Lsg;")
    public static final class30[] method1816(byte arg0, class30[] arg1) {
        ++field4652;
        class30[] var2 = new class30[5];
        if (arg0 != 7) {
            method1817((byte) 99, 55);
        }
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class160.method1188(new class30[] { class73.method675(107, var3), class47.field1084 }, 0);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class160.method1188(new class30[] { var2[var3], arg1[var3] }, 0);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)V")
    public static final void method1817(byte arg0, int arg1) {
        class68 var2 = class103.method830(arg1, 4, 3);
        ++field4645;
        var2.method610(2141640544);
        if (arg0 > -7) {
            method1815((byte) 73);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 2047 & -arg5 + 2048;
        ++field4654;
        if (arg4 >= -37) {
            method1819(97, -52);
        }
        int var9 = -arg7 + 2048 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class213.field3849[var8];
            var10 = -arg1 * var13 >> 16;
            int var14 = class213.field3846[var8];
            var12 = arg1 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class213.field3849[var9];
            var11 = var12 * var15 >> 16;
            int var16 = class213.field3846[var9];
            var12 = var12 * var16 >> 16;
        }
        class123.field2422 = arg7;
        class276.field4820 = arg5;
        class150.field2849 = arg6 - var12;
        class207.field3725 = -var11 + arg0;
        class64.field1419 = arg2 - var10;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field4660 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field4643 = arg2.method65((byte) 119);
                        }
                    } else {
                        this.field4658 = arg2.method65((byte) 107);
                    }
                } else {
                    this.field4655 = arg2.method63((byte) 111);
                }
            } else {
                this.field4648 = arg2.method65((byte) 125);
            }
        } else {
            this.field4638 = arg2.method63((byte) 97);
        }
        ++field4650;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Ljb;")
    public static final class24 method1819(int arg0, int arg1) {
        class24 var2 = (class24) class251.field4438.method1644((byte) -112, (long) arg0);
        ++field4641;
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != -4) {
                method1815((byte) -52);
            }
            byte[] var3 = class273.field4789.method1115(class134.method1011(arg0, (byte) -102), (byte) -77, class241.method1702(3197, arg0));
            class24 var4 = new class24();
            var4.field451 = arg0;
            if (var3 != null) {
                var4.method216((byte) 110, new class8(var3));
            }
            class251.field4438.method1646((long) arg0, var4, -111);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        class168.method1242((byte) -118);
        if (arg0 < 11) {
            this.method17(-70, true);
        }
        ++field4647;
    }
}
