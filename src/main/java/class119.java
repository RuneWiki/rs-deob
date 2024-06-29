import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class119 extends class110 {

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
    public static int[] field2540 = new int[32];

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Z")
    public static boolean field2546 = false;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Llc;")
    public static class69 field2544 = class69.method470((byte) -108, "null");

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field2547 = 0;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Llc;")
    public static class69 field2551;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Llc;")
    public static class69 field2556;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lfe;")
    public static class36 field2554;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lcb;")
    public static class15 field2542;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lhc;")
    public static class45 field2552;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lkc;")
    public static class63 field2548;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
    public static int[] field2555;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIJI)V")
    public final void method871(int arg0, int arg1, long arg2, int arg3) {
        field2543++;
        if (arg0 > -59) {
            field2554 = null;
        }
        int var6 = (int) ((double) arg1 * Math.pow(0.1D, (double) arg3 * 5.0E-4D) + 0.5D);
        if (class70.field1563 == var6) {
            return;
        }
        class70.field1563 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method876(var7);
            this.method2(var7 + 176, 7, var8 >> 7, arg2);
            this.method2(var7 + 176, 39, var8 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public static final void method872(int arg0) {
        field2545++;
        if (arg0 != -24306) {
            field2546 = true;
        }
        class13.field264 = false;
        class129.field2780 = false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
    public final void method873(int arg0, long arg1) {
        field2550++;
        for (int var4 = 0; var4 < 16; var4++) {
            this.method2(var4 + 176, 123, 0, arg1);
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method2(var5 + 176, 120, 0, arg1);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method2(var6 + 176, 121, 0, arg1);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method2(var7 + 176, 0, 0, arg1);
        }
        int var8 = 0;
        int var9 = 66 % ((arg0 + 6) / 54);
        while (var8 < 16) {
            this.method2(var8 + 176, 32, 0, arg1);
            var8++;
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method2(var10 + 192, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIJ)Z")
    public final boolean method874(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method2(arg0, arg1, arg2, arg3);
                int var6 = arg0 & 0xF;
                class46.field969[var6] = 12800;
                int var7 = method876(var6);
                this.method2(arg0, 7, var7 >> 7, arg3);
                this.method2(arg0, 39, var7 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var8 = arg0 & 0xF;
                if (arg1 == 7) {
                    class46.field969[var8] = (arg2 << 7) + (class46.field969[var8] & 0x7F);
                } else {
                    class46.field969[var8] = (class46.field969[var8] & 0x3F80) + arg2;
                }
                int var9 = method876(var8);
                this.method2(arg0, 7, var9 >> 7, arg3);
                this.method2(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIJ)V")
    public abstract void method2(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IJ)V")
    public final void method875(int arg0, long arg1) {
        field2549++;
        class70.field1563 = 256;
        int var4 = 0;
        if (arg0 < 11) {
            return;
        }
        while (var4 < 16) {
            class46.field969[var4] = 12800;
            var4++;
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method2(var5 + 176, 7, 100, arg1);
            this.method2(var5 + 176, 39, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
    private static final int method876(int arg0) {
        int var1 = class46.field969[arg0];
        int var2 = (class70.field1563 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    public static void method877(int arg0) {
        field2554 = null;
        field2556 = null;
        field2555 = null;
        field2551 = null;
        field2540 = null;
        field2552 = null;
        field2544 = null;
        field2542 = null;
        int var1 = 4 / ((75 - arg0) / 46);
        field2548 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2540[var1] = var0 - 1;
            var0 += var0;
        }
        field2551 = class69.method470((byte) -97, "M");
        field2553 = -1;
        field2556 = class69.method470((byte) -96, "You need to set*6nnew contact details)3");
        field2554 = new class36(64);
    }
}
