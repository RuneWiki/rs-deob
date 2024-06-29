import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class326 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lph;")
    public static class229 field5573 = class266.method1858("jaune:", 0);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lph;")
    public static class229 field5574 = class266.method1858("Cabbage", 0);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Ltm;")
    public static class253 field5571 = new class253();

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5576 = 0;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lsi;")
    public static class66 field5577;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    public static int[] field5570;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2232(int arg0) {
        field5572++;
        if (class211.field3490 == 0) {
            return;
        }
        try {
            if (arg0 >= -58) {
                method2234(-26, (byte) 105);
            }
            if (++class263.field4404 > 2000) {
                if (class121.field2031 != null) {
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                }
                if (class228.field3751 >= 1) {
                    class211.field3490 = 0;
                    class4.field42 = -5;
                    return;
                }
                class263.field4404 = 0;
                class211.field3490 = 1;
                if (class312.field5260 == class103.field1764) {
                    class103.field1764 = class103.field1754;
                } else {
                    class103.field1764 = class312.field5260;
                }
                class228.field3751++;
            }
            if (class211.field3490 == 1) {
                class314.field5339 = class249.field4143.method683(class103.field1764, 0, class312.field5261);
                class211.field3490 = 2;
            }
            if (class211.field3490 == 2) {
                if (class314.field5339.field4125 == 2) {
                    throw new IOException();
                }
                if (class314.field5339.field4125 != 1) {
                    return;
                }
                class121.field2031 = new class67((Socket) class314.field5339.field4123, class249.field4143);
                class314.field5339 = null;
                class121.field2031.method527(class121.field2033.field2668, 20737, class121.field2033.field2670, 0);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                int var1 = class121.field2031.method529(-27959);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                if (var1 != 21) {
                    class4.field42 = var1;
                    class211.field3490 = 0;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
                class211.field3490 = 3;
            }
            if (class211.field3490 == 3) {
                if (class121.field2031.method525(false) < 1) {
                    return;
                }
                class257.field4300 = new class229[class121.field2031.method529(-27959)];
                class211.field3490 = 4;
            }
            if (class211.field3490 == 4) {
                if (class121.field2031.method525(false) < (class257.field4300.length * 8)) {
                    return;
                }
                class88.field1497.field2670 = 0;
                class121.field2031.method532(false, class257.field4300.length * 8, 0, class88.field1497.field2668);
                for (int var2 = 0; var2 < class257.field4300.length; var2++) {
                    class257.field4300[var2] = class100.method767((byte) 14, class88.field1497.method1174(-10985));
                }
                class211.field3490 = 0;
                class4.field42 = 21;
                class121.field2031.method534(-1);
                class121.field2031 = null;
                return;
            }
        } catch (IOException var4) {
            if (class121.field2031 != null) {
                class121.field2031.method534(-1);
                class121.field2031 = null;
            }
            if (class228.field3751 >= 1) {
                class211.field3490 = 0;
                class4.field42 = -4;
            } else {
                class228.field3751++;
                class211.field3490 = 1;
                class263.field4404 = 0;
                if (class312.field5260 == class103.field1764) {
                    class103.field1764 = class103.field1754;
                } else {
                    class103.field1764 = class312.field5260;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 192)
    public static void method2233(boolean arg0) {
        field5573 = null;
        field5570 = null;
        if (!arg0) {
            method2232(-18);
        }
        field5574 = null;
        field5577 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V", line = 213)
    public static final void method2234(int arg0, byte arg1) {
        field5575++;
        if (class142.field2301 == null) {
            class142.field2301 = new byte[4][104][104];
        }
        if (arg0 != -5) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class142.field2301[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
