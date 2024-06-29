import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class167 extends class13 {

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    private int field2305 = 4;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    private int field2311 = 4;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[[I")
    public static int[][] field2310;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Lnq;")
    public static class268 field2307;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lg;")
    public static class87 field2304;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)J")
    public static final long method1115(int arg0) {
        ++field2303;
        if (arg0 != 5) {
            field2307 = null;
        }
        return class163.field2261.method1198(-105);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2309;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            return null;
        } else {
            if (super.field263.field1845) {
                int var4 = class269.field3751 / this.field2305;
                int var5 = class413.field5862 / this.field2311;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method223(0, -11541, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method223(0, -11541, class413.field5862 * var7 / var5);
                }
                for (int var8 = 0; ~var8 > ~class269.field3751; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class269.field3751 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field2313;
        if (arg0 != -27832) {
            return null;
        } else {
            int[][] var3 = super.field256.method1930(arg1, (byte) 120);
            if (super.field256.field4154) {
                int var4 = class269.field3751 / this.field2305;
                int var5 = class413.field5862 / this.field2311;
                int[][] var6;
                if (~var5 >= -1) {
                    var6 = this.method227(false, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method227(false, class413.field5862 * var7 / var5, 0);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class269.field3751 < ~var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class269.field3751 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field2311 = arg0.method172((byte) 52);
            }
        } else {
            this.field2305 = arg0.method172((byte) 52);
        }
        ++field2306;
        if (arg1 < 50) {
            this.method29(false, 97);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILoo;)V")
    public static final void method1116(int arg0, class374 arg1) {
        if (arg0 != 64) {
            method1115(-75);
        }
        ++field2312;
        boolean var2 = false;
        if (class276.field3837 != arg1.field5265 && ~arg1.field5264 != 0 && ~arg1.field5251 == -1) {
            class411 var3 = class108.method761((byte) -82, arg1.field5264);
            if (var3.field5838 || arg1.field5255 + 1 > var3.field5819[arg1.field5319]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = arg1.field5265 - arg1.field5293;
            int var5 = -arg1.field5293 + class276.field3837;
            int var6 = arg1.field5309 * 128 - -(arg1.method942(false) * 64);
            int var7 = arg1.field5263 * 128 + 64 * arg1.method942(false);
            int var8 = arg1.field5303 * 128 - -(64 * arg1.method942(false));
            int var9 = arg1.field5252 * 128 - -(arg1.method942(false) * 64);
            arg1.field6262 = ((-var5 + var4) * var6 - -(var5 * var8)) / var4;
            arg1.field6266 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg1.field5339 = 0;
        if (arg1.field5249 == 0) {
            arg1.method2386(16383, 8192);
        }
        if (~arg1.field5249 == -2) {
            arg1.method2386(16383, 12288);
        }
        if (~arg1.field5249 == -3) {
            arg1.method2386(16383, 0);
        }
        if (~arg1.field5249 == -4) {
            arg1.method2386(16383, 4096);
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static void method1117(int arg0) {
        field2304 = null;
        field2307 = null;
        field2310 = null;
        if (arg0 != 64) {
            field2304 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, false);
    }

    static {
        new class442("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field2310 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    }
}
