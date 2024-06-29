import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class469 extends class152 implements class620 {

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "Lpga;")
    public class152 field6121;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "Lfl;")
    public static class103 field6131 = new class103(7, 2);

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I", line = 4)
    public final int method70(boolean arg0) {
        if (!arg0) {
            this.method77((byte) -71);
        }
        field6130++;
        return 0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZII)I", line = 16)
    public static final int method2599(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field6116++;
        if (var4 == 0) {
            return arg3;
        } else if (arg1) {
            return -54;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIB)I", line = 37)
    public static final int method2600(int arg0, int arg1, byte arg2) {
        field6136++;
        if (arg2 == 125) {
            return arg1 == 4 || arg1 == 5 ? class313.field4067[arg0 & 0x3] : 256;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method2601(int arg0, byte arg1) {
        field6120++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 >= -62) {
            field6131 = null;
        }
        if (class245.field3279[arg0]) {
            class12.field123.method3360(true, arg0);
            class322.field4179[arg0] = null;
            class160.field2005[arg0] = null;
            class245.field3279[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z", line = 78)
    public final boolean method75(int arg0) {
        int var2 = 25 / ((arg0 - 26) / 38);
        field6129++;
        return false;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIZZ)V", line = 92)
    public static final void method2602(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class291.field3760 = arg0;
        class688.field9414 = 0x1 << class291.field3760;
        class57.field768 = class688.field9414 >> 1;
        class77.field1045 = (int) Math.sqrt((double) (class57.field768 * class57.field768 + class57.field768 * class57.field768));
        class354.field4576 = class688.field9414 >> 2;
        class332.field4317 = class688.field9414;
        class590.field8010 = arg2;
        class151.field1933 = arg3;
        class703.field9809 = arg4;
        class515.field6748 = new class530[arg1][class590.field8010][class151.field1933];
        class353.field4540 = new class88[arg1];
        if (arg5) {
            class176.field2196 = new int[class590.field8010][class151.field1933];
            class315.field4084 = new byte[class590.field8010][class151.field1933];
            class612.field8277 = new short[class590.field8010][class151.field1933];
            class168.field2096 = new class530[1][class590.field8010][class151.field1933];
            class477.field6327 = new class88[1];
        } else {
            class176.field2196 = null;
            class315.field4084 = null;
            class612.field8277 = null;
            class168.field2096 = null;
            class477.field6327 = null;
        }
        if (arg6) {
            class283.field3689 = new long[arg1][arg2][arg3];
            class421.field5440 = new class357[65535];
            class252.field3442 = new boolean[65535];
            class421.field5444 = 0;
        } else {
            class283.field3689 = null;
            class421.field5440 = null;
            class252.field3442 = null;
            class421.field5444 = 0;
        }
        class160.method1139(false);
        class473.field6165 = new class24[1000];
        class314.field4069 = 0;
        class645.field8990 = new class24[1000];
        class47.field664 = 0;
        class105.field1384 = new int[arg1][class590.field8010 + 1][class151.field1933 + 1];
        class57.field772 = new class34[5000];
        class516.field6758 = 0;
        class505.field6641 = new boolean[class703.field9809 + class703.field9809 + 1][class703.field9809 + class703.field9809 + 1];
        class294.field3808 = new boolean[class703.field9809 + class703.field9809 + 2][class703.field9809 + class703.field9809 + 2];
        class89.field1174 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 148)
    public final void method64(byte arg0) {
        int var2 = 44 % ((arg0 + 71) / 39);
        field6134++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Loa;I)V", line = 157)
    public final void method62(class43 arg0, int arg1) {
        field6124++;
        if (arg1 != 6526) {
            field6131 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)Z", line = 167)
    public final boolean method78(int arg0) {
        field6115++;
        if (arg0 != 0) {
            this.method67(null, 106);
        }
        return false;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLpe;I)Ldga;", line = 178)
    public static final class230 method2603(int arg0, byte arg1, class615 arg2, int arg3) {
        field6126++;
        class418 var4 = new class418(arg2.method3346(-1, arg0, arg3));
        class230 var5 = new class230(arg3, var4.method2394(arg1 - 78), var4.method2394(4), var4.method2355(70), var4.method2355(43), var4.method2396(6) == 1, var4.method2396(-117), var4.method2396(-127));
        int var6 = var4.method2396(-116);
        if (arg1 != 82) {
            return null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3059.method2087(new class235(var4.method2396(41), var4.method2393(-30727), var4.method2393(arg1 - 30809), var4.method2393(-30727), var4.method2393(arg1 ^ 0xFFFF87AB), var4.method2393(-30727), var4.method2393(-30727), var4.method2393(-30727), var4.method2393(-30727)), 107);
        }
        var5.method1452((byte) 120);
        return var5;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(Loa;I)V", line = 205)
    public final void method67(class43 arg0, int arg1) {
        field6118++;
        if (arg1 != 2) {
            method2601(99, (byte) -71);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Loa;B)Lpl;", line = 215)
    public final class215 method71(class43 arg0, byte arg1) {
        field6122++;
        int var3 = 37 % ((arg1 - 12) / 41);
        return null;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(Loa;I)Lcd;", line = 225)
    public final class564 method72(class43 arg0, int arg1) {
        field6114++;
        if (arg1 != 21098) {
            this.method75(83);
        }
        return this.field6121.method72(arg0, 21098);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIILpga;)V", line = 236)
    public class469(int arg0, int arg1, int arg2, class152 arg3) {
        super(arg0, arg1, arg2, arg3.field1944, false, false);
        this.field6121 = arg3;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)I", line = 246)
    public final int method66(byte arg0) {
        field6127++;
        if (arg0 != -42) {
            this.method66((byte) -74);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILoa;I)Z", line = 257)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        if (arg3 >= -98) {
            return false;
        } else {
            field6133++;
            return false;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLoi;)V", line = 269)
    public static final void method2604(byte arg0, class57 arg1) {
        field6137++;
        if (!class594.field8025) {
            arg1.method2438((byte) 110);
            int var2 = 46 / ((37 - arg0) / 34);
            class291.field3758--;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(IIII)Z", line = 283)
    public static final boolean method2605(int arg0, int arg1, int arg2, int arg3) {
        if (class207.method1332(arg0, arg1, arg2)) {
            int var4 = arg1 << class291.field3760;
            int var5 = arg2 << class291.field3760;
            return class239.method1510(var4 + 1, class392.field4997[arg0].method668(arg1, arg2) + arg3, var5 + 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1 + 1, arg2) + arg3, var5 + 1) && class239.method1510(class688.field9414 + var4 - 1, class392.field4997[arg0].method668(arg1 + 1, arg2 + 1) + arg3, class688.field9414 + var5 - 1) && class239.method1510(var4 + 1, class392.field4997[arg0].method668(arg1, arg2 + 1) + arg3, class688.field9414 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILoa;ILcq;ZI)V", line = 296)
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        if (arg6 >= -2) {
            field6132 = 3;
        }
        field6125++;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Loa;I)V", line = 307)
    public final void method65(class43 arg0, int arg1) {
        field6135++;
        if (arg1 >= -121) {
            field6131 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Loa;II)Lba;", line = 324)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        field6128++;
        if (arg2 != 25871) {
            this.field6121 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)V", line = 335)
    public final void method77(byte arg0) {
        if (arg0 != 7) {
            this.field6121 = null;
        }
        field6119++;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V", line = 346)
    public static void method2606(int arg0) {
        field6131 = null;
        int var1 = -54 % ((-arg0 - 50) / 45);
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(B)V", line = 356)
    public static final void method2607(byte arg0) {
        if (class566.field7391 == 3) {
            class442.method2508(4, 1);
        } else if (class566.field7391 == 7) {
            class442.method2508(8, 1);
        } else if (class566.field7391 == 10) {
            class442.method2508(11, 1);
        }
        int var1 = 79 % ((-arg0 - 53) / 61);
        field6123++;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)I", line = 380)
    public final int method76(byte arg0) {
        if (arg0 >= -92) {
            this.field6121 = null;
        }
        field6117++;
        return 0;
    }
}
