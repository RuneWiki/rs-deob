import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class169 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lsb;")
    public static class305 field1885 = new class305(61, 2);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[[B")
    public static byte[][] field1889 = new byte[250][];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lf;")
    public static class534 field1887;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method921(int arg0) {
        class645.field9107 = 0;
        field1886++;
        class517.field7365 = 0;
        class435.method2492((byte) 33);
        class11.method58(-120);
        if (arg0 != -22833) {
            field1885 = null;
        }
        class94.method478((byte) 4);
        boolean var1 = false;
        for (int var2 = 0; var2 < class517.field7365; var2++) {
            int var4 = class179.field2013[var2];
            class214 var5 = (class214) class274.field3433.method3669((long) var4, arg0 ^ 0x5930);
            class600 var6 = var5.field2601;
            if (class188.field2148 && class247.method1460(-81, var4)) {
                class45.method239((byte) -68);
            }
            if (class678.field9539 != var6.field9452) {
                if (var6.field8461.method1255((byte) 102)) {
                    class578.method3268(0, var6);
                }
                var6.method3368((byte) -109, null);
                var1 = true;
                var5.method1922(125);
            }
        }
        if (var1) {
            class53.field533 = class274.field3433.method3668(false);
            class274.field3433.method3675(class653.field9160, (byte) 114);
        }
        if (class257.field3209 != class626.field8849.field1218) {
            throw new RuntimeException("gnp1 pos:" + class626.field8849.field1218 + " psize:" + class257.field3209);
        }
        for (int var3 = 0; var3 < class651.field9144; var3++) {
            if (class274.field3433.method3669((long) class398.field5375[var3], -1) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class651.field9144);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method922(boolean arg0) {
        field1889 = null;
        if (arg0) {
            method921(105);
        }
        field1887 = null;
        field1885 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILtn;)V")
    public static final void method923(int arg0, int arg1, int arg2, class570 arg3) {
        class499 var4 = class472.method2722(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field7230 = arg3;
        int var5 = class666.field9303 == class156.field1743 ? 1 : 0;
        if (arg3.method180(-1)) {
            if (arg3.method177(-108)) {
                class13.field115[var5][class635.field8946[var5]++] = arg3;
                return;
            }
            class469.field6711[var5][class321.field3949[var5]++] = arg3;
            return;
        }
        class476.field6867[var5][class701.field9822[var5]++] = arg3;
    }
}
