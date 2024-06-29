import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class332 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Ltj;")
    public static class258 field4993 = null;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lhi;")
    public static class192 field4994 = new class192();

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4998 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5000 = "Loaded config";

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5001 = "green:";

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lkm;")
    public static class133 field5002;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lpn;")
    public static class170[] field4999;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[S")
    public static short[] field4997;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIIII)V", line = 4)
    public static final void method2311(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > arg4) {
            class190.method1329(class126.field1723[arg3], arg1, arg2, (byte) -94, arg4);
        } else {
            class190.method1329(class126.field1723[arg3], arg4, arg2, (byte) -85, arg1);
        }
        field4990++;
        if (arg0 <= 20) {
            method2311((byte) -51, -67, 54, -31, -9);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 25)
    public static void method2312(int arg0) {
        if (arg0 != 8945) {
            method2311((byte) 47, -125, 122, 8, 59);
        }
        field4997 = null;
        field4993 = null;
        field4999 = null;
        field5000 = null;
        field4998 = null;
        field5002 = null;
        field4994 = null;
        field5001 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLin;II)V", line = 46)
    public static final void method2313(byte arg0, class344 arg1, int arg2, int arg3) {
        field4991++;
        if (arg0 != 49) {
            field4996 = -26;
        }
        if (class134.field1852 != null || class100.field1380 || arg1 == null || class162.method1166((byte) -72, arg1) == null) {
            return;
        }
        class134.field1852 = arg1;
        class21.field281 = class162.method1166((byte) -72, arg1);
        class42.field483 = 0;
        class172.field2346 = arg2;
        class112.field1527 = arg3;
        class174.field2373 = false;
    }
}
