import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class181 extends RuntimeException {

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2700;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Ljava/lang/String;")
    public String field2696;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public static int[] field2694 = new int[32];

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
    public static boolean field2697 = false;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "S")
    public static short field2695 = 205;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lne;")
    public static class52 field2698;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
    public static boolean field2693;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1196(int arg0) {
        int var1 = -23 % ((arg0 + 47) / 62);
        field2698 = null;
        field2694 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class181(Throwable arg0, String arg1) {
        this.field2700 = arg0;
        this.field2696 = arg1;
    }
}
