import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/lang/String;")
    public static String field559 = "yellow:";

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ljava/lang/String;")
    public static String field560 = null;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field553;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)I")
    public static final int method292(byte arg0, int arg1) {
        field555++;
        class263 var2 = class251.method1610(arg0 + 67, arg1);
        int var3 = var2.field3817;
        int var4 = var2.field3819;
        int var5 = class36.field418[var3 - var4];
        int var6 = var2.field3818;
        return arg0 == -66 ? var5 & class164.field2358[var6] >> var4 : 46;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLhg;)V")
    public static final void method293(byte arg0, class206 arg1) {
        if (arg0 != 108) {
            return;
        }
        field557++;
        long var2 = 0L;
        if (arg1.field2934 == 0) {
            var2 = class255.method1634(arg1.field2918, arg1.field2925, arg1.field2924);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg1.field2934 == 1) {
            var2 = class157.method1043(arg1.field2918, arg1.field2925, arg1.field2924);
        }
        if (arg1.field2934 == 2) {
            var2 = class168.method1103(arg1.field2918, arg1.field2925, arg1.field2924);
        }
        int var6 = 0;
        if (arg1.field2934 == 3) {
            var2 = class268.method1719(arg1.field2918, arg1.field2925, arg1.field2924);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field2922 = var5;
        arg1.field2921 = var4;
        arg1.field2917 = var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method294(int arg0) {
        field560 = null;
        field559 = null;
        field553 = null;
        if (arg0 != 2) {
            method292((byte) -84, -59);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method295(boolean arg0) {
        field556++;
        class94.field1259.method592(71, arg0);
        class170.field2439++;
        class94.field1259.method1373(class285.method1903(32113), -13985);
        class94.field1259.method1387(class84.field1166, 4);
        class94.field1259.method1387(client.field4437, 4);
        class94.field1259.method1373(class54.field624, -13985);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method296(int arg0, int arg1, int arg2) {
        field552++;
        for (int var3 = 0; var3 < class198.field2822; var3++) {
            class150 var4 = class224.method1452(var3, 4);
            if (var4 != null) {
                int var5 = var4.field2186;
                if (var5 >= 0 && !class297.field4685.method771(var5, 97)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field2181 >= 0) {
                    int var10 = var4.field2181;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg2 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class297.field4693[class229.method1487(var12, 96, (byte) -84)];
                } else if (var5 >= 0) {
                    var6 = class297.field4693[class229.method1487(class297.field4685.method776((byte) 11, var5), 96, (byte) -84)];
                } else if (var4.field2178 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field2178;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 + arg2 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class297.field4693[class229.method1487(var9, 96, (byte) -84)];
                }
                class52.field594[var3 + 1] = var6;
            }
        }
        if (arg1 != 127) {
            method295(true);
        }
    }
}
