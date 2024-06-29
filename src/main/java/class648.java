import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class648 {

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Z")
    public boolean field8955;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "F")
    public static float field8952;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Lkga;")
    public class556 field8954;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lkga;")
    public class556 field8959;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Z")
    public boolean field8951;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "[[Lir;")
    public static class27[][] field8957;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 4)
    public final void method3598(int arg0) {
        if (this.field8959 != null) {
            this.field8959.method1758((byte) 107);
        }
        if (arg0 != -65) {
            method3599((byte) 42);
        }
        field8958++;
        this.field8951 = false;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3599(byte arg0) {
        field8953++;
        if (class543.field7438) {
            return;
        }
        int var1 = -10 / ((arg0 + 13) / 51);
        if (class602.field8408.field4332) {
            class565.field7707 = ((int) class565.field7707 - 65 & 0xFFFFFF80);
        } else {
            class340.field4574 += (-class340.field4574 - 24.0F) / 2.0F;
        }
        class543.field7438 = true;
        class634.field8770 = true;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 49)
    public static void method3600(int arg0) {
        field8957 = null;
        if (arg0 != -128) {
            field8957 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)Z", line = 61)
    public final boolean method3601(int arg0) {
        field8956++;
        int var2 = 8 % ((arg0 + 61) / 55);
        return this.field8951 && !this.field8955;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Z)V", line = 72)
    public class648(boolean arg0) {
        this.field8955 = arg0;
    }
}
