import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class200 extends class24 {

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[B")
    public byte[] field3297;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field3298 = 50;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field3296 = 1;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "[I")
    public static int[] field3302 = new int[2];

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Ldk;")
    public static class241 field3300;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lfj;")
    public static class283 field3303;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "[[[B")
    public static byte[][][] field3299;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V", line = 11)
    public class200(byte[] arg0) {
        this.field3297 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZIII)V", line = 28)
    public static final void method1404(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3301++;
        class143 var5 = (class143) class259.field4390.method493((long) arg4, 106);
        if (var5 == null) {
            var5 = new class143();
            class259.field4390.method490(var5, (long) arg4, !arg1);
        }
        if (var5.field2207.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field2207.length; var8++) {
                var6[var8] = var5.field2207[var8];
                var7[var8] = var5.field2201[var8];
            }
            for (int var9 = var5.field2207.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2207 = var6;
            var5.field2201 = var7;
        }
        if (arg1) {
            field3298 = 112;
        }
        var5.field2207[arg3] = arg2;
        var5.field2201[arg3] = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V", line = 82)
    public static void method1405(byte arg0) {
        field3302 = null;
        field3303 = null;
        field3300 = null;
        field3299 = (byte[][][]) null;
        if (arg0 != 116) {
            method1406(-60);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 95)
    public static final void method1406(int arg0) {
        field3295++;
        if (arg0 != 9149) {
            method1405((byte) 84);
        }
        if (class270.field4537 != null) {
            class270.field4537.method1229(545);
        }
    }
}
