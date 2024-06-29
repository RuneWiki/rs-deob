import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class485 extends class126 implements class614 {

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "S")
    private short field6900;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "Z")
    private boolean field6890;

    @OriginalMember(owner = "client!hr", name = "cb", descriptor = "B")
    private byte field6906;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "Z")
    private boolean field6891;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "B")
    private byte field6892;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "Z")
    private boolean field6894;

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "Lda;")
    private class55 field6895;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "Lha;")
    private class54 field6889;

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lmf;")
    public static class382 field6902 = new class382(4);

    @OriginalMember(owner = "client!hr", name = "gb", descriptor = "I")
    public static int field6910 = 1;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!hr", name = "ab", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!hr", name = "bb", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!hr", name = "db", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!hr", name = "eb", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!hr", name = "fb", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!hr", name = "hb", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "Lnu;")
    private class548 field6885;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method1181(int arg0) {
        if (arg0 != -1) {
            this.field6890 = false;
        }
        ++field6903;
        return true;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)V", line = 15)
    public static final void method2818(byte arg0) {
        for (class279 var1 = (class279) class663.field9367.method472((byte) -60); var1 != null; var1 = (class279) class663.field9367.method482(22)) {
            if (class576.method3265(var1.field4213, 73)) {
                class385.method2302(var1, (byte) -115);
            }
        }
        int var2 = -49 / ((arg0 - -11) / 45);
        ++field6901;
        if (~class340.field5002 != -2) {
            class349.method2156(0, class101.field1573, class352.field5079, class450.field6490, class70.field1246);
            int var3 = class467.field6721.method1039(0, class274.field4140.method1804(7175, class512.field7203));
            for (class279 var4 = (class279) class663.field9367.method472((byte) -122); var4 != null; var4 = (class279) class663.field9367.method482(-103)) {
                int var5 = class304.method1944(var4, (byte) 116);
                if (~var5 < ~var3) {
                    var3 = var5;
                }
            }
            class450.field6490 = class340.field5002 * 16 - -(!class566.field7979 ? 22 : 26);
            class70.field1246 = var3 + 8;
        } else {
            class569.method3243(23509);
        }
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)Z", line = 60)
    public final boolean method1184(int arg0) {
        ++field6897;
        int var2 = 49 % ((-1 - arg0) / 59);
        return this.field6895 == null ? false : this.field6895.method545();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILr;)V", line = 76)
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 != 0) {
            field6902 = null;
        }
        ++field6904;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;I)V", line = 86)
    public final void method1172(class166 arg0, int arg1) {
        if (arg1 <= 26) {
            this.field6891 = false;
        }
        ++field6886;
        Object var3 = null;
        class54 var5;
        if (this.field6889 == null && this.field6894) {
            class336 var4 = this.method2820(false, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field4963;
        } else {
            var5 = this.field6889;
            this.field6889 = null;
        }
        if (var5 != null) {
            class320.method2005(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lrda;B)Z", line = 115)
    public static final boolean method2819(class614 arg0, byte arg1) {
        ++field6909;
        class550 var2 = class101.field1572.method2617((byte) -92, arg0.method1179(true));
        if (var2.field7792 == -1) {
            return true;
        } else {
            class563 var3 = class27.field401.method3064((byte) 122, var2.field7792);
            if (arg1 != 49) {
                return false;
            } else {
                return var3.field7923 == -1 ? true : var3.method3214((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZILr;)Lpa;", line = 139)
    private final class336 method2820(boolean arg0, boolean arg1, int arg2, class166 arg3) {
        ++field6911;
        class550 var5 = class101.field1572.method2617((byte) -125, 65535 & this.field6900);
        if (arg0) {
            field6902 = null;
        }
        class37 var6;
        class37 var7;
        if (!this.field6890) {
            if (~super.field3023 <= -4) {
                var6 = null;
            } else {
                var6 = class420.field6108[super.field3023 + 1];
            }
            var7 = class420.field6108[super.field3023];
        } else {
            var7 = class499.field7071[super.field3023];
            var6 = class420.field6108[0];
        }
        return var5.method3111(var7, super.field3018, 3, this.field6892, arg3, arg1, super.field3024, arg2, this.field6906, var6, super.field3029);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)I", line = 169)
    public final int method1186(int arg0) {
        ++field6899;
        if (arg0 != -9960) {
            this.field6894 = false;
        }
        return this.field6892;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lr;Z)Lkq;", line = 182)
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field6907;
        if (this.field6895 == null) {
            return null;
        } else {
            class391 var3 = arg0.method130();
            var3.method252(super.field1887 + super.field3024, super.field3018, super.field1880 + super.field3029);
            if (!arg1) {
                this.field6906 = 56;
            }
            class549 var4 = null;
            if (this.field6891) {
                var4 = class26.method321(1, 0);
            }
            if (!class676.field9574) {
                this.field6895.method513(var3, var4 != null ? var4.field7711[0] : null, 0);
            } else {
                this.field6895.method495(var3, var4 != null ? var4.field7711[0] : null, class341.field5008, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I", line = 213)
    public final int method1175(int arg0) {
        if (arg0 != 24563) {
            return 59;
        } else {
            ++field6893;
            return this.field6906;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I", line = 226)
    public final int method1171(byte arg0) {
        ++field6882;
        if (arg0 < 39) {
            this.field6894 = false;
        }
        return this.field6895 != null ? this.field6895.method525() : 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)I", line = 237)
    public final int method1179(boolean arg0) {
        ++field6887;
        return !arg0 ? 70 : this.field6900 & 65535;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lr;Let;IIIIIZIIII)V", line = 248)
    public class485(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field3029 = arg6;
        this.field6900 = (short) arg1.field7783;
        this.field6890 = arg7;
        super.field3024 = arg4;
        this.field6906 = (byte) arg11;
        this.field6891 = ~arg1.field7746 != -1 && !arg7;
        this.field6892 = (byte) arg10;
        this.field6894 = arg0.method104() && arg1.field7759 && !this.field6890 && class287.field4270.method1625(-106, class328.field4859) != 0;
        class336 var13 = this.method2820(false, this.field6894, 2048, arg0);
        if (var13 != null) {
            this.field6895 = var13.field4961;
            this.field6889 = var13.field4963;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;Z)V", line = 271)
    public final void method1176(class166 arg0, boolean arg1) {
        ++field6883;
        Object var3 = null;
        class54 var5;
        if (this.field6889 == null && this.field6894) {
            class336 var4 = this.method2820(arg1, true, 262144, arg0);
            var5 = var4 == null ? null : var4.field4963;
        } else {
            var5 = this.field6889;
            this.field6889 = null;
        }
        if (var5 != null) {
            class409.method2472(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
        if (arg1) {
            this.field6885 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V", line = 299)
    public static void method2821(byte arg0) {
        field6902 = null;
        if (arg0 >= -62) {
            field6910 = 76;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILr;I)Z", line = 312)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field6881;
        class55 var5 = this.method2822((byte) 117, arg2, 131072);
        if (arg0 != -26798) {
            this.field6885 = null;
        }
        if (var5 != null) {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            return class676.field9574 ? var5.method492(arg3, arg1, var6, false, class341.field5008) : var5.method529(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(ILr;)Lnu;", line = 333)
    public final class548 method1183(int arg0, class166 arg1) {
        if (this.field6885 == null) {
            this.field6885 = class149.method1060(super.field3029, super.field3024, this.method2822((byte) 127, arg1, 0), false, super.field3018);
        }
        if (arg0 != 6433) {
            return null;
        } else {
            ++field6898;
            return this.field6885;
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)Z", line = 353)
    public final boolean method1180(int arg0) {
        if (arg0 <= 100) {
            this.field6889 = null;
        }
        ++field6888;
        return this.field6894;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 366)
    public final void method1174(int arg0) {
        if (arg0 == -24082) {
            if (this.field6895 != null) {
                this.field6895.method530();
            }
            ++field6896;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLr;I)Lda;", line = 387)
    private final class55 method2822(byte arg0, class166 arg1, int arg2) {
        if (arg0 <= 116) {
            this.method1183(-89, (class166) null);
        }
        ++field6908;
        if (this.field6895 != null && ~arg1.method172(this.field6895.method517(), arg2) == -1) {
            return this.field6895;
        } else {
            class336 var4 = this.method2820(false, false, arg2, arg1);
            return var4 != null ? var4.field4961 : null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I", line = 409)
    public final int method1182(int arg0) {
        if (arg0 != -32768) {
            field6910 = 112;
        }
        ++field6905;
        return this.field6895 != null ? this.field6895.method488() : 0;
    }
}
