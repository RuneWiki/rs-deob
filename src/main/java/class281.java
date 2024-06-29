import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class281 {

    @OriginalMember(owner = "client!t", name = "d", descriptor = "J")
    public static long field4601 = 0L;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Z")
    public static boolean field4606 = true;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "B")
    public byte field4598;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Ljava/lang/String;")
    public String field4599;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/lang/String;")
    public String field4603;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Ljava/lang/String;")
    public String field4605;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 14)
    public static final void method2001(int arg0, int arg1, int arg2) {
        field4600++;
        class199 var3 = class173.method1231(false, arg1, arg0);
        var3.method1367((byte) 127);
        var3.field3338 = arg2;
    }
}
