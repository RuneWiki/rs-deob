import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class682 {

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field9665;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
    public boolean field9674;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Z")
    public boolean field9655;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
    public short[] field9663;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field9660;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    private int field9672;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[I")
    public static int[] field9668 = new int[14];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public static int[] field9656 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    private int field9657;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    private int field9666;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    private int field9671;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    private int field9675;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lff;")
    public class9 field9658;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method3830(boolean arg0, int arg1, Object arg2) {
        int var3 = -98 / ((arg1 + 81) / 41);
        field9669++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return arg0 ? class282.method1863(var4, -31830) : var4;
        } else if (arg2 instanceof class560) {
            class560 var5 = (class560) arg2;
            return var5.method1461(-1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZBI)V")
    public final void method3831(boolean arg0, byte arg1, int arg2) {
        field9659++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field9675 * arg2 / 50 + this.field9672 & 0x7FF;
            int var6 = this.field9666;
            if (var6 == 1) {
                var4 = (class509.field7210[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class438.field6315[var5] >> 1;
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
        if (arg1 >= -27) {
            this.field9675 = -95;
        }
        this.field9658.method268((float) ((this.field9657 * var4 >> 11) + this.field9671) / 2048.0F, (byte) -102);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILr;III)V")
    private final void method3832(int arg0, int arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6) {
        this.field9658 = arg3.method139(arg5, arg4, arg2, arg6, arg0, 1.0F);
        if (arg1 != 10457) {
            this.field9663 = null;
        }
        field9661++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method3833(int arg0) {
        field9656 = null;
        if (arg0 != -2) {
            field9673 = 78;
        }
        field9668 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method3834(byte arg0) {
        field9664++;
        class156.field2667 = new class545[class38.field1055.method2245(0)][];
        class91.field1668 = new class545[class38.field1055.method2245(0)][];
        class553.field7840 = new boolean[class38.field1055.method2245(0)];
        int var1 = 94 % ((-arg0 - 22) / 42);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    private final void method3835(byte arg0) {
        int var2 = this.field9660;
        if (var2 == 2) {
            this.field9666 = 1;
            this.field9657 = 2048;
            this.field9671 = 0;
            this.field9675 = 2048;
        } else if (var2 == 3) {
            this.field9671 = 0;
            this.field9675 = 4096;
            this.field9666 = 1;
            this.field9657 = 2048;
        } else if (var2 == 4) {
            this.field9657 = 2048;
            this.field9675 = 2048;
            this.field9666 = 4;
            this.field9671 = 0;
        } else if (var2 == 5) {
            this.field9675 = 8192;
            this.field9666 = 4;
            this.field9671 = 0;
            this.field9657 = 2048;
        } else if (var2 == 12) {
            this.field9666 = 2;
            this.field9657 = 2048;
            this.field9675 = 2048;
            this.field9671 = 0;
        } else if (var2 == 13) {
            this.field9675 = 8192;
            this.field9671 = 0;
            this.field9666 = 2;
            this.field9657 = 2048;
        } else if (var2 == 10) {
            this.field9671 = 1536;
            this.field9657 = 512;
            this.field9675 = 2048;
            this.field9666 = 3;
        } else if (var2 == 11) {
            this.field9666 = 3;
            this.field9657 = 512;
            this.field9675 = 4096;
            this.field9671 = 1536;
        } else if (var2 == 6) {
            this.field9675 = 2048;
            this.field9657 = 768;
            this.field9666 = 3;
            this.field9671 = 1280;
        } else if (var2 == 7) {
            this.field9657 = 768;
            this.field9666 = 3;
            this.field9671 = 1280;
            this.field9675 = 4096;
        } else if (var2 == 8) {
            this.field9671 = 1024;
            this.field9657 = 1024;
            this.field9675 = 2048;
            this.field9666 = 3;
        } else if (var2 == 9) {
            this.field9675 = 4096;
            this.field9671 = 1024;
            this.field9666 = 3;
            this.field9657 = 1024;
        } else if (var2 == 14) {
            this.field9657 = 768;
            this.field9675 = 2048;
            this.field9671 = 1280;
            this.field9666 = 1;
        } else if (var2 == 15) {
            this.field9675 = 4096;
            this.field9657 = 512;
            this.field9671 = 1536;
            this.field9666 = 1;
        } else if (var2 == 16) {
            this.field9657 = 256;
            this.field9675 = 8192;
            this.field9671 = 1792;
            this.field9666 = 1;
        } else {
            this.field9657 = 2048;
            this.field9671 = 0;
            this.field9675 = 2048;
            this.field9666 = 0;
        }
        field9662++;
        if (arg0 != 23) {
            this.method3832(-91, 56, 123, null, 49, -29, -56);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
    public static final boolean method3836(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            method3834((byte) -122);
        }
        field9670++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBII)V")
    public final void method3837(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 12) {
            return;
        }
        field9667++;
        this.field9675 = arg0;
        this.field9671 = arg3;
        this.field9666 = arg1;
        this.field9657 = arg4;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    protected class682() {
        if (class438.field6315 == null) {
            class675.method3800(false);
        }
        this.method3835((byte) 23);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lr;Lqh;I)V")
    public class682(class167 arg0, class61 arg1, int arg2) {
        if (class438.field6315 == null) {
            class675.method3800(false);
        }
        this.field9665 = arg1.method732(-559537960);
        this.field9674 = (this.field9665 & 0x8) != 0;
        this.field9655 = (this.field9665 & 0x10) != 0;
        this.field9665 &= 0x7;
        int var4 = arg1.method723((byte) -25) << arg2;
        int var5 = arg1.method723((byte) -25) << arg2;
        int var6 = arg1.method723((byte) -25) << arg2;
        int var7 = arg1.method732(-559537960);
        int var8 = var7 * 2 + 1;
        this.field9663 = new short[var8];
        for (int var9 = 0; var9 < this.field9663.length; var9++) {
            short var13 = (short) arg1.method723((byte) -25);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field9663[var9] = (short) class2.method189(var15, var14 << 8);
        }
        int var10 = (var7 << class30.field940) + class271.field4068;
        int var11 = class492.field7038 == null ? class410.field5946[class414.method2528((byte) 123, arg1.method723((byte) -25)) & 0xFFFF] : class492.field7038[arg1.method723((byte) -25)];
        int var12 = arg1.method732(-559537960);
        this.field9660 = var12 & 0x1F;
        this.field9672 = var12 & 0xE0 << 3;
        if (this.field9660 != 31) {
            this.method3835((byte) 23);
        }
        this.method3832(var11, 10457, var5, arg0, var6, var4, var10);
    }
}
