import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class61 implements class97 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[F")
    private float[] field721 = new float[4];

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field724 = new String[100];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/lang/String;")
    public static String field726;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lnk;I)V", line = 5)
    public static final void method371(class16 arg0, int arg1) {
        if (arg1 != -1) {
            field724 = (String[]) null;
        }
        field720++;
        class345.field5469 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 16)
    private final void method372(byte arg0) {
        field728++;
        GL var2 = class272.field4310;
        if (arg0 >= -124) {
            this.method372((byte) 105);
        }
        this.field725 = var2.glGenLists(2);
        var2.glNewList(this.field725, 4864);
        var2.glActiveTexture(33985);
        if (class144.field2303) {
            var2.glBindTexture(32879, class144.field2297);
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
        var2.glNewList(this.field725 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class144.field2303) {
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

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I", line = 61)
    public final int method148() {
        field723++;
        return 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V", line = 72)
    public static final void method373(int arg0, int arg1, int arg2) {
        field729++;
        class279 var3 = class147.method1085(arg2, -19443, 1);
        if (arg0 == -23578) {
            var3.method1989(arg0 + 23578);
            var3.field4388 = arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 244)
    public class61() {
        this.method372((byte) -126);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILwf;II)V", line = 92)
    public static final void method374(int arg0, int arg1, class67 arg2, int arg3, int arg4) {
        field722++;
        if (class11.field113 == arg2 || class74.field924 >= 400) {
            return;
        }
        String var11;
        if (arg2.field819 == 0) {
            boolean var5 = true;
            if (class11.field113.field807 != -1 && arg2.field807 != -1) {
                int var6 = arg2.field807 > class11.field113.field807 ? class11.field113.field807 : arg2.field807;
                int var7 = class11.field113.field840 > arg2.field840 ? class11.field113.field840 : arg2.field840;
                int var8 = var7 * 10 / 100 + var6 + 5;
                int var9 = class11.field113.field840 - arg2.field840;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class199.field3024 == 1 ? class25.field294 : class355.field5648;
            if (arg2.field826 > arg2.field840) {
                var11 = arg2.method419((byte) -51) + (var5 ? class295.method2098(arg2.field840, 44, class11.field113.field840) : "<col=ffffff>") + " (" + var10 + arg2.field840 + "+" + (arg2.field826 - arg2.field840) + ")";
            } else {
                var11 = arg2.method419((byte) -51) + (var5 ? class295.method2098(arg2.field840, 32, class11.field113.field840) : "<col=ffffff>") + " (" + var10 + arg2.field840 + ")";
            }
        } else {
            var11 = arg2.method419((byte) -51) + " (" + class291.field4580 + arg2.field819 + ")";
        }
        if (class119.field1662 == 1) {
            class67.method413(arg4, arg3 - 30856, class212.field3224, class201.field3074 + " -> <col=ffffff>" + var11, class50.field576, (short) 46, (long) arg0, arg1);
            class72.field906++;
        } else if (!class101.field1371) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class143.field2266[var12] != null) {
                    class17.field202++;
                    short var13 = 0;
                    if (class199.field3024 == 0 && class143.field2266[var12].equalsIgnoreCase(class91.field1201)) {
                        if (arg2.field840 > class11.field113.field840) {
                            var13 = 2000;
                        }
                        if (class11.field113.field836 != 0 && arg2.field836 != 0) {
                            if (class11.field113.field836 == arg2.field836) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class211.field3190[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class140.field2142[var12];
                    short var16 = (short) (var13 + var15);
                    class67.method413(arg4, arg3 ^ 0x7888, class146.field2324[var12], "<col=ffffff>" + var11, class143.field2266[var12], var16, (long) arg0, arg1);
                }
            }
        } else if ((class139.field2088 & 0x8) != 0) {
            class146.field2319++;
            class67.method413(arg4, 0, class5.field48, class191.field2868 + " -> <col=ffffff>" + var11, class260.field4110, (short) 20, (long) arg0, arg1);
        }
        if (arg3 != 30856) {
            field726 = (String) null;
        }
        for (int var17 = 0; var17 < class74.field924; var17++) {
            if (class105.field1442[var17] == 28) {
                class222.field3357[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 224)
    public static void method375(int arg0) {
        field726 = null;
        field724 = null;
        int var1 = 116 % ((arg0 + 6) / 41);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V", line = 235)
    public final void method147() {
        field718++;
        GL var1 = class272.field4310;
        var1.glCallList(this.field725 + 1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 254)
    public final void method152() {
        GL var1 = class272.field4310;
        var1.glCallList(this.field725);
        field730++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V", line = 267)
    public static final void method376(int arg0, byte arg1) {
        if (arg1 <= 3) {
            field726 = (String) null;
        }
        if (class180.field2694 == null || class180.field2694.length < arg0) {
            class180.field2694 = new int[arg0];
        }
        field719++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 286)
    public final void method150(int arg0) {
        GL var2 = class272.field4310;
        field727++;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var4 = (arg0 & 0x80) != 0;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var4) {
            this.field721[0] = var5;
            this.field721[1] = 0.0F;
            this.field721[2] = 0.0F;
            this.field721[3] = 0.0F;
        } else {
            this.field721[2] = var5;
            this.field721[3] = 0.0F;
            this.field721[0] = 0.0F;
            this.field721[1] = 0.0F;
        }
        float var6 = (float) (((arg0 & 0x1B) >> 3) + 1) * 0.01F;
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class54.field616 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class189.field2840 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class328.field5286), (float) (-class32.field376), (float) (-class76.field987));
        var2.glTexGenfv(8192, 9474, this.field721, 0);
        this.field721[3] = (float) class272.field4280 * var3;
        this.field721[1] = var5;
        this.field721[0] = 0.0F;
        this.field721[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field721, 0);
        var2.glPopMatrix();
        if (class144.field2303) {
            this.field721[2] = 0.0F;
            this.field721[1] = 0.0F;
            this.field721[3] = (float) class272.field4280 * var6;
            this.field721[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field721, 0);
        } else {
            int var7 = (int) ((float) class272.field4280 * var6 * 64.0F);
            var2.glBindTexture(3553, class144.field2301[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }
}
