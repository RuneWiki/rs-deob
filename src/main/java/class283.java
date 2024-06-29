import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class283 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static final void method1850(int arg0) {
        class59.field791 = new class499[class70.field973.method2649(arg0 - 116)][];
        if (arg0 == 0) {
            field4226++;
            class471.field6886 = new class499[class70.field973.method2649(-75)][];
            class270.field3738 = new boolean[class70.field973.method2649(49)];
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI[S)[S")
    public static final short[] method1851(byte arg0, int arg1, short[] arg2) {
        field4227++;
        short[] var3 = new short[arg1];
        if (arg0 == -34) {
            class361.method2285(arg2, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    static {
        new class375("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
