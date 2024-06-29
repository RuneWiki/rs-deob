import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class216 {

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lab;")
    public static class279 field3453 = new class279(500);

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3457 = " more options";

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "F")
    public static float field3455;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3456;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 82)
    public static void method1447(int arg0) {
        field3457 = null;
        field3453 = null;
        field3456 = null;
        if (arg0 != -1) {
            field3453 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 100)
    public static final void method1448(int arg0) {
        field3450++;
        class159.field2602.method1877(-29702);
        if (arg0 != -23189) {
            field3453 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 149)
    public static final void method1449(int arg0) {
        if (class248.field3867 > class244.field3799) {
            class244.field3799 = (float) ((double) class244.field3799 / 30.0D + (double) class244.field3799);
            if (class244.field3799 > class248.field3867) {
                class244.field3799 = class248.field3867;
            }
            class264.method1760((byte) -12);
        } else if (class248.field3867 < class244.field3799) {
            class244.field3799 = (float) ((double) class244.field3799 - (double) class244.field3799 / 30.0D);
            if (class244.field3799 < class248.field3867) {
                class244.field3799 = class248.field3867;
            }
            class264.method1760((byte) -12);
        }
        field3454++;
        if (arg0 != 4) {
            field3456 = (Canvas) null;
        }
        if (class345.field5353 == -1 || class336.field5148 == -1) {
            return;
        }
        int var1 = class345.field5353 - class318.field4808;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class318.field4808 += var1;
        int var2 = class336.field5148 - class250.field3923;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class345.field5353 = -1;
            class336.field5148 = -1;
        }
        class250.field3923 += var2;
        class264.method1760((byte) -12);
    }
}
