import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class580 extends class279 {

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "Z")
    private boolean field8198 = false;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "[F")
    private float[] field8196 = new float[4];

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "Lhe;")
    private class574 field8215;

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lhe;")
    private class574 field8211;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "Lhe;")
    private class574 field8197;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "Lhe;")
    private class574 field8206;

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "Z")
    private boolean field8202;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lrm;")
    private class90 field8191;

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "[Z")
    public static boolean[] field8207 = new boolean[100];

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "Lmq;")
    public static class592 field8210 = new class592();

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field8214;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "Z")
    private boolean field8192;

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "Z")
    private boolean field8216;

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "[Lit;")
    public static class34[] field8208;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)V", line = 3)
    public static void method3348(int arg0) {
        field8210 = null;
        field8208 = null;
        field8207 = null;
        if (arg0 != 2) {
            field8214 = null;
        }
        field8214 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V", line = 22)
    public final void method442(boolean arg0) {
        super.field4267.method411(1, (byte) -81);
        ++field8209;
        super.field4267.method215(8, (class506) null);
        super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
        if (arg0) {
            this.field8198 = false;
        }
        super.field4267.method321(class388.field5817, 0, (byte) -95);
        super.field4267.method321(class327.field4819, 2, (byte) -95);
        super.field4267.method227(0, class388.field5817, 70);
        super.field4267.method411(0, (byte) -89);
        if (this.field8198) {
            super.field4267.method321(class388.field5817, 0, (byte) -95);
            super.field4267.method227(0, class388.field5817, 70);
            this.field8198 = false;
        }
        if (this.field8216) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8216 = false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V", line = 56)
    public final void method439(int arg0) {
        if (arg0 == -6910) {
            if (this.field8216) {
                int var2 = super.field4267.method377();
                int var3 = super.field4267.method294();
                float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
                float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field4267.method383(1), (float) super.field4267.method429((byte) 111) / 255.0F);
                super.field4267.method411(1, (byte) -105);
                super.field4267.method228(2, super.field4267.method376(-128));
                super.field4267.method411(0, (byte) -99);
            }
            ++field8199;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BZ)V", line = 88)
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            this.field8198 = true;
        }
        ++field8195;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V", line = 98)
    public final void method1818(byte arg0) {
        ++field8200;
        if (arg0 >= 45) {
            int var2 = super.field4267.method360(0);
            class341 var3 = super.field4267.method404(-1);
            if (!this.field8192) {
                OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field8197.field8155 : this.field8215.field8155);
            } else {
                OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field8211.field8155 : this.field8206.field8155);
            }
            OpenGL.glEnable(34336);
            this.field8216 = true;
            var3.method2200(0.0F, (float) var2, -8429, 0.0F, -1.0F, this.field8196);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8196[0], this.field8196[1], this.field8196[2], this.field8196[3]);
            this.method439(-6910);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZLiu;)V", line = 127)
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        if (arg2 != null) {
            if (this.field8198) {
                super.field4267.method321(class388.field5817, 0, (byte) -95);
                super.field4267.method227(0, class388.field5817, 70);
                this.field8198 = false;
            }
            super.field4267.method215(8, arg2);
            super.field4267.method405(arg0, (byte) 121);
        } else if (!this.field8198) {
            super.field4267.method215(8, super.field4267.field622);
            super.field4267.method405(1, (byte) 121);
            super.field4267.method321(class493.field7145, 0, (byte) -95);
            super.field4267.method227(0, class493.field7145, 70);
            this.field8198 = true;
        }
        if (arg1) {
            this.method1818((byte) 55);
        }
        ++field8201;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lom;Lla;)V", line = 196)
    public class580(class642 arg0, class422 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9174) {
            this.field8215 = class612.method3492(arg0, arg1.method2638("uw_ground_unlit", 81, "gl"), 0, 34336);
            this.field8211 = class612.method3492(arg0, arg1.method2638("uw_ground_lit", 59, "gl"), 0, 34336);
            this.field8197 = class612.method3492(arg0, arg1.method2638("uw_model_unlit", 74, "gl"), 0, 34336);
            this.field8206 = class612.method3492(arg0, arg1.method2638("uw_model_lit", 110, "gl"), 0, 34336);
            if (!(this.field8206 != null & this.field8211 != null & this.field8215 != null & this.field8197 != null)) {
                this.field8202 = false;
            } else {
                this.field8191 = super.field4267.method265(1, false, 2, new int[] { 0, -1 }, 0);
                this.field8191.method597(58, false, false);
                this.field8202 = true;
            }
        } else {
            this.field8202 = false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIB)V", line = 168)
    public static final void method3349(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -30) {
            field8203 = 10;
        }
        ++field8193;
        float var5 = (float) class729.field10226 / (float) class729.field10221;
        int var6 = arg1;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg3 - (arg1 - var6) / 2;
        int var9 = arg2 - (-var7 + arg0) / 2;
        class271.field4161 = class729.field10226 - class729.field10226 * var9 / var7;
        class187.field3121 = class729.field10221 * var8 / var6;
        class505.field7362 = -1;
        class120.field1849 = -1;
        class481.method2912((byte) 14);
    }

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(I)V", line = 223)
    public static final void method3350(int arg0) {
        ++field8204;
        if (class109.field1694 != null) {
            class109.field1694.method862(-103);
        }
        if (arg0 != 3) {
            field8208 = null;
        }
        if (class159.field2473 != null) {
            class159.field2473.method862(arg0 ^ -126);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V", line = 241)
    public static final void method3351(byte arg0) {
        ++field8205;
        class327 var1 = null;
        try {
            class162 var2 = class706.field9962.method4056((byte) 74, true, "");
            while (var2.field2512 == 0) {
                class484.method2932(true, 1L);
            }
            if (var2.field2512 == 1) {
                var1 = (class327) var2.field2517;
                class301 var3 = class654.field9289.method2287(113);
                var1.method2108(0, 124, var3.field4543, var3.field4534);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2110((byte) 52);
            }
        } catch (Exception var4) {
        }
        if (arg0 > -76) {
            method3351((byte) -95);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZI)V", line = 286)
    public final void method435(boolean arg0, int arg1) {
        ++field8194;
        this.field8192 = arg0;
        super.field4267.method411(1, (byte) -88);
        super.field4267.method215(8, this.field8191);
        super.field4267.method365(class107.field1555, class750.field10454, (byte) -122);
        if (arg1 != 2048) {
            this.method441((byte) 90, true);
        }
        super.field4267.method321(class327.field4819, 0, (byte) -95);
        super.field4267.method338(2, class388.field5817, false, true, 31181);
        super.field4267.method227(0, class493.field7145, 70);
        super.field4267.method411(0, (byte) -109);
        this.method1818((byte) 49);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z", line = 309)
    public final boolean method438(byte arg0) {
        ++field8213;
        if (arg0 > -32) {
            this.field8206 = null;
        }
        return this.field8202;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V", line = 324)
    public final void method443(int arg0, int arg1, int arg2) {
        ++field8212;
        if (arg1 != 0) {
            this.field8196 = null;
        }
    }
}
