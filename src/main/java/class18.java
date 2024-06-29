import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class18 extends class182 {

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
    public boolean field513 = false;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Lui;")
    private class228 field515;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Z")
    private boolean field514;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Z")
    private boolean field510;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Leg;")
    public static class52 field511 = new class52(5000);

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Lkh;")
    public static class117 field520 = class224.method1450((byte) 111, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "Lkh;")
    private static class117 field525 = class224.method1450((byte) 105, " from your friend list first)3");

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "Lkh;")
    public static class117 field524 = field525;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "[Lfa;")
    public static class57[] field526 = new class57[100];

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "J")
    public static volatile long field527 = 0L;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "Lkh;")
    public static class117 field531 = class224.method1450((byte) -80, ")1j");

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Ldb;")
    public static class36 field523 = new class36();

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "F")
    private float field519;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "Lai;")
    public static class10 field529;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
    private int[] field509;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lic;Lai;B)Z")
    public final boolean method168(class91 arg0, class10 arg1, byte arg2) {
        if (arg2 != -68) {
            this.method169(false, -6, null, null);
        }
        field521++;
        return this.field515.method1477(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILic;Lai;)[I")
    public final int[] method169(boolean arg0, int arg1, class91 arg2, class10 arg3) {
        if (arg1 != 128) {
            return null;
        }
        field532++;
        if (this.field515.method1477(arg2, 0, arg3)) {
            int var5 = arg0 ? 64 : 128;
            return this.field515.method1475(this.field510, arg2, 113, var5, 1.0D, var5, false, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method170(int arg0) {
        if (arg0 > -67) {
            return;
        }
        for (int var1 = -1; var1 < class229.field4121; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class139.field2539[var1];
            }
            class56 var3 = class43.field950[var2];
            if (var3 != null) {
                class32.method281(var3, var3.field4256, -752);
            }
        }
        field517++;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static void method171(int arg0) {
        field525 = null;
        field520 = null;
        field531 = null;
        field529 = null;
        field526 = null;
        field511 = null;
        field523 = null;
        if (arg0 != -6841) {
            field527 = 12L;
        }
        field524 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZFLic;Lai;I)[I")
    public final int[] method172(boolean arg0, float arg1, class91 arg2, class10 arg3, int arg4) {
        field518++;
        if (this.field509 == null || this.field519 != arg1) {
            if (!this.field515.method1477(arg2, 0, arg3)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field509 = this.field515.method1475(this.field510, arg2, 116, var6, (double) arg1, var6, true, arg3);
            this.field519 = arg1;
            if (this.field514) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6 * var6;
                int var14 = var6 - 1;
                int var15 = var6;
                int var16 = var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var17; var34 >= 0; var34--) {
                        var15--;
                        int var35 = this.field509[var15];
                        var7[var34] += class209.method1370(255, var35 >> 16);
                        var8[var34] += class209.method1370(65480, var35) >> 8;
                        var9[var34] += class209.method1370(var35, 255);
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                int var19 = var13;
                for (int var20 = var14; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    for (int var25 = 2; var25 >= 0; var25--) {
                        var24--;
                        var23 += var7[var24];
                        var21 += var8[var24];
                        var22 += var9[var24];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    int var26 = 1;
                    for (int var27 = var17; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        int var32 = var21 / 9;
                        var26--;
                        int var33 = var23 / 9;
                        var19--;
                        var10[var19] = class40.method352(var31, class40.method352(var32 << 8, var33 << 16));
                        var24--;
                        var21 += var8[var24] - var8[var26];
                        var23 += var7[var24] - var7[var26];
                        var22 += var9[var24] - var9[var26];
                        if (var26 == 0) {
                            var26 = var12;
                        }
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var28 = var17; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field509[var15];
                        var16--;
                        int var30 = this.field509[var16];
                        var7[var28] += class209.method1370(var29 >> 16, 255) - class209.method1370(var30 >> 16, 255);
                        var8[var28] += -class209.method1370(var30 >> 8, 255) + class209.method1370(255, var29 >> 8);
                        var9[var28] += class209.method1370(var29, 255) - class209.method1370(var30, 255);
                    }
                    if (var16 == 0) {
                        var16 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field509 = var10;
            }
        }
        if (arg4 > -40) {
            this.field514 = false;
        }
        return this.field509;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    public final void method173(boolean arg0, int arg1) {
        field522++;
        if (this.field509 == null) {
            return;
        }
        if (this.field512 != 0 || this.field528 != 0) {
            if (class42.field940 == null || class42.field940.length < this.field509.length) {
                class42.field940 = new int[this.field509.length];
            }
            int var3 = this.field509.length == 4096 ? 64 : 128;
            int var4 = this.field509.length;
            int var5 = this.field528 * arg1;
            int var6 = var3 - 1;
            int var7 = var4 - 1;
            int var8 = this.field512 * var3 * arg1;
            for (int var9 = 0; var9 < var4; var9 += var3) {
                int var11 = var7 & var8 + var9;
                for (int var12 = 0; var12 < var3; var12++) {
                    int var13 = (var6 & var12 + var5) + var11;
                    int var14 = var9 + var12;
                    class42.field940[var14] = this.field509[var13];
                }
            }
            int[] var10 = this.field509;
            this.field509 = class42.field940;
            class42.field940 = var10;
        }
        if (arg0) {
            this.field509 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field516++;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnc;)V")
    public class18(class145 arg0) {
        this.field515 = new class228(arg0);
        this.field514 = arg0.method998(92) == 1;
        this.field510 = arg0.method998(71) == 1;
        arg0.method998(59);
        arg0.method998(90);
        int var2 = arg0.method998(79) & 0x3;
        this.field528 = arg0.method994((byte) 119);
        this.field512 = arg0.method994((byte) 67);
        arg0.method998(87);
        arg0.method998(66);
    }
}
