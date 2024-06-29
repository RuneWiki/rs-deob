import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class66 extends class28 {

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    private final int field1154;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    private final int field1152;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    private final int field1149;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    private final int field1158;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Lli;")
    public static class185 field1147 = class245.method1649("::setparticles", -29);

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field1145 = 2;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Lli;")
    public static class185 field1159 = class245.method1649("Verbindung mit Update)2Server)3)3)3", -71);

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Lli;")
    public static class185 field1160 = class245.method1649("leuchten1:", -100);

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field1163 = 100;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Lwc;")
    public static class85 field1161;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        ++field1150;
        int var4 = this.field1158 * arg1 >> 12;
        int var5 = this.field1152 * arg2 >> 12;
        if (arg0 <= 119) {
            this.method182(57, 28, -123);
        }
        int var6 = this.field1154 * arg1 >> 12;
        int var7 = this.field1149 * arg2 >> 12;
        class166.method1185(var5, var4, -24025, super.field466, var6, var7);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        int var4 = 124 % ((50 - arg1) / 61);
        ++field1156;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1147 = null;
        field1161 = null;
        field1159 = null;
        if (arg0 != -1551364180) {
            field1147 = null;
        }
        field1160 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1154 = arg0;
        this.field1152 = arg1;
        this.field1149 = arg3;
        this.field1158 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        ++field1157;
        if (arg0 != 30792) {
            method443(4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)I")
    public static final int method444(byte arg0, int arg1) {
        if (arg0 > -87) {
            field1145 = 60;
        }
        ++field1153;
        return 255 & arg1;
    }
}
