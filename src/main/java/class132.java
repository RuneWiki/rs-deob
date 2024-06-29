import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class132 extends class554 {

    @OriginalMember(owner = "client!st", name = "r", descriptor = "Z")
    private boolean field1626 = false;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field1634 = 0;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lwt;")
    public static class24 field1621;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        ++field1630;
        super.field7743.method3344(29639, arg2);
        super.field7743.method3291(arg1, 2);
        if (!arg0) {
            field1621 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        super.field7743.method3316(class443.field6123, -90, class509.field7093);
        if (arg1 > 74) {
            ++field1625;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        ++field1633;
        if (arg0 != 61) {
            this.method466((byte) 2, false);
        }
        class5 var3 = super.field7743.method3359(-47);
        if (var3 != null && arg1) {
            super.field7743.method3339((byte) 90, 1);
            super.field7743.method3344(29639, var3);
            super.field7743.method1201((byte) -105, class486.field6776);
            super.field7743.method3339((byte) 90, 1);
            super.field7743.method3316(class550.field7639, arg0 ^ 23, class509.field7093);
            super.field7743.method1210(class17.field173, false, true, true, 2);
            super.field7743.method3307(class542.field7574, 0, 16711680);
            class186 var4 = super.field7743.method3299(arg0 ^ -8400);
            var4.method1149(-78, super.field7743.method3289((byte) 75));
            super.field7743.method3321((byte) -127, class191.field2480);
            super.field7743.method3339((byte) 90, 0);
            this.field1626 = true;
        } else {
            super.field7743.method3307(class542.field7574, 0, 16711680);
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(B)V")
    public static void method699(byte arg0) {
        field1621 = null;
        if (arg0 <= 36) {
            method702(false, 28, true, 118, -75);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field1622;
        if (!arg1) {
            this.method467(115);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z[JII[I)V")
    public static final void method700(boolean arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (~arg3 > ~arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = ~var7 != Long.MIN_VALUE ? 1 : 0;
            for (int var11 = arg3; var11 < arg2; ++var11) {
                if ((long) (var11 & var10) + var7 > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method700(false, arg1, var6 + -1, arg3, arg4);
            method700(false, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0) {
            method701((byte) 110, (class23) null, -104);
        }
        ++field1623;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BLdc;I)V")
    public static final void method701(byte arg0, class23 arg1, int arg2) {
        ++field1631;
        int var3 = -1;
        int var4 = 0;
        if (class7.field61 >= arg1.field397) {
            if (arg1.field345 < class7.field61) {
                class477.method2704(-119, arg1, false);
                var3 = class580.field8085;
                var4 = class216.field2769;
            } else {
                class351.method2183(arg1, 31801);
            }
        } else {
            class45.method243(arg1, (byte) -85);
        }
        if (arg1.field6362 < 512 || arg1.field6368 < 512 || ~(class139.field1760 * 512 + -512) >= ~arg1.field6362 || ~arg1.field6368 <= ~(class369.field5135 * 512 + -512)) {
            var4 = 0;
            arg1.field357 = -1;
            arg1.field397 = 0;
            arg1.field345 = 0;
            arg1.field380 = -1;
            arg1.field368 = -1;
            var3 = -1;
            arg1.field6362 = arg1.field419[0] * 512 + 256 * arg1.method104((byte) -92);
            arg1.field6368 = arg1.field417[0] * 512 + arg1.method104((byte) -92) * 256;
            arg1.method133(arg0 + -73);
        }
        if (arg0 != 77) {
            method699((byte) 3);
        }
        if (class147.field1899 == arg1 && (arg1.field6362 < 6144 || arg1.field6368 < 6144 || (class139.field1760 + -12) * 512 <= arg1.field6362 || arg1.field6368 >= (class369.field5135 + -12) * 512)) {
            var3 = -1;
            arg1.field397 = 0;
            arg1.field357 = -1;
            var4 = 0;
            arg1.field380 = -1;
            arg1.field368 = -1;
            arg1.field345 = 0;
            arg1.field6362 = arg1.field419[0] * 512 - -(256 * arg1.method104((byte) -92));
            arg1.field6368 = arg1.field417[0] * 512 - -(arg1.method104((byte) -92) * 256);
            arg1.method133(4);
        }
        int var5 = class358.method2221((byte) 71, arg1);
        class90.method500(arg1, (byte) 33, var5, var4, var3);
        class145.method793(arg0 ^ -26, arg1);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        ++field1624;
        if (arg0 != 4096) {
            field1621 = null;
        }
        if (this.field1626) {
            super.field7743.method3339((byte) 90, 1);
            super.field7743.method1201((byte) -59, class558.field7806);
            super.field7743.method3316(class443.field6123, -100, class443.field6123);
            super.field7743.method3300(true, 2, class320.field4434);
            super.field7743.method3307(class93.field1233, 0, 16711680);
            super.field7743.method3323(0);
            super.field7743.method3344(29639, (class11) null);
            super.field7743.method3339((byte) 90, 0);
            this.field1626 = false;
        } else {
            super.field7743.method3307(class93.field1233, 0, 16711680);
        }
        super.field7743.method3316(class443.field6123, -118, class443.field6123);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZIZII)I")
    public static final int method702(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1632;
        class164 var5 = class130.method695(arg0, arg3, Integer.MIN_VALUE);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            int var7 = 0;
            if (arg1 <= 109) {
                method701((byte) -2, (class23) null, -101);
            }
            while (var7 < var5.field2084.length) {
                if (var5.field2084[var7] >= 0 && ~class98.field1307.field8493 < ~var5.field2084[var7]) {
                    class456 var8 = class98.field1307.method3391(0, var5.field2084[var7]);
                    int var9 = var8.method2654(field1621.method151(arg4, -113).field5020, 0, arg4);
                    if (!arg2) {
                        var6 += var9;
                    } else {
                        var6 += var5.field2086[var7] * var9;
                    }
                }
                ++var7;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lre;)V")
    public class132(class582 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 != 4096) {
            return true;
        } else {
            ++field1629;
            return true;
        }
    }
}
