import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class275 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lpm;")
    public static class349 field3971 = new class349("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public static int[] field3973 = new int[200];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z", line = 3)
    public static final boolean method1865(byte arg0) {
        field3969++;
        if (arg0 < 110) {
            field3971 = null;
        }
        try {
            return class407.method2563(1);
        } catch (IOException var4) {
            class371.method2383((byte) 102);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class213.field3012 + "," + class13.field189 + "," + class324.field4719 + " - " + class242.field3572 + "," + (class306.field4459 + class181.field2555.field4595[0]) + "," + (class181.field2555.field4601[0] + class342.field4959) + " - ";
            for (int var3 = 0; var3 < class242.field3572 && var3 < 50; var3++) {
                var2 = var2 + class352.field5114.field1851[var3] + ",";
            }
            class334.method2191(true, var2, var5);
            class185.method1327((byte) 64);
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)I", line = 33)
    public static final int method1866(int arg0, byte arg1) {
        if (arg1 > -80) {
            method1868(68);
        }
        field3972++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 49)
    public static final void method1867(byte arg0) {
        field3970++;
        if (class153.field2271 != null) {
            class153.field2271.method1372((byte) 102);
        }
        if (class439.field6276 != null) {
            class439.field6276.method1372((byte) 102);
        }
        class270.method1846(class358.field5172, 2, -85, 22050);
        if (arg0 > 26) {
            class153.field2271 = class215.method1509(false, 22050, class401.field5628, 0, class117.field1588);
            class153.field2271.method1359(class242.field3575, (byte) 96);
            class439.field6276 = class215.method1509(false, 2048, class401.field5628, 1, class117.field1588);
            class439.field6276.method1359(class378.field5380, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 74)
    public static void method1868(int arg0) {
        field3971 = null;
        if (arg0 < 70) {
            method1867((byte) -59);
        }
        field3973 = null;
    }
}
