import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Z")
    public boolean field195;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Z")
    public boolean field187;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[S")
    public short[] field189;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lraa;")
    public class609 field199;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILbu;Z)V")
    public static final void method88(int arg0, class19 arg1, boolean arg2) {
        if (arg0 != 8192) {
            return;
        }
        if (arg1.field205) {
            if (arg1.field218 < 0 || class122.method882(arg1.field210, arg1.field218, -4109)) {
                if (arg2) {
                    class184.method1299(arg1.field211, arg1.field208, true, null, arg1.field212, arg1.field209);
                } else {
                    class548.method3205(arg1.field209, -1, arg1.field211, arg1.field207, arg1.field212, 16329, arg1.field210, arg1.field218, arg1.field208);
                }
                arg1.method1304((byte) 7);
            }
        } else if (arg1.field213 && arg1.field208 >= 1 && arg1.field211 >= 1 && class194.field2946 - 2 >= arg1.field208 && arg1.field211 <= class255.field3656 - 2 && (arg1.field215 < 0 || class122.method882(arg1.field214, arg1.field215, -4109))) {
            if (arg2) {
                class184.method1299(arg1.field211, arg1.field208, true, arg1.field216, arg1.field212, arg1.field209);
            } else {
                class548.method3205(arg1.field209, -1, arg1.field211, arg1.field219, arg1.field212, 16329, arg1.field214, arg1.field215, arg1.field208);
            }
            arg1.field213 = false;
            if (!arg2 && arg1.field218 == arg1.field215 && arg1.field218 == -1) {
                arg1.method1304((byte) 7);
            } else if (!arg2 && arg1.field218 == arg1.field215 && arg1.field219 == arg1.field207 && arg1.field214 == arg1.field210) {
                arg1.method1304((byte) 7);
            }
        }
        field192++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZI)V")
    public final void method89(int arg0, boolean arg1, int arg2) {
        field198++;
        if (arg2 >= -106) {
            this.method89(9, true, 23);
        }
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field188 * arg0 / 50 + this.field193 & 0x7FF;
            int var6 = this.field185;
            if (var6 == 1) {
                var4 = (class373.field5548[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class533.field7667[var5] >> 1;
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
        this.field199.method879((float) ((this.field186 * var4 >> 11) + this.field190) / 2048.0F, -89);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIILha;)V")
    private final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6) {
        if (arg1 < 122) {
            this.method90(-122, 32, -49, 72, 60, -6, null);
        }
        this.field199 = arg6.method443(arg0, arg2, arg5, arg4, arg3, 1.0F);
        field194++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIII)V")
    public final void method91(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field185 = arg4;
        this.field186 = arg2;
        this.field188 = arg1;
        field196++;
        if (!arg0) {
            this.field190 = arg3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    private final void method92(boolean arg0) {
        int var2 = this.field197;
        if (var2 == 2) {
            this.field186 = 2048;
            this.field190 = 0;
            this.field185 = 1;
            this.field188 = 2048;
        } else if (var2 == 3) {
            this.field185 = 1;
            this.field188 = 4096;
            this.field190 = 0;
            this.field186 = 2048;
        } else if (var2 == 4) {
            this.field185 = 4;
            this.field190 = 0;
            this.field188 = 2048;
            this.field186 = 2048;
        } else if (var2 == 5) {
            this.field185 = 4;
            this.field186 = 2048;
            this.field190 = 0;
            this.field188 = 8192;
        } else if (var2 == 12) {
            this.field190 = 0;
            this.field186 = 2048;
            this.field188 = 2048;
            this.field185 = 2;
        } else if (var2 == 13) {
            this.field185 = 2;
            this.field186 = 2048;
            this.field188 = 8192;
            this.field190 = 0;
        } else if (var2 == 10) {
            this.field190 = 1536;
            this.field188 = 2048;
            this.field185 = 3;
            this.field186 = 512;
        } else if (var2 == 11) {
            this.field185 = 3;
            this.field188 = 4096;
            this.field190 = 1536;
            this.field186 = 512;
        } else if (var2 == 6) {
            this.field190 = 1280;
            this.field185 = 3;
            this.field188 = 2048;
            this.field186 = 768;
        } else if (var2 == 7) {
            this.field190 = 1280;
            this.field186 = 768;
            this.field185 = 3;
            this.field188 = 4096;
        } else if (var2 == 8) {
            this.field185 = 3;
            this.field188 = 2048;
            this.field186 = 1024;
            this.field190 = 1024;
        } else if (var2 == 9) {
            this.field190 = 1024;
            this.field185 = 3;
            this.field188 = 4096;
            this.field186 = 1024;
        } else if (var2 == 14) {
            this.field188 = 2048;
            this.field186 = 768;
            this.field185 = 1;
            this.field190 = 1280;
        } else if (var2 == 15) {
            this.field188 = 4096;
            this.field186 = 512;
            this.field185 = 1;
            this.field190 = 1536;
        } else if (var2 == 16) {
            this.field186 = 256;
            this.field190 = 1792;
            this.field188 = 8192;
            this.field185 = 1;
        } else {
            this.field186 = 2048;
            this.field190 = 0;
            this.field185 = 0;
            this.field188 = 2048;
        }
        if (arg0) {
            this.method90(8, 103, -108, 91, 52, 14, null);
        }
        field191++;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    protected class14() {
        if (class533.field7667 == null) {
            class399.method2536(-21685);
        }
        this.method92(false);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lha;Lrg;I)V")
    public class14(class60 arg0, class645 arg1, int arg2) {
        if (class533.field7667 == null) {
            class399.method2536(-21685);
        }
        this.field184 = arg1.method3745(-6314);
        this.field195 = (this.field184 & 0x10) != 0;
        this.field187 = (this.field184 & 0x8) != 0;
        this.field184 &= 0x7;
        int var4 = arg1.method3712((byte) 86) << arg2;
        int var5 = arg1.method3712((byte) -124) << arg2;
        int var6 = arg1.method3712((byte) -127) << arg2;
        int var7 = arg1.method3745(-6314);
        int var8 = var7 * 2 + 1;
        this.field189 = new short[var8];
        for (int var9 = 0; var9 < this.field189.length; var9++) {
            short var13 = (short) arg1.method3712((byte) 8);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field189[var9] = (short) class625.method3600(var15, var14 << 8);
        }
        int var10 = (var7 << class459.field6769) + class631.field8819;
        int var11 = class324.field4632 == null ? class9.field141[class139.method982(arg1.method3712((byte) -115), -16614) & 0xFFFF] : class324.field4632[arg1.method3712((byte) -125)];
        int var12 = arg1.method3745(-6314);
        this.field193 = (var12 & 0xE0) << 3;
        this.field197 = var12 & 0x1F;
        if (this.field197 != 31) {
            this.method92(false);
        }
        this.method90(var4, 124, var6, var11, var10, var5, arg0);
    }
}
