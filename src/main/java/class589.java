import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class589 extends class426 {

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    public static int field8535 = 765;

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "Lqf;")
    public static class632 field8536 = new class632();

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "Ltda;")
    public class589 field8531;

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "Ltda;")
    public class589 field8537;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "Ljn;")
    public static class668 field8530;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIBII[BI)Z", line = 3)
    public static final boolean method3414(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field8541++;
        int var7 = arg0 % arg1;
        int var8 = 47 % ((arg2 + 71) / 44);
        int var9;
        if (var7 == 0) {
            var9 = 0;
        } else {
            var9 = arg1 - var7;
        }
        int var10 = -((arg6 + arg1 - 1) / arg1);
        int var11 = -((arg0 - (1 - arg1)) / arg1);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg5[arg4] == 0) {
                    return true;
                }
                arg4 += arg1;
            }
            int var14 = arg4 - var9;
            if (arg5[var14 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V", line = 55)
    public static final void method3415(byte arg0) {
        field8534++;
        if (class114.field1485 == 7) {
            class168.method1061((byte) 46, false);
            return;
        }
        class312.field4120 = class489.field6835;
        if (arg0 == 73) {
            class489.field6835 = null;
            class245.method1487(13, -21316);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method3416(int arg0, int arg1, int arg2, int arg3) {
        field8538++;
        if (class155.field1899 == null) {
            return 0;
        } else if (arg1 >= -9) {
            return -15;
        } else {
            int var4 = arg0 >> 9;
            int var5 = arg3 >> 9;
            if (var4 < 0 || var5 < 0 || var4 > class473.field6604 - 1 || (class205.field2465 - 1) < var5) {
                return 0;
            }
            int var6 = arg2;
            if (arg2 < 3 && (class73.field1104[1][var4][var5] & 0x2) != 0) {
                var6 = arg2 + 1;
            }
            return class155.field1899[var6].method428(true, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lmt;IIILjn;ZI)V", line = 109)
    public static final void method3417(class364 arg0, int arg1, int arg2, int arg3, class668 arg4, boolean arg5, int arg6) {
        class521.method3088(arg1, 94, arg5, arg4, arg6, arg3);
        if (arg2 < 22) {
            method3414(92, 18, (byte) 101, -67, 118, null, -63);
        }
        field8539++;
        class548.field7959 = arg0;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLun;)V", line = 121)
    public static final void method3418(byte arg0, class389 arg1) {
        field8533++;
        int var2 = arg1.method2266((byte) 110);
        class702.field9918 = new class570[var2];
        if (arg0 >= -48) {
            field8530 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class702.field9918[var3] = new class570();
            class702.field9918[var3].field8335 = arg1.method2266((byte) 110);
            class702.field9918[var3].field8339 = arg1.method2257(11587);
        }
        class28.field615 = arg1.method2266((byte) 110);
        class31.field635 = arg1.method2266((byte) 110);
        class681.field9749 = arg1.method2266((byte) 110);
        class487.field6815 = new class404[class31.field635 + 1 - class28.field615];
        for (int var4 = 0; var4 < class681.field9749; var4++) {
            int var5 = arg1.method2266((byte) 110);
            class404 var6 = class487.field6815[var5] = new class404();
            var6.field7793 = arg1.method2229(255);
            var6.field7791 = arg1.method2255(255);
            var6.field5698 = class28.field615 + var5;
            var6.field5697 = arg1.method2257(11587);
            var6.field5703 = arg1.method2257(11587);
        }
        class263.field3627 = arg1.method2255(255);
        class659.field9373 = true;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BIIIIII)V", line = 173)
    public static final void method3419(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class466.field6491 = arg2;
        class129.field1647 = arg4;
        class59.field931 = arg1;
        if (arg0 <= -30) {
            class141.field1769 = arg3;
            class180.field2214 = arg5;
            field8529++;
            class188.field2296 = arg6;
        }
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)V", line = 189)
    public final void method3420(byte arg0) {
        field8528++;
        if (this.field8531 == null) {
            return;
        }
        this.field8531.field8537 = this.field8537;
        this.field8537.field8531 = this.field8531;
        if (arg0 <= -90) {
            this.field8537 = null;
            this.field8531 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 211)
    public static void method3421(int arg0) {
        if (arg0 != 27150) {
            method3419((byte) -94, -66, -55, -46, 12, -61, -22);
        }
        field8530 = null;
        field8536 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 222)
    public static final byte[] method3422(Object arg0, boolean arg1, boolean arg2) {
        field8532++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class447.method2641((byte) 106, var3) : var3;
        } else if (arg0 instanceof class312) {
            class312 var4 = (class312) arg0;
            return var4.method1809(arg1);
        } else {
            if (!arg1) {
                field8530 = null;
            }
            throw new IllegalArgumentException();
        }
    }
}
