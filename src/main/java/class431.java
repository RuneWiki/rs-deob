import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class431 extends class268 {

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Z")
    public static boolean field5437 = false;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Lpw;")
    public static class661 field5441 = new class661("", 10);

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lpfa;")
    public static class275 field5439;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBII)V")
    public static final void method2368(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        field5443++;
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        if (class385.field4946 == 2) {
            class613.field8340 = var5;
            class177.field2068 = var4;
            client.field3568 = var6;
        }
        class689.field9561 = var4;
        class23.field266 = var6;
        class305.method1819((byte) -127);
        class531.field6707 = true;
        int var7 = -76 / ((31 - arg1) / 55);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method2369(boolean arg0) {
        field5441 = null;
        if (arg0) {
            field5439 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JJ)J")
    public static long method2370(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Ljd;")
    public final class216 method20(byte arg0) {
        int var2 = 54 % ((arg0 + 27) / 42);
        field5440++;
        return class300.field3807;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2371(int arg0, int arg1, String arg2) {
        if (arg0 == 0) {
            class309.field3898 = class650.method3629(class594.field7964, 14200, class292.field3706, 0, class472.field5828, class611.field8310.field8721 * 2);
            if (arg2 != null) {
                class309.field3898.method315(0);
                class20 var3 = class692.method3823(client.field3562, -31445, 0, class329.field4095);
                class201 var4 = class309.field3898.method414(var3, class495.method2699(class136.field1656, client.field3562, 0), true);
                class215.method1251(81);
                class340.method1951(arg2, var3, -101, var4, class309.field3898, true);
            }
        } else {
            class650 var5 = null;
            if (arg2 != null) {
                var5 = class650.method3629(class594.field7964, 14200, class292.field3706, 0, class472.field5828, 0);
                var5.method315(0);
                class20 var6 = class692.method3823(client.field3562, -31445, 0, class329.field4095);
                class201 var7 = var5.method414(var6, class495.method2699(class136.field1656, client.field3562, 0), true);
                class215.method1251(81);
                class340.method1951(arg2, var6, -125, var7, var5, true);
            }
            try {
                class309.field3898 = class650.method3629(class594.field7964, 14200, class292.field3706, arg0, class472.field5828, class611.field8310.field8721 * 2);
                if (arg2 != null) {
                    var5.method315(0);
                    class20 var8 = class692.method3823(client.field3562, -31445, 0, class329.field4095);
                    class201 var9 = var5.method414(var8, class495.method2699(class136.field1656, client.field3562, 0), true);
                    class215.method1251(86);
                    class340.method1951(arg2, var8, -96, var9, var5, true);
                }
                if (class309.field3898.method432()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class37 var11;
                    if (var10) {
                        var11 = class309.field3898.method468(146800640);
                    } else {
                        var11 = class309.field3898.method468(104857600);
                    }
                    class309.field3898.method489(var11);
                }
            } catch (Throwable var14) {
                class309.field3898 = class650.method3629(class594.field7964, 14200, class292.field3706, 0, class472.field5828, 0);
                arg0 = 0;
            }
            if (var5 != null) {
                try {
                    var5.method3623((byte) -54);
                } catch (Throwable var12) {
                }
            }
        }
        field5442++;
        class628.field8526 = arg0;
        if (arg1 < 62) {
            method2368(-68, (byte) -32, 58, -102);
        }
        class253.method1523(2);
        if (!class309.field3898.method477()) {
            class201.field2346 = 1;
        }
        class309.field3898.method413(class201.field2346);
        class309.field3898.method494(0);
        class309.field3898.method442(32);
        class142.field1735 = class309.field3898.method431();
        class33.field519 = class309.field3898.method431();
        class417.method2322((byte) -87);
        class309.field3898.method482(!class611.field8310.field8722);
        if (class309.field3898.method471()) {
            class27.method164(class611.field8310.field8703, 0);
        }
        class427.method2352(class85.field1090 >> 3, (byte) 100, class309.field3898, class656.field8932 >> 3);
        class532.method2871(true);
        class167.field1964 = null;
        class528.field6662 = false;
        class36.field537 = true;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILtl;Lpd;III)V")
    public class431(int arg0, class580 arg1, class241 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5438 = arg5;
    }
}
