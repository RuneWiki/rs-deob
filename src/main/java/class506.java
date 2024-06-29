import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class506 {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Z")
    public boolean field6933;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "F")
    public static float field6946;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Ljea;")
    public class415 field6938;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Ljea;")
    public class415 field6941;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Z")
    public boolean field6937;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "Z")
    public static boolean field6945;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2888(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg1; var6++) {
            class470.method2660(arg3, arg2, class344.field4599[var6], (byte) 11, arg0);
        }
        if (!arg4) {
            field6946 = -1.1693573F;
        }
        field6936++;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(JJ)J")
    public static long method2889(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2890(byte arg0, String arg1) {
        field6934++;
        class400.field5614 = arg1;
        if (class59.field668 == null || arg0 != -96) {
            return;
        }
        try {
            String var2 = class59.field668.getParameter("cookieprefix");
            String var3 = class59.field668.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class652.method3678((byte) 119, class577.method3295((byte) 15) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class204.method1331((byte) 45, class59.field668, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIII)I")
    public static final int method2891(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6935++;
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg3) : arg4;
        int var8 = 125 / (arg2 / 45);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2892(String arg0, byte arg1) {
        field6943++;
        if (arg1 > -43) {
            method2890((byte) -44, null);
        }
        System.out.println("Error: " + class60.method497("%0a", arg0, "\n", (byte) -29));
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Z)V")
    public class506(boolean arg0) {
        this.field6933 = arg0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
    public static final void method2893(int arg0, int arg1) {
        field6942++;
        class51 var2 = class703.method3938(-1989279584, arg1, 2);
        if (arg0 != -10919) {
            field6939 = 50;
        }
        var2.method404(arg0 ^ 0xFFFFD539);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public final void method2894(int arg0) {
        if (this.field6938 != null) {
            this.field6938.method1122(-1620);
        }
        field6944++;
        if (arg0 != 27025) {
            field6945 = true;
        }
        this.field6937 = false;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z")
    public final boolean method2895(boolean arg0) {
        field6940++;
        if (!arg0) {
            method2893(-14, 93);
        }
        return this.field6937 && !this.field6933;
    }
}
