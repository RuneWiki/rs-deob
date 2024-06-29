import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class332 extends class111 {

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    private int field5050 = -1;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    private int field5074 = 0;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Z")
    private boolean field5077 = false;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Z")
    private boolean field5082 = false;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
    private int field5086 = 0;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    private int field5061 = -32768;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field5067;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public int field5076;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    private int field5066;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field5049;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "Ltc;")
    private class248 field5088;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "[I")
    public static int[] field5057 = new int[256];

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[Z")
    public static boolean[] field5051 = new boolean[100];

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "Ljava/lang/String;")
    public static String field5070 = "wave2:";

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "Ljava/lang/String;")
    public static String field5080 = "Connecting to update server";

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "D")
    public double field5046;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "D")
    private double field5047;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "D")
    private double field5059;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "D")
    public double field5060;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "D")
    private double field5062;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "D")
    private double field5063;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "D")
    public double field5064;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "D")
    private double field5078;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public int field5075;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lko;")
    private class155 field5068;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "Lph;")
    public static class361 field5085;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lhc;", line = 5)
    private final class151 method2331(int arg0) {
        field5052++;
        if (arg0 >= -44) {
            return (class151) null;
        }
        class107 var2 = class81.method669(32, this.field5058);
        class151 var3 = var2.method819(this.field5050, 19852, this.field5074, this.field5086);
        if (var3 == null) {
            return null;
        } else {
            var3.method1079(this.field5053);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()I", line = 32)
    public final int method371() {
        field5048++;
        return this.field5061;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILph;I)[Lwi;", line = 40)
    public static final class234[] method2332(int arg0, int arg1, class361 arg2, int arg3) {
        field5055++;
        return class62.method508(arg3 + arg3, arg0, arg1, arg2) ? class123.method925((byte) -92) : null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 54)
    public final void method2333(int arg0, int arg1) {
        if (this.field5066 == -1) {
            this.field5060 += (double) arg0 * this.field5078;
        } else {
            this.field5060 += this.field5059 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field5078;
            this.field5078 += (double) arg0 * this.field5059;
        }
        field5073++;
        this.field5046 += (double) arg0 * this.field5063;
        this.field5064 += (double) arg0 * this.field5062;
        this.field5077 = true;
        this.field5075 = (int) (Math.atan2(this.field5062, this.field5063) * 325.949D) + 1024 & 0x7FF;
        if (arg1 != 1) {
            return;
        }
        this.field5053 = (int) (Math.atan2(this.field5078, this.field5047) * 325.949D) & 0x7FF;
        if (this.field5088 == null) {
            return;
        }
        this.field5074 += arg0;
        while (true) {
            do {
                do {
                    if (this.field5074 <= this.field5088.field3694[this.field5086]) {
                        return;
                    }
                    this.field5074 -= this.field5088.field3694[this.field5086];
                    this.field5086++;
                    if (this.field5088.field3667.length <= this.field5086) {
                        this.field5086 -= this.field5088.field3677;
                        if (this.field5086 < 0 || this.field5088.field3667.length <= this.field5086) {
                            this.field5086 = 0;
                        }
                    }
                    this.field5050 = this.field5086 + 1;
                } while (this.field5088.field3667.length > this.field5050);
                this.field5050 -= this.field5088.field3677;
            } while (this.field5050 >= 0 && this.field5050 < this.field5088.field3667.length);
            this.field5050 = -1;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 403)
    public class332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field5067 = arg3;
        this.field5084 = arg1;
        this.field5081 = arg8;
        this.field5054 = arg6;
        this.field5076 = arg10;
        this.field5069 = arg9;
        this.field5058 = arg0;
        this.field5087 = arg2;
        this.field5072 = arg5;
        this.field5066 = arg7;
        this.field5049 = arg4;
        this.field5077 = false;
        int var12 = class81.method669(32, this.field5058).field1540;
        if (var12 == -1) {
            this.field5088 = null;
        } else {
            this.field5088 = class119.method893(var12, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V", line = 113)
    public static final void method2334(byte arg0, boolean arg1) {
        field5065++;
        if (class287.field4353 != arg1) {
            class287.field4353 = arg1;
            if (arg0 == 31) {
                class172.method1210(96);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IIIII)V", line = 135)
    public final void method2335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5056++;
        if (!this.field5077) {
            double var6 = (double) (arg3 - this.field5087);
            double var8 = (double) (arg4 - this.field5067);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field5046 = (double) this.field5081 * var8 / var10 + (double) this.field5067;
            this.field5064 = (double) this.field5081 * var6 / var10 + (double) this.field5087;
            this.field5060 = (double) this.field5049;
        }
        double var12 = (double) (this.field5054 + 1 - arg2);
        this.field5062 = ((double) arg3 - this.field5064) / var12;
        this.field5063 = ((double) arg4 - this.field5046) / var12;
        this.field5047 = Math.sqrt(this.field5063 * this.field5063 + this.field5062 * this.field5062);
        int var14 = -57 / ((arg0 - 46) / 56);
        if (this.field5066 == -1) {
            this.field5078 = ((double) arg1 - this.field5060) / var12;
        } else {
            if (!this.field5077) {
                this.field5078 = -this.field5047 * Math.tan((double) this.field5066 * 0.02454369D);
            }
            this.field5059 = ((double) arg1 - this.field5060 - this.field5078 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBILqf;IILmo;)V", line = 177)
    public static final void method2336(int arg0, byte arg1, int arg2, class359 arg3, int arg4, int arg5, class250 arg6) {
        field5044++;
        if (arg6 == null) {
            return;
        }
        int var7;
        if (class86.field1208 == 4) {
            var7 = (int) class36.field535 & 0x7FF;
        } else {
            var7 = (int) class36.field535 + class298.field4460 & 0x7FF;
        }
        int var8 = arg2 * arg2 + (arg0 * arg0);
        int var9 = Math.max(arg3.field5506 / 2, arg3.field5560 / 2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class345.field5339[var7];
        if (arg1 >= -29) {
            field5083 = -52;
        }
        int var11 = class345.field5343[var7];
        if (class86.field1208 != 4) {
            var11 = var11 * 256 / (class281.field4271 + 256);
            var10 = var10 * 256 / (class281.field4271 + 256);
        }
        int var12 = arg0 * var11 - arg2 * var10 >> 16;
        int var13 = arg0 * var10 + arg2 * var11 >> 16;
        if (class141.field2031) {
            ((class204) arg6).method1480(arg3.field5506 / 2 + arg5 + var13 - (arg6.field3719 / 2), arg3.field5560 / 2 + arg4 + -(arg6.field3713 / 2) + -var12, (class325) arg3.method2493(122, false));
        } else {
            ((class234) arg6).method1741(arg3.field5506 / 2 + arg5 + var13 - (arg6.field3719 / 2), arg3.field5560 / 2 + -(arg6.field3713 / 2) + -var12 + arg4, arg3.field5570, arg3.field5591);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 223)
    public static void method2337(int arg0) {
        field5080 = null;
        field5085 = null;
        field5057 = null;
        field5070 = null;
        if (arg0 != 0) {
            method2337(38);
        }
        field5051 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lhc;Z)V", line = 244)
    private final void method2338(class151 arg0, boolean arg1) {
        if (class141.field2031) {
            class218 var4 = (class218) arg0;
            if ((this.field5068 == null || this.field5068.field2220) && (var4.field3216 != null || var4.field3241 != null)) {
                this.field5068 = new class155(class304.field4560, 1, 1);
            }
            if (this.field5068 != null) {
                this.field5068.method1118(var4.field3216, var4.field3241, false, var4.field3244, var4.field3246, var4.field3214);
            }
        } else {
            class317 var3 = (class317) arg0;
            if ((this.field5068 == null || this.field5068.field2220) && (var3.field4703 != null || var3.field4712 != null)) {
                this.field5068 = new class155(class304.field4560, 1, 1);
            }
            if (this.field5068 != null) {
                this.field5068.method1118(var3.field4703, var3.field4712, false, var3.field4725, var3.field4718, var3.field4709);
            }
        }
        this.field5082 = arg1;
        field5071++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 278)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        field5079++;
        class151 var13 = this.method2331(-91);
        if (var13 != null) {
            this.method2338(var13, true);
            var13.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5068);
            this.field5061 = var13.method371();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V", line = 295)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5043++;
        if (!this.field5082) {
            class151 var6 = this.method2331(-122);
            if (var6 == null) {
                return;
            }
            this.method2338(var6, true);
        }
        if (this.field5068 != null) {
            this.field5068.method1109(arg0, arg1, arg3, arg2, arg4);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5057[var0] = var1;
        }
        field5083 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 338)
    public static final String method2339(boolean arg0, int arg1) {
        field5045++;
        if (arg0) {
            method2336(-83, (byte) 118, -61, (class359) null, -73, -126, (class250) null);
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF8354) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }
}
