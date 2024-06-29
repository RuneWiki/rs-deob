import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class248 {

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3945 = 2;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1757(int arg0, int arg1) {
        field3942++;
        class80.field1201.method1625(arg1, (byte) 7);
        class89.field1362.method1625(arg1, (byte) 89);
        if (arg0 != 2) {
            field3944 = 123;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I", line = 18)
    public static final int method1758(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIZ)V", line = 35)
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var6 = 0;
        field3943++;
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        if (arg5) {
            method1757(-94, -11);
        }
        int var10 = var8 << 1;
        int var11 = arg4 << 1;
        int var12 = var9 - ((var11 - 1) * var10);
        int var13 = var9 << 1;
        int var14 = (1 - var11) * var8 + var13;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var13;
        int var18 = ((arg4 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var16;
        if (arg1 >= class233.field3721 && arg1 <= class235.field3735) {
            int var20 = class235.method1685(arg0 + arg2, class231.field3697, class224.field3575, 100);
            int var21 = class235.method1685(arg0 - arg2, class231.field3697, class224.field3575, 107);
            class245.method1738(48, class310.field4841[arg1], var20, var21, arg3);
        }
        int var22 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var6++;
                    var17 += var16;
                    var12 += var19;
                    var19 += var16;
                }
            }
            var7--;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (var12 < 0) {
                var6++;
                var14 += var17;
                var12 += var19;
                var17 += var16;
                var19 += var16;
            }
            var12 += -var18;
            if (var24 >= class233.field3721 && var23 <= class235.field3735) {
                int var25 = class235.method1685(arg0 + var6, class231.field3697, class224.field3575, 112);
                int var26 = class235.method1685(arg0 - var6, class231.field3697, class224.field3575, 120);
                if (class233.field3721 <= var23) {
                    class245.method1738(48, class310.field4841[var23], var25, var26, arg3);
                }
                if (var24 <= class235.field3735) {
                    class245.method1738(48, class310.field4841[var24], var25, var26, arg3);
                }
            }
            var14 += -var22;
            var22 -= var15;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 142)
    public static final int method1760(String arg0, boolean arg1) {
        field3946++;
        if (class193.field3167 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class193.field3167.field4901; var2++) {
            if (class271.method1938(arg0, class270.method1927("<br>", (byte) -106, " ", class193.field3167.field4911[var2]), 121)) {
                return var2;
            }
        }
        if (arg1) {
            field3944 = 32;
        }
        return -1;
    }
}
