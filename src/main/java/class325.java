import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class325 extends class21 {

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    private int field4964 = 4096;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    private int field4962 = 4096;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    private int field4970 = 4096;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Lab;")
    public static class279 field4965 = new class279(50);

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field4969 = 0;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "[Lel;")
    public static class3[] field4973 = new class3[4];

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "[S")
    public static short[] field4966 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Lbm;")
    public static class307 field4960;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "[[B")
    public static byte[][] field4974;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "[[[B")
    public static byte[][][] field4968;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method2250(int arg0, int arg1, int arg2, int arg3) {
        field4958++;
        if (class45.field923 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg1 != 22771) {
            field4967 = -9;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg2;
        if (arg2 < 3 && (class99.field1749[1][var4][var5] & 0x2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = (128 - var6) * class45.field923[var7][var4][var5] + (class45.field923[var7][var4 + 1][var5] * var6) >> 7;
        int var9 = (128 - var6) * class45.field923[var7][var4][var5 + 1] + class45.field923[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = arg0 & 0x7F;
        return (128 - var10) * var8 + (var9 * var10) >> 7;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 42)
    public static final void method2251(int arg0) {
        field4959++;
        if (arg0 != -15005) {
            field4969 = 104;
        }
        class159.field2598.method1877(-29702);
        class200.field3198.method1877(-29702);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 55)
    public class325() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIII)V", line = 67)
    public static final void method2252(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class171.field2751 * arg2 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class164.method1048(0, class118.field2060, (byte) 44, arg3, false, var4);
            class146.field2389 = true;
        }
        if (arg0 != 1) {
            method2253((byte) 51);
        }
        field4972++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)[[I", line = 85)
    public final int[][] method175(int arg0, byte arg1) {
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            this.method175(70, (byte) 113);
        }
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 106);
            int[] var5 = var3[1];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                int var12 = var9[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field4962 * var12 >> 12;
                    var5[var11] = this.field4970 * var13 >> 12;
                    var10[var11] = this.field4964 * var14 >> 12;
                } else {
                    var7[var11] = this.field4962;
                    var5[var11] = this.field4970;
                    var10[var11] = this.field4964;
                }
            }
        }
        field4963++;
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 150)
    public static void method2253(byte arg0) {
        if (arg0 > -2) {
            method2254((class68) null, -127, -29);
        }
        field4968 = (byte[][][]) null;
        field4966 = null;
        field4974 = (byte[][]) null;
        field4960 = null;
        field4965 = null;
        field4973 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lkl;II)I", line = 178)
    public static final int method2254(class68 arg0, int arg1, int arg2) {
        if (arg1 != 6601) {
            field4960 = (class307) null;
        }
        field4971++;
        if (!client.method359(arg0).method1787(arg2, 117) && arg0.field1334 == null) {
            return -1;
        } else if (arg0.field1427 == null || arg0.field1427.length <= arg2) {
            return -1;
        } else {
            return arg0.field1427[arg2];
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILag;)V", line = 196)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            this.field4970 = -74;
        }
        if (arg1 == 0) {
            this.field4962 = arg2.method1315(arg0 + 14607);
        } else if (arg1 == 1) {
            this.field4970 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field4964 = arg2.method1315(arg0 ^ 0xFFFFC913);
        }
        field4961++;
    }
}
