import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class287 {

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lhp;")
    private class296 field4275;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "J")
    public long field4273;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public static int[] field4269 = new int[3];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public static int[] field4271 = new int[120];

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ldg;")
    public static class376 field4276;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lhm;")
    public static class200 field4278;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lla;")
    public static class416 field4279;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lko;")
    public static class465 field4270;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lpu;")
    public static class522 field4277;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4271[var1] = var0 / 4;
        }
        field4276 = new class376(82, 1);
        field4280 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 3)
    public static void method1840(int arg0) {
        field4279 = null;
        field4276 = null;
        if (arg0 != 23244) {
            field4279 = null;
        }
        field4277 = null;
        field4270 = null;
        field4278 = null;
        field4271 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        field4272++;
        this.field4275.method1871(this.field4273, 34168);
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lhp;JI)V", line = 43)
    public class287(class296 arg0, long arg1, int arg2) {
        this.field4275 = arg0;
        this.field4273 = arg1;
    }
}
