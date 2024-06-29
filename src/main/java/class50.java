import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends class141 {

    @OriginalMember(owner = "client!ha", name = "Vc", descriptor = "I")
    public int field1047 = 0;

    @OriginalMember(owner = "client!ha", name = "Pc", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "client!ha", name = "Sc", descriptor = "I")
    public int field1044 = 0;

    @OriginalMember(owner = "client!ha", name = "bd", descriptor = "I")
    public int field1053 = -1;

    @OriginalMember(owner = "client!ha", name = "dd", descriptor = "I")
    public int field1055 = 0;

    @OriginalMember(owner = "client!ha", name = "Wc", descriptor = "Z")
    public boolean field1048 = false;

    @OriginalMember(owner = "client!ha", name = "fd", descriptor = "I")
    public int field1057 = 0;

    @OriginalMember(owner = "client!ha", name = "Lc", descriptor = "I")
    public int field1037 = 0;

    @OriginalMember(owner = "client!ha", name = "Dc", descriptor = "[B")
    public static byte[] field1029 = new byte[520];

    @OriginalMember(owner = "client!ha", name = "Oc", descriptor = "[Lpe;")
    public static class109[] field1040 = new class109[8];

    @OriginalMember(owner = "client!ha", name = "Gc", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!ha", name = "Yc", descriptor = "Lpe;")
    private static class109 field1050 = class141.method1120("Please wait )2 attempting to reestablish", 0);

    @OriginalMember(owner = "client!ha", name = "Mc", descriptor = "Lpe;")
    public static class109 field1038 = field1050;

    @OriginalMember(owner = "client!ha", name = "Tc", descriptor = "[I")
    public static int[] field1045 = new int[100];

    @OriginalMember(owner = "client!ha", name = "Ac", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ha", name = "Bc", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ha", name = "Cc", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ha", name = "Hc", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ha", name = "Ic", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ha", name = "Jc", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!ha", name = "Nc", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ha", name = "Qc", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!ha", name = "Rc", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ha", name = "Xc", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!ha", name = "ad", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ha", name = "cd", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ha", name = "ed", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ha", name = "gd", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!ha", name = "hd", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!ha", name = "id", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!ha", name = "Zc", descriptor = "Lpe;")
    public class109 field1051;

    @OriginalMember(owner = "client!ha", name = "Kc", descriptor = "Lre;")
    public static class123 field1036;

    @OriginalMember(owner = "client!ha", name = "zc", descriptor = "Lbf;")
    public class14 field1025;

    @OriginalMember(owner = "client!ha", name = "Fc", descriptor = "Lwb;")
    public class155 field1031;

    @OriginalMember(owner = "client!ha", name = "Ec", descriptor = "Lna;")
    public static class91 field1030;

    @OriginalMember(owner = "client!ha", name = "Uc", descriptor = "[I")
    public static int[] field1046;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static final void method424(int arg0) {
        for (class126 var1 = (class126) class14.field370.method195((byte) 123); var1 != null; var1 = (class126) class14.field370.method198((byte) -74)) {
            if (var1.field2783 != null) {
                var1.method1023(arg0 ^ 24736);
            }
        }
        if (arg0 != -24737) {
            field1029 = null;
        }
        ++field1034;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method425(byte arg0) {
        field1029 = null;
        field1040 = null;
        field1045 = null;
        field1050 = null;
        field1046 = null;
        if (arg0 == 104) {
            field1036 = null;
            field1030 = null;
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Z")
    public final boolean method426(boolean arg0) {
        ++field1028;
        if (this.field1025 == null) {
            return false;
        } else {
            if (arg0) {
                this.field1042 = -11;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lna;Lpe;Lpe;I)[Lk;")
    public static final class69[] method427(class91 arg0, class109 arg1, class109 arg2, int arg3) {
        if (arg3 < 69) {
            method425((byte) -66);
        }
        ++field1043;
        int var4 = arg0.method766(43, arg1);
        int var5 = arg0.method743((byte) 125, arg2, var4);
        return class121.method982(arg0, var4, -128, var5);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgd;")
    public static final class46 method428(Throwable arg0, String arg1) {
        class46 var2;
        if (!(arg0 instanceof class46)) {
            var2 = new class46(arg0, arg1);
        } else {
            var2 = (class46) arg0;
            var2.field959 = var2.field959 + ' ' + arg1;
        }
        ++field1056;
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Lwb;")
    public final class155 method16(int arg0) {
        ++field1039;
        if (this.field1025 == null) {
            return null;
        } else {
            if (arg0 != 9698) {
                method428((Throwable) null, (String) null);
            }
            class6 var2 = super.field3124 != -1 && ~super.field3081 == -1 ? class27.method238(8, super.field3124) : null;
            class6 var3 = super.field3060 == -1 || this.field1048 || ~super.field3113 == ~super.field3060 && var2 != null ? null : class27.method238(8, super.field3060);
            class155 var4 = this.field1025.method160(super.field3122, super.field3067, var3, var2, (byte) -44);
            if (var4 == null) {
                return null;
            } else {
                var4.method1208();
                super.field3087 = var4.field1780;
                if (!this.field1048 && super.field3128 != -1 && super.field3065 != -1) {
                    class155 var5 = class85.method716((byte) 124, super.field3128).method712(super.field3065, 98);
                    if (var5 != null) {
                        var5.method1200(0, -super.field3062, 0);
                        class155[] var6 = new class155[] { var4, var5 };
                        var4 = new class155(var6, 2);
                    }
                }
                if (!this.field1048 && this.field1031 != null) {
                    if (~this.field1055 >= ~class12.field264) {
                        this.field1031 = null;
                    }
                    if (~this.field1044 >= ~class12.field264 && this.field1055 > class12.field264) {
                        class155 var7 = this.field1031;
                        var7.method1200(-super.field3094 + this.field1060, -this.field1054 + this.field1049, -super.field3106 + this.field1035);
                        if (super.field3111 != 512) {
                            if (super.field3111 != 1024) {
                                if (super.field3111 == 1536) {
                                    var7.method1210();
                                }
                            } else {
                                var7.method1210();
                                var7.method1210();
                            }
                        } else {
                            var7.method1210();
                            var7.method1210();
                            var7.method1210();
                        }
                        class155[] var8 = new class155[] { var4, var7 };
                        var4 = new class155(var8, 2);
                        if (~super.field3111 != -513) {
                            if (~super.field3111 == -1025) {
                                var7.method1210();
                                var7.method1210();
                            } else if (super.field3111 == 1536) {
                                var7.method1210();
                                var7.method1210();
                                var7.method1210();
                            }
                        } else {
                            var7.method1210();
                        }
                        var7.method1200(super.field3094 - this.field1060, this.field1054 - this.field1049, super.field3106 - this.field1035);
                    }
                }
                var4.field3523 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLbe;)V")
    public final void method429(byte arg0, class13 arg1) {
        arg1.field309 = 0;
        ++field1026;
        int var3 = arg1.method142(27467);
        int var4 = -1;
        this.field1053 = arg1.method131(false);
        this.field1041 = arg1.method131(false);
        this.field1057 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method142(27467);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg1.method142(27467);
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && ~var5[0] == -65536) {
                    var4 = arg1.method105(arg0 ^ 1375221179);
                    break;
                }
                if (~var5[var6] <= -513) {
                    int var12 = class4.method43((byte) 94, var5[var6] + -512).field2428;
                    if (~var12 != -1) {
                        this.field1057 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method142(27467);
            if (var11 < 0 || ~var11 <= ~class128.field2839[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field3113 = arg1.method105(1375221240);
        if (~super.field3113 == -65536) {
            super.field3113 = -1;
        }
        super.field3055 = arg1.method105(1375221240);
        if (~super.field3055 == -65536) {
            super.field3055 = -1;
        }
        super.field3075 = super.field3055;
        super.field3108 = arg1.method105(1375221240);
        if (~super.field3108 == -65536) {
            super.field3108 = -1;
        }
        super.field3064 = arg1.method105(1375221240);
        if (~super.field3064 == -65536) {
            super.field3064 = -1;
        }
        super.field3109 = arg1.method105(1375221240);
        if (~super.field3109 == -65536) {
            super.field3109 = -1;
        }
        super.field3076 = arg1.method105(1375221240);
        if (super.field3076 == 65535) {
            super.field3076 = -1;
        }
        super.field3090 = arg1.method105(1375221240);
        if (~super.field3090 == -65536) {
            super.field3090 = -1;
        }
        if (arg0 != 67) {
            field1030 = null;
        }
        this.field1051 = class72.method582(false, arg1.method116(0)).method902((byte) 42);
        this.field1047 = arg1.method142(27467);
        this.field1037 = arg1.method105(arg0 + 1375221173);
        if (this.field1025 == null) {
            this.field1025 = new class14();
        }
        this.field1025.method164(var9, (byte) -123, var4, var5, ~var3 == -2);
    }
}
