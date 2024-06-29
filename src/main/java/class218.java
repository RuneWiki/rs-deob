import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class218 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[[[B")
    public static byte[][][] field3344;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3344 = null;
        if (arg0 != 20032) {
            method1466(77, -12, -112, -84, 26, 18, (class264) null, 59, -86L);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)I")
    public static final int method1463(int arg0, byte arg1) {
        if (arg1 <= 86) {
            field3348 = -14;
        }
        field3342++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjk;)V")
    public static final void method1464(int arg0, class297 arg1) {
        field3343++;
        if (arg0 != -1) {
            method1466(104, -43, 54, -118, -51, 77, (class264) null, 120, 70L);
        }
        class297 var2 = client.method319(false, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class126.field1854;
            var3 = class85.field1311;
        } else {
            var3 = var2.field4531;
            var4 = var2.field4627;
        }
        class160.method1081(var4, var3, arg1, false, 1);
        class103.method752((byte) 124, var3, var4, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpk;ZLpk;)V")
    public static final void method1465(class237 arg0, boolean arg1, class237 arg2) {
        field3349++;
        class109.field1610 = arg2;
        class29.field540 = arg0;
        if (arg1) {
            method1463(-52, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIILbg;IJ)Z")
    public static final boolean method1466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class29.method204(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V")
    public static final void method1467(boolean arg0, int arg1) {
        field3341++;
        class63.field1059 = null;
        field3344 = null;
        class226.field3528 = null;
        class164.field2403 = null;
        class244.field3773 = null;
        if (arg0 && class90.field1362 != null) {
            class259.field3975 = class90.field1362.field4331;
        } else {
            class259.field3975 = -1;
        }
        class90.field1362 = null;
        class243.field3765 = null;
        class77.field1218 = null;
        class122.field1815 = null;
        class208.field3119 = null;
        class148.field2150 = null;
        class130.field1903 = 0;
        class212.field3211.method1891(39);
        class78.field1225 = null;
        class154.field2251 = null;
        class139.field2016 = null;
        class143.field2073 = null;
        class66.field1087 = -1;
        class180.field2620 = null;
        class34.field605 = null;
        if (arg1 > -6) {
            field3344 = null;
        }
        class270.field4219 = null;
        class58.field960 = null;
        class151.field2215 = null;
        class170.field2499 = null;
        class244.field3784 = -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
    public static final void method1468(long arg0, int arg1) {
        class59.field964.field887 = 0;
        class59.field964.method437(true, 21);
        field3345++;
        class59.field964.method440(arg0, -89);
        class92.field1388 = 0;
        class264.field4134 = 0;
        if (arg1 != 128) {
            field3344 = null;
        }
        class164.field2398 = -3;
        class256.field3944 = 1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method1469(byte arg0) {
        String var1;
        if (class277.field4275 == 1 && class51.field826 < 2) {
            var1 = class123.field1819 + class246.field3837 + class106.field1570 + " ->";
        } else if (class76.field1205 && class51.field826 < 2) {
            var1 = class182.field2647 + class246.field3837 + class174.field2545 + " ->";
        } else if (class172.field2521 && class293.field4451[81] && class51.field826 > 2) {
            var1 = class170.method1143(-24448, class51.field826 - 2);
        } else {
            var1 = class170.method1143(-24448, class51.field826 - 1);
        }
        int var2 = 2 % ((arg0 - 3) / 41);
        field3346++;
        if (class51.field826 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class51.field826 - 2) + class150.field2170;
        }
        return var1;
    }
}
