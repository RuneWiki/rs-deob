import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class66 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Z")
    public boolean field1149 = true;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lai;")
    public static class10 field1151 = class44.method278("<col=ff0000>", -54);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lai;")
    public static class10 field1158 = class44.method278("nicht hergestellt werden)3", -13);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[Ltd;")
    public static class176[] field1156 = new class176[50];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lwa;")
    public static final class200 method432(int arg0, boolean arg1) {
        field1159++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class205.field3990[var2] == null || class205.field3990[var2][var3] == null) {
            boolean var4 = class42.method270(var2, (byte) -111);
            if (!var4) {
                return null;
            }
        }
        if (arg1) {
            field1151 = null;
        }
        return class205.field3990[var2][var3];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lai;")
    public static final class10 method433(int arg0, int arg1) {
        field1157++;
        if (arg1 <= 77) {
            field1151 = null;
        }
        return arg0 < 999999999 ? class119.method846(0, arg0) : class121.field2332;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public static int method434(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILc;I)Lbf;")
    public static final class17 method435(int arg0, class21 arg1, int arg2) {
        if (arg2 != 16259) {
            field1158 = null;
        }
        field1150++;
        return class42.method267(arg0, 117, arg1) ? class29.method183(false) : null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1160 = arg0;
        this.field1155 = arg5;
        this.field1154 = arg2;
        this.field1149 = arg6;
        this.field1161 = arg3;
        this.field1153 = arg4;
        this.field1148 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method436(int arg0) {
        field1151 = null;
        if (arg0 <= 6) {
            method432(-85, true);
        }
        field1158 = null;
        field1156 = null;
    }
}
