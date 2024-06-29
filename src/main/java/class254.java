import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class254 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4032 = -1;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4033 = 0;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4035 = 1;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "F")
    public static float field4038;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Z")
    public static boolean field4029;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[[[I")
    public static int[][][] field4030;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1790(int arg0) {
        field4036++;
        int var1 = class255.field4041 * 128 + 64;
        int var2 = class277.field4378 * 128 + 64;
        if (arg0 != 1) {
            return;
        }
        int var3 = class227.method1653(var1, var2, -12282, class148.field2209) - class91.field1396;
        if (class62.field815 < 100) {
            if (class74.field983 < var1) {
                class74.field983 += (var1 - class74.field983) * class62.field815 / 1000 + class240.field3800;
                if (var1 < class74.field983) {
                    class74.field983 = var1;
                }
            }
            if (var3 > class161.field2644) {
                class161.field2644 += class240.field3800 + ((var3 - class161.field2644) * class62.field815 / 1000);
                if (var3 < class161.field2644) {
                    class161.field2644 = var3;
                }
            }
            if (class74.field983 > var1) {
                class74.field983 -= (class74.field983 - var1) * class62.field815 / 1000 + class240.field3800;
                if (class74.field983 < var1) {
                    class74.field983 = var1;
                }
            }
            if (var2 > class27.field388) {
                class27.field388 += (var2 - class27.field388) * class62.field815 / 1000 + class240.field3800;
                if (class27.field388 > var2) {
                    class27.field388 = var2;
                }
            }
            if (class27.field388 > var2) {
                class27.field388 -= (class27.field388 - var2) * class62.field815 / 1000 + class240.field3800;
                if (var2 > class27.field388) {
                    class27.field388 = var2;
                }
            }
            if (class161.field2644 > var3) {
                class161.field2644 -= (class161.field2644 - var3) * class62.field815 / 1000 + class240.field3800;
                if (var3 > class161.field2644) {
                    class161.field2644 = var3;
                }
            }
        } else {
            class27.field388 = class277.field4378 * 128 + 64;
            class74.field983 = class255.field4041 * 128 + 64;
            class161.field2644 = class227.method1653(class74.field983, class27.field388, -12282, class148.field2209) - class91.field1396;
        }
        int var4 = class113.field1691 * 128 + 64;
        int var5 = class198.field3258 * 128 + 64;
        int var6 = class227.method1653(var5, var4, -12282, class148.field2209) - class222.field3535;
        int var7 = var5 - class74.field983;
        int var8 = var6 - class161.field2644;
        int var9 = var4 - class27.field388;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class185.field2971;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class281.field4425 < var11) {
            class281.field4425 += (var11 - class281.field4425) * class93.field1442 / 1000 + class286.field4522;
            if (class281.field4425 > var11) {
                class281.field4425 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class185.field2971 += class93.field1442 * var13 / 1000 + class286.field4522;
            class185.field2971 &= 0x7FF;
        }
        if (var13 < 0) {
            class185.field2971 -= -var13 * class93.field1442 / 1000 + class286.field4522;
            class185.field2971 &= 0x7FF;
        }
        int var14 = var12 - class185.field2971;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class185.field2971 = var12;
        }
        if (class281.field4425 > var11) {
            class281.field4425 -= (class281.field4425 - var11) * class93.field1442 / 1000 + class286.field4522;
            if (var11 > class281.field4425) {
                class281.field4425 = var11;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z", line = 163)
    public static final boolean method1791(int arg0, int arg1, int arg2, int arg3) {
        if (class296.method2065(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class52.method354(var4 + 1, class84.field1282[arg0][arg1][arg2] + arg3, var5 + 1) && class52.method354(var4 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class52.method354(var4 + 128 - 1, class84.field1282[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class52.method354(var4 + 1, class84.field1282[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 178)
    public static void method1792(byte arg0) {
        if (arg0 == 58) {
            field4030 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public abstract void method853(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public abstract void method854(int arg0, int arg1);
}
