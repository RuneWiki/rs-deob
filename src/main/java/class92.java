import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class92 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljd;")
    public static class85 field1689 = class221.method1499("Benutzen", (byte) -126);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lge;")
    public static class68 field1696;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        if (arg0 != -116) {
            field1689 = null;
        }
        field1696 = null;
        field1689 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method668(int arg0) {
        field1691++;
        class18.field255.method1270((byte) 107);
        if (arg0 != -32674) {
            method671((class68) null, (byte) 117);
        }
        class132.field2303.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
    public static final void method669(int arg0, byte arg1, int arg2) {
        field1692++;
        class101 var3 = class132.method883(arg0, (byte) -127);
        int var4 = var3.field1803;
        int var5 = var3.field1800;
        int var6 = var3.field1798;
        int var7 = class27.field417[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class208.method1426(class260.field4599[var4] & ~var8 | var8 & arg2 << var5, 1266607942, var4);
        if (arg1 <= 117) {
            method667((byte) -23);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1688++;
        if (arg7 < 128 || arg6 < 128 || arg7 > 13056 || arg6 > 13056) {
            class47.field832 = -1;
            class71.field1324 = -1;
            return;
        }
        if (arg3 != 1) {
            method667((byte) -10);
        }
        int var8 = class246.method1660(arg3 ^ 0x24023586, arg7, class116.field2066, arg6) - arg0;
        int var9 = arg6 - class272.field4809;
        int var10 = var8 - class231.field3987;
        int var11 = arg7 - class267.field4762;
        int var12 = class173.field2984[class252.field4347];
        int var13 = class173.field2995[class252.field4347];
        int var14 = class173.field2995[class35.field547];
        int var15 = class173.field2984[class35.field547];
        int var16 = var9 * var15 + var11 * var14 >> 16;
        int var17 = var9 * var14 - (var11 * var15) >> 16;
        int var19 = var10 * var13 - (var12 * var17) >> 16;
        int var20 = var10 * var12 + var13 * var17 >> 16;
        if (var20 >= 50) {
            class71.field1324 = (var16 << 9) / var20 + arg5;
            class47.field832 = (var19 << 9) / var20 + arg4;
        } else {
            class47.field832 = -1;
            class71.field1324 = -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lge;B)V")
    public static final void method671(class68 arg0, byte arg1) {
        field1690++;
        if (arg1 >= -14) {
            method668(69);
        }
        class152.field2603 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILik;)Lfi;")
    public static final class107 method672(int arg0, class247 arg1) {
        if (arg0 != 238) {
            field1696 = null;
        }
        field1693++;
        return new class107(arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1677(true), arg1.method1691(19388), arg1.method1691(19388), arg1.method1711((byte) -67));
    }
}
