import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class554 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Ltq;")
    public static class654 field7639 = new class654("", 13);

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Ljb;")
    public static class519 field7644 = new class519(16, -2);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public int field7640;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lgm;")
    public static class134 field7645;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field7641;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLdt;)V", line = 3)
    private final void method3182(int arg0, byte arg1, class254 arg2) {
        field7636++;
        if (arg0 == 1) {
            this.field7643 = arg2.method1728((byte) 101);
            this.field7640 = arg2.method1731((byte) 64);
            this.field7642 = arg2.method1731((byte) 64);
        }
        if (arg1 != -6) {
            this.method3182(47, (byte) 97, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 28)
    public static void method3183(boolean arg0) {
        field7641 = null;
        field7645 = null;
        if (!arg0) {
            field7641 = null;
        }
        field7644 = null;
        field7639 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLdt;)V", line = 41)
    public final void method3184(byte arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field7637++;
                if (arg0 > -79) {
                    field7639 = null;
                    return;
                }
                return;
            }
            this.method3182(var3, (byte) -6, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 61)
    public static final void method3185(int arg0) {
        field7638++;
        if (!class446.field6417) {
            int var1 = 53 % ((84 - arg0) / 36);
            class49.field495 += (12.0F - class49.field495) / 2.0F;
            class7.field61 = true;
            class446.field6417 = true;
        }
    }
}
