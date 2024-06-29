import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class25 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lst;")
    public static class335 field315 = new class335(9, 4);

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lkr;")
    public static class602 field319 = new class602(44, 1);

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
    public static boolean field321 = false;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "Z")
    public static boolean field320 = false;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(I)V", line = 5)
    public class25(int arg0) {
        this.field313 = arg0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 13)
    public static void method141(int arg0) {
        field315 = null;
        if (arg0 != 44) {
            method142(-41);
        }
        field319 = null;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)[Lpb;", line = 26)
    public static final class79[] method142(int arg0) {
        if (arg0 != 1) {
            method142(-21);
        }
        field316++;
        return new class79[] { class572.field7902, class95.field1305, class178.field2448 };
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field317++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BIII)V", line = 50)
    public static final void method143(byte arg0, int arg1, int arg2, int arg3) {
        field314++;
        if (class344.field4893 == arg1 && class375.field5277 == arg3 && class653.field8743 == arg2) {
            return;
        }
        class569.field7870 = true;
        class375.field5277 = arg3;
        class653.field8743 = arg2;
        class344.field4893 = arg1;
        double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class302.field4270 = var12;
        class24.field310 = var8 * var12;
        class207.field2713 = var10;
        if (arg0 != 31) {
            method142(27);
        }
        class30.field362 = -var8 * var14;
        class758.field10571 = -var10 * var12;
        class95.field1306 = var14;
        class589.field8026 = var8;
        class481.field6710 = 0.0D;
        class229.field3098 = var10 * var14;
    }
}
