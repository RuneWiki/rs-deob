import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class111 extends class405 implements class106 {

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Lsk;")
    public class405 field1403;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lef;")
    public static class311 field1408 = new class311(11, -1);

    @OriginalMember(owner = "client!c", name = "G", descriptor = "F")
    public static float field1413 = 0.0F;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Lwf;")
    public static class79 field1414 = new class79(10, 6);

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lus;")
    public static class1 field1416 = new class1(41, 15);

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIILsk;)V")
    public class111(int arg0, int arg1, int arg2, class405 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field1403 = arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        field1407++;
        if (arg0 < 13) {
            this.method120(-95, (class313) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 > -40) {
            this.method116((byte) 13);
        }
        field1412++;
        return false;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        field1409++;
        if (arg0 >= -105) {
            field1413 = -0.14108948F;
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        if (arg0 != 0) {
            this.method116((byte) -128);
        }
        field1405++;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZI)V")
    public static final void method710(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (class342 var5 = (class342) class99.field1270.method2843(1123227612); var5 != null; var5 = (class342) class99.field1270.method2842(1673506446)) {
            class71.method417(var5, arg0, arg2, -30716, arg4, arg1);
        }
        field1400++;
        for (class342 var6 = (class342) class114.field1459.method2843(1123227612); var6 != null; var6 = (class342) class114.field1459.method2842(1673506446)) {
            byte var11 = 1;
            class332 var12 = var6.field4966.method924((byte) -32);
            if (var6.field4966.field2121) {
                var11 = 0;
            } else if (var6.field4966.field2105 == var12.field4815 || var6.field4966.field2105 == var12.field4794 || var6.field4966.field2105 == var12.field4831 || var6.field4966.field2105 == var12.field4788) {
                var11 = 2;
            } else if (var6.field4966.field2105 == var12.field4819 || var6.field4966.field2105 == var12.field4793 || var6.field4966.field2105 == var12.field4816 || var6.field4966.field2105 == var12.field4833) {
                var11 = 3;
            }
            if (var6.field4981 != var11) {
                int var13 = class491.method2877(-1, var6.field4966);
                if (var6.field4965 != var13) {
                    if (var6.field4984 != null) {
                        class59.field796.method2561(var6.field4984);
                        var6.field4984 = null;
                    }
                    var6.field4965 = var13;
                }
                var6.field4981 = var11;
            }
            var6.field4988 = var6.field4966.field4331;
            var6.field4987 = var6.field4966.field4331 + (var6.field4966.method918(false) * 64);
            var6.field4977 = var6.field4966.field4317;
            var6.field4973 = var6.field4966.field4317 + var6.field4966.method918(arg3) * 64;
            class71.method417(var6, arg0, arg2, -30716, arg4, arg1);
        }
        if (arg3) {
            field1417 = -40;
        }
        for (class342 var7 = (class342) class389.field5521.method2769((byte) 112); var7 != null; var7 = (class342) class389.field5521.method2768((byte) -88)) {
            byte var8 = 1;
            class332 var9 = var7.field4970.method924((byte) -32);
            if (var7.field4970.field2121) {
                var8 = 0;
            } else if (var7.field4970.field2105 == var9.field4815 || var7.field4970.field2105 == var9.field4794 || var7.field4970.field2105 == var9.field4831 || var7.field4970.field2105 == var9.field4788) {
                var8 = 2;
            } else if (var7.field4970.field2105 == var9.field4819 || var7.field4970.field2105 == var9.field4793 || var7.field4970.field2105 == var9.field4816 || var7.field4970.field2105 == var9.field4833) {
                var8 = 3;
            }
            if (var7.field4981 != var8) {
                int var10 = class437.method2574(var7.field4970, (byte) -110);
                if (var7.field4965 != var10) {
                    if (var7.field4984 != null) {
                        class59.field796.method2561(var7.field4984);
                        var7.field4984 = null;
                    }
                    var7.field4965 = var10;
                }
                var7.field4981 = var8;
            }
            var7.field4988 = var7.field4970.field4331;
            var7.field4987 = var7.field4970.field4331 + var7.field4970.method918(false) * 64;
            var7.field4977 = var7.field4970.field4317;
            var7.field4973 = var7.field4970.field4317 + var7.field4970.method918(false) * 64;
            class71.method417(var7, arg0, arg2, -30716, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public static final int method711(int arg0, int arg1) {
        field1394++;
        double var2 = (double) ((arg1 & 0xFFA546) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF54) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        int var12 = -26 / ((arg0 + 23) / 55);
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var17 < 0.5D) {
                var15 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var13 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var13 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var13 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + ((var21 & 0xFF) >> 2 << 10) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        if (arg0 >= -126) {
            method711(-17, -33);
        }
        field1401++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        field1406++;
        if (arg0 < 56) {
            this.method249(108);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        field1410++;
        return arg0 == 31249 ? 0 : 89;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        if (arg1 != -26920) {
            field1416 = null;
        }
        field1397++;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != -1) {
            this.method246(105);
        }
        field1404++;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1414 = null;
        field1416 = null;
        if (arg0 != 0) {
            method710(-102, 38, -52, true, -120);
        }
        field1408 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 <= 16) {
            return false;
        } else {
            field1396++;
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        field1395++;
        if (arg1 > -95) {
            this.method103((class313) null, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        field1402++;
        int var8 = 77 / ((20 - arg4) / 38);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        field1415++;
        return arg1 <= 70 ? null : null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        field1411++;
        if (arg0 != 12181) {
            this.method120(-91, (class313) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)V")
    public static final void method713(int arg0, long arg1) {
        field1398++;
        int var3 = -4 % ((-arg0 - 26) / 39);
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class364.method2248(arg1 - 1L, 32);
            class364.method2248(1L, 32);
        } else {
            class364.method2248(arg1, 32);
        }
    }
}
