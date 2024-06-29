import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 extends class99 {

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[[I")
    public int[][] field3636;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "[I")
    public int[] field3639;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static volatile int field3635 = 0;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lqb;")
    public static class113 field3643 = new class113();

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Lr;")
    private static class118 field3646 = class153.method1136(116, "Examine");

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Lr;")
    public static class118 field3649 = field3646;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "[Z")
    public static boolean[] field3648 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!we", name = "L", descriptor = "[I")
    public static int[] field3650 = new int[1000];

    @OriginalMember(owner = "client!we", name = "M", descriptor = "Lr;")
    public static class118 field3651 = class153.method1136(105, "sl_flags");

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[I")
    public static int[] field3647;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public static final void method1227(boolean arg0, int arg1) {
        field3641++;
        if (arg1 != 8) {
            field3643 = null;
        }
        class60.field1398 = arg0;
        if (!class60.field1398) {
            int var25 = class53.field1253.method819(false);
            int var26 = (class88.field2140 - class53.field1253.field2404) / 16;
            class106.field2473 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class106.field2473[var27][var37] = class53.field1253.method821((byte) 90);
                }
            }
            int var28 = class53.field1253.method832(-4206);
            int var29 = class53.field1253.method819(false);
            int var30 = class53.field1253.method797(123);
            int var31 = class53.field1253.method831((byte) 76);
            class151.field3375 = new byte[var26][];
            class56.field1335 = new byte[var26][];
            class2.field41 = new int[var26];
            class75.field1849 = new int[var26];
            class148.field3331 = new int[var26];
            int var32 = 0;
            boolean var33 = false;
            if ((var30 / 8 == 48 || var30 / 8 == 49) && var29 / 8 == 48) {
                var33 = true;
            }
            if (var30 / 8 == 48 && var29 / 8 == 148) {
                var33 = true;
            }
            for (int var34 = (var30 - 6) / 8; var34 <= (var30 + 6) / 8; var34++) {
                for (int var35 = (var29 - 6) / 8; var35 <= (var29 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var33 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class2.field41[var32] = var36;
                        class148.field3331[var32] = class51.field1223.method356(class144.method1066(true, new class118[] { class56.field1321, class43.method359(var34, (byte) -122), class13.field276, class43.method359(var35, (byte) -122) }), 0);
                        class75.field1849[var32] = class51.field1223.method356(class144.method1066(true, new class118[] { class114.field2663, class43.method359(var34, (byte) -122), class13.field276, class43.method359(var35, (byte) -122) }), 0);
                        var32++;
                    }
                }
            }
            class122.method960(var29, var28, var31, var25, var30, false);
            return;
        }
        class53.field1253.method726(-5);
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class53.field1253.method725(8, 1);
                    if (var24 == 1) {
                        class67.field1541[var2][var22][var23] = class53.field1253.method725(8, 26);
                    } else {
                        class67.field1541[var2][var22][var23] = -1;
                    }
                }
            }
        }
        class53.field1253.method732(1);
        int var3 = (class88.field2140 - class53.field1253.field2404) / 16;
        class106.field2473 = new int[var3][4];
        for (int var4 = 0; var4 < var3; var4++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class106.field2473[var4][var21] = class53.field1253.method812(class47.method392(arg1, -24490));
            }
        }
        int var5 = class53.field1253.method797(111);
        int var6 = class53.field1253.method831((byte) 76);
        int var7 = class53.field1253.method819(false);
        int var8 = class53.field1253.method797(127);
        int var9 = class53.field1253.method832(arg1 ^ 0xFFFFEF9A);
        class56.field1335 = new byte[var3][];
        class2.field41 = new int[var3];
        class75.field1849 = new int[var3];
        class148.field3331 = new int[var3];
        class151.field3375 = new byte[var3][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class67.field1541[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class2.field41[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class2.field41[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class148.field3331[var10] = class51.field1223.method356(class144.method1066(true, new class118[] { class56.field1321, class43.method359(var19, (byte) -122), class13.field276, class43.method359(var20, (byte) -122) }), 0);
                            class75.field1849[var10] = class51.field1223.method356(class144.method1066(true, new class118[] { class114.field2663, class43.method359(var19, (byte) -122), class13.field276, class43.method359(var20, (byte) -122) }), 0);
                            var10++;
                        }
                    }
                }
            }
        }
        class122.method960(var5, var8, var6, var7, var9, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
    public static final void method1228(int arg0, boolean arg1) {
        class54.method490(262144);
        class85.field2086++;
        field3638++;
        if (class85.field2086 < 50 && !arg1) {
            return;
        }
        if (arg0 >= -111) {
            method1231((byte) -100);
        }
        class85.field2086 = 0;
        if (class92.field2197 || class127.field2915 == null) {
            return;
        }
        class1.field22.method722(176, (byte) -12);
        class20.field490++;
        try {
            class127.field2915.method409((byte) -88, class1.field22.field2405, 0, class1.field22.field2404);
            class1.field22.field2404 = 0;
        } catch (IOException var2) {
            class92.field2197 = true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lff;BZLff;)V")
    public static final void method1229(class42 arg0, byte arg1, boolean arg2, class42 arg3) {
        field3640++;
        class79.field1917 = arg0;
        if (arg1 >= 79) {
            class69.field1598 = arg3;
            class69.field1617 = arg2;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
    public static final int method1230(int arg0) {
        if (arg0 != -50) {
            method1230(14);
        }
        field3637++;
        return class69.field1614++;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static void method1231(byte arg0) {
        field3650 = null;
        field3649 = null;
        field3646 = null;
        if (arg0 > -107) {
            method1230(90);
        }
        field3651 = null;
        field3648 = null;
        field3647 = null;
        field3643 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I[B)V")
    public class158(int arg0, byte[] arg1) {
        this.field3634 = arg0;
        class105 var3 = new class105(arg1);
        this.field3642 = var3.method831((byte) 76);
        this.field3636 = new int[this.field3642][];
        this.field3639 = new int[this.field3642];
        for (int var4 = 0; var4 < this.field3642; var4++) {
            this.field3639[var4] = var3.method831((byte) 76);
        }
        for (int var5 = 0; var5 < this.field3642; var5++) {
            this.field3636[var5] = new int[var3.method831((byte) 76)];
        }
        for (int var6 = 0; var6 < this.field3642; var6++) {
            for (int var7 = 0; var7 < this.field3636[var6].length; var7++) {
                this.field3636[var6][var7] = var3.method831((byte) 76);
            }
        }
    }
}
