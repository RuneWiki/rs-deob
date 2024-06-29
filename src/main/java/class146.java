import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class146 extends class465 {

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "Lhm;")
    private class207 field2345;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Lu;")
    private class68 field2348;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Z")
    public static boolean field2338;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method218(int arg0) {
        ++field2341;
        return arg0 > 110;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III[BIII)V", line = 16)
    public static final void method1054(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field2349;
        if (~arg6 < -1 && !class230.method1441(true, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class230.method1441(true, arg1)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class73.method549(-6411, arg5);
            int var8 = 0;
            int var9 = arg6 < arg1 ? arg6 : arg1;
            int var10 = arg6 >> 1;
            int var11 = arg1 >> 1;
            if (arg4 != -5) {
                method1054(21, -110, 49, (byte[]) null, -19, -74, 49);
            }
            byte[] var12 = arg3;
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var8, arg0, arg6, arg1, 0, arg5, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; var7 > var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; var10 > var21; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg1 = var11;
                arg6 = var10;
                var12 = var16;
                var9 >>= 1;
                var10 >>= 1;
                var11 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lno;Lhm;)V", line = 116)
    public class146(class658 arg0, class207 arg1) {
        super(arg0);
        this.field2345 = arg1;
        this.field2348 = new class68(arg0, 2);
        this.field2348.method537(0, (byte) 3);
        super.field6268.method3629((byte) 105, 1);
        if (this.field2345.field2976) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6268.method3629((byte) -124, 0);
        this.field2348.method539(true);
        this.field2348.method537(1, (byte) 3);
        super.field6268.method3629((byte) 83, 1);
        if (this.field2345.field2976) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6268.method3629((byte) 27, 0);
        this.field2348.method539(true);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V", line = 149)
    public final void method213(int arg0) {
        this.field2348.method536((byte) 121, '\u0001');
        if (arg0 != 15495) {
            field2338 = true;
        }
        ++field2346;
        super.field6268.method3629((byte) -119, 1);
        super.field6268.method3630((class367) null, -2);
        super.field6268.method3629((byte) -117, 0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILnea;)I", line = 163)
    public static final int method1055(int arg0, class670 arg1) {
        ++field2340;
        if (arg0 != -1790) {
            field2344 = -119;
        }
        if (class586.field7773 != arg1) {
            if (class521.field6963 == arg1) {
                return 8448;
            } else if (class445.field6091 == arg1) {
                return 34165;
            } else if (class32.field520 != arg1) {
                if (class706.field9920 == arg1) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V", line = 194)
    public final void method214(byte arg0, boolean arg1) {
        if (arg0 != 99) {
            this.field2348 = null;
        }
        ++field2339;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V", line = 206)
    public final void method215(int arg0, int arg1, int arg2) {
        ++field2336;
        float var4 = (float) ((arg2 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((29 & arg2) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg2 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field6268.method3629((byte) 22, 1);
        boolean var7 = ~(128 & arg2) != -1;
        if (!var7) {
            class123.field2060[1] = 0.0F;
            class123.field2060[3] = 0.0F;
            class123.field2060[2] = var6;
            class123.field2060[0] = 0.0F;
        } else {
            class123.field2060[0] = var6;
            class123.field2060[2] = 0.0F;
            class123.field2060[3] = 0.0F;
            class123.field2060[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class123.field2060, 0);
        class123.field2060[2] = 0.0F;
        class123.field2060[3] = (float) super.field6268.field9186 * var4 % 1.0F;
        class123.field2060[1] = var6;
        class123.field2060[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class123.field2060, arg1);
        if (!this.field2345.field2976) {
            int var8 = (int) ((float) super.field6268.field9186 * var5 * 16.0F);
            super.field6268.method3630(this.field2345.field2974[var8 % 16], arg1 + -2);
        } else {
            class123.field2060[1] = 0.0F;
            class123.field2060[3] = (float) super.field6268.field9186 * var5 % 1.0F;
            class123.field2060[2] = 0.0F;
            class123.field2060[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class123.field2060, 0);
        }
        super.field6268.method3629((byte) -119, 0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lfa;IIILgba;ZLxa;I)V", line = 259)
    public static final void method1056(class217 arg0, int arg1, int arg2, int arg3, class625 arg4, boolean arg5, class468 arg6, int arg7) {
        ++field2347;
        if (arg6 != null) {
            int var8;
            if (class140.field2254 != 4) {
                var8 = (int) class42.field602 + class588.field7795 & 16383;
            } else {
                var8 = 16383 & (int) class42.field602;
            }
            int var9 = Math.max(arg4.field8350 / 2, arg4.field8361 / 2) + 10;
            int var10 = arg3 * arg3 - -(arg2 * arg2);
            if (var9 * var9 >= var10) {
                int var11 = class126.field2116[var8];
                int var12 = class126.field2105[var8];
                if (!arg5) {
                    if (~class140.field2254 != -5) {
                        var12 = var12 * 256 / (class376.field5073 + 256);
                        var11 = var11 * 256 / (class376.field5073 + 256);
                    }
                    int var13 = arg2 * var11 + arg3 * var12 >> 14;
                    int var14 = arg2 * var12 - arg3 * var11 >> 14;
                    arg6.method276(arg1 - -(arg4.field8350 / 2) - (-var13 + arg6.method1025() / 2), arg4.field8361 / 2 + (arg7 - (var14 - -(arg6.method1030() / 2))), arg0, arg1, arg7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z", line = 305)
    public static final boolean method1057(boolean arg0) {
        for (int var1 = class135.field2199; var1 < class13.field218; ++var1) {
            class24[][] var2 = class703.field9899[var1];
            for (int var3 = -class364.field4927; var3 <= 0; ++var3) {
                int var4 = class350.field4797 + var3;
                int var5 = class350.field4797 - var3;
                if (var4 >= class253.field3500 || var5 < class149.field2388) {
                    for (int var6 = -class364.field4927; var6 <= 0; ++var6) {
                        int var7 = class173.field2673 + var6;
                        int var8 = class173.field2673 - var6;
                        if (var4 >= class253.field3500) {
                            if (var7 >= class669.field9498) {
                                class24 var9 = var2[var4][var7];
                                if (var9 != null && var9.field405) {
                                    class263.field3653 = arg0;
                                    class692.field9746.method1405(var9, 103);
                                    class692.field9746.method1407(true);
                                }
                            }
                            if (var8 < class221.field3133) {
                                class24 var10 = var2[var4][var8];
                                if (var10 != null && var10.field405) {
                                    class263.field3653 = arg0;
                                    class692.field9746.method1405(var10, 103);
                                    class692.field9746.method1407(true);
                                }
                            }
                        }
                        if (var5 < class149.field2388) {
                            if (var7 >= class669.field9498) {
                                class24 var11 = var2[var5][var7];
                                if (var11 != null && var11.field405) {
                                    class263.field3653 = arg0;
                                    class692.field9746.method1405(var11, 103);
                                    class692.field9746.method1407(true);
                                }
                            }
                            if (var8 < class221.field3133) {
                                class24 var12 = var2[var5][var8];
                                if (var12 != null && var12.field405) {
                                    class263.field3653 = arg0;
                                    class692.field9746.method1405(var12, 103);
                                    class692.field9746.method1407(true);
                                }
                            }
                        }
                        if (class585.field7757 == 0) {
                            if (class131.field2159) {
                                class692.field9746.method1409(true, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 413)
    public final void method210(int arg0, boolean arg1) {
        int var3 = 106 % ((arg0 - -30) / 38);
        ++field2342;
        this.field2348.method536((byte) 124, '\u0000');
        if (this.field2345.field2976) {
            super.field6268.method3629((byte) 68, 1);
            super.field6268.method3630(this.field2345.field2977, -2);
            super.field6268.method3629((byte) 115, 0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILhf;)V", line = 437)
    public final void method212(int arg0, int arg1, class367 arg2) {
        super.field6268.method3630(arg2, arg0 ^ -2);
        ++field2343;
        if (arg0 == 0) {
            super.field6268.method3603((byte) -34, arg1);
        }
    }
}
