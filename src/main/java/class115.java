import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class115 extends class58 {

    @OriginalMember(owner = "client!ta", name = "gd", descriptor = "Lrc;")
    public static class105 field2671 = class43.method374("*6n", 0);

    @OriginalMember(owner = "client!ta", name = "id", descriptor = "[I")
    public static int[] field2673 = new int[50];

    @OriginalMember(owner = "client!ta", name = "kd", descriptor = "I")
    public static int field2675 = 0;

    @OriginalMember(owner = "client!ta", name = "od", descriptor = "I")
    public static volatile int field2679 = 0;

    @OriginalMember(owner = "client!ta", name = "hd", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ta", name = "jd", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ta", name = "ld", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ta", name = "md", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ta", name = "nd", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ta", name = "pd", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ta", name = "qd", descriptor = "Ld;")
    public class19 field2681;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "(I)Z", line = 5)
    public final boolean method164(int arg0) {
        if (arg0 <= 92) {
            method937(-1, 0, (class15) null, -34, -127);
        }
        ++field2677;
        return this.field2681 != null;
    }

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(I)Lic;", line = 20)
    public static final class51 method934(int arg0) {
        if (arg0 != 400) {
            field2679 = 94;
        }
        ++field2680;
        try {
            return (class51) Class.forName("fa").newInstance();
        } catch (Throwable var1) {
            return new class72();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 49)
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2678;
        class120 var5 = (class120) class17.field349.method624((byte) 91, (long) arg3);
        if (var5 == null) {
            var5 = new class120();
            class17.field349.method625((byte) -118, var5, (long) arg3);
        }
        if (~var5.field2888.length >= ~arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var5.field2888.length > var8; ++var8) {
                var6[var8] = var5.field2888[var8];
                var7[var8] = var5.field2885[var8];
            }
            for (int var9 = var5.field2888.length; arg2 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2888 = var6;
            var5.field2885 = var7;
        }
        if (arg1 < -25) {
            var5.field2888[arg2] = arg4;
            var5.field2885[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(I)V", line = 104)
    public static void method936(int arg0) {
        if (arg0 != 2000) {
            method935(-60, 56, 116, -16, 5);
        }
        field2671 = null;
        field2673 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILcb;II)V", line = 121)
    public static final void method937(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        ++field2672;
        if (class119.field2842 != arg2) {
            if (class113.field2652 < 400) {
                class105 var5;
                if (arg2.field313 != 0) {
                    var5 = class108.method878(new class105[] { arg2.field300, class132.field3181, class45.field1012, class75.method637(arg2.field313, arg4 + 6241), class15.field312 }, arg4 ^ 3299);
                } else {
                    var5 = class108.method878(new class105[] { arg2.field300, class85.method709((byte) 118, class119.field2842.field306, arg2.field306), class132.field3181, class88.field1988, class75.method637(arg2.field306, 8241), class15.field312 }, 2867);
                }
                if (~class57.field1199 == -2) {
                    class105.method832(43, arg0, arg3, (byte) 127, class108.method878(new class105[] { class29.field661, class73.field1620, var5 }, 2867), class43.field1007, arg1);
                    ++class89.field2026;
                } else if (class122.field3003 == 1) {
                    if ((class84.field1886 & 8) == 8) {
                        class105.method832(39, arg0, arg3, (byte) 125, class108.method878(new class105[] { class105.field2386, class73.field1620, var5 }, 2867), class84.field1884, arg1);
                        ++class88.field1989;
                    }
                } else {
                    for (int var6 = 4; var6 >= 0; --var6) {
                        if (class92.field2110[var6] != null) {
                            short var8 = 0;
                            int var9 = 0;
                            ++class23.field563;
                            if (class92.field2110[var6].method831(class42.field966, -21607)) {
                                if (arg2.field306 > class119.field2842.field306) {
                                    var8 = 2000;
                                }
                                if (~class119.field2842.field303 != -1 && ~arg2.field303 != -1) {
                                    if (class119.field2842.field303 != arg2.field303) {
                                        var8 = 0;
                                    } else {
                                        var8 = 2000;
                                    }
                                }
                            } else if (class89.field2053[var6]) {
                                var8 = 2000;
                            }
                            if (var6 == 0) {
                                var9 = 20 - -var8;
                            }
                            if (~var6 == -2) {
                                var9 = var8 + 21;
                            }
                            if (~var6 == -3) {
                                var9 = var8 + 6;
                            }
                            if (~var6 == -4) {
                                var9 = 33 - -var8;
                            }
                            if (var6 == 4) {
                                var9 = var8 + 31;
                            }
                            class105.method832(var9, arg0, arg3, (byte) 123, class108.method878(new class105[] { class90.field2060, var5 }, arg4 + 867), class92.field2110[var6], arg1);
                        }
                    }
                }
                if (arg4 == 2000) {
                    for (int var7 = 0; ~var7 > ~class113.field2652; ++var7) {
                        if (class15.field298[var7] == 4) {
                            class95.field2197[var7] = class108.method878(new class105[] { class90.field2068, class67.field1525, class90.field2060, var5 }, 2867);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)Ljb;", line = 240)
    public final class56 method168(int arg0) {
        ++field2676;
        if (arg0 <= 6) {
            field2671 = null;
        }
        if (this.field2681 == null) {
            return null;
        } else {
            class116 var2 = super.field1238 != -1 && super.field1230 == 0 ? class6.method49(103, super.field1238) : null;
            class116 var3 = ~super.field1271 == 0 || super.field1290 == super.field1271 && var2 != null ? null : class6.method49(103, super.field1271);
            class56 var4 = this.field2681.method218(super.field1267, var3, 1762, super.field1262, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method444();
                super.field1246 = var4.field1328;
                if (~super.field1245 != 0 && ~super.field1215 != 0) {
                    class56 var5 = class118.method956(super.field1245, 19452).method724(super.field1215, (byte) 70);
                    if (var5 != null) {
                        var5.method445(0, -super.field1216, 0);
                        class56[] var6 = new class56[] { var4, var5 };
                        var4 = new class56(var6, 2, true);
                    }
                }
                if (this.field2681.field461 == 1) {
                    var4.field1135 = true;
                }
                return var4;
            }
        }
    }
}
