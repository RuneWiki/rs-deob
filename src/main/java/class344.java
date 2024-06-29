import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class344 implements class67 {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[F")
    private float[] field5429 = new float[4];

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5434 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5438 = "glow3:";

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    private int field5428;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([IIIIB)V", line = 5)
    public static final void method2417(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5436++;
        arg1--;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var9 = var7 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            arg1 = var13 + 1;
            arg0[arg1] = arg3;
        }
        while (var8 > arg1) {
            arg1++;
            arg0[arg1] = arg3;
        }
        if (arg4 >= -117) {
            field5434 = 62;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 33)
    public final void method222() {
        field5437++;
        GL var1 = class241.field4012;
        var1.glCallList(this.field5428 + 1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method2418(int arg0, byte arg1) {
        if (arg1 <= -34) {
            field5439++;
            if (class267.method1874(arg0, (byte) 12)) {
                class251.method1767(-1, (byte) 80, class178.field2938[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 69)
    public static final void method2419(int arg0) {
        field5427++;
        class261.field4304.method895(128);
        int var1 = -79 % ((arg0 - 7) / 60);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 214)
    public class344() {
        this.method2420(true);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()I", line = 83)
    public final int method226() {
        field5433++;
        return 0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 93)
    private final void method2420(boolean arg0) {
        GL var2 = class241.field4012;
        this.field5428 = var2.glGenLists(2);
        var2.glNewList(this.field5428, 4864);
        field5431++;
        var2.glActiveTexture(33985);
        if (class106.field1934) {
            var2.glBindTexture(32879, class106.field1931);
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
        if (!arg0) {
            return;
        }
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field5428 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class106.field1934) {
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

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V", line = 139)
    public final void method224() {
        field5426++;
        GL var1 = class241.field4012;
        var1.glCallList(this.field5428);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 152)
    public final void method225(int arg0) {
        field5435++;
        GL var2 = class241.field4012;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x1A) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field5429[1] = 0.0F;
            this.field5429[2] = 0.0F;
            this.field5429[0] = var5;
            this.field5429[3] = 0.0F;
        } else {
            this.field5429[0] = 0.0F;
            this.field5429[3] = 0.0F;
            this.field5429[2] = var5;
            this.field5429[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class49.field1023 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class281.field4604 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class103.field1901), (float) (-class269.field4378), (float) (-class260.field4254));
        var2.glTexGenfv(8192, 9474, this.field5429, 0);
        this.field5429[3] = (float) class241.field4024 * var3;
        this.field5429[0] = 0.0F;
        this.field5429[2] = 0.0F;
        this.field5429[1] = var5;
        var2.glTexGenfv(8193, 9474, this.field5429, 0);
        var2.glPopMatrix();
        if (class106.field1934) {
            this.field5429[2] = 0.0F;
            this.field5429[3] = (float) class241.field4024 * var4;
            this.field5429[0] = 0.0F;
            this.field5429[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5429, 0);
        } else {
            int var7 = (int) ((float) class241.field4024 * var4 * 64.0F);
            var2.glBindTexture(3553, class106.field1932[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)I", line = 228)
    public static final int method2421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class133.field2290) {
            arg4 = 1000000;
            class133.field2290 = false;
        }
        field5425++;
        class134 var5 = class191.field3233[arg3][arg1];
        float var6 = ((float) arg2 * 0.1F + 0.7F) * var5.field2312;
        int var7 = var5.field2311;
        float var8 = var5.field2296;
        float var9 = var5.field2308;
        int var10 = var5.field2294;
        int var11 = var5.field2310;
        if (arg0 < 117) {
            field5434 = -85;
        }
        class262 var12 = var5.field2309;
        float var13 = var5.field2303;
        if (!class264.field4330) {
            var11 = 0;
        }
        float var14 = var5.field2306;
        float var15 = var5.field2299;
        if (class200.field3352 != var7 || class68.field1266 != var6 || class238.field3915 != var8 || class338.field5362 != var9 || class18.field492 != var10 || class133.field2278 != var11 || class21.field549 != var12 || class198.field3329 != var14 || class266.field4351 != var15 || class88.field1550 != var13) {
            class39.field846 = class205.field3411;
            class166.field2780 = class123.field2167;
            class201.field3378 = class109.field1999;
            class276.field4494 = class131.field2258;
            class148.field2523 = class222.field3667;
            class216.field3610 = class125.field2204;
            class133.field2293 = class217.field3623;
            class68.field1267 = class296.field4843;
            class234.field3834 = class146.field2483;
            class300.field4881 = class352.field5618;
            if (class232.field3796 == null || class232.field3796 == class148.field2523) {
                class232.field3796 = new class262();
            }
            class21.field549 = var12;
            class266.field4351 = var15;
            class133.field2278 = var11;
            class160.field2698 = 0;
            class200.field3352 = var7;
            class238.field3915 = var8;
            class18.field492 = var10;
            class68.field1266 = var6;
            class338.field5362 = var9;
            class88.field1550 = var13;
            class198.field3329 = var14;
        }
        if (class160.field2698 < 65536) {
            class160.field2698 += arg4 * 250;
            if (class160.field2698 >= 65536) {
                class148.field2523 = null;
                class125.field2204 = class198.field3329;
                class160.field2698 = 65536;
                class131.field2258 = class133.field2278;
                class296.field4843 = class238.field3915;
                class123.field2167 = class200.field3352;
                class352.field5618 = class68.field1266;
                class217.field3623 = class18.field492;
                class222.field3667 = class21.field549;
                class205.field3411 = class338.field5362;
                class146.field2483 = class266.field4351;
                class109.field1999 = class88.field1550;
            } else {
                int var16 = class160.field2698 >> 8;
                int var17 = 65536 - class160.field2698 >> 8;
                class131.field2258 = class276.field4494 * var17 + (class133.field2278 * var16) >> 8;
                class123.field2167 = ((class166.field2780 & 0xFF00FF) * var17 + ((class200.field3352 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class200.field3352 & 0xFF00) * var16 + (class166.field2780 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class217.field3623 = ((class133.field2293 & 0xFF00FF) * var17 + ((class18.field492 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class18.field492 & 0xFF00) * var16 + (class133.field2293 & 0xFF00) * var17 & 0xFF0000) >> 8;
                float var18 = (float) (65536 - class160.field2698) / 65536.0F;
                float var19 = (float) class160.field2698 / 65536.0F;
                class296.field4843 = class68.field1267 * var18 + class238.field3915 * var19;
                class205.field3411 = class39.field846 * var18 + class338.field5362 * var19;
                class109.field1999 = class88.field1550 * var19 + class201.field3378 * var18;
                class352.field5618 = class68.field1266 * var19 + class300.field4881 * var18;
                class146.field2483 = class266.field4351 * var19 + class234.field3834 * var18;
                class125.field2204 = class216.field3610 * var18 + class198.field3329 * var19;
                if (class21.field549 != class148.field2523) {
                    if (class148.field2523 == null || class21.field549 == null) {
                        class222.field3667 = null;
                    } else {
                        class222.field3667 = class232.field3796.method1842(class148.field2523, class21.field549, (float) class160.field2698 / 65536.0F);
                    }
                }
            }
        }
        return class217.field3623;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lto;Lek;Lek;I)V", line = 354)
    public static final void method2422(class268 arg0, class206 arg1, class206 arg2, int arg3) {
        field5432++;
        class269.field4380 = arg2;
        class108.field1995 = arg0;
        if (arg3 != -12060) {
            field5434 = 62;
        }
        class147.field2505 = arg1;
        if (class269.field4380 != null) {
            class220.field3660 = class269.field4380.method1417(true, 1);
        }
        if (class147.field2505 != null) {
            class141.field2381 = class147.field2505.method1417(true, 1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 374)
    public static void method2423(int arg0) {
        if (arg0 != 0) {
            field5434 = -91;
        }
        field5438 = null;
    }
}
