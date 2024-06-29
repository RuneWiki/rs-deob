import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class286 extends class332 {

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    public int[] field4502 = new int[] { 0 };

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[I")
    public int[] field4498 = new int[] { -1 };

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    public static int[] field4499 = new int[25];

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Z")
    public static boolean field4495 = false;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4504 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!w", name = "q", descriptor = "F")
    public static float field4501;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 7)
    public static final boolean method2042(boolean arg0, String arg1) {
        field4494++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class96.field1248; var2++) {
            if (arg1.equalsIgnoreCase(class37.field439[var2])) {
                return true;
            }
        }
        if (!arg0) {
            method2048(-32);
        }
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Z", line = 33)
    public static final boolean method2043(byte arg0) {
        field4496++;
        try {
            if (arg0 < 126) {
                field4495 = false;
            }
            return class342.method2369(0);
        } catch (IOException var5) {
            class282.method2017(-62);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class308.field4757 + "," + class43.field507 + "," + class5.field80 + " - " + class132.field1817 + "," + (class118.field1664.field2359[0] + class142.field1992) + "," + (class118.field1664.field2403[0] + class118.field1668) + " - ";
            for (int var4 = 0; var4 < class132.field1817 && var4 < 50; var4++) {
                var3 = var3 + class307.field4742.field1388[var4] + ",";
            }
            class42.method245(var3, 1, var6);
            class171.method1117((byte) -104);
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 63)
    public static void method2044(int arg0) {
        int var1 = 62 / ((46 - arg0) / 63);
        field4499 = null;
        field4504 = null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)I", line = 76)
    public static final int method2045(int arg0) {
        field4500++;
        if (arg0 <= 69) {
            method2042(true, (String) null);
        }
        if (class161.field2220) {
            return 0;
        } else if (class339.method2348((byte) 69)) {
            return class238.field3539 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 97)
    public static final int method2046(String arg0, int arg1) {
        field4503++;
        if (class334.field5162 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = arg1; var2 < class334.field5162.field4249; var2++) {
            if (class248.method1784(arg0, 1, class170.method1106(class334.field5162.field4251[var2], 1, "<br>", " "))) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 121)
    public static final void method2047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 >= class109.field1494 && arg9 <= class56.field678 && class109.field1494 <= arg1 && class56.field678 >= arg1 && arg3 >= class109.field1494 && arg3 <= class56.field678 && arg7 >= class109.field1494 && class56.field678 >= arg7 && class272.field4273 <= arg5 && class248.field3759 >= arg5 && class272.field4273 <= arg2 && class248.field3759 >= arg2 && arg6 >= class272.field4273 && class248.field3759 >= arg6 && class272.field4273 <= arg8 && class248.field3759 >= arg8) {
            class289.method2062(arg0, arg9, arg1, arg7, arg8, (byte) 118, arg2, arg6, arg5, arg3);
        } else {
            class228.method1594(arg1, arg6, arg9, arg0, arg3, arg2, arg4 ^ 0x4F66, arg7, arg8, arg5);
        }
        if (arg4 == 20304) {
            field4497++;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 145)
    public static final void method2048(int arg0) {
        if (arg0 != 2) {
            field4501 = 2.4123614F;
        }
        field4505++;
        class271.field4262.method1237((byte) 78);
    }
}
