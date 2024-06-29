import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Z")
    public boolean field718 = true;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
    public static int[] field709 = new int[1000];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lvc;")
    public static class137 field716 = class45.method325("(U4", -46);

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
    public static int[] field708 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lvc;")
    public static class137 field706 = class45.method325("Unerwartete Antwort vom Anmelde)2Server", -46);

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lvc;")
    public static class137 field713 = class45.method325("Das ist eine Mitglieder)2Welt(Q", -46);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lvd;")
    public static class138 field699;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lie;")
    public static class61 field704;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lnb;")
    public static class88 field700;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lnb;")
    public static class88 field719;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
    public static int[] field707;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILnb;II)[Lia;")
    public static final class57[] method242(int arg0, class88 arg1, int arg2, int arg3) {
        int var4 = -37 / ((arg0 - 42) / 63);
        field702++;
        return class8.method55(arg1, arg2, -79, arg3) ? class85.method623(65535) : null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)V")
    public static final void method243(byte arg0, boolean arg1) {
        field712++;
        int var2 = -76 / ((-arg0 - 27) / 63);
        for (int var3 = 0; var3 < class107.field2498; var3++) {
            class56 var4 = class125.field2914[class72.field1526[var3]];
            int var5 = (class72.field1526[var3] << 14) + 536870912;
            if (var4 != null && var4.method384((byte) -124) && var4.field1203.field3222 == arg1 && var4.field1203.method1069(0)) {
                int var6 = var4.field1672 >> 7;
                int var7 = var4.field1646 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1673 == 1 && (var4.field1672 & 0x7F) == 64 && (var4.field1646 & 0x7F) == 64) {
                        if (class2.field41[var6][var7] == class108.field2526) {
                            continue;
                        }
                        class2.field41[var6][var7] = class108.field2526;
                    }
                    if (!var4.field1203.field3209) {
                        var5 += Integer.MIN_VALUE;
                    }
                    class10.field220.method546(class28.field627, var4.field1672, var4.field1646, class32.method241((var4.field1673 - 1) * 64 + var4.field1672, (byte) -24, class28.field627, (var4.field1673 - 1) * 64 + var4.field1646), (var4.field1673 - 1) * 64 + 60, var4, var4.field1652, var5, var4.field1661);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method244(String arg0, int arg1) throws ClassNotFoundException {
        field720++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg1 != 4349) {
                field713 = null;
            }
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method245(int arg0, int arg1) {
        field711++;
        if (class107.field2493 == arg0) {
            return;
        }
        if (class107.field2493 == 0) {
            class59.method427(0);
        }
        if (arg0 == 20 || arg0 == 40) {
            class88.field2105 = 0;
            class124.field2868 = 0;
            class28.field634 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && field704 != null) {
            field704.method434(64);
            field704 = null;
        }
        if (class107.field2493 == 25 || class107.field2493 == 40) {
            class21.method178(255);
            class62.method451();
        }
        if (class107.field2493 == 25) {
            class125.field2883 = 1;
            class13.field279 = 0;
            class123.field2851 = 1;
            class114.field2700 = 0;
            class102.field2381 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            client.method190(1);
            class32.method239((byte) 59);
            if (class126.field2927 == null) {
                class126.field2927 = class44.method311(765, -108, 503, class124.field2871);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class126.field2927 = null;
            client.method190(1);
            class49.method352((byte) -102, class58.field1248, class36.field793, class124.field2871);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class126.field2927 = null;
            class32.method239((byte) 59);
            class84.method612(7759444, class124.field2871, class58.field1248);
        }
        class107.field2493 = arg0;
        class86.field2058 = true;
        if (arg1 > -77) {
            method242(105, null, -7, 94);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method246(byte arg0) {
        field719 = null;
        field709 = null;
        field713 = null;
        field699 = null;
        field700 = null;
        field706 = null;
        if (arg0 < 104) {
            field708 = null;
        }
        field716 = null;
        field707 = null;
        field708 = null;
        field704 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field710++;
        int var5 = -45 % ((58 - arg4) / 56);
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg1; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class28.field615[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        class61.field1329[0][var7][var6] = class61.field1329[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < 103) {
                        class61.field1329[0][var7][var6] = class61.field1329[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        class61.field1329[0][var7][var6] = class61.field1329[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class61.field1329[0][var7][var6] = class61.field1329[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field705 = arg1;
        this.field698 = arg0;
        this.field718 = arg6;
        this.field715 = arg2;
        this.field714 = arg4;
        this.field697 = arg3;
        this.field701 = arg5;
    }
}
