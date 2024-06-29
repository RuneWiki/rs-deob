import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class398 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Lkh;")
    public static class13 field5949 = new class13(8);

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field5951 = 0;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field5950 = 0;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lhn;")
    public static class509 field5953 = new class509(65, 14);

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lhn;")
    public static class509 field5954 = new class509(87, -1);

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
    public static boolean field5955 = false;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field5956 = 0;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lcl;")
    public static class177 field5947;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method2504(int arg0, long arg1) {
        field5945++;
        int var3 = class222.field3637;
        if (arg0 != 320) {
            method2504(-52, -121L);
        }
        int var4 = class476.field6868;
        if (class380.field5738 != var3) {
            int var5 = var3 - class380.field5738;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class380.field5738 += var6;
        }
        if (!class193.field3258.field7239) {
            class181.field2711 += (float) arg1 * class52.field654 / 40.0F * 8.0F;
            class473.field6830 += (float) arg1 * class345.field5107 / 40.0F * 8.0F;
        }
        if (class468.field6767 != var4) {
            int var7 = var4 - class468.field6767;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class468.field6767 += var8;
        }
        class171.method1146(true);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 88)
    public static void method2505(int arg0) {
        field5947 = null;
        field5953 = null;
        field5949 = null;
        if (arg0 == 0) {
            field5954 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 102)
    public static final int method2506(int arg0, int arg1) {
        if (arg1 == 0) {
            field5948++;
            return (arg0 & 0x3FE9F) >> 11;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;II)V", line = 115)
    public static final void method2507(String arg0, String arg1, String arg2, int arg3, boolean arg4, String arg5, int arg6, int arg7) {
        field5946++;
        for (int var8 = 99; var8 > 0; var8--) {
            class473.field6827[var8] = class473.field6827[var8 - 1];
            class456.field6639[var8] = class456.field6639[var8 - 1];
            class428.field6365[var8] = class428.field6365[var8 - 1];
            class268.field4102[var8] = class268.field4102[var8 - 1];
            class308.field4641[var8] = class308.field4641[var8 - 1];
            class494.field7133[var8] = class494.field7133[var8 - 1];
            class13.field189[var8] = class13.field189[var8 - 1];
        }
        class473.field6827[0] = arg3;
        class428.field6365[0] = arg1;
        if (arg4) {
            return;
        }
        class456.field6639[0] = arg7;
        class268.field4102[0] = arg0;
        class308.field4641[0] = arg2;
        class108.field1509++;
        class59.field712 = class152.field2263;
        class13.field189[0] = arg6;
        class494.field7133[0] = arg5;
    }
}
