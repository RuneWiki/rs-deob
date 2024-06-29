import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class160 extends class69 {

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "[I")
    public int[] field2610;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[I")
    public int[] field2601;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "[[I")
    public int[][] field2605;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[Z")
    public boolean[] field2599;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[I")
    public static int[] field2604 = new int[2];

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2598 = new String[200];

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
    public static boolean field2609 = false;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public static void method1100(int arg0) {
        field2598 = null;
        if (arg0 > 86) {
            field2604 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method1101(int arg0, int arg1) {
        field2600++;
        class150.field2407 = -1;
        if (arg0 == 37) {
            class109.field1894 = 3.0F;
        } else if (arg0 == 50) {
            class109.field1894 = 4.0F;
        } else if (arg0 == 75) {
            class109.field1894 = 6.0F;
        } else if (arg0 == 100) {
            class109.field1894 = 8.0F;
        } else if (arg0 == 200) {
            class109.field1894 = 16.0F;
        }
        if (arg1 >= 5) {
            class150.field2407 = -1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
    public static final boolean method1102(byte arg0) {
        field2603++;
        int var1 = 33 % ((-arg0 - 27) / 41);
        try {
            return class113.method810(-83);
        } catch (IOException var5) {
            class79.method589(true);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class51.field719 + "," + class121.field2038 + "," + class220.field3519 + " - " + class73.field1001 + "," + (class197.field3179.field610[0] + class296.field4685) + "," + (class197.field3179.field692[0] + class93.field1321) + " - ";
            for (int var4 = 0; class73.field1001 > var4 && var4 < 50; var4++) {
                var3 = var3 + class166.field2709.field4198[var4] + ",";
            }
            class272.method1837(var3, 1, var6);
            class297.method1985(-1);
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I[B)V")
    public class160(int arg0, byte[] arg1) {
        this.field2606 = arg0;
        class264 var3 = new class264(arg1);
        this.field2607 = var3.method1779(-65);
        this.field2610 = new int[this.field2607];
        this.field2601 = new int[this.field2607];
        this.field2605 = new int[this.field2607][];
        this.field2599 = new boolean[this.field2607];
        for (int var4 = 0; var4 < this.field2607; var4++) {
            this.field2601[var4] = var3.method1779(-111);
        }
        for (int var5 = 0; var5 < this.field2607; var5++) {
            this.field2599[var5] = var3.method1779(-79) == 1;
        }
        for (int var6 = 0; var6 < this.field2607; var6++) {
            this.field2610[var6] = var3.method1777(-94);
        }
        for (int var7 = 0; var7 < this.field2607; var7++) {
            this.field2605[var7] = new int[var3.method1779(-85)];
        }
        for (int var8 = 0; var8 < this.field2607; var8++) {
            for (int var9 = 0; var9 < this.field2605[var8].length; var9++) {
                this.field2605[var8][var9] = var3.method1779(-114);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljj;Z)V")
    public static final void method1103(class134 arg0, boolean arg1) {
        field2608++;
        class136.field2262 = class272.method1838(94, 0, class108.field1873, arg0);
        class5.field66 = class120.method846(0, class228.field3631, arg0, (byte) 29);
        class216.field3469 = class120.method846(0, class67.field950, arg0, (byte) 29);
        class99.field1511 = class120.method846(0, class257.field4110, arg0, (byte) 29);
        class154.field2481 = class120.method846(0, class254.field4062, arg0, (byte) 29);
        class1.field17 = class120.method846(0, class169.field2741, arg0, (byte) 29);
        class195.field3158 = class120.method846(0, class81.field1130, arg0, (byte) 29);
        class222.field3531 = class25.method179(0, arg0, (byte) 84, class197.field3182);
        class30.field362 = class100.method709(arg0, class28.field329, 0, 97);
        class94.field1364 = class100.method709(arg0, class258.field4121, 0, 92);
        class55.field779 = class11.method64(class136.field2261, -22808, arg0, 0);
        class235.field3756 = class11.method64(class129.field2160, -22808, arg0, 0);
        class122.field2050.method1129(class235.field3756, (int[]) null);
        class58.field809.method1129(class235.field3756, (int[]) null);
        class283.field4524.method1129(class235.field3756, (int[]) null);
        class43 var2 = class260.method1704(-104, class67.field945, arg0, 0);
        var2.method331();
        class131.field2184 = var2;
        class43[] var3 = class272.method1838(104, 0, class30.field372, arg0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method331();
        }
        if (!arg1) {
            method1102((byte) 52);
        }
        class128.field2140 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class136.field2262.length; var9++) {
            class136.field2262[var9].method332(var5 + var8, var6 + var8, var7 + var8);
        }
        class183.field2930 = class136.field2262;
    }
}
