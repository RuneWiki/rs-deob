import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class429 extends class371 {

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "F")
    public static float field6408;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "F")
    public static float field6413;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field6414;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public int field6418;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "Ljava/lang/String;")
    public String field6410;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILvg;)V")
    public static final void method2561(int arg0, int arg1, int arg2, class38 arg3) {
        class29.field300 = arg0;
        class454.field6738 = arg3;
        class155.field2284 = arg1;
        if (arg2 != 27711) {
            field6408 = 0.66969115F;
        }
        field6412++;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIBIII)Z")
    public static final boolean method2562(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field6416++;
        if (arg5 >= -86) {
            method2561(-25, -99, -52, null);
        }
        if (arg6 + arg8 > arg1 && arg1 + arg7 > arg8) {
            return (arg0 + arg3) > arg4 && arg0 < (arg4 + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)Z")
    public static final boolean method2563(byte arg0, int arg1, int arg2) {
        if (arg0 >= -1) {
            return true;
        } else {
            field6409++;
            return class413.method2485(true, arg2, arg1) | (arg1 & 0x800) != 0 || class52.method319(arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lj;III[Z)V")
    public static final void method2564(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class86.field1324 == class31.field335) {
            return;
        }
        int var5 = class307.field4415[arg1].method202(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class35 var7 = class307.field4415[var6];
                if (var7 != null) {
                    var7.method205(arg0, arg2, var5 - var7.method202(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
