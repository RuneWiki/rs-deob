import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class77 extends class255 implements class196 {

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "B")
    private byte field1051;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Z")
    private boolean field1039;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "B")
    private byte field1047;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "S")
    private short field1042;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "B")
    private byte field1045;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "Z")
    private boolean field1048;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Z")
    private boolean field1060;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "Lj;")
    private class229 field1050;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lc;")
    private class201 field1043;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "[I")
    public static int[] field1054 = new int[14];

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Lpg;")
    public static class492 field1040 = new class492(17, 2);

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "[F")
    public static float[] field1062 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "[[I")
    public static int[][] field1063 = new int[128][128];

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        ++field1037;
        return arg0 != 25707 ? 106 : this.field1042 & 65535;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILqa;)Lc;")
    private final class201 method507(int arg0, int arg1, class496 arg2) {
        ++field1059;
        if (this.field1043 != null && ~arg2.method1141(this.field1043.method279(), arg1) == -1) {
            return this.field1043;
        } else {
            class454 var4 = this.method508((byte) 114, false, arg2, arg1);
            if (arg0 != -1) {
                this.field1047 = -125;
            }
            return var4 == null ? null : var4.field6670;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZLqa;I)Lfo;")
    private final class454 method508(byte arg0, boolean arg1, class496 arg2, int arg3) {
        ++field1056;
        class130 var5 = class56.field755.method2031(120, 65535 & this.field1042);
        if (arg0 < 83) {
            this.method508((byte) 51, true, (class496) null, -19);
        }
        class206 var6;
        class206 var7;
        if (this.field1039) {
            var6 = class187.field2632[this.field1051];
            var7 = class204.field2871[0];
        } else {
            var6 = class204.field2871[this.field1051];
            if (this.field1051 >= 3) {
                var7 = null;
            } else {
                var7 = class204.field2871[this.field1051 + 1];
            }
        }
        return var5.method831(3, arg3, this.field1045, super.field3534, super.field3533, this.field1047, var6, var7, arg1, arg2, super.field3532);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field1058;
        return arg0 != 63 ? 65 : this.field1045;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        ++field1052;
        if (this.field1043 != null) {
            this.field1043.method295();
        }
        int var2 = -101 % ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        ++field1061;
        int var3 = -98 % ((59 - arg0) / 60);
        Object var4 = null;
        class229 var6;
        if (this.field1050 == null && this.field1060) {
            class454 var5 = this.method508((byte) 99, true, arg1, 262144);
            var6 = var5 == null ? null : var5.field6667;
        } else {
            var6 = this.field1050;
            this.field1050 = null;
        }
        if (var6 != null) {
            class220.method1489(var6, this.field1051, super.field3534, super.field3533, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field1049;
        if (this.field1043 == null) {
            return null;
        } else {
            class23 var3 = arg0.method1088();
            var3.method185(super.field3534 + super.field3531, super.field3532, super.field3533 + super.field3525);
            if (arg1 != -150) {
                return null;
            } else {
                class507 var4 = null;
                if (this.field1048) {
                    var4 = class82.method527(1, 1761171873);
                }
                this.field1043.method318(var3, var4 == null ? null : var4.field7549[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)I")
    public final int method509(int arg0) {
        if (arg0 != -4) {
            this.method60((byte) 97);
        }
        ++field1055;
        return this.field1043 != null ? this.field1043.method306() : 0;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lqa;Leu;IIIIZIIIII)V")
    public class77(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class392.method2410(arg10, arg11, (byte) 6));
        this.field1051 = (byte) arg2;
        this.field1039 = arg6;
        this.field1047 = (byte) arg11;
        super.field3533 = arg5;
        this.field1042 = (short) arg1.field1826;
        this.field1045 = (byte) arg10;
        super.field3534 = arg3;
        this.field1048 = arg1.field1886 != 0 && !arg6;
        this.field1060 = arg0.method1145() && arg1.field1884 && !this.field1039 && class96.field1399.method2170(class441.field6563, true) != 0;
        class454 var13 = this.method508((byte) 93, this.field1060, arg0, 2048);
        if (var13 != null) {
            this.field1050 = var13.field6667;
            this.field1043 = var13.field6670;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        ++field1057;
        if (arg0 != -126) {
            field1036 = 122;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        ++field1038;
        if (arg0 > -108) {
            field1062 = null;
        }
        return this.field1060;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        if (arg0 != -7234) {
            return -111;
        } else {
            ++field1041;
            return this.field1047;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        if (arg0 > -31) {
            this.method56(70, 42, 18, (class496) null);
        }
        ++field1044;
        Object var3 = null;
        class229 var5;
        if (this.field1050 == null && this.field1060) {
            class454 var4 = this.method508((byte) 114, true, arg1, 262144);
            var5 = var4 != null ? var4.field6667 : null;
        } else {
            var5 = this.field1050;
            this.field1050 = null;
        }
        if (var5 != null) {
            class457.method2753(var5, this.field1051, super.field3534, super.field3533, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        int var4 = -25 % ((-62 - arg2) / 39);
        ++field1053;
        return this.method507(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field1046;
        if (arg1 != 3) {
            return false;
        } else {
            class201 var5 = this.method507(-1, 131072, arg3);
            if (var5 != null) {
                class23 var6 = arg3.method1088();
                var6.method185(super.field3534, super.field3532, super.field3533);
                return var5.method310(arg0, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public static final void method510(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6260 != null) {
                var3.field6260 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public static void method511(byte arg0) {
        field1054 = null;
        field1040 = null;
        field1063 = null;
        field1062 = null;
        if (arg0 != 82) {
            method510(-84, 23, 75);
        }
    }

    static {
        new class375("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field1064 = 0;
    }
}
