import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class388 extends class17 implements class285 {

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "B")
    private byte field5528;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "Z")
    private boolean field5534;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "Z")
    private boolean field5522;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "S")
    private short field5526;

    @OriginalMember(owner = "client!cs", name = "eb", descriptor = "B")
    private byte field5545;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "Z")
    private boolean field5523;

    @OriginalMember(owner = "client!cs", name = "nb", descriptor = "B")
    private byte field5554;

    @OriginalMember(owner = "client!cs", name = "gb", descriptor = "Z")
    private boolean field5547;

    @OriginalMember(owner = "client!cs", name = "lb", descriptor = "Lve;")
    private class307 field5552;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "Ljn;")
    public class396 field5532;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field5529 = -2;

    @OriginalMember(owner = "client!cs", name = "bb", descriptor = "I")
    public static int field5542 = -11713997;

    @OriginalMember(owner = "client!cs", name = "mb", descriptor = "I")
    public static int field5553 = 0;

    @OriginalMember(owner = "client!cs", name = "V", descriptor = "[I")
    public static int[] field5536 = new int[14];

    @OriginalMember(owner = "client!cs", name = "db", descriptor = "Ljava/lang/String;")
    public static String field5544 = "Started 3d Library";

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!cs", name = "U", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!cs", name = "W", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!cs", name = "X", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!cs", name = "Y", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!cs", name = "ab", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!cs", name = "cb", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!cs", name = "fb", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!cs", name = "hb", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!cs", name = "ib", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!cs", name = "jb", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!cs", name = "kb", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!cs", name = "Z", descriptor = "Lam;")
    public static class286 field5540;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public final int method356(int arg0) {
        ++field5525;
        return arg0 != 10397 ? 113 : 65535 & this.field5526;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
    public final int method351(byte arg0) {
        if (arg0 != 103) {
            this.field5523 = false;
        }
        ++field5543;
        return this.field5545;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
    public final int method339(int arg0) {
        int var2 = 47 / ((19 - arg0) / 32);
        ++field5549;
        return this.field5528;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lvm;II)Ljn;")
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        ++field5527;
        if (arg1 != -24206) {
            this.method2409(47);
        }
        return this.method2410(arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field5519;
        class396 var5 = this.method2410(arg3, 0, 65536);
        if (arg0 != -23563) {
            this.field5526 = 44;
        }
        if (var5 != null) {
            class247 var6 = arg3.method1650();
            var6.method747(super.field152, super.field150, super.field154);
            return var5.method2300(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLvm;)V")
    public final void method347(byte arg0, class322 arg1) {
        if (arg0 != -108) {
            field5553 = -81;
        }
        ++field5541;
        Object var3 = null;
        class307 var5;
        if (this.field5552 == null && this.field5547) {
            class56 var4 = this.method2407(true, 131072, arg1, arg0 + 172);
            var5 = var4 == null ? null : var4.field569;
        } else {
            var5 = this.field5552;
            this.field5552 = null;
        }
        if (var5 != null) {
            class307.method1803(var5, this.field5554, super.field152, super.field154, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
    public static final void method2406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5530;
        class367 var5 = (class367) class106.field1305.method308((long) arg3, (byte) -5);
        if (var5 == null) {
            var5 = new class367();
            class106.field1305.method314((long) arg3, var5, 7079);
        }
        if (var5.field5141.length <= arg1) {
            int[] var6 = new int[arg1 - -1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var5.field5141.length > var8; ++var8) {
                var6[var8] = var5.field5141[var8];
                var7[var8] = var5.field5137[var8];
            }
            for (int var9 = var5.field5141.length; ~arg1 < ~var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field5141 = var6;
            var5.field5137 = var7;
        }
        var5.field5141[arg1] = arg0;
        if (arg4 >= -32) {
            method2408(-37);
        }
        var5.field5137[arg1] = arg2;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        if (arg0 != 24) {
            return true;
        } else {
            ++field5551;
            return this.field5547;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public final void method350(byte arg0) {
        if (arg0 >= 114) {
            ++field5520;
            if (this.field5532 != null) {
                this.field5532.method2308();
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        this.field5534 = false;
        ++field5535;
        if (arg0 > -13) {
            method2406(-109, 100, -56, 43, -89);
        }
        if (this.field5532 != null) {
            this.field5532.method2267(-32769 & this.field5532.method2312());
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZILvm;I)Lf;")
    private final class56 method2407(boolean arg0, int arg1, class322 arg2, int arg3) {
        ++field5537;
        if (arg3 <= 53) {
            this.field5554 = 32;
        }
        class225 var5 = class281.method1655((byte) -28, 65535 & this.field5526);
        class54 var6;
        class54 var7;
        if (!this.field5522) {
            if (~this.field5554 <= -4) {
                var6 = null;
            } else {
                var6 = class272.field3682[this.field5554 + 1];
            }
            var7 = class272.field3682[this.field5554];
        } else {
            var6 = class272.field3682[0];
            var7 = class275.field3707[this.field5554];
        }
        return var5.method1214(arg0, var7, super.field150, var6, arg1, super.field152, true, ~this.field5528 == -12 ? 10 : this.field5528, arg2, ~this.field5528 == -12 ? 4 - -this.field5545 : this.field5545, super.field154);
    }

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)Z")
    public static final boolean method2408(int arg0) {
        ++field5550;
        if (arg0 != -1) {
            return false;
        } else {
            try {
                if (~class252.field3445 == -3) {
                    if (class182.field2291 == null) {
                        class182.field2291 = class59.method319(class266.field3616, class109.field1333, class27.field259);
                        if (class182.field2291 == null) {
                            return false;
                        }
                    }
                    if (class132.field1705 == null) {
                        class132.field1705 = new class85(class84.field931, class352.field4933);
                    }
                    if (class314.field4205.method2339(class444.field6481, class132.field1705, (byte) -57, 22050, class182.field2291)) {
                        class314.field4205.method2327(-6);
                        class314.field4205.method2348(class425.field6234, (byte) 96);
                        class314.field4205.method2349(class242.field3303, class182.field2291, 98);
                        class182.field2291 = null;
                        class252.field3445 = 0;
                        class266.field3616 = null;
                        class132.field1705 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class314.field4205.method2344(0);
                class182.field2291 = null;
                class132.field1705 = null;
                class266.field3616 = null;
                class252.field3445 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        ++field5539;
        if (arg1 != 0) {
            this.method2410((class322) null, 101, 26);
        }
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)I")
    public final int method2409(int arg0) {
        ++field5538;
        if (arg0 < 3) {
            this.field5526 = -119;
        }
        return this.field5532 != null ? this.field5532.method2276() / 4 : 15;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lvm;Lds;IIIIIZIIIIIIZ)V")
    public class388(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3069 == 1, class165.method882(arg12, arg13, 121));
        this.field5528 = (byte) arg12;
        this.field5534 = arg14;
        this.field5522 = arg7;
        this.field5526 = (short) arg1.field3051;
        this.field5545 = (byte) arg13;
        this.field5523 = ~arg1.field3027 != -1;
        this.field5554 = (byte) arg3;
        this.field5547 = arg0.method1585() && arg1.field3056 && !this.field5522 && ~class169.field2133 != -1;
        int var16 = 1024;
        if (this.field5534) {
            var16 |= 32768;
        }
        class56 var17 = this.method2407(this.field5547, var16, arg0, 58);
        if (var17 != null) {
            this.field5552 = var17.field569;
            this.field5532 = var17.field567;
            if (this.field5534) {
                this.field5532 = this.field5532.method2297((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        ++field5548;
        if (arg1 < 36) {
            this.method356(-80);
        }
        if (arg4 instanceof class350) {
            class350 var8 = (class350) arg4;
            if (this.field5532 != null && var8.field4863 != null) {
                this.field5532.method2293(var8.field4863, arg3, arg2, arg5, arg0);
            }
        } else {
            if (arg4 instanceof class388) {
                class388 var9 = (class388) arg4;
                if (this.field5532 != null && var9.field5532 != null) {
                    this.field5532.method2293(var9.field5532, arg3, arg2, arg5, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field5521;
        if (this.field5532 == null) {
            return null;
        } else {
            class247 var3 = arg0.method1650();
            var3.method747(super.field152, super.field150, super.field154);
            class321 var4 = null;
            if (this.field5523) {
                var4 = class204.method1110(258, 1);
            }
            this.field5532.method2284(var3, var4 == null ? null : var4.field4293[0], 0);
            if (arg1) {
                this.method352((class322) null, 13);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lvm;II)Ljn;")
    private final class396 method2410(class322 arg0, int arg1, int arg2) {
        ++field5524;
        if (this.field5532 != null && ~arg0.method1620(this.field5532.method2312(), arg2) == -1) {
            return this.field5532;
        } else if (arg1 != 0) {
            return null;
        } else {
            class56 var4 = this.method2407(false, arg2, arg0, 108);
            return var4 != null ? var4.field567 : null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I")
    public final int method76(int arg0) {
        if (arg0 != 20765) {
            return 0;
        } else {
            ++field5531;
            return this.field5532 != null ? this.field5532.method2299() : 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLvm;)V")
    public final void method357(boolean arg0, class322 arg1) {
        if (!arg0) {
            ++field5533;
            Object var3 = null;
            class307 var5;
            if (this.field5552 == null && this.field5547) {
                class56 var4 = this.method2407(true, 131072, arg1, 106);
                var5 = var4 != null ? var4.field569 : null;
            } else {
                var5 = this.field5552;
                this.field5552 = null;
            }
            if (var5 != null) {
                class434.method2681(var5, this.field5554, super.field152, super.field154, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(B)V")
    public static void method2411(byte arg0) {
        field5540 = null;
        field5544 = null;
        field5536 = null;
        if (arg0 >= -127) {
            method2411((byte) -23);
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            return false;
        } else {
            ++field5546;
            return this.field5534;
        }
    }
}
