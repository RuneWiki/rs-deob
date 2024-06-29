import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class52 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    private int field815 = -1;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private int field832 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field819 = -1;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lsc;")
    private static class181 field822 = class149.method967(255, "Use");

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lsc;")
    public static class181 field830 = field822;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lsc;")
    public static class181 field828 = class149.method967(255, "sch-Utteln:");

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lvb;")
    public static class247 field827 = new class247();

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljb;")
    public static class11 field824;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Z")
    public static boolean field834;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[[[B")
    public static byte[][][] field816;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[[[I")
    public static int[][][] field813;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBILvf;)V")
    private final void method388(int arg0, byte arg1, int arg2, class230 arg3) {
        if (arg0 == 1) {
            this.field832 = arg3.method1508(true);
            this.method393((byte) -113, this.field832);
        } else if (arg0 == 2) {
            this.field815 = arg3.method1535(2);
            if (this.field815 == 65535) {
                this.field815 = -1;
            }
        } else if (arg0 == 3) {
            arg3.method1535(arg1 ^ 0xFFFFFF80);
        }
        if (arg1 != -126) {
            method389(-2, 71, (byte) -68);
        }
        field814++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V")
    public static final void method389(int arg0, int arg1, byte arg2) {
        field817++;
        if (class26.field452 != arg0) {
            class253.field4416 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class253.field4416[var3] = (var3 << 12) / arg0;
            }
            class164.field2796 = arg0 == 64 ? 2048 : 4096;
            class26.field452 = arg0;
            class186.field3300 = arg0 - 1;
        }
        if (arg2 != -4) {
            method394(-3, false);
        }
        if (class97.field1577 == arg1) {
            return;
        }
        if (class26.field452 == arg1) {
            class176.field3090 = class253.field4416;
        } else {
            class176.field3090 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class176.field3090[var4] = (var4 << 12) / arg1;
            }
        }
        class97.field1577 = arg1;
        class4.field90 = arg1 - 1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field816 = null;
        field822 = null;
        field830 = null;
        field828 = null;
        field813 = null;
        field824 = null;
        field827 = null;
        if (arg0 >= -81) {
            method390(94);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method391(int arg0) {
        field825++;
        class254.field4435 = new class214(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lvf;II)V")
    public final void method392(class230 arg0, int arg1, int arg2) {
        field826++;
        while (true) {
            int var4 = arg0.method1516((byte) 82);
            if (var4 == 0) {
                if (arg1 <= 58) {
                    field813 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method388(var4, (byte) -126, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    private final void method393(byte arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFF22) >> 8) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFD759) >> 16) / 256.0D;
        double var7 = var5;
        field821++;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        if (var5 > var3) {
            var7 = var3;
        }
        if (arg0 >= -110) {
            this.method393((byte) -109, 80);
        }
        double var11 = var5;
        if (var7 > var9) {
            var7 = var9;
        }
        double var13 = 0.0D;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field831 = (int) (var17 * 256.0D);
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var5 == var11) {
                var13 = (var3 - var9) / (var11 - var7);
            } else if (var3 == var11) {
                var13 = (var9 - var5) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        if (var17 > 0.5D) {
            this.field829 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field829 = (int) (var15 * var17 * 512.0D);
        }
        this.field820 = (int) (var15 * 256.0D);
        if (this.field829 < 1) {
            this.field829 = 1;
        }
        if (this.field831 < 0) {
            this.field831 = 0;
        } else if (this.field831 > 255) {
            this.field831 = 255;
        }
        if (this.field820 < 0) {
            this.field820 = 0;
        } else if (this.field820 > 255) {
            this.field820 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field833 = (int) ((double) this.field829 * var19);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lo;")
    public static final class175 method394(int arg0, boolean arg1) {
        field823++;
        if (arg1) {
            field822 = null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class208.field3563[var2] == null || class208.field3563[var2][var3] == null) {
            boolean var4 = class77.method537(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class208.field3563[var2][var3];
    }
}
