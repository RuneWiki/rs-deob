import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class32 extends class69 {

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Ljn;")
    public static class134 field303 = new class134(18, 5);

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Ljava/lang/String;")
    public static String field305 = null;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lsh;")
    public static class288 field307;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 8)
    public static void method264(int arg0) {
        if (arg0 == 18) {
            field307 = null;
            field305 = null;
            field303 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 23)
    public static final void method265(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1002) {
            return;
        }
        field308++;
        if (arg3 == 1012) {
            class700.method3958(class345.field4979, arg1, arg2);
        } else if (arg3 == 1002) {
            class700.method3958(class620.field8696, arg1, arg2);
        } else if (arg3 == 1007) {
            class700.method3958(class394.field5597, arg1, arg2);
        } else if (arg3 == 1009) {
            class700.method3958(class273.field3954, arg1, arg2);
        } else if (arg3 == 1006) {
            class700.method3958(class203.field2846, arg1, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I", line = 55)
    public static final int method266(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -74) {
            method264(-41);
        }
        field302++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V", line = 75)
    public class32(int arg0, int arg1) {
        this.field306 = arg1;
        this.field304 = arg0;
    }
}
