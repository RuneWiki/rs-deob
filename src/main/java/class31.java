import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class31 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field546 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lvc;")
    public static class223 field547;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lih;")
    public static class95 field548;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
    public static int[] field544;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
    public static final boolean method212(int arg0) {
        field549++;
        class75 var1 = class17.field309;
        synchronized (class17.field309) {
            if (class202.field3595 == class197.field3496) {
                return false;
            }
            if (arg0 >= -94) {
                field550 = -106;
            }
            class136.field2428 = class89.field1697[class197.field3496];
            class66.field1203 = class84.field1633[class197.field3496];
            class197.field3496 = class197.field3496 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method213(byte arg0) {
        if (arg0 != -43) {
            method215(-55, 81, -53, -112, -39, -17, -105, -74, 40);
        }
        field548 = null;
        field547 = null;
        field544 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public static final void method214(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1318 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field551++;
        if (class122.method835(arg1, 31)) {
            class225.field4233 = null;
            if (arg3 >= -108) {
                field546 = 33;
            }
            class29.method201(true, arg4, -1, arg7, arg5, arg2, class4.field52[arg1], arg0, arg8, arg6);
            if (class225.field4233 != null) {
                class29.method201(true, arg4, -1412584499, arg7, arg5, class84.field1638, class225.field4233, arg0, class13.field260, arg6);
                class225.field4233 = null;
            }
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class68.field1289[var9] = true;
            }
        } else {
            class68.field1289[arg7] = true;
        }
    }
}
