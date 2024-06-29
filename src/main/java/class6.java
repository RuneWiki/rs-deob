import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class6 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[[S")
    public static short[][] field58 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Ljf;")
    private static class229 field65 = class212.method1457((byte) 111, "Please remove ");

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Ljf;")
    public static class229 field59 = field65;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Ljf;")
    public static class229 field69 = field65;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field70 = 1;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[I")
    public static int[] field71;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)[B", line = 11)
    public static final synchronized byte[] method35(byte arg0, int arg1) {
        field64++;
        if (arg1 == 100 && class156.field2667 > 0) {
            byte[] var2 = class124.field2180[--class156.field2667];
            class124.field2180[class156.field2667] = null;
            return var2;
        } else if (arg0 != -88) {
            return (byte[]) null;
        } else if (arg1 == 5000 && class15.field232 > 0) {
            byte[] var3 = class161.field2739[--class15.field232];
            class161.field2739[class15.field232] = null;
            return var3;
        } else if (arg1 == 30000 && class269.field4625 > 0) {
            byte[] var4 = class48.field878[--class269.field4625];
            class48.field878[class269.field4625] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 56)
    public static void method36(byte arg0) {
        field71 = null;
        field65 = null;
        field69 = null;
        field59 = null;
        if (arg0 >= 22) {
            field58 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lek;I)V", line = 73)
    public static final void method37(class185 arg0, int arg1) {
        class303.field5149 = arg0;
        field63++;
        if (arg1 != 6806) {
            field69 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)Lsm;", line = 84)
    public static final class159 method38(boolean arg0) {
        field66++;
        int var1 = field71[0] * class232.field4025[0];
        byte[] var2 = class21.field357[0];
        class159 var6;
        if (class122.field2148[0]) {
            byte[] var3 = class315.field5336[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class97.method665(class305.method2086(var3[var5] << 24, -16777216), class64.field1115[class305.method2086(255, var2[var5])]);
            }
            var6 = new class121(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], field71[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class64.field1115[class305.method2086(var2[var8], 255)];
            }
            var6 = new class159(class97.field1722, class307.field5192, class272.field4659[0], class256.field4473[0], class232.field4025[0], field71[0], var7);
        }
        class62.method466((byte) 91);
        if (arg0) {
            field69 = (class229) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 144)
    public static final void method39(int arg0) {
        class52.field907.method230(true);
        field62++;
        if (arg0 <= 29) {
            method40((byte) 10);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 164)
    public static final void method40(byte arg0) {
        class225.method1548(false, (byte) -20);
        System.gc();
        int var1 = -119 % ((arg0 + 42) / 36);
        class186.method1295(25, (byte) 84);
        field68++;
    }
}
