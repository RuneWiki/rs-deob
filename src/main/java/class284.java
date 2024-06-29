import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class284 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field4291 = -1;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public static int[] field4294 = new int[200];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 5)
    public static void method2057(byte arg0) {
        if (arg0 != 3) {
            method2060(-90, -84);
        }
        field4294 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2058(int arg0) {
        field4293++;
        class2.method9(0, 10691, 0);
        int var1 = 23 % ((arg0 + 36) / 60);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 28)
    public static final void method2059(int arg0) {
        field4290++;
        class211 var1 = (class211) class217.field3199.method93((byte) -127);
        if (arg0 != 14112) {
            return;
        }
        while (var1 != null) {
            class323 var2 = var1.field3064;
            if (class321.field4835 != var2.field4864 || var2.field4877) {
                var1.method876(8);
            } else if (var2.field4857 <= class304.field4560) {
                var2.method2239(class94.field1310, -12523);
                if (var2.field4877) {
                    var1.method876(arg0 - 14104);
                } else {
                    class89.method707(var2.field4864, var2.field4870, var2.field4868, var2.field4863, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class211) class217.field3199.method97(arg0 - 14238);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B", line = 69)
    public static final synchronized byte[] method2060(int arg0, int arg1) {
        field4289++;
        if (arg0 == 100 && class1.field14 > 0) {
            byte[] var2 = class137.field1992[--class1.field14];
            class137.field1992[class1.field14] = null;
            return var2;
        } else if (arg0 == 5000 && class289.field4371 > 0) {
            byte[] var3 = class37.field546[--class289.field4371];
            class37.field546[class289.field4371] = null;
            return var3;
        } else if (arg0 == 30000 && class103.field1487 > 0) {
            byte[] var4 = class15.field219[--class103.field1487];
            class15.field219[class103.field1487] = null;
            return var4;
        } else {
            if (arg1 > -33) {
                field4291 = 34;
            }
            return new byte[arg0];
        }
    }
}
