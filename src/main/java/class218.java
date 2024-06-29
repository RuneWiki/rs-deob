import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class218 extends class145 {

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    private int field2990 = 1;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field2995 = 1;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    private int field2996 = 204;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Z")
    public static boolean field2991 = false;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Lig;")
    public static class206 field2994 = new class206(2, 12);

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILrt;)V", line = 6)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2996 = arg2.method1220(118);
                }
            } else {
                this.field2995 = arg2.method1177(255);
            }
        } else {
            this.field2990 = arg2.method1177(255);
        }
        if (arg1 >= -67) {
            method1433((class270) null, -62, (byte[][]) null);
        }
        ++field2989;
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)V", line = 50)
    public static void method1431(int arg0) {
        field2994 = null;
        if (arg0 != 4) {
            method1431(32);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 78)
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z", line = 65)
    public static final boolean method1432(int arg0, int arg1, int arg2, int arg3) {
        if (!class571.method3315(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class465.field6917;
            int var5 = arg2 << class465.field6917;
            return class237.method1590(var4 + 1, class435.field6449[arg0].method259(arg1, arg2) + arg3, var5 + 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1 + 1, arg2) + arg3, var5 + 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1 + 1, arg2 + 1) + arg3, class193.field2559 + var5 - 1) && class237.method1590(var4 + 1, class435.field6449[arg0].method259(arg1, arg2 + 1) + arg3, class193.field2559 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[I", line = 86)
    public final int[] method27(boolean arg0, int arg1) {
        ++field2992;
        if (arg0) {
            field2991 = true;
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            for (int var4 = 0; class647.field9368 > var4; ++var4) {
                int var5 = class601.field8779[var4];
                int var6 = class573.field8270[arg1];
                int var7 = this.field2990 * var5 >> 12;
                int var8 = this.field2995 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2990) * this.field2990;
                int var10 = var6 % (4096 / this.field2995) * this.field2995;
                if (~var10 > ~this.field2996) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field2996) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field2996) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfda;I[[B)V", line = 194)
    public static final void method1433(class270 arg0, int arg1, byte[][] arg2) {
        ++field2993;
        int var3 = class290.field4014.length;
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class170.field2090[var4] >> 8) * 64 + -class287.field3980;
                int var7 = (class170.field2090[var4] & 255) * 64 - class250.field3549;
                class453.method2798((byte) -66);
                arg0.method1766(class413.field6264, 50, class14.field120, var6, var5, var7);
            }
        }
        if (arg1 != -28946) {
            method1432(-90, -63, 49, 37);
        }
    }
}
