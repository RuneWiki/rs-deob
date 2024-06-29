import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class104 extends class193 {

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1647 = "red:";

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Z")
    public static boolean field1643 = true;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 4)
    public static void method729(int arg0) {
        field1647 = null;
        if (arg0 != 915793988) {
            field1647 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method730(int arg0, byte arg1) {
        class316.field4772.method2174(-12634, arg0);
        if (arg1 != -119) {
            field1643 = false;
        }
        field1648++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I", line = 35)
    public static final int method731(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        field1644++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 > -37) {
            field1643 = true;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILlm;IIZ)V", line = 53)
    public static final void method732(int arg0, int arg1, class210 arg2, int arg3, int arg4, boolean arg5) {
        class43.field527 = 10000;
        class270.field4128 = arg0;
        class54.field682 = 1;
        int var6 = -114 / ((-arg4 - 62) / 56);
        class314.field4757 = arg2;
        class194.field2897 = arg1;
        class307.field4683 = arg3;
        field1645++;
        class16.field176 = arg5;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lvf;", line = 86)
    public static final class63 method733(int arg0, boolean arg1) {
        field1649++;
        class63 var2 = (class63) class152.field2279.method1674(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field1647 = (String) null;
        }
        byte[] var3 = class222.field3387.method1441(arg0, (byte) -44, 11);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method414(arg1, new class263(var3));
        }
        class152.field2279.method1672(-48, (long) arg0, var4);
        return var4;
    }
}
