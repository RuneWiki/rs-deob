import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class249 extends class161 {

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Ljava/lang/String;")
    public String field4069;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "[[I")
    public static int[][] field4071 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4074 = "scroll:";

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "[C")
    public static char[] field4073 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Loa;")
    public static class413 field4072;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Le;Lhm;III)V")
    public static final void method1721(class312 arg0, class120 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class156.field2449) {
            class232 var5 = class423.field6252[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3864 != null && var5.field3864.method186(0)) {
                arg1.method184(0, arg0, 0, 0, true, var5.field3864, 128);
            }
        }
        if (arg4 < class156.field2449) {
            class232 var6 = class423.field6252[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3864 != null && var6.field3864.method186(0)) {
                arg1.method184(128, arg0, 0, 0, true, var6.field3864, 0);
            }
        }
        if (arg3 < class156.field2449 && arg4 < class361.field5513) {
            class232 var7 = class423.field6252[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3864 != null && var7.field3864.method186(0)) {
                arg1.method184(128, arg0, 0, 0, true, var7.field3864, 128);
            }
        }
        if (arg3 < class156.field2449 && arg4 > 0) {
            class232 var8 = class423.field6252[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3864 != null && var8.field3864.method186(0)) {
                arg1.method184(-128, arg0, 0, 0, true, var8.field3864, 128);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZILjava/lang/String;B)Z")
    public static final boolean method1722(boolean arg0, int arg1, String arg2, byte arg3) {
        field4067++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 != 122) {
            field4072 = null;
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lkp;I)V")
    public static final void method1723(class283 arg0, int arg1) {
        arg0.field4543 = false;
        if (arg0.field4542 != null) {
            arg0.field4542.field6201 = 0;
        }
        field4070++;
        if (arg1 != -23046) {
            field4072 = null;
        }
        for (class283 var2 = arg0.method1066(); var2 != null; var2 = arg0.method1064()) {
            method1723(var2, -23046);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)I")
    public static final int method1724(byte arg0, int arg1) {
        field4068++;
        return arg0 == -104 ? arg1 & 0xFF : 34;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field4072 = null;
        if (arg0 <= 23) {
            method1724((byte) 4, 64);
        }
        field4073 = null;
        field4071 = null;
        field4074 = null;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
    public class249() {
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class249(String arg0) {
        this.field4069 = arg0;
    }
}
