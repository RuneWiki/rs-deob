import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class87 extends class259 {

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    private int field1780 = -1;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    private static int field1777 = 5063219;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lsg;")
    public static class30 field1775 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "Lsg;")
    private static class30 field1791 = class167.method1221((byte) 33, "Loaded textures");

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "Lsg;")
    public static class30 field1778 = field1791;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "[[I")
    public static int[][] field1782 = new int[104][104];

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    private int field1785;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "Lcg;")
    public static class34 field1784;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "[I")
    private int[] field1787;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "[[[I")
    public static int[][][] field1790;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1789;
        int[][] var3 = super.field4568.method241(-93, arg1);
        int var4 = -126 / ((-48 - arg0) / 42);
        if (super.field4568.field564 && this.method726(14792)) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int var8 = this.field1785 * (class94.field1911 == this.field1788 ? arg1 : this.field1788 * arg1 / class94.field1911);
            if (class223.field3999 == this.field1785) {
                for (int var9 = 0; var9 < class223.field3999; ++var9) {
                    int var10 = this.field1787[var8++];
                    var7[var9] = class68.method612(var10 << 4, 4080);
                    var5[var9] = class68.method612(65280, var10) >> 4;
                    var6[var9] = class68.method612(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class223.field3999; ++var11) {
                    int var12 = this.field1785 * var11 / class223.field3999;
                    int var13 = this.field1787[var8 + var12];
                    var7[var11] = class68.method612(4080, var13 << 4);
                    var5[var11] = class68.method612(var13 >> 4, 4080);
                    var6[var11] = class68.method612(4080, var13 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)Z")
    private final boolean method726(int arg0) {
        ++field1786;
        if (this.field1787 != null) {
            return true;
        } else {
            if (arg0 != 14792) {
                field1779 = -26;
            }
            if (this.field1780 >= 0) {
                int var2 = class223.field3999;
                int var3 = class94.field1911;
                int var4 = !class21.field396.method512(this.field1780, 1989091174) ? 128 : 64;
                this.field1787 = class21.field396.method513((byte) 101, this.field1780);
                this.field1788 = var4;
                this.field1785 = var4;
                class211.method1504(735991116, var2, var3);
                return this.field1787 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I")
    public final int method727(int arg0) {
        if (arg0 != 638) {
            field1782 = null;
        }
        ++field1781;
        return this.field1780;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V")
    public static final void method728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class167.field3086[0].method1387(arg4, arg3);
        class167.field3086[1].method1387(arg4, arg0 + arg3 - 16);
        ++field1793;
        int var6 = (arg0 + -32) * arg0 / arg5;
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (arg0 + -32 + -var6) * arg1 / (arg5 - arg0);
        class188.method1361(arg4, arg3 - -16, 16, arg0 + -32, class189.field3450);
        class188.method1361(arg4, arg3 + var7 + 16, 16, var6, field1777);
        class188.method1367(arg4, arg3 + 16 + var7, var6, class60.field1303);
        class188.method1367(arg4 + 1, arg3 + 16 + var7, var6, class60.field1303);
        class188.method1364(arg4, var7 + 16 + arg3, 16, class60.field1303);
        class188.method1364(arg4, var7 + 17 + arg3, arg2, class60.field1303);
        class188.method1367(arg4 + 15, 16 - -var7 + arg3, var6, class117.field2305);
        class188.method1367(arg4 + 14, arg3 + 17 + var7, var6 + -1, class117.field2305);
        class188.method1364(arg4, arg3 + var7 + 15 + var6, 16, class117.field2305);
        class188.method1364(arg4 + 1, arg3 + var6 + var7 + 14, 15, class117.field2305);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static final void method729(byte arg0) {
        ++field1783;
        for (int var1 = 0; var1 < class221.field3985; ++var1) {
            int var2 = class4.field55[var1];
            class275 var3 = class125.field2443[var2];
            if (var3 != null) {
                class61.method557(30958, var3, var3.field4805.field4307);
            }
        }
        if (arg0 <= 11) {
            method728(35, 24, -77, 77, 32, -112);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static void method730(byte arg0) {
        field1778 = null;
        field1784 = null;
        field1782 = null;
        field1775 = null;
        field1791 = null;
        if (arg0 > -37) {
            method730((byte) 63);
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class87() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(III)Z")
    public static final boolean method731(int arg0, int arg1, int arg2) {
        int var3 = class148.field2824[arg0][arg1][arg2];
        if (-class250.field4425 == var3) {
            return false;
        } else if (class250.field4425 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class138.method1045(var4 + 1, class242.field4333[arg0][arg1][arg2], var5 + 1) && class138.method1045(var4 + 128 - 1, class242.field4333[arg0][arg1 + 1][arg2], var5 + 1) && class138.method1045(var4 + 128 - 1, class242.field4333[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class138.method1045(var4 + 1, class242.field4333[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class148.field2824[arg0][arg1][arg2] = class250.field4425;
                return true;
            } else {
                class148.field2824[arg0][arg1][arg2] = -class250.field4425;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field1776;
        super.method2(arg0);
        this.field1787 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field1794;
        if (~arg0 == -1) {
            this.field1780 = arg2.method65((byte) 118);
        }
        if (arg1 != -1586849108) {
            method731(-82, 98, 27);
        }
    }
}
