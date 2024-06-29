import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class283 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public static int[] field4472 = new int[14];

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4478 = " has logged in.";

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Z")
    public static boolean field4479 = false;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4482 = "green:";

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
    public byte field4477;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
    public byte field4480;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "B")
    public byte field4484;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "B")
    public byte field4493;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "S")
    public short field4491;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
    public boolean field4473;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
    public boolean field4474;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public boolean field4475;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
    public boolean field4481;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
    public boolean field4485;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 5)
    public static final int method1927(boolean arg0, String arg1) {
        field4494++;
        if (!arg0) {
            field4478 = (String) null;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I", line = 16)
    public static final int method1928(byte arg0, int arg1) {
        field4486++;
        int var2 = 4 % ((-arg0 - 52) / 62);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z", line = 26)
    public static final boolean method1929(int arg0) {
        field4487++;
        class13 var1 = class296.field4723;
        synchronized (class296.field4723) {
            if (class253.field4075 == class101.field1635) {
                return false;
            }
            if (arg0 != -101) {
                method1932(36);
            }
            class81.field1328 = class297.field4730[class253.field4075];
            class141.field2583 = class148.field2662[class253.field4075];
            class253.field4075 = class253.field4075 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIZII)V", line = 47)
    public static final void method1930(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class304.field4812 = arg0;
        class215.field3613 = arg3;
        class304.field4821 = arg5;
        int var7 = 80 % ((arg2 - 34) / 32);
        field4483++;
        class81.field1325 = arg1;
        class78.field1261 = arg6;
        if (arg4 && class304.field4821 >= 100) {
            class32.field454 = class215.field3613 * 128 + 64;
            class269.field4309 = class81.field1325 * 128 + 64;
            class139.field2563 = class223.method1627((byte) -124, class32.field454, class269.field4309, class205.field3497) - class78.field1261;
        }
        class191.field3194 = 2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILwe;BII)Ljava/awt/Frame;", line = 79)
    public static final Frame method1931(int arg0, int arg1, class59 arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -50) {
            field4489 = 24;
        }
        field4476++;
        if (!arg2.method533(arg3 ^ 0xFFFF97AE)) {
            return null;
        }
        if (arg0 == 0) {
            class168[] var6 = class272.method1859((byte) -97, arg2);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2933 == arg4 && var6[var8].field2934 == arg5 && (arg1 == 0 || var6[var8].field2927 == arg1) && (!var7 || arg0 < var6[var8].field2926)) {
                    arg0 = var6[var8].field2926;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class45 var9 = arg2.method552(arg4, arg0, arg5, arg1, false);
        while (var9.field709 == 0) {
            class142.method1149(10L, (byte) 124);
        }
        Frame var10 = (Frame) var9.field712;
        if (var10 == null) {
            return null;
        } else if (var9.field709 == 2) {
            class58.method528(arg2, arg3 ^ 0xFFFFC468, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 170)
    public static void method1932(int arg0) {
        field4482 = null;
        field4478 = null;
        field4472 = null;
        if (arg0 != 14) {
            method1930(-71, -123, (byte) 92, -34, false, -29, -60);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 183)
    public static final void method1933(int arg0) {
        class177.field3014 = null;
        class238.field3902 = null;
        class99.field1605 = null;
        class143.field2614 = null;
        class8.field110 = null;
        class241.field3926 = null;
        class106.field1761 = null;
        class288.field4593 = null;
        class4.field63 = null;
        class259.field4202 = null;
        class279.field4431 = null;
        class36.field534 = null;
        class131.field2252 = null;
        class328.field5222 = null;
        if (arg0 != 2) {
            return;
        }
        field4488++;
        class44.field696 = null;
        class81.field1321 = null;
        class72.field1200 = null;
        class12.field187 = null;
        class269.field4305 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lig;", line = 219)
    public static final class195 method1934(int arg0, int arg1) {
        class195 var2 = (class195) class339.field5418.method467(true, (long) arg0);
        field4492++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field444.method441(false, arg1, arg0);
        class195 var4 = new class195();
        if (var3 != null) {
            var4.method1462((byte) -113, new class336(var3));
        }
        var4.method1466(true);
        class339.field5418.method465(var4, (long) arg0, (byte) 37);
        return var4;
    }
}
