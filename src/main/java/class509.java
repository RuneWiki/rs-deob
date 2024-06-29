import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class509 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "[B")
    public static byte[] field6883 = new byte[32896];

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[Lgh;")
    public static class549[] field6885;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6883[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lgv;BII)V", line = 4)
    public static final void method2827(class83 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 114) {
            field6884++;
            int[] var4 = new int[4];
            class373.method2196(var4, 0, var4.length, arg3);
            class136.method848(arg2, arg0, var4, 0);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 45)
    public static void method2828(int arg0) {
        field6885 = null;
        if (arg0 != 255) {
            method2827(null, (byte) -10, -124, -20);
        }
        field6883 = null;
    }
}
