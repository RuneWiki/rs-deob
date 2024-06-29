import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class279 extends class155 {

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4490 = "red:";

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field4492 = 0;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field4498 = -1;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Z")
    public static boolean field4487 = false;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lpm;")
    public static class242 field4502;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Ljava/lang/String;")
    public String field4491;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "[I")
    public static int[] field4501;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V")
    public final void method1928(boolean arg0) {
        super.field2422 |= Long.MIN_VALUE;
        if (arg0) {
            this.method1929((byte) 120);
        }
        if (this.method1929((byte) 26) == 0L) {
            class86.field1360.method1453(-109, this);
        }
        ++field4503;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)J")
    public final long method1929(byte arg0) {
        ++field4497;
        if (arg0 != 26) {
            field4492 = -62;
        }
        return Long.MAX_VALUE & super.field2422;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLmh;)V")
    public static final void method1930(boolean arg0, class263 arg1) {
        ++field4500;
        int var2 = arg1.field4179;
        if (var2 == 324) {
            if (~class223.field3272 == 0) {
                class163.field2523 = arg1.field4142;
                class223.field3272 = arg1.field4090;
            }
            if (class31.field384.field4775) {
                arg1.field4090 = class223.field3272;
            } else {
                arg1.field4090 = class163.field2523;
            }
        } else if (~var2 == -326) {
            if (~class223.field3272 == 0) {
                class223.field3272 = arg1.field4090;
                class163.field2523 = arg1.field4142;
            }
            if (!class31.field384.field4775) {
                arg1.field4090 = class223.field3272;
            } else {
                arg1.field4090 = class163.field2523;
            }
        } else {
            if (arg0) {
                method1935(-82, 126);
            }
            if (var2 == 327) {
                arg1.field4211 = 150;
                arg1.field4071 = 2047 & (int) (Math.sin((double) class199.field2930 / 40.0D) * 256.0D);
                arg1.field4158 = 5;
                arg1.field4060 = -1;
            } else if (var2 == 328) {
                if (class213.field3139.field3069 == null) {
                    arg1.field4060 = 0;
                } else {
                    arg1.field4211 = 150;
                    arg1.field4071 = (int) (256.0D * Math.sin((double) class199.field2930 / 40.0D)) & 2047;
                    arg1.field4158 = 5;
                    arg1.field4060 = 2047 + ((int) class143.method1064((byte) -128, class213.field3139.field3069) << 11);
                    arg1.field4076 = class213.field3139.field3685;
                    arg1.field4130 = 0;
                    arg1.field4122 = class213.field3139.field3752;
                    arg1.field4156 = class213.field3139.field3708;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)I")
    public static final int method1931(int arg0, boolean arg1) {
        ++field4496;
        if (!arg1) {
            field4492 = 17;
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)I")
    public final int method1932(byte arg0) {
        if (arg0 != 91) {
            method1930(true, (class263) null);
        }
        ++field4494;
        return (int) super.field4008;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method1933(int arg0) {
        field4501 = null;
        field4490 = null;
        if (arg0 <= 92) {
            field4487 = false;
        }
        field4502 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
    public final void method1934(byte arg0) {
        if (arg0 != -114) {
            this.method1934((byte) 88);
        }
        super.field2422 = 500L + class3.method14(arg0 + 29967) | super.field2422 & Long.MIN_VALUE;
        ++field4493;
        class142.field2293.method1453(arg0 + 50, this);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lwa;")
    public static final class256 method1935(int arg0, int arg1) {
        class256 var2 = (class256) class17.field175.method1418((long) arg1, arg0 + -30);
        ++field4504;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class294.field4716.method1868(arg1, arg0, arg0 + -29);
            class256 var4 = new class256();
            if (var3 != null) {
                var4.method1760(arg1, (byte) -39, new class53(var3));
            }
            class17.field175.method1421((long) arg1, var4, (byte) -111);
            return var4;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)I")
    public final int method1936(byte arg0) {
        if (arg0 > -59) {
            return -50;
        } else {
            ++field4499;
            return (int) (super.field4008 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1937(byte arg0, String arg1) {
        ++field4495;
        if (~class228.field3349 <= -3) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class106.method820((byte) 103);
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class258.method1777(-1, 0, (String) null, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class106.method820((byte) 103);
                for (int var5 = 0; var5 < 10; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class258.method1777(-1, 0, (String) null, "Memory before cleanup=" + var7 + "k");
                class214.method1497(78);
                class106.method820((byte) 122);
                for (int var8 = 0; ~var8 > -11; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class258.method1777(arg0 + 11, 0, (String) null, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class258.method1777(-1, 0, (String) null, "Number of player models in cache:" + class24.method165(arg0 ^ 111));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class6.method35(arg0 ^ 113);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class188.field2802.method1836((byte) 82);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class188.field2802.method1845(arg0 + -13918);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class273.field4426.method927(arg0 + -15399);
                class281.field4537.method1438(0);
                class188.field2802.method1828(-74);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class302.field4887 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class79.method586(-1, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class191.field2828 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class191.field2828 = false;
            }
            if (arg1.startsWith("::setba")) {
                class265.field4245 = class219.method1531(arg1.substring(8), arg0 ^ -2775);
                class89.method667(1, class273.field4426);
                class145.field2344 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class88.method656(class219.method1531(arg1.substring(15), 2781));
                class89.method667(arg0 ^ -11, class273.field4426);
                class145.field2344 = false;
            }
            if (arg1.startsWith("::fps ") && ~class113.field1868 != -1) {
                class87.method646(class219.method1531(arg1.substring(6), 2781), (byte) -113);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class281.field4530 = class219.method1531(arg1.substring(12).trim(), 2781);
                class258.method1777(-1, 0, (String) null, "rect_debug=" + class281.field4530);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class270.field4368 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (!field4487) {
                    field4487 = true;
                    class258.method1777(-1, 0, (String) null, "Forced tweening ENABLED!");
                } else {
                    field4487 = false;
                    class258.method1777(-1, 0, (String) null, "Forced tweening disabled.");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (!class225.field3307) {
                    System.out.println("Shift-click ENABLED!");
                    class225.field3307 = true;
                } else {
                    System.out.println("Shift-click disabled.");
                    class225.field3307 = false;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class258.method1777(-1, 0, (String) null, "x:" + (class213.field3139.field3660 >> 7) + " z:" + (class213.field3139.field3753 >> 7) + " groundh:" + class103.field1792[class37.field474][class213.field3139.field3660 >> 7][class213.field3139.field3753 >> 7]);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class258.method1777(-1, 0, (String) null, "Height: " + class103.field1792[class37.field474][class213.field3139.field3660 >> 7][class213.field3139.field3753 >> 7]);
            }
        }
        ++class305.field4929;
        class144.field2338.method683(true, 216);
        if (arg0 != -12) {
            field4501 = null;
        }
        class144.field2338.method360(arg1.length() - 1, 25759);
        class144.field2338.method338(arg1.substring(2), arg0 + 1982);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
    public class279(int arg0, int arg1) {
        super.field4008 = (long) arg1 | (long) arg0 << 32;
    }
}
