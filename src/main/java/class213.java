import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class213 extends class297 {

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "[S")
    public static short[] field3324 = new short[256];

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[Lhn;")
    public static class38[] field3321 = new class38[14];

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "[I")
    public static int[] field3331 = new int[25];

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3332 = "Ok";

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lfm;")
    public static class52 field3335;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 6)
    public static final String method1544(String arg0, int arg1, String arg2, String arg3) {
        field3325++;
        if (arg1 < 4) {
            method1546(-3, 58, 47, 114, -2, 66, -109);
        }
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, arg2.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(arg0.length() + var4);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[I", line = 31)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[]) null;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        field3320++;
        if (this.field4760.field388) {
            for (int var4 = 0; var4 < class31.field491; var4++) {
                this.method1547(-1, arg0, var4);
                int[] var5 = this.method2109(class103.field1704, (byte) 106, 0);
                var3[var4] = var5[class226.field3503];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILpf;I)V", line = 72)
    public static final void method1545(int arg0, int arg1, int arg2, class92 arg3, int arg4) {
        field3334++;
        if (class345.field5363 == arg3 || class137.field2225 >= 400) {
            return;
        }
        String var5;
        if (arg3.field1481 == 0) {
            boolean var6 = true;
            if (class345.field5363.field1478 != -1 && arg3.field1478 != -1) {
                int var7 = class345.field5363.field1475 > arg3.field1475 ? class345.field5363.field1475 : arg3.field1475;
                int var8 = arg3.field1478 <= class345.field5363.field1478 ? arg3.field1478 : class345.field5363.field1478;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class345.field5363.field1475 - arg3.field1475;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class109.field1773 == 1 ? class73.field1111 : class63.field915;
            if (arg3.field1475 >= arg3.field1497) {
                var5 = arg3.method735((byte) -41) + (var6 ? class144.method1104(arg3.field1475, -6013, class345.field5363.field1475) : "<col=ffffff>") + " (" + var11 + arg3.field1475 + ")";
            } else {
                var5 = arg3.method735((byte) 115) + (var6 ? class144.method1104(arg3.field1475, -6013, class345.field5363.field1475) : "<col=ffffff>") + " (" + var11 + arg3.field1475 + "+" + (arg3.field1497 - arg3.field1475) + ")";
            }
        } else {
            var5 = arg3.method735((byte) 125) + " (" + class109.field1771 + arg3.field1481 + ")";
        }
        if (class25.field428 == 1) {
            class147.method1121(arg0, class93.field1522, arg2, class141.field2283 + " -> <col=ffffff>" + var5, class116.field1880, arg4 + 2043, (long) arg1, (short) 30);
            class85.field1373++;
        } else if (!class315.field4977) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class28.field455[var12] != null) {
                    class10.field224++;
                    short var13 = 0;
                    if (class109.field1773 == 0 && class28.field455[var12].equalsIgnoreCase(class68.field1033)) {
                        if (arg3.field1475 > class345.field5363.field1475) {
                            var13 = 2000;
                        }
                        if (class345.field5363.field1511 != 0 && arg3.field1511 != 0) {
                            if (class345.field5363.field1511 == arg3.field1511) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class85.field1371[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class221.field3455[var12];
                    short var16 = (short) (var13 + var15);
                    class147.method1121(arg0, class28.field455[var12], arg2, "<col=ffffff>" + var5, class62.field913[var12], 115, (long) arg1, var16);
                }
            }
        } else if ((class36.field549 & 0x8) != 0) {
            class147.method1121(arg0, class129.field2067, arg2, class55.field848 + " -> <col=ffffff>" + var5, class301.field4797, -5, (long) arg1, (short) 16);
            class109.field1785++;
        }
        if (arg4 != -2048) {
            field3332 = (String) null;
        }
        for (int var17 = 0; var17 < class137.field2225; var17++) {
            if (class120.field1960[var17] == 31) {
                class285.field4441[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V", line = 203)
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 29547) {
            field3331 = (int[]) null;
        }
        if (class310.field4897 <= arg5 && class180.field2862 >= arg0 && arg4 >= class104.field1719 && class333.field5188 >= arg1) {
            if (arg3 == 1) {
                class325.method2279(arg5, arg1, arg0, arg6, arg4, -123);
            } else {
                class77.method606(arg0, arg3, arg6, 0, arg1, arg5, arg4);
            }
        } else if (arg3 == 1) {
            class331.method2320(arg5, arg1, arg4, arg6, -126, arg0);
        } else {
            class191.method1374(arg4, arg6, (byte) -126, arg0, arg1, arg3, arg5);
        }
        field3327++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V", line = 234)
    private final void method1547(int arg0, int arg1, int arg2) {
        field3330++;
        int var4 = class251.field3705[arg2];
        int var5 = class264.field3901[arg1];
        if (arg0 != -1) {
            field3329 = -93;
        }
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class226.field3503 = arg2;
            class103.field1704 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class103.field1704 = arg2;
            class226.field3503 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class226.field3503 = class31.field491 - arg1;
            class103.field1704 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class103.field1704 = class164.field2670 - arg1;
            class226.field3503 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class103.field1704 = class164.field2670 - arg1;
            class226.field3503 = class31.field491 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class226.field3503 = class31.field491 - arg1;
            class103.field1704 = class164.field2670 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class103.field1704 = class164.field2670 - arg2;
            class226.field3503 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class103.field1704 = arg1;
            class226.field3503 = class31.field491 - arg2;
        }
        class103.field1704 &= class175.field2801;
        class226.field3503 &= class257.field3813;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 307)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[[I", line = 313)
    public final int[][] method172(int arg0, byte arg1) {
        field3333++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class31.field491; var7++) {
                this.method1547(arg1 ^ 0xFFFFFFC0, arg0, var7);
                int[][] var8 = this.method2105(class103.field1704, arg1 ^ 0x3D, 0);
                var5[var7] = var8[0][class226.field3503];
                var4[var7] = var8[1][class226.field3503];
                var6[var7] = var8[2][class226.field3503];
            }
        }
        if (arg1 != 63) {
            this.method1547(123, 85, 53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[F)[F", line = 353)
    public static final float[] method1548(int arg0, float[] arg1) {
        field3328++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -71 % ((arg0 - 67) / 57);
            float[] var3 = new float[arg1.length];
            class330.method2310(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I", line = 369)
    public static final int method1549(int arg0, int arg1) {
        field3336++;
        if (arg0 < arg1) {
            return 0;
        }
        class307 var2 = (class307) class340.field5253.method79((long) arg0, (byte) 0);
        if (var2 == null) {
            return class117.method922(-91, arg0).field354;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field4871.length; var4++) {
            if (var2.field4871[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class117.method922(-91, arg0).field354 - var2.field4871.length);
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V", line = 402)
    public static void method1550(int arg0) {
        field3332 = null;
        if (arg0 == 255) {
            field3335 = null;
            field3324 = null;
            field3321 = null;
            field3331 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 419)
    public static final void method1551(String arg0, int arg1, int arg2) {
        class170 var3 = class221.method1613(3, arg2, -8410);
        field3323++;
        var3.method1269(false);
        if (arg1 == -13690) {
            var3.field2729 = arg0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILaj;)V", line = 432)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            this.method1547(-6, 12, -117);
        }
        field3322++;
        if (arg0 == 0) {
            this.field4762 = arg2.method15((byte) -115) == 1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIILam;I)Lwd;", line = 449)
    public static final class88 method1552(int arg0, int arg1, boolean arg2, int arg3, int arg4, class270 arg5, int arg6) {
        int var7 = (arg6 << 17) + (arg2 ? 65536 : 0) + (arg3 << 19) + arg1;
        field3326++;
        if (arg4 != 65536) {
            return (class88) null;
        }
        long var9 = (long) arg0 * 3147483667L + ((long) var7 * 3849834839L);
        class88 var11 = (class88) class113.field1822.method2288(var9, (byte) 101);
        if (var11 != null) {
            return var11;
        }
        class40.field618 = false;
        class88 var12 = class211.method1540(arg1, arg5, false, false, arg3, -1, arg2, arg0, arg6);
        if (var12 != null && !class40.field618) {
            class113.field1822.method2281(0, var9, var12);
        }
        return var12;
    }
}
