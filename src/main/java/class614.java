import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class614 {

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public int field8793;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "Z")
    public boolean field8791;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "Z")
    public boolean field8786;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "[S")
    public short[] field8795;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public int field8792;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    private int field8779;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8787 = 0;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lhs;")
    public static class325 field8794 = new class325(0, 1);

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "Ldh;")
    public static class320 field8798 = new class320(52, 1);

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    private int field8780;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    private int field8781;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    private int field8790;

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
    private int field8796;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lada;")
    public class163 field8785;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "[I")
    public static int[] field8797;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V", line = 11)
    private final void method3469(int arg0) {
        field8788++;
        int var2 = this.field8792;
        if (var2 == 2) {
            this.field8796 = 1;
            this.field8781 = 0;
            this.field8780 = 2048;
            this.field8790 = 2048;
        } else if (var2 == 3) {
            this.field8781 = 0;
            this.field8780 = 4096;
            this.field8796 = 1;
            this.field8790 = 2048;
        } else if (var2 == 4) {
            this.field8796 = 4;
            this.field8781 = 0;
            this.field8780 = 2048;
            this.field8790 = 2048;
        } else if (var2 == 5) {
            this.field8790 = 2048;
            this.field8780 = 8192;
            this.field8796 = 4;
            this.field8781 = 0;
        } else if (var2 == 12) {
            this.field8780 = 2048;
            this.field8790 = 2048;
            this.field8796 = 2;
            this.field8781 = 0;
        } else if (var2 == 13) {
            this.field8796 = 2;
            this.field8781 = 0;
            this.field8780 = 8192;
            this.field8790 = 2048;
        } else if (var2 == 10) {
            this.field8796 = 3;
            this.field8790 = 512;
            this.field8780 = 2048;
            this.field8781 = 1536;
        } else if (var2 == 11) {
            this.field8790 = 512;
            this.field8781 = 1536;
            this.field8780 = 4096;
            this.field8796 = 3;
        } else if (var2 == 6) {
            this.field8780 = 2048;
            this.field8796 = 3;
            this.field8790 = 768;
            this.field8781 = 1280;
        } else if (var2 == 7) {
            this.field8781 = 1280;
            this.field8796 = 3;
            this.field8780 = 4096;
            this.field8790 = 768;
        } else if (var2 == 8) {
            this.field8781 = 1024;
            this.field8790 = 1024;
            this.field8796 = 3;
            this.field8780 = 2048;
        } else if (var2 == 9) {
            this.field8781 = 1024;
            this.field8780 = 4096;
            this.field8796 = 3;
            this.field8790 = 1024;
        } else if (var2 == 14) {
            this.field8796 = 1;
            this.field8780 = 2048;
            this.field8781 = 1280;
            this.field8790 = 768;
        } else if (var2 == 15) {
            this.field8796 = 1;
            this.field8790 = 512;
            this.field8780 = 4096;
            this.field8781 = 1536;
        } else if (var2 == 16) {
            this.field8796 = 1;
            this.field8790 = 256;
            this.field8781 = 1792;
            this.field8780 = 8192;
        } else {
            this.field8780 = 2048;
            this.field8790 = 2048;
            this.field8781 = 0;
            this.field8796 = 0;
        }
        if (arg0 != -5) {
            this.field8780 = -110;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[F)[F", line = 212)
    public static final float[] method3470(int arg0, int arg1, float[] arg2) {
        field8782++;
        if (arg0 == -14) {
            float[] var3 = new float[arg1];
            class143.method897(arg2, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIII)V", line = 227)
    public final void method3471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8796 = arg0;
        field8784++;
        this.field8781 = arg1;
        this.field8790 = arg2;
        this.field8780 = arg3;
        int var6 = 119 % ((25 - arg4) / 33);
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V", line = 241)
    public static void method3472(int arg0) {
        if (arg0 != 3) {
            method3472(55);
        }
        field8794 = null;
        field8797 = null;
        field8798 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILha;IIII)V", line = 265)
    private final void method3473(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 381) {
            this.field8796 = 89;
        }
        this.field8785 = arg2.method368(arg4, arg6, arg3, arg5, arg1, 1.0F);
        field8789++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZZ)V", line = 277)
    public final void method3474(int arg0, boolean arg1, boolean arg2) {
        field8783++;
        if (!arg2) {
            return;
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field8779 + (this.field8780 * arg0 / 50) & 0x7FF;
            int var6 = this.field8796;
            if (var6 == 1) {
                var4 = (class260.field3230[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class230.field2676[var5] >> 1;
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
        this.field8785.method799(117, (float) ((this.field8790 * var4 >> 11) + this.field8781) / 2048.0F);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V", line = 354)
    protected class614() {
        if (class230.field2676 == null) {
            class313.method1861((byte) -105);
        }
        this.method3469(-5);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lha;Lig;I)V", line = 371)
    public class614(class58 arg0, class244 arg1, int arg2) {
        if (class230.field2676 == null) {
            class313.method1861((byte) -105);
        }
        this.field8793 = arg1.method1423(-24);
        this.field8791 = (this.field8793 & 0x10) != 0;
        this.field8786 = (this.field8793 & 0x8) != 0;
        this.field8793 &= 0x7;
        int var4 = arg1.method1476(-118) << arg2;
        int var5 = arg1.method1476(36) << arg2;
        int var6 = arg1.method1476(27) << arg2;
        int var7 = arg1.method1423(-79);
        int var8 = var7 * 2 + 1;
        this.field8795 = new short[var8];
        for (int var9 = 0; var9 < this.field8795.length; var9++) {
            short var13 = (short) arg1.method1476(-69);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field8795[var9] = (short) class695.method3919(var15, var14 << 8);
        }
        int var10 = (var7 << class748.field10430) + class598.field8523;
        int var11 = class721.field10115 == null ? class32.field361[class660.method3759((byte) -2, arg1.method1476(23)) & 0xFFFF] : class721.field10115[arg1.method1476(-84)];
        int var12 = arg1.method1423(-120);
        this.field8792 = var12 & 0x1F;
        this.field8779 = (var12 & 0xE0) << 3;
        if (this.field8792 != 31) {
            this.method3469(-5);
        }
        this.method3473(381, var11, arg0, var5, var4, var10, var6);
    }
}
