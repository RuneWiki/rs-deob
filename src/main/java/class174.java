import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class174 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lub;")
    public static class227 field2901 = class257.method1749("(Z", 17263);

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lub;")
    public static class227 field2909 = class257.method1749("Null", 17263);

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field2910 = -1;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[[B")
    public static byte[][] field2907 = new byte[50][];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
    public static volatile boolean field2903 = true;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method1111(int arg0) {
        field2901 = null;
        field2907 = null;
        if (arg0 != 1) {
            method1111(39);
        }
        field2909 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([[IB)V")
    public static final void method1112(int[][] arg0, byte arg1) {
        class59.field1094 = arg0;
        if (arg1 != -15) {
            field2909 = null;
        }
        field2908++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIJI)Z")
    public static final boolean method1113(int arg0, int arg1, long arg2, int arg3) {
        field2902++;
        if (arg0 != 0) {
            field2903 = true;
        }
        int var5 = ((int) arg2 & 0x7E02D) >> 14;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class45 var8 = class220.method1389(var7, (byte) 61);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field810;
                var10 = var8.field790;
            } else {
                var9 = var8.field790;
                var10 = var8.field810;
            }
            int var11 = var8.field786;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class117.method736(arg0 ^ 0x71, var9, 0, arg1, class216.field3639.field49[0], class216.field3639.field78[0], 0, var11, arg3, 2, true, var10);
        } else {
            class117.method736(64, 0, var5 + 1, arg1, class216.field3639.field49[0], class216.field3639.field78[0], var6, 0, arg3, 2, true, 0);
        }
        class14.field257 = 2;
        class144.field2471 = class81.field1403;
        class177.field2966 = class232.field4043;
        class193.field3288 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method1114(byte arg0) {
        if (class116.field2131 != -1) {
            class106.method656(class116.field2131, 85);
        }
        field2906++;
        if (arg0 != -54) {
            return;
        }
        for (int var1 = 0; var1 < class140.field2421; var1++) {
            if (class10.field182[var1]) {
                class79.field1379[var1] = true;
            }
            class108.field2034[var1] = class10.field182[var1];
            class10.field182[var1] = false;
        }
        class243.field4212 = null;
        class226.field3905 = class253.field4393;
        class218.field3668 = -1;
        class108.field2038 = -1;
        if (class116.field2131 != -1) {
            class140.field2421 = 0;
            class231.method1558(0, 0, 27733, class208.field3538, -1, 0, class49.field867, 0, class116.field2131);
        }
        class111.method710();
        class85.field1481 = 0;
    }
}
