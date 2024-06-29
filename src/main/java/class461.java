import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class461 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Lvi;")
    private class560 field6272 = new class560(64);

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lpq;")
    private class159 field6274;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "[I")
    public static int[] field6278 = new int[256];

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "F")
    public static float field6285;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Ldn;")
    public static class140 field6283;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6278[var0] = var1;
        }
        field6281 = 0;
        field6280 = 0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 4)
    public final void method2606(byte arg0) {
        if (arg0 != 81) {
            this.field6274 = null;
        }
        class560 var2 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method3142(false);
        }
        field6277++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIBI)V", line = 20)
    public static final void method2607(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 10 / ((arg3 + 40) / 56);
        if (class273.field3702 == 1) {
            class611.field8323[class669.field9514 / 100].method2450(class268.field3671 - 8, class409.field5747 + -8);
        }
        field6282++;
        if (class273.field3702 == 2) {
            class611.field8323[(class669.field9514 / 100) + 4].method2450(class268.field3671 - 8, class409.field5747 - 8);
        }
        class143.method978(-127);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 44)
    public static void method2608(int arg0) {
        if (arg0 < -55) {
            field6278 = null;
            field6283 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V", line = 55)
    public final void method2609(int arg0, byte arg1) {
        class560 var3 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method3129(arg0, 14583);
        }
        field6284++;
        if (arg1 != -41) {
            field6285 = 2.319813F;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IB)Lgn;", line = 74)
    public final class186 method2610(int arg0, byte arg1) {
        field6275++;
        class560 var3 = this.field6272;
        class186 var4;
        synchronized (this.field6272) {
            var4 = (class186) this.field6272.method3134((long) arg0, -22);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field6274;
        byte[] var6;
        synchronized (this.field6274) {
            var6 = this.field6274.method1087(16, arg0, 1);
        }
        class186 var7 = new class186();
        if (arg1 >= -67) {
            field6285 = -0.32048884F;
        }
        if (var6 != null) {
            var7.method1196(new class138(var6), 87);
        }
        class560 var8 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 104)
    public final void method2611(boolean arg0) {
        class560 var2 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method3144(arg0);
        }
        field6276++;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 157)
    public class461(class484 arg0, int arg1, class159 arg2) {
        this.field6274 = arg2;
        if (this.field6274 == null) {
            this.field6273 = 0;
        } else {
            this.field6273 = this.field6274.method1076(16, 0);
        }
    }
}
