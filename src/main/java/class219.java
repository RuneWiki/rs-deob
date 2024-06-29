import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class219 {

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[B")
    private byte[] field3554 = new byte[4];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Loi;")
    private class32 field3531;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "J")
    private long field3535;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lma;")
    private static class5 field3545 = class12.method119("scroll:", (byte) 73);

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lma;")
    public static class5 field3547 = field3545;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lma;")
    public static class5 field3544 = field3545;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "[I")
    public static int[] field3551 = new int[25];

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lma;")
    public static class5 field3552 = class12.method119("_labels", (byte) 109);

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Lma;")
    private static class5 field3555 = class12.method119("Prepared sound engine", (byte) 89);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lma;")
    public static class5 field3541 = field3555;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Lma;")
    public static class5 field3556 = class12.method119(" ", (byte) 97);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3549;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Z")
    public static boolean field3548;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[B")
    private byte[] field3533;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BILec;II)V", line = 7)
    public static final void method1487(byte arg0, int arg1, class91 arg2, int arg3, int arg4) {
        field3537++;
        if (class151.field2183 == arg2 || class282.field4794 >= 400) {
            return;
        }
        class5 var5;
        if (arg2.field1351 == 0) {
            var5 = class288.method1940((byte) 115, new class5[] { arg2.method596((byte) -126), class47.method353(arg2.field1380, class151.field2183.field1380, true), class90.field1346, class275.field4691, class175.method1148(arg2.field1380, false), class141.field2074 });
        } else {
            var5 = class288.method1940((byte) 66, new class5[] { arg2.method596((byte) -126), class90.field1346, class158.field2392, class175.method1148(arg2.field1351, false), class141.field2074 });
        }
        if (class96.field1431 == 1) {
            class189.field2951++;
            class137.method890(arg4, class288.method1940((byte) 78, new class5[] { class59.field922, class194.field3025, var5 }), 29639, class274.field4669, arg3, (short) 4, (long) arg1);
        } else if (!class265.field4539) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class69.field1088[var6] != null) {
                    client.field1757++;
                    short var7 = 0;
                    if (class275.field4690 == 0 && class69.field1088[var6].method29(61, class69.field1099)) {
                        if (class151.field2183.field1380 < arg2.field1380) {
                            var7 = 2000;
                        }
                        if (class151.field2183.field1377 != 0 && arg2.field1377 != 0) {
                            if (class151.field2183.field1377 == arg2.field1377) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class302.field5094[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class202.field3249[var6];
                    short var10 = (short) (var7 + var9);
                    class137.method890(arg4, class288.method1940((byte) 84, new class5[] { class197.field3135, var5 }), 29639, class69.field1088[var6], arg3, var10, (long) arg1);
                }
            }
        } else if ((class157.field2347 & 0x8) == 8) {
            class156.field2329++;
            class137.method890(arg4, class288.method1940((byte) 108, new class5[] { class110.field1634, class194.field3025, var5 }), 29639, class23.field405, arg3, (short) 28, (long) arg1);
        }
        if (arg0 <= 46) {
            return;
        }
        for (int var11 = 0; var11 < class282.field4794; var11++) {
            if (class104.field1554[var11] == 47) {
                class20.field344[var11] = class288.method1940((byte) 109, new class5[] { class197.field3135, var5 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 108)
    public static final int method1488(int arg0) {
        field3539++;
        return arg0 == 17029 ? ((class264.field4492 == 0 ? 0 : 1) << 20) + ((class80.field1239 ? 1 : 0) << 19) + ((class86.field1300 & 0x3) << 17) + ((class265.field4531 ? 1 : 0) << 15) + ((class8.field114 ? 1 : 0) << 13) + ((class77.field1208 ? 1 : 0) << 10) + ((class234.field3870 ? 1 : 0) << 7) + ((class112.field1663 ? 1 : 0) << 5) + (class66.field1037 & 0x7) + (((class29.field474 ? 1 : 0) << 3) - -((class264.field4522 ? 1 : 0) << 4)) + (((class181.field2765 ? 1 : 0) << 6) + ((class117.field1781 ? 1 : 0) << 8) + ((class190.field2973 ? 1 : 0) << 9) - -((class236.field3895 & 0x3) << 11) + ((class275.field4685 ? 1 : 0) << 16) + ((class247.field4092 == 0 ? 0 : 1) << 21) - -((class130.field1955 == 0 ? 0 : 1) << 22)) : 54;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)[B", line = 122)
    public final byte[] method1489(byte arg0) throws IOException {
        field3542++;
        if (arg0 > -29) {
            method1492(67, (class148) null);
        }
        if (this.field3535 < class212.method1404((byte) -95)) {
            throw new IOException("fdt");
        }
        if (this.field3538 == 0) {
            if (this.field3531.field497 == 2) {
                throw new IOException("fds");
            }
            if (this.field3531.field497 == 1) {
                this.field3538 = 1;
                this.field3549 = (DataInputStream) this.field3531.field496;
            }
        }
        if (this.field3538 == 1) {
            int var2 = this.field3549.available();
            if (var2 > 0) {
                if ((var2 + this.field3553) > 4) {
                    var2 = 4 - this.field3553;
                }
                this.field3553 += this.field3549.read(this.field3554, this.field3553, var2);
                if (this.field3553 == 4) {
                    int var3 = (new class221(this.field3554)).method1517((byte) -116);
                    this.field3533 = new byte[var3];
                    this.field3538 = 2;
                }
            }
        }
        if (this.field3538 == 2) {
            int var4 = this.field3549.available();
            if (var4 > 0) {
                if (this.field3533.length < (var4 + this.field3536)) {
                    var4 = this.field3533.length - this.field3536;
                }
                this.field3536 += this.field3549.read(this.field3533, this.field3536, var4);
                if (this.field3533.length == this.field3536) {
                    return this.field3533;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 203)
    public static final void method1490(int arg0) {
        field3550++;
        class241.field4004.method523(124);
        class179.field2712.method523(126);
        class23.field404.method523(125);
        int var1 = -41 % ((59 - arg0) / 40);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLnc;)V", line = 215)
    public static final void method1491(byte arg0, class12 arg1) {
        field3546++;
        if (arg1.field218 == 0) {
            return;
        }
        if (arg1.field223 != -1 && arg1.field223 < 32768) {
            class177 var2 = class119.field1804[arg1.field223];
            if (var2 != null) {
                int var3 = arg1.field178 - var2.field178;
                int var4 = arg1.field211 - var2.field211;
                if (var3 != 0 || var4 != 0) {
                    arg1.field215 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 != 113) {
            field3545 = (class5) null;
        }
        if (arg1.field223 >= 32768) {
            int var5 = arg1.field223 - 32768;
            if (class161.field2460 == var5) {
                var5 = 2047;
            }
            class91 var6 = class267.field4593[var5];
            if (var6 != null) {
                int var7 = arg1.field178 - var6.field178;
                int var8 = arg1.field211 - var6.field211;
                if (var7 != 0 || var8 != 0) {
                    arg1.field215 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field235 != 0 || arg1.field207 != 0) && (arg1.field208 == 0 || arg1.field181 > 0)) {
            int var9 = (arg1.field226 * 64) + arg1.field178 - ((arg1.field235 - class193.field3017 - class193.field3017) * 64) - 64;
            int var10 = (arg1.field226 - 1) * 64 + arg1.field211 - ((arg1.field207 - class74.field1158 - class74.field1158) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field215 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field235 = 0;
            arg1.field207 = 0;
        }
        int var11 = arg1.field215 - arg1.field174 & 0x7FF;
        if (var11 == 0) {
            arg1.field196 = 0;
            return;
        }
        arg1.field196++;
        if (var11 > 1024) {
            arg1.field174 -= arg1.field218;
            boolean var12 = true;
            if (var11 < arg1.field218 || 2048 - arg1.field218 < var11) {
                var12 = false;
                arg1.field174 = arg1.field215;
            }
            if (arg1.field202 == arg1.field173 && (arg1.field196 > 25 || var12)) {
                if (arg1.field210 == -1) {
                    arg1.field173 = arg1.field206;
                } else {
                    arg1.field173 = arg1.field210;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field174 += arg1.field218;
            if (arg1.field218 > var11 || (2048 - arg1.field218) < var11) {
                arg1.field174 = arg1.field215;
                var13 = false;
            }
            if (arg1.field202 == arg1.field173 && (arg1.field196 > 25 || var13)) {
                if (arg1.field229 == -1) {
                    arg1.field173 = arg1.field206;
                } else {
                    arg1.field173 = arg1.field229;
                }
            }
        }
        arg1.field174 &= 0x7FF;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILoj;)V", line = 351)
    public static final void method1492(int arg0, class148 arg1) {
        field3534++;
        if (arg1.field2144 != null) {
            arg1.field2144.field1875 = 0;
        }
        if (arg0 != 0) {
            method1490(57);
        }
        arg1.field2142 = false;
        for (class148 var2 = arg1.method279(); var2 != null; var2 = arg1.method270()) {
            method1492(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 388)
    public static void method1493(int arg0) {
        field3556 = null;
        field3551 = null;
        field3541 = null;
        field3545 = null;
        if (arg0 == 0) {
            field3547 = null;
            field3544 = null;
            field3555 = null;
            field3552 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lhf;Ljava/net/URL;)V", line = 415)
    public class219(class154 arg0, URL arg1) {
        this.field3531 = arg0.method981((byte) -13, arg1);
        this.field3538 = 0;
        this.field3535 = class212.method1404((byte) -114) + 30000L;
    }
}
