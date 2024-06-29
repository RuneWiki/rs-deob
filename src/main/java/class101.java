import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class101 extends class417 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Z")
    public boolean field1462 = false;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field1463 = -1;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lh;")
    public static class572 field1464 = new class572("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lsd;")
    public static class80 field1468;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method765(byte arg0) {
        field1468 = null;
        int var1 = -76 % ((-arg0 - 58) / 47);
        field1464 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        this.field1463 = arg0;
    }
}
