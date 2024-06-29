import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class333 {

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Ljo;")
    private class382 field5161 = new class382(256);

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lga;")
    private class243 field5160;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lvd;")
    private class258 field5157;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Ldp;")
    public static class347 field5162 = new class347("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
    public static boolean field5168 = false;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "Luv;")
    public static class2 field5167 = new class2(59, 6);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method2052(int arg0) {
        field5162 = null;
        int var1 = 90 / ((4 - arg0) / 48);
        field5167 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)Lud;")
    public final class94 method2053(boolean arg0, int arg1) {
        field5166++;
        if (arg0) {
            method2052(92);
        }
        Object var3 = this.field5161.method2288((long) arg1, 0);
        if (var3 != null) {
            return (class94) var3;
        } else if (this.field5160.method1482((byte) 116, arg1)) {
            class161 var4 = this.field5160.method1480(arg1, 14270);
            int var5 = var4.field2421 ? 64 : this.field5157.field3694;
            class94 var7;
            if (var4.field2416 && this.field5157.method124()) {
                float[] var6 = this.field5160.method1483(arg1, var5, 0.7F, var5, false, -373);
                var7 = new class94(this.field5157, 3553, 34842, var5, var5, var4.field2418 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field2407 && class309.method1928(false, var4.field2412)) {
                    var8 = 6407;
                    var9 = this.field5160.method1484(126, false, var5, 0.7F, arg1, var5);
                } else {
                    var8 = 6408;
                    var9 = this.field5160.method1481(false, 0.7F, 28907, arg1, var5, var5);
                }
                var7 = new class94(this.field5157, 3553, var8, var5, var5, var4.field2418 != 0, var9, false);
            }
            var7.method741(var4.field2402, var4.field2415, (byte) -123);
            this.field5161.method2290((long) arg1, var7, 126);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public final void method2054(byte arg0) {
        if (arg0 >= 9) {
            field5164++;
            this.field5161.method2293(false);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
    public static final void method2055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5165++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        class94.method740(class306.field4574[arg1], arg4 - arg0, arg0 + arg4, arg2, false);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class306.field4574[arg1 + var6];
                int[] var10 = class306.field4574[arg1 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class94.method740(var9, var12, var11, arg2, false);
                class94.method740(var10, var12, var11, arg2, false);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class306.field4574[arg1 + var5];
            int[] var16 = class306.field4574[arg1 - var5];
            class94.method740(var15, var14, var13, arg2, false);
            class94.method740(var16, var14, var13, arg2, false);
        }
        if (arg3 <= 10) {
            field5168 = false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
    public final void method2056(byte arg0) {
        this.field5161.method2294(5, true);
        field5158++;
        if (arg0 > -113) {
            this.method2054((byte) 100);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lvd;Lga;)V")
    public class333(class258 arg0, class243 arg1) {
        this.field5160 = arg1;
        this.field5157 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILgo;II)V")
    public static final void method2057(int arg0, class310 arg1, int arg2, int arg3) {
        if (class302.field4504) {
            class184 var4 = class242.field3379 == -1 ? null : class260.field3873.method2676(class242.field3379, (byte) -14);
            if (client.method3039(arg1).method2403((byte) -122) && (class20.field303 & 0x20) != 0 && (var4 == null || arg1.method1934(16711935, class242.field3379, var4.field2717) != var4.field2717)) {
                class74.field1033++;
                class393.method2363(arg1.field4675, class310.field4810, class112.field1718, false, 0, arg1.field4665, class203.field2970 + " -> " + arg1.field4738, arg1.field4643, 0L, true, 16);
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class278.method1738(55, var5, arg1);
                if (var9 != null) {
                    class270.field4011++;
                    class393.method2363(arg1.field4675, var9, class413.method2473(var5, arg1, -1), false, 0, arg1.field4665, arg1.field4738, arg1.field4643, (long) (var5 + 1), true, 1008);
                }
            }
            String var6 = class300.method1865(false, arg1);
            if (var6 != null) {
                class393.method2363(arg1.field4675, var6, arg1.field4691, false, 0, arg1.field4665, arg1.field4738, arg1.field4643, 0L, true, 17);
                class289.field4324++;
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class278.method1738(123, var7, arg1);
                if (var8 != null) {
                    class270.field4011++;
                    class393.method2363(arg1.field4675, var8, class413.method2473(var7, arg1, -1), false, 0, arg1.field4665, arg1.field4738, arg1.field4643, (long) (var7 + 1), true, 11);
                }
            }
            if (client.method3039(arg1).method2408(false)) {
                if (arg1.field4756 == null) {
                    class393.method2363(arg1.field4675, class258.field3517.method2103(class30.field430, (byte) 34), -1, false, arg0 - 1008, arg1.field4665, "", arg1.field4643, 0L, true, 22);
                } else {
                    class393.method2363(arg1.field4675, arg1.field4756, -1, false, arg0 ^ 0x3F0, arg1.field4665, "", arg1.field4643, 0L, true, 22);
                }
                class409.field6169++;
            }
        }
        field5163++;
        if (arg0 != 1008) {
            method2052(74);
        }
    }
}
