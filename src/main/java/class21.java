import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class21 extends class128 {

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    private int field274 = 32768;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field267 = 2;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[[[B")
    public static byte[][][] field270;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "[[[I")
    public static int[][][] field268;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 7)
    public class21() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[I", line = 21)
    public final int[] method126(byte arg0, int arg1) {
        field264++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 < 100) {
            this.method126((byte) 34, -36);
        }
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -68, 1, arg1);
            int[] var5 = this.method851((byte) -119, 2, arg1);
            for (int var6 = 0; var6 < class10.field141; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field274 >> 12;
                int var9 = class276.field4298[var7] * var8 >> 12;
                int var10 = class244.field3664 & (var9 >> 12) + var6;
                int var11 = class43.field503[var7] * var8 >> 12;
                int var12 = arg1 + (var11 >> 12) & class237.field3486;
                int[] var13 = this.method851((byte) -57, 0, var12);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[[I", line = 71)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            field266 = 80;
        }
        field273++;
        int[][] var3 = this.field1755.method875(arg1 - 5044, arg0);
        if (this.field1755.field1815) {
            int[] var4 = this.method851((byte) -73, 1, arg0);
            int[] var5 = this.method851((byte) -117, 2, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class10.field141; var9++) {
                int var10 = (var4[var9] * 255 & 0xFFCA4) >> 12;
                int var11 = var5[var9] * this.field274 >> 12;
                int var12 = class43.field503[var10] * var11 >> 12;
                int var13 = class237.field3486 & (var12 >> 12) + arg0;
                int var14 = class276.field4298[var10] * var11 >> 12;
                int var15 = class244.field3664 & (var14 >> 12) + var9;
                int[][] var16 = this.method855(-3102, var13, 0);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 124)
    public static void method127(byte arg0) {
        field270 = (byte[][][]) null;
        if (arg0 != -108) {
            method129((byte) 51);
        }
        field268 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ldc;Z)V", line = 135)
    public static final void method128(class116 arg0, boolean arg1) {
        field276++;
        class298.field4637 = arg0;
        if (arg1) {
            field269 = 42;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 148)
    public static final void method129(byte arg0) {
        int var1 = class307.field4742.method566(8, 0);
        if (class204.field2864 > var1) {
            for (int var2 = var1; var2 < class204.field2864; var2++) {
                class330.field5038[class128.field1749++] = class180.field2612[var2];
            }
        }
        field275++;
        if (var1 > class204.field2864) {
            throw new RuntimeException("gppov1");
        }
        class204.field2864 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class180.field2612[var3];
            class109 var5 = class328.field5009[var4];
            int var6 = class307.field4742.method566(1, 0);
            if (var6 == 0) {
                class180.field2612[class204.field2864++] = var4;
                var5.field2422 = class38.field463;
            } else {
                int var7 = class307.field4742.method566(2, 0);
                if (var7 == 0) {
                    class180.field2612[class204.field2864++] = var4;
                    var5.field2422 = class38.field463;
                    class129.field1772[field278++] = var4;
                } else if (var7 == 1) {
                    class180.field2612[class204.field2864++] = var4;
                    var5.field2422 = class38.field463;
                    int var8 = class307.field4742.method566(3, 0);
                    var5.method1111((byte) 44, var8, 1);
                    int var9 = class307.field4742.method566(1, 0);
                    if (var9 == 1) {
                        class129.field1772[field278++] = var4;
                    }
                } else if (var7 == 2) {
                    class180.field2612[class204.field2864++] = var4;
                    var5.field2422 = class38.field463;
                    if (class307.field4742.method566(1, 0) == 1) {
                        int var10 = class307.field4742.method566(3, 0);
                        var5.method1111((byte) 44, var10, 2);
                        int var11 = class307.field4742.method566(3, 0);
                        var5.method1111((byte) 44, var11, 2);
                    } else {
                        int var12 = class307.field4742.method566(3, 0);
                        var5.method1111((byte) 44, var12, 0);
                    }
                    int var13 = class307.field4742.method566(1, 0);
                    if (var13 == 1) {
                        class129.field1772[field278++] = var4;
                    }
                } else if (var7 == 3) {
                    class330.field5038[class128.field1749++] = var4;
                }
            }
        }
        int var14 = -23 % ((37 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lp;II)V", line = 258)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            return;
        }
        if (arg1 == 0) {
            this.field274 = arg0.method624(14612) << 4;
        } else if (arg1 == 1) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        field271++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 318)
    public final void method130(boolean arg0) {
        class78.method462(-1);
        if (arg0) {
            field267 = 80;
        }
        field277++;
    }
}
