import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class52 extends class120 {

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    private int field785 = 32768;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "[I")
    public static int[] field784 = new int[50];

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I", line = 3)
    public static final int method357(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 20)
    public static void method358(int arg0) {
        if (arg0 != 0) {
            field781 = 89;
        }
        field784 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IZ)[[I", line = 34)
    public final int[][] method168(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[] var4 = this.method854(1, arg0, -24059);
            int[] var5 = this.method854(2, arg0, -24059);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class307.field5160; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF69E) >> 12;
                int var11 = var5[var9] * this.field785 >> 12;
                int var12 = class136.field2040[var10] * var11 >> 12;
                int var13 = class51.field776 & var9 + (var12 >> 12);
                int var14 = class313.field5283[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg0 & class27.field410;
                int[][] var16 = this.method858(0, var15, 120);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        field783++;
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)[F", line = 93)
    public static final float[] method359(int arg0) {
        int var1 = 5 % ((54 - arg0) / 50);
        field779++;
        float var2 = class58.method411() + class58.method409();
        int var3 = class58.method406();
        class256.field4106[3] = 1.0F;
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class256.field4106[2] = class28.field415[2] * var7 * var6 * var2;
        class256.field4106[0] = class28.field415[0] * var4 * var6 * var2;
        class256.field4106[1] = class28.field415[1] * var5 * var6 * var2;
        return class256.field4106;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 124)
    public final void method31(int arg0) {
        class148.method1029(-16452);
        field780++;
        if (arg0 != -31851) {
            this.field785 = -42;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 140)
    public class52() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I", line = 152)
    public final int[] method14(int arg0, int arg1) {
        field787++;
        if (arg1 != -14959) {
            method357(52, 116);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[] var4 = this.method854(1, arg0, -24059);
            int[] var5 = this.method854(2, arg0, arg1 ^ 0x6794);
            for (int var6 = 0; var6 < class307.field5160; var6++) {
                int var7 = (var4[var6] & 0xFF0) >> 4;
                int var8 = var5[var6] * this.field785 >> 12;
                int var9 = class136.field2040[var7] * var8 >> 12;
                int var10 = class313.field5283[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class51.field776;
                int var12 = class27.field410 & arg0 + (var10 >> 12);
                int[] var13 = this.method854(0, var12, -24059);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V", line = 196)
    public static final void method360(int arg0) {
        if (arg0 != -15842) {
            field781 = -17;
        }
        if (class248.field3960 != null) {
            class189 var1 = class248.field3960;
            synchronized (class248.field3960) {
                class248.field3960 = null;
            }
        }
        field782++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llb;II)V", line = 226)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field785 = arg0.method759((byte) -117) << 4;
        } else if (arg2 == 1) {
            this.field1770 = arg0.method792(arg1 + 3) == 1;
        }
        if (arg1 != -1) {
            method357(-6, -112);
        }
        field786++;
    }
}
