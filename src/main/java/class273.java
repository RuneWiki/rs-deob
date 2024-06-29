import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class273 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Lsv;")
    private class312 field3693;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "Lua;")
    private class303 field3706;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "[B")
    public byte[] field3698;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "[I")
    public static int[] field3699 = new int[8];

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "Lcb;")
    public static class318 field3701 = new class318(45, 2);

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "[[Laba;")
    private class575[][] field3689;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILw;IB)V")
    public final void method1662(int arg0, class451 arg1, int arg2, byte arg3) {
        field3700++;
        class88 var5 = (class88) arg1;
        int var6 = var5.field1088 + arg0 + 1;
        int var7 = var5.field1095 + arg2 + 1;
        int var8 = var7 + (this.field3695 * var6);
        int var9 = 0;
        int var10 = var5.field1089;
        int var11 = var5.field1086;
        int var12 = this.field3695 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field3695 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field3696 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field3696;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var11 -= var16;
            var9 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field3695) {
            int var17 = var7 + var11 + 1 - this.field3695;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class327.method2097(this.field3698, var10, var5.field1092, var8, var9, var14, var11, (byte) -26, var12);
            this.method1670(var7, var11, false, var6, var10);
            int var18 = 48 / ((-arg3 - 49) / 55);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lw;III)Z")
    public final boolean method1663(class451 arg0, int arg1, int arg2, int arg3) {
        field3707++;
        class88 var5 = (class88) arg0;
        int var6 = var5.field1088 + arg1 + 1;
        int var7 = var5.field1095 + arg2 + 1;
        int var8 = this.field3695 * var6 + var7;
        int var9 = var5.field1089;
        int var10 = var5.field1086;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field3695 * var11;
        }
        int var12 = this.field3695 - var10;
        if (this.field3696 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field3696;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if (this.field3695 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field3695;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > arg3 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3695 + var12;
            return class558.method3120(var10, var17, 1, var8, var9, this.field3698, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method1664(int arg0) {
        if (arg0 != 1) {
            field3699 = null;
        }
        field3699 = null;
        field3701 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lw;III)V")
    public final void method1665(class451 arg0, int arg1, int arg2, int arg3) {
        field3690++;
        class88 var5 = (class88) arg0;
        int var6 = var5.field1088 + arg2 + 1;
        int var7 = var5.field1095 + arg1 + arg3;
        int var8 = this.field3695 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field1089;
        int var11 = var5.field1086;
        int var12 = this.field3695 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field3695 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field3696) {
            int var15 = var6 + var10 + 1 - this.field3696;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var14 += var16;
            var12 += var16;
            var7 = 1;
        }
        if (this.field3695 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field3695;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class659.method3649(18, var11, var5.field1092, this.field3698, var10, var12, var14, var9, var8);
            this.method1670(var7, var11, false, var6, var10);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIBZ[[Z)V")
    public final void method1666(int arg0, int arg1, int arg2, byte arg3, boolean arg4, boolean[][] arg5) {
        this.field3693.method1965(false, 0);
        field3704++;
        this.field3693.method1949(-32, false);
        this.field3693.method1881(arg3 ^ 0xFFFFFFAA, 1);
        this.field3693.method1995(1, 1);
        this.field3693.method2018((byte) 124, -2, false, false);
        float var7 = 1.0F / (float) (this.field3693.field4436 * 128);
        if (arg4) {
            for (int var26 = 0; var26 < this.field3692; var26++) {
                int var27 = var26 << this.field3694;
                int var28 = var26 + 1 << this.field3694;
                label95: for (int var29 = 0; var29 < this.field3691; var29++) {
                    if (this.field3689[var29][var26] != null) {
                        int var30 = var29 << this.field3694;
                        int var31 = var29 + 1 << this.field3694;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg0 >= -arg2 && arg2 >= (var32 - arg0)) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((var33 - arg1) >= (-arg2) && arg2 >= var33 - arg1 && arg5[var32 + arg2 - arg0][arg2 + var33 - arg1]) {
                                        class492 var34 = this.field3693.method1993((byte) -26);
                                        var34.method2772(var7, 1.0F, (byte) 123, var7);
                                        var34.method595(-var29, -var26, 0);
                                        this.field3693.method1896(class248.field3341, (byte) -6);
                                        this.field3689[var29][var26].method3245((byte) -116);
                                        continue label95;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3692; var8++) {
                int var9 = var8 << this.field3694;
                int var10 = var8 + 1 << this.field3694;
                for (int var11 = 0; var11 < this.field3691; var11++) {
                    class575 var12 = this.field3689[var11][var8];
                    if (var12 != null) {
                        class526 var13 = this.field3693.method2011(var12.field7945 * 3, (byte) 124);
                        Buffer var14 = var13.method1025(true, (byte) 67);
                        if (var14 != null) {
                            Stream var15 = this.field3693.method1920((byte) 90, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field3694;
                            int var18 = var11 + 1 << this.field3694;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg2 <= var19 - arg1 && arg2 >= var19 - arg1) {
                                    int var21 = this.field3706.field2214 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((-arg2) <= (var22 - arg0) && var22 - arg0 <= arg2 && arg5[arg2 + var22 - arg0][var19 + arg2 - arg1]) {
                                            short[] var23 = this.field3706.field4049[var21];
                                            if (var23 != null) {
                                                if (Stream.method1519()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method1531(var23[var24] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method1525(var23[var25] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method1523();
                            if (var13.method1021(true) && var16 > 0) {
                                class492 var20 = this.field3693.method1993((byte) -26);
                                var20.method2772(var7, 1.0F, (byte) 123, var7);
                                var20.method595(-var11, -var8, 0);
                                this.field3693.method1896(class248.field3341, (byte) -6);
                                var12.method3243(var16 / 3, var13, (byte) 112);
                            }
                        }
                    }
                }
            }
        }
        this.field3693.method1928(arg3 ^ 0x249F);
        if (arg3 != -45) {
            this.field3691 = -111;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1667(int arg0, String arg1) {
        field3688++;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public final void method1668(int arg0) {
        field3705++;
        int var2 = 123 / ((-arg0 - 17) / 56);
        this.field3689 = new class575[this.field3691][this.field3692];
        for (int var3 = 0; var3 < this.field3692; var3++) {
            for (int var4 = 0; var4 < this.field3691; var4++) {
                this.field3689[var4][var3] = new class575(this.field3693, this, this.field3706, var4, var3, this.field3694, var4 * 128 + 1, var3 * 128 + 1);
                if (this.field3689[var4][var3].field7945 == 0) {
                    this.field3689[var4][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)Lmaa;")
    public static final class588 method1669(int arg0) {
        field3703++;
        if (class561.field7658 == null || class20.field184 == null) {
            return null;
        } else if (arg0 == 0) {
            for (class588 var1 = (class588) class20.field184.method412(arg0 + 111); var1 != null; var1 = (class588) class20.field184.method412(arg0 + 61)) {
                class679 var2 = class561.field7649.method218(var1.field8076, (byte) 13);
                if (var2 != null && var2.field9613 && var2.method3747((byte) 112, class561.field7645)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lsv;Lua;)V")
    public class273(class312 arg0, class303 arg1) {
        this.field3693 = arg0;
        this.field3706 = arg1;
        this.field3695 = (this.field3706.field2214 * this.field3706.field2210 >> this.field3693.field4438) + 2;
        this.field3696 = (this.field3706.field2215 * this.field3706.field2210 >> this.field3693.field4438) + 2;
        this.field3698 = new byte[this.field3696 * this.field3695];
        this.field3694 = this.field3693.field4438 + 7 - this.field3706.field2212;
        this.field3691 = this.field3706.field2214 >> this.field3694;
        this.field3692 = this.field3706.field2215 >> this.field3694;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZII)V")
    private final void method1670(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3697++;
        if (this.field3689 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 - (1 - arg1) - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class575[] var11 = this.field3689[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7943 = true;
                }
            }
        }
        if (arg2) {
            this.method1668(127);
        }
    }
}
