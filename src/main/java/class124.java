import java.awt.Component;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class124 implements class48 {

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Loh;")
    private class404 field1304;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1306 = new Hashtable();

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
    public final int method278(boolean arg0) {
        field1305++;
        if (this.field1304.method2479((byte) -116)) {
            return 100;
        } else if (arg0) {
            return this.field1304.method2487(-100);
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static void method795(int arg0) {
        if (arg0 != 18666) {
            field1306 = null;
        }
        field1306 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lvca;")
    public final class279 method279(byte arg0) {
        field1307++;
        return arg0 == -127 ? class279.field3420 : null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Loh;)V")
    public class124(class404 arg0) {
        this.field1304 = arg0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Component;I)Lvw;")
    public static final class304 method796(Component arg0, int arg1) {
        field1303++;
        int var2 = 40 % ((22 - arg1) / 49);
        return new class277(arg0);
    }
}
