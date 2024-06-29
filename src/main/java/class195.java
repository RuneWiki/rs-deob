import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class195 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
    public static boolean field2698 = false;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lon;")
    public static class142 field2697 = new class142(0, -1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Ljm;")
    public static class212 field2699;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lkk;")
    public static class295 field2694;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[[[I")
    public static int[][][] field2692;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1408(int arg0) {
        class215.method1567(-93);
        class56.method426(arg0 ^ 0xFFFF8BA7);
        class219.method1584((byte) 22);
        class194.method1406(-102);
        field2700++;
        class143.method1111(arg0 + 7670);
        class330.method2286(256);
        class235.method1667((byte) -114);
        class29.method187(-19674);
        class65.method471(true);
        class210.method1545(725);
        class125.method920(-104);
        class142.method1108(-15681);
        class65.method472(arg0 + 7536);
        class24.method162(-14865);
        class177.method1308(32);
        class257.method1785(1);
        class181.method1327(false);
        class315.method2183(-114);
        class116.method849((byte) 96);
        if (class219.field3137 != 0) {
            for (int var1 = 0; var1 < class194.field2685.length; var1++) {
                class194.field2685[var1] = null;
            }
            class107.field1385 = 0;
        }
        class32.method200((byte) 61);
        class222.method1615(arg0 + 2534);
        class62.method454((byte) 113);
        class23.method156(255);
        class159.field2258.method2258((byte) 86);
        if (!class47.field623) {
            ((class138) class350.field5467).method1042(-45);
        }
        class94.field1212.method1120((byte) 115);
        class96.field1249.method1066(0);
        class340.field5313.method1066(0);
        class293.field4264.method1066(arg0 ^ arg0);
        class17.field213.method1066(arg0 + 7603);
        class5.field61.method1066(0);
        class305.field4459.method1066(arg0 + 7603);
        class262.field3790.method1066(0);
        class1.field7.method1066(0);
        class27.field317.method1066(0);
        class135.field1844.method1066(0);
        class52.field692.method1066(0);
        class224.field3232.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 78)
    public static void method1409(byte arg0) {
        field2694 = null;
        field2699 = null;
        if (arg0 < -65) {
            field2697 = null;
            field2692 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 94)
    public static final void method1410(boolean arg0, String arg1, int arg2) {
        field2695++;
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        int var5 = arg0 ? 32768 : 0;
        int var6 = 0;
        int var7 = (arg0 ? class99.field1295 : class245.field3585) + var5;
        for (int var8 = var5; var8 < var7; var8++) {
            class117 var9 = class28.method183(var8, true);
            if (var9.field1523 && var9.method864(17538).toLowerCase().indexOf(var4) != -1) {
                if (var6 >= 50) {
                    class299.field4376 = -1;
                    class225.field3242 = null;
                    return;
                }
                if (var3.length <= var6) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var6; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var6++] = (short) var8;
            }
        }
        class86.field1103 = 0;
        class299.field4376 = var6;
        String[] var12 = new String[class299.field4376];
        class225.field3242 = var3;
        for (int var13 = 0; var13 < class299.field4376; var13++) {
            var12[var13] = class28.method183(var3[var13], true).method864(17538);
        }
        class294.method2009(class225.field3242, 56, var12);
        if (arg2 != 18262) {
            method1411(20, -115);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 173)
    public static final int method1411(int arg0, int arg1) {
        int var2 = 0;
        field2691++;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= -59) {
            field2694 = (class295) null;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILfd;)Lcd;", line = 220)
    public static final class271 method1412(int arg0, class299 arg1) {
        field2696++;
        class271 var2 = new class271();
        var2.field3883 = arg1.method2083((byte) -67);
        if (arg0 <= 71) {
            method1412(-65, (class299) null);
        }
        var2.field3882 = class28.method183(var2.field3883, true);
        return var2;
    }
}
