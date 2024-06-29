import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class459 extends class354 {

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    private int field6773 = 0;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    private int field6768 = 0;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    private int field6778 = 0;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "[I")
    public static int[] field6766 = new int[2048];

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "[Z")
    public static boolean[] field6776 = new boolean[100];

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field6781 = 0;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    private int field6765;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    private int field6767;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    private int field6770;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    private int field6771;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            this.method206(-126, (class303) null, 86);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field6778 = (arg1.method1899((byte) -109) << 12) / 100;
                }
            } else {
                this.field6768 = (arg1.method1899((byte) -117) << 12) / 100;
            }
        } else {
            this.field6773 = arg1.method1901(124);
        }
        ++field6774;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
    private final void method2750(int arg0, int arg1, int arg2, int arg3) {
        ++field6764;
        int var5 = -32 / ((arg3 - 3) / 58);
        int var6 = arg2 <= arg1 ? arg1 : arg2;
        int var7 = arg1 <= arg2 ? arg1 : arg2;
        int var8 = var6 < arg0 ? arg0 : var6;
        int var9 = ~var7 >= ~arg0 ? var7 : arg0;
        int var10 = var8 - var9;
        this.field6779 = (var9 - -var8) / 2;
        if (this.field6779 > 0 && ~this.field6779 > -4097) {
            this.field6771 = (var10 << 12) / (~this.field6779 < -2049 ? -(this.field6779 * 2) + 8192 : this.field6779 * 2);
        } else {
            this.field6771 = 0;
        }
        if (~var10 < -1) {
            int var11 = (-arg2 + var8 << 12) / var10;
            int var12 = (-arg1 + var8 << 12) / var10;
            int var13 = (-arg0 + var8 << 12) / var10;
            if (arg2 != var8) {
                if (arg1 != var8) {
                    this.field6767 = arg2 != var9 ? -var11 + 20480 : var12 + 12288;
                } else {
                    this.field6767 = arg0 != var9 ? -var13 + 12288 : var11 + 4096;
                }
            } else {
                this.field6767 = ~arg1 != ~var9 ? 4096 - var12 : 20480 - -var13;
            }
            this.field6767 /= 6;
        } else {
            this.field6767 = 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method2751(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 <= 12) {
            method2753(false, false);
        }
        ++field6772;
        if (arg1 >= 1 && ~arg4 <= -2 && class237.field3436 - 2 >= arg1 && ~arg4 >= ~(class83.field1366 + -2)) {
            int var9 = arg2;
            if (arg2 < 3 && class72.method606(arg1, arg4, (byte) -114)) {
                var9 = arg2 + 1;
            }
            if (!class397.field5830.method1292(class399.field5865, -2) && !class110.method813(-120, arg1, class334.field5132, arg4, var9)) {
                return;
            }
            if (class36.field545 == null) {
                return;
            }
            class227.field3314.method2593(class394.field5821, arg4, arg7, class255.field3679[arg2], arg1, arg2, 25167);
            if (~arg5 <= -1) {
                boolean var10 = class397.field5830.field123;
                class397.field5830.field123 = true;
                class227.field3314.method2601(arg0, arg8, class255.field3679[arg2], true, arg5, arg1, arg4, arg6, arg2, var9, class394.field5821);
                class397.field5830.field123 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
    public static void method2752(byte arg0) {
        field6766 = null;
        field6776 = null;
        if (arg0 != 80) {
            field6769 = 44;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field6782;
        int[][] var3 = super.field5351.method2819((byte) -117, arg1);
        if (arg0 > -40) {
            return null;
        } else {
            if (super.field5351.field6959) {
                int[][] var4 = this.method2291(0, (byte) -106, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class404.field5952 > var11; ++var11) {
                    this.method2750(var7[var11], var6[var11], var5[var11], -92);
                    this.field6779 += this.field6778;
                    this.field6767 += this.field6773;
                    this.field6771 += this.field6768;
                    while (~this.field6767 > -1) {
                        this.field6767 += 4096;
                    }
                    while (~this.field6767 < -4097) {
                        this.field6767 -= 4096;
                    }
                    if (this.field6771 < 0) {
                        this.field6771 = 0;
                    }
                    if (~this.field6779 > -1) {
                        this.field6779 = 0;
                    }
                    if (this.field6771 > 4096) {
                        this.field6771 = 4096;
                    }
                    if (this.field6779 > 4096) {
                        this.field6779 = 4096;
                    }
                    this.method2754((byte) -120, this.field6779, this.field6771, this.field6767);
                    var8[var11] = this.field6765;
                    var9[var11] = this.field6775;
                    var10[var11] = this.field6770;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
    public static final void method2753(boolean arg0, boolean arg1) {
        ++field6780;
        if (arg1) {
            field6777 = 31;
        }
        for (class81 var2 = (class81) class278.field4007.method2257((byte) 126); var2 != null; var2 = (class81) class278.field4007.method2256(37)) {
            if (var2.field1337 != null) {
                class124.field1920.method232(var2.field1337);
                var2.field1337 = null;
            }
            if (var2.field1329 != null) {
                class124.field1920.method232(var2.field1329);
                var2.field1329 = null;
            }
            var2.method2663(-109);
        }
        if (arg0) {
            for (class81 var3 = (class81) class11.field192.method2257((byte) 113); var3 != null; var3 = (class81) class11.field192.method2256(-73)) {
                if (var3.field1337 != null) {
                    class124.field1920.method232(var3.field1337);
                    var3.field1337 = null;
                }
                var3.method2663(-121);
            }
            for (class81 var4 = (class81) class351.field5333.method2483(-57); var4 != null; var4 = (class81) class351.field5333.method2481((byte) -27)) {
                if (var4.field1337 != null) {
                    class124.field1920.method232(var4.field1337);
                    var4.field1337 = null;
                }
                var4.method2663(-121);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class459() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIII)V")
    private final void method2754(byte arg0, int arg1, int arg2, int arg3) {
        ++field6763;
        if (arg0 == -120) {
            int var5 = ~arg1 >= -2049 ? (arg2 + 4096) * arg1 >> 12 : arg1 + arg2 + -(arg1 * arg2 >> 12);
            if (var5 <= 0) {
                this.field6765 = this.field6775 = this.field6770 = arg1;
            } else {
                int var6 = arg3 * 6;
                int var7 = arg1 - -arg1 - var5;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 != -4) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field6765 = var5;
                                        this.field6775 = var7;
                                        this.field6770 = var15;
                                    }
                                } else {
                                    this.field6770 = var5;
                                    this.field6765 = var14;
                                    this.field6775 = var7;
                                }
                            } else {
                                this.field6770 = var5;
                                this.field6775 = var15;
                                this.field6765 = var7;
                            }
                        } else {
                            this.field6765 = var7;
                            this.field6770 = var14;
                            this.field6775 = var5;
                        }
                    } else {
                        this.field6775 = var5;
                        this.field6770 = var7;
                        this.field6765 = var15;
                    }
                } else {
                    this.field6770 = var7;
                    this.field6765 = var5;
                    this.field6775 = var14;
                }
            }
        }
    }
}
