import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class66 extends class234 {

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Z")
    public static boolean field1449 = false;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lqfa;")
    public static class85 field1443 = new class85(2, 8);

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Z")
    public static boolean field1450 = false;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(CB)Z")
    public static final boolean method766(char arg0, byte arg1) {
        field1447++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class90.method879(arg0, (byte) 30)) {
            return true;
        } else {
            if (arg1 <= 124) {
                field1449 = false;
            }
            char[] var2 = class430.field6217;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class514.field7262;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lsc;Lia;IIIIIIIIII)V")
    public class66(class320 arg0, class547 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1448 = arg11;
        this.field1445 = arg10;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lua;IIILlk;Lla;IILjava/lang/String;ILdaa;I)V")
    public static final void method767(class619 arg0, int arg1, int arg2, int arg3, class545 arg4, class421 arg5, int arg6, int arg7, String arg8, int arg9, class11 arg10, int arg11) {
        field1446++;
        int var12;
        if (class423.field6123 == 4) {
            var12 = (int) class591.field8509 & 0x3FFF;
        } else {
            var12 = (int) class591.field8509 + class527.field7433 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field7718 / 2, arg4.field7652 / 2) + 10;
        int var14 = arg2 * arg2 + arg9 * arg9;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class509.field7210[var12];
        int var16 = class509.field7220[var12];
        if (class423.field6123 != 4) {
            var16 = var16 * 256 / (class130.field2350 + 256);
            var15 = var15 * 256 / (class130.field2350 + 256);
        }
        int var17 = arg2 * var15 + arg9 * var16 >> 14;
        int var18 = arg2 * var16 - (arg9 * var15) >> 14;
        int var19 = arg10.method285(arg8, null, 20034, 100);
        int var20 = -90 / ((5 - arg7) / 48);
        int var21 = arg10.method290(arg8, 100, 0, (byte) 116, null);
        int var22 = var17 - var19 / 2;
        if ((-arg4.field7718) <= var22 && arg4.field7718 >= var22 && -arg4.field7652 <= var18 && arg4.field7652 >= var18) {
            arg5.method2554(0, arg4.field7652 / 2 + arg1 - arg6 - var18 - var21, arg0, 0, 94, arg11, 50, arg8, null, null, 0, var19, arg3, arg4.field7718 / 2 + arg3 + var22, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method768(int arg0) {
        if (arg0 != 2) {
            method767(null, 68, -115, -85, null, null, 63, -83, null, 47, null, -70);
        }
        field1443 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        field1444++;
        if (arg0 != 6686) {
            this.method474(20);
        }
        return class82.field1599;
    }
}
