import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class8 extends class115 {

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
    private boolean field86 = true;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Z")
    private boolean field87 = true;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lmj;")
    public static class129 field90;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Lmj;")
    public static class129 field93;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        int[][] var3 = super.field1882.method1242(arg0, -105);
        if (arg1 <= 11) {
            this.field87 = true;
        }
        ++field92;
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, this.field87 ? -arg0 + class38.field522 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field86) {
                for (int var11 = 0; class130.field2297 > var11; ++var11) {
                    var8[var11] = var5[-var11 + class134.field2350];
                    var10[var11] = var6[-var11 + class134.field2350];
                    var9[var11] = var7[-var11 + class134.field2350];
                }
            } else {
                for (int var12 = 0; var12 < class130.field2297; ++var12) {
                    var8[var12] = var5[var12];
                    var10[var12] = var6[var12];
                    var9[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field89;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1879 = ~arg1.method758(true) == -2;
                }
            } else {
                this.field87 = arg1.method758(true) == 1;
            }
        } else {
            this.field86 = ~arg1.method758(true) == -2;
        }
        if (arg0 != 107) {
            this.field87 = false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V")
    public static final void method32(byte arg0, boolean arg1) {
        if (arg0 >= 38) {
            for (class185 var2 = (class185) class165.field2811.method315(-31594); var2 != null; var2 = (class185) class165.field2811.method312(1012)) {
                if (var2.field3266 != null) {
                    class86.field1341.method509(var2.field3266);
                    var2.field3266 = null;
                }
                if (var2.field3250 != null) {
                    class86.field1341.method509(var2.field3250);
                    var2.field3250 = null;
                }
                var2.method1234(17216);
            }
            if (arg1) {
                for (class185 var3 = (class185) class185.field3252.method315(-31594); var3 != null; var3 = (class185) class185.field3252.method312(1012)) {
                    if (var3.field3266 != null) {
                        class86.field1341.method509(var3.field3266);
                        var3.field3266 = null;
                    }
                    var3.method1234(17216);
                }
                for (class185 var4 = (class185) class85.field1303.method1536(46); var4 != null; var4 = (class185) class85.field1303.method1534(-21389)) {
                    if (var4.field3266 != null) {
                        class86.field1341.method509(var4.field3266);
                        var4.field3266 = null;
                    }
                    var4.method1234(17216);
                }
            }
            ++field88;
        }
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
    public static void method33(int arg0) {
        if (arg0 == 0) {
            field93 = null;
            field90 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field91;
        int[] var3 = super.field1872.method182((byte) -95, arg0);
        if (arg1 <= 37) {
            return null;
        } else {
            if (super.field1872.field341) {
                int[] var4 = this.method792(0, 0, this.field87 ? -arg0 + class38.field522 : arg0);
                if (!this.field86) {
                    class22.method116(var4, 0, var3, 0, class130.field2297);
                } else {
                    for (int var5 = 0; class130.field2297 > var5; ++var5) {
                        var3[var5] = var4[class134.field2350 - var5];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class8() {
        super(1, false);
    }
}
