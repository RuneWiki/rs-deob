import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class308 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "J")
    public static long field4758 = 0L;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
    public static int[] field4760 = new int[64];

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field4763 = 0;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4764 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[I")
    public static int[] field4762 = new int[50];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field4757 = 0;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
    public static boolean field4759 = false;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field4765 = -1;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Lue;")
    public static class17 field4767;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lod;")
    public static class28 field4756;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Llc;Llc;I)V", line = 4)
    public static final void method2160(class175 arg0, class175 arg1, int arg2) {
        field4761++;
        class43.field505 = arg1;
        class179.field2592 = arg0;
        if (arg2 > -28) {
            method2160((class175) null, (class175) null, 49);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ)V", line = 23)
    public static final void method2161(int arg0, long arg1) {
        field4755++;
        class140.field1954.field1400 = 0;
        class140.field1954.method648(21, (byte) 38);
        if (arg0 != -15388) {
            return;
        }
        class140.field1954.method678(arg1, (byte) 116);
        class272.field4272 = -3;
        class239.field3585 = 1;
        class307.field4747 = 0;
        class292.field4581 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 69)
    public static void method2162(int arg0) {
        field4756 = null;
        field4767 = null;
        field4764 = null;
        field4762 = null;
        field4760 = null;
        if (arg0 != -6760) {
            method2160((class175) null, (class175) null, -29);
        }
    }
}
