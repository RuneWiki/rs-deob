import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class73 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lpj;")
    private static class237 field1404 = class33.method353("Allocated memory", 24);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lpj;")
    public static class237 field1407 = field1404;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lci;")
    public static class233 field1406 = new class233(128);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[[[B")
    public static byte[][][] field1410 = new byte[4][104][104];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lfa;")
    public static class239 field1409;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[Lgk;")
    public static class154[] field1408;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        if (arg0 < 69) {
            method575(-128);
        }
        field1407 = null;
        field1409 = null;
        field1406 = null;
        field1410 = null;
        field1404 = null;
        field1408 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI)V")
    public abstract void method576(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)[B")
    public abstract byte[] method577(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
    public static final void method578(byte arg0, int arg1, int arg2) {
        field1405++;
        for (int var3 = 0; var3 < class215.field3718; var3++) {
            class137 var4 = class234.method1558(-24174, var3);
            if (var4 != null) {
                int var5 = var4.field2373;
                if (var5 >= 0 && !class150.field2674.method83(var5, (byte) 60)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field2374 >= 0) {
                    int var10 = var4.field2374;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class150.field2677[class211.method1414(96, (byte) 74, var12)];
                } else if (var5 >= 0) {
                    var6 = class150.field2677[class211.method1414(96, (byte) 105, class150.field2674.method80((byte) -74, var5))];
                } else if (var4.field2377 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field2377;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg1 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class150.field2677[class211.method1414(96, (byte) 121, var9)];
                }
                class110.field1932[var3 + 1] = var6;
            }
        }
        if (arg0 != 40) {
            field1406 = null;
        }
    }
}
