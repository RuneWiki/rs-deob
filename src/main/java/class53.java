import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class53 extends class3 {

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    private int field802 = 4;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    private int field801 = 4;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 7)
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 15)
    public static final void method385(int arg0) {
        field807++;
        class195.field2992.method250(21066, 84);
        class107.field1537++;
        class195.field2992.method2193(class84.method552(0), false);
        class195.field2992.method2206(class233.field3712, (byte) -43);
        int var1 = -73 / ((arg0 - 11) / 36);
        class195.field2992.method2206(class243.field3838, (byte) -98);
        class195.field2992.method2193(class306.field4997, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[[I", line = 32)
    public final int[][] method22(int arg0, int arg1) {
        field805++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int var4 = class326.field5342 / this.field801;
            int var5 = class308.field5010 / this.field802;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method16(0, 0, (byte) 86);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method16(class308.field5010 * var7 / var5, 0, (byte) -89);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[2];
            int[] var10 = var6[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class326.field5342; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class326.field5342 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var9[var16];
            }
        }
        if (arg0 != -21194) {
            this.field801 = -115;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[I", line = 109)
    public final int[] method25(byte arg0, int arg1) {
        field804++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class326.field5342 / this.field801;
            int var5 = class308.field5010 / this.field802;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method24(0, 1, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method24(class308.field5010 * var7 / var5, 1, 0);
            }
            for (int var8 = 0; var8 < class326.field5342; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class326.field5342 * var9 / var4];
                }
            }
        }
        if (arg0 <= 57) {
            this.method25((byte) -21, 108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfh;IZ)V", line = 168)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field801 = arg0.method2224(-122);
        } else if (arg1 == 1) {
            this.field802 = arg0.method2224(-124);
        }
        if (!arg2) {
            field806++;
        }
    }
}
