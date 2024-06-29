import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class43 extends class53 {

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Z")
    public volatile boolean field721 = true;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "[I")
    public static int[] field723 = new int[128];

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lbb;")
    public static class90 field722 = new class90();

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lp;")
    public static class280 field725 = class18.method140((byte) -128, ")4a=");

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Z")
    public boolean field716;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Z")
    public boolean field719;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)[B")
    public abstract byte[] method324(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lp;B)V")
    public static final void method325(class280 arg0, byte arg1) {
        if (arg1 != -103) {
            return;
        }
        field724++;
        if (class129.field2238 >= 2) {
            if (arg0.method1887((byte) 32, class238.field4130)) {
                class277.method1836(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class188.method1312(-1117075764, 0, (class280) null, class30.method266(new class280[] { class102.field1693, class249.method1685((byte) -102, var4), class37.field665 }, (byte) -87));
            }
            if (arg0.method1887((byte) 32, class120.field2132)) {
                class277.method1836(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class188.method1312(-1117075764, 0, (class280) null, class30.method266(new class280[] { class277.field4824, class249.method1685((byte) -83, var7), class37.field665 }, (byte) -87));
                class164.method1155(true);
                class277.method1836(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class188.method1312(arg1 - 1117075661, 0, (class280) null, class30.method266(new class280[] { class200.field3510, class249.method1685((byte) -119, var9), class37.field665 }, (byte) -87));
            }
            if (arg0.method1887((byte) 32, class128.field2229)) {
                class188.method1312(-1117075764, 0, (class280) null, class30.method266(new class280[] { class152.field2622, class249.method1685((byte) 35, class205.method1396(0)) }, (byte) -87));
            }
            if (arg0.method1887((byte) 32, class134.field2375)) {
                class4.method56(8364);
            }
            if (arg0.method1887((byte) 32, class159.field2782)) {
                class168.field2941.method1731(105);
            }
            if (arg0.method1887((byte) 32, class92.field1492)) {
                class168.field2941.method1733(-2);
            }
            if (arg0.method1887((byte) 32, class29.field552)) {
                class118.field2117.method1355(18530);
                class44.field727.method1531(-78);
                class168.field2941.method1738(73);
            }
            if (arg0.method1887((byte) 32, class124.field2173)) {
                class264.field4661 = true;
            }
            if (arg0.method1887((byte) 32, class210.field3617)) {
                class90.method641((byte) 66, 25);
            }
            if (arg0.method1887((byte) 32, class35.field645)) {
                class226.field3894 = true;
            }
            if (arg0.method1887((byte) 32, class205.field3568)) {
                class226.field3894 = false;
            }
            if (arg0.method1887((byte) 32, class253.field4433)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class183.field3211[var10].field1604[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method1897(false, class158.field2764)) {
                class95.method670(arg0.method1870((byte) -122, 15).method1863(115));
                class47.method351(class118.field2117, -583);
                class194.field3424 = false;
            }
            if (arg0.method1897(false, class206.field3574) && class128.field2232 != 0) {
                class94.method668(arg0.method1870((byte) -122, 6).method1863(115), (byte) -123);
            }
            if (arg0.method1887((byte) 32, class34.field636) && class128.field2232 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1897(false, class175.field3031)) {
                class201.field3522 = arg0.method1870((byte) -122, 12).method1877(255).method1863(115);
                class188.method1312(arg1 ^ 0x42953955, 0, (class280) null, class30.method266(new class280[] { class51.field836, class249.method1685((byte) -88, class201.field3522) }, (byte) -87));
            }
            if (arg0.method1887((byte) 32, class280.field4911)) {
                class250.field4377 = true;
            }
            if (arg0.method1887((byte) 32, class38.field682)) {
                if (class73.field1206) {
                    class98.field1571.method1901(0);
                    class73.field1206 = false;
                } else {
                    class215.field3718.method1901(0);
                    class73.field1206 = true;
                }
            }
        }
        class60.field970++;
        class34.field627.method551(118, true);
        class34.field627.method227(-20435, arg0.method1889(-1) - 1);
        class34.field627.method195(arg0.method1870((byte) -122, 2), -66);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLtg;)Llk;")
    public static final class82 method326(int arg0, byte arg1, class180 arg2) {
        field717++;
        if (class122.method857(arg2, arg0, -19478)) {
            int var3 = -90 % ((arg1 - 43) / 57);
            return class73.method543(2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method327(int arg0, boolean arg1) {
        if (arg1) {
            if (class246.field4315 != -1) {
                class94.method664((byte) -56, class246.field4315);
            }
            for (class144 var2 = (class144) class261.field4614.method142(true); var2 != null; var2 = (class144) class261.field4614.method143((byte) -119)) {
                class16.method127((byte) 118, var2, true);
            }
            class246.field4315 = -1;
            class261.field4614 = new class19(8);
            class178.method1226((byte) 83);
            class246.field4315 = class19.field364;
            class44.method338(false, (byte) 124);
            class51.method379((byte) 24);
            class204.method1392((byte) -7, class246.field4315);
        }
        field714++;
        int var3 = -119 % ((arg0 - 48) / 54);
        class277.field4808 = -1;
        class153.method1085(-1, class122.field2153);
        class262.field4631 = new class142();
        class262.field4631.field4793 = 3000;
        class262.field4631.field4791 = 3000;
        class16.method124(-69, class220.field3778);
        class90.method641((byte) 66, 10);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BII)I")
    public static final int method328(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        if (arg3 != 255) {
            return -51;
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = class187.field3294[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        field718++;
        return var6;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)I")
    public abstract int method329(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        field723 = null;
        field725 = null;
        if (!arg0) {
            method330(true);
        }
        field722 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lua;Z)Lua;")
    public static final class113 method331(class113 arg0, boolean arg1) {
        field715++;
        class113 var2 = client.method1095(arg0);
        if (!arg1) {
            field722 = null;
        }
        if (var2 == null) {
            var2 = arg0.field1894;
        }
        return var2;
    }
}
