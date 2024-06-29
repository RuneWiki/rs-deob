import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class296 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    public static int[] field4697 = new int[14];

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4698 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4701 = "Face here";

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    public static int[] field4700;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1988(byte arg0) {
        int var1 = 38 % ((arg0 - 69) / 34);
        field4700 = null;
        field4697 = null;
        field4701 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
    public static final boolean method1989(int arg0) {
        field4699++;
        class252 var1 = class63.field1096;
        synchronized (class63.field1096) {
            if (class116.field2075 == class113.field2043) {
                return false;
            } else {
                class141.field2418 = class259.field4251[class113.field2043];
                class53.field932 = class46.field765[class113.field2043];
                class113.field2043 = arg0 & class113.field2043 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public static final void method1990(int arg0, int arg1) {
        if (arg0 == 2820) {
            field4702++;
            class79.field1356 = 1000 / arg1;
        }
    }
}
