import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class93 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public int field1629 = 0;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lsb;")
    private static class98 field1633 = class47.method368("purple:", 0);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lsb;")
    public static class98 field1625 = field1633;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lsb;")
    public static class98 field1627 = field1633;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lvf;")
    public static class48 field1623 = new class48();

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[Lsb;")
    public static class98[] field1636 = new class98[100];

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Z")
    public static boolean field1640 = true;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[S")
    public static short[] field1641 = new short[256];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lnj;")
    public static class82[] field1638;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method682(byte arg0) {
        field1623 = null;
        field1641 = null;
        field1625 = null;
        if (arg0 < 71) {
            method686(-89, 95, (class98) null);
        }
        field1636 = null;
        field1638 = null;
        field1639 = null;
        field1633 = null;
        field1627 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILlj;B)V")
    private final void method683(int arg0, class216 arg1, byte arg2) {
        field1631++;
        if (arg2 != 89) {
            this.method684((byte) 37, (class216) null);
        }
        if (arg0 == 5) {
            this.field1629 = arg1.method1487(83);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLlj;)V")
    public final void method684(byte arg0, class216 arg1) {
        while (true) {
            int var3 = arg1.method1446(5350);
            if (var3 == 0) {
                if (arg0 >= -64) {
                    return;
                }
                field1626++;
                return;
            }
            this.method683(var3, arg1, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method685(int arg0) {
        field1624++;
        class75.field1324.method1554((byte) -109);
        if (arg0 != -26947) {
            field1640 = false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILsb;)V")
    public static final void method686(int arg0, int arg1, class98 arg2) {
        field1628++;
        class237.field4084.method490(arg0, -93);
        class237.field4084.method1444(arg1, (byte) -81);
        class237.field4084.method1463(arg2.method727((byte) 36), (byte) -102);
        class41.field675++;
    }
}
