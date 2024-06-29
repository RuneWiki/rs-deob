import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class130 implements Runnable {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Z")
    public boolean field2523 = true;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field2518 = new Object();

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
    public int[] field2527 = new int[500];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    public int[] field2526 = new int[500];

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field2529 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Loj;")
    public static class17 field2516 = new class17(4);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lmi;")
    public static class128 field2525 = new class128();

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lqc;")
    public static class258 field2528 = new class258(4096);

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
    public static boolean field2530 = false;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lhh;")
    public static class163 field2532 = class137.method1065("loginscreen", 17);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(DZ)V")
    public static final void method1030(double arg0, boolean arg1) {
        if (class212.field3845 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class175.field3181[var3] = var4 <= 255 ? var4 : 255;
            }
            class212.field3845 = arg0;
        }
        if (arg1) {
            field2516 = null;
        }
        field2520++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2516 = null;
        field2525 = null;
        field2528 = null;
        field2532 = null;
        if (arg0 != 1824902384) {
            method1031(-100);
        }
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2523) {
            Object var1 = this.field2518;
            synchronized (this.field2518) {
                if (this.field2529 < 500) {
                    this.field2527[this.field2529] = class36.field608;
                    this.field2526[this.field2529] = class240.field4281;
                    this.field2529++;
                }
            }
            class107.method866(0, 50L);
        }
        field2519++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lhh;")
    public static final class163 method1032(int arg0, boolean arg1) {
        field2524++;
        if (arg0 < 999999999) {
            return class136.method1061(arg0, (byte) 105);
        } else if (arg1) {
            return null;
        } else {
            return class210.field3805;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public static final void method1033() {
        for (int var0 = 0; var0 < class57.field935; var0++) {
            class132 var1 = class55.field918[var0];
            class125.method995(var1);
            class55.field918[var0] = null;
        }
        class57.field935 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2517++;
        if (arg7 < 128 || arg3 < 128 || arg7 > 13056 || arg3 > 13056) {
            class225.field4077 = -1;
            class81.field1522 = -1;
            return;
        }
        int var8 = class127.method1011(arg3, arg7, class20.field323, 29908) - arg2;
        int var9 = arg7 - class123.field2367;
        int var10 = arg3 - class88.field1636;
        int var11 = var8 - class191.field3490;
        int var12 = class98.field1839[class13.field201];
        int var13 = class98.field1843[class13.field201];
        int var14 = class98.field1839[class63.field1072];
        int var15 = class98.field1843[class63.field1072];
        int var16 = var9 * var15 + var10 * var14 >> 16;
        int var17 = var10 * var15 - (var9 * var14) >> 16;
        int var19 = var11 * var13 - var12 * var17 >> 16;
        int var20 = var11 * var12 + var13 * var17 >> 16;
        if (arg5 <= 92) {
            method1033();
        }
        if (var20 < 50) {
            class225.field4077 = -1;
            class81.field1522 = -1;
        } else {
            class81.field1522 = arg0 + ((var16 << 9) / var20);
            class225.field4077 = (var19 << 9) / var20 + arg6;
        }
    }
}
