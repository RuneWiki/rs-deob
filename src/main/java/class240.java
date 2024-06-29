import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class240 extends class215 {

    @OriginalMember(owner = "client!km", name = "w", descriptor = "[Lmh;")
    public static class454[] field3497 = new class454[14];

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[I")
    public static int[] field3499 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field3496 = -50;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "[I")
    public static int[] field3500 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static final void method1510(byte arg0) {
        field3498++;
        for (int var1 = 0; var1 < class169.field2464; var1++) {
            int var2 = class373.field5317[var1];
            class429 var3 = ((class378) class125.field1687.method2405((long) var2, -83)).field5353;
            int var4 = class264.field3874.method2357((byte) 121);
            if ((var4 & 0x10) != 0) {
                var4 += class264.field3874.method2357((byte) 121) << 8;
            }
            if ((var4 & 0x800) != 0) {
                var3.field3304 = class264.field3874.method2352(128);
                var3.field3351 = class264.field3874.method2352(128);
                var3.field3324 = class264.field3874.method2359(-90);
                var3.field3307 = class264.field3874.method2365(false);
                var3.field3319 = class264.field3874.method2334(-128) + class390.field5481;
                var3.field3365 = class264.field3874.method2380(199752600) + class390.field5481;
                var3.field3305 = class264.field3874.method2326(1789029408);
                var3.field3307 += var3.field3378[0];
                var3.field3304 += var3.field3368[0];
                var3.field3376 = 0;
                var3.field3369 = 1;
                var3.field3324 += var3.field3368[0];
                var3.field3351 += var3.field3378[0];
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class264.field3874.method2338(0);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class264.field3874.method2370((byte) 41);
                class353.method2090(var6, 0, var3, var5);
            }
            if ((var4 & 0x100) != 0) {
                var3.field3343 = class264.field3874.method2352(128);
                var3.field3310 = class264.field3874.method2359(-121);
                var3.field3309 = class264.field3874.method2341(false);
                var3.field3347 = (byte) class264.field3874.method2357((byte) 113);
                var3.field3348 = class390.field5481 + class264.field3874.method2324(-1033632760);
                var3.field3341 = class390.field5481 + class264.field3874.method2338(0);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class264.field3874.method2325(true);
                int var8 = class264.field3874.method2357((byte) 113);
                var3.method1399(var7, class390.field5481, var8, 70);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field6055.method1938((byte) -118)) {
                    class336.method2010(var3, (byte) -78);
                }
                var3.method2541(class106.field1400.method2580(class264.field3874.method2380(199752600), -106), false);
                var3.method1404((byte) 88, var3.field6055.field4711);
                var3.field3313 = var3.field6055.field4657 << 3;
                if (var3.field6055.method1938((byte) -122)) {
                    class138.method863(0, var3.field3368[0], var3, var3.field3378[0], var3.field1904, null, -9518, null);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class264.field3874.method2324(-1033632760);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class264.field3874.method2342(29707);
                int var11 = class264.field3874.method2361(255);
                var3.method1401(var9, false, var11, 0, var10);
            }
            if ((var4 & 0x80) != 0) {
                int var12 = class264.field3874.method2325(true);
                int var13 = class264.field3874.method2357((byte) 121);
                var3.method1399(var12, class390.field5481, var13, 70);
                var3.field3327 = class390.field5481 + 300;
                var3.field3336 = class264.field3874.method2357((byte) 109);
            }
            if ((var4 & 0x2000) != 0) {
                int var14 = class264.field3874.method2324(-1033632760);
                int var15 = class264.field3874.method2319((byte) 82);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var16 = class264.field3874.method2357((byte) 112);
                var3.method1401(var14, true, var16, 0, var15);
            }
            if ((var4 & 0x1000) != 0) {
                int var17 = class264.field3874.method2380(199752600);
                var3.field3278 = class264.field3874.method2370((byte) 41);
                var3.field3355 = class264.field3874.method2357((byte) 105);
                var3.field3333 = (var17 & 0x8000) != 0;
                var3.field3283 = var17 & 0x7FFF;
                var3.field3360 = class390.field5481 + var3.field3278 + var3.field3283;
            }
            if ((var4 & 0x40) != 0) {
                var3.field3338 = class264.field3874.method2380(199752600);
                if (var3.field3338 == 65535) {
                    var3.field3338 = -1;
                }
            }
            if ((var4 & 0x400) != 0) {
                int var18 = class264.field3874.method2357((byte) 112);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class264.field3874.method2334(-128);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class264.field3874.method2326(1789029408);
                    var21[var22] = class264.field3874.method2334(-128);
                }
                class92.method652(var19, var3, var20, 0, var21);
            }
            if ((var4 & 0x200) != 0) {
                var3.field6049 = class264.field3874.method2380(199752600);
                var3.field6057 = class264.field3874.method2324(-1033632760);
            }
            if ((var4 & 0x2) != 0) {
                var3.field3315 = class264.field3874.method2356(-25178);
                var3.field3323 = 100;
            }
        }
        if (arg0 < 40) {
            field3499 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method1511(int arg0) {
        if (arg0 != -1562) {
            field3500 = null;
        }
        field3500 = null;
        field3497 = null;
        field3499 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLza;)V")
    public static final void method1512(byte arg0, class290 arg1) {
        field3501++;
        if (class156.field2352 != class246.field3587.field1904 && class268.field3910 != null && arg0 >= 60 && class85.method620(arg1, -98, class246.field3587.field1904)) {
            class156.field2352 = class246.field3587.field1904;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public static final void method1513(int arg0) {
        if (arg0 > 121) {
            class243.field3527 = -1;
            field3502++;
            class282.field4153 = -1;
            class230.field3393 = 0;
        }
    }
}
