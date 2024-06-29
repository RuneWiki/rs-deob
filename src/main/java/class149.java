import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class149 {

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    private int field2211 = 0;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    private int field2220 = 1;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    private int field2222 = 1;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    private int field2227 = 0;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "Lnv;")
    private class44 field2223 = new class44();

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "Z")
    private boolean field2235 = true;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "Z")
    private boolean field2232 = true;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    private int field2236 = -1;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    private int field2238 = 0;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "Z")
    private boolean field2240 = true;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
    private boolean field2233 = true;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "[Lcd;")
    private class65[] field2237 = new class65[2];

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "Z")
    private boolean field2241 = false;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Ltt;")
    private class249 field2226;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Lak;")
    private class35 field2213;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Lak;")
    private class35 field2214;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Lak;")
    private class35 field2208;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "Ljp;")
    public static class55 field2219 = new class55(27, 4);

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lrp;")
    public static class277 field2229 = new class277(2);

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Lpn;")
    public static class49 field2230 = new class49(77, -1);

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "Ldr;")
    private class296 field2231;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "Ldr;")
    private class296 field2234;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Lcd;")
    private class65 field2239;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "Z")
    private boolean field2228;

    static {
        new class179("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Luu;II)V", line = 4)
    public static final void method1061(class428 arg0, int arg1, int arg2) {
        field2224++;
        boolean var3 = arg0.method2671(-123, 1) == 1;
        if (var3) {
            class132.field1944[class342.field5111++] = arg2;
        }
        int var4 = arg0.method2671(-128, 2);
        class511 var5 = class530.field7747[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7479 = false;
            } else if (class517.field7513 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class463 var6 = class434.field6453[arg2] = new class463();
                var6.field6862 = (class23.field273 + var5.field7653[0] >> 6) + ((var5.field1274 << 28) + (var5.field7654[0] + class422.field6201 >> 6 << 14));
                if (var5.field7453 == -1) {
                    var6.field6855 = var5.field7592.method1881(false);
                } else {
                    var6.field6855 = var5.field7453;
                }
                var6.field6853 = var5.field7624;
                var6.field6856 = var5.field7448;
                if (var5.field7436 > 0) {
                    class294.method1966(var5, -30498);
                }
                class530.field7747[arg2] = null;
                if (arg0.method2671(-118, 1) != 0) {
                    class472.method2862(arg0, arg2, true);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2671(arg1 ^ 0xFFFFE57C, 3);
            int var8 = var5.field7654[0];
            int var9 = var5.field7653[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7440 = var8;
                var5.field7479 = true;
                var5.field7459 = var9;
            } else {
                var5.method3043(var9, class438.field6537[arg2], var8, (byte) 114);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2671(arg1 - 7016, 4);
            int var11 = var5.field7654[0];
            int var12 = var5.field7653[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field7479 = true;
                var5.field7459 = var12;
                var5.field7440 = var11;
            } else {
                var5.method3043(var12, class438.field6537[arg2], var11, (byte) 93);
            }
        } else {
            int var13 = arg0.method2671(-128, 1);
            if (var13 == 0) {
                int var14 = arg0.method2671(arg1 ^ 0xFFFFE560, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field7654[0] + var16;
                int var19 = var5.field7653[0] + var17;
                if (var3) {
                    var5.field7440 = var18;
                    var5.field7479 = true;
                    var5.field7459 = var19;
                } else {
                    var5.method3043(var19, class438.field6537[arg2], var18, (byte) -68);
                }
                var5.field1274 = (byte) (var5.field1274 + var15 & 0x3);
                if (class517.field7513 == arg2) {
                    class30.field370 = var5.field1274;
                }
            } else if (arg1 == 6892) {
                int var20 = arg0.method2671(-118, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFE909) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class422.field6201 + var22 + var5.field7654[0] & 0x3FFF) - class422.field6201;
                int var25 = (var5.field7653[0] + class23.field273 + var23 & 0x3FFF) - class23.field273;
                if (var3) {
                    var5.field7459 = var25;
                    var5.field7479 = true;
                    var5.field7440 = var24;
                } else {
                    var5.method3043(var25, class438.field6537[arg2], var24, (byte) -79);
                }
                var5.field1274 = (byte) (var5.field1274 + var21 & 0x3);
                if (class517.field7513 == arg2) {
                    class30.field370 = var5.field1274;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILtf;)V", line = 320)
    public final void method1062(int arg0, class539 arg1) {
        arg1.field7890 = false;
        if (arg0 != -6) {
            method1061(null, 93, 83);
        }
        field2210++;
        arg1.method239(arg0 + 6);
        arg1.method947((byte) 115);
        this.method1068(-7911);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 334)
    public final void method1063(byte arg0) {
        field2221++;
        int var2 = 17 % ((arg0 + 75) / 32);
        if (!this.field2228) {
            return;
        }
        if (this.field2208 != null) {
            int var3 = 16384;
            this.field2226.method1737(this.field2208, (byte) 54);
            this.field2226.method1714(this.field2213, (byte) 62);
            this.field2208.method214(false, 0);
            this.field2213.method213((byte) -89, 0);
            if (this.field2241) {
                var3 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field2222, this.field2220, 0, 0, this.field2222, this.field2220, var3, 9728);
            this.field2226.method1771((byte) 111, this.field2208);
            this.field2226.method1787((byte) -63, this.field2213);
        }
        this.field2226.method1758((byte) 121);
        this.field2226.method1732(0, 9);
        this.field2226.method1734(-49, 1);
        this.field2226.method577();
        int var4 = 0;
        int var5 = 1;
        class539 var7;
        for (class539 var6 = (class539) this.field2223.method295((byte) 117); var6 != null; var6 = var7) {
            var7 = (class539) this.field2223.method296(true);
            int var8 = var6.method3169(1);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method241((byte) -94, this.field2237[var4], this.field2239, var9);
                if (var7 == null && var8 - 1 == var9) {
                    this.field2226.method1782(this.field2213, true);
                    this.field2226.method1755(123, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2220);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2227, this.field2211);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2227, this.field2220 + this.field2211);
                    OpenGL.glTexCoord2f((float) this.field2222, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2227 + this.field2222, this.field2220 + this.field2211);
                    OpenGL.glTexCoord2f((float) this.field2222, (float) this.field2220);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2227 + this.field2222, this.field2211);
                    OpenGL.glEnd();
                } else {
                    this.field2213.method213((byte) -86, var5);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field2220);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field2220);
                    OpenGL.glTexCoord2f((float) this.field2222, (float) this.field2220);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field2222, this.field2220);
                    OpenGL.glTexCoord2f((float) this.field2222, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field2222, 0);
                    OpenGL.glEnd();
                }
                var6.method245(false, var9);
                var5 = var5 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field2228 = false;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)Z", line = 443)
    private final boolean method1064(byte arg0) {
        if (this.field2232) {
            if (this.field2234 != null) {
                this.field2234.method1970(arg0 ^ 0xFFFFBA2D);
                this.field2234 = null;
            }
            if (this.field2239 != null) {
                this.field2239.method1201((byte) 127);
                this.field2239 = null;
            }
            if (this.field2208 != null) {
                this.field2234 = new class296(this.field2226, 6402, this.field2222, this.field2220, this.field2226.field3909);
            }
            if (this.field2241) {
                this.field2239 = new class65(this.field2226, 34037, 6402, this.field2222, this.field2220);
            } else if (this.field2234 == null) {
                this.field2234 = new class296(this.field2226, 6402, this.field2222, this.field2220);
            }
            this.field2240 = true;
            this.field2232 = false;
            this.field2233 = true;
        }
        field2215++;
        if (this.field2235) {
            if (this.field2231 != null) {
                this.field2231.method1970(-17889);
                this.field2231 = null;
            }
            if (this.field2237[0] != null) {
                this.field2237[0].method1201((byte) -48);
                this.field2237[0] = null;
            }
            if (this.field2237[1] != null) {
                this.field2237[1].method1201((byte) -21);
                this.field2237[1] = null;
            }
            if (this.field2208 != null) {
                this.field2231 = new class296(this.field2226, this.field2236, this.field2222, this.field2220, this.field2226.field3909);
            }
            this.field2237[0] = new class65(this.field2226, 34037, this.field2236, this.field2222, this.field2220);
            this.field2237[1] = this.field2238 > 1 ? new class65(this.field2226, 34037, this.field2236, this.field2222, this.field2220) : null;
            this.field2240 = true;
            this.field2235 = false;
            this.field2233 = true;
        }
        if (arg0 != 50) {
            this.field2228 = false;
        }
        if (this.field2233) {
            if (this.field2208 == null) {
                this.field2226.method1765(this.field2213, (byte) 21);
                this.field2213.method231((byte) -126, 0);
                this.field2213.method231((byte) -123, 1);
                this.field2213.method231((byte) -122, 8);
                this.field2213.method228((byte) -118, this.field2237[0], 0);
                if (this.field2238 > 1) {
                    this.field2213.method228((byte) -127, this.field2237[1], 1);
                }
                if (this.field2241) {
                    this.field2213.method228((byte) -109, this.field2239, 8);
                } else {
                    this.field2213.method230(this.field2234, false, 8);
                }
                this.field2226.method1782(this.field2213, true);
            } else {
                this.field2226.method1765(this.field2213, (byte) 21);
                this.field2213.method231((byte) -127, 0);
                this.field2213.method231((byte) 61, 1);
                this.field2213.method231((byte) -127, 8);
                this.field2213.method228((byte) 21, this.field2237[0], 0);
                if (this.field2238 > 1) {
                    this.field2213.method228((byte) -121, this.field2237[1], 1);
                }
                if (this.field2241) {
                    this.field2213.method228((byte) -122, this.field2239, 8);
                }
                this.field2226.method1782(this.field2213, true);
                this.field2226.method1765(this.field2208, (byte) 21);
                this.field2208.method231((byte) 127, 0);
                this.field2208.method231((byte) 90, 8);
                this.field2208.method230(this.field2231, false, 0);
                this.field2208.method230(this.field2234, false, 8);
                this.field2226.method1782(this.field2208, true);
            }
            this.field2233 = false;
            this.field2240 = true;
        }
        if (this.field2240) {
            this.field2226.method1765(this.field2214, (byte) 21);
            this.field2240 = !this.field2214.method220(-16793);
            this.field2226.method1782(this.field2214, true);
        }
        return !this.field2240;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ltt;)V", line = 879)
    public class149(class249 arg0) {
        this.field2226 = arg0;
        if (this.field2226.field3993 && this.field2226.field3987) {
            this.field2214 = this.field2213 = new class35(this.field2226);
            if (this.field2226.field3909 > 1 && this.field2226.field4042 && this.field2226.field3999) {
                this.field2214 = this.field2208 = new class35(this.field2226);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 583)
    public static final String[] method1065(int arg0, String[] arg1) {
        field2218++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0 == -2025704630) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)Z", line = 612)
    public final boolean method1066(boolean arg0) {
        if (arg0) {
            this.field2228 = true;
        }
        field2212++;
        return this.field2214 != null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIB)Z", line = 623)
    public final boolean method1067(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -42) {
            this.field2231 = null;
        }
        field2209++;
        if (this.field2214 == null || this.field2223.method293((byte) 97)) {
            return false;
        }
        if (this.field2222 != arg1 || this.field2220 != arg2) {
            this.field2222 = arg1;
            this.field2220 = arg2;
            for (class130 var6 = this.field2223.method295((byte) -96); var6 != this.field2223.field690; var6 = var6.field1934) {
                ((class539) var6).method244(1, this.field2220, this.field2222);
            }
            this.field2235 = true;
            this.field2233 = true;
            this.field2232 = true;
        }
        if (!this.method1064((byte) 50)) {
            return false;
        }
        this.field2211 = arg3;
        this.field2228 = true;
        this.field2227 = arg0;
        this.field2226.method1765(this.field2214, (byte) 21);
        this.field2214.method213((byte) -93, 0);
        this.field2226.method1755(126, this.field2220 - this.field2214.method222(false) - this.field2211, -this.field2227);
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 671)
    private final void method1068(int arg0) {
        field2217++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -7911) {
            this.field2211 = 36;
        }
        for (class539 var5 = (class539) this.field2223.method295((byte) 122); var5 != null; var5 = (class539) this.field2223.method296(true)) {
            int var9 = var5.method240(120);
            var4 += var5.method3169(1);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method3173((byte) -8);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field2236 != var6) {
            this.field2236 = var6;
            this.field2235 = true;
        }
        int var7 = this.field2238 > 2 ? 2 : this.field2238;
        int var8 = var4 > 2 ? 2 : var4;
        this.field2238 = var4;
        if (this.field2241 != var2) {
            this.field2241 = var2;
            this.field2232 = true;
        }
        if (var7 != var8) {
            this.field2233 = this.field2235 = true;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 733)
    public final void method1069(int arg0) {
        this.field2214 = this.field2208 = this.field2213 = null;
        this.field2239 = null;
        this.field2237 = null;
        this.field2234 = null;
        if (arg0 != -389) {
            return;
        }
        this.field2231 = null;
        field2225++;
        if (!this.field2223.method293((byte) 105)) {
            for (class130 var2 = this.field2223.method295((byte) 17); var2 != this.field2223.field690; var2 = var2.field1934) {
                ((class539) var2).method239(0);
            }
        }
        this.field2222 = this.field2220 = 1;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)V", line = 768)
    public static void method1070(boolean arg0) {
        field2230 = null;
        if (!arg0) {
            method1065(-40, null);
        }
        field2219 = null;
        field2229 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ltf;Z)Z", line = 789)
    public final boolean method1071(class539 arg0, boolean arg1) {
        field2216++;
        if (arg1) {
            return true;
        }
        if (this.field2214 != null) {
            if (arg0.method242(1) || arg0.method243(-14169)) {
                this.field2223.method292((byte) 121, arg0);
                this.method1068(-7911);
                if (this.method1064((byte) 50)) {
                    if (this.field2222 != -1 && this.field2220 != -1) {
                        arg0.method244(1, this.field2220, this.field2222);
                    }
                    arg0.field7890 = true;
                    return true;
                }
            }
            this.method1062(-6, arg0);
        }
        return false;
    }
}
