import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class194 {

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
    public boolean field3090 = false;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[I")
    private int[] field3089 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field3095 = -1;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "J")
    public static long field3087 = 0L;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lrm;")
    public static class184 field3088 = new class184(64);

    @OriginalMember(owner = "client!li", name = "r", descriptor = "F")
    public static float field3103;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Luj;")
    public static class169 field3104;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
    private int[] field3105;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[S")
    private short[] field3086;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[S")
    private short[] field3091;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[S")
    private short[] field3092;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[S")
    private short[] field3100;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1433(int arg0) {
        field3096++;
        if (this.field3105 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3105.length; var3++) {
            if (!class20.field310.method1823(this.field3105[var3], 0, (byte) -92)) {
                var2 = false;
            }
        }
        if (arg0 == 405554817) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lvl;B)V", line = 41)
    public final void method1434(class6 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                if (arg1 < 107) {
                    this.field3086 = (short[]) null;
                }
                field3097++;
                return;
            }
            this.method1437(arg0, (byte) 6, var3);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I", line = 59)
    public static final int method1435(int arg0, int arg1) {
        field3101++;
        double var2 = (double) ((arg1 & 0xFF99) >> 8) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF7DB5) >> 16) / 256.0D;
        double var6 = var4;
        if (var2 < var4) {
            var6 = var2;
        }
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = 0.0D;
        double var12 = var4;
        if (var6 > var8) {
            var6 = var8;
        }
        double var14 = 0.0D;
        if (var2 > var4) {
            var12 = var2;
        }
        if (var12 < var8) {
            var12 = var8;
        }
        double var16 = (var6 + var12) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var6 != var12) {
            if (var4 == var12) {
                var14 = (var2 - var8) / (var12 - var6);
            } else if (var2 == var12) {
                var14 = (var8 - var4) / (var12 - var6) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var4 - var2) / (var12 - var6) + 4.0D;
            }
            if (var16 < 0.5D) {
                var10 = (var12 - var6) / (var6 + var12);
            }
            if (var16 >= 0.5D) {
                var10 = (var12 - var6) / (2.0D - var12 - var6);
            }
        }
        int var19 = (int) (var10 * 256.0D);
        double var20 = var14 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (arg0 != -13929) {
            field3103 = -0.37241986F;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        int var22 = (int) (var20 * 256.0D);
        return (var19 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 169)
    public static final void method1436(byte arg0) {
        field3093++;
        class332.field5174.method1359(92);
        if (arg0 < 123) {
            method1439(109);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lvl;BI)V", line = 197)
    private final void method1437(class6 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3095 = arg0.method58(-288140008);
        } else if (arg2 == 2) {
            int var4 = arg0.method58(-288140008);
            this.field3105 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3105[var5] = arg0.method39((byte) 120);
            }
        } else if (arg2 == 3) {
            this.field3090 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method58(-288140008);
            this.field3100 = new short[var6];
            this.field3092 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3100[var7] = (short) arg0.method39((byte) 39);
                this.field3092[var7] = (short) arg0.method39((byte) 29);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method58(arg1 ^ 0xEED3551E);
            this.field3091 = new short[var8];
            this.field3086 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3086[var9] = (short) arg0.method39((byte) 103);
                this.field3091[var9] = (short) arg0.method39((byte) 41);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3089[arg2 - 60] = arg0.method39((byte) 74);
        }
        field3099++;
        if (arg1 != 6) {
            field3103 = -1.2071657F;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lom;", line = 277)
    public final class165 method1438(int arg0) {
        field3094++;
        class165[] var2 = new class165[5];
        int var3 = 0;
        if (arg0 != -2301) {
            field3103 = -1.3704042F;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3089[var4] != -1) {
                var2[var3++] = class165.method1235(class20.field310, this.field3089[var4], 0);
            }
        }
        class165 var5 = new class165(var2, var3);
        if (this.field3100 != null) {
            for (int var6 = 0; var6 < this.field3100.length; var6++) {
                var5.method1229(this.field3100[var6], this.field3092[var6]);
            }
        }
        if (this.field3086 != null) {
            for (int var7 = 0; var7 < this.field3086.length; var7++) {
                var5.method1224(this.field3086[var7], this.field3091[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 335)
    public static void method1439(int arg0) {
        field3104 = null;
        field3088 = null;
        if (arg0 > -127) {
            field3088 = (class184) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z", line = 348)
    public final boolean method1440(boolean arg0) {
        boolean var2 = true;
        field3098++;
        if (arg0) {
            this.method1434((class6) null, (byte) -85);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3089[var3] != -1 && !class20.field310.method1823(this.field3089[var3], 0, (byte) -39)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)Lom;", line = 373)
    public final class165 method1441(boolean arg0) {
        field3102++;
        if (this.field3105 == null) {
            return null;
        } else if (arg0) {
            class165[] var2 = new class165[this.field3105.length];
            for (int var3 = 0; var3 < this.field3105.length; var3++) {
                var2[var3] = class165.method1235(class20.field310, this.field3105[var3], 0);
            }
            class165 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class165(var2, var2.length);
            }
            if (this.field3100 != null) {
                for (int var5 = 0; var5 < this.field3100.length; var5++) {
                    var4.method1229(this.field3100[var5], this.field3092[var5]);
                }
            }
            if (this.field3086 != null) {
                for (int var6 = 0; var6 < this.field3086.length; var6++) {
                    var4.method1224(this.field3086[var6], this.field3091[var6]);
                }
            }
            return var4;
        } else {
            return (class165) null;
        }
    }
}
