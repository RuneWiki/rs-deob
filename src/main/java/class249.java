import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class249 {

    @OriginalMember(owner = "client!en", name = "k", descriptor = "[[I")
    private int[][] field3607;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field3604 = -50;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)I", line = 7)
    public final int method1793(int arg0, byte arg1) {
        field3603++;
        if (arg1 >= -121) {
            this.method1797(-98, -38);
        }
        if (this.field3607 != null) {
            arg0 = ((int) ((long) this.field3601 * (long) arg0 / (long) this.field3605)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1794(int arg0) {
        class170.field2541 = 0;
        class61.field991 = false;
        if (arg0 != -5425) {
            method1794(97);
        }
        class11.field159 = -3;
        class394.field5758 = 0;
        class419.field6072 = 1;
        class256.field3704 = 0;
        field3599++;
        class13.field219 = -1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ldp;Ldp;ZI)V", line = 39)
    public static final void method1795(class174 arg0, class174 arg1, boolean arg2, int arg3) {
        field3606++;
        if (arg3 != -26455) {
            field3604 = 35;
        }
        class136.field2170 = arg0;
        class377.field5337 = arg1;
        class223.field3316 = arg2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BI)[B", line = 52)
    public final byte[] method1796(byte[] arg0, int arg1) {
        if (this.field3607 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3601 / (long) this.field3605) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3607[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3601 + var6;
                int var14 = var13 / this.field3605;
                var5 += var14;
                var6 = var13 - this.field3605 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 > -122) {
            this.method1796((byte[]) null, 9);
        }
        field3600++;
        return arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I", line = 123)
    public final int method1797(int arg0, int arg1) {
        field3598++;
        if (this.field3607 != null) {
            arg0 = (int) ((long) this.field3601 * (long) arg0 / (long) this.field3605);
        }
        int var3 = -7 / ((arg1 - 25) / 33);
        return arg0;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(II)V", line = 144)
    public class249(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class209.method1576((byte) -40, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3607 = new int[var5][14];
            this.field3601 = var4;
            this.field3605 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3607[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
