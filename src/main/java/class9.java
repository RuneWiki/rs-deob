import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class9 extends class16 {

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    private int field98 = 32768;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 8)
    public class9() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)[[I", line = 20)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 34 / ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        field100++;
        if (this.field197.field1548) {
            int[] var5 = this.method103(1, 4389, arg0);
            int[] var6 = this.method103(2, 4389, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            for (int var10 = 0; var10 < class276.field4376; var10++) {
                int var11 = (var5[var10] * 255 & 0xFF30D) >> 12;
                int var12 = var6[var10] * this.field98 >> 12;
                int var13 = class229.field3652[var11] * var12 >> 12;
                int var14 = class34.field454[var11] * var12 >> 12;
                int var15 = class148.field2215 & (var13 >> 12) + var10;
                int var16 = (var14 >> 12) + arg0 & class240.field3798;
                int[][] var17 = this.method111(0, (byte) 122, var16);
                var7[var10] = var17[0][var15];
                var9[var10] = var17[1][var15];
                var8[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V", line = 72)
    public final void method55(byte arg0) {
        field99++;
        if (arg0 != 0) {
            this.field98 = -112;
        }
        class103.method723(false);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(ZI)[I", line = 93)
    public final int[] method8(boolean arg0, int arg1) {
        field97++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(1, 4389, arg1);
            int[] var5 = this.method103(2, 4389, arg1);
            for (int var6 = 0; var6 < class276.field4376; var6++) {
                int var7 = (var4[var6] & 0xFF2) >> 4;
                int var8 = var5[var6] * this.field98 >> 12;
                int var9 = class229.field3652[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class148.field2215;
                int var11 = class34.field454[var7] * var8 >> 12;
                int var12 = class240.field3798 & arg1 + (var11 >> 12);
                int[] var13 = this.method103(0, 4389, var12);
                var3[var6] = var13[var10];
            }
        }
        return arg0 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLim;I)V", line = 152)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field98 = arg1.method1396(-84) << 4;
        } else if (arg2 == 1) {
            this.field191 = arg1.method1399(arg0 ^ 0x45E13F91) == 1;
        }
        if (arg0 != -7) {
            this.method54(126, (byte) 122);
        }
        field96++;
    }
}
