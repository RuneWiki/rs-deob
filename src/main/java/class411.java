import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class411 extends class403 {

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "[B")
    public byte[] field5630;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "Lh;")
    public static class434 field5633;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field5632;

    static {
        new class206("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field5633 = new class434(100, -2);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 3)
    public static final void method2467(int arg0) {
        field5631++;
        class307.field4055 = false;
        class138.field2010 = null;
        class175.field2390 = null;
        class377.field5193 = null;
        class298.field3995 = null;
        class377.field5196 = null;
        class480.method2803((byte) -26);
        if (arg0 > -2) {
            field5633 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(FIIIZIII)[I", line = 29)
    public static final int[] method2468(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field5632++;
        if (arg1 != 15537) {
            method2469(62);
        }
        int[] var8 = new int[arg7];
        class297 var9 = new class297();
        var9.field3983 = arg3;
        var9.field3979 = (int) (arg0 * 4096.0F);
        var9.field3973 = arg6;
        var9.field3975 = arg2;
        var9.field3964 = arg4;
        var9.field3980 = arg5;
        var9.method65(-115);
        class422.method2501(arg7, 1, (byte) -83);
        var9.method1675(var8, -39, 0);
        return var8;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 57)
    public static void method2469(int arg0) {
        field5633 = null;
        if (arg0 != 4096) {
            field5633 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "([B)V", line = 66)
    public class411(byte[] arg0) {
        this.field5630 = arg0;
    }
}
