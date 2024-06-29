import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class468 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "B")
    public byte field6767 = 0;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "B")
    public byte field6765;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "B")
    public byte field6773;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "S")
    public short field6759;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "S")
    public short field6776;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field6755 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Ldc;")
    public static class5 field6754 = new class5(4);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "B")
    public byte field6758;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "B")
    public byte field6760;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "B")
    public byte field6771;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "B")
    public byte field6775;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lbv;")
    public class191 field6764;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Luf;")
    public class296 field6770;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lkp;")
    public class323 field6769;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Let;")
    public class403 field6766;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Let;")
    public class403 field6778;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lab;")
    public class455 field6772;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "Lab;")
    public class455 field6777;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Lhg;")
    public class468 field6779;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lfg;")
    public class79 field6761;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "S")
    public short field6774;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
    public boolean field6756;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
    public boolean field6757;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
    public boolean field6768;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V", line = 3)
    public class468(int arg0, int arg1, int arg2) {
        this.field6773 = this.field6765 = (byte) arg0;
        this.field6759 = (short) arg1;
        this.field6776 = (short) arg2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 18)
    public static void method2739(byte arg0) {
        field6754 = null;
        if (arg0 <= 61) {
            field6755 = -19;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 36)
    public final void method2740(int arg0) {
        field6762++;
        int var2 = 101 % ((arg0 - 30) / 62);
        while (this.field6769 != null) {
            class323 var3 = this.field6769.field4727;
            this.field6769.method1938(-243);
            this.field6769 = var3;
        }
        this.field6767 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 77)
    public static final void method2741(int arg0) {
        if (arg0 < 126) {
            return;
        }
        field6763++;
        if (class497.field7577 == 0) {
            return;
        }
        try {
            if ((++class455.field6628) > 2000) {
                if (class22.field294 != null) {
                    class22.field294.method2123(120);
                    class22.field294 = null;
                }
                if (class148.field1918 >= 1) {
                    class497.field7577 = 0;
                    class379.field5660 = -5;
                    return;
                }
                class497.field7577 = 1;
                if (class389.field5780 == class140.field1834) {
                    class140.field1834 = class265.field3762;
                } else {
                    class140.field1834 = class389.field5780;
                }
                class148.field1918++;
                class455.field6628 = 0;
            }
            if (class497.field7577 == 1) {
                class293.field4177 = class86.field1182.method333(class140.field1834, (byte) 111, class406.field5955);
                class497.field7577 = 2;
            }
            if (class497.field7577 == 2) {
                if (class293.field4177.field6417 == 2) {
                    throw new IOException();
                }
                if (class293.field4177.field6417 != 1) {
                    return;
                }
                class22.field294 = new class350((Socket) class293.field4177.field6416, class86.field1182);
                class293.field4177 = null;
                class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                class53.method400((byte) -71);
                int var1 = class22.field294.method2122((byte) -37);
                class53.method400((byte) -71);
                if (var1 != 21) {
                    class379.field5660 = var1;
                    class497.field7577 = 0;
                    class22.field294.method2123(117);
                    class22.field294 = null;
                    return;
                }
                class497.field7577 = 3;
            }
            if (class497.field7577 == 3) {
                if (class22.field294.method2120(115) < 1) {
                    return;
                }
                class97.field1312 = new String[class22.field294.method2122((byte) -37)];
                class497.field7577 = 4;
            }
            if (class497.field7577 == 4 && class22.field294.method2120(125) >= (class97.field1312.length * 8)) {
                class234.field3288.field2018 = 0;
                class22.field294.method2125(class97.field1312.length * 8, (byte) -55, class234.field3288.field2041, 0);
                for (int var2 = 0; var2 < class97.field1312.length; var2++) {
                    class97.field1312[var2] = class222.method1374(class234.field3288.method975(-99), (byte) 76);
                }
                class497.field7577 = 0;
                class379.field5660 = 21;
                class22.field294.method2123(-42);
                class22.field294 = null;
            }
        } catch (IOException var3) {
            if (class22.field294 != null) {
                class22.field294.method2123(118);
                class22.field294 = null;
            }
            if (class148.field1918 < 1) {
                class455.field6628 = 0;
                class497.field7577 = 1;
                if (class389.field5780 == class140.field1834) {
                    class140.field1834 = class265.field3762;
                } else {
                    class140.field1834 = class389.field5780;
                }
                class148.field1918++;
            } else {
                class497.field7577 = 0;
                class379.field5660 = -4;
            }
        }
    }
}
