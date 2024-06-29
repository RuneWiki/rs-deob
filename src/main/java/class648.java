import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class648 extends class583 {

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Lbg;")
    public static class464 field8911 = new class464();

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field8905;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public int field8907;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public int field8913;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "Lrb;")
    public class352 field8906;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "Loia;")
    public static class88 field8916;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Ljava/lang/String;")
    public String field8909;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "[I")
    public int[] field8910;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "[I")
    public int[] field8912;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[Lkk;")
    public class188[] field8908;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "[Ljava/lang/String;")
    public String[] field8904;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Lvg;")
    public static final class52 method3574(int arg0) {
        if (arg0 == 0) {
            field8915++;
            return class678.field9271;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public static void method3575(int arg0) {
        field8911 = null;
        field8916 = null;
        if (arg0 < 15) {
            method3574(-116);
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Lhha;")
    public static final class519 method3576(int arg0) {
        field8903++;
        class519 var1 = class184.method1163(false);
        var1.field7381 = null;
        var1.field7382 = 0;
        var1.field7384 = new class682(5000);
        return arg0 > -101 ? null : var1;
    }
}
