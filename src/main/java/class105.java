import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class105 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1820 = 0;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Ldc;")
    public static class37 field1826 = class185.method1233((byte) 86, "::");

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Ldc;")
    private static class37 field1831 = class185.method1233((byte) 86, "OFF");

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Ldc;")
    public static class37 field1819 = field1831;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "J")
    public long field1823;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lia;")
    public class88 field1814;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lia;")
    public class88 field1816;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lia;")
    public class88 field1830;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Ljb;")
    public static class99 field1824;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[Ldc;")
    public static class37[] field1825;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBIII)V")
    public static final void method681(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class29.method242(arg4 + arg5, (byte) -30, arg0, class11.field156[arg1], arg5 - arg4);
        field1822++;
        if (arg2 != 58) {
            field1827 = -26;
        }
        int var6 = arg3;
        int var7 = arg4 * arg4;
        int var8 = 0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = var7 << 1;
        int var13 = var9 << 2;
        int var14 = var9 - (var11 - 1) * var12;
        int var15 = (1 - var11) * var7 + var10;
        int var16 = ((arg3 << 1) - 3) * var12;
        int var17 = var7 << 2;
        int var18 = ((var8 << 1) + 3) * var10;
        int var19 = (arg3 - 1) * var17;
        int var20 = (var8 + 1) * var13;
        while (var6 > 0) {
            var6--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var18;
                    var14 += var20;
                    var20 += var13;
                    var18 += var13;
                    var8++;
                }
            }
            int var21 = arg1 - var6;
            int var22 = arg1 + var6;
            if (var14 < 0) {
                var14 += var20;
                var20 += var13;
                var15 += var18;
                var8++;
                var18 += var13;
            }
            var15 += -var19;
            var19 -= var17;
            var14 += -var16;
            int var23 = arg5 - var8;
            var16 -= var17;
            int var24 = arg5 + var8;
            class29.method242(var24, (byte) -30, arg0, class11.field156[var21], var23);
            class29.method242(var24, (byte) -30, arg0, class11.field156[var22], var23);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([BIII)Ldc;")
    public static final class37 method682(byte[] arg0, int arg1, int arg2, int arg3) {
        field1828++;
        class37 var4 = new class37();
        var4.field743 = new byte[arg2];
        var4.field733 = arg1;
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field743[var4.field733++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method683(byte arg0) {
        field1831 = null;
        field1826 = null;
        if (arg0 != 39) {
            method684((byte) 23, null);
        }
        field1819 = null;
        field1825 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLmf;)V")
    public static final void method684(byte arg0, class136 arg1) {
        field1829++;
        int var2 = arg1.field2659;
        if (var2 == 324) {
            if (class11.field146 == -1) {
                class11.field146 = arg1.field2582;
                class156.field2969 = arg1.field2599;
            }
            if (class183.field3376.field2059) {
                arg1.field2582 = class11.field146;
            } else {
                arg1.field2582 = class156.field2969;
            }
            return;
        }
        if (arg0 < 14) {
            method681(105, 85, (byte) -109, 124, 48, 3);
        }
        if (var2 == 325) {
            if (class11.field146 == -1) {
                class11.field146 = arg1.field2582;
                class156.field2969 = arg1.field2599;
            }
            if (class183.field3376.field2059) {
                arg1.field2582 = class156.field2969;
            } else {
                arg1.field2582 = class11.field146;
            }
        } else if (var2 == 327) {
            arg1.field2617 = 150;
            arg1.field2620 = (int) (Math.sin((double) class203.field3758 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2601 = -1;
            arg1.field2621 = 5;
        } else if (var2 == 328) {
            if (class238.field4382.field2187 == null) {
                arg1.field2601 = 0;
            } else {
                arg1.field2617 = 150;
                arg1.field2620 = (int) (Math.sin((double) class203.field3758 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2621 = 5;
                arg1.field2601 = ((int) class238.field4382.field2187.method347(-48) << 11) + 2047;
                arg1.field2516 = class238.field4382.field3465;
                arg1.field2610 = class238.field4382.field3473;
            }
        }
    }
}
