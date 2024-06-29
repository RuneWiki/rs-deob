import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 extends class75 {

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Lod;")
    public static class101 field3635 = class46.method335(93, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    public static int[] field3637 = new int[100];

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Z")
    public static boolean field3639 = false;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "Lod;")
    public static class101 field3633 = class46.method335(107, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!we", name = "S", descriptor = "Lod;")
    public static class101 field3640 = class46.method335(-110, "Wordpack geladen)3");

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field3636 = -2;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "Lod;")
    public static class101 field3645 = class46.method335(113, "Konfig geladen)3");

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Lc;")
    public static class15 field3628;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Z")
    public static boolean field3632;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLtf;I)V")
    private final void method1218(boolean arg0, class138 arg1, int arg2) {
        if (!arg0) {
            method1221(-28, null);
        }
        if (arg2 == 1) {
            this.field3641 = arg1.method1098(arg0);
            this.field3634 = arg1.method1055(116);
            this.field3642 = arg1.method1055(122);
        }
        field3643++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILtf;)V")
    public final void method1219(int arg0, class138 arg1) {
        while (true) {
            int var3 = arg1.method1055(115);
            if (var3 == 0) {
                int var4 = -93 % ((arg0 - 55) / 48);
                field3629++;
                return;
            }
            this.method1218(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1220(byte arg0) {
        field3635 = null;
        field3640 = null;
        field3633 = null;
        field3645 = null;
        if (arg0 < 73) {
            method1220((byte) 107);
        }
        field3628 = null;
        field3637 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILia;)V")
    public static final void method1221(int arg0, class57 arg1) {
        if (class143.field3305 == arg1.field1349 || arg1.field1300 == -1 || arg1.field1303 != 0 || arg1.field1321 + 1 > class8.method39(arg1.field1300, (byte) -80).field2066[arg1.field1301]) {
            int var2 = arg1.field1349 - arg1.field1322;
            int var3 = class143.field3305 - arg1.field1322;
            int var4 = arg1.field1290 * 128 + arg1.field1334 * 64;
            int var5 = arg1.field1334 * 64 + arg1.field1325 * 128;
            arg1.field1341 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var6 = arg1.field1295 * 128 + arg1.field1334 * 64;
            int var7 = arg1.field1334 * 64 + arg1.field1312 * 128;
            arg1.field1298 = ((var2 - var3) * var6 + var3 * var7) / var2;
        }
        if (arg1.field1343 == 0) {
            arg1.field1307 = 1024;
        }
        if (arg1.field1343 == 1) {
            arg1.field1307 = 1536;
        }
        field3638++;
        if (arg1.field1343 == 2) {
            arg1.field1307 = 0;
        }
        arg1.field1276 = 0;
        if (arg0 != -29431) {
            method1221(-76, null);
        }
        if (arg1.field1343 == 3) {
            arg1.field1307 = 512;
        }
        arg1.field1310 = arg1.field1307;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII[B[Lge;I)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class47[] arg8, int arg9) {
        field3631++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg4 + var15 > 0 && arg4 + var15 < 103) {
                    arg8[arg1].field1118[arg6 + var10][arg4 + var15] = class41.method307(arg8[arg1].field1118[arg6 + var10][arg4 + var15], -16777217);
                }
            }
        }
        class138 var11 = new class138(arg7);
        if (arg3 >= -69) {
            method1221(-105, null);
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg5 == var12 && arg0 <= var13 && var13 < arg0 + 8 && arg2 <= var14 && var14 < arg2 + 8) {
                        class48.method357(class134.method1032(arg9, (byte) 60, var13 & 0x7, var14 & 0x7) + arg6, var11, 0, 8, arg4 + class31.method238(arg9, var14 & 0x7, var13 & 0x7, -30142), arg1, 0, arg9);
                    } else {
                        class48.method357(-1, var11, 0, 8, -1, 0, 0, 0);
                    }
                }
            }
        }
    }
}
