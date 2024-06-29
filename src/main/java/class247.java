import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class247 {

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
    public boolean field3176;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
    public boolean field3175;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[S")
    public short[] field3180;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "[I")
    public static int[] field3181 = new int[2];

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lod;")
    public class463 field3189;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    private final void method1424(int arg0) {
        field3182++;
        int var2 = this.field3190;
        if (var2 == 2) {
            this.field3177 = 2048;
            this.field3179 = 0;
            this.field3183 = 1;
            this.field3191 = 2048;
        } else if (var2 == 3) {
            this.field3191 = 2048;
            this.field3183 = 1;
            this.field3179 = 0;
            this.field3177 = 4096;
        } else if (var2 == 4) {
            this.field3177 = 2048;
            this.field3191 = 2048;
            this.field3179 = 0;
            this.field3183 = 4;
        } else if (var2 == 5) {
            this.field3183 = 4;
            this.field3179 = 0;
            this.field3177 = 8192;
            this.field3191 = 2048;
        } else if (var2 == 12) {
            this.field3177 = 2048;
            this.field3183 = 2;
            this.field3191 = 2048;
            this.field3179 = 0;
        } else if (var2 == 13) {
            this.field3179 = 0;
            this.field3183 = 2;
            this.field3191 = 2048;
            this.field3177 = 8192;
        } else if (var2 == 10) {
            this.field3179 = 1536;
            this.field3183 = 3;
            this.field3177 = 2048;
            this.field3191 = 512;
        } else if (var2 == 11) {
            this.field3177 = 4096;
            this.field3179 = 1536;
            this.field3183 = 3;
            this.field3191 = 512;
        } else if (var2 == 6) {
            this.field3179 = 1280;
            this.field3177 = 2048;
            this.field3183 = 3;
            this.field3191 = 768;
        } else if (var2 == 7) {
            this.field3183 = 3;
            this.field3179 = 1280;
            this.field3191 = 768;
            this.field3177 = 4096;
        } else if (var2 == 8) {
            this.field3183 = 3;
            this.field3179 = 1024;
            this.field3177 = 2048;
            this.field3191 = 1024;
        } else if (var2 == 9) {
            this.field3191 = 1024;
            this.field3179 = 1024;
            this.field3177 = 4096;
            this.field3183 = 3;
        } else if (var2 == 14) {
            this.field3177 = 2048;
            this.field3179 = 1280;
            this.field3191 = 768;
            this.field3183 = 1;
        } else if (var2 == 15) {
            this.field3177 = 4096;
            this.field3183 = 1;
            this.field3179 = 1536;
            this.field3191 = 512;
        } else if (var2 == 16) {
            this.field3191 = 256;
            this.field3183 = 1;
            this.field3177 = 8192;
            this.field3179 = 1792;
        } else {
            this.field3179 = 0;
            this.field3191 = 2048;
            this.field3177 = 2048;
            this.field3183 = 0;
        }
        if (arg0 != 7) {
            method1428('\u007f', 33);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILoa;III)V")
    private final void method1425(int arg0, int arg1, int arg2, class635 arg3, int arg4, int arg5, int arg6) {
        this.field3189 = arg3.method319(arg1, arg6, arg4, arg2, arg5, 1.0F);
        if (arg0 >= -43) {
            this.field3189 = null;
        }
        field3184++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public final void method1426(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -2009810229) {
            return;
        }
        this.field3177 = arg4;
        this.field3183 = arg2;
        this.field3179 = arg1;
        this.field3191 = arg3;
        field3178++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3181 = null;
        if (arg0 != 1) {
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(CI)Z")
    public static final boolean method1428(char arg0, int arg1) {
        field3186++;
        if (arg1 != 160) {
            method1427(-27);
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIZ)V")
    public final void method1429(boolean arg0, int arg1, boolean arg2) {
        field3185++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field3187 + (this.field3177 * arg1 / 50) & 0x7FF;
            int var6 = this.field3183;
            if (var6 == 1) {
                var4 = (class285.field3655[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class271.field3435[var5] >> 1;
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
        this.field3189.method2507(arg2, (float) ((this.field3191 * var4 >> 11) + this.field3179) / 2048.0F);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    protected class247() {
        if (class271.field3435 == null) {
            class641.method3605(-18215);
        }
        this.method1424(7);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Loa;Liaa;I)V")
    public class247(class635 arg0, class452 arg1, int arg2) {
        if (class271.field3435 == null) {
            class641.method3605(-18215);
        }
        this.field3188 = arg1.method2541(47);
        this.field3176 = (this.field3188 & 0x10) != 0;
        this.field3175 = (this.field3188 & 0x8) != 0;
        this.field3188 &= 0x7;
        int var4 = arg1.method2574(-1758460248) << arg2;
        int var5 = arg1.method2574(-1758460248) << arg2;
        int var6 = arg1.method2574(-1758460248) << arg2;
        int var7 = arg1.method2541(35);
        int var8 = var7 * 2 + 1;
        this.field3180 = new short[var8];
        for (int var9 = 0; var9 < this.field3180.length; var9++) {
            short var13 = (short) arg1.method2574(-1758460248);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field3180[var9] = (short) class139.method776(var14 << 8, var15);
        }
        int var10 = (var7 << class8.field70) + class389.field5194;
        int var11 = class505.field7285 == null ? class57.field592[class509.method2923(true, arg1.method2574(-1758460248)) & 0xFFFF] : class505.field7285[arg1.method2574(-1758460248)];
        int var12 = arg1.method2541(106);
        this.field3187 = (var12 & 0xE0) << 3;
        this.field3190 = var12 & 0x1F;
        if (this.field3190 != 31) {
            this.method1424(7);
        }
        this.method1425(-99, var4, var10, arg0, var5, var11, var6);
    }
}
