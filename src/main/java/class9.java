import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 extends class215 {

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    private int field111 = 4;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    private int field113 = 4;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
    public static int[] field105 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field112 = -1;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "[I")
    public static int[] field109 = new int[5];

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "[[Z")
    public static boolean[][] field110;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public static void method44(byte arg0) {
        if (arg0 < -96) {
            field110 = null;
            field105 = null;
            field109 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field113 = arg2.method584(255);
            }
        } else {
            this.field111 = arg2.method584(255);
        }
        if (arg0 != 1521146348) {
            this.method45(-47, -41, (class96) null);
        }
        ++field107;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field108;
        if (arg0 != -1) {
            this.method46(-34, -13);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int var4 = class244.field4015 / this.field111;
            int var5 = class80.field998 / this.field113;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1504(-122, 0, class80.field998 * var6 / var5);
            } else {
                var7 = this.method1504(-92, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class244.field4015; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class244.field4015 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var12[var14] = var8[var16];
                var11[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field104;
        int[] var3 = super.field3445.method1755(arg0, (byte) 101);
        if (arg1 != 255) {
            method44((byte) 67);
        }
        if (super.field3445.field4163) {
            int var4 = class244.field4015 / this.field111;
            int var5 = class80.field998 / this.field113;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method1503(-1, 0, class80.field998 * var6 / var5);
            } else {
                var7 = this.method1503(-1, 0, 0);
            }
            for (int var8 = 0; var8 < class244.field4015; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class244.field4015 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
