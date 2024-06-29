import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class22 implements class99 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[F")
    private float[] field329 = new float[4];

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "J")
    public static long field337 = 0L;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "J")
    public static long field340 = 0L;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lak;")
    public static class20 field330 = new class20(64);

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lok;")
    public static class41 field346 = class137.method956(" zuerst von Ihrer Ignorieren)2Liste(Q", 45);

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "F")
    public static float field345;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method148(boolean arg0, int arg1) {
        field336++;
        class46 var2 = class195.method1396(1, arg1, arg0);
        var2.method336(true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I", line = 22)
    public static final int method149(int arg0, int arg1) {
        field333++;
        if (arg0 != -20182) {
            method148(true, 10);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()V", line = 34)
    public final void method150() {
        field328++;
        GL var1 = class166.field2648;
        var1.glCallList(this.field339);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZ[Lbc;II)V", line = 47)
    public static final void method151(int arg0, int arg1, boolean arg2, class302[] arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg4 != -1) {
            method151(-43, -41, true, (class302[]) null, -44, 67);
        }
        while (arg3.length > var6) {
            class302 var7 = arg3[var6];
            if (var7 != null && var7.field4999 == arg1) {
                class75.method552(-1338, arg2, arg5, arg0, var7);
                class141.method984(var7, arg0, arg5, -1);
                if (var7.field4912 > (var7.field5043 - var7.field4936)) {
                    var7.field4912 = var7.field5043 - var7.field4936;
                }
                if ((var7.field4952 - var7.field4949) < var7.field4918) {
                    var7.field4918 = var7.field4952 - var7.field4949;
                }
                if (var7.field4912 < 0) {
                    var7.field4912 = 0;
                }
                if (var7.field4918 < 0) {
                    var7.field4918 = 0;
                }
                if (var7.field4951 == 0) {
                    class148.method1027(var7, (byte) -118, arg2);
                }
            }
            var6++;
        }
        field332++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()V", line = 90)
    public final void method152() {
        field325++;
        GL var1 = class166.field2648;
        var1.glCallList(this.field339 + 1);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 268)
    public class22() {
        this.method156(1);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()I", line = 112)
    public final int method153() {
        field331++;
        return 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIIIIIIII)V", line = 124)
    public static final void method154(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg7 - arg8;
        field335++;
        int var10 = (arg3 - arg4 << 16) / var9;
        int var11 = arg6 - arg5;
        int var12 = (arg2 - arg1 << 16) / var11;
        class199.method1414(var10, arg7, 0, arg0 + 63, arg6, arg4, 0, arg8, var12, arg5, arg1);
        if (arg0 != 41) {
            method158((byte) -21, 27);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 142)
    public final void method155(int arg0) {
        field326++;
        GL var2 = class166.field2648;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) (((arg0 & 0x1B) >> 3) + 1) * 0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field329[3] = 0.0F;
            this.field329[0] = var4;
            this.field329[2] = 0.0F;
            this.field329[1] = 0.0F;
        } else {
            this.field329[0] = 0.0F;
            this.field329[1] = 0.0F;
            this.field329[2] = var4;
            this.field329[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class95.field1405 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class65.field998 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class297.field4797), (float) (-class24.field371), (float) (-class315.field5326));
        var2.glTexGenfv(8192, 9474, this.field329, 0);
        this.field329[3] = (float) class166.field2630 * var3;
        this.field329[1] = var4;
        this.field329[0] = 0.0F;
        this.field329[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field329, 0);
        var2.glPopMatrix();
        if (class71.field1067) {
            this.field329[2] = 0.0F;
            this.field329[0] = 0.0F;
            this.field329[1] = 0.0F;
            this.field329[3] = (float) class166.field2630 * var5;
            var2.glTexGenfv(8194, 9473, this.field329, 0);
        } else {
            int var7 = (int) ((float) class166.field2630 * var5 * 64.0F);
            var2.glBindTexture(3553, class71.field1065[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 207)
    private final void method156(int arg0) {
        GL var2 = class166.field2648;
        this.field339 = var2.glGenLists(2);
        var2.glNewList(this.field339, 4864);
        var2.glActiveTexture(33985);
        if (class71.field1067) {
            var2.glBindTexture(32879, class71.field1064);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        field338++;
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field339 + arg0, 4864);
        var2.glActiveTexture(33985);
        if (class71.field1067) {
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

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 255)
    public static void method157(byte arg0) {
        field330 = null;
        if (arg0 <= -75) {
            field346 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V", line = 288)
    public static final void method158(byte arg0, int arg1) {
        field324++;
        class306 var2 = (class306) class186.field3031.method617((long) arg1, false);
        if (var2 != null) {
            var2.method418(6971);
            if (arg0 < 125) {
                field342 = 116;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 306)
    public static final void method159(int arg0) {
        class18.field238 = null;
        class139.field2141 = null;
        class60.field890 = null;
        class140.field2165 = null;
        class2.field16 = null;
        class244.field3898 = null;
        field343++;
        class105.field1493 = null;
        class277.field4538 = null;
        if (arg0 != 8731) {
            field344 = -33;
        }
        class8.field98 = null;
        class75.field1121 = null;
        class110.field1566 = null;
        class140.field2164 = null;
        class23.field364 = null;
        class139.field2132 = null;
        class89.field1303 = null;
        class199.field3202 = null;
        class271.field4388 = null;
        class88.field1296 = null;
        class35.field530 = null;
        class75.field1125 = null;
        class48.field749 = null;
        class104.field1470 = null;
        class53.field790 = null;
    }
}
