import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class266 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3801 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[C")
    public static char[] field3803 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lpo;")
    public class577 field3804;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIILjava/lang/String;III)V")
    public static final void method1752(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field3808++;
        class741 var8 = new class741();
        var8.field10340 = arg0;
        var8.field10343 = arg3;
        if (arg1 != 120) {
            field3803 = null;
        }
        var8.field10339 = arg2;
        var8.field10337 = arg4;
        var8.field10342 = arg6;
        var8.field10345 = class703.field9918 + arg7;
        var8.field10344 = arg5;
        class562.field8147.method1521(var8, -24256);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)Lffa;")
    public final synchronized class676 method1753(boolean arg0) {
        field3810++;
        class676 var2 = (class676) this.field3804.field8289.method2216(0, (long) this.field3806);
        if (var2 != null) {
            return var2;
        }
        class676 var3 = class676.method3850(this.field3804.field8285, this.field3806, 0);
        if (arg0) {
            return null;
        } else {
            if (var3 != null) {
                this.field3804.field8289.method2213((byte) -16, (long) this.field3806, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsl;B)V")
    public final void method1754(class479 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                if (arg1 <= 58) {
                    this.method1755(null, (byte) 111, 33);
                }
                field3805++;
                return;
            }
            this.method1755(arg0, (byte) 26, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lsl;BI)V")
    private final void method1755(class479 arg0, byte arg1, int arg2) {
        field3809++;
        if (arg2 == 1) {
            this.field3806 = arg0.method2882(-1);
        } else if (arg2 == 2) {
            this.field3802 = arg0.method2886(true);
            this.field3807 = arg0.method2886(true);
        }
        if (arg1 != 26) {
            field3801 = 61;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field3803 = null;
        if (arg0 != -2) {
            field3801 = -115;
        }
    }
}
