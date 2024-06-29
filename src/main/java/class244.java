import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class244 extends class281 {

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lqha;")
    public static class111 field3283 = new class111(0, -1);

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "F")
    public static float field3297;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Lml;")
    public class410 field3294;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Ljava/lang/String;")
    public String field3296;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "[I")
    public int[] field3293;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "[I")
    public int[] field3298;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "[J")
    public long[] field3289;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[Lee;")
    public class706[] field3286;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field3287;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Z")
    public static final boolean method1571(int arg0, int arg1, int arg2) {
        field3295++;
        return arg0 == 28361 ? class202.method1370(16, arg1, arg2) & class193.method1333((byte) -99, arg2, arg1) : false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;Laj;IZ)Lhca;")
    public static final class517 method1572(String arg0, class333 arg1, int arg2, boolean arg3) {
        field3284++;
        int var4 = arg1.method2092(arg0, false);
        if (var4 == -1) {
            return new class517(0);
        }
        int[] var5 = arg1.method2108(true, var4);
        class517 var6 = new class517(var5.length);
        int var7 = 0;
        int var8 = 0;
        if (arg2 > -48) {
            method1574(null, (byte) -69);
        }
        while (true) {
            while (var7 < var6.field7064) {
                class376 var9 = new class376(arg1.method2095(var5[var8++], var4, 1));
                int var10 = var9.method2384(26);
                int var11 = var9.method2359(-1);
                int var12 = var9.method2398(-1372747256);
                if (!arg3 && var12 == 1) {
                    var6.field7064--;
                } else {
                    var6.field7065[var7] = var10;
                    var6.field7066[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method1573(boolean arg0) {
        field3283 = null;
        if (!arg0) {
            field3297 = 1.3401884F;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Loba;B)I")
    public static final int method1574(class275 arg0, byte arg1) {
        field3299++;
        String var2 = class383.method2440(arg0, false);
        if (arg1 > -44) {
            field3297 = -0.084273525F;
        }
        int[] var3 = null;
        if (class403.method2514((byte) 6, arg0.field4080)) {
            var3 = class770.field10602.method2467(-23, (int) arg0.field4079).field4663;
        } else if (arg0.field4085 != -1) {
            var3 = class770.field10602.method2467(123, arg0.field4085).field4663;
        } else if (class18.method146(arg0.field4080, -13)) {
            class174 var6 = (class174) class234.field3169.method3953((long) ((int) arg0.field4079), 14);
            if (var6 != null) {
                class192 var7 = var6.field2336;
                class220 var8 = var7.field2577;
                if (var8.field2995 != null) {
                    var8 = var8.method1449(class382.field5602, -1);
                }
                if (var8 != null) {
                    var3 = var8.field2938;
                }
            }
        } else if (class33.method236(arg0.field4080, -1)) {
            Object var4 = null;
            class589 var5;
            if (arg0.field4080 == 1008) {
                var5 = class350.field5132.method3732((byte) 65, (int) arg0.field4079);
            } else {
                var5 = class350.field5132.method3732((byte) 88, (int) (arg0.field4079 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field7865 != null) {
                var5 = var5.method3290(1, class382.field5602);
            }
            if (var5 != null) {
                var3 = var5.field7850;
            }
        }
        if (var3 != null) {
            var2 = var2 + class94.method754((byte) 91, var3);
        }
        int var9 = class548.field7413.method1702(18700, class688.field9677, var2);
        if (arg0.field4074) {
            var9 += class337.field4884.method1107() + 4;
        }
        return var9;
    }
}
