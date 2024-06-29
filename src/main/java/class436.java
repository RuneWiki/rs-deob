import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class436 extends class424 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[[I")
    public static int[][] field6150 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field6158 = -2;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lhc;")
    public static class368 field6154 = new class368("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "[Ldn;")
    public static class323[] field6160;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "[[[B")
    public static byte[][][] field6155;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field6156;
        int[] var3 = super.field5892.method783(arg0, (byte) -72);
        if (arg1 != -10) {
            method2683(-111, (byte) -88);
        }
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -123, arg0);
            int[] var5 = this.method2621(1, arg1 + -115, arg0);
            int[] var6 = this.method2621(2, -123, arg0);
            for (int var7 = 0; ~class303.field4135 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V")
    public static final void method2681(byte arg0, boolean arg1) {
        ++field6157;
        for (class328 var2 = (class328) class159.field2268.method1173(0); var2 != null; var2 = (class328) class159.field2268.method1165(true)) {
            if (var2.field4452 != null) {
                class48.field616.method1128(var2.field4452);
                var2.field4452 = null;
            }
            if (var2.field4460 != null) {
                class48.field616.method1128(var2.field4460);
                var2.field4460 = null;
            }
            var2.method1884(false);
        }
        if (arg0 > -62) {
            field6158 = 41;
        }
        if (arg1) {
            for (class328 var3 = (class328) class39.field520.method1173(0); var3 != null; var3 = (class328) class39.field520.method1165(true)) {
                if (var3.field4452 != null) {
                    class48.field616.method1128(var3.field4452);
                    var3.field4452 = null;
                }
                var3.method1884(false);
            }
            for (class328 var4 = (class328) class156.field2220.method842((byte) -25); var4 != null; var4 = (class328) class156.field2220.method836(-100)) {
                if (var4.field4452 != null) {
                    class48.field616.method1128(var4.field4452);
                    var4.field4452 = null;
                }
                var4.method1884(false);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field5893 = ~arg0.method2306((byte) 76) == -2;
        }
        if (arg1 == -48) {
            ++field6149;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field6152;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = this.method2621(2, -121, arg0);
            int[][] var5 = this.method2624(arg1, 0, arg0);
            int[][] var6 = this.method2624(arg1, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class303.field4135; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class436() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public static final int method2682(int arg0, int arg1) {
        if (arg0 != 5) {
            return -63;
        } else {
            ++field6151;
            if (~arg1 > -97) {
                return 0;
            } else {
                return arg1 < 128 ? 2 : 3;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(IB)V")
    public static final void method2683(int arg0, byte arg1) {
        ++field6161;
        if (class387.method2400(arg0, 176)) {
            if (arg1 > -62) {
                method2681((byte) 80, false);
            }
            class108[] var2 = class103.field1425[arg0];
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class108 var4 = var2[var3];
                if (var4 != null) {
                    var4.field1620 = 0;
                    var4.field1648 = 1;
                    var4.field1539 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
    public static void method2684(int arg0) {
        field6150 = null;
        field6155 = null;
        field6154 = null;
        if (arg0 == 7) {
            field6160 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
    public static final void method2685(byte arg0, int arg1) {
        ++field6159;
        class408 var2 = class144.field2105;
        synchronized (class144.field2105) {
            class144.field2105.method2531(arg1, 112);
            if (arg0 >= -69) {
                field6154 = null;
            }
        }
    }
}
