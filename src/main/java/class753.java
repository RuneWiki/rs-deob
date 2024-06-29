import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class753 extends class447 {

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "[Ljfa;")
    public static class122[] field10513 = new class122[128];

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field10510 = 0;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "Lmq;")
    public static class78 field10512 = new class78(27, -2);

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(JZ)V")
    public static final void method4198(long arg0, boolean arg1) {
        field10511++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1) {
            field10509 = -45;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V")
    public static void method4199(byte arg0) {
        int var1 = 104 % ((-arg0 - 11) / 40);
        field10512 = null;
        field10513 = null;
    }
}
