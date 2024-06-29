import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class511 extends class260 {

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Ljava/lang/String;")
    public String field7571;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lar;")
    public static class479 field7570 = new class479();

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Lwj;")
    public static class270 field7574 = new class270(23, 8);

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "[I")
    public static int[] field7577 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Ll;")
    public static class16 field7573;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Lks;")
    public static class303 field7575;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 8)
    public static void method3054(byte arg0) {
        field7575 = null;
        field7577 = null;
        field7574 = null;
        if (arg0 > -53) {
            field7570 = null;
        }
        field7570 = null;
        field7573 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method3055(boolean arg0) {
        field7572++;
        int[] var1 = new int[class328.field4480.field7676];
        int var2 = 0;
        if (!arg0) {
            method3054((byte) -115);
        }
        for (int var3 = 0; var3 < class328.field4480.field7676; var3++) {
            class508 var5 = class328.field4480.method3091(59, var3);
            if (var5.field7494 >= 0 || var5.field7523 >= 0) {
                var1[var2++] = var3;
            }
        }
        class132.field1929 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class132.field1929[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 66)
    public class511() {
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 72)
    public class511(String arg0, int arg1) {
        this.field7571 = arg0;
    }
}
