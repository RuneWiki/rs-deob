import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class202 extends class326 {

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    private int field3215 = 4096;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    private int field3227 = 0;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field3214 = 0;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3219 = "Loading...";

    @OriginalMember(owner = "client!la", name = "R", descriptor = "[I")
    public static int[] field3223 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "F")
    public static float field3226;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Lug;")
    public static class253 field3216;

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 4)
    public class202() {
        super(1, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLvl;)V", line = 8)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field3224++;
        if (arg1) {
            method1499((class253) null, (byte) 65);
        }
        if (arg0 == 0) {
            this.field3227 = arg2.method39((byte) 94);
        } else if (arg0 == 1) {
            this.field3215 = arg2.method39((byte) 59);
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 48)
    public static void method1497(int arg0) {
        if (arg0 != 7) {
            field3228 = 107;
        }
        field3216 = null;
        field3223 = null;
        field3219 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I", line = 76)
    public final int[] method103(int arg0, int arg1) {
        if (arg0 >= -25) {
            return (int[]) null;
        }
        field3221++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3227 && this.field3215 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(B)V", line = 126)
    public static final void method1498(byte arg0) {
        if (arg0 >= 105) {
            class161.field2597.method1359(80);
            field3220++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lug;B)V", line = 137)
    public static final void method1499(class253 arg0, byte arg1) {
        class199.field3186 = class125.method909(class311.field4844, 0, arg0, -48);
        class249.field3922 = class298.method2074(arg0, 0, class291.field4501, 0);
        field3217++;
        class162.field2632 = class298.method2074(arg0, 0, class205.field3255, 0);
        class254.field4011 = class298.method2074(arg0, 0, class97.field1276, 0);
        class212.field3338 = class298.method2074(arg0, 0, class78.field1045, 0);
        class163.field2644 = class298.method2074(arg0, 0, class158.field2446, 0);
        class328.field5140 = class298.method2074(arg0, 0, class39.field547, 0);
        if (arg1 > -13) {
            field3218 = -124;
        }
        class147.field2320 = class48.method367(class158.field2452, arg0, 0, -10166);
        class50.field642 = class237.method1699(0, -121, class58.field838, arg0);
        class77.field1040 = class237.method1699(0, -4, class332.field5179, arg0);
        class204.field3232 = class156.method1129(0, -78, arg0, class56.field771);
        class333.field5190 = class156.method1129(0, -96, arg0, class128.field1883);
        class29.field430.method2247(class333.field5190, (int[]) null);
        class102.field1355.method2247(class333.field5190, (int[]) null);
        class270.field4197.method2247(class333.field5190, (int[]) null);
        if (class109.field1458) {
            class8.field159 = class275.method1931(class83.field1133, arg0, -25679, 0);
            for (int var2 = 0; var2 < class8.field159.length; var2++) {
                class8.field159[var2].method1490();
            }
        }
        class190 var3 = class302.method2088(arg0, (byte) -115, 0, class275.field4243);
        var3.method1399();
        if (class109.field1458) {
            class207.field3284 = new class239(var3);
        } else {
            class207.field3284 = var3;
        }
        class190[] var4 = class125.method909(class193.field3073, 0, arg0, -76);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1399();
        }
        if (class109.field1458) {
            class221.field3500 = new class169[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class221.field3500[var6] = new class239(var4[var6]);
            }
        } else {
            class221.field3500 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class199.field3186.length; var11++) {
            class199.field3186[var11].method1400(var7 + var10, var9 + var10, var8 + var10);
        }
        if (class109.field1458) {
            class27.field398 = new class169[class199.field3186.length];
            for (int var12 = 0; var12 < class199.field3186.length; var12++) {
                class27.field398[var12] = new class239(class199.field3186[var12]);
            }
        } else {
            class27.field398 = class199.field3186;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I", line = 239)
    public static final int method1500(byte arg0, int arg1) {
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        field3222++;
        if (arg0 >= -111) {
            field3226 = -0.022023693F;
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 257)
    public static final void method1501(int arg0, String arg1, int arg2, int arg3, int arg4) {
        class136 var5 = class294.method2048((byte) 125, arg3, arg0);
        field3225++;
        if (var5 == null) {
            return;
        }
        if (var5.field2112 != null) {
            class15 var6 = new class15();
            var6.field247 = arg1;
            var6.field248 = var5;
            var6.field243 = var5.field2112;
            var6.field251 = arg2;
            class172.method1282(var6, (byte) 73);
        }
        boolean var7 = true;
        if (var5.field2038 > 0) {
            var7 = class23.method225(false, var5);
        }
        if (!var7 || !client.method953(var5).method926((byte) 106, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class156.field2422++;
            class183.field2965.method1947((byte) 79, 53);
            class183.field2965.method34(arg3, 294335144);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 2) {
            class183.field2965.method1947((byte) 89, 77);
            class306.field4784++;
            class183.field2965.method34(arg3, 294335144);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 3) {
            class183.field2965.method1947((byte) -104, 3);
            class183.field2965.method34(arg3, arg4 ^ 0x118B32AF);
            class183.field2965.method65((byte) -9, arg0);
            class63.field925++;
        }
        if (arg2 == 4) {
            class322.field5078++;
            class183.field2965.method1947((byte) 89, 111);
            class183.field2965.method34(arg3, arg4 ^ 0x118B32AF);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 5) {
            class32.field483++;
            class183.field2965.method1947((byte) 53, 235);
            class183.field2965.method34(arg3, 294335144);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 6) {
            class159.field2470++;
            class183.field2965.method1947((byte) -57, 166);
            class183.field2965.method34(arg3, 294335144);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == arg4) {
            class83.field1141++;
            class183.field2965.method1947((byte) 45, 42);
            class183.field2965.method34(arg3, arg4 + 294335137);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 8) {
            class320.field5050++;
            class183.field2965.method1947((byte) 98, 134);
            class183.field2965.method34(arg3, arg4 + 294335137);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 9) {
            class183.field2965.method1947((byte) -73, 113);
            class69.field970++;
            class183.field2965.method34(arg3, 294335144);
            class183.field2965.method65((byte) -9, arg0);
        }
        if (arg2 == 10) {
            client.field1908++;
            class183.field2965.method1947((byte) 101, 52);
            class183.field2965.method34(arg3, arg4 + 294335137);
            class183.field2965.method65((byte) -9, arg0);
        }
    }
}
