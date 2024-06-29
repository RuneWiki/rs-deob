import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class447 {

    @OriginalMember(owner = "client!ika", name = "n", descriptor = "I")
    public int field6434;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "Z")
    public boolean field6421;

    @OriginalMember(owner = "client!ika", name = "h", descriptor = "Z")
    public boolean field6428;

    @OriginalMember(owner = "client!ika", name = "l", descriptor = "[S")
    public short[] field6432;

    @OriginalMember(owner = "client!ika", name = "g", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!ika", name = "o", descriptor = "I")
    private int field6435;

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ika", name = "i", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ika", name = "j", descriptor = "I")
    private int field6430;

    @OriginalMember(owner = "client!ika", name = "k", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ika", name = "m", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!ika", name = "p", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "Luaa;")
    public class127 field6422;

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "[Lmr;")
    public static class154[] field6426;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lha;ZIIIII)V", line = 6)
    private final void method2659(class66 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            this.method2659(null, false, 27, -46, -108, 107, -23);
        }
        this.field6422 = arg0.method551(arg2, arg5, arg4, arg3, arg6, 1.0F);
        field6424++;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V", line = 25)
    public static void method2660(int arg0) {
        field6426 = null;
        int var1 = -86 % ((arg0 - 64) / 50);
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZIZ)V", line = 38)
    public final void method2661(boolean arg0, int arg1, boolean arg2) {
        field6425++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field6436 * arg1 / 50 + this.field6435 & 0x7FF;
            int var5 = this.field6423;
            if (var5 == 1) {
                var6 = (class110.field1524[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class462.field6577[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field6422.method906(-17359, (float) (this.field6433 + (this.field6430 * var6 >> 11)) / 2048.0F);
        if (arg0) {
            this.method2663(4);
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIIII)V", line = 121)
    public final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -90 % ((-arg1 - 74) / 37);
        this.field6433 = arg0;
        field6429++;
        this.field6436 = arg3;
        this.field6430 = arg4;
        this.field6423 = arg2;
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V", line = 136)
    private final void method2663(int arg0) {
        if (arg0 != 2048) {
            this.field6421 = false;
        }
        int var2 = this.field6427;
        if (var2 == 2) {
            this.field6433 = 0;
            this.field6423 = 1;
            this.field6436 = 2048;
            this.field6430 = 2048;
        } else if (var2 == 3) {
            this.field6436 = 4096;
            this.field6423 = 1;
            this.field6433 = 0;
            this.field6430 = 2048;
        } else if (var2 == 4) {
            this.field6430 = 2048;
            this.field6436 = 2048;
            this.field6423 = 4;
            this.field6433 = 0;
        } else if (var2 == 5) {
            this.field6433 = 0;
            this.field6436 = 8192;
            this.field6423 = 4;
            this.field6430 = 2048;
        } else if (var2 == 12) {
            this.field6423 = 2;
            this.field6433 = 0;
            this.field6430 = 2048;
            this.field6436 = 2048;
        } else if (var2 == 13) {
            this.field6423 = 2;
            this.field6433 = 0;
            this.field6430 = 2048;
            this.field6436 = 8192;
        } else if (var2 == 10) {
            this.field6430 = 512;
            this.field6423 = 3;
            this.field6433 = 1536;
            this.field6436 = 2048;
        } else if (var2 == 11) {
            this.field6430 = 512;
            this.field6436 = 4096;
            this.field6433 = 1536;
            this.field6423 = 3;
        } else if (var2 == 6) {
            this.field6423 = 3;
            this.field6430 = 768;
            this.field6436 = 2048;
            this.field6433 = 1280;
        } else if (var2 == 7) {
            this.field6436 = 4096;
            this.field6430 = 768;
            this.field6423 = 3;
            this.field6433 = 1280;
        } else if (var2 == 8) {
            this.field6433 = 1024;
            this.field6430 = 1024;
            this.field6423 = 3;
            this.field6436 = 2048;
        } else if (var2 == 9) {
            this.field6430 = 1024;
            this.field6436 = 4096;
            this.field6423 = 3;
            this.field6433 = 1024;
        } else if (var2 == 14) {
            this.field6436 = 2048;
            this.field6430 = 768;
            this.field6433 = 1280;
            this.field6423 = 1;
        } else if (var2 == 15) {
            this.field6436 = 4096;
            this.field6423 = 1;
            this.field6433 = 1536;
            this.field6430 = 512;
        } else if (var2 == 16) {
            this.field6430 = 256;
            this.field6433 = 1792;
            this.field6436 = 8192;
            this.field6423 = 1;
        } else {
            this.field6436 = 2048;
            this.field6423 = 0;
            this.field6430 = 2048;
            this.field6433 = 0;
        }
        field6431++;
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "()V", line = 333)
    protected class447() {
        if (class462.field6577 == null) {
            class629.method3474(8);
        }
        this.method2663(2048);
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lha;Ldt;I)V", line = 343)
    public class447(class66 arg0, class254 arg1, int arg2) {
        if (class462.field6577 == null) {
            class629.method3474(8);
        }
        this.field6434 = arg1.method1731((byte) 64);
        this.field6421 = (this.field6434 & 0x8) != 0;
        this.field6428 = (this.field6434 & 0x10) != 0;
        this.field6434 &= 0x7;
        int var4 = arg1.method1728((byte) 84) << arg2;
        int var5 = arg1.method1728((byte) 27) << arg2;
        int var6 = arg1.method1728((byte) 56) << arg2;
        int var7 = arg1.method1731((byte) 64);
        int var8 = var7 * 2 + 1;
        this.field6432 = new short[var8];
        for (int var9 = 0; var9 < this.field6432.length; var9++) {
            short var13 = (short) arg1.method1728((byte) 34);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field6432[var9] = (short) class670.method3699(var14 << 8, var15);
        }
        int var10 = (var7 << class478.field6717) + class281.field4067;
        int var11 = class217.field2836 == null ? class462.field6576[class720.method3974(-594362713, arg1.method1728((byte) 97)) & 0xFFFF] : class217.field2836[arg1.method1728((byte) 49)];
        int var12 = arg1.method1731((byte) 64);
        this.field6427 = var12 & 0x1F;
        this.field6435 = (var12 & 0xE0) << 3;
        if (this.field6427 != 31) {
            this.method2663(2048);
        }
        this.method2659(arg0, false, var4, var10, var5, var6, var11);
    }
}
