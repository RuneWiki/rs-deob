import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class77 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[[[I")
    public static int[][][] field1218;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method610(byte arg0) {
        if (arg0 <= 47) {
            method612(75, -24);
        }
        field1218 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)Z")
    public static final boolean method611(int arg0, boolean arg1) {
        if (arg1) {
            field1219++;
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lnl;")
    public static final class260 method612(int arg0, int arg1) {
        class260 var2 = (class260) class207.field3105.method675(31558, (long) arg0);
        field1217++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class223.field3469.method1605(-125, arg0, arg1);
        class260 var4 = new class260();
        if (var3 != null) {
            var4.method1755(new class54(var3), -1);
        }
        class207.field3105.method677((byte) -60, (long) arg0, var4);
        return var4;
    }
}
