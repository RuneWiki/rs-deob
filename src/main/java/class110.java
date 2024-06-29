import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class110 extends class135 {

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1666 = "Starting 3d Library";

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "[Z")
    public static boolean[] field1675 = new boolean[100];

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "C")
    private char field1672;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Lfg;")
    public static class12 field1668;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "Ljava/lang/String;")
    public String field1677;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[[[B")
    public static byte[][][] field1665;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
    public final boolean method718(int arg0) {
        field1673++;
        if (arg0 == -12877) {
            return this.field1672 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method719(byte arg0) {
        field1666 = null;
        field1668 = null;
        if (arg0 <= 74) {
            method720(-92, 43);
        }
        field1675 = null;
        field1665 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    public static final int method720(int arg0, int arg1) {
        if (arg0 >= -91) {
            return 70;
        } else {
            field1671++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llj;ZI)V")
    private final void method721(class25 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1668 = null;
        }
        field1664++;
        if (arg2 == 1) {
            this.field1672 = class272.method1835(arg0.method188(69), (byte) -110);
        } else if (arg2 == 2) {
            this.field1667 = arg0.method214((byte) 44);
            return;
        } else if (arg2 == 5) {
            this.field1677 = arg0.method189(!arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static final void method722(int arg0) {
        if (class239.field3821 != null) {
            class239.field3821.method395((byte) 116);
        }
        field1676++;
        if (class54.field739 != null) {
            class54.field739.method395((byte) 116);
        }
        if (arg0 != -28930) {
            return;
        }
        class242.method1634(class16.field192, 2, 22050, (byte) -120);
        class239.field3821 = class253.method1698(class86.field1364, -119, 0, class2.field23, 22050);
        class239.field3821.method396(class52.field717, 255);
        class54.field739 = class253.method1698(class86.field1364, -40, 1, class2.field23, 2048);
        class54.field739.method396(class130.field1907, 255);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llj;I)V")
    public final void method723(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                field1670++;
                if (arg1 > -59) {
                    this.method718(14);
                    return;
                }
                return;
            }
            this.method721(arg0, true, var3);
        }
    }
}
