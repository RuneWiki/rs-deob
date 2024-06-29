import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class249 {

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "Z")
    public boolean field3271;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "Z")
    public boolean field3272;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "Ldm;")
    public class58 field3266;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Ldm;")
    public class58 field3268;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lida;")
    public static class249 field3262 = new class249(0, class58.field713, class58.field713, 0, 1);

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "Lida;")
    public static class249 field3273 = new class249(1, class58.field713, 2);

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "Lida;")
    public static class249 field3275 = new class249(2, class58.field713, class58.field713, 2, 3);

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "Lida;")
    public static class249 field3276 = new class249(3, class58.field713, 3);

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "Lida;")
    public static class249 field3277 = new class249(4, class58.field713, class58.field713, 3, 4);

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "Lida;")
    public static class249 field3278 = new class249(5, class58.field713, 4);

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "Lida;")
    public static class249 field3279 = new class249(6, class58.field713, 4);

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "Lida;")
    public static class249 field3280 = new class249(7, class58.field713, class58.field713, 4, 5);

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "Lida;")
    public static class249 field3281 = new class249(8, class58.field713, class58.field713, 5, 98, true, true);

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "Lida;")
    public static class249 field3282 = new class249(9, class58.field713, 99);

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "Lida;")
    public static class249 field3283 = new class249(10, class58.field713, 100);

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "Lida;")
    public static class249 field3284 = new class249(11, class58.field714, class58.field714, 0, 92, true, true);

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "Lida;")
    public static class249 field3285 = new class249(12, class58.field714, class58.field714, 92, 92);

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "Lida;")
    private static class249 field3286 = new class249(13, class58.field714, class58.field714, 92, 93);

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "Lida;")
    public static class249 field3287 = new class249(14, class58.field714, class58.field714, 94, 95);

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "Lida;")
    public static class249 field3288 = new class249(15, class58.field714, class58.field714, 96, 97);

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "Lida;")
    public static class249 field3289 = new class249(16, class58.field714, 97);

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "Lida;")
    public static class249 field3290 = new class249(17, class58.field714, 97);

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "Lida;")
    public static class249 field3291 = new class249(18, class58.field714, 100);

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "Lida;")
    public static class249 field3292 = new class249(19, class58.field714, 100);

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "Lida;")
    public static class249 field3293 = new class249(20, class58.field714, 100);

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "[Lhh;")
    public static class140[] field3295;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)[Lida;")
    public static final class249[] method1557(byte arg0) {
        field3274++;
        int var1 = -128 % ((arg0 - 45) / 51);
        return new class249[] { field3262, field3273, field3275, field3276, field3277, field3278, field3279, field3280, field3281, field3282, field3283, field3284, field3285, field3286, field3287, field3288, field3289, field3290, field3291, field3292, field3293 };
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)I")
    public final int method1558(byte arg0) {
        field3263++;
        if (arg0 <= 101) {
            this.method1558((byte) 43);
        }
        return this.field3265;
    }

    @OriginalMember(owner = "client!ida", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3270++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
    public static void method1559(byte arg0) {
        field3275 = null;
        field3279 = null;
        field3276 = null;
        field3273 = null;
        field3295 = null;
        field3286 = null;
        field3288 = null;
        field3281 = null;
        field3277 = null;
        if (arg0 > -11) {
            return;
        }
        field3292 = null;
        field3262 = null;
        field3283 = null;
        field3282 = null;
        field3291 = null;
        field3285 = null;
        field3287 = null;
        field3289 = null;
        field3290 = null;
        field3278 = null;
        field3284 = null;
        field3280 = null;
        field3293 = null;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILdm;Ldm;II)V")
    private class249(int arg0, class58 arg1, class58 arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, true, false);
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILdm;I)V")
    private class249(int arg0, class58 arg1, int arg2) {
        this(arg0, arg1, arg1, arg2, arg2, true, false);
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILdm;Ldm;IIZZ)V")
    private class249(int arg0, class58 arg1, class58 arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        this.field3271 = arg6;
        this.field3272 = arg5;
        this.field3269 = arg3;
        this.field3265 = arg0;
        this.field3266 = arg1;
        this.field3268 = arg2;
        this.field3264 = arg4;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZLqba;)V")
    public static final void method1560(int arg0, boolean arg1, class425 arg2) {
        if (!arg1) {
            return;
        }
        field3267++;
        if (arg2.field6179 == null) {
            return;
        }
        int var3 = arg2.field6179[arg0 + 1];
        if (arg2.field6138 == var3) {
            return;
        }
        arg2.field6157 = 0;
        arg2.field6138 = var3;
        arg2.field6181 = 1;
        arg2.field6103 = 0;
        arg2.field6150 = 0;
        arg2.field6200 = arg2.field6195;
        if (arg2.field6138 != -1) {
            class627.method3466(arg2, class693.field9223.method2388(arg2.field6138, 0), -29701, arg2.field6150);
            return;
        }
    }
}
