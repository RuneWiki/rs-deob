import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class81 {

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
    public static int[] field1120 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1122 = "flash3:";

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Llm;")
    public static class150 field1114 = new class150(64);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lnh;")
    public static class305 field1121;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
    public static byte[] field1115;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public static final int method514(byte arg0) {
        int var1 = 61 / ((24 - arg0) / 61);
        field1119++;
        return ((class51.field716 == 0 ? 0 : 1) << 21) + ((class37.field570 ? 1 : 0) << 19) + (class221.field3441 << 17) + ((class314.field5048 ? 1 : 0) << 15) + ((class288.field4598 ? 1 : 0) << 7) + ((class116.field1677 ? 1 : 0) << 6) + ((class38.field583 ? 1 : 0) << 5) + (class270.field4310 & 0x7) + (((class26.field414 ? 1 : 0) << 3) - -((class281.field4464 ? 1 : 0) << 4)) - (-((class103.field1483 ? 1 : 0) << 8) + -((class78.field1087 ? 1 : 0) << 9) - (((class68.field959 ? 1 : 0) << 10) - -(class56.field782 & 0x3 << 11) + (((class202.field3054 ? 1 : 0) << 13) - -((class108.field1548 ? 1 : 0) << 16)) + (((class221.field3440 == 0 ? 0 : 1) << 20) - -((class209.field3110 == 0 ? 0 : 1) << 22))) + -(class220.method1441() << 23));
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static void method515(byte arg0) {
        field1120 = null;
        if (arg0 == 64) {
            field1115 = null;
            field1122 = null;
            field1121 = null;
            field1114 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lim;I)Lim;")
    public static final class178 method516(class178 arg0, int arg1) {
        if (arg1 != 1910073168) {
            return null;
        }
        field1113++;
        if (arg0.field2675 != -1) {
            return class166.method1057(-104, arg0.field2675);
        }
        int var2 = arg0.field2545 >>> 16;
        class277 var3 = new class277(class186.field2821);
        for (class60 var4 = (class60) var3.method1797(70); var4 != null; var4 = (class60) var3.method1801(-101)) {
            if (var4.field831 == var2) {
                return class166.method1057(arg1 - 1910073101, (int) var4.field2141);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static final void method517(int arg0) {
        field1116++;
        if (class222.field3460 == class166.field2364) {
            return;
        }
        if (arg0 != 0) {
            method515((byte) 41);
        }
        if (class110.method703(class166.field2364, 24628)) {
            class222.field3460 = class166.field2364;
        }
    }
}
