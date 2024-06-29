import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class475 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field6797 = 0;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILida;II)V", line = 3)
    public static final void method2784(int arg0, int arg1, class650 arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method2785(105, (byte) -114, -14);
        }
        arg2.field8928.method1112(arg3, -119);
        field6801++;
        arg2.field8928.method1124((byte) 106, arg4);
        arg2.field8928.method1116(arg1, arg0 ^ 0x2563);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)V", line = 17)
    public static final void method2785(int arg0, byte arg1, int arg2) {
        class345.field4470 = arg0 - class341.field4442;
        class90.field1143 = arg2 - class341.field4441;
        field6800++;
        if (arg1 > -96) {
            method2785(-68, (byte) -58, 19);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I", line = 37)
    public static final int method2786(int arg0) {
        field6799++;
        if (arg0 != 0) {
            field6797 = 46;
        }
        return class733.field10249.method2378(-5925);
    }
}
