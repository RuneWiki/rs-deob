import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class722 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    private int field10045 = 0;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Ltba;")
    private class165 field10044;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljava/lang/String;")
    public static String field10043 = null;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Lal;")
    public static class102 field10048 = new class102("stellardawn", 1);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Ldfa;")
    private class168 field10047;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 5)
    public static void method4029(int arg0) {
        int var1 = -117 % ((arg0 - 36) / 39);
        field10048 = null;
        field10043 = null;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V", line = 118)
    public class722() {
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ltba;)V", line = 120)
    public class722(class165 arg0) {
        this.field10044 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[BIIIB)Z", line = 27)
    public static final boolean method4030(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte arg6) {
        field10049++;
        int var7 = arg3 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg4 - 1) / arg0);
        int var10 = -((arg0 + arg3 - 1) / arg0);
        if (arg6 != 0) {
            method4029(37);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg5] == 0) {
                    return true;
                }
                arg5 += arg0;
            }
            int var13 = arg5 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)Ldfa;", line = 76)
    public final class168 method4031(boolean arg0) {
        field10042++;
        this.field10045 = 0;
        if (arg0) {
            field10043 = null;
        }
        return this.method4032((byte) 80);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)Ldfa;", line = 88)
    public final class168 method4032(byte arg0) {
        field10046++;
        if (this.field10045 > 0 && this.field10044.field2298[this.field10045 - 1] != this.field10047) {
            class168 var2 = this.field10047;
            this.field10047 = var2.field2336;
            return var2;
        }
        if (arg0 < 64) {
            this.method4031(false);
        }
        while (this.field10045 < this.field10044.field2301) {
            class168 var3 = this.field10044.field2298[this.field10045++].field2336;
            if (this.field10044.field2298[this.field10045 - 1] != var3) {
                this.field10047 = var3.field2336;
                return var3;
            }
        }
        return null;
    }
}
