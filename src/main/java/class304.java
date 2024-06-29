import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class304 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Z")
    public static boolean field4240 = false;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field4239 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lmu;")
    public static class303 field4243 = new class303(50, -1);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4242;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 15)
    public static void method1993(byte arg0) {
        if (arg0 == 35) {
            field4243 = null;
            field4242 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1994(int arg0) {
        if (arg0 != 1) {
            field4242 = null;
        }
        field4241++;
        class470 var1 = null;
        try {
            class622 var2 = class689.field9299.method1207((byte) -46, "2", true);
            while (var2.field8462 == 0) {
                class700.method3916((byte) 63, 1L);
            }
            if (var2.field8462 == 1) {
                var1 = (class470) var2.field8463;
                byte[] var3 = new byte[(int) var1.method2774((byte) -46)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2768(var3, var4, (byte) -12, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class498.method2942(new class215(var3), (byte) -40);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2769(false);
            }
        } catch (Exception var6) {
        }
    }
}
