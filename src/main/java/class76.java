import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class76 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lmb;")
    public static class96 field1308 = class243.method1708("logo", (byte) 108);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lmb;")
    public static class96 field1309 = class243.method1708(" <col=ffffff>", (byte) 99);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1310 = 1;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method549(int arg0) {
        int var1 = 16 / ((arg0 - 20) / 44);
        if (class180.field3097 > class121.field2232) {
            class121.field2232 = (float) ((double) class121.field2232 / 30.0D + (double) class121.field2232);
            if (class180.field3097 < class121.field2232) {
                class121.field2232 = class180.field3097;
            }
            class94.method662(-1);
        } else if (class121.field2232 > class180.field3097) {
            class121.field2232 = (float) ((double) class121.field2232 - (double) class121.field2232 / 30.0D);
            if (class121.field2232 < class180.field3097) {
                class121.field2232 = class180.field3097;
            }
            class94.method662(-1);
        }
        if (class95.field1556 != -1 && class27.field455 != -1) {
            int var2 = class95.field1556 - class137.field2456;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            int var3 = class27.field455 - class200.field3481;
            if (var3 < 2 || var3 > 2) {
                var3 >>= 0x4;
            }
            if (var2 == 0 && var3 == 0) {
                class95.field1556 = -1;
                class27.field455 = -1;
            }
            class200.field3481 += var3;
            class137.field2456 += var2;
            class94.method662(-1);
        }
        field1305++;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1309 = null;
        if (arg0 > -113) {
            method549(97);
        }
        field1308 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIB)I")
    public static final int method551(int arg0, int arg1, int arg2, byte arg3) {
        field1307++;
        if ((class132.field2376[arg2][arg0][arg1] & 0x8) == 0) {
            if (arg3 >= -111) {
                field1310 = -82;
            }
            return arg2 <= 0 || (class132.field2376[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZBLmb;)V")
    public static final void method552(boolean arg0, byte arg1, class96 arg2) {
        if (arg0) {
            try {
                class216.field3710.getAppletContext().showDocument(arg2.method708(class216.field3710.getCodeBase(), -1), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class216.field3710.getAppletContext().showDocument(arg2.method708(class216.field3710.getCodeBase(), -1), "_top");
            } catch (Exception var4) {
            }
        }
        field1304++;
        if (arg1 >= -50) {
            field1306 = 17;
        }
    }
}
