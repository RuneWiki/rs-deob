import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class55 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lfd;")
    public static class298[] field785;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method404(int arg0) {
        if (arg0 == -10) {
            field785 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lnk;I)V")
    public static final void method405(class429 arg0, int arg1) {
        field786++;
        int var2 = -16 % ((16 - arg1) / 38);
        arg0.field6012 = null;
        if (class451.field6256 < 20) {
            class528.field7319.method1643(arg0, 125);
            class451.field6256++;
        }
    }
}
