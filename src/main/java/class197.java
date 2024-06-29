import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class197 {

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2615 = new Hashtable();

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lgda;")
    public static class53 field2616 = new class53(27, 3);

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 13)
    public static void method1211(int arg0) {
        field2616 = null;
        int var1 = 52 / ((arg0 + 53) / 47);
        field2615 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)I")
    public abstract int method1209(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
    public abstract void method1210(byte arg0, int arg1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1212(int arg0, int arg1);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Leg;")
    public abstract class107 method1213(int arg0);
}
