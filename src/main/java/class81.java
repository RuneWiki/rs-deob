import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class81 extends class71 {

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    public static int field1160 = 1;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "Lqg;")
    public static class269 field1175 = null;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "I")
    public static int field1172 = -1;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
    public static int field1179 = 1;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "Lfd;")
    public static class298 field1166;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z")
    public final boolean method586(int arg0, int arg1, int arg2) {
        if (arg2 >= -97) {
            this.method586(13, -16, -38);
        }
        field1163++;
        return this.field1164 <= arg1 && this.field1171 >= arg1 && arg0 >= this.field1177 && arg0 <= this.field1169;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)Z")
    public static final boolean method587(int arg0, int arg1) {
        if (arg0 > -35) {
            method588(false);
        }
        field1159++;
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
    public static void method588(boolean arg0) {
        if (arg0) {
            method588(true);
        }
        field1175 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)Z")
    public final boolean method589(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1164 = 81;
        }
        field1167++;
        return this.field1162 == arg2 && arg1 >= this.field1178 && arg1 <= this.field1174 && this.field1158 <= arg0 && this.field1168 >= arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[IZI)V")
    public final void method590(int arg0, int[] arg1, boolean arg2, int arg3) {
        arg1[1] = arg0 - (this.field1178 - this.field1164);
        field1161++;
        arg1[0] = 0;
        if (arg2) {
            this.method589(12, 26, 87, 75);
        }
        arg1[2] = arg3 + this.field1177 - this.field1158;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[I)V")
    public final void method591(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != -14119) {
            this.method591(-91, -47, -115, null);
        }
        arg3[1] = this.field1178 + arg0 - this.field1164;
        arg3[2] = this.field1158 + arg2 - this.field1177;
        field1176++;
        arg3[0] = this.field1162;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(III)Z")
    public final boolean method592(int arg0, int arg1, int arg2) {
        int var4 = 23 / ((arg0 + 33) / 41);
        field1165++;
        return arg2 >= this.field1178 && this.field1174 >= arg2 && arg1 >= this.field1158 && this.field1168 >= arg1;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1162 = arg0;
        this.field1177 = arg6;
        this.field1169 = arg8;
        this.field1178 = arg1;
        this.field1174 = arg3;
        this.field1158 = arg2;
        this.field1171 = arg7;
        this.field1168 = arg4;
        this.field1164 = arg5;
    }
}
