import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class89 extends class35 {

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/awt/Frame;Lvj;I)V")
    public static final void method664(Frame arg0, class177 arg1, int arg2) {
        field1415++;
        while (true) {
            class131 var3 = arg1.method1371(arg2 ^ 0xFFFFFFFE, arg0);
            while (var3.field2121 == 0) {
                class134.method1106(10L, arg2 + 11);
            }
            if (var3.field2121 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                if (arg2 != -1) {
                    return;
                }
                return;
            }
            class134.method1106(100L, arg2 + 11);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)I")
    public static final int method665(int arg0, int arg1, int arg2) {
        field1414++;
        if (arg2 < 31) {
            return 45;
        } else {
            int var3 = arg0 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
    public static final void method666(byte arg0) {
        if (class41.field635 && class33.field482[81] && class389.field5591 > 2) {
            class268.method1910((byte) 76, (class278) class276.field4153.field322.field497.field497);
        } else {
            class268.method1910((byte) 63, (class278) class276.field4153.field322.field497);
        }
        if (arg0 == 86) {
            field1417++;
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
    public static final void method667(int arg0) {
        if (arg0 != 81) {
            method664((Frame) null, (class177) null, 69);
        }
        class397.field5823.method106((byte) -123);
        field1412++;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1416 = arg0;
        this.field1413 = arg1;
    }
}
