import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class731 extends class656 {

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public int field10138;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public int field10135;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Lro;")
    public static class2 field10136 = new class2();

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lqj;")
    public static class512 field10137 = new class512();

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 10)
    public static void method4097(int arg0) {
        if (arg0 != -20099) {
            field10136 = null;
        }
        field10137 = null;
        field10136 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(II)V", line = 21)
    public class731(int arg0, int arg1) {
        this.field10138 = arg0;
        this.field10135 = arg1;
    }
}
