import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class547 extends class41 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "J")
    private long field7632 = -1L;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Ljava/lang/String;")
    private String field7636 = null;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lhj;")
    public static class596 field7634 = new class596(12, -1);

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[I")
    public static int[] field7640 = new int[1000];

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 3)
    public static final void method3218(Rectangle[] arg0, int arg1, int arg2) throws class677 {
        if (~class727.field10184 == arg1) {
            class434.field5738.method92(arg0, arg2, class168.field2025, class533.field7512);
        } else {
            class434.field5738.method92(arg0, arg2, 0, 0);
        }
        field7633++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 17)
    public static void method3219(int arg0) {
        field7640 = null;
        field7634 = null;
        if (arg0 < 125) {
            field7634 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)I", line = 30)
    public static final int method3220(int arg0, boolean arg1, String arg2, String arg3) {
        field7639++;
        int var4 = arg2.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class741.method4160(var22, 74);
            var9 = class741.method4160(var24, 81);
            char var26 = class195.method1273(var22, arg0, -2770);
            char var27 = class195.method1273(var24, arg0, -2770);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class275.method1605(var28, arg0, 0) - class275.method1605(var29, arg0, 0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (!arg1) {
            return -100;
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg3.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class275.method1605(var20, arg0, 0) - class275.method1605(var21, arg0, 0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class275.method1605(var14, arg0, 0) - class275.method1605(var15, arg0, 0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILes;)V", line = 161)
    public final void method329(int arg0, class403 arg1) {
        field7635++;
        if (arg1.method2396((byte) -107) != 255) {
            arg1.field5262--;
            this.field7632 = arg1.method2361(arg0 ^ 0xFFFFF02E);
        }
        this.field7636 = arg1.method2383(7540);
        if (arg0 != -3999) {
            method3219(10);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Liaa;BLbn;II)V", line = 180)
    public static final void method3221(class521 arg0, byte arg1, class468 arg2, int arg3, int arg4) {
        field7638++;
        byte var5 = -1;
        if ((arg3 & 0x8) != 0) {
            int var6 = arg2.method2393((byte) -107);
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg2.method2354((byte) 29);
                    if (var11 == 32767) {
                        var11 = arg2.method2354((byte) 56);
                        var9 = arg2.method2354((byte) 10);
                        var8 = arg2.method2354((byte) -113);
                        var10 = arg2.method2354((byte) -124);
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg2.method2354((byte) 91);
                    }
                    int var12 = arg2.method2354((byte) 55);
                    int var13 = arg2.method2386((byte) -114);
                    arg0.method1662(false, var10, var8, var9, class228.field2707, var11, var13, var12);
                }
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var14 = arg2.method2393((byte) -107);
            byte[] var15 = new byte[var14];
            class403 var16 = new class403(var15);
            arg2.method2364((byte) -127, 0, var14, var15);
            class323.field4015[arg4] = var16;
            arg0.method3128((byte) 99, var16);
        }
        if ((arg3 & 0x40000) != 0) {
            int var17 = arg2.method2396((byte) -105);
            int[] var18 = new int[var17];
            int[] var19 = new int[var17];
            for (int var20 = 0; var20 < var17; var20++) {
                int var21 = arg2.method2390((byte) -126);
                if ((var21 & 0xC000) == 49152) {
                    int var22 = arg2.method2421((byte) 39);
                    var18[var20] = class5.method105(var21 << 16, var22);
                } else {
                    var18[var20] = var21;
                }
                var19[var20] = arg2.method2414(255);
            }
            arg0.method1679(arg1 + 99, var19, var18);
        }
        if ((arg3 & 0x1000) != 0) {
            arg0.field7356 = arg2.method2374((byte) 64) == 1;
        }
        if ((arg3 & 0x4) != 0) {
            int var23 = arg2.method2390((byte) 15);
            if (var23 == 65535) {
                var23 = -1;
            }
            arg0.field3377 = var23;
        }
        if ((arg3 & 0x80000) != 0) {
            int var24 = arg2.method2402((byte) 90);
            int var25 = arg2.method2381((byte) 85);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var26 = arg2.method2374((byte) 117);
            int var27 = var26 & 0x7;
            int var28 = var26 >> 3 & 0xF;
            if (var28 == 15) {
                var28 = -1;
            }
            arg0.method1681(2, var24, var28, -1, var27, var25);
        }
        if ((arg3 & 0x10) != 0) {
            int var29 = arg2.method2390((byte) -126);
            int var30 = arg2.method2368(-129);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var31 = arg2.method2386((byte) -101);
            int var32 = var31 & 0x7;
            int var33 = var31 >> 3 & 0xF;
            if (var33 == 15) {
                var33 = -1;
            }
            arg0.method1681(0, var29, var33, arg1 + 97, var32, var30);
        }
        if ((arg3 & 0x4000) != 0) {
            var5 = arg2.method2406(arg1 - 18);
        }
        if ((arg3 & 0x100) != 0) {
            int var34 = arg2.method2402((byte) 70);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = arg2.method2357(2);
            int var36 = arg2.method2386((byte) -115);
            int var37 = var36 & 0x7;
            int var38 = var36 >> 3 & 0xF;
            if (var38 == 15) {
                var38 = -1;
            }
            arg0.method1681(1, var34, var38, -1, var37, var35);
        }
        if ((arg3 & 0x2) != 0) {
            class63.field866[arg4] = arg2.method2413(-28137);
        }
        if (arg1 != -98) {
            method3219(-109);
        }
        if ((arg3 & 0x80) != 0) {
            int[] var39 = new int[4];
            for (int var40 = 0; var40 < 4; var40++) {
                var39[var40] = arg2.method2402((byte) 124);
                if (var39[var40] == 65535) {
                    var39[var40] = -1;
                }
            }
            int var41 = arg2.method2396((byte) 40);
            class756.method4218(var41, var39, arg0, arg1 ^ 0xFFFFFF9E);
        }
        if ((arg3 & 0x2000) != 0) {
            arg0.field3381 = arg2.method2384(-6435);
            if (arg0.field3381.charAt(0) == '~') {
                arg0.field3381 = arg0.field3381.substring(1);
                class318.method1873(arg0.field7395, arg0.field3381, (byte) 56, arg0.method3123(true, true), arg0.method3122(arg1 ^ 0xFFFFFBC1, false), 2, 0);
            } else if (class300.field3596 == arg0) {
                class318.method1873(arg0.field7395, arg0.field3381, (byte) 113, arg0.method3123(true, true), arg0.method3122(1119, false), 2, 0);
            }
            arg0.field3437 = 150;
            arg0.field3432 = 0;
            arg0.field3384 = 0;
        }
        if ((arg3 & 0x10000) != 0) {
            arg0.field7353 = arg2.method2393((byte) -107) == 1;
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field7392 = arg2.method2390((byte) 6);
            if (arg0.field3458 == 0) {
                arg0.method1675((byte) -8, arg0.field7392);
                arg0.field7392 = -1;
            }
        }
        if ((arg3 & 0x20000) != 0) {
            arg0.field3403 = arg2.method2362((byte) 119);
            arg0.field3366 = arg2.method2406(-109);
            arg0.field3416 = arg2.method2413(arg1 - 28039);
            arg0.field3427 = (byte) arg2.method2393((byte) -107);
            arg0.field3387 = class228.field2707 + arg2.method2390((byte) -112);
            arg0.field3440 = class228.field2707 + arg2.method2414(255);
        }
        if ((arg3 & 0x8000) != 0) {
            arg0.field3383 = arg2.method2392(arg1 + 76);
            arg0.field3401 = arg2.method2406(arg1 - 10);
            arg0.field3357 = arg2.method2406(-115);
            arg0.field3398 = arg2.method2406(-99);
            arg0.field3375 = arg2.method2402((byte) 110) + class228.field2707;
            arg0.field3428 = arg2.method2421((byte) 112) + class228.field2707;
            arg0.field3418 = arg2.method2396((byte) 24);
            if (arg0.field7348) {
                arg0.field3398 += arg0.field7371;
                arg0.field3383 += arg0.field7362;
                arg0.field3458 = 0;
                arg0.field3401 += arg0.field7371;
                arg0.field3357 += arg0.field7362;
            } else {
                arg0.field3401 += arg0.field3455[0];
                arg0.field3357 += arg0.field3453[0];
                arg0.field3398 += arg0.field3455[0];
                arg0.field3458 = 1;
                arg0.field3383 += arg0.field3453[0];
            }
            arg0.field3456 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            int var42 = arg2.method2393((byte) -107);
            int[] var43 = new int[var42];
            int[] var44 = new int[var42];
            int[] var45 = new int[var42];
            for (int var46 = 0; var46 < var42; var46++) {
                int var47 = arg2.method2390((byte) 7);
                if (var47 == 65535) {
                    var47 = -1;
                }
                var43[var46] = var47;
                var44[var46] = arg2.method2374((byte) 87);
                var45[var46] = arg2.method2402((byte) 76);
            }
            class338.method2002(arg0, var44, var45, -19557, var43);
        }
        if ((arg3 & 0x800) != 0) {
            int var48 = arg2.method2414(255);
            arg0.field3411 = arg2.method2386((byte) -110);
            arg0.field3441 = arg2.method2393((byte) -107);
            arg0.field3362 = var48 & 0x7FFF;
            arg0.field3371 = (var48 & 0x8000) != 0;
            arg0.field3379 = class228.field2707 + arg0.field3411 + arg0.field3362;
        }
        if (!arg0.field7348) {
            return;
        }
        if (var5 == 127) {
            arg0.method3125(arg0.field7362, -126, arg0.field7371);
            return;
        }
        byte var49;
        if (var5 == -1) {
            var49 = class63.field866[arg4];
        } else {
            var49 = var5;
        }
        class535.method3184(0, var49, arg0);
        arg0.method3121(arg0.field7362, arg1 ^ 0xFFFFFFD3, arg0.field7371, var49);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Loga;I)V", line = 551)
    public final void method331(class500 arg0, int arg1) {
        field7637++;
        arg0.method2969(this.field7632, (byte) 0, this.field7636);
        if (arg1 != 55) {
            method3220(-112, false, null, null);
        }
    }
}
