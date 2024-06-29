import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class186 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Z")
    public static boolean[] field2674 = new boolean[100];

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    public static int[] field2668 = new int[50];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field2671;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1288(byte arg0) {
        if (arg0 != -114) {
            field2669 = -65;
        }
        field2671 = null;
        field2668 = null;
        field2674 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1289(int arg0) {
        class285.field4299 = null;
        field2672++;
        class239.field3563 = null;
        if (arg0 != 25037) {
            method1290(-18, -76, true, (byte) -88, 73);
        }
        class126.field1846 = null;
        class229.field3473 = null;
        class64.field940 = null;
        class56.field813 = null;
        class122.field1775 = null;
        class92.field1282 = null;
        class22.field339 = null;
        class318.field4793 = null;
        class228.field3449 = null;
        class166.field2381 = null;
        class99.field1425 = null;
        class177.field2552 = null;
        class201.field2956 = null;
        class177.field2538 = null;
        class58.field847 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBI)V", line = 56)
    public static final void method1290(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        class213.method1536((byte) 124, false);
        class110.field1600 = arg0;
        class27.field381 = arg2;
        class33.field493 = arg1;
        field2673++;
        class105.method800(arg4);
        int var5 = -58 / ((62 - arg3) / 40);
        class33.field477 = new class196(8);
        class278.field4227 = new class196(8);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)V", line = 74)
    public static final void method1291(int arg0, byte arg1, int arg2) {
        field2670++;
        class227.field3423[arg2] = arg0;
        class28 var3 = (class28) class64.field918.method1405((long) arg2, false);
        if (arg1 != 32) {
            method1290(114, 98, true, (byte) 109, 97);
        }
        if (var3 == null) {
            class28 var4 = new class28(class176.method1234(5574) + 500L);
            class64.field918.method1400((long) arg2, 119, var4);
        } else {
            var3.field387 = class176.method1234(5574) + 500L;
        }
    }
}
