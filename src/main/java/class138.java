import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class138 implements class437 {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Lsd;")
    public class95 field2304;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "Lec;")
    public class236 field2301;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Lsk;")
    public static class623 field2302 = new class623("WIP", 2);

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 3)
    public static void method1117(int arg0) {
        field2302 = null;
        if (arg0 != 2) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)I", line = 19)
    public static final int method1118(byte arg0, String arg1) {
        field2303++;
        if (arg0 != -114) {
            method1119(-85, -44, 56);
        }
        return arg1.length() + 2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method1119(int arg0, int arg1, int arg2) {
        field2305++;
        if (arg1 > -70) {
            method1119(-57, -121, 54);
        }
        return (class362.method2308(arg2, arg0, -1) | class426.method2606(false, arg2, arg0) | class3.method12(0, arg2, arg0)) & class472.method2783(2, arg0, arg2);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Lad;", line = 49)
    public class426 method119(byte arg0) {
        if (arg0 <= 116) {
            method1118((byte) 116, null);
        }
        field2306++;
        return class438.field6244;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(ILsd;Lec;II)V", line = 60)
    public class138(int arg0, class95 arg1, class236 arg2, int arg3, int arg4) {
        this.field2299 = arg3;
        this.field2307 = arg0;
        this.field2300 = arg4;
        this.field2304 = arg1;
        this.field2301 = arg2;
    }
}
