import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class521 extends class477 {

    @OriginalMember(owner = "client!lv", name = "M", descriptor = "I")
    public static int field7681 = 0;

    @OriginalMember(owner = "client!lv", name = "O", descriptor = "Lct;")
    public static class479 field7683 = new class479();

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!lv", name = "Q", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!lv", name = "N", descriptor = "Lga;")
    public static class63 field7682;

    @OriginalMember(owner = "client!lv", name = "P", descriptor = "Lau;")
    public static class692 field7684;

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "[B")
    private byte[] field7680;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3072(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 10) {
            field7683 = null;
        }
        field7678++;
        this.field7680 = new byte[arg1 * 2 * arg0 * arg3];
        this.method1936(arg3, arg0, arg1, false);
        return this.field7680;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
    public class521() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
    public static final void method3073(byte arg0) {
        class221.field3304 = null;
        class564.field8257 = null;
        class288.field4049 = null;
        class296.field4184 = null;
        field7679++;
        if (arg0 != -108) {
            return;
        }
        class608.field8738 = null;
        class252.field3646 = null;
        class314.field4360 = null;
        class618.field8822 = null;
        class473.field6795 = null;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(B)V")
    public static void method3074(byte arg0) {
        field7684 = null;
        field7682 = null;
        field7683 = null;
        if (arg0 != 110) {
            field7686 = 80;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIB)V")
    public final void method2791(int arg0, int arg1, byte arg2) {
        field7685++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7680[var10001] = -1;
        int var5 = arg2 & 0xFF;
        if (arg1 != -103) {
            field7681 = 8;
        }
        this.field7680[var6] = (byte) (var5 * 3 >> 5);
    }
}
