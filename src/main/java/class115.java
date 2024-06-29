import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class115 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
    public static final String method785(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1427++;
        char[] var4 = new char[arg0];
        if (arg3 != 101) {
            return null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class89.field1159[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIILmf;)V")
    public static final void method786(int arg0, int arg1, int arg2, int arg3, class387 arg4) {
        class565 var5 = class417.method2319(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field4961 = (arg1 << class480.field5972) + class660.field8949;
        arg4.field4957 = arg3;
        arg4.field4959 = (arg2 << class480.field5972) + class660.field8949;
        for (class436 var7 = var5.field7074; var7 != null; var7 = var7.field5485) {
            if (var7.field5486.field8015) {
                int var8 = var7.field5486.method2117(9295);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field4957 += var6;
            arg4.field4962 = true;
        } else if (var5.field7085 != null) {
            arg4.field4957 -= var5.field7085.field5597;
        }
        var5.field7078 = arg4;
    }

    @OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1428++;
        throw new IllegalStateException();
    }
}
