import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class308 extends class443 {

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lfi;")
    public static class8 field4573 = new class8();

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V", line = 16)
    public static final void method2040(boolean arg0) {
        field4572++;
        if (class69.field1003 >= 0) {
            long var1 = class98.method768((byte) 69);
            class69.field1003 = (int) ((long) class69.field1003 - (var1 - class119.field1547));
            if (class69.field1003 <= 0) {
                class69.field1003 = -1;
                class132.field1725 = class28.field480.field3347;
                class409.field5952 = class28.field480.field3338;
                class128.field1666 = class28.field480.field3329;
                class108.field1416 = class28.field480.field3340;
                class384.field5617 = class28.field480.field3335;
                class301.field4540 = class28.field480.field3327;
                class126.field1645 = class28.field480.field3337;
                class333.field4902 = class28.field480.field3344;
                class290.field4342 = class28.field480.field3330;
                class422.field6134 = class28.field480.field3331;
            } else {
                int var3 = (class69.field1003 << 8) / class11.field193;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class132.field1725 = ((class175.field2372 & 0xFF00FF) * var3 + ((class28.field480.field3347 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class175.field2372 & 0xFF00) * var3 + (class28.field480.field3347 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class108.field1416 = (class28.field480.field3340 - class161.field2096) * var6 + class161.field2096;
                class126.field1645 = (class28.field480.field3337 - class217.field3033) * var6 + class217.field3033;
                class409.field5952 = ((class188.field2565 & 0xFF00FF) * var3 + (class28.field480.field3338 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class188.field2565 & 0xFF00) * var3 + (class28.field480.field3338 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class128.field1666 = (class28.field480.field3329 - class390.field5700) * var6 + class390.field5700;
                class384.field5617 = (class28.field480.field3335 - class123.field1593) * var6 + class123.field1593;
                class301.field4540 = (class28.field480.field3327 - class31.field509) * var6 + class31.field509;
                class333.field4902 = (class28.field480.field3344 - class264.field3869) * var6 + class264.field3869;
                class290.field4342 = class186.field2539 * var3 + class28.field480.field3330 * var4 >> 8;
                if (class243.field3405 != class28.field480.field3331) {
                    class422.field6134 = class117.field1529.method467(class243.field3405, class28.field480.field3331, var6, class422.field6134);
                }
            }
            class119.field1547 = var1;
        }
        if (arg0) {
            field4573 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(Z)V", line = 74)
    public static void method2041(boolean arg0) {
        field4573 = null;
        if (!arg0) {
            method2040(false);
        }
    }
}
