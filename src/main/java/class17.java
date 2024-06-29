import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class17 extends class51 {

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    private int field345 = 20;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
    private int field348 = 1365;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    private int field347 = 0;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "Lea;")
    public static class38 field353 = class9.method46((byte) 121, ")2");

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Lea;")
    public static class38 field343 = class9.method46((byte) 122, "null");

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "Lrc;")
    public static class155 field344 = new class155(64);

    @OriginalMember(owner = "client!bg", name = "pb", descriptor = "I")
    public static int field358 = 1;

    @OriginalMember(owner = "client!bg", name = "rb", descriptor = "Lea;")
    public static class38 field360 = class9.method46((byte) 101, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!bg", name = "qb", descriptor = "Lea;")
    public static class38 field359 = class9.method46((byte) 107, "leuchten2:");

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bg", name = "lb", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bg", name = "mb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bg", name = "nb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bg", name = "ob", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method95(int arg0, String arg1, Throwable arg2) {
        ++field356;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = client.method164(-93, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class113.field2523.field2772 != null) {
                class61 var8 = class113.field2523.method956((byte) 40, new URL(class113.field2523.field2772.getCodeBase(), "clienterror.ws?c=" + class197.field3878 + "&u=" + class188.field3755 + "&v1=" + class129.field2766 + "&v2=" + class129.field2760 + "&e=" + var7));
                while (var8.field1486 == 0) {
                    class132.method969(1L, (byte) 58);
                }
                if (arg0 > -48) {
                    field344 = null;
                }
                if (var8.field1486 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1490;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)V")
    public static void method96(int arg0) {
        field353 = null;
        field344 = null;
        field360 = null;
        field343 = null;
        if (arg0 != -1950612276) {
            method99((class66) null, false);
        }
        field359 = null;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ldd;IBLdd;I)Lm;")
    public static final class107 method97(class32 arg0, int arg1, byte arg2, class32 arg3, int arg4) {
        if (arg2 != 119) {
            return null;
        } else {
            ++field354;
            return !class74.method592(arg1, arg0, (byte) 124, arg4) ? null : class23.method136(arg3.method215(arg1, arg4, 1), 110);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILc;I)V")
    public static final void method98(int arg0, class19 arg1, int arg2) {
        ++field351;
        if (class45.field1098 < arg1.field388) {
            class132.method975(arg1, true);
        } else if (~arg1.field407 <= ~class45.field1098) {
            class22.method133(128, arg1);
        } else {
            class33.method221((byte) 69, arg1);
        }
        if (arg1.field406 < 128 || arg1.field382 < 128 || ~arg1.field406 <= -13185 || arg1.field382 >= 13184) {
            arg1.field407 = 0;
            arg1.field376 = -1;
            arg1.field395 = -1;
            arg1.field406 = arg1.field391[0] * 128 + arg1.field423 * 64;
            arg1.field382 = arg1.field409[0] * 128 + arg1.field423 * 64;
            arg1.field388 = 0;
            arg1.method112(77);
        }
        if (class195.field3842 == arg1 && (~arg1.field406 > -1537 || ~arg1.field382 > -1537 || ~arg1.field406 <= -11777 || ~arg1.field382 <= -11777)) {
            arg1.field406 = arg1.field391[0] * 128 + arg1.field423 * 64;
            arg1.field376 = -1;
            arg1.field395 = -1;
            arg1.field388 = 0;
            arg1.field407 = 0;
            arg1.field382 = arg1.field409[0] * 128 + arg1.field423 * 64;
            arg1.method112(123);
        }
        if (arg2 >= 97) {
            class103.method846(arg1, (byte) 113);
            class56.method415(arg1, 8716);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhc;Z)Lfe;")
    public static final class51 method99(class66 arg0, boolean arg1) {
        ++field352;
        int var2 = arg0.method509(121);
        int var3 = arg0.method509(117);
        Class var4 = class50.method360(var3, !arg1);
        try {
            class51 var5 = (class51) var4.newInstance();
            if (!arg1) {
                return null;
            } else {
                if (var5 != null) {
                    var5.field1301 = var2;
                    var5.field1295 = arg0.method509(116);
                    int var6 = arg0.method509(120);
                    for (int var7 = 0; ~var7 > ~var6; ++var7) {
                        int var8 = arg0.method509(118);
                        var5.method51(arg0, var8, true);
                    }
                }
                var5.method235(-2);
                return var5;
            }
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIILqa;)V")
    public static final void method100(byte arg0, int arg1, int arg2, int arg3, class144 arg4) {
        ++field355;
        if (class195.field3842 != arg4) {
            if (class94.field2121 < 400) {
                class38 var5;
                if (arg4.field2990 == 0) {
                    var5 = class163.method1168(-48, new class38[] { arg4.field3022, class130.method960(-3, arg4.field3007, class195.field3842.field3007), class151.field3118, class185.field3682, class151.method1059(arg4.field3007, (byte) -114), class63.field1539 });
                } else {
                    var5 = class163.method1168(120, new class38[] { arg4.field3022, class151.field3118, class44.field1082, class151.method1059(arg4.field2990, (byte) -114), class63.field1539 });
                }
                if (~class114.field2529 != -2) {
                    if (!class23.field489) {
                        for (int var6 = 7; ~var6 <= -1; --var6) {
                            if (class175.field3549[var6] != null) {
                                ++class66.field1581;
                                short var7 = 0;
                                boolean var8 = false;
                                if (!class175.field3549[var6].method263(class43.field941, (byte) 116)) {
                                    if (class133.field2813[var6]) {
                                        var7 = 2000;
                                    }
                                } else {
                                    if (arg4.field3007 > class195.field3842.field3007) {
                                        var7 = 2000;
                                    }
                                    if (class195.field3842.field3017 != 0 && arg4.field3017 != 0) {
                                        if (~class195.field3842.field3017 != ~arg4.field3017) {
                                            var7 = 0;
                                        } else {
                                            var7 = 2000;
                                        }
                                    }
                                }
                                int var9 = class108.field2440[var6] - -var7;
                                method101(var9, arg3, class175.field3549[var6], arg1, true, class163.method1168(122, new class38[] { class63.field1531, var5 }), arg2);
                            }
                        }
                    } else if (~(8 & class140.field2917) == -9) {
                        method101(34, arg3, class10.field220, arg1, true, class163.method1168(-102, new class38[] { class146.field3040, class133.field2816, var5 }), arg2);
                        ++class167.field3443;
                    }
                } else {
                    ++class30.field606;
                    method101(22, arg3, class163.field3384, arg1, true, class163.method1168(-81, new class38[] { class154.field3210, class133.field2816, var5 }), arg2);
                }
                for (int var10 = 0; ~var10 > ~class94.field2121; ++var10) {
                    if (~class132.field2810[var10] == -3) {
                        class205.field4031[var10] = class163.method1168(5, new class38[] { class63.field1531, var5 });
                        break;
                    }
                }
                int var11 = 99 / ((54 - arg0) / 53);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILea;IZLea;I)V")
    public static final void method101(int arg0, int arg1, class38 arg2, int arg3, boolean arg4, class38 arg5, int arg6) {
        ++field357;
        if (!arg4) {
            field350 = 57;
        }
        if (!class169.field3482) {
            if (~class94.field2121 > -501) {
                class98.field2186[class94.field2121] = arg2;
                class205.field4031[class94.field2121] = arg5;
                class132.field2810[class94.field2121] = arg0;
                class150.field3104[class94.field2121] = arg6;
                class141.field2972[class94.field2121] = arg3;
                class149.field3090[class94.field2121] = arg1;
                ++class94.field2121;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field349;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            for (int var4 = 0; var4 < class86.field2008; ++var4) {
                int var5 = (class196.field3854[var4] << 12) / this.field348 + this.field347;
                int var6 = var5;
                int var7 = (class170.field3490[arg1] << 12) / this.field348 + this.field346;
                int var8 = var7;
                int var9 = var5 * var5 >> 12;
                int var10 = var5;
                int var11 = var7;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (~(var9 - -var12) > -16385 && var13 < this.field345) {
                    ++var13;
                    var11 = (var10 * var11 >> 12) * 2 - -var8;
                    var10 = var9 - -var6 + -var12;
                    var9 = var10 * var10 >> 12;
                    var12 = var11 * var11 >> 12;
                }
                var3[var4] = ~(this.field345 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field345;
            }
        }
        if (arg0 >= -125) {
            this.method51((class66) null, -85, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field346 = arg0.method511(75);
                    }
                } else {
                    this.field347 = arg0.method511(59);
                }
            } else {
                this.field345 = arg0.method511(-123);
            }
        } else {
            this.field348 = arg0.method511(121);
        }
        if (!arg2) {
            method97((class32) null, -72, (byte) 28, (class32) null, -62);
        }
        ++field342;
    }
}
