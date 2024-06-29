import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class129 {

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    public boolean field2257 = true;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[Lqk;")
    public static class207[] field2240 = new class207[200];

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lqk;")
    public static class207 field2243 = class24.method212(255, "name_icons");

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lqk;")
    public static class207 field2256 = class24.method212(255, "compass");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public static int[] field2246 = new int[32];

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2259 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lqk;")
    private static class207 field2248 = class24.method212(255, "Ok");

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lqk;")
    public static class207 field2260 = field2248;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Ldd;")
    public static class132 field2251 = new class132();

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
    public static int[] field2263 = new int[256];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lpk;[Ldg;I)V")
    public static final void method902(class99 arg0, class139[] arg1, int arg2) {
        field2252++;
        class58.field1069 = arg0;
        class280.field4920 = arg1;
        class195.field3435 = new boolean[class280.field4920.length];
        class157.field2786.method924(-30865);
        int var3 = class58.field1069.method711(112, class219.field3862);
        int[] var4 = class58.field1069.method699(var3, (byte) -2);
        for (int var5 = arg2; var5 < var4.length; var5++) {
            class157.field2786.method931(class107.method770(new class149(class58.field1069.method705(var3, var4[var5], -1)), 2), 113);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
    public static final void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg1;
        field2247++;
        if (var7 == 0) {
            if (var6 != 0) {
                class167.method1207(arg5, (byte) 47, arg1, arg4, arg2);
            }
        } else if (var6 == 0) {
            class182.method1288((byte) -115, arg1, arg4, arg3, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg4;
                int var10 = arg3;
                arg3 = arg5;
                arg4 = var9;
                arg5 = var10;
            }
            if (arg3 < arg1) {
                int var11 = arg4;
                int var12 = arg1;
                arg1 = arg3;
                arg3 = var12;
                arg4 = arg5;
                arg5 = var11;
            }
            int var13 = arg4;
            int var14 = arg5 - arg4;
            int var15 = arg3 - arg1;
            if (var14 < arg0) {
                var14 = -var14;
            }
            int var16 = arg4 >= arg5 ? -1 : 1;
            int var17 = -(var15 >> 1);
            if (var8) {
                for (int var19 = arg1; var19 <= arg3; var19++) {
                    class15.field238[var19][var13] = arg2;
                    var17 += var14;
                    if (var17 > 0) {
                        var17 -= var15;
                        var13 += var16;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg3; var18++) {
                    var17 += var14;
                    class15.field238[var13][var18] = arg2;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method904(byte arg0) {
        field2262++;
        if (arg0 <= 97) {
            field2248 = null;
        }
        if (class70.field1244 != null) {
            class247 var1 = class70.field1244;
            synchronized (class70.field1244) {
                class70.field1244 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method905(int arg0, Object arg1, boolean arg2) {
        field2254++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class225.method1591(-105, var3) : var3;
        } else if (arg1 instanceof class193) {
            class193 var4 = (class193) arg1;
            return var4.method813(0);
        } else if (arg0 == -17831) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lqk;")
    public static final class207 method906(int arg0, int arg1) {
        if (arg0 != -257) {
            field2261 = 124;
        }
        field2258++;
        return class105.method757(false, new class207[] { class262.method1815(arg1 >> 24 & 0xFF, (byte) 100), class137.field2362, class262.method1815((arg1 & 0xFF830B) >> 16, (byte) 89), class137.field2362, class262.method1815((arg1 & 0xFF94) >> 8, (byte) -101), class137.field2362, class262.method1815(arg1 & 0xFF, (byte) -126) });
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field2240 = null;
        if (arg0 > -121) {
            return;
        }
        field2260 = null;
        field2256 = null;
        field2248 = null;
        field2246 = null;
        field2251 = null;
        field2263 = null;
        field2243 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2250 = arg2;
        this.field2257 = arg6;
        this.field2245 = arg4;
        this.field2249 = arg3;
        this.field2242 = arg5;
        this.field2255 = arg1;
        this.field2244 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2263[var0] = var1;
        }
    }
}
