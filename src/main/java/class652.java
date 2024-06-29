import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class652 {

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "Lpf;")
    private class30 field9236;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public static int field9237 = 0;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "Ldaa;")
    private class454 field9235;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Ldaa;")
    public final class454 method3671(int arg0) {
        if (arg0 != 0) {
            this.method3671(-96);
        }
        field9239++;
        class454 var2 = this.field9236.field332.field6213;
        if (this.field9236.field332 == var2) {
            this.field9235 = null;
            return null;
        } else {
            this.field9235 = var2.field6213;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "()V")
    public class652() {
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)Ldaa;")
    public final class454 method3672(int arg0) {
        field9238++;
        class454 var2 = this.field9235;
        if (this.field9236.field332 == var2) {
            this.field9235 = null;
            return null;
        } else if (arg0 == 0) {
            this.field9235 = var2.field6213;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lpf;)V")
    public class652(class30 arg0) {
        this.field9236 = arg0;
    }
}
