import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class88 extends class379 {

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Z")
    public boolean field1170 = true;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Z")
    public boolean field1184 = false;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "[C")
    public static char[] field1183 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "Lgt;")
    public class481 field1180;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILes;)Lta;")
    public static final class226 method805(int arg0, class403 arg1) {
        field1168++;
        class553 var2 = class198.method1292(arg1, (byte) 81);
        if (arg0 != 93) {
            method806(null, -70, 47);
        }
        int var3 = arg1.method2381((byte) 66);
        int var4 = arg1.method2381((byte) 109);
        int var5 = arg1.method2390((byte) -101);
        return new class226(var2.field7693, var2.field7699, var2.field7690, var2.field7700, var2.field7694, var2.field7703, var2.field7696, var2.field7688, var2.field7691, var3, var4, var5);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([Lgda;II)V")
    public static final void method806(class61[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class61 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field816;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field816 < (var7 & 0x1) + var6) {
                class61 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method806(arg0, arg1, var4 - 1);
        method806(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILmh;III)V")
    public static final void method807(int arg0, class659 arg1, int arg2, int arg3, int arg4) {
        field1174++;
        long var5 = (long) (arg3 | arg4 << 14 | arg0 << 28);
        class667 var7 = (class667) class673.field9230.method2121(114, var5);
        if (arg2 != 15195) {
            return;
        }
        if (var7 == null) {
            class667 var8 = new class667();
            class673.field9230.method2112(var8, (byte) 6, var5);
            var8.field9164.method2732(arg1, 21939);
            return;
        }
        class340 var9 = class121.field1555.method2882(arg1.field9062, -22087);
        int var10 = var9.field4200;
        if (var9.field4259 == 1) {
            var10 = (arg1.field9064 + 1) * var10;
        }
        for (class659 var11 = (class659) var7.field9164.method2725(37); var11 != null; var11 = (class659) var7.field9164.method2726(-113)) {
            class340 var12 = class121.field1555.method2882(var11.field9062, -22087);
            int var13 = var12.field4200;
            if (var12.field4259 == 1) {
                var13 = (var11.field9064 + 1) * var13;
            }
            if (var13 < var10) {
                class413.method2464(var11, arg1, 4096);
                return;
            }
        }
        var7.field9164.method2732(arg1, 21939);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public static final void method808(byte arg0) {
        field1181++;
        if (class675.field9270.toLowerCase().indexOf("microsoft") == -1) {
            class164.field2006[47] = 73;
            class164.field2006[61] = 27;
            class164.field2006[45] = 26;
            class164.field2006[46] = 72;
            class164.field2006[93] = 43;
            class164.field2006[44] = 71;
            class164.field2006[59] = 57;
            class164.field2006[91] = 42;
            class164.field2006[92] = 74;
            if (class675.field9258 == null) {
                class164.field2006[222] = 59;
                class164.field2006[192] = 58;
            } else {
                class164.field2006[520] = 59;
                class164.field2006[222] = 58;
                class164.field2006[192] = 28;
            }
        } else {
            class164.field2006[219] = 42;
            class164.field2006[190] = 72;
            class164.field2006[192] = 58;
            class164.field2006[188] = 71;
            class164.field2006[191] = 73;
            class164.field2006[189] = 26;
            class164.field2006[221] = 43;
            class164.field2006[187] = 27;
            class164.field2006[222] = 59;
            class164.field2006[220] = 74;
            class164.field2006[186] = 57;
            class164.field2006[223] = 28;
        }
        if (arg0 <= 91) {
            method805(104, null);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)V")
    public static void method809(boolean arg0) {
        field1183 = null;
        if (arg0) {
            field1183 = null;
        }
    }
}
