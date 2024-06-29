import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class147 {

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lec;")
    public static class40 field1782 = new class40("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "J")
    public long field1776;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Lpt;")
    public class147 field1777;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lpt;")
    public class147 field1779;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Z")
    public final boolean method698(boolean arg0) {
        field1785++;
        if (this.field1777 == null) {
            return false;
        } else {
            if (!arg0) {
                method701(80, -5, 36, -57, true, true, 87, -1.9199214F, -101);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static final void method699(int arg0) {
        int var1 = 27 / ((-arg0 - 24) / 51);
        field1778++;
        if (class482.field6811 == null) {
            return;
        }
        if (class482.field6811.field5759 == 1) {
            class482.field6811 = null;
            return;
        }
        if (class482.field6811.field5759 == 2) {
            class334.method2024(class37.field464, class28.field370, 2, 66);
            class482.field6811 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1783++;
        for (class101 var7 = (class101) class192.field2648.method2334(-84); var7 != null; var7 = (class101) class192.field2648.method2340(-97)) {
            if (class204.field2796 >= var7.field1220) {
                var7.method2550(false);
            } else {
                class73.method371(var7.field1223 * 2, arg1 >> 1, arg0, arg6 >> 1, true, (var7.field1224 << 7) + 64, arg4, (var7.field1226 << 7) + 64, var7.field1222);
                class101.field1230.method1124(var7.field1228 | 0xFF000000, 0, (byte) 29, class398.field5662[1] + arg2, class398.field5662[0] + arg3, var7.field1225);
            }
        }
        if (arg5 <= 115) {
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIZZIFI)[[I")
    public static final int[][] method701(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, float arg7, int arg8) {
        field1775++;
        int[][] var9 = new int[arg8][arg2];
        class20 var10 = new class20();
        if (arg5) {
            field1784 = -54;
        }
        var10.field267 = (int) (arg7 * 4096.0F);
        var10.field283 = arg3;
        var10.field273 = arg4;
        var10.field281 = arg0;
        var10.field276 = arg1;
        var10.method15(-84);
        class485.method2863((byte) -127, arg2, arg8);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method127(var9[var11], var11, 99);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        field1788++;
        if (this.field1777 == null) {
            return;
        }
        this.field1777.field1779 = this.field1779;
        this.field1779.field1777 = this.field1777;
        if (arg0 != -114) {
            field1782 = null;
        }
        this.field1779 = null;
        this.field1777 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;BIII[B)I")
    public static final int method703(String arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1780++;
        if (arg1 < 92) {
            return -101;
        }
        int var6 = arg3 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg4 + var7] = -97;
            } else {
                arg5[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method704(int arg0, String arg1, byte arg2) {
        field1787++;
        class244.method1332((byte) 125, class25.field352);
        class350.field5029++;
        class230.field3185.method909(class183.method995((byte) 23, arg1) + 1, -1);
        if (arg2 >= -60) {
            method700(47, -67, 84, -82, 2, (byte) 123, 84);
        }
        class230.field3185.method935(arg1, 92);
        class230.field3185.method938(128, arg0);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
    public static void method705(byte arg0) {
        field1782 = null;
        if (arg0 >= -47) {
            method700(102, -102, -50, 120, 77, (byte) 78, 26);
        }
    }
}
