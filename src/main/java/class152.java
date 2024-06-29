import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class152 {

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lkf;")
    public static class193 field2438 = new class193();

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2442 = "K";

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[I")
    public static int[] field2440 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2439 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!w", name = "o", descriptor = "S")
    public static short field2441 = 256;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field2430;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[I")
    public int[] field2436;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lbi;")
    public static final class97 method1028(byte arg0, int arg1) {
        class97 var2 = (class97) class254.field4199.method1879(8887, (long) arg1);
        field2434++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class232.field3624.method1156(1, arg1, (byte) -16);
        class97 var4 = new class97();
        if (arg0 > -100) {
            return null;
        }
        if (var3 != null) {
            var4.method691(new class274(var3), (byte) 35, arg1);
        }
        class254.field4199.method1883((long) arg1, -92, var4);
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1029(boolean arg0) {
        if (!arg0) {
            method1030(false);
        }
        field2428++;
        if (class140.field2280 == 0) {
            return;
        }
        try {
            if (++class27.field482 > 1500) {
                if (class18.field322 != null) {
                    class18.field322.method416(64);
                    class18.field322 = null;
                }
                if (class63.field1027 >= 1) {
                    class191.field3120 = -5;
                    class140.field2280 = 0;
                    return;
                }
                class27.field482 = 0;
                class63.field1027++;
                if (class174.field2910 == class140.field2281) {
                    class140.field2281 = class239.field3743;
                } else {
                    class140.field2281 = class174.field2910;
                }
                class140.field2280 = 1;
            }
            if (class140.field2280 == 1) {
                class202.field3275 = class44.field659.method471(22874, class182.field3021, class140.field2281);
                class140.field2280 = 2;
            }
            if (class140.field2280 == 2) {
                if (class202.field3275.field4929 == 2) {
                    throw new IOException();
                }
                if (class202.field3275.field4929 != 1) {
                    return;
                }
                class18.field322 = new class63((Socket) class202.field3275.field4930, class44.field659);
                class202.field3275 = null;
                class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 107);
                if (class122.field1939 != null) {
                    class122.field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                int var1 = class18.field322.method415(111);
                if (class122.field1939 != null) {
                    class122.field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                if (var1 != 101) {
                    class191.field3120 = var1;
                    class140.field2280 = 0;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    return;
                }
                class140.field2280 = 3;
            }
            if (class140.field2280 == 3 && class18.field322.method419((byte) -98) >= 2) {
                int var2 = class18.field322.method415(36) << 8 | class18.field322.method415(42);
                class36.method264((byte) 95, var2);
                if (class62.field916 == -1) {
                    class191.field3120 = 6;
                    class140.field2280 = 0;
                    class18.field322.method416(64);
                    class18.field322 = null;
                } else {
                    class140.field2280 = 0;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    class270.method1794(-20745);
                }
            }
        } catch (IOException var3) {
            if (class18.field322 != null) {
                class18.field322.method416(64);
                class18.field322 = null;
            }
            if (class63.field1027 < 1) {
                class140.field2280 = 1;
                class63.field1027++;
                class27.field482 = 0;
                if (class174.field2910 == class140.field2281) {
                    class140.field2281 = class239.field3743;
                } else {
                    class140.field2281 = class174.field2910;
                }
            } else {
                class191.field3120 = -4;
                class140.field2280 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public static final void method1030(boolean arg0) {
        field2432++;
        if (class214.field3389 == class170.field2795) {
            return;
        }
        if (class122.method837(class214.field3389, (byte) 110)) {
            class170.field2795 = class214.field3389;
        }
        if (arg0) {
            method1035(true, -11);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method975(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method973(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V")
    public static void method1031(boolean arg0) {
        field2439 = null;
        if (!arg0) {
            field2442 = null;
        }
        field2442 = null;
        field2440 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        field2433++;
        if (arg0 != 4806) {
            field2439 = null;
        }
        class89.field1388.method1873(-7401);
        class174.field2911.method1873(-7401);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1033(int arg0, int arg1, String arg2) {
        if (arg1 != 9068) {
            method1029(false);
        }
        class86.field1358++;
        class311.field5027.method2081(false, 137);
        class311.field5027.method1821(class162.method1114((byte) -124, arg2), 125);
        class311.field5027.method1860(arg0, arg1 ^ 0x343);
        field2435++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public abstract void method974(int arg0, Component arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method1034(byte arg0) {
        class94.method682(this.field2436, this.field2427, this.field2437);
        int var2 = 5 % ((6 - arg0) / 57);
        field2429++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
    public static final void method1035(boolean arg0, int arg1) {
        field2431++;
        if (arg0 || !class118.method816(arg1, 0)) {
            return;
        }
        class248[] var2 = class208.field3315[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class248 var4 = var2[var3];
            if (var4 != null) {
                var4.field3969 = 1;
                var4.field3927 = 0;
                var4.field4031 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    protected class152() {
    }
}
