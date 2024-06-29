import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class68 extends class60 {

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    private final int field1188;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    private final int field1186;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    private final int field1185;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    private final int field1183;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
    public static boolean field1177 = true;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZII)V")
    public final void method405(boolean arg0, int arg1, int arg2) {
        ++field1182;
        int var4 = this.field1185 * arg1 >> 12;
        if (arg0) {
            int var5 = this.field1186 * arg1 >> 12;
            int var6 = this.field1183 * arg2 >> 12;
            int var7 = this.field1188 * arg2 >> 12;
            class26.method186(var5, var4, var6, -63, var7, super.field1005);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)V")
    public static final void method493(int arg0, int arg1, int arg2) {
        class29.field568[arg1] = arg2;
        if (arg0 != -27632) {
            field1184 = 7;
        }
        ++field1189;
        class152 var3 = (class152) class15.field226.method1601(77, (long) arg1);
        if (var3 == null) {
            class152 var4 = new class152(class223.method1537(-26619) + 500L);
            class15.field226.method1597((long) arg1, (byte) -126, var4);
        } else {
            var3.field2699 = class223.method1537(-26619) - -500L;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1188 = arg3;
        this.field1186 = arg2;
        this.field1185 = arg0;
        this.field1183 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
    public final void method412(byte arg0, int arg1, int arg2) {
        ++field1178;
        int var4 = this.field1185 * arg2 >> 12;
        int var5 = this.field1183 * arg1 >> 12;
        int var6 = this.field1186 * arg2 >> 12;
        int var7 = 26 % ((arg0 - 45) / 42);
        int var8 = this.field1188 * arg1 >> 12;
        class248.method1686(super.field1010, super.field1005, 2, var4, var6, super.field1009, var8, var5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 == -32) {
            int var9 = -arg3 + arg8;
            ++field1179;
            int var10 = (-arg2 + arg6 << 16) / var9;
            int var11 = -arg7 + arg0;
            int var12 = (-arg4 + arg5 << 16) / var11;
            class74.method534(arg2, arg8, arg7, arg3, 0, var10, arg0, var12, 0, 125, arg4);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public final void method410(int arg0, int arg1, int arg2) {
        int var4 = this.field1186 * arg0 >> 12;
        ++field1180;
        int var5 = 38 / ((53 - arg2) / 54);
        int var6 = this.field1185 * arg0 >> 12;
        int var7 = this.field1183 * arg1 >> 12;
        int var8 = this.field1188 * arg1 >> 12;
        class226.method1545(var8, var6, var4, super.field1009, -128, var7, super.field1010);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public static final void method495(int arg0) {
        ++field1187;
        if (~class147.field2655 < -1) {
            class109.method856(-22374);
        } else {
            class83.field1595 = class71.field1214;
            class71.field1214 = null;
            class83.method661(40, 0);
            if (arg0 != -32486) {
                method495(-58);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public static final int method496(int arg0, int arg1) {
        ++field1181;
        if ((~arg0 > -98 || ~arg0 < -123) && (~arg0 > -225 || arg0 > 254 || arg0 == 247)) {
            if (arg0 == 255) {
                return 159;
            } else if (arg0 == 156) {
                return 140;
            } else {
                return arg1 < 82 ? 84 : arg0;
            }
        } else {
            return arg0 + -32;
        }
    }
}
