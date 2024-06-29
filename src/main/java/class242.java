import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class242 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
    public static int[] field4192 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lia;")
    public static class257 field4198 = class28.method234(87, "cookiehost");

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lfe;")
    public static class155 field4199 = null;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "J")
    public static long field4194 = 0L;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
    public static int[] field4193 = new int[2];

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lmb;")
    public static class178 field4195;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
    public static int[] field4196;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class105.field1947[arg0][var8][var14] == -class126.field2266) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class243.field4208[arg0][arg1][arg3] + arg5;
            if (!class175.method1188(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class175.method1188(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class175.method1188(var9, var11, var13)) {
                return false;
            } else if (class175.method1188(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class42.method332(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class175.method1188(var6 + 1, class243.field4208[arg0][arg1][arg3] + arg5, var7 + 1) && class175.method1188(var6 + 128 - 1, class243.field4208[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class175.method1188(var6 + 128 - 1, class243.field4208[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class175.method1188(var6 + 1, class243.field4208[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)I")
    public static final int method1588(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 == -180) {
            field4197++;
            return (arg0 >> 5 << 7) + (arg2 >> 2 << 10) + (arg3 >> 1);
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1589(int arg0) {
        field4195 = null;
        if (arg0 != 128) {
            field4195 = null;
        }
        field4196 = null;
        field4192 = null;
        field4193 = null;
        field4199 = null;
        field4198 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lpb;")
    public static final class154 method1590(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3012; var4++) {
            class154 var5 = var3.field3017[var4];
            if ((var5.field2702 >> 29 & 0x3L) == 2L && var5.field2693 == arg1 && var5.field2688 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
