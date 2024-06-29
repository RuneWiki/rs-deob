import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class161 extends class296 {

    @OriginalMember(owner = "client!gk", name = "Ec", descriptor = "Ljava/lang/String;")
    public static String field2420 = "Face here";

    @OriginalMember(owner = "client!gk", name = "zc", descriptor = "I")
    public static int field2415 = -1;

    @OriginalMember(owner = "client!gk", name = "uc", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!gk", name = "vc", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!gk", name = "wc", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!gk", name = "xc", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!gk", name = "yc", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!gk", name = "Ac", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!gk", name = "Bc", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!gk", name = "Cc", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!gk", name = "Dc", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!gk", name = "Fc", descriptor = "Lbi;")
    public class95 field2421;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V")
    public static void method1163(byte arg0) {
        if (arg0 != 19) {
            field2420 = null;
        }
        field2420 = null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
    public final int method1010(byte arg0) {
        ++field2416;
        if (this.field2421.field1547 != null) {
            class95 var2 = this.field2421.method741(107);
            if (var2 != null && var2.field1489 != -1) {
                return var2.field1489;
            }
        }
        if (arg0 != 23) {
            this.method1010((byte) 92);
        }
        return super.field4707;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        ++field2418;
        if (this.field2421 != null) {
            class103 var13 = ~super.field4727 != 0 && super.field4701 == 0 ? class250.method1700(super.field4727, -48) : null;
            class103 var14 = ~super.field4736 == 0 || super.field4736 == this.method1982((byte) -110).field3872 && var13 != null ? null : class250.method1700(super.field4736, -72);
            class11 var15 = this.field2421.method747(var13, super.field4771, super.field4705, super.field4748, super.field4710, var14, super.field4718, false, super.field4699, super.field4765);
            if (var15 != null) {
                super.field4740 = var15.method82();
                class95 var16 = this.field2421;
                if (var16.field1547 != null) {
                    var16 = var16.method741(117);
                }
                if (class216.field3309 && var16.field1525) {
                    class11 var17 = class141.method1027((byte) -86, var14 == null ? super.field4765 : super.field4771, this.field2421.field1550, this.field2421.field1517, super.field4769, var14 != null ? var14 : var13, super.field4709, this.field2421.field1491, arg0, var15, this.field2421.field1524, this.field2421.field1539, super.field4725, super.field4767);
                    var17.method75(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4747);
                }
                this.method1983(var15, 0);
                this.method1978(true, arg0, var15);
                class11 var18 = null;
                if (~super.field4732 != 0 && ~super.field4660 != 0) {
                    class206 var19 = class86.method654(super.field4732, 109);
                    var18 = var19.method1443(super.field4711, 10, super.field4713, super.field4660);
                    if (var18 != null) {
                        var18.method93(0, -super.field4744, 0);
                        if (var19.field3173) {
                            if (~class237.field3746 != -1) {
                                var18.method87(class237.field3746);
                            }
                            if (~class19.field268 != -1) {
                                var18.method69(class19.field268);
                            }
                            if (class221.field3381 != 0) {
                                var18.method93(0, class221.field3381, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class87) var15).method667(var18);
                }
                this.method1974(var18, var15, (byte) 14);
                if (this.field2421.field1539 == 1) {
                    var15.field170 = true;
                }
                var15.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4747);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field4747 != null) {
            super.field4747.method1691();
        }
        ++field2414;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILbi;)V")
    public final void method1164(int arg0, class95 arg1) {
        if (arg0 != -11497) {
            this.field2421 = null;
        }
        ++field2417;
        this.field2421 = arg1;
        if (super.field4747 != null) {
            super.field4747.method1690();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
    public final boolean method1006(int arg0) {
        if (arg0 != -1) {
            field2415 = -116;
        }
        ++field2419;
        return this.field2421 != null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1165(boolean arg0, byte[] arg1) {
        ++field2411;
        class31 var2 = new class31(arg1);
        int var3 = var2.method265(-95);
        int var4 = var2.method300((byte) -30);
        if (arg0) {
            field2420 = null;
        }
        if (var4 >= 0 && (class226.field3626 == 0 || ~class226.field3626 <= ~var4)) {
            if (var3 == 0) {
                byte[] var7 = new byte[var4];
                var2.method284(0, var4, 113, var7);
                return var7;
            } else {
                int var5 = var2.method300((byte) -30);
                if (~var5 <= -1 && (class226.field3626 == 0 || class226.field3626 >= var5)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class97.method761(var6, var5, arg1, var4, 9);
                    } else {
                        class127.field1904.method1286(var2, var6, -9);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2410;
        if (this.field2421 != null) {
            if (!super.field4662) {
                class103 var6 = ~super.field4727 != 0 && ~super.field4701 == -1 ? class250.method1700(super.field4727, -102) : null;
                class103 var7 = ~super.field4736 == 0 || ~super.field4736 == ~this.method1982((byte) -112).field3872 && var6 != null ? null : class250.method1700(super.field4736, -122);
                class11 var8 = this.field2421.method747(var6, super.field4771, super.field4705, super.field4748, super.field4710, var7, super.field4718, false, super.field4699, super.field4765);
                if (var8 == null) {
                    return;
                }
                this.method1974((class11) null, var8, (byte) 14);
            }
            if (super.field4747 != null) {
                super.field4747.method1688(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()I")
    public final int method82() {
        ++field2413;
        return super.field4740;
    }
}
