import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class420 {

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "Z")
    public boolean field5699;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
    public boolean field5686;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "[S")
    public short[] field5692;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    private int field5688;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field5687 = -1;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    private int field5685;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    private int field5691;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    private int field5693;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    private int field5695;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lnm;")
    public class405 field5683;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "[[[Lnj;")
    public static class205[][][] field5697;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIILqa;II)V")
    private final void method2472(int arg0, int arg1, int arg2, int arg3, class208 arg4, int arg5, int arg6) {
        if (arg3 != 6433) {
            this.field5683 = null;
        }
        field5694++;
        this.field5683 = arg4.method469(arg0, arg6, arg2, arg5, arg1, 1.0F);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    private final void method2473(int arg0) {
        int var2 = this.field5696;
        if (var2 == 2) {
            this.field5691 = 2048;
            this.field5695 = 1;
            this.field5685 = 0;
            this.field5693 = 2048;
        } else if (var2 == 3) {
            this.field5695 = 1;
            this.field5685 = 0;
            this.field5693 = 2048;
            this.field5691 = 4096;
        } else if (var2 == 4) {
            this.field5691 = 2048;
            this.field5693 = 2048;
            this.field5685 = 0;
            this.field5695 = 4;
        } else if (var2 == 5) {
            this.field5693 = 2048;
            this.field5685 = 0;
            this.field5695 = 4;
            this.field5691 = 8192;
        } else if (var2 == 12) {
            this.field5693 = 2048;
            this.field5685 = 0;
            this.field5691 = 2048;
            this.field5695 = 2;
        } else if (var2 == 13) {
            this.field5695 = 2;
            this.field5693 = 2048;
            this.field5685 = 0;
            this.field5691 = 8192;
        } else if (var2 == 10) {
            this.field5695 = 3;
            this.field5691 = 2048;
            this.field5685 = 1536;
            this.field5693 = 512;
        } else if (var2 == 11) {
            this.field5685 = 1536;
            this.field5691 = 4096;
            this.field5695 = 3;
            this.field5693 = 512;
        } else if (var2 == 6) {
            this.field5695 = 3;
            this.field5693 = 768;
            this.field5685 = 1280;
            this.field5691 = 2048;
        } else if (var2 == 7) {
            this.field5691 = 4096;
            this.field5693 = 768;
            this.field5695 = 3;
            this.field5685 = 1280;
        } else if (var2 == 8) {
            this.field5691 = 2048;
            this.field5695 = 3;
            this.field5693 = 1024;
            this.field5685 = 1024;
        } else if (var2 == 9) {
            this.field5691 = 4096;
            this.field5685 = 1024;
            this.field5695 = 3;
            this.field5693 = 1024;
        } else if (var2 == 14) {
            this.field5693 = 768;
            this.field5695 = 1;
            this.field5691 = 2048;
            this.field5685 = 1280;
        } else if (var2 == 15) {
            this.field5695 = 1;
            this.field5693 = 512;
            this.field5685 = 1536;
            this.field5691 = 4096;
        } else if (var2 == 16) {
            this.field5693 = 256;
            this.field5685 = 1792;
            this.field5695 = 1;
            this.field5691 = 8192;
        } else {
            this.field5695 = 0;
            this.field5685 = 0;
            this.field5691 = 2048;
            this.field5693 = 2048;
        }
        if (arg0 != 1024) {
            method2476(-83, 94, 1);
        }
        field5682++;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field5697 = null;
        int var1 = -89 / ((arg0 - 53) / 54);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIZ)V")
    public final void method2475(int arg0, int arg1, boolean arg2) {
        field5690++;
        if (arg1 != -94124895) {
            this.field5686 = false;
        }
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field5691 * arg0 / 50 + this.field5688 & 0x7FF;
            int var6 = this.field5695;
            if (var6 == 1) {
                var4 = (class589.field8742[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class324.field4469[var5] >> 1;
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
        this.field5683.method1439((float) ((this.field5693 * var4 >> 11) + this.field5685) / 2048.0F, false);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Luj;")
    public static final class323 method2476(int arg0, int arg1, int arg2) {
        class205 var3 = field5697[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3040;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)V")
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 512) {
            field5687 = -79;
        }
        this.field5693 = arg2;
        this.field5695 = arg4;
        field5698++;
        this.field5691 = arg3;
        this.field5685 = arg1;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIBIIZ)V")
    public static final void method2478(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field5684++;
        class92.field1368 = arg0;
        class576.field8493 = arg2;
        class224.field3243 = arg1;
        class259.field3708 = arg5;
        if (arg3 != 117) {
            method2474(102);
        }
        class408.field5571 = arg4;
        if (arg6 && class408.field5571 >= 100) {
            class125.field1760 = class92.field1368 * 128 + 64;
            class214.field3161 = class224.field3243 * 128 + 64;
            class118.field1665 = class132.method919(class89.field1339, class214.field3161, class125.field1760, (byte) -82) - class259.field3708;
        }
        class531.field7929 = 2;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
    protected class420() {
        if (class324.field4469 == null) {
            class532.method3209(true);
        }
        this.method2473(1024);
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lqa;Lgw;I)V")
    public class420(class208 arg0, class148 arg1, int arg2) {
        if (class324.field4469 == null) {
            class532.method3209(true);
        }
        this.field5689 = arg1.method1032((byte) -33);
        this.field5699 = (this.field5689 & 0x8) != 0;
        this.field5686 = (this.field5689 & 0x10) != 0;
        this.field5689 &= 0x7;
        int var4 = arg1.method1045(true) << arg2;
        int var5 = arg1.method1045(true) << arg2;
        int var6 = arg1.method1045(true) << arg2;
        int var7 = arg1.method1032((byte) -33);
        int var8 = var7 * 2 + 1;
        this.field5692 = new short[var8];
        for (int var9 = 0; var9 < this.field5692.length; var9++) {
            short var13 = (short) arg1.method1045(true);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field5692[var9] = (short) class473.method2847(var14 << 8, var15);
        }
        int var10 = (var7 << class115.field1626) + class402.field5500;
        int var11 = class60.field758 == null ? class111.field1583[class417.method2456(arg1.method1045(true), -112) & 0xFFFF] : class60.field758[arg1.method1045(true)];
        int var12 = arg1.method1032((byte) -33);
        this.field5696 = var12 & 0x1F;
        this.field5688 = (var12 & 0xE0) << 3;
        if (this.field5696 != 31) {
            this.method2473(1024);
        }
        this.method2472(var4, var11, var5, 6433, arg0, var10, var6);
    }

    static {
        new class572("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
