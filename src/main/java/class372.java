import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class372 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lkn;")
    public static class530 field5295 = new class530("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Leh;")
    public static class246 field5299 = new class246(34, -2);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Leh;")
    public static class246 field5300 = new class246(36, -2);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Ltn;")
    public static class60 field5301 = new class60(42, 2);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lik;")
    public class142 field5296;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 4)
    public static void method2179(int arg0) {
        field5299 = null;
        field5300 = null;
        field5301 = null;
        field5295 = null;
        if (arg0 != 1073741824) {
            field5299 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 20)
    public static final int method2180(int arg0, int arg1) {
        field5297++;
        if (arg0 != -16744) {
            field5295 = null;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILnc;I)J", line = 39)
    public static final long method2181(int arg0, int arg1, class21 arg2, int arg3) {
        field5298++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class270 var10 = class377.field5338.method1901(50, arg2.method110((byte) 115));
        long var11 = (long) (arg1 << 7 | arg3 | arg2.method112(-110) << 14 | arg2.method114(-9772) << 20 | 0x40000000);
        if (var10.field3957 == 0) {
            var11 |= var8;
        }
        if (arg0 != 1355778465) {
            method2181(47, 2, null, 92);
        }
        if (var10.field3954 == 1) {
            var11 |= var4;
        }
        if (var10.field3953) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method110((byte) 115) << 32;
    }
}
