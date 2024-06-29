import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class258 extends class227 {

    @OriginalMember(owner = "client!at", name = "K", descriptor = "I")
    private int field3446 = 0;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "I")
    private int field3445 = 0;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    private int field3448 = 1;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "S")
    public static short field3449;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "Lfo;")
    public static class361 field3450;

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!at", name = "j", descriptor = "(I)V")
    public static void method1592(int arg0) {
        if (arg0 == 23792) {
            field3450 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field3447;
        if (arg1 == 487215116) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 3) {
                        this.field3448 = arg0.method2388((byte) -110);
                    }
                } else {
                    this.field3445 = arg0.method2388((byte) -125);
                }
            } else {
                this.field3446 = arg0.method2388((byte) -112);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field3442;
        int[] var3 = super.field3068.method1970(arg1, (byte) 30);
        if (super.field3068.field4480) {
            int var4 = class190.field2457[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class446.field6486; ++var6) {
                int var7 = class4.field37[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3446 == 0) {
                    var9 = (var7 - var4) * this.field3448;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3448 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field3445 == 0) {
                    var12 = class169.field2189[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field3445 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != 15811) {
            this.field3448 = -13;
        }
        return var3;
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        ++field3444;
        class32.method182(arg0 + 123);
        if (arg0 != 1) {
            this.method877(-46);
        }
    }

    static {
        new class305((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field3449 = 1;
        new class305("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
