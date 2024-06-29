import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class213 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[B")
    public static byte[] field3190 = new byte[32896];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lqe;")
    public static class469 field3191;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method1446(boolean arg0) {
        field3189++;
        if (class87.field1246 == 7) {
            class109.method812(false, (byte) 110);
        } else if (arg0) {
            class262.field3718 = class533.field7668;
            class533.field7668 = null;
            class49.method363(13, 108);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1447(int arg0) {
        if (arg0 != -6937) {
            method1447(-90);
        }
        field3191 = null;
        field3190 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3190[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field3191 = new class469(14, 2);
    }
}
