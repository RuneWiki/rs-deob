import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class88 extends class164 {

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
    public byte[] field1241;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field1237 = 0;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "[I")
    public static int[] field1238 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V", line = 3)
    public static final void method697(int arg0) {
        if (class248.field3402.toLowerCase().indexOf("microsoft") == -1) {
            class586.field8510[91] = 42;
            class586.field8510[92] = 74;
            class586.field8510[59] = 57;
            class586.field8510[44] = 71;
            class586.field8510[61] = 27;
            class586.field8510[93] = 43;
            class586.field8510[46] = 72;
            class586.field8510[47] = 73;
            class586.field8510[45] = 26;
            if (class248.field3418 == null) {
                class586.field8510[222] = 59;
                class586.field8510[192] = 58;
            } else {
                class586.field8510[520] = 59;
                class586.field8510[192] = 28;
                class586.field8510[222] = 58;
            }
        } else {
            class586.field8510[221] = 43;
            class586.field8510[191] = 73;
            class586.field8510[220] = 74;
            class586.field8510[187] = 27;
            class586.field8510[186] = 57;
            class586.field8510[222] = 59;
            class586.field8510[219] = 42;
            class586.field8510[189] = 26;
            class586.field8510[190] = 72;
            class586.field8510[188] = 71;
            class586.field8510[192] = 58;
            class586.field8510[223] = 28;
        }
        if (arg0 == 32060) {
            field1236++;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)I", line = 54)
    public static final int method698(int arg0, byte arg1, int arg2) {
        if (arg1 < 34) {
            return -63;
        }
        field1242++;
        int var3 = class24.method361(-83, arg0 - 1, arg2 + -1) + class24.method361(-66, arg0 + 1, arg2 - 1) - (-class24.method361(-73, arg0 - 1, arg2 + 1) - class24.method361(-77, arg0 + 1, arg2 - -1));
        int var4 = class24.method361(-85, arg0 - 1, arg2) + class24.method361(-24, arg0 + 1, arg2) - (-class24.method361(-47, arg0, arg2 + -1) - class24.method361(-35, arg0, arg2 + 1));
        int var5 = class24.method361(-77, arg0, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V", line = 71)
    public static void method699(int arg0) {
        field1238 = null;
        int var1 = 61 % ((-arg0 - 34) / 58);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([B)V", line = 88)
    public class88(byte[] arg0) {
        this.field1241 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V", line = 96)
    public static final void method700(int arg0) {
        class601.field8666.method2096(65280);
        if (arg0 > -19) {
            method699(41);
        }
        field1240++;
        class74.field1112 = null;
        class505.field7053 = 1;
        class548.field7959 = null;
    }
}
