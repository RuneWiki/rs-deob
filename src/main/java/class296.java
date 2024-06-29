import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class296 extends class218 {

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field4617 = 0;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
    public static boolean field4614 = true;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[I")
    public static int[] field4619 = new int[200];

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lbi;")
    public static class91 field4615;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 7)
    public final void method882(int arg0, int arg1, int arg2) {
        field4626++;
        if (arg2 != 4) {
            field4625 = -79;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIII)V", line = 16)
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4624 = arg0;
        this.field4620 = arg2;
        this.field4618 = arg3;
        this.field4616 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V", line = 31)
    public final void method881(byte arg0, int arg1, int arg2) {
        if (arg0 < 96) {
            method2094(-106, -37, 64, 30, -52, 104, -111);
        }
        field4628++;
        int var4 = this.field4624 * arg1 >> 12;
        int var5 = this.field4616 * arg2 >> 12;
        int var6 = this.field4620 * arg1 >> 12;
        int var7 = this.field4618 * arg2 >> 12;
        class309.method2171(var5, var4, this.field3071, (byte) 120, this.field3070, this.field3065, var7, var6);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 48)
    public static void method2093(byte arg0) {
        field4619 = null;
        field4615 = null;
        if (arg0 > -122) {
            method2094(61, -126, -126, -121, -81, 97, -62);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V", line = 61)
    public static final void method2094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class342 var7 = new class342();
        var7.field5321 = arg1 / 128;
        var7.field5314 = arg2 / 128;
        var7.field5305 = arg3 / 128;
        var7.field5306 = arg4 / 128;
        var7.field5317 = arg0;
        var7.field5322 = arg1;
        var7.field5295 = arg2;
        var7.field5318 = arg3;
        var7.field5320 = arg4;
        var7.field5319 = arg5;
        var7.field5310 = arg6;
        class287.field4507[class31.field390++] = var7;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lp;I)V", line = 88)
    public static final void method2095(class107 arg0, int arg1) {
        if (arg1 <= 41) {
            field4625 = -40;
        }
        field4623++;
        while (true) {
            while (arg0.field1388.length > arg0.field1400) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method661(-1) == 1) {
                    var3 = true;
                    var2 = arg0.method661(-1);
                    var4 = arg0.method661(-1);
                }
                int var5 = arg0.method661(-1);
                int var6 = arg0.method661(-1);
                int var7 = class249.field3771 + class308.field4766 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class239.field3595;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class291.field4574 && class308.field4766 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var11 < (var2 * 8 + 8) && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg0.method661(-1);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method661(-1);
                                        if (class149.field2078[var9][var10] == null) {
                                            class149.field2078[var9][var10] = new byte[4096];
                                        }
                                        class149.field2078[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method622((byte) -127);
                                        if (class57.field687[var9][var10] == null) {
                                            class57.field687[var9][var10] = new int[4096];
                                        }
                                        class57.field687[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method622((byte) -116);
                                        if (class157.field2167[var9][var10] == null) {
                                            class157.field2167[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class238 var17 = class142.method951(var16, 26915);
                                        if (var17.field3525 != null) {
                                            var17 = var17.method1706(true);
                                            if (var17 == null || var17.field3547 == -1) {
                                                continue;
                                            }
                                        }
                                        class157.field2167[var9][var10][(63 - var12 << 6) + var11] = var17.field3548 + 1;
                                        class316 var18 = new class316();
                                        var18.field4869 = var8;
                                        var18.field4863 = var17.field3547;
                                        var18.field4866 = var7;
                                        class132.field1809.method2325(var18, (byte) 34);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method661(-1);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1400++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1400 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1400 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V", line = 246)
    public final void method884(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4624 * arg0 >> 12;
        int var5 = this.field4620 * arg0 >> 12;
        int var6 = this.field4616 * arg1 >> 12;
        field4627++;
        int var7 = this.field4618 * arg1 >> 12;
        if (arg2) {
            this.method884(-36, -4, false);
        }
        class228.method1583(27, var7, var4, this.field3065, var6, var5);
    }
}
