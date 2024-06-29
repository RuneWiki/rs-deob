import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class154 {

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "S")
    public static short field2003 = 1;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "Lkr;")
    public static class329 field2007;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "Lbi;")
    public static class466 field2006;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static final void method834(int arg0) {
        field2004++;
        class578 var1 = null;
        try {
            class441 var2 = class31.field488.method1727(false, (byte) 79, "3");
            while (var2.field6001 == 0) {
                class353.method2204(1L, 7806);
            }
            if (var2.field6001 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class578) var2.field6000;
            if (arg0 >= -120) {
                method834(86);
            }
            byte[] var3 = new byte[(int) var1.method3251(-25730)];
            if (var3.length == 0) {
                class405.field5567 = "";
                class284.field3703 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3247(var3.length - var4, var3, var4, -122);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class551 var6 = new class551(var3);
                int var7 = var6.method3045(-126);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field7707 = var7 + 1;
                if (!var6.method3070(0)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field7707 = 1;
                int var8 = var6.method3045(-125);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class284.field3703 = var6.method3038(-25821);
                class405.field5567 = var6.method3038(-25821);
                if (var8 >= 1) {
                    class58.field787 = var6.method3090(-117);
                } else {
                    class58.field787 = class24.field428;
                }
            }
        } catch (Exception var10) {
            class405.field5567 = "";
            class284.field3703 = "";
        }
        try {
            if (var1 != null) {
                var1.method3252(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V")
    public static void method835(boolean arg0) {
        field2007 = null;
        field2006 = null;
        if (arg0) {
            field2003 = -93;
        }
    }
}
