import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 {

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lta;")
    private class123 field178 = new class123();

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lvc;")
    public static class137 field170 = class45.method325("Titelbild geladen)3", -46);

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lvc;")
    public static class137 field174 = class45.method325("Bitte versuchen Sie)1", -46);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lvc;")
    private static class137 field172 = class45.method325("Unable to find ", -46);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lvc;")
    public static class137 field177 = field172;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field181 = -1;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lvc;")
    public static class137 field179 = class45.method325(" )2> @lre@", -46);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lqa;")
    public static class105 field184 = new class105(20);

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lvc;")
    public static class137 field190 = class45.method325("Handel)4Duell", -46);

    @OriginalMember(owner = "client!b", name = "v", descriptor = "[I")
    public static int[] field189 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Lvc;")
    public static class137 field191 = class45.method325("Name des Gegenstands eingeben:", -46);

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Lvc;")
    public static class137 field194 = class45.method325("::qa_op_test", -46);

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Lvc;")
    public static class137 field195 = class45.method325("", -46);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "Loa;")
    public static class93 field193;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public static int[] field186;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[Lvc;")
    public static class137[] field187;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[Lvd;")
    public static class138[] field180;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)I")
    public static final int method51(int arg0, int arg1, int arg2, int arg3) {
        field176++;
        int var4 = arg3 & arg2 - 1;
        int var5 = arg0 / arg2;
        int var6 = arg2 - 1 & arg0;
        int var7 = arg3 / arg2;
        if (arg1 <= 71) {
            field190 = null;
        }
        int var8 = class124.method930(var7, (byte) 118, var5);
        int var9 = class124.method930(var7 + 1, (byte) 122, var5);
        int var10 = class124.method930(var7, (byte) 111, var5 + 1);
        int var11 = class124.method930(var7 + 1, (byte) 118, var5 + 1);
        int var12 = class69.method488(arg2, var8, 65536, var4, var9);
        int var13 = class69.method488(arg2, var10, 65536, var4, var11);
        return class69.method488(arg2, var12, 65536, var6, var13);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lta;")
    public final class123 method52(byte arg0) {
        field168++;
        class123 var2 = this.field178.field2846;
        if (arg0 != -4) {
            field187 = null;
        }
        if (this.field178 == var2) {
            return null;
        } else {
            var2.method923(10);
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public static final int method53(int arg0) {
        if (arg0 != 1) {
            method53(124);
        }
        field183++;
        return 19;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lta;I)V")
    public final void method54(class123 arg0, int arg1) {
        field175++;
        if (arg0.field2861 != null) {
            arg0.method923(arg1 - 758);
        }
        arg0.field2861 = this.field178.field2861;
        if (arg1 == 768) {
            arg0.field2846 = this.field178;
            arg0.field2861.field2846 = arg0;
            arg0.field2846.field2861 = arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lnb;III)Z")
    public static final boolean method55(class88 arg0, int arg1, int arg2, int arg3) {
        field182++;
        int var4 = 67 / ((arg2 - 2) / 55);
        byte[] var5 = arg0.method668(arg1, -214, arg3);
        if (var5 == null) {
            return false;
        } else {
            class128.method958((byte) -102, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Lta;")
    public final class123 method56(byte arg0) {
        field169++;
        if (arg0 <= 55) {
            method59(-127);
        }
        class123 var2 = this.field178.field2846;
        return this.field178 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lta;B)V")
    public final void method57(class123 arg0, byte arg1) {
        if (arg0.field2861 != null) {
            arg0.method923(10);
        }
        arg0.field2846 = this.field178.field2846;
        field173++;
        arg0.field2861 = this.field178;
        if (arg1 != -123) {
            method55(null, 29, -125, -25);
        }
        arg0.field2861.field2846 = arg0;
        arg0.field2846.field2861 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lme;I)Z")
    public static final boolean method58(class85 arg0, int arg1) {
        if (arg1 != 1792) {
            return false;
        }
        field185++;
        if (class4.field103) {
            if (class28.method218(arg1 ^ 0x3F95, arg0) != 0) {
                return false;
            }
            if (arg0.field1952 == 0) {
                return false;
            }
        }
        return arg0.field1992;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class8() {
        this.field178.field2846 = this.field178;
        this.field178.field2861 = this.field178;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method59(int arg0) {
        field194 = null;
        field184 = null;
        field187 = null;
        field189 = null;
        field186 = null;
        field195 = null;
        if (arg0 < 79) {
            method59(-10);
        }
        field170 = null;
        field193 = null;
        field172 = null;
        field179 = null;
        field190 = null;
        field177 = null;
        field174 = null;
        field191 = null;
        field180 = null;
    }
}
