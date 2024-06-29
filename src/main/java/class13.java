import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class90 {

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[B")
    public byte[] field240;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public static int[] field243 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[Llf;")
    public static class110[] field247 = new class110[50];

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "J")
    public static long field244;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    public static void method93(byte arg0) {
        field245 = null;
        if (arg0 < 59) {
            method93((byte) -47);
        }
        field247 = null;
        field243 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
    public class13(byte[] arg0) {
        this.field240 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
    public static final void method94(int arg0, int arg1) {
        class49.field960 = arg1;
        if (arg0 > 81) {
            field242++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[Lrf;[SI)V")
    public static final void method95(int arg0, int arg1, class163[] arg2, short[] arg3, int arg4) {
        if (arg4 != 1) {
            method93((byte) -72);
        }
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            class163 var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method1055(var7, 99) < (var9 & 0x1)) {
                    class163 var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method95(var6 - 1, arg1, arg2, arg3, 1);
            method95(arg0, var6 + 1, arg2, arg3, 1);
        }
        field246++;
    }
}
