import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class211 extends class109 {

    @OriginalMember(owner = "client!uc", name = "Fb", descriptor = "Lvd;")
    public static class222 field3918 = class212.method1357("sch-Utteln:", 10731);

    @OriginalMember(owner = "client!uc", name = "Mb", descriptor = "Lvd;")
    public static class222 field3925 = class212.method1357("<col=ffff00>", 10731);

    @OriginalMember(owner = "client!uc", name = "Ub", descriptor = "Lvd;")
    public static class222 field3933 = class212.method1357("cross", 10731);

    @OriginalMember(owner = "client!uc", name = "Sb", descriptor = "Lvd;")
    public static class222 field3931 = null;

    @OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Lvd;")
    private static class222 field3922 = class212.method1357("You need a members account to login to this world)3", 10731);

    @OriginalMember(owner = "client!uc", name = "Qb", descriptor = "Lvd;")
    public static class222 field3929 = field3922;

    @OriginalMember(owner = "client!uc", name = "zb", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!uc", name = "Ab", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!uc", name = "Bb", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!uc", name = "Gb", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!uc", name = "Hb", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!uc", name = "Kb", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!uc", name = "Lb", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!uc", name = "Nb", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!uc", name = "Ob", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!uc", name = "Tb", descriptor = "Lgh;")
    private class73 field3932;

    @OriginalMember(owner = "client!uc", name = "Ib", descriptor = "[Z")
    public static boolean[] field3921;

    @OriginalMember(owner = "client!uc", name = "Rb", descriptor = "[[S")
    public static short[][] field3930;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(Z)V")
    public final void method1343(boolean arg0) {
        ++field3912;
        if (!arg0) {
            field3918 = null;
        }
        this.field3928 = super.field2053 * 8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3926;
        int var10 = 41 % ((arg0 - -44) / 45);
        if (arg1 == arg8 && ~arg6 == ~arg9 && arg4 == arg5 && ~arg3 == ~arg7) {
            class83.method544(arg2, arg6, arg4, arg7, (byte) 5, arg1);
        } else {
            int var11 = arg1;
            int var12 = arg6;
            int var13 = arg6 * 3;
            int var14 = arg9 * 3;
            int var15 = arg8 * 3;
            int var16 = arg3 * 3;
            int var17 = arg1 * 3;
            int var18 = arg5 * 3;
            int var19 = var15 - arg1 + -var18 + arg4;
            int var20 = -var16 + arg7 + var14 - arg6;
            int var21 = var18 - (var15 - var17) + -var15;
            int var22 = -var17 + var15;
            int var23 = var14 - var13;
            int var24 = var13 + var16 - var14 + -var14;
            for (int var25 = 128; ~var25 >= -4097; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var20 * var27;
                int var29 = var19 * var27;
                int var30 = var24 * var26;
                int var31 = var22 * var25;
                int var32 = var21 * var26;
                int var33 = (var29 + var32 + var31 >> 12) + arg1;
                int var34 = var23 * var25;
                int var35 = arg6 - -(var28 + var30 - -var34 >> 12);
                class83.method544(arg2, var12, var33, var35, (byte) 5, var11);
                var12 = var35;
                var11 = var33;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)I")
    public final int method1345(int arg0, byte arg1) {
        if (arg1 != -63) {
            this.method1343(false);
        }
        ++field3917;
        return arg0 * 8 + -this.field3928;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lba;III)V")
    public static final void method1346(class13 arg0, int arg1, int arg2, int arg3) {
        ++field3913;
        if (class68.field1277 == 0 || ~class68.field1277 == -4) {
            int var4 = arg1 - arg0.field245 / 2;
            int var5 = arg2 - arg0.field341 / 2;
            int var6 = 2047 & class34.field740 + class116.field2218;
            int var7 = class199.field3624[var6];
            int var8 = (class208.field3876 + 256) * var7 >> 8;
            int var9 = class199.field3640[var6];
            int var10 = (class208.field3876 + 256) * var9 >> 8;
            if (arg3 != 20239) {
                field3922 = null;
            }
            int var11 = var4 * var8 + -(var5 * var10) >> 11;
            int var12 = var4 * var10 - -(var5 * var8) >> 11;
            int var13 = class17.field432.field1353 + var12 >> 7;
            int var14 = -var11 + class17.field432.field1360 >> 7;
            boolean var15 = class62.method431(true, 1, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var14, var13, -118);
            if (var15) {
                class42.field895.method676(var5, (byte) -3);
                class42.field895.method676(var4, (byte) -3);
                class42.field895.method672(arg3 ^ -279690297, class116.field2218);
                class42.field895.method676(57, (byte) -3);
                class42.field895.method676(class34.field740, (byte) -3);
                class42.field895.method676(class208.field3876, (byte) -3);
                class42.field895.method676(89, (byte) -3);
                class42.field895.method672(arg3 ^ -279690297, class17.field432.field1353);
                class42.field895.method672(-279704376, class17.field432.field1360);
                class42.field895.method676(class39.field868, (byte) -3);
                class42.field895.method676(63, (byte) -3);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(BI)V")
    public final void method1347(byte arg0, int arg1) {
        if (arg0 < -39) {
            ++field3915;
            super.field2006[super.field2053++] = (byte) (arg1 + this.field3932.method497(126));
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILab;ILab;)Lr;")
    public static final class178 method1348(boolean arg0, int arg1, class3 arg2, int arg3, class3 arg4) {
        ++field3916;
        if (!arg0) {
            method1346((class13) null, -13, -101, 36);
        }
        return !class47.method344(arg2, arg3, -36, arg1) ? null : class8.method79(true, arg4.method33(-29616, arg1, arg3));
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class211(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIII)V")
    public final void method1349(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 0;
        if (arg1 != 7) {
            field3931 = null;
        }
        while (var5 < arg2) {
            arg0[arg3 + var5] = (byte) (super.field2006[super.field2053++] + -this.field3932.method497(-74));
            ++var5;
        }
        ++field3920;
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(II)I")
    public final int method1350(int arg0, int arg1) {
        ++field3927;
        int var3 = this.field3928 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field3928 & arg1);
        this.field3928 += arg0;
        while (arg0 > var5) {
            var4 += (super.field2006[var3++] & class94.field1768[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 != var5) {
            var6 = (super.field2006[var3] >> var5 - arg0 & class94.field1768[arg0]) + var4;
        } else {
            var6 = (class94.field1768[var5] & super.field2006[var3]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(Z)I")
    public final int method1351(boolean arg0) {
        if (!arg0) {
            field3929 = null;
        }
        ++field3914;
        return super.field2006[super.field2053++] - this.field3932.method497(122) & 255;
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        ++field3919;
        if (arg0 <= 5) {
            field3933 = null;
        }
        super.field2053 = (this.field3928 + 7) / 8;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([II)V")
    public final void method1353(int[] arg0, int arg1) {
        this.field3932 = new class73(arg0);
        if (arg1 == 19903) {
            ++field3924;
        }
    }

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "(I)V")
    public static void method1354(int arg0) {
        field3929 = null;
        if (arg0 != 0) {
            field3923 = 98;
        }
        field3933 = null;
        field3922 = null;
        field3925 = null;
        field3921 = null;
        field3918 = null;
        field3931 = null;
        field3930 = null;
    }
}
