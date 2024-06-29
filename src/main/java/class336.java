import java.awt.FontMetrics;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class336 implements class18 {

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "[F")
    private float[] field5254 = new float[4];

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "J")
    public static long field5257 = 0L;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field5258 = -1;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "J")
    public static long field5242;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Lfh;")
    public static class140 field5245;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field5255;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "()V", line = 7)
    public final void method127() {
        field5248++;
        GL var1 = class47.field592;
        var1.glCallList(this.field5256);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "()I", line = 18)
    public final int method128() {
        field5243++;
        return 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)I", line = 28)
    public static final int method2343(boolean arg0) {
        if (arg0) {
            return -118;
        } else {
            field5251++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 41)
    public static final int method2344(int arg0, int arg1) {
        if (arg0 != 522353736) {
            method2345((byte) -20, (class169) null);
        }
        field5241++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V", line = 54)
    public final void method126() {
        field5247++;
        GL var1 = class47.field592;
        var1.glCallList(this.field5256 + 1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 65)
    public final void method129(int arg0) {
        field5250++;
        GL var2 = class47.field592;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field5254[0] = var6;
            this.field5254[1] = 0.0F;
            this.field5254[2] = 0.0F;
            this.field5254[3] = 0.0F;
        } else {
            this.field5254[0] = 0.0F;
            this.field5254[1] = 0.0F;
            this.field5254[3] = 0.0F;
            this.field5254[2] = var6;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class255.field3738 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class338.field5272 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class348.field5456), (float) (-class30.field357), (float) (-class163.field2311));
        var2.glTexGenfv(8192, 9474, this.field5254, 0);
        this.field5254[1] = var6;
        this.field5254[0] = 0.0F;
        this.field5254[2] = 0.0F;
        this.field5254[3] = (float) class47.field625 * var3;
        var2.glTexGenfv(8193, 9474, this.field5254, 0);
        var2.glPopMatrix();
        if (class57.field732) {
            this.field5254[2] = 0.0F;
            this.field5254[3] = (float) class47.field625 * var4;
            this.field5254[1] = 0.0F;
            this.field5254[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5254, 0);
        } else {
            int var7 = (int) ((float) class47.field625 * var4 * 64.0F);
            var2.glBindTexture(3553, class57.field734[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLp;)I", line = 129)
    public static final int method2345(byte arg0, class169 arg1) {
        class157 var2 = arg1.field2345;
        field5249++;
        if (var2.field2206 != null) {
            var2 = var2.method1210(-128);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -54) {
            method2346((class239) null, (byte) 123);
        }
        int var3 = var2.field2209;
        class91 var4 = arg1.method2300((byte) 111);
        if (arg1.field4897 == var4.field1182) {
            var3 = var2.field2208;
        } else if (arg1.field4897 == var4.field1149 || arg1.field4897 == var4.field1147 || arg1.field4897 == var4.field1178 || arg1.field4897 == var4.field1189) {
            var3 = var2.field2202;
        } else if (arg1.field4897 == var4.field1174 || arg1.field4897 == var4.field1151 || arg1.field4897 == var4.field1183 || arg1.field4897 == var4.field1172) {
            var3 = var2.field2181;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lf;B)I", line = 170)
    public static final int method2346(class239 arg0, byte arg1) {
        field5252++;
        int var2 = arg0.field3457;
        class91 var3 = arg0.method2300((byte) 91);
        if (arg0.field4897 == var3.field1182) {
            var2 = arg0.field3465;
        } else if (arg0.field4897 == var3.field1149 || arg0.field4897 == var3.field1147 || arg0.field4897 == var3.field1178 || arg0.field4897 == var3.field1189) {
            var2 = arg0.field3467;
        } else if (arg0.field4897 == var3.field1174 || arg0.field4897 == var3.field1151 || arg0.field4897 == var3.field1183 || arg0.field4897 == var3.field1172) {
            var2 = arg0.field3460;
        }
        return arg1 > -64 ? 44 : var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 198)
    public static final void method2347(int arg0, int arg1, int arg2) {
        field5246++;
        class42 var3 = class166.method1242(1, arg0, -1249071392);
        var3.method307((byte) -127);
        if (arg2 >= 23) {
            var3.field523 = arg1;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILfh;)Z", line = 214)
    public static final boolean method2348(int arg0, class140 arg1) {
        field5253++;
        if (arg0 != 0) {
            field5242 = 28L;
        }
        return arg1.method1076(class255.field3724, arg0 ^ 0x46);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 280)
    public class336() {
        this.method2349(false);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V", line = 234)
    private final void method2349(boolean arg0) {
        field5244++;
        GL var2 = class47.field592;
        this.field5256 = var2.glGenLists(2);
        var2.glNewList(this.field5256, 4864);
        var2.glActiveTexture(33985);
        if (class57.field732) {
            var2.glBindTexture(32879, class57.field728);
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
        var2.glNewList(this.field5256 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class57.field732) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        if (arg0) {
            this.field5254 = (float[]) null;
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 289)
    public static void method2350(byte arg0) {
        field5245 = null;
        int var1 = 55 % ((arg0 - 56) / 43);
        field5255 = null;
    }
}
