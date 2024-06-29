import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class62 implements Runnable {

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[Lij;")
    public volatile class258[] field1082 = new class258[2];

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
    public volatile boolean field1081 = false;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
    public volatile boolean field1073 = false;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[Lkh;")
    public static class221[] field1072 = new class221[4];

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1085 = "M";

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1086 = " is already on your ignore list.";

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lvh;")
    public static class108 field1077;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lvb;")
    public class131 field1087;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)V")
    public static final void method390(byte arg0, int arg1, int arg2) {
        class248.field4084 = class83.field1514 + class193.field3114 - arg2 - 1;
        if (arg0 == 16) {
            field1079++;
            class167.field2728 = arg1 - class124.field2184;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lvh;Lvh;BLvh;)V")
    public static final void method391(class108 arg0, class108 arg1, byte arg2, class108 arg3) {
        class110.field1985 = arg0;
        field1075++;
        class243.field3989 = arg3;
        if (arg2 >= 2) {
            class39.field582 = arg1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILvh;)I")
    public static final int method392(int arg0, class108 arg1) {
        if (arg0 < 54) {
            method392(-17, (class108) null);
        }
        field1078++;
        int var2 = 0;
        if (arg1.method727(class55.field963, (byte) -100)) {
            var2++;
        }
        if (arg1.method727(class85.field1538, (byte) -86)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
    public static final void method393(int arg0, int arg1) {
        class275.field4399--;
        field1074++;
        if (class275.field4399 == arg1) {
            return;
        }
        class235.method1556(class93.field1632, arg1 + 1, class93.field1632, arg1, class275.field4399 - arg1);
        class235.method1556(class93.field1636, arg1 + 1, class93.field1636, arg1, class275.field4399 - arg1);
        class235.method1559(class291.field4653, arg1 + 1, class291.field4653, arg1, class275.field4399 - arg1);
        class235.method1558(class101.field1788, arg1 + 1, class101.field1788, arg1, class275.field4399 - arg1);
        class235.method1561(class153.field2563, arg0 + arg1, class153.field2563, arg1, class275.field4399 - arg1);
        class235.method1559(class60.field1052, arg1 + 1, class60.field1052, arg1, class275.field4399 - arg1);
        class235.method1559(class145.field2477, arg1 + 1, class145.field2477, arg1, class275.field4399 - arg1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method394(byte arg0) {
        field1077 = null;
        field1086 = null;
        field1072 = null;
        if (arg0 != -59) {
            method395(-70, 38, (byte) -84);
        }
        field1085 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)Llh;")
    public static final class55 method395(int arg0, int arg1, byte arg2) {
        field1083++;
        if (arg2 != -66) {
            return null;
        }
        class55 var3 = (class55) class177.field2918.method779(48, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class55(arg0, arg1);
            class177.field2918.method780((byte) -78, var3.field1515, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
    public final void run() {
        field1080++;
        this.field1073 = true;
        try {
            while (!this.field1081) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class258 var2 = this.field1082[var1];
                    if (var2 != null) {
                        var2.method1715(0);
                    }
                }
                class245.method1636(false, 10L);
                class151.method1034(this.field1087, true, (Object) null);
            }
        } catch (Exception var9) {
            class254.method1684(125, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field1073 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method396(String arg0, int arg1, int arg2) {
        field1084++;
        if (arg2 > -127) {
            field1085 = null;
        }
        class55 var3 = method395(2, arg1, (byte) -66);
        var3.method340((byte) -110);
        var3.field960 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILbd;BIIII)V")
    public static final void method397(int arg0, class81 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1076++;
        class112.method783(arg0, arg6, arg1.field1458, arg3, arg5, -129, arg1.field1397, arg4);
        int var7 = -20 % ((arg2 - 38) / 51);
    }
}
