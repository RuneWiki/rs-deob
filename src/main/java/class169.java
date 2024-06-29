import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class169 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Loh;")
    public static class263 field3108 = class253.method1681(-118, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static volatile int field3111 = -1;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Loh;")
    private static class263 field3110 = class253.method1681(-124, "Continue");

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Loh;")
    public static class263 field3107 = field3110;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILoh;)I")
    public static final int method1118(int arg0, class263 arg1) {
        field3109++;
        if (arg0 != -1) {
            method1118(108, (class263) null);
        }
        return arg1.method1740(-124) + 1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLoh;Z)V")
    public static final void method1119(boolean arg0, class263 arg1, boolean arg2) {
        field3106++;
        class263 var3 = arg1.method1768(false);
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class130.field2393 : class239.field4175) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class91 var11 = class173.method1139((byte) -90, var8);
            if (var11.field1798 && var11.method638((byte) -104).method1768(false).method1744(var3, (byte) -101) != -1) {
                if (var5 >= 50) {
                    class245.field4318 = null;
                    class114.field2125 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class245.field4318 = var4;
        if (!arg2) {
            method1121(-108);
        }
        class183.field3314 = 0;
        class114.field2125 = var5;
        class263[] var9 = new class263[class114.field2125];
        for (int var10 = 0; var10 < class114.field2125; var10++) {
            var9[var10] = class173.method1139((byte) -90, var4[var10]).method638((byte) -44);
        }
        class162.method1066(-48, class245.field4318, var9);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        if (class127.field2361 != null) {
            class267.method1810((byte) -123, class127.field2361);
            class127.field2361 = null;
        }
        field3104++;
        if (arg0 != -1) {
            field3111 = 73;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field3107 = null;
        if (arg0 == 0) {
            field3110 = null;
            field3108 = null;
        }
    }
}
