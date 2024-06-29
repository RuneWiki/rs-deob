import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class373 {

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public int field5590;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
    public boolean field5587;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Z")
    public boolean field5591;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[S")
    public short[] field5592;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field5593;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
    public static int[] field5579 = new int[14];

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field5596 = 2;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Liu;")
    public static class390 field5583 = new class390(79, -2);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    private int field5584;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    private int field5588;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    private int field5589;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lag;")
    public static class463 field5581;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Ldq;")
    public class472 field5595;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZII)V", line = 7)
    public final void method2267(boolean arg0, int arg1, int arg2) {
        field5597++;
        if (arg1 >= -80) {
            this.method2267(true, -12, 53);
        }
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field5594 * arg2 / 50 + this.field5580 & 0x7FF;
            int var6 = this.field5588;
            if (var6 == 1) {
                var4 = (class323.field4731[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class142.field1855[var5] >> 1;
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
        this.field5595.method1601((float) (this.field5584 + (this.field5589 * var4 >> 11)) / 2048.0F, 127);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V", line = 84)
    public final void method2268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5594 = arg4;
        this.field5584 = arg0;
        this.field5588 = arg1;
        this.field5589 = arg3;
        if (arg2 == 1536) {
            field5582++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 100)
    public static void method2269(int arg0) {
        field5583 = null;
        int var1 = -35 / ((arg0 + 6) / 44);
        field5579 = null;
        field5581 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIILeq;I)V", line = 114)
    private final void method2270(int arg0, int arg1, int arg2, int arg3, int arg4, class134 arg5, int arg6) {
        field5585++;
        this.field5595 = arg5.method747(arg2, arg4, arg1, arg6, arg0, 1.0F);
        if (arg3 != 9314) {
            this.field5591 = false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 138)
    private final void method2271(int arg0) {
        field5586++;
        int var2 = this.field5593;
        if (var2 == 2) {
            this.field5594 = 2048;
            this.field5588 = 1;
            this.field5589 = 2048;
            this.field5584 = 0;
        } else if (var2 == 3) {
            this.field5584 = 0;
            this.field5589 = 2048;
            this.field5594 = 4096;
            this.field5588 = 1;
        } else if (var2 == 4) {
            this.field5584 = 0;
            this.field5588 = 4;
            this.field5589 = 2048;
            this.field5594 = 2048;
        } else if (var2 == 5) {
            this.field5589 = 2048;
            this.field5594 = 8192;
            this.field5584 = 0;
            this.field5588 = 4;
        } else if (var2 == 12) {
            this.field5588 = 2;
            this.field5584 = 0;
            this.field5589 = 2048;
            this.field5594 = 2048;
        } else if (var2 == 13) {
            this.field5594 = 8192;
            this.field5588 = 2;
            this.field5589 = 2048;
            this.field5584 = 0;
        } else if (var2 == 10) {
            this.field5588 = 3;
            this.field5589 = 512;
            this.field5584 = 1536;
            this.field5594 = 2048;
        } else if (var2 == 11) {
            this.field5588 = 3;
            this.field5589 = 512;
            this.field5584 = 1536;
            this.field5594 = 4096;
        } else if (var2 == 6) {
            this.field5589 = 768;
            this.field5584 = 1280;
            this.field5588 = 3;
            this.field5594 = 2048;
        } else if (var2 == 7) {
            this.field5589 = 768;
            this.field5584 = 1280;
            this.field5588 = 3;
            this.field5594 = 4096;
        } else if (var2 == 8) {
            this.field5584 = 1024;
            this.field5594 = 2048;
            this.field5588 = 3;
            this.field5589 = 1024;
        } else if (var2 == 9) {
            this.field5584 = 1024;
            this.field5588 = 3;
            this.field5594 = 4096;
            this.field5589 = 1024;
        } else if (var2 == 14) {
            this.field5594 = 2048;
            this.field5589 = 768;
            this.field5584 = 1280;
            this.field5588 = 1;
        } else if (var2 == 15) {
            this.field5584 = 1536;
            this.field5594 = 4096;
            this.field5589 = 512;
            this.field5588 = 1;
        } else if (var2 == 16) {
            this.field5588 = 1;
            this.field5594 = 8192;
            this.field5584 = 1792;
            this.field5589 = 256;
        } else {
            this.field5584 = 0;
            this.field5589 = 2048;
            this.field5594 = 2048;
            this.field5588 = 0;
        }
        int var3 = -70 / ((arg0 - 6) / 44);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 335)
    protected class373() {
        if (class142.field1855 == null) {
            class368.method2242(8);
        }
        this.method2271(-125);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Leq;Lae;I)V", line = 352)
    public class373(class134 arg0, class156 arg1, int arg2) {
        if (class142.field1855 == null) {
            class368.method2242(8);
        }
        this.field5590 = arg1.method941((byte) 126);
        this.field5587 = (this.field5590 & 0x10) != 0;
        this.field5591 = (this.field5590 & 0x8) != 0;
        this.field5590 &= 0x7;
        int var4 = arg1.method993((byte) -109) << arg2;
        int var5 = arg1.method993((byte) -104) << arg2;
        int var6 = arg1.method993((byte) -123) << arg2;
        int var7 = arg1.method941((byte) 126);
        int var8 = var7 * 2 + 1;
        this.field5592 = new short[var8];
        for (int var9 = 0; var9 < this.field5592.length; var9++) {
            short var13 = (short) arg1.method993((byte) -112);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field5592[var9] = (short) class51.method379(var15, var14 << 8);
        }
        int var10 = (var7 << class41.field628) + class170.field2281;
        int var11 = class31.field518 == null ? class65.field971[class397.method2372(-1198994943, arg1.method993((byte) -126)) & 0xFFFF] : class31.field518[arg1.method993((byte) -108)];
        int var12 = arg1.method941((byte) 124);
        this.field5580 = (var12 & 0xE0) << 3;
        this.field5593 = var12 & 0x1F;
        if (this.field5593 != 31) {
            this.method2271(-108);
        }
        this.method2270(var11, var5, var4, 9314, var6, arg0, var10);
    }
}
