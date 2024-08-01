import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class class4 extends class147 {

    @OriginalMember(owner = "ac", name = "M", descriptor = "I")
    public int field44 = 0;

    @OriginalMember(owner = "ac", name = "Z", descriptor = "Llf;")
    public class109 field56 = class149.field2872;

    @OriginalMember(owner = "ac", name = "Q", descriptor = "Z")
    public static boolean field48 = false;

    @OriginalMember(owner = "ac", name = "L", descriptor = "Llf;")
    public static class109 field43 = class35.method275("swe", 2);

    @OriginalMember(owner = "ac", name = "Y", descriptor = "Llf;")
    private static class109 field55 = class35.method275("glow2:", 2);

    @OriginalMember(owner = "ac", name = "V", descriptor = "Llf;")
    public static class109 field52 = class35.method275("und die Schaltfl-=che (WSpielkonto erstellen(W am", 2);

    @OriginalMember(owner = "ac", name = "J", descriptor = "Llf;")
    public static class109 field42 = field55;

    @OriginalMember(owner = "ac", name = "T", descriptor = "Llf;")
    public static class109 field51 = class35.method275("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 2);

    @OriginalMember(owner = "ac", name = "db", descriptor = "Llf;")
    public static class109 field60 = field55;

    @OriginalMember(owner = "ac", name = "ab", descriptor = "I")
    public static int field57 = -1;

    @OriginalMember(owner = "ac", name = "G", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "ac", name = "O", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "ac", name = "P", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "ac", name = "R", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "ac", name = "W", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "ac", name = "X", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "ac", name = "bb", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "ac", name = "cb", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "ac", name = "H", descriptor = "[I")
    public int[] field41;

    @OriginalMember(owner = "ac", name = "S", descriptor = "[I")
    public int[] field50;

    @OriginalMember(owner = "ac", name = "N", descriptor = "[Llf;")
    public class109[] field45;

    @OriginalMember(owner = "ac", name = "d", descriptor = "(B)V")
    public static void method15(byte arg0) {
        int var1 = 1 / ((-arg0 - 31) / 50);
        field60 = null;
        field55 = null;
        field52 = null;
        field42 = null;
        field43 = null;
        field51 = null;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZLvg;)Lvg;")
    public static final class200 method16(boolean arg0, class200 arg1) {
        field53++;
        int var2 = class112.method829((byte) -33, class126.method918(arg1, 112));
        if (var2 == 0) {
            return null;
        }
        if (!arg0) {
            method15((byte) -39);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class158.method1078(arg1.field3868, (byte) 119);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "ac", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class164 var8 = new class164();
        var8.field3092 = arg2 / 128;
        var8.field3088 = arg3 / 128;
        var8.field3080 = arg4 / 128;
        var8.field3075 = arg5 / 128;
        var8.field3069 = arg1;
        var8.field3093 = arg2;
        var8.field3082 = arg3;
        var8.field3090 = arg4;
        var8.field3072 = arg5;
        var8.field3089 = arg6;
        var8.field3086 = arg7;
        class103.field2034[arg0][class103.field2029[arg0]++] = var8;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZLja;)V")
    public final void method18(boolean arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method598((byte) 99);
            if (var3 == 0) {
                if (arg0) {
                    this.method18(true, null);
                }
                field54++;
                return;
            }
            this.method19(var3, (byte) -116, arg1);
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IBLja;)V")
    private final void method19(int arg0, byte arg1, class86 arg2) {
        field49++;
        if (arg0 == 1) {
            this.field47 = arg2.method598((byte) 105);
        } else if (arg0 == 2) {
            this.field58 = arg2.method598((byte) 124);
        } else if (arg0 == 3) {
            this.field56 = arg2.method562((byte) 87);
        } else if (arg0 == 4) {
            this.field40 = arg2.method582(15);
        } else if (arg0 == 5) {
            this.field44 = arg2.method569(true);
            this.field45 = new class109[this.field44];
            this.field50 = new int[this.field44];
            for (int var4 = 0; var4 < this.field44; var4++) {
                this.field50[var4] = arg2.method582(15);
                this.field45[var4] = arg2.method562((byte) 87);
            }
        } else if (arg0 == 6) {
            this.field44 = arg2.method569(true);
            this.field50 = new int[this.field44];
            this.field41 = new int[this.field44];
            for (int var5 = 0; var5 < this.field44; var5++) {
                this.field50[var5] = arg2.method582(15);
                this.field41[var5] = arg2.method582(15);
            }
        }
        if (arg1 > -80) {
            this.field41 = null;
        }
    }
}
