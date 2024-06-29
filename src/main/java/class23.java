import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class23 extends class64 {

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    private int field484 = 4096;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    private int field492 = 0;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "J")
    public static long field488;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field493;
        int var4 = 33 % ((-60 - arg0) / 36);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1183 = arg1.method819((byte) 22) == 1;
                }
            } else {
                this.field484 = arg1.method785(true);
            }
        } else {
            this.field492 = arg1.method785(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)Lgd;")
    public static final class59 method158(int arg0) {
        ++field489;
        class59 var1 = new class59();
        var1.field1100 = class182.field3544[0];
        var1.field1104 = class16.field334;
        var1.field1101 = class193.field3814[0];
        var1.field1103 = class2.field43[0];
        var1.field1107 = class41.field770[0];
        var1.field1102 = class197.field3873;
        var1.field1105 = class203.field3976[arg0];
        var1.field1106 = class156.field2992;
        class66.method424((byte) -118);
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)V")
    public static final void method159(int arg0) {
        if (arg0 == 28524) {
            ++field490;
            class26.field546.method1205(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field485;
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class147.field2715 > var11; ++var11) {
                int var12 = var9[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var14 < this.field492) {
                    var7[var11] = this.field492;
                } else if (~this.field484 > ~var14) {
                    var7[var11] = this.field484;
                } else {
                    var7[var11] = var14;
                }
                if (var13 >= this.field492) {
                    if (this.field484 < var13) {
                        var10[var11] = this.field484;
                    } else {
                        var10[var11] = var13;
                    }
                } else {
                    var10[var11] = this.field492;
                }
                if (var12 >= this.field492) {
                    if (~var12 >= ~this.field484) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field484;
                    }
                } else {
                    var8[var11] = this.field492;
                }
            }
        }
        if (arg0 != -40) {
            this.field484 = 69;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field491;
        if (arg1 != 19) {
            this.method16(-107, (byte) -119);
        }
        int[] var3 = super.field1192.method19((byte) 125, arg0);
        if (super.field1192.field75) {
            int[] var4 = this.method394(20331, 0, arg0);
            for (int var5 = 0; ~var5 > ~class147.field2715; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field492) {
                    if (~this.field484 > ~var6) {
                        var3[var5] = this.field484;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field492;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method160(Component arg0, byte arg1) {
        ++field487;
        Method var2 = class109.field1994;
        if (arg1 != 49) {
            method159(-32);
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class142.field2654);
        arg0.addFocusListener(class142.field2654);
    }
}
