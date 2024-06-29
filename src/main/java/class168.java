import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class168 {

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field2210 = -1;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
    public boolean field2206 = false;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field2217 = 5;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    public boolean field2212 = false;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Z")
    public boolean field2204 = false;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public int field2221 = 2;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
    public boolean field2209 = false;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public int field2222 = -1;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field2211 = 99;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public int field2227 = -1;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public int field2229 = -1;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public int field2225 = -1;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[[I")
    public static int[][] field2214 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Lrs;")
    public class445 field2213;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
    public int[] field2205;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
    private int[] field2215;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[I")
    public int[] field2219;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "[Lqg;")
    public static class307[] field2220;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "[Z")
    public boolean[] field2218;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "[[I")
    public int[][] field2228;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lva;IIIII)Lva;", line = 4)
    public final class327 method1056(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2223++;
        int var7 = this.field2205[arg5];
        int var8 = this.field2219[arg5];
        class103 var9 = this.field2213.method2603(arg2 - 13326, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method194((byte) 1, arg4, true);
        }
        class103 var11 = null;
        if ((this.field2206 || class360.field5338) && arg1 != -1 && arg1 < this.field2219.length) {
            int var12 = this.field2219[arg1];
            var11 = this.field2213.method2603(-1281, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class103 var13 = null;
        class103 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2215 != null) {
            if (arg5 < this.field2215.length) {
                var15 = this.field2215[arg5];
                if (var15 != 65535) {
                    var13 = this.field2213.method2603(-1281, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2206 || class360.field5338) && arg1 != -1 && this.field2215.length > arg1) {
                var16 = this.field2215[arg1];
                if (var16 != 65535) {
                    var14 = this.field2213.method2603(-1281, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2204) {
            arg4 |= 0x200;
        }
        if (var9.method621(var10, arg2 ^ arg2)) {
            arg4 |= 0x80;
        }
        if (var9.method619(56, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method618(var10, 17712)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method621(var15, 0)) {
                arg4 |= 0x80;
            }
            if (var13.method619(122, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method618(var15, 17712)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method621(arg1, 0)) {
                arg4 |= 0x80;
            }
            if (var11.method619(53, arg1)) {
                arg4 |= 0x100;
            }
            if (var11.method618(arg1, 17712)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method621(var16, 0)) {
                arg4 |= 0x80;
            }
            if (var14.method619(28, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method618(var16, 17712)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class327 var18 = arg0.method194((byte) 1, var17, true);
        var18.method1956(0, this.field2204, var9, var10, arg1, var11, 65535, arg3 - 1, var7);
        if (var13 != null) {
            var18.method1956(0, this.field2204, var13, var15, var16, var14, 65535, arg3 - 1, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 143)
    public final void method1057(boolean arg0) {
        if (this.field2225 == -1) {
            if (this.field2218 == null) {
                this.field2225 = 0;
            } else {
                this.field2225 = 2;
            }
        }
        if (arg0) {
            field2220 = null;
        }
        field2224++;
        if (this.field2227 != -1) {
            return;
        }
        if (this.field2218 == null) {
            this.field2227 = 0;
        } else {
            this.field2227 = 2;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLae;)V", line = 172)
    public final void method1058(byte arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 125);
            if (var3 == 0) {
                if (arg0 <= 11) {
                    this.field2221 = 120;
                }
                field2203++;
                return;
            }
            this.method1059(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILae;)V", line = 193)
    private final void method1059(int arg0, int arg1, class156 arg2) {
        if (arg1 == 1) {
            int var13 = arg2.method993((byte) -61);
            this.field2205 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2205[var14] = arg2.method993((byte) -88);
            }
            this.field2219 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2219[var15] = arg2.method993((byte) -55);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2219[var16] = (arg2.method993((byte) -44) << 16) + this.field2219[var16];
            }
        } else if (arg1 == 2) {
            this.field2210 = arg2.method993((byte) -91);
        } else if (arg1 == 3) {
            this.field2218 = new boolean[256];
            int var11 = arg2.method941((byte) 123);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2218[arg2.method941((byte) 127)] = true;
            }
        } else if (arg1 == 4) {
            this.field2209 = true;
        } else if (arg1 == 5) {
            this.field2217 = arg2.method941((byte) 123);
        } else if (arg1 == 6) {
            this.field2222 = arg2.method993((byte) -82);
        } else if (arg1 == 7) {
            this.field2229 = arg2.method993((byte) -106);
        } else if (arg1 == 8) {
            this.field2211 = arg2.method941((byte) 127);
        } else if (arg1 == 9) {
            this.field2227 = arg2.method941((byte) 126);
        } else if (arg1 == 10) {
            this.field2225 = arg2.method941((byte) 126);
        } else if (arg1 == 11) {
            this.field2221 = arg2.method941((byte) 123);
        } else if (arg1 == 12) {
            int var8 = arg2.method941((byte) 124);
            this.field2215 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2215[var9] = arg2.method993((byte) -43);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2215[var10] = (arg2.method993((byte) -79) << 16) + this.field2215[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method993((byte) -112);
            this.field2228 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method941((byte) 127);
                if (var6 > 0) {
                    this.field2228[var5] = new int[var6];
                    this.field2228[var5][0] = arg2.method943(1295851312);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2228[var5][var7] = arg2.method993((byte) -80);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2204 = true;
        } else if (arg1 == 15) {
            this.field2206 = true;
        } else if (arg1 == 16) {
            this.field2212 = true;
        }
        if (arg0 != 0) {
            this.field2206 = true;
        }
        field2226++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 357)
    public static void method1060(byte arg0) {
        field2214 = null;
        field2220 = null;
        if (arg0 != -67) {
            method1061(false, -57);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 393)
    public static final void method1061(boolean arg0, int arg1) {
        if (arg0) {
            if (class465.field6737 != -1) {
                class6.method49(class465.field6737, (byte) 120);
            }
            for (class311 var2 = (class311) class213.field3010.method2316(arg1 ^ 0xFFFF9514); var2 != null; var2 = (class311) class213.field3010.method2308((byte) 26)) {
                if (!var2.method542((byte) -92)) {
                    var2 = (class311) class213.field3010.method2316(4999);
                    if (var2 == null) {
                        break;
                    }
                }
                class32.method264(true, arg1 - 16287843, false, var2);
            }
            class465.field6737 = -1;
            class213.field3010 = new class384(8);
            class144.method906(arg1 + 31209);
            class465.field6737 = class118.field1526;
            class309.method1856(-109, false);
            class176.method1103(0);
            class396.method2364(class465.field6737);
        }
        field2208++;
        class261.method1615(arg1 + 31113);
        class450.field6553 = -1;
        class120.method683(-1, class152.field1954);
        class415.field6145 = new class313();
        class415.field6145.field2966 = class203.field2813 * 128 / 2;
        class415.field6145.field2959 = class362.field5442 * 128 / 2;
        class415.field6145.field4279[0] = class362.field5442 / 2;
        class282.field4026 = 0;
        class205.field2843 = 0;
        if (arg1 != -31085) {
            return;
        }
        class415.field6145.field4282[0] = class203.field2813 / 2;
        if (class306.field4454 == 2) {
            class205.field2843 = class293.field4173 << 7;
            class282.field4026 = class142.field1851 << 7;
        } else {
            class378.method2288((byte) 54);
        }
        class428.method2551(arg1 + 30996);
        if (class205.field2843 == 0 || class282.field4026 == 0) {
            class319.method1921(arg1 ^ 0xFFFFBA07, 10);
        } else {
            class458.method2669(-11995);
            class319.method1921(15508, 28);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIZ)I", line = 480)
    public final int method1062(int arg0, int arg1, int arg2, boolean arg3) {
        field2216++;
        if (arg0 != -1) {
            this.field2210 = -64;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2219[arg1];
        class103 var8 = null;
        class103 var9 = this.field2213.method2603(arg0 ^ 0x500, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2206 || class360.field5338) && arg2 != -1 && arg2 < this.field2219.length) {
            int var11 = this.field2219[arg2];
            var8 = this.field2213.method2603(-1281, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2204) {
            var5 |= 0x200;
        }
        if (var9.method621(var10, 0)) {
            var5 |= 0x80;
        }
        if (var9.method619(arg0 + 52, var10)) {
            var5 |= 0x100;
        }
        if (var9.method618(var10, 17712)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method621(var6, 0)) {
                var5 |= 0x80;
            }
            if (var8.method619(arg0 ^ 0xFFFFFFA4, var6)) {
                var5 |= 0x100;
            }
            if (var8.method618(var6, 17712)) {
                var5 |= 0x400;
            }
        }
        if (this.field2215 != null && arg3) {
            if (arg1 < this.field2215.length) {
                int var12 = this.field2215[arg1];
                if (var12 != 65535) {
                    class103 var13 = this.field2213.method2603(arg0 ^ 0x500, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method621(var14, 0)) {
                            var5 |= 0x80;
                        }
                        if (var13.method619(arg0 ^ 0xFFFFFF94, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method618(var14, 17712)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2206 || class360.field5338) && arg2 != -1 && this.field2215.length > arg2) {
                int var15 = this.field2215[arg2];
                if (var15 != 65535) {
                    class103 var16 = this.field2213.method2603(arg0 - 1280, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method621(var17, 0)) {
                            var5 |= 0x80;
                        }
                        if (var16.method619(arg0 ^ 0xFFFFFFA4, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method618(var17, 17712)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBIIIIBLva;)Lva;", line = 606)
    public final class327 method1063(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class327 arg7) {
        field2207++;
        int var9 = this.field2205[arg4];
        int var10 = this.field2219[arg4];
        class103 var11 = this.field2213.method2603(-1281, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (arg1 < 73) {
            this.method1062(15, 99, -23, false);
        }
        if (var11 == null) {
            return arg7.method194(arg6, arg5, true);
        }
        class103 var13 = null;
        if ((this.field2206 || class360.field5338) && arg2 != -1 && this.field2219.length > arg2) {
            int var14 = this.field2219[arg2];
            var13 = this.field2213.method2603(-1281, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field2204) {
            arg5 |= 0x200;
        }
        if (var11.method621(var12, 0)) {
            arg5 |= 0x80;
        }
        if (var11.method619(43, var12)) {
            arg5 |= 0x100;
        }
        if (var11.method618(var12, 17712)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method621(arg2, 0)) {
                arg5 |= 0x80;
            }
            if (var13.method619(23, arg2)) {
                arg5 |= 0x100;
            }
            if (var13.method618(arg2, 17712)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class327 var16 = arg7.method194(arg6, var15, true);
        var16.method1956(arg3, this.field2204, var11, var12, arg2, var13, 65535, arg0 - 1, var9);
        return var16;
    }
}
