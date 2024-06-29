import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class161 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2565;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIII)V", line = 7)
    public static final void method1253(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            method1256((byte) 70);
        }
        arg4--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
        field2567++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Lhd;", line = 36)
    public class161 method892(int arg0, int arg1, int arg2) {
        field2563++;
        return this;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V", line = 44)
    public static final void method1254(boolean arg0, int arg1) {
        class152.field2417 = 1;
        class200.field3190 = false;
        class318.field5065 = -1;
        class267.field4479 = arg1;
        field2568++;
        class135.field2259 = null;
        class183.field2954 = -1;
        class66.field1177 = 0;
        if (!arg0) {
            field2565 = (FontMetrics) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()Z", line = 69)
    public boolean method890() {
        field2566++;
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 77)
    public static final void method1255(int arg0, int arg1) {
        field2562++;
        if (arg0 != -1) {
            field2565 = (FontMetrics) null;
        }
        if (class152.field2417 == 0) {
            class36.field535.method1690(arg1, (byte) 57);
        } else {
            class66.field1177 = arg1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhd;IIIZ)V", line = 97)
    public void method879(class161 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2564++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 104)
    public static void method1256(byte arg0) {
        field2565 = null;
        if (arg0 <= 55) {
            method1254(true, -89);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()I")
    public abstract int method444();

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJILdc;)V")
    public abstract void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10);
}
