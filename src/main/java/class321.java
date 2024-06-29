import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class321 extends class56 {

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field4894 = 0;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
    public static int[] field4892 = new int[256];

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 10)
    public static void method2233(int arg0) {
        if (arg0 != 5) {
            method2235((byte) -112, (class68) null);
        }
        field4892 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)Z", line = 23)
    public static final boolean method2234(byte arg0, boolean arg1) {
        field4889++;
        if (arg0 <= 118) {
            field4891 = -95;
        }
        boolean var2 = class195.method1249();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class195.method1245();
        } else if (!class195.method1250() || !class195.method1246() || !class195.method1252()) {
            arg1 = false;
        }
        class28.field539 = arg1;
        class271.method1824(116, class177.field2849);
        if (arg1 == var2) {
            return false;
        } else {
            ((class52) class284.field4393).method386(95);
            return true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLkl;)V", line = 63)
    public static final void method2235(byte arg0, class68 arg1) {
        int var2 = arg1.field1438;
        if (arg0 <= 6) {
            method2235((byte) -80, (class68) null);
        }
        field4890++;
        if (var2 == 324) {
            if (class239.field3741 == -1) {
                class296.field4518 = arg1.field1421;
                class239.field3741 = arg1.field1285;
            }
            if (class168.field2689.field3612) {
                arg1.field1285 = class239.field3741;
            } else {
                arg1.field1285 = class296.field4518;
            }
        } else if (var2 == 325) {
            if (class239.field3741 == -1) {
                class239.field3741 = arg1.field1285;
                class296.field4518 = arg1.field1421;
            }
            if (class168.field2689.field3612) {
                arg1.field1285 = class296.field4518;
            } else {
                arg1.field1285 = class239.field3741;
            }
        } else if (var2 == 327) {
            arg1.field1342 = 150;
            arg1.field1400 = (int) (Math.sin((double) class25.field494 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1431 = -1;
            arg1.field1423 = 5;
        } else if (var2 == 328) {
            if (class66.field1265.field4269 == null) {
                arg1.field1431 = 0;
            } else {
                arg1.field1342 = 150;
                arg1.field1400 = (int) (Math.sin((double) class25.field494 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1423 = 5;
                arg1.field1431 = ((int) class116.method767(-128, class66.field1265.field4269) << 11) + 2047;
                arg1.field1433 = class66.field1265.field1903;
                arg1.field1439 = class66.field1265.field1893;
                arg1.field1338 = class66.field1265.field1935;
                arg1.field1437 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 142)
    public static final int method2236(String arg0, int arg1) {
        if (arg1 <= 51) {
            field4891 = 77;
        }
        field4893++;
        return class34.method272(10, (byte) 127, arg0, true);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4892[var0] = var1;
        }
        field4896 = -1;
    }
}
