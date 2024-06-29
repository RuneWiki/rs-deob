import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class26 extends class86 {

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Z")
    private boolean field368;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lus;")
    private class1[] field379;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "J")
    public static long field383 = 0L;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lni;")
    public static class367 field378 = new class367(7, -1);

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "F")
    public static float field381;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lhq;")
    private class110 field370;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lnq;)V")
    public class26(class325 arg0) {
        super(arg0);
        if (arg0.field5025) {
            this.field368 = ~arg0.field4967 > -4;
            int var2 = !this.field368 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 != -4) {
                            if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
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
            this.field379 = new class1[3];
            this.field379[0] = new class1(super.field1248, 6406, 64, false, var4, 6406);
            this.field379[1] = new class1(super.field1248, 6406, 64, false, var5, 6406);
            this.field379[2] = new class1(super.field1248, 6406, 64, false, var3, 6406);
            this.method242(-56);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lom;")
    public static final class257 method234(boolean arg0, int arg1) {
        ++field373;
        class257 var2 = (class257) class300.field4403.method2133((long) arg1, (byte) 55);
        if (var2 != null) {
            return var2;
        } else {
            if (!arg0) {
                method240(false);
            }
            byte[] var3 = class281.field3979.method1281(0, arg1, 87);
            class257 var4 = new class257();
            if (var3 != null) {
                var4.method1651(new class164(var3), !arg0, arg1);
            }
            class300.field4403.method2131(var4, (long) arg1, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V")
    public final void method235(boolean arg0, byte arg1) {
        ++field371;
        super.field1248.method2030(8448, 7681, (byte) 71);
        if (arg1 != 112) {
            this.field368 = true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLlr;I)V")
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (arg0) {
            super.field1248.method2075(arg1, 0);
            ++field372;
            super.field1248.method2045(34023, arg2);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        ++field377;
        if (this.field375) {
            if (!this.field368) {
                super.field1248.method2040((byte) 76, 2);
                super.field1248.method2075((class538) null, 0);
            }
            super.field1248.method2040((byte) 32, 1);
            super.field1248.method2075((class538) null, 0);
            super.field1248.method2040((byte) -104, 0);
            this.field370.method693((byte) 107, '\u0001');
            this.field375 = false;
        } else {
            super.field1248.method2044(0, 770, (byte) 64, 5890);
        }
        super.field1248.method2030(8448, 8448, (byte) 71);
        if (arg0 != 27670) {
            this.method242(37);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 >= -2) {
            method240(true);
        }
        ++field380;
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)V")
    public final void method239(int arg0, byte arg1, int arg2) {
        ++field369;
        if (this.field375) {
            super.field1248.method2040((byte) -85, 1);
            super.field1248.method2075(this.field379[arg2 + -1], 0);
            super.field1248.method2040((byte) -110, 0);
        }
        int var4 = 108 / ((-50 - arg1) / 53);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V")
    public static void method240(boolean arg0) {
        if (!arg0) {
            method240(true);
        }
        field378 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        if (this.field370 != null && arg1) {
            if (!this.field368) {
                super.field1248.method2040((byte) 84, 2);
                super.field1248.method2075(super.field1248.field4926, 0);
                super.field1248.method2040((byte) -94, 0);
            }
            this.field370.method693((byte) 78, '\u0000');
            this.field375 = true;
        } else {
            super.field1248.method2044(0, 770, (byte) 64, 34168);
        }
        ++field376;
        if (arg0 != 0) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    private final void method242(int arg0) {
        ++field374;
        this.field370 = new class110(super.field1248, 2);
        this.field370.method694(4864, 0);
        super.field1248.method2040((byte) -102, 1);
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
        if (arg0 > -47) {
            field378 = null;
        }
        if (!this.field368) {
            super.field1248.method2030(7681, 8448, (byte) 71);
            super.field1248.method2059(34168, 768, 0, -31277);
            super.field1248.method2040((byte) -117, 2);
            super.field1248.method2030(260, 7681, (byte) 71);
            super.field1248.method2059(34168, 768, 0, -31277);
            super.field1248.method2059(34168, 770, 1, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 34167);
        } else {
            super.field1248.method2030(260, 7681, (byte) 71);
            super.field1248.method2059(5890, 770, 0, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 34167);
        }
        super.field1248.method2040((byte) -115, 0);
        this.field370.method691(-22);
        this.field370.method694(4864, 1);
        super.field1248.method2040((byte) -111, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field368) {
            super.field1248.method2030(8448, 8448, (byte) 71);
            super.field1248.method2059(5890, 768, 0, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 5890);
        } else {
            super.field1248.method2030(8448, 8448, (byte) 71);
            super.field1248.method2059(5890, 768, 0, -31277);
            super.field1248.method2040((byte) -94, 2);
            super.field1248.method2030(8448, 8448, (byte) 71);
            super.field1248.method2059(5890, 768, 0, -31277);
            super.field1248.method2059(34168, 768, 1, -31277);
            super.field1248.method2044(0, 770, (byte) 64, 5890);
        }
        super.field1248.method2040((byte) 68, 0);
        this.field370.method691(-48);
    }
}
