import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class155 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field2695 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lij;")
    public static class50 field2694 = class78.method578(121, "Hidden)2use");

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[I")
    public static int[] field2705 = new int[32];

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lij;")
    public static class50 field2704 = class78.method578(124, "null");

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lpe;")
    public static class100 field2697 = new class100(64);

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lda;")
    public static class22 field2706;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[I")
    public static int[] field2702;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[I")
    public static int[] field2707;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lfg;")
    public static final class71 method1088(int arg0) {
        field2698++;
        try {
            if (arg0 != 0) {
                field2695 = null;
            }
            return (class71) Class.forName("ke").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1089(byte arg0) {
        field2695 = null;
        field2694 = null;
        field2702 = null;
        field2705 = null;
        if (arg0 < 74) {
            method1091(false);
        }
        field2704 = null;
        field2707 = null;
        field2706 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([IIIII)V")
    public static final void method1090(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg1--;
        if (arg3 != 160) {
            field2706 = null;
        }
        field2696++;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            arg1 = var12 + 1;
            arg0[arg1] = arg2;
        }
        while (var13 > arg1) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method1091(boolean arg0) {
        for (int var1 = -1; var1 < class78.field1450; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class60.field1116[var1];
            }
            class187 var6 = class71.field1370[var5];
            if (var6 != null && var6.field4017 > 0) {
                var6.field4017--;
                if (var6.field4017 == 0) {
                    var6.field4030 = null;
                }
            }
        }
        field2700++;
        for (int var2 = 0; var2 < class6.field77; var2++) {
            int var3 = class153.field2678[var2];
            class53 var4 = class41.field764[var3];
            if (var4 != null && var4.field4017 > 0) {
                var4.field4017--;
                if (var4.field4017 == 0) {
                    var4.field4030 = null;
                }
            }
        }
        if (arg0) {
            method1092((byte) -60, (class10) null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLce;)Z")
    public static final boolean method1092(byte arg0, class10 arg1) {
        field2703++;
        if (arg1.field259 == 205) {
            class201.field3313 = 250;
            return true;
        } else {
            if (arg0 != -59) {
                field2705 = null;
            }
            return false;
        }
    }
}
