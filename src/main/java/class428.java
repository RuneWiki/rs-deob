import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class428 extends RuntimeException {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Ljava/lang/String;")
    public String field6201;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field6203;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field6200 = -1;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6197 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field6199 = true;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field6205 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lqi;")
    public static class207 field6202;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg0 - arg2) >= class185.field2727 && class278.field4184 >= arg0 + arg2 && (arg3 - arg2) >= class308.field4507 && arg2 + arg3 <= class383.field5497) {
            class278.method1984(arg0, arg1, arg2, arg3, (byte) 54);
        } else {
            class156.method1230(arg1, arg3, arg2, arg0, (byte) -77);
        }
        if (arg4 == 25988) {
            field6196++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 27)
    public static void method2671(byte arg0) {
        field6202 = null;
        field6197 = null;
        if (arg0 >= -54) {
            method2672((byte) -89);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 39)
    public static final void method2672(byte arg0) {
        if (arg0 != -106) {
            method2673(1);
        }
        field6195++;
        if (class45.field708 != -1) {
            class324.method2150((byte) -78, false, class45.field708, -1, -1);
            class45.field708 = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J", line = 65)
    public static final long method2673(int arg0) {
        field6204++;
        if (arg0 < 123) {
            method2673(1);
        }
        return class200.field2916.method99((byte) 74);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/lang/String;)V", line = 76)
    public static final void method2674(byte arg0, String arg1) {
        field6198++;
        if (arg1 == null) {
            return;
        }
        if (arg0 <= 74) {
            field6199 = false;
        }
        String var2 = class126.method1065(false, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class284.field4255; var3++) {
            String var4 = class126.method1065(false, class164.field2473[var3]);
            if (var4 != null && var4.equals(var2)) {
                class284.field4255--;
                for (int var5 = var3; var5 < class284.field4255; var5++) {
                    class164.field2473[var5] = class164.field2473[var5 + 1];
                    class307.field4484[var5] = class307.field4484[var5 + 1];
                    class51.field821[var5] = class51.field821[var5 + 1];
                    class27.field406[var5] = class27.field406[var5 + 1];
                    class418.field6048[var5] = class418.field6048[var5 + 1];
                    class33.field478[var5] = class33.field478[var5 + 1];
                }
                class49.field789 = class341.field4845;
                class21.field320++;
                class13.field216.method2781(false, 25);
                class13.field216.method267(class429.method2677(arg1, 1), false);
                class13.field216.method265((byte) -57, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 140)
    public class428(Throwable arg0, String arg1) {
        this.field6201 = arg1;
        this.field6203 = arg0;
    }
}
