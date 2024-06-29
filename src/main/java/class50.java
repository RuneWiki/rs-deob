import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class50 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field957 = 8;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public boolean field959 = true;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Z")
    public boolean field966 = true;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field968 = -1;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field960 = 1190717;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field970 = 16;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field954 = -1;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Z")
    public boolean field972 = false;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field971 = 128;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field973 = 0;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lqd;")
    public static class40 field962 = class147.method1106("; Expires=", (byte) -97);

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[J")
    public static long[] field958 = new long[500];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lcm;")
    public static class185 field953;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lqd;")
    public static class40[] field956;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[[B")
    public static byte[][] field964;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lsd;IB)V", line = 15)
    public final void method436(class26 arg0, int arg1, byte arg2) {
        if (arg2 <= 2) {
            method441(true, (class291) null, -34, -70, (class291) null);
        }
        while (true) {
            int var4 = arg0.method226(255);
            if (var4 == 0) {
                field955++;
                return;
            }
            this.method439(arg0, arg1, var4, -1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILsd;)Lmf;", line = 42)
    public static final class43 method437(int arg0, class26 arg1) {
        field969++;
        return arg0 == -3 ? new class43(arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method201(true), arg1.method244(-26711), arg1.method244(-26711), arg1.method226(255)) : (class43) null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 53)
    public static void method438(int arg0) {
        field956 = null;
        field958 = null;
        field953 = null;
        field962 = null;
        int var1 = 104 / ((arg0 + 12) / 38);
        field964 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lsd;III)V", line = 79)
    private final void method439(class26 arg0, int arg1, int arg2, int arg3) {
        field965++;
        if (arg3 != -1) {
            method442();
        }
        if (arg2 == 1) {
            this.field973 = class195.method1386(arg0.method244(arg3 ^ 0x6856), arg3 ^ 0xFFFFE375);
        } else if (arg2 == 2) {
            this.field954 = arg0.method226(255);
        } else if (arg2 == 3) {
            this.field954 = arg0.method197(-1);
            if (this.field954 == 65535) {
                this.field954 = -1;
            }
        } else if (arg2 == 5) {
            this.field959 = false;
        } else if (arg2 == 7) {
            this.field968 = class195.method1386(arg0.method244(-26711), arg3 + 7307);
        } else if (arg2 == 8) {
            class112.field1947 = arg1;
        } else if (arg2 == 9) {
            this.field971 = arg0.method197(arg3);
        } else if (arg2 == 10) {
            this.field966 = false;
        } else if (arg2 == 11) {
            this.field957 = arg0.method226(255);
        } else if (arg2 == 12) {
            this.field972 = true;
        } else if (arg2 == 13) {
            this.field960 = arg0.method244(-26711);
        } else if (arg2 == 14) {
            this.field970 = arg0.method226(255);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 150)
    public static final void method440(byte arg0) {
        if (arg0 != 81) {
            return;
        }
        field967++;
        if (class29.field618 != null && class163.field2705 != null) {
            return;
        }
        class163.field2705 = new int[256];
        class29.field618 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class29.field618[var1] = (int) (Math.sin(var2) * 4096.0D);
            class163.field2705[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLeg;IILeg;)I", line = 188)
    public static final int method441(boolean arg0, class291 arg1, int arg2, int arg3, class291 arg4) {
        field963++;
        if (arg2 == 1) {
            int var5 = arg1.field681;
            int var6 = arg4.field681;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg2 == 2) {
            return arg4.method2004(arg3 + 20583).field4263.method340(arg1.method2004(-1).field4263, arg3 + 9910);
        } else if (arg2 == 3) {
            if (arg4.field4864.method345(class242.field4002, false)) {
                if (arg1.field4864.method345(class242.field4002, false)) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field4864.method345(class242.field4002, false)) {
                return arg0 ? 1 : -1;
            } else {
                return arg4.field4864.method340(arg1.field4864, -10674);
            }
        } else if (arg2 == 4) {
            return arg4.method296((byte) -86) ? (arg1.method296((byte) -86) ? 0 : 1) : (arg1.method296((byte) -86) ? -1 : 0);
        } else {
            if (arg3 != -20584) {
                method437(-46, (class26) null);
            }
            if (arg2 == 5) {
                return arg4.method301(4096) ? (arg1.method301(4096) ? 0 : 1) : (arg1.method301(arg3 + 24680) ? -1 : 0);
            } else if (arg2 == 6) {
                return arg4.method295(arg3 ^ 0xFFFFAFCF) ? (arg1.method295(89) ? 0 : 1) : (arg1.method295(86) ? -1 : 0);
            } else if (arg2 == 7) {
                return arg4.method299(true) ? (arg1.method299(true) ? 0 : 1) : (arg1.method299(true) ? -1 : 0);
            } else {
                return arg4.field4866 - arg1.field4866;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 275)
    public static final void method442() {
        GL var0 = class21.field377;
        var0.glDisableClientState(32886);
        class21.method136(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class21.method150();
        for (int var1 = 0; var1 < class147.field2439[0].length; var1++) {
            class47 var2 = class147.field2439[0][var1];
            if (var2.field924 >= 0 && class203.field3217.method571((byte) -107, var2.field924) == 4) {
                var0.glColor4fv(class164.method1241(var2.field908, (byte) -84), 0);
                float var3 = 201.5F - (var2.field916 ? 1.0F : 0.5F);
                var2.method425(class93.field1690, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class21.method157();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class21.method163();
    }
}
