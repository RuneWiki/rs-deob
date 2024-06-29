import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class181 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    public boolean field2776;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
    public boolean field2777;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[S")
    public short[] field2769;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field2770;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lrd;")
    public class344 field2775;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
    public final void method1267(int arg0, int arg1, boolean arg2) {
        if (arg0 <= 41) {
            return;
        }
        field2773++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field2774 + (this.field2766 * arg1 / 50) & 0x7FF;
            int var5 = this.field2772;
            if (var5 == 1) {
                var6 = (class58.field891[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class64.field1002[var4] >> 1;
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
        this.field2775.method836((byte) 72, (float) ((this.field2770 * var6 >> 11) + this.field2763) / 2048.0F);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZILza;II)V")
    private final void method1268(int arg0, int arg1, boolean arg2, int arg3, class299 arg4, int arg5, int arg6) {
        this.field2775 = arg4.method569(arg6, arg3, arg1, arg5, arg0, 1.0F);
        field2767++;
        if (arg2) {
            this.method1267(85, 80, true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1269(boolean arg0, int arg1, int arg2) {
        field2765++;
        return arg0 ? false : (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method1270(byte arg0) {
        if (arg0 != 111) {
            method1270((byte) -116);
        }
        field2778++;
        int var1 = class422.field6205;
        int[] var2 = class506.field7363;
        for (int var3 = 0; var3 < var1; var3++) {
            class511 var4 = class530.field7747[var2[var3]];
            if (var4 != null) {
                class292.method1956(8, var4, var4.method3045(0));
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    private final void method1271(int arg0) {
        field2779++;
        if (arg0 != 4096) {
            return;
        }
        int var2 = this.field2768;
        if (var2 == 2) {
            this.field2763 = 0;
            this.field2766 = 2048;
            this.field2770 = 2048;
            this.field2772 = 1;
        } else if (var2 == 3) {
            this.field2763 = 0;
            this.field2766 = 4096;
            this.field2772 = 1;
            this.field2770 = 2048;
        } else if (var2 == 4) {
            this.field2763 = 0;
            this.field2772 = 4;
            this.field2770 = 2048;
            this.field2766 = 2048;
        } else if (var2 == 5) {
            this.field2763 = 0;
            this.field2766 = 8192;
            this.field2772 = 4;
            this.field2770 = 2048;
        } else if (var2 == 12) {
            this.field2770 = 2048;
            this.field2772 = 2;
            this.field2766 = 2048;
            this.field2763 = 0;
        } else if (var2 == 13) {
            this.field2770 = 2048;
            this.field2766 = 8192;
            this.field2763 = 0;
            this.field2772 = 2;
        } else if (var2 == 10) {
            this.field2763 = 1536;
            this.field2772 = 3;
            this.field2770 = 512;
            this.field2766 = 2048;
        } else if (var2 == 11) {
            this.field2766 = 4096;
            this.field2763 = 1536;
            this.field2772 = 3;
            this.field2770 = 512;
        } else if (var2 == 6) {
            this.field2766 = 2048;
            this.field2763 = 1280;
            this.field2770 = 768;
            this.field2772 = 3;
        } else if (var2 == 7) {
            this.field2763 = 1280;
            this.field2770 = 768;
            this.field2766 = 4096;
            this.field2772 = 3;
        } else if (var2 == 8) {
            this.field2772 = 3;
            this.field2770 = 1024;
            this.field2763 = 1024;
            this.field2766 = 2048;
        } else if (var2 == 9) {
            this.field2766 = 4096;
            this.field2772 = 3;
            this.field2770 = 1024;
            this.field2763 = 1024;
        } else if (var2 == 14) {
            this.field2763 = 1280;
            this.field2766 = 2048;
            this.field2772 = 1;
            this.field2770 = 768;
        } else if (var2 == 15) {
            this.field2772 = 1;
            this.field2770 = 512;
            this.field2766 = 4096;
            this.field2763 = 1536;
        } else if (var2 == 16) {
            this.field2772 = 1;
            this.field2763 = 1792;
            this.field2770 = 256;
            this.field2766 = 8192;
        } else {
            this.field2766 = 2048;
            this.field2763 = 0;
            this.field2772 = 0;
            this.field2770 = 2048;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
    public final void method1272(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 < 34) {
            return;
        }
        this.field2766 = arg4;
        this.field2770 = arg1;
        field2771++;
        this.field2772 = arg0;
        this.field2763 = arg2;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    protected class181() {
        if (class64.field1002 == null) {
            class456.method2792(2048);
        }
        this.method1271(4096);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lza;Lfh;I)V")
    public class181(class299 arg0, class194 arg1, int arg2) {
        if (class64.field1002 == null) {
            class456.method2792(2048);
        }
        this.field2764 = arg1.method1337((byte) -118);
        this.field2776 = (this.field2764 & 0x10) != 0;
        this.field2777 = (this.field2764 & 0x8) != 0;
        this.field2764 &= 0x7;
        int var4 = arg1.method1396(-103) << arg2;
        int var5 = arg1.method1396(111) << arg2;
        int var6 = arg1.method1396(-82) << arg2;
        int var7 = arg1.method1337((byte) 8);
        int var8 = var7 * 2 + 1;
        this.field2769 = new short[var8];
        for (int var9 = 0; var9 < this.field2769.length; var9++) {
            short var13 = (short) arg1.method1396(54);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field2769[var9] = (short) class19.method118(var14 << 8, var15);
        }
        int var10 = (var7 << class295.field4543) + class74.field1258;
        int var11 = class203.field3141 == null ? class471.field6909[class415.method2598((byte) -124, arg1.method1396(-89)) & 0xFFFF] : class203.field3141[arg1.method1396(98)];
        int var12 = arg1.method1337((byte) -122);
        this.field2774 = var12 & 0xE0 << 3;
        this.field2768 = var12 & 0x1F;
        if (this.field2768 != 31) {
            this.method1271(4096);
        }
        this.method1268(var11, var5, false, var6, arg0, var10, var4);
    }
}
