import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class723 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lut;")
    private class136 field10139;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public static boolean field10141 = false;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lhc;")
    private class152 field10138;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method4088(byte arg0) {
        field10142++;
        class268.field3168 = 1;
        if (arg0 != -10) {
            method4088((byte) -26);
        }
        class506.field7198 = -1;
        class571.method3312(class513.field7244, class513.field7244.equals(""), true, "", -116);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Lhc;", line = 18)
    public final class152 method4089(int arg0) {
        field10140++;
        if (arg0 != -1) {
            this.field10139 = null;
        }
        class152 var2 = this.field10139.field1703.field1903;
        if (this.field10139.field1703 == var2) {
            this.field10138 = null;
            return null;
        } else {
            this.field10138 = var2.field1903;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Lhc;", line = 47)
    public final class152 method4090(int arg0) {
        field10143++;
        class152 var2 = this.field10138;
        if (this.field10139.field1703 == var2) {
            this.field10138 = null;
            return null;
        }
        this.field10138 = var2.field1903;
        if (arg0 != -1) {
            this.field10139 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 73)
    public class723() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lut;)V", line = 75)
    public class723(class136 arg0) {
        this.field10139 = arg0;
    }
}
