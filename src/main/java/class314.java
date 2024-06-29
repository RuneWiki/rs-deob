import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class314 extends class728 {

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "[I")
    public static int[] field4470 = new int[3];

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "[I")
    public static int[] field4472;

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class314(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public final void method1416(int arg0) {
        field4469++;
        if (arg0 != -12054) {
            field4470 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1417(OggPacket arg0, int arg1) {
        field4468++;
        int var3 = 87 / ((arg1 - 34) / 54);
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)V")
    public static final void method2012(int arg0, int arg1) {
        field4471++;
        class313 var2 = class312.method1998((long) arg1, arg0, -1);
        var2.method2006(arg0 ^ 0xFFFFFFCB);
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static void method2013(int arg0) {
        field4472 = null;
        field4470 = null;
        if (arg0 != 12) {
            field4470 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIZ)V")
    public static final void method2014(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 25260) {
            field4470 = null;
        }
        field4474++;
        if (class87.field961.method2242((long) arg0, -1) != null) {
            return;
        }
        if (class261.field3832) {
            class244 var4 = new class244(arg0, new class754(4096, class194.field2993, arg0), arg1, arg3);
            var4.field3625.method1957(class65.field795[class140.field2081], (byte) 104);
            class87.field961.method2241(-73, (long) arg0, var4);
        } else {
            class580.method3401(arg3, arg0, (byte) -125);
        }
    }
}
