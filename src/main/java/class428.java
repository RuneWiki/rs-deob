import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class428 {

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    private int field5966 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lwk;")
    private class155 field5963;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field5969 = 13156520;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lhq;")
    public static class30 field5972 = new class30("", 12);

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "J")
    public static long field5973 = 0L;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lap;")
    public static class310 field5974 = new class310(32, 3);

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lcf;")
    public static class92 field5975 = new class92();

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lrs;")
    private class449 field5971;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[S")
    public static short[] field5968;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lrs;", line = 5)
    public final class449 method2556(int arg0) {
        this.field5966 = 0;
        int var2 = -85 / ((arg0 - 51) / 62);
        field5970++;
        return this.method2559((byte) 106);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 19)
    public static void method2557(boolean arg0) {
        field5974 = null;
        field5975 = null;
        field5968 = null;
        field5972 = null;
        if (!arg0) {
            field5969 = -109;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lid;IIILir;ILvc;Lwe;)V", line = 34)
    public static final void method2558(class266 arg0, int arg1, int arg2, int arg3, class226 arg4, int arg5, class89 arg6, class76 arg7) {
        field5965++;
        int var8 = arg0.field3830 - (arg5 / 2) - 5;
        int var9 = arg2 + 2;
        if (arg7.field1105 != 0) {
            arg6.method742(11, var9, arg1 * arg4.method1539() + arg2 + 1 - var9, arg5 + 10, arg7.field1105, var8);
        }
        if (arg7.field1099 != 0) {
            arg6.method751(arg5 + 10, -var9 + arg4.method1539() * arg1 + (arg2 - -1), var8, arg7.field1099, 114, var9);
        }
        int var10 = arg7.field1126;
        if (arg0.field3829 && arg7.field1125 != -1) {
            var10 = arg7.field1125;
        }
        for (int var11 = arg3; var11 < arg1; var11++) {
            String var12 = class200.field2970[var11];
            if (arg1 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg4.method1541(arg6, var12, arg0.field3830, arg2, var10, true);
            arg2 += arg4.method1539();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lrs;", line = 73)
    public final class449 method2559(byte arg0) {
        field5967++;
        if (this.field5966 > 0 && this.field5963.field2144[this.field5966 - 1] != this.field5971) {
            class449 var2 = this.field5971;
            this.field5971 = var2.field6385;
            return var2;
        } else if (arg0 < 89) {
            return null;
        } else {
            while (this.field5966 < this.field5963.field2150) {
                class449 var3 = this.field5963.field2144[this.field5966++].field6385;
                if (this.field5963.field2144[this.field5966 - 1] != var3) {
                    this.field5971 = var3.field6385;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 108)
    public static final void method2560(byte arg0) {
        field5964++;
        class262[] var1 = class320.field4513;
        synchronized (class320.field4513) {
            for (int var2 = 0; var2 < class320.field4513.length; var2++) {
                class320.field4513[var2] = new class262();
                class165.field2404[var2] = 0;
            }
            int var3 = 31 % ((-arg0 - 59) / 36);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lwk;)V", line = 139)
    public class428(class155 arg0) {
        this.field5963 = arg0;
    }
}
