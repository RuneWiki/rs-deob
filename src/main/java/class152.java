import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 extends class254 {

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2202 = "wave:";

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2203 = "white:";

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "[I")
    public static int[] field2198 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "[Z")
    public static boolean[] field2194 = new boolean[200];

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "J")
    public static long field2195;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lve;")
    public static class233 field2188;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Lve;")
    public static class233 field2200;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Lve;")
    public static class233 field2205;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "Llj;")
    public static class41 field2201;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
    public static int[] field2193;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "[[B")
    public static byte[][] field2199;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(III)Z")
    public final boolean method1029(int arg0, int arg1, int arg2) {
        field2196++;
        if (arg2 != -4) {
            method1030(-59, -65, 100, 36, -2, -25, 117, 22);
        }
        return arg0 >= this.field2197 && this.field2187 >= arg0 && arg1 >= this.field2190 && this.field2192 >= arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2206++;
        if (arg3 != 262143 || arg1 < 0 || arg4 < 0 || arg1 >= 103 || arg4 >= 103) {
            return;
        }
        if (arg2 == 0) {
            class288 var8 = class91.method615(arg0, arg1, arg4);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field4555 >>> 32);
                if (arg6 == 2) {
                    var8.field4557 = new class26(var9, 2, arg7 + 4, arg0, arg1, arg4, arg5, false, var8.field4557);
                    var8.field4553 = new class26(var9, 2, arg7 + 1 & 0x3, arg0, arg1, arg4, arg5, false, var8.field4553);
                } else {
                    var8.field4557 = new class26(var9, arg6, arg7, arg0, arg1, arg4, arg5, false, var8.field4557);
                }
            }
        }
        if (arg2 == 1) {
            class264 var10 = class246.method1612(arg0, arg1, arg4);
            if (var10 != null) {
                int var11 = (int) (var10.field3979 >>> 32) & Integer.MAX_VALUE;
                if (arg6 == 4 || arg6 == 5) {
                    var10.field3974 = new class26(var11, 4, arg7, arg0, arg1, arg4, arg5, false, var10.field3974);
                } else if (arg6 == 6) {
                    var10.field3974 = new class26(var11, 4, arg7 + 4, arg0, arg1, arg4, arg5, false, var10.field3974);
                } else if (arg6 == 7) {
                    var10.field3974 = new class26(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg1, arg4, arg5, false, var10.field3974);
                } else if (arg6 == 8) {
                    var10.field3974 = new class26(var11, 4, arg7 + 4, arg0, arg1, arg4, arg5, false, var10.field3974);
                    var10.field3970 = new class26(var11, 4, (arg7 + 2 & 0x3) + 4, arg0, arg1, arg4, arg5, false, var10.field3970);
                }
            }
        }
        if (arg2 == 2) {
            if (arg6 == 11) {
                arg6 = 10;
            }
            class162 var12 = class33.method232(arg0, arg1, arg4);
            if (var12 != null) {
                var12.field2348 = new class26(Integer.MAX_VALUE & (int) (var12.field2350 >>> 32), arg6, arg7, arg0, arg1, arg4, arg5, false, var12.field2348);
            }
        }
        if (arg2 != 3) {
            return;
        }
        class109 var13 = class113.method731(arg0, arg1, arg4);
        if (var13 != null) {
            var13.field1569 = new class26((int) (var13.field1578 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg0, arg1, arg4, arg5, false, var13.field1569);
            return;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Lnd;")
    public static final class279 method1031(int arg0, byte arg1) {
        field2204++;
        class279 var2 = (class279) class240.field3602.method263((byte) 113, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -4) {
            method1032(false);
        }
        byte[] var3 = class100.field1496.method1538(1, arg0, (byte) 85);
        class279 var4 = new class279();
        if (var3 != null) {
            var4.method1876(new class114(var3), arg0, (byte) -84);
        }
        class240.field3602.method255((long) arg0, var4, (byte) -126);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIII)V")
    public class152(int arg0, int arg1, int arg2, int arg3) {
        this.field2197 = arg0;
        this.field2187 = arg2;
        this.field2192 = arg3;
        this.field2190 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
    public static void method1032(boolean arg0) {
        field2202 = null;
        field2193 = null;
        field2205 = null;
        field2203 = null;
        field2201 = null;
        if (arg0) {
            return;
        }
        field2194 = null;
        field2188 = null;
        field2200 = null;
        field2198 = null;
        field2199 = null;
    }
}
