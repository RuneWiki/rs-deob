import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class412 extends class101 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5358 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "B")
    public static byte field5357;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lef;")
    public class412 field5353;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lef;")
    public class412 field5355;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method2352(byte arg0) {
        field5358 = null;
        int var1 = -23 % ((arg0 + 29) / 49);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lkj;I)I")
    public static final int method2353(class484 arg0, int arg1) {
        field5352++;
        if (arg1 >= -66) {
            method2354(-38, null, 122);
        }
        int var2 = arg0.method2813(2, 115);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2813(5, 106);
        } else if (var2 == 2) {
            var3 = arg0.method2813(8, 108);
        } else {
            var3 = arg0.method2813(11, 110);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method2354(int arg0, short[] arg1, int arg2) {
        field5354++;
        if (arg0 == -8131) {
            short[] var3 = new short[arg2];
            class345.method1933(arg1, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public final void method2355(byte arg0) {
        field5356++;
        if (this.field5355 == null) {
            return;
        }
        if (arg0 != -41) {
            this.field5355 = null;
        }
        this.field5355.field5353 = this.field5353;
        this.field5353.field5355 = this.field5355;
        this.field5353 = null;
        this.field5355 = null;
    }
}
