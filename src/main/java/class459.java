import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
    public boolean field6868;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
    public boolean field6870;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "[S")
    public short[] field6869;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field6874;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    private int field6878;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lrn;")
    public static class174 field6875 = new class174(37, 3);

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field6880 = 328;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field6867;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field6872;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lfk;")
    public class462 field6877;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 3)
    public static void method2731(int arg0) {
        if (arg0 != 2048) {
            method2734((byte) -69);
        }
        field6875 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIII)V", line = 15)
    public final void method2732(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -14) {
            field6875 = null;
        }
        this.field6881 = arg0;
        field6882++;
        this.field6872 = arg4;
        this.field6883 = arg3;
        this.field6867 = arg2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII)V", line = 33)
    public final void method2733(boolean arg0, int arg1, int arg2) {
        field6876++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field6872 * arg1 / 50 + this.field6878 & 0x7FF;
            int var6 = this.field6881;
            if (var6 == 1) {
                var4 = (class528.field7783[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class89.field1554[var5] >> 1;
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
        this.field6877.method1411((float) ((this.field6867 * var4 >> 11) + this.field6883) / 2048.0F, true);
        if (arg2 != 7201) {
            field6875 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 110)
    public static final void method2734(byte arg0) {
        field6866++;
        if (class281.field4023 == 10 || class281.field4023 == 28) {
            class164.method1210(class405.field6075 >> 10, 5000, -17838, class40.field732 >> 10);
        } else {
            int var1 = class139.field2224.field7692[0] >> 3;
            int var2 = class139.field2224.field7694[0] >> 3;
            if (var1 >= 0 && class33.field662 >> 3 > var1 && var2 >= 0 && (class121.field1966 >> 3) > var2) {
                class164.method1210(var2, 5000, -17838, var1);
            } else {
                class164.method1210(class121.field1966 >> 4, 0, -17838, class33.field662 >> 4);
            }
        }
        class474.method2842(65280);
        class303.method1942((byte) -119);
        class261.method1691((byte) 29);
        class163.method1207(-16886);
        if (arg0 > -107) {
            method2731(124);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 157)
    private final void method2735(boolean arg0) {
        field6873++;
        int var2 = this.field6874;
        if (var2 == 2) {
            this.field6881 = 1;
            this.field6872 = 2048;
            this.field6867 = 2048;
            this.field6883 = 0;
        } else if (var2 == 3) {
            this.field6883 = 0;
            this.field6872 = 4096;
            this.field6867 = 2048;
            this.field6881 = 1;
        } else if (var2 == 4) {
            this.field6883 = 0;
            this.field6872 = 2048;
            this.field6867 = 2048;
            this.field6881 = 4;
        } else if (var2 == 5) {
            this.field6883 = 0;
            this.field6881 = 4;
            this.field6872 = 8192;
            this.field6867 = 2048;
        } else if (var2 == 12) {
            this.field6872 = 2048;
            this.field6867 = 2048;
            this.field6881 = 2;
            this.field6883 = 0;
        } else if (var2 == 13) {
            this.field6867 = 2048;
            this.field6883 = 0;
            this.field6881 = 2;
            this.field6872 = 8192;
        } else if (var2 == 10) {
            this.field6867 = 512;
            this.field6872 = 2048;
            this.field6883 = 1536;
            this.field6881 = 3;
        } else if (var2 == 11) {
            this.field6867 = 512;
            this.field6883 = 1536;
            this.field6881 = 3;
            this.field6872 = 4096;
        } else if (var2 == 6) {
            this.field6881 = 3;
            this.field6867 = 768;
            this.field6872 = 2048;
            this.field6883 = 1280;
        } else if (var2 == 7) {
            this.field6881 = 3;
            this.field6867 = 768;
            this.field6872 = 4096;
            this.field6883 = 1280;
        } else if (var2 == 8) {
            this.field6867 = 1024;
            this.field6881 = 3;
            this.field6872 = 2048;
            this.field6883 = 1024;
        } else if (var2 == 9) {
            this.field6881 = 3;
            this.field6883 = 1024;
            this.field6867 = 1024;
            this.field6872 = 4096;
        } else if (var2 == 14) {
            this.field6867 = 768;
            this.field6881 = 1;
            this.field6872 = 2048;
            this.field6883 = 1280;
        } else if (var2 == 15) {
            this.field6881 = 1;
            this.field6867 = 512;
            this.field6883 = 1536;
            this.field6872 = 4096;
        } else if (var2 == 16) {
            this.field6881 = 1;
            this.field6867 = 256;
            this.field6872 = 8192;
            this.field6883 = 1792;
        } else {
            this.field6881 = 0;
            this.field6883 = 0;
            this.field6872 = 2048;
            this.field6867 = 2048;
        }
        if (!arg0) {
            method2731(-62);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILqa;IIII)V", line = 361)
    private final void method2736(int arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6877 = arg2.method267(arg4, arg3, arg0, arg6, arg1, 1.0F);
        field6879++;
        if (arg5 != 1367) {
            this.field6881 = 58;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 373)
    protected class459() {
        if (class89.field1554 == null) {
            class283.method1805(-411739327);
        }
        this.method2735(true);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lqa;Lcu;I)V", line = 383)
    public class459(class162 arg0, class145 arg1, int arg2) {
        if (class89.field1554 == null) {
            class283.method1805(-411739327);
        }
        this.field6871 = arg1.method1063((byte) -40);
        this.field6868 = (this.field6871 & 0x8) != 0;
        this.field6870 = (this.field6871 & 0x10) != 0;
        this.field6871 &= 0x7;
        int var4 = arg1.method1069((byte) -114) << arg2;
        int var5 = arg1.method1069((byte) -8) << arg2;
        int var6 = arg1.method1069((byte) -119) << arg2;
        int var7 = arg1.method1063((byte) 109);
        int var8 = var7 * 2 + 1;
        this.field6869 = new short[var8];
        for (int var9 = 0; var9 < this.field6869.length; var9++) {
            short var13 = (short) arg1.method1069((byte) -65);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field6869[var9] = (short) class121.method909(var14 << 8, var15);
        }
        int var10 = (var7 << class426.field6345) + class130.field2075;
        int var11 = class441.field6587 == null ? class168.field2605[class37.method385(arg1.method1069((byte) -53), false) & 0xFFFF] : class441.field6587[arg1.method1069((byte) -21)];
        int var12 = arg1.method1063((byte) -107);
        this.field6874 = var12 & 0x1F;
        this.field6878 = var12 & 0xE0 << 3;
        if (this.field6874 != 31) {
            this.method2735(true);
        }
        this.method2736(var5, var11, arg0, var6, var4, 1367, var10);
    }
}
