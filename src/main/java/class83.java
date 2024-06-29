import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class83 extends class142 {

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    private int field1453 = 1;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    private int field1457 = 1;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1451 = 0;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Lai;")
    public static class10 field1446 = class44.method278("(U0a )2 via: ", -94);

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1449 = 0;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lai;")
    private static class10 field1452 = class44.method278("Please contact customer support)3", -123);

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lai;")
    public static class10 field1450 = field1452;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Lai;")
    public static class10 field1445 = class44.method278("und die Schaltfl-=che (WSpielkonto erstellen(W am", 95);

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Lai;")
    public static class10 field1444 = class44.method278("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", -44);

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lai;")
    public static class10 field1454 = class44.method278("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 100);

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "Ldd;")
    public static class34 field1443 = new class34(64);

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            this.field1457 = 22;
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        ++field1448;
        if (super.field2683.field3516) {
            int var4 = this.field1457 + 1 + this.field1457;
            int var5 = this.field1453 - -1 + this.field1453;
            int[][] var6 = new int[var4][];
            for (int var7 = arg1 - this.field1457; var7 <= this.field1457 + arg1; ++var7) {
                int[] var11 = this.method963((byte) -121, 0, class205.field3986 & var7);
                int[] var12 = new int[class133.field2499];
                int var13 = 0;
                for (int var14 = -this.field1453; var14 <= this.field1453; ++var14) {
                    var13 += var11[class56.field997 & var14];
                }
                int var15 = 0;
                while (var15 < class133.field2499) {
                    var12[var15] = var13 / var5;
                    int var16 = var13 - var11[class56.field997 & var15 - this.field1453];
                    ++var15;
                    var13 = var11[this.field1453 + var15 & class56.field997] + var16;
                }
                var6[this.field1457 + var7 - arg1] = var12;
            }
            for (int var8 = 0; ~var8 > ~class133.field2499; ++var8) {
                int var9 = 0;
                for (int var10 = 0; var10 < var4; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field1447;
        int[][] var3 = super.field2666.method956(arg0, -127);
        if (arg1) {
            field1449 = 27;
        }
        if (super.field2666.field2664) {
            int var4 = this.field1457 + this.field1457 + 1;
            int[][][] var5 = new int[var4][][];
            int var6 = this.field1453 + 1 - -this.field1453;
            for (int var7 = arg0 - this.field1457; var7 <= this.field1457 + arg0; ++var7) {
                int[][] var17 = this.method961(2, 0, class205.field3986 & var7);
                int[][] var18 = new int[3][class133.field2499];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[1];
                int[] var23 = var17[0];
                int[] var24 = var17[2];
                for (int var25 = -this.field1453; ~var25 >= ~this.field1453; ++var25) {
                    int var35 = class56.field997 & var25;
                    var21 += var24[var35];
                    var20 += var22[var35];
                    var19 += var23[var35];
                }
                int[] var26 = var18[1];
                int[] var27 = var18[2];
                int[] var28 = var18[0];
                int var29 = 0;
                while (class133.field2499 > var29) {
                    var28[var29] = var19 / var6;
                    var26[var29] = var20 / var6;
                    var27[var29] = var21 / var6;
                    int var30 = -this.field1453 + var29 & class56.field997;
                    int var31 = var19 - var23[var30];
                    int var32 = var21 - var24[var30];
                    int var33 = var20 - var22[var30];
                    ++var29;
                    int var34 = var29 - -this.field1453 & class56.field997;
                    var20 = var22[var34] + var33;
                    var19 = var23[var34] + var31;
                    var21 = var24[var34] + var32;
                }
                var5[-arg0 + this.field1457 + var7] = var18;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class133.field2499; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var4 > var15; ++var15) {
                    int[][] var16 = var5[var15];
                    var14 += var16[2][var11];
                    var12 += var16[1][var11];
                    var13 += var16[0][var11];
                }
                var8[var11] = var13 / var4;
                var10[var11] = var12 / var4;
                var9[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static final void method509(int arg0) {
        ++field1456;
        class171 var1 = (class171) class123.field2360.method1223(true);
        if (arg0 >= 119) {
            while (var1 != null) {
                if (var1.field3310 == -1) {
                    var1.field3306 = 0;
                    class15.method93(var1, 103);
                } else {
                    var1.method848(false);
                }
                var1 = (class171) class123.field2360.method1226((byte) -57);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static void method510(int arg0) {
        int var1 = 98 % ((-51 - arg0) / 51);
        field1443 = null;
        field1445 = null;
        field1446 = null;
        field1450 = null;
        field1454 = null;
        field1452 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field1458;
        if (arg2 > -34) {
            field1443 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field2684 = ~arg0.method767(true) == -2;
                }
            } else {
                this.field1457 = arg0.method767(true);
            }
        } else {
            this.field1453 = arg0.method767(true);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class83() {
        super(1, false);
    }
}
