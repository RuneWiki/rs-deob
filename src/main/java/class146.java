import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class146 {

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Lbu;")
    private class407 field2385 = new class407(256);

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Lbu;")
    private class407 field2391 = new class407(256);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lqs;")
    private class496 field2381;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lqs;")
    private class496 field2384;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field2382 = 765;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2388;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "[[S")
    public static short[][] field2389;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([III)Lmg;", line = 4)
    public final class168 method1060(int[] arg0, int arg1, int arg2) {
        field2386++;
        if (this.field2384.method2919((byte) -47) == 1) {
            return this.method1066(1, 0, arg2, arg0);
        }
        if (arg1 < 36) {
            this.field2385 = null;
        }
        if (this.field2384.method2940(arg2, -10511) != 1) {
            throw new RuntimeException();
        }
        return this.method1066(1, arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I", line = 25)
    public static final int method1061(int arg0, int arg1) {
        if (arg0 == -20355) {
            field2390++;
            return arg1 & 0x7F;
        } else {
            return 59;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 39)
    public static void method1062(int arg0) {
        if (arg0 == -25758) {
            field2389 = null;
            field2388 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 50)
    public static final void method1063(int arg0) {
        field2383++;
        class460 var1 = (class460) class359.field5586.method2538(arg0 - 4);
        if (arg0 != 1) {
            field2388 = null;
        }
        while (var1 != null) {
            class134 var2 = var1.field6820;
            if (var2.field2276) {
                var1.method1821((byte) 79);
                var2.method1013(75);
            } else if (class504.field7348 >= var2.field2259) {
                var2.method1017(class431.field6455, (byte) -49);
                if (var2.field2276) {
                    var1.method1821((byte) -126);
                } else {
                    class177.method1198(var2, true);
                }
            }
            var1 = (class460) class359.field5586.method2535((byte) -108);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[II)Lmg;", line = 95)
    public final class168 method1064(int arg0, int[] arg1, int arg2) {
        field2380++;
        if (this.field2381.method2919((byte) -124) == 1) {
            return this.method1065(arg1, -850771092, 0, arg0);
        }
        if (arg2 != 765) {
            field2388 = null;
        }
        if (this.field2381.method2940(arg0, -10511) != 1) {
            throw new RuntimeException();
        }
        return this.method1065(arg1, -850771092, arg0, 0);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([IIII)Lmg;", line = 115)
    private final class168 method1065(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -850771092) {
            this.method1064(-86, null, -44);
        }
        field2379++;
        int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0xF0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class168 var9 = (class168) this.field2391.method2516(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class80 var10 = class80.method584(this.field2381, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class168 var11 = var10.method586();
            this.field2391.method2517(var11, var7, (byte) -119);
            if (arg0 != null) {
                arg0[0] -= var11.field2691.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)Lmg;", line = 156)
    private final class168 method1066(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != 1) {
            return null;
        }
        field2387++;
        int var5 = arg2 ^ ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class168 var9 = (class168) this.field2391.method2516(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class354 var10 = (class354) this.field2385.method2516(var7, arg0 - 2);
            if (var10 == null) {
                var10 = class354.method2277(this.field2384, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2385.method2517(var10, var7, (byte) 36);
            }
            class168 var11 = var10.method2274(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1821((byte) 26);
                this.field2391.method2517(var11, var7, (byte) 19);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lqs;Lqs;)V", line = 215)
    public class146(class496 arg0, class496 arg1) {
        this.field2381 = arg0;
        this.field2384 = arg1;
    }
}
