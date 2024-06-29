import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class58 extends class179 {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[Lha;")
    public static class40[] field997 = new class40[2048];

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "[[I")
    public static int[][] field1000 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "[[Z")
    public static boolean[][] field994 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Loe;")
    public static class127 field985 = new class127(76, -2);

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Llt;")
    public static class458 field1002;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
    public final boolean method410(int arg0, int arg1, int arg2) {
        if (arg1 == 8) {
            field1001++;
            return this.field995 <= arg2 && this.field981 >= arg2 && arg0 >= this.field992 && arg0 <= this.field983;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIII)V")
    public static final void method411(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            return;
        }
        field996++;
        class64 var5 = class230.method1387(arg4, (byte) 40, 10);
        var5.method441((byte) 58);
        var5.field1054 = arg1;
        var5.field1059 = arg2;
        var5.field1051 = arg3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI[I)V")
    public final void method412(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[2] = arg0 + this.field992 - this.field984;
        arg3[1] = arg2 + this.field995 - this.field993;
        if (arg1 < 114) {
            this.method417(-111, 62, 116, -107);
        }
        field999++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)Z")
    public final boolean method413(int arg0, byte arg1, int arg2) {
        if (arg1 >= -126) {
            this.method410(-47, -50, -77);
        }
        field988++;
        return arg0 >= this.field993 && this.field987 >= arg0 && arg2 >= this.field984 && this.field998 >= arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB[I)V")
    public final void method414(int arg0, int arg1, byte arg2, int[] arg3) {
        arg3[0] = this.field982;
        if (arg2 >= -25) {
            field980 = -51;
        }
        field990++;
        arg3[2] = this.field984 + arg0 - this.field992;
        arg3[1] = this.field993 + arg1 - this.field995;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public static void method415(int arg0) {
        field997 = null;
        field1002 = null;
        int var1 = -59 % ((arg0 + 74) / 41);
        field994 = null;
        field1000 = null;
        field985 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILha;)V")
    public static final void method416(int arg0, class40 arg1) {
        field991++;
        int var2 = arg1.method236(true);
        class508.field7681 = new class308[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class508.field7681[var3] = new class308();
            class508.field7681[var3].field4660 = arg1.method236(true);
            class508.field7681[var3].field4663 = arg1.method276(Integer.MAX_VALUE);
        }
        class407.field5905 = arg1.method236(true);
        if (arg0 != 9144) {
            return;
        }
        class506.field7648 = arg1.method236(true);
        class177.field2767 = arg1.method236(true);
        class105.field1838 = new class471[class506.field7648 + 1 - class407.field5905];
        for (int var4 = 0; var4 < class177.field2767; var4++) {
            int var5 = arg1.method236(true);
            class471 var6 = class105.field1838[var5] = new class471();
            var6.field4913 = arg1.method257((byte) 71);
            var6.field4916 = arg1.method255((byte) 96);
            var6.field7208 = class407.field5905 + var5;
            var6.field7210 = arg1.method276(Integer.MAX_VALUE);
            var6.field7204 = arg1.method276(Integer.MAX_VALUE);
        }
        class319.field4794 = arg1.method255((byte) 96);
        class239.field3611 = true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
    public final boolean method417(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -27 / ((-arg1 - 29) / 45);
        field989++;
        return this.field982 == arg2 && this.field993 <= arg0 && this.field987 >= arg0 && this.field984 <= arg3 && arg3 <= this.field998;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field982 = arg0;
        this.field995 = arg5;
        this.field984 = arg2;
        this.field993 = arg1;
        this.field992 = arg6;
        this.field981 = arg7;
        this.field998 = arg4;
        this.field983 = arg8;
        this.field987 = arg3;
    }
}
