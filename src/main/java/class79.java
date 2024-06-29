import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 extends class74 {

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Lag;")
    public static class188 field1320 = null;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field1329 = 0;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(Z)V")
    public static void method622(boolean arg0) {
        if (!arg0) {
            method627(-112, 50, false, (class188[]) null, true, 77);
        }
        field1320 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            field1320 = null;
        }
        ++field1325;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            class236.method1587(var3, 0, class178.field2662, class207.field3212[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)V")
    public static final void method623(int arg0, int arg1, int arg2) {
        if (~class6.field111 == -3) {
            class25.field373 = arg0;
            class142.field2182 = arg2;
        }
        ++field1328;
        class161.field2460 = (float) arg0;
        class276.field4334 = (float) arg2;
        if (arg1 != 32) {
            field1320 = null;
        }
        class191.method1289((byte) -125);
        class216.field3333 = true;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)I")
    public static final int method624(byte arg0) {
        ++field1321;
        if (class214.field3296) {
            return 0;
        } else if (!class223.method1487(85)) {
            return 1;
        } else {
            if (arg0 < 26) {
                method623(24, 85, 111);
            }
            return !class51.field813 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static final void method625(int arg0) {
        int var1 = 10 / ((arg0 - -56) / 52);
        ++field1323;
        while (~class239.field3692.method1249(18, field1329) <= -12) {
            int var2 = class239.field3692.method1253((byte) -104, 11);
            if (~var2 == -2048) {
                break;
            }
            boolean var3 = false;
            if (class41.field675[var2] == null) {
                class41.field675[var2] = new class28();
                var3 = true;
                if (class81.field1347[var2] != null) {
                    class41.field675[var2].method220(class81.field1347[var2], (byte) -102);
                }
            }
            class166.field2510[class5.field78++] = var2;
            class28 var4 = class41.field675[var2];
            var4.field4161 = class267.field4256;
            int var5 = class239.field3692.method1253((byte) -115, 1);
            if (var5 == 1) {
                class36.field576[class17.field269++] = var2;
            }
            int var6 = class239.field3692.method1253((byte) -106, 5);
            int var7 = class239.field3692.method1253((byte) -117, 5);
            if (~var6 < -16) {
                var6 -= 32;
            }
            int var8 = class239.field3692.method1253((byte) -96, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var9 = class187.field2817[class239.field3692.method1253((byte) -120, 3)];
            if (var3) {
                var4.field4199 = var4.field4159 = var9;
            }
            var4.method221(class261.field4058.field4204[0] - -var7, ~var8 == -2, class261.field4058.field4143[0] + var6, (byte) -117);
        }
        class239.field3692.method1252((byte) -117);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLuf;)V")
    public static final void method626(byte arg0, class176 arg1) {
        class276.field4354 = arg1;
        ++field1327;
        if (arg0 != -85) {
            method624((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ[Lag;ZI)V")
    public static final void method627(int arg0, int arg1, boolean arg2, class188[] arg3, boolean arg4, int arg5) {
        if (arg2) {
            method626((byte) 103, (class176) null);
        }
        for (int var6 = 0; ~var6 > ~arg3.length; ++var6) {
            class188 var7 = arg3[var6];
            if (var7 != null && ~var7.field2870 == ~arg5) {
                class92.method727(arg1, 0, arg4, var7, arg0);
                class87.method696(var7, 0, arg1, arg0);
                if (~(-var7.field2922 + var7.field2997) > ~var7.field3008) {
                    var7.field3008 = -var7.field2922 + var7.field2997;
                }
                if (var7.field3008 < 0) {
                    var7.field3008 = 0;
                }
                if (-var7.field2928 + var7.field2900 < var7.field2887) {
                    var7.field2887 = var7.field2900 - var7.field2928;
                }
                if (~var7.field2887 > -1) {
                    var7.field2887 = 0;
                }
                if (var7.field2937 == 0) {
                    class160.method1079(arg4, 5, var7);
                }
            }
        }
        ++field1326;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(III)V")
    public static final void method628(int arg0, int arg1, int arg2) {
        ++field1322;
        if (arg2 != 11) {
            method627(-41, 101, false, (class188[]) null, true, -12);
        }
        class295 var3 = class250.method1673(-128, 6, arg0);
        var3.method1980(1022716908);
        var3.field4632 = arg1;
    }
}
