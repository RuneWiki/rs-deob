import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class221 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3753 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lda;")
    public static class275 field3752 = class255.method1672(93, "::errortest");

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[Lrk;")
    public static class20[] field3754;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static final void method1418(byte arg0) {
        class41.field701.method987((byte) 118);
        field3749++;
        if (arg0 != -108) {
            field3752 = null;
        }
        class141.field2482.method987((byte) -102);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public static final void method1419(byte arg0) {
        class268.field4650 = -1;
        class52.field863 = 0;
        class247.field4362 = -1;
        class59.field1000 = 0;
        class108.field1873 = -1;
        class270.field4697 = 0;
        class63.field1051 = false;
        class72.field1165 = -1;
        class210.field3558 = 0;
        class220.field3746 = 0;
        field3748++;
        class120.field2165 = 0;
        class149.field2597.field1392 = 0;
        class196.field3351.field1392 = 0;
        for (int var1 = 0; var1 < class16.field238.length; var1++) {
            if (class16.field238[var1] != null) {
                class16.field238[var1].field1735 = -1;
            }
        }
        for (int var2 = 0; var2 < class31.field478.length; var2++) {
            if (class31.field478[var2] != null) {
                class31.field478[var2].field1735 = -1;
            }
        }
        class13.method65((byte) 45);
        class159.field2789 = 1;
        class265.method1746((byte) -52, 30);
        int var3 = 0;
        if (arg0 > 0) {
            return;
        }
        while (var3 < 100) {
            class200.field3418[var3] = true;
            var3++;
        }
        class235.method1532((byte) 27);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1420(int arg0) {
        if (arg0 > 72) {
            field3752 = null;
            field3754 = null;
        }
    }
}
