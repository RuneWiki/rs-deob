import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class148 extends RuntimeException {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2826;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Ljava/lang/String;")
    public String field2830;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lsg;")
    public static class30 field2825 = null;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lsg;")
    public static class30 field2827 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lsg;")
    public static class30 field2828 = class167.method1221((byte) 33, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
    public static int[] field2829 = new int[64];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[[[B")
    public static byte[][][] field2833;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[[[I")
    public static int[][][] field2824;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method1081(byte arg0) {
        field2831++;
        class68.field1495.method1652(-8259);
        if (arg0 != -78) {
            field2828 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static void method1082(byte arg0) {
        field2824 = null;
        field2827 = null;
        field2833 = null;
        field2829 = null;
        int var1 = 52 % ((31 - arg0) / 56);
        field2825 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lw;")
    public static final class225 method1083(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class225 var4 = var3.field3532;
            var3.field3532 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class148(Throwable arg0, String arg1) {
        this.field2826 = arg0;
        this.field2830 = arg1;
    }
}
