import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 extends class13 {

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field1245 = 0;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    private int field1236 = 4096;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    private int field1243 = 0;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    private int field1234 = 16;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    private int field1240 = 2000;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "[Lsg;")
    public static class226[] field1241;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public static void method625(int arg0) {
        if (arg0 == 11767) {
            field1241 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field1237;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field1236 = arg0.method174(255);
                        }
                    } else {
                        this.field1245 = arg0.method174(255);
                    }
                } else {
                    this.field1234 = arg0.method172((byte) 52);
                }
            } else {
                this.field1240 = arg0.method174(255);
            }
        } else {
            this.field1243 = arg0.method172((byte) 52);
        }
        if (arg1 <= 50) {
            field1239 = -21;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        ++field1242;
        int var1 = 0;
        if (arg0 >= -8) {
            method628(-96, 37, 33);
        }
        while (~class222.field3099.length < ~var1) {
            for (int var2 = 0; ~var2 > ~class222.field3099[var1].length; ++var2) {
                class222.field3099[var1][var2] = class268.field3733;
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field1235;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = this.field1236 >> 1;
            int[][] var5 = super.field263.method896(-115);
            Random var6 = new Random((long) this.field1243);
            for (int var7 = 0; ~var7 > ~this.field1240; ++var7) {
                int var8 = ~this.field1236 < -1 ? this.field1245 + -var4 + class26.method299(this.field1236, (byte) -98, var6) : this.field1245;
                int var9 = 255 & var8 >> 4;
                int var10 = class26.method299(class269.field3751, (byte) 97, var6);
                int var11 = class26.method299(class413.field5862, (byte) -25, var6);
                int var12 = (class33.field521[var9] * this.field1234 >> 12) + var10;
                int var13 = (class139.field1995[var9] * this.field1234 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class26.method299(4096, (byte) -54, var6) >> 2) + 1024;
                    int var27 = var11 >= var13 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class343.field4677 & var28;
                        int var31 = var21 & class123.field1710;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            this.method29(true, -45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public static final void method627(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == -1) {
            if (arg1 >= class154.field2161 && ~class233.field3350 <= ~arg1) {
                int var5 = class302.method1951(class290.field4058, 0, arg0, class442.field6212);
                int var6 = class302.method1951(class290.field4058, 0, arg4, class442.field6212);
                class440.method2759(arg1, var5, var6, arg3, (byte) 62);
            }
            ++field1246;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field1247;
        class282.method1845(-90);
        int var2 = -58 % ((arg0 - 2) / 51);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
    public static final void method628(int arg0, int arg1, int arg2) {
        ++field1238;
        if (arg2 < -38) {
            class34.field532[arg0] = arg1;
            class75 var3 = (class75) class361.field4987.method886((long) arg0, 25651);
            if (var3 != null) {
                if (~var3.field1071 != -4611686018427387906L) {
                    var3.field1071 = 4611686018427387904L | class385.method2442(-6631) + 500L;
                    return;
                }
            } else {
                class75 var4 = new class75(4611686018427387905L);
                class361.field4987.method883((byte) -54, (long) arg0, var4);
            }
        }
    }
}
