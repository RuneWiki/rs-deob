import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class176 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Z")
    public static boolean field2476 = false;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2478 = "";

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lhc;")
    public static class235 field2477;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)J")
    public static final long method1156(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1240; var4++) {
            class198 var5 = var3.field1226[var4];
            if ((var5.field2753 >> 29 & 0x3L) == 2L && var5.field2746 == arg1 && var5.field2748 == arg2) {
                return var5.field2753;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, String arg4) {
        field2474++;
        if (arg3 != 6336) {
            field2475 = 68;
        }
        class211 var5 = class168.method1099(0, arg2, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field3169 != null) {
            class27 var6 = new class27();
            var6.field351 = arg0;
            var6.field353 = arg4;
            var6.field338 = var5;
            var6.field341 = var5.field3169;
            class213.method1392(var6, 105);
        }
        boolean var7 = true;
        if (var5.field3062 > 0) {
            var7 = class60.method375(arg3 - 6405, var5);
        }
        if (!var7 || !client.method1040(var5).method1288(arg0 - 1, (byte) 115)) {
            return;
        }
        if (arg0 == 1) {
            class78.field1088++;
            class281.field4359.method1864(50, (byte) -69);
            class281.field4359.method1435(-90, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 2) {
            class293.field4617++;
            class281.field4359.method1864(19, (byte) -69);
            class281.field4359.method1435(-116, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 3) {
            class169.field2345++;
            class281.field4359.method1864(65, (byte) -69);
            class281.field4359.method1435(arg3 ^ 0xFFFFE759, arg1);
            class281.field4359.method1470(arg3 ^ 0x1776DF88, arg2);
        }
        if (arg0 == 4) {
            class281.field4359.method1864(187, (byte) -69);
            class281.field4359.method1435(-128, arg1);
            class281.field4359.method1470(393660232, arg2);
            class73.field1015++;
        }
        if (arg0 == 5) {
            class16.field161++;
            class281.field4359.method1864(84, (byte) -69);
            class281.field4359.method1435(arg3 ^ 0xFFFFE741, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 6) {
            class281.field4359.method1864(166, (byte) -69);
            class281.field4359.method1435(-107, arg1);
            class281.field4359.method1470(arg3 ^ 0x1776DF88, arg2);
            class277.field4288++;
        }
        if (arg0 == 7) {
            class63.field865++;
            class281.field4359.method1864(43, (byte) -69);
            class281.field4359.method1435(-124, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 8) {
            class281.field4359.method1864(55, (byte) -69);
            class281.field4359.method1435(arg3 ^ 0xFFFFE752, arg1);
            class212.field3183++;
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 9) {
            class281.field4359.method1864(229, (byte) -69);
            class41.field610++;
            class281.field4359.method1435(-98, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
        if (arg0 == 10) {
            class281.field4359.method1864(70, (byte) -69);
            class248.field3797++;
            class281.field4359.method1435(-112, arg1);
            class281.field4359.method1470(393660232, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
    public static final int method1158(byte arg0) {
        field2473++;
        if (arg0 != -43) {
            method1159(96);
        }
        return 15;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1159(int arg0) {
        if (arg0 != -29126) {
            field2475 = -57;
        }
        field2478 = null;
        field2477 = null;
    }
}
