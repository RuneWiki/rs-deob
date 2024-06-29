import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class250 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
    public static boolean field4416 = true;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lha;")
    public static class46 field4421 = class271.method1828(")3)3)3", -46);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field4421 = null;
        if (arg0 != 0) {
            field4416 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)[B")
    public abstract byte[] method275(byte arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lag;")
    public static final class185 method1698(int arg0, int arg1) {
        if (arg1 != 13942) {
            field4421 = null;
        }
        field4418++;
        class185 var2 = (class185) class150.field2677.method1364((long) arg0, -21987);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field4155.method1293(arg0, 11, (byte) -87);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1334(false, new class75(var3));
        }
        class150.field2677.method1366(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BB)V")
    public abstract void method276(byte[] arg0, byte arg1);
}
