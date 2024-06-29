import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class362 extends class215 implements class448 {

    @OriginalMember(owner = "client!hv", name = "U", descriptor = "B")
    private byte field4948;

    @OriginalMember(owner = "client!hv", name = "W", descriptor = "S")
    private short field4950;

    @OriginalMember(owner = "client!hv", name = "L", descriptor = "Z")
    private boolean field4939;

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "B")
    private byte field4935;

    @OriginalMember(owner = "client!hv", name = "S", descriptor = "Z")
    private boolean field4946;

    @OriginalMember(owner = "client!hv", name = "Y", descriptor = "Z")
    private boolean field4952;

    @OriginalMember(owner = "client!hv", name = "O", descriptor = "Z")
    private boolean field4942;

    @OriginalMember(owner = "client!hv", name = "M", descriptor = "Li;")
    private class31 field4940;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "Le;")
    private class373 field4930;

    @OriginalMember(owner = "client!hv", name = "I", descriptor = "[Lcs;")
    public static class228[] field4936 = new class228[2048];

    @OriginalMember(owner = "client!hv", name = "X", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4951 = new Rectangle[100];

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!hv", name = "J", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!hv", name = "K", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!hv", name = "N", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!hv", name = "P", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!hv", name = "Q", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!hv", name = "R", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!hv", name = "T", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!hv", name = "V", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!hv", name = "Z", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hv", name = "ab", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!hv", name = "bb", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!hv", name = "cb", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILza;)V", line = 3)
    public final void method44(int arg0, class287 arg1) {
        if (arg0 < 122) {
            this.method36((byte) -73, (class287) null);
        }
        ++field4929;
        Object var3 = null;
        class31 var5;
        if (this.field4940 == null && this.field4942) {
            class190 var4 = this.method2161((byte) -127, arg1, true, 262144);
            var5 = var4 != null ? var4.field2454 : null;
        } else {
            var5 = this.field4940;
            this.field4940 = null;
        }
        if (var5 != null) {
            class488.method2957(var5, this.field4935, super.field2934, super.field2936, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(BLza;)Luc;", line = 36)
    public final class23 method50(byte arg0, class287 arg1) {
        ++field4944;
        if (this.field4930 == null) {
            return null;
        } else {
            class124 var3 = arg1.method1183();
            var3.method743(super.field2934, super.field2933, super.field2936);
            class23 var4 = null;
            if (this.field4939) {
                var4 = class117.method703(1, arg0 ^ 18);
            }
            this.field4930.method2051(var3, var4 == null ? null : var4.field226[0], 0);
            if (arg0 != -112) {
                this.method44(44, (class287) null);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 65)
    public final void method45(int arg0) {
        if (this.field4930 != null) {
            this.field4930.method2013();
        }
        ++field4932;
        if (arg0 != 9479) {
            this.field4952 = false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)Lu;", line = 79)
    public static final class54 method2159(int arg0) {
        ++field4954;
        if (arg0 <= 95) {
            field4936 = null;
        }
        return ~class55.field637.length < ~class370.field5036 ? class55.field637[class370.field5036++] : null;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lza;Ler;IIIIZIZ)V", line = 94)
    public class362(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field868, arg1.field822, arg1.field831);
        this.field4948 = (byte) arg7;
        this.field4950 = (short) arg1.field834;
        this.field4939 = arg1.field886 != 0 && !arg6;
        super.field2934 = arg3;
        super.field2936 = arg5;
        this.field4935 = (byte) arg2;
        this.field4946 = arg8;
        this.field4952 = arg6;
        this.field4942 = arg0.method1129() && arg1.field820 && !this.field4952 && ~class319.field4256.method2058(class20.field183, 1) != -1;
        int var10 = 2048;
        if (this.field4946) {
            var10 |= 65536;
        }
        class190 var11 = this.method2161((byte) -115, arg0, this.field4942, var10);
        if (var11 != null) {
            this.field4940 = var11.field2454;
            this.field4930 = var11.field2455;
            if (this.field4946) {
                this.field4930 = this.field4930.method2027((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)Z", line = 129)
    public final boolean method41(byte arg0) {
        if (arg0 != -62) {
            this.field4930 = null;
        }
        ++field4938;
        return this.field4946;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIZILot;Lza;)V", line = 140)
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        int var8 = 73 / ((61 - arg0) / 47);
        ++field4943;
        if (arg5 instanceof class362) {
            class362 var9 = (class362) arg5;
            if (this.field4930 != null && var9.field4930 != null) {
                this.field4930.method2049(var9.field4930, arg4, arg2, arg1, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lza;IB)Le;", line = 160)
    private final class373 method2160(class287 arg0, int arg1, byte arg2) {
        ++field4956;
        if (this.field4930 != null && arg0.method1191(this.field4930.method2025(), arg1) == 0) {
            return this.field4930;
        } else {
            class190 var4 = this.method2161((byte) -114, arg0, false, arg1);
            int var5 = 100 / ((arg2 - 46) / 44);
            return var4 == null ? null : var4.field2455;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(BLza;)V", line = 180)
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 >= -120) {
            this.field4952 = false;
        }
        ++field4931;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLza;ZI)Luu;", line = 194)
    private final class190 method2161(byte arg0, class287 arg1, boolean arg2, int arg3) {
        if (arg0 >= -90) {
            this.method48((byte) -31);
        }
        ++field4933;
        class70 var5 = class123.field1593.method2920(65535 & this.field4950, 19219);
        class38 var6;
        class38 var7;
        if (!this.field4952) {
            if (this.field4935 >= 3) {
                var6 = null;
            } else {
                var6 = class14.field152[this.field4935 + 1];
            }
            var7 = class14.field152[this.field4935];
        } else {
            var6 = class14.field152[0];
            var7 = class378.field5470[this.field4935];
        }
        return var5.method416(0, var7, arg3, arg2, 22, super.field2936, var6, super.field2933, arg1, super.field2934, this.field4948);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLza;)V", line = 224)
    public final void method49(byte arg0, class287 arg1) {
        ++field4953;
        if (arg0 != -56) {
            this.method37(-105, (class287) null, (byte) -52, 58);
        }
        Object var3 = null;
        class31 var5;
        if (this.field4940 == null && this.field4942) {
            class190 var4 = this.method2161((byte) -104, arg1, true, 262144);
            var5 = var4 == null ? null : var4.field2454;
        } else {
            var5 = this.field4940;
            this.field4940 = null;
        }
        if (var5 != null) {
            class378.method2312(var5, this.field4935, super.field2934, super.field2936, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "(I)V", line = 256)
    public static void method2162(int arg0) {
        field4951 = null;
        field4936 = null;
        if (arg0 != 65535) {
            method2159(19);
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(B)V", line = 267)
    public final void method42(byte arg0) {
        this.field4946 = false;
        ++field4945;
        if (this.field4930 != null) {
            this.field4930.method2034(this.field4930.method2025() & -65537);
        }
        if (arg0 != 92) {
            this.field4942 = true;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I", line = 282)
    public final int method47(int arg0) {
        ++field4949;
        return arg0 != -15774 ? -74 : this.field4948;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z", line = 298)
    public final boolean method38(byte arg0) {
        ++field4955;
        return arg0 != -89 ? false : this.field4942;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I", line = 317)
    public final int method48(byte arg0) {
        ++field4941;
        if (arg0 != -70) {
            this.field4952 = false;
        }
        return 22;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILza;BI)Z", line = 328)
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        if (arg2 > -64) {
            this.field4935 = 104;
        }
        ++field4934;
        class373 var5 = this.method2160(arg1, 131072, (byte) 102);
        if (var5 != null) {
            class124 var6 = arg1.method1183();
            var6.method743(super.field2934, super.field2933, super.field2936);
            return var5.method2026(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBLza;)Le;", line = 350)
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        ++field4937;
        if (arg1 != -54) {
            this.method38((byte) 67);
        }
        return this.method2160(arg2, arg0, (byte) 107);
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I", line = 361)
    public final int method46(int arg0) {
        ++field4947;
        int var2 = 38 / ((-18 - arg0) / 42);
        return 65535 & this.field4950;
    }
}
