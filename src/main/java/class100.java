import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class100 extends class561 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lmaa;")
    public class42 field1333;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[I")
    public static int[] field1334 = new int[6];

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "F")
    public static float field1336;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static void method558(boolean arg0) {
        field1334 = null;
        if (!arg0) {
            method558(true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Z")
    public abstract boolean method448(int arg0);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method449(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lmaa;I)V")
    public class100(class42 arg0, int arg1) {
        this.field1337 = arg1;
        this.field1333 = arg0;
    }
}
