import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class567 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
    public static boolean field8408 = false;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field8409 = 0;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Lqu;")
    public static class364 field8412 = new class364(22, -1);

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field8413 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 3)
    public static void method3310(byte arg0) {
        field8412 = null;
        int var1 = 38 % ((arg0 + 16) / 41);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 16)
    public static final void method3311(int arg0) {
        field8411++;
        if (class247.field3610) {
            return;
        }
        class120.field1561 = true;
        class247.field3610 = true;
        if (class94.field1158.field301) {
            class578.field8523 = ((int) class578.field8523 + 47 & 0xFFFFFFF0);
        } else {
            class203.field3025 += (12.0F - class203.field3025) / 2.0F;
        }
        if (arg0 <= 12) {
            field8408 = false;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 44)
    public static final void method3312(boolean arg0, String arg1) {
        class311.field4583 = arg1;
        field8407++;
        if (class328.field4850.field5129 == null) {
            return;
        }
        try {
            String var2 = class328.field4850.field5129.getParameter("cookieprefix");
            String var3 = class328.field4850.field5129.getParameter("cookiehost");
            if (arg0) {
                method3311(-68);
            }
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class549.method3219(class450.method2719((byte) 118) + 94608000000L, (byte) 14) + "; Max-Age=" + 94608000L;
            }
            class222.method1461(class328.field4850.field5129, "document.cookie=\"" + var5 + "\"", arg0);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IJ)V", line = 82)
    public static final void method3313(int arg0, long arg1) {
        field8410++;
        int var3 = class311.field4629 + class239.field3493.field3464;
        int var4 = class587.field8720 + class239.field3493.field3463;
        if (class541.field8103 - var3 < -500 || class541.field8103 - var3 > 500 || class300.field4403 - var4 < -500 || (class300.field4403 - var4) > 500) {
            class541.field8103 = var3;
            class300.field4403 = var4;
        }
        if (class541.field8103 != var3) {
            int var5 = var3 - class541.field8103;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class541.field8103 += var6;
        }
        if (!class94.field1158.field301) {
            class578.field8523 += (float) arg1 * class203.field3025 / 6.0F;
            class591.field8752 += (float) arg1 * class74.field860 / 6.0F;
        }
        if (class300.field4403 != var4) {
            int var7 = var4 - class300.field4403;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class300.field4403 += var8;
        }
        class437.method2680(arg0 ^ 0x4DEE);
        if (arg0 != 0) {
            method3310((byte) -107);
        }
    }
}
