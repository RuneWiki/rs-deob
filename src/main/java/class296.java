import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class296 {

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lej;")
    public static class124 field4154 = new class124(51, 3);

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1941(int arg0) {
        if (arg0 == 8549) {
            field4154 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZILat;)V")
    public static final void method1942(boolean arg0, int arg1, class378 arg2) {
        field4157++;
        int var3 = -40 % ((-arg1 - 35) / 51);
        int var4 = arg2.field5374 == 0 ? arg2.field5385 : arg2.field5374;
        int var5 = arg2.field5467 == 0 ? arg2.field5465 : arg2.field5467;
        class101.method942(false, arg2.field5506, var4, arg0, var5, class396.field5798[arg2.field5506 >> 16]);
        if (arg2.field5474 != null) {
            class101.method942(false, arg2.field5506, var4, arg0, var5, arg2.field5474);
        }
        class432 var6 = (class432) class323.field4473.method1465((long) arg2.field5506, -6008);
        if (var6 != null) {
            class615.method3485(var5, -1, var6.field6181, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
    public static final int method1943(int arg0, int arg1) {
        field4153++;
        if (arg0 != -23590) {
            method1942(false, -115, null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4152++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)Z")
    public static final boolean method1944(byte arg0, int arg1) {
        if (arg0 == 4) {
            field4155++;
            return arg1 != 1 && arg1 != 7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILat;)V")
    public static final void method1945(int arg0, class378 arg1) {
        field4151++;
        if (class273.field3844 == arg1.field5470) {
            class286.field3995[arg1.field5436] = true;
        }
        if (arg0 != -9343) {
            method1943(-107, 120);
        }
    }
}
