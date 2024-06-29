import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class126 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[Ljm;")
    public static class409[] field1934 = new class409[29];

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lbn;")
    public static class256 field1937 = new class256(32);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
    public static int[] field1938 = new int[3];

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lbn;")
    public static class256 field1939 = new class256(16);

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Lbd;")
    public static class37 field1940 = new class37();

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
    public static boolean field1941 = false;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public static final void method925(int arg0, int arg1, int arg2) {
        field1936++;
        if (arg0 < -77) {
            class211 var3 = class281.method1921(13, arg2, (byte) -104);
            var3.method1490((byte) 117);
            var3.field3379 = arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public abstract void method926(int arg0, int arg1);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
    public abstract int method927(int arg0, int arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method928(int arg0) {
        field1939 = null;
        field1934 = null;
        if (arg0 > 122) {
            field1937 = null;
            field1938 = null;
            field1940 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method929(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;IIIZJZLjava/lang/String;IZ)V")
    public static final void method930(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, long arg6, boolean arg7, String arg8, int arg9, boolean arg10) {
        field1933++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class186 var14 = new class186(128);
        var14.method1312(10, -52);
        var14.method1283(8, (arg7 ? 2 : 0) | (arg10 ? 1 : 0) | (arg5 ? 4 : 0));
        var14.method1318(0, arg6);
        var14.method1315(var12[0], (byte) 64);
        var14.method1301(arg1, arg3 ^ 0xFFFFEF0C);
        var14.method1315(var12[1], (byte) 46);
        var14.method1283(8, class173.field2882);
        var14.method1312(arg4, -128);
        var14.method1312(arg0, -78);
        var14.method1315(var12[2], (byte) 69);
        var14.method1283(8, arg2);
        var14.method1283(arg3 ^ 0xFFFFEF72, arg9);
        var14.method1315(var12[3], (byte) 87);
        var14.method1308((byte) 102, class336.field5223, class325.field5095);
        class186 var15 = new class186(350);
        var15.method1301(arg8, 119);
        if (arg3 != -4230) {
            return;
        }
        int var16 = 8 - class317.method2110(true, arg8) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1312((int) (Math.random() * 255.0D), -65);
        }
        var15.method1282(var12, (byte) -38);
        class11.field139.field3044 = 0;
        class11.field139.method1312(22, arg3 + 4146);
        class11.field139.method1283(8, var14.field3044 + var15.field3044 + 2);
        class11.field139.method1283(8, 564);
        class11.field139.method1269(false, 0, var14.field3066, var14.field3044);
        class11.field139.method1269(false, 0, var15.field3066, var15.field3044);
        class367.field5567 = 0;
        class31.field389 = 1;
        class402.field6004 = 0;
        class190.field3103 = -3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Lij;")
    public abstract class241 method931(byte arg0);
}
