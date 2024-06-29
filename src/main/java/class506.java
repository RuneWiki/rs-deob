import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class506 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field7160;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Z")
    public boolean field7163;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Z")
    public boolean field7166;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[S")
    public short[] field7158;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field7155;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    private int field7169;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    private int field7156;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field7157;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field7164;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field7168;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lrc;")
    public class498 field7165;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIZ)V")
    public final void method2913(boolean arg0, int arg1, boolean arg2) {
        field7154++;
        if (!arg2) {
            this.method2916(43, 41, -58, null, 122, -106, true);
        }
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field7156 * arg1 / 50 + this.field7169 & 0x7FF;
            int var5 = this.field7168;
            if (var5 == 1) {
                var6 = (class189.field2719[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class169.field2429[var4] >> 1;
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
        this.field7165.method771((byte) 57, (float) (this.field7157 + (this.field7164 * var6 >> 11)) / 2048.0F);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZII)V")
    public final void method2914(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7161++;
        this.field7168 = arg0;
        if (arg2) {
            this.method2913(false, 103, false);
        }
        this.field7156 = arg1;
        this.field7164 = arg4;
        this.field7157 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    private final void method2915(boolean arg0) {
        int var2 = this.field7155;
        if (var2 == 2) {
            this.field7157 = 0;
            this.field7168 = 1;
            this.field7156 = 2048;
            this.field7164 = 2048;
        } else if (var2 == 3) {
            this.field7157 = 0;
            this.field7164 = 2048;
            this.field7156 = 4096;
            this.field7168 = 1;
        } else if (var2 == 4) {
            this.field7164 = 2048;
            this.field7157 = 0;
            this.field7168 = 4;
            this.field7156 = 2048;
        } else if (var2 == 5) {
            this.field7156 = 8192;
            this.field7164 = 2048;
            this.field7168 = 4;
            this.field7157 = 0;
        } else if (var2 == 12) {
            this.field7157 = 0;
            this.field7164 = 2048;
            this.field7168 = 2;
            this.field7156 = 2048;
        } else if (var2 == 13) {
            this.field7157 = 0;
            this.field7156 = 8192;
            this.field7164 = 2048;
            this.field7168 = 2;
        } else if (var2 == 10) {
            this.field7168 = 3;
            this.field7157 = 1536;
            this.field7156 = 2048;
            this.field7164 = 512;
        } else if (var2 == 11) {
            this.field7168 = 3;
            this.field7156 = 4096;
            this.field7164 = 512;
            this.field7157 = 1536;
        } else if (var2 == 6) {
            this.field7164 = 768;
            this.field7168 = 3;
            this.field7157 = 1280;
            this.field7156 = 2048;
        } else if (var2 == 7) {
            this.field7156 = 4096;
            this.field7157 = 1280;
            this.field7168 = 3;
            this.field7164 = 768;
        } else if (var2 == 8) {
            this.field7157 = 1024;
            this.field7164 = 1024;
            this.field7156 = 2048;
            this.field7168 = 3;
        } else if (var2 == 9) {
            this.field7164 = 1024;
            this.field7157 = 1024;
            this.field7168 = 3;
            this.field7156 = 4096;
        } else if (var2 == 14) {
            this.field7164 = 768;
            this.field7156 = 2048;
            this.field7168 = 1;
            this.field7157 = 1280;
        } else if (var2 == 15) {
            this.field7157 = 1536;
            this.field7164 = 512;
            this.field7168 = 1;
            this.field7156 = 4096;
        } else if (var2 == 16) {
            this.field7156 = 8192;
            this.field7157 = 1792;
            this.field7164 = 256;
            this.field7168 = 1;
        } else {
            this.field7157 = 0;
            this.field7164 = 2048;
            this.field7168 = 0;
            this.field7156 = 2048;
        }
        if (arg0) {
            field7167++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILr;IIZ)V")
    private final void method2916(int arg0, int arg1, int arg2, class166 arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            this.field7165 = arg3.method181(arg0, arg1, arg5, arg2, arg4, 1.0F);
            field7159++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    protected class506() {
        if (class169.field2429 == null) {
            class420.method2522(519);
        }
        this.method2915(true);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lr;Lmo;I)V")
    public class506(class166 arg0, class695 arg1, int arg2) {
        if (class169.field2429 == null) {
            class420.method2522(519);
        }
        this.field7160 = arg1.method3826(false);
        this.field7163 = (this.field7160 & 0x8) != 0;
        this.field7166 = (this.field7160 & 0x10) != 0;
        this.field7160 &= 0x7;
        int var4 = arg1.method3847((byte) 118) << arg2;
        int var5 = arg1.method3847((byte) 118) << arg2;
        int var6 = arg1.method3847((byte) 118) << arg2;
        int var7 = arg1.method3826(false);
        int var8 = var7 * 2 + 1;
        this.field7158 = new short[var8];
        for (int var9 = 0; var9 < this.field7158.length; var9++) {
            short var13 = (short) arg1.method3847((byte) 118);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field7158[var9] = (short) class486.method2826(var15, var14 << 8);
        }
        int var10 = (var7 << class310.field4593) + class683.field9623;
        int var11 = class437.field6386 == null ? class689.field9703[class373.method2250((byte) 75, arg1.method3847((byte) 118)) & 0xFFFF] : class437.field6386[arg1.method3847((byte) 118)];
        int var12 = arg1.method3826(false);
        this.field7155 = var12 & 0x1F;
        this.field7169 = var12 & 0xE0 << 3;
        if (this.field7155 != 31) {
            this.method2915(true);
        }
        this.method2916(var4, var6, var10, arg0, var11, var5, false);
    }
}
