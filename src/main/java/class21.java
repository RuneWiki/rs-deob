import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field223 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field226 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field228 = -1;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Z")
    public boolean field243 = true;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int field218 = 0;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public int field238 = -1;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field234 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field219 = -1;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field222 = -1;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[I")
    public int[] field249 = null;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field233 = -1;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field242 = -1;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field225 = -1;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field235 = -1;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public int field251 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field236 = -1;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field232 = -1;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field231 = 0;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field220 = -1;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public int field255 = -1;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public int field248 = -1;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public int field250 = -1;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public int field258 = -1;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public int field257 = -1;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public int field259 = -1;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public int field263 = -1;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field241 = -1;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public int field254 = 0;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public int field260 = -1;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public int field253 = -1;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public int field264 = 0;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public int field245 = 0;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public int field265 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field229 = -1;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public int field247 = -1;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public int field262 = 0;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public int field266 = -1;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field230 = -1;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[I")
    public int[] field256 = null;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public int field268 = 0;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Luf;")
    public static class310 field244 = new class310(9, 6);

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[I")
    public int[] field239;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "[[I")
    public int[][] field246;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    public final int method150(int arg0) {
        field224++;
        if (this.field255 != -1) {
            return this.field255;
        } else if (this.field249 == null) {
            if (arg0 < 112) {
                this.method150(-125);
            }
            return -1;
        } else {
            int var2 = (int) (Math.random() * (double) this.field218);
            int var3;
            for (var3 = 0; this.field256[var3] <= var2; var3++) {
                var2 -= this.field256[var3];
            }
            return this.field249[var3];
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLlh;)V")
    public final void method151(byte arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                field261++;
                if (arg0 > -70) {
                    method152(-13, -29, null, 0, null);
                    return;
                }
                return;
            }
            this.method153(-3325, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[II[I)V")
    public static final void method152(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg1 >= -127) {
            return;
        }
        field237++;
        if (arg3 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg0;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg0; var10 < arg3; var10++) {
            if (((var10 & var9) + var7) > arg2[var10]) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                int var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var8;
        method152(arg0, -128, arg2, var6 - 1, arg4);
        method152(var6 + 1, -128, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILlh;I)V")
    private final void method153(int arg0, class365 arg1, int arg2) {
        if (arg2 == 1) {
            this.field255 = arg1.method2062((byte) 14);
            this.field235 = arg1.method2062((byte) 14);
            if (this.field235 == 65535) {
                this.field235 = -1;
            }
            if (this.field255 == 65535) {
                this.field255 = -1;
            }
        } else if (arg2 == 2) {
            this.field259 = arg1.method2062((byte) 14);
        } else if (arg2 == 3) {
            this.field263 = arg1.method2062((byte) 14);
        } else if (arg2 == 4) {
            this.field222 = arg1.method2062((byte) 14);
        } else if (arg2 == 5) {
            this.field225 = arg1.method2062((byte) 14);
        } else if (arg2 == 6) {
            this.field257 = arg1.method2062((byte) 14);
        } else if (arg2 == 7) {
            this.field236 = arg1.method2062((byte) 14);
        } else if (arg2 == 8) {
            this.field260 = arg1.method2062((byte) 14);
        } else if (arg2 == 9) {
            this.field232 = arg1.method2062((byte) 14);
        } else if (arg2 == 26) {
            this.field254 = (short) (arg1.method2099(255) * 4);
            this.field221 = (short) (arg1.method2099(arg0 + 3580) * 4);
        } else if (arg2 == 27) {
            if (this.field246 == null) {
                this.field246 = new int[12][];
            }
            int var4 = arg1.method2099(arg0 ^ 0xFFFFF3FC);
            this.field246[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field246[var4][var5] = arg1.method2069(class63.method396(arg0, 3210));
            }
        } else if (arg2 == 28) {
            this.field239 = new int[12];
            for (int var6 = 0; var6 < 12; var6++) {
                this.field239[var6] = arg1.method2099(255);
                if (this.field239[var6] == 255) {
                    this.field239[var6] = -1;
                }
            }
        } else if (arg2 == 29) {
            this.field251 = arg1.method2099(255);
        } else if (arg2 == 30) {
            this.field226 = arg1.method2062((byte) 14);
        } else if (arg2 == 31) {
            this.field231 = arg1.method2099(255);
        } else if (arg2 == 32) {
            this.field245 = arg1.method2062((byte) 14);
        } else if (arg2 == 33) {
            this.field234 = arg1.method2069(-127);
        } else if (arg2 == 34) {
            this.field265 = arg1.method2099(255);
        } else if (arg2 == 35) {
            this.field264 = arg1.method2062((byte) 14);
        } else if (arg2 == 36) {
            this.field268 = arg1.method2069(arg0 ^ 0xC82);
        } else if (arg2 == 37) {
            this.field219 = arg1.method2099(255);
        } else if (arg2 == 38) {
            this.field233 = arg1.method2062((byte) 14);
        } else if (arg2 == 39) {
            this.field228 = arg1.method2062((byte) 14);
        } else if (arg2 == 40) {
            this.field241 = arg1.method2062((byte) 14);
        } else if (arg2 == 41) {
            this.field250 = arg1.method2062((byte) 14);
        } else if (arg2 == 42) {
            this.field220 = arg1.method2062((byte) 14);
        } else if (arg2 == 43) {
            this.field230 = arg1.method2062((byte) 14);
        } else if (arg2 == 44) {
            this.field253 = arg1.method2062((byte) 14);
        } else if (arg2 == 45) {
            this.field258 = arg1.method2062((byte) 14);
        } else if (arg2 == 46) {
            this.field266 = arg1.method2062((byte) 14);
        } else if (arg2 == 47) {
            this.field242 = arg1.method2062((byte) 14);
        } else if (arg2 == 48) {
            this.field247 = arg1.method2062((byte) 14);
        } else if (arg2 == 49) {
            this.field229 = arg1.method2062((byte) 14);
        } else if (arg2 == 50) {
            this.field238 = arg1.method2062((byte) 14);
        } else if (arg2 == 51) {
            this.field248 = arg1.method2062((byte) 14);
        } else if (arg2 == 52) {
            int var7 = arg1.method2099(arg0 + 3580);
            this.field249 = new int[var7];
            this.field256 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field249[var8] = arg1.method2062((byte) 14);
                int var9 = arg1.method2099(255);
                this.field256[var8] = var9;
                this.field218 += var9;
            }
        } else if (arg2 == 53) {
            this.field243 = false;
        } else if (arg2 == 54) {
            this.field223 = arg1.method2099(arg0 ^ 0xFFFFF3FC) << 6;
            this.field262 = arg1.method2099(arg0 ^ 0xFFFFF3FC) << 6;
        }
        field240++;
        if (arg0 != -3325) {
            field267 = -65;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    public final boolean method154(int arg0, int arg1) {
        if (arg1 != -9648) {
            this.field251 = 48;
        }
        field252++;
        if (arg0 == -1) {
            return false;
        } else if (this.field255 == arg0) {
            return true;
        } else {
            if (this.field249 != null) {
                for (int var3 = 0; var3 < this.field249.length; var3++) {
                    if (this.field249[var3] == arg0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method155(byte arg0) {
        if (arg0 != 59) {
            field267 = -60;
        }
        field244 = null;
    }
}
