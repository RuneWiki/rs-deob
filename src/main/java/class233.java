import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class233 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Z")
    public boolean field3547 = false;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field3539 = 0;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field3550 = 0;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3543 = "Please wait...";

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lec;")
    public static class99 field3540 = new class99(100);

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
    public static int[] field3555 = new int[2000];

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Lgk;")
    public static class214 field3552 = new class214();

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lde;")
    public class236 field3551;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3553;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 13)
    public static void method1633(int arg0) {
        field3543 = null;
        field3555 = null;
        field3552 = null;
        field3540 = null;
        if (arg0 != -8250) {
            field3552 = (class214) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1634(byte arg0) {
        if (class28.field334 != -1) {
            class13.method98(-17099, class28.field334);
        }
        field3544++;
        int var1 = 0;
        if (arg0 <= 2) {
            field3542 = -71;
        }
        while (var1 < class184.field2913) {
            if (class121.field1861[var1]) {
                class331.field5117[var1] = true;
            }
            class30.field357[var1] = class121.field1861[var1];
            class121.field1861[var1] = false;
            var1++;
        }
        if (class73.field1058) {
            class174.field2802 = true;
        }
        class163.field2648 = -1;
        class322.field4971 = null;
        class98.field1404 = field3542;
        class213.field3275 = -1;
        if (class28.field334 != -1) {
            class184.field2913 = 0;
            class270.method1899(0);
        }
        if (class73.field1058) {
            class175.method1314();
        } else {
            class287.method1985();
        }
        class228.field3488 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILmn;IIB)V", line = 80)
    public static final void method1635(int arg0, class161 arg1, int arg2, int arg3, byte arg4) {
        field3546++;
        if (arg4 != 55) {
            return;
        }
        if (class73.field1058) {
            class175.method1316(arg2, arg0, arg1.field2619 + arg2, arg1.field2490 + arg0);
        }
        if (class260.field4003 < 3) {
            if (class73.field1058) {
                ((class44) class39.field574).method345(arg2, arg0, arg1.field2619, arg1.field2490, class39.field574.field4175 / 2, class39.field574.field4184 / 2, (int) class243.field3695, 256, (class44) arg1.method1202(-104, false));
            } else {
                ((class195) class39.field574).method135(arg2, arg0, arg1.field2619, arg1.field2490, class39.field574.field4175 / 2, class39.field574.field4184 / 2, (int) class243.field3695, 256, arg1.field2478, arg1.field2556);
            }
        } else if (class73.field1058) {
            class269 var5 = arg1.method1202(70, false);
            if (var5 != null) {
                var5.method124(arg2, arg0);
            }
        } else {
            class287.method1975(arg2, arg0, 0, arg1.field2478, arg1.field2556);
        }
        class331.field5117[arg3] = true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BILjava/lang/String;I)I", line = 125)
    public static final int method1636(int arg0, int arg1, byte[] arg2, int arg3, String arg4, int arg5) {
        int var6 = arg5 - arg3;
        field3545++;
        if (arg0 > -52) {
            return -22;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg1 + var7] = -97;
            } else {
                arg2[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 268)
    public static final void method1637(int arg0) {
        field3548++;
        class117.method898();
        class178.field2831 = new class321[9];
        class178.field2831[1] = new class53();
        class178.field2831[2] = new class127();
        class178.field2831[3] = new class46();
        class178.field2831[4] = new class88();
        class178.field2831[5] = new class96();
        class178.field2831[6] = new class86();
        if (arg0 <= -71) {
            class178.field2831[7] = new class63();
        }
    }
}
