import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public abstract class class674 extends class281 {

    @OriginalMember(owner = "client!it", name = "A", descriptor = "I")
    public int field9470;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "Lpj;")
    public class157 field9471;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "[[B")
    public static byte[][] field9467 = new byte[250][];

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public static int field9468 = 0;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[B")
    public static byte[] field9469;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I", line = 12)
    public static final int method3747(int arg0, int arg1) {
        return class261.field3883 == null ? 0 : class261.field3883[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(B)V", line = 16)
    public static void method3748(byte arg0) {
        field9467 = null;
        int var1 = 89 % ((66 - arg0) / 54);
        field9469 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lpj;I)V", line = 30)
    public class674(class157 arg0, int arg1) {
        this.field9470 = arg1;
        this.field9471 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method835(boolean arg0);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z")
    public abstract boolean method834(int arg0);
}
