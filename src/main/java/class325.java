import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class325 {

    @OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
    public static int field4867 = 1;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "I")
    public static int field4865 = 0;

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "Lga;")
    public static class420 field4866 = new class420();

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/net/Socket;II)Lwb;")
    public static final class346 method2110(Socket arg0, int arg1, int arg2) throws IOException {
        if (arg2 != -1) {
            method2112((byte) 12);
        }
        field4869++;
        return new class26(arg0, arg1);
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;IZILjava/lang/String;BZ)V")
    public static final void method2111(String arg0, int arg1, boolean arg2, int arg3, String arg4, byte arg5, boolean arg6) {
        field4868++;
        class145.field1851.field7650 = 1;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class330 var11 = class788.field10824.method1609(arg3, arg5 - 7);
            if (var11 == null || var11.method2134(-19881) != arg6) {
                return;
            }
            if (var11.method2134(arg5 - 19774)) {
                var10 = var11.field4921;
            } else {
                var9 = var11.field4920;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class526.field7490.field8812; var13++) {
            class501 var16 = class526.field7490.method3567(var13, true);
            if ((!arg2 || var16.field7118) && var16.field7096 == -1 && var16.field7110 == -1 && var16.field7125 == -1 && var16.field7102 == 0 && var16.field7108.toLowerCase().indexOf(var7) != -1) {
                if (arg3 != -1) {
                    if (arg6) {
                        if (!arg4.equals(var16.method2927(arg3, var10, (byte) -69))) {
                            continue;
                        }
                    } else if (arg1 != var16.method2914(0, var9, arg3)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class327.field4891 = null;
                    class92.field1200 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg5 != -107) {
            field4866 = null;
        }
        class493.field7009 = 0;
        class327.field4891 = var8;
        class92.field1200 = var12;
        String[] var14 = new String[class92.field1200];
        for (int var15 = 0; var15 < class92.field1200; var15++) {
            var14[var15] = class526.field7490.method3567(var8[var15], true).field7108;
        }
        class736.method4124(var14, class327.field4891, 0);
        class145.field1851.method3137(46);
        class145.field1851.field7650 = 2;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V")
    public static void method2112(byte arg0) {
        if (arg0 <= 65) {
            field4867 = 54;
        }
        field4866 = null;
    }
}
