import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class29 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field483 = 0;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lkn;")
    public static class442 field484 = new class442(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "S")
    public static short field489 = 205;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILkh;)V")
    private final void method307(int arg0, int arg1, class11 arg2) {
        if (arg1 == 5) {
            this.field483 = arg2.method174(255);
        }
        field487++;
        if (arg0 < 20) {
            field489 = -63;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lkh;B)V")
    public final void method308(class11 arg0, byte arg1) {
        if (arg1 > -32) {
            field484 = null;
        }
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                field485++;
                return;
            }
            this.method307(82, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static final void method309(int arg0) {
        field486++;
        int var1 = 0;
        if (class312.field4271) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class348.method2215(false, var1);
        class155.method1045(var1, (byte) 116);
        if (arg0 != 205) {
            method310(false);
        }
        class156.method1047(var1, -107);
        class25.method296(var1, -17);
        class305.method1966(96, var1);
        class135.method944(var1, -114);
        class328.method2116(var1, true);
        class328.method2117(var1, (byte) -89);
        class83.method602(var1, (byte) -79);
        if (class446.field6250 == 10) {
            class139.method958(28, false);
        } else if (class446.field6250 == 30) {
            class139.method958(25, false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method310(boolean arg0) {
        field484 = null;
        if (!arg0) {
            field484 = null;
        }
    }
}
