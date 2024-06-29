import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class177 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[S")
    public static short[] field2900 = new short[256];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    public static int[] field2898 = new int[1000];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lve;")
    public static class255 field2905 = class87.method607(68, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[[[B")
    public static byte[][][] field2897;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lme;IIIZ)V", line = 12)
    public void method1261(class177 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2904++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 21)
    public static void method1262(byte arg0) {
        if (arg0 > -50) {
            field2905 = (class255) null;
        }
        field2905 = null;
        field2900 = null;
        field2898 = null;
        field2897 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 46)
    public void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -19940) {
            field2905 = (class255) null;
        }
        field2901++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lme;", line = 57)
    public class177 method1263(int arg0, int arg1, int arg2) {
        field2903++;
        return this;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()Z", line = 67)
    public boolean method1264() {
        field2902++;
        return false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 90)
    public static final int method1265(int arg0, int arg1) {
        if (arg0 != 247) {
            method1262((byte) 36);
        }
        field2899++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
    public abstract int method176();
}
