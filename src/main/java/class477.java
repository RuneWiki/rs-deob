import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class477 extends class617 {

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Lso;")
    public class276 field6872;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public int field6874;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Lcq;")
    public static class110 field6871 = new class110(44, -1);

    @OriginalMember(owner = "client!en", name = "z", descriptor = "J")
    public static volatile long field6873 = 0L;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method807(int arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public static void method2748(byte arg0) {
        field6871 = null;
        int var1 = -74 % ((-arg0 - 84) / 41);
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)Z")
    public abstract boolean method808(int arg0);

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lso;I)V")
    public class477(class276 arg0, int arg1) {
        this.field6872 = arg0;
        this.field6874 = arg1;
    }
}
