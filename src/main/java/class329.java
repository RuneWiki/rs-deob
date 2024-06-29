import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class329 {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Ldi;")
    public static class83 field4489 = new class83(63, 2);

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
    public static int[] field4494 = new int[14];

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Lba;")
    public class263 field4490;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lt;")
    public class471 field4492;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;BILdr;)Ljv;", line = 6)
    public static final class56 method1905(String arg0, byte arg1, int arg2, class504 arg3) {
        field4488++;
        if (arg2 == 0) {
            return arg3.method2964(arg0, (byte) -121);
        } else if (arg2 == 1) {
            try {
                class390.method2300(new Object[] { (new URL(arg3.field7425.getCodeBase(), arg0)).toString() }, "openjs", arg3.field7425, (byte) 6);
                class56 var4 = new class56();
                var4.field667 = 1;
                return var4;
            } catch (Throwable var10) {
                class56 var5 = new class56();
                var5.field667 = 2;
                return var5;
            }
        } else if (arg1 <= 74) {
            return null;
        } else if (arg2 == 2) {
            try {
                arg3.field7425.getAppletContext().showDocument(new URL(arg3.field7425.getCodeBase(), arg0), "_blank");
                class56 var6 = new class56();
                var6.field667 = 1;
                return var6;
            } catch (Exception var11) {
                class56 var7 = new class56();
                var7.field667 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class390.method2298("loggedout", arg3.field7425, (byte) 59);
            } catch (Throwable var13) {
            }
            try {
                arg3.field7425.getAppletContext().showDocument(new URL(arg3.field7425.getCodeBase(), arg0), "_top");
                class56 var8 = new class56();
                var8.field667 = 1;
                return var8;
            } catch (Exception var12) {
                class56 var9 = new class56();
                var9.field667 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 84)
    public static void method1906(byte arg0) {
        int var1 = 63 / ((arg0 - 37) / 38);
        field4494 = null;
        field4489 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 102)
    public static final void method1907(int arg0) {
        for (int var1 = arg0; var1 < class267.field3700.length; var1++) {
            for (int var2 = 0; var2 < class267.field3700[0].length; var2++) {
                for (int var3 = 0; var3 < class267.field3700[0][0].length; var3++) {
                    class267.field3700[var1][var2][var3] = 0;
                }
            }
        }
        field4491++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V", line = 136)
    public static final void method1908(int arg0, int arg1) {
        class486 var2 = class89.field1305[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class486 var4 = class89.field1305[var3][arg0][arg1] = class89.field1305[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7107--;
                for (class164 var5 = var4.field7115; var5 != null; var5 = var5.field2467) {
                    class116 var6 = var5.field2468;
                    if (var6.field1729 == arg0 && var6.field1730 == arg1) {
                        var6.field1738--;
                    }
                }
            }
        }
        if (class89.field1305[0][arg0][arg1] == null) {
            class89.field1305[0][arg0][arg1] = new class486(0, arg0, arg1);
            class89.field1305[0][arg0][arg1].field7101 = 1;
        }
        class89.field1305[0][arg0][arg1].field7112 = var2;
        class89.field1305[3][arg0][arg1] = null;
    }
}
