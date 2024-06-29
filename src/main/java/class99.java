import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class99 extends class553 {

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method843(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method845(73, -71, -19, 118, 97);
        }
        field1297++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 19)
    public static final void method844(int arg0) {
        class316.field3880 = new class620[class741.field10314.method445(-121)][];
        field1292++;
        class642.field8762 = new class620[class741.field10314.method445(36)][];
        class512.field7234 = new boolean[class741.field10314.method445(42)];
        if (arg0 != -18143) {
            method844(-23);
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lps;Lft;IIIIIIIIIIIII)V", line = 33)
    public class99(class105 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1296 = arg11;
        this.field1295 = arg12;
        this.field1294 = arg10;
        this.field1289 = arg14;
        this.field1291 = arg13;
        this.field1290 = arg9;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Llf;", line = 51)
    public class251 method94(int arg0) {
        if (arg0 == 1024) {
            field1299++;
            return class535.field7537;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)Z", line = 62)
    public static final boolean method845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1293++;
        if ((class124.field1585[0][arg3][arg0] & 0x2) != 0) {
            return true;
        } else if ((class124.field1585[arg1][arg3][arg0] & arg4) == 0) {
            return class480.method2855((byte) 62, arg0, arg1, arg3) == arg2;
        } else {
            return false;
        }
    }
}
