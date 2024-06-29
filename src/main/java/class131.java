import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class131 extends class331 {

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "[B")
    public byte[] field1590;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
    public static int[] field1588;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static void method810(int arg0) {
        if (arg0 <= 30) {
            field1588 = null;
        }
        field1588 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IFIZIIII)[I")
    public static final int[] method811(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1589++;
        int[] var8 = new int[arg6];
        class348 var9 = new class348();
        if (arg2 > -24) {
            return null;
        }
        var9.field4922 = arg7;
        var9.field4946 = arg4;
        var9.field4942 = arg0;
        var9.field4928 = (int) (arg1 * 4096.0F);
        var9.field4926 = arg3;
        var9.field4925 = arg5;
        var9.method188(1);
        class150.method911(1, -111, arg6);
        var9.method2230(var8, (byte) 124, 0);
        return var8;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3) {
        field1591++;
        if (arg1 == 0) {
            class156.field1912++;
            class62.field718.method2143(155, -2);
        }
        if (arg1 == 1) {
            class62.field718.method2143(234, -2);
            class245.field3468++;
        }
        class62.field718.method1588(arg2 ^ 0x80, arg3 + class41.field496);
        class62.field718.method1612(class114.field1403 + arg0, -17029);
        class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -113);
        class443.field6343 = arg3;
        if (arg2 != 0) {
            method814(-37, (byte) -80);
        }
        class360.field5136 = false;
        class33.field386 = arg0;
        class385.method2472((byte) 16);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
    public class131(byte[] arg0) {
        this.field1590 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ltq;Z)V")
    public static final void method813(class376 arg0, boolean arg1) {
        if (!arg1) {
            method813((class376) null, true);
        }
        field1587++;
        class268.field3810 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
    public static final void method814(int arg0, byte arg1) {
        field1593++;
        int var2 = class189.field2726 - class414.field5950;
        if (var2 >= 100) {
            class129.field1568 = 1;
            return;
        }
        int var3 = (int) class292.field4085;
        if (class186.field2707 >> 8 > var3) {
            var3 = class186.field2707 >> 8;
        }
        if (class442.field6335[4] && var3 < (class249.field3555[4] + 128)) {
            var3 = class249.field3555[4] + 128;
        }
        int var4 = (int) class441.field6333 + class150.field1854 & 0x3FFF;
        class338.method2175((byte) 41, var4, var3, arg0, class214.field3034, (var3 >> 3) * 3 + 600, class114.method709(class129.field1570, class384.field5422.field3284, 0, class384.field5422.field3269) + -50, class331.field4680);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class276.field3925 = (int) ((float) (class276.field3925 - class380.field5347) * var5 + (float) class380.field5347);
        class265.field3774 = (int) ((float) (class265.field3774 - class332.field4705) * var5 + (float) class332.field4705);
        if (arg1 != 19) {
            method810(94);
        }
        class334.field4730 = (int) ((float) (class334.field4730 - class352.field4976) * var5 + (float) class352.field4976);
        class138.field1722 = (int) ((float) (class138.field1722 - class45.field547) * var5 + (float) class45.field547);
        int var6 = class377.field5324 - class162.field2198;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class377.field5324 = (int) ((float) var6 * var5 + (float) class162.field2198);
        class377.field5324 &= 0x3FFF;
    }
}
