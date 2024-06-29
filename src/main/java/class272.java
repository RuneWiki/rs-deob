import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class272 extends class273 {

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Ljd;")
    public static class86 field4764 = class122.method868("Sprites geladen)3", true);

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
    public static boolean field4769 = true;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Ljd;")
    private static class86 field4772 = class122.method868("Loading )2 please wait)3", true);

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Ljd;")
    public static class86 field4768 = field4772;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "Ljd;")
    public static class86 field4774 = class122.method868("(U0a )2 via: ", true);

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "Luk;")
    public static class96 field4773 = new class96(30);

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[Lmk;")
    public static class101[] field4767;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "[S")
    public static short[] field4771;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4770;
        int[] var3 = super.field4800.method1224(arg1, arg0 ^ arg0);
        if (super.field4800.field3160) {
            class250.method1688(var3, 0, class176.field3200, class143.field2711[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lge;")
    public static final class69 method1853(int arg0, int arg1) {
        ++field4775;
        class69 var2 = (class69) class137.field2609.method701((byte) -126, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class86.field1673.method1084((byte) -115, class105.method747((byte) 52, arg1), class229.method1594(arg1, false));
            class69 var4 = new class69();
            var4.field1369 = arg1;
            if (var3 != null) {
                var4.method487(123, new class200(var3));
            }
            var4.method489(arg0);
            if (~var4.field1391 != 0) {
                var4.method495(method1853(0, var4.field1391), method1853(arg0, var4.field1360), (byte) 68);
            }
            if (~var4.field1401 != 0) {
                var4.method486(24545, method1853(0, var4.field1401), method1853(0, var4.field1416));
            }
            if (!class129.field2470 && var4.field1396) {
                var4.field1348 = null;
                var4.field1387 = 0;
                var4.field1412 = null;
                var4.field1374 = false;
                var4.field1421 = class171.field3162;
            }
            class137.field2609.method696((long) arg1, var4, (byte) -96);
            return var4;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Ln;")
    public static final class16 method1854(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            class16 var2 = (class16) class98.field1945.method395((long) arg1, (byte) 100);
            ++field4763;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3;
                if (~arg1 > -32769) {
                    var3 = class271.field4759.method1084((byte) -117, 0, arg1);
                } else {
                    var3 = class102.field1977.method1084((byte) -123, 0, arg1 & 32767);
                }
                class16 var4 = new class16();
                if (var3 != null) {
                    var4.method119(new class200(var3), (byte) 111);
                }
                if (~arg1 <= -32769) {
                    var4.method125((byte) -7);
                }
                class98.field1945.method398((long) arg1, (byte) 116, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public static final void method1855(int arg0) {
        ++field4776;
        if (class106.field2045) {
            class106.field2045 = false;
            class59.field1184 = null;
            if (arg0 >= -91) {
                method1856(98);
            }
            class11.field339 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    public static void method1856(int arg0) {
        field4773 = null;
        field4771 = null;
        field4767 = null;
        field4764 = null;
        if (arg0 <= 33) {
            method1855(-19);
        }
        field4768 = null;
        field4772 = null;
        field4774 = null;
    }
}
