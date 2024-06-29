import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class162 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
    public static boolean field2721 = true;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lgb;")
    public static class191[] field2728 = new class191[0];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lek;")
    public static class206 field2727;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZII)V", line = 6)
    public static final void method1160(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = class114.method842(class87.field1520, (byte) -73, arg5, class177.field2930);
        field2726++;
        if (!arg3) {
            return;
        }
        int var7 = class114.method842(class87.field1520, (byte) -59, arg4, class177.field2930);
        int var8 = class114.method842(class190.field3224, (byte) -122, arg1, class289.field4704);
        int var9 = class114.method842(class190.field3224, (byte) -44, arg0, class289.field4704);
        for (int var10 = var6; var10 <= var7; var10++) {
            class344.method2417(class232.field3799[var10], var8, var9, arg2, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1161(int arg0) {
        class125.field2203 = 0;
        class205.field3414 = 0;
        class155.field2629 = -1;
        class359.field5721 = -1;
        class5.field87 = false;
        class137.field2343 = 0;
        class65.field1240 = -1;
        class51.field1038.field2435 = 0;
        class275.field4489 = -1;
        class363.field5738 = 0;
        field2725++;
        class342.field5413.field2435 = 0;
        class244.method1729(false);
        for (int var1 = 0; var1 < class182.field3151.length; var1++) {
            if (class182.field3151[var1] != null) {
                class182.field3151[var1].field190 = -1;
            }
        }
        for (int var2 = 0; var2 < class149.field2533.length; var2++) {
            if (class149.field2533[var2] != null) {
                class149.field2533[var2].field190 = -1;
            }
        }
        class68.method530(0);
        class69.field1280 = arg0;
        class311.method2260(30, arg0 - 19881);
        for (int var3 = 0; var3 < 100; var3++) {
            class213.field3524[var3] = true;
        }
        class320.method2305((byte) -62);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 86)
    public static final void method1162(int arg0) {
        if (arg0 != 65) {
            field2723 = -87;
        }
        field2729++;
        if (class278.field4540) {
            return;
        }
        class312.field5074 = true;
        class278.field4540 = true;
        if (class151.field2559) {
            class354.field5652 = (float) ((int) class354.field5652 - 65 & 0xFFFFFF80);
        } else {
            class336.field5344 += (-class336.field5344 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 119)
    public static void method1163(byte arg0) {
        field2727 = null;
        field2728 = null;
        if (arg0 >= -63) {
            field2721 = true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Ldn;", line = 130)
    public static final class255 method1164(int arg0, byte arg1) {
        if (arg1 >= -57) {
            field2728 = (class191[]) null;
        }
        field2722++;
        class255 var2 = (class255) class238.field3885.method893((long) arg0, 71);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3379.method1404(31, arg0, (byte) -121);
        class255 var4 = new class255();
        if (var3 != null) {
            var4.method1785(new class146(var3), arg0, 0);
        }
        class238.field3885.method888((long) arg0, var4, 27);
        return var4;
    }
}
