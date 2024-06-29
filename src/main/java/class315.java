import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class315 {

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
    public static int[] field4490 = new int[200];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
    public static int[][] field4489;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method1967(byte arg0) {
        field4484++;
        class264.field3708.method2052(0);
        if (arg0 != -75) {
            method1972(20, -32);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V")
    public static final void method1968(boolean arg0, boolean arg1) {
        field4481++;
        if (class112.field1295 == arg1) {
            return;
        }
        class112.field1295 = arg1;
        if (arg0) {
            method1972(30, 4);
        }
        class406.method2563(1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method1969(int arg0) {
        if (arg0 > -52) {
            return;
        }
        field4493++;
        try {
            if (class30.field272 == 1) {
                int var1 = class443.field6477.method1660((byte) 16);
                if (var1 > 0 && class443.field6477.method1651(true)) {
                    int var2 = var1 - class337.field5001;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class443.field6477.method1670(481, var2);
                } else {
                    class443.field6477.method1646(1);
                    class443.field6477.method1665(-87);
                    if (class397.field5794 == null) {
                        class30.field272 = 0;
                    } else {
                        class30.field272 = 2;
                    }
                    class176.field2450 = null;
                    class7.field79 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class443.field6477.method1646(1);
            class176.field2450 = null;
            class397.field5794 = null;
            class7.field79 = null;
            class30.field272 = 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILjf;)V")
    public static final void method1970(int arg0, int arg1, int arg2, class119 arg3) {
        field4492++;
        if (arg2 != 127) {
            return;
        }
        class121 var4 = arg3.method678((byte) 15, class218.field2991);
        if (var4 == null) {
            return;
        }
        class218.field2991.method968(arg0, arg1, arg0 + arg3.field1552, arg1 - -arg3.field1498);
        if (class114.field1318 < 3) {
            class159.field2260.method88((float) arg3.field1552 / 2.0F + (float) arg0, (float) arg3.field1498 / 2.0F + (float) arg1, 4096, (int) (-class276.field3893) & 0x3FFF << 2, var4, arg0, arg1);
        } else {
            class218.field2991.method980(-16777216, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static void method1971(int arg0) {
        field4490 = null;
        field4489 = null;
        int var1 = 102 / ((arg0 - 69) / 53);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method1972(int arg0, int arg1) {
        field4485++;
        int var2 = 71 % ((arg0 - 68) / 49);
        return arg1 & 0x7F;
    }
}
