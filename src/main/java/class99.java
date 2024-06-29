import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class99 extends class62 {

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Leg;")
    public class37 field1533;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Leg;")
    private static class37 field1541 = class174.method1167("Please remove ", -115);

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "Leg;")
    public static class37 field1529 = field1541;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "[I")
    public static int[] field1540 = new int[256];

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Leg;")
    public static class37 field1532 = field1541;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Leg;")
    public static class37 field1534 = class174.method1167(" ", -89);

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Z")
    public static boolean field1538 = false;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Leg;")
    private static class37 field1546;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Leg;")
    public static class37 field1544;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Leg;")
    public static class37 field1545;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Ljl;")
    public static class101 field1542;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "[[B")
    public static byte[][] field1536;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[SII[Leg;)V")
    public static final void method640(int arg0, short[] arg1, int arg2, int arg3, class37[] arg4) {
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            class37 var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].method221((byte) -97, var7) < (var9 & 0x1)) {
                    class37 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method640(var6 - 1, arg1, 11, arg3, arg4);
            method640(arg0, arg1, arg2, var6 + 1, arg4);
        }
        field1537++;
        if (arg2 != 11) {
            field1545 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I")
    public static final int method641(int arg0, int arg1, int arg2) {
        if (arg1 != -750180895) {
            return 81;
        }
        field1535++;
        class100 var3 = (class100) class166.field2750.method992((byte) 125, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field1553.length > arg2) {
            return var3.field1553[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZI)V")
    public static final void method642(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        for (int var5 = 0; var5 < class216.field3723; var5++) {
            if ((class36.field524[var5] + class243.field4372[var5]) > arg1 && class36.field524[var5] < (arg1 + arg2) && arg0 < (class277.field4908[var5] + class13.field213[var5]) && class13.field213[var5] < (arg0 + arg4)) {
                class255.field4528[var5] = true;
            }
        }
        if (!arg3) {
            field1542 = null;
        }
        field1539++;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class99() {
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Leg;)V")
    public class99(class37 arg0) {
        this.field1533 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method643(int arg0, int arg1, int arg2, long arg3) {
        field1528++;
        int var5 = -124 % ((arg1 - 36) / 52);
        int var6 = ((int) arg3 & 0x7E658) >> 14;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        int var8 = (int) arg3 >> 20 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class133 var9 = class178.method1186(var7, 0);
            int var10;
            int var11;
            if (var8 == 0 || var8 == 2) {
                var11 = var9.field2272;
                var10 = var9.field2306;
            } else {
                var10 = var9.field2272;
                var11 = var9.field2306;
            }
            int var12 = var9.field2281;
            if (var8 != 0) {
                var12 = (var12 << var8 & 0xF) + (var12 >> 4 - var8);
            }
            class139.method980(0, true, arg2, var10, class82.field1285.field1780[0], 2, var12, var11, 0, true, class82.field1285.field1812[0], arg0);
        } else {
            class139.method980(var8, true, arg2, 0, class82.field1285.field1780[0], 2, 0, 0, var6 + 1, true, class82.field1285.field1812[0], arg0);
        }
        class200.field3396 = class110.field1837;
        class201.field3423 = 0;
        class51.field798 = class163.field2685;
        class217.field3734 = 2;
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    public static final void method644(int arg0, int arg1, int arg2, int arg3) {
        field1530++;
        class237 var4 = class47.method309(128, arg3, arg0);
        if (var4 != null && var4.field4166 != null) {
            class85 var5 = new class85();
            var5.field1346 = var4;
            var5.field1339 = var4.field4166;
            class274.method1841(var5, -124);
        }
        if (arg1 >= -121) {
            return;
        }
        class174.field2924 = true;
        class129.field2150 = arg3;
        class45.field709 = arg0;
        class274.field4807 = arg2;
        class121.method856(24665, var4);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method645(int arg0) {
        field1546 = null;
        field1529 = null;
        field1536 = null;
        field1542 = null;
        field1545 = null;
        field1540 = null;
        field1532 = null;
        field1541 = null;
        field1534 = null;
        field1544 = null;
        int var1 = -51 % ((7 - arg0) / 38);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1540[var0] = var1;
        }
        field1543 = 0;
        field1546 = class174.method1167("wave:", 79);
        field1544 = field1546;
        field1545 = field1546;
    }
}
