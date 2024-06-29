import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class578 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field8148;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    private int field8146;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[[I")
    private int[][] field8143;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lma;")
    public static class12 field8142 = new class12();

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lnea;")
    public static class664 field8149 = new class664(97, 10);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lso;")
    public static class433 field8150 = new class433();

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "J")
    public static long field8151;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public final int method3283(int arg0, int arg1) {
        if (arg1 != 2292) {
            method3286((byte) -26);
        }
        field8145++;
        if (this.field8143 != null) {
            arg0 = (int) ((long) this.field8146 * (long) arg0 / (long) this.field8148) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method3284(int arg0) {
        if (arg0 != 0) {
            method3286((byte) -70);
        }
        field8150 = null;
        field8142 = null;
        field8149 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BI)[B")
    public final byte[] method3285(byte[] arg0, int arg1) {
        if (arg1 <= 71) {
            return null;
        }
        field8140++;
        if (this.field8143 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field8146 / (long) this.field8148) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field8143[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field8146 + var6;
                int var14 = var13 / this.field8148;
                var5 += var14;
                var6 = var13 - this.field8148 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method3286(byte arg0) {
        int var1 = -108 / ((arg0 - 62) / 33);
        class626.field8770 = null;
        field8141++;
        class693.method3810(0, true, 0, 0, class31.field494, -1, class487.field6930, class100.field1556, 0);
        if (class626.field8770 != null) {
            class664.method3671(class626.field8770, 0, class31.field494, class461.field6646.field965, class78.field1341, 0, -1412584499, class487.field6930, class190.field2744, -128);
            class626.field8770 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)[Lwl;")
    public static final class373[] method3287(boolean arg0) {
        if (!arg0) {
            field8142 = null;
        }
        if (class138.field2007 == null) {
            class373[] var1 = class147.method1051(class368.field5267, 106);
            class373[] var2 = new class373[var1.length];
            int var3 = 0;
            int var4 = class287.field4270.method2749((byte) 4, class328.field4859);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class373 var9 = var1[var5];
                if ((var9.field5320 <= 0 || var9.field5320 >= 24) && var9.field5319 >= 800 && var9.field5318 >= 600 && (var4 != 2 || var9.field5319 <= 800 && var9.field5318 <= 600) && (var4 != 1 || var9.field5319 <= 1024 && var9.field5318 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class373 var11 = var2[var10];
                        if (var9.field5319 == var11.field5319 && var9.field5318 == var11.field5318) {
                            if (var9.field5320 > var11.field5320) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class138.field2007 = new class373[var3];
            class476.method2794(var2, 0, class138.field2007, 0, var3);
            int[] var6 = new int[class138.field2007.length];
            for (int var7 = 0; var7 < class138.field2007.length; var7++) {
                class373 var8 = class138.field2007[var7];
                var6[var7] = var8.field5319 * var8.field5318;
            }
            class243.method1648((byte) 21, class138.field2007, var6);
        }
        field8144++;
        return class138.field2007;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
    public final int method3288(int arg0, int arg1) {
        int var3 = -50 / ((arg0 + 36) / 60);
        field8147++;
        if (this.field8143 != null) {
            arg1 = (int) ((long) this.field8146 * (long) arg1 / (long) this.field8148);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(II)V")
    public class578(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class498.method2879((byte) -123, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field8148 = var4;
            this.field8146 = var5;
            this.field8143 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field8143[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
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
