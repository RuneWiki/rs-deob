import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class164 implements class159 {

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lfp;")
    private class323 field2253;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lnt;")
    public class220 field2256;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lfp;")
    public class323 field2249;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[I")
    public static int[] field2258 = new int[16384];

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field2252 = new int[16384];

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "J")
    private long field2254;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lfp;")
    public static class323 field2255;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lda;")
    private class59 field2257;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2258[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field2252[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field2261 = 0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z", line = 9)
    public boolean method49(int arg0) {
        if (arg0 != -32252) {
            method1080((byte) 114);
        }
        field2248++;
        boolean var2 = true;
        if (!this.field2249.method2088(this.field2256.field2864, arg0 ^ 0x7D8A)) {
            var2 = false;
        }
        if (!this.field2253.method2088(this.field2256.field2864, 90)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 28)
    public void method55(int arg0) {
        if (arg0 != 11133) {
            this.field2249 = null;
        }
        field2251++;
        class143 var2 = class228.method1422(this.field2253, 2, this.field2256.field2864);
        this.field2257 = class268.field3831.method459(var2, class204.method1236(this.field2249, this.field2256.field2864), true);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V", line = 47)
    public final void method1056(boolean arg0, int arg1) {
        field2259++;
        int var3 = this.field2256.field2867.method12(class192.field2561, this.field2256.field2873, -117) + this.field2256.field2871;
        int var4 = this.field2256.field2876.method826(this.field2256.field2874, arg1 + 3340, class191.field2553) + this.field2256.field2875;
        if (arg1 != -3340) {
            return;
        }
        this.method51(arg0, var3, (byte) -104, var4);
        this.method52(var4, var3, arg0, (byte) -90);
        String var5 = class268.field3824.method3984((byte) -45);
        if ((class479.method2864((byte) -55) - this.field2254) > 10000L) {
            var5 = var5 + " (" + class268.field3824.method3986((byte) -114).method1671((byte) -110) + ")";
        }
        this.field2257.method499(this.field2256.field2874 / 2 + var4 + this.field2256.field2865 + 4, var3 - -(this.field2256.field2873 / 2), -1, false, this.field2256.field2872, var5);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 73)
    public static void method1080(byte arg0) {
        field2258 = null;
        if (arg0 < -45) {
            field2255 = null;
            field2252 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)I", line = 85)
    public final int method1081(int arg0) {
        field2250++;
        int var2 = class268.field3824.method3993(-1);
        if (arg0 != 2) {
            return 32;
        }
        int var3 = var2 * 100;
        if (this.field2260 == var2 && var2 != 0) {
            int var4 = class268.field3824.method3995((byte) 96);
            if (var2 < var4) {
                long var5 = this.field2254 - class268.field3824.method3996(arg0 ^ 0x76);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class479.method2864((byte) -84) - this.field2254) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field2260 = var2;
            this.field2254 = class479.method2864((byte) -92);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lfp;Lfp;Lnt;)V", line = 147)
    public class164(class323 arg0, class323 arg1, class220 arg2) {
        this.field2253 = arg1;
        this.field2256 = arg2;
        this.field2249 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIBI)V")
    public abstract void method51(boolean arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZB)V")
    public abstract void method52(int arg0, int arg1, boolean arg2, byte arg3);
}
