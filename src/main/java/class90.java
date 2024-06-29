import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class90 {

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIIIIIIII)V", line = 3)
    public final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1211 = arg0;
        field1220++;
        this.field1219 = arg3 * arg3;
        this.field1210 = arg10;
        this.field1221 = arg6;
        this.field1208 = this.field1210 + arg9;
        this.field1216 = this.field1211 + arg2;
        this.field1215 = this.field1210 + arg4;
        if (arg1 != -7409) {
            this.field1221 = 79;
        }
        this.field1217 = this.field1221 + arg8;
        this.field1213 = this.field1211 + arg5;
        this.field1209 = this.field1221 + arg7;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIII)V", line = 30)
    public static final void method641(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 18596) {
            return;
        }
        field1214++;
        int var4 = arg1 * class11.field68.field5540.method750((byte) 127) >> 8;
        if (var4 == 0 || arg2 == -1) {
            return;
        }
        if (!class31.field270 && class555.field7831 != -1 && class600.method3324(false) && !class310.method1868((byte) -128)) {
            class443.field6170 = class258.method1556(-59);
            class716 var5 = class253.method1509(116, class443.field6170);
            class561.method3168(var5, true, 28643);
        }
        class257.method1547(class237.field3108, false, var4, arg2, 0, arg3 ^ 0xFFFFF7D1);
        class425.method2432(255, -1, 0);
        class31.field270 = true;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V", line = 62)
    public static final void method642(int arg0) {
        class726.field10135 = 0;
        class136.field1739 = 0;
        class161.field2032 = 0;
        class56.field576 = 0;
        int var1 = -5 / ((-arg0 - 10) / 55);
        field1212++;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(IIII)Z", line = 73)
    public final boolean method643(int arg0, int arg1, int arg2, int arg3) {
        field1218++;
        if (this.field1213 > arg0 || arg0 > this.field1216) {
            return false;
        } else if (arg1 < this.field1215 || arg1 > this.field1208) {
            return false;
        } else if (this.field1217 <= arg2 && arg2 <= this.field1209) {
            if (arg3 != 0) {
                this.method640(69, -4, -88, -91, -62, 109, -98, 2, -57, 18, -119);
            }
            int var5 = arg0 - this.field1211;
            int var6 = arg2 - this.field1221;
            return (var5 * var5 + (var6 * var6)) < this.field1219;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)Z", line = 99)
    public static final boolean method644(int arg0, int arg1, int arg2) {
        field1222++;
        if (!class653.method3684(arg2, arg0 + 28678, arg1)) {
            return false;
        } else if (class572.method3214(arg2, arg1, 123) | (arg1 & 0xB000) != 0 | class571.method3212(arg1, 6, arg2)) {
            return true;
        } else if (arg0 == 55) {
            return (arg2 & 0x37) == 0 & (class337.method1998(arg1, 544, arg2) | class62.method482(arg2, arg1, (byte) 91));
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 117)
    public class90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1211 = arg0;
        this.field1221 = arg2;
        this.field1219 = arg3 * arg3;
        this.field1210 = arg1;
        this.field1215 = this.field1210 + arg6;
        this.field1217 = this.field1221 + arg8;
        this.field1209 = this.field1221 + arg9;
        this.field1216 = this.field1211 + arg5;
        this.field1208 = this.field1210 + arg7;
        this.field1213 = this.field1211 + arg4;
    }
}
