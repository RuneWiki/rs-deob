import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class235 extends class167 {

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Z")
    public volatile boolean field4183 = true;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Le;")
    public static class191 field4180 = class54.method368("Konfig geladen)3", 2047);

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Le;")
    public static class191 field4181 = class54.method368("::tele ", 2047);

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "[I")
    public static int[] field4179 = new int[64];

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "Lwe;")
    public static class147 field4191 = new class147(64);

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Z")
    public boolean field4178;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "Z")
    public static boolean field4187;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Z")
    public boolean field4188;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "[I")
    public static int[] field4185;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)[B")
    public abstract byte[] method77(int arg0);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public static void method1656(byte arg0) {
        field4180 = null;
        field4185 = null;
        if (arg0 != 110) {
            method1659(-61);
        }
        field4179 = null;
        field4191 = null;
        field4181 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
    public static final void method1657(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 1955713648) {
                method1656((byte) 95);
            }
        } catch (InterruptedException var3) {
        }
        field4186++;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)I")
    public abstract int method80(int arg0);

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        field4189++;
        if (arg0 != 18138) {
            method1656((byte) 14);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class189.field3324[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        if (arg0 < 123) {
            field4179 = null;
        }
        field4182++;
        class42.field733.method1539((byte) 60);
        class170.field2878 = null;
        class273.field4825 = 1;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)V")
    public static final void method1660(int arg0, int arg1) {
        if (arg0 != 1955713648) {
            method1659(42);
        }
        for (class115 var2 = (class115) class83.field1390.method609(false); var2 != null; var2 = (class115) class83.field1390.method610(arg0 ^ 0x7491D22D)) {
            if (((long) arg1) == (var2.field1713 >> 48 & 0xFFFFL)) {
                var2.method655(63);
            }
        }
        field4184++;
    }
}
