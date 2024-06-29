import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class318 extends class145 {

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    private int field4616 = 4096;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    private int field4615 = 0;

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "[I")
    public static int[] field4617 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V", line = 6)
    public class318() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILrt;)V", line = 10)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1790 = ~arg2.method1177(255) == -2;
                }
            } else {
                this.field4616 = arg2.method1220(-127);
            }
        } else {
            this.field4615 = arg2.method1220(-89);
        }
        if (arg1 <= -67) {
            ++field4614;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 61)
    public static void method2081(byte arg0) {
        field4617 = null;
        if (arg0 != -74) {
            field4617 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)[[I", line = 71)
    public final int[][] method75(byte arg0, int arg1) {
        ++field4618;
        if (arg0 > -28) {
            this.field4616 = 66;
        }
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) -82);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class647.field9368 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field4615 >= ~var12) {
                    if (~var12 < ~this.field4616) {
                        var8[var11] = this.field4616;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4615;
                }
                if (~var13 <= ~this.field4615) {
                    if (var13 <= this.field4616) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field4616;
                    }
                } else {
                    var9[var11] = this.field4615;
                }
                if (~this.field4615 < ~var14) {
                    var10[var11] = this.field4615;
                } else if (~var14 >= ~this.field4616) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field4616;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)[I", line = 151)
    public final int[] method27(boolean arg0, int arg1) {
        ++field4613;
        if (arg0) {
            this.method28(53, 86, (class194) null);
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) -91);
            for (int var5 = 0; class647.field9368 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field4615 < ~var6) {
                    var3[var5] = this.field4615;
                } else if (this.field4616 < var6) {
                    var3[var5] = this.field4616;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
