import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class654 extends class766 {

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "S")
    public short field9255;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "[Lbaa;")
    public static class647[] field9252 = new class647[1024];

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public static int field9251 = 0;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "F")
    public static float field9254 = 0.25F;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Lin;")
    public static class380 field9250;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method3677(int arg0) {
        field9250 = null;
        if (arg0 != -21054) {
            method3678(16, -53);
        }
        field9252 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
    public static final void method3678(int arg0, int arg1) {
        field9253++;
        if (!class484.method2853(arg1, (byte) -72)) {
            return;
        }
        if (arg0 != -11954) {
            field9250 = null;
        }
        class519[] var2 = class610.field8661[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class519 var4 = var2[var3];
            if (var4 != null) {
                var4.field7258 = 0;
                var4.field7152 = 1;
                var4.field7275 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
    public class654() {
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(S)V")
    public class654(short arg0) {
        this.field9255 = arg0;
    }
}
