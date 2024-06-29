import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class84 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field956 = 0;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field958;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)J")
    public static final synchronized long method550(byte arg0) {
        field957++;
        long var1 = System.currentTimeMillis();
        if (arg0 > -80) {
            return -83L;
        }
        if (class121.field1506 > var1) {
            class268.field3768 += class121.field1506 - var1;
        }
        class121.field1506 = var1;
        return class268.field3768 + var1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method551(int arg0) {
        field958 = null;
        if (arg0 != 28870) {
            field958 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method552(int arg0) {
        class254.field3624.method675(true);
        if (arg0 != -12752) {
            method552(53);
        }
        field959++;
        class468.field6960.field2610 = 0;
        class260.field3703 = 0;
        class247.field3507 = null;
        class52.field547 = 0;
        class379.field5763 = null;
        class46.field498.field2610 = 0;
        class592.field8497 = null;
        class305.method2036((byte) -4);
        class538.field7747 = null;
        class24.field257 = 0;
        class602.field8781 = 0;
        class574.field8287 = null;
        class294.field4252 = 0;
    }
}
