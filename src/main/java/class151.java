import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class151 extends class23 {

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    private int field2854 = -1;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Ldc;")
    public static class37 field2855 = class185.method1233((byte) 86, ":duelstake:");

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    public static volatile int field2869 = 0;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "Ldc;")
    public static class37 field2868 = class185.method1233((byte) 86, ")4l");

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "[I")
    public int[] field2857;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[I")
    public static int[] field2862;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "[I")
    public static int[] field2865;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2854 = arg0.method230((byte) -101);
        }
        if (arg2 == 1000) {
            ++field2870;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Ldc;")
    public static final class37 method1034(byte arg0, int arg1) {
        if (arg0 != -9) {
            method1036(-17);
        }
        ++field2853;
        return class180.method1198(false, 10, arg0 ^ 23319, arg1);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public final void method158(int arg0) {
        ++field2856;
        super.method158(arg0);
        this.field2857 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[[I")
    public int[][] method36(int arg0, byte arg1) {
        ++field2858;
        if (arg1 != 9) {
            this.method36(-9, (byte) -13);
        }
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303 && this.method1035(88)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2864 * (~class235.field4276 != ~this.field2852 ? this.field2852 * arg0 / class235.field4276 : arg0);
            if (class199.field3705 == this.field2864) {
                for (int var8 = 0; class199.field3705 > var8; ++var8) {
                    int var9 = this.field2857[var7++];
                    var6[var8] = class58.method449(var9 << 4, 4080);
                    var5[var8] = class58.method449(var9 >> 4, 4080);
                    var4[var8] = class58.method449(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class199.field3705 < ~var10; ++var10) {
                    int var11 = this.field2864 * var10 / class199.field3705;
                    int var12 = this.field2857[var7 + var11];
                    var6[var10] = class58.method449(255, var12) << 4;
                    var5[var10] = class58.method449(var12, 65280) >> 4;
                    var4[var10] = class58.method449(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)Z")
    public final boolean method1035(int arg0) {
        if (arg0 < 86) {
            field2859 = 65;
        }
        ++field2866;
        if (this.field2857 != null) {
            return true;
        } else if (~this.field2854 <= -1) {
            class182 var2 = class135.method935(this.field2854, class118.field2121, 0);
            var2.method1216();
            this.field2864 = var2.field1837;
            this.field2852 = var2.field1833;
            this.field2857 = var2.field3375;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class151() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2868 = null;
        field2865 = null;
        field2855 = null;
        if (arg0 != 10) {
            method1034((byte) -50, 17);
        }
        field2862 = null;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
    public final int method163(int arg0) {
        ++field2867;
        int var2 = 118 % ((57 - arg0) / 63);
        return this.field2854;
    }
}
