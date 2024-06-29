import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class28 extends class177 {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field319 = 4096;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    private int field324 = 4096;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    private int field328 = 4096;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Ljava/lang/String;")
    public static String field318 = "Hidden";

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Z")
    public static boolean field321;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lal;IIZ[BZ)V", line = 7)
    public static final void method190(class323[] arg0, int arg1, int arg2, boolean arg3, byte[] arg4, boolean arg5) {
        if (!arg5) {
            method192((byte) 85);
        }
        class35 var6 = new class35(arg4);
        int var7 = -1;
        while (true) {
            int var8 = var6.method283(-3);
            if (var8 == 0) {
                field323++;
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method241(0);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method273(65280);
                int var15 = arg2 + var11;
                int var16 = var14 & 0x3;
                int var17 = arg1 + var12;
                int var18 = var14 >> 2;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    class323 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class208.field3272[1][var15][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class324.method2230(var7, arg3, var18, !arg3, var19, var16, var13, 118, var15, var17, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 84)
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)I", line = 88)
    public static final int method191(int arg0, int arg1, int arg2) {
        if (arg0 >= -89) {
            field318 = (String) null;
        }
        field322++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V", line = 124)
    public static final void method192(byte arg0) {
        class83.field1161.method207(arg0 + 1186225037);
        field330++;
        if (arg0 != -61) {
            method191(-128, -113, -126);
        }
        class227.field3508.method1074(0);
        class230.field3563.method1074(0);
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)V", line = 139)
    public static void method193(byte arg0) {
        if (arg0 > -70) {
            method193((byte) -125);
        }
        field318 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 157)
    public static final int method194(String arg0, int arg1) {
        field325++;
        if (arg1 != 10) {
            field321 = false;
        }
        return class209.method1491(true, 10, (byte) -8, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lhb;II)V", line = 180)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field324 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field328 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field319 = arg0.method300(-1394191632);
        }
        if (arg1 == -18061) {
            field327++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILlb;Z)Lvd;", line = 217)
    public static final class134 method195(int arg0, class211 arg1, boolean arg2) {
        field320++;
        if (!arg2) {
            method194((String) null, -55);
        }
        return class57.method513(arg0, arg1, 11332) ? class189.method1364(0) : null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)[[I", line = 239)
    public final int[][] method99(int arg0, int arg1) {
        field329++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var7[var11];
                if (var12 == var13 && var13 == var14) {
                    var6[var11] = this.field324 * var12 >> 12;
                    var8[var11] = this.field328 * var13 >> 12;
                    var10[var11] = this.field319 * var14 >> 12;
                } else {
                    var6[var11] = this.field324;
                    var8[var11] = this.field328;
                    var10[var11] = this.field319;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)Z", line = 300)
    public static final boolean method196(int arg0, int arg1, int arg2, int arg3) {
        if (!class73.method600(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class41.field612[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class163.field2430) {
                    if (!class225.method1604(var4, var6, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class225.method1604(var4, var7, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class225.method1604(var4, var8, var5)) {
                    return false;
                }
                if (!class225.method1604(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class35.field444) {
                    if (!class225.method1604(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class225.method1604(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class225.method1604(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class225.method1604(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class163.field2430) {
                    if (!class225.method1604(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class225.method1604(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class225.method1604(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class225.method1604(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class35.field444) {
                    if (!class225.method1604(var4, var6, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class225.method1604(var4, var7, var5)) {
                        return false;
                    }
                    if (!class225.method1604(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class225.method1604(var4, var8, var5)) {
                    return false;
                }
                if (!class225.method1604(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class225.method1604(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class225.method1604(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class225.method1604(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class225.method1604(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class225.method1604(var4, var8, var5);
        } else {
            return true;
        }
    }
}
