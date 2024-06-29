import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class267 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lad;")
    public static class275 field4326 = new class275(64);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "S")
    public static short field4329 = 256;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[J")
    public static long[] field4330 = new long[1000];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)Lue;")
    public static final class93 method1784(int arg0, boolean arg1) {
        field4327++;
        class93 var2 = (class93) class257.field4232.method1879(8887, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1329.method1156(30, arg0, (byte) -16);
        if (arg1) {
            field4326 = null;
        }
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method649(new class274(var3), arg0, (byte) 84);
        }
        class257.field4232.method1883((long) arg0, -88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        if (arg0 >= 60) {
            field4330 = null;
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    public static final int method1786(int arg0, int arg1, int arg2) {
        class74 var3 = (class74) class57.field829.method371(-105, (long) arg1);
        if (arg2 != 256) {
            method1784(30, false);
        }
        field4328++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field1187.length > arg0) {
            return var3.field1187[arg0];
        } else {
            return -1;
        }
    }
}
