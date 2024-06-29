import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class238 extends class68 {

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3612 = null;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[Lge;")
    public static class72[] field3606;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IJIILjava/lang/String;Ljava/lang/String;SI)V")
    public static final void method1593(int arg0, long arg1, int arg2, int arg3, String arg4, String arg5, short arg6, int arg7) {
        ++field3610;
        if (!class15.field146) {
            if (arg2 == -30789) {
                if (class68.field925 < 500) {
                    class285.field4468[class68.field925] = arg4;
                    class41.field612[class68.field925] = arg5;
                    class227.field3444[class68.field925] = arg0 != -1 ? arg0 : class172.field2399;
                    class221.field3306[class68.field925] = arg6;
                    class278.field4316[class68.field925] = arg1;
                    class219.field3299[class68.field925] = arg3;
                    class144.field2001[class68.field925] = arg7;
                    ++class68.field925;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
    public static final int method1594(int arg0, int arg1) {
        ++field3614;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg1 != 4096) {
            return 0;
        } else {
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIII)V")
    public static final void method1595(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3609;
        for (int var5 = 0; ~class265.field3979 < ~var5; ++var5) {
            if (arg1 < class123.field1713[var5] + class118.field1670[var5] && ~class118.field1670[var5] > ~(arg1 + arg3) && ~arg4 > ~(class101.field1420[var5] - -class150.field2074[var5]) && class101.field1420[var5] < arg2 + arg4) {
                class42.field640[var5] = true;
            }
        }
        if (arg0 != 30) {
            field3612 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field3611;
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = -124 / ((63 - arg1) / 61);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[] var6 = var5[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[2];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            for (int var12 = 0; ~var12 > ~class89.field1248; ++var12) {
                var7[var12] = -var6[var12] + 4096;
                var8[var12] = -var11[var12] + 4096;
                var10[var12] = 4096 - var9[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class238() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLlk;Llk;)V")
    public static final void method1596(byte arg0, class84 arg1, class84 arg2) {
        if (arg1.field1143 != null) {
            arg1.method527(false);
        }
        arg1.field1141 = arg2.field1141;
        ++field3613;
        arg1.field1143 = arg2;
        if (arg0 <= 32) {
            field3606 = null;
        }
        arg1.field1143.field1141 = arg1;
        arg1.field1141.field1143 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field3608;
        if (!arg2) {
            field3606 = null;
        }
        if (arg1 == 0) {
            super.field926 = arg0.method1453((byte) -127) == 1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field3607;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            for (int var5 = 0; ~class89.field1248 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 >= -118) {
            field3606 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        field3612 = null;
        field3606 = null;
        if (arg0 != 80) {
            method1595((byte) 11, -62, -104, 5, -53);
        }
    }
}
