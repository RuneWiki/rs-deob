import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class501 extends class417 {

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lfp;")
    public static class271 field7106 = new class271(0);

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
    public long field7109;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Lpm;")
    public class501 field7110;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Lpm;")
    public class501 field7112;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static void method2986(int arg0) {
        if (arg0 != -1) {
            method2988(false, 67);
        }
        field7106 = null;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
    public final void method2987(int arg0) {
        if (arg0 != -1) {
            method2988(false, -4);
        }
        field7111++;
        if (this.field7112 != null) {
            this.field7112.field7110 = this.field7110;
            this.field7110.field7112 = this.field7112;
            this.field7112 = null;
            this.field7110 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
    public static final void method2988(boolean arg0, int arg1) {
        field7107++;
        class402.method2367(class309.field4267, (byte) 88);
        class512.field7295++;
        class243 var2 = (class243) class385.field5297.method2798((byte) -82);
        if (arg1 != 29694) {
            return;
        }
        while (var2 != null) {
            if (!var2.method2453(64)) {
                var2 = (class243) class385.field5297.method2798((byte) -59);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3469 == 0) {
                class321.method1935(arg0, var2, (byte) 70, true);
            }
            var2 = (class243) class385.field5297.method2806(true);
        }
        if (class230.field3374 != null) {
            class403.method2371(class230.field3374, (byte) -62);
            class230.field3374 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)Z")
    public final boolean method2989(boolean arg0) {
        if (arg0) {
            this.field7112 = null;
        }
        field7108++;
        return this.field7112 != null;
    }
}
