import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class451 {

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Ljm;")
    public static class485 field6502 = new class485(21, 11);

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field6505 = 0;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "[Z")
    public static boolean[] field6504 = new boolean[100];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "Lrs;")
    public static class462 field6507;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Lfm;")
    public static class515 field6506;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2655(boolean arg0, int arg1) {
        if (!arg0) {
            field6502 = null;
        }
        field6501++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
    public static final int method2656(int arg0, int arg1) {
        if (arg1 > -85) {
            return 28;
        } else {
            field6500++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(FIFIIFFII[FI)V")
    public abstract void method1930(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method2657(byte arg0) {
        field6504 = null;
        field6507 = null;
        field6506 = null;
        field6502 = null;
        int var1 = 52 / ((-arg0 - 24) / 58);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lbs;IZI)V")
    public static final void method2658(class483 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method2659(null, (byte) -100);
        }
        field6503++;
        class84.field1168[arg1][arg3] = arg0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2659(String arg0, byte arg1) {
        field6499++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class258.method1502(95, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class258.method1502(95, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class65.method408(var7, 0)) {
                char var8 = class193.method1174(var7, (byte) 28);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (arg1 != -120) {
            method2657((byte) 66);
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
