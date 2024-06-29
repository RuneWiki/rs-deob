import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class159 extends class310 {

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
    private int field2535 = 4096;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    private int field2531 = 4096;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    private int field2534 = 4096;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "Ljl;")
    public static class332 field2538 = new class332(64);

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!kn", name = "V", descriptor = "[Z")
    public static boolean[] field2540;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "[[[Laa;")
    public static class36[][][] field2532;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)I", line = 7)
    public static final int method1242(int arg0, int arg1) {
        if (class342.field5449 != null) {
            class342.field5449.method916((byte) 112);
            class342.field5449 = null;
        }
        class231.field3836++;
        field2536++;
        if (arg0 >= -61) {
            method1244(12);
        }
        if (class231.field3836 > 4) {
            class198.field3160 = 0;
            class231.field3836 = 0;
            return arg1;
        }
        class198.field3160 = 0;
        if (class118.field1988 == class101.field1661) {
            class118.field1988 = class354.field5624;
        } else {
            class118.field1988 = class101.field1661;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 40)
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lqm;II)V", line = 47)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field2530++;
        if (arg1 != -2470) {
            this.method75((class227) null, -36, -43);
        }
        if (arg2 == 0) {
            this.field2535 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field2534 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field2531 = arg0.method1765(true);
        }
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(II)I", line = 93)
    public static final int method1243(int arg0, int arg1) {
        field2537++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        int var8 = -94 % ((arg1 + 59) / 49);
        return arg0 & ~var7;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 113)
    public static void method1244(int arg0) {
        field2538 = null;
        field2532 = (class36[][][]) null;
        if (arg0 > 34) {
            field2540 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)[[I", line = 132)
    public final int[][] method391(int arg0, boolean arg1) {
        int[][] var3 = this.field4942.method10((byte) -127, arg0);
        if (!arg1) {
            this.field2534 = -103;
        }
        field2539++;
        if (this.field4942.field30) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class261.field4405; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2535 * var12 >> 12;
                    var9[var11] = this.field2534 * var13 >> 12;
                    var10[var11] = this.field2531 * var14 >> 12;
                } else {
                    var8[var11] = this.field2535;
                    var9[var11] = this.field2534;
                    var10[var11] = this.field2531;
                }
            }
        }
        return var3;
    }
}
