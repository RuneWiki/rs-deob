import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class216 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[Ljava/lang/Object;")
    public Object[] field3079 = new Object[5000];

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[F")
    public float[] field3078 = new float[5000];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field3082 = 0;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public volatile int field3084 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[B")
    public byte[] field3080 = new byte[5000];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public volatile int field3076 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field3085 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lvq;")
    public static class24 field3081 = new class24(103, 3);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lbt;")
    public static class363 field3086 = new class363(8);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3087 = "";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lct;")
    public static class104 field3088;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)V", line = 3)
    public static final void method1489(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3077++;
        if (arg0 >= -89) {
            field3086 = null;
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class382.method2423(arg1 + arg2, class63.field838, 84, class9.field128);
        int var10 = class382.method2423(arg1 - arg2, class63.field838, 81, class9.field128);
        class381.method2419((byte) 92, arg4, var10, class323.field4774[arg3], var9);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class248.field3659 && var11 <= class146.field1978) {
                    int var13 = class382.method2423(arg1 + var5, class63.field838, 99, class9.field128);
                    int var14 = class382.method2423(arg1 - var5, class63.field838, 76, class9.field128);
                    if (var12 <= class146.field1978) {
                        class381.method2419((byte) 10, arg4, var14, class323.field4774[var12], var13);
                    }
                    if (var11 >= class248.field3659) {
                        class381.method2419((byte) 73, arg4, var14, class323.field4774[var11], var13);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class248.field3659 && var15 <= class146.field1978) {
                int var17 = class382.method2423(arg1 + var6, class63.field838, 89, class9.field128);
                int var18 = class382.method2423(arg1 - var6, class63.field838, 80, class9.field128);
                if (var16 <= class146.field1978) {
                    class381.method2419((byte) 23, arg4, var18, class323.field4774[var16], var17);
                }
                if (var15 >= class248.field3659) {
                    class381.method2419((byte) 36, arg4, var18, class323.field4774[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 81)
    public static void method1490(int arg0) {
        if (arg0 != -1) {
            method1491((class58) null, -94);
        }
        field3081 = null;
        field3086 = null;
        field3088 = null;
        field3087 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lva;I)V", line = 99)
    public static final void method1491(class58 arg0, int arg1) {
        int var2 = 29 % ((arg1 - 32) / 60);
        if (arg0 instanceof class26) {
            class26 var3 = (class26) arg0;
            if (var3.field369 != null) {
                class92.method623(class187.field2619.field4960 != var3.field4960, var3, true);
            }
        } else if (arg0 instanceof class380) {
            class380 var4 = (class380) arg0;
            class157.method1062(class187.field2619.field4960 != var4.field4960, var4, 124);
        }
        field3083++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 158)
    public static final void method1492(byte arg0, short[] arg1, String[] arg2) {
        if (arg0 > -111) {
            field3088 = null;
        }
        field3075++;
        class369.method2348(arg2.length - 1, 0, arg2, arg1, 2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Log;I)V")
    public abstract void method46(class369 arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Log;B)V")
    public abstract void method43(class369 arg0, byte arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public abstract void method38(int arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public abstract void method42(byte arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILog;)V")
    public abstract void method44(int arg0, class369 arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IFZILui;)V")
    public abstract void method45(int arg0, float arg1, boolean arg2, int arg3, class378 arg4);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
    public abstract void method37(int arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public abstract void method47(int arg0);
}
