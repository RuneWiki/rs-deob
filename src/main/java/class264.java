import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class264 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lim;")
    public static class237 field4352 = new class237(0, -1);

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lec;")
    public static class25 field4353 = new class25(50);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lfa;")
    public static class273 field4354;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        class198.field3133 = -3;
        class151.field2355 = 0;
        class80.field1265 = -1;
        if (arg0 < 46) {
            field4354 = null;
        }
        class183.field2847 = 0;
        class4.field34 = 1;
        class149.field2329 = 0;
        field4349++;
        class311.field5021 = false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method1824(byte arg0) {
        field4354 = null;
        field4353 = null;
        if (arg0 >= -29) {
            method1825((byte[]) null, -119, true);
        }
        field4352 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method1825(byte[] arg0, int arg1, boolean arg2) {
        field4351++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class106.field1598) {
            try {
                class197 var3 = (class197) Class.forName("fc").getDeclaredConstructor().newInstance();
                var3.method855(arg0, (byte) 74);
                return var3;
            } catch (Throwable var4) {
                class106.field1598 = true;
            }
        }
        if (arg1 == 30517) {
            return arg2 ? class223.method1556(arg0, (byte) -101) : arg0;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1826(int arg0, int arg1) {
        field4350++;
        if (arg0 == 100 && class99.field1482 > 0) {
            byte[] var2 = class286.field4773[--class99.field1482];
            class286.field4773[class99.field1482] = null;
            return var2;
        } else if (arg0 == 5000 && class119.field1834 > 0) {
            byte[] var3 = class162.field2550[--class119.field1834];
            class162.field2550[class119.field1834] = null;
            return var3;
        } else if (arg0 == 30000 && class218.field3468 > 0) {
            byte[] var4 = class55.field736[--class218.field3468];
            class55.field736[class218.field3468] = null;
            return var4;
        } else {
            if (arg1 != 10566) {
                field4353 = null;
            }
            return new byte[arg0];
        }
    }
}
