import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class444 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lwq;")
    public static class370[] field6605 = new class370[4];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILns;I)Lrt;")
    public static final class316 method2675(int arg0, int arg1, class438 arg2, int arg3) {
        field6606++;
        class91 var4 = new class91(arg2.method2650(arg0, -102, arg1));
        class316 var5 = new class316(arg0, var4.method621(2029169511), var4.method621(2029169511), var4.method626((byte) 100), var4.method626((byte) 100), var4.method618((byte) 100) == 1, var4.method618((byte) 100), var4.method618((byte) 100));
        int var6 = var4.method618((byte) 100);
        for (int var7 = arg3; var7 < var6; var7++) {
            var5.field4835.method1958(new class193(var4.method618((byte) 100), var4.method631(10494), var4.method631(10494), var4.method631(10494), var4.method631(10494), var4.method631(10494), var4.method631(arg3 ^ 0x28FE), var4.method631(10494), var4.method631(10494)), 0);
        }
        var5.method2048(123);
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method2676(byte arg0) {
        if (arg0 <= 77) {
            field6605 = null;
        }
        class157 var1 = class211.field2971;
        synchronized (class211.field2971) {
            class211.field2971.method1015((byte) 104);
        }
        field6607++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method2677(int arg0) {
        int var1 = -47 % ((arg0 - 64) / 51);
        field6605 = null;
    }
}
