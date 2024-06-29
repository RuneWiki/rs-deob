import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class166 extends class443 {

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lia;")
    public class81 field2246;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "[[[I")
    public static int[][][] field2248 = new int[2][][];

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
    public static int[] field2251 = new int[13];

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Lir;")
    public static class185 field2250;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "[I")
    public static int[] field2249;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field2251 = null;
        field2250 = null;
        field2249 = null;
        field2248 = null;
        if (arg0 <= 19) {
            field2249 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lia;)V")
    public class166(class81 arg0) {
        this.field2246 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIJ)V")
    public static final void method1119(int arg0, int arg1, int arg2, long arg3) {
        field2245++;
        int var5 = ((int) arg3 & 0x7C3AB) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class212 var8 = class372.method2447(var7, (byte) 91);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field2970;
                var9 = var8.field2946;
            } else {
                var9 = var8.field2970;
                var10 = var8.field2946;
            }
            int var11 = var8.field2902;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class356.method2338(class383.field5609.field2190[0], arg1, 0, 1, true, arg0, 0, var9, var11, class383.field5609.field2189[0], var10);
        } else {
            class356.method2338(class383.field5609.field2190[0], arg1, var6, arg2 + 2, true, arg0, var5, 0, 0, class383.field5609.field2189[0], 0);
        }
        if (arg2 != -1) {
            field2250 = null;
        }
    }
}
