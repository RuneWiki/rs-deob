import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class101 extends class312 {

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[B")
    public byte[] field1571;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lnk;")
    public static class2 field1569 = new class2();

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "[I")
    public static int[] field1572 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field1575 = 1;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 4)
    public static void method685(int arg0) {
        field1569 = null;
        field1572 = null;
        if (arg0 != 1) {
            field1572 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZILwf;II)V", line = 18)
    public static final void method686(int arg0, boolean arg1, int arg2, class306 arg3, int arg4, int arg5) {
        class82.field1219 = arg2;
        class283.field4341 = 10000;
        class85.field1289 = arg3;
        class150.field2371 = arg4;
        class160.field2483 = arg5;
        class284.field4354 = arg1;
        class278.field4286 = 1;
        if (arg0 == 0) {
            field1570++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method687(int arg0, byte arg1) {
        field1568++;
        class199 var2 = class275.field4238;
        synchronized (class275.field4238) {
            class208.field3306 = arg0;
            int var3 = -109 % ((-arg1 - 59) / 35);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([B)V", line = 64)
    public class101(byte[] arg0) {
        this.field1571 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 75)
    public static final void method688(int arg0) {
        field1574++;
        class199 var1 = class275.field4238;
        synchronized (class275.field4238) {
            class208.field3306++;
            class63.field941 = class109.field1677;
            class199.field2985 = class94.field1444;
            class107.field1636 = class228.field3664;
            class256.field3994 = class266.field4109;
            class85.field1295 = class179.field2740;
            class7.field81 = class190.field2896;
            class320.field5009 = class106.field1621;
            class266.field4109 = arg0;
        }
    }
}
