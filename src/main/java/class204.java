import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class204 extends class126 {

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    private int field3294 = -32768;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lok;")
    public static class41 field3287 = class137.method956("Cache:", 45);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lok;")
    public static class41 field3289 = class137.method956("Angreifen", 45);

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lok;")
    private static class41 field3291 = class137.method956("Loading sprites )2 ", 45);

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lok;")
    public static class41 field3298 = field3291;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lok;")
    public static class41 field3301 = class137.method956(" zuerst von Ihrer Ignorieren)2Liste(Q", 45);

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field3300 = -1;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "S")
    public static short field3293 = 32767;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Lok;")
    public static class41 field3302 = class137.method956(")1 ", 45);

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[[S")
    public static short[][] field3303;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)I", line = 6)
    public static final int method1443(int arg0, int arg1, byte arg2) {
        field3292++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg2 <= 44 ? 27 : (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I", line = 30)
    public final int method125() {
        field3296++;
        return this.field3294;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILth;JLth;Lth;)V", line = 56)
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, class126 arg4, long arg5, class126 arg6, class126 arg7) {
        class285 var9 = new class285();
        var9.field4629 = arg4;
        var9.field4627 = arg1 * 128 + 64;
        var9.field4636 = arg2 * 128 + 64;
        var9.field4633 = arg3;
        var9.field4625 = arg5;
        var9.field4639 = arg6;
        var9.field4635 = arg7;
        int var10 = 0;
        class308 var11 = class205.field3312[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field5193; var12++) {
                class232 var13 = var11.field5201[var12];
                if ((var13.field3672 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3674.method125();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4637 = -var10;
        if (class205.field3312[arg0][arg1][arg2] == null) {
            class205.field3312[arg0][arg1][arg2] = new class308(arg0, arg1, arg2);
        }
        class205.field3312[arg0][arg1][arg2].field5209 = var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V", line = 110)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3295++;
        class287 var11 = class130.method918(this.field3290, -107).method968(0, (class205) null, this.field3288, (byte) -124);
        if (var11 != null) {
            var11.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3294 = var11.method125();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 124)
    public static final Object method1445(byte[] arg0, boolean arg1, int arg2) {
        field3297++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class13.field157) {
            try {
                class43 var3 = (class43) Class.forName("qf").getDeclaredConstructor().newInstance();
                var3.method321(arg0, (byte) -97);
                return var3;
            } catch (Throwable var5) {
                class13.field157 = true;
            }
        }
        if (arg2 < 20) {
            return (Object) null;
        } else if (arg1) {
            return class38.method260((byte) 61, arg0);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 171)
    public static void method1446(int arg0) {
        field3287 = null;
        field3298 = null;
        field3303 = (short[][]) null;
        if (arg0 != 0) {
            field3298 = (class41) null;
        }
        field3301 = null;
        field3302 = null;
        field3289 = null;
        field3291 = null;
    }
}
