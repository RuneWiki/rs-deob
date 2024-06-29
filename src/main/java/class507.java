import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class507 {

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lrc;")
    public class539 field6772 = null;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lda;")
    public class60 field6774 = null;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field6768 = -1;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
    public static boolean field6767 = false;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Luu;")
    public static class289 field6770;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[Ls;")
    public static class282[] field6771;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[BII)Z")
    public static final boolean method2848(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field6773++;
        int var7 = arg6 % arg2;
        if (arg0 < 97) {
            method2849(-57, null, -114, 12);
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg1 + arg2 - 1) / arg2);
        int var10 = -((arg6 + arg2 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg5] == 0) {
                    return true;
                }
                arg5 += arg2;
            }
            int var13 = arg5 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILha;II)V")
    public static final void method2849(int arg0, class59 arg1, int arg2, int arg3) {
        class131.field2147 = new class224[arg3][arg0];
        class164.field2494 = arg1;
        if (arg2 != 5) {
            method2850(true);
        }
        field6769++;
        if (class427.field5887 != null) {
            class201.field3013 = class367.method2168((byte) -121, class427.field5887[1], class427.field5887[3], class427.field5887[2], class427.field5887[5], class427.field5887[4], class427.field5887[0]);
        }
        class29.field463 = new class224();
        class490.method2781((byte) 41);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public static void method2850(boolean arg0) {
        if (!arg0) {
            field6775 = 64;
        }
        field6770 = null;
        field6771 = null;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lda;)V")
    public class507(class60 arg0) {
        this.field6774 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lda;Lrc;)V")
    public class507(class60 arg0, class539 arg1) {
        this.field6772 = arg1;
        this.field6774 = arg0;
    }
}
