import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lec;")
    public static class32 field1668 = class73.method594(" x ", true);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lec;")
    public static class32 field1665 = class73.method594("(U3", true);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lec;")
    public static class32 field1672 = class73.method594("null", true);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lec;")
    public static class32 field1674 = class73.method594("runes", true);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lec;")
    public static class32 field1675 = class73.method594("blinken3:", true);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lec;")
    public static class32 field1678 = class73.method594("Sie befinden sich in einem Mitglieder)2Gebiet(Q", true);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lec;")
    public static class32 field1669 = class73.method594("Benutzen Sie bitte eine andere Welt)3", true);

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lec;")
    public static class32 field1681 = class73.method594("60 Sekunden noch einmal)3)3)3", true);

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lec;")
    private static class32 field1682 = class73.method594("Click to switch", true);

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lec;")
    public static class32 field1688 = class73.method594("Neuer Benutzer", true);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lec;")
    public static class32 field1667 = field1682;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lec;")
    public static class32 field1664 = class73.method594("Spiel)2Engine wird gestartet)3)3)3", true);

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Lec;")
    public static class32 field1689 = class73.method594("sl_back", true);

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[Lec;")
    public static class32[] field1686 = new class32[100];

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lec;")
    public static class32 field1676 = class73.method594("Clientscript error in: ", true);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lf;")
    public static class36 field1666;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILhb;)V")
    public static final void method582(int arg0, class51 arg1) {
        field1680++;
        if (arg0 >= -69) {
            field1686 = null;
        }
        for (int var2 = 0; var2 < class5.field99.length; var2++) {
            class5.field99[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class5.field99[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class9.field160[var15] = (class5.field99[var15 - 1] + class5.field99[var15 + 1] + class5.field99[var15 + -128] + class5.field99[var15 + 128]) / 4;
                }
            }
            int[] var13 = class5.field99;
            class5.field99 = class9.field160;
            class9.field160 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1172; var7++) {
            for (int var8 = 0; var8 < arg1.field1168; var8++) {
                if (arg1.field1165[var6++] != 0) {
                    int var9 = var8 + arg1.field1171 + 16;
                    int var10 = var7 + arg1.field1166 + 16;
                    int var11 = (var10 << 7) + var9;
                    class5.field99[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1663++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (arg3 == var8) {
            return arg1;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public static final boolean method584(int arg0, int arg1) {
        if (arg1 != 0) {
            field1668 = null;
        }
        field1670++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lf;II)Lec;")
    public static final class32 method585(class36 arg0, int arg1, int arg2) {
        field1671++;
        if (arg2 != 12874) {
            method583(-49, -116, -108, -125, -109, 41, 113);
        }
        if (!class13.method69(0, class147.method1102(arg2 ^ 0xFFFFCDCC, arg0), arg1) && arg0.field795 == null) {
            return null;
        } else if (arg0.field739 == null || arg0.field739.length <= arg1 || arg0.field739[arg1] == null || arg0.field739[arg1].method275(-91).method240((byte) 71) == 0) {
            return class146.field3320 ? class52.method403(new class32[] { class111.field2605, class159.method1230(arg1, arg2 ^ 0x324A) }, (byte) -20) : null;
        } else {
            return arg0.field739[arg1];
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILvc;)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, class149 arg4) {
        field1687++;
        if (class143.field3279 >= 50 || class114.field2648 == 0 || (arg4.field3370 == null || arg3 >= arg4.field3370.length)) {
            return;
        }
        int var5 = arg4.field3370[arg3];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class53.field1196[class143.field3279] = var6;
        int var7 = var5 >> 4 & 0x7;
        int var8 = var5 & 0xF;
        int var9 = (arg1 - 64) / 128;
        int var10 = (arg2 - 64) / 128;
        class126.field2925[class143.field3279] = var7;
        class112.field2628[class143.field3279] = 0;
        class65.field1510[class143.field3279] = null;
        class114.field2674[class143.field3279] = (var10 << 16) + (var9 << 8) + var8;
        int var11 = 83 / ((12 - arg0) / 35);
        class143.field3279++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method587(int arg0) {
        class34.field710 = new class156(arg0);
        field1684++;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lkb;)V")
    public class71(class71 arg0) {
        this.field1673 = arg0.field1673;
        this.field1683 = arg0.field1683;
        this.field1685 = arg0.field1685;
        this.field1677 = arg0.field1677;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method588(int arg0) {
        field1688 = null;
        field1667 = null;
        field1676 = null;
        field1678 = null;
        field1689 = null;
        field1666 = null;
        field1681 = null;
        field1686 = null;
        field1664 = null;
        field1672 = null;
        field1668 = null;
        field1669 = null;
        field1665 = null;
        field1674 = null;
        if (arg0 >= -125) {
            field1678 = null;
        }
        field1675 = null;
        field1682 = null;
    }
}
