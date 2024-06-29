import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class668 extends class555 {

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Lln;")
    private class96 field9500;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Lhr;")
    private class604 field9493;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Z")
    private boolean field9488;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "Lfn;")
    public static class286 field9492 = new class286();

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "[J")
    public static long[] field9502 = new long[11];

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "[[J")
    public static long[][] field9501 = new long[8][256];

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "F")
    public static float field9496;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Z")
    private boolean field9490;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (this.field9490) {
            super.field7580.method3635(true, 1);
            super.field7580.method3613((byte) 98, (class222) null);
            super.field7580.method3635(true, 0);
            super.field7580.method3613((byte) 124, (class222) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9490 = false;
        }
        ++field9494;
        if (arg0 <= 45) {
            this.field9488 = true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        ++field9499;
        if (arg0) {
            class530 var3 = super.field7580.method3645((byte) 21);
            if (this.field9488 && var3 != null) {
                super.field7580.method3635(true, 1);
                super.field7580.method3613((byte) 102, var3);
                super.field7580.method3635(arg0, 0);
                super.field7580.method3613((byte) 96, this.field9500.field1163);
                long var4 = this.field9493.field8436;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field7580.field9239[0], -super.field7580.field9239[1], -super.field7580.field9239[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7580.field9183, super.field7580.field9263, super.field7580.field9254, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field7580.field9239[1]) * 928.0F + 96.0F);
                this.field9490 = true;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIILga;I)V")
    public static final void method3797(int arg0, boolean arg1, int arg2, int arg3, int arg4, class332 arg5, int arg6) {
        class285.field3762 = arg5;
        if (arg3 > -58) {
            field9502 = null;
        }
        class110.field1302 = arg4;
        class111.field1339 = arg1;
        class574.field7844 = 1;
        class401.field5322 = arg0;
        ++field9498;
        class253.field3319 = arg2;
        class174.field2461 = arg6;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
    public static void method3798(int arg0) {
        field9502 = null;
        if (arg0 <= 38) {
            field9496 = 0.9435146F;
        }
        field9492 = null;
        field9501 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        ++field9489;
        if (arg1 > -93) {
            this.method126(-20, 50, 38);
        }
        if (!this.field9490) {
            super.field7580.method3613((byte) 108, arg0);
            super.field7580.method3676(arg2, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        ++field9495;
        return arg0 != -20112 ? true : this.field9488;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        ++field9491;
        if (arg1 != -13443) {
            this.field9500 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lqi;Lga;Lln;)V")
    public class668(class510 arg0, class332 arg1, class96 arg2) {
        super(arg0);
        this.field9500 = arg2;
        if (arg1 != null && arg0.field7131 && arg0.field7132) {
            class61 var4 = class386.method2209(arg0, 31577, arg1.method1947(5, "environment_mapped_water_v", "gl"), 35633);
            class61 var5 = class386.method2209(arg0, 31577, arg1.method1947(5, "environment_mapped_water_f", "gl"), 35632);
            this.field9493 = class417.method2364(arg0, false, new class61[] { var4, var5 });
            this.field9488 = this.field9493 != null && this.field9500.method546(128);
        } else {
            this.field9488 = false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        if (this.field9490) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 259796) >> 16) / 8.0F;
            long var8 = this.field9493.field8436;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7580.field9245 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 > 81) {
            ++field9497;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) (~(1 & var0) != -1 ? var3 & 255 : var3 >>> 8);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 285L;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 285L;
            }
            long var14 = var4 ^ var12;
            field9501[0][var0] = class174.method1186(class174.method1186(class174.method1186(class174.method1186(class174.method1186(class174.method1186(var8 << 40, class174.method1186(var4 << 48, var4 << 56)), var4 << 32), var12 << 24), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; ++var16) {
                field9501[var16][var0] = class174.method1186(field9501[var16 + -1][var0] << 56, field9501[var16 - 1][var0] >>> 8);
            }
        }
        field9502[0] = 0L;
        for (int var1 = 1; var1 <= 10; ++var1) {
            int var2 = var1 * 8 + -8;
            field9502[var1] = class487.method2796(class215.method1368(field9501[7][var2 + 7], 255L), class487.method2796(class487.method2796(class215.method1368(16711680L, field9501[5][var2 + 5]), class487.method2796(class487.method2796(class215.method1368(field9501[3][var2 - -3], 1095216660480L), class487.method2796(class215.method1368(field9501[2][var2 + 2], 280375465082880L), class487.method2796(class215.method1368(71776119061217280L, field9501[1][var2 + 1]), class215.method1368(field9501[0][var2], -72057594037927936L)))), class215.method1368(4278190080L, field9501[4][var2 + 4]))), class215.method1368(field9501[6][var2 + 6], 65280L)));
        }
    }
}
