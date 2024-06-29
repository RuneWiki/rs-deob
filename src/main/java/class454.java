import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class454 implements class526 {

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
    private boolean field6623 = false;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    private int field6622;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Lkd;")
    public class188 field6619;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public int field6610;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public int field6616;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Z")
    private boolean field6618;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public int field6609;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
    public static int[] field6607;

    static {
        new class234("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method2757(boolean arg0, int arg1) {
        if (arg0 != this.field6623) {
            this.field6623 = arg0;
            this.method2764((byte) -125);
        }
        field6613++;
        if (arg1 > -33) {
            this.field6623 = true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Luq;Z)V", line = 23)
    public static final void method2758(class114 arg0, boolean arg1) {
        if (arg1) {
            method2762(-114, 9, -63, -47, -116, -17, -31, 3, 99, -61);
        }
        if (arg0.field1585 == 5 && arg0.field1670 != -1) {
            class315.method2017(class377.field5692, -16777216, arg0);
        }
        field6617++;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)Z", line = 37)
    public final boolean method2759(int arg0) {
        if (arg0 < 83) {
            this.method2765(-20);
        }
        field6620++;
        if (!this.field6619.field3145) {
            return false;
        }
        int var2 = this.method2765(-88);
        this.field6619.method1289(-19391, this);
        OpenGL.glGenerateMipmapEXT(this.field6610);
        this.field6618 = true;
        this.method2764((byte) -125);
        this.method2767((byte) -31, var2);
        return true;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(ZI)V", line = 65)
    public final void method2760(boolean arg0, int arg1) {
        field6625++;
        if (arg0 != this.field6618) {
            int var3 = this.method2765(-63);
            this.field6618 = true;
            this.method2764((byte) -128);
            this.method2767((byte) -31, var3);
        }
        if (arg1 != 0) {
            this.method2757(false, 76);
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I", line = 85)
    public final int method2761(int arg0) {
        if (arg0 == 3) {
            field6612++;
            return this.field6609;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIIIIIII)V", line = 97)
    public static final void method2762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg5 && arg2 == arg4 && arg7 == arg8 && arg6 == arg9) {
            class121.method905(arg8, arg5, arg6, (byte) 97, arg1, arg4);
        } else {
            int var10 = arg5;
            int var11 = arg4;
            int var12 = arg5 * 3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg2 * 3;
            int var16 = arg7 * 3;
            int var17 = arg9 * 3;
            int var18 = arg8 - var16 - (arg5 - var14);
            int var19 = arg6 + var15 - var17 - arg4;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 - var15 - (var15 - var13);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg5 + (var28 + var30 + var32 >> 12);
                int var35 = (var29 + var33 + var31 >> 12) + arg4;
                class121.method905(var34, var10, var35, (byte) 125, arg1, var11);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = 28 % ((arg0 - 24) / 47);
        field6615++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 174)
    public final void method2763(byte arg0) {
        field6621++;
        if (this.field6609 > 0) {
            this.field6619.method1308(this.field6609, (byte) 65, this.method2765(arg0 - 130));
            this.field6609 = 0;
        }
        if (arg0 != 75) {
            method2758(null, false);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V", line = 192)
    private final void method2764(byte arg0) {
        if (arg0 >= -120) {
            return;
        }
        this.field6619.method1289(-19391, this);
        field6624++;
        if (this.field6623) {
            OpenGL.glTexParameteri(this.field6610, 10241, this.field6618 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6610, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6610, 10241, this.field6618 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6610, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V", line = 214)
    protected final void finalize() throws Throwable {
        this.method2763((byte) 75);
        field6608++;
        super.finalize();
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)I", line = 225)
    private final int method2765(int arg0) {
        field6611++;
        int var2 = this.field6619.method1306(false, this.field6616) * this.field6622;
        if (arg0 > -23) {
            this.field6622 = -115;
        }
        return this.field6618 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lkd;IIIZ)V", line = 252)
    public class454(class188 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6622 = arg3;
        this.field6619 = arg0;
        this.field6610 = arg1;
        this.field6616 = arg2;
        this.field6618 = arg4;
        OpenGL.glGenTextures(1, class61.field728, 0);
        this.field6609 = class61.field728[0];
        this.method2767((byte) -31, 0);
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V", line = 270)
    public static void method2766(int arg0) {
        int var1 = 46 / ((arg0 - 40) / 52);
        field6607 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)V", line = 281)
    private final void method2767(byte arg0, int arg1) {
        this.field6619.field3042 -= arg1;
        field6626++;
        if (arg0 != -31) {
            this.field6623 = false;
        }
        this.field6619.field3042 += this.method2765(-30);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public abstract void method1031(int arg0);
}
