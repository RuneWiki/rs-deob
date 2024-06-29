import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class15 extends class287 {

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[I")
    public static int[] field242 = new int[1000];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public static int[] field252 = new int[25];

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Ljava/lang/String;")
    public static String field262 = "green:";

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lcd;")
    public class136 field244;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lcd;")
    public class136 field248;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lug;")
    public static class253 field255;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Ljava/lang/String;")
    public String field247;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Z")
    public boolean field253;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "[I")
    public static int[] field257;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field243;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I", line = 10)
    public static final int method141(int arg0, int arg1) {
        field246++;
        if (arg1 != 1000) {
            method144(89, 1, -65, 60, -15, 30, (class248) null, 22, 113L);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 21)
    public static void method142(boolean arg0) {
        field242 = null;
        field255 = null;
        field257 = null;
        if (arg0) {
            method144(-70, 3, 39, 45, 100, 29, (class248) null, -67, 67L);
        }
        field252 = null;
        field262 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 52)
    public static final void method143(int arg0, int arg1, int arg2) {
        if (arg1 < 54) {
            method144(54, 86, -71, 124, -123, 124, (class248) null, -10, -124L);
        }
        field249++;
        class256.field4046[arg0] = arg2;
        class286 var3 = (class286) class10.field192.method2168((long) arg0, (byte) -121);
        if (var3 == null) {
            class286 var4 = new class286(4611686018427387905L);
            class10.field192.method2161(var4, (long) arg0, -1);
        } else if (var3.field4419 != 4611686018427387905L) {
            var3.field4419 = class219.method1609(-898) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIILgh;IJ)Z", line = 80)
    public static final boolean method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class248 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class99.method692(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 102)
    public static final void method145(byte arg0) {
        field254++;
        if (arg0 <= 59) {
            method141(-37, 16);
        }
        class37.field541.method1359(89);
        class34.field498.method1359(72);
    }
}
