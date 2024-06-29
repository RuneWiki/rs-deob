import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class289 extends class461 {

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "Ljn;")
    public static class134 field4261 = new class134(93, 7);

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[F")
    public static float[] field4263 = new float[16384];

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "[F")
    public static float[] field4262 = new float[16384];

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Lo;")
    public static class208 field4264;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "[J")
    public static long[] field4266;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Loq;")
    public class230 field4258;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Z")
    public boolean field4257;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[Lea;")
    public class21[] field4255;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[Loq;")
    public static class230[] field4265;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lsha;Lha;III)V")
    public static final void method1917(class115 arg0, class473 arg1, int arg2, int arg3, int arg4) {
        field4256++;
        byte var5 = 63;
        byte var6 = 7;
        for (int var7 = arg3; var7 >= 0; var7--) {
            int var8 = var5 & 0x7F | var7 & 0x3F << 10 | (var6 & 0x7) << 7;
            class691.method3920(true, false, -94557789);
            int var9 = class109.field1323[var8];
            class153.method1003(false, -2, true);
            arg1.method233(arg4, ((63 - var7) * arg0.field1517 >> 6) + arg2, arg0.field1560, (arg0.field1517 >> 6) + 1, var9, 0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1918(int arg0) {
        field4263 = null;
        field4265 = null;
        int var1 = -98 / ((arg0 + 42) / 38);
        field4261 = null;
        field4264 = null;
        field4262 = null;
        field4266 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1919(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4259++;
        int var8 = arg1 + arg7;
        int var9 = arg3 - arg1;
        if (arg2 != 76) {
            field4264 = null;
        }
        for (int var10 = arg7; var10 < var8; var10++) {
            class128.method883(arg0, arg5, arg4, class705.field9804[var10], 7);
        }
        int var11 = arg1 + arg5;
        for (int var12 = arg3; var12 > var9; var12--) {
            class128.method883(arg0, arg5, arg4, class705.field9804[var12], arg2 ^ 0x4B);
        }
        int var13 = arg4 - arg1;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class705.field9804[var14];
            class128.method883(arg0, arg5, var11, var15, 7);
            class128.method883(arg6, var11, var13, var15, 7);
            class128.method883(arg0, var13, arg4, var15, 7);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lpu;")
    public static final class598 method1920(int arg0, int arg1) {
        field4253++;
        return arg1 <= arg0 && arg0 < 100 ? class501.field6855[arg0] : null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4260++;
        int var7 = class436.method2621(arg5, class474.field6576, class727.field10060, arg3 ^ 0xFFFFE5E7);
        int var8 = class436.method2621(arg0, class474.field6576, class727.field10060, 512);
        int var9 = class436.method2621(arg6, class627.field8783, class177.field2236, 512);
        int var10 = class436.method2621(arg1, class627.field8783, class177.field2236, 512);
        int var11 = class436.method2621(arg4 + arg5, class474.field6576, class727.field10060, arg3 + 6681);
        int var12 = class436.method2621(arg0 - arg4, class474.field6576, class727.field10060, 512);
        for (int var13 = var7; var13 < var11; var13++) {
            class128.method883(arg2, var9, var10, class705.field9804[var13], 7);
        }
        if (arg3 != -6169) {
            return;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class128.method883(arg2, var9, var10, class705.field9804[var14], arg3 ^ 0xFFFFE7E0);
        }
        int var15 = class436.method2621(arg6 + arg4, class627.field8783, class177.field2236, 512);
        int var16 = class436.method2621(arg1 - arg4, class627.field8783, class177.field2236, 512);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class705.field9804[var17];
            class128.method883(arg2, var9, var15, var18, arg3 + 6176);
            class128.method883(arg2, var16, var10, var18, 7);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBILha;)Z")
    public final boolean method1922(int arg0, byte arg1, int arg2, class473 arg3) {
        if (arg1 != -122) {
            return true;
        }
        field4254++;
        int var5 = this.field4258.method564((byte) -90);
        if (this.field4255 != null) {
            for (int var6 = 0; var6 < this.field4255.length; var6++) {
                this.field4255[var6].field183 <<= var5;
                if (this.field4255[var6].method90(arg0, arg2) && this.field4258.method88(arg0, arg3, -31634, arg2)) {
                    this.field4255[var6].field183 >>= var5;
                    return true;
                }
                this.field4255[var6].field183 >>= var5;
            }
        }
        return false;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4262[var2] = (float) Math.sin((double) var2 * var0);
            field4263[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4264 = new class208(7, 0, 1, 1);
        field4266 = new long[32];
    }
}
