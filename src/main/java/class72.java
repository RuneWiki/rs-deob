import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class72 extends class739 {

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    private int field1089 = 4096;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    private int field1088 = 3216;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    private int field1091 = 3216;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "[I")
    private int[] field1086 = new int[3];

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "Lufa;")
    public static class740 field1095 = new class740(10, 7);

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "Ltd;")
    public static class515 field1097;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "[[[J")
    public static long[][][] field1096;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V", line = 4)
    private final void method626(int arg0) {
        ++field1094;
        double var2 = Math.cos((double) ((float) this.field1088 / 4096.0F));
        this.field1086[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1091 / 4096.0F)));
        this.field1086[1] = (int) (var2 * Math.cos((double) ((float) this.field1091 / 4096.0F)) * 4096.0D);
        this.field1086[arg0] = (int) (4096.0D * Math.sin((double) ((float) this.field1088 / 4096.0F)));
        int var4 = this.field1086[0] * this.field1086[0] >> 12;
        int var5 = this.field1086[1] * this.field1086[1] >> 12;
        int var6 = this.field1086[2] * this.field1086[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - (-var5 - var6) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1086[1] = (this.field1086[1] << 12) / var7;
            this.field1086[2] = (this.field1086[2] << 12) / var7;
            this.field1086[0] = (this.field1086[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V", line = 32)
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V", line = 35)
    public static void method627(int arg0) {
        field1096 = null;
        if (arg0 != 812) {
            method627(8);
        }
        field1097 = null;
        field1095 = null;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V", line = 50)
    public final void method628(int arg0) {
        ++field1093;
        this.method626(2);
        if (arg0 < 53) {
            this.field1091 = -7;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILqk;ILqt;ILaa;ILjava/lang/String;Lda;II)V", line = 70)
    public static final void method629(int arg0, int arg1, class146 arg2, int arg3, class502 arg4, int arg5, class569 arg6, int arg7, String arg8, class400 arg9, int arg10, int arg11) {
        ++field1087;
        int var12;
        if (class165.field2351 != 4) {
            var12 = 16383 & (int) class680.field9668 + class225.field3350;
        } else {
            var12 = (int) class680.field9668 & 16383;
        }
        if (arg11 != -880112948) {
            method629(-112, 89, (class146) null, 11, (class502) null, -37, (class569) null, -52, (String) null, (class400) null, 75, 99);
        }
        int var13 = Math.max(arg2.field2016 / 2, arg2.field1997 / 2) - -10;
        int var14 = arg1 * arg1 + arg3 * arg3;
        if (~(var13 * var13) <= ~var14) {
            int var15 = class125.field1736[var12];
            int var16 = class125.field1729[var12];
            if (~class165.field2351 != -5) {
                var15 = var15 * 256 / (class17.field162 + 256);
                var16 = var16 * 256 / (class17.field162 + 256);
            }
            int var17 = arg3 * var15 - -(arg1 * var16) >> 14;
            int var18 = arg3 * var16 - arg1 * var15 >> 14;
            int var19 = arg4.method3067(100, arg8, 123, (class515[]) null);
            int var20 = arg4.method3065(100, (class515[]) null, arg8, 0, 0);
            int var21 = var17 - var19 / 2;
            if (~(-arg2.field2016) >= ~var21 && ~arg2.field2016 <= ~var21 && -arg2.field1997 <= var18 && ~var18 >= ~arg2.field1997) {
                arg9.method2435(0, arg8, 0, (class515[]) null, arg7, (byte) -125, (int[]) null, arg0 - -(arg2.field1997 / 2) + -arg5 + -var18 + -var20, 0, arg0, 50, arg10, var19, arg2.field2016 / 2 + arg10 + var21, arg6, 1);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)[I", line = 128)
    public final int[] method445(boolean arg0, int arg1) {
        ++field1092;
        if (arg0) {
            method629(-83, -30, (class146) null, -90, (class502) null, -36, (class569) null, -28, (String) null, (class400) null, 101, 46);
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class261.field3728 * this.field1089 >> 12;
            int[] var5 = this.method4127(class311.field4223 & arg1 + -1, 56, 0);
            int[] var6 = this.method4127(arg1, 120, 0);
            int[] var7 = this.method4127(arg1 + 1 & class311.field4223, 122, 0);
            for (int var8 = 0; var8 < class399.field5703; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class423.field6029 & var8 + -1] + -var6[var8 - -1 & class423.field6029]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class642.field9130[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1086[0] * var14 >> 12;
                int var18 = this.field1086[1] * var15 >> 12;
                int var19 = this.field1086[2] * var16 >> 12;
                var3[var8] = var17 - -var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lsl;IB)V", line = 200)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field1090;
        if (arg2 == 1) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field1088 = arg0.method2882(arg2 ^ -2);
                    }
                } else {
                    this.field1091 = arg0.method2882(arg2 + -2);
                }
            } else {
                this.field1089 = arg0.method2882(-1);
            }
        }
    }
}
