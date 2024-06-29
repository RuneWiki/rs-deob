import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class440 extends class390 implements class210 {

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "B")
    private byte field6234;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "B")
    private byte field6251;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Z")
    private boolean field6241;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "S")
    private short field6258;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
    private boolean field6253;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "Z")
    private boolean field6254;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Z")
    private boolean field6237;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Ln;")
    private class468 field6240;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Ldh;")
    private class183 field6256;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 3)
    public final void method84(int arg0) {
        ++field6239;
        if (this.field6240 != null) {
            this.field6240.method1595();
        }
        if (arg0 != 16805) {
            this.field6251 = -30;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lvc;Lnm;IIIIZIZ)V", line = 17)
    public class440(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3852, arg1.field3861);
        this.field6234 = (byte) arg7;
        super.field5391 = (short) arg3;
        this.field6251 = (byte) arg2;
        super.field5386 = (short) arg5;
        this.field6241 = arg8;
        this.field6258 = (short) arg1.field3887;
        this.field6253 = arg6;
        this.field6254 = ~arg1.field3902 != -1 && !arg6;
        this.field6237 = arg0.method291() && arg1.field3876 && !this.field6253 && class99.field1396 != 0;
        int var10 = 1024;
        if (this.field6241) {
            var10 |= 32768;
        }
        class406 var11 = this.method2676(this.field6237, arg0, var10, 110);
        if (var11 != null) {
            this.field6240 = var11.field5545;
            this.field6256 = var11.field5541;
            if (this.field6241) {
                this.field6240 = this.field6240.method1600((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I", line = 50)
    public final int method83(byte arg0) {
        if (arg0 <= 70) {
            this.field6254 = true;
        }
        ++field6233;
        return 22;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lvc;I)Lep;", line = 62)
    public final class309 method69(class89 arg0, int arg1) {
        ++field6249;
        if (this.field6240 == null) {
            return null;
        } else {
            class257 var3 = arg0.method306();
            if (arg1 != 10228) {
                this.method77(45, (class89) null, -63, 82);
            }
            var3.method96(super.field5391, super.field5390, super.field5386);
            class309 var4 = null;
            if (this.field6254) {
                var4 = class163.method1205((byte) 40, 1);
            }
            this.field6240.method1592(var3, var4 == null ? null : var4.field4383[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLvc;)V", line = 88)
    public final void method78(boolean arg0, class89 arg1) {
        ++field6242;
        Object var3 = null;
        class183 var5;
        if (this.field6256 == null && this.field6237) {
            class406 var4 = this.method2676(true, arg1, 131072, 21);
            var5 = var4 == null ? null : var4.field5541;
        } else {
            var5 = this.field6256;
            this.field6256 = null;
        }
        if (var5 != null) {
            class141.method1021(var5, this.field6251, super.field5391, super.field5386, (boolean[]) null);
        }
        if (!arg0) {
            this.field6254 = true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 115)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        if (arg5 instanceof class440) {
            class440 var8 = (class440) arg5;
            if (this.field6240 != null && var8.field6240 != null) {
                this.field6240.method1557(var8.field6240, arg3, arg6, arg4, arg0);
            }
        }
        ++field6238;
        if (arg1 <= 40) {
            this.method2678((class89) null, -86, -17);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Z", line = 137)
    public final boolean method68(int arg0) {
        ++field6252;
        int var2 = -33 % ((arg0 - 2) / 57);
        return this.field6241;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lvc;B)V", line = 148)
    public final void method85(class89 arg0, byte arg1) {
        ++field6255;
        if (arg1 == -24) {
            Object var3 = null;
            class183 var5;
            if (this.field6256 == null && this.field6237) {
                class406 var4 = this.method2676(true, arg0, 131072, 37);
                var5 = var4 != null ? var4.field5541 : null;
            } else {
                var5 = this.field6256;
                this.field6256 = null;
            }
            if (var5 != null) {
                class404.method2425(var5, this.field6251, super.field5391, super.field5386, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZLvc;)V", line = 175)
    public final void method86(boolean arg0, class89 arg1) {
        ++field6236;
        if (arg0) {
            this.field6251 = 15;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I", line = 186)
    public final int method71(byte arg0) {
        ++field6244;
        return arg0 < 81 ? 18 : this.field6234;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLvc;II)Lco;", line = 202)
    private final class406 method2676(boolean arg0, class89 arg1, int arg2, int arg3) {
        ++field6247;
        class267 var5 = class468.field6599.method506(-122, 65535 & this.field6258);
        class241 var6;
        class241 var7;
        if (this.field6253) {
            var6 = class190.field2858[0];
            var7 = class427.field5960[this.field6251];
        } else {
            if (~this.field6251 > -4) {
                var6 = class190.field2858[this.field6251 - -1];
            } else {
                var6 = null;
            }
            var7 = class190.field2858[this.field6251];
        }
        if (arg3 <= 0) {
            this.field6251 = -80;
        }
        return var5.method1811(super.field5386, true, var6, arg0, this.field6234, arg2, arg1, super.field5391, 22, super.field5390, var7);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V", line = 237)
    public final void method75(byte arg0) {
        ++field6246;
        this.field6241 = false;
        if (this.field6240 != null) {
            this.field6240.method1588(this.field6240.method1574() & -32769);
        }
        if (arg0 != 111) {
            this.method83((byte) 6);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILvc;II)Z", line = 258)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field6250;
        if (arg0 != 0) {
            this.method78(true, (class89) null);
        }
        class468 var5 = this.method2678(arg1, 18619, 65536);
        if (var5 != null) {
            class257 var6 = arg1.method306();
            var6.method96(super.field5391, super.field5390, super.field5386);
            return var5.method1593(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I", line = 279)
    public final int method80(int arg0) {
        ++field6248;
        if (arg0 != 10143) {
            this.field6251 = -88;
        }
        return this.field6258 & 65535;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lct;", line = 292)
    public static final class334 method2677(int arg0) {
        ++field6259;
        if (arg0 >= -116) {
            return null;
        } else {
            class334 var1 = (class334) class402.field5511.method1955(0);
            if (var1 != null) {
                var1.method2714(47);
                var1.method479((byte) -8);
                return var1;
            } else {
                class334 var2;
                do {
                    var2 = (class334) class270.field3937.method1955(0);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method2106(13) < ~class10.method51(-3183)) {
                        return null;
                    }
                    var2.method2714(63);
                    var2.method479((byte) -8);
                } while ((var2.field713 & Long.MIN_VALUE) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Z", line = 333)
    public final boolean method82(byte arg0) {
        ++field6235;
        if (arg0 < 89) {
            this.field6234 = 58;
        }
        return this.field6237;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILvc;)Ln;", line = 345)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        ++field6257;
        if (arg0 != -106) {
            method2677(-81);
        }
        return this.method2678(arg2, 18619, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lvc;II)Ln;", line = 356)
    private final class468 method2678(class89 arg0, int arg1, int arg2) {
        if (arg1 != 18619) {
            this.method69((class89) null, 107);
        }
        ++field6245;
        if (this.field6240 != null && arg0.method362(this.field6240.method1574(), arg2) == 0) {
            return this.field6240;
        } else {
            class406 var4 = this.method2676(false, arg0, arg2, 83);
            return var4 != null ? var4.field5545 : null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I", line = 380)
    public static final int method2679(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field6243;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return -arg0 + 1023;
        } else {
            return arg3 != -14767 ? -21 : -arg2 + 1023;
        }
    }
}
