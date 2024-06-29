import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class582 {

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public int field8019 = -1;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "[I")
    public static int[] field8023 = new int[8];

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field8026 = -1;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Luw;")
    public class175 field8020;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Liu;")
    public static class501 field8025;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[I")
    public int[] field8021;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field8024;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)Z")
    public static final boolean method3266(int arg0, int arg1, int arg2) {
        field8022++;
        if (arg1 != -1) {
            method3267(21);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public static void method3267(int arg0) {
        field8023 = null;
        if (arg0 == -1) {
            field8025 = null;
        }
    }
}
