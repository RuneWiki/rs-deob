import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class639 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field8965;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
    public boolean field8985;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
    public boolean field8975;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[S")
    public short[] field8986;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field8973;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field8970;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private int field8966;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private int field8974;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field8982;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private int field8983;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljaa;")
    public static class747 field8967;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lvt;")
    public class759 field8979;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field8969;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[[I")
    public static int[][] field8976;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    private final void method3611(boolean arg0) {
        int var2 = this.field8973;
        if (var2 == 2) {
            this.field8966 = 0;
            this.field8974 = 1;
            this.field8983 = 2048;
            this.field8982 = 2048;
        } else if (var2 == 3) {
            this.field8982 = 2048;
            this.field8974 = 1;
            this.field8983 = 4096;
            this.field8966 = 0;
        } else if (var2 == 4) {
            this.field8966 = 0;
            this.field8983 = 2048;
            this.field8974 = 4;
            this.field8982 = 2048;
        } else if (var2 == 5) {
            this.field8974 = 4;
            this.field8982 = 2048;
            this.field8966 = 0;
            this.field8983 = 8192;
        } else if (var2 == 12) {
            this.field8974 = 2;
            this.field8982 = 2048;
            this.field8966 = 0;
            this.field8983 = 2048;
        } else if (var2 == 13) {
            this.field8983 = 8192;
            this.field8982 = 2048;
            this.field8966 = 0;
            this.field8974 = 2;
        } else if (var2 == 10) {
            this.field8982 = 512;
            this.field8966 = 1536;
            this.field8983 = 2048;
            this.field8974 = 3;
        } else if (var2 == 11) {
            this.field8974 = 3;
            this.field8982 = 512;
            this.field8983 = 4096;
            this.field8966 = 1536;
        } else if (var2 == 6) {
            this.field8983 = 2048;
            this.field8982 = 768;
            this.field8974 = 3;
            this.field8966 = 1280;
        } else if (var2 == 7) {
            this.field8983 = 4096;
            this.field8966 = 1280;
            this.field8974 = 3;
            this.field8982 = 768;
        } else if (var2 == 8) {
            this.field8982 = 1024;
            this.field8974 = 3;
            this.field8966 = 1024;
            this.field8983 = 2048;
        } else if (var2 == 9) {
            this.field8983 = 4096;
            this.field8982 = 1024;
            this.field8966 = 1024;
            this.field8974 = 3;
        } else if (var2 == 14) {
            this.field8983 = 2048;
            this.field8982 = 768;
            this.field8966 = 1280;
            this.field8974 = 1;
        } else if (var2 == 15) {
            this.field8982 = 512;
            this.field8983 = 4096;
            this.field8966 = 1536;
            this.field8974 = 1;
        } else if (var2 == 16) {
            this.field8966 = 1792;
            this.field8982 = 256;
            this.field8983 = 8192;
            this.field8974 = 1;
        } else {
            this.field8983 = 2048;
            this.field8982 = 2048;
            this.field8966 = 0;
            this.field8974 = 0;
        }
        if (arg0) {
            method3613(null, 31, 122, -71, 56, null, -49, null, null);
        }
        field8980++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method3612(byte arg0) {
        field8976 = null;
        field8969 = null;
        field8967 = null;
        if (arg0 != -12) {
            field8976 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lha;IIIILiba;ILre;Lcl;)V")
    public static final void method3613(class544 arg0, int arg1, int arg2, int arg3, int arg4, class302 arg5, int arg6, class277 arg7, class746 arg8) {
        field8981++;
        int var9 = arg2 + arg3 - (arg4 / 2);
        int var10 = arg1 + 2;
        if (arg7.field4233 != 0) {
            arg0.method3183(arg4 + 10, -var10 + 1 + arg6 * arg8.method4172() + arg1, arg7.field4233, var10, -115, var9);
        }
        if (arg7.field4218 != 0) {
            arg0.method3179(var9, arg7.field4218, (arg1 - (-(arg6 * arg8.method4172()) - 1)) - var10, var10, arg4 + 10, true);
        }
        int var11 = arg7.field4247;
        if (arg5.field4602 && arg7.field4252 != -1) {
            var11 = arg7.field4252;
        }
        for (int var12 = 0; var12 < arg6; var12++) {
            String var13 = class226.field3627[var12];
            if (var12 < (arg6 - 1)) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg8.method4170(arg0, var13, arg2, arg1, var11, true);
            arg1 += arg8.method4172();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V")
    public final void method3614(int arg0, int arg1, boolean arg2) {
        field8972++;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field8983 * arg1 / 50 + this.field8970 & 0x7FF;
            int var6 = this.field8974;
            if (var6 == 1) {
                var4 = (class582.field8226[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class268.field4143[var5] >> 1;
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
        if (arg0 != 50) {
            method3613(null, -15, -23, -113, 104, null, 101, null, null);
        }
        this.field8979.method9(false, (float) ((this.field8982 * var4 >> 11) + this.field8966) / 2048.0F);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)I")
    public static final int method3615(int arg0, int arg1, int arg2) {
        field8977++;
        if (arg2 >= -98) {
            return 1;
        } else {
            int var3 = arg1 * 57 + arg0;
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILha;III)V")
    private final void method3616(int arg0, int arg1, int arg2, class544 arg3, int arg4, int arg5, int arg6) {
        this.field8979 = arg3.method409(arg0, arg5, arg2, arg4, arg1, 1.0F);
        if (arg6 != 8192) {
            this.method3614(-47, -120, false);
        }
        field8968++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
    public final void method3617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8984++;
        this.field8974 = arg0;
        this.field8983 = arg1;
        if (arg2 <= 23) {
            this.field8974 = -20;
        }
        this.field8982 = arg3;
        this.field8966 = arg4;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    protected class639() {
        if (class268.field4143 == null) {
            class191.method1453(true);
        }
        this.method3611(false);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lha;Lofa;I)V")
    public class639(class544 arg0, class301 arg1, int arg2) {
        if (class268.field4143 == null) {
            class191.method1453(true);
        }
        this.field8965 = arg1.method1987(-13);
        this.field8985 = (this.field8965 & 0x10) != 0;
        this.field8975 = (this.field8965 & 0x8) != 0;
        this.field8965 &= 0x7;
        int var4 = arg1.method1989((byte) -69) << arg2;
        int var5 = arg1.method1989((byte) -67) << arg2;
        int var6 = arg1.method1989((byte) -105) << arg2;
        int var7 = arg1.method1987(-123);
        int var8 = var7 * 2 + 1;
        this.field8986 = new short[var8];
        for (int var9 = 0; var9 < this.field8986.length; var9++) {
            short var13 = (short) arg1.method1989((byte) -92);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field8986[var9] = (short) class112.method903(var15, var14 << 8);
        }
        int var10 = (var7 << class662.field9425) + class581.field8224;
        int var11 = class510.field7397 == null ? class395.field5895[class718.method3964(896, arg1.method1989((byte) -29)) & 0xFFFF] : class510.field7397[arg1.method1989((byte) -73)];
        int var12 = arg1.method1987(-36);
        this.field8973 = var12 & 0x1F;
        this.field8970 = (var12 & 0xE0) << 3;
        if (this.field8973 != 31) {
            this.method3611(false);
        }
        this.method3616(var4, var11, var5, arg0, var10, var6, 8192);
    }
}
