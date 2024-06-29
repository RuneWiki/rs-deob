import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class325 extends class428 {

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[B")
    public static byte[] field4686 = new byte[32896];

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public static int[] field4688;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lag;")
    public class325 field4684;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lag;")
    public class325 field4689;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4686[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4688 = new int[] { 28, 35, 40, 44 };
        field4690 = -1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1976(int arg0) {
        if (class50.field653 != -1) {
            class281.method1770(class50.field653, -1, -1, (byte) 18, false);
            class50.field653 = -1;
        }
        field4687++;
        if (arg0 != -19534) {
            method1979((byte) 32);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V", line = 22)
    public final void method1977(boolean arg0) {
        if (!arg0) {
            field4690 = 7;
        }
        field4685++;
        if (this.field4689 != null) {
            this.field4689.field4684 = this.field4684;
            this.field4684.field4689 = this.field4689;
            this.field4684 = null;
            this.field4689 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 64)
    public static void method1978(byte arg0) {
        field4688 = null;
        field4686 = null;
        int var1 = -120 / ((44 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 76)
    public static final void method1979(byte arg0) {
        if (arg0 != -102) {
            return;
        }
        field4683++;
        if (class145.field1754 != class142.field1725) {
            try {
                class336.method2038(class310.field4546, -128, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }
}
