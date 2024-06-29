import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class414 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lrda;I)V")
    public static final void method2487(class613 arg0, int arg1) {
        if (arg1 >= -64) {
            return;
        }
        field5865++;
        class58 var2 = (class58) class362.field4820.method3678((long) arg0.field2664, -126);
        if (var2 == null) {
            class679.method3852(arg0.field2689[0], (byte) -74, 0, null, arg0.field532, arg0.field2686[0], null, arg0);
        } else {
            var2.method588(93);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2488(int arg0, int arg1) {
        field5864++;
        int var2 = -122 / ((14 - arg0) / 63);
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static final void method2489(int arg0) {
        field5862++;
        if (class617.field8851 != null) {
            return;
        }
        Container var1;
        if (class646.field9189 != null) {
            var1 = class646.field9189;
        } else if (class627.field8991 == null) {
            var1 = class66.field1028;
        } else {
            var1 = class627.field8991;
        }
        class226.field2929 = var1.getSize().width;
        class417.field5913 = var1.getSize().height;
        if (class646.field9189 == var1) {
            Insets var2 = class646.field9189.getInsets();
            class417.field5913 -= var2.top + var2.bottom;
            class226.field2929 -= var2.right + var2.left;
        }
        if (class158.method996(3) == 1) {
            class467.field6533 = class589.field8535;
            class300.field4038 = class6.field60;
            class675.field9684 = 0;
            class181.field2222 = (class226.field2929 - class589.field8535) / 2;
        } else {
            class622.method3560((byte) 116);
        }
        if (class39.field729 != class215.field2737) {
            boolean var10000;
            if (class467.field6533 < 1024 && class300.field4038 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class646.field9190.setSize(class467.field6533, class300.field4038);
        if (class68.field1045 != null) {
            class68.field1045.method275(class646.field9190);
        }
        if (class646.field9189 == var1) {
            Insets var3 = class646.field9189.getInsets();
            class646.field9190.setLocation(class181.field2222 + var3.left, class675.field9684 + var3.top);
        } else {
            class646.field9190.setLocation(class181.field2222, class675.field9684);
        }
        if (arg0 == 26895) {
            if (class127.field1619 != -1) {
                class161.method1019((byte) -35, true);
            }
            class518.method3067(1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5861++;
        throw new IllegalStateException();
    }
}
