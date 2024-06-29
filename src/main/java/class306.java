import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class306 extends class198 {

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "S")
    public short field4465;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "S")
    public short field4460;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Z")
    public boolean field4469;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "B")
    public byte field4467;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "S")
    public short field4462;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "B")
    public byte field4464;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "S")
    public short field4471;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field4461 = 64;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Z")
    public static boolean field4456;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public void method2064(byte arg0) {
        field4470++;
        if (arg0 != -18) {
            this.method2064((byte) 100);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
    public abstract int method775(int arg0);

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4457 = (short) arg2;
        this.field4465 = (short) arg4;
        this.field4463 = (short) arg1;
        this.field4460 = (short) arg5;
        this.field4469 = arg8;
        this.field4467 = arg9;
        this.field4462 = (short) arg6;
        this.field4464 = (byte) arg0;
        this.field4466 = (short) arg3;
        this.field4471 = (short) arg7;
    }
}
