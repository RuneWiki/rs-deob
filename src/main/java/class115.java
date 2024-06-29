import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class115 extends class387 {

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "S")
    public static short field1563 = 320;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field1561 = 2;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "[Z")
    public static boolean[] field1569 = new boolean[100];

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "Lcq;")
    public class70 field1564;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "[B")
    public byte[] field1562;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "[Lae;")
    public static class285[] field1559;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)J")
    public static final long method801(int arg0) {
        if (arg0 != 2048) {
            return -52L;
        } else {
            ++field1570;
            return class237.field3528.method303((byte) -4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        ++field1565;
        if (class423.field6115 != null) {
            class423.field6115.method751(false);
        }
        if (class182.field2565 != null) {
            class182.field2565.method751(false);
        }
        class46.method380(2, (byte) 112, 22050, class134.field1847);
        class423.field6115 = class44.method366(22050, class267.field3963, 0, (byte) 80, class270.field4004);
        class423.field6115.method744(class447.field6539, 127);
        class182.field2565 = class44.method366(2048, class267.field3963, 1, (byte) -125, class270.field4004);
        if (arg0 < -39) {
            class182.field2565.method744(class452.field6671, 127);
        }
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)I")
    public final int method434(int arg0) {
        if (arg0 != 100) {
            method802((byte) 13);
        }
        ++field1568;
        return super.field5650 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lct;ZLct;)V")
    public static final void method803(class104 arg0, boolean arg1, class104 arg2) {
        if (!arg1) {
            method803((class104) null, false, (class104) null);
        }
        ++field1557;
        class161.field2150 = arg2;
        class230.field3442 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)I")
    public static final int method804(int arg0, int arg1) {
        ++field1566;
        return arg1 != 255 ? 23 : arg0 & 255;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)[B")
    public final byte[] method430(byte arg0) {
        ++field1571;
        if (arg0 != 54) {
            method804(-38, -83);
        }
        if (super.field5650) {
            throw new RuntimeException();
        } else {
            return this.field1562;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V")
    public static void method805(byte arg0) {
        field1559 = null;
        int var1 = 116 % ((7 - arg0) / 61);
        field1569 = null;
    }
}
