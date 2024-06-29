import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class130 {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field2155;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2153;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    public int[] field2156;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIILci;IJZ)Z")
    public static final boolean method942(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class155.method1120(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method943(int arg0) {
        if (arg0 == 128) {
            class63.method484(this.field2156, this.field2158, this.field2163);
            field2162++;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method745(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method744(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public abstract void method746(Component arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void method944(boolean arg0) {
        if (!arg0) {
            field2157 = 40;
        }
        field2153 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    protected class130() {
    }
}
