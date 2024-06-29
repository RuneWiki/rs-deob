import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Z")
    public boolean field4690;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Z")
    public boolean field4694;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[S")
    public short[] field4684;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lfg;")
    public static class83 field4687 = new class83("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4697 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private int field4679;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    private int field4685;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lpe;")
    public class432 field4681;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILqa;IIII)V")
    private final void method1891(int arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4686++;
        this.field4681 = arg2.method455(arg4, arg3, arg6, arg0, arg1, 1.0F);
        int var8 = -103 / ((-arg5 - 42) / 56);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I")
    public static final int method1892(int arg0, byte arg1, int arg2) {
        if (arg1 <= 53) {
            field4697 = 106;
        }
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field4698++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    private final void method1893(int arg0) {
        int var2 = this.field4696;
        if (var2 == 2) {
            this.field4679 = 0;
            this.field4685 = 2048;
            this.field4680 = 2048;
            this.field4692 = 1;
        } else if (var2 == 3) {
            this.field4680 = 4096;
            this.field4692 = 1;
            this.field4679 = 0;
            this.field4685 = 2048;
        } else if (var2 == 4) {
            this.field4685 = 2048;
            this.field4692 = 4;
            this.field4680 = 2048;
            this.field4679 = 0;
        } else if (var2 == 5) {
            this.field4680 = 8192;
            this.field4679 = 0;
            this.field4692 = 4;
            this.field4685 = 2048;
        } else if (var2 == 12) {
            this.field4680 = 2048;
            this.field4692 = 2;
            this.field4685 = 2048;
            this.field4679 = 0;
        } else if (var2 == 13) {
            this.field4685 = 2048;
            this.field4679 = 0;
            this.field4680 = 8192;
            this.field4692 = 2;
        } else if (var2 == 10) {
            this.field4680 = 2048;
            this.field4685 = 512;
            this.field4692 = 3;
            this.field4679 = 1536;
        } else if (var2 == 11) {
            this.field4679 = 1536;
            this.field4692 = 3;
            this.field4685 = 512;
            this.field4680 = 4096;
        } else if (var2 == 6) {
            this.field4685 = 768;
            this.field4692 = 3;
            this.field4679 = 1280;
            this.field4680 = 2048;
        } else if (var2 == 7) {
            this.field4692 = 3;
            this.field4685 = 768;
            this.field4679 = 1280;
            this.field4680 = 4096;
        } else if (var2 == 8) {
            this.field4692 = 3;
            this.field4679 = 1024;
            this.field4680 = 2048;
            this.field4685 = 1024;
        } else if (var2 == 9) {
            this.field4680 = 4096;
            this.field4679 = 1024;
            this.field4692 = 3;
            this.field4685 = 1024;
        } else if (var2 == 14) {
            this.field4685 = 768;
            this.field4692 = 1;
            this.field4680 = 2048;
            this.field4679 = 1280;
        } else if (var2 == 15) {
            this.field4679 = 1536;
            this.field4680 = 4096;
            this.field4685 = 512;
            this.field4692 = 1;
        } else if (var2 == 16) {
            this.field4685 = 256;
            this.field4692 = 1;
            this.field4680 = 8192;
            this.field4679 = 1792;
        } else {
            this.field4680 = 2048;
            this.field4679 = 0;
            this.field4685 = 2048;
            this.field4692 = 0;
        }
        if (arg0 != -5) {
            this.field4683 = -127;
        }
        field4689++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIB)V")
    public final void method1894(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4679 = arg2;
        if (arg4 < 28) {
            this.field4682 = -4;
        }
        this.field4692 = arg3;
        this.field4680 = arg0;
        this.field4685 = arg1;
        field4695++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIII)V")
    public static final void method1895(boolean arg0, int arg1, int arg2, int arg3) {
        field4693++;
        if (!arg0) {
            field4697 = -34;
        }
        class163 var4 = class271.method1546(arg2, 11, arg0);
        var4.method1017(0);
        var4.field2332 = arg1;
        var4.field2328 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method1896(byte arg0) {
        field4687 = null;
        if (arg0 != 110) {
            method1895(false, -78, 7, -125);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        class370.field5198 = arg0;
        field4691++;
        class260.field3585.method3076((byte) -89);
        class260.field3585.method3070(class284.field3822, (byte) -122);
        class370.field5198++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIZ)V")
    public final void method1898(boolean arg0, int arg1, boolean arg2) {
        field4688++;
        if (arg2) {
            return;
        }
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field4680 * arg1 / 50 + this.field4682 & 0x7FF;
            int var5 = this.field4692;
            if (var5 == 1) {
                var6 = (class377.field5316[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class378.field5320[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field4681.method1080((byte) -91, (float) ((this.field4685 * var6 >> 11) + this.field4679) / 2048.0F);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    protected class340() {
        if (class378.field5320 == null) {
            class420.method2512(false);
        }
        this.method1893(-5);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lqa;Llh;I)V")
    public class340(class162 arg0, class365 arg1, int arg2) {
        if (class378.field5320 == null) {
            class420.method2512(false);
        }
        this.field4683 = arg1.method2099(255);
        this.field4690 = (this.field4683 & 0x8) != 0;
        this.field4694 = (this.field4683 & 0x10) != 0;
        this.field4683 &= 0x7;
        int var4 = arg1.method2062((byte) 14) << arg2;
        int var5 = arg1.method2062((byte) 14) << arg2;
        int var6 = arg1.method2062((byte) 14) << arg2;
        int var7 = arg1.method2099(255);
        int var8 = var7 * 2 + 1;
        this.field4684 = new short[var8];
        for (int var9 = 0; var9 < this.field4684.length; var9++) {
            short var13 = (short) arg1.method2062((byte) 14);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field4684[var9] = (short) class25.method183(var15, var14 << 8);
        }
        int var10 = (var7 << class34.field484) + class77.field1110;
        int var11 = class437.field6373 == null ? class455.field6653[class384.method2206(true, arg1.method2062((byte) 14)) & 0xFFFF] : class437.field6373[arg1.method2062((byte) 14)];
        int var12 = arg1.method2099(255);
        this.field4696 = var12 & 0x1F;
        this.field4682 = var12 & 0xE0 << 3;
        if (this.field4696 != 31) {
            this.method1893(-5);
        }
        this.method1891(var10, var11, arg0, var6, var4, -108, var5);
    }
}
