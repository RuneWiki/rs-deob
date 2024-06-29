import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class307 extends class175 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        if (arg0) {
            field4361++;
            return class693.field9221;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static final void method1983(int arg0) {
        if (arg0 > -12) {
            method1985(-77, -19, 113, -97, 19, false, -101, 11, false);
        }
        class614.field8305 = new String[500];
        class598.field8141 = class355.field5157.field8769 + class355.field5157.field8782 + 2;
        class687.field9194 = class643.field8657.field8769 + class643.field8657.field8782 + 2;
        field4365++;
        for (int var1 = 0; var1 < class614.field8305.length; var1++) {
            class614.field8305[var1] = "";
        }
        class280.method1834((byte) 88, class58.field697.method365(class55.field647, (byte) 125));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lec;I)[Lre;")
    public static final class626[] method1984(class248 arg0, int arg1) {
        field4363++;
        if (!arg0.method1536((byte) -105)) {
            return new class626[0];
        } else if (arg1 == 19304) {
            class621 var2 = arg0.method1544(false);
            while (var2.field8405 == 0) {
                class171.method1152(10L, false);
            }
            if (var2.field8405 == 2) {
                return new class626[0];
            }
            int[] var3 = (int[]) var2.field8403;
            class626[] var4 = new class626[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class626 var6 = new class626();
                var4[var5] = var6;
                var6.field8479 = var3[var5 << 2];
                var6.field8481 = var3[(var5 << 2) + 1];
                var6.field8484 = var3[(var5 << 2) + 2];
                var6.field8483 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIZIIZ)Z")
    public static final boolean method1985(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8) {
        field4362++;
        int var9 = class625.field8475.field6198[0];
        int var10 = class625.field8475.field6197[0];
        if (var9 < 0 || class102.field1467 <= var9 || var10 < 0 || var10 >= class393.field5663) {
            return false;
        } else if (arg1 < 0 || arg1 >= class102.field1467 || arg7 < 0 || arg7 >= class393.field5663) {
            return false;
        } else if (arg8) {
            int var11 = class22.method121(arg0, arg1, 0, class719.field9786, arg7, arg5, arg4, var10, var9, class257.field3830[class625.field8475.field2813], arg3, arg6, class605.field8203, class625.field8475.method2563(-12840), arg2);
            if (var11 < 1) {
                return false;
            }
            class302.field4242 = class719.field9786[var11 - 1];
            class15.field148 = class605.field8203[var11 - 1];
            class635.field8577 = false;
            class70.method581(-128);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class307() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
    public static final int method1986(String arg0, String arg1, int arg2, int arg3) {
        field4364++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > var7 - var9) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class309.method1998((byte) 123, var22);
            var9 = class309.method1998((byte) 121, var24);
            char var26 = class28.method163(arg2, -1, var22);
            char var27 = class28.method163(arg2, -1, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class577.method3272(-114, arg2, var28) - class577.method3272(48, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg3 != 1) {
            return 39;
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class577.method3272(-111, arg2, var20) - class577.method3272(25, arg2, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class577.method3272(-93, arg2, var14) - class577.method3272(65, arg2, var15);
            }
        }
        return 0;
    }
}
