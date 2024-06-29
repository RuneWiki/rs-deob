import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class97 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lng;")
    public static class63 field1811 = new class63(0, 0);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1816 = 100;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lwi;")
    public static class21 field1809;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method728(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1807++;
        int var6 = class2.method10(class100.field1855, (byte) 97, arg4, field1816);
        int var7 = class2.method10(class100.field1855, (byte) 97, arg2, field1816);
        int var8 = class2.method10(class177.field2953, (byte) 97, arg0, class224.field3773);
        int var9 = class2.method10(class177.field2953, (byte) 97, arg3, class224.field3773);
        for (int var10 = var6; var10 <= var7; var10++) {
            class155.method1090(class177.field2963[var10], var8, arg1, 160, var9);
        }
        if (arg5) {
            method728(102, 116, -107, 37, -23, false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILgi;)V")
    public static final void method729(int arg0, class187 arg1) {
        field1812++;
        if (arg0 != 0) {
            method729(-124, (class187) null);
        }
        class60 var2 = (class60) class87.field1677.method443(arg1.field3097.method368((byte) -103), (byte) -33);
        if (var2 == null) {
            class121.method881((class53) null, 0, arg1, true, arg1.field3980[0], (class243) null, class201.field3312, arg1.field3978[0]);
        } else {
            var2.method466(true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILaa;Laa;IIJ)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, class16 arg4, class16 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class55 var10 = new class55();
        var10.field982 = arg8;
        var10.field986 = arg1 * 128 + 64;
        var10.field990 = arg2 * 128 + 64;
        var10.field989 = arg3;
        var10.field993 = arg4;
        var10.field984 = arg5;
        var10.field992 = arg6;
        var10.field991 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class59.field1089[var11][arg1][arg2] == null) {
                class59.field1089[var11][arg1][arg2] = new class65(var11, arg1, arg2);
            }
        }
        class59.field1089[arg0][arg1][arg2].field1233 = var10;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public static final int method731(int arg0) {
        field1810++;
        if (arg0 != 0) {
            field1811 = null;
        }
        return class91.field1723;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method732(int arg0, int arg1) {
        field1813++;
        if (arg0 > -88) {
            field1809 = null;
        }
        client.field1524.method770(true, arg1);
        class188.field3107.method770(true, arg1);
        class20.field416.method770(true, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method733(byte arg0) {
        class6.field73.method1033(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class3.field42[var1] = 0L;
        }
        field1808++;
        if (arg0 < 4) {
            field1816 = 15;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class26.field559[var2] = 0L;
        }
        class17.field381 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method734(byte arg0) {
        field1811 = null;
        int var1 = 109 / ((arg0 + 26) / 52);
        field1809 = null;
    }
}
