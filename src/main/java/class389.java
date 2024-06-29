import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class389 {

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Lgfa;")
    private class150 field5206 = new class150();

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    private int field5219;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    private int field5203;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "Lwh;")
    private class546 field5207;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "[I")
    public static int[] field5213 = new int[1];

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "Leba;")
    public static class550 field5209 = new class550(83, 16);

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "[[Z")
    public static boolean[][] field5222 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "[I")
    public static int[] field5220 = new int[1024];

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "Z")
    public static boolean field5224 = false;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "Lkr;")
    public static class354 field5221;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field5223;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "[[B")
    public static byte[][] field5218;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public final void method2241(int arg0) {
        field5205++;
        for (class336 var2 = (class336) this.field5206.method878(false); var2 != null; var2 = (class336) this.field5206.method880(-11278)) {
            if (var2.method1009(false)) {
                var2.method242(true);
                var2.method1982((byte) -24);
                this.field5203 += var2.field4541;
            }
        }
        if (arg0 >= -28) {
            field5224 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public static void method2242(byte arg0) {
        field5221 = null;
        field5209 = null;
        if (arg0 != 1) {
            field5213 = null;
        }
        field5213 = null;
        field5220 = null;
        field5223 = null;
        field5218 = null;
        field5222 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILdc;)Ljava/lang/Object;")
    public final Object method2243(int arg0, class23 arg1) {
        if (arg0 != 25024) {
            return null;
        }
        field5210++;
        long var3 = arg1.method138((byte) 8);
        for (class336 var5 = (class336) this.field5207.method3057(1, var3); var5 != null; var5 = (class336) this.field5207.method3062(-125)) {
            if (var5.field4540.method137((byte) -33, arg1)) {
                Object var6 = var5.method1006(14);
                if (var6 != null) {
                    if (var5.method1009(false)) {
                        class164 var7 = new class164(arg1, var6, var5.field4541);
                        this.field5207.method3061(124, var5.field545, var7);
                        this.field5206.method879((byte) -122, var7);
                        var7.field4564 = 0L;
                        var5.method242(true);
                        var5.method1982((byte) -24);
                    } else {
                        this.field5206.method879((byte) -99, var5);
                        var5.field4564 = 0L;
                    }
                    return var6;
                }
                var5.method242(true);
                var5.method1982((byte) -24);
                this.field5203 += var5.field4541;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/Object;Ldc;B)V")
    public final void method2244(Object arg0, class23 arg1, byte arg2) {
        field5217++;
        this.method2248(arg0, true, 1, arg1);
        if (arg2 <= 54) {
            field5221 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)I")
    public final int method2245(int arg0) {
        if (arg0 == 0) {
            field5216++;
            return this.field5219;
        } else {
            return -66;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ldc;B)V")
    private final void method2246(class23 arg0, byte arg1) {
        field5215++;
        long var3 = arg0.method138((byte) 8);
        for (class336 var5 = (class336) this.field5207.method3057(arg1 ^ 0x1F, var3); var5 != null; var5 = (class336) this.field5207.method3062(-122)) {
            if (var5.field4540.method137((byte) -33, arg0)) {
                this.method2247((byte) 112, var5);
                break;
            }
        }
        if (arg1 != 30) {
            field5222 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLwca;)V")
    private final void method2247(byte arg0, class336 arg1) {
        if (arg0 <= 87) {
            field5209 = null;
        }
        if (arg1 != null) {
            arg1.method242(true);
            arg1.method1982((byte) -24);
            this.field5203 += arg1.field4541;
        }
        field5214++;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/Object;ZILdc;)V")
    private final void method2248(Object arg0, boolean arg1, int arg2, class23 arg3) {
        field5212++;
        if (this.field5219 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2246(arg3, (byte) 30);
        this.field5203 -= arg2;
        while (this.field5203 < 0) {
            class336 var6 = (class336) this.field5206.method885((byte) -76);
            this.method2247((byte) 104, var6);
        }
        if (!arg1) {
            field5223 = null;
        }
        class164 var5 = new class164(arg3, arg0, arg2);
        this.field5207.method3061(126, arg3.method138((byte) 8), var5);
        this.field5206.method879((byte) -115, var5);
        var5.field4564 = 0L;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public final void method2249(int arg0, int arg1) {
        if (class11.field137 != null) {
            for (class336 var3 = (class336) this.field5206.method878(false); var3 != null; var3 = (class336) this.field5206.method880(-11278)) {
                if (var3.method1009(false)) {
                    if (var3.method1006(14) == null) {
                        var3.method242(true);
                        var3.method1982((byte) -24);
                        this.field5203 += var3.field4541;
                    }
                } else if ((long) arg0 < ++var3.field4564) {
                    class336 var4 = class11.field137.method1198(arg1 + 11967, var3);
                    this.field5207.method3061(124, var3.field545, var4);
                    class72.method398(var3, var4, 36161);
                    var3.method242(true);
                    var3.method1982((byte) -24);
                }
            }
        }
        field5208++;
        if (arg1 != 0) {
            field5221 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
    public final void method2250(int arg0) {
        this.field5206.method884(-126);
        if (arg0 == 1) {
            field5204++;
            this.field5207.method3063((byte) -76);
            this.field5203 = this.field5219;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
    public final int method2251(int arg0) {
        if (arg0 == 0) {
            field5211++;
            return this.field5203;
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(I)V")
    public class389(int arg0) {
        this.field5219 = arg0;
        this.field5203 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5207 = new class546(var2);
    }
}
