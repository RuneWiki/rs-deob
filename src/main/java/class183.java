import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class183 implements class153 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2743 = " is already on your ignore list.";

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2745 = "Loaded world list data";

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field2743 = null;
        field2745 = null;
        if (arg0 != 0) {
            method1285(54);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
    public final String method1127(int arg0, int arg1, int[] arg2, long arg3) {
        if (arg1 != -8945) {
            this.method1127(-60, -74, (int[]) null, -72L);
        }
        field2744++;
        if (arg0 == 0) {
            class137 var6 = class76.method567(arg2[0], -2882);
            return var6.method1029((int) arg3, (byte) 1);
        } else if (arg0 == 1 || arg0 == 10) {
            class31 var7 = class12.method88((int) arg3, 27838);
            return var7.field349;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class76.method567(arg2[0], -2882).method1029((int) arg3, (byte) 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
    public static final boolean method1286(boolean arg0) {
        field2741++;
        if (class121.field1990) {
            try {
                class150.method1120(class273.field4426.field2020, false, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 ? false : false;
    }
}
