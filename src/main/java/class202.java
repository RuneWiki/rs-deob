import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class202 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lea;")
    private static class38 field3982 = class9.method46((byte) 113, "wishes to trade with you)3");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lea;")
    private static class38 field3987 = class9.method46((byte) 119, "Free world");

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3989 = 7759444;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3985 = 0;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lea;")
    public static class38 field3993 = field3982;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lea;")
    public static class38 field3994 = class9.method46((byte) 123, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lea;")
    public static class38 field3988 = field3987;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lrc;")
    public static class155 field3980 = new class155(64);

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lea;")
    public static class38 field3995 = class9.method46((byte) 125, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lgh;")
    public static class62 field3991;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3984;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Z")
    public static final boolean method1326(int arg0, int arg1) {
        field3983++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 2000) {
            field3989 = -18;
        }
        int var2 = class132.field2810[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method1327(boolean arg0, byte[] arg1, byte arg2) {
        field3992++;
        if (arg2 != 2) {
            field3993 = null;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class106.field2398) {
            try {
                class160 var3 = (class160) Class.forName("jb").getDeclaredConstructor().newInstance();
                var3.method704(arg1, (byte) -39);
                return var3;
            } catch (Throwable var4) {
                class106.field2398 = true;
            }
        }
        return arg0 ? class103.method841(arg1, (byte) 7) : arg1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/Object;Lod;)V")
    public static final void method1328(byte arg0, Object arg1, class129 arg2) {
        field3990++;
        if (arg2.field2763 == null) {
            return;
        }
        if (arg0 > -69) {
            field3985 = 87;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2763.peekEvent() != null; var3++) {
            class132.method969(1L, (byte) 58);
        }
        if (arg1 != null) {
            arg2.field2763.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1329(boolean arg0) {
        field3993 = null;
        field3988 = null;
        field3991 = null;
        field3987 = null;
        field3982 = null;
        field3984 = null;
        field3994 = null;
        field3995 = null;
        field3980 = null;
        if (arg0) {
            field3986 = -52;
        }
    }
}
