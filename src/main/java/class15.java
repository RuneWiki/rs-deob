import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class51 {

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Liu;")
    public static class390 field226 = new class390(9, 5);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lqn;")
    public static class44 field228;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FZ)F")
    public static final float method111(float arg0, boolean arg1) {
        ++field231;
        return arg1 ? 1.5300484F : arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lts;I)Lts;")
    public static final class356 method112(class356 arg0, int arg1) {
        ++field221;
        class356 var2 = client.method1180(arg0);
        if (arg1 != -29354) {
            field226 = null;
        }
        if (var2 == null) {
            var2 = arg0.field5166;
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method113(int arg0) {
        ++field229;
        class319.method1921(arg0 + 15483, arg0);
        class270.method1648(arg0 + -26);
        System.gc();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method114(int arg0) {
        field228 = null;
        if (arg0 == 5) {
            field226 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
    public final void method115(int arg0, int arg1, int arg2) {
        ++field232;
        if (arg1 != 17091) {
            method112((class356) null, 73);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIII)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field220 = arg0;
        this.field222 = arg2;
        this.field230 = arg3;
        this.field223 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(III)V")
    public final void method116(int arg0, int arg1, int arg2) {
        ++field225;
        if (arg0 < 41) {
            this.method117(-29, -87, -8);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        if (arg1 > -104) {
            method111(-0.050603766F, false);
        }
        ++field224;
        int var4 = this.field220 * arg2 >> 12;
        int var5 = this.field222 * arg2 >> 12;
        int var6 = this.field223 * arg0 >> 12;
        int var7 = this.field230 * arg0 >> 12;
        class230.method1402((byte) -121, super.field759, var4, var5, var7, var6);
    }

    static {
        new class194("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        new class194("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
    }
}
