import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class248 extends class276 {

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    private int field4255 = 0;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Z")
    public boolean field4270 = true;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Z")
    public boolean field4281 = false;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "Lui;")
    public final class230 field4285;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Lkg;")
    public final class136 field4282;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Lqb;")
    public class58 field4254;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Llj;")
    public final class25 field4271;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "J")
    private long field4267;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lwk;")
    public static class273 field4269 = new class273(64);

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Loa;")
    public static class99 field4286 = class221.method1463(2844, "Stufe: ");

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "[Lgi;")
    public static class156[] field4287 = new class156[32768];

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
    public static int[] field4289 = new int[128];

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    private int field4256;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    private int field4261;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field4263;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field4268;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    private int field4273;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    private int field4279;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Ltg;")
    public static class182 field4278;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4280 = arg9;
        this.field4277 = arg8;
        this.field4263 = arg6;
        this.field4284 = arg1;
        field4275++;
        this.field4259 = arg2;
        this.field4257 = arg0;
        this.field4265 = arg7;
        this.field4258 = arg3;
        this.field4279 = arg5;
        int var11 = (this.field4258 + this.field4257 + this.field4263) / 3 + this.field4282.field2397;
        int var12 = (this.field4280 + this.field4265 + this.field4259) / 3 + this.field4282.field2392;
        int var13 = (this.field4284 + this.field4279 + this.field4277) / 3 + this.field4282.field2390;
        if (this.field4262 != var11 || this.field4260 != var13 || this.field4276 != var12) {
            this.field4270 = true;
            this.field4260 = var13;
            this.field4262 = var11;
            this.field4276 = var12;
        }
        if (arg4 < 101) {
            this.field4262 = 15;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Ltc;")
    public static final class179 method1607(int arg0, int arg1) {
        field4288++;
        class179 var2 = (class179) class143.field2514.method1811((long) arg1, 92);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field634.method1242(arg1, 1, 6801);
        class179 var4 = new class179();
        if (arg0 != 255) {
            method1607(-14, 8);
        }
        if (var3 != null) {
            var4.method1200(0, new class261(var3), arg1);
        }
        class143.field2514.method1817((long) arg1, arg0 - 239, var4);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1608(int arg0, Component arg1) {
        if (arg0 == 32767) {
            field4266++;
            arg1.removeKeyListener(class252.field4358);
            arg1.removeFocusListener(class252.field4358);
            class37.field646 = -1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BIJIZI)V")
    public final void method1609(byte arg0, int arg1, long arg2, int arg3, boolean arg4, int arg5) {
        field4272++;
        if (this.field4281) {
            arg4 = false;
        } else if (this.field4271.field435 > class136.field2384) {
            arg4 = false;
        } else if (this.field4263 == this.field4257 && this.field4258 == this.field4257 && this.field4279 == this.field4277 && this.field4284 == this.field4279 && this.field4265 == this.field4259 && this.field4280 == this.field4265) {
            arg4 = false;
        } else if (this.field4271.field396 != -1) {
            int var8 = (int) (arg2 - this.field4267);
            if (this.field4271.field429 || this.field4271.field396 >= var8) {
                var8 %= this.field4271.field396;
            } else {
                arg4 = false;
            }
            if (!this.field4271.field424 && this.field4271.field404 > var8) {
                arg4 = false;
            }
            if (this.field4271.field424 && var8 >= this.field4271.field404) {
                arg4 = false;
            }
        }
        int var9 = -59 / ((arg0 + 38) / 63);
        if (arg4) {
            this.field4255 += (int) ((double) arg1 * (Math.random() * (double) (this.field4271.field419 - this.field4271.field414) + (double) this.field4271.field414));
            if (this.field4255 > 63) {
                int var10 = this.field4255 >> 6;
                this.field4255 &= 0x3F;
                if (this.field4270) {
                    int var11 = this.field4257 - this.field4263;
                    int var12 = this.field4284 - this.field4277;
                    int var13 = this.field4258 - this.field4263;
                    int var14 = this.field4280 - this.field4259;
                    int var15 = this.field4265 - this.field4259;
                    int var16 = this.field4279 - this.field4277;
                    this.field4253 = var11 * var12 - var13 * var16;
                    this.field4274 = var14 * var16 - (var12 * var15);
                    this.field4273 = var13 * var15 - (var11 * var14);
                    while (true) {
                        if (this.field4274 <= 32767 && this.field4273 <= 32767 && this.field4253 <= 32767 && this.field4274 >= -32767 && this.field4273 >= -32767 && this.field4253 >= -32767) {
                            int var17 = (int) Math.sqrt((double) (this.field4253 * this.field4253 + this.field4274 * this.field4274 + this.field4273 * this.field4273));
                            if (var17 <= 0) {
                                var17 = 1;
                            }
                            this.field4273 = this.field4273 * 32767 / var17;
                            this.field4253 = this.field4253 * 32767 / var17;
                            this.field4274 = this.field4274 * 32767 / var17;
                            if (this.field4271.field405 > 0 || this.field4271.field376 > 0) {
                                int var19 = (int) (Math.atan2((double) this.field4253, (double) this.field4274) * 2047.0D / 6.283185307179586D);
                                int var20 = (int) (Math.atan2((double) (this.field4274 * this.field4274 + this.field4253 * this.field4253), (double) this.field4273) * 2047.0D / 6.283185307179586D);
                                int var21 = var19 - this.field4282.field2403;
                                this.field4283 = this.field4271.field405 - this.field4271.field385;
                                this.field4256 = this.field4271.field385 + var21 - (this.field4283 / 2);
                                this.field4261 = this.field4271.field376 - this.field4271.field378;
                                this.field4268 = var20 + this.field4271.field378 - (this.field4261 / 2);
                            } else if (this.field4282.field2403 != 0) {
                                int var18 = this.field4274 * arg5 + this.field4253 * arg3 >> 16;
                                this.field4253 = this.field4253 * arg5 - (this.field4274 * arg3) >> 16;
                                this.field4274 = var18;
                            }
                            this.field4270 = false;
                            break;
                        }
                        this.field4253 >>= 0x1;
                        this.field4273 >>= 0x1;
                        this.field4274 >>= 0x1;
                    }
                }
                for (int var22 = 0; var22 < var10; var22++) {
                    int var23 = this.field4274;
                    int var24 = this.field4253;
                    int var25 = this.field4273;
                    if (this.field4271.field405 > 0 || this.field4271.field376 > 0) {
                        int var26 = this.field4256 + (int) (Math.random() * (double) this.field4283);
                        int var27 = var26 & 0x7FF;
                        int var28 = this.field4268 + ((int) ((double) this.field4261 * Math.random()));
                        int var29 = class134.field2339[var27] >> 1;
                        int var30 = class134.field2344[var27] >> 1;
                        int var31 = var28 & 0x3FF;
                        int var32 = class134.field2339[var31] >> 1;
                        var24 = var29 * var32 >> 16;
                        int var33 = class134.field2344[var31] >> 1;
                        var25 = var33 * -1;
                        var23 = var30 * var32 >> 16;
                    }
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (int) (Math.random() * 255.0D);
                    int var36 = (255 - var34) * var35 >> 8;
                    int var37 = 255 - var34 - var36;
                    int var38 = this.field4284 * var37 + this.field4279 * var36 + this.field4277 * var34 >> 8;
                    int var39 = this.field4259 * var34 + this.field4280 * var37 + this.field4265 * var36 >> 8;
                    int var40 = this.field4263 * var34 + this.field4258 * var37 + this.field4257 * var36 >> 8;
                    if (this.field4282.field2403 != 0) {
                        int var41 = arg3 * var39 + (arg5 * var40) >> 16;
                        var39 = arg5 * var39 - (arg3 * var40) >> 16;
                        var40 = var41;
                    }
                    int var42 = (int) ((double) (this.field4271.field395 - this.field4271.field410) * Math.random()) + this.field4271.field410;
                    int var43 = this.field4271.field430 + (int) ((double) (this.field4271.field420 - this.field4271.field430) * Math.random());
                    int var46;
                    if (this.field4271.field428) {
                        double var44 = Math.random();
                        var46 = (int) ((double) this.field4271.field401 * var44 + (double) this.field4271.field399) << 24 | (int) ((double) this.field4271.field390 * var44 + (double) this.field4271.field394) << 8 | (int) ((double) this.field4271.field382 * var44 + (double) this.field4271.field403) << 16 | (int) ((double) this.field4271.field400 * var44 + (double) this.field4271.field381);
                    } else {
                        var46 = (int) (Math.random() * (double) this.field4271.field401 + (double) this.field4271.field399) << 24 | (int) ((double) this.field4271.field394 + (double) this.field4271.field390 * Math.random()) << 8 | (int) (Math.random() * (double) this.field4271.field382 + (double) this.field4271.field403) << 16 | (int) (Math.random() * (double) this.field4271.field400 + (double) this.field4271.field381);
                    }
                    if (class136.field2370 == class136.field2366) {
                        new class148(this, this.field4282.field2397 + var40, this.field4282.field2390 + var38, this.field4282.field2392 + var39, var23, var25, var24, var42, var43, var46);
                    } else {
                        class148 var47 = class136.field2377[class136.field2366];
                        class136.field2366 = class136.field2366 + 1 & 0x3FF;
                        var47.method996(this, this.field4282.field2397 + var40, this.field4282.field2390 - -var38, this.field4282.field2392 + var39, var23, var25, var24, var42, var43, var46);
                    }
                }
            }
        }
        this.field4264 = 0;
        for (class148 var49 = (class148) this.field4254.method393((byte) -111); var49 != null; var49 = (class148) this.field4254.method391(115)) {
            var49.method997(arg2, arg1);
            this.field4264++;
        }
        class136.field2368 += this.field4264;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field4278 = null;
        if (arg0 != 2) {
            field4269 = null;
        }
        field4269 = null;
        field4286 = null;
        field4289 = null;
        field4287 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lui;Lkg;J)V")
    public class248(class230 arg0, class136 arg1, long arg2) {
        this.field4285 = arg0;
        this.field4282 = arg1;
        this.field4254 = new class58();
        this.field4271 = this.field4285.field3976;
        this.field4255 = (int) ((double) this.field4255 + Math.random() * 64.0D);
        this.field4267 = arg2;
    }
}
