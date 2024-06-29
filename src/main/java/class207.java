import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class207 {

    @OriginalMember(owner = "client!el", name = "h", descriptor = "B")
    private byte field3215;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Luf;")
    public static class176 field3209;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Luf;")
    public static class176 field3211;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    public static int[] field3212;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method1380(int arg0) {
        for (class15 var1 = (class15) class1.field2.method1010(119); var1 != null; var1 = (class15) class1.field2.method1008((byte) 88)) {
            class133 var2 = var1.field249;
            if (class274.field4318 != var2.field2047 || var2.field2049) {
                var1.method693(-62);
            } else if (var2.field2064 <= class267.field4256) {
                var2.method927((byte) 125, class127.field1996);
                if (var2.field2049) {
                    var1.method693(-71);
                } else {
                    class111.method821(var2.field2047, var2.field2063, var2.field2059, var2.field2042, 60, var2, 0, -1L, false);
                }
            }
        }
        field3217++;
        if (arg0 != 0) {
            field3212 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class271.field4289 = arg1;
        field3220++;
        class113.field1779 = arg3;
        if (arg4 <= -37) {
            class75.field1265 = arg0;
            class261.field4025 = arg2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I")
    public final int method1382(byte arg0) {
        if (arg0 != -117) {
            field3211 = null;
        }
        field3214++;
        return this.field3215 & 0x7;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field3212 = null;
        field3209 = null;
        field3211 = null;
        if (arg0 <= 87) {
            method1385(67, (class188) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
    public final int method1384(byte arg0) {
        field3216++;
        if (arg0 >= -85) {
            method1385(102, (class188) null);
        }
        return (this.field3215 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILag;)V")
    public static final void method1385(int arg0, class188 arg1) {
        field3210++;
        if (arg0 <= 51) {
            method1380(-45);
        }
        class188 var2 = class102.method781(683162224, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class277.field4369;
            var4 = class35.field573;
        } else {
            var3 = var2.field2928;
            var4 = var2.field2922;
        }
        class92.method727(var4, 0, false, arg1, var3);
        class87.method696(arg1, 0, var4, var3);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 1) {
            method1380(-2);
        }
        field3223++;
        if (arg0 == arg2) {
            class266.method1817(arg0, arg5, arg3, -11443, arg1);
        } else if (class75.field1265 <= (arg3 - arg0) && (arg3 + arg0) <= class261.field4025 && (arg5 - arg2) >= class271.field4289 && class113.field1779 >= (arg5 + arg2)) {
            class186.method1246(arg2, true, arg5, arg0, arg1, arg3);
        } else {
            class209.method1398(arg5, arg1, true, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public static final void method1387(int arg0) {
        if (arg0 <= 126) {
            field3209 = null;
        }
        field3218++;
        class34.field533 = new class149();
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class207() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lf;)V")
    public class207(class37 arg0) {
        this.field3215 = arg0.method322((byte) 83);
        this.field3221 = arg0.method293(101);
        this.field3219 = arg0.method307(-125);
        this.field3222 = arg0.method307(-89);
        this.field3213 = arg0.method307(-53);
        this.field3208 = arg0.method307(-113);
    }
}
