import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class107 extends class391 implements class466 {

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Z")
    private boolean field1256 = false;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "Lwm;")
    public class443 field1262;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "Z")
    private boolean field1269;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[[Z")
    public static boolean[][] field1253 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "Lfea;")
    public static class678 field1249 = new class678("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "Ltja;")
    private class491 field1261;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 9)
    public final void method81(byte arg0) {
        if (arg0 != 29) {
            this.method759((class413) null, -94);
        }
        ++field1257;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILha;)Lrk;", line = 20)
    public final class289 method74(int arg0, class473 arg1) {
        ++field1272;
        class231 var3 = this.field1262.method2660((byte) -88, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class12 var4 = arg1.method153();
            var4.method50(super.field3470, super.field3464, super.field3460);
            class289 var5 = class122.method863(1, (byte) 78, this.field1269);
            int var6 = super.field3470 >> 9;
            int var7 = super.field3460 >> 9;
            this.field1262.method2667(var7, var6, 1, var6, true, var7, arg1, var3, var4);
            if (class529.field7284) {
                var3.method1580(var4, var5.field4255[0], class775.field10662, 0);
            } else {
                var3.method1586(var4, var5.field4255[0], 0);
            }
            if (this.field1262.field6127 != null) {
                class714 var8 = this.field1262.field6127.method2402();
                if (!class529.field7284) {
                    arg1.method253(var8);
                } else {
                    arg1.method134(var8, class775.field10662);
                }
            }
            this.field1256 = var3.method1575() || this.field1262.field6127 != null;
            if (arg0 < 75) {
                return null;
            } else {
                if (this.field1261 == null) {
                    this.field1261 = class486.method2885(super.field3470, super.field3464, var3, super.field3460, 29289);
                } else {
                    class33.method276(super.field3470, this.field1261, false, super.field3460, var3, super.field3464);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 72)
    public final void method754(boolean arg0) {
        ++field1250;
        if (arg0) {
            this.field1269 = false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z", line = 84)
    public final boolean method755(byte arg0) {
        ++field1265;
        if (arg0 != -111) {
            this.method757((class473) null, 65);
        }
        return this.field1262.method2663(10505);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I", line = 95)
    public final int method756(byte arg0) {
        ++field1264;
        int var2 = -50 % ((48 - arg0) / 51);
        return this.field1262.field6126;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I", line = 106)
    public final int method89(int arg0) {
        ++field1252;
        int var2 = -28 % ((arg0 - 69) / 48);
        return this.field1262.method2661(-16897);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lha;I)V", line = 118)
    public final void method76(class473 arg0, int arg1) {
        ++field1274;
        class231 var3 = this.field1262.method2660((byte) -88, true, arg0, 262144, true);
        if (var3 != null) {
            int var4 = super.field3470 >> 9;
            int var5 = super.field3460 >> 9;
            class12 var6 = arg0.method153();
            var6.method50(super.field3470, super.field3464, super.field3460);
            this.field1262.method2667(var5, var4, 1, var4, false, var5, arg0, var3, var6);
        }
        int var7 = -33 % ((arg1 - -30) / 42);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Z", line = 142)
    public final boolean method80(int arg0) {
        if (arg0 < 63) {
            this.field1261 = null;
        }
        ++field1254;
        return this.field1256;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z", line = 156)
    public final boolean method77(int arg0) {
        ++field1255;
        if (arg0 != 25833) {
            this.method72((class473) null, 76);
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lha;I)V", line = 168)
    public final void method757(class473 arg0, int arg1) {
        this.field1262.method2657((byte) 57, arg0);
        int var3 = -110 / ((arg1 - 13) / 37);
        ++field1260;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(Z)Z", line = 178)
    public final boolean method83(boolean arg0) {
        ++field1259;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V", line = 189)
    public static void method758(int arg0) {
        if (arg0 >= -106) {
            method764(-8, (class511) null);
        }
        field1253 = null;
        field1249 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Laka;I)V", line = 200)
    public final void method759(class413 arg0, int arg1) {
        this.field1262.method2654(arg0, 24841);
        ++field1258;
        if (arg1 != 1) {
            this.field1261 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I", line = 211)
    public final int method760(int arg0) {
        ++field1263;
        return arg0 != -27640 ? 49 : this.field1262.field6111;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILha;II)Z", line = 224)
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field1248;
        class231 var5 = this.field1262.method2660((byte) -88, false, arg1, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class12 var6 = arg1.method153();
            if (arg2 != -31634) {
                this.method80(122);
            }
            var6.method50(super.field3470, super.field3464, super.field3460);
            return !class529.field7284 ? var5.method1578(arg0, arg3, var6, false, 0) : var5.method1570(arg0, arg3, var6, false, 0, class775.field10662);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLib;)I", line = 243)
    public static final int method761(byte arg0, class723 arg1) {
        ++field1266;
        if (arg0 != 26) {
            method761((byte) 97, (class723) null);
        }
        int var2 = arg1.field10009;
        class148 var3 = arg1.method3736((byte) 126);
        if (~arg1.field9198 != 0 && !arg1.field9207) {
            if (~arg1.field9198 != ~var3.field1915 && arg1.field9198 != var3.field1930 && ~arg1.field9198 != ~var3.field1920 && arg1.field9198 != var3.field1886) {
                if (~arg1.field9198 == ~var3.field1916 || ~arg1.field9198 == ~var3.field1896 || ~arg1.field9198 == ~var3.field1938 || arg1.field9198 == var3.field1931) {
                    var2 = arg1.field9990;
                }
            } else {
                var2 = arg1.field10010;
            }
        } else {
            var2 = arg1.field9984;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lha;I)Ltja;", line = 269)
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            return null;
        } else {
            ++field1268;
            return this.field1261;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIII)V", line = 342)
    public class107(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class350.method2210(arg8, 7749, arg9));
        this.field1262 = new class443(arg0, arg1, arg8, arg9, super.field3467, arg3, this, arg7, arg10);
        this.field1269 = ~arg1.field4137 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I", line = 291)
    public final int method762(boolean arg0) {
        if (!arg0) {
            this.method763((class473) null, false);
        }
        ++field1251;
        return this.field1262.field6119;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lha;Z)V", line = 302)
    public final void method763(class473 arg0, boolean arg1) {
        if (!arg1) {
            ++field1267;
            this.field1262.method2658(10, arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Loq;IZILha;II)V", line = 313)
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        ++field1270;
        if (arg6 < 96) {
            this.method74(-58, (class473) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILgga;)Luo;", line = 326)
    public static final class696 method764(int arg0, class511 arg1) {
        ++field1273;
        int var2 = 118 % ((26 - arg0) / 53);
        return new class696(arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method3034(1), arg1.method2983(true), arg1.method3013(101));
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)I", line = 353)
    public final int method78(byte arg0) {
        if (arg0 >= -31) {
            this.field1256 = false;
        }
        ++field1271;
        return this.field1262.method2664((byte) 77);
    }
}
