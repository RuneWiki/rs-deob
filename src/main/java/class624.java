import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class624 {

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public int field8804;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Z")
    public boolean field8791;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "Z")
    public boolean field8800;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "[S")
    public short[] field8811;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    private int field8796;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "[I")
    public static int[] field8790 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field8795 = -2;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "Liu;")
    public static class517 field8806;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "Z")
    public static boolean field8810;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    private int field8801;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    private int field8803;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    private int field8807;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Luca;")
    public class637 field8805;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field8797;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "[I")
    public static int[] field8809;

    static {
        new class567("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field8806 = new class517(108, 12);
        field8810 = true;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILqa;IIII)V", line = 6)
    private final void method3536(int arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        field8792++;
        this.field8805 = arg2.method601(arg3, arg4, arg6, arg1, arg0, 1.0F);
        if (arg5 != -1503800693) {
            this.method3540(11, -53, -115, 73, -92);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILpp;)V", line = 19)
    public static final void method3537(int arg0, class464 arg1) {
        field8798++;
        class127.field2088.method1663(arg1.method2707(110), (byte) 114);
        if (arg0 > -79) {
            field8790 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZ)V", line = 48)
    public final void method3538(int arg0, int arg1, boolean arg2) {
        int var4 = -50 % ((arg1 + 47) / 34);
        field8793++;
        int var5;
        if (arg2) {
            var5 = 2048;
        } else {
            int var6 = this.field8794 * arg0 / 50 + this.field8796 & 0x7FF;
            int var7 = this.field8801;
            if (var7 == 1) {
                var5 = (class285.field4154[var6 << 3] >> 5) + 1024;
            } else if (var7 == 3) {
                var5 = class530.field7357[var6] >> 1;
            } else if (var7 == 4) {
                var5 = var6 >> 10 << 11;
            } else if (var7 == 2) {
                var5 = var6;
            } else if (var7 == 5) {
                var5 = (var6 >= 1024 ? 2048 - var6 : var6) << 1;
            } else {
                var5 = 2048;
            }
        }
        this.field8805.method450(5065, (float) ((this.field8807 * var5 >> 11) + this.field8803) / 2048.0F);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 128)
    private final void method3539(int arg0) {
        if (arg0 != 0) {
            this.field8796 = 92;
        }
        int var2 = this.field8802;
        if (var2 == 2) {
            this.field8807 = 2048;
            this.field8803 = 0;
            this.field8794 = 2048;
            this.field8801 = 1;
        } else if (var2 == 3) {
            this.field8794 = 4096;
            this.field8803 = 0;
            this.field8801 = 1;
            this.field8807 = 2048;
        } else if (var2 == 4) {
            this.field8803 = 0;
            this.field8794 = 2048;
            this.field8807 = 2048;
            this.field8801 = 4;
        } else if (var2 == 5) {
            this.field8801 = 4;
            this.field8803 = 0;
            this.field8807 = 2048;
            this.field8794 = 8192;
        } else if (var2 == 12) {
            this.field8794 = 2048;
            this.field8803 = 0;
            this.field8807 = 2048;
            this.field8801 = 2;
        } else if (var2 == 13) {
            this.field8794 = 8192;
            this.field8801 = 2;
            this.field8803 = 0;
            this.field8807 = 2048;
        } else if (var2 == 10) {
            this.field8807 = 512;
            this.field8803 = 1536;
            this.field8801 = 3;
            this.field8794 = 2048;
        } else if (var2 == 11) {
            this.field8794 = 4096;
            this.field8807 = 512;
            this.field8801 = 3;
            this.field8803 = 1536;
        } else if (var2 == 6) {
            this.field8801 = 3;
            this.field8794 = 2048;
            this.field8803 = 1280;
            this.field8807 = 768;
        } else if (var2 == 7) {
            this.field8794 = 4096;
            this.field8803 = 1280;
            this.field8801 = 3;
            this.field8807 = 768;
        } else if (var2 == 8) {
            this.field8807 = 1024;
            this.field8803 = 1024;
            this.field8794 = 2048;
            this.field8801 = 3;
        } else if (var2 == 9) {
            this.field8803 = 1024;
            this.field8794 = 4096;
            this.field8807 = 1024;
            this.field8801 = 3;
        } else if (var2 == 14) {
            this.field8801 = 1;
            this.field8807 = 768;
            this.field8794 = 2048;
            this.field8803 = 1280;
        } else if (var2 == 15) {
            this.field8803 = 1536;
            this.field8794 = 4096;
            this.field8807 = 512;
            this.field8801 = 1;
        } else if (var2 == 16) {
            this.field8794 = 8192;
            this.field8801 = 1;
            this.field8807 = 256;
            this.field8803 = 1792;
        } else {
            this.field8794 = 2048;
            this.field8807 = 2048;
            this.field8803 = 0;
            this.field8801 = 0;
        }
        field8799++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIII)V", line = 324)
    public final void method3540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8807 = arg4;
        if (arg0 != -28197) {
            this.field8807 = -93;
        }
        this.field8803 = arg3;
        this.field8794 = arg2;
        this.field8801 = arg1;
        field8808++;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 338)
    public static void method3541(int arg0) {
        if (arg0 == -14550) {
            field8797 = null;
            field8790 = null;
            field8809 = null;
            field8806 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V", line = 363)
    protected class624() {
        if (class530.field7357 == null) {
            class364.method2192(1);
        }
        this.method3539(0);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lqa;Lco;I)V", line = 373)
    public class624(class167 arg0, class268 arg1, int arg2) {
        if (class530.field7357 == null) {
            class364.method2192(1);
        }
        this.field8804 = arg1.method1738(255);
        this.field8791 = (this.field8804 & 0x8) != 0;
        this.field8800 = (this.field8804 & 0x10) != 0;
        this.field8804 &= 0x7;
        int var4 = arg1.method1745(32132) << arg2;
        int var5 = arg1.method1745(32132) << arg2;
        int var6 = arg1.method1745(32132) << arg2;
        int var7 = arg1.method1738(255);
        int var8 = var7 * 2 + 1;
        this.field8811 = new short[var8];
        for (int var9 = 0; var9 < this.field8811.length; var9++) {
            short var13 = (short) arg1.method1745(32132);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field8811[var9] = (short) class188.method1258(var15, var14 << 8);
        }
        int var10 = (var7 << class162.field2401) + class468.field6745;
        int var11 = class220.field3297 == null ? class12.field126[class153.method1089(-1628372184, arg1.method1745(32132)) & 0xFFFF] : class220.field3297[arg1.method1745(32132)];
        int var12 = arg1.method1738(255);
        this.field8796 = (var12 & 0xE0) << 3;
        this.field8802 = var12 & 0x1F;
        if (this.field8802 != 31) {
            this.method3539(0);
        }
        this.method3536(var11, var10, arg0, var4, var6, -1503800693, var5);
    }
}
