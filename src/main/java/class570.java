import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class570 extends class513 {

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
    public int field8082;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field8079 = new String[200];

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
    public static void method3406(byte arg0) {
        field8079 = null;
        if (arg0 != -25) {
            method3411(-120, -4, -103, true, 109, null, -44);
        }
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(B)V")
    public static final void method3407(byte arg0) {
        if (class294.field3836 != null) {
            class294.field3836.method3253(-6102);
            class294.field3836 = null;
            class539.field7547 = null;
        }
        field8081++;
        if (arg0 != -72) {
            method3411(-62, -111, -85, true, -3, null, -61);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method3408(String arg0, boolean arg1, byte arg2) {
        String var3 = arg0.toLowerCase();
        field8077++;
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 >= -102) {
            return;
        }
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class225.field3151.field8947 : class225.field3151.field8956) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class391 var11 = class225.field3151.method3658((byte) -45, var8);
            if (var11.field5450 && var11.method2382(100).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class178.field2466 = null;
                    class165.field2262 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class178.field2466 = var4;
        class744.field10375 = 0;
        class165.field2262 = var5;
        String[] var9 = new String[class165.field2262];
        for (int var10 = 0; var10 < class165.field2262; var10++) {
            var9[var10] = class225.field3151.method3658((byte) -45, var4[var10]).method2382(100);
        }
        class424.method2588(var9, false, class178.field2466);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)I")
    public static final int method3409(int arg0) {
        field8075++;
        if (arg0 > -89) {
            field8079 = null;
        }
        return class589.field8461 == 1 ? class577.field8260 : class45.field658;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3410(int arg0, int arg1, byte arg2) {
        if (arg2 != 123) {
            method3411(119, -83, -81, true, -72, null, 24);
        }
        field8078++;
        return ((arg0 & 0x2000) != 0 | class721.method4051(arg0, (byte) -90, arg1) | class356.method2016(arg0, -116, arg1)) & class90.method543(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIZILwu;I)V")
    public static final void method3411(int arg0, int arg1, int arg2, boolean arg3, int arg4, class557 arg5, int arg6) {
        class470.field6423 = arg1;
        field8076++;
        class703.field9783 = arg2;
        class539.field7539 = null;
        class298.field3896 = arg3;
        class308.field3973 = arg0;
        class736.field10292 = arg4;
        class108.field1548 = arg6;
        class355.field4565 = arg5;
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(II)V")
    public class570(int arg0, int arg1) {
        this.field8082 = arg0;
        this.field8080 = arg1;
    }
}
