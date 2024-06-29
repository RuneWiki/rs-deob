import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class146 extends class179 {

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    private int[] field1709;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private int[] field1710;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lsb;")
    private class194 field1714;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lsb;")
    private class194 field1725;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lsb;")
    private class194 field1715;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[Lsb;")
    private class194[] field1707;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Leh;")
    public static class157 field1722;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lwo;")
    public static class285 field1716;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILgd;Lwo;)Z")
    public final boolean method943(int arg0, class172 arg1, class285 arg2) {
        field1719++;
        if (class451.field6306 <= 0) {
            for (int var4 = 0; var4 < this.field1709.length; var4++) {
                if (!arg2.method1797(0, this.field1709[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1709.length; var5++) {
                if (!arg2.method1803(true, this.field1709[var5], class451.field6306)) {
                    return false;
                }
            }
        }
        if (arg0 < 7) {
            this.method948(0.6080608170461874D, -72, -60, false, -91, (class285) null, (class172) null, false);
        }
        for (int var6 = 0; var6 < this.field1710.length; var6++) {
            if (!arg1.method963(this.field1710[var6], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        field1718++;
        if (arg0) {
            method951(true);
        }
        int var1 = class387.field5289 * 128 + 64;
        int var2 = class152.field1776 * 128 + 64;
        int var3 = class189.method1170(var2, var1, true, class43.field513) - class116.field1340;
        if (class285.field3742 >= 100) {
            class80.field979 = class152.field1776 * 128 + 64;
            class287.field3784 = class387.field5289 * 128 + 64;
            class51.field587 = class189.method1170(class80.field979, class287.field3784, true, class43.field513) - class116.field1340;
        } else {
            if (var1 > class287.field3784) {
                class287.field3784 += class28.field310 + ((var1 - class287.field3784) * class285.field3742 / 1000);
                if (var1 < class287.field3784) {
                    class287.field3784 = var1;
                }
            }
            if (class287.field3784 > var1) {
                class287.field3784 -= (class287.field3784 - var1) * class285.field3742 / 1000 + class28.field310;
                if (class287.field3784 < var1) {
                    class287.field3784 = var1;
                }
            }
            if (class51.field587 < var3) {
                class51.field587 += (var3 - class51.field587) * class285.field3742 / 1000 + class28.field310;
                if (var3 < class51.field587) {
                    class51.field587 = var3;
                }
            }
            if (var2 > class80.field979) {
                class80.field979 += (var2 - class80.field979) * class285.field3742 / 1000 + class28.field310;
                if (var2 < class80.field979) {
                    class80.field979 = var2;
                }
            }
            if (var3 < class51.field587) {
                class51.field587 -= (class51.field587 - var3) * class285.field3742 / 1000 + class28.field310;
                if (var3 > class51.field587) {
                    class51.field587 = var3;
                }
            }
            if (var2 < class80.field979) {
                class80.field979 -= (class80.field979 - var2) * class285.field3742 / 1000 + class28.field310;
                if (class80.field979 < var2) {
                    class80.field979 = var2;
                }
            }
        }
        int var4 = class66.field797 * 128 + 64;
        int var5 = class277.field3586 * 128 + 64;
        int var6 = class189.method1170(var4, var5, true, class43.field513) - class127.field1415;
        int var7 = var5 - class287.field3784;
        int var8 = var6 - class51.field587;
        int var9 = var4 - class80.field979;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class178.field2081 < var11) {
            class178.field2081 += (var11 - class178.field2081 >> 3) * class255.field3313 / 1000 + client.field6059 << 3;
            if (var11 < class178.field2081) {
                class178.field2081 = var11;
            }
        }
        if (class178.field2081 > var11) {
            class178.field2081 -= (class178.field2081 - var11 >> 3) * class255.field3313 / 1000 + client.field6059 << 3;
            if (class178.field2081 < var11) {
                class178.field2081 = var11;
            }
        }
        int var13 = var12 - class433.field5912;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class433.field5912 += class255.field3313 * var14 / 1000 + client.field6059 << 3;
            class433.field5912 &= 0x3FFF;
        }
        if (var14 < 0) {
            class433.field5912 -= -var14 * class255.field3313 / 1000 + client.field6059 << 3;
            class433.field5912 &= 0x3FFF;
        }
        int var15 = var12 - class433.field5912;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class433.field5912 = var12;
        }
        class127.field1417 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIILwo;ILgd;)[F")
    public final float[] method945(boolean arg0, int arg1, int arg2, class285 arg3, int arg4, class172 arg5) {
        field1711++;
        class267.field3446 = arg5;
        class96.field1135 = arg3;
        for (int var7 = arg2; var7 < this.field1707.length; var7++) {
            this.field1707[var7].method1202(arg4, arg1, 1);
        }
        class32.method210((byte) 62, arg4, arg1);
        float[] var8 = new float[arg1 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1725.field2278) {
                int[] var12 = this.field1725.method55(var10, 10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1725.method59(-730, var10);
                var15 = var16[0];
                var13 = var16[2];
                var14 = var16[1];
            }
            int[] var17;
            if (this.field1715.field2278) {
                var17 = this.field1715.method55(var10, -93);
            } else {
                var17 = this.field1715.method59(-730, var10)[0];
            }
            int[] var18;
            if (this.field1714.field2278) {
                var18 = this.field1714.method55(var10, -19);
            } else {
                var18 = this.field1714.method59(-730, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1707.length; var11++) {
            this.field1707[var11].method1206(11097);
        }
        return var8;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwo;Lwo;Z)V")
    public static final void method946(class285 arg0, class285 arg1, boolean arg2) {
        class362.field4916 = arg0;
        if (arg2) {
            method947(84, 113, (class446) null, false, -68, (class118) null);
        }
        class236.field3100 = arg1;
        field1712++;
        class236.field3100.method1821(81, 36);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILnd;ZILuo;)V")
    public static final void method947(int arg0, int arg1, class446 arg2, boolean arg3, int arg4, class118 arg5) {
        field1721++;
        class66 var6 = class236.method1518(arg2.field6224, 34);
        if (var6.field794 == -1) {
            return;
        }
        int var7;
        if (arg2.field6252) {
            int var8 = arg2.field6187 + arg4;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        if (arg3) {
            return;
        }
        class436 var9 = var6.method382(var7, arg2.field6228, 95, arg5);
        if (var9 == null) {
            return;
        }
        int var10 = arg2.field6244;
        int var11 = arg2.field6170;
        if ((var7 & 0x1) == 1) {
            var10 = arg2.field6170;
            var11 = arg2.field6244;
        }
        int var12 = var9.method235();
        int var13 = var9.method236();
        if (var6.field790) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field792 == 0) {
            var9.method2664(arg0, arg1 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method163(arg0, arg1 + 4 - var11 * 4, var12, var13, 1, var6.field792 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(DIIZILwo;Lgd;Z)[I")
    public final int[] method948(double arg0, int arg1, int arg2, boolean arg3, int arg4, class285 arg5, class172 arg6, boolean arg7) {
        class96.field1135 = arg5;
        field1724++;
        class267.field3446 = arg6;
        for (int var10 = arg4; var10 < this.field1707.length; var10++) {
            this.field1707[var10].method1202(arg1, arg2, 1);
        }
        class314.method1980((byte) 22, arg0);
        class32.method210((byte) 62, arg1, arg2);
        int[] var11 = new int[arg1 * arg2];
        int var12;
        int var13;
        byte var14;
        if (arg7) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var12 = arg1;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1725.field2278) {
                int[] var22 = this.field1725.method55(var16, arg4 ^ 0x79);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field1725.method59(-730, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class104.field1220[var24];
                int var28 = class104.field1220[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class104.field1220[var26];
                int var30 = (var28 << 8) + ((var27 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1707.length; var17++) {
            this.field1707[var17].method1206(11097);
        }
        return var11;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(DILgd;Lwo;IIZ)[I")
    public final int[] method949(double arg0, int arg1, class172 arg2, class285 arg3, int arg4, int arg5, boolean arg6) {
        class96.field1135 = arg3;
        field1706++;
        class267.field3446 = arg2;
        for (int var9 = 0; var9 < this.field1707.length; var9++) {
            this.field1707[var9].method1202(arg5, arg1, 1);
        }
        class314.method1980((byte) 22, arg0);
        class32.method210((byte) 62, arg5, arg1);
        int[] var10 = new int[arg1 * arg5 * 4];
        int var11 = 0;
        if (arg4 != 29280) {
            method946((class285) null, (class285) null, true);
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1725.field2278) {
                int[] var18 = this.field1725.method55(var12, arg4 ^ 0x7215);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field1725.method59(-730, var12);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field1715.field2278) {
                var19 = this.field1715.method55(var12, 107);
            } else {
                var19 = this.field1715.method59(arg4 - 30010, var12)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class104.field1220[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class104.field1220[var21];
                int var26 = class104.field1220[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + (var27 << 24) + (var25 << 16) + var26;
                if (arg6) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1707.length; var13++) {
            this.field1707[var13].method1206(11097);
        }
        return var10;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method950(int arg0, int arg1) {
        if (arg0 == 37) {
            class224.field2814 = 3.0F;
        } else if (arg0 == 50) {
            class224.field2814 = 4.0F;
        } else if (arg0 == 75) {
            class224.field2814 = 6.0F;
        } else if (arg0 == 100) {
            class224.field2814 = 8.0F;
        } else if (arg0 == 200) {
            class224.field2814 = 16.0F;
        }
        field1720++;
        class157.field1832 = -1;
        class157.field1832 = -1;
        if (arg1 != -201) {
            method947(2, 24, (class446) null, false, 48, (class118) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
    public static void method951(boolean arg0) {
        field1716 = null;
        if (arg0) {
            method944(true);
        }
        field1722 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class146() {
        this.field1709 = new int[0];
        this.field1710 = new int[0];
        this.field1714 = new class308(0);
        this.field1714.field2282 = 1;
        this.field1725 = new class308();
        this.field1725.field2282 = 1;
        this.field1715 = new class308();
        this.field1707 = new class194[] { this.field1725, this.field1715, this.field1714 };
        this.field1715.field2282 = 1;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lbg;)V")
    public class146(class242 arg0) {
        int var2 = arg0.method1563(-128);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1707 = new class194[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class194 var16 = class119.method792(arg0, (byte) 105);
            if (var16.method1197(0) >= 0) {
                var3++;
            }
            if (var16.method1199(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field2284.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1563(-128);
            }
            this.field1707[var6] = var16;
        }
        this.field1709 = new int[var3];
        int var7 = 0;
        this.field1710 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class194 var11 = this.field1707[var9];
            int var12 = var11.field2284.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2284[var13] = this.field1707[var5[var9][var13]];
            }
            int var14 = var11.method1197(0);
            int var15 = var11.method1199(-1);
            if (var14 > 0) {
                this.field1709[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1710[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1725 = this.field1707[arg0.method1563(-128)];
        this.field1715 = this.field1707[arg0.method1563(-128)];
        Object var10 = null;
        this.field1714 = this.field1707[arg0.method1563(-128)];
    }
}
