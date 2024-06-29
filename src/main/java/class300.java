import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class300 extends class478 {

    @OriginalMember(owner = "client!faa", name = "C", descriptor = "I")
    private int field3731 = 1;

    @OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
    private int field3735 = 0;

    @OriginalMember(owner = "client!faa", name = "I", descriptor = "I")
    private int field3737 = 0;

    @OriginalMember(owner = "client!faa", name = "D", descriptor = "Loo;")
    public static class41 field3732 = new class41();

    @OriginalMember(owner = "client!faa", name = "L", descriptor = "Lcq;")
    public static class110 field3740 = new class110(90, 12);

    @OriginalMember(owner = "client!faa", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3741 = new String[100];

    @OriginalMember(owner = "client!faa", name = "B", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!faa", name = "F", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!faa", name = "H", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!faa", name = "J", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!faa", name = "K", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!faa", name = "E", descriptor = "[I")
    public static int[] field3733;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILnp;I)V", line = 6)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field3731 = arg1.method620((byte) -30);
                }
            } else {
                this.field3735 = arg1.method620((byte) 64);
            }
        } else {
            this.field3737 = arg1.method620((byte) -128);
        }
        if (arg0 != 255) {
            method1744(126, 94, 124, 104, -54, -81, 46);
        }
        ++field3736;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V", line = 54)
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V", line = 57)
    public static void method1743(byte arg0) {
        if (arg0 == -84) {
            field3741 = null;
            field3733 = null;
            field3740 = null;
            field3732 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIII)Z", line = 77)
    public static final boolean method1744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3730;
        int var7 = arg3 + arg6;
        int var8 = arg5 - -arg0;
        int var9 = arg1 - -arg4;
        if (!class699.method3842(arg6, -24488, arg6, var8, var7, var9, var9, arg1, var8, var8)) {
            return false;
        } else if (!class699.method3842(var7, -24488, arg6, var8, var7, arg1, var9, arg1, var8, var8)) {
            return false;
        } else {
            if (class258.field3241 > arg6) {
                if (!class699.method3842(arg6, arg2 + -1513, arg6, arg5, arg6, arg1, var9, var9, var8, var8)) {
                    return false;
                }
                if (!class699.method3842(arg6, -24488, arg6, arg5, arg6, arg1, arg1, var9, var8, arg5)) {
                    return false;
                }
            } else {
                if (!class699.method3842(var7, -24488, var7, arg5, var7, arg1, var9, var9, var8, var8)) {
                    return false;
                }
                if (!class699.method3842(var7, -24488, var7, arg5, var7, arg1, arg1, var9, var8, arg5)) {
                    return false;
                }
            }
            if (arg2 != -22975) {
                method1744(9, 101, -110, 115, 109, -124, -41);
            }
            if (~class696.field9775 >= ~arg1) {
                if (!class699.method3842(arg6, -24488, arg6, arg5, var7, var9, var9, var9, var8, var8)) {
                    return false;
                }
                if (!class699.method3842(var7, -24488, arg6, arg5, var7, var9, var9, var9, var8, arg5)) {
                    return false;
                }
            } else {
                if (!class699.method3842(arg6, -24488, arg6, arg5, var7, arg1, arg1, arg1, var8, var8)) {
                    return false;
                }
                if (!class699.method3842(var7, arg2 ^ 1561, arg6, arg5, var7, arg1, arg1, arg1, var8, arg5)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)[I", line = 151)
    public final int[] method35(int arg0, int arg1) {
        ++field3739;
        if (arg1 != -11323) {
            return null;
        } else {
            int[] var3 = super.field6886.method789(arg0, (byte) -110);
            if (super.field6886.field1592) {
                int var4 = class695.field9740[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class436.field6154; ++var6) {
                    int var7 = class684.field9645[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field3737 != 0) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field3731 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field3731;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field3735 != 0) {
                        if (this.field3735 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class215.field2608[var12 >> 4 & 255] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 219)
    public final void method34(byte arg0) {
        if (arg0 == 23) {
            class625.method3518(arg0 + -23);
            ++field3738;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z[[[BIB)V", line = 232)
    public static final void method1745(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class446.field6294 = 0;
        class361.field4846 = 0;
        ++class507.field7280;
        for (int var5 = 0; var5 < class321.field3949[var4]; ++var5) {
            if (!class551.method3127(class469.field6711[var4][var5], arg0, arg1, arg2, arg3)) {
                class208.method1239(class469.field6711[var4][var5]);
                if (class469.field6711[var4][var5].field5168 != -1) {
                    class337.field4241[class446.field6294++] = class469.field6711[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class635.field8946[var4]; ++var6) {
            if (!class551.method3127(class13.field115[var4][var6], arg0, arg1, arg2, arg3)) {
                class208.method1239(class13.field115[var4][var6]);
                if (class13.field115[var4][var6].field5168 != -1) {
                    class234.field2869[class361.field4846++] = class13.field115[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class701.field9822[var4]; ++var7) {
            if (!class551.method3127(class476.field6867[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class476.field6867[var4][var7].method177(-115)) {
                    class208.method1239(class476.field6867[var4][var7]);
                    if (class476.field6867[var4][var7].field5168 != -1) {
                        class234.field2869[class361.field4846++] = class476.field6867[var4][var7];
                    }
                } else {
                    class208.method1239(class476.field6867[var4][var7]);
                    if (class476.field6867[var4][var7].field5168 != -1) {
                        class337.field4241[class446.field6294++] = class476.field6867[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class282.field3532; ++var8) {
                if (!class551.method3127(class138.field1525[var8], arg0, arg1, arg2, arg3)) {
                    class208.method1239(class138.field1525[var8]);
                    if (class138.field1525[var8].field5168 != -1) {
                        if (class138.field1525[var8].method177(-113)) {
                            class234.field2869[class361.field4846++] = class138.field1525[var8];
                        } else {
                            class337.field4241[class446.field6294++] = class138.field1525[var8];
                        }
                    }
                }
            }
        }
        if (class446.field6294 > 0) {
            class252.method1482(class337.field4241, 0, class446.field6294 - 1);
            for (int var9 = 0; var9 < class446.field6294; ++var9) {
                class92.method467(class337.field4241[var9], true);
            }
        }
        if (class472.field6806) {
            class568.field8078.method1020(0, (class670[]) null);
        }
        for (int var10 = class304.field3767; var10 < class612.field8618; ++var10) {
            if (var10 >= arg2 && arg1 != null) {
                int var12 = class475.field6837.length;
                if (class475.field6837.length + class72.field731 > class122.field1369) {
                    var12 -= class475.field6837.length + class72.field731 - class122.field1369;
                }
                int var13 = class475.field6837[0].length;
                if (class475.field6837[0].length + class76.field786 > class247.field3058) {
                    var13 -= class475.field6837[0].length + class76.field786 - class247.field3058;
                }
                boolean[][] var14 = class41.field408;
                if (class527.field7431) {
                    if (class110.field1180) {
                        var14 = class560.field7992[var10];
                    }
                    for (int var15 = class137.field1503; var15 < var12; ++var15) {
                        int var16 = class72.field731 + var15 - class137.field1503;
                        for (int var17 = class599.field8438; var17 < var13; ++var17) {
                            var14[var15][var17] = false;
                            if (class475.field6837[var15][var17]) {
                                int var18 = class76.field786 + var17 - class599.field8438;
                                for (int var19 = var10; var19 >= 0; --var19) {
                                    if (class487.field7044[var19][var16][var18] != null && class487.field7044[var19][var16][var18].field7211 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class64.method349(-122, var16, var10, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class110.field1180) {
                    class156.field1743[var10].method376(0, 0, 0, (boolean[][]) null, false);
                    for (int var20 = 0; var20 < class15.field126; ++var20) {
                        class472.field6799[var20].method1216(0, new class105(var10 + 1));
                    }
                } else if (class164.field1826) {
                    class156.field1743[var10].method380(class309.field3830, class379.field5139, class460.field6544, class41.field408, false, class617.field8696);
                } else {
                    class156.field1743[var10].method376(class309.field3830, class379.field5139, class460.field6544, class41.field408, false);
                }
            } else {
                int var21 = class475.field6837.length;
                if (class475.field6837.length + class72.field731 > class122.field1369) {
                    var21 -= class475.field6837.length + class72.field731 - class122.field1369;
                }
                int var22 = class475.field6837[0].length;
                if (class475.field6837[0].length + class76.field786 > class247.field3058) {
                    var22 -= class475.field6837[0].length + class76.field786 - class247.field3058;
                }
                boolean[][] var23 = class41.field408;
                if (class527.field7431) {
                    if (class110.field1180) {
                        var23 = class560.field7992[var10];
                    }
                    for (int var24 = class137.field1503; var24 < var21; ++var24) {
                        int var25 = class72.field731 + var24 - class137.field1503;
                        for (int var26 = class599.field8438; var26 < var22; ++var26) {
                            if (class475.field6837[var24][var26] && !class64.method349(23, var25, var10, class76.field786 + var26 - class599.field8438)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class110.field1180) {
                    class156.field1743[var10].method376(0, 0, 0, (boolean[][]) null, false);
                    for (int var27 = 0; var27 < class15.field126; ++var27) {
                        class472.field6799[var27].method1216(0, new class105(var10 + 1));
                    }
                } else if (class164.field1826) {
                    class156.field1743[var10].method380(class309.field3830, class379.field5139, class460.field6544, class41.field408, true, class617.field8696);
                } else {
                    class156.field1743[var10].method376(class309.field3830, class379.field5139, class460.field6544, class41.field408, true);
                }
            }
        }
        if (class361.field4846 > 0) {
            class610.method3395(class234.field2869, 0, class361.field4846 - 1);
            for (int var11 = 0; var11 < class361.field4846; ++var11) {
                class92.method467(class234.field2869[var11], true);
            }
        }
    }
}
