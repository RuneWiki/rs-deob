import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class50 extends InputStream {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field781 = -1;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field784 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lcn;")
    public static class37 field783;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method480(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            class99.field1491.method1628((byte) -44, 139);
            class91.field1353++;
        }
        field785++;
        if (arg1 == 1) {
            class99.field1491.method1628((byte) -35, 128);
            class207.field3179++;
        }
        class99.field1491.method278(-14598, ++class252.field3888);
        class99.field1491.method258(class358.field5696 + arg2, (byte) 78);
        class99.field1491.method278(-14598, class116.field1774[82] ? 1 : 0);
        if (arg3 <= -28) {
            class99.field1491.method306(class49.field755 + arg0, 127);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 36)
    public static void method481(byte arg0) {
        field784 = null;
        if (arg0 != -90) {
            method483(65, 26, 103);
        }
        field783 = null;
    }

    @OriginalMember(owner = "client!jf", name = "read", descriptor = "()I", line = 47)
    public final int read() {
        class188.method1443(10, 30000L);
        field779++;
        return -1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnc;Z)I", line = 57)
    public static final int method482(class171 arg0, boolean arg1) {
        field786++;
        if (!arg1) {
            method482((class171) null, false);
        }
        int var2 = arg0.field2703;
        class109 var3 = arg0.method813((byte) 101);
        if (arg0.field1350 == var3.field1663) {
            var2 = arg0.field2723;
        } else if (arg0.field1350 == var3.field1673 || arg0.field1350 == var3.field1660 || arg0.field1350 == var3.field1635 || arg0.field1350 == var3.field1652) {
            var2 = arg0.field2708;
        } else if (arg0.field1350 == var3.field1666 || arg0.field1350 == var3.field1634 || arg0.field1350 == var3.field1656 || arg0.field1350 == var3.field1649) {
            var2 = arg0.field2707;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I", line = 93)
    public static final int method483(int arg0, int arg1, int arg2) {
        field780++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (arg2 >= -105) {
            method483(47, 42, -29);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
