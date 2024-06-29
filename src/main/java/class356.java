import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class356 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Ldh;")
    public static class216 field5181 = new class216(1, 3);

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "[Ldp;")
    public static class3[] field5182 = new class3[8];

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field5183 = -1;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(DB)V")
    public static final void method2215(double arg0, byte arg1) {
        if (arg1 != -78) {
            return;
        }
        if (class319.field4740 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class477.field6950[var3] = var4 > 255 ? 255 : var4;
            }
            class319.field4740 = arg0;
        }
        field5180++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        int var1 = 100 % ((arg0 - 54) / 38);
        field5181 = null;
        field5182 = null;
    }
}
