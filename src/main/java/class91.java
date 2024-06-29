import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class91 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1147 = -1;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "B")
    public byte field1148;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "B")
    public byte field1149;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "B")
    public byte field1153;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "B")
    public byte field1156;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "B")
    public byte field1160;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "B")
    public byte field1161;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "B")
    public byte field1166;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "S")
    public short field1151;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Z")
    public boolean field1150;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Z")
    public boolean field1157;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    public boolean field1158;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
    public boolean field1159;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Z")
    public boolean field1162;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Z")
    public boolean field1164;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
    public boolean field1167;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Z")
    public boolean field1168;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILet;IIIIIZIIILha;)V", line = 6)
    public static final void method629(int arg0, class718 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, class454 arg11) {
        if (arg0 > arg6 && arg0 < (arg6 + arg8) && arg5 - 13 < arg3 && (arg5 + 3) > arg3 && arg1.field10120) {
            arg10 = arg4;
        }
        field1152++;
        int[] var12 = null;
        if (class289.method1731(arg1.field10134, (byte) -32)) {
            var12 = class190.field2488.method3944(256, (int) arg1.field10137).field2141;
        } else if (arg1.field10129 != -1) {
            var12 = class190.field2488.method3944(256, arg1.field10129).field2141;
        } else if (class589.method3275(arg1.field10134, (byte) -88)) {
            class247 var15 = (class247) class563.field7875.method3248((long) ((int) arg1.field10137), 0);
            if (var15 != null) {
                class124 var16 = var15.field3158;
                class155 var17 = var16.field1486;
                if (var17.field1929 != null) {
                    var17 = var17.method968((byte) -76, class461.field6637);
                }
                if (var17 != null) {
                    var12 = var17.field1951;
                }
            }
        } else if (class638.method3464(arg1.field10134, 101)) {
            Object var13 = null;
            class290 var14;
            if (arg1.field10134 == 1002) {
                var14 = class358.field5112.method890((int) arg1.field10137, false);
            } else {
                var14 = class358.field5112.method890((int) (arg1.field10137 >>> 32 & 0x7FFFFFFFL), false);
            }
            if (var14.field3685 != null) {
                var14 = var14.method1739((byte) -120, class461.field6637);
            }
            if (var14 != null) {
                var12 = var14.field3734;
            }
        }
        String var18 = class554.method3151(arg1, arg7);
        if (var12 != null) {
            var18 = var18 + class162.method1000(25078, var12);
        }
        class100.field1234.method2512(class289.field3681, 0, arg10, var18, arg5, arg6 + 3, 112, class367.field5193);
        if (arg1.field10126) {
            class270.field3426.method3929(arg6 + class111.field1373.method453(-1, var18) + 5, arg5 - 12);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(DI)V", line = 90)
    public static final void method630(double arg0, int arg1) {
        field1155++;
        class593.field8260.method1961(class351.field4604);
        int var3 = -91 / ((arg1 - 15) / 48);
        class593.field8260.method1973(0, 0, (int) arg0);
        class422.field5998.method77(class593.field8260);
    }
}
