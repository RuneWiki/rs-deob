import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class class460 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Ljaa;")
    public class576 field5744;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field5746 = 0;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIB)V")
    public abstract void method18(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static final void method2531(byte arg0) {
        if (class227.field2939 < 0) {
            class103.field1316 = -1;
            class227.field2939 = 0;
            class80.field1043 = -1;
        }
        if (arg0 != 44) {
            field5746 = -34;
        }
        field5745++;
        if (class227.field2939 > class604.field8123) {
            class80.field1043 = -1;
            class103.field1316 = -1;
            class227.field2939 = class604.field8123;
        }
        if (class537.field6759 < 0) {
            class537.field6759 = 0;
            class80.field1043 = -1;
            class103.field1316 = -1;
        }
        if (class604.field8137 < class537.field6759) {
            class537.field6759 = class604.field8137;
            class80.field1043 = -1;
            class103.field1316 = -1;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ljaa;)V")
    public class460(class576 arg0) {
        this.field5744 = arg0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public abstract void method15(int arg0);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILtj;)V")
    public abstract void method19(int arg0, int arg1, class185 arg2);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V")
    public abstract void method13(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)V")
    public abstract void method17(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
    public abstract boolean method16(int arg0);
}
