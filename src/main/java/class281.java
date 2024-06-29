import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class281 extends class223 {

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    private int field4435 = 12288;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    private int field4436 = 0;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    private int field4444 = 0;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    private int field4446 = 2048;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    private int field4448 = 2048;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    private int field4445 = 8192;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    private int field4440 = 4096;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "[I")
    public static int[] field4437 = new int[100];

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4438 = "Walk here";

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lnf;")
    public static class162 field4433 = new class162(64);

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field4443;
        class298.method2000((byte) -109);
        if (arg0 != 500) {
            this.field4444 = 114;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lgm;Z)V")
    public static final void method1901(class221 arg0, boolean arg1) {
        ++field4447;
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3375 == 0) {
            var2 = class254.method1722(arg0.field3374, arg0.field3376, arg0.field3372);
        }
        if (arg0.field3375 == 1) {
            var2 = class47.method400(arg0.field3374, arg0.field3376, arg0.field3372);
        }
        if (arg0.field3375 == 2) {
            var2 = class104.method793(arg0.field3374, arg0.field3376, arg0.field3372);
        }
        if (~arg0.field3375 == -4) {
            var2 = class183.method1310(arg0.field3374, arg0.field3376, arg0.field3372);
        }
        int var6 = -1;
        if (~var2 != -1L) {
            var4 = (513543 & (int) var2) >> 14;
            var6 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var5 = ((int) var2 & 3245439) >> 20;
        }
        if (arg1) {
            method1904(72);
        }
        arg0.field3379 = var4;
        arg0.field3384 = var5;
        arg0.field3373 = var6;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)Z")
    private final boolean method1902(int arg0, byte arg1, int arg2) {
        if (arg1 >= -50) {
            this.field4440 = 30;
        }
        ++field4439;
        int var4 = (arg0 + arg2) * this.field4435 >> 12;
        int var5 = class214.field3290[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4435;
        int var7 = (var6 << 12) / this.field4445;
        int var8 = this.field4440 * var7 >> 12;
        return -arg2 + arg0 < var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZI)I")
    public static final int method1903(int arg0, int arg1, boolean arg2, int arg3) {
        ++field4441;
        class198 var4 = (class198) class94.field1480.method2043((long) arg1, -1);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg0; var4.field3086.length > var6; ++var6) {
                if (~var4.field3086[var6] <= -1 && ~class159.field2373 < ~var4.field3086[var6]) {
                    class179 var7 = class123.method929(22497, var4.field3086[var6]);
                    if (var7.field2740 != null) {
                        class283 var8 = (class283) var7.field2740.method2043((long) arg3, -1);
                        if (var8 != null) {
                            if (!arg2) {
                                var5 += var8.field4457;
                            } else {
                                var5 += var4.field3078[var6] * var8.field4457;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public static final void method1904(int arg0) {
        ++field4442;
        if (arg0 != 4096) {
            method1906(-117);
        }
        if (class112.field1721 != -1) {
            class164.method1186(class112.field1721, 0, -1, -1);
            class112.field1721 = -1;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)Z")
    private final boolean method1905(int arg0, int arg1, int arg2) {
        ++field4449;
        int var4 = (-arg2 + arg1) * this.field4435 >> 12;
        int var5 = class214.field3290[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4435;
        int var7 = (var6 << 12) / this.field4445;
        if (arg0 < 77) {
            this.field4444 = -78;
        }
        int var8 = this.field4440 * var7 >> 12;
        return ~(arg1 + arg2) > ~var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4433 = null;
        field4438 = null;
        if (arg0 != 319340268) {
            method1906(-82);
        }
        field4437 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field4434;
        if (arg2 != 102) {
            this.method40((byte) 60, -85);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field4445 = arg0.method260((byte) -67);
                                }
                            } else {
                                this.field4440 = arg0.method260((byte) -67);
                            }
                        } else {
                            this.field4435 = arg0.method260((byte) -67);
                        }
                    } else {
                        this.field4446 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field4436 = arg0.method260((byte) -67);
                }
            } else {
                this.field4444 = arg0.method260((byte) -67);
            }
        } else {
            this.field4448 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            this.field4448 = 19;
        }
        ++field4450;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = class307.field4925[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class250.field4008; ++var5) {
                int var6 = class106.field1662[var5] + -2048;
                int var7 = this.field4448 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field4444 + var4;
                int var10 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var11 = this.field4436 + var6;
                int var12 = ~var9 <= 2047 ? var9 : var9 - -4096;
                int var13 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var14 = var12 > 2048 ? var12 + -4096 : var12;
                int var15 = this.field4446 + var4;
                int var16 = ~var13 >= -2049 ? var13 : var13 + -4096;
                int var17 = ~var15 <= 2047 ? var15 : var15 + 4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method1905(92, var14, var10) && !this.method1902(var18, (byte) -65, var16) ? 0 : 4096;
            }
        }
        return var3;
    }
}
