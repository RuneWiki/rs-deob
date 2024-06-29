import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class667 extends class329 {

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "Ldaa;")
    private class260 field9392;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "Len;")
    private class478 field9393;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "Lgga;")
    private class332 field9400;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    private int field9386;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    private int field9399;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    private int field9389;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    private int field9395;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "[[F")
    private float[][] field9396;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "[[F")
    private float[][] field9405;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "[[F")
    private float[][] field9391;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    private int field9403;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "Lil;")
    private class68 field9385;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "Lhh;")
    private class666 field9390;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9397;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9398;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "Lnba;")
    private class401 field9387;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    private int field9408;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field9402 = 0;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "Lki;")
    public static class320 field9404 = new class320();

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    public static int field9407;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qca", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field9409;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3749(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lof;", line = 3)
    public static final class540 method3743(Component arg0, int arg1, boolean arg2) {
        field9401++;
        try {
            if (arg1 != 6611) {
                field9404 = null;
            }
            Constructor var3 = Class.forName("pe").getDeclaredConstructor(field9409 == null ? (field9409 = method3749("java.awt.Component")) : field9409, Boolean.TYPE);
            return (class540) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class193(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(SI)V", line = 21)
    private final void method3744(short arg0, int arg1) {
        int var3 = 125 % ((74 - arg1) / 51);
        if (Stream.method3420()) {
            this.field9398.method3422(arg0);
        } else {
            this.field9398.method3430(arg0);
        }
        field9383++;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V", line = 40)
    public static void method3745(boolean arg0) {
        field9404 = null;
        if (arg0) {
            method3745(false);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II[[ZII)V", line = 58)
    public final void method3746(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field9394++;
        if (this.field9390 == null || this.field9386 > (arg1 + arg3) || this.field9399 < (arg3 - arg1) || this.field9389 > (arg0 + arg1) || this.field9395 < arg0 - arg1) {
            return;
        }
        for (int var6 = this.field9389; var6 <= this.field9395; var6++) {
            for (int var7 = this.field9386; var7 <= this.field9399; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg0;
                if (var8 > (-arg1) && var8 < arg1 && var9 > (-arg1) && var9 < arg1 && arg2[arg1 + var8][arg1 + var9]) {
                    this.field9393.method2525((byte) 89, (byte) ((int) (this.field9400.method1882(100) * 255.0F)));
                    this.field9393.method1695((byte) -16, this.field9387, 0);
                    this.field9393.method1709(true, this.field9393.field6354);
                    this.field9393.method1700(this.field9408, class365.field4648, 0, 12896, this.field9403 / 3, 0, this.field9390);
                    return;
                }
            }
        }
        if (arg4 >= -111) {
            method3745(false);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 115)
    public static final void method3747(int arg0) {
        field9388++;
        class479 var1 = null;
        try {
            class264 var2 = class590.field8289.method3641("3", (byte) -28, false);
            while (var2.field3358 == 0) {
                class419.method2233(-28448, 1L);
            }
            if (var2.field3358 == 2) {
                throw new RuntimeException("Error opening file");
            }
            if (arg0 > -87) {
                method3743(null, -21, false);
            }
            var1 = (class479) var2.field3356;
            byte[] var3 = new byte[(int) var1.method2604(0)];
            if (var3.length == 0) {
                class355.field4528 = "";
                class562.field7815 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2607(var4, var3, var3.length - var4, 3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class630 var6 = new class630(var3);
                int var7 = var6.method3501(-9268);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field8812 = var7 + 1;
                if (!var6.method3521(9182)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field8812 = 1;
                int var8 = var6.method3501(-9268);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class355.field4528 = var6.method3507((byte) 120);
                class562.field7815 = var6.method3507((byte) 111);
                if (var8 >= 1) {
                    class37.field507 = var6.method3470(13111);
                } else {
                    class37.field507 = class322.field4130;
                }
                if (var8 >= 2) {
                    class361.field4596 = var6.method3527(false);
                } else {
                    class361.field4596 = class49.field702;
                }
                if (var8 < 3) {
                    class343.field4411 = class195.field2446;
                } else if (var6.method3501(-9268) == 1) {
                    class343.field4411 = var6.method3507((byte) 123);
                } else {
                    class343.field4411 = null;
                }
            }
        } catch (Exception var10) {
            class562.field7815 = "";
            class355.field4528 = "";
        }
        try {
            if (var1 != null) {
                var1.method2603((byte) -127);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)V", line = 231)
    private final void method3748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9384++;
        long var8 = -1L;
        int var10 = (arg3 << this.field9392.field3437) + arg4;
        int var11 = (arg6 << this.field9392.field3437) + arg0;
        int var12 = this.field9392.method1565(var11, var10, true);
        if ((arg4 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class329 var13 = this.field9385.method399(arg2 ^ 0xFFFF9685, var8);
            if (var13 != null) {
                this.method3744(((class423) var13).field5313, arg2 ^ 0x1694);
                return;
            }
        }
        short var14 = (short) (this.field9408++);
        if (var8 != -1L) {
            this.field9385.method402(new class423(var14), (byte) -89, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg0 == 0) {
            var15 = this.field9405[arg5][arg1];
            var16 = this.field9396[arg5][arg1];
            var17 = this.field9391[arg5][arg1];
        } else if (this.field9392.field3432 == arg4 && arg0 == 0) {
            var15 = this.field9405[arg5 + 1][arg1];
            var16 = this.field9396[arg5 + 1][arg1];
            var17 = this.field9391[arg5 + 1][arg1];
        } else if (this.field9392.field3432 == arg4 && this.field9392.field3432 == arg0) {
            var15 = this.field9405[arg5 + 1][arg1 + 1];
            var16 = this.field9396[arg5 + 1][arg1 + 1];
            var17 = this.field9391[arg5 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field9392.field3432 == arg0) {
            var17 = this.field9391[arg5][arg1 + 1];
            var15 = this.field9405[arg5][arg1 + 1];
            var16 = this.field9396[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field9392.field3432;
            float var19 = (float) arg0 / (float) this.field9392.field3432;
            float var20 = this.field9405[arg5][arg1];
            float var21 = this.field9391[arg5][arg1];
            float var22 = this.field9396[arg5][arg1];
            float var23 = this.field9405[arg5 + 1][arg1];
            float var24 = this.field9391[arg5 + 1][arg1];
            float var25 = (this.field9396[arg5][arg1 + 1] - var22) * var18 + var22;
            float var26 = this.field9396[arg5 + 1][arg1];
            float var27 = (this.field9391[arg5][arg1 + 1] - var21) * var18 + var21;
            float var28 = (this.field9405[arg5][arg1 + 1] - var20) * var18 + var20;
            float var29 = (this.field9391[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            float var30 = (this.field9405[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            var17 = (var29 - var27) * var19 + var27;
            float var31 = (this.field9396[arg5 + 1][arg1 + 1] - var26) * var18 + var26;
            var15 = (var30 - var28) * var19 + var28;
            var16 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field9400.method1886(true) - var10);
        float var33 = (float) (this.field9400.method1888(arg2 ^ 0xFFFFE90C) - var12);
        float var34 = (float) (this.field9400.method1885((byte) 119) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field9400.method1883((byte) -107);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9400.method1881(46);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE4) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        if (arg2 != 5777) {
            this.method3748(-56, -61, -81, 47, -110, 16, 110);
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3420()) {
            this.field9397.method3418((float) var10);
            this.field9397.method3418((float) var12);
            this.field9397.method3418((float) var11);
        } else {
            this.field9397.method3427((float) var10);
            this.field9397.method3427((float) var12);
            this.field9397.method3427((float) var11);
        }
        if (this.field9393.field6326 == 0) {
            this.field9397.method3426(var47);
            this.field9397.method3426(var46);
            this.field9397.method3426(var45);
        } else {
            this.field9397.method3426(var45);
            this.field9397.method3426(var46);
            this.field9397.method3426(var47);
        }
        this.field9397.method3426(255);
        this.method3744(var14, arg2 ^ 0x16EC);
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Len;Ldaa;Lgga;[I)V", line = 412)
    public class667(class478 arg0, class260 arg1, class332 arg2, int[] arg3) {
        this.field9392 = arg1;
        this.field9393 = arg0;
        this.field9400 = arg2;
        int var5 = this.field9400.method1883((byte) -62) - (arg1.field3432 >> 1);
        this.field9386 = this.field9400.method1886(true) - var5 >> arg1.field3437;
        this.field9399 = var5 + this.field9400.method1886(true) >> arg1.field3437;
        this.field9389 = this.field9400.method1885((byte) 119) - var5 >> arg1.field3437;
        this.field9395 = var5 + this.field9400.method1885((byte) 119) >> arg1.field3437;
        int var6 = this.field9399 + 1 - this.field9386;
        int var7 = this.field9395 + 1 - this.field9389;
        this.field9396 = new float[var6 + 1][var7 + 1];
        this.field9405 = new float[var6 + 1][var7 + 1];
        this.field9391 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9389 + var8;
            if (var27 > 0 && (this.field9392.field3440 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field9386 + var28;
                    if (var29 > 0 && var29 < this.field9392.field3441 - 1) {
                        int var30 = arg1.method1562(var27, (byte) 51, var29 + 1) - arg1.method1562(var27, (byte) 51, var29 - 1);
                        int var31 = arg1.method1562(var27 + 1, (byte) 51, var29) - arg1.method1562(var27 - 1, (byte) 51, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field9405[var28][var8] = (float) var30 * var32;
                        this.field9391[var28][var8] = var32 * -256.0F;
                        this.field9396[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9389; var10 <= this.field9395; var10++) {
            if (var10 >= 0 && var10 < arg1.field3440) {
                for (int var23 = this.field9386; var23 <= this.field9399; var23++) {
                    if (var23 >= 0 && var23 < arg1.field3441) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field3204[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9403 += 3;
                                    }
                                }
                            } else {
                                this.field9403 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9399 - this.field9386;
            }
        }
        if (this.field9403 > 0) {
            this.field9385 = new class68(class391.method2101(this.field9403, 128));
            this.field9390 = this.field9393.method1680(false, 16);
            this.field9390.method619(27209, this.field9403);
            NativeHeapBuffer var11 = this.field9393.method2542(this.field9403 * 16, (byte) 68, false);
            this.field9397 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9390.method1486((byte) -88, true);
                } while (var12 == null);
                this.field9398 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9389; var15 <= this.field9395; var15++) {
                    if (var15 >= 0 && arg1.field3440 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field9386; var17 <= this.field9399; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3441) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field3204[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field3187[var17][var15];
                                        int[] var21 = arg1.field3177[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3748(var21[var22], var14, 5777, var17, var20[var22], var16, var15);
                                                    var22++;
                                                    this.method3748(var21[var22], var14, 5777, var17, var20[var22], var16, var15);
                                                    var22++;
                                                    this.method3748(var21[var22], var14, 5777, var17, var20[var22], var16, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3748(0, var14, 5777, var17, 0, var16, var15);
                                        this.method3748(0, var14, 5777, var17, arg1.field3432, var16, var15);
                                        this.method3748(arg1.field3432, var14, 5777, var17, 0, var16, var15);
                                    } else if (var18 == 2) {
                                        this.method3748(0, var14, 5777, var17, arg1.field3432, var16, var15);
                                        this.method3748(arg1.field3432, var14, 5777, var17, arg1.field3432, var16, var15);
                                        this.method3748(0, var14, 5777, var17, 0, var16, var15);
                                    } else if (var18 == 5) {
                                        this.method3748(arg1.field3432, var14, 5777, var17, arg1.field3432, var16, var15);
                                        this.method3748(arg1.field3432, var14, 5777, var17, 0, var16, var15);
                                        this.method3748(0, var14, 5777, var17, arg1.field3432, var16, var15);
                                    } else if (var18 == 4) {
                                        this.method3748(arg1.field3432, var14, 5777, var17, 0, var16, var15);
                                        this.method3748(0, var14, 5777, var17, 0, var16, var15);
                                        this.method3748(arg1.field3432, var14, 5777, var17, arg1.field3432, var16, var15);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field9399 - this.field9386;
                    }
                    var14++;
                }
                this.field9398.method3424();
                if (this.field9390.method1485((byte) 43)) {
                    this.field9397.method3424();
                    this.field9387 = this.field9393.method1716(false, false);
                    this.field9387.method326(var11, 16, this.field9408 * 16, (byte) 58);
                    break;
                }
                this.field9397.method3421(0);
                this.field9385.method398(true);
            }
        } else {
            this.field9390 = null;
            this.field9387 = null;
        }
        this.field9385 = null;
        this.field9398 = null;
        this.field9397 = null;
        this.field9405 = this.field9391 = this.field9396 = null;
    }
}
