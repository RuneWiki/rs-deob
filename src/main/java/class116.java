import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class116 extends class159 {

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Z")
    public boolean field1566;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "Lvaa;")
    public class494 field1570;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Ljea;")
    public static class474 field1561 = new class474(11, 8);

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Ljb;")
    public static class519 field1565 = new class519(74, 11);

    @OriginalMember(owner = "client!er", name = "s", descriptor = "Ljb;")
    public static class519 field1569 = new class519(50, 6);

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Z")
    public boolean field1564;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "Z")
    public boolean field1567;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "Z")
    public boolean field1568;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 6)
    public static void method843(byte arg0) {
        if (arg0 == -125) {
            field1561 = null;
            field1565 = null;
            field1569 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(ILvaa;IZ)V", line = 37)
    public class116(int arg0, class494 arg1, int arg2, boolean arg3) {
        this.field1566 = arg3;
        this.field1563 = arg0;
        this.field1562 = arg2;
        this.field1570 = arg1;
    }
}
