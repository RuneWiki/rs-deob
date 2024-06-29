import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class208 extends class98 {

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Z")
    public boolean field3594 = true;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Lmb;")
    public static class96 field3584 = class243.method1708("(U (X", (byte) 105);

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "[Z")
    public static boolean[] field3583 = new boolean[5];

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "[Lmb;")
    public static class96[] field3586 = new class96[500];

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "Lmb;")
    public static class96 field3597 = class243.method1708("Fps:", (byte) 107);

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "Lmb;")
    public static class96 field3591 = class243.method1708(":assist:", (byte) 114);

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
    public int[] field3589;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "[I")
    private int[] field3595;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "[Lmb;")
    private class96[] field3599;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "[[I")
    private int[][] field3580;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
    public final int method1446(byte arg0, int arg1) {
        field3593++;
        if (this.field3595 == null || arg1 < 0 || this.field3595.length < arg1) {
            return -1;
        } else {
            if (arg0 < 30) {
                field3588 = -7;
            }
            return this.field3595[arg1];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lrg;B)Lmb;")
    public final class96 method1447(class239 arg0, byte arg1) {
        if (arg1 < 72) {
            return null;
        }
        field3601++;
        class96 var3 = class162.method1178(80, 125);
        if (this.field3595 != null) {
            for (int var4 = 0; var4 < this.field3595.length; var4++) {
                var3.method690(this.field3599[var4], 0);
                var3.method690(method1454(this.field3595[var4], this.field3580[var4], 112, arg0.method1622(false, class188.field3292[this.field3595[var4]])), 0);
            }
        }
        var3.method690(this.field3599[this.field3599.length - 1], 0);
        return var3.method697(105);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lrg;[IB)V")
    public final void method1448(class239 arg0, int[] arg1, byte arg2) {
        field3579++;
        if (this.field3595 == null) {
            return;
        }
        if (arg2 != -107) {
            this.method1457(-43, (class239) null);
        }
        for (int var4 = 0; var4 < this.field3595.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class80.field1358[this.method1446((byte) 126, var4)];
            if (var5 > 0) {
                arg0.method1646((long) arg1[var4], 8, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public static final void method1449(int arg0, int arg1) {
        field3596++;
        class43 var2 = class270.method1847(arg1, -10277, 4);
        if (arg0 != 0) {
            method1456((byte) 102);
        }
        var2.method339(true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILrg;B)V")
    private final void method1450(int arg0, class239 arg1, byte arg2) {
        if (arg2 != -17) {
            field3591 = null;
        }
        if (arg0 == 1) {
            this.field3599 = arg1.method1634(-107).method704(-1, 60);
        } else if (arg0 == 2) {
            int var8 = arg1.method1651(arg2 + 4156);
            this.field3589 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3589[var9] = arg1.method1663((byte) 77);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1651(arg2 + 4156);
            this.field3595 = new int[var4];
            this.field3580 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1663((byte) -122);
                this.field3595[var5] = var6;
                this.field3580[var5] = new int[class226.field3845[var6]];
                for (int var7 = 0; var7 < class226.field3845[var6]; var7++) {
                    this.field3580[var5][var7] = arg1.method1663((byte) 94);
                }
            }
        } else if (arg0 == 4) {
            this.field3594 = false;
        }
        field3578++;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
    public final int method1451(int arg0) {
        field3585++;
        if (this.field3595 == null) {
            return 0;
        } else if (arg0 > -80) {
            return 61;
        } else {
            return this.field3595.length;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public final void method1452(int arg0) {
        if (arg0 != -7723) {
            return;
        }
        if (this.field3589 != null) {
            for (int var2 = 0; var2 < this.field3589.length; var2++) {
                this.field3589[var2] = class45.method348(this.field3589[var2], 32768);
            }
        }
        field3602++;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)I")
    public final int method1453(int arg0, int arg1, int arg2) {
        field3598++;
        if (arg1 < 68) {
            method1456((byte) 127);
        }
        if (this.field3595 == null || arg0 < 0 || this.field3595.length < arg0) {
            return -1;
        } else if (this.field3580[arg0] == null || arg2 < 0 || this.field3580[arg0].length < arg2) {
            return -1;
        } else {
            return this.field3580[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[IIJ)Lmb;")
    private static final class96 method1454(int arg0, int[] arg1, int arg2, long arg3) {
        field3600++;
        if (arg2 < 109) {
            method1449(38, -40);
        }
        if (class77.field1314 != null) {
            class96 var5 = class77.field1314.method1420(arg1, 0, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class57.method421((byte) -114, arg3).method706((byte) -103) : class95.method668(10, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Lmb;")
    public final class96 method1455(int arg0) {
        field3592++;
        class96 var2 = class162.method1178(80, 122);
        if (this.field3599 == null) {
            return class178.field3087;
        }
        var2.method690(this.field3599[0], 0);
        if (arg0 <= 17) {
            return null;
        }
        for (int var3 = 1; var3 < this.field3599.length; var3++) {
            var2.method690(class147.field2608, 0);
            var2.method690(this.field3599[var3], 0);
        }
        return var2.method697(105);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public static void method1456(byte arg0) {
        field3583 = null;
        field3584 = null;
        field3586 = null;
        field3597 = null;
        if (arg0 < 29) {
            method1454(115, (int[]) null, -101, 20L);
        }
        field3591 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILrg;)V")
    public final void method1457(int arg0, class239 arg1) {
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                if (arg0 >= -90) {
                    this.method1457(82, (class239) null);
                }
                field3590++;
                return;
            }
            this.method1450(var3, arg1, (byte) -17);
        }
    }
}
