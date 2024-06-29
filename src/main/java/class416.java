import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class416 extends class325 implements class210 {

    @OriginalMember(owner = "client!t", name = "F", descriptor = "S")
    private short field5700;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "Z")
    private boolean field5710;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Z")
    private boolean field5708;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "Z")
    private boolean field5718;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "B")
    private byte field5705;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "B")
    private byte field5704;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "B")
    private byte field5694;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Z")
    private boolean field5695;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Ln;")
    public class468 field5693;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Ldh;")
    private class183 field5713;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "[I")
    public static int[] field5707 = new int[100];

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field5715 = 0;

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    public static int field5724 = 0;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Lap;")
    public static class310 field5706 = new class310(27, -1);

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "[Ljava/lang/String;")
    public static String[] field5726 = new String[100];

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public static int field5725 = 0;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lrr;")
    public static class255 field5691;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILvc;II)Z", line = 7)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field5726 = null;
        }
        ++field5719;
        class468 var5 = this.method2490(65536, arg1, 77);
        if (var5 != null) {
            class257 var6 = arg1.method306();
            var6.method96(super.field4537, super.field4532, super.field4530);
            return var5.method1593(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvc;IIZ)Lco;", line = 29)
    private final class406 method2486(class89 arg0, int arg1, int arg2, boolean arg3) {
        ++field5690;
        class267 var5 = class468.field6599.method506(-128, this.field5700 & 65535);
        class241 var6;
        class241 var7;
        if (!this.field5718) {
            if (this.field5704 >= 3) {
                var6 = null;
            } else {
                var6 = class190.field2858[this.field5704 + 1];
            }
            var7 = class190.field2858[this.field5704];
        } else {
            var7 = class427.field5960[this.field5704];
            var6 = class190.field2858[0];
        }
        return arg1 != -29298 ? null : var5.method1811(super.field4530, true, var6, arg3, this.field5694 != 11 ? this.field5705 : this.field5705 + 4, arg2, arg0, super.field4537, this.field5694 != 11 ? this.field5694 : 10, super.field4532, var7);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 59)
    public final void method84(int arg0) {
        if (this.field5693 != null) {
            this.field5693.method1595();
        }
        ++field5692;
        if (arg0 != 16805) {
            field5715 = -52;
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(B)I", line = 74)
    public final int method251(byte arg0) {
        ++field5698;
        if (arg0 != 5) {
            return -63;
        } else {
            return this.field5693 != null ? this.field5693.method1591() : 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIZIIIIIIZ)V", line = 86)
    public class416(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field3853 == -2, class193.method1349(arg12, 1, arg13));
        this.field5700 = (short) arg1.field3887;
        this.field5710 = arg14;
        this.field5708 = ~arg1.field3902 != -1 && !arg7;
        this.field5718 = arg7;
        this.field5705 = (byte) arg13;
        this.field5704 = (byte) arg3;
        this.field5694 = (byte) arg12;
        this.field5695 = arg0.method291() && arg1.field3876 && !this.field5718 && class99.field1396 != 0;
        int var16 = 1024;
        if (this.field5710) {
            var16 |= 32768;
        }
        class406 var17 = this.method2486(arg0, -29298, var16, this.field5695);
        if (var17 != null) {
            this.field5693 = var17.field5545;
            this.field5713 = var17.field5541;
            if (this.field5710) {
                this.field5693 = this.field5693.method1600((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)I", line = 122)
    public final int method2487(int arg0) {
        if (arg0 != 4) {
            this.field5700 = -58;
        }
        ++field5699;
        return this.field5693 == null ? 15 : this.field5693.method1611() / 4;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V", line = 134)
    public final void method75(byte arg0) {
        this.field5710 = false;
        ++field5697;
        if (this.field5693 != null) {
            this.field5693.method1588(-32769 & this.field5693.method1574());
        }
        if (arg0 != 111) {
            this.method83((byte) 74);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvc;I)Lep;", line = 149)
    public final class309 method69(class89 arg0, int arg1) {
        ++field5701;
        if (this.field5693 == null) {
            return null;
        } else {
            class257 var3 = arg0.method306();
            var3.method96(super.field4537, super.field4532, super.field4530);
            if (arg1 != 10228) {
                return null;
            } else {
                class309 var4 = null;
                if (this.field5708) {
                    var4 = class163.method1205((byte) 40, 1);
                }
                this.field5693.method1592(var3, var4 == null ? null : var4.field4383[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lvc;B)V", line = 175)
    public final void method85(class89 arg0, byte arg1) {
        ++field5702;
        if (arg1 == -24) {
            Object var3 = null;
            class183 var5;
            if (this.field5713 == null && this.field5695) {
                class406 var4 = this.method2486(arg0, -29298, 131072, true);
                var5 = var4 == null ? null : var4.field5541;
            } else {
                var5 = this.field5713;
                this.field5713 = null;
            }
            if (var5 != null) {
                class404.method2425(var5, this.field5704, super.field4537, super.field4530, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Z", line = 204)
    public final boolean method68(int arg0) {
        int var2 = -105 % ((arg0 - 2) / 57);
        ++field5712;
        return this.field5710;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZII)I", line = 218)
    public static final int method2488(int arg0, boolean arg1, int arg2, int arg3) {
        ++field5703;
        class48 var4 = class317.method2019((byte) -109, arg0, arg1);
        if (var4 == null) {
            return 0;
        } else {
            if (arg2 != 1) {
                field5691 = null;
            }
            return arg3 >= 0 && var4.field725.length > arg3 ? var4.field725[arg3] : 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(B)V", line = 239)
    public static void method2489(byte arg0) {
        field5706 = null;
        if (arg0 != 70) {
            method2489((byte) -124);
        }
        field5691 = null;
        field5707 = null;
        field5726 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I", line = 252)
    public final int method71(byte arg0) {
        if (arg0 <= 81) {
            return -12;
        } else {
            ++field5723;
            return this.field5705;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(ZLvc;)V", line = 269)
    public final void method86(boolean arg0, class89 arg1) {
        ++field5709;
        if (arg0) {
            this.method70(false, 106, (class89) null, 60, 96, (class316) null, 68);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BILvc;)Ln;", line = 287)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        ++field5696;
        if (arg0 != -106) {
            this.method75((byte) -82);
        }
        return this.method2490(arg1, arg2, 55);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILvc;I)Ln;", line = 304)
    private final class468 method2490(int arg0, class89 arg1, int arg2) {
        ++field5722;
        int var4 = -104 % ((-25 - arg2) / 53);
        if (this.field5693 != null && ~arg1.method362(this.field5693.method1574(), arg0) == -1) {
            return this.field5693;
        } else {
            class406 var5 = this.method2486(arg1, -29298, arg0, false);
            return var5 != null ? var5.field5545 : null;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Z", line = 325)
    public final boolean method82(byte arg0) {
        ++field5714;
        if (arg0 <= 89) {
            this.field5704 = -90;
        }
        return this.field5695;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)I", line = 337)
    public final int method83(byte arg0) {
        ++field5711;
        if (arg0 < 70) {
            this.field5705 = -16;
        }
        return this.field5694;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I", line = 353)
    public final int method80(int arg0) {
        ++field5720;
        return arg0 != 10143 ? 18 : 65535 & this.field5700;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLvc;)V", line = 366)
    public final void method78(boolean arg0, class89 arg1) {
        ++field5721;
        if (!arg0) {
            this.field5695 = false;
        }
        Object var3 = null;
        class183 var5;
        if (this.field5713 == null && this.field5695) {
            class406 var4 = this.method2486(arg1, -29298, 131072, true);
            var5 = var4 != null ? var4.field5541 : null;
        } else {
            var5 = this.field5713;
            this.field5713 = null;
        }
        if (var5 != null) {
            class141.method1021(var5, this.field5704, super.field4537, super.field4530, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 393)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        if (arg5 instanceof class13) {
            class13 var8 = (class13) arg5;
            if (this.field5693 != null && var8.field94 != null) {
                this.field5693.method1557(var8.field94, arg3, arg6, arg4, arg0);
            }
        } else if (arg5 instanceof class416) {
            class416 var9 = (class416) arg5;
            if (this.field5693 != null && var9.field5693 != null) {
                this.field5693.method1557(var9.field5693, arg3, arg6, arg4, arg0);
            }
        }
        ++field5717;
        if (arg1 < 40) {
            this.method84(-73);
        }
    }
}
