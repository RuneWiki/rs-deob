import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class67 implements class21 {

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lrt;")
    public class212 field1023;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
    public boolean field1027;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lcp;")
    public class679 field1016;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[Lpf;")
    public static class545[] field1017 = new class545[4];

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "F")
    public static float field1024;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)Los;")
    public final class412 method193(byte arg0) {
        if (arg0 >= -21) {
            method535((byte) -78);
        }
        field1019++;
        return class373.field5039;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(ILrt;Lcp;IIIIIIIZ)V")
    public class67(int arg0, class212 arg1, class679 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field1025 = arg7;
        this.field1021 = arg9;
        this.field1026 = arg0;
        this.field1022 = arg6;
        this.field1023 = arg1;
        this.field1027 = arg10;
        this.field1016 = arg2;
        this.field1014 = arg5;
        this.field1015 = arg8;
        this.field1018 = arg4;
        this.field1020 = arg3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static void method535(byte arg0) {
        if (arg0 != -41) {
            method535((byte) -123);
        }
        field1017 = null;
    }
}
