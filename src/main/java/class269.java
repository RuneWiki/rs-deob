import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class269 extends class512 {

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    private int field3963;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    private int field3965;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3970;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field3968;

    static {
        new class331("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field3970 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 11)
    public static void method1727(int arg0) {
        field3970 = null;
        if (arg0 != 255) {
            method1728((class387) null, 78);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V", line = 21)
    public final void method1252(int arg0, int arg1, int arg2) {
        ++field3960;
        if (arg0 >= -78) {
            field3961 = 67;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lfs;I)V", line = 36)
    public static final void method1728(class387 arg0, int arg1) {
        class224.field3286 = arg0;
        if (arg1 != 3325) {
            method1729(-2, (int[]) null, -54, -20, 100, 110, 69, 36);
        }
        ++field3967;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 57)
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3958 = arg7;
        this.field3969 = arg6;
        this.field3963 = arg5;
        this.field3955 = arg3;
        this.field3962 = arg4;
        this.field3956 = arg1;
        this.field3957 = arg2;
        this.field3965 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I[IIIIIII)V", line = 72)
    public static final void method1729(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3968;
        if (arg7 != 17054) {
            method1727(-23);
        }
        if (~arg4 < -1 && !class305.method1900(200, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class305.method1900(200, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 != 32993) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = ~arg3 >= ~arg4 ? arg3 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg1;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg6, var8, arg2, arg4, arg3, 0, arg0, arg5, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                int[] var17 = var13;
                for (int var18 = 0; ~var11 < ~var18; ++var18) {
                    for (int var19 = 0; var19 < var10; ++var19) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = 255 & var20 >> 16;
                        int var24 = var20 & 255;
                        int var25 = 255 & var20 >> 24;
                        int var26 = var12[var16++];
                        int var27 = var20 >> 8 & 255;
                        int var28 = (var22 >> 8 & 255) + var27;
                        int var29 = (255 & var22 >> 16) + var23;
                        int var30 = (var22 >> 24 & 255) + var25;
                        int var31 = (var22 & 255) + var24;
                        int var32 = (255 & var21) + var31;
                        int var33 = (var21 >> 16 & 255) + var29;
                        int var34 = ((65392 & var21) >> 8) + var28;
                        int var35 = (var21 >> 24 & 255) + var30;
                        int var36 = (255 & var26 >> 16) + var33;
                        int var37 = (255 & var26) + var32;
                        int var38 = (255 & var26 >> 24) + var35;
                        int var39 = (255 & var26 >> 8) + var34;
                        var13[var14++] = class244.method1606(class345.method2089(1020, var37) >> 2, class244.method1606(class345.method2089(1020, var39) << 6, class244.method1606(class345.method2089(1020, var36) << 14, class345.method2089(var38, 1020) << 22)));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                var13 = var12;
                var12 = var17;
                arg4 = var10;
                arg3 = var11;
                var10 >>= 1;
                var9 >>= 1;
                ++var8;
                var11 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 178)
    public final void method1249(int arg0, int arg1, int arg2) {
        if (arg0 != 24245) {
            this.field3969 = -75;
        }
        ++field3966;
        int var4 = this.field3965 * arg2 >> 12;
        int var5 = this.field3956 * arg1 >> 12;
        int var6 = this.field3957 * arg2 >> 12;
        int var7 = this.field3955 * arg1 >> 12;
        int var8 = this.field3962 * arg2 >> 12;
        int var9 = this.field3963 * arg1 >> 12;
        int var10 = this.field3969 * arg2 >> 12;
        int var11 = this.field3958 * arg1 >> 12;
        class471.method2853(var10, var8, var7, var11, var6, var9, var4, super.field7550, var5, -1);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(III)V", line = 208)
    public final void method1251(int arg0, int arg1, int arg2) {
        if (arg1 == 4) {
            ++field3959;
        }
    }
}
