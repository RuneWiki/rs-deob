import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class227 extends class154 {

    @OriginalMember(owner = "client!lk", name = "eb", descriptor = "I")
    private int field3899 = 4096;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "Z")
    public static boolean field3895 = false;

    @OriginalMember(owner = "client!lk", name = "gb", descriptor = "Leg;")
    public static class37 field3901 = class174.method1167("Clientscript error )2 check log for details", -53);

    @OriginalMember(owner = "client!lk", name = "cb", descriptor = "Leg;")
    public static class37 field3897 = class174.method1167("Gegenstand f-Ur Mitglieder", 118);

    @OriginalMember(owner = "client!lk", name = "hb", descriptor = "[Lkb;")
    public static class270[] field3902 = new class270[28];

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!lk", name = "fb", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!lk", name = "ib", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB[Laf;IZ[B)V")
    public static final void method1577(int arg0, byte arg1, class165[] arg2, int arg3, boolean arg4, byte[] arg5) {
        class187 var6 = new class187(arg5);
        ++field3896;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1267(true);
            if (var8 == 0) {
                if (arg1 >= -33) {
                    method1579(-65, -97, (byte) -63, 109);
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1246(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = 63 & var9;
                int var12 = var9 >> 12;
                int var13 = (var9 & 4048) >> 6;
                int var14 = var6.method1268(255);
                int var15 = var14 >> 2;
                int var16 = 3 & var14;
                int var17 = arg3 + var13;
                int var18 = arg0 + var11;
                if (~var17 < -1 && var18 > 0 && ~var17 > -104 && ~var18 > -104) {
                    class165 var19 = null;
                    if (!arg4) {
                        int var20 = var12;
                        if ((class241.field4312[1][var17][var18] & 2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class71.method485(var12, arg4, var7, var16, !arg4, var19, -32264, var15, var12, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        int var1 = 55 / ((arg0 - 52) / 61);
        field3901 = null;
        field3902 = null;
        field3897 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)V")
    public static final void method1579(int arg0, int arg1, byte arg2, int arg3) {
        ++field3903;
        class274 var4 = class166.method1116(11, arg0, true);
        var4.method1835(-32);
        var4.field4824 = arg3;
        int var5 = -33 % ((44 - arg2) / 55);
        var4.field4802 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field3894;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0 + -1 & class239.field4260, (byte) -116);
            int[] var5 = this.method1052(0, arg0, (byte) -117);
            int[] var6 = this.method1052(0, arg0 + 1 & class239.field4260, (byte) -113);
            for (int var7 = 0; ~field3898 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field3899;
                int var9 = (var5[var7 + 1 & class109.field1786] + -var5[class109.field1786 & var7 + -1]) * this.field3899;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 - -var12 - -4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != 1075962732) {
            this.method142((class187) null, 109, 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)I")
    public static final int method1580(boolean arg0, int arg1) {
        ++field3893;
        return !arg0 ? -84 : arg1 & 1023;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)Lci;")
    public static final class171 method1581(int arg0, int arg1, int arg2) {
        ++field3892;
        class171 var3 = new class171();
        int var4 = 84 / ((-18 - arg2) / 47);
        for (class7 var5 = (class7) class78.field1212.method1566(-3); var5 != null; var5 = (class7) class78.field1212.method1570(3)) {
            if (var5.field123 && var5.method42(true, arg1, arg0)) {
                var3.method1152(80, var5);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field3900;
        if (arg1 != -14015) {
            method1577(-73, (byte) 99, (class165[]) null, 79, true, (byte[]) null);
        }
        if (arg2 == 0) {
            this.field3899 = arg0.method1244(false);
        }
    }
}
