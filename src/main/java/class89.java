import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class89 extends class125 {

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Llc;")
    public static class435 field1269 = new class435(106, -1);

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lgp;)V")
    public class89(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V")
    public static final void method692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1267;
        int var6 = -arg5 + arg2;
        int var7 = -arg1 + arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class132.method927(arg1, arg5, arg4, arg3, true);
            }
        } else if (var7 == 0) {
            class642.method3705(arg4, arg5, (byte) 11, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg5 * var8 >> 12) + arg1;
            int var10 = 101 % ((-35 - arg0) / 52);
            int var11;
            int var12;
            if (arg5 >= class200.field2976) {
                if (arg5 <= class204.field3061) {
                    var11 = arg1;
                    var12 = arg5;
                } else {
                    var12 = class204.field3061;
                    var11 = (class204.field3061 * var8 >> 12) + var9;
                }
            } else {
                var12 = class200.field2976;
                var11 = (class200.field2976 * var8 >> 12) + var9;
            }
            int var13;
            int var14;
            if (class200.field2976 <= arg2) {
                if (~class204.field3061 > ~arg2) {
                    var13 = (class204.field3061 * var8 >> 12) + var9;
                    var14 = class204.field3061;
                } else {
                    var13 = arg3;
                    var14 = arg2;
                }
            } else {
                var14 = class200.field2976;
                var13 = (class200.field2976 * var8 >> 12) + var9;
            }
            if (var13 < class377.field5458) {
                var14 = (-var9 + class377.field5458 << 12) / var8;
                var13 = class377.field5458;
            } else if (var13 > class362.field5291) {
                var13 = class362.field5291;
                var14 = (-var9 + class362.field5291 << 12) / var8;
            }
            if (var11 >= class377.field5458) {
                if (class362.field5291 < var11) {
                    var12 = (class362.field5291 - var9 << 12) / var8;
                    var11 = class362.field5291;
                }
            } else {
                var12 = (-var9 + class377.field5458 << 12) / var8;
                var11 = class377.field5458;
            }
            class207.method1479(var12, arg4, (byte) 95, var14, var11, var13);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method693(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1268;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = class503.field7317 - -((class121.field1645 - class503.field7317) * var8 / 100);
        int var10 = arg2 * var9 >> 8;
        class680.field9660 = class680.field9669 * var9 >> 8;
        if (arg3 != -39) {
            method692(-70, -60, -11, -8, -56, -12);
        }
        int var11 = 16384 - arg6 & 16383;
        int var12 = 16384 - arg1 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class125.field1736[var11] * -var10 >> 14;
            var15 = class125.field1729[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class125.field1736[var12] * var15 >> 14;
            var15 = class125.field1729[var12] * var15 >> 14;
        }
        class564.field8174 = -var14 + arg4;
        class179.field2487 = arg1;
        class518.field7473 = -var13 + arg7;
        class487.field7021 = 0;
        class279.field3904 = arg6;
        class123.field1698 = arg0 - var15;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field1266;
        if (arg0) {
            if (super.field1733.method3309((byte) -22) == class48.field790) {
                super.field1732 = 2;
            }
            if (~super.field1732 > -1 || super.field1732 > 2) {
                super.field1732 = this.method158((byte) 19);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = 62 % ((-63 - arg0) / 49);
        ++field1262;
        return 1;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(ILgp;)V")
    public class89(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(ZI)V")
    public static final void method694(boolean arg0, int arg1) {
        if (class325.field4415 != null) {
            class325.field4415.method1581(false);
            class325.field4415 = null;
        }
        ++field1265;
        class35.field318 = 0;
        class648.method3743(arg1 ^ 12245);
        class434.method2665();
        for (int var2 = 0; var2 < 4; ++var2) {
            class6.field57[var2].method3650((byte) -23);
        }
        class145.method1015(false, (byte) -87);
        System.gc();
        class390.method2389((byte) 85, 2);
        class428.field6173 = -1;
        class509.field7381 = false;
        class303.method1894(0);
        class53.method480((byte) -95, true);
        class41.field693 = 0;
        class401.field5750 = 0;
        class445.field6361 = 0;
        class407.field5799 = 0;
        class109.field1560 = 0;
        class71.field1085 = 0;
        for (int var3 = 0; var3 < class99.field1437.length; ++var3) {
            class99.field1437[var3] = null;
        }
        class377.method2338((byte) 102);
        for (int var4 = arg1; var4 < 2048; ++var4) {
            class536.field7796[var4] = null;
        }
        class619.field8816 = 0;
        class389.field5608.method4013(-3);
        class551.field8042 = 0;
        class591.field8409.method4013(-3);
        class743.method4135((byte) 95);
        class732.field10259 = 0;
        class226.field3372.method7(126);
        class710.method3971(true);
        class129.method907((byte) -49);
        class269.field3820 = null;
        class191.field2695 = 0L;
        if (!arg0) {
            class79.method649(-19704, 3);
            try {
                class665.method3803(class486.field6999, "loggedout", (byte) 124);
            } catch (Throwable var5) {
            }
        } else {
            class79.method649(-19704, 12);
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(Z)I")
    public final int method695(boolean arg0) {
        if (arg0) {
            return 95;
        } else {
            ++field1261;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            this.method158((byte) 121);
        }
        super.field1732 = arg1;
        ++field1264;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field1263;
        if (!arg0) {
            field1269 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
    public static void method696(byte arg0) {
        field1269 = null;
        if (arg0 != 68) {
            field1269 = null;
        }
    }
}
