import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class214 extends class16 {

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "[J")
    public static long[] field3464 = new long[500];

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3472;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lkb;BLkb;)V", line = 7)
    public static final void method1560(class39 arg0, byte arg1, class39 arg2) {
        class24.field347 = arg0;
        field3470++;
        if (arg1 != -126) {
            method1563(true, 64, (String) null, -118);
        }
        class277.field4377 = arg2;
        class152.field2324 = class277.field4377.method261(arg1 ^ 0x1, 3);
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)[Ln;", line = 22)
    public static final class298[] method1561(int arg0) {
        if (arg0 != -789221) {
            field3464 = (long[]) null;
        }
        field3463++;
        class298[] var1 = new class298[class56.field740];
        for (int var2 = 0; var2 < class56.field740; var2++) {
            int var3 = class244.field3885[var2] * class21.field316[var2];
            byte[] var4 = class3.field20[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class305.field4754[class200.method1465(var4[var6], 255)];
            }
            var1[var2] = new class298(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var5);
        }
        class17.method115((byte) 105);
        return var1;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)I", line = 60)
    private final int method1562(int arg0, int arg1, int arg2) {
        if (arg0 >= -28) {
            return 46;
        } else {
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            field3471++;
            return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILjava/lang/String;I)Z", line = 76)
    public static final boolean method1563(boolean arg0, int arg1, String arg2, int arg3) {
        field3469++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg1 != -10659) {
            field3472 = (String) null;
        }
        int var6 = arg2.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
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
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var7 + var11;
            if ((var10 / arg3) != var7) {
                return false;
            }
            var5 = true;
            var7 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIBI)V", line = 154)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = arg1 + arg4;
        field3468++;
        int var9 = arg7 - arg4;
        int var10 = arg4 + arg5;
        int var11 = arg3 - arg4;
        if (arg6 <= 79) {
            return;
        }
        for (int var12 = arg1; var12 < var8; var12++) {
            class245.method1738(48, class310.field4841[var12], arg3, arg5, arg0);
        }
        for (int var13 = arg7; var13 > var9; var13--) {
            class245.method1738(48, class310.field4841[var13], arg3, arg5, arg0);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class310.field4841[var14];
            class245.method1738(48, var15, var10, arg5, arg0);
            class245.method1738(48, var15, var11, var10, arg2);
            class245.method1738(48, var15, arg3, var11, arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 197)
    public static final void method1565(Component arg0, int arg1) {
        field3462++;
        arg0.removeMouseListener(class334.field5188);
        if (arg1 == -22881) {
            arg0.removeMouseMotionListener(class334.field5188);
            arg0.removeFocusListener(class334.field5188);
            class118.field1762 = 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 211)
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(III)I", line = 215)
    public static final int method1566(int arg0, int arg1, int arg2) {
        field3467++;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 != -20219) {
            return 15;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(III)I", line = 245)
    public static final int method1567(int arg0, int arg1, int arg2) {
        if (arg0 > -18) {
            field3464 = (long[]) null;
        }
        field3466++;
        int var3 = arg2 >> 31 & arg1 - 1;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)V", line = 258)
    public static void method1568(byte arg0) {
        field3464 = null;
        field3472 = null;
        if (arg0 < 96) {
            field3464 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(ZI)[I", line = 273)
    public final int[] method8(boolean arg0, int arg1) {
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1];
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                var3[var5] = this.method1562(-49, var4, class27.field396[var5]) % 4096;
            }
        }
        field3465++;
        if (!arg0) {
            field3472 = (String) null;
        }
        return var3;
    }
}
