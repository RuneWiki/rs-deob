import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class264 {

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public int field4190 = -1;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lok;")
    public static class41 field4181 = class137.method956(")3)3)3", 45);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4182 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lok;")
    public static class41 field4180 = class137.method956("um", 45);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lok;")
    public static class41 field4188 = class137.method956("Update)2Liste geladen)3", 45);

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lok;")
    public static class41 field4185 = class137.method956("", 45);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lmb;")
    public class137 field4179;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    public int[] field4189;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[Lok;")
    public class41[] field4184;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BII)V", line = 19)
    public static final void method1869(byte arg0, int arg1, int arg2) {
        field4183++;
        class46 var3 = class195.method1396(6, arg2, false);
        var3.method337(0);
        var3.field721 = arg1;
        if (arg0 >= -49) {
            method1869((byte) 35, 108, -86);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 40)
    public static void method1870(byte arg0) {
        field4185 = null;
        field4188 = null;
        if (arg0 >= 117) {
            field4180 = null;
            field4181 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLok;)V", line = 63)
    public static final void method1871(byte arg0, class41 arg1) {
        field4187++;
        if (class271.field4379 == null) {
            return;
        }
        long var2 = arg1.method291((byte) 65);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class271.field4379.length > var4 && class271.field4379[var4].field844 != var2) {
            var4++;
        }
        if (arg0 <= 51) {
            field4185 = (class41) null;
        }
        if (class271.field4379.length > var4 && class271.field4379[var4] != null) {
            class207.field3360++;
            class285.field4642.method844(-4, 51);
            class285.field4642.method800(class271.field4379[var4].field844, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIII)V", line = 104)
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4186++;
        if (class32.method223(arg4, 255)) {
            if (arg0 != 6266) {
                field4180 = (class41) null;
            }
            class13.field162 = null;
            class305.method2102(arg5, -18045, class273.field4446[arg4], arg8, arg2, arg3, arg1, arg7, -1, arg6);
            if (class13.field162 != null) {
                class305.method2102(arg5, arg0 ^ 0xFFFFA1F9, class13.field162, arg8, arg2, arg3, class75.field1114, arg7, -1412584499, class300.field4866);
                class13.field162 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class195.field3151[var9] = true;
            }
        } else {
            class195.field3151[arg3] = true;
        }
    }
}
