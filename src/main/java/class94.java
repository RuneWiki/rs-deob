import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class94 extends class110 {

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    private int field1408 = 8;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    private int field1420 = 81;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    private int field1411 = 409;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    private int field1418 = 1024;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    private int field1424 = 4;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    private int field1423 = 1024;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    private int field1427 = 0;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    private int field1431 = 204;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[[B")
    public static byte[][] field1407 = new byte[1000][];

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lhb;")
    public static class318 field1412 = new class318(50);

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "Llm;")
    public static class210 field1425;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "Lf;")
    public static class329 field1430;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "[[I")
    private int[][] field1414;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "[[I")
    private int[][] field1421;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "[[Z")
    public static boolean[][] field1419;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(III)I", line = 9)
    public static final int method664(int arg0, int arg1, int arg2) {
        field1405++;
        if (arg1 != 41) {
            method665(75, -115);
        }
        int var3 = class64.method420(arg0 - 1, arg2 + -1, arg1 + 16777174) + class64.method420(arg0 + 1, arg2 + -1, arg1 + 16777174) + class64.method420(arg0 + -1, arg2 + 1, 16777215) + class64.method420(arg0 + 1, arg2 - -1, 16777215);
        int var4 = class64.method420(arg0 - 1, arg2, 16777215) - (-class64.method420(arg0 + 1, arg2, 16777215) - class64.method420(arg0, arg2 - 1, 16777215) - class64.method420(arg0, arg2 + 1, 16777215));
        int var5 = class64.method420(arg0, arg2, 16777215);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V", line = 28)
    public static final void method665(int arg0, int arg1) {
        int var2 = -109 / ((arg0 - 35) / 52);
        field1413++;
        class169 var3 = class101.method712(arg1, 10, 2089666400);
        var3.method1178((byte) 112);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[I", line = 45)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4;
            for (var4 = class177.field2615[arg1] + this.field1427; var4 < 0; var4 += 4096) {
            }
            while (var4 > 4096) {
                var4 -= 4096;
            }
            int var5;
            for (var5 = 0; this.field1408 > var5 && var4 >= this.field1429[var5]; var5++) {
            }
            int var6 = var5 - 1;
            boolean var7 = (var5 & 0x1) == 0;
            int var8 = this.field1429[var5];
            int var9 = this.field1429[var5 - 1];
            if (var4 > var9 + this.field1428 && var4 < (var8 - this.field1428)) {
                for (int var10 = 0; var10 < class124.field1936; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field1423 : -this.field1423;
                    int var13;
                    for (var13 = class249.field3714[var10] + (this.field1409 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field1424 && this.field1414[var6][var11] <= var13) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field1414[var6][var11];
                    int var16 = this.field1414[var6][var14];
                    if (var16 + this.field1428 < var13 && (var15 - this.field1428) > var13) {
                        var3[var10] = this.field1421[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class85.method592(var3, 0, class124.field1936, 0);
            }
        }
        field1406++;
        if (arg0 != 1) {
            method668(-96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 264)
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILre;I)V", line = 148)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            this.method44(110, (class263) null, -114);
        }
        if (arg0 == 0) {
            this.field1424 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field1408 = arg1.method1787(false);
        } else if (arg0 == 2) {
            this.field1411 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field1431 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field1423 = arg1.method1830((byte) -77);
        } else if (arg0 == 5) {
            this.field1427 = arg1.method1830((byte) -77);
        } else if (arg0 == 6) {
            this.field1420 = arg1.method1830((byte) -77);
        } else if (arg0 == 7) {
            this.field1418 = arg1.method1830((byte) -77);
        }
        field1426++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 236)
    public static void method666(byte arg0) {
        field1430 = null;
        field1425 = null;
        if (arg0 != -6) {
            method668(122);
        }
        field1412 = null;
        field1407 = (byte[][]) null;
        field1419 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 253)
    public final void method47(int arg0) {
        this.method667(2);
        field1416++;
        if (arg0 != -9) {
            this.field1428 = -18;
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V", line = 273)
    private final void method667(int arg0) {
        field1410++;
        Random var2 = new Random((long) this.field1408);
        this.field1409 = 4096 / this.field1424;
        this.field1428 = this.field1420 / 2;
        this.field1421 = new int[this.field1408][this.field1424];
        this.field1414 = new int[this.field1408][this.field1424 + 1];
        int var3 = this.field1409 / 2;
        this.field1429 = new int[this.field1408 + 1];
        this.field1429[0] = 0;
        this.field1422 = 4096 / this.field1408;
        int var4 = this.field1422 / arg0;
        for (int var5 = 0; var5 < this.field1408; var5++) {
            if (var5 > 0) {
                int var6 = this.field1422;
                int var7 = (class216.method1488(4096, true, var2) - 2048) * this.field1431 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1429[var5] = this.field1429[var5 - 1] + var8;
            }
            this.field1414[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1424; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1409;
                    int var11 = (class216.method1488(4096, true, var2) - 2048) * this.field1411 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1414[var5][var9] = this.field1414[var5][var9 - 1] + var12;
                }
                this.field1421[var5][var9] = this.field1418 > 0 ? 4096 - class216.method1488(this.field1418, true, var2) : 4096;
            }
            this.field1414[var5][this.field1424] = 4096;
        }
        this.field1429[this.field1408] = 4096;
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V", line = 343)
    public static final void method668(int arg0) {
        field1415++;
        if (class9.field71 == null) {
            return;
        }
        if (class221.field3369 < 10) {
            if (!class286.field4324.method1451(class9.field71.field814, arg0 - 128)) {
                class221.field3369 = class49.field620.method1450(-23076, class9.field71.field814) / 10;
                return;
            }
            class40.method271(arg0 + 29);
            class221.field3369 = 10;
        }
        if (class221.field3369 == 10) {
            class292.field4439 = class9.field71.field806 >> 6 << 6;
            if (class9.field71.field815 == 37) {
                class75.field980 = 3.0F;
                class61.field802 = 3.0F;
            } else if (class9.field71.field815 == 50) {
                class75.field980 = 4.0F;
                class61.field802 = 4.0F;
            } else if (class9.field71.field815 == 75) {
                class75.field980 = 6.0F;
                class61.field802 = 6.0F;
            } else if (class9.field71.field815 == 100) {
                class75.field980 = 8.0F;
                class61.field802 = 8.0F;
            } else if (class9.field71.field815 == 200) {
                class75.field980 = 16.0F;
                class61.field802 = 16.0F;
            } else {
                class75.field980 = 8.0F;
                class61.field802 = 8.0F;
            }
            class296.field4533 = class9.field71.field801 >> 6 << 6;
            int var1 = (class114.field1750.field1566 >> 7) + class217.field3309 - class292.field4439;
            class111.field1719 = (class9.field71.field824 >> 6 << 6) + 64 - class296.field4533;
            class41.field497 = (class9.field71.field811 >> 6 << 6) + 64 - class292.field4439;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class296.field4533 - (class114.field1750.field1505 >> 7) - (class189.field2807 - class111.field1719) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class41.field497 && var4 >= 0 && class111.field1719 > var4) {
                class203.field3037 = var4;
                class233.field3504 = var2;
            } else {
                class233.field3504 = class9.field71.field810 * 64 - class292.field4439;
                class203.field3037 = class296.field4533 + class111.field1719 - class9.field71.field818 * 64 - 1;
            }
            class162.method1150((byte) 24);
            class241.field3595 = new int[class205.field3096 + 1];
            int var5 = class242.field3629 >> 2 << 10;
            int var6 = class111.field1719 >> 6;
            int var7 = class107.field1674 >> 1;
            int var8 = class41.field497 >> 6;
            client.field1952 = new byte[var8][var6][];
            class123.field1930 = new byte[var8][var6][];
            class205.field3099 = new byte[var8][var6][];
            class142.field2157 = new byte[var8][var6][];
            class203.field3034 = new int[var8][var6][];
            class135.field2058 = new int[var8][var6][];
            class317.field4780 = new byte[var8][var6][];
            class255.field3854 = new int[var8][var6][];
            class246.method1659(var5, 0, var7);
            class221.field3369 = 20;
        } else if (class221.field3369 == 20) {
            class239.method1625(127, new class263(class286.field4324.method1436("underlay", class9.field71.field814, (byte) -59)));
            class221.field3369 = 30;
            class150.method1082(true, -2049);
            class142.method1021(arg0 ^ 0xFFFFFFFB);
        } else if (class221.field3369 == 30) {
            class291.method2036(30598, new class263(class286.field4324.method1436("overlay", class9.field71.field814, (byte) -59)));
            class221.field3369 = 40;
            class142.method1021(arg0 - 128);
        } else {
            if (arg0 != 64) {
                method664(28, 59, -24);
            }
            if (class221.field3369 == 40) {
                class113.method780(1, new class263(class286.field4324.method1436("overlay2", class9.field71.field814, (byte) -59)));
                class221.field3369 = 50;
                class142.method1021(-8);
            } else if (class221.field3369 == 50) {
                class74.method476(new class263(class286.field4324.method1436("loc", class9.field71.field814, (byte) -59)), -1);
                class221.field3369 = 60;
                class150.method1082(true, -2049);
                class142.method1021(-78);
            } else if (class221.field3369 == 60) {
                if (class286.field4324.method1438(-64, class9.field71.field814 + "_labels")) {
                    if (!class286.field4324.method1451(class9.field71.field814 + "_labels", -64)) {
                        return;
                    }
                    class155.field2325 = class44.method291(arg0 ^ 0x7A28, class286.field4324, class9.field71.field814 + "_labels");
                } else {
                    class155.field2325 = new class129(0);
                }
                class221.field3369 = 70;
                class142.method1021(-36);
            } else if (class221.field3369 == 70) {
                class176.field2601 = new class95(11, true, class315.field4764);
                class221.field3369 = 73;
                class150.method1082(true, -2049);
                class142.method1021(-41);
            } else if (class221.field3369 == 73) {
                class305.field4644 = new class95(12, true, class315.field4764);
                class221.field3369 = 76;
                class150.method1082(true, -2049);
                class142.method1021(-128);
            } else if (class221.field3369 == 76) {
                class320.field4846 = new class95(14, true, class315.field4764);
                class221.field3369 = 79;
                class150.method1082(true, -2049);
                class142.method1021(arg0 - 88);
            } else if (class221.field3369 == 79) {
                class205.field3101 = new class95(17, true, class315.field4764);
                class221.field3369 = 82;
                class150.method1082(true, -2049);
                class142.method1021(-91);
            } else if (class221.field3369 == 82) {
                class169.field2529 = new class95(19, true, class315.field4764);
                class221.field3369 = 85;
                class150.method1082(true, -2049);
                class142.method1021(-60);
            } else if (class221.field3369 == 85) {
                class284.field4294 = new class95(22, true, class315.field4764);
                class221.field3369 = 88;
                class150.method1082(true, arg0 ^ 0xFFFFF7BF);
                class142.method1021(-61);
            } else if (class221.field3369 == 88) {
                class258.field3899 = new class95(26, true, class315.field4764);
                class221.field3369 = 91;
                class150.method1082(true, -2049);
                class142.method1021(-93);
            } else {
                class184.field2758 = new class95(30, true, class315.field4764);
                class221.field3369 = 100;
                class150.method1082(true, arg0 - 2113);
                class142.method1021(-77);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Llm;B)V", line = 578)
    public static final void method669(class210 arg0, byte arg1) {
        field1417++;
        class11.field114 = class123.method892(class37.field453, arg0, 0, -1);
        class230.field3482 = class248.method1670((byte) 85, class87.field1290, arg0, 0);
        class223.field3399 = class248.method1670(arg1, class315.field4763, arg0, 0);
        class327.field4921 = class248.method1670((byte) 83, class23.field346, arg0, 0);
        class287.field4336 = class248.method1670((byte) 95, class75.field978, arg0, 0);
        class226.field3433 = class248.method1670((byte) 55, class3.field14, arg0, 0);
        class200.field2984 = class248.method1670((byte) 102, class36.field440, arg0, 0);
        class288.field4351 = class266.method1871(-1154520473, arg0, class246.field3668, 0);
        class202.field3029 = class67.method443(class177.field2629, (byte) -6, 0, arg0);
        class26.field371 = class67.method443(class92.field1376, (byte) -6, 0, arg0);
        class318.field4792 = class176.method1217((byte) 53, arg0, class305.field4645, 0);
        class73.field948 = class176.method1217((byte) 53, arg0, class72.field939, 0);
        class61.field817.method621(class73.field948, (int[]) null);
        class84.field1247.method621(class73.field948, (int[]) null);
        class217.field3299.method621(class73.field948, (int[]) null);
        if (class117.field1817) {
            class32.field426 = class250.method1689(0, -7789, class288.field4349, arg0);
            for (int var2 = 0; var2 < class32.field426.length; var2++) {
                class32.field426[var2].method402();
            }
        }
        class127 var3 = class195.method1347(class209.field3153, (byte) -126, arg0, 0);
        var3.method940();
        if (class117.field1817) {
            class142.field2156 = new class303(var3);
        } else {
            class142.field2156 = var3;
        }
        class127[] var4 = class123.method892(class306.field4670, arg0, 0, -1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method940();
        }
        if (class117.field1817) {
            class247.field3679 = new class235[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class247.field3679[var6] = new class303(var4[var6]);
            }
        } else {
            class247.field3679 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class11.field114.length; var11++) {
            class11.field114[var11].method937(var8 + var10, var7 + var10, var9 + var10);
        }
        if (class117.field1817) {
            class267.field4107 = new class235[class11.field114.length];
            for (int var12 = 0; var12 < class11.field114.length; var12++) {
                class267.field4107[var12] = new class303(class11.field114[var12]);
            }
        } else {
            class267.field4107 = class11.field114;
        }
    }
}
