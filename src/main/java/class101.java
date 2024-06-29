import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class101 implements class121 {

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "Lida;")
    public class215 field1101;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "Z")
    public boolean field1107;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lce;")
    public class278 field1096;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "[I")
    public static int[] field1100 = new int[8];

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Lqv;")
    public final class406 method484(int arg0) {
        field1102++;
        return arg0 == 16236 ? class469.field6548 : null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIII)I")
    public static final int method614(int arg0, int arg1, int arg2, int arg3) {
        field1105++;
        if ((class379.field4922[arg1][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class379.field4922[1][arg2][arg0] & 0x2) == 0) {
            int var4 = 113 / ((6 - arg3) / 53);
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static void method615(byte arg0) {
        if (arg0 != 102) {
            method615((byte) -111);
        }
        field1100 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(ILida;Lce;IIIIIIIZ)V")
    public class101(int arg0, class215 arg1, class278 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field1097 = arg9;
        this.field1103 = arg8;
        this.field1101 = arg1;
        this.field1098 = arg3;
        this.field1107 = arg10;
        this.field1108 = arg4;
        this.field1104 = arg6;
        this.field1096 = arg2;
        this.field1106 = arg0;
        this.field1099 = arg7;
        this.field1095 = arg5;
    }
}
