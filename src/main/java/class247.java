import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class247 {

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[Lup;")
    public static class238[] field3958 = new class238[4];

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "[J")
    public static long[] field3959 = new long[32];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method1703(String arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field3954++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class519.method3095(arg0, false);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class270.field4155; var3++) {
            String var4 = class379.field5697[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class519.method3095(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class270.field4155--;
                for (int var6 = var3; var6 < class270.field4155; var6++) {
                    class379.field5697[var6] = class379.field5697[var6 + 1];
                    class387.field5800[var6] = class387.field5800[var6 + 1];
                    class603.field8536[var6] = class603.field8536[var6 + 1];
                    class73.field1097[var6] = class73.field1097[var6 + 1];
                    class92.field1371[var6] = class92.field1371[var6 + 1];
                }
                class70.field1084 = class180.field3060;
                class387.field5795++;
                class540 var7 = class257.method1732(true, class621.field8729, class655.field9332);
                var7.field7707.method1926(class16.method101(-72, arg0), 65280);
                var7.field7707.method1931(118, arg0);
                class756.method4211(var7, arg1 ^ 0xFFFFFF84);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 69)
    public static void method1704(int arg0) {
        if (arg0 != 26366) {
            field3961 = 52;
        }
        field3958 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lofa;I)V", line = 94)
    public static final void method1705(class301 arg0, int arg1) {
        field3960++;
        if (arg1 != 6575) {
            field3963 = 116;
        }
        byte[] var2 = new byte[24];
        if (class452.field6575 != null) {
            try {
                class452.field6575.method3545(0L, (byte) 70);
                class452.field6575.method3536(var2, (byte) -104);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1946(1735499792, var2, 0, 24);
    }
}
