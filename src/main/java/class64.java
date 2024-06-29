import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class64 extends class185 {

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    private int field1000 = 0;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    private int field1004 = 10;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field1003 = 2048;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1005 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Z")
    public static boolean field1009 = false;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "Lei;")
    public static class175 field1011;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "[I")
    private int[] field999;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([IIBII)V")
    public static final void method429(int[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        --arg1;
        ++field1007;
        int var13 = arg4 - 1;
        int var5 = var13 + -7;
        while (~var5 < ~arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            arg1 = var12 + 1;
            arg0[arg1] = arg3;
        }
        if (arg2 > 78) {
            while (arg1 < var13) {
                ++arg1;
                arg0[arg1] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V")
    public static void method430(boolean arg0) {
        field1011 = null;
        if (!arg0) {
            field1005 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V")
    private final void method431(int arg0) {
        ++field1001;
        this.field998 = new int[this.field1004 - -1];
        this.field999 = new int[this.field1004 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field1004;
        int var4 = this.field1003 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1004; ++var5) {
            this.field999[var5] = var2;
            this.field998[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field999[this.field1004] = 4096;
        this.field998[this.field1004] = this.field998[arg0] + 4096;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class64() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lwf;ILwf;)V")
    public static final void method432(class1 arg0, int arg1, class1 arg2) {
        if (arg2.field5 != null) {
            arg2.method4((byte) -55);
        }
        ++field1008;
        if (arg1 != 10) {
            field1005 = null;
        }
        arg2.field5 = arg0;
        arg2.field7 = arg0.field7;
        arg2.field5.field7 = arg2;
        arg2.field7.field5 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field1002;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1000 = arg1.method1593((byte) 27);
                }
            } else {
                this.field1003 = arg1.method1575(false);
            }
        } else {
            this.field1004 = arg1.method1593((byte) 27);
        }
        if (arg2 != -6357) {
            this.field1004 = -91;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field1010;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 < 70) {
            method429((int[]) null, 8, (byte) -111, 100, -111);
        }
        if (super.field2804.field1384) {
            int var4 = class85.field1356[arg0];
            if (this.field1000 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1004 < ~var6; ++var6) {
                    if (~var4 <= ~this.field999[var6] && var4 < this.field999[var6 - -1]) {
                        if (~this.field998[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class193.method1212(var3, 0, class174.field2648, var5);
            } else {
                for (int var7 = 0; var7 < class174.field2648; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class153.field2304[var7];
                    int var11 = this.field1000;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(var10 - var4 >> 1);
                            }
                        } else {
                            var8 = (var4 - (4096 - var10) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field1004; ++var12) {
                        if (~this.field999[var12] >= ~var8 && this.field999[var12 - -1] > var8) {
                            if (var8 < this.field998[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        this.method431(arg0 + 9);
        if (arg0 == -9) {
            ++field1006;
        }
    }
}
