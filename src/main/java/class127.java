import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class127 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[La;")
    public static class162[] field1781 = new class162[4];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method815(byte arg0) {
        int var1 = 36 / ((arg0 - 60) / 42);
        field1781 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method816(byte arg0, long arg1) {
        if (arg0 != 96) {
            method816((byte) 48, 94L);
        }
        class306.field4927.setTime(new Date(arg1));
        field1780++;
        int var3 = class306.field4927.get(7);
        int var4 = class306.field4927.get(5);
        int var5 = class306.field4927.get(2);
        int var6 = class306.field4927.get(1);
        int var7 = class306.field4927.get(11);
        int var8 = class306.field4927.get(12);
        int var9 = class306.field4927.get(13);
        return class159.field2216[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class69.field977[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method817(int arg0) {
        if (arg0 != -29021) {
            return;
        }
        field1782++;
        while (class131.field1830.method813(8, class114.field1632) >= 11) {
            int var1 = class131.field1830.method805(11, (byte) -126);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class48.field689[var1] == null) {
                var2 = true;
                class48.field689[var1] = new class314();
                if (class227.field3546[var1] != null) {
                    class48.field689[var1].method2118(class227.field3546[var1], 14706, var1);
                }
            }
            class160.field2235[class171.field2437++] = var1;
            class314 var3 = class48.field689[var1];
            var3.field4119 = class35.field533;
            int var4 = class131.field1830.method805(1, (byte) 119);
            int var5 = class131.field1830.method805(5, (byte) -125);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class131.field1830.method805(5, (byte) 15);
            int var7 = class153.field2131[class131.field1830.method805(3, (byte) -117)];
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var2) {
                var3.field4142 = var3.field4093 = var7;
            }
            int var8 = class131.field1830.method805(1, (byte) -95);
            if (var8 == 1) {
                class211.field3131[class102.field1466++] = var1;
            }
            var3.method2122(class250.field3905.field4143[0] + var5, var4 == 1, 0, class250.field3905.field4053[0] + var6);
        }
        class131.field1830.method810(-96);
    }
}
