import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class594 extends class553 {

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field8445 = 0;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Llc;")
    public static class435 field8442 = new class435(50, 7);

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Lqk;")
    public static class146 field8450 = null;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field8438;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field8439;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field8440;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field8448;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "J")
    public long field8441;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(CB)B")
    public static final byte method3483(char arg0, byte arg1) {
        field8447++;
        if (arg1 != -117) {
            field8445 = 120;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(Z)V")
    public static void method3484(boolean arg0) {
        field8450 = null;
        if (arg0) {
            method3483((char) 65532, (byte) 58);
        }
        field8442 = null;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(Z)I")
    public final int method761(boolean arg0) {
        if (arg0) {
            return 33;
        } else {
            field8437++;
            return this.field8438;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
    public static final void method3485(int arg0, byte arg1, Rectangle[] arg2) throws class360 {
        int var3 = 6 / ((64 - arg1) / 58);
        if (class270.field3833 == 1) {
            class301.field4129.method1225(arg2, arg0, class72.field1098, class677.field9619);
        } else {
            class301.field4129.method1225(arg2, arg0, 0, 0);
        }
        field8443++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I")
    public final int method759(byte arg0) {
        if (arg0 < 38) {
            return -34;
        } else {
            field8436++;
            return this.field8439;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)I")
    public final int method760(int arg0) {
        if (arg0 < 122) {
            method3484(true);
        }
        field8449++;
        return this.field8440;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)J")
    public final long method763(int arg0) {
        field8446++;
        return arg0 == -25909 ? this.field8441 : 86L;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
    public final int method762(int arg0) {
        field8444++;
        if (arg0 != -4) {
            field8442 = null;
        }
        return this.field8448;
    }
}
