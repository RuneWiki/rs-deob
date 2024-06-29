import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class415 {

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "Llj;")
    public static class570 field5675 = new class570(14, 0, 4, 1);

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Ldb;")
    public static class298 field5677 = new class298(84, 6);

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "[I")
    public static int[] field5681 = new int[1024];

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Llj;")
    public static class570 field5682 = new class570(2, 4, 4, 0);

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "F")
    public static float field5679;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 5)
    public static void method2375(int arg0) {
        field5677 = null;
        field5675 = null;
        field5681 = null;
        field5682 = null;
        if (arg0 != -25577) {
            field5677 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V", line = 21)
    public static final void method2376(int arg0) {
        class710.field9935 = null;
        field5680++;
        class588.method3236(-1, class251.field3463, 0, class627.field8461, 3, arg0, 0, 0, class149.field2387);
        if (class710.field9935 != null) {
            class54.method362(-1412584499, class325.field4502, 1024, 0, class149.field2387, class673.field9525.field8280, class627.field8461, class710.field9935, 0, class308.field4258);
            class710.field9935 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)I", line = 43)
    public static final int method2377(byte arg0, int arg1) {
        if (arg0 >= -77) {
            field5675 = null;
        }
        field5674++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/lang/String;)V", line = 54)
    public static final void method2378(int arg0, String arg1) {
        field5678++;
        if (class287.field4063 == null) {
            class397.method2281((byte) 87);
        }
        String[] var2 = class572.method3141(arg1, '\n', (byte) 12);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            for (int var4 = class586.field7776; var4 > 0; var4--) {
                class287.field4063[var4] = class287.field4063[var4 - 1];
            }
            class287.field4063[0] = var2[var3];
            if ((class287.field4063.length - 1) > class586.field7776) {
                class586.field7776++;
                if (class711.field9945 > 0) {
                    class711.field9945++;
                }
            }
        }
    }
}
