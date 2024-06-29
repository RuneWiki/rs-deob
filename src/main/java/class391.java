import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class391 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    private int field5726 = 0;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Lke;")
    private class407 field5731;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5727 = 0;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "F")
    public static float field5732;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Lol;")
    private class179 field5730;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Lol;", line = 4)
    public final class179 method2329(int arg0) {
        field5728++;
        this.field5726 = 0;
        if (arg0 != 19650) {
            method2331(false);
        }
        return this.method2330((byte) -89);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Lol;", line = 16)
    public final class179 method2330(byte arg0) {
        field5725++;
        if (arg0 != -89) {
            return null;
        } else if (this.field5726 <= 0 || this.field5731.field5903[this.field5726 - 1] == this.field5730) {
            while (this.field5731.field5914 > this.field5726) {
                class179 var3 = this.field5731.field5903[this.field5726++].field2799;
                if (this.field5731.field5903[this.field5726 - 1] != var3) {
                    this.field5730 = var3.field2799;
                    return var3;
                }
            }
            return null;
        } else {
            class179 var2 = this.field5730;
            this.field5730 = var2.field2799;
            return var2;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method2331(boolean arg0) {
        if (arg0) {
            class57.field973.method1761(-107);
            field5729++;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lke;)V", line = 74)
    public class391(class407 arg0) {
        this.field5731 = arg0;
    }
}
