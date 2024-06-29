import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class749 {

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
    public boolean field10340;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Lae;")
    public static class283 field10343;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lpm;")
    public class614 field10338;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lpm;")
    public class614 field10342;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field10341;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Z")
    public boolean field10336;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public static void method4148(boolean arg0) {
        field10341 = null;
        if (arg0) {
            method4148(false);
        }
        field10343 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z")
    public final boolean method4149(byte arg0) {
        field10344++;
        if (arg0 > -114) {
            this.method4150(124);
        }
        return this.field10336 && !this.field10340;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method4150(int arg0) {
        if (arg0 != 29276) {
            return;
        }
        if (this.field10342 != null) {
            this.field10342.method1125(47);
        }
        field10339++;
        this.field10336 = false;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Z)V")
    public class749(boolean arg0) {
        this.field10340 = arg0;
    }
}
