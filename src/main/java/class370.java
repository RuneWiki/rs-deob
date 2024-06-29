import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class370 extends class241 {

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lbq;")
    private class289 field4725 = new class289();

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    private int field4739 = 0;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    private int field4734 = 256;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    private int field4735 = 256;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4733 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lpia;")
    public static class94 field4727 = new class94(40, 8);

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
    public static int[] field4741 = new int[500];

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Ljava/awt/Frame;")
    public static Frame field4740;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
    private boolean field4736;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Z")
    private boolean field4738;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 7)
    public static void method2149(byte arg0) {
        int var1 = -53 / ((25 - arg0) / 61);
        field4727 = null;
        field4740 = null;
        field4741 = null;
        field4733 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)D", line = 19)
    public final synchronized double method2150(boolean arg0) {
        field4717++;
        if (this.field4739 < 1) {
            return -1.0D;
        }
        class264 var2 = (class264) this.field4725.method1719(65280);
        if (var2 == null) {
            return -1.0D;
        } else {
            if (arg0) {
                this.field4736 = true;
            }
            return (double) (-((float) var2.field3286[0].length / (float) class277.field3387)) + var2.field3285;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 41)
    public final synchronized void method2151(int arg0) {
        int var2 = -15 / ((61 - arg0) / 61);
        field4729++;
        this.field4738 = true;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V", line = 53)
    private final synchronized void method2152(int arg0) {
        field4715++;
        class264 var2 = this.method2155(2);
        if (var2 == null) {
            return;
        }
        var2.method864(12983);
        this.field4737 = 0;
        this.field4739--;
        class90.field939.method1611(var2.method1593((byte) 71), (byte) 40, var2);
        if (arg0 != 500) {
            this.method678();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Leia;", line = 73)
    public final class241 method681() {
        field4728++;
        return null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIIII)V", line = 83)
    public static final void method2153(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4721++;
        class308.method1837(arg3, 2);
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -16 / ((arg0 + 70) / 51);
        int var11 = -arg3;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        if (arg6 >= class224.field2571 && arg6 <= class578.field8182) {
            int[] var15 = class408.field5585[arg6];
            int var16 = class211.method1255(class338.field4355, arg2 - arg3, false, class744.field10385);
            int var17 = class211.method1255(class338.field4355, arg2 + arg3, false, class744.field10385);
            int var18 = class211.method1255(class338.field4355, arg2 - var8, false, class744.field10385);
            int var19 = class211.method1255(class338.field4355, arg2 + var8, false, class744.field10385);
            class223.method1297(var15, -7, var16, arg4, var18);
            class223.method1297(var15, -7, var18, arg1, var19);
            class223.method1297(var15, -7, var19, arg4, var17);
        }
        int var20 = -1;
        while (var9 > var7) {
            var14 += 2;
            var20 += 2;
            var11 += var14;
            var13 += var20;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                var13 -= var12 << 1;
                class220.field2541[var12] = var7;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                int var21 = arg6 - var9;
                int var22 = arg6 + var9;
                if (var22 >= class224.field2571 && var21 <= class578.field8182) {
                    if (var8 <= var9) {
                        int var23 = class211.method1255(class338.field4355, arg2 + var7, false, class744.field10385);
                        int var24 = class211.method1255(class338.field4355, arg2 - var7, false, class744.field10385);
                        if (var22 <= class578.field8182) {
                            class223.method1297(class408.field5585[var22], -7, var24, arg4, var23);
                        }
                        if (var21 >= class224.field2571) {
                            class223.method1297(class408.field5585[var21], -7, var24, arg4, var23);
                        }
                    } else {
                        int var25 = class220.field2541[var9];
                        int var26 = class211.method1255(class338.field4355, arg2 + var7, false, class744.field10385);
                        int var27 = class211.method1255(class338.field4355, arg2 - var7, false, class744.field10385);
                        int var28 = class211.method1255(class338.field4355, arg2 + var25, false, class744.field10385);
                        int var29 = class211.method1255(class338.field4355, arg2 - var25, false, class744.field10385);
                        if (class578.field8182 >= var22) {
                            int[] var30 = class408.field5585[var22];
                            class223.method1297(var30, -7, var27, arg4, var29);
                            class223.method1297(var30, -7, var29, arg1, var28);
                            class223.method1297(var30, -7, var28, arg4, var26);
                        }
                        if (var21 >= class224.field2571) {
                            int[] var31 = class408.field5585[var21];
                            class223.method1297(var31, -7, var27, arg4, var29);
                            class223.method1297(var31, -7, var29, arg1, var28);
                            class223.method1297(var31, -7, var28, arg4, var26);
                        }
                    }
                }
            }
            int var32 = arg6 - var7;
            int var33 = arg6 + var7;
            if (class224.field2571 <= var33 && class578.field8182 >= var32) {
                int var34 = arg2 + var9;
                int var35 = arg2 - var9;
                if (class338.field4355 <= var34 && var35 <= class744.field10385) {
                    int var36 = class211.method1255(class338.field4355, var34, false, class744.field10385);
                    int var37 = class211.method1255(class338.field4355, var35, false, class744.field10385);
                    if (var7 >= var8) {
                        if (var33 <= class578.field8182) {
                            class223.method1297(class408.field5585[var33], -7, var37, arg4, var36);
                        }
                        if (class224.field2571 <= var32) {
                            class223.method1297(class408.field5585[var32], -7, var37, arg4, var36);
                        }
                    } else {
                        int var38 = var12 >= var7 ? var12 : class220.field2541[var7];
                        int var39 = class211.method1255(class338.field4355, arg2 + var38, false, class744.field10385);
                        int var40 = class211.method1255(class338.field4355, arg2 - var38, false, class744.field10385);
                        if (var33 <= class578.field8182) {
                            int[] var41 = class408.field5585[var33];
                            class223.method1297(var41, -7, var37, arg4, var40);
                            class223.method1297(var41, -7, var40, arg1, var39);
                            class223.method1297(var41, -7, var39, arg4, var36);
                        }
                        if (var32 >= class224.field2571) {
                            int[] var42 = class408.field5585[var32];
                            class223.method1297(var42, -7, var37, arg4, var40);
                            class223.method1297(var42, -7, var40, arg1, var39);
                            class223.method1297(var42, -7, var39, arg4, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V", line = 270)
    public final synchronized void method2154(int arg0, boolean arg1) {
        field4722++;
        this.field4736 = arg1;
        if (arg0 != 19265) {
            this.method2154(-102, true);
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)Lmda;", line = 281)
    private final synchronized class264 method2155(int arg0) {
        field4726++;
        if (arg0 != 2) {
            this.method2156(-20, 26);
        }
        return (class264) this.field4725.method1719(65280);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 295)
    public final void method2156(int arg0, int arg1) {
        field4730++;
        this.field4734 = arg0;
        if (arg1 == -1) {
            this.field4735 = arg0;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLmda;)V", line = 309)
    public final synchronized void method2157(byte arg0, class264 arg1) {
        if (arg0 > -91) {
            field4741 = null;
        }
        while (this.field4739 >= 100) {
            this.field4725.method1729(662);
            this.field4739--;
        }
        field4719++;
        this.field4725.method1721((byte) 111, arg1);
        this.field4739++;
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)I", line = 328)
    public final synchronized int method2158(int arg0) {
        field4732++;
        return arg0 == -1 ? this.field4739 : -43;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBD)Lmda;", line = 341)
    public final class264 method2159(int arg0, byte arg1, double arg2) {
        field4716++;
        if (arg1 <= 92) {
            this.field4738 = false;
        }
        long var5 = (long) (arg0 | this.field4731 << 0);
        class264 var7 = (class264) class90.field939.method1613(var5, 127);
        if (var7 == null) {
            var7 = new class264(new short[this.field4731][arg0], arg2);
        } else {
            var7.field3285 = arg2;
            class90.field939.method1612(false, var5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 364)
    public final synchronized void method649(int arg0) {
        field4723++;
        if (this.field4736) {
            return;
        }
        while (true) {
            class264 var2 = this.method2155(2);
            if (var2 == null) {
                if (this.field4738) {
                    this.method864(12983);
                    class90.field939.method1610(102);
                }
                return;
            }
            if ((var2.field3286[0].length - this.field4737) > arg0) {
                this.field4737 += arg0;
                return;
            }
            arg0 -= var2.field3286[0].length - this.field4737;
            this.method2152(500);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V", line = 404)
    public final synchronized void method659(int[] arg0, int arg1, int arg2) {
        field4720++;
        if (this.field4736) {
            return;
        }
        if (this.method2155(2) != null) {
            int var4 = arg1 + arg2;
            if (class54.field556) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field4731 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class264 var7 = this.method2155(2);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field3286;
                while (var4 > arg1 && this.field4737 < var8[0].length) {
                    if (class54.field556) {
                        arg0[arg1++] = var8[var5][this.field4737] * this.field4735;
                        arg0[arg1++] = var8[var6][this.field4737] * this.field4734;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field4737] * this.field4735 + var8[var6][this.field4737] * this.field4734;
                    }
                    this.field4737++;
                }
                if (var8[0].length <= this.field4737) {
                    this.method2152(500);
                }
            }
        } else if (this.field4738) {
            this.method864(12983);
            class90.field939.method1610(117);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I", line = 472)
    public final int method669() {
        field4718++;
        return 1;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 512)
    public class370(int arg0) {
        this.field4731 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()Leia;", line = 494)
    public final class241 method678() {
        field4724++;
        return null;
    }
}
