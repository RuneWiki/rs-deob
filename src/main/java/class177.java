import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class177 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lqt;")
    public static class459 field2639 = new class459(14, 2);

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2640 = -1;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[BII)Z", line = 10)
    public static final boolean method1235(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field2637++;
        boolean var6 = true;
        if (arg5 != 0) {
            return false;
        }
        class519 var7 = new class519(arg3);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method3078(32767);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method3033(11790);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method3072((byte) -119) >> 2;
                    int var17 = var15 + arg4;
                    int var18 = arg1 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < (arg2 - 1) && var18 < arg0 - 1) {
                        class261 var19 = class277.field4139.method569((byte) 107, var8);
                        if (var16 != 22 || class220.field3371.field2577 || var19.field3872 != 0 || var19.field3883 == 1 || var19.field3871) {
                            var11 = true;
                            if (!var19.method1676(arg5 + 99)) {
                                class215.field3233++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method3033(arg5 ^ 0x2E0E);
                if (var12 == 0) {
                    break;
                }
                var7.method3072((byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 95)
    public static void method1236(int arg0) {
        if (arg0 <= -113) {
            field2639 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I", line = 113)
    public static final int method1237(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -77) {
            field2640 = 59;
        }
        field2638++;
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 1);
    }
}
