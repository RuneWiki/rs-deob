import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class366 extends class65 {

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public volatile int field5583 = -1;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field5582;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V", line = 9)
    public static final void method2345(int arg0, int arg1, int arg2) {
        int var3 = -70 / ((4 - arg2) / 46);
        field5579++;
        class118 var4 = class86.method755(true, 5, arg0);
        var4.method933((byte) 46);
        var4.field1811 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 25)
    public class366(String arg0) {
        this.field5582 = arg0;
    }
}
