import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "J")
    public long field123 = 0L;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lrd;")
    private static class173 field109 = class133.method843("Bad session id)3", 108);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lrd;")
    public static class173 field110 = field109;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lpb;")
    public static class151 field122;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ldd;")
    public class35 field113;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
    public static final int method38(int arg0, int arg1, int arg2) {
        field114++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return arg1 == 17492 ? (arg0 & 0xFF80) + var3 : 21;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static final void method39(boolean arg0) {
        field105++;
        for (class87 var1 = (class87) class35.field757.method915(-1); var1 != null; var1 = (class87) class35.field757.method910((byte) 88)) {
            if (var1.field1691 != null) {
                var1.method560(128);
            }
        }
        if (arg0) {
            method38(-105, 34, 44);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILqf;)Lrd;")
    public static final class173 method40(int arg0, class165 arg1) {
        if (arg0 != 127) {
            method42(61);
        }
        field117++;
        if (class123.method797(class78.method474(arg1, 104), (byte) -73) == 0) {
            return null;
        } else if (arg1.field3091 == null || arg1.field3091.method1122(arg0 - 209).method1153((byte) -128) == 0) {
            return class119.field2189 ? class92.field1732 : null;
        } else {
            return arg1.field3091;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lrd;Z)I")
    public static final int method41(class173 arg0, boolean arg1) {
        field118++;
        if (class48.field1013 == 1) {
            return 7;
        } else if (arg0.method1157(class123.field2306, false)) {
            return 1;
        } else if (arg0.method1157(class197.field3832, false)) {
            return 1;
        } else if (arg0.method1157(class30.field610, false)) {
            return 2;
        } else if (arg0.method1157(class133.field2506, false)) {
            return 2;
        } else if (arg0.method1157(class194.field3780, arg1)) {
            return 3;
        } else if (arg0.method1157(class121.field2283, false)) {
            return 4;
        } else if (arg0.method1157(class114.field2100, arg1)) {
            return 4;
        } else if (arg0.method1157(class123.field2310, false)) {
            return 5;
        } else if (arg0.method1157(class109.field2033, false)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method42(int arg0) {
        field110 = null;
        if (arg0 == -17165) {
            field122 = null;
            field109 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbc;II)Lte;")
    public static final class194 method43(class14 arg0, int arg1, int arg2) {
        field116++;
        int var3 = 66 / ((arg1 - 59) / 43);
        byte[] var4 = arg0.method125(26796, arg2);
        return var4 == null ? null : new class194(var4);
    }
}
