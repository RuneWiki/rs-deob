import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class187 extends class326 {

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
    private int field2566 = 4;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    private int field2567 = 4;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "Z")
    public static boolean field2565 = true;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "Z")
    public static boolean field2562 = false;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "Llm;")
    public static class317 field2569;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "Llo;")
    public static class490 field2561;

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 10)
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(IB)[[I", line = 13)
    public final int[][] method48(int arg0, byte arg1) {
        ++field2568;
        int[][] var3 = super.field4343.method2356(arg0, 117);
        if (arg1 > -52) {
            return null;
        } else {
            if (super.field4343.field5336) {
                int var4 = class181.field2495 / this.field2567;
                int var5 = class27.field359 / this.field2566;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg0 % var5;
                    var7 = this.method1828(0, true, class27.field359 * var6 / var5);
                } else {
                    var7 = this.method1828(0, true, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~var14 > ~class181.field2495; ++var14) {
                    int var15;
                    if (var4 <= 0) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class181.field2495 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I", line = 82)
    public final int[] method30(byte arg0, int arg1) {
        ++field2563;
        int[] var3 = super.field4344.method130(arg1, 31);
        if (arg0 >= -6) {
            this.method30((byte) -49, -105);
        }
        if (super.field4344.field286) {
            int var4 = class181.field2495 / this.field2567;
            int var5 = class27.field359 / this.field2566;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1824(0, false, class27.field359 * var6 / var5);
            } else {
                var7 = this.method1824(0, false, 0);
            }
            for (int var8 = 0; ~class181.field2495 < ~var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class181.field2495 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V", line = 135)
    public static final void method1080(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6842 != null) {
                var3.field6842 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILbt;I)V", line = 151)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2564;
        if (arg2 >= -3) {
            this.method33(73, (class32) null, -82);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2566 = arg1.method201((byte) -121);
            }
        } else {
            this.field2567 = arg1.method201((byte) -119);
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(Z)V", line = 190)
    public static void method1081(boolean arg0) {
        if (!arg0) {
            method1081(true);
        }
        field2561 = null;
        field2569 = null;
    }
}
