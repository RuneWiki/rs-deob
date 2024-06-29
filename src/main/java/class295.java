import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class295 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4692 = "Please remove ";

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4696 = 0;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4693 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI)V")
    public static final void method1985(long arg0, int arg1) {
        field4695++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class228.field3837 < 100 || class193.field3123) || class228.field3837 >= 200) {
            class97.method612(class91.field1611, -1, 0, "");
            return;
        }
        String var3 = class21.method146(arg0, (byte) 25);
        for (int var4 = 0; var4 < class228.field3837; var4++) {
            if (class280.field4464[var4] == arg0) {
                class97.method612(var3 + class121.field2141, -1, 0, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class90.field1589; var5++) {
            if (class237.field3906[var5] == arg0) {
                class97.method612(class266.field4305 + var3 + class141.field2429, -1, 0, "");
                return;
            }
        }
        if (var3.equals(class273.field4378.field4601)) {
            class97.method612(class142.field2440, arg1 ^ 0x55BE, 0, "");
            return;
        }
        class31.field460++;
        class5.field63[class228.field3837] = var3;
        class280.field4464[class228.field3837] = arg0;
        class274.field4393[class228.field3837] = 0;
        class276.field4410[class228.field3837] = "";
        class175.field2872[class228.field3837] = 0;
        class143.field2459[class228.field3837] = false;
        class228.field3837++;
        class63.field1093 = class222.field3746;
        class168.field2778.method199(155, arg1 + 22067);
        class168.field2778.method640(21691, arg0);
        if (arg1 != -21951) {
            field4696 = -67;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4692 = null;
        if (arg0 != 0) {
            field4694 = 91;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1987(int arg0, int arg1, int arg2, long arg3) {
        class109 var5 = class79.field1367[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1957 != null && var5.field1957.field3577 == arg3) {
            return true;
        } else if (var5.field1976 != null && var5.field1976.field3759 == arg3) {
            return true;
        } else if (var5.field1978 != null && var5.field1978.field159 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1968; var6++) {
                if (var5.field1961[var6].field2850 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
