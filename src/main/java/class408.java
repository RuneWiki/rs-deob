import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class408 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field6052 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field6050 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Luaa;")
    private class395 field6049 = new class395(64);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lwh;")
    private class505 field6061 = null;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lgp;")
    private class561 field6055;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lgp;")
    private class561 field6051;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lbv;")
    public static class567 field6053 = new class567("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lpp;")
    public static class464 field6060 = new class464(60, 1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[Z")
    public static boolean[] field6063;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([ILio;JZ)Ljava/lang/String;", line = 5)
    public final String method2474(int[] arg0, class151 arg1, long arg2, boolean arg3) {
        field6048++;
        if (arg3) {
            return null;
        }
        if (this.field6061 != null) {
            String var6 = this.field6061.method410(arg0, arg1, -1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Ldm;", line = 27)
    public final class368 method2475(int arg0, int arg1) {
        field6054++;
        class368 var3 = (class368) this.field6049.method2407(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field6051.method3175(arg1, (byte) -53, 1);
        } else {
            var4 = this.field6055.method3175(arg1 & 0x7FFF, (byte) -53, 1);
        }
        class368 var5 = new class368();
        var5.field5221 = this;
        if (var4 != null) {
            var5.method2221(new class268(var4), true);
        }
        if (arg1 >= 32768) {
            var5.method2225(false);
        }
        this.field6049.method2408(var5, (long) arg1, -112);
        if (arg0 != -11743) {
            this.field6061 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z", line = 59)
    public static final boolean method2476(int arg0) {
        field6056++;
        if (arg0 > -115) {
            return true;
        } else if (class8.method31(false, "jaclib")) {
            return class8.method31(false, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z", line = 84)
    public static final boolean method2477(int arg0, int arg1, byte arg2) {
        if (arg2 < 99) {
            method2476(87);
        }
        field6057++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILgp;Lgp;Lwh;)V", line = 230)
    public class408(int arg0, class561 arg1, class561 arg2, class505 arg3) {
        this.field6055 = arg2;
        this.field6051 = arg1;
        this.field6061 = arg3;
        if (this.field6051 != null) {
            this.field6052 = this.field6051.method3164(1, true);
        }
        if (this.field6055 != null) {
            this.field6050 = this.field6055.method3164(1, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 100)
    public static final void method2478(int arg0, int arg1) {
        field6058++;
        class21 var2 = class601.method3413(arg1, arg0, (byte) 72);
        var2.method227(true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 113)
    public static final void method2479(byte arg0) {
        field6062++;
        class135 var1 = null;
        try {
            class329 var2 = class270.field3976.method364(false, "3", (byte) 68);
            while (var2.field4739 == 0) {
                class210.method1342(-75, 1L);
            }
            if (var2.field4739 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class135) var2.field4737;
            byte[] var3 = new byte[(int) var1.method1037(0)];
            if (var3.length == 0) {
                class636.field9236 = "";
                class101.field1737 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1038(var3, var3.length - var4, -84, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class268 var6 = new class268(var3);
                int var7 = var6.method1738(255);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field3913 = var7 + 1;
                if (!var6.method1696(-1)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field3913 = 1;
                int var8 = var6.method1738(255);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class636.field9236 = var6.method1719(-26006);
                class101.field1737 = var6.method1719(-26006);
                if (var8 >= 1) {
                    class602.field8569 = var6.method1745(32132);
                } else {
                    class602.field8569 = class56.field803;
                }
            }
        } catch (Exception var10) {
            class101.field1737 = "";
            class636.field9236 = "";
        }
        try {
            if (var1 != null) {
                var1.method1036(122);
            }
        } catch (Exception var9) {
        }
        if (arg0 > -46) {
            method2480((byte) -71);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 202)
    public static void method2480(byte arg0) {
        field6053 = null;
        int var1 = -73 / ((23 - arg0) / 40);
        field6060 = null;
        field6063 = null;
    }
}
