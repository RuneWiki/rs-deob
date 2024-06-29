import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class117 extends class51 {

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Led;")
    public static class43 field2279 = class191.method1219("Ladevorgang )2 bitte warten Sie)3", false);

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Led;")
    public static class43 field2283 = class191.method1219("jolt", false);

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Led;")
    public static class43 field2281 = class191.method1219("und Ihr Passwort ein)3", false);

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "[J")
    public static long[] field2286 = new long[200];

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Z")
    public static boolean field2282 = false;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "Led;")
    private static class43 field2284 = class191.method1219("Connection timed out)3", false);

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "Led;")
    public static class43 field2290 = field2284;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lje;")
    public static class87 field2288;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method740(int arg0) {
        field2290 = null;
        field2281 = null;
        field2288 = null;
        field2286 = null;
        if (arg0 != 0) {
            method740(-35);
        }
        field2279 = null;
        field2283 = null;
        field2284 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljg;I)V")
    public static final void method741(class89 arg0, int arg1) {
        ++field2285;
        byte[] var2 = new byte[24];
        if (arg1 == -3124) {
            if (class49.field996 != null) {
                try {
                    class49.field996.method226(0L, (byte) -105);
                    class49.field996.method223(-22907, var2);
                    int var3;
                    for (var3 = 0; var3 < 24 && ~var2[var3] == -1; ++var3) {
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg0.method542(111, var2, 0, 24);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)I")
    public static final int method742(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 / arg0;
        int var5 = arg3 & arg0 + -1;
        if (arg2 < 121) {
            method740(-82);
        }
        ++field2287;
        int var6 = arg1 / arg0;
        int var7 = class82.method507(false, var6, var4);
        int var8 = class82.method507(false, var6, var4 - -1);
        int var9 = arg1 & arg0 + -1;
        int var10 = class82.method507(false, var6 + 1, var4);
        int var11 = class82.method507(false, var6 + 1, var4 + 1);
        int var12 = class32.method180(arg0, var5, var7, var8, (byte) 103);
        int var13 = class32.method180(arg0, var5, var10, var11, (byte) 103);
        return class32.method180(arg0, var9, var12, var13, (byte) 103);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public static final void method743(int arg0) {
        try {
            if (class85.field1666 == null) {
                class85.field1666 = new class185(class32.field585, class167.method1036(new class43[] { class55.field1105, class110.field2119, class154.field3126 }, true).method258((byte) 21));
            } else {
                byte[] var1 = class85.field1666.method1189(false);
                if (var1 != null) {
                    class89 var2 = new class89(var1);
                    class4.field88 = var2.method555(-1113627096);
                    class107.field2058 = new class173[class4.field88];
                    int var3 = 0;
                    while (true) {
                        if (~class4.field88 >= ~var3) {
                            class136.method881(class107.field2058, class119.field2384, (byte) -63, class107.field2058.length + -1, 0, class105.field2016);
                            class85.field1666 = null;
                            class5.field112 = true;
                            break;
                        }
                        class173 var4 = class107.field2058[var3] = new class173();
                        int var5 = var2.method555(-1113627096);
                        var4.field3452 = (var5 & 32768) != 0;
                        var4.field3458 = 32767 & var5;
                        var4.field3454 = var2.method541(936);
                        var4.field3456 = var2.method552((byte) -128);
                        var4.field3455 = var3;
                        var4.field3448 = class147.method924((byte) -67, var4.field3454);
                        ++var3;
                    }
                }
            }
            int var6 = 53 / ((26 - arg0) / 47);
        } catch (Exception var8) {
            var8.printStackTrace();
            class85.field1666 = null;
        }
        ++field2289;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lob;II)V")
    public static final void method744(class129[] arg0, int arg1, int arg2) {
        ++field2292;
        if (arg1 < 91) {
            field2283 = null;
        }
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            class129 var4 = arg0[var3];
            if (var4 != null && var4.field2576 == arg2 && (!var4.field2707 || !class163.method1020(var4, -1))) {
                if (var4.field2690 == 0) {
                    if (!var4.field2707 && class163.method1020(var4, -1) && class118.field2299 != var4) {
                        continue;
                    }
                    method744(arg0, 95, var4.field2664);
                    if (var4.field2626 != null) {
                        method744(var4.field2626, 125, var4.field2664);
                    }
                    class137 var5 = (class137) class15.field227.method75((long) var4.field2664, -108);
                    if (var5 != null) {
                        class83.method511(var5.field2850, true);
                    }
                }
                if (~var4.field2690 == -7) {
                    if (~var4.field2586 != 0 || ~var4.field2642 != 0) {
                        boolean var6 = class34.method195(false, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field2586;
                        } else {
                            var7 = var4.field2642;
                        }
                        if (~var7 != 0) {
                            class205 var8 = class175.method1101(var7, true);
                            var4.field2674 += class65.field1325;
                            while (~var8.field3991[var4.field2589] > ~var4.field2674) {
                                var4.field2674 -= var8.field3991[var4.field2589];
                                ++var4.field2589;
                                if (~var8.field3996.length >= ~var4.field2589) {
                                    var4.field2589 -= var8.field4006;
                                    if (var4.field2589 < 0 || var4.field2589 >= var8.field3996.length) {
                                        var4.field2589 = 0;
                                    }
                                }
                                class43.method265(false, var4);
                            }
                        }
                    }
                    if (var4.field2673 != 0 && !var4.field2707) {
                        int var9 = var4.field2673 >> 16;
                        int var10 = var4.field2673 << 16 >> 16;
                        int var11 = class65.field1325 * var10;
                        int var12 = class65.field1325 * var9;
                        var4.field2591 = 2047 & var4.field2591 - -var11;
                        var4.field2592 = var4.field2592 + var12 & 2047;
                        class43.method265(false, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            method743(65);
        }
        ++field2291;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            for (int var4 = 0; ~class122.field2442 < ~var4; ++var4) {
                var3[var4] = class95.field1855[var4];
            }
        }
        return var3;
    }
}
