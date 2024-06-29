import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class89 {

    @OriginalMember(owner = "client!r", name = "Uc", descriptor = "I")
    public int field2990 = -1;

    @OriginalMember(owner = "client!r", name = "Yc", descriptor = "I")
    public int field2994 = 0;

    @OriginalMember(owner = "client!r", name = "ad", descriptor = "I")
    public int field2996 = -1;

    @OriginalMember(owner = "client!r", name = "gd", descriptor = "I")
    public int field3002 = 0;

    @OriginalMember(owner = "client!r", name = "Ad", descriptor = "I")
    public int field3022 = 0;

    @OriginalMember(owner = "client!r", name = "Bd", descriptor = "I")
    public int field3023 = 0;

    @OriginalMember(owner = "client!r", name = "pd", descriptor = "I")
    public int field3011 = 0;

    @OriginalMember(owner = "client!r", name = "md", descriptor = "Z")
    public boolean field3008 = false;

    @OriginalMember(owner = "client!r", name = "ed", descriptor = "Lwb;")
    public static class150 field3000 = new class150(5000);

    @OriginalMember(owner = "client!r", name = "kd", descriptor = "I")
    public static int field3006 = 0;

    @OriginalMember(owner = "client!r", name = "rd", descriptor = "[I")
    public static int[] field3013 = new int[500];

    @OriginalMember(owner = "client!r", name = "Cd", descriptor = "Lkd;")
    public static class73 field3024 = class126.method1070((byte) -66, "Fertigkeit)2");

    @OriginalMember(owner = "client!r", name = "vd", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!r", name = "xd", descriptor = "[[[Lie;")
    public static class61[][][] field3019 = new class61[4][104][104];

    @OriginalMember(owner = "client!r", name = "yd", descriptor = "[I")
    public static int[] field3020 = new int[256];

    @OriginalMember(owner = "client!r", name = "wd", descriptor = "Lkd;")
    private static class73 field3018 = class126.method1070((byte) -66, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!r", name = "jd", descriptor = "Lkd;")
    public static class73 field3005 = field3018;

    @OriginalMember(owner = "client!r", name = "Vc", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!r", name = "Wc", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!r", name = "Xc", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!r", name = "Zc", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!r", name = "bd", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!r", name = "dd", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!r", name = "fd", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!r", name = "hd", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!r", name = "id", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!r", name = "nd", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!r", name = "od", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!r", name = "qd", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!r", name = "td", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!r", name = "ud", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!r", name = "zd", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!r", name = "ld", descriptor = "Lq;")
    public static class111 field3007;

    @OriginalMember(owner = "client!r", name = "sd", descriptor = "Lhe;")
    public class54 field3014;

    @OriginalMember(owner = "client!r", name = "Dd", descriptor = "Lkd;")
    public class73 field3025;

    @OriginalMember(owner = "client!r", name = "cd", descriptor = "Lna;")
    public class91 field2998;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILqc;)V")
    public final void method1021(int arg0, class114 arg1) {
        ++field3021;
        arg1.field2816 = 0;
        int var3 = arg1.method957((byte) 125);
        this.field2996 = arg1.method966((byte) 113);
        int[] var4 = new int[12];
        int var5 = -1;
        this.field2990 = arg1.method966((byte) 115);
        this.field3011 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method957((byte) 99);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method957((byte) 21);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var5 = arg1.method944((byte) 125);
                    break;
                }
                if (~var4[var6] <= -513) {
                    int var12 = class9.method86(var4[var6] - 512, (byte) 127).field3210;
                    if (~var12 != -1) {
                        this.field3011 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method957((byte) 73);
            if (~var11 > -1 || ~class86.field2167[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field2258 = arg1.method944((byte) 124);
        if (super.field2258 == 65535) {
            super.field2258 = -1;
        }
        super.field2239 = arg1.method944((byte) 111);
        if (super.field2239 == 65535) {
            super.field2239 = -1;
        }
        super.field2234 = super.field2239;
        super.field2276 = arg1.method944((byte) 118);
        if (~super.field2276 == -65536) {
            super.field2276 = -1;
        }
        super.field2260 = arg1.method944((byte) 121);
        if (~super.field2260 == -65536) {
            super.field2260 = -1;
        }
        super.field2247 = arg1.method944((byte) 115);
        if (~super.field2247 == -65536) {
            super.field2247 = -1;
        }
        super.field2261 = arg1.method944((byte) 115);
        if (super.field2261 == 65535) {
            super.field2261 = -1;
        }
        super.field2273 = arg1.method944((byte) 124);
        if (arg0 < 53) {
            this.field2991 = -87;
        }
        if (~super.field2273 == -65536) {
            super.field2273 = -1;
        }
        this.field3025 = class84.method708(arg1.method970(-29916), 94).method610(126);
        this.field3002 = arg1.method957((byte) 40);
        this.field2994 = arg1.method944((byte) 113);
        if (this.field3014 == null) {
            this.field3014 = new class54();
        }
        this.field3014.method436(~var3 == -2, var4, var5, 107, var9);
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public static void method1022(int arg0) {
        field3019 = null;
        field3007 = null;
        field3024 = null;
        field3005 = null;
        field3020 = null;
        field3013 = null;
        field3000 = null;
        int var1 = 25 / ((-44 - arg0) / 63);
        field3018 = null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        if (arg0 != 11800) {
            method1023(-103);
        }
        ++field2997;
        if (this.field3014 == null) {
            return null;
        } else {
            class36 var2 = ~super.field2284 != 0 && super.field2241 == 0 ? class94.method782(-24669, super.field2284) : null;
            class36 var3 = super.field2245 == -1 || this.field3008 || super.field2258 == super.field2245 && var2 != null ? null : class94.method782(-24669, super.field2245);
            class91 var4 = this.field3014.method434(super.field2232, -99, super.field2282, var3, var2);
            if (var4 == null) {
                return null;
            } else {
                var4.method755();
                super.field2236 = var4.field514;
                if (!this.field3008 && super.field2301 != -1 && ~super.field2262 != 0) {
                    class91 var5 = class72.method603(super.field2301, -1).method1037((byte) -120, super.field2262);
                    if (var5 != null) {
                        var5.method760(0, -super.field2248, 0);
                        class91[] var6 = new class91[] { var4, var5 };
                        var4 = new class91(var6, 2);
                    }
                }
                if (!this.field3008 && this.field2998 != null) {
                    if (~this.field3022 >= ~class49.field1308) {
                        this.field2998 = null;
                    }
                    if (~class49.field1308 <= ~this.field3023 && ~class49.field1308 > ~this.field3022) {
                        class91 var7 = this.field2998;
                        class91[] var8 = new class91[] { var4, var7 };
                        var7.method760(-super.field2277 + this.field2992, -this.field2991 + this.field3016, -super.field2264 + this.field3003);
                        if (~super.field2293 == -513) {
                            var7.method758();
                            var7.method758();
                            var7.method758();
                        } else if (~super.field2293 != -1025) {
                            if (super.field2293 == 1536) {
                                var7.method758();
                            }
                        } else {
                            var7.method758();
                            var7.method758();
                        }
                        var4 = new class91(var8, 2);
                        if (~super.field2293 == -513) {
                            var7.method758();
                        } else if (super.field2293 == 1024) {
                            var7.method758();
                            var7.method758();
                        } else if (~super.field2293 == -1537) {
                            var7.method758();
                            var7.method758();
                            var7.method758();
                        }
                        var7.method760(-this.field2992 + super.field2277, this.field2991 - this.field3016, -this.field3003 + super.field2264);
                    }
                }
                var4.field2306 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)I")
    public static final int method1023(int arg0) {
        if (arg0 < 44) {
            method1023(-21);
        }
        ++field2993;
        return class23.field647++;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)Z")
    public final boolean method87(byte arg0) {
        ++field3001;
        if (this.field3014 == null) {
            return false;
        } else {
            int var2 = 39 % ((arg0 - -85) / 33);
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method1024(Component arg0, boolean arg1) {
        ++field3009;
        arg0.removeKeyListener(class115.field2903);
        if (arg1) {
            method1023(-47);
        }
        arg0.removeFocusListener(class115.field2903);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I")
    public static final int method1025(int arg0, int arg1, int arg2, int arg3) {
        ++field3015;
        if ((class55.field1482[arg2][arg0][arg3] & 8) != 0) {
            return 0;
        } else {
            return arg1 < arg2 && (class55.field1482[1][arg0][arg3] & 2) != 0 ? arg2 + -1 : arg2;
        }
    }
}
