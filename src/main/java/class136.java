import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class136 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lcc;")
    public static class209 field2554 = class95.method669(117, "Fps:");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[S")
    public static short[] field2552 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lcc;")
    public static class209[] field2558 = new class209[100];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "J")
    public static long field2555 = 0L;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static volatile int field2557 = 0;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lcc;")
    public static class209 field2560 = class95.method669(115, "Cache:");

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lha;")
    public static class30 field2561;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
    public static final int method943(byte arg0, int arg1) {
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        field2559++;
        int var3 = var2 | var2 >>> 2;
        int var4 = -83 / ((-arg0 - 47) / 62);
        int var5 = var3 | var3 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= arg1; var6++) {
            class176.method1215(arg2, arg4, class252.field4543[var6], arg3, (byte) 118);
        }
        if (arg5 != 552) {
            field2554 = null;
        }
        field2556++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILlk;)V")
    public static final void method945(int arg0, class81 arg1) {
        field2553++;
        if (arg1.field1516 == 0) {
            return;
        }
        if (~arg1.field1559 != arg0 && arg1.field1559 < 32768) {
            class163 var2 = class60.field1207[arg1.field1559];
            if (var2 != null) {
                int var3 = arg1.field1571 - var2.field1571;
                int var4 = arg1.field1534 - var2.field1534;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1570 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1559 >= 32768) {
            int var5 = arg1.field1559 - 32768;
            if (class174.field3179 == var5) {
                var5 = 2047;
            }
            class108 var6 = class103.field1993[var5];
            if (var6 != null) {
                int var7 = arg1.field1571 - var6.field1571;
                int var8 = arg1.field1534 - var6.field1534;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1570 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1553 != 0 || arg1.field1524 != 0) && (arg1.field1510 == 0 || arg1.field1554 > 0)) {
            int var9 = arg1.field1571 + arg1.method577((byte) 126) * 64 - ((-class174.field3178 + arg1.field1553 - class174.field3178) * 64) - 64;
            int var10 = arg1.field1534 + (arg1.method577((byte) -37) - 1) * 64 - ((-class245.field4444 + arg1.field1524 - class245.field4444) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field1570 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1553 = 0;
            arg1.field1524 = 0;
        }
        int var11 = arg1.field1570 - arg1.field1504 & 0x7FF;
        if (var11 == 0) {
            arg1.field1529 = 0;
            return;
        }
        arg1.field1529++;
        if (var11 <= 1024) {
            arg1.field1504 += arg1.field1516;
            boolean var12 = true;
            if (arg1.field1516 > var11 || var11 > 2048 - arg1.field1516) {
                var12 = false;
                arg1.field1504 = arg1.field1570;
            }
            if (arg1.field1551 == arg1.field1549 && (arg1.field1529 > 25 || var12)) {
                if (arg1.field1511 == -1) {
                    arg1.field1551 = arg1.field1561;
                } else {
                    arg1.field1551 = arg1.field1511;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field1504 -= arg1.field1516;
            if (var11 < arg1.field1516 || 2048 - arg1.field1516 < var11) {
                arg1.field1504 = arg1.field1570;
                var13 = false;
            }
            if (arg1.field1551 == arg1.field1549 && (arg1.field1529 > 25 || var13)) {
                if (arg1.field1569 == -1) {
                    arg1.field1551 = arg1.field1561;
                } else {
                    arg1.field1551 = arg1.field1569;
                }
            }
        }
        arg1.field1504 &= 0x7FF;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method946(boolean arg0) {
        field2560 = null;
        if (!arg0) {
            method943((byte) 0, 93);
        }
        field2554 = null;
        field2552 = null;
        field2561 = null;
        field2558 = null;
    }
}
