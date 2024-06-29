import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class168 {

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "J")
    public long field2339 = 0L;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[I")
    public static int[] field2337 = new int[50];

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    public static int[] field2332 = new int[500];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Len;")
    public class47 field2331;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Len;")
    public class47 field2335;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 10)
    public static void method1099(int arg0) {
        field2337 = null;
        field2332 = null;
        if (arg0 <= 39) {
            method1100(-3, (short) 105, -4L, (String) null, 44, -89, -74, (String) null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ISJLjava/lang/String;IIILjava/lang/String;)V", line = 21)
    public static final void method1100(int arg0, short arg1, long arg2, String arg3, int arg4, int arg5, int arg6, String arg7) {
        field2334++;
        if (class140.field1951 || arg5 >= ~class310.field4794) {
            return;
        }
        class221.field3124[class310.field4794] = arg7;
        class148.field2061[class310.field4794] = arg3;
        class76.field968[class310.field4794] = arg6 == -1 ? class275.field4288 : arg6;
        class30.field371[class310.field4794] = arg1;
        class223.field3149[class310.field4794] = arg2;
        field2332[class310.field4794] = arg4;
        class121.field1702[class310.field4794] = arg0;
        class310.field4794++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 51)
    public static final void method1101(int arg0) {
        field2336++;
        if (!class72.field909) {
            return;
        }
        class263 var1 = class176.method1211(1, class225.field3194, class112.field1595);
        if (var1 != null && var1.field4033 != null) {
            class176 var2 = new class176();
            var2.field2552 = var1;
            var2.field2551 = var1.field4033;
            class283.method2027(arg0 ^ 0x37A6D, var2);
        }
        class72.field909 = false;
        class275.field4288 = -1;
        class239.method1712(0, var1);
        if (arg0 != 30509) {
            field2332 = (int[]) null;
        }
    }
}
