import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class651 extends class525 implements class559 {

    @OriginalMember(owner = "client!fea", name = "U", descriptor = "B")
    private byte field8943;

    @OriginalMember(owner = "client!fea", name = "bb", descriptor = "Z")
    private boolean field8950;

    @OriginalMember(owner = "client!fea", name = "db", descriptor = "Z")
    private boolean field8952;

    @OriginalMember(owner = "client!fea", name = "cb", descriptor = "Z")
    private boolean field8951;

    @OriginalMember(owner = "client!fea", name = "qb", descriptor = "B")
    private byte field8965;

    @OriginalMember(owner = "client!fea", name = "eb", descriptor = "S")
    private short field8953;

    @OriginalMember(owner = "client!fea", name = "W", descriptor = "Z")
    private boolean field8945;

    @OriginalMember(owner = "client!fea", name = "rb", descriptor = "Lka;")
    public class219 field8966;

    @OriginalMember(owner = "client!fea", name = "X", descriptor = "Lr;")
    private class108 field8946;

    @OriginalMember(owner = "client!fea", name = "R", descriptor = "F")
    public static float field8941 = 0.25F;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!fea", name = "Q", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!fea", name = "T", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!fea", name = "V", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!fea", name = "Y", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!fea", name = "Z", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!fea", name = "ab", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!fea", name = "fb", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!fea", name = "gb", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!fea", name = "hb", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!fea", name = "ib", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!fea", name = "jb", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!fea", name = "kb", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!fea", name = "lb", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!fea", name = "mb", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!fea", name = "nb", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!fea", name = "ob", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!fea", name = "pb", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "Lufa;")
    private class152 field8935;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lha;B)Lufa;")
    public final class152 method520(class454 arg0, byte arg1) {
        ++field8957;
        if (arg1 <= 114) {
            this.method516((byte) 107);
        }
        if (this.field8935 == null) {
            this.field8935 = class517.method2966(super.field5790, this.method3512(arg0, false, 0), super.field5784, 105, super.field5791);
        }
        return this.field8935;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)Z")
    public final boolean method739(byte arg0) {
        int var2 = -120 % (arg0 / 32);
        ++field8960;
        return this.field8945;
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(B)Z")
    public final boolean method265(byte arg0) {
        int var2 = 17 % ((61 - arg0) / 45);
        ++field8959;
        if (this.field8966 == null) {
            return true;
        } else {
            return !this.field8966.method1342();
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIIZ)V")
    public class651(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class507.method2932(arg9, arg8, 105));
        this.field8943 = (byte) arg8;
        this.field8950 = arg7;
        super.field5784 = arg6;
        this.field8952 = arg10;
        super.field5790 = arg4;
        this.field8951 = arg1.field3738 != 0 && !arg7;
        this.field8965 = (byte) arg9;
        this.field8953 = (short) arg1.field3771;
        this.field8945 = arg0.method88() && arg1.field3739 && !this.field8950 && class223.field2944.field628.method1256((byte) -121) != 0;
        int var12 = 2048;
        if (this.field8952) {
            var12 |= 65536;
        }
        class239 var13 = this.method3515(true, this.field8945, arg0, var12);
        if (var13 != null) {
            this.field8966 = var13.field3079;
            this.field8946 = var13.field3082;
            if (this.field8952) {
                this.field8966 = this.field8966.method1337((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;ZI)Lka;")
    private final class219 method3512(class454 arg0, boolean arg1, int arg2) {
        ++field8938;
        if (this.field8966 != null && ~arg0.method135(this.field8966.method1340(), arg2) == -1) {
            return this.field8966;
        } else {
            class239 var4 = this.method3515(!arg1, arg1, arg0, arg2);
            return var4 != null ? var4.field3079 : null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)I")
    public final int method247(int arg0) {
        if (arg0 != 0) {
            this.method3512((class454) null, true, 20);
        }
        ++field8958;
        return this.field8966 == null ? 0 : this.field8966.method1353();
    }

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(B)Z")
    public final boolean method256(byte arg0) {
        int var2 = 77 / ((arg0 - -1) / 36);
        ++field8947;
        return this.field8966 != null ? this.field8966.method1338() : false;
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        if (arg0 != 0) {
            this.method3515(false, false, (class454) null, 103);
        }
        ++field8956;
        this.field8952 = false;
        if (this.field8966 != null) {
            this.field8966.method1327(this.field8966.method1340() & -65537);
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(III)V")
    public static final void method3513(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        if (var3 != null) {
            class142.method877(var3.field964);
            class142.method877(var3.field971);
            if (var3.field964 != null) {
                var3.field964 = null;
            }
            if (var3.field971 != null) {
                var3.field971 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILha;)V")
    public final void method732(int arg0, class454 arg1) {
        ++field8955;
        if (arg0 != -10891) {
            this.method736((byte) -5);
        }
        Object var3 = null;
        class108 var5;
        if (this.field8946 == null && this.field8945) {
            class239 var4 = this.method3515(true, true, arg1, 262144);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field8946;
            this.field8946 = null;
        }
        if (var5 != null) {
            class586.method3264(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I")
    public final int method735(int arg0) {
        ++field8954;
        if (arg0 != 24123) {
            this.method256((byte) -61);
        }
        return this.field8953 & 65535;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZZ)V")
    public static final void method3514(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            ++class152.field1854;
            class239.method1493(-118);
        }
        ++field8944;
        if (arg1) {
            if (arg2) {
                ++class185.field2422;
                class599.method3304(-94);
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(B)Z")
    public final boolean method516(byte arg0) {
        if (arg0 > -67) {
            return true;
        } else {
            ++field8942;
            return this.field8952;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
    public final void method736(byte arg0) {
        ++field8939;
        if (arg0 <= -123) {
            if (this.field8966 != null) {
                this.field8966.method1376();
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(B)I")
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            return 16;
        } else {
            ++field8949;
            return this.field8966 != null ? this.field8966.method1333() : 0;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (!(arg2 instanceof class651)) {
            if (arg2 instanceof class293) {
                class293 var8 = (class293) arg2;
                if (this.field8966 != null && var8.field3814 != null) {
                    this.field8966.method1329(var8.field3814, arg4, arg6, arg5, arg0);
                }
            }
        } else {
            class651 var9 = (class651) arg2;
            if (this.field8966 != null && var9.field8966 != null) {
                this.field8966.method1329(var9.field8966, arg4, arg6, arg5, arg0);
            }
        }
        if (arg1 == 12473) {
            ++field8948;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;I)Lie;")
    public final class607 method509(class454 arg0, int arg1) {
        ++field8936;
        if (arg1 != -8964) {
            return null;
        } else if (this.field8966 == null) {
            return null;
        } else {
            class376 var3 = arg0.method114();
            var3.method1963(super.field5790, super.field5791, super.field5784);
            class607 var4 = class311.method1814(20, 1, this.field8951);
            if (!class306.field3936) {
                this.field8966.method1351(var3, var4.field8425[0], 0);
            } else {
                this.field8966.method1375(var3, var4.field8425[0], class468.field6738, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)I")
    public final int method741(int arg0) {
        ++field8961;
        if (arg0 <= 65) {
            this.method520((class454) null, (byte) -14);
        }
        return this.field8943;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)I")
    public final int method731(int arg0) {
        ++field8940;
        int var2 = -82 % ((arg0 - 36) / 42);
        return this.field8965;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIBLha;)Z")
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field8964;
        if (arg2 != -4) {
            field8941 = -0.07764834F;
        }
        class219 var5 = this.method3512(arg3, false, 131072);
        if (var5 != null) {
            class376 var6 = arg3.method114();
            var6.method1963(super.field5790, super.field5791, super.field5784);
            return class306.field3936 ? var5.method1357(arg0, arg1, var6, false, 0, class468.field6738) : var5.method1378(arg0, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lha;B)V")
    public final void method740(class454 arg0, byte arg1) {
        ++field8963;
        if (arg1 <= 16) {
            this.field8951 = true;
        }
        Object var3 = null;
        class108 var5;
        if (this.field8946 == null && this.field8945) {
            class239 var4 = this.method3515(true, true, arg0, 262144);
            var5 = var4 == null ? null : var4.field3082;
        } else {
            var5 = this.field8946;
            this.field8946 = null;
        }
        if (var5 != null) {
            class566.method3194(var5, super.field5792, super.field5790, super.field5784, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZLha;I)Lsca;")
    private final class239 method3515(boolean arg0, boolean arg1, class454 arg2, int arg3) {
        ++field8937;
        class290 var5 = class358.field5112.method890(65535 & this.field8953, false);
        if (!arg0) {
            field8941 = 1.0451337F;
        }
        class402 var6;
        class402 var7;
        if (this.field8950) {
            var6 = class109.field1341[super.field5792];
            var7 = class716.field10106[0];
        } else {
            if (~super.field5792 > -4) {
                var7 = class716.field10106[super.field5792 + 1];
            } else {
                var7 = null;
            }
            var6 = class716.field10106[super.field5792];
        }
        return var5.method1734(593, arg1, super.field5790, this.field8943, arg2, arg3, var7, super.field5791, this.field8965, var6, super.field5784);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZLha;)V")
    public final void method522(boolean arg0, class454 arg1) {
        if (arg0) {
            this.field8965 = 38;
        }
        ++field8962;
    }
}
