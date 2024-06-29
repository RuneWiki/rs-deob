import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class309 extends class11 {

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
    private int field4200 = 1365;

    @OriginalMember(owner = "client!lv", name = "M", descriptor = "I")
    private int field4205 = 0;

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "I")
    private int field4204 = 0;

    @OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
    private int field4210 = 20;

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "[[I")
    public static int[][] field4201 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lv", name = "N", descriptor = "Ldi;")
    public static class83 field4206 = new class83(18, 11);

    @OriginalMember(owner = "client!lv", name = "P", descriptor = "[I")
    public static int[] field4208 = new int[500];

    @OriginalMember(owner = "client!lv", name = "Q", descriptor = "Lwj;")
    public static class270 field4209 = new class270(74, -2);

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!lv", name = "O", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(II)[I", line = 4)
    public final int[] method44(int arg0, int arg1) {
        ++field4202;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            this.field4200 = 7;
        }
        if (super.field158.field2966) {
            for (int var4 = 0; class90.field1316 > var4; ++var4) {
                int var5 = (class448.field6606[var4] << 12) / this.field4200 + this.field4205;
                int var6 = (class328.field4484[arg1] << 12) / this.field4200 + this.field4204;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field4210) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 - -var7;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field4210 + -1) ? (var13 << 12) / this.field4210 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)V", line = 62)
    public static void method1792(int arg0) {
        if (arg0 >= 46) {
            field4209 = null;
            field4201 = null;
            field4206 = null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lsi;II)V", line = 76)
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field4207;
        if (arg1 > -40) {
            field4209 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field4204 = arg0.method2353((byte) 72);
                    }
                } else {
                    this.field4205 = arg0.method2353((byte) 104);
                }
            } else {
                this.field4210 = arg0.method2353((byte) 118);
            }
        } else {
            this.field4200 = arg0.method2353((byte) 99);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V", line = 136)
    public class309() {
        super(0, true);
    }
}
