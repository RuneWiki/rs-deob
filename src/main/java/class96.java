import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 extends class548 {

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "Ltf;")
    private class311 field1383;

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "Lik;")
    private class222 field1377;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "Lsia;")
    public static class765 field1374 = new class765();

    @OriginalMember(owner = "client!iia", name = "y", descriptor = "[I")
    public static int[] field1382 = new int[1];

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!iia", name = "v", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)V")
    public final void method753(int arg0, int arg1, int arg2) {
        ++field1376;
        if (arg2 == 14106) {
            float var4 = (float) ((arg1 & 3) - -1) * -5.0E-4F;
            float var5 = (float) ((arg1 >> 3 & 3) + 1) * 5.0E-4F;
            float var6 = ~(arg1 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
            boolean var7 = (128 & arg1) != 0;
            super.field7571.method1631(1, 21);
            if (!var7) {
                class759.field10408[0] = 0.0F;
                class759.field10408[2] = var6;
                class759.field10408[1] = 0.0F;
                class759.field10408[3] = 0.0F;
            } else {
                class759.field10408[2] = 0.0F;
                class759.field10408[0] = var6;
                class759.field10408[1] = 0.0F;
                class759.field10408[3] = 0.0F;
            }
            OpenGL.glTexGenfv(8192, 9474, class759.field10408, 0);
            class759.field10408[2] = 0.0F;
            class759.field10408[3] = (float) super.field7571.field3519 * var4 % 1.0F;
            class759.field10408[0] = 0.0F;
            class759.field10408[1] = var6;
            OpenGL.glTexGenfv(8193, 9474, class759.field10408, 0);
            if (!this.field1383.field4393) {
                int var8 = (int) ((float) super.field7571.field3519 * var5 * 16.0F);
                super.field7571.method1595((byte) 105, this.field1383.field4395[var8 % 16]);
            } else {
                class759.field10408[0] = 0.0F;
                class759.field10408[2] = 0.0F;
                class759.field10408[3] = (float) super.field7571.field3519 * var5 % 1.0F;
                class759.field10408[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class759.field10408, 0);
            }
            super.field7571.method1631(0, arg2 + -14052);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZ)V")
    public final void method754(boolean arg0, boolean arg1) {
        this.field1377.method1413('\u0000', 0);
        ++field1378;
        if (arg1) {
            this.method753(60, -122, -80);
        }
        if (this.field1383.field4393) {
            super.field7571.method1631(1, -73);
            super.field7571.method1595((byte) 87, this.field1383.field4394);
            super.field7571.method1631(0, 75);
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Llf;Ltf;)V")
    public class96(class250 arg0, class311 arg1) {
        super(arg0);
        this.field1383 = arg1;
        this.field1377 = new class222(arg0, 2);
        this.field1377.method1416(0, -28867);
        super.field7571.method1631(1, 18);
        if (this.field1383.field4393) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field7571.method1631(0, 86);
        this.field1377.method1418(4864);
        this.field1377.method1416(1, -28867);
        super.field7571.method1631(1, -91);
        if (this.field1383.field4393) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field7571.method1631(0, -84);
        this.field1377.method1418(4864);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method755(int arg0, String arg1, String arg2, int arg3) {
        class159.field2142 = 2;
        class340.field4758 = arg0;
        ++field1373;
        class772.method4247(arg2, 0, arg1, false);
        if (arg3 < 20) {
            field1380 = -32;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)Z")
    public final boolean method756(boolean arg0) {
        ++field1379;
        if (!arg0) {
            method755(45, (String) null, (String) null, -109);
        }
        return true;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)Lsu;")
    public static final class223 method757(byte arg0) {
        ++field1371;
        if (arg0 != 65) {
            field1380 = 121;
        }
        if (class752.field10168 != null && class374.field5448 != null) {
            class374.field5448.method1978(arg0 ^ 67, class752.field10168);
            class223 var1 = (class223) class374.field5448.method1976(false);
            if (var1 == null) {
                return null;
            } else {
                class349 var2 = class752.field10153.method2074(arg0 + 42, var1.field2885);
                return var2 != null && var2.field5055 && var2.method2228(126, class752.field10155) ? var1 : class750.method4096((byte) -23);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
    public final void method758(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method756(true);
        }
        ++field1372;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        this.field1377.method1413('\u0001', 0);
        ++field1370;
        super.field7571.method1631(1, 74);
        super.field7571.method1595((byte) 110, (class205) null);
        if (arg0 != 3) {
            this.field1377 = null;
        }
        super.field7571.method1631(0, -80);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lru;II)V")
    public final void method760(class205 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field1383 = null;
        }
        super.field7571.method1595((byte) 109, arg0);
        ++field1381;
        super.field7571.method1601(arg1 ^ -25457, arg2);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZZZ)V")
    public static final void method761(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            ++class245.field3200;
            class525.method3042(0);
        }
        ++field1375;
        if (!arg0) {
            field1382 = null;
        }
        if (arg1) {
            ++class501.field7004;
            class429.method2578(29531);
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
    public static void method762(int arg0) {
        if (arg0 != -32644) {
            method761(false, true, false);
        }
        field1374 = null;
        field1382 = null;
    }
}
