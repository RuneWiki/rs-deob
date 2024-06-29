import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class210 implements class264 {

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
    private boolean field2773 = false;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
    private boolean field2771;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Leea;")
    public class131 field2761;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2763 = -1;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2774 = -1;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lfp;")
    public static class323 field2772;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lnga;")
    public static class513 field2759;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    private final void method1285(boolean arg0) {
        field2775++;
        this.field2761.method926(this, 48);
        if (!arg0) {
            this.field2776 = -115;
        }
        if (this.field2773) {
            OpenGL.glTexParameteri(this.field2781, 10241, this.field2771 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2781, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2781, 10241, this.field2771 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2781, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public final void method1286(boolean arg0) {
        field2770++;
        if (arg0 && this.field2762 > 0) {
            this.field2761.method932(this.method1289(90), -188, this.field2762);
            this.field2762 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1286(true);
        field2767++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1287(int arg0) {
        if (arg0 == -22076) {
            field2772 = null;
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
    public final void method1288(int arg0, boolean arg1) {
        if (arg0 != 10240) {
            this.method1286(false);
        }
        if (arg1 != this.field2771) {
            int var3 = this.method1289(arg0 - 10212);
            this.field2771 = true;
            this.method1285(true);
            this.method1298(17328, var3);
        }
        field2777++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
    private final int method1289(int arg0) {
        field2765++;
        int var2 = this.field2761.method880(-22330, this.field2776) * this.field2769;
        if (arg0 < 18) {
            this.method1285(false);
        }
        return this.field2771 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)Z")
    public final boolean method1290(int arg0) {
        field2766++;
        if (arg0 != 0) {
            this.method1289(-85);
        }
        if (!this.field2761.field1858) {
            return false;
        }
        int var2 = this.method1289(37);
        this.field2761.method926(this, 127);
        OpenGL.glGenerateMipmapEXT(this.field2781);
        this.field2771 = true;
        this.method1285(true);
        this.method1298(arg0 ^ 0x43B0, var2);
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)I")
    public final int method1291(int arg0) {
        field2778++;
        if (arg0 != -32626) {
            this.method1285(true);
        }
        return this.field2762;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lkba;[Lwi;)V")
    public static final void method1292(class105 arg0, class465[] arg1) {
        if (class370.field5217) {
            int var2 = arg0.method618(arg1, -1);
            class362.field5135.method372(var2, arg1);
        }
        if (class459.field6474 == class135.field1969) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class524) {
                var5 = ((class524) arg0).field7415;
                var6 = ((class524) arg0).field7418;
            } else {
                var5 = arg0.field1264 >> class660.field9038;
                var6 = arg0.field1250 >> class660.field9038;
            }
            class362.field5135.method444(class588.field8292[0].method1815(arg0.field1250, arg0.field1264, -127), class438.method2646(var5, var6), class226.method1414(var5, var6), class356.method2291(var5, var6));
        }
        class387 var7 = arg0.method755((byte) -127, class362.field5135);
        if (var7 == null) {
            return;
        }
        if (arg0.field1263) {
            class137[] var8 = var7.field5482;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class137 var10 = var8[var9];
                if (var10.field1987) {
                    class189.method1186(var10.field1989 + var10.field1988, var10.field1990 + var10.field1988, (byte) -86, var10.field1985 - var10.field1988, var10.field1986 - var10.field1988);
                }
            }
        }
        if (var7.field5480) {
            var7.field5483 = arg0;
            if (class661.field9049) {
                class466 var11 = class471.field6690;
                synchronized (class471.field6690) {
                    class471.field6690.method2782((byte) -91, var7);
                    return;
                }
            }
            class471.field6690.method2782((byte) -107, var7);
            return;
        }
        class266.method1739(0, var7);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB[F)[F")
    public static final float[] method1293(int arg0, byte arg1, float[] arg2) {
        if (arg1 != 31) {
            method1293(-67, (byte) -23, null);
        }
        field2779++;
        float[] var3 = new float[arg0];
        class255.method1689(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILeea;Ljava/lang/String;)Lpo;")
    public static final class558 method1294(boolean arg0, int arg1, class131 arg2, String arg3) {
        field2758++;
        if (!arg0) {
            field2763 = 78;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class102.field1218, 0);
        if (class102.field1218[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class558(arg2, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lfp;BLd;)V")
    public static final void method1295(class323 arg0, byte arg1, class149 arg2) {
        class559.field7844 = arg0;
        if (arg1 > -107) {
            method1295(null, (byte) 15, null);
        }
        class487.field6844 = arg2;
        field2768++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
    public static final boolean method1296(byte arg0, int arg1, int arg2) {
        if (arg0 > -84) {
            method1296((byte) 25, 40, -126);
        }
        field2764++;
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZZ)V")
    public final void method1297(boolean arg0, boolean arg1) {
        if (arg0 != this.field2773) {
            this.field2773 = arg0;
            this.method1285(!arg1);
        }
        if (arg1) {
            method1295(null, (byte) -38, null);
        }
        field2760++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    private final void method1298(int arg0, int arg1) {
        this.field2761.field1803 -= arg1;
        field2780++;
        if (arg0 != 17328) {
            this.field2761 = null;
        }
        this.field2761.field1803 += this.method1289(arg0 ^ 0x4395);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Leea;IIIZ)V")
    public class210(class131 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2781 = arg1;
        this.field2771 = arg4;
        this.field2761 = arg0;
        this.field2776 = arg2;
        this.field2769 = arg3;
        OpenGL.glGenTextures(1, class128.field1535, 0);
        this.field2762 = class128.field1535[0];
        this.method1298(17328, 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public abstract void method1299(int arg0);
}
