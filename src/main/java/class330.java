import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class330 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    private int field4465 = 1;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    private int field4472 = 0;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    private int field4476 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field4479 = 1;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lmr;")
    private class611 field4464 = new class611();

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    private int field4482 = -1;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Z")
    private boolean field4485 = true;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    private int field4481 = 0;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Z")
    private boolean field4484 = true;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Z")
    private boolean field4488 = true;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
    private boolean field4487 = true;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lol;")
    private class246[] field4489 = new class246[2];

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Z")
    private boolean field4486 = false;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lkw;")
    private class346 field4471;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Ltg;")
    private class604 field4468;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ltg;")
    private class604 field4475;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Ltg;")
    private class604 field4480;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Lol;")
    private class246 field4492;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "Lso;")
    private class537 field4490;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Lso;")
    private class537 field4491;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
    private boolean field4462;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZIII)Z")
    public final boolean method2027(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4469++;
        if (this.field4475 == null || this.field4464.method3555(124)) {
            return false;
        }
        if (arg1) {
            this.method2036((byte) -117);
        }
        if (this.field4479 != arg2 || this.field4465 != arg4) {
            this.field4465 = arg4;
            this.field4479 = arg2;
            for (class430 var6 = this.field4464.method3565(-18); var6 != this.field4464.field8734; var6 = var6.field6189) {
                ((class126) var6).method883(this.field4465, 117, this.field4479);
            }
            this.field4487 = true;
            this.field4488 = true;
            this.field4484 = true;
        }
        if (!this.method2028(25847)) {
            return false;
        }
        this.field4462 = true;
        this.field4472 = arg0;
        this.field4476 = arg3;
        this.field4471.method2195(this.field4475, 85);
        this.field4475.method3521(0, -23712);
        this.field4471.method2188(-this.field4476, 127, this.field4465 + this.field4472 - this.field4471.field4763);
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Z")
    private final boolean method2028(int arg0) {
        field4483++;
        if (arg0 != 25847) {
            return true;
        }
        if (this.field4487) {
            if (this.field4491 != null) {
                this.field4491.method3243((byte) 48);
                this.field4491 = null;
            }
            if (this.field4492 != null) {
                this.field4492.method1127(arg0 ^ 0x64F7);
                this.field4492 = null;
            }
            if (this.field4480 != null) {
                this.field4491 = new class537(this.field4471, 6402, this.field4479, this.field4465, this.field4471.field4963);
            }
            if (this.field4486) {
                this.field4492 = new class246(this.field4471, 34037, 6402, this.field4479, this.field4465);
            } else if (this.field4491 == null) {
                this.field4491 = new class537(this.field4471, 6402, this.field4479, this.field4465);
            }
            this.field4484 = true;
            this.field4487 = false;
            this.field4485 = true;
        }
        if (this.field4488) {
            if (this.field4490 != null) {
                this.field4490.method3243((byte) 71);
                this.field4490 = null;
            }
            if (this.field4489[0] != null) {
                this.field4489[0].method1127(0);
                this.field4489[0] = null;
            }
            if (this.field4489[1] != null) {
                this.field4489[1].method1127(0);
                this.field4489[1] = null;
            }
            if (this.field4480 != null) {
                this.field4490 = new class537(this.field4471, this.field4482, this.field4479, this.field4465, this.field4471.field4963);
            }
            this.field4489[0] = new class246(this.field4471, 34037, this.field4482, this.field4479, this.field4465);
            this.field4489[1] = this.field4481 > 1 ? new class246(this.field4471, 34037, this.field4482, this.field4479, this.field4465) : null;
            this.field4484 = true;
            this.field4485 = true;
            this.field4488 = false;
        }
        if (this.field4484) {
            if (this.field4480 == null) {
                this.field4471.method2195(this.field4468, 87);
                this.field4468.method3519(0, -86);
                this.field4468.method3519(1, 52);
                this.field4468.method3519(8, arg0 ^ 0xFFFF9B5A);
                this.field4468.method3527(0, false, this.field4489[0]);
                if (this.field4481 > 1) {
                    this.field4468.method3527(1, false, this.field4489[1]);
                }
                if (this.field4486) {
                    this.field4468.method3527(8, false, this.field4492);
                } else {
                    this.field4468.method3517(8, this.field4491, (byte) 96);
                }
                this.field4471.method2193(120, this.field4468);
            } else {
                this.field4471.method2195(this.field4468, 113);
                this.field4468.method3519(0, 117);
                this.field4468.method3519(1, arg0 ^ 0x64D8);
                this.field4468.method3519(8, 126);
                this.field4468.method3527(0, false, this.field4489[0]);
                if (this.field4481 > 1) {
                    this.field4468.method3527(1, false, this.field4489[1]);
                }
                if (this.field4486) {
                    this.field4468.method3527(8, false, this.field4492);
                }
                this.field4471.method2193(106, this.field4468);
                this.field4471.method2195(this.field4480, 87);
                this.field4480.method3519(0, 115);
                this.field4480.method3519(8, -124);
                this.field4480.method3517(0, this.field4490, (byte) 90);
                this.field4480.method3517(8, this.field4491, (byte) 97);
                this.field4471.method2193(67, this.field4480);
            }
            this.field4485 = true;
            this.field4484 = false;
        }
        if (this.field4485) {
            this.field4471.method2195(this.field4475, arg0 - 25797);
            this.field4485 = !this.field4475.method3522((byte) -70);
            this.field4471.method2193(100, this.field4475);
        }
        return !this.field4485;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    private final void method2029(byte arg0) {
        field4467++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class126 var5 = (class126) this.field4464.method3565(118); var5 != null; var5 = (class126) this.field4464.method3561((byte) 101)) {
            int var9 = var5.method891(-65);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method894(-8924);
            var2 |= var5.method893((byte) 126);
        }
        if (arg0 != 1) {
            method2035('s', null, (byte) -85);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4482 != var6) {
            this.field4488 = true;
            this.field4482 = var6;
        }
        int var7 = this.field4481 <= 2 ? this.field4481 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (this.field4486 != var2) {
            this.field4487 = true;
            this.field4486 = var2;
        }
        this.field4481 = var4;
        if (var7 != var8) {
            this.field4484 = this.field4488 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
    public static final boolean method2030(int arg0, int arg1) {
        if (arg1 > -9) {
            return true;
        } else {
            field4470++;
            return arg0 == 0 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method2031(boolean arg0) {
        field4478++;
        this.field4492 = null;
        this.field4489 = null;
        this.field4491 = null;
        this.field4490 = null;
        this.field4475 = this.field4480 = this.field4468 = null;
        if (!this.field4464.method3555(93)) {
            for (class430 var2 = this.field4464.method3565(-127); var2 != this.field4464.field8734; var2 = var2.field6189) {
                ((class126) var2).method888(-20962);
            }
        }
        this.field4479 = this.field4465 = 1;
        if (arg0) {
            this.method2036((byte) -55);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lf;I)Z")
    public final boolean method2032(class126 arg0, int arg1) {
        field4493++;
        if (this.field4475 != null) {
            if (arg0.method889(arg1 ^ 0x62) || arg0.method881((byte) -92)) {
                this.field4464.method3559(arg0, (byte) 12);
                this.method2029((byte) 1);
                if (this.method2028(25847)) {
                    if (this.field4479 != -1 && this.field4465 != -1) {
                        arg0.method883(this.field4465, 118, this.field4479);
                    }
                    arg0.field1746 = true;
                    return true;
                }
            }
            this.method2037(arg0, 34842);
        }
        if (arg1 != 8) {
            this.field4488 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLha;Lla;)V")
    public static final void method2033(boolean arg0, class543 arg1, class423 arg2) {
        field4473++;
        class676[] var3 = class676.method3846(arg2, class744.field10384, 0);
        class166.field2361 = new class515[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class166.field2361[var4] = arg1.method202(var3[var4], true);
        }
        class676[] var5 = class676.method3846(arg2, class613.field8756, 0);
        class663.field9475 = new class515[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class663.field9475[var6] = arg1.method202(var5[var6], true);
        }
        class676[] var7 = class676.method3846(arg2, class642.field9132, 0);
        class711.field10018 = new class515[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class711.field10018[var8] = arg1.method202(var7[var8], true);
        }
        class676[] var9 = class676.method3846(arg2, class746.field10414, 0);
        class25.field222 = new class515[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class25.field222[var10] = arg1.method202(var9[var10], true);
        }
        class676[] var11 = class676.method3846(arg2, class663.field9476, 0);
        class589.field8382 = new class515[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class589.field8382[var12] = arg1.method202(var11[var12], true);
        }
        class676[] var13 = class676.method3846(arg2, class675.field9609, 0);
        class242.field3575 = new class515[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class242.field3575[var14] = arg1.method202(var13[var14], true);
        }
        class676[] var15 = class676.method3846(arg2, class73.field1101, 0);
        class121.field1650 = new class515[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class121.field1650[var16] = arg1.method202(var15[var16], true);
        }
        class676[] var17 = class676.method3846(arg2, class91.field1300, 0);
        class690.field9787 = new class515[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class690.field9787[var18] = arg1.method202(var17[var18], true);
        }
        class676[] var19 = class676.method3846(arg2, class286.field3980, 0);
        class703.field9911 = new class515[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class703.field9911[var20] = arg1.method202(var19[var20], true);
        }
        class676[] var21 = class676.method3846(arg2, class647.field9317, 0);
        class168.field2376 = new class515[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class168.field2376[var22] = arg1.method202(var21[var22], true);
        }
        class676[] var23 = class676.method3846(arg2, class693.field9814, 0);
        class285.field3967 = new class515[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class285.field3967[var24] = arg1.method202(var23[var24], true);
        }
        class676[] var25 = class676.method3846(arg2, class490.field7061, 0);
        class139.field1899 = new class515[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class139.field1899[var26] = arg1.method202(var25[var26], true);
        }
        class757.field10543 = arg1.method202(class676.method3850(arg2, class558.field8114, 0), true);
        class755.field10511 = arg1.method202(class676.method3850(arg2, class507.field7372, 0), arg0);
        class676[] var27 = class676.method3846(arg2, class695.field9831, 0);
        class357.field5267 = new class515[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class357.field5267[var28] = arg1.method202(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
    public final boolean method2034(int arg0) {
        field4477++;
        if (arg0 != -7297) {
            this.field4492 = null;
        }
        return this.field4475 != null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2035(char arg0, String arg1, byte arg2) {
        field4463++;
        int var3 = class271.method1772(arg1, 0, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = -15 % ((51 - arg2) / 38);
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg1.charAt(var9) != arg0; var9++) {
            }
            var4[var5++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = arg1.substring(var7);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public final void method2036(byte arg0) {
        field4466++;
        if (!this.field4462) {
            return;
        }
        if (this.field4480 != null) {
            this.field4471.method2147((byte) -99, this.field4480);
            int var2 = 16384;
            this.field4471.method2131(this.field4468, -57);
            this.field4480.method3524((byte) 121, 0);
            this.field4468.method3521(0, -23712);
            if (this.field4486) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4479, this.field4465, 0, 0, this.field4479, this.field4465, var2, 9728);
            this.field4471.method2175(80, this.field4480);
            this.field4471.method2192(this.field4468, (byte) 53);
        }
        this.field4471.method2172(116);
        this.field4471.method2138(27032, 0);
        this.field4471.method2120(1, 34);
        this.field4471.method328();
        int var3 = -8 / ((65 - arg0) / 34);
        int var4 = 0;
        int var5 = 1;
        class126 var7;
        for (class126 var6 = (class126) this.field4464.method3565(-83); var6 != null; var6 = var7) {
            var7 = (class126) this.field4464.method3561((byte) 90);
            int var8 = var6.method894(-8924);
            for (int var9 = 0; var9 < var8; var9++) {
                var6.method886(var9, this.field4489[var4], this.field4492, 0);
                if (var7 == null && var8 - 1 == var9) {
                    this.field4471.method2193(55, this.field4468);
                    this.field4471.method2188(0, 119, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4465);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4476, this.field4472);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4476, this.field4472 + this.field4465);
                    OpenGL.glTexCoord2f((float) this.field4479, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4479 + this.field4476, this.field4472 + this.field4465);
                    OpenGL.glTexCoord2f((float) this.field4479, (float) this.field4465);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4479 + this.field4476, this.field4472);
                    OpenGL.glEnd();
                } else {
                    this.field4468.method3521(var5, -23712);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4465);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field4465);
                    OpenGL.glTexCoord2f((float) this.field4479, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4479, this.field4465);
                    OpenGL.glTexCoord2f((float) this.field4479, (float) this.field4465);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4479, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var6.method892(103, var9);
                var5 = var5 + 1 & 0x1;
            }
        }
        this.field4462 = false;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lf;I)V")
    public final void method2037(class126 arg0, int arg1) {
        field4474++;
        if (arg1 != 34842) {
            this.field4475 = null;
        }
        arg0.field1746 = false;
        arg0.method888(-20962);
        arg0.method2656((byte) 117);
        this.method2029((byte) 1);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lkw;)V")
    public class330(class346 arg0) {
        this.field4471 = arg0;
        if (this.field4471.field5006 && this.field4471.field5035) {
            this.field4475 = this.field4468 = new class604(this.field4471);
            if (this.field4471.field4963 > 1 && this.field4471.field5050 && this.field4471.field5076) {
                this.field4475 = this.field4480 = new class604(this.field4471);
                return;
            }
        }
    }
}
