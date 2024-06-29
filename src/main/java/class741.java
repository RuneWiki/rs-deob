import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class741 extends class309 {

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "Ljava/lang/String;")
    public static String field10225 = "";

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    public static int field10226 = 0;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public static int field10227 = 0;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
    public static void method4100(int arg0) {
        field10225 = null;
        if (arg0 != 2) {
            method4102(false);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILfca;)V")
    public static final void method4101(int arg0, class93 arg1) {
        field10223++;
        int var2 = -54 % ((-arg0 - 10) / 44);
        if (arg1.field1413.length - arg1.field1442 < 1) {
            return;
        }
        int var3 = arg1.method793((byte) 94);
        if (var3 < 0 || var3 > 1 || (arg1.field1413.length - arg1.field1442) < 2) {
            return;
        }
        int var4 = arg1.method763(-67);
        if ((var4 * 6) > (arg1.field1413.length - arg1.field1442)) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method763(-99);
            int var7 = arg1.method773(3);
            if (var6 < class46.field724.length && class617.field8593[var6] && (class281.field3904.method3254(true, var6).field4003 != '1' || var7 >= -1 && var7 <= 1)) {
                class46.field724[var6] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V")
    public static final void method4102(boolean arg0) {
        class427.field5835 = (int) ((double) class483.field6515 * 34.46D);
        field10228++;
        class81.field1130 = 200;
        class427.field5835 <<= 0x2;
        if (class95.field1472.method585()) {
            class427.field5835 += 512;
        }
        class522.method2965(false, arg0);
    }
}
