import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class325 extends class386 {

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    private int field4342 = 4096;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    private int field4341 = 0;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "[Z")
    public static boolean[] field4339 = new boolean[100];

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBLun;)V", line = 3)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field4343;
        if (arg1 <= 111) {
            this.method355(-82, (byte) -106, (class389) null);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field5145 = ~arg2.method2229(255) == -2;
                }
            } else {
                this.field4342 = arg2.method2260(-65);
            }
        } else {
            this.field4341 = arg2.method2260(-108);
        }
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)V", line = 46)
    public static void method1893(byte arg0) {
        field4339 = null;
        if (arg0 <= 21) {
            method1893((byte) -40);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[[I", line = 59)
    public final int[][] method645(int arg0, int arg1) {
        ++field4340;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(arg0, 0, -124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class599.field8643; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field4341) {
                    var8[var11] = this.field4341;
                } else if (this.field4342 < var12) {
                    var8[var11] = this.field4342;
                } else {
                    var8[var11] = var12;
                }
                if (var13 >= this.field4341) {
                    if (this.field4342 < var13) {
                        var9[var11] = this.field4342;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field4341;
                }
                if (~var14 > ~this.field4341) {
                    var10[var11] = this.field4341;
                } else if (var14 > this.field4342) {
                    var10[var11] = this.field4342;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        if (arg1 != 3) {
            this.field4342 = -127;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[I", line = 135)
    public final int[] method359(int arg0, int arg1) {
        ++field4338;
        int[] var3 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var4 = this.method2212((byte) 117, arg0, 0);
            for (int var5 = 0; var5 < class599.field8643; ++var5) {
                int var6 = var4[var5];
                if (this.field4341 > var6) {
                    var3[var5] = this.field4341;
                } else if (~var6 >= ~this.field4342) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4342;
                }
            }
        }
        int var7 = -73 % ((arg1 - 13) / 40);
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 179)
    public class325() {
        super(1, false);
    }
}
