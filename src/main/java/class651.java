import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class651 extends class656 {

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field8636;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3552(int arg0) {
        field8637++;
        if (class453.field6187 != null) {
            class453.field6187.method1795(0);
        }
        if (class507.field6770 != null) {
            class507.field6770.method1795(0);
        }
        if (arg0 == -25926) {
            ;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 21)
    public class651() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V", line = 24)
    public class651(int arg0) {
        this.field8636 = arg0;
    }
}
