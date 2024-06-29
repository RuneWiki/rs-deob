import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class228 implements class291 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3852 = 0;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lpf;")
    public static class17 field3853 = new class17(100);

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[[I")
    public static int[][] field3857;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1610(byte arg0) {
        field3853 = null;
        field3857 = null;
        int var1 = 41 % ((arg0 - 60) / 60);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method1611(byte arg0) {
        class236.field3980.method640((byte) 97, 19);
        class97.field1563++;
        int var1 = 90 / ((arg0 + 19) / 57);
        class236.field3980.method1780(class170.method1271((byte) -104), 53);
        class236.field3980.method1771(class155.field2567, (byte) 30);
        field3850++;
        class236.field3980.method1771(class182.field2901, (byte) 30);
        class236.field3980.method1780(class265.field4440, 68);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IJ[IZ)Ljava/lang/String;")
    public final String method1612(int arg0, long arg1, int[] arg2, boolean arg3) {
        field3854++;
        if (arg0 == 0) {
            class146 var6 = class54.method345((byte) 6, arg2[0]);
            return var6.method1084(127, (int) arg1);
        } else if (arg0 == 1 || arg0 == 10) {
            class71 var7 = class13.method75(false, (int) arg1);
            return var7.field1209;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class54.method345((byte) 6, arg2[0]).method1084(-58, (int) arg1);
        } else {
            if (!arg3) {
                method1613(97, 92);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    public static final void method1613(int arg0, int arg1) {
        class253.field4282 = -1;
        field3851++;
        class306.field4951 = -1;
        if (arg0 > -114) {
            method1610((byte) 11);
        }
        class122.field2044 = arg1;
        class245.method1753(12627);
    }
}
