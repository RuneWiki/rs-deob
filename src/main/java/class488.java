import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class488 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Los;")
    public static class309 field7184 = new class309("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Z")
    public static boolean field7186 = false;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "[Lfm;")
    public static class519[] field7187;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2956(int arg0) {
        if (arg0 != -15926) {
            method2958((byte) 98);
        }
        if (class352.field5192 == null || class482.field7106 == null) {
            class352.field5192 = new int[256];
            class482.field7106 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class352.field5192[var1] = (int) (Math.sin(var2) * 4096.0D);
                class482.field7106[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field7185++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 41)
    public static final void method2957(byte arg0) {
        if (arg0 <= 84) {
            field7184 = null;
        }
        field7183++;
        if (class466.field6932 == 2) {
            class253.method1639(3, -16646);
        } else if (class466.field6932 == 6) {
            class253.method1639(7, -16646);
        } else if (class466.field6932 == 9) {
            class253.method1639(10, -16646);
            return;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V", line = 70)
    public static void method2958(byte arg0) {
        field7187 = null;
        field7184 = null;
        if (arg0 <= 90) {
            field7187 = null;
        }
    }
}
