import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class432 extends class540 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "[S")
    public static short[] field6153 = new short[256];

    @OriginalMember(owner = "client!za", name = "i", descriptor = "Z")
    public static boolean field6151 = true;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(JIII)V", line = 6)
    public static final void method2595(long arg0, int arg1, int arg2, int arg3) {
        field6154++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (arg2 <= 79) {
            field6153 = null;
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class553.method3214(0, arg3, 14, var6, true, var5, 0, 0, arg1);
            return;
        }
        class322 var8 = class496.field7061.method319(-1, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field4782;
            var10 = var8.field4801;
        } else {
            var9 = var8.field4801;
            var10 = var8.field4782;
        }
        int var11 = var8.field4798;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class553.method3214(var9, arg3, 14, 0, true, 0, var11, var10, arg1);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 60)
    public static void method2596(int arg0) {
        field6153 = null;
        if (arg0 != -5287) {
            field6151 = true;
        }
    }
}
