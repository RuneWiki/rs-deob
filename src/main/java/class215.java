import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class215 extends class222 {

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    private int field3654 = 3216;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    private int field3657 = 4096;

    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "[I")
    private int[] field3662 = new int[3];

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    private int field3660 = 3216;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "Lsb;")
    public static class98 field3655 = class47.method368("document)3cookie=(R", 0);

    @OriginalMember(owner = "client!cf", name = "hb", descriptor = "Lsb;")
    public static class98 field3663 = class47.method368(" )2> <col=00ffff>", 0);

    @OriginalMember(owner = "client!cf", name = "kb", descriptor = "I")
    public static int field3666 = 100;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!cf", name = "ib", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!cf", name = "jb", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!cf", name = "lb", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!cf", name = "mb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!cf", name = "nb", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!cf", name = "ob", descriptor = "[[[Lp;")
    public static class71[][][] field3670;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILtg;II)[Lkb;")
    public static final class247[] method1430(int arg0, class75 arg1, int arg2, int arg3) {
        ++field3658;
        if (!class43.method341(arg1, arg0 + -9894, arg3, arg2)) {
            return null;
        } else {
            if (arg0 != 9893) {
                field3663 = null;
            }
            return class207.method1398(arg0 + -9845);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)Lwd;")
    public static final class93 method1431(int arg0, int arg1) {
        ++field3661;
        class93 var2 = (class93) class75.field1324.method1564((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class181.field3124.method571(16, arg1, -72);
            class93 var4 = new class93();
            if (var3 != null) {
                var4.method684((byte) -111, new class216(var3));
            }
            class75.field1324.method1563((long) arg1, 21771, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        this.method1436(-1);
        ++field3667;
        int var2 = -67 % ((57 - arg0) / 51);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLkh;Ljava/lang/Object;)V")
    public static final void method1432(boolean arg0, class5 arg1, Object arg2) {
        ++field3653;
        if (arg1.field64 != null) {
            if (!arg0) {
                field3670 = null;
            }
            for (int var3 = 0; ~var3 > -51 && arg1.field64.peekEvent() != null; ++var3) {
                class234.method1603(1L, -116);
            }
            if (arg2 != null) {
                arg1.field64.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB[Lq;)V")
    public static final void method1433(int arg0, byte arg1, class148[] arg2) {
        ++field3659;
        for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
            class148 var4 = arg2[var3];
            if (var4 != null && ~var4.field2650 == ~arg0 && (!var4.field2619 || !client.method762(var4))) {
                if (var4.field2665 == 0) {
                    if (!var4.field2619 && client.method762(var4) && class98.field1674 != var4) {
                        continue;
                    }
                    method1433(var4.field2728, (byte) -117, arg2);
                    if (var4.field2751 != null) {
                        method1433(var4.field2728, (byte) -80, var4.field2751);
                    }
                    class34 var5 = (class34) class243.field4209.method1511((byte) -128, (long) var4.field2728);
                    if (var5 != null) {
                        class132.method995(var5.field596, (byte) -124);
                    }
                }
                if (var4.field2665 == 6) {
                    if (var4.field2629 != -1 || var4.field2617 != -1) {
                        boolean var6 = class263.method1796(72, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field2629;
                        } else {
                            var7 = var4.field2617;
                        }
                        if (var7 != -1) {
                            class138 var8 = class16.method144(1, var7);
                            if (var8 != null) {
                                var4.field2679 += class199.field3418;
                                while (var8.field2439[var4.field2633] < var4.field2679) {
                                    var4.field2679 -= var8.field2439[var4.field2633];
                                    ++var4.field2633;
                                    if (~var4.field2633 <= ~var8.field2454.length) {
                                        var4.field2633 -= var8.field2458;
                                        if (~var4.field2633 > -1 || ~var8.field2454.length >= ~var4.field2633) {
                                            var4.field2633 = 0;
                                        }
                                    }
                                    class72.method512(var4, 2);
                                }
                            }
                        }
                    }
                    if (var4.field2604 != 0 && !var4.field2619) {
                        int var9 = var4.field2604 >> 16;
                        int var10 = class199.field3418 * var9;
                        int var11 = var4.field2604 << 16 >> 16;
                        int var12 = class199.field3418 * var11;
                        var4.field2631 = var4.field2631 + var12 & 2047;
                        var4.field2608 = 2047 & var4.field2608 + var10;
                        class72.method512(var4, 2);
                    }
                }
            }
        }
        if (arg1 >= -55) {
            method1430(-73, (class75) null, -89, 97);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(II)V")
    public static final void method1434(int arg0, int arg1) {
        if (arg1 != 1) {
            field3666 = -82;
        }
        class106.field1882.method1561(-72, arg0);
        class6.field89.method1561(-127, arg0);
        ++field3668;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method7((byte) 8, 71);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3660 = arg0.method1487(21);
                }
            } else {
                this.field3654 = arg0.method1487(21);
            }
        } else {
            this.field3657 = arg0.method1487(44);
        }
        ++field3665;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field3655 = null;
        if (arg0 >= -76) {
            field3666 = 8;
        }
        field3670 = null;
        field3663 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field3844.method22(0, arg1);
        if (arg0 <= 35) {
            return null;
        } else {
            if (super.field3844.field61) {
                int var4 = class191.field3309 * this.field3657 >> 12;
                int[] var5 = this.method1537((byte) 98, 0, arg1 + -1 & class191.field3299);
                int[] var6 = this.method1537((byte) 61, 0, arg1);
                int[] var7 = this.method1537((byte) 98, 0, arg1 - -1 & class191.field3299);
                for (int var8 = 0; var8 < class13.field253; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class162.field2924] + -var6[var8 + 1 & class162.field2924]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class137.field2418[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = this.field3662[2] * var14 >> 12;
                    int var17 = var9 * var13 >> 8;
                    int var18 = this.field3662[1] * var17 >> 12;
                    int var19 = this.field3662[0] * var15 >> 12;
                    var3[var8] = var19 - -var18 - -var16;
                }
            }
            ++field3664;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class215() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
    private final void method1436(int arg0) {
        ++field3656;
        double var2 = Math.cos((double) ((float) this.field3660 / 4096.0F));
        this.field3662[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3654 / 4096.0F)) * var2);
        this.field3662[1] = (int) (var2 * Math.cos((double) ((float) this.field3654 / 4096.0F)) * 4096.0D);
        this.field3662[2] = (int) (Math.sin((double) ((float) this.field3660 / 4096.0F)) * 4096.0D);
        int var4 = this.field3662[0] * this.field3662[0] >> 12;
        int var5 = this.field3662[1] * this.field3662[1] >> 12;
        int var6 = this.field3662[2] * this.field3662[2] >> 12;
        if (arg0 != -1) {
            field3666 = -5;
        }
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3662[0] = (this.field3662[0] << 12) / var7;
            this.field3662[1] = (this.field3662[1] << 12) / var7;
            this.field3662[2] = (this.field3662[2] << 12) / var7;
        }
    }
}
