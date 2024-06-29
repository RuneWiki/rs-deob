import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class290 extends class312 {

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
    private boolean field4354 = false;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Z")
    private boolean field4357;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "[Lmda;")
    private class243[] field4359;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "F")
    public static float field4351 = 0.25F;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "[[J")
    public static long[][] field4349 = new long[8][256];

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "[J")
    public static long[] field4353 = new long[11];

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "Lqfa;")
    public static class85 field4366;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "Laj;")
    public static class287 field4368;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "Lqda;")
    private class89 field4360;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uea", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field4369;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        if (this.field4354) {
            super.field4632.method125(1, -36);
            super.field4632.method5(3845, this.field4359[arg1 + -1]);
            super.field4632.method125(0, -63);
        }
        int var4 = 53 % ((74 - arg2) / 45);
        ++field4352;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
    public static void method1937(boolean arg0) {
        field4368 = null;
        field4349 = null;
        if (arg0) {
            field4353 = null;
            field4366 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field4364;
        super.field4632.method5(3845, arg2);
        super.field4632.method133(arg0, (byte) -127);
        if (arg1 > -78) {
            this.method242((byte) -44);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1938(String arg0, int arg1, int arg2) {
        ++field4362;
        if (arg1 != 1) {
            method1937(false);
        }
        class19 var3 = class373.method2355(arg1 + 110, arg2, 3);
        var3.method432(45);
        var3.field831 = arg0;
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(I)V")
    public static final void method1939(int arg0) {
        ++field4350;
        int var1 = class318.field4686 * 512 + 256;
        int var2 = class448.field6449 * 512 + 256;
        int var3 = class460.method2757(0, var2, class37.field1046, var1) - class324.field4755;
        if (class586.field8452 < 100) {
            if (~var1 < ~class206.field3158) {
                class206.field3158 += (var1 - class206.field3158) * class586.field8452 / 1000 + class7.field515;
                if (~var1 > ~class206.field3158) {
                    class206.field3158 = var1;
                }
            }
            if (~class206.field3158 < ~var1) {
                class206.field3158 -= (-var1 + class206.field3158) * class586.field8452 / 1000 + class7.field515;
                if (class206.field3158 < var1) {
                    class206.field3158 = var1;
                }
            }
            if (~var3 < ~class1.field97) {
                class1.field97 += (-class1.field97 + var3) * class586.field8452 / 1000 + class7.field515;
                if (~var3 > ~class1.field97) {
                    class1.field97 = var3;
                }
            }
            if (class1.field97 > var3) {
                class1.field97 -= (-var3 + class1.field97) * class586.field8452 / 1000 + class7.field515;
                if (~class1.field97 > ~var3) {
                    class1.field97 = var3;
                }
            }
            if (var2 > class537.field7518) {
                class537.field7518 += class7.field515 - -((-class537.field7518 + var2) * class586.field8452 / 1000);
                if (~var2 > ~class537.field7518) {
                    class537.field7518 = var2;
                }
            }
            if (~var2 > ~class537.field7518) {
                class537.field7518 -= class7.field515 - -((-var2 + class537.field7518) * class586.field8452 / 1000);
                if (~var2 < ~class537.field7518) {
                    class537.field7518 = var2;
                }
            }
        } else {
            class537.field7518 = class448.field6449 * 512 - -256;
            class206.field3158 = class318.field4686 * 512 + 256;
            class1.field97 = class460.method2757(arg0 ^ 1000, class537.field7518, class37.field1046, class206.field3158) - class324.field4755;
        }
        int var4 = class540.field7553 * 512 + 256;
        int var5 = class184.field2956 * 512 + 256;
        int var6 = class460.method2757(arg0 ^ arg0, var5, class37.field1046, var4) + -class146.field2541;
        int var7 = var4 - class206.field3158;
        int var8 = -class1.field97 + var6;
        int var9 = -class537.field7518 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
        int var12 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9));
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class499.field7113) {
            class499.field7113 += (-class499.field7113 + var11 >> 3) * class525.field7402 / 1000 + class519.field7365 << 3;
            if (class499.field7113 > var11) {
                class499.field7113 = var11;
            }
        }
        if (var11 < class499.field7113) {
            class499.field7113 -= (-var11 + class499.field7113 >> 3) * class525.field7402 / 1000 + class519.field7365 << 3;
            if (~class499.field7113 > ~var11) {
                class499.field7113 = var11;
            }
        }
        int var13 = -class517.field7300 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class517.field7300 += class525.field7402 * var14 / 1000 + class519.field7365 << 3;
            class517.field7300 &= 16383;
        }
        if (~var14 > -1) {
            class517.field7300 -= class519.field7365 - -(-var14 * class525.field7402 / 1000) << 3;
            class517.field7300 &= 16383;
        }
        int var15 = -class517.field7300 + var12;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || ~var15 < -1 && var14 < 0) {
            class517.field7300 = var12;
        }
        class596.field8558 = 0;
    }

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "(I)V")
    private final void method1940(int arg0) {
        ++field4361;
        this.field4360 = new class89(super.field4632, 2);
        this.field4360.method874(0, arg0 ^ -8573);
        super.field4632.method125(1, -122);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field4357) {
            super.field4632.method148(7681, 260, (byte) -120);
            super.field4632.method10(0, 770, 5890, 34192);
            super.field4632.method135((byte) 24, 34167, 0, 770);
        } else {
            super.field4632.method148(8448, 7681, (byte) -126);
            super.field4632.method10(0, 768, 34168, 34192);
            super.field4632.method125(2, -51);
            super.field4632.method148(7681, 260, (byte) -115);
            super.field4632.method10(0, 768, 34168, 34192);
            super.field4632.method10(1, 770, 34168, 34192);
            super.field4632.method135((byte) 21, 34167, 0, 770);
        }
        super.field4632.method125(0, 106);
        this.field4360.method869((byte) -128);
        this.field4360.method874(1, -103);
        if (arg0 == 8448) {
            super.field4632.method125(1, -91);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field4357) {
                super.field4632.method148(8448, 8448, (byte) -126);
                super.field4632.method10(0, 768, 5890, 34192);
                super.field4632.method125(2, 126);
                super.field4632.method148(8448, 8448, (byte) -108);
                super.field4632.method10(0, 768, 5890, 34192);
                super.field4632.method10(1, 768, 34168, 34192);
                super.field4632.method135((byte) 89, 5890, 0, 770);
            } else {
                super.field4632.method148(8448, 8448, (byte) -117);
                super.field4632.method10(0, 768, 5890, 34192);
                super.field4632.method135((byte) 104, 5890, 0, 770);
            }
            super.field4632.method125(0, -40);
            this.field4360.method869((byte) -115);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        ++field4363;
        if (this.field4360 != null && arg0) {
            if (!this.field4357) {
                super.field4632.method125(2, 78);
                super.field4632.method5(3845, super.field4632.field255);
                super.field4632.method125(0, -37);
            }
            this.field4360.method871(false, '\u0000');
            this.field4354 = true;
        } else {
            super.field4632.method135((byte) -100, 34168, 0, 770);
        }
        if (arg1) {
            field4368 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        ++field4358;
        int var2 = 69 % ((25 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lus;)V")
    public class290(class1 arg0) {
        super(arg0);
        if (arg0.field337) {
            this.field4357 = arg0.field303 < 3;
            int var2 = this.field4357 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (var14 != 3) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field4359 = new class243[3];
            this.field4359[0] = new class243(super.field4632, 6406, 64, false, var4, 6406);
            this.field4359[1] = new class243(super.field4632, 6406, 64, false, var5, 6406);
            this.field4359[2] = new class243(super.field4632, 6406, 64, false, var3, 6406);
            this.method1940(8448);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZILjava/io/File;)V")
    public static final void method1941(boolean arg0, int arg1, File arg2) {
        if (class634.field9112 == null) {
            class493.method2955(true);
        }
        ++field4356;
        try {
            if (arg1 != 2) {
                field4351 = 2.1286128F;
            }
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field4369 != null ? field4369 : (field4369 = method1942("java.lang.String")), Boolean.TYPE);
            var4.invoke(class634.field9112, arg2.getAbsolutePath(), new Boolean(arg0));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        ++field4355;
        if (arg1 <= 102) {
            method1937(false);
        }
        super.field4632.method148(7681, 8448, (byte) -103);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (!this.field4354) {
            super.field4632.method135((byte) 105, 5890, 0, 770);
        } else {
            if (!this.field4357) {
                super.field4632.method125(2, -74);
                super.field4632.method5(arg0 + 3968, (class487) null);
            }
            super.field4632.method125(1, -28);
            super.field4632.method5(arg0 ^ -3968, (class487) null);
            super.field4632.method125(0, arg0 ^ -16);
            this.field4360.method871(false, '\u0001');
            this.field4354 = false;
        }
        if (arg0 != -123) {
            method1941(true, -112, (File) null);
        }
        ++field4365;
        super.field4632.method148(8448, 8448, (byte) -122);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1942(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((1 & var0) == 0 ? var3 >>> 8 : var3 & 255);
            long var6 = var4 << 1;
            if (~var6 <= -257L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 285L;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (~var12 <= -257L) {
                var12 ^= 285L;
            }
            long var14 = var12 ^ var4;
            field4349[0][var0] = class657.method3738(var14, class657.method3738(class657.method3738(class657.method3738(class657.method3738(class657.method3738(class657.method3738(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16), var6 << 8));
            for (int var16 = 1; ~var16 > -9; ++var16) {
                field4349[var16][var0] = class657.method3738(field4349[var16 + -1][var0] << 56, field4349[var16 + -1][var0] >>> 8);
            }
        }
        field4353[0] = 0L;
        for (int var1 = 1; var1 <= 10; ++var1) {
            int var2 = var1 * 8 + -8;
            field4353[var1] = class662.method3767(class662.method3767(class523.method3073(65280L, field4349[6][var2 - -6]), class662.method3767(class662.method3767(class662.method3767(class662.method3767(class662.method3767(class523.method3073(-72057594037927936L, field4349[0][var2]), class523.method3073(71776119061217280L, field4349[1][var2 + 1])), class523.method3073(280375465082880L, field4349[2][var2 + 2])), class523.method3073(1095216660480L, field4349[3][var2 + 3])), class523.method3073(field4349[4][var2 - -4], 4278190080L)), class523.method3073(field4349[5][var2 + 5], 16711680L))), class523.method3073(field4349[7][var2 - -7], 255L));
        }
        field4366 = new class85(36, 6);
        field4368 = new class287(8);
    }
}
