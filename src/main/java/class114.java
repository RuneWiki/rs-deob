import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class114 {

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field1796 = 4;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    private int field1784 = 4;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    private int field1797 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field1793 = 4;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    private int field1801 = 4;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[S")
    private short[] field1795 = new short[512];

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field1794 = 1;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field1799 = -1;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[S")
    private short[] field1791;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)V", line = 6)
    public final void method873(int arg0, byte arg1, int arg2, int arg3) {
        field1802++;
        if (arg1 != -126) {
            method879((class161[]) null, 13, 102);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            var6[var8] = (var8 << 12) / arg0;
        }
        int[] var9 = new int[arg3];
        for (int var10 = 0; var10 < arg3; var10++) {
            var9[var10] = (var10 << 12) / arg3;
        }
        this.method285(arg1 ^ 0xFFFFFF7D);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field1796; var14++) {
                        int var15 = this.field1791[var14] << 12;
                        int var16 = this.field1793 * var15 >> 12;
                        int var17 = var9[var11] * var15 >> 12;
                        int var18 = this.field1801 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field1793 * var17;
                        int var22 = this.field1801 * var20;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var21 >> 12;
                        int var26 = this.field1784 * var15 >> 12;
                        int var27 = var25 + 1;
                        int var28 = var21 & 0xFFF;
                        int var29 = var25 & 0xFF;
                        int var30 = this.field1784 * var19;
                        int var31;
                        if (var24 < var18) {
                            var31 = var24 & 0xFF;
                        } else {
                            var31 = 0;
                        }
                        int var32 = class146.field2225[var28];
                        int var33 = var30 >> 12;
                        short var34 = this.field1795[var29];
                        int var35 = var30 & 0xFFF;
                        int var36 = var23 & 0xFF;
                        int var37;
                        if (var27 >= var16) {
                            var37 = 0;
                        } else {
                            var37 = var27 & 0xFF;
                        }
                        short var38 = this.field1795[var31 + var34];
                        int var39 = var28 - 4096;
                        int var40 = var33 + 1;
                        int var41 = class146.field2225[var35];
                        short var42 = this.field1795[var36 + var34];
                        int var43;
                        if (var26 > var40) {
                            var43 = var40 & 0xFF;
                        } else {
                            var43 = 0;
                        }
                        int var44 = var22 & 0xFFF;
                        short var45 = this.field1795[var37];
                        short var46 = this.field1795[var36 + var45];
                        short var47 = this.field1795[var31 + var45];
                        int var48 = var35 - 4096;
                        int var49 = var44 - 4096;
                        int var50 = class146.field2225[var44];
                        int var51 = var33 & 0xFF;
                        int var52 = class211.method1513(var35, var44, this.field1795[var42 + var51], var28, (byte) -76);
                        int var53 = class211.method1513(var48, var44, this.field1795[var42 + var43], var28, (byte) -87);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class211.method1513(var35, var49, this.field1795[var38 + var51], var28, (byte) 76);
                        int var56 = class211.method1513(var48, var49, this.field1795[var38 + var43], var28, (byte) 74);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = ((var57 - var54) * var50 >> 12) + var54;
                        int var59 = class211.method1513(var35, var44, this.field1795[var51 + var46], var39, (byte) 64);
                        int var60 = class211.method1513(var48, var44, this.field1795[var43 + var46], var39, (byte) -78);
                        int var61 = var59 + ((var60 - var59) * var41 >> 12);
                        int var62 = class211.method1513(var35, var49, this.field1795[var47 + var51], var39, (byte) -122);
                        int var63 = class211.method1513(var48, var49, this.field1795[var43 + var47], var39, (byte) -126);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var50 >> 12) + var61;
                        this.method286(102, var14, ((var65 - var58) * var32 >> 12) + var58);
                    }
                    this.method288((byte) 127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIILfc;IJZ)Z", line = 177)
    public static final boolean method874(int arg0, int arg1, int arg2, int arg3, int arg4, class110 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class279.method1934(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V", line = 216)
    public static final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= class234.field3569 && class322.field4965 >= arg7 && arg4 >= class212.field3261 && arg5 <= class182.field2888) {
            class67.method482(arg6, arg2, (byte) -83, arg7, arg1, arg3, arg4, arg5);
        } else {
            class284.method1966(arg5, arg6, arg4, arg7, 111, arg3, arg2, arg1);
        }
        if (arg0 != -1) {
            method874(-5, -58, 27, 33, 114, (class110) null, -44, -59L, true);
        }
        field1785++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILkk;)I", line = 239)
    public static final int method876(int arg0, class76 arg1) {
        int var2 = 18 % ((-arg0 - 49) / 59);
        field1789++;
        class332 var3 = arg1.field1104;
        if (var3.field5162 != null) {
            var3 = var3.method2324((byte) -116);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field5124;
        class258 var5 = arg1.method2099(106);
        if (arg1.field4765 == var5.field3988) {
            var4 = var3.field5179;
        } else if (arg1.field4765 == var5.field3956 || arg1.field4765 == var5.field3977 || arg1.field4765 == var5.field3952 || arg1.field4765 == var5.field3967) {
            var4 = var3.field5176;
        } else if (arg1.field4765 == var5.field3957 || arg1.field4765 == var5.field3974 || arg1.field4765 == var5.field3953 || arg1.field4765 == var5.field3986) {
            var4 = var3.field5134;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 273)
    public static final void method877(int arg0) {
        if (class5.field65 == 2) {
            if (class272.field4253 == class2.field32 && class89.field1266 == class234.field3562) {
                class5.field65 = 0;
                if (class1.field1 && class180.field2860[81] && class32.field393 > 2) {
                    class36.method277(-31421, class32.field393 - 2);
                } else {
                    class36.method277(-31421, class32.field393 - 1);
                }
            }
        } else if (class272.field4253 == class109.field1643 && class47.field640 == class234.field3562) {
            class5.field65 = 0;
            if (class1.field1 && class180.field2860[81] && class32.field393 > 2) {
                class36.method277(-31421, class32.field393 - 2);
            } else {
                class36.method277(-31421, class32.field393 - 1);
            }
        } else {
            class2.field32 = class109.field1643;
            class89.field1266 = class47.field640;
            class5.field65 = 2;
        }
        field1787++;
        if (arg0 >= -115) {
            field1799 = -9;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 329)
    private final void method878(int arg0) {
        field1790++;
        Random var2 = new Random((long) this.field1797);
        if (arg0 != 2056042380) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1795[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class101.method764(var5, (byte) 121, var2);
            short var7 = this.field1795[var6];
            this.field1795[var6] = this.field1795[var5];
            this.field1795[var5] = this.field1795[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([Lmn;II)V", line = 377)
    public static final void method879(class161[] arg0, int arg1, int arg2) {
        if (arg1 != -31349) {
            method879((class161[]) null, -114, 24);
        }
        field1788++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class161 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2590 == 0) {
                    if (var4.field2509 != null) {
                        method879(var4.field2509, -31349, arg2);
                    }
                    class242 var5 = (class242) class222.field3383.method1716(arg1 ^ 0x7A74, (long) var4.field2615);
                    if (var5 != null) {
                        class153.method1155(arg2, -1, var5.field3689);
                    }
                }
                if (arg2 == 0 && var4.field2592 != null) {
                    class296 var6 = new class296();
                    var6.field4574 = var4;
                    var6.field4575 = var4.field2592;
                    class251.method1719(-31, var6);
                }
                if (arg2 == 1 && var4.field2582 != null) {
                    if (var4.field2510 >= 0) {
                        class161 var7 = class331.method2308((byte) 63, var4.field2615);
                        if (var7 == null || var7.field2509 == null || var4.field2510 >= var7.field2509.length || var7.field2509[var4.field2510] != var4) {
                            continue;
                        }
                    }
                    class296 var8 = new class296();
                    var8.field4574 = var4;
                    var8.field4575 = var4.field2582;
                    class251.method1719(-31, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIII)V", line = 505)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1796 = arg1;
        this.field1793 = arg4;
        this.field1797 = arg0;
        this.field1801 = arg3;
        this.field1784 = arg2;
        this.method881(117);
        this.method878(2056042380);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V", line = 465)
    public static final void method880(int arg0, byte arg1) {
        if (arg0 == 37) {
            class341.field5303 = 3.0F;
        } else if (arg0 == 50) {
            class341.field5303 = 4.0F;
        } else if (arg0 == 75) {
            class341.field5303 = 6.0F;
        } else if (arg0 == 100) {
            class341.field5303 = 8.0F;
        } else if (arg0 == 200) {
            class341.field5303 = 16.0F;
        }
        field1799 = -1;
        field1786++;
        field1799 = -1;
        int var2 = -61 % ((arg1 + 63) / 58);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 520)
    private final void method881(int arg0) {
        field1783++;
        this.field1791 = new short[this.field1796];
        for (int var2 = 0; var2 < this.field1796; var2++) {
            this.field1791[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 < 115) {
            field1800 = 65;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public abstract void method288(byte arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public abstract void method286(int arg0, int arg1, int arg2);
}
