import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lo;")
    public static class84 field705 = class15.method124("backhmid1", 255);

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field706 = -1;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lo;")
    public static class84 field707 = class15.method124("K @whi@(X", 255);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lo;")
    public static class84 field708 = class15.method124("mod_icons", 255);

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lo;")
    public static class84 field713 = class15.method124("invback", 255);

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[[B")
    public static byte[][] field717 = new byte[250][];

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lud;")
    public static class118 field704;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lp;")
    public static class89 field703;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[Lvb;")
    public static class121[] field709;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 7)
    public static void method329(byte arg0) {
        field703 = null;
        field709 = null;
        field704 = null;
        field717 = null;
        int var1 = 70 % ((32 - arg0) / 52);
        field705 = null;
        field713 = null;
        field707 = null;
        field708 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lbb;ZB)Z", line = 45)
    public static final boolean method330(class9 arg0, boolean arg1, byte arg2) {
        field715++;
        class21.field387 = 20;
        try {
            class127.field2813 = (class50) Class.forName("pa").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            class52 var3 = arg0.method81((byte) -118);
            if (var3 != null) {
                class127.field2813 = new class66(arg0, var3);
                return true;
            }
            if (arg2 < 50) {
                method329((byte) -15);
            }
            if (arg1) {
                class127.field2813 = new class57(arg0);
                return true;
            } else {
                return false;
            }
        }
    }
}
