import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class42 {

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Z")
    public boolean field485;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "S")
    public short field495;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "S")
    public short field487;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "S")
    public short field493;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "B")
    public byte field486;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field489 = 1337;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "F")
    public static float field494 = 0.25F;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field488 = arg3;
        this.field497 = arg0;
        this.field485 = arg10;
        this.field495 = (short) arg6;
        this.field491 = arg1;
        this.field487 = (short) arg4;
        this.field496 = arg2;
        this.field493 = (short) arg5;
        this.field492 = arg11;
        this.field486 = (byte) arg8;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lac;I)V")
    public static final void method366(class501 arg0, int arg1) {
        field490++;
        for (int var2 = arg1; var2 < class368.field4964; var2++) {
            int var3 = arg0.method2871((byte) -87);
            int var4 = arg0.method2845(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class43.field526[var3] != null) {
                class43.field526[var3].field3532 = var4;
            }
        }
    }
}
