import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class318 extends class143 implements class265 {

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "B")
    private byte field4519;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "B")
    private byte field4523;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "S")
    private short field4505;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "B")
    private byte field4520;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Z")
    private boolean field4499;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "Z")
    private boolean field4514;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Z")
    private boolean field4500;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "Lmj;")
    private class393 field4515;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "Llg;")
    private class238 field4511;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field4509 = 1;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[B")
    public static byte[] field4501 = new byte[32896];

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field4526;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Lra;")
    public static class57 field4502;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "[[I")
    public static int[][] field4522;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Len;IZB)Lgi;")
    private final class403 method1974(class174 arg0, int arg1, boolean arg2, byte arg3) {
        ++field4516;
        class327 var5 = class157.method1036(0, this.field4505 & 65535);
        if (arg3 > -123) {
            return null;
        } else {
            class319 var6;
            class319 var7;
            if (!this.field4499) {
                if (this.field4523 >= 3) {
                    var6 = null;
                } else {
                    var6 = class78.field887[this.field4523 + 1];
                }
                var7 = class78.field887[this.field4523];
            } else {
                var6 = class78.field887[0];
                var7 = class111.field1285[this.field4523];
            }
            return var5.method2015(super.field2015, var6, this.field4519, this.field4520, arg2, super.field2018, arg1, arg0, 125, var7, super.field2021);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
    public final int method214(int arg0) {
        ++field4521;
        if (arg0 >= -95) {
            this.method212((byte) -89, (class174) null);
        }
        return this.field4519;
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V")
    public static void method1975(int arg0) {
        field4501 = null;
        int var1 = -10 / ((-32 - arg0) / 60);
        field4522 = null;
        field4526 = null;
        field4502 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLen;)V")
    public final void method212(byte arg0, class174 arg1) {
        ++field4506;
        if (arg0 < -29) {
            Object var3 = null;
            class238 var5;
            if (this.field4511 == null && this.field4500) {
                class403 var4 = this.method1974(arg1, 131072, true, (byte) -126);
                var5 = var4 == null ? null : var4.field5879;
            } else {
                var5 = this.field4511;
                this.field4511 = null;
            }
            if (var5 != null) {
                class190.method1219(var5, this.field4523, super.field2018, super.field2021, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Len;II)Lmj;")
    private final class393 method1976(class174 arg0, int arg1, int arg2) {
        if (arg1 != -29078) {
            this.method211((class174) null, -76);
        }
        ++field4518;
        if (this.field4515 != null && arg0.method1016(this.field4515.method720(), arg2) == 0) {
            return this.field4515;
        } else {
            class403 var4 = this.method1974(arg0, arg2, false, (byte) -125);
            return var4 == null ? null : var4.field5880;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V")
    public static final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4524;
        if (arg1 == 17777) {
            for (int var6 = arg2; var6 <= arg4; ++var6) {
                class105.method564(arg5, arg0, 0, field4522[var6], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)I")
    public final int method431(int arg0) {
        ++field4512;
        if (arg0 <= 23) {
            this.field4520 = -33;
        }
        return this.field4515 != null ? this.field4515.method731() : 0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        if (arg1 == 0) {
            ++field4513;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILen;)Lmj;")
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            this.field4499 = true;
        }
        ++field4525;
        return this.method1976(arg2, -29078, arg1);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Len;Lnl;IIIIZIIIII)V")
    public class318(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class264.method1689(-15406, arg10, arg11));
        this.field4519 = (byte) arg11;
        this.field4523 = (byte) arg2;
        this.field4505 = (short) arg1.field4592;
        this.field4520 = (byte) arg10;
        this.field4499 = arg6;
        super.field2018 = (short) arg3;
        super.field2021 = (short) arg5;
        this.field4514 = ~arg1.field4677 != -1;
        this.field4500 = arg0.method963() && arg1.field4625 && !this.field4499 && ~class341.field5022 != -1;
        class403 var13 = this.method1974(arg0, 1024, this.field4500, (byte) -124);
        if (var13 != null) {
            this.field4515 = var13.field5880;
            this.field4511 = var13.field5879;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Len;B)V")
    public final void method226(class174 arg0, byte arg1) {
        ++field4517;
        Object var3 = null;
        class238 var5;
        if (this.field4511 == null && this.field4500) {
            class403 var4 = this.method1974(arg0, 131072, true, (byte) -125);
            var5 = var4 != null ? var4.field5879 : null;
        } else {
            var5 = this.field4511;
            this.field4511 = null;
        }
        if (var5 != null) {
            class148.method880(var5, this.field4523, super.field2018, super.field2021, (boolean[]) null);
        }
        if (arg1 < 88) {
            this.method215(-82);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field4498;
        class393 var5 = this.method1976(arg3, -29078, 65536);
        if (!arg2) {
            this.method1976((class174) null, -58, -28);
        }
        if (var5 != null) {
            class71 var6 = arg3.method1015();
            var6.method123(super.field2018, super.field2015, super.field2021);
            return var5.method724(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        ++field4510;
        if (arg0 > -92) {
            this.method212((byte) 108, (class174) null);
        }
        return this.field4500;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field4508;
        if (this.field4515 == null) {
            return null;
        } else {
            class71 var3 = arg1.method1015();
            if (arg0 > -5) {
                this.field4499 = true;
            }
            var3.method123(super.field2030 + super.field2018, super.field2015, super.field2021 - -super.field2025);
            class19 var4 = null;
            if (this.field4514) {
                var4 = class358.method2286(true, 1);
            }
            this.field4515.method775(var3, var4 != null ? var4.field197[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
    public final int method225(int arg0) {
        if (arg0 < 66) {
            this.field4515 = null;
        }
        ++field4504;
        return this.field4505 & 65535;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
    public final int method210(int arg0) {
        if (arg0 != -23890) {
            this.field4511 = null;
        }
        ++field4507;
        return this.field4520;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public final void method207(byte arg0) {
        if (arg0 != 111) {
            this.method214(65);
        }
        ++field4503;
        if (this.field4515 != null) {
            this.field4515.method752();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field4501[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4526 = null;
    }
}
