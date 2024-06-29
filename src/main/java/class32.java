import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class59 {

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    private int field352 = 0;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "Z")
    public boolean field355 = false;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "J")
    private long field348;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "Luj;")
    public class262 field350;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lmq;")
    public class354 field339;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "Lgf;")
    public class184 field346;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "Lks;")
    public class305 field349;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "Lak;")
    public static class234 field357 = new class234("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "Ltr;")
    public static class195 field366 = new class195(5, 15);

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field374 = 0;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "[S")
    public static short[] field375 = new short[256];

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "Lng;")
    public static class229 field377;

    @OriginalMember(owner = "client!vo", name = "Z", descriptor = "[Lvl;")
    public static class11[] field379;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
    public final void method221(byte arg0) {
        this.field347 = this.field350.field4031;
        field338++;
        this.field372 = this.field350.field4028;
        this.field351 = this.field350.field4034;
        this.field344 = this.field350.field4016;
        this.field363 = this.field350.field4015;
        this.field371 = this.field350.field4024;
        this.field345 = this.field350.field4013;
        this.field369 = this.field350.field4033;
        this.field341 = this.field350.field4021;
        if (this.field363 == this.field344 && this.field369 == this.field363 && this.field347 == this.field345 && this.field351 == this.field347 && this.field372 == this.field371 && this.field372 == this.field341) {
            this.field340 = true;
            return;
        }
        this.field340 = false;
        int var2 = (this.field363 + this.field344 + this.field369) / 3;
        int var3 = (this.field347 + this.field345 + this.field351) / 3;
        if (arg0 != 114) {
            method225(6, null, true, null, 100);
        }
        int var4 = (this.field371 + this.field341 + this.field372) / 3;
        if (this.field362 == var2 && this.field361 == var3 && this.field354 == var4) {
            return;
        }
        this.field362 = var2;
        this.field361 = var3;
        this.field354 = var4;
        int var5 = this.field363 - this.field344;
        int var6 = this.field347 - this.field345;
        int var7 = this.field372 - this.field371;
        int var8 = this.field369 - this.field344;
        int var9 = this.field351 - this.field345;
        int var10 = this.field341 - this.field371;
        this.field378 = var5 * var9 - (var6 * var8);
        this.field360 = var6 * var10 - (var7 * var9);
        for (this.field364 = var7 * var8 - (var5 * var10); this.field360 > 32767 || this.field364 > 32767 || this.field378 > 32767 || this.field360 < -32767 || this.field364 < -32767 || this.field378 < -32767; this.field364 >>= 0x1) {
            this.field360 >>= 0x1;
            this.field378 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field378 * this.field378 + this.field364 * this.field364 + this.field360 * this.field360));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field364 = this.field364 * 32767 / var11;
        this.field360 = this.field360 * 32767 / var11;
        this.field378 = this.field378 * 32767 / var11;
        if (this.field346.field2754 <= 0 && this.field346.field2730 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field378, (double) this.field360) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field364, Math.sqrt((double) (this.field378 * this.field378 + this.field360 * this.field360))) * 2607.5945876176133D);
        this.field367 = this.field346.field2754 - this.field346.field2755;
        this.field359 = this.field346.field2730 - this.field346.field2787;
        this.field358 = this.field346.field2755 + var12 - (this.field367 >> 1);
        this.field353 = this.field346.field2787 + var13 - (this.field359 >> 1);
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V")
    public static void method222(byte arg0) {
        field379 = null;
        field357 = null;
        field375 = null;
        field377 = null;
        if (arg0 > -18) {
            method227(36, 0);
        }
        field366 = null;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(B)I")
    public static final int method223(byte arg0) {
        if (arg0 < 116) {
            method224(-127, null);
        }
        field373++;
        if (class168.field2489 == null) {
            return class8.field120 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[Ll;)V")
    public static final void method224(int arg0, class16[] arg1) {
        field343++;
        class534.field7846 = arg1.length;
        class36.field423 = new int[class534.field7846 + 10];
        class305.field4603 = new class16[class534.field7846 + 10];
        class414.method2599(arg1, 0, class305.field4603, 0, class534.field7846);
        int var2 = 0;
        if (arg0 != -16462) {
            return;
        }
        while (class534.field7846 > var2) {
            class36.field423[var2] = class305.field4603[var2].method139();
            var2++;
        }
        for (int var3 = class534.field7846; var3 < class305.field4603.length; var3++) {
            class36.field423[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILod;ZLjava/awt/Component;I)Ljd;")
    public static final class156 method225(int arg0, class352 arg1, boolean arg2, Component arg3, int arg4) {
        if (arg2) {
            field376 = -44;
        }
        field368++;
        if (class40.field540 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class156 var5 = (class156) Class.forName("eq").getDeclaredConstructor().newInstance();
                var5.field2341 = arg4;
                var5.field2319 = new int[(class368.field5405 ? 2 : 1) * 256];
                var5.method200(arg3);
                var5.field2344 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2344 > 16384) {
                    var5.field2344 = 16384;
                }
                var5.method201(var5.field2344);
                if (class147.field2236 > 0 && class305.field4609 == null) {
                    class305.field4609 = new class285();
                    class305.field4609.field4332 = arg1;
                    arg1.method2195(class147.field2236, 0, class305.field4609);
                }
                if (class305.field4609 != null) {
                    if (class305.field4609.field4321[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class305.field4609.field4321[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class30 var6 = new class30(arg1, arg0);
                    var6.field2319 = new int[(class368.field5405 ? 2 : 1) * 256];
                    var6.field2341 = arg4;
                    var6.method200(arg3);
                    var6.field2344 = 16384;
                    var6.method201(var6.field2344);
                    if (class147.field2236 > 0 && class305.field4609 == null) {
                        class305.field4609 = new class285();
                        class305.field4609.field4332 = arg1;
                        arg1.method2195(class147.field2236, 0, class305.field4609);
                    }
                    if (class305.field4609 != null) {
                        if (class305.field4609.field4321[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class305.field4609.field4321[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class156();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(JB)V")
    public final void method226(long arg0, byte arg1) {
        field365++;
        for (class11 var4 = (class11) this.field349.method1958(23); var4 != null; var4 = (class11) this.field349.method1961(87)) {
            var4.method76(arg0);
        }
        if (arg1 <= 11) {
            method225(95, null, true, null, 101);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public static final void method227(int arg0, int arg1) {
        if (arg1 == 37) {
            class7.field92 = 3.0F;
        } else if (arg1 == 50) {
            class7.field92 = 4.0F;
        } else if (arg1 == 75) {
            class7.field92 = 6.0F;
        } else if (arg1 == 100) {
            class7.field92 = 8.0F;
        } else if (arg1 == 200) {
            class7.field92 = 16.0F;
        }
        field370++;
        if (arg0 != 3) {
            method224(109, null);
        }
        class108.field1510 = -1;
        class108.field1510 = -1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(JIZLya;I)V")
    public final void method228(long arg0, int arg1, boolean arg2, class38 arg3, int arg4) {
        field356++;
        if (this.field355) {
            arg2 = false;
        } else if (this.field346.field2795 > class213.field3474) {
            arg2 = false;
        } else if (class100.field1430[class213.field3474] < class238.field3822) {
            arg2 = false;
        } else if (this.field340) {
            arg2 = false;
        } else if (this.field346.field2740 != -1) {
            int var7 = (int) (arg0 - this.field348);
            if (this.field346.field2797 || this.field346.field2740 >= var7) {
                var7 %= this.field346.field2740;
            } else {
                arg2 = false;
            }
            if (!this.field346.field2769 && var7 < this.field346.field2739) {
                arg2 = false;
            }
            if (this.field346.field2769 && this.field346.field2739 <= var7) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field352 += (int) (((double) this.field346.field2783 + Math.random() * (double) (this.field346.field2793 - this.field346.field2783)) * (double) arg1);
            if (this.field352 > 63) {
                int var8 = this.field352 >> 6;
                this.field352 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field346.field2754 <= 0 && this.field346.field2730 <= 0) {
                        var10 = this.field364;
                        var11 = this.field378;
                        var12 = this.field360;
                    } else {
                        int var13 = this.field358 + (int) (Math.random() * (double) this.field367);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class281.field4278[var14];
                        int var16 = class281.field4279[var14];
                        int var17 = (int) ((double) this.field359 * Math.random()) + this.field353;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class281.field4278[var18];
                        int var20 = class281.field4279[var18];
                        byte var21 = 15;
                        var12 = var16 * var19 >> var21;
                        var10 = (var20 << 0) * -1;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = this.field344 * var22 + this.field369 * var24 + this.field363 * var23 >> 16;
                    int var26 = this.field351 * var24 + (this.field345 * var22 + (this.field347 * var23)) >> 16;
                    int var27 = this.field371 * var22 - (-(this.field372 * var23) - (this.field341 * var24)) >> 16;
                    int var28 = this.field346.field2759 + ((int) (Math.random() * (double) (this.field346.field2743 - this.field346.field2759)));
                    int var29 = this.field346.field2741 + ((int) (Math.random() * (double) (this.field346.field2789 - this.field346.field2741)));
                    int var30 = (int) ((double) (this.field346.field2765 - this.field346.field2736) * Math.random()) + this.field346.field2736;
                    int var33;
                    if (this.field346.field2756) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field346.field2744 * Math.random() + (double) this.field346.field2770) << 24 | (int) ((double) this.field346.field2733 * var31 + (double) this.field346.field2753) | (int) ((double) this.field346.field2785 * var31 + (double) this.field346.field2731) << 16 | (int) ((double) this.field346.field2750 * var31 + (double) this.field346.field2782) << 8;
                    } else {
                        var33 = (int) (Math.random() * (double) this.field346.field2744 + (double) this.field346.field2770) << 24 | (int) ((double) this.field346.field2733 * Math.random() + (double) this.field346.field2753) | (int) ((double) this.field346.field2731 + (double) this.field346.field2785 * Math.random()) << 16 | (int) ((double) this.field346.field2782 + Math.random() * (double) this.field346.field2750) << 8;
                    }
                    int var34 = this.field346.field2788;
                    if (!arg3.method354() && !this.field346.field2784) {
                        var34 = -1;
                    }
                    if (class54.field668 == class483.field6951) {
                        new class11(this, var25, var26, var27, var12, var10, var11, var28, var29, var33, var30, var34, this.field346.field2792, this.field346.field2749);
                    } else {
                        class11 var36 = field379[class54.field668];
                        class54.field668 = class54.field668 + 1 & 0x3FF;
                        var36.method77(this, var25, var26, var27, var12, var10, var11, var28, var29, var33, var30, var34, this.field346.field2792, this.field346.field2749);
                    }
                }
            }
        }
        this.field342 = 0;
        for (class11 var37 = (class11) this.field349.method1958(125); var37 != null; var37 = (class11) this.field349.method1961(arg4 ^ 0x32)) {
            var37.method75(arg0, arg1);
            this.field342++;
        }
        class233.field3762 += this.field342;
        if (arg4 != -1) {
            this.field371 = -23;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lya;Luj;Lmq;J)V")
    public class32(class38 arg0, class262 arg1, class354 arg2, long arg3) {
        this.field348 = arg3;
        this.field350 = arg1;
        this.field339 = arg2;
        this.field346 = this.field350.method1751(-27973);
        if (!arg0.method354() && this.field346.field2790 != -1) {
            this.field346 = class488.method2910((byte) 127, this.field346.field2790);
        }
        this.field349 = new class305();
        this.field352 = (int) ((double) this.field352 + Math.random() * 64.0D);
        this.method221((byte) 114);
    }
}
