import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class103 {

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lcf;")
    public static class93 field1796 = class147.method1066("Spielwelt erstellt)3", -48);

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lcf;")
    public static class93 field1797 = class147.method1066("<col=80ff00>", -48);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
    public static int[] field1798;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method752(int arg0, int arg1) {
        field1792++;
        if (arg0 == 100 && class46.field752 > 0) {
            byte[] var2 = class55.field921[--class46.field752];
            class55.field921[class46.field752] = null;
            return var2;
        }
        if (arg1 < 121) {
            field1793 = -13;
        }
        if (arg0 == 5000 && class29.field361 > 0) {
            byte[] var3 = class95.field1710[--class29.field361];
            class95.field1710[class29.field361] = null;
            return var3;
        } else if (arg0 == 30000 && class172.field3013 > 0) {
            byte[] var4 = class133.field2339[--class172.field3013];
            class133.field2339[class172.field3013] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1798 = null;
        if (arg0 > -91) {
            method752(-64, -49);
        }
        field1797 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public static final void method754(int arg0, byte arg1) {
        field1795++;
        if (arg1 != 58) {
            field1797 = null;
        }
        class193.field3524.method298(true, arg0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILhg;)V")
    public static final void method755(int arg0, class177 arg1) {
        if (arg0 == 25361) {
            class79.field1470 = arg1;
            field1794++;
        }
    }
}
