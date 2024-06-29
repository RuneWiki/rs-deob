import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class199 {

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2624 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "Lrm;")
    public class359 field2626;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZI)V")
    public static final void method1263(boolean arg0, boolean arg1, int arg2) {
        class644.field9129 = arg2;
        class168.field2105 = 3;
        field2625++;
        class78.method442(40000, class535.field7353.field9558, class535.field7353.field9560);
        if (!arg1) {
            method1266(-1.3727684F, 0.1455599F, -117, 1.0544847F);
        }
        if (arg0) {
            class525.method2994(-1, "", "", false);
        } else {
            class367.method2262(!arg1);
            class525.method2994(-1, class438.field6042, class487.field6576, false);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static void method1264(byte arg0) {
        field2624 = null;
        if (arg0 > -105) {
            method1263(false, false, 97);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIB)V")
    public static final void method1265(int arg0, int arg1, byte arg2) {
        field2622++;
        class19 var3 = class364.method2236(1248116640, arg0, 5);
        var3.method110(12142);
        var3.field171 = arg1;
        if (arg2 != -102) {
            method1263(false, true, -123);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(FFIF)F")
    public static final float method1266(float arg0, float arg1, int arg2, float arg3) {
        field2623++;
        int var4 = 48 / ((arg2 + 34) / 57);
        return (arg0 - arg3) * arg1 + arg3;
    }
}
