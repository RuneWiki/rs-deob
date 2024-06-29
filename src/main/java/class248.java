import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class248 extends class656 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljava/lang/String;")
    public String field3436;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3437 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "[Lfha;")
    public static class383[] field3438 = new class383[2048];

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method1528(int arg0) {
        field3438 = null;
        if (arg0 != 9554) {
            method1528(-94);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class248() {
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class248(String arg0) {
        this.field3436 = arg0;
    }
}
