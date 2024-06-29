import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class326 implements class5 {

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "[F")
    private float[] field5185 = new float[4];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ljl;")
    public static class332 field5176 = new class332(260);

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5181 = "glow2:";

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5183 = "white:";

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Z")
    public static boolean field5182 = true;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[Ldd;")
    public static class319[] field5189 = new class319[50];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    private int field5179;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method2292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -1) {
            method2298(-91, 98);
        }
        field5171++;
        if (class74.field1269 <= arg2 && class355.field5640 >= arg3 && class296.field4758 <= arg0 && arg4 <= class273.field4522) {
            class292.method2113(arg3, (byte) -89, arg1, arg4, arg2, arg0);
        } else {
            class320.method2258(arg4, arg2, arg3, -37, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2293(int arg0, int arg1) {
        class208.field3268 = arg1;
        if (arg0 < -68) {
            class198.field3162 = -1;
            class198.field3162 = -1;
            field5177++;
            class41.method268((byte) 120);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()I", line = 44)
    public final int method20() {
        field5172++;
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 55)
    public final void method19(int arg0) {
        field5174++;
        GL var2 = class42.field627;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field5185[3] = 0.0F;
            this.field5185[0] = var6;
            this.field5185[2] = 0.0F;
            this.field5185[1] = 0.0F;
        } else {
            this.field5185[3] = 0.0F;
            this.field5185[1] = 0.0F;
            this.field5185[2] = var6;
            this.field5185[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class113.field1848 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class21.field234 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class247.field4043), (float) (-class93.field1569), (float) (-class176.field2832));
        var2.glTexGenfv(8192, 9474, this.field5185, 0);
        this.field5185[0] = 0.0F;
        this.field5185[3] = (float) class42.field609 * var4;
        this.field5185[2] = 0.0F;
        this.field5185[1] = var6;
        var2.glTexGenfv(8193, 9474, this.field5185, 0);
        var2.glPopMatrix();
        if (class150.field2394) {
            this.field5185[1] = 0.0F;
            this.field5185[2] = 0.0F;
            this.field5185[0] = 0.0F;
            this.field5185[3] = (float) class42.field609 * var3;
            var2.glTexGenfv(8194, 9473, this.field5185, 0);
        } else {
            int var7 = (int) ((float) class42.field609 * var3 * 64.0F);
            var2.glBindTexture(3553, class150.field2388[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 117)
    public static void method2294(byte arg0) {
        field5189 = null;
        if (arg0 <= 31) {
            method2296(77, (class71) null);
        }
        field5181 = null;
        field5176 = null;
        field5183 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z", line = 134)
    public static final boolean method2295(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class7.field63; var3++) {
            class152 var4 = class314.field5000[var3];
            if (var4.field2430 == 1) {
                int var5 = var4.field2424 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2426 * var5 >> 8) + var4.field2419;
                    int var7 = (var4.field2429 * var5 >> 8) + var4.field2408;
                    int var8 = (var4.field2416 * var5 >> 8) + var4.field2421;
                    int var9 = (var4.field2425 * var5 >> 8) + var4.field2414;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2430 == 2) {
                int var10 = arg0 - var4.field2424;
                if (var10 > 0) {
                    int var11 = (var4.field2426 * var10 >> 8) + var4.field2419;
                    int var12 = (var4.field2429 * var10 >> 8) + var4.field2408;
                    int var13 = (var4.field2416 * var10 >> 8) + var4.field2421;
                    int var14 = (var4.field2425 * var10 >> 8) + var4.field2414;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2430 == 3) {
                int var15 = var4.field2419 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2422 * var15 >> 8) + var4.field2424;
                    int var17 = (var4.field2413 * var15 >> 8) + var4.field2409;
                    int var18 = (var4.field2416 * var15 >> 8) + var4.field2421;
                    int var19 = (var4.field2425 * var15 >> 8) + var4.field2414;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2430 == 4) {
                int var20 = arg2 - var4.field2419;
                if (var20 > 0) {
                    int var21 = (var4.field2422 * var20 >> 8) + var4.field2424;
                    int var22 = (var4.field2413 * var20 >> 8) + var4.field2409;
                    int var23 = (var4.field2416 * var20 >> 8) + var4.field2421;
                    int var24 = (var4.field2425 * var20 >> 8) + var4.field2414;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2430 == 5) {
                int var25 = arg1 - var4.field2421;
                if (var25 > 0) {
                    int var26 = (var4.field2422 * var25 >> 8) + var4.field2424;
                    int var27 = (var4.field2413 * var25 >> 8) + var4.field2409;
                    int var28 = (var4.field2426 * var25 >> 8) + var4.field2419;
                    int var29 = (var4.field2429 * var25 >> 8) + var4.field2408;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILhk;)V", line = 256)
    public static final void method2296(int arg0, class71 arg1) {
        field5178++;
        if (arg0 == 2048) {
            class55.field903 = arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 271)
    public final void method18() {
        field5180++;
        GL var1 = class42.field627;
        var1.glCallList(this.field5179 + 1);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 283)
    private final void method2297(byte arg0) {
        GL var2 = class42.field627;
        this.field5179 = var2.glGenLists(2);
        field5173++;
        var2.glNewList(this.field5179, 4864);
        var2.glActiveTexture(33985);
        if (class150.field2394) {
            var2.glBindTexture(32879, class150.field2390);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        if (arg0 != 126) {
            return;
        }
        var2.glNewList(this.field5179 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class150.field2394) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Lpc;", line = 332)
    public static final class131 method2298(int arg0, int arg1) {
        field5175++;
        class131 var2 = (class131) class332.field5264.method2147((byte) 87, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 4575) {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class296.field4756.method472(arg1, arg0 - 4450, 1);
            } else {
                var3 = class35.field513.method472(arg1 & 0x7FFF, arg0 - 4463, 1);
            }
            class131 var4 = new class131();
            if (var3 != null) {
                var4.method1013(new class227(var3), -69);
            }
            if (arg1 >= 32768) {
                var4.method1014(32768);
            }
            class332.field5264.method2149(var4, -32563, (long) arg1);
            return var4;
        } else {
            return (class131) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()V", line = 367)
    public final void method21() {
        field5188++;
        GL var1 = class42.field627;
        var1.glCallList(this.field5179);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 390)
    public class326() {
        this.method2297((byte) 126);
    }
}
