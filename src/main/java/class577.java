import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class577 {

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    private int field8315 = 0;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Lsi;")
    private class769 field8317;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field8318 = 0;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "Lit;")
    private class766 field8322;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lit;")
    public final class766 method3396(int arg0) {
        if (arg0 != 3) {
            method3398(true, -111, null, 31, null);
        }
        field8316++;
        if (this.field8315 > 0 && this.field8317.field10613[this.field8315 - 1] != this.field8322) {
            class766 var2 = this.field8322;
            this.field8322 = var2.field10591;
            return var2;
        }
        while (this.field8317.field10620 > this.field8315) {
            class766 var3 = this.field8317.field10613[this.field8315++].field10591;
            if (this.field8317.field10613[this.field8315 - 1] != var3) {
                this.field8322 = var3.field10591;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)Lit;")
    public final class766 method3397(boolean arg0) {
        this.field8315 = 0;
        field8321++;
        if (arg0) {
            this.field8317 = null;
        }
        return this.method3396(3);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI[Ljava/lang/String;I[S)V")
    public static final void method3398(boolean arg0, int arg1, String[] arg2, int arg3, short[] arg4) {
        if (arg3 < arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method3398(arg0, var6 - 1, arg2, arg3, arg4);
            method3398(false, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0) {
            method3398(true, 7, null, -82, null);
        }
        field8319++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)I")
    public static final int method3399(int arg0, int arg1, int arg2, int arg3) {
        field8314++;
        if (class678.field9594 == null) {
            return 0;
        }
        if (arg2 != -8724) {
            method3400();
        }
        int var4 = arg1 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class192.field2891 - 1 || var5 > (class456.field6225 - 1)) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class336.field4782[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class678.field9594[var6].method2478(true, arg0, arg1);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "()V")
    public static final void method3400() {
        for (int var0 = 0; var0 < class495.field6792.length; var0++) {
            class495.field6792[var0].method3998();
        }
        class495.field6792 = null;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
    public class577() {
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lsi;)V")
    public class577(class769 arg0) {
        this.field8317 = arg0;
    }
}
