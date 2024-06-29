import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class130 extends class110 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[[I")
    public static int[][] field2553 = new int[104][104];

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
    public static int[] field2559 = new int[32];

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Leh;")
    public static class47 field2554 = class195.method1282((byte) -4, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field2575 = 0;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
    public static int[] field2580 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!od", name = "L", descriptor = "Leh;")
    private static class47 field2568 = class195.method1282((byte) -4, "wave2:");

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Leh;")
    public static class47 field2549 = field2568;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "Leh;")
    public static class47 field2579 = field2568;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Lle;")
    public class104 field2562;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lbd;")
    public class15 field2550;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Ltg;")
    public class178 field2558;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Ldc;")
    public class33 field2561;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBLgf;)V")
    public static final void method960(int arg0, int arg1, byte arg2, class61 arg3) {
        int var4 = -29 % ((arg2 - 21) / 60);
        field2581++;
        if (class26.field511 != null || class80.field1726 || (arg3 == null || class87.method710(arg3, -109) == null)) {
            return;
        }
        class26.field511 = arg3;
        class63.field1344 = class87.method710(arg3, -96);
        class141.field2755 = arg0;
        class180.field3447 = arg1;
        class68.field1500 = false;
        class192.field3719 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)I")
    public static final int method961(int arg0, int arg1, int arg2, boolean arg3) {
        field2552++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else {
            if (arg3) {
                field2575 = -3;
            }
            return var4 == 2 ? 7 - arg1 : arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method962(byte arg0) {
        this.field2561 = null;
        this.field2558 = null;
        field2555++;
        this.field2562 = null;
        if (arg0 != -12) {
            this.field2550 = null;
        }
        this.field2550 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lhd;I)Llf;")
    public static final class105 method963(class68 arg0, int arg1) {
        field2564++;
        int var2 = arg0.method604((byte) 55);
        int var3 = arg0.method604((byte) 26);
        Class var4 = class63.method530(1, var3);
        try {
            class105 var5 = (class105) var4.getDeclaredConstructor().newInstance();
            if (var5 != null) {
                var5.field2188 = var2;
                var5.field2197 = arg0.method604((byte) -9);
                int var6 = arg0.method604((byte) -125);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg0.method604((byte) -125);
                    var5.method17(var8, arg0, -256);
                }
            }
            var5.method13(-1);
            return arg1 < 41 ? null : var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method964(int arg0) {
        class199 var1 = (class199) client.field551.method345(arg0 ^ 0xFFFFFF94);
        if (arg0 != 0) {
            method960(-105, 1, (byte) 50, null);
        }
        field2574++;
        while (var1 != null) {
            if (var1.field3891 == -1) {
                var1.field3887 = 0;
                class16.method175((byte) -74, var1);
            } else {
                var1.method885(3);
            }
            var1 = (class199) client.field551.method348(13949);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public static void method965(int arg0) {
        field2568 = null;
        if (arg0 != 0) {
            field2568 = null;
        }
        field2580 = null;
        field2549 = null;
        field2559 = null;
        field2553 = null;
        field2554 = null;
        field2579 = null;
    }
}
