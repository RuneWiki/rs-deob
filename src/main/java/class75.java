import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class75 extends class80 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public boolean field1497 = false;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lr;")
    public static class66 field1493 = class93.method641(43, " <col=ffff00>");

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Lr;")
    private static class66 field1498 = class93.method641(43, "wave2:");

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lr;")
    public static class66 field1488 = field1498;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Lr;")
    public static class66 field1496 = field1498;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method535(byte arg0) {
        if (class101.field1972 != null) {
            class101.field1972.method1277(-20);
            class101.field1972 = null;
        }
        field1500++;
        class83.method576(137);
        class59.method389();
        for (int var1 = 0; var1 < 4; var1++) {
            class193.field3346[var1].method1110(false);
        }
        if (arg0 > -104) {
            method537(true);
        }
        class163.method1102((byte) 108);
        System.gc();
        class99.method678(2, (byte) 127);
        class67.field1350 = -1;
        class252.field4431 = false;
        class195.method1268(0, true);
        class34.field512 = 0;
        class3.field39 = 0;
        class3.field36 = false;
        for (int var2 = 0; var2 < class194.field3354.length; var2++) {
            class194.field3354[var2] = null;
        }
        class160.field2869 = 0;
        client.field1650 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class59.field988[var3] = null;
            class16.field203[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class178.field3112[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class63.field1249[var5][var6][var7] = null;
                }
            }
        }
        class45.method325(64);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBLr;SLr;J)V")
    public static final void method536(int arg0, int arg1, byte arg2, class66 arg3, short arg4, class66 arg5, long arg6) {
        field1495++;
        if (arg2 > -51) {
            method538(-54);
        }
        if (class115.field2177 || class176.field3105 >= 500) {
            return;
        }
        class25.field325[class176.field3105] = arg5;
        class9.field96[class176.field3105] = arg3;
        class43.field710[class176.field3105] = arg4;
        class70.field1414[class176.field3105] = arg6;
        class60.field1025[class176.field3105] = arg0;
        class188.field3272[class176.field3105] = arg1;
        class176.field3105++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method537(boolean arg0) {
        field1496 = null;
        if (arg0) {
            field1488 = null;
            field1498 = null;
            field1493 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static final void method538(int arg0) {
        field1491++;
        if (arg0 == 0) {
            class170.field3020.method1613((byte) 94);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Z")
    public static final boolean method539(int arg0, int arg1) {
        field1490++;
        if (arg1 == 1) {
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
