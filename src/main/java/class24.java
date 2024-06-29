import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 {

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lpj;")
    public static class237 field435 = class33.method353("gleiten:", 69);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lpj;")
    public static class237 field431 = class33.method353("Schlie-8en", 38);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
    public static int[] field434 = new int[5];

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "S")
    public static short field438 = 205;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lpj;")
    public static class237 field439 = class33.method353("mapscene", 83);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static volatile int field441 = 0;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lcj;")
    public static class115 field430;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field433;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method217(byte arg0) {
        field431 = null;
        if (arg0 <= 14) {
            return;
        }
        field433 = null;
        field439 = null;
        field434 = null;
        field430 = null;
        field435 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method218(int arg0) {
        if (arg0 == 31645) {
            field437++;
            class112.field1955.method942(0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZIIII)V")
    public static final void method219(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg3) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class62.field1241[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class62.field1241[var6][arg4] = arg1;
            }
        }
        field440++;
        if (arg0) {
            field435 = null;
        }
    }
}
