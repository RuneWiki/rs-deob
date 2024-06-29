import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lku;")
    private class232 field378 = new class232(64);

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lku;")
    public class232 field387 = new class232(64);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lb;")
    public class201 field374;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lb;")
    private class201 field372;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lwf;")
    public static class79 field373 = new class79(78, 8);

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field379 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lcp;")
    public static class470 field380 = new class470(8);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lit;")
    public static class422 field381;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[Lpl;")
    public static class426[] field388;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)I")
    public static final int method200(int arg0, boolean arg1) {
        field376++;
        int var2 = 0;
        if (arg1) {
            method205(36);
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method201(int arg0) {
        field384++;
        class211.method1368((byte) -32, arg0);
        class59.method369(22953);
        System.gc();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V")
    public final void method202(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field375++;
            this.field378 = new class232(arg1);
            this.field387 = new class232(arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public final void method203(byte arg0) {
        field385++;
        class232 var2 = this.field378;
        synchronized (this.field378) {
            this.field378.method1478((byte) -119);
        }
        class232 var3 = this.field387;
        synchronized (this.field387) {
            this.field387.method1478((byte) -122);
            if (arg0 != -27) {
                method204((class313) null, 88, -49, (class282) null, 82, -59, 101, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -69, (byte) -40, -41, -81, false);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lnp;IILos;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method204(class313 arg0, int arg1, int arg2, class282 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class456.field6417 = arg0;
        class99.field1265 = arg1;
        class295.field4269 = arg3;
        class30.field400 = class456.field6417.method606() > 0;
        class58.field770 = arg4 >> class216.field3242;
        class214.field3218 = arg6 >> class216.field3242;
        class132.field1743 = arg4;
        class2.field21 = arg6;
        class206.field3155 = arg5;
        class398.field5653 = class58.field770 - class36.field463;
        if (class398.field5653 < 0) {
            class195.field2860 = -class398.field5653;
            class398.field5653 = 0;
        } else {
            class195.field2860 = 0;
        }
        class120.field1505 = class214.field3218 - class36.field463;
        if (class120.field1505 < 0) {
            class120.field1511 = -class120.field1505;
            class120.field1505 = 0;
        } else {
            class120.field1511 = 0;
        }
        class3.field32 = class58.field770 + class36.field463;
        if (class3.field32 > class287.field4186) {
            class3.field32 = class287.field4186;
        }
        class466.field6557 = class36.field463 + class214.field3218;
        if (class466.field6557 > class360.field5188) {
            class466.field6557 = class360.field5188;
        }
        for (int var18 = 0; var18 < class36.field463 + class36.field463 + 2; var18++) {
            for (int var23 = 0; var23 < class36.field463 + class36.field463 + 2; var23++) {
                int var24 = class58.field770 + var18 - class36.field463;
                int var25 = class214.field3218 + var23 - class36.field463;
                if (var24 >= 0 && var25 >= 0 && var24 < class287.field4186 && var25 < class360.field5188) {
                    int var26 = var24 << class216.field3242;
                    int var27 = var25 << class216.field3242;
                    int var28 = class178.field2556[class178.field2556.length - 1].method1218(var24, var25) - 1000;
                    int var29 = field388 == null ? class178.field2556[0].method1218(var24, var25) + class418.field5845 : field388[0].method1218(var24, var25) + class418.field5845;
                    class271.field3950[var18][var23] = class456.field6417.method599(var26, var28, var27, var26, var29, var27);
                } else {
                    class271.field3950[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class36.field463 + class36.field463 + 1; var19++) {
            for (int var22 = 0; var22 < class36.field463 + class36.field463 + 1; var22++) {
                class386.field5483[var19][var22] = class271.field3950[var19][var22] || class271.field3950[var19 + 1][var22] || class271.field3950[var19][var22 + 1] || class271.field3950[var19 + 1][var22 + 1];
            }
        }
        class71.field888 = arg8;
        class22.field293 = arg9;
        class185.field2745 = arg10;
        class128.field1677 = arg11;
        class349.field5049 = arg12;
        class107.method596();
        class52.method335(0);
        for (class477 var20 = (class477) class437.field6070.method1449(114); var20 != null; var20 = (class477) class437.field6070.method1450(0)) {
            var20.method738((byte) -2);
            class344.method2163(var20, -1);
        }
        if (class30.field400) {
            for (int var21 = 0; var21 < class480.field6737; var21++) {
                class478.field6712[var21].method533(arg1, arg17, (byte) -62);
            }
        }
        if (arg2 > 1) {
            class456.field6417.method664(0);
            if (class405.field5702 == null || class405.field5702 instanceof class312) {
                class405.field5702 = new class362();
            }
        } else if (class405.field5702 == null || class405.field5702 instanceof class362) {
            class405.field5702 = new class312();
        }
        class405.field5702.method1046((byte) -8, arg2);
        class405.field5702.method1047(90);
        if (class311.field4394 != null) {
            class434.method2566(true);
            class405.field5702.method1052(1, 22);
            class206.method1350(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class405.field5702.method1047(95);
            class405.field5702.method1052(1, 23);
            class434.method2566(false);
        }
        class206.method1350(arg2, arg7, arg13, arg14, arg15, arg16);
        class405.field5702.method1047(98);
        class405.field5702.method1048((byte) 62);
        class405.field5702.method1047(86);
        if (arg2 > 1) {
            class456.field6417.method661(0);
        }
        class456.field6417.method637(0, (class178[]) null);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method205(int arg0) {
        if (arg0 != -12144) {
            field379 = -39;
        }
        field380 = null;
        field381 = null;
        field373 = null;
        field388 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Lle;")
    public final class184 method206(int arg0, byte arg1) {
        field382++;
        class232 var3 = this.field378;
        class184 var4;
        synchronized (this.field378) {
            if (arg1 != 5) {
                this.method206(65, (byte) -43);
            }
            var4 = (class184) this.field378.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field372.method1257(arg0, 34, arg1 + 24553);
        class184 var6 = new class184();
        var6.field2714 = this;
        if (var5 != null) {
            var6.method1142(arg1 + 117, new class276(var5));
        }
        class232 var7 = this.field378;
        synchronized (this.field378) {
            this.field378.method1473(var6, (long) arg0, 122);
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
    public static final boolean method207(int arg0, int arg1, int arg2) {
        field383++;
        if ((class413.field5813[1][arg0][arg2] & 0x2) == 0) {
            return arg1 != -25548;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(IB)V")
    public final void method208(int arg0, byte arg1) {
        field377++;
        class232 var3 = this.field378;
        synchronized (this.field378) {
            this.field378.method1486(arg1 + 438127065, arg0);
        }
        class232 var4 = this.field387;
        synchronized (this.field387) {
            if (arg1 != 55) {
                field373 = null;
            }
            this.field387.method1486(438127120, arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        class232 var2 = this.field378;
        synchronized (this.field378) {
            this.field378.method1475(arg0);
        }
        field386++;
        class232 var3 = this.field387;
        synchronized (this.field387) {
            this.field387.method1475(arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lea;ILb;Lb;)V")
    public class28(class353 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field374 = arg3;
        this.field372 = arg2;
        this.field372.method1235(0, 34);
    }
}
