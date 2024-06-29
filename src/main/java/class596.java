import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class596 extends class536 {

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public int field8393 = (int) (class557.method3157(-82) / 1000L);

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "S")
    public short field8391;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "Ljava/lang/String;")
    public String field8395;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "J")
    public static long field8394 = 0L;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class596(String arg0, int arg1) {
        this.field8391 = (short) arg1;
        this.field8395 = arg0;
    }
}
