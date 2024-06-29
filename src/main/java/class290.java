import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class290 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Ltm;")
    public static class112 field3985 = new class112("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "S")
    public static short field3987 = 32767;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lsm;")
    public static class249 field3988 = new class249();

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field3989 = -1;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1784(int arg0, int arg1) {
        class283.field3887 = arg0;
        field3986++;
        class175.field2588 = 3;
        if (arg1 == 32343) {
            class3.field29 = 100;
            class446.field6163 = -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 20)
    public static void method1785(int arg0) {
        field3988 = null;
        field3985 = null;
        if (arg0 != 32767) {
            field3985 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Z", line = 32)
    public static final boolean method1786(byte arg0, int arg1) {
        field3982++;
        if (arg0 <= 9) {
            field3988 = null;
        }
        if (arg1 == 4 || arg1 == 51 || arg1 == 30 || arg1 == 58 || arg1 == 47) {
            return true;
        } else {
            return arg1 == 19 || arg1 == 1002;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILlk;)V", line = 51)
    public static final void method1787(int arg0, class425 arg1) {
        field3984++;
        if (arg0 != -1) {
            return;
        }
        int var2 = arg1.method2474((byte) -79);
        class96.field1382 = new class486[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class96.field1382[var3] = new class486();
            class96.field1382[var3].field6855 = arg1.method2474((byte) -101);
            class96.field1382[var3].field6854 = arg1.method2465(false);
        }
        class189.field2716 = arg1.method2474((byte) -93);
        class361.field5041 = arg1.method2474((byte) 79);
        class399.field5584 = arg1.method2474((byte) 70);
        class106.field1527 = new class334[class361.field5041 + 1 - class189.field2716];
        for (int var4 = 0; var4 < class399.field5584; var4++) {
            int var5 = arg1.method2474((byte) 112);
            class334 var6 = class106.field1527[var5] = new class334();
            var6.field758 = arg1.method2503(true);
            var6.field767 = arg1.method2502((byte) -86);
            var6.field4576 = class189.field2716 + var5;
            var6.field4575 = arg1.method2465(false);
            var6.field4579 = arg1.method2465(false);
        }
        class202.field2899 = arg1.method2502((byte) -86);
        class449.field6183 = true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZLkm;IILoj;I)V", line = 98)
    public static final void method1788(int arg0, boolean arg1, class487 arg2, int arg3, int arg4, class485 arg5, int arg6) {
        if (arg1) {
            class320.field4372.method2301((class67.field987 - class320.field4372.method382()) / 2, (class371.field5248 - class320.field4372.method389()) / 2);
            class78.field1181.method2301((class67.field987 - class78.field1181.method382()) / 2, 18);
        }
        field3983++;
        arg5.method2849((byte) -42, class67.field987 / 2, arg0, -1, (class305.field4173 == class172.field2553 ? class3.field34 : class267.field3715).method695(-125, class487.field6867), class371.field5248 / arg4 - 26);
        int var7 = class371.field5248 / 2 - 18;
        arg2.method1076(class67.field987 / 2 - 152, var7, 304, 34, arg6, 0);
        arg2.method1076(class67.field987 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg2.method1107(class67.field987 / 2 - 150, var7 + 2, class165.field2432 * 3, 30, arg3, 0);
        arg2.method1107(class165.field2432 * 3 + (class67.field987 / 2 - 150), var7 + 2, 300 - (class165.field2432 * 3), 30, 0, 0);
        arg5.method2849((byte) -42, class67.field987 / 2, arg0, -1, class184.field2677, class371.field5248 / 2 + 4);
    }
}
