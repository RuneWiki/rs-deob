import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class46 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field817 = 100;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lub;")
    private static class227 field825 = class257.method1749("RuneScape is loading )2 please wait)3)3)3", 17263);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lub;")
    public static class227 field819 = field825;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lub;")
    public static class227 field828 = class257.method1749("<col=c0ff00>", 17263);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lub;")
    public static class227 field826 = class257.method1749("huffman", 17263);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field826 = null;
        if (arg0 >= -100) {
            method257(23, (byte) -67, -50, 110);
        }
        field828 = null;
        field825 = null;
        field819 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBII)V")
    public static final void method256(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field827++;
        class246.method1644(arg5, class59.field1094[arg1], arg2 + arg4, -arg4 + arg2, 1);
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var10 - ((var12 - 1) * var9);
        int var15 = var10 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var8 << 2;
        int var18 = (var6 + 1) * var15;
        int var19 = ((arg0 << 1) - 3) * var9;
        int var20 = (arg0 - 1) * var17;
        if (arg3 < 116) {
            return;
        }
        while (var7 > 0) {
            var7--;
            int var21 = arg1 - var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var16;
                    var16 += var15;
                    var14 += var18;
                    var18 += var15;
                    var6++;
                }
            }
            if (var14 < 0) {
                var6++;
                var13 += var16;
                var16 += var15;
                var14 += var18;
                var18 += var15;
            }
            var13 += -var20;
            var20 -= var17;
            int var22 = arg2 + var6;
            int var23 = arg1 + var7;
            var14 += -var19;
            var19 -= var17;
            int var24 = arg2 - var6;
            class246.method1644(arg5, class59.field1094[var21], var22, var24, 1);
            class246.method1644(arg5, class59.field1094[var23], var22, var24, 1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBII)I")
    public static final int method257(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 11) {
            method255((byte) -8);
        }
        field814++;
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + (arg0 >> 2 << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public abstract void method258(int arg0, int arg1);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public abstract void method259(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method260(int arg0) {
        field821++;
        class254.field4457.method1728(true);
        int var1 = -59 / ((arg0 - 57) / 35);
        class27.field438.method1728(true);
        class97.field1704.method1728(true);
        class13.field249.method1728(true);
    }
}
