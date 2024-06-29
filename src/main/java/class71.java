import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class71 {

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "[I")
    public static int[] field916 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "Lrr;")
    public static class337 field922;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "Lun;")
    public static class391 field914;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "Loa;")
    public static class650 field919;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Law;I)Z")
    public final boolean method559(class71 arg0, int arg1) {
        field905++;
        if (arg1 == 4) {
            return this.field910 == arg0.field910 && this.field923 == arg0.field923 && this.field920 == arg0.field920;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public static void method560(int arg0) {
        field919 = null;
        if (arg0 != 2) {
            method560(36);
        }
        field916 = null;
        field914 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lts;Z)V")
    public static final void method561(class501 arg0, boolean arg1) {
        field917++;
        if (class367.field4752) {
            return;
        }
        arg0.method1566(-123);
        if (arg1) {
            method561(null, false);
        }
        class638.field8648--;
    }
}
