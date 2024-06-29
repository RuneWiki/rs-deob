import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class651 extends class203 implements class226 {

    @OriginalMember(owner = "client!paa", name = "sb", descriptor = "Z")
    private boolean field9229;

    @OriginalMember(owner = "client!paa", name = "X", descriptor = "S")
    private short field9208;

    @OriginalMember(owner = "client!paa", name = "Q", descriptor = "Z")
    private boolean field9201;

    @OriginalMember(owner = "client!paa", name = "xb", descriptor = "B")
    private byte field9234;

    @OriginalMember(owner = "client!paa", name = "R", descriptor = "Z")
    private boolean field9202;

    @OriginalMember(owner = "client!paa", name = "rb", descriptor = "Z")
    private boolean field9228;

    @OriginalMember(owner = "client!paa", name = "ib", descriptor = "Lr;")
    private class115 field9219;

    @OriginalMember(owner = "client!paa", name = "cb", descriptor = "Lka;")
    private class233 field9213;

    @OriginalMember(owner = "client!paa", name = "jb", descriptor = "Lin;")
    public static class380 field9220 = new class380(51, 4);

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!paa", name = "T", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!paa", name = "U", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!paa", name = "V", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!paa", name = "W", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!paa", name = "Y", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!paa", name = "Z", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!paa", name = "ab", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!paa", name = "bb", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!paa", name = "db", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!paa", name = "eb", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!paa", name = "gb", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!paa", name = "hb", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!paa", name = "kb", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!paa", name = "lb", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!paa", name = "mb", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!paa", name = "qb", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!paa", name = "tb", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!paa", name = "ub", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!paa", name = "vb", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!paa", name = "wb", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!paa", name = "fb", descriptor = "Lmg;")
    private class248 field9216;

    @OriginalMember(owner = "client!paa", name = "ob", descriptor = "Lin;")
    public static class380 field9225;

    @OriginalMember(owner = "client!paa", name = "pb", descriptor = "Lgga;")
    public static class513 field9226;

    @OriginalMember(owner = "client!paa", name = "nb", descriptor = "[I")
    public static int[] field9224;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I", line = 3)
    public final int method1165(byte arg0) {
        ++field9222;
        return arg0 < 89 ? 24 : 65535 & this.field9208;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;II)Lka;", line = 15)
    private final class233 method3666(class475 arg0, int arg1, int arg2) {
        ++field9232;
        if (this.field9213 != null && ~arg0.method497(this.field9213.method591(), arg2) == -1) {
            return this.field9213;
        } else {
            class529 var4 = this.method3667((byte) -107, arg2, arg0, false);
            if (arg1 != 15473) {
                this.method196(-90);
            }
            return var4 != null ? var4.field7375 : null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILha;)V", line = 43)
    public final void method1169(int arg0, class475 arg1) {
        ++field9221;
        if (arg0 != -10526) {
            this.method1175((byte) 106);
        }
        Object var3 = null;
        class115 var5;
        if (this.field9219 == null && this.field9228) {
            class529 var4 = this.method3667((byte) -117, 262144, arg1, true);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field9219;
            this.field9219 = null;
        }
        if (var5 != null) {
            class632.method3610(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "(I)V", line = 72)
    public final void method196(int arg0) {
        this.field9229 = false;
        if (arg0 != -10382) {
            method3670((class513) null, (int[]) null, -83, (class513) null);
        }
        ++field9200;
        if (this.field9213 != null) {
            this.field9213.method523(this.field9213.method591() & -65537);
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(Z)Z", line = 87)
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field9207;
            return this.field9229;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(BLha;)Lmg;", line = 98)
    public final class248 method205(byte arg0, class475 arg1) {
        if (this.field9216 == null) {
            this.field9216 = class229.method1563(super.field10350, super.field10358, (byte) -113, this.method3666(arg1, 15473, 0), super.field10347);
        }
        if (arg0 != 45) {
            this.method205((byte) 51, (class475) null);
        }
        ++field9215;
        return this.field9216;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Z", line = 114)
    public final boolean method1164(byte arg0) {
        if (arg0 != 4) {
            method3669(-75, 11, 0.05969692F, 112, -33, true, 120, -55, 116);
        }
        ++field9218;
        return this.field9228;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIZ)V", line = 126)
    public class651(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5709);
        this.field9229 = arg9;
        this.field9208 = (short) arg1.field5746;
        this.field9201 = ~arg1.field5754 != -1 && !arg7;
        super.field10350 = arg6;
        this.field9234 = (byte) arg8;
        this.field9202 = arg7;
        super.field10347 = arg4;
        this.field9228 = arg0.method500() && arg1.field5770 && !this.field9202 && ~class420.field5820.field9457.method3741(17539) != -1;
        int var11 = 2048;
        if (this.field9229) {
            var11 |= 65536;
        }
        class529 var12 = this.method3667((byte) -46, var11, arg0, this.field9228);
        if (var12 != null) {
            this.field9219 = var12.field7377;
            this.field9213 = var12.field7375;
            if (this.field9229) {
                this.field9213 = this.field9213.method585((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)V", line = 160)
    public final void method1172(byte arg0) {
        if (arg0 > 72) {
            ++field9210;
            if (this.field9213 != null) {
                this.field9213.method583();
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)I", line = 173)
    public final int method1167(int arg0) {
        ++field9204;
        if (arg0 < 75) {
            return -55;
        } else {
            return this.field9213 == null ? 0 : this.field9213.method534();
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BIILha;)Z", line = 184)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field9205;
        class233 var5 = this.method3666(arg3, 15473, 131072);
        if (var5 != null) {
            class765 var6 = arg3.method457();
            var6.method1568(super.field10347, super.field10358, super.field10350);
            return !class765.field10581 ? var5.method589(arg1, arg2, var6, false, 0) : var5.method584(arg1, arg2, var6, false, 0, class349.field4956);
        } else {
            int var7 = 53 / ((arg0 - 51) / 51);
            return false;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILha;)V", line = 208)
    public final void method1163(int arg0, class475 arg1) {
        ++field9211;
        Object var3 = null;
        if (arg0 != 18030) {
            field9226 = null;
        }
        class115 var5;
        if (this.field9219 == null && this.field9228) {
            class529 var4 = this.method3667((byte) -35, 262144, arg1, true);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field9219;
            this.field9219 = null;
        }
        if (var5 != null) {
            class460.method2686(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)I", line = 238)
    public final int method1173(boolean arg0) {
        if (!arg0) {
            this.method205((byte) 14, (class475) null);
        }
        ++field9214;
        return this.field9213 == null ? 0 : this.field9213.method544();
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BILha;Z)Liu;", line = 249)
    private final class529 method3667(byte arg0, int arg1, class475 arg2, boolean arg3) {
        ++field9231;
        class416 var5 = class312.field4418.method369((byte) 122, 65535 & this.field9208);
        if (arg0 > -34) {
            return null;
        } else {
            class419 var6;
            class419 var7;
            if (this.field9202) {
                var6 = class454.field6207[super.field10349];
                var7 = class495.field6799[0];
            } else {
                if (super.field10349 >= 3) {
                    var7 = null;
                } else {
                    var7 = class495.field6799[super.field10349 + 1];
                }
                var6 = class495.field6799[super.field10349];
            }
            return var5.method2447(-106, this.field9234, 22, super.field10350, arg1, arg3, super.field10358, var7, (class685) null, super.field10347, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "(B)Z", line = 279)
    public final boolean method1175(byte arg0) {
        if (arg0 <= 38) {
            this.field9228 = true;
        }
        ++field9233;
        return this.field9213 != null ? this.field9213.method558() : false;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I", line = 294)
    public final int method1166(int arg0) {
        int var2 = -98 % ((14 - arg0) / 62);
        ++field9217;
        return 22;
    }

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "(B)V", line = 305)
    public static void method3668(byte arg0) {
        field9226 = null;
        field9224 = null;
        field9225 = null;
        int var1 = -25 / ((arg0 - 49) / 49);
        field9220 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIFIIZIII)[[I", line = 317)
    public static final int[][] method3669(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field9230;
        int[][] var9 = new int[arg8][arg4];
        class558 var10 = new class558();
        var10.field7744 = arg5;
        var10.field7740 = arg3;
        var10.field7753 = (int) (arg2 * 4096.0F);
        var10.field7746 = arg7;
        var10.field7750 = arg1;
        var10.method27((byte) -78);
        class242.method1611(arg8, -1, arg4);
        for (int var11 = arg6; var11 < arg8; ++var11) {
            var10.method3252(var9[var11], var11, arg6 + -125);
        }
        return var9;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lgga;[IILgga;)V", line = 345)
    public static final void method3670(class513 arg0, int[] arg1, int arg2, class513 arg3) {
        field9226 = arg0;
        class447.field6172 = arg3;
        if (arg1 != null) {
            class40.field468 = arg1;
        }
        ++field9209;
        if (arg2 != 65535) {
            field9225 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lha;I)Luh;", line = 362)
    public final class162 method204(class475 arg0, int arg1) {
        ++field9223;
        if (arg1 != -1) {
            method3669(-74, 118, 2.154196F, 117, -56, true, 12, 91, -65);
        }
        if (this.field9213 == null) {
            return null;
        } else {
            class765 var3 = arg0.method457();
            var3.method1568(super.field10347, super.field10358, super.field10350);
            class162 var4 = class527.method3085(1, this.field9201, 0);
            if (!class765.field10581) {
                this.field9213.method575(var3, var4.field2500[0], 0);
            } else {
                this.field9213.method546(var3, var4.field2500[0], class349.field4956, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 389)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field9227;
        if (arg0 == -24659) {
            if (arg4 instanceof class651) {
                class651 var8 = (class651) arg4;
                if (this.field9213 != null && var8.field9213 != null) {
                    this.field9213.method559(var8.field9213, arg1, arg6, arg2, arg5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(ILha;)V", line = 419)
    public final void method192(int arg0, class475 arg1) {
        ++field9206;
        if (arg0 < 2) {
            this.field9219 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)Z", line = 433)
    public final boolean method1170(int arg0) {
        ++field9203;
        if (arg0 != 16383) {
            this.method3666((class475) null, 7, 83);
        }
        if (this.field9213 == null) {
            return true;
        } else {
            return !this.field9213.method587();
        }
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)I", line = 449)
    public final int method1174(byte arg0) {
        ++field9212;
        int var2 = -11 / ((-63 - arg0) / 47);
        return this.field9234;
    }
}
