import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class480 extends class108 {

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Ljc;")
    public class585 field6729;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lha;")
    public static class116 field6728;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lkr;")
    public static class329 field6727;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBII)I")
    public static final int method2717(int arg0, byte arg1, int arg2, int arg3) {
        field6730++;
        int var4 = 98 / ((13 - arg1) / 46);
        int var5 = 255 - arg0;
        int var6 = ((arg3 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg3 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method2718(byte arg0) {
        field6728 = null;
        field6727 = null;
        if (arg0 != -89) {
            method2718((byte) 84);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljc;)V")
    public class480(class585 arg0) {
        this.field6729 = arg0;
    }
}
