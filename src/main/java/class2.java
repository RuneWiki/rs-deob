import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class2 {

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
    public static boolean field12 = false;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field11 = 0;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field14 = -1;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lnm;")
    public static class221 field6;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILge;ZIBII)Llj;", line = 6)
    public static final class289 method8(int arg0, class340 arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        field16++;
        if (arg4 < 0) {
            field14 = 73;
        }
        int var8 = (arg0 << 17) + (arg2 ? 65536 : 0) + arg5 + (arg6 << 19);
        long var9 = (long) arg3 * 3147483667L + ((long) var8 * 3849834839L);
        class289 var11 = (class289) class16.field206.method652(var9, false);
        if (var11 != null) {
            return var11;
        }
        class272.field4465 = false;
        class289 var12 = class268.method1895(arg1, arg3, -112, arg5, arg6, arg0, false, arg2, false);
        if (var12 != null && !class272.field4465) {
            class16.field206.method642(var12, var9, -112);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V", line = 34)
    public static final void method9(int arg0, byte arg1) {
        if (class138.field2175 == null) {
            class138.field2175 = new byte[4][104][104];
        }
        int var2 = 0;
        if (arg0 <= 90) {
            method9(-56, (byte) 47);
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class138.field2175[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
        field8++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 76)
    public static final void method10(int arg0, int arg1) {
        class39.field583.method645(arg1, (byte) -83);
        class23.field342.method645(arg1, (byte) -119);
        if (arg0 <= 75) {
            method12((byte) -116);
        }
        class268.field4422.method645(arg1, (byte) -108);
        field13++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 89)
    public static final void method11(int arg0) {
        field10++;
        class145.method1022((long) class58.field875);
        if (~class345.field5538 != arg0) {
            class171.method1183(class345.field5538, (byte) -51);
        }
        for (int var1 = 0; var1 < class60.field916; var1++) {
            if (class116.field1694[var1]) {
                class324.field5309[var1] = true;
            }
            class319.field5267[var1] = class116.field1694[var1];
            class116.field1694[var1] = false;
        }
        class56.field857 = class58.field875;
        class291.field4836 = -1;
        class25.field383 = -1;
        class342.field5505 = null;
        if (class245.field3886) {
            class315.field5198 = true;
        }
        if (class345.field5538 != -1) {
            class60.field916 = 0;
            class61.method448(-21403);
        }
        if (class245.field3886) {
            class335.method2379();
        } else {
            class317.method2290();
        }
        class215.field3322 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 139)
    public static void method12(byte arg0) {
        field6 = null;
        if (arg0 >= -110) {
            field7 = 21;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII)I", line = 169)
    public static final int method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        if (arg2 > -73) {
            method9(51, (byte) 41);
        }
        field5++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return 7 - arg3 - (arg4 - 1);
        } else {
            return arg6;
        }
    }
}
