import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class131 extends class69 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field2401;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[[I")
    public int[][] field2392;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[Z")
    public boolean[] field2402;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[I")
    public int[] field2403;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[[B")
    public static byte[][] field2391 = new byte[50][];

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Laa;")
    public static class39 field2395 = new class39();

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Lha;")
    private static class46 field2406 = class271.method1828("de", -46);

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "Lha;")
    private static class46 field2407 = class271.method1828(")3de", -46);

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lha;")
    private static class46 field2409 = class271.method1828(")3fr", -46);

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lha;")
    private static class46 field2410 = class271.method1828("en", -46);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field2411 = 20;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lha;")
    private static class46 field2405 = class271.method1828(")3en", -46);

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Lha;")
    private static class46 field2412 = class271.method1828("fr", -46);

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[Lha;")
    public static class46[] field2404 = new class46[] { field2410, field2406, field2412 };

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Lha;")
    private static class46[] field2408 = new class46[] { field2405, field2407, field2409 };

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "[Lvi;")
    public static class249[] field2413;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[[B")
    public static byte[][] field2398;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZLha;)V")
    public static final void method1014(byte arg0, boolean arg1, class46 arg2) {
        field2394++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class261.field4547.method146(arg2, 250);
        int var6 = var3 + 6;
        int var7 = class261.field4547.method140(arg2, 250) * 13;
        class262.method1762(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 0);
        class262.method1769(var4 - var3, var6 - var3, var5 + var3 + var3, var3 + var3 + var7, 16777215);
        int var8 = -97 % ((arg0 + 27) / 61);
        class261.field4547.method152(arg2, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class109.method861(0, var4 - var3, var3 + var7 + var3, var6 - var3, var5 - -var3 + var3);
        if (!arg1) {
            class76.method606(var4, var6, var7, var5, (byte) -64);
            return;
        }
        try {
            Graphics var9 = class258.field4508.getGraphics();
            class177.field3176.method682(0, 0, 128, var9);
        } catch (Exception var10) {
            class258.field4508.repaint();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)V")
    public static final void method1015(int arg0, int arg1, byte arg2) {
        int var3 = 124 / ((arg2 - 41) / 48);
        class146 var4 = class6.method22((byte) 16, 13, arg0);
        field2400++;
        var4.method1088(11102);
        var4.field2640 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method1016(int arg0) {
        field2398 = null;
        field2412 = null;
        if (arg0 != 250) {
            field2391 = null;
        }
        field2404 = null;
        field2409 = null;
        field2405 = null;
        field2391 = null;
        field2408 = null;
        field2413 = null;
        field2395 = null;
        field2410 = null;
        field2406 = null;
        field2407 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZLwe;)Lha;")
    public static final class46 method1017(int arg0, boolean arg1, class75 arg2) {
        field2397++;
        try {
            class46 var3 = new class46();
            if (!arg1) {
                return null;
            }
            var3.field762 = arg2.method557(-22718);
            if (var3.field762 > arg0) {
                var3.field762 = arg0;
            }
            var3.field768 = new byte[var3.field762];
            arg2.field1380 += class109.field2061.method448(arg2.field1380, var3.field768, 21, arg2.field1368, var3.field762, 0);
            return var3;
        } catch (Exception var4) {
            return class189.field3371;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[B)V")
    public class131(int arg0, byte[] arg1) {
        this.field2399 = arg0;
        class75 var3 = new class75(arg1);
        this.field2401 = var3.method558(1);
        this.field2392 = new int[this.field2401][];
        this.field2402 = new boolean[this.field2401];
        this.field2403 = new int[this.field2401];
        for (int var4 = 0; var4 < this.field2401; var4++) {
            this.field2403[var4] = var3.method558(1);
        }
        for (int var5 = 0; var5 < this.field2401; var5++) {
            this.field2402[var5] = var3.method558(1) == 1;
        }
        for (int var6 = 0; var6 < this.field2401; var6++) {
            this.field2392[var6] = new int[var3.method558(1)];
        }
        for (int var7 = 0; var7 < this.field2401; var7++) {
            for (int var8 = 0; var8 < this.field2392[var7].length; var8++) {
                this.field2392[var7][var8] = var3.method558(1);
            }
        }
    }
}
