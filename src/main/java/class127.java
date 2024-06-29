import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class127 {

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lvd;")
    public static class222 field2451 = class212.method1357(": ", 10731);

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lvd;")
    public static class222 field2452 = class212.method1357("Welt", 10731);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2448 = 100;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lvd;")
    private static class222 field2455 = class212.method1357(" is already on your ignore list)3", 10731);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lvd;")
    public static class222 field2453 = field2455;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lab;")
    public static class3 field2454;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lrf;")
    public static final class184 method801(boolean arg0) {
        if (arg0) {
            field2455 = null;
        }
        field2450++;
        try {
            return (class184) Class.forName("sf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class67();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field2454 = null;
        field2451 = null;
        if (arg0 == 6438) {
            field2452 = null;
            field2455 = null;
            field2453 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(JLvd;BIISLvd;)V")
    public static final void method803(long arg0, class222 arg1, byte arg2, int arg3, int arg4, short arg5, class222 arg6) {
        if (arg2 != 44) {
            field2452 = null;
        }
        field2457++;
        if (class38.field834 || class172.field3227 >= 500) {
            return;
        }
        class179.field3323[class172.field3227] = arg6;
        class72.field1434[class172.field3227] = arg1;
        class131.field2535[class172.field3227] = arg5;
        class156.field2978[class172.field3227] = arg0;
        class130.field2525[class172.field3227] = arg3;
        class209.field3891[class172.field3227] = arg4;
        class172.field3227++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BIIII)V")
    public static final void method804(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2449++;
        if (arg4 <= arg1) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class156.field2981[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class156.field2981[var6][arg3] = arg2;
            }
        }
        int var7 = -106 % ((arg0 - 22) / 54);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lja;")
    public static final class98 method805(int arg0, byte arg1) {
        field2447++;
        if (arg1 <= 62) {
            method804((byte) 28, 85, -102, -110, -25);
        }
        class98 var2 = (class98) class146.field2787.method601((long) arg0, 75);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1317.method33(-29616, class27.method231(arg0, -65), class190.method1188(arg0, true));
        class98 var4 = new class98();
        var4.field1849 = arg0;
        if (var3 != null) {
            var4.method617(0, new class109(var3));
        }
        class146.field2787.method593((long) arg0, var4, (byte) -12);
        return var4;
    }
}
