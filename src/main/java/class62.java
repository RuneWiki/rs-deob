import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class62 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "J")
    public long field1002;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lkw;")
    private class346 field997;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    public static int[] field999;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[Llia;")
    public static class187[] field1000;

    @OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() throws Throwable {
        this.field997.method2118(this.field1002, true);
        field1003++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 22)
    public static final String method577(int arg0, byte[] arg1, int arg2, int arg3) {
        field1001++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var8 = arg1[arg3 + var6] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class93.field1328[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        int var7 = 7 % ((arg0 - 24) / 60);
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLha;I)Lqt;", line = 63)
    public static final class502 method578(byte arg0, class543 arg1, int arg2) {
        field996++;
        class297 var3 = class218.method1536(arg1, arg2, -120, true);
        if (var3 == null) {
            return null;
        } else if (arg0 == -106) {
            return var3.field4061;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 82)
    public static void method579(byte arg0) {
        field1000 = null;
        if (arg0 < 48) {
            field998 = -67;
        }
        field999 = null;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lkw;J[Ltn;)V", line = 93)
    public class62(class346 arg0, long arg1, class716[] arg2) {
        this.field1002 = arg1;
        this.field997 = arg0;
    }
}
