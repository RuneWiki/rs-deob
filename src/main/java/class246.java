import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class246 {

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static volatile int field3913 = 0;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    public static int[] field3917 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lag;")
    public static class192 field3918 = new class192(16);

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lub;")
    public static class92 field3910;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lub;")
    public static class92 field3911;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lub;")
    public static class92 field3920;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[Lff;")
    public static class19[] field3916;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Z")
    public static final boolean method1666(byte arg0) {
        if (arg0 >= -52) {
            field3910 = null;
        }
        field3914++;
        try {
            return class280.method1900((byte) 111);
        } catch (IOException var4) {
            class28.method235(0);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class215.field3302 + "," + class135.field2019 + "," + class9.field147 + " - " + class95.field1528 + "," + (class263.field4168.field4749[0] + class138.field2072) + "," + (class263.field4168.field4673[0] + class159.field2379) + " - ";
            for (int var3 = 0; var3 < class95.field1528 && var3 < 50; var3++) {
                var2 = var2 + class183.field2900.field560[var3] + ",";
            }
            class79.method624(var2, var5, 0);
            class252.method1710(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1667(int arg0) {
        field3910 = null;
        field3918 = null;
        field3911 = null;
        field3916 = null;
        field3920 = null;
        if (arg0 < 77) {
            method1667(-16);
        }
        field3917 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILub;II)Z")
    public static final boolean method1668(int arg0, class92 arg1, int arg2, int arg3) {
        field3919++;
        byte[] var4 = arg1.method721((byte) -117, arg2, arg0);
        if (var4 == null) {
            return false;
        }
        if (arg3 != -1) {
            field3918 = null;
        }
        class6.method41(var4, 126);
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILcc;I)Ljava/lang/String;")
    public static final String method1669(int arg0, class222 arg1, int arg2) {
        field3915++;
        if (!client.method1159(arg1).method229(1, arg0) && arg1.field3519 == null) {
            return null;
        } else if (arg1.field3549 == null || arg0 >= arg1.field3549.length || arg1.field3549[arg0] == null || arg1.field3549[arg0].trim().length() == 0) {
            return class136.field2057 ? "Hidden-" + arg0 : null;
        } else {
            int var3 = -94 % ((-arg2 - 30) / 52);
            return arg1.field3549[arg0];
        }
    }
}
