import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class204 extends class197 {

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    private final int field3785;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    private final int field3775;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    private final int field3779;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    private final int field3783;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[Ldc;")
    public static class37[] field3784 = new class37[200];

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Loa;")
    public static class153 field3780 = new class153(4096);

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Ldc;")
    public static class37 field3789 = class185.method1233((byte) 86, " x ");

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "Ldc;")
    private static class37 field3792 = class185.method1233((byte) 86, "Create a free account");

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Ldc;")
    public static class37 field3791 = field3792;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Ldc;")
    public static class37 field3794 = class185.method1233((byte) 86, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Ldc;")
    public static class37 field3793 = class185.method1233((byte) 86, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(III)J")
    public static final long method1343(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field290; ++var4) {
                class94 var5 = var3.field289[var4];
                if ((var5.field1641 >> 29 & 3L) == 2L && var5.field1639 == arg1 && var5.field1645 == arg2) {
                    return var5.field1641;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)V")
    public final void method713(int arg0, int arg1, int arg2) {
        ++field3778;
        if (arg1 <= 31) {
            method1343(102, 104, -88);
        }
        int var4 = this.field3779 * arg0 >> 12;
        int var5 = this.field3783 * arg2 >> 12;
        int var6 = this.field3775 * arg0 >> 12;
        int var7 = this.field3785 * arg2 >> 12;
        class120.method824(var7, var4, var5, var6, super.field3681, (byte) 122);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static final void method1344(byte arg0) {
        ++field3787;
        try {
            if (~class105.field1820 == -2) {
                int var1 = class176.field3337.method765(0);
                if (var1 > 0 && class176.field3337.method779(-92)) {
                    int var2 = var1 - class17.field261;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class176.field3337.method788(2, var2);
                    return;
                }
                class176.field3337.method760((byte) 24);
                class176.field3337.method792(-86);
                class8.field86 = null;
                if (class197.field3690 != null) {
                    class105.field1820 = 2;
                } else {
                    class105.field1820 = 0;
                }
                class31.field615 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class176.field3337.method760((byte) 24);
            class31.field615 = null;
            class8.field86 = null;
            class105.field1820 = 0;
            class197.field3690 = null;
        }
        int var4 = 107 % ((arg0 - -74) / 46);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
    public static final int method1345(int arg0, int arg1) {
        if (arg0 != 0) {
            field3788 = 69;
        }
        ++field3786;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lmf;ZIIIIII)V")
    public static final void method1346(class136 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class189.field3451) {
            class20.field336 = 0;
        } else {
            class20.field336 = 32;
        }
        class189.field3451 = arg1;
        if (class20.field334 != 0) {
            if (arg2 <= arg4 && arg4 < arg2 + 16 && arg6 >= arg5 && ~arg6 > ~(arg5 - -16)) {
                arg0.field2593 -= 4;
                class210.method1395((byte) 29, arg0);
            } else if (~arg2 >= ~arg4 && ~arg4 > ~(arg2 + 16) && ~(arg3 + -16 + arg5) >= ~arg6 && arg3 + arg5 > arg6) {
                arg0.field2593 += 4;
                class210.method1395((byte) 29, arg0);
            } else if (-class20.field336 + arg2 <= arg4 && ~arg4 > ~(arg2 + 16 - -class20.field336) && ~(arg5 + 16) >= ~arg6 && ~(arg5 + -16 - -arg3) < ~arg6) {
                int var8 = (arg3 + -32) * arg3 / arg7;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = arg6 - arg5 + -(var8 / 2) + -16;
                int var10 = arg3 + -32 - var8;
                arg0.field2593 = (-arg3 + arg7) * var9 / var10;
                class210.method1395((byte) 29, arg0);
                class189.field3451 = true;
            }
        }
        ++field3781;
        if (class108.field1884 != 0) {
            int var11 = arg0.field2638;
            if (arg4 >= -var11 + arg2 && ~arg6 <= ~arg5 && ~(arg2 - -16) < ~arg4 && ~(arg3 + arg5) <= ~arg6) {
                arg0.field2593 += class108.field1884 * 45;
                class210.method1395((byte) 29, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        if (arg2 >= -101) {
            method1348(-59, -59, -20);
        }
        ++field3782;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3780 = null;
        field3784 = null;
        field3791 = null;
        if (arg0 <= -92) {
            field3792 = null;
            field3793 = null;
            field3789 = null;
            field3794 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(III)Lfc;")
    public static final class58 method1348(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        return var3 == null ? null : var3.field299;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V")
    public class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3785 = arg3;
        this.field3775 = arg0;
        this.field3779 = arg2;
        this.field3783 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public final void method715(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method1347(115);
        }
        ++field3776;
    }
}
