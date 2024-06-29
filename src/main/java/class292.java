import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class292 extends class45 {

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Ljl;")
    public static class332 field4724 = new class332(16);

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Z")
    public static boolean field4726 = true;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
    public static int[] field4727 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Ljl;")
    public static class332 field4729 = new class332(4);

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Lad;")
    public static class342 field4728;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
    public int[] field4716;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "[I")
    public int[] field4720;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[I")
    public int[] field4725;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[Len;")
    public class192[] field4714;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[Len;")
    public class192[] field4721;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[[[B")
    public byte[][][] field4715;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FIIIZIIII)[[I", line = 8)
    public static final int[][] method2110(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg1][arg2];
        class193 var10 = new class193();
        field4719++;
        var10.field3078 = (int) (arg0 * 4096.0F);
        var10.field3073 = arg8;
        var10.field3085 = arg4;
        var10.field3076 = arg3;
        var10.field3071 = arg5;
        var10.method553((byte) -98);
        class57.method464(0, arg2, arg1);
        if (arg7 < 92) {
            return (int[][]) ((int[][]) null);
        } else {
            for (int var11 = 0; var11 < arg1; var11++) {
                var10.method1502(var9[var11], var11, (byte) 123);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 40)
    public static final void method2111(int arg0) {
        if (arg0 != 6335) {
            field4727 = (int[]) null;
        }
        class187.field3003.method2326(-4);
        field4717++;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V", line = 55)
    public static void method2112(byte arg0) {
        field4724 = null;
        field4729 = null;
        field4728 = null;
        field4727 = null;
        if (arg0 != 124) {
            method2112((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBIIII)V", line = 79)
    public static final void method2113(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4723++;
        if (arg1 != -89) {
            method2111(-106);
        }
        for (int var6 = arg5; var6 <= arg3; var6++) {
            class161.method1253(arg0, class353.field5599[var6], arg1 ^ 0x58, arg2, arg4);
        }
    }
}
