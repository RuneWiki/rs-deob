import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class307 extends class513 {

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public int field4072 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public int field4071 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public int field4077 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field4075 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field4074 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field4078 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public int field4076 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public int field4079 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lff;")
    public class9 field4081;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(III)Z")
    public final boolean method1814(int arg0, int arg1, int arg2) {
        field4080++;
        if (this.field4074 <= arg0 && arg0 <= this.field4078 && arg1 >= this.field4072 && this.field4079 >= arg1) {
            return true;
        } else if (arg0 >= this.field4071 && arg0 <= this.field4077 && arg1 >= this.field4076 && arg1 <= this.field4075) {
            return true;
        } else {
            if (arg2 != Integer.MAX_VALUE) {
                this.field4078 = -63;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lff;)V")
    public class307(class9 arg0) {
        this.field4081 = arg0;
    }
}
