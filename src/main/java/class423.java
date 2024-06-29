import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class423 extends class46 implements class9 {

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "Lee;")
    public class404 field6042;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "Z")
    private boolean field6051;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "Liq;")
    public static class362 field6037 = new class362("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "[I")
    public static int[] field6052 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "Z")
    public static boolean field6055 = false;

    @OriginalMember(owner = "client!ip", name = "T", descriptor = "Liq;")
    public static class362 field6057;

    @OriginalMember(owner = "client!ip", name = "U", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ip", name = "S", descriptor = "I")
    public static int field6056;

    static {
        new class362("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6057 = new class362("purple:", "lila:", "violet:", "roxo:");
        field6058 = 0;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method67(int arg0) {
        if (arg0 != -3673) {
            field6058 = -119;
        }
        ++field6050;
        return this.field6042.method2587(-19);
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)I", line = 17)
    public final int method68(int arg0) {
        ++field6039;
        if (arg0 <= 118) {
            this.method70((class134) null, true, 98);
        }
        return this.field6042.field5835;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILae;)V", line = 28)
    public final void method72(int arg0, class134 arg1) {
        int var3 = 123 % (arg0 / 55);
        this.field6042.method2585(arg1, (byte) -108);
        ++field6056;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)I", line = 39)
    public final int method71(byte arg0) {
        if (arg0 >= -36) {
            method2669(-90, (byte) -41);
        }
        ++field6043;
        return this.field6042.field5820;
    }

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "(I)[Lk;", line = 52)
    public static final class337[] method2667(int arg0) {
        if (class422.field6026 == null) {
            class337[] var1 = class167.method1129(class14.field185, 53);
            class337[] var2 = new class337[var1.length];
            int var3 = 0;
            label63: for (int var4 = 0; ~var4 > ~var1.length; ++var4) {
                class337 var8 = var1[var4];
                if ((~var8.field4785 >= -1 || ~var8.field4785 <= -25) && var8.field4783 >= 800 && var8.field4786 >= 600 && (~class268.field3812 <= -97 || ~class26.field329 != -1 || ~var8.field4783 >= -1025 && var8.field4786 <= 768)) {
                    for (int var9 = 0; ~var3 < ~var9; ++var9) {
                        class337 var10 = var2[var9];
                        if (~var8.field4783 == ~var10.field4783 && var8.field4786 == var10.field4786) {
                            if (var8.field4785 > var10.field4785) {
                                var2[var9] = var8;
                            }
                            continue label63;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class422.field6026 = new class337[var3];
            class316.method2074(var2, 0, class422.field6026, 0, var3);
            int[] var5 = new int[class422.field6026.length];
            for (int var6 = 0; var6 < class422.field6026.length; ++var6) {
                class337 var7 = class422.field6026[var6];
                var5[var6] = var7.field4786 * var7.field4783;
            }
            class117.method723(var5, class422.field6026, -67);
        }
        int var11 = -71 % ((33 - arg0) / 36);
        ++field6044;
        return class422.field6026;
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)V", line = 133)
    public final void method51(int arg0) {
        ++field6054;
        if (arg0 == 6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 144)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -104 % ((arg1 - -16) / 62);
        ++field6053;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 154)
    public final void method65(int arg0) {
        if (arg0 != 17184) {
            field6058 = -87;
        }
        ++field6046;
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)I", line = 171)
    public final int method69(int arg0) {
        if (arg0 != -5944) {
            return -42;
        } else {
            ++field6047;
            return this.field6042.field5804;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lae;I)V", line = 186)
    public final void method66(class134 arg0, int arg1) {
        if (arg1 != 4257) {
            this.field6042 = null;
        }
        this.field6042.method2572(arg1 ^ 4259, arg0);
        ++field6041;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lae;Ljh;IIIIIIZI)V", line = 197)
    public class423(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field996, arg1.field1059);
        this.field6042 = new class404(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field6051 = ~arg1.field998 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "(I)V", line = 206)
    public static void method2668(int arg0) {
        if (arg0 != -25) {
            field6052 = null;
        }
        field6052 = null;
        field6037 = null;
        field6057 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)Z", line = 222)
    public final boolean method54(boolean arg0) {
        ++field6048;
        if (!arg0) {
            this.method51(14);
        }
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lae;B)V", line = 244)
    public final void method64(class134 arg0, byte arg1) {
        ++field6036;
        class210 var3 = this.field6042.method2576(-12, true, 131072, arg0, super.field562, true, super.field560);
        if (var3 != null) {
            this.field6042.method2577(16287, super.field562 >> 7, super.field560 >> 7, super.field562 >> 7, false, arg0, var3, super.field560 >> 7);
        }
        if (arg1 > -50) {
            field6058 = 70;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V", line = 259)
    public static final void method2669(int arg0, byte arg1) {
        ++field6038;
        class20 var2 = class369.method2351((byte) 90, 1, arg0);
        var2.method148(-11806);
        if (arg1 != 13) {
            method2668(85);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLae;)Ljg;", line = 272)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field6049;
        class210 var3 = this.field6042.method2576(-12, false, 1024, arg1, super.field562, true, super.field560);
        if (var3 == null) {
            return null;
        } else {
            class18 var4 = arg1.method649();
            var4.method116(super.field560, super.field549, super.field562);
            class186 var5 = null;
            if (arg0 != -120) {
                this.field6051 = false;
            }
            if (this.field6051) {
                var5 = class348.method2229(1, 21534);
            }
            if (this.field6042.field5836 == null) {
                var3.method1416(var4, var5 != null ? var5.field2704[0] : null, 0);
            } else {
                class63 var6 = this.field6042.field5836.method1371();
                arg1.method588(var3, var6, var4, var5 == null ? null : var5.field2704[0], 0);
            }
            this.field6042.method2577(16287, super.field562 >> 7, super.field560 >> 7, super.field562 >> 7, true, arg1, var3, super.field560 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILae;II)Z", line = 309)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field6040;
        class210 var5 = this.field6042.method2576(-12, false, 65536, arg1, super.field562, false, super.field560);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 4835) {
                field6055 = true;
            }
            class18 var6 = arg1.method649();
            var6.method116(super.field560, super.field549, super.field562);
            return var5.method1382(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lae;ZI)Lbk;", line = 332)
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return null;
        } else {
            ++field6045;
            return this.field6042.method2576(-12, false, arg2, arg0, 0, false, 0);
        }
    }
}
