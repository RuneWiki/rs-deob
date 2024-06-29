import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class350 extends class449 implements class285 {

    @OriginalMember(owner = "client!im", name = "F", descriptor = "B")
    private byte field4865;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
    private boolean field4871;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "B")
    private byte field4870;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "Z")
    private boolean field4872;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "Z")
    private boolean field4858;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "B")
    private byte field4885;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "S")
    private short field4879;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Z")
    private boolean field4864;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "Lve;")
    private class307 field4882;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "Ljn;")
    public class396 field4863;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "Lph;")
    public static class114 field4869 = new class114(20);

    @OriginalMember(owner = "client!im", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4873 = "green:";

    @OriginalMember(owner = "client!im", name = "db", descriptor = "[I")
    public static int[] field4889 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!im", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field4890 = " more options";

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "Lam;")
    public static class286 field4881;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method2142(byte arg0, int arg1, int arg2) {
        ++field4861;
        class40 var3 = class162.method872(arg1, (byte) 92, 12);
        var3.method190(0);
        if (arg0 >= 11) {
            var3.field418 = arg2;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z", line = 19)
    public final boolean method358(byte arg0) {
        ++field4859;
        if (arg0 != 24) {
            this.method352((class322) null, 97);
        }
        return this.field4864;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lvm;Lds;IIIIZIIZ)V", line = 30)
    public class350(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class158.method849((byte) 4, arg7, arg8));
        super.field6521 = (short) arg3;
        this.field4865 = (byte) arg8;
        this.field4871 = arg6;
        this.field4870 = (byte) arg7;
        this.field4872 = ~arg1.field3027 != -1;
        this.field4858 = arg9;
        super.field6520 = (short) arg5;
        this.field4885 = (byte) arg2;
        this.field4879 = (short) arg1.field3051;
        this.field4864 = arg0.method1585() && arg1.field3056 && !this.field4871 && ~class169.field2133 != -1;
        int var11 = 1024;
        if (this.field4858) {
            var11 |= 32768;
        }
        class56 var12 = this.method2144(this.field4864, var11, 32768, arg0);
        if (var12 != null) {
            this.field4882 = var12.field569;
            this.field4863 = var12.field567;
            if (this.field4858) {
                this.field4863 = this.field4863.method2297((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)Z", line = 64)
    public final boolean method345(byte arg0) {
        ++field4875;
        return arg0 != -72 ? false : this.field4858;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I", line = 81)
    public final int method356(int arg0) {
        ++field4868;
        if (arg0 != 10397) {
            this.field4863 = null;
        }
        return 65535 & this.field4879;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvm;Z)Ldn;", line = 94)
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field4862;
        if (this.field4863 == null) {
            return null;
        } else {
            if (arg1) {
                this.field4864 = false;
            }
            class247 var3 = arg0.method1650();
            var3.method747(super.field6521, super.field6527, super.field6520);
            class321 var4 = null;
            if (this.field4872) {
                var4 = class204.method1110(258, 1);
            }
            this.field4863.method2284(var3, var4 != null ? var4.field4293[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILlh;)V", line = 124)
    public static final void method2143(int arg0, class450 arg1) {
        class168.field2125 = 3;
        ++field4866;
        class424.method2637(true, arg0 + -1417234658);
        class405.field5900 = true;
        class84.field942 = true;
        class295.field4002 = 127;
        class160.field2062 = 255;
        class335.field4449 = 0;
        class264.field3609 = true;
        class92.field1058 = true;
        class199.field2664 = true;
        class29.field278 = true;
        class9.field80 = 0;
        class63.field653 = 127;
        class2.field19 = true;
        class295.field4005 = 1;
        class444.field6490 = 0;
        class424.field6226 = 0;
        class448.field6510 = true;
        class169.field2133 = 2;
        class177.field2217 = true;
        class216.field2905 = true;
        if (class436.field6389 >= 96) {
            class34.method163(-123, 2);
        } else {
            class34.method163(-56, 0);
        }
        class225.field3041 = false;
        if (arg0 == -10233) {
            class417.field6000 = 2;
            class292.field3962 = 0;
            class274.field3689 = true;
            class165.field2104 = false;
            class289.field3931 = 0;
            class308.field4173 = false;
            class284.field3877 = 2;
            class297.field4040 = true;
            class55 var2 = null;
            try {
                class304 var3 = arg1.method2787(arg0 ^ 10136);
                while (var3.field4123 == 0) {
                    class370.method2235(1L, arg0 + 10243);
                }
                if (var3.field4123 == 1) {
                    var2 = (class55) var3.field4126;
                    byte[] var4 = new byte[(int) var2.method283(-1)];
                    int var6;
                    for (int var5 = 0; var4.length > var5; var5 += var6) {
                        var6 = var2.method284(var4, var5, var4.length + -var5, (byte) 116);
                        if (~var6 == 0) {
                            throw new IOException("EOF");
                        }
                    }
                    class233.method1263(new class250(var4), arg0 + 10319);
                }
            } catch (Exception var8) {
            }
            try {
                if (var2 != null) {
                    var2.method285(arg0 + 10233);
                }
            } catch (Exception var7) {
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIIILai;ILvm;)V", line = 210)
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (!(arg4 instanceof class350)) {
            if (arg4 instanceof class388) {
                class388 var8 = (class388) arg4;
                if (this.field4863 != null && var8.field5532 != null) {
                    this.field4863.method2293(var8.field5532, arg3, arg2, arg5, arg0);
                }
            }
        } else {
            class350 var9 = (class350) arg4;
            if (this.field4863 != null && var9.field4863 != null) {
                this.field4863.method2293(var9.field4863, arg3, arg2, arg5, arg0);
            }
        }
        if (arg1 <= 36) {
            this.method347((byte) -20, (class322) null);
        }
        ++field4886;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIILvm;)Lf;", line = 243)
    private final class56 method2144(boolean arg0, int arg1, int arg2, class322 arg3) {
        if (arg2 != 32768) {
            this.method344(73, -29, -63, (class322) null);
        }
        ++field4887;
        class225 var5 = class281.method1655((byte) -28, this.field4879 & 65535);
        class54 var6;
        class54 var7;
        if (!this.field4871) {
            var6 = class272.field3682[this.field4885];
            if (~this.field4885 > -4) {
                var7 = class272.field3682[this.field4885 - -1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class275.field3707[this.field4885];
            var7 = class272.field3682[0];
        }
        return var5.method1214(arg0, var6, super.field6527, var7, arg1, super.field6521, true, this.field4870, arg3, this.field4865, super.field6520);
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)V", line = 278)
    public static void method2145(int arg0) {
        field4869 = null;
        if (arg0 != 0) {
            field4881 = null;
        }
        field4873 = null;
        field4889 = null;
        field4890 = null;
        field4881 = null;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I", line = 293)
    public final int method339(int arg0) {
        ++field4888;
        int var2 = -109 / ((arg0 - 19) / 32);
        return this.field4870;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)I", line = 310)
    public final int method351(byte arg0) {
        ++field4876;
        if (arg0 != 103) {
            this.method358((byte) -79);
        }
        return this.field4865;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvm;II)Ljn;", line = 322)
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        ++field4874;
        if (arg1 != -24206) {
            this.field4865 = 67;
        }
        return this.method2146(arg0, arg2, arg1 ^ 14587);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLvm;)V", line = 333)
    public final void method347(byte arg0, class322 arg1) {
        ++field4867;
        Object var3 = null;
        class307 var5;
        if (this.field4882 == null && this.field4864) {
            class56 var4 = this.method2144(true, 131072, arg0 ^ -32876, arg1);
            var5 = var4 == null ? null : var4.field569;
        } else {
            var5 = this.field4882;
            this.field4882 = null;
        }
        if (arg0 != -108) {
            this.field4863 = null;
        }
        if (var5 != null) {
            class307.method1803(var5, this.field4885, super.field6521, super.field6520, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLvm;)V", line = 363)
    public final void method357(boolean arg0, class322 arg1) {
        ++field4878;
        Object var3 = null;
        class307 var5;
        if (this.field4882 == null && this.field4864) {
            class56 var4 = this.method2144(true, 131072, 32768, arg1);
            var5 = var4 == null ? null : var4.field569;
        } else {
            var5 = this.field4882;
            this.field4882 = null;
        }
        if (arg0) {
            this.method353(true, -58, 80, -26, (class128) null, -5, (class322) null);
        }
        if (var5 != null) {
            class434.method2681(var5, this.field4885, super.field6521, super.field6520, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Lvm;II)Ljn;", line = 403)
    private final class396 method2146(class322 arg0, int arg1, int arg2) {
        ++field4884;
        if (this.field4863 != null && ~arg0.method1620(this.field4863.method2312(), arg1) == -1) {
            return this.field4863;
        } else {
            if (arg2 != -26231) {
                this.field4879 = -119;
            }
            class56 var4 = this.method2144(false, arg1, arg2 + 58999, arg0);
            return var4 != null ? var4.field567 : null;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 425)
    public final void method346(int arg0) {
        this.field4858 = false;
        if (arg0 > -13) {
            this.method347((byte) -63, (class322) null);
        }
        ++field4880;
        if (this.field4863 != null) {
            this.field4863.method2267(this.field4863.method2312() & -32769);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 440)
    public final void method350(byte arg0) {
        ++field4877;
        if (this.field4863 != null) {
            this.field4863.method2308();
        }
        if (arg0 < 114) {
            this.field4885 = -8;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvm;I)V", line = 453)
    public final void method352(class322 arg0, int arg1) {
        if (arg1 != 0) {
            field4873 = null;
        }
        ++field4883;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIILvm;)Z", line = 469)
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field4860;
        class396 var5 = this.method2146(arg3, 65536, arg0 ^ 14972);
        if (var5 != null) {
            class247 var6 = arg3.method1650();
            var6.method747(super.field6521, super.field6527, super.field6520);
            return var5.method2300(arg1, arg2, var6, false);
        } else {
            if (arg0 != -23563) {
                field4890 = null;
            }
            return false;
        }
    }
}
