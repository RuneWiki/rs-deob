import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class217 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[B")
    public static byte[] field3342 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Z")
    public static boolean field3344 = false;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Lwn;")
    public static class488 field3343;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1331(int arg0, byte arg1, int arg2) {
        field3345++;
        if (arg1 == 13) {
            return class476.method2866(arg2, (byte) -94, arg0) | (arg2 & 0x40000) != 0 || class78.method567(arg2, (byte) -106, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZZLht;I)V")
    public static final void method1332(boolean arg0, boolean arg1, class394 arg2, int arg3) {
        field3346++;
        int var4 = arg2.field5750;
        int var5 = (int) arg2.field2798;
        arg2.method1121(false);
        if (arg1) {
            class42.method298((byte) -23, var4);
        }
        class503.method3013(true, var4);
        class427 var6 = class413.method2435(160291920, var5);
        if (var6 != null) {
            class288.method1754(var6, arg3 + 10879);
        }
        class498.method2991((byte) -22);
        if (!arg0 && class375.field5475 != -1) {
            class141.method933(arg3 ^ 0xFFFFD57E, 1, class375.field5475);
        }
        class391 var7 = new class391(class245.field3741);
        if (arg3 != -10879) {
            method1333((byte) -86);
        }
        for (class394 var8 = (class394) var7.method2329(arg3 + 30529); var8 != null; var8 = (class394) var7.method2330((byte) -89)) {
            if (!var8.method1124(arg3 ^ 0x2A05)) {
                var8 = (class394) var7.method2329(19650);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field5753 == 3) {
                int var9 = (int) var8.field2798;
                if ((var9 >>> 16) == var4) {
                    method1332(arg0, true, var8, -10879);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field3343 = null;
        field3342 = null;
        if (arg0 != 0) {
            field3342 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLqq;)V")
    public static final void method1334(byte arg0, class318 arg1) {
        if (arg0 <= 84) {
            method1331(-72, (byte) 87, 111);
        }
        field3341++;
        if (class504.field7624) {
            class418.method2451(arg1, (byte) 107);
        } else {
            class386.method2302(arg1, -3);
        }
    }
}
