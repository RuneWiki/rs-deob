import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class391 extends class42 {

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Ljava/lang/String;")
    public String field5299;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field5301 = 0;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "[Lii;")
    public static class386[] field5303 = new class386[0];

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field5305 = -1;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "[J")
    public static long[] field5302;

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
    public class391() {
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
    public static void method2301(byte arg0) {
        if (arg0 < 5) {
            method2301((byte) 27);
        }
        field5302 = null;
        field5303 = null;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class391(String arg0, int arg1) {
        this.field5299 = arg0;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILm;ILjs;Ljava/awt/Canvas;)Lqa;")
    public static final class162 method2302(int arg0, int arg1, class126 arg2, int arg3, class216 arg4, Canvas arg5) {
        int var6 = -82 % ((arg3 + 7) / 37);
        field5304++;
        return new class511(arg1, arg5, arg2, arg0, arg4);
    }

    static {
        new class304("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }
}
