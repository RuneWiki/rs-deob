import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class44 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
    public static boolean field702 = false;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lwm;")
    private static class152 field703 = class157.method1048("flash2:", 94);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lwm;")
    public static class152 field700 = class157.method1048("rot:", 112);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field705 = -1;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lwm;")
    public static class152 field706 = field703;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lwm;")
    public static class152 field699 = field703;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient;")
    public static client field707;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Loe;BI)V", line = 13)
    public static final void method302(class127[] arg0, byte arg1, int arg2) {
        if (arg1 <= 69) {
            field703 = (class152) null;
        }
        field701++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class127 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1902 == 0) {
                    if (var4.field1937 != null) {
                        method302(var4.field1937, (byte) 126, arg2);
                    }
                    class122 var5 = (class122) class107.field1519.method1586((long) var4.field1868, -92);
                    if (var5 != null) {
                        class157.method1058(arg2, 119, var5.field1724);
                    }
                }
                if (arg2 == 0 && var4.field1815 != null) {
                    class320 var6 = new class320();
                    var6.field5581 = var4.field1815;
                    var6.field5569 = var4;
                    class64.method412(var6, (byte) -98);
                }
                if (arg2 == 1 && var4.field1935 != null) {
                    if (var4.field1934 >= 0) {
                        class127 var7 = class11.method54(false, var4.field1868);
                        if (var7 == null || var7.field1937 == null || var7.field1937.length <= var4.field1934 || var7.field1937[var4.field1934] != var4) {
                            continue;
                        }
                    }
                    class320 var8 = new class320();
                    var8.field5569 = var4;
                    var8.field5581 = var4.field1935;
                    class64.method412(var8, (byte) -111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 91)
    public static void method303(int arg0) {
        field703 = null;
        if (arg0 != -102) {
            field702 = true;
        }
        field700 = null;
        field699 = null;
        field707 = null;
        field706 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 130)
    public static final void method304(int arg0) {
        field708++;
        if (class98.field1408) {
            class242.field3986 = null;
            class234.field3834 = null;
            int var1 = -51 / ((arg0 - 61) / 53);
            class98.field1408 = false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLah;)V", line = 167)
    public static final void method305(byte arg0, class205 arg1) {
        field709++;
        if (arg0 == -128) {
            class262.field4459 = arg1;
        }
    }
}
