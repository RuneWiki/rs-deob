import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class513 {

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "[I")
    public static int[] field7139 = new int[25];

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)Lpo;", line = 4)
    public static final class558 method3003(boolean arg0, int arg1) {
        field7138++;
        class558 var2 = (class558) class380.field5523.method992((long) arg1, -78);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1402.method863(-1860, 1, arg1);
        class558 var4 = new class558();
        if (arg0) {
            method3004(64);
        }
        var4.field7728 = arg1;
        if (var3 != null) {
            var4.method3208(83, new class215(var3));
        }
        var4.method3209(-1);
        if (var4.field7721 == 2 && class275.field3864.method1465((long) arg1, -6008) == null) {
            class275.field3864.method1468((byte) 87, (long) arg1, new class113(class115.field1975));
            class207.field2970[class115.field1975++] = var4;
        }
        class380.field5523.method991(var4, (long) arg1, (byte) -109);
        return var4;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V", line = 48)
    public static void method3004(int arg0) {
        field7139 = null;
        if (arg0 != 1) {
            method3004(-45);
        }
    }
}
