import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class216 implements class177 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Z")
    private boolean field3084 = false;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field3089 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    public static int[] field3087 = new int[14];

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3091 = 2;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[Lwe;")
    public static class219[] field3086 = new class219[6];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3083;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[Lpn;")
    public static class170[] field3090;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lcg;", line = 6)
    public static final class316 method1494(byte arg0) {
        field3093++;
        class316 var1 = new class316(34);
        var1.method2184((byte) 89, 11);
        if (arg0 >= -106) {
            method1498((byte) -118);
        }
        var1.method2184((byte) 89, class297.field4401);
        var1.method2184((byte) 89, class292.field4355 ? 1 : 0);
        var1.method2184((byte) 89, class70.field953 ? 1 : 0);
        var1.method2184((byte) 89, class183.field2517 ? 1 : 0);
        var1.method2184((byte) 89, class218.field3118 ? 1 : 0);
        var1.method2184((byte) 89, class99.field1354 ? 1 : 0);
        var1.method2184((byte) 89, class119.field1610 ? 1 : 0);
        var1.method2184((byte) 89, class185.field2558 ? 1 : 0);
        var1.method2184((byte) 89, class342.field5117 ? 1 : 0);
        var1.method2184((byte) 89, field3091);
        var1.method2184((byte) 89, class314.field4736 ? 1 : 0);
        var1.method2184((byte) 89, class131.field1793 ? 1 : 0);
        var1.method2184((byte) 89, class287.field4256 ? 1 : 0);
        var1.method2184((byte) 89, class135.field1866);
        var1.method2184((byte) 89, class72.field1000 ? 1 : 0);
        var1.method2184((byte) 89, class45.field553);
        var1.method2184((byte) 89, class83.field1199);
        var1.method2184((byte) 89, class224.field3233);
        var1.method2189(-1, class253.field3625);
        var1.method2189(-1, class61.field810);
        var1.method2184((byte) 89, class265.method1803());
        var1.method2188(255, class269.field3999);
        var1.method2184((byte) 89, class162.field2230);
        var1.method2184((byte) 89, class334.field5045 ? 1 : 0);
        var1.method2184((byte) 89, class98.field1340 ? 1 : 0);
        var1.method2184((byte) 89, class96.field1297);
        var1.method2184((byte) 89, class204.field2911 ? 1 : 0);
        var1.method2184((byte) 89, class296.field4389 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 311)
    public class216() {
        if (class67.field892) {
            GL var1 = class67.field899;
            this.field3089 = var1.glGenLists(2);
            var1.glNewList(this.field3089, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field3089 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V", line = 55)
    public final void method26() {
        GL var1 = class67.field899;
        field3095++;
        class67.method457(1);
        if (class82.field1195 == null || this.field3089 < 0 || !class314.field4736) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field3089);
        var1.glActiveTexture(33985);
        class82.field1195.method557();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class259.field3820 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class150.field2069 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field3084 = true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([II[J)V", line = 82)
    public static final void method1495(int[] arg0, int arg1, long[] arg2) {
        field3085++;
        class315.method2147(arg2.length - 1, arg0, -115, arg1, arg2);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 91)
    public final void method29(int arg0) {
        field3094++;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V", line = 98)
    public final void method30() {
        field3092++;
        GL var1 = class67.field899;
        if (this.field3084) {
            var1.glCallList(this.field3089 + 1);
            this.field3084 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)[Lkj;", line = 115)
    public static final class31[] method1496(byte arg0) {
        if (class219.field3135 == null) {
            class31[] var1 = class266.method1808((byte) -102, class165.field2258);
            class31[] var2 = new class31[var1.length];
            int var3 = 0;
            label52: for (int var4 = 0; var4 < var1.length; var4++) {
                class31 var5 = var1[var4];
                if ((var5.field386 <= 0 || var5.field386 >= 24) && var5.field383 >= 800 && var5.field375 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class31 var7 = var2[var6];
                        if (var5.field383 == var7.field383 && var5.field375 == var7.field375) {
                            if (var7.field386 < var5.field386) {
                                var2[var6] = var5;
                            }
                            continue label52;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class219.field3135 = new class31[var3];
            class281.method1945(var2, 0, class219.field3135, 0, var3);
            int[] var8 = new int[class219.field3135.length];
            for (int var9 = 0; var9 < class219.field3135.length; var9++) {
                class31 var10 = class219.field3135[var9];
                var8[var9] = var10.field383 * var10.field375;
            }
            class237.method1630(false, var8, class219.field3135);
        }
        int var11 = 23 / ((arg0 - 68) / 35);
        field3082++;
        return class219.field3135;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 199)
    public static void method1497(byte arg0) {
        if (arg0 != -13) {
            field3086 = (class219[]) null;
        }
        field3083 = null;
        field3086 = null;
        field3087 = null;
        field3090 = null;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V", line = 215)
    public static final void method1498(byte arg0) {
        field3096++;
        if (arg0 != 55) {
            method1499((byte) 55);
        }
        for (class238 var1 = (class238) class53.field706.method1335(1); var1 != null; var1 = (class238) class53.field706.method1336(3)) {
            if (var1.field3375 > 0) {
                var1.field3375--;
            }
            if (var1.field3375 != 0) {
                if (var1.field3376 > 0) {
                    var1.field3376--;
                }
                if (var1.field3376 == 0 && var1.field3384 >= 1 && var1.field3370 >= 1 && var1.field3384 <= 102 && var1.field3370 <= 102 && (var1.field3373 < 0 || class109.method797(var1.field3373, var1.field3380, (byte) -114))) {
                    class47.method299(var1.field3380, var1.field3372, var1.field3377, var1.field3373, var1.field3370, var1.field3379, var1.field3384, arg0 - 55);
                    var1.field3376 = -1;
                    if (var1.field3373 == var1.field3371 && var1.field3371 == -1) {
                        var1.method1274((byte) -26);
                    } else if (var1.field3373 == var1.field3371 && var1.field3377 == var1.field3374 && var1.field3382 == var1.field3380) {
                        var1.method1274((byte) -26);
                    }
                }
            } else if (var1.field3371 < 0 || class109.method797(var1.field3371, var1.field3382, (byte) -75)) {
                class47.method299(var1.field3382, var1.field3372, var1.field3374, var1.field3371, var1.field3370, var1.field3379, var1.field3384, arg0 - 55);
                var1.method1274((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V", line = 274)
    public static final void method1499(byte arg0) {
        if (arg0 >= -115) {
            method1495((int[]) null, 100, (long[]) null);
        }
        field3098++;
        if (class96.field1291 != null) {
            class96.field1291.method1771(0);
        }
        if (class344.field5325 != null) {
            class344.field5325.method1771(0);
        }
        class340.method2352(8000, class72.field1000, 22050, 2);
        class96.field1291 = class196.method1390(22050, class150.field2079, class165.field2258, 0, 126);
        class96.field1291.method1769(false, class20.field253);
        class344.field5325 = class196.method1390(2048, class150.field2079, class165.field2258, 1, 124);
        class344.field5325.method1769(false, class160.field2196);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I", line = 296)
    public final int method25() {
        field3097++;
        return 4;
    }
}
