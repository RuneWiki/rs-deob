import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class457 extends class203 implements class226 {

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "Z")
    private boolean field6247 = false;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "Lnb;")
    public class356 field6240;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "Z")
    private boolean field6248;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lmg;")
    private class248 field6250;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "Ljava/awt/Font;")
    public static Font field6237;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILha;Lnfa;ZI)V")
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        if (arg0 != -24659) {
            this.method1163(-30, (class475) null);
        }
        ++field6253;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
    public final int method1166(int arg0) {
        int var2 = 35 / ((arg0 - 14) / 62);
        ++field6242;
        return this.field6240.field5067;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z")
    public final boolean method1164(byte arg0) {
        if (arg0 != 4) {
            return false;
        } else {
            ++field6245;
            return this.field6240.method2155((byte) -128);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(BLha;)Lmg;")
    public final class248 method205(byte arg0, class475 arg1) {
        if (arg0 != 45) {
            this.field6250 = null;
        }
        ++field6243;
        return this.field6250;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I")
    public final int method1167(int arg0) {
        ++field6236;
        if (arg0 < 75) {
            this.field6240 = null;
        }
        return this.field6240.method2147(63);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILpe;)V")
    public final void method2676(int arg0, class685 arg1) {
        if (arg0 == 1) {
            this.field6240.method2153(arg1, true);
            ++field6254;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILha;)V")
    public final void method1163(int arg0, class475 arg1) {
        ++field6249;
        this.field6240.method2158(arg1, -9152);
        if (arg0 != 18030) {
            this.field6250 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lha;I)Luh;")
    public final class162 method204(class475 arg0, int arg1) {
        ++field6255;
        class233 var3 = this.field6240.method2152(true, arg0, -118, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class765 var4 = arg0.method457();
            var4.method1568(super.field10347, super.field10358, super.field10350);
            class162 var5 = class527.method3085(1, this.field6248, 0);
            if (arg1 != -1) {
                return null;
            } else {
                int var6 = super.field10347 >> 9;
                int var7 = super.field10350 >> 9;
                this.field6240.method2148(var7, (byte) 111, var6, var4, var3, var7, true, arg0, var6);
                if (class765.field10581) {
                    var3.method546(var4, var5.field2500[0], class349.field4956, 0);
                } else {
                    var3.method575(var4, var5.field2500[0], 0);
                }
                if (this.field6240.field5071 != null) {
                    class667 var8 = this.field6240.field5071.method1346();
                    if (class765.field10581) {
                        arg0.method429(var8, class349.field4956);
                    } else {
                        arg0.method455(var8);
                    }
                }
                this.field6247 = var3.method558() || this.field6240.field5071 != null;
                if (this.field6250 != null) {
                    class182.method1319(super.field10350, super.field10347, super.field10358, this.field6250, var3, (byte) 70);
                } else {
                    this.field6250 = class229.method1563(super.field10350, super.field10358, (byte) -120, var3, super.field10347);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I")
    public final int method1173(boolean arg0) {
        ++field6238;
        if (!arg0) {
            this.method1167(-108);
        }
        return this.field6240.method2159(-77);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)I")
    public final int method1174(byte arg0) {
        int var2 = -118 / ((arg0 - -63) / 47);
        ++field6239;
        return this.field6240.field5040;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)Z")
    public final boolean method1175(byte arg0) {
        ++field6252;
        if (arg0 < 38) {
            this.field6248 = true;
        }
        return this.field6247;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z")
    public final boolean method1170(int arg0) {
        if (arg0 != 16383) {
            this.method196(72);
        }
        ++field6251;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I")
    public final int method1165(byte arg0) {
        ++field6233;
        if (arg0 <= 89) {
            field6237 = null;
        }
        return this.field6240.field5054;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(ILha;)V")
    public final void method1169(int arg0, class475 arg1) {
        this.field6240.method2157(arg1, (byte) 70);
        ++field6232;
        if (arg0 != -10526) {
            this.field6250 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(ILha;)V")
    public final void method192(int arg0, class475 arg1) {
        if (arg0 >= 2) {
            ++field6234;
            class233 var3 = this.field6240.method2152(true, arg1, -123, 262144, true);
            if (var3 != null) {
                int var4 = super.field10347 >> 9;
                int var5 = super.field10350 >> 9;
                class765 var6 = arg1.method457();
                var6.method1568(super.field10347, super.field10358, super.field10350);
                this.field6240.method2148(var5, (byte) 111, var4, var6, var3, var5, false, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZII)V")
    public class457(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5709);
        this.field6240 = new class356(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field6248 = ~arg1.field5754 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIILha;)Z")
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field6256;
        class233 var5 = this.field6240.method2152(false, arg3, -117, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class765 var6 = arg3.method457();
            int var7 = 70 % ((51 - arg0) / 51);
            var6.method1568(super.field10347, super.field10358, super.field10350);
            return class765.field10581 ? var5.method584(arg1, arg2, var6, false, 0, class349.field4956) : var5.method589(arg1, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        ++field6241;
        if (arg0 <= 72) {
            this.method204((class475) null, -117);
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(B)V")
    public static void method2677(byte arg0) {
        if (arg0 > 17) {
            field6237 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public final void method196(int arg0) {
        ++field6244;
        if (arg0 != -10382) {
            this.field6248 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)Z")
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            this.method205((byte) 31, (class475) null);
        }
        ++field6246;
        return false;
    }
}
