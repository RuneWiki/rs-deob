import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class456 extends class431 implements class338 {

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "B")
    private byte field6280;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Z")
    private boolean field6291;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
    private boolean field6294;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "B")
    private byte field6286;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Z")
    private boolean field6272;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "S")
    private short field6289;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
    private boolean field6288;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lj;")
    private class377 field6285;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lc;")
    private class121 field6281;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "[I")
    public static int[] field6275 = new int[100];

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[S")
    public static short[] field6287 = new short[256];

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.field6288 = true;
        }
        ++field6268;
        return this.field6272;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        ++field6278;
        if (arg0 != -87) {
            method2601(-42);
        }
        return this.field6289 & 65535;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public static void method2601(int arg0) {
        field6275 = null;
        if (arg0 != -27982) {
            field6275 = null;
        }
        field6287 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field6282;
        class121 var5 = this.method2602(131072, arg0, arg2);
        if (var5 != null) {
            class414 var6 = arg2.method611();
            var6.method971(super.field5892, super.field5894, super.field5893);
            return var5.method847(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        ++field6276;
        if (arg0 != -4534) {
            this.field6294 = true;
        }
        return this.field6280;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        if (arg0 >= -8) {
            return false;
        } else {
            ++field6277;
            return this.field6288;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        if (arg0 != -1736) {
            this.method340((class162) null, 80);
        }
        ++field6267;
        return 22;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        ++field6279;
        Object var3 = null;
        class377 var5;
        if (this.field6285 == null && this.field6288) {
            class208 var4 = this.method2603(arg0, arg1 ^ 20174, true, 262144);
            var5 = var4 == null ? null : var4.field2862;
        } else {
            var5 = this.field6285;
            this.field6285 = null;
        }
        if (var5 != null) {
            class238.method1477(var5, this.field6286, super.field5892, super.field5893, (boolean[]) null);
        }
        if (arg1 != 20203) {
            this.field6289 = -97;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            field6275 = null;
        }
        if (arg3 instanceof class456) {
            class456 var8 = (class456) arg3;
            if (this.field6281 != null && var8.field6281 != null) {
                this.field6281.method848(var8.field6281, arg4, arg1, arg5, arg6);
            }
        }
        ++field6274;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILqa;)Lc;")
    private final class121 method2602(int arg0, int arg1, class162 arg2) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field6283;
            if (this.field6281 != null && ~arg2.method564(this.field6281.method854(), arg0) == -1) {
                return this.field6281;
            } else {
                class208 var4 = this.method2603(arg2, arg1 ^ -92, false, arg0);
                return var4 != null ? var4.field2861 : null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqa;IZI)Len;")
    private final class208 method2603(class162 arg0, int arg1, boolean arg2, int arg3) {
        int var5 = -42 % ((arg1 - -12) / 33);
        ++field6292;
        class1 var6 = class402.field5388.method1994(-17294, this.field6289 & 65535);
        class35 var7;
        class35 var8;
        if (this.field6294) {
            var7 = class37.field582[this.field6286];
            var8 = class209.field2868[0];
        } else {
            if (~this.field6286 > -4) {
                var8 = class209.field2868[this.field6286 + 1];
            } else {
                var8 = null;
            }
            var7 = class209.field2868[this.field6286];
        }
        return var6.method19(arg2, 22, arg0, super.field5893, var7, arg3, 81, var8, super.field5892, this.field6280, super.field5894);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lqa;Lus;IIIIZIZ)V")
    public class456(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field17, arg1.field4);
        super.field5893 = arg5;
        this.field6280 = (byte) arg7;
        this.field6291 = ~arg1.field83 != -1 && !arg6;
        super.field5892 = arg3;
        this.field6294 = arg6;
        this.field6286 = (byte) arg2;
        this.field6272 = arg8;
        this.field6289 = (short) arg1.field33;
        this.field6288 = arg0.method557() && arg1.field71 && !this.field6294 && ~class154.field2244.method3089((byte) 101, class166.field2414) != -1;
        int var10 = 2048;
        if (this.field6272) {
            var10 |= 65536;
        }
        class208 var11 = this.method2603(arg0, -109, this.field6288, var10);
        if (var11 != null) {
            this.field6285 = var11.field2862;
            this.field6281 = var11.field2861;
            if (this.field6272) {
                this.field6281 = this.field6281.method863((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            return null;
        } else {
            ++field6295;
            return this.method2602(arg2, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        ++field6270;
        this.field6272 = false;
        if (this.field6281 != null) {
            this.field6281.method860(-65537 & this.field6281.method854());
        }
        if (!arg0) {
            this.method2603((class162) null, -2, true, 91);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        ++field6293;
        Object var3 = null;
        class377 var5;
        if (this.field6285 == null && this.field6288) {
            class208 var4 = this.method2603(arg1, -78, true, 262144);
            var5 = var4 == null ? null : var4.field2862;
        } else {
            var5 = this.field6285;
            this.field6285 = null;
        }
        if (var5 != null) {
            class382.method2269(var5, this.field6286, super.field5892, super.field5893, (boolean[]) null);
        }
        if (arg0 != -7803) {
            this.method126((byte) -22);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        ++field6290;
        if (this.field6281 == null) {
            return null;
        } else {
            class414 var3 = arg1.method611();
            var3.method971(super.field5892, super.field5894, super.field5893);
            class514 var4 = null;
            if (this.field6291) {
                var4 = class148.method1020(0, 1);
            }
            this.field6281.method853(var3, var4 != null ? var4.field7563[0] : null, 0);
            if (arg0 != 9124) {
                this.method125(true);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        ++field6284;
        if (!arg1) {
            this.field6286 = -50;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        int var2 = 49 % ((56 - arg0) / 52);
        ++field6273;
        if (this.field6281 != null) {
            this.field6281.method837();
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method2604(byte arg0) {
        if (class166.field2412 != null) {
            class166.field2412.method1095(15512);
            class166.field2412 = null;
            class514.field7586 = null;
        }
        int var1 = -117 % ((arg0 - 29) / 43);
        ++field6269;
    }
}
