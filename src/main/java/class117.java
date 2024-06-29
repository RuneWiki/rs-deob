import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class117 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    public boolean field1703 = true;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field1707 = 128;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field1706 = 16;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public int field1713 = -1;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public int field1710 = 0;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public int field1711 = 8;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Z")
    public boolean field1708 = false;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field1700 = -1;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public int field1716 = 1190717;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Z")
    public boolean field1699 = true;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1705 = 20;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lwa;[[F[ILf;I[[FZ[[F[[III)V", line = 9)
    public static final void method832(class297 arg0, float[][] arg1, int[] arg2, class243 arg3, int arg4, float[][] arg5, boolean arg6, float[][] arg7, int[][] arg8, int arg9, int arg10) {
        field1712++;
        int[] var11 = new int[arg2.length / 2];
        if (arg6) {
            method832((class297) null, (float[][]) ((float[][]) null), (int[]) null, (class243) null, -63, (float[][]) ((float[][]) null), false, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), -15, 107);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg2[var12 + var12];
            int var14 = arg2[var12 + var12 + 1];
            if (arg4 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg4 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg4 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg5[arg9][arg10];
                var18 = arg1[arg9][arg10];
                var19 = arg7[arg9][arg10];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg5[arg9 + 1][arg10];
                var18 = arg1[arg9 + 1][arg10];
                var19 = arg7[arg9 + 1][arg10];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg1[arg9 + 1][arg10 + 1];
                var17 = arg5[arg9 + 1][arg10 + 1];
                var19 = arg7[arg9 + 1][arg10 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg7[arg9][arg10 + 1];
                var18 = arg1[arg9][arg10 + 1];
                var17 = arg5[arg9][arg10 + 1];
            } else {
                float var20 = arg1[arg9][arg10];
                float var21 = arg5[arg9][arg10];
                float var22 = arg5[arg9][arg10 + 1];
                float var23 = arg1[arg9][arg10 + 1];
                float var24 = arg7[arg9][arg10];
                float var25 = (float) var14 / 128.0F;
                float var26 = (float) var13 / 128.0F;
                float var27 = (arg7[arg9 + 1][arg10] - var24) * var26 + var24;
                float var28 = (arg1[arg9 + 1][arg10] - var20) * var26 + var20;
                float var29 = (arg1[arg9 + 1][arg10 + 1] - var23) * var26 + var23;
                float var30 = (arg5[arg9 + 1][arg10 + 1] - var22) * var26 + var22;
                var18 = (var29 - var28) * var25 + var28;
                float var31 = (arg5[arg9 + 1][arg10] - var21) * var26 + var21;
                var17 = (var30 - var31) * var25 + var31;
                float var32 = arg7[arg9][arg10 + 1];
                float var33 = (arg7[arg9 + 1][arg10 + 1] - var32) * var26 + var32;
                var19 = (var33 - var27) * var25 + var27;
            }
            int var34 = (arg9 << 7) + var13;
            int var35 = class300.method2069(arg10, arg8, 1496591591, arg9, var13, var14);
            int var36 = (arg10 << 7) + var14;
            var11[var12] = arg3.method1740(arg0, var34, var35, var36, var17, var18, var19);
        }
        arg3.method1738(var11);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILlb;)V", line = 134)
    public final void method833(int arg0, int arg1, class112 arg2) {
        field1714++;
        if (arg1 != -1) {
            method837((byte) -67, (class245) null);
        }
        while (true) {
            int var4 = arg2.method792(2);
            if (var4 == 0) {
                return;
            }
            this.method835(false, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIBII)V", line = 154)
    public static final void method834(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1701++;
        if (arg3 != -40) {
            method837((byte) -45, (class245) null);
        }
        if (class273.field4449 <= arg2 && class153.field2439 >= arg1 && class15.field192 <= arg0 && class237.field3801 >= arg4) {
            class158.method1120(arg3 ^ 0xFFFFFF58, arg4, arg1, arg2, arg5, arg0);
        } else {
            class33.method227(arg2, (byte) 45, arg0, arg4, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIILlb;)V", line = 175)
    private final void method835(boolean arg0, int arg1, int arg2, class112 arg3) {
        if (arg1 == 1) {
            this.field1710 = class153.method1090(50, arg3.method757(11997));
        } else if (arg1 == 2) {
            this.field1700 = arg3.method792(2);
        } else if (arg1 == 3) {
            this.field1700 = arg3.method759((byte) -53);
            if (this.field1700 == 65535) {
                this.field1700 = -1;
            }
        } else if (arg1 == 5) {
            this.field1703 = false;
        } else if (arg1 == 7) {
            this.field1713 = class153.method1090(-77, arg3.method757(11997));
        } else if (arg1 == 8) {
            class146.field2227 = arg2;
        } else if (arg1 == 9) {
            this.field1707 = arg3.method759((byte) -62);
        } else if (arg1 == 10) {
            this.field1699 = false;
        } else if (arg1 == 11) {
            this.field1711 = arg3.method792(2);
        } else if (arg1 == 12) {
            this.field1708 = true;
        } else if (arg1 == 13) {
            this.field1716 = arg3.method757(11997);
        } else if (arg1 == 14) {
            this.field1706 = arg3.method792(2);
        }
        if (!arg0) {
            field1702++;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBZ)Lok;", line = 254)
    public static final class41 method836(int arg0, byte arg1, boolean arg2) {
        int var3 = 101 / ((71 - arg1) / 41);
        field1715++;
        return class314.method2172(arg0, -10, 10, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLof;)V", line = 289)
    public static final void method837(byte arg0, class245 arg1) {
        field1709++;
        int var2 = 5 % ((24 - arg0) / 56);
        class149 var3 = (class149) class283.field4599.method617(arg1.field3933.method291((byte) 65), false);
        if (var3 == null) {
            class74.method546(class55.field807, 5559, (class171) null, (class50) null, 0, arg1.field4306[0], arg1.field4341[0], arg1);
        } else {
            var3.method1031(-17223);
        }
    }
}
