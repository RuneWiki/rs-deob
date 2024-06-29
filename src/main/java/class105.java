import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class105 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "J")
    public long field1409;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lrl;")
    private class487 field1413;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field1410;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method630(int arg0) {
        if (arg0 != 30954) {
            field1410 = null;
        }
        field1410 = null;
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1413.method2870(true, this.field1409);
        field1414++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILsq;)Z")
    public static final boolean method631(int arg0, class113 arg1) {
        field1415++;
        class486 var2 = class114.field1471.method2132((byte) 123, arg1.method369((byte) 25));
        if (var2.field7069 == -1) {
            return true;
        } else if (arg0 >= -116) {
            return false;
        } else {
            class203 var3 = class281.field4023.method1264(var2.field7069, (byte) 103);
            return var3.field2817 == -1 ? true : var3.method1253(true);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lrl;J[Lmt;)V")
    public class105(class487 arg0, long arg1, class260[] arg2) {
        this.field1409 = arg1;
        this.field1413 = arg0;
    }
}
