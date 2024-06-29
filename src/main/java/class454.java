import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class454 extends class592 {

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
    private boolean field5923 = false;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Z")
    private boolean field5921;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Lgfa;")
    private class660[] field5919;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
    public static boolean field5922 = false;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Loo;")
    public static class10 field5927;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Luj;")
    private class554 field5918;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 3)
    public static void method2557(int arg0) {
        field5927 = null;
        int var1 = -17 % ((arg0 - -9) / 44);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 15)
    private final void method2558(int arg0) {
        ++field5926;
        this.field5918 = new class554(super.field8014, 2);
        this.field5918.method2971(0, 4864);
        super.field8014.method3469(1, false);
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
        int var2 = 11 / ((arg0 - 11) / 52);
        if (!this.field5921) {
            super.field8014.method3462(8448, -5882, 7681);
            super.field8014.method3453(false, 768, 34168, 0);
            super.field8014.method3469(2, false);
            super.field8014.method3462(7681, -5882, 260);
            super.field8014.method3453(false, 768, 34168, 0);
            super.field8014.method3453(false, 770, 34168, 1);
            super.field8014.method3389((byte) 94, 770, 0, 34167);
        } else {
            super.field8014.method3462(7681, -5882, 260);
            super.field8014.method3453(false, 770, 5890, 0);
            super.field8014.method3389((byte) 100, 770, 0, 34167);
        }
        super.field8014.method3469(0, false);
        this.field5918.method2969((byte) 64);
        this.field5918.method2971(1, 4864);
        super.field8014.method3469(1, false);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field5921) {
            super.field8014.method3462(8448, -5882, 8448);
            super.field8014.method3453(false, 768, 5890, 0);
            super.field8014.method3469(2, false);
            super.field8014.method3462(8448, -5882, 8448);
            super.field8014.method3453(false, 768, 5890, 0);
            super.field8014.method3453(false, 768, 34168, 1);
            super.field8014.method3389((byte) 89, 770, 0, 5890);
        } else {
            super.field8014.method3462(8448, -5882, 8448);
            super.field8014.method3453(false, 768, 5890, 0);
            super.field8014.method3389((byte) 107, 770, 0, 5890);
        }
        super.field8014.method3469(0, false);
        this.field5918.method2969((byte) -85);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V", line = 83)
    public final void method32(int arg0, boolean arg1) {
        ++field5924;
        if (arg0 == -1) {
            if (this.field5918 != null && arg1) {
                if (!this.field5921) {
                    super.field8014.method3469(2, false);
                    super.field8014.method3388(super.field8014.field8652, false);
                    super.field8014.method3469(0, false);
                }
                this.field5918.method2973(26497, '\u0000');
                this.field5923 = true;
            } else {
                super.field8014.method3389((byte) 123, 770, 0, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lji;)V", line = 111)
    public class454(class622 arg0) {
        super(arg0);
        if (arg0.field8615) {
            this.field5921 = arg0.field8672 < 3;
            int var2 = this.field5921 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (var14 == 2) {
                            var15 = var12;
                        } else if (~var14 == -4) {
                            var15 = -var12;
                        } else if (~var14 != -5) {
                            var15 = -var11;
                        } else {
                            var15 = var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field5919 = new class660[3];
            this.field5919[0] = new class660(super.field8014, 6406, 64, false, var4, 6406);
            this.field5919[1] = new class660(super.field8014, 6406, 64, false, var5, 6406);
            this.field5919[2] = new class660(super.field8014, 6406, 64, false, var3, 6406);
            this.method2558(-76);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILgq;)V", line = 225)
    public final void method35(int arg0, int arg1, class710 arg2) {
        ++field5928;
        if (arg1 != 458752) {
            this.field5923 = true;
        }
        super.field8014.method3388(arg2, false);
        super.field8014.method3443(arg0, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)V", line = 237)
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field5929;
        if (this.field5923) {
            super.field8014.method3469(1, false);
            super.field8014.method3388(this.field5919[arg1 + -1], arg0);
            super.field8014.method3469(0, false);
        }
        if (arg0) {
            method2559((class43) null, 116, -14, (class151) null, -45, -60, 63, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 74, (byte) 61, 110, 34, false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 257)
    public final void method29(int arg0) {
        ++field5920;
        if (this.field5923) {
            if (!this.field5921) {
                super.field8014.method3469(2, false);
                super.field8014.method3388((class710) null, false);
            }
            super.field8014.method3469(1, false);
            super.field8014.method3388((class710) null, false);
            super.field8014.method3469(0, false);
            this.field5918.method2973(26497, '\u0001');
            this.field5923 = false;
        } else {
            super.field8014.method3389((byte) 117, 770, 0, 5890);
        }
        if (arg0 == -1640) {
            super.field8014.method3462(8448, arg0 + -4242, 8448);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)Z", line = 292)
    public final boolean method30(byte arg0) {
        if (arg0 > -90) {
            return true;
        } else {
            ++field5917;
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V", line = 303)
    public final void method27(boolean arg0, byte arg1) {
        super.field8014.method3462(7681, -5882, 8448);
        ++field5925;
        if (arg1 >= -67) {
            field5927 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V", line = 318)
    public static final void method2559(class43 arg0, int arg1, int arg2, class151 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class273.field3602 = arg0;
        class585.field7937 = arg1;
        class315.field4080 = arg3;
        class52.field715 = class273.field3602.method384() > 0;
        class658.field9175 = arg4 >> class291.field3760;
        class659.field9178 = arg6 >> class291.field3760;
        class77.field1049 = arg4;
        class323.field4198 = arg6;
        class195.field2547 = arg5;
        class603.field8119 = class658.field9175 - class703.field9809;
        if (class603.field8119 < 0) {
            class649.field9047 = -class603.field8119;
            class603.field8119 = 0;
        } else {
            class649.field9047 = 0;
        }
        class244.field3272 = class659.field9178 - class703.field9809;
        if (class244.field3272 < 0) {
            class122.field1570 = -class244.field3272;
            class244.field3272 = 0;
        } else {
            class122.field1570 = 0;
        }
        class337.field4360 = class703.field9809 + class658.field9175;
        if (class337.field4360 > class590.field8010) {
            class337.field4360 = class590.field8010;
        }
        class120.field1551 = class703.field9809 + class659.field9178;
        if (class120.field1551 > class151.field1933) {
            class120.field1551 = class151.field1933;
        }
        for (int var18 = 0; var18 < class703.field9809 + class703.field9809 + 2; ++var18) {
            for (int var23 = 0; var23 < class703.field9809 + class703.field9809 + 2; ++var23) {
                int var24 = class658.field9175 - class703.field9809 + var18;
                int var25 = class659.field9178 - class703.field9809 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class590.field8010 && var25 < class151.field1933) {
                    int var26 = var24 << class291.field3760;
                    int var27 = var25 << class291.field3760;
                    int var28 = class353.field4540[class353.field4540.length - 1].method668(var24, var25) - (1000 << class291.field3760 - 7);
                    int var29 = class477.field6327 != null ? class477.field6327[0].method668(var24, var25) + class688.field9414 : class353.field4540[0].method668(var24, var25) + class688.field9414;
                    class294.field3808[var18][var23] = class273.field3602.method328(var26, var28, var27, var26, var29, var27);
                } else {
                    class294.field3808[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class703.field9809 + class703.field9809 + 1; ++var19) {
            for (int var22 = 0; var22 < class703.field9809 + class703.field9809 + 1; ++var22) {
                class505.field6641[var19][var22] = class294.field3808[var19][var22] || class294.field3808[var19 + 1][var22] || class294.field3808[var19][var22 + 1] || class294.field3808[var19 + 1][var22 + 1];
            }
        }
        class143.field1879 = arg8;
        class48.field673 = arg9;
        class228.field3046 = arg10;
        class352.field4520 = arg11;
        class48.field680 = arg12;
        class216.method1383();
        class683.method3745(-117, class273.field3602);
        for (class215 var20 = (class215) class509.field6675.method2101(260); var20 != null; var20 = (class215) class509.field6675.method2098((byte) 57)) {
            var20.method2227(82);
            class62.method525(80, var20);
        }
        if (class52.field715) {
            for (int var21 = 0; var21 < class421.field5444; ++var21) {
                class421.field5440[var21].method2058(arg1, arg17, false);
            }
        }
        if (arg2 > 1) {
            class273.field3602.method398(0);
            if (class89.field1174 == null || class89.field1174 instanceof class448) {
                class89.field1174 = new class692();
            }
        } else if (class89.field1174 == null || class89.field1174 instanceof class692) {
            class89.field1174 = new class448();
        }
        class89.field1174.method876(arg2, -10363);
        class89.field1174.method877((byte) 123);
        if (class168.field2096 != null) {
            class160.method1139(true);
            class89.field1174.method875(22, 0);
            class428.method2462(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class89.field1174.method877((byte) 115);
            class89.field1174.method875(23, 0);
            class160.method1139(false);
        }
        class428.method2462(arg2, arg7, arg13, arg14, arg15, arg16);
        class89.field1174.method877((byte) -94);
        class89.field1174.method880(5000);
        class89.field1174.method877((byte) -3);
        if (arg2 > 1) {
            class273.field3602.method373(0);
        }
        class273.field3602.method412(0, (class296[]) null);
    }
}
