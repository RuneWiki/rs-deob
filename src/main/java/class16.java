import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lqb;")
    public static class176 field250 = new class176(260);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
    public static volatile boolean field255 = true;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Z")
    public static boolean field259 = false;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lta;")
    public static final class208 method113(int arg0, byte arg1) {
        class208 var2 = (class208) class140.field2715.method87(-107, (long) arg0);
        if (arg1 < 64) {
            method116(-8);
        }
        field251++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field4015.method1547(class204.method1345(0, arg0), 0, class137.method958(arg0, (byte) 95));
        class208 var4 = new class208();
        if (var3 != null) {
            var4.method1380((byte) -87, new class28(var3));
        }
        var4.method1379((byte) 80);
        class140.field2715.method92((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method114(int arg0) {
        if (arg0 > -12) {
            method115(true);
        }
        field250 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
    public static final int method115(boolean arg0) {
        field253++;
        if (arg0) {
            method114(72);
        }
        int var1 = class145.method1008(class125.field2246, class6.field71, class118.field2112, (byte) 117);
        return var1 - class166.field3169 >= 800 || (class193.field3602[class125.field2246][class6.field71 >> 7][class118.field2112 >> 7] & 0x4) == 0 ? 3 : class125.field2246;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method116(int arg0) {
        if (arg0 == -1385015865) {
            field257++;
            class120.field2145.method93(0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method117(int arg0) {
        if (arg0 != 0) {
            method115(true);
        }
        class223.field4128.method1183((byte) -46);
        field254++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)V")
    public static final void method118(byte arg0, int arg1, int arg2) {
        field256++;
        if (arg0 < 85) {
            field250 = null;
        }
        class12.field163++;
        class49.field970.method1503(76, 2976);
        class49.field970.method199(arg2, (byte) 66);
        class49.field970.method197(arg1, (byte) 51);
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V")
    public final void run() {
        field252++;
        try {
            while (true) {
                class203 var1 = class160.field3015;
                class83 var2;
                synchronized (class160.field3015) {
                    var2 = (class83) class160.field3015.method1338(-122);
                }
                if (var2 == null) {
                    class238.method1548((byte) -68, 100L);
                    Object var6 = class52.field1046;
                    synchronized (class52.field1046) {
                        if (class54.field1061 <= 1) {
                            class54.field1061 = 0;
                            class52.field1046.notifyAll();
                            return;
                        }
                        class54.field1061--;
                    }
                } else {
                    if (var2.field1473 == 0) {
                        var2.field1465.method264((int) var2.field1066, var2.field1476, var2.field1476.length, -9168);
                        class203 var4 = class160.field3015;
                        synchronized (class160.field3015) {
                            var2.method433(0);
                        }
                    } else if (var2.field1473 == 1) {
                        var2.field1476 = var2.field1465.method263((byte) -32, (int) var2.field1066);
                        class203 var3 = class160.field3015;
                        synchronized (class160.field3015) {
                            class199.field3713.method1340(38, var2);
                        }
                    }
                    Object var5 = class52.field1046;
                    synchronized (class52.field1046) {
                        if (class54.field1061 <= 1) {
                            class54.field1061 = 0;
                            class52.field1046.notifyAll();
                            return;
                        }
                        class54.field1061 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class60.method455(95, var17, null);
        }
    }
}
