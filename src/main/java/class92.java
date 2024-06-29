import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class92 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1348 = "Loading world list data";

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    public static int[] field1349 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1352 = "Loading interfaces - ";

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lnh;")
    public static class305 field1350;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method594(int arg0, String arg1) {
        field1355++;
        if (arg0 != -15250) {
            field1353 = 23;
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (27 - (48 - var6));
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Luj;")
    public static final class280 method595(int arg0, int arg1) {
        field1347++;
        class280 var2 = (class280) class88.field1263.method1486((long) arg0, -19212);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class159.field2205.method2050(105, 0, arg0);
        } else {
            var3 = class150.field2079.method2050(83, 0, arg0 & 0x7FFF);
        }
        class280 var4 = new class280();
        if (var3 != null) {
            var4.method1813(new class215(var3), false);
        }
        if (arg0 >= 32768) {
            var4.method1821(125);
        }
        class88.field1263.method1489((long) arg0, 119, var4);
        if (arg1 < 83) {
            method596((byte) 120, (class305) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLnh;)V")
    public static final void method596(byte arg0, class305 arg1) {
        if (arg0 >= -13) {
            method599(112, 65, -15);
        }
        field1351++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1348 = null;
        if (arg0 > -48) {
            method594(33, (String) null);
        }
        field1350 = null;
        field1352 = null;
        field1349 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 26981) {
            field1353 = 55;
        }
        for (int var6 = arg0; var6 <= arg4; var6++) {
            class129.method822(class247.field3876[var6], arg2, -2426, arg1, arg3);
        }
        field1346++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Ll;")
    public static final class75 method599(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class75 var4 = var3.field1329;
            var3.field1329 = null;
            return var4;
        }
    }
}
