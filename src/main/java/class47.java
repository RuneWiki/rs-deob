import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class47 extends class261 {

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Ls;")
    public static class186 field978 = new class186(73, -1);

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Lqo;")
    public static class19 field975;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public static void method459(boolean arg0) {
        field975 = null;
        if (!arg0) {
            field978 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIZ)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field972 = arg5;
        this.field976 = arg3;
        this.field970 = arg1;
        this.field977 = arg2;
        this.field979 = arg0;
        this.field973 = arg4;
    }
}
