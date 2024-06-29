import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class128 {

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    private int field1656 = -1;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "Z")
    public boolean field1663 = true;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lf;")
    private class285 field1651;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "Lpq;")
    private class194 field1667;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Lrq;")
    private class470 field1655;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljda;")
    private class90 field1654;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lvba;")
    private class416 field1661;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "[[B")
    public static byte[][] field1670 = new byte[50][];

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lqk;")
    public static class1 field1664 = new class1(30, 8);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 6)
    public static final void method876(int arg0, byte arg1, String arg2) {
        if (arg1 <= 110) {
            method884(-39, 30, 63, -53, (byte) -18, -25, 44, null, null);
        }
        class727.method4042("", "", (byte) -84, "", arg0, 0, arg2);
        field1665++;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V", line = 19)
    public final void method877(byte arg0) {
        field1649++;
        this.method879(this.field1654, 0, this.field1653);
        if (arg0 > -3) {
            method883(-105, 89, 60, null, -29);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)V", line = 35)
    public static final void method878(int arg0, int arg1) {
        field1658++;
        class469 var2 = (class469) class297.field4327.method3669(false, (long) arg0);
        if (var2 != null) {
            var2.field6502.method2968((byte) -47);
            class536.method3182(var2.field6505, -1, var2.field6506);
            var2.method527(arg1 ^ 0x2CD0);
        }
        if (arg1 != -1805) {
            method886(-25);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljda;II)V", line = 55)
    private final void method879(class90 arg0, int arg1, int arg2) {
        field1657++;
        if (arg2 != 0) {
            this.method882(false);
            this.field1667.method1219((byte) 127, this.field1655);
            this.field1667.method1211((byte) 101, arg2, arg0, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 72)
    public static void method880(int arg0) {
        field1664 = null;
        field1670 = null;
        if (arg0 != 31675) {
            method880(88);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V", line = 85)
    public static final void method881(byte arg0) {
        if (arg0 == -38) {
            class483.field6689.method1046((byte) 127);
            field1660++;
            class100.field1176 = 0;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V", line = 97)
    private final void method882(boolean arg0) {
        field1668++;
        if (!this.field1663) {
            return;
        }
        this.field1663 = arg0;
        byte[] var2 = this.field1651.field4097;
        byte[] var3 = this.field1667.field2763;
        int var4 = 0;
        int var5 = this.field1651.field4115;
        int var6 = this.field1651.field4115 * this.field1650 + this.field1666;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1655 != null && this.field1656 == var4) {
            this.field1663 = false;
            return;
        }
        this.field1656 = var4;
        int var8 = this.field1650 * var5 + this.field1666;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field1651.field4115 - 128;
        }
        if (this.field1655 == null) {
            this.field1655 = new class470(this.field1667, 3553, 6406, 128, 128, false, this.field1667.field2763, 6406, false);
            this.field1655.method2804(false, 10243, false);
            this.field1655.method3201(true, true);
        } else {
            this.field1655.method2807(false, 128, this.field1667.field2763, 0, 0, 51, 128, 0, 0, 6406);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III[II)V", line = 199)
    public static final void method883(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg1--;
        field1659++;
        int var8 = arg2 - 1;
        int var5 = var8 - arg4;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var9 = var7 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg1 = var13 + 1;
            arg3[arg1] = arg0;
        }
        while (var8 > arg1) {
            arg1++;
            arg3[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lpq;Lf;Lbda;IIIII)V", line = 359)
    public class128(class194 arg0, class285 arg1, class222 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1666 = arg6;
        this.field1651 = arg1;
        this.field1667 = arg0;
        this.field1650 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field5827 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3064[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1653 = var10;
        if (var10 <= 0) {
            this.field1655 = null;
        } else {
            class511 var14 = new class511(var10 * 2);
            if (this.field1667.field2748) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field5827 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3064[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2986(var23[var24] & 0xFFFF, -61);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field5827 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3064[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2974(var18[var19] & 0xFFFF, (byte) 123);
                            }
                        }
                    }
                }
            }
            this.field1654 = this.field1667.method1205((byte) 11, 5123, var14.field6962, var14.field6979, false);
            this.field1661 = new class416(this.field1667, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIBII[B[B)V", line = 233)
    public static final void method884(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        int var9 = 67 % ((57 - arg4) / 40);
        field1662++;
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg8[var10001] += arg7[arg6++];
                int var15 = arg2++;
                arg8[var15] += arg7[arg6++];
                int var16 = arg2++;
                arg8[var16] += arg7[arg6++];
                int var17 = arg2++;
                arg8[var17] += arg7[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg2++;
                arg8[var10001] += arg7[arg6++];
            }
            arg6 += arg0;
            arg2 += arg3;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "([BIII)V", line = 276)
    public final void method885(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field1661.method663(arg2, -70, this.field1667.method1204(true, arg2) * arg3, arg0);
        field1652++;
        this.method879(this.field1661, 0, arg3);
        if (arg1 != -30276) {
            method886(50);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 293)
    public static final void method886(int arg0) {
        if (arg0 <= 91) {
            return;
        }
        field1669++;
        for (class102 var1 = (class102) class404.field5689.method1041(1048832); var1 != null; var1 = (class102) class404.field5689.method1033(-1)) {
            class20 var2 = var1.field1179;
            if (class533.field7336 > var2.field145) {
                var1.method527(-11229);
                var2.method87(-115);
            } else if (var2.field128 <= class533.field7336) {
                var2.method75(-110);
                if (var2.field167 > 0) {
                    class685 var3 = (class685) class450.field6288.method3669(false, (long) (var2.field167 - 1));
                    if (var3 != null) {
                        class359 var4 = var3.field9573;
                        if (var4.field3470 >= 0 && var4.field3470 < (class741.field10208 * 512) && var4.field3460 >= 0 && var4.field3460 < (class525.field7224 * 512)) {
                            var2.method82(-53, var4.field3470, class373.method2316(var4.field3470, var2.field3467, var4.field3460, 108) - var2.field170, var4.field3460, class533.field7336);
                        }
                    }
                }
                if (var2.field167 < 0) {
                    int var5 = -var2.field167 - 1;
                    class723 var6;
                    if (class173.field2193 == var5) {
                        var6 = class724.field10031;
                    } else {
                        var6 = class413.field5787[var5];
                    }
                    if (var6 != null && var6.field3470 >= 0 && var6.field3470 < class741.field10208 * 512 && var6.field3460 >= 0 && class525.field7224 * 512 > var6.field3460) {
                        var2.method82(-128, var6.field3470, class373.method2316(var6.field3470, var2.field3467, var6.field3460, 65) - var2.field170, var6.field3460, class533.field7336);
                    }
                }
                var2.method84((byte) 29, class510.field6925);
                class497.method2922(var2, true);
            }
        }
    }
}
