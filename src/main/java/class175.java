import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class175 extends class139 {

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    private int field3511 = 0;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    private int field3515 = 0;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    private int field3509 = 16;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "I")
    private int field3526 = 2000;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    private int field3521 = 4096;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Lrf;")
    public static class163 field3510 = class53.method392(63, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lrf;")
    public static class163 field3516 = class53.method392(-109, "blinken1:");

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "Lrf;")
    public static class163 field3520 = class53.method392(-128, ": ");

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "Lrf;")
    public static class163 field3524 = class53.method392(-86, "leuchten2:");

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lrf;")
    public static class163 field3514 = class53.method392(-93, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "Lrf;")
    private static class163 field3522 = class53.method392(91, "New User");

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "Lrf;")
    public static class163 field3525 = field3522;

    @OriginalMember(owner = "client!t", name = "nb", descriptor = "Log;")
    public static class137 field3528 = new class137();

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "Lue;")
    public static class189 field3517;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3512;
        int[] var3 = super.field2859.method1319(arg1 ^ -7542, arg0);
        if (arg1 != 7451) {
            this.field3521 = -124;
        }
        if (super.field2859.field3966) {
            int var4 = this.field3521 >> 1;
            int[][] var5 = super.field2859.method1317(-118);
            Random var6 = new Random((long) this.field3511);
            for (int var7 = 0; var7 < this.field3526; ++var7) {
                int var8 = this.field3521 > 0 ? this.field3515 - var4 - -class170.method1149(true, this.field3521, var6) : this.field3515;
                int var9 = (var8 & 4082) >> 4;
                int var10 = class170.method1149(true, class23.field402, var6);
                int var11 = class170.method1149(true, class205.field4008, var6);
                int var12 = (class210.field4094[var9] * this.field3509 >> 12) + var10;
                int var13 = -var10 + var12;
                int var14 = (class162.field3266[var9] * this.field3509 >> 12) + var11;
                int var15 = var14 - var11;
                if (~var13 != -1 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    boolean var16 = ~var13 > ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var12 = var14;
                        var10 = var11;
                        var14 = var18;
                        var11 = var17;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var14;
                        var12 = var19;
                        var14 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var14;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = 2048 / var22;
                    int var25 = -(class170.method1149(true, 4096, var6) >> 2) + 1024;
                    int var26 = -var22 / 2;
                    int var27 = ~var14 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        var26 += var23;
                        int var29 = (var28 - var10) * var24 + 1024 + var25;
                        int var30 = var21 & class15.field260;
                        int var31 = class29.field542 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var26 < -1) {
                            var21 += var27;
                            var26 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3) {
        ++field3527;
        if (~class197.field3920 != arg0 && arg3 != 0 && class95.field2033 < 50 && arg1 != -1) {
            class16.field274[class95.field2033] = arg1;
            client.field599[class95.field2033] = arg3;
            class188.field3746[class95.field2033] = arg2;
            class13.field247[class95.field2033] = null;
            class202.field3988[class95.field2033] = 0;
            ++class95.field2033;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILg;)V")
    public static final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4, class61 arg5) {
        ++field3513;
        class62 var6 = new class62();
        var6.field1309 = arg5.field1241;
        var6.field1303 = arg5.field1245;
        var6.field1322 = arg1;
        var6.field1301 = arg4 * 128;
        var6.field1312 = arg5.field1300;
        var6.field1307 = arg3 * 128;
        var6.field1310 = arg5.field1295;
        int var7 = arg5.field1250;
        var6.field1316 = arg5.field1290 * 128;
        int var8 = arg5.field1257;
        if (arg0 == 1 || ~arg0 == -4) {
            var8 = arg5.field1250;
            var7 = arg5.field1257;
        }
        var6.field1304 = (arg3 + var8) * 128;
        var6.field1321 = (arg4 + var7) * 128;
        if (arg2 > -85) {
            method1188();
        }
        if (arg5.field1246 != null) {
            var6.field1319 = arg5;
            var6.method452(200);
        }
        class140.field2888.method51(0, var6);
        if (var6.field1303 != null) {
            var6.field1317 = var6.field1310 - -((int) ((double) (-var6.field1310 + var6.field1309) * Math.random()));
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIII)I")
    public static final int method1186(int arg0, int arg1, int arg2, int arg3) {
        ++field3523;
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (~var5 <= -1 && ~var4 <= -1 && var5 <= 103 && ~var4 >= -104) {
            int var6 = arg1;
            int var7 = arg0 & 127;
            int var8 = arg2 & 127;
            if (~arg1 > -4 && (class21.field372[1][var5][var4] & 2) == 2) {
                var6 = arg1 + 1;
            }
            int var9 = (-var7 + 128) * class154.field3199[var6][var5][var4] + class154.field3199[var6][arg3 + var5][var4] * var7 >> 7;
            int var10 = (-var7 + 128) * class154.field3199[var6][var5][var4 + 1] + class154.field3199[var6][var5 - -1][var4 + 1] * var7 >> 7;
            return (-var8 + 128) * var9 + var8 * var10 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V")
    public static void method1187(boolean arg0) {
        field3516 = null;
        field3520 = null;
        field3528 = null;
        field3525 = null;
        field3517 = null;
        if (arg0) {
            field3524 = null;
        }
        field3524 = null;
        field3514 = null;
        field3522 = null;
        field3510 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static final void method1188() {
        for (int var0 = 0; var0 < class150.field3102; ++var0) {
            class121 var1 = class21.field375[var0];
            class167.method1135(var1);
            class21.field375[var0] = null;
        }
        class150.field3102 = 0;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field3508;
        class137.method901(false);
        if (arg0 != 0) {
            field3510 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Z")
    public static final boolean method1189(int arg0, byte arg1) {
        ++field3519;
        if (arg1 != -66) {
            field3522 = null;
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field3521 = arg2.method390((byte) 117);
                        }
                    } else {
                        this.field3515 = arg2.method390((byte) 118);
                    }
                } else {
                    this.field3509 = arg2.method344(255);
                }
            } else {
                this.field3526 = arg2.method390((byte) 126);
            }
        } else {
            this.field3511 = arg2.method344(255);
        }
        ++field3518;
        if (arg1 != 21) {
            this.method127(8);
        }
    }
}
