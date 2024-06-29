import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class13 extends class266 {

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "[B")
    public byte[] field248;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Lma;")
    public static class5 field250 = class12.method119("Clientscript error )2 check log for details", (byte) 70);

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Lma;")
    public static class5 field251 = class12.method119("(U0a )2 in: ", (byte) 74);

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lma;")
    public static class5 field245 = class12.method119("(U0a )2 non)2existant gosub script)2num: ", (byte) 117);

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Lma;")
    public static class5 field253 = class12.method119("Benutzeroberfl-=che geladen)3", (byte) 98);

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lje;")
    public static class158 field244;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[Lma;)[Lma;", line = 7)
    public static final class5[] method127(byte arg0, class5[] arg1) {
        field247++;
        class5[] var2 = new class5[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class288.method1940((byte) 122, new class5[] { class175.method1148(var3, false), class33.field512 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class288.method1940((byte) 114, new class5[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0 >= -72) {
            return (class5[]) null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V", line = 38)
    public class13(byte[] arg0) {
        this.field248 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BI)[B", line = 55)
    public static final byte[] method128(byte[] arg0, int arg1) {
        field246++;
        int var2 = arg0.length;
        if (arg1 == -22046) {
            byte[] var3 = new byte[var2];
            class42.method296(arg0, 0, var3, 0, var2);
            return var3;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILec;II)V", line = 87)
    public static final void method129(int arg0, class91 arg1, int arg2, int arg3) {
        field249++;
        if (arg1.field238 == arg0 && arg0 != -1) {
            class33 var4 = class171.method1136(arg0, -6722);
            int var5 = var4.field499;
            if (var5 == 1) {
                arg1.field232 = 0;
                arg1.field221 = 0;
                arg1.field214 = arg2;
                arg1.field216 = 0;
                class272.method1859(arg1.field178, arg1.field211, 64, arg1.field221, var4, class151.field2183 == arg1);
            }
            if (var5 == 2) {
                arg1.field216 = 0;
            }
        } else if (arg0 == -1 || arg1.field238 == -1 || class171.method1136(arg0, -6722).field524 >= class171.method1136(arg1.field238, -6722).field524) {
            arg1.field172 = arg1.field208;
            arg1.field232 = 0;
            arg1.field221 = 0;
            arg1.field214 = arg2;
            arg1.field216 = 0;
            arg1.field238 = arg0;
            if (arg1.field238 != -1) {
                class272.method1859(arg1.field178, arg1.field211, 64, arg1.field221, class171.method1136(arg1.field238, -6722), class151.field2183 == arg1);
            }
        }
        if (arg3 <= 56) {
            field251 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLii;)V", line = 136)
    public static final void method130(byte arg0, class221 arg1) {
        field254++;
        if ((arg1.field3617.length - arg1.field3610) < 1) {
            return;
        }
        int var2 = arg1.method1509(true);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field3617.length - arg1.field3610) < var3) {
            return;
        }
        if (arg0 != -70) {
            method129(48, (class91) null, -18, 100);
        }
        class66.field1037 = arg1.method1509(true);
        if (class66.field1037 < 1) {
            class66.field1037 = 1;
        } else if (class66.field1037 > 4) {
            class66.field1037 = 4;
        }
        class79.method542((byte) 111, arg1.method1509(true) == 1);
        class264.field4522 = arg1.method1509(true) == 1;
        class112.field1663 = arg1.method1509(true) == 1;
        class181.field2765 = arg1.method1509(true) == 1;
        class234.field3870 = arg1.method1509(true) == 1;
        class117.field1781 = arg1.method1509(true) == 1;
        class190.field2973 = arg1.method1509(true) == 1;
        class77.field1208 = arg1.method1509(true) == 1;
        class236.field3895 = arg1.method1509(true);
        if (class236.field3895 > 2) {
            class236.field3895 = 2;
        }
        if (var2 >= 2) {
            class8.field114 = arg1.method1509(true) == 1;
        } else {
            class8.field114 = arg1.method1509(true) == 1;
            arg1.method1509(true);
        }
        class265.field4531 = arg1.method1509(true) == 1;
        class275.field4685 = arg1.method1509(true) == 1;
        class86.field1300 = arg1.method1509(true);
        if (class86.field1300 > 2) {
            class86.field1300 = 2;
        }
        class80.field1239 = arg1.method1509(true) == 1;
        class264.field4492 = arg1.method1509(true);
        if (class264.field4492 > 127) {
            class264.field4492 = 127;
        }
        class247.field4092 = arg1.method1509(true);
        class130.field1955 = arg1.method1509(true);
        if (class130.field1955 > 127) {
            class130.field1955 = 127;
        }
        if (var2 >= 1) {
            class73.field1151 = arg1.method1524((byte) 50);
            class21.field346 = arg1.method1524((byte) 73);
        }
        if (var2 >= 3) {
            class116.field1731 = arg1.method1509(true) == 1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 228)
    public static void method131(int arg0) {
        if (arg0 != 0) {
            field251 = (class5) null;
        }
        field244 = null;
        field250 = null;
        field253 = null;
        field245 = null;
        field251 = null;
    }
}
