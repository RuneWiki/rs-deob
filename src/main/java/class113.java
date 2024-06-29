import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class113 extends class247 {

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public int field1637 = 0;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Ldh;")
    public class158[] field1634 = new class158[5];

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public int[] field1638 = new int[5];

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Ljf;")
    public static class216 field1648 = new class216(32);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "[I")
    public static int[] field1656 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[I")
    public static int[] field1652 = new int[100];

    @OriginalMember(owner = "client!da", name = "L", descriptor = "[I")
    public static int[] field1655 = new int[200];

    @OriginalMember(owner = "client!da", name = "P", descriptor = "[B")
    public static byte[] field1658 = new byte[520];

    @OriginalMember(owner = "client!da", name = "K", descriptor = "B")
    public byte field1654;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lda;")
    public class113 field1635;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lcf;")
    public class123 field1631;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lqf;")
    public class140 field1647;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lrk;")
    public class165 field1649;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lre;")
    public class263 field1640;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Loa;")
    public class273 field1645;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lwf;")
    public class54 field1657;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lde;")
    public class58 field1650;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
    public boolean field1629;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
    public boolean field1632;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Z")
    public boolean field1644;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(III)V")
    public class113(int arg0, int arg1, int arg2) {
        this.field1630 = this.field1636 = arg0;
        this.field1633 = arg1;
        this.field1642 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1648 = null;
        if (arg0 != -7638) {
            field1653 = 18;
        }
        field1658 = null;
        field1652 = null;
        field1656 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lvl;I)V")
    public static final void method751(class73 arg0, int arg1) {
        if (arg1 == -12065) {
            field1643++;
            class118.field1708 = arg0;
        }
    }
}
