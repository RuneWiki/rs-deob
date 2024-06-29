import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class564 extends class244 implements class614 {

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "Z")
    private boolean field7949 = false;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "Lkh;")
    public class15 field7959;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Z")
    private boolean field7946;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field7954 = 0;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
    public static boolean field7948 = false;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field7962 = 0;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "Lso;")
    public static class433 field7957 = new class433();

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "Lut;")
    public static class109 field7964;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Lq;")
    public static class391 field7945;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lpu;")
    public static class522 field7966;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Lnu;")
    private class548 field7955;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "[Lmc;")
    public static class119[] field7965;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
    public static void method3221(int arg0) {
        field7966 = null;
        field7957 = null;
        if (arg0 != 2048) {
            method3221(-97);
        }
        field7964 = null;
        field7945 = null;
        field7965 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
    public final int method1175(int arg0) {
        ++field7947;
        return arg0 != 24563 ? -67 : this.field7959.field151;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILr;)V")
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 == 0) {
            ++field7953;
            class55 var3 = this.field7959.method87((byte) -97, true, arg1, 262144, true, super.field3029, super.field3024);
            if (var3 != null) {
                int var4 = super.field3024 >> 9;
                int var5 = super.field3029 >> 9;
                class391 var6 = arg1.method130();
                var6.method252(super.field3024, super.field3018, super.field3029);
                this.field7959.method79(var3, var5, var4, var6, false, var4, var5, -1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lr;I)V")
    public final void method1172(class166 arg0, int arg1) {
        ++field7960;
        this.field7959.method88((byte) -55, arg0);
        if (arg1 < 26) {
            this.method1174(-71);
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        ++field7944;
        int var2 = 107 % ((-1 - arg0) / 59);
        return this.field7949;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lr;Let;IIIIIZIII)V")
    public class564(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class204.method1353(arg9, arg8, -4));
        this.field7959 = new class15(arg0, arg1, arg8, arg9, super.field3019, arg3, super.field3024, super.field3029, arg7, arg10);
        this.field7946 = arg1.field7746 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        ++field7950;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILr;)Lnu;")
    public final class548 method1183(int arg0, class166 arg1) {
        ++field7943;
        return arg0 != 6433 ? null : this.field7955;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lr;Z)V")
    public final void method1176(class166 arg0, boolean arg1) {
        ++field7941;
        this.field7959.method91((byte) -40, arg0);
        if (arg1) {
            field7962 = -108;
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        int var2 = 59 / ((-44 - arg0) / 42);
        ++field7939;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        if (arg0 != -1) {
            this.method1171((byte) 45);
        }
        ++field7935;
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3222(String arg0, String arg1, String arg2, int arg3) {
        ++field7952;
        if (arg3 != 0) {
            field7964 = null;
        }
        for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, var4 - -arg0.length())) {
            arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg1.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
    public final boolean method1180(int arg0) {
        if (arg0 < 100) {
            method3222((String) null, (String) null, (String) null, -95);
        }
        ++field7958;
        return this.field7959.method81((byte) -121);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lr;Z)Lkq;")
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field7942;
        class55 var3 = this.field7959.method87((byte) -97, false, arg0, 2048, true, super.field3029, super.field3024);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg0.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            class549 var5 = null;
            if (this.field7946) {
                var5 = class26.method321(1, 0);
            }
            int var6 = super.field3024 >> 9;
            int var7 = super.field3029 >> 9;
            this.field7959.method79(var3, var7, var6, var4, arg1, var6, var7, -1, arg0);
            if (class676.field9574) {
                var3.method495(var4, var5 != null ? var5.field7711[0] : null, class341.field5008, 0);
            } else {
                var3.method513(var4, var5 != null ? var5.field7711[0] : null, 0);
            }
            if (this.field7959.field134 != null) {
                class499 var8 = this.field7959.field134.method339();
                if (class676.field9574) {
                    arg0.method165(var8, class341.field5008);
                } else {
                    arg0.method156(var8);
                }
            }
            this.field7949 = var3.method545() || this.field7959.field134 != null;
            if (this.field7955 != null) {
                class525.method3017(var3, -64, this.field7955, super.field3018, super.field3029, super.field3024);
            } else {
                this.field7955 = class149.method1060(super.field3029, super.field3024, var3, false, super.field3018);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
    public final int method1171(byte arg0) {
        ++field7936;
        if (arg0 <= 39) {
            field7954 = -103;
        }
        return this.field7959.method89(-82);
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        ++field7956;
        return arg0 > -26;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        if (arg0 != -26798) {
            field7948 = false;
        }
        ++field7940;
        class55 var5 = this.field7959.method87((byte) -97, false, arg2, 131072, false, super.field3029, super.field3024);
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            return !class676.field9574 ? var5.method529(arg3, arg1, var6, false) : var5.method492(arg3, arg1, var6, false, class341.field5008);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
    public final int method1186(int arg0) {
        ++field7937;
        if (arg0 != -9960) {
            field7945 = null;
        }
        return this.field7959.field140;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public final void method1174(int arg0) {
        if (arg0 != -24082) {
            field7954 = -95;
        }
        ++field7938;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)I")
    public final int method1182(int arg0) {
        if (arg0 != -32768) {
            this.method1177(70, (class166) null);
        }
        ++field7951;
        return this.field7959.method84(true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I")
    public final int method1179(boolean arg0) {
        if (!arg0) {
            method3222((String) null, (String) null, (String) null, -67);
        }
        ++field7961;
        return this.field7959.field148;
    }
}
