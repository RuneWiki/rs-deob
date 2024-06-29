import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class495 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lfp;")
    public class467 field6953 = new class467();

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lfp;")
    private class467 field6954;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lfp;")
    public final class467 method2958(byte arg0) {
        int var2 = -77 / ((arg0 - 64) / 58);
        field6951++;
        class467 var3 = this.field6954;
        if (this.field6953 == var3) {
            this.field6954 = null;
            return null;
        } else {
            this.field6954 = var3.field6370;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILfp;)V")
    public final void method2959(int arg0, class467 arg1) {
        field6950++;
        if (arg1.field6371 != null) {
            arg1.method2784(1670470983);
        }
        arg1.field6371 = this.field6953.field6371;
        arg1.field6370 = this.field6953;
        if (arg0 > -91) {
            field6946 = 48;
        }
        arg1.field6371.field6370 = arg1;
        arg1.field6370.field6371 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
    public final int method2960(int arg0) {
        field6952++;
        int var2 = arg0;
        class467 var3 = this.field6953.field6370;
        while (this.field6953 != var3) {
            var3 = var3.field6370;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;IIZIZLjava/lang/String;)V")
    public static final void method2961(String arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, String arg6) {
        class743.field10355.field7898 = 1;
        field6949++;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg2 != -1) {
            class752 var11 = class223.field3134.method2390(1, arg2);
            if (var11 == null || arg3 != var11.method4169(41)) {
                return;
            }
            if (var11.method4169(108)) {
                var10 = var11.field10449;
            } else {
                var9 = var11.field10448;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class487.field6572.field7134; var13++) {
            class544 var17 = class487.field6572.method3054(var13, (byte) -99);
            if ((!arg5 || var17.field7634) && var17.field7655 == -1 && var17.field7618 == -1 && var17.field7628 == 0 && var17.field7672.toLowerCase().indexOf(var7) != -1) {
                if (arg2 != -1) {
                    if (arg3) {
                        if (!arg6.equals(var17.method3237(64, var10, arg2))) {
                            continue;
                        }
                    } else if (arg4 != var17.method3238(var9, 25427, arg2)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class178.field2466 = null;
                    class165.field2262 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var18 = new short[var8.length * 2];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = var8[var19];
                    }
                    var8 = var18;
                }
                var8[var12++] = (short) var13;
            }
        }
        class178.field2466 = var8;
        class744.field10375 = 0;
        class165.field2262 = var12;
        int var14 = -124 / ((arg1 - 14) / 47);
        String[] var15 = new String[class165.field2262];
        for (int var16 = 0; var16 < class165.field2262; var16++) {
            var15[var16] = class487.field6572.method3054(var8[var16], (byte) -99).field7672;
        }
        class424.method2588(var15, false, class178.field2466);
        class743.field10355.method3328((byte) -124);
        class743.field10355.field7898 = 2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public final void method2962(byte arg0) {
        field6947++;
        while (true) {
            class467 var2 = this.field6953.field6370;
            if (this.field6953 == var2) {
                if (arg0 != -29) {
                    field6946 = -49;
                }
                this.field6954 = null;
                return;
            }
            var2.method2784(1670470983);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Lfp;")
    public final class467 method2963(int arg0) {
        field6948++;
        class467 var2 = this.field6953.field6370;
        if (this.field6953 == var2) {
            this.field6954 = null;
            return null;
        }
        this.field6954 = var2.field6370;
        if (arg0 >= -26) {
            this.method2958((byte) -105);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class495() {
        this.field6953.field6370 = this.field6953;
        this.field6953.field6371 = this.field6953;
    }
}
