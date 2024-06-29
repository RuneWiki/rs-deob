import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class328 {

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "Z")
    public boolean field4284;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Z")
    public boolean field4278;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "[S")
    public short[] field4271;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    private int field4268;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Lug;")
    public static class480 field4273 = new class480();

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field4279 = -1;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    private int field4269;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    private int field4272;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    private int field4276;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "Ldn;")
    public static class438 field4286;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "Lcba;")
    public class469 field4282;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "[[I")
    public static int[][] field4287;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4283 = arg4;
        field4275++;
        int var6 = 125 % ((13 - arg2) / 40);
        this.field4276 = arg0;
        this.field4272 = arg3;
        this.field4269 = arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V", line = 17)
    private final void method1847(byte arg0) {
        int var2 = this.field4267;
        if (var2 == 2) {
            this.field4276 = 2048;
            this.field4269 = 2048;
            this.field4272 = 0;
            this.field4283 = 1;
        } else if (var2 == 3) {
            this.field4276 = 2048;
            this.field4269 = 4096;
            this.field4272 = 0;
            this.field4283 = 1;
        } else if (var2 == 4) {
            this.field4283 = 4;
            this.field4276 = 2048;
            this.field4272 = 0;
            this.field4269 = 2048;
        } else if (var2 == 5) {
            this.field4276 = 2048;
            this.field4272 = 0;
            this.field4283 = 4;
            this.field4269 = 8192;
        } else if (var2 == 12) {
            this.field4269 = 2048;
            this.field4276 = 2048;
            this.field4272 = 0;
            this.field4283 = 2;
        } else if (var2 == 13) {
            this.field4272 = 0;
            this.field4283 = 2;
            this.field4276 = 2048;
            this.field4269 = 8192;
        } else if (var2 == 10) {
            this.field4269 = 2048;
            this.field4276 = 512;
            this.field4283 = 3;
            this.field4272 = 1536;
        } else if (var2 == 11) {
            this.field4269 = 4096;
            this.field4272 = 1536;
            this.field4276 = 512;
            this.field4283 = 3;
        } else if (var2 == 6) {
            this.field4272 = 1280;
            this.field4276 = 768;
            this.field4269 = 2048;
            this.field4283 = 3;
        } else if (var2 == 7) {
            this.field4283 = 3;
            this.field4269 = 4096;
            this.field4272 = 1280;
            this.field4276 = 768;
        } else if (var2 == 8) {
            this.field4269 = 2048;
            this.field4283 = 3;
            this.field4276 = 1024;
            this.field4272 = 1024;
        } else if (var2 == 9) {
            this.field4283 = 3;
            this.field4276 = 1024;
            this.field4269 = 4096;
            this.field4272 = 1024;
        } else if (var2 == 14) {
            this.field4272 = 1280;
            this.field4276 = 768;
            this.field4269 = 2048;
            this.field4283 = 1;
        } else if (var2 == 15) {
            this.field4272 = 1536;
            this.field4269 = 4096;
            this.field4276 = 512;
            this.field4283 = 1;
        } else if (var2 == 16) {
            this.field4283 = 1;
            this.field4276 = 256;
            this.field4272 = 1792;
            this.field4269 = 8192;
        } else {
            this.field4272 = 0;
            this.field4283 = 0;
            this.field4276 = 2048;
            this.field4269 = 2048;
        }
        field4285++;
        if (arg0 != -103) {
            this.field4276 = -9;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZI)V", line = 217)
    public final void method1848(boolean arg0, boolean arg1, int arg2) {
        field4280++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field4268 + (this.field4269 * arg2 / 50) & 0x7FF;
            int var6 = this.field4283;
            if (var6 == 1) {
                var4 = (class442.field6100[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class425.field5472[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field4282.method506(-1, (float) (this.field4272 + (this.field4276 * var4 >> 11)) / 2048.0F);
        if (arg1) {
            this.field4268 = 125;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIBII)V", line = 306)
    public static final void method1849(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4277++;
        if (arg1 == arg5) {
            class365.method2044((byte) -119, arg4, arg5, arg2, arg0);
            return;
        }
        if (arg3 < 62) {
            method1850(15);
        }
        if (class470.field6589 <= (arg4 - arg5) && class592.field8588 >= arg4 + arg5 && arg0 - arg1 >= class563.field8282 && arg0 + arg1 <= class271.field3513) {
            class327.method1817(arg5, arg0, arg2, arg1, -3, arg4);
        } else {
            class275.method1565(26250, arg5, arg4, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 335)
    public static void method1850(int arg0) {
        field4273 = null;
        field4287 = null;
        if (arg0 != 31) {
            field4279 = 80;
        }
        field4286 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILqa;IIIII)V", line = 352)
    private final void method1851(int arg0, class206 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4282 = arg1.method1134(arg0, arg2, arg5, arg3, arg4, 1.0F);
        if (arg6 != 2048) {
            field4279 = -38;
        }
        field4270++;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 371)
    protected class328() {
        if (class425.field5472 == null) {
            class431.method2497((byte) 127);
        }
        this.method1847((byte) -103);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lqa;Los;I)V", line = 382)
    public class328(class206 arg0, class374 arg1, int arg2) {
        if (class425.field5472 == null) {
            class431.method2497((byte) 109);
        }
        this.field4274 = arg1.method2129(-100);
        this.field4284 = (this.field4274 & 0x8) != 0;
        this.field4278 = (this.field4274 & 0x10) != 0;
        this.field4274 &= 0x7;
        int var4 = arg1.method2136(false) << arg2;
        int var5 = arg1.method2136(false) << arg2;
        int var6 = arg1.method2136(false) << arg2;
        int var7 = arg1.method2129(-66);
        int var8 = var7 * 2 + 1;
        this.field4271 = new short[var8];
        for (int var9 = 0; var9 < this.field4271.length; var9++) {
            short var13 = (short) arg1.method2136(false);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field4271[var9] = (short) class42.method223(var14 << 8, var15);
        }
        int var10 = (var7 << class362.field4756) + class410.field5342;
        int var11 = class103.field1259 == null ? class404.field5317[class390.method2237(arg1.method2136(false), true) & 0xFFFF] : class103.field1259[arg1.method2136(false)];
        int var12 = arg1.method2129(-121);
        this.field4267 = var12 & 0x1F;
        this.field4268 = (var12 & 0xE0) << 3;
        if (this.field4267 != 31) {
            this.method1847((byte) -103);
        }
        this.method1851(var4, arg0, var6, var10, var11, var5, 2048);
    }
}
