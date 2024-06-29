import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class74 extends class498 {

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Ljava/lang/String;")
    public String field898;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Lkn;")
    public static class530 field897 = new class530("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "Lpf;")
    public static class419 field903;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "[Lgh;")
    public static class391[] field899;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 8)
    public static void method545(byte arg0) {
        field897 = null;
        if (arg0 != -112) {
            field903 = null;
        }
        field899 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZII[B)Z", line = 21)
    public static final boolean method546(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6) {
        field902++;
        int var7 = arg2 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg1 - 1) / arg0);
        int var10 = -((arg0 + arg2 - 1) / arg0);
        if (arg3) {
            method547(103);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg4] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            int var13 = arg4 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 71)
    public static final void method547(int arg0) {
        field900++;
        int var1 = (int) ((double) class43.field494 * 34.46D);
        int var2 = var1 << 0;
        if (class385.field5414.method369()) {
            var2 += 128;
        }
        class385.field5414.method348(arg0, var2);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII)V", line = 85)
    public static final void method548(byte arg0, int arg1, int arg2) {
        field901++;
        class45 var3 = class354.method2094(arg1, (byte) -105, 5);
        var3.method260(9188);
        if (arg0 > -122) {
            field897 = null;
        }
        var3.field504 = arg2;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V", line = 99)
    public class74() {
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 105)
    public class74(String arg0) {
        this.field898 = arg0;
    }
}
