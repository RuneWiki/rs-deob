import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class158 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[I")
    public static int[] field2513 = new int[500];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field2517 = 10;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lck;")
    public static class119 field2509 = class298.method1987((byte) 30, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Lck;")
    public static class119 field2522 = class298.method1987((byte) 109, "Untersuchen");

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lck;")
    public class119 field2523;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
    public boolean field2515;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[[[I")
    public static int[][][] field2507;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3) {
        if (class4.field120 != 0 && arg3 != 0 && class74.field1154 < 50 && arg0 != -1) {
            class220.field3535[class74.field1154] = arg0;
            class134.field2152[class74.field1154] = arg3;
            class262.field4250[class74.field1154] = arg1;
            class249.field4023[class74.field1154] = null;
            class272.field4471[class74.field1154] = 0;
            class74.field1154++;
        }
        if (arg2 != -51) {
            field2513 = (int[]) null;
        }
        field2519++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lsc;", line = 27)
    public static final class296 method1009(byte arg0, int arg1) {
        if (arg0 > -33) {
            method1014((byte) -68);
        }
        field2508++;
        class296 var2 = (class296) class32.field470.method487(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4440.method261(-1, 4, arg1);
        class296 var4 = new class296();
        if (var3 != null) {
            var4.method1977(arg1, new class3(var3), 16);
        }
        class32.field470.method488(var4, (byte) 63, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lml;IIIILmd;I)V", line = 57)
    public static final void method1010(class134 arg0, int arg1, int arg2, int arg3, int arg4, class88 arg5, int arg6) {
        field2516++;
        if (arg5 == null) {
            return;
        }
        int var7 = class42.field651 + class140.field2253 & 0x7FF;
        int var8 = arg1 * arg1 + arg2 * arg2;
        int var9 = Math.max(arg0.field2180 / 2, arg0.field2057 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class284.field4698[var7];
        int var11 = class284.field4699[var7];
        int var12 = var10 * 256 / (class221.field3549 + 256);
        int var13 = var11 * 256 / (class221.field3549 + 256);
        int var14 = arg1 * var13 - (arg2 * var12) >> 16;
        int var15 = arg1 * var12 + arg2 * var13 >> 16;
        ((class160) arg5).method1025(arg6 - (-(arg0.field2180 / 2) - var15) - (arg5.field1346 / arg3), arg0.field2057 / 2 + arg4 + -var14 + -(arg5.field1344 / 2), (class160) arg0.method889(1897326632, false));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I", line = 98)
    public static final int method1011(int arg0, int arg1) {
        field2514++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var2 < var4) {
            var8 = var4;
        }
        if (var6 > var8) {
            var8 = var6;
        }
        double var12 = 0.0D;
        if (var4 < var2) {
            var10 = var4;
        }
        if (var6 < var10) {
            var10 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var2 == var8) {
                var12 = (var4 - var6) / (var8 - var10);
            } else if (var4 == var8) {
                var12 = (var6 - var2) / (var8 - var10) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var10) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        if (arg1 != -996128155) {
            method1009((byte) 49, 37);
        }
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 > 243) {
            var22 >>= 0x4;
        } else if (var21 > 217) {
            var22 >>= 0x3;
        } else if (var21 > 192) {
            var22 >>= 0x2;
        } else if (var21 > 179) {
            var22 >>= 0x1;
        }
        return (var20 >> 2 << 10) - (-(var22 >> 5 << 7) - (var21 >> 1));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILck;)Z", line = 222)
    public static final boolean method1012(int arg0, class119 arg1) {
        field2506++;
        int var2 = -69 % ((71 - arg0) / 34);
        return class203.method1287(16711680, arg1.method776((byte) -102), 0, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V", line = 234)
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class32 var5 = (class32) class55.field877.method995(arg2 + 1836596934); var5 != null; var5 = (class32) class55.field877.method996(0)) {
            class140.method928(arg1, arg4, var5, arg3, arg0, (byte) 108);
        }
        for (class32 var6 = (class32) class95.field1461.method995(arg2 + 1836596934); var6 != null; var6 = (class32) class95.field1461.method996(0)) {
            byte var7 = 1;
            if (var6.field467.field4976 == var6.field467.field4948) {
                var7 = 0;
            } else if (var6.field467.field4958 == var6.field467.field4948) {
                var7 = 2;
            }
            if (var6.field466 != var7) {
                int var8 = class216.method1370(-1, var6.field467);
                if (var6.field450 != var8) {
                    if (var6.field448 != null) {
                        class230.field3721.method1421(var6.field448);
                        var6.field448 = null;
                    }
                    var6.field450 = var8;
                }
                var6.field466 = var7;
            }
            var6.field458 = var6.field467.field4956 * 64 + var6.field467.field4949;
            var6.field455 = var6.field467.field4991;
            var6.field454 = var6.field467.field4949;
            var6.field457 = var6.field467.field4956 * 64 + var6.field467.field4991;
            class140.method928(arg1, arg4, var6, arg3, arg0, (byte) 108);
        }
        field2511++;
        for (class32 var9 = (class32) class272.field4469.method1325(-50); var9 != null; var9 = (class32) class272.field4469.method1332(-76)) {
            byte var10 = 1;
            if (var9.field472.field4976 == var9.field472.field4948) {
                var10 = 0;
            } else if (var9.field472.field4958 == var9.field472.field4948) {
                var10 = 2;
            }
            if (var9.field466 != var10) {
                int var11 = class84.method568(103, var9.field472);
                if (var9.field450 != var11) {
                    if (var9.field448 != null) {
                        class230.field3721.method1421(var9.field448);
                        var9.field448 = null;
                    }
                    var9.field450 = var11;
                }
                var9.field466 = var10;
            }
            var9.field458 = var9.field472.field4956 * 64 + var9.field472.field4949;
            var9.field455 = var9.field472.field4991;
            var9.field457 = var9.field472.field4956 * 64 + var9.field472.field4991;
            var9.field454 = var9.field472.field4949;
            class140.method928(arg1, arg4, var9, arg3, arg0, (byte) 108);
        }
        if (arg2 != 2) {
            method1013(-73, -80, -11, -90, -87);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 342)
    public static void method1014(byte arg0) {
        field2507 = (int[][][]) null;
        field2513 = null;
        field2509 = null;
        field2522 = null;
        int var1 = -80 % ((arg0 + 16) / 54);
    }
}
