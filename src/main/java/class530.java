import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class530 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lae;")
    public static class165 field7803 = null;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Lqn;")
    public static class47 field7806;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3144(int arg0, String arg1) {
        field7807++;
        if (arg1 == null) {
            return false;
        } else if (arg0 > -72) {
            return true;
        } else {
            for (int var2 = 0; var2 < class498.field7223; var2++) {
                if (arg1.equalsIgnoreCase(class113.field1520[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class380.field5004[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Ldc;")
    public static final class5 method3145(int arg0) {
        field7805++;
        int var1 = -40 % ((arg0 - 32) / 32);
        try {
            return (class5) Class.forName("kj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lbf;Z)I")
    public static final int method3146(class375 arg0, boolean arg1) {
        field7804++;
        if (!arg1) {
            field7806 = null;
        }
        if (arg0.field4911 == 0) {
            return 0;
        }
        if (arg0.field4895 != -1) {
            class375 var2 = null;
            if (arg0.field4895 < 32768) {
                var2 = class187.field2446[arg0.field4895];
            } else if (arg0.field4895 >= 32768) {
                var2 = class387.field5107[arg0.field4895 - 32768];
            }
            if (var2 != null) {
                int var3 = arg0.field2666 - var2.field2666;
                int var4 = arg0.field2677 - var2.field2677;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2123((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, 0);
                }
            }
        }
        if (arg0 instanceof class223) {
            class223 var5 = (class223) arg0;
            if (var5.field2841 != -1 && (var5.field4941 == 0 || var5.field4938 > 0)) {
                var5.method2123(var5.field2841, 0);
                var5.field2841 = -1;
            }
        } else if (arg0 instanceof class295) {
            class295 var6 = (class295) arg0;
            if (var6.field3772 != -1 && (var6.field4941 == 0 || var6.field4938 > 0)) {
                int var7 = var6.field2666 - (var6.field3772 - class441.field6317 - class441.field6317) * 64;
                int var8 = var6.field2677 - ((var6.field3784 - (class320.field4064 + class320.field4064)) * 64);
                if (var7 != 0 || var8 != 0) {
                    var6.method2123((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, 0);
                }
                var6.field3772 = -1;
            }
        }
        return arg0.method2124(arg1);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static void method3147(int arg0) {
        field7806 = null;
        field7803 = null;
        if (arg0 != 0) {
            method3148(50, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
    public static final void method3148(int arg0, byte arg1) {
        if (arg1 < 80) {
            method3144(86, null);
        }
        field7808++;
        class153 var2 = class75.method656(2, 255, arg0);
        var2.method997((byte) 93);
    }
}
