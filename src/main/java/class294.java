import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class294 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    private int field4456 = 0;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    private int field4462 = 1;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    private int field4470 = 0;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    private int field4463 = 1;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Loe;")
    private class137 field4458 = new class137();

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    private int field4478 = 0;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
    private boolean field4481 = true;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "Z")
    private boolean field4485 = true;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "Z")
    private boolean field4482 = true;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "Z")
    private boolean field4480 = false;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    private int field4483 = -1;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "[Lfo;")
    private class361[] field4486 = new class361[2];

    @OriginalMember(owner = "client!un", name = "G", descriptor = "Z")
    private boolean field4488 = true;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "Lkd;")
    private class188 field4475;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Ltv;")
    private class395 field4468;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Ltv;")
    private class395 field4474;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Ltv;")
    private class395 field4469;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Lhn;")
    public static class509 field4464 = new class509(41, 8);

    @OriginalMember(owner = "client!un", name = "q", descriptor = "F")
    public static float field4472;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "Lgb;")
    private class146 field4479;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "Lgb;")
    private class146 field4487;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Lfo;")
    private class361 field4489;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
    private boolean field4457;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "[[[I")
    public static int[][][] field4484;

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lkd;)V", line = 576)
    public class294(class188 arg0) {
        this.field4475 = arg0;
        if (this.field4475.field3145 && this.field4475.field3051) {
            this.field4474 = this.field4468 = new class395(this.field4475);
            if (this.field4475.field3017 > 1 && this.field4475.field3133 && this.field4475.field3075) {
                this.field4474 = this.field4469 = new class395(this.field4475);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lpb;I)Z", line = 12)
    public final boolean method1909(class468 arg0, int arg1) {
        field4466++;
        if (arg1 < 66) {
            this.method1916(null, (byte) -63);
        }
        if (this.field4474 != null) {
            if (arg0.method652(0) || arg0.method656(true)) {
                this.field4458.method994(arg0, -3610);
                this.method1915((byte) -127);
                if (this.method1913(true)) {
                    if (this.field4462 != -1 && this.field4463 != -1) {
                        arg0.method648(-62, this.field4462, this.field4463);
                    }
                    arg0.field6759 = true;
                    return true;
                }
            }
            this.method1916(arg0, (byte) 11);
        }
        return false;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method1910(int arg0) {
        if (arg0 != 0) {
            this.method1909(null, -8);
        }
        field4476++;
        return this.field4474 != null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 65)
    public final void method1911(byte arg0) {
        this.field4489 = null;
        this.field4479 = null;
        field4467++;
        this.field4474 = this.field4469 = this.field4468 = null;
        this.field4487 = null;
        this.field4486 = null;
        if (!this.field4458.method1005((byte) -124)) {
            for (class431 var2 = this.field4458.method1004((byte) -93); var2 != this.field4458.field2077; var2 = var2.field6384) {
                ((class468) var2).method649(-27396);
            }
        }
        this.field4462 = this.field4463 = 1;
        if (arg0 != -121) {
            method1912(126, null, 1, 28, -117);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILic;III)V", line = 100)
    public static final void method1912(int arg0, class495 arg1, int arg2, int arg3, int arg4) {
        field4460++;
        long var5 = (long) (arg2 << 14 | arg0 << 28 | arg4);
        class433 var7 = (class433) class334.field4985.method2585((byte) 114, var5);
        if (var7 == null) {
            class433 var8 = new class433();
            class334.field4985.method2591(var5, var8, (byte) 96);
            var8.field6407.method994(arg1, -3610);
            return;
        }
        class532 var9 = class390.field5847.method467((byte) -101, arg1.field7134);
        int var10 = var9.field7818;
        if (var9.field7812 == 1) {
            var10 = (arg1.field7137 + 1) * var10;
        }
        if (arg3 < 73) {
            field4464 = null;
        }
        for (class495 var11 = (class495) var7.field6407.method1004((byte) -84); var11 != null; var11 = (class495) var7.field6407.method996(1)) {
            class532 var12 = class390.field5847.method467((byte) -101, var11.field7134);
            int var13 = var12.field7818;
            if (var12.field7812 == 1) {
                var13 = (var11.field7137 + 1) * var13;
            }
            if (var13 < var10) {
                class287.method1852(arg1, var11, true);
                return;
            }
        }
        var7.field6407.method994(arg1, -3610);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)Z", line = 162)
    private final boolean method1913(boolean arg0) {
        field4471++;
        if (this.field4481) {
            if (this.field4479 != null) {
                this.field4479.method1032(-10755);
                this.field4479 = null;
            }
            if (this.field4489 != null) {
                this.field4489.method2763((byte) 75);
                this.field4489 = null;
            }
            if (this.field4469 != null) {
                this.field4479 = new class146(this.field4475, 6402, this.field4462, this.field4463, this.field4475.field3017);
            }
            if (this.field4480) {
                this.field4489 = new class361(this.field4475, 34037, 6402, this.field4462, this.field4463);
            } else if (this.field4479 == null) {
                this.field4479 = new class146(this.field4475, 6402, this.field4462, this.field4463);
            }
            this.field4481 = false;
            this.field4488 = true;
            this.field4482 = true;
        }
        if (this.field4485) {
            if (this.field4487 != null) {
                this.field4487.method1032(-10755);
                this.field4487 = null;
            }
            if (this.field4486[0] != null) {
                this.field4486[0].method2763((byte) 75);
                this.field4486[0] = null;
            }
            if (this.field4486[1] != null) {
                this.field4486[1].method2763((byte) 75);
                this.field4486[1] = null;
            }
            if (this.field4469 != null) {
                this.field4487 = new class146(this.field4475, this.field4483, this.field4462, this.field4463, this.field4475.field3017);
            }
            this.field4486[0] = new class361(this.field4475, 34037, this.field4483, this.field4462, this.field4463);
            this.field4486[1] = this.field4478 > 1 ? new class361(this.field4475, 34037, this.field4483, this.field4462, this.field4463) : null;
            this.field4488 = true;
            this.field4482 = true;
            this.field4485 = false;
        }
        if (!arg0) {
            field4472 = -0.4194019F;
        }
        if (this.field4482) {
            if (this.field4469 == null) {
                this.field4475.method1284(5122, this.field4468);
                this.field4468.method2489(0, true);
                this.field4468.method2489(1, true);
                this.field4468.method2489(8, true);
                this.field4468.method2491(0, (byte) -128, this.field4486[0]);
                if (this.field4478 > 1) {
                    this.field4468.method2491(1, (byte) -128, this.field4486[1]);
                }
                if (this.field4480) {
                    this.field4468.method2491(8, (byte) -128, this.field4489);
                } else {
                    this.field4468.method2484(-126, this.field4479, 8);
                }
                this.field4475.method1283(this.field4468, true);
            } else {
                this.field4475.method1284(5122, this.field4468);
                this.field4468.method2489(0, true);
                this.field4468.method2489(1, arg0);
                this.field4468.method2489(8, true);
                this.field4468.method2491(0, (byte) -128, this.field4486[0]);
                if (this.field4478 > 1) {
                    this.field4468.method2491(1, (byte) -128, this.field4486[1]);
                }
                if (this.field4480) {
                    this.field4468.method2491(8, (byte) -128, this.field4489);
                }
                this.field4475.method1283(this.field4468, true);
                this.field4475.method1284(5122, this.field4469);
                this.field4469.method2489(0, true);
                this.field4469.method2489(8, true);
                this.field4469.method2484(-74, this.field4487, 0);
                this.field4469.method2484(-104, this.field4479, 8);
                this.field4475.method1283(this.field4469, true);
            }
            this.field4488 = true;
            this.field4482 = false;
        }
        if (this.field4488) {
            this.field4475.method1284(5122, this.field4474);
            this.field4488 = !this.field4474.method2488(105);
            this.field4475.method1283(this.field4474, true);
        }
        return !this.field4488;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 295)
    public final void method1914(int arg0) {
        field4465++;
        if (!this.field4457) {
            return;
        }
        if (this.field4469 != null) {
            this.field4475.method1264(this.field4469, -112);
            int var2 = 16384;
            this.field4475.method1315(0, this.field4468);
            this.field4469.method2490(0, (byte) -112);
            this.field4468.method2483(0, (byte) 124);
            if (this.field4480) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4462, this.field4463, 0, 0, this.field4462, this.field4463, var2, 9728);
            this.field4475.method1318(this.field4469, 109);
            this.field4475.method1269(this.field4468, (byte) 96);
        }
        this.field4475.method1314(2);
        int var3 = 71 / ((33 - arg0) / 32);
        this.field4475.method1291(0, false);
        this.field4475.method1248(1, true);
        this.field4475.method267();
        int var4 = 0;
        int var5 = 1;
        class468 var7;
        for (class468 var6 = (class468) this.field4458.method1004((byte) -101); var6 != null; var6 = var7) {
            var7 = (class468) this.field4458.method996(1);
            int var8 = var6.method2824((byte) 121);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method653(this.field4489, 1, var9, this.field4486[var4]);
                if (var7 == null && (var8 - 1) == var9) {
                    this.field4475.method1283(this.field4468, true);
                    this.field4475.method1281(-123, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4463);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4470, this.field4456);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4470, this.field4456 + this.field4463);
                    OpenGL.glTexCoord2f((float) this.field4462, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4470 + this.field4462, this.field4456 - -this.field4463);
                    OpenGL.glTexCoord2f((float) this.field4462, (float) this.field4463);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4470 + this.field4462, this.field4456);
                    OpenGL.glEnd();
                } else {
                    this.field4468.method2483(var5, (byte) 124);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4463);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4463);
                    OpenGL.glTexCoord2f((float) this.field4462, (float) this.field4463);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4462, this.field4463);
                    OpenGL.glTexCoord2f((float) this.field4462, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4462, 0);
                    OpenGL.glEnd();
                }
                var5 = var5 + 1 & 0x1;
                var6.method654(var9, 7573);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field4457 = false;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V", line = 398)
    private final void method1915(byte arg0) {
        field4477++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class468 var5 = (class468) this.field4458.method1004((byte) -112); var5 != null; var5 = (class468) this.field4458.method996(1)) {
            int var9 = var5.method655(true);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2824((byte) 127);
            var2 |= var5.method2826((byte) 87);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4483 != var6) {
            this.field4485 = true;
            this.field4483 = var6;
        }
        int var7 = this.field4478 <= 2 ? this.field4478 : 2;
        if (arg0 > -120) {
            this.method1915((byte) 29);
        }
        int var8 = var4 <= 2 ? var4 : 2;
        this.field4478 = var4;
        if (var7 != var8) {
            this.field4482 = this.field4485 = true;
        }
        if (this.field4480 != var2) {
            this.field4481 = true;
            this.field4480 = var2;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lpb;B)V", line = 462)
    public final void method1916(class468 arg0, byte arg1) {
        field4473++;
        if (arg1 == 11) {
            arg0.field6759 = false;
            arg0.method649(-27396);
            arg0.method2677(-22491);
            this.method1915((byte) -122);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)Z", line = 476)
    public final boolean method1917(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 27795) {
            this.field4478 = 34;
        }
        field4459++;
        if (this.field4474 == null || this.field4458.method1005((byte) -85)) {
            return false;
        }
        if (this.field4462 != arg1 || this.field4463 != arg0) {
            this.field4463 = arg0;
            this.field4462 = arg1;
            for (class431 var6 = this.field4458.method1004((byte) -73); var6 != this.field4458.field2077; var6 = var6.field6384) {
                ((class468) var6).method648(arg3 - 27848, this.field4462, this.field4463);
            }
            this.field4485 = true;
            this.field4481 = true;
            this.field4482 = true;
        }
        if (!this.method1913(true)) {
            return false;
        }
        this.field4470 = arg2;
        this.field4457 = true;
        this.field4456 = arg4;
        this.field4475.method1284(5122, this.field4474);
        this.field4474.method2483(0, (byte) 124);
        this.field4475.method1281(-112, this.field4463 - this.field4474.method2485(-20648) - this.field4456, -this.field4470);
        return true;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 525)
    public static void method1918(int arg0) {
        field4484 = null;
        field4464 = null;
        if (arg0 >= -20) {
            field4461 = -2;
        }
    }
}
