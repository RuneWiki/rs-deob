import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class102 {

    @OriginalMember(owner = "client!co", name = "f", descriptor = "[Lgm;")
    public static class106[] field1478 = new class106[14];

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "[S")
    public static short[] field1474;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)Z")
    public abstract boolean method180(byte arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILqa;IB)Z")
    public abstract boolean method171(int arg0, class208 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
    public static void method766(int arg0) {
        field1478 = null;
        field1474 = null;
        if (arg0 > -98) {
            field1474 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)Ldn;")
    public static final class442 method767(byte arg0) {
        if (arg0 > -27) {
            return null;
        }
        field1476++;
        try {
            return (class442) Class.forName("aj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILgba;I)Z")
    public static final boolean method768(int arg0, class574 arg1, int arg2) {
        field1475++;
        int var3 = arg1.method3417(2, (byte) -86);
        if (var3 == 0) {
            if (arg1.method3417(1, (byte) -86) != 0) {
                method768(arg0, arg1, 3);
            }
            int var4 = arg1.method3417(6, (byte) -86);
            int var5 = arg1.method3417(6, (byte) -86);
            boolean var6 = arg1.method3417(1, (byte) -86) == 1;
            if (var6) {
                class632.field9279[class580.field8538++] = arg0;
            }
            if (class293.field4036[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class115 var7 = class163.field2573[arg0];
            class373 var8 = class293.field4036[arg0] = new class373();
            var8.field1904 = arg0;
            if (class110.field1568[arg0] != null) {
                var8.method2229(-20966, class110.field1568[arg0]);
            }
            var8.method941(true, var7.field1618, (byte) 66);
            var8.field1923 = var7.field1616;
            int var9 = var7.field1622;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field5124 = var7.field1612;
            var8.field1948[0] = class432.field5787[arg0];
            var8.field8501 = (byte) var10;
            var8.method2231((var12 << 6) - (class38.field463 - var5), (var11 << 6) + var4 - class473.field6687, (byte) 62);
            var8.field5122 = false;
            class163.field2573[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg1.method3417(2, (byte) -86);
            int var14 = class163.field2573[arg0].field1622;
            class163.field2573[arg0].field1622 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg1.method3417(5, (byte) -86);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class163.field2573[arg0].field1622;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class163.field2573[arg0].field1622 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg1.method3417(18, (byte) -86);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class163.field2573[arg0].field1622;
            int var27 = (var26 >> 28) + var23 & arg2;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class163.field2573[arg0].field1622 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILqa;)V")
    public abstract void method194(int arg0, class208 arg1);

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
    public abstract void method179(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqa;I)Lpl;")
    public abstract class558 method189(class208 arg0, int arg1);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public static final void method769(int arg0, int arg1, int arg2) {
        if (arg2 != 6) {
            method770(24, 126, 119);
        }
        field1473++;
        class221 var3 = class65.method413(5, arg0, (byte) -101);
        var3.method1426((byte) -128);
        var3.field3214 = arg1;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(ILqa;)Lin;")
    public abstract class77 method181(int arg0, class208 arg1);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public abstract void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6);

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
    public static final void method770(int arg0, int arg1, int arg2) {
        if (class1.field3 == 1) {
            class348.method2115(class99.field1451, (byte) -116, arg2, arg1);
        } else if (class1.field3 == 2) {
            class311.method1898(arg2, arg1, (byte) 113);
        }
        field1479++;
        class1.field3 = 0;
        class99.field1451 = null;
        if (arg0 != -16156) {
            field1478 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
    public static final int method771(int arg0, int arg1, int arg2, int arg3) {
        field1477++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == arg1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }
}
