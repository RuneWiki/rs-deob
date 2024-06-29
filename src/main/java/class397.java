import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class397 extends class627 {

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "S")
    public short field5516;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[F")
    public static float[] field5517 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field5515 = -2;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2360(int arg0) {
        if (arg0 != -1) {
            field5515 = -5;
        }
        field5517 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class397() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(S)V")
    public class397(short arg0) {
        this.field5516 = arg0;
    }
}
