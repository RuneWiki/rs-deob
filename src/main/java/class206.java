import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class206 {

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2833 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "[[Ljava/lang/String;")
    public static String[][] field2836 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "Luw;")
    public static class208 field2837 = new class208(22, -1);

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "Lrda;")
    public static class467 field2838 = new class467(8);

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static final void method1392(byte arg0) {
        field2835++;
        int var1 = class55.field712.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class55.field712[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class359.field4383; var4++) {
                    if (class644.field8240[var2] == class438.field5760[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class438.field5760[class359.field4383] = class644.field8240[var2];
                    var3 = class359.field4383++;
                }
                class234 var5 = new class234(class55.field712[var2]);
                int var6 = 0;
                while (class55.field712[var2].length > var5.field3133 && var6 < 511 && class349.field4271 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1553((byte) 90);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class644.field8240[var2] >> 8) * 64 + var10 - class714.field9407;
                    int var13 = (class644.field8240[var2] & 0xFF) * 64 + var11 - class240.field3293;
                    class240 var14 = class595.field7561.method765((byte) -53, var5.method1553((byte) 112));
                    class232 var15 = (class232) class444.field5811.method2616((long) var7, (byte) 61);
                    if (var15 == null && (var14.field3308 & 0x1) > 0 && class711.field9393 == var9 && var12 >= 0 && (var14.field3314 + var12) < class240.field3280 && var13 >= 0 && (var13 + var14.field3314) < class276.field3602) {
                        class727 var16 = new class727();
                        var16.field4737 = var7;
                        class232 var17 = new class232(var16);
                        class444.field5811.method2619(var17, (long) var7, -1);
                        class542.field6811[class750.field10228++] = var17;
                        class88.field1224[class349.field4271++] = var7;
                        var16.field4662 = class693.field8900;
                        var16.method3887(var14, 1);
                        var16.method2174(arg0 ^ 0x72, var16.field9545.field3314);
                        var16.field4750 = var16.field9545.field3270 << 3;
                        var16.method2179(284, (var16.field9545.field3262 + 4 & 0x3B600007) << 11, true);
                        var16.method3888(var13, var16.method190((byte) -98), var12, true, 0, var9);
                    }
                }
            }
        }
        if (arg0 != 114) {
            method1393(-36);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field2836 = null;
        if (arg0 != 24660) {
            method1394(-85, 123, -21);
        }
        field2833 = null;
        field2837 = null;
        field2838 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)Z")
    public static final boolean method1394(int arg0, int arg1, int arg2) {
        if (arg0 != 65536) {
            method1393(-6);
        }
        field2834++;
        boolean var3 = (arg1 & 0x37) == 0 ? class336.method1940(arg2, 8192, arg1) : class732.method3905((byte) -60, arg1, arg2);
        return var3 | (arg2 & 0x10000) != 0 | class311.method1832(arg1, -31, arg2);
    }
}
