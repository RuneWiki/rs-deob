import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class266 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Z")
    public static boolean field4303 = false;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "J")
    public static volatile long field4306 = 0L;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "J")
    public static long field4304;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public static boolean field4309;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1852(class294 arg0, int arg1) {
        field4307++;
        if (arg1 != 1) {
            field4306 = -11L;
        }
        class243.method1716(200000, arg0, -7);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class260.field4255[arg0][var8][var14] == -class200.field3209) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class220.field3533[arg0][arg1][arg3] + arg5;
            if (!class77.method565(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class77.method565(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class77.method565(var9, var11, var13)) {
                return false;
            } else if (class77.method565(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class5.method29(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class77.method565(var6 + 1, class220.field3533[arg0][arg1][arg3] + arg5, var7 + 1) && class77.method565(var6 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class77.method565(var6 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class77.method565(var6 + 1, class220.field3533[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZII)V")
    public static final void method1854(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4308++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -1;
        int var8 = class281.method1924(arg2, class211.field3386, class272.field4374, arg1 + arg4);
        int var9 = class281.method1924(arg2, class211.field3386, class272.field4374, arg1 - arg4);
        int var10 = -arg4;
        class177.method1330(class240.field3831[arg3], var9, arg0, 32232, var8);
        while (var5 < var6) {
            var7 += 2;
            var10 += var7;
            if (var10 > 0) {
                var6--;
                var10 -= var6 << 1;
                int var11 = arg3 + var6;
                int var12 = arg3 - var6;
                if (class207.field3328 <= var11 && class228.field3657 >= var12) {
                    int var13 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var5);
                    int var14 = class281.method1924(arg2, class211.field3386, class272.field4374, arg1 - var5);
                    if (class228.field3657 >= var11) {
                        class177.method1330(class240.field3831[var11], var14, arg0, 32232, var13);
                    }
                    if (class207.field3328 <= var12) {
                        class177.method1330(class240.field3831[var12], var14, arg0, 32232, var13);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class207.field3328 <= var16 && class228.field3657 >= var15) {
                int var17 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var6);
                int var18 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var6);
                if (class228.field3657 >= var16) {
                    class177.method1330(class240.field3831[var16], var18, arg0, 32232, var17);
                }
                if (var15 >= class207.field3328) {
                    class177.method1330(class240.field3831[var15], var18, arg0, 32232, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1855(byte arg0) {
        field4305 = null;
        int var1 = 104 / ((arg0 - 15) / 60);
    }
}
