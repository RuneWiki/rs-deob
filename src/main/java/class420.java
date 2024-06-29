import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class420 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field6164 = 1405;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field6167 = -1;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6173 = "";

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "B")
    public byte field6154;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "B")
    public byte field6156;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "B")
    public byte field6162;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "B")
    public byte field6165;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "B")
    public byte field6166;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "B")
    public byte field6169;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "B")
    public byte field6178;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public int field6179;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lee;")
    public static class125 field6176;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "S")
    public short field6160;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
    public boolean field6155;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Z")
    public boolean field6157;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Z")
    public boolean field6159;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    public boolean field6161;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Z")
    public boolean field6163;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public boolean field6168;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    public boolean field6170;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
    public boolean field6172;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Z")
    public boolean field6175;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
    public boolean field6180;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILum;)I", line = 6)
    public static final int method2620(int arg0, class83 arg1) {
        field6177++;
        int var2 = arg0;
        if (arg1.method739((byte) -51, class29.field322)) {
            var2 = arg0 + 1;
        }
        if (arg1.method739((byte) -59, class536.field7859)) {
            var2++;
        }
        if (arg1.method739((byte) -29, class517.field7516)) {
            var2++;
        }
        if (arg1.method739((byte) -47, class133.field1952)) {
            var2++;
        }
        if (arg1.method739((byte) -90, class265.field4235)) {
            var2++;
        }
        if (arg1.method739((byte) -120, class295.field4541)) {
            var2++;
        }
        if (arg1.method739((byte) -97, class348.field5191)) {
            var2++;
        }
        if (arg1.method739((byte) -92, class417.field6134)) {
            var2++;
        }
        if (arg1.method739((byte) -99, class321.field4859)) {
            var2++;
        }
        if (arg1.method739((byte) -120, class342.field5112)) {
            var2++;
        }
        if (arg1.method739((byte) -91, class59.field898)) {
            var2++;
        }
        if (arg1.method739((byte) -84, class109.field1641)) {
            var2++;
        }
        if (arg1.method739((byte) -63, class431.field6381)) {
            var2++;
        }
        if (arg1.method739((byte) -70, class112.field1672)) {
            var2++;
        }
        if (arg1.method739((byte) -53, class413.field6092)) {
            var2++;
        }
        if (arg1.method739((byte) -118, class306.field4687)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 85)
    public static void method2621(int arg0) {
        field6176 = null;
        field6173 = null;
        if (arg0 != -464860857) {
            field6176 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 104)
    public static final void method2622(byte arg0) {
        if (arg0 > -92) {
            field6167 = 53;
        }
        field6174++;
        if (!class297.field4577) {
            return;
        }
        while (true) {
            while (class467.field6879 < class205.field3154.length) {
                class424 var1 = class205.field3154[class467.field6879];
                if (var1 != null && var1.field6222 == -1) {
                    if (class381.field5604 == null) {
                        class381.field5604 = class471.field6913.method2407(var1.field6223, 115);
                    }
                    int var2 = class381.field5604.field3153;
                    if (var2 == -1) {
                        return;
                    }
                    class467.field6879++;
                    class381.field5604 = null;
                    var1.field6222 = var2;
                } else {
                    class467.field6879++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I", line = 152)
    public static final int method2623(int arg0, int arg1) {
        if (arg1 > -45) {
            return -74;
        } else {
            field6171++;
            return arg0 >>> 7;
        }
    }
}
