import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class45 {

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    private int field629 = 0;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "Lbc;")
    private class9 field633;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lfaa;")
    private class424 field632;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZLoi;)Ljava/lang/String;", line = 7)
    public static final String method419(boolean arg0, class57 arg1) {
        field628++;
        if (arg0) {
            return null;
        } else if (arg1.field770 == null || arg1.field770.length() <= 0) {
            return arg1.field761;
        } else {
            return arg1.field761 + class604.field8156.method3280((byte) -73, class144.field1890) + arg1.field770;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)Lfaa;", line = 22)
    public final class424 method420(int arg0) {
        this.field629 = arg0;
        field630++;
        return this.method421(66);
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)Lfaa;", line = 35)
    public final class424 method421(int arg0) {
        field631++;
        if (arg0 < 52) {
            return null;
        } else if (this.field629 <= 0 || this.field633.field98[this.field629 - 1] == this.field632) {
            while (this.field633.field95 > this.field629) {
                class424 var3 = this.field633.field98[this.field629++].field5500;
                if (this.field633.field98[this.field629 - 1] != var3) {
                    this.field632 = var3.field5500;
                    return var3;
                }
            }
            return null;
        } else {
            class424 var2 = this.field632;
            this.field632 = var2.field5500;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIILpga;)V", line = 68)
    public static final void method422(int arg0, int arg1, int arg2, class152 arg3) {
        class530 var4 = class331.method1910(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6878 = arg3;
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V", line = 80)
    public class45() {
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lbc;)V", line = 83)
    public class45(class9 arg0) {
        this.field633 = arg0;
    }
}
