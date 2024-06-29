import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class65 extends class127 {

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field1531 = 127;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    public static int[] field1538 = new int[500];

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lkc;")
    public static class67 field1540 = class19.method144("Ladevorgang )2 bitte warten Sie)3", 87);

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[I")
    public static int[] field1530 = new int[32768];

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "[[[I")
    public static int[][][] field1537 = new int[4][13][13];

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V", line = 7)
    public static final void method498(byte arg0) {
        field1523++;
        if (arg0 != 72) {
            method503(-19, (byte) -91, null);
        }
        try {
            Graphics var1 = class129.field3020.getGraphics();
            class135.field3228.method162(-1, 17, var1, 357);
        } catch (Exception var2) {
            class129.field3020.repaint();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZJ)V", line = 24)
    public final void method499(int arg0, boolean arg1, long arg2) {
        field1527++;
        class67.field1590 = arg0;
        for (int var5 = 0; var5 < 16; var5++) {
            class102.field2289[var5] = 12800;
        }
        if (arg1) {
            field1538 = null;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method507(var6);
            this.method446(var6 + 176, 7, var7 >> 7, arg2);
            this.method446(var6 + 176, 39, var7 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLac;Lac;B)V", line = 55)
    public static final void method500(boolean arg0, class4 arg1, class4 arg2, byte arg3) {
        if (arg3 >= -7) {
            field1538 = null;
        }
        class122.field2883 = arg0;
        field1525++;
        class59.field1406 = arg2;
        class140.field3342 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdf;II)V", line = 73)
    public static final void method501(int arg0, int arg1, class28 arg2, int arg3, int arg4) {
        field1539++;
        class25.field548.method939((byte) -53);
        class12.field261.method20(0, 0);
        arg2.method230(class66.field1559, 55, 28, 16777215, true);
        if (arg3 == 0) {
            arg2.method230(class131.field3077, 55, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg2.method230(class78.field1857, 55, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg2.method230(class61.field1440, 55, 41, 16711680, true);
        }
        if (arg3 == 3) {
            arg2.method230(class60.field1425, 55, 41, 65535, true);
        }
        arg2.method230(class135.field3235, 184, 28, 16777215, true);
        if (~arg4 == arg0) {
            arg2.method230(class131.field3077, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg2.method230(class78.field1857, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg2.method230(class61.field1440, 184, 41, 16711680, true);
        }
        arg2.method230(class18.field357, 324, 28, 16777215, true);
        if (arg1 == 0) {
            arg2.method230(class131.field3077, 324, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg2.method230(class78.field1857, 324, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg2.method230(class61.field1440, 324, 41, 16711680, true);
        }
        arg2.method238(class25.field547, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class129.field3020.getGraphics();
            class25.field548.method162(-1, 0, var5, 453);
        } catch (Exception var6) {
            class129.field3020.repaint();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIJI)V", line = 129)
    public final void method502(int arg0, int arg1, long arg2, int arg3) {
        int var6 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg3 * 5.0E-4D) + 0.5D);
        if (class67.field1590 != var6) {
            class67.field1590 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method507(var7);
                this.method446(var7 + 176, 7, var8 >> 7, arg2);
                this.method446(var7 + 176, 39, var8 & 0x7F, arg2);
            }
        }
        field1524++;
        if (arg1 != 193654407) {
            method503(-108, (byte) 84, null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLje;)V", line = 165)
    public static final void method503(int arg0, byte arg1, class63 arg2) {
        field1529++;
        if (class97.field2206 != null) {
            class97.field2206.field3347 = arg0 * 4 + 5;
            int var3 = class97.field2206.method1118(4);
            arg2.method484((byte) 82, var3);
        } else if (arg1 == 4) {
            class7.method70(255, (byte) 0, true, 255, true, null, 0);
            class115.field2715[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 196)
    public static final void method504(int arg0) {
        int var1 = 31 / ((arg0 + 35) / 41);
        field1534++;
        if (class52.field1280 == null) {
            return;
        }
        class134.method1036(0);
        if (class48.field1163 > 0) {
            class52.field1280.method447(256, false);
            class48.field1163 = 0;
        }
        class52.field1280.method452(0);
        class52.field1280 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 218)
    public static int method505(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V", line = 226)
    public static final void method506(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
        field1532++;
        if (arg0 != 26) {
            method498((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I", line = 241)
    private static final int method507(int arg0) {
        int var1 = class102.field2289[arg0];
        int var2 = (class67.field1590 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIJ)Z", line = 259)
    public final boolean method508(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class112.field2595[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class112.field2595[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class112.field2595[arg1] = var7 | var6;
            } else {
                this.method446(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method446(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class102.field2289[var8] = 12800;
                int var9 = method507(var8);
                this.method446(arg0, 7, var9 >> 7, arg3);
                this.method446(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class102.field2289[var10] = (arg2 << 7) + (class102.field2289[var10] & 0x7F);
                } else {
                    class102.field2289[var10] = (class102.field2289[var10] & 0x3F80) + arg2;
                }
                int var11 = method507(var10);
                this.method446(arg0, 7, var11 >> 7, arg3);
                this.method446(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V", line = 331)
    public static void method509(byte arg0) {
        field1538 = null;
        if (arg0 >= -107) {
            field1536 = 13;
        }
        field1540 = null;
        field1537 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V", line = 344)
    public final void method510(long arg0, byte arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class112.field2595[var4];
            class112.field2595[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method446(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method446(var5 + 176, 123, 0, arg0);
        }
        field1528++;
        for (int var6 = 0; var6 < 16; var6++) {
            this.method446(var6 + 176, 120, 0, arg0);
        }
        if (arg1 != -123) {
            field1531 = -125;
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method446(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method446(var8 + 176, 0, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method446(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method446(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIJ)V")
    public abstract void method446(int arg0, int arg1, int arg2, long arg3);
}
