import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class471 {

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field6775;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Z")
    public boolean field6777;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
    public boolean field6778;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[S")
    public short[] field6767;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field6769;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "[[B")
    public static byte[][] field6783 = new byte[250][];

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lvg;")
    public static class622 field6768 = new class622(98, 6);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "[I")
    public static int[] field6785 = new int[4096];

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Z")
    public static volatile boolean field6786;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field6776;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field6780;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Ltg;")
    public class334 field6773;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public final void method2713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6781 = arg1;
        this.field6776 = arg0;
        this.field6779 = arg2;
        this.field6780 = arg4;
        if (arg3 < -74) {
            field6770++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method2714(int arg0) {
        field6783 = null;
        field6785 = null;
        int var1 = -39 / ((arg0 + 15) / 56);
        field6768 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Lms;")
    public static final class44 method2715(int arg0, int arg1, int arg2) {
        if (class603.field8695[arg0][arg1][arg2] == null) {
            boolean var3 = class603.field8695[0][arg1][arg2] != null && class603.field8695[0][arg1][arg2].field666 != null;
            if (var3 && arg0 >= class555.field8157 - 1) {
                return null;
            }
            class699.method3921(arg0, arg1, arg2);
        }
        return class603.field8695[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBIILr;II)V")
    private final void method2716(int arg0, byte arg1, int arg2, int arg3, class98 arg4, int arg5, int arg6) {
        if (arg1 < 108) {
            this.method2718(44);
        }
        this.field6773 = arg4.method687(arg3, arg0, arg5, arg2, arg6, 1.0F);
        field6774++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZI)V")
    public final void method2717(byte arg0, boolean arg1, int arg2) {
        field6782++;
        if (arg0 != -74) {
            this.method2716(1, (byte) -103, 102, -45, null, -116, -107);
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field6769 + (this.field6776 * arg2 / 50) & 0x7FF;
            int var6 = this.field6779;
            if (var6 == 1) {
                var4 = (class271.field3549[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class603.field8721[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field6773.method1165((float) (this.field6781 + (this.field6780 * var4 >> 11)) / 2048.0F, (byte) -18);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    private final void method2718(int arg0) {
        field6771++;
        int var2 = this.field6772;
        if (var2 == 2) {
            this.field6780 = 2048;
            this.field6781 = 0;
            this.field6776 = 2048;
            this.field6779 = 1;
        } else if (var2 == 3) {
            this.field6776 = 4096;
            this.field6780 = 2048;
            this.field6781 = 0;
            this.field6779 = 1;
        } else if (var2 == 4) {
            this.field6780 = 2048;
            this.field6779 = 4;
            this.field6781 = 0;
            this.field6776 = 2048;
        } else if (var2 == 5) {
            this.field6779 = 4;
            this.field6781 = 0;
            this.field6780 = 2048;
            this.field6776 = 8192;
        } else if (var2 == 12) {
            this.field6779 = 2;
            this.field6780 = 2048;
            this.field6781 = 0;
            this.field6776 = 2048;
        } else if (var2 == 13) {
            this.field6780 = 2048;
            this.field6776 = 8192;
            this.field6779 = 2;
            this.field6781 = 0;
        } else if (var2 == 10) {
            this.field6781 = 1536;
            this.field6779 = 3;
            this.field6776 = 2048;
            this.field6780 = 512;
        } else if (var2 == 11) {
            this.field6776 = 4096;
            this.field6780 = 512;
            this.field6779 = 3;
            this.field6781 = 1536;
        } else if (var2 == 6) {
            this.field6781 = 1280;
            this.field6779 = 3;
            this.field6776 = 2048;
            this.field6780 = 768;
        } else if (var2 == 7) {
            this.field6779 = 3;
            this.field6781 = 1280;
            this.field6776 = 4096;
            this.field6780 = 768;
        } else if (var2 == 8) {
            this.field6780 = 1024;
            this.field6781 = 1024;
            this.field6776 = 2048;
            this.field6779 = 3;
        } else if (var2 == 9) {
            this.field6781 = 1024;
            this.field6780 = 1024;
            this.field6776 = 4096;
            this.field6779 = 3;
        } else if (var2 == 14) {
            this.field6781 = 1280;
            this.field6779 = 1;
            this.field6776 = 2048;
            this.field6780 = 768;
        } else if (var2 == 15) {
            this.field6781 = 1536;
            this.field6776 = 4096;
            this.field6780 = 512;
            this.field6779 = 1;
        } else if (var2 == 16) {
            this.field6780 = 256;
            this.field6781 = 1792;
            this.field6779 = 1;
            this.field6776 = 8192;
        } else {
            this.field6779 = 0;
            this.field6781 = 0;
            this.field6776 = 2048;
            this.field6780 = 2048;
        }
        if (arg0 != -11) {
            this.method2713(-51, 49, 39, -36, -18);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    protected class471() {
        if (class603.field8721 == null) {
            class304.method1915((byte) 127);
        }
        this.method2718(-11);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lr;Lgk;I)V")
    public class471(class98 arg0, class540 arg1, int arg2) {
        if (class603.field8721 == null) {
            class304.method1915((byte) 111);
        }
        this.field6775 = arg1.method3115(29871);
        this.field6777 = (this.field6775 & 0x10) != 0;
        this.field6778 = (this.field6775 & 0x8) != 0;
        this.field6775 &= 0x7;
        int var4 = arg1.method3169(26488) << arg2;
        int var5 = arg1.method3169(26488) << arg2;
        int var6 = arg1.method3169(26488) << arg2;
        int var7 = arg1.method3115(29871);
        int var8 = var7 * 2 + 1;
        this.field6767 = new short[var8];
        for (int var9 = 0; var9 < this.field6767.length; var9++) {
            short var13 = (short) arg1.method3169(26488);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field6767[var9] = (short) class151.method1076(var15, var14 << 8);
        }
        int var10 = (var7 << class125.field1831) + class41.field615;
        int var11 = class391.field5908 == null ? class589.field8551[class399.method2479(arg1.method3169(26488), false) & 0xFFFF] : class391.field5908[arg1.method3169(26488)];
        int var12 = arg1.method3115(29871);
        this.field6769 = (var12 & 0xE0) << 3;
        this.field6772 = var12 & 0x1F;
        if (this.field6772 != 31) {
            this.method2718(-11);
        }
        this.method2716(var6, (byte) 117, var10, var4, arg0, var5, var11);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6785[var0] = class547.method3200(40960, var0);
        }
        field6786 = true;
    }
}
