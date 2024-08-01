import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bi")
public class class20 extends class147 {

    @OriginalMember(owner = "bi", name = "H", descriptor = "Z")
    public boolean field432 = false;

    @OriginalMember(owner = "bi", name = "L", descriptor = "I")
    public int field435 = -1;

    @OriginalMember(owner = "bi", name = "hb", descriptor = "I")
    public int field456 = -1;

    @OriginalMember(owner = "bi", name = "V", descriptor = "I")
    public int field444 = -1;

    @OriginalMember(owner = "bi", name = "db", descriptor = "I")
    public int field452 = 2;

    @OriginalMember(owner = "bi", name = "ib", descriptor = "I")
    public int field457 = 99;

    @OriginalMember(owner = "bi", name = "fb", descriptor = "I")
    public int field454 = -1;

    @OriginalMember(owner = "bi", name = "sb", descriptor = "I")
    public int field467 = -1;

    @OriginalMember(owner = "bi", name = "kb", descriptor = "I")
    public int field459 = 5;

    @OriginalMember(owner = "bi", name = "P", descriptor = "[I")
    public static int[] field439 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "bi", name = "gb", descriptor = "Llf;")
    public static class109 field455 = class35.method275("mapfunction", 2);

    @OriginalMember(owner = "bi", name = "Z", descriptor = "Llf;")
    public static class109 field448 = class35.method275("(Y<)4col>", 2);

    @OriginalMember(owner = "bi", name = "I", descriptor = "Llf;")
    public static class109 field433 = class35.method275("Schlie-8en", 2);

    @OriginalMember(owner = "bi", name = "X", descriptor = "Llf;")
    public static class109 field446 = class35.method275("welle2:", 2);

    @OriginalMember(owner = "bi", name = "mb", descriptor = "Llf;")
    public static class109 field461 = class35.method275("titlebutton", 2);

    @OriginalMember(owner = "bi", name = "N", descriptor = "Llf;")
    private static class109 field437 = class35.method275(" is already on your friend list)3", 2);

    @OriginalMember(owner = "bi", name = "rb", descriptor = "Llf;")
    private static class109 field466 = class35.method275("This computers address has been blocked", 2);

    @OriginalMember(owner = "bi", name = "cb", descriptor = "Llf;")
    public static class109 field451 = field437;

    @OriginalMember(owner = "bi", name = "R", descriptor = "Llf;")
    public static class109 field441 = field466;

    @OriginalMember(owner = "bi", name = "G", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "bi", name = "K", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "bi", name = "O", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "bi", name = "W", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "bi", name = "Y", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "bi", name = "ab", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "bi", name = "bb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "bi", name = "jb", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "bi", name = "lb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "bi", name = "nb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "bi", name = "ob", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "bi", name = "qb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "bi", name = "M", descriptor = "Lda;")
    public static class32 field436;

    @OriginalMember(owner = "bi", name = "Q", descriptor = "[I")
    public int[] field440;

    @OriginalMember(owner = "bi", name = "T", descriptor = "[I")
    public int[] field442;

    @OriginalMember(owner = "bi", name = "U", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "bi", name = "eb", descriptor = "[I")
    private int[] field453;

    @OriginalMember(owner = "bi", name = "pb", descriptor = "[I")
    public int[] field464;

    @OriginalMember(owner = "bi", name = "a", descriptor = "(II)V")
    public static final void method182(int arg0, int arg1) {
        field465++;
        if (arg1 == -1 || !class36.field798[arg1]) {
            return;
        }
        class55.field1105.method166(arg1, 120);
        if (class169.field3146[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class169.field3146[arg1].length; var3++) {
            if (class169.field3146[arg1][var3] != null) {
                if (class169.field3146[arg1][var3].field3875 == 2) {
                    var2 = false;
                } else {
                    class169.field3146[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class169.field3146[arg1] = null;
        }
        if (arg0 > -51) {
            method183(-103);
        }
        class36.field798[arg1] = false;
    }

    @OriginalMember(owner = "bi", name = "b", descriptor = "(I)V")
    public static void method183(int arg0) {
        field436 = null;
        field461 = null;
        field437 = null;
        field448 = null;
        field455 = null;
        field466 = null;
        field446 = null;
        field433 = null;
        if (arg0 <= 85) {
            method182(63, 63);
        }
        field451 = null;
        field441 = null;
        field439 = null;
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(Lja;B)V")
    public final void method184(class86 arg0, byte arg1) {
        field449++;
        while (true) {
            int var3 = arg0.method598((byte) 85);
            if (var3 == 0) {
                int var4 = -96 / ((arg1 + 30) / 49);
                return;
            }
            this.method186(var3, (byte) 6, arg0);
        }
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(Lbi;IILue;I)Lue;")
    public final class189 method185(class20 arg0, int arg1, int arg2, class189 arg3, int arg4) {
        int var6 = this.field440[arg2];
        class179 var7 = class190.method1286(var6 >> 16, (byte) 72);
        int var8 = var6 & 0xFFFF;
        field431++;
        if (var7 == null) {
            return arg0.method193(arg4, arg3, (byte) -58);
        }
        int var9 = arg0.field440[arg4];
        class179 var10 = class190.method1286(var9 >> 16, (byte) 33);
        int var11 = var9 & 0xFFFF;
        int var12 = -23 / ((-arg1 - 71) / 45);
        if (var10 == null) {
            class189 var13 = arg3.method435(!var7.method1219((byte) 101, var8));
            var13.method425(var7, var8);
            return var13;
        } else {
            class189 var14 = arg3.method435(!var7.method1219((byte) -113, var8) & !var10.method1219((byte) 105, var11));
            var14.method422(var7, var8, var10, var11, this.field453);
            return var14;
        }
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(IBLja;)V")
    private final void method186(int arg0, byte arg1, class86 arg2) {
        if (arg1 != 6) {
            this.method186(-7, (byte) -127, null);
        }
        if (arg0 == 1) {
            int var11 = arg2.method569(true);
            this.field442 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field442[var12] = arg2.method569(true);
            }
            this.field440 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field440[var13] = arg2.method569(true);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field440[var14] = (arg2.method569(true) << 16) + this.field440[var14];
            }
        } else if (arg0 == 2) {
            this.field454 = arg2.method569(true);
        } else if (arg0 == 3) {
            int var4 = arg2.method598((byte) 124);
            this.field453 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field453[var5] = arg2.method598((byte) 121);
            }
            this.field453[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field432 = true;
        } else if (arg0 == 5) {
            this.field459 = arg2.method598((byte) 119);
        } else if (arg0 == 6) {
            this.field435 = arg2.method569(true);
        } else if (arg0 == 7) {
            this.field456 = arg2.method569(true);
        } else if (arg0 == 8) {
            this.field457 = arg2.method598((byte) 123);
        } else if (arg0 == 9) {
            this.field444 = arg2.method598((byte) 72);
        } else if (arg0 == 10) {
            this.field467 = arg2.method598((byte) 100);
        } else if (arg0 == 11) {
            this.field452 = arg2.method598((byte) 120);
        } else if (arg0 == 12) {
            int var6 = arg2.method598((byte) 111);
            this.field443 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field443[var7] = arg2.method569(true);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field443[var8] += arg2.method569(true) << 16;
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method598((byte) 125);
            this.field464 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field464[var10] = arg2.method578((byte) 59);
            }
        }
        field462++;
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(Lue;II)Lue;")
    public final class189 method187(class189 arg0, int arg1, int arg2) {
        field460++;
        int var4 = this.field440[arg1];
        class179 var5 = class190.method1286(var4 >> 16, (byte) 103);
        int var6 = var4 & 0xFFFF;
        if (arg2 != 516678064) {
            field433 = null;
        }
        if (var5 == null) {
            return arg0.method435(true);
        }
        int var7 = 0;
        class179 var8 = null;
        if (this.field443 != null && arg1 < this.field443.length) {
            int var9 = this.field443[arg1];
            var8 = class190.method1286(var9 >> 16, (byte) 43);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class189 var11 = arg0.method435(!var5.method1219((byte) 104, var6));
            var11.method425(var5, var6);
            return var11;
        } else {
            class189 var10 = arg0.method435(!var5.method1219((byte) 99, var6) & !var8.method1219((byte) -111, var7));
            var10.method425(var5, var6);
            var10.method425(var8, var7);
            return var10;
        }
    }

    @OriginalMember(owner = "bi", name = "b", descriptor = "(Lue;II)Lue;")
    public final class189 method188(class189 arg0, int arg1, int arg2) {
        if (arg2 != 2047) {
            this.method190(-48);
        }
        field463++;
        int var4 = this.field440[arg1];
        class179 var5 = class190.method1286(var4 >> 16, (byte) -76);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method436(true);
        } else {
            class189 var7 = arg0.method436(!var5.method1219((byte) -40, var6));
            var7.method425(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(ZLuc;)V")
    public static final void method189(boolean arg0, class187 arg1) {
        field445++;
        if (arg1.field3566 == 0) {
            return;
        }
        if (arg1.field3582 != -1 && arg1.field3582 < 32768) {
            class139 var2 = class183.field3444[arg1.field3582];
            if (var2 != null) {
                int var3 = arg1.field3609 - var2.field3609;
                int var4 = arg1.field3549 - var2.field3549;
                if (var4 != 0 || var3 != 0) {
                    arg1.field3600 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3582 >= 32768) {
            int var5 = arg1.field3582 - 32768;
            if (class59.field1168 == var5) {
                var5 = 2047;
            }
            class184 var6 = class202.field3975[var5];
            if (var6 != null) {
                int var7 = arg1.field3549 - var6.field3549;
                int var8 = arg1.field3609 - var6.field3609;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3600 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3596 != 0 || arg1.field3589 != 0) && (arg1.field3563 == 0 || arg1.field3550 > 0)) {
            int var9 = arg1.field3609 - (arg1.field3589 - class42.field880 - class42.field880) * 64;
            int var10 = arg1.field3549 - (arg1.field3596 - class53.field1079 - class53.field1079) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field3600 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field3596 = 0;
            arg1.field3589 = 0;
        }
        int var11 = arg1.field3600 - arg1.field3556 & 0x7FF;
        if (!arg0) {
            return;
        }
        if (var11 == 0) {
            arg1.field3590 = 0;
            return;
        }
        arg1.field3590++;
        if (var11 > 1024) {
            arg1.field3556 -= arg1.field3566;
            boolean var12 = true;
            if (arg1.field3566 > var11 || 2048 - arg1.field3566 < var11) {
                var12 = false;
                arg1.field3556 = arg1.field3600;
            }
            if (arg1.field3579 == arg1.field3544 && (arg1.field3590 > 25 || var12)) {
                if (arg1.field3548 == -1) {
                    arg1.field3579 = arg1.field3616;
                } else {
                    arg1.field3579 = arg1.field3548;
                }
            }
        } else {
            arg1.field3556 += arg1.field3566;
            boolean var13 = true;
            if (var11 < arg1.field3566 || 2048 - arg1.field3566 < var11) {
                arg1.field3556 = arg1.field3600;
                var13 = false;
            }
            if (arg1.field3579 == arg1.field3544 && (arg1.field3590 > 25 || var13)) {
                if (arg1.field3574 == -1) {
                    arg1.field3579 = arg1.field3616;
                } else {
                    arg1.field3579 = arg1.field3574;
                }
            }
        }
        arg1.field3556 &= 0x7FF;
    }

    @OriginalMember(owner = "bi", name = "c", descriptor = "(I)V")
    public final void method190(int arg0) {
        field458++;
        if (this.field467 == -1) {
            if (this.field453 == null) {
                this.field467 = 0;
            } else {
                this.field467 = 2;
            }
        }
        if (arg0 >= -118) {
            this.method185(null, -72, -52, null, 104);
        }
        if (this.field444 != -1) {
            return;
        }
        if (this.field453 == null) {
            this.field444 = 0;
        } else {
            this.field444 = 2;
        }
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(ILue;IB)Lue;")
    public final class189 method191(int arg0, class189 arg1, int arg2, byte arg3) {
        field434++;
        int var5 = this.field440[arg0];
        class179 var6 = class190.method1286(var5 >> 16, (byte) -47);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method435(true);
        }
        if (arg3 != -57) {
            this.method184(null, (byte) -52);
        }
        int var8 = arg2 & 0x3;
        class189 var9 = arg1.method435(!var6.method1219((byte) -91, var7));
        if (var8 == 1) {
            var9.method1282();
        } else if (var8 == 2) {
            var9.method1281();
        } else if (var8 == 3) {
            var9.method1283();
        }
        var9.method425(var6, var7);
        if (var8 == 1) {
            var9.method1283();
        } else if (var8 == 2) {
            var9.method1281();
        } else if (var8 == 3) {
            var9.method1282();
        }
        return var9;
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(IB)V")
    public static final void method192(int arg0, byte arg1) {
        if (arg1 != 90) {
            return;
        }
        field450++;
        if (arg0 == -3) {
            class67.method437(96, class14.field245, class141.field2731, class91.field1870);
        } else if (arg0 == -2) {
            class67.method437(arg1 ^ 0x2C, class14.field223, class23.field509, class14.field264);
        } else if (arg0 == -1) {
            class67.method437(arg1 ^ 0x39, class14.field237, class141.field2730, class186.field3543);
        } else if (arg0 == 3) {
            class67.method437(120, class14.field262, class57.field1162, class14.field242);
        } else if (arg0 == 4) {
            class67.method437(123, class14.field233, class147.field2835, class138.field2682);
        } else if (arg0 == 5) {
            class67.method437(121, class14.field267, class83.field1690, class163.field3058);
        } else if (arg0 == 6) {
            class67.method437(102, class14.field248, class13.field197, class88.field1833);
        } else if (arg0 == 7) {
            class67.method437(121, class14.field263, class140.field2727, class172.field3222);
        } else if (arg0 == 8) {
            class67.method437(113, class14.field234, class127.field2453, class147.field2825);
        } else if (arg0 == 9) {
            class67.method437(125, class14.field269, class105.field2081, class162.field3040);
        } else if (arg0 == 10) {
            class67.method437(arg1 + 17, class14.field236, class38.field822, class147.field2833);
        } else if (arg0 == 11) {
            class67.method437(107, class14.field228, class141.field2740, class178.field3370);
        } else if (arg0 == 12) {
            class67.method437(127, class14.field218, class136.field2640, class140.field2724);
        } else if (arg0 == 13) {
            class67.method437(arg1 ^ 0x21, class14.field274, class141.field2729, class139.field2692);
        } else if (arg0 == 14) {
            class67.method437(arg1 + 10, class14.field222, class5.field83, class145.field2793);
        } else if (arg0 == 16) {
            class67.method437(110, class14.field258, class31.field729, class18.field360);
        } else if (arg0 == 17) {
            class67.method437(86, class14.field256, class29.field634, class190.field3645);
        } else if (arg0 == 18) {
            class67.method437(95, class14.field255, class95.field1951, class162.field3041);
        } else if (arg0 == 19) {
            class67.method437(114, class140.field2716, class126.field2427, class84.field1705);
        } else if (arg0 == 20) {
            class67.method437(106, class14.field227, class141.field2741, class194.field3723);
        } else if (arg0 == 22) {
            class67.method437(93, class14.field249, class205.field4025, class105.field2085);
        } else if (arg0 == 23) {
            class67.method437(arg1 + 17, class14.field217, class5.field76, class5.field80);
        } else if (arg0 == 24) {
            class67.method437(122, class14.field273, class113.field2250, class36.field794);
        } else if (arg0 == 25) {
            class67.method437(arg1 ^ 0x37, class14.field213, class141.field2732, class96.field1960);
        } else if (arg0 == 26) {
            class67.method437(111, class14.field259, class23.field521, field441);
        } else if (arg0 == 27) {
            class67.method437(110, class14.field271, class160.field2998, class14.field214);
        } else {
            class67.method437(86, class14.field244, class141.field2739, class39.field832);
        }
        class36.method278(10, (byte) -64);
    }

    @OriginalMember(owner = "bi", name = "a", descriptor = "(ILue;B)Lue;")
    public final class189 method193(int arg0, class189 arg1, byte arg2) {
        field438++;
        int var4 = this.field440[arg0];
        class179 var5 = class190.method1286(var4 >> 16, (byte) -109);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method435(true);
        }
        class189 var7 = arg1.method435(!var5.method1219((byte) 100, var6));
        if (arg2 != -58) {
            this.field454 = -6;
        }
        var7.method425(var5, var6);
        return var7;
    }
}
