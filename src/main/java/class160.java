import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class160 extends class363 {

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "[B")
    public byte[] field1889;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "Ldr;")
    public static class675 field1884 = new class675(42, 7);

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "F")
    public static float field1887;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILji;)Lre;")
    public static final class563 method986(int arg0, class572 arg1) {
        field1888++;
        if (arg0 != 0) {
            method986(106, null);
        }
        int var2 = arg1.method3031(arg0 - 1);
        return new class563(var2);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
    public static final void method987(int arg0, int arg1, int arg2) {
        boolean var3 = class407.field5237[0][arg1][arg2] != null && class407.field5237[0][arg1][arg2].field7075 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class407.field5237[var4][arg1][arg2] == null) {
                class565 var5 = class407.field5237[var4][arg1][arg2] = new class565(var4, arg1, arg2);
                if (var3) {
                    var5.field7083++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 == 42) {
            field1884 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "([B)V")
    public class160(byte[] arg0) {
        this.field1889 = arg0;
    }
}
