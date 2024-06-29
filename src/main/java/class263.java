import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class263 {

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
    public boolean field4301;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Z")
    public boolean field4289;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "[S")
    public short[] field4294;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lhga;")
    public static class158 field4306 = new class158(67, 0);

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    private int field4298;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "Lcp;")
    public class674 field4300;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BILpca;)I")
    public static final int method1867(byte arg0, int arg1, class665 arg2) {
        field4297++;
        if (!client.method1955(arg2).method742(arg1, -91) && arg2.field9408 == null) {
            return -1;
        } else {
            int var3 = -41 / ((-arg0 - 38) / 55);
            return arg2.field9391 == null || arg1 >= arg2.field9391.length ? -1 : arg2.field9391[arg1];
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
    private final void method1868(int arg0) {
        field4295++;
        int var2 = this.field4292;
        if (var2 == 2) {
            this.field4296 = 2048;
            this.field4305 = 1;
            this.field4293 = 0;
            this.field4298 = 2048;
        } else if (var2 == 3) {
            this.field4296 = 2048;
            this.field4298 = 4096;
            this.field4305 = 1;
            this.field4293 = 0;
        } else if (var2 == 4) {
            this.field4293 = 0;
            this.field4305 = 4;
            this.field4298 = 2048;
            this.field4296 = 2048;
        } else if (var2 == 5) {
            this.field4293 = 0;
            this.field4296 = 2048;
            this.field4305 = 4;
            this.field4298 = 8192;
        } else if (var2 == 12) {
            this.field4293 = 0;
            this.field4305 = 2;
            this.field4296 = 2048;
            this.field4298 = 2048;
        } else if (var2 == 13) {
            this.field4298 = 8192;
            this.field4296 = 2048;
            this.field4305 = 2;
            this.field4293 = 0;
        } else if (var2 == 10) {
            this.field4296 = 512;
            this.field4298 = 2048;
            this.field4305 = 3;
            this.field4293 = 1536;
        } else if (var2 == 11) {
            this.field4296 = 512;
            this.field4298 = 4096;
            this.field4293 = 1536;
            this.field4305 = 3;
        } else if (var2 == 6) {
            this.field4293 = 1280;
            this.field4296 = 768;
            this.field4305 = 3;
            this.field4298 = 2048;
        } else if (var2 == 7) {
            this.field4293 = 1280;
            this.field4296 = 768;
            this.field4298 = 4096;
            this.field4305 = 3;
        } else if (var2 == 8) {
            this.field4293 = 1024;
            this.field4296 = 1024;
            this.field4305 = 3;
            this.field4298 = 2048;
        } else if (var2 == 9) {
            this.field4296 = 1024;
            this.field4305 = 3;
            this.field4298 = 4096;
            this.field4293 = 1024;
        } else if (var2 == 14) {
            this.field4305 = 1;
            this.field4293 = 1280;
            this.field4298 = 2048;
            this.field4296 = 768;
        } else if (var2 == 15) {
            this.field4305 = 1;
            this.field4298 = 4096;
            this.field4296 = 512;
            this.field4293 = 1536;
        } else if (var2 == 16) {
            this.field4298 = 8192;
            this.field4305 = 1;
            this.field4296 = 256;
            this.field4293 = 1792;
        } else {
            this.field4293 = 0;
            this.field4298 = 2048;
            this.field4296 = 2048;
            this.field4305 = 0;
        }
        if (arg0 != 3) {
            this.method1870(-105, 102, 104, 59, true);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLko;)I")
    public static final int method1869(byte arg0, class466 arg1) {
        field4299++;
        if (class622.field8779 == arg1) {
            return 5890;
        } else if (class24.field409 == arg1) {
            return 34167;
        } else if (class692.field9702 == arg1) {
            return 34168;
        } else if (class471.field6974 == arg1) {
            return 34166;
        } else {
            int var2 = 125 / ((arg0 - 60) / 32);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIZ)V")
    public final void method1870(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4298 = arg0;
        this.field4296 = arg1;
        if (!arg4) {
            this.field4293 = -17;
        }
        this.field4305 = arg2;
        this.field4293 = arg3;
        field4290++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZ)V")
    public final void method1871(int arg0, int arg1, boolean arg2) {
        int var4 = -34 % ((20 - arg0) / 47);
        field4291++;
        int var5;
        if (arg2) {
            var5 = 2048;
        } else {
            int var6 = this.field4298 * arg1 / 50 + this.field4304 & 0x7FF;
            int var7 = this.field4305;
            if (var7 == 1) {
                var5 = (class567.field8139[var6 << 3] >> 4) + 1024;
            } else if (var7 == 3) {
                var5 = class474.field7020[var6] >> 1;
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
        this.field4300.method188(122, (float) ((this.field4296 * var5 >> 11) + this.field4293) / 2048.0F);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIZLr;I)V")
    private final void method1872(int arg0, int arg1, int arg2, int arg3, boolean arg4, class167 arg5, int arg6) {
        if (arg4) {
            method1873(-7);
        }
        this.field4300 = arg5.method325(arg0, arg2, arg3, arg6, arg1, 1.0F);
        field4303++;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public static void method1873(int arg0) {
        field4306 = null;
        if (arg0 != 2048) {
            field4307 = 39;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    protected class263() {
        if (class474.field7020 == null) {
            class403.method2588(0);
        }
        this.method1868(3);
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lr;Lie;I)V")
    public class263(class167 arg0, class6 arg1, int arg2) {
        if (class474.field7020 == null) {
            class403.method2588(0);
        }
        this.field4302 = arg1.method70(-9059);
        this.field4301 = (this.field4302 & 0x8) != 0;
        this.field4289 = (this.field4302 & 0x10) != 0;
        this.field4302 &= 0x7;
        int var4 = arg1.method67(12021) << arg2;
        int var5 = arg1.method67(12021) << arg2;
        int var6 = arg1.method67(12021) << arg2;
        int var7 = arg1.method70(-9059);
        int var8 = var7 * 2 + 1;
        this.field4294 = new short[var8];
        for (int var9 = 0; var9 < this.field4294.length; var9++) {
            short var13 = (short) arg1.method67(12021);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field4294[var9] = (short) class81.method769(var15, var14 << 8);
        }
        int var10 = (var7 << class439.field6699) + class459.field6867;
        int var11 = class63.field819 == null ? class444.field6749[class65.method702(-97, arg1.method67(12021)) & 0xFFFF] : class63.field819[arg1.method67(12021)];
        int var12 = arg1.method70(-9059);
        this.field4304 = var12 & 0xE0 << 3;
        this.field4292 = var12 & 0x1F;
        if (this.field4292 != 31) {
            this.method1868(3);
        }
        this.method1872(var4, var11, var6, var5, false, arg0, var10);
    }
}
