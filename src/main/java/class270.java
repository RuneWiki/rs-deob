import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class270 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lbf;")
    public static class209 field4629 = new class209(512);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4630 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[[S")
    public static short[][] field4633;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[B", line = 12)
    public static final synchronized byte[] method1851(int arg0, int arg1) {
        field4632++;
        if (arg0 == 100 && class164.field2486 > 0) {
            byte[] var2 = class74.field1173[--class164.field2486];
            class74.field1173[class164.field2486] = null;
            return var2;
        } else if (arg0 == 5000 && class225.field3702 > 0) {
            byte[] var3 = class141.field2070[--class225.field3702];
            class141.field2070[class225.field3702] = null;
            return var3;
        } else {
            if (arg1 > -43) {
                field4631 = -14;
            }
            if (arg0 == 30000 && class93.field1419 > 0) {
                byte[] var4 = class1.field6[--class93.field1419];
                class1.field6[class93.field1419] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V", line = 62)
    public static final void method1852(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        if (class106.field1579 == 0) {
            class72.field1133.method1436(1745567687, arg1);
        } else {
            class100.field1487 = arg1;
        }
        field4635++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 109)
    public static void method1853(int arg0) {
        field4633 = (short[][]) null;
        field4629 = null;
        if (arg0 > -27) {
            method1853(-110);
        }
    }
}
