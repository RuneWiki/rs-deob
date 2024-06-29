import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class27 extends RuntimeException {

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Ljava/lang/String;")
    public String field409;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field415;

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "I")
    public static int field414 = 0;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "Lv;")
    public static class40 field410 = class24.method170("Mining Shop", (byte) -107);

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "Lv;")
    public static class40 field411 = class24.method170("Loading )3)3)3", (byte) 121);

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "Z")
    public static boolean field413 = false;

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Lj;")
    public static class17 field416;

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lma;")
    public static class23 field412;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IIB)B", line = 30)
    public static final byte method189(int arg0, int arg1, byte arg2) {
        int var3 = arg1 >> 6;
        if (arg2 <= 77) {
            return 63;
        }
        int var4 = arg0 >> 6;
        if (class40.field519[var4][var3] == null) {
            return 0;
        } else if (class40.field519[var4][var3].field264 == null) {
            return class40.field519[var4][var3].field263;
        } else {
            return class40.field519[var4][var3].field264[(arg0 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 65)
    public static void method190(int arg0) {
        if (arg0 != 344767430) {
            method191(null, null, 120, -11, 101);
        }
        field412 = null;
        field416 = null;
        field411 = null;
        field410 = null;
    }

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 84)
    public class27(Throwable arg0, String arg1) {
        this.field409 = arg1;
        this.field415 = arg0;
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Lo;Lo;III)Lea;", line = 94)
    public static final class10 method191(class26 arg0, class26 arg1, int arg2, int arg3, int arg4) {
        if (class25.method178(88, arg4, arg3, arg1)) {
            return arg2 == 24380 ? class16.method87(arg0.method180(1, arg3, arg4), (byte) -85) : (class10) null;
        } else {
            return null;
        }
    }
}
