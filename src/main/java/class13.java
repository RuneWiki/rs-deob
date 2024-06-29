import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class13 extends class601 {

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    private int field196 = 4096;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    private int field195 = 16;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    private int field200 = 0;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    private int field198 = 0;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    private int field203 = 2000;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field202 = new String[100];

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "Lle;")
    public static class311 field201 = new class311();

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "Lwu;")
    public static class376 field205;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            return null;
        } else {
            ++field204;
            int[] var3 = super.field7902.method382(arg1, true);
            if (super.field7902.field704) {
                int var4 = this.field196 >> 1;
                int[][] var5 = super.field7902.method383((byte) 115);
                Random var6 = new Random((long) this.field198);
                for (int var7 = 0; ~this.field203 < ~var7; ++var7) {
                    int var8 = ~this.field196 >= -1 ? this.field200 : -var4 + this.field200 + class309.method1906(this.field196, -1, var6);
                    int var9 = (4091 & var8) >> 4;
                    int var10 = class309.method1906(class171.field2624, arg0 + 39, var6);
                    int var11 = class309.method1906(class671.field9149, -1, var6);
                    int var12 = var10 - -(class379.field5284[var9] * this.field195 >> 12);
                    int var13 = (class105.field1442[var9] * this.field195 >> 12) + var11;
                    int var14 = var13 - var11;
                    int var15 = -var10 + var12;
                    if (var15 != 0 || ~var14 != -1) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var12 < var10) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class309.method1906(4096, -1, var6) >> 2) + 1024;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var27 = var11 >= var13 ? -1 : 1;
                        for (int var28 = var10; ~var28 > ~var12; ++var28) {
                            int var29 = (-var10 + var28) * var25 + (var26 - -1024);
                            int var30 = var28 & class445.field6116;
                            int var31 = var21 & class112.field1855;
                            var24 += var23;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            if (var24 > 0) {
                                var24 += -var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        class564.method3118(true);
        if (arg0 != 8351) {
            field202 = null;
        }
        ++field199;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method109(byte arg0) {
        field205 = null;
        field201 = null;
        field202 = null;
        if (arg0 <= 55) {
            field201 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            field202 = null;
        }
        ++field197;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field196 = arg0.method3807(-1);
                        }
                    } else {
                        this.field200 = arg0.method3807(-1);
                    }
                } else {
                    this.field195 = arg0.method3821((byte) 93);
                }
            } else {
                this.field203 = arg0.method3807(-1);
            }
        } else {
            this.field198 = arg0.method3821((byte) -109);
        }
    }
}
