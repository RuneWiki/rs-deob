import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[[I")
    private int[][] field152;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
    public static int[] field157 = new int[128];

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lbe;")
    public static class28 field150 = new class28(5000);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Z")
    public static boolean field163 = false;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lid;")
    public static class149 field164 = class60.method382("<col=00ffff>", (byte) 88);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field161 = -1;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "F")
    public static float field156;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Laj;IIIIII)V")
    public static final void method60(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field155++;
        int var7 = arg1 * arg1 + arg2 * arg2;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg0.field722 / 2, arg0.field727 / 2);
        if (var8 * var8 >= var7) {
            class257.method1775(arg0, arg4, class93.field1641[arg5], true, arg1, arg3, arg2);
        } else {
            var8 -= 10;
            int var9 = class55.field985 + class184.field3320 & 0x7FF;
            int var10 = class235.field4118[var9];
            int var11 = var10 * 256 / (class232.field4093 + 256);
            int var12 = class235.field4123[var9];
            int var13 = var12 * 256 / (class232.field4093 + 256);
            int var14 = arg2 * var11 - (arg1 * var13) >> 16;
            int var15 = arg1 * var11 + arg2 * var13 >> 16;
            double var16 = Math.atan2((double) var15, (double) var14);
            int var18 = (int) (Math.sin(var16) * (double) var8);
            int var19 = (int) ((double) var8 * Math.cos(var16));
            ((class46) class124.field2192[arg5]).method277(arg0.field722 / 2 + var18 + arg4 - 10, -var19 + arg3 + -10 - -(arg0.field727 / 2), 20, 20, 15, 15, var16, 256);
        }
        if (arg6 != 20) {
            method63(true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    public final int method61(int arg0, byte arg1) {
        if (this.field152 != null) {
            arg0 = (int) ((long) this.field159 * (long) arg0 / (long) this.field154) + 6;
        }
        field149++;
        if (arg1 <= 21) {
            field164 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)I")
    public final int method62(byte arg0, int arg1) {
        field158++;
        if (arg0 == -81) {
            if (this.field152 != null) {
                arg1 = (int) ((long) this.field159 * (long) arg1 / (long) this.field154);
            }
            return arg1;
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method63(boolean arg0) {
        field160++;
        if (!arg0) {
            field163 = false;
        }
        class115.field1957.method1290((byte) 63);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BZ)[B")
    public final byte[] method64(byte[] arg0, boolean arg1) {
        if (arg1) {
            method63(false);
        }
        if (this.field152 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field159 / (long) this.field154) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field152[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field159 + var6;
                int var14 = var13 / this.field154;
                var5 += var14;
                var6 = var13 - this.field154 * var14;
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
        field151++;
        return arg0;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class97.method704(arg0, (byte) -97, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field154 = var4;
            this.field159 = var5;
            this.field152 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field152[var6];
                double var8 = (double) var5 / (double) var4;
                double var10 = (double) var6 / (double) var4 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field157 = null;
        field164 = null;
        if (arg0 == 0) {
            field150 = null;
        }
    }
}
