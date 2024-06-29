import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class163 extends class42 {

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "Ljava/lang/String;")
    public String field2461;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public static int field2460 = 0;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2463 = new String[200];

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "Lqi;")
    public static class406 field2468;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lbt;I)V", line = 10)
    public static final void method1176(class33 arg0, int arg1) {
        if (class399.field5664 == null) {
            class544 var2 = new class544();
            byte[] var3 = var2.method3191(16, 8004, 128, 128);
            class399.field5664 = class92.method674(false, var3, 136);
        }
        field2464++;
        if (class347.field5105 == null) {
            class520 var4 = new class520();
            byte[] var5 = var4.method3085(16, 128, 128, false);
            class347.field5105 = class92.method674(false, var5, arg1 + 136);
        }
        class302 var6 = arg0.field619;
        if (var6.method1932(arg1 ^ 0xFFFFFF95) && class126.field1985 == null) {
            byte[] var7 = class121.method894(16.0F, 128, 0.6F, (byte) -86, new class199(419684), 0.5F, 8, 16, 4.0F, 128, 4.0F);
            class126.field1985 = class92.method674(false, var7, 136);
        }
        if (arg1 != 0) {
            method1178(53, (byte) 45, null);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;)I", line = 48)
    public static final int method1177(int arg0, String arg1) {
        field2467++;
        int var2 = 0;
        if (arg0 > -8) {
            return 46;
        }
        while (class96.field1520.length > var2) {
            if (class96.field1520[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBLwn;)V", line = 69)
    public static final void method1178(int arg0, byte arg1, class519 arg2) {
        field2462++;
        if (class485.field7027 != null) {
            try {
                class485.field7027.method2806(17788, 0L);
                class485.field7027.method2805(arg0, (byte) 65, 24, arg2.field7545);
            } catch (Exception var3) {
            }
        }
        if (arg1 >= -73) {
            method1180((byte) 82);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 90)
    public class163() {
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 99)
    public static final boolean method1179(String arg0, byte arg1) {
        field2466++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == 8) {
            for (int var2 = 0; var2 < class8.field71; var2++) {
                if (arg0.equalsIgnoreCase(class277.field4129[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class98.field1540[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 129)
    public static void method1180(byte arg0) {
        field2463 = null;
        field2468 = null;
        if (arg0 <= 37) {
            method1179(null, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 140)
    public class163(String arg0) {
        this.field2461 = arg0;
    }
}
