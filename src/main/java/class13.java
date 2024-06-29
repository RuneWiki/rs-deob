import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 implements Runnable {

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[Lth;")
    public volatile class86[] field420 = new class86[2];

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Z")
    public volatile boolean field403 = false;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Z")
    public volatile boolean field421 = false;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lud;")
    private static class279 field409 = class130.method1024(" from your friend list first)3", 255);

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Z")
    public static boolean field402 = false;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lud;")
    public static class279 field414 = class130.method1024("(Udns", 255);

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Z")
    public static boolean[] field406 = new boolean[5];

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lud;")
    public static class279 field412 = field409;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lud;")
    public static class279 field400 = class130.method1024(":assist:", 255);

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Z")
    public static volatile boolean field410 = true;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lok;")
    public static class149 field401;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lud;")
    public static class279 field415;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lbd;")
    public class305 field407;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZ)V", line = 4)
    public static final void method89(int arg0, int arg1, boolean arg2) {
        class298.field5284 = class166.field3007 - (-class34.field777 + arg1) - 1;
        class276.field4901 = arg0 - class245.field4356;
        field405++;
        int var3 = class276.field4901 - ((int) ((float) class45.field947.field220 / class52.field1071));
        if (arg2) {
            method96(true);
        }
        int var4 = (int) ((float) class45.field947.field220 / class52.field1071) + class276.field4901;
        if (var3 < 0) {
            class276.field4901 = (int) ((float) class45.field947.field220 / class52.field1071);
        }
        if (var4 > class121.field2180) {
            class276.field4901 = class121.field2180 - ((int) ((float) class45.field947.field220 / class52.field1071));
        }
        int var5 = class298.field5284 - (int) ((float) class45.field947.field297 / class52.field1071);
        int var6 = class298.field5284 + ((int) ((float) class45.field947.field297 / class52.field1071));
        if (var5 < 0) {
            class298.field5284 = (int) ((float) class45.field947.field297 / class52.field1071);
        }
        if (var6 > class166.field3007) {
            class298.field5284 = class166.field3007 - ((int) ((float) class45.field947.field297 / class52.field1071));
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z", line = 39)
    public static final boolean method90(int arg0) {
        field419++;
        if (arg0 != 33) {
            field410 = false;
        }
        class254 var1 = class101.field1892;
        synchronized (class101.field1892) {
            if (class194.field3487 == class110.field2032) {
                return false;
            } else {
                class58.field1227 = class233.field4080[class110.field2032];
                class50.field1025 = class195.field3521[class110.field2032];
                class110.field2032 = class110.field2032 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIZ)V", line = 75)
    public static final void method91(int arg0, int arg1, boolean arg2) {
        class212 var3 = class79.method661((byte) 50, arg0);
        field418++;
        int var4 = var3.field3716;
        int var5 = var3.field3725;
        int var6 = var3.field3727;
        if (arg2) {
            method96(true);
        }
        int var7 = class131.field2390[var4 - var6];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class92.method789(~var8 & class141.field2570[var5] | arg1 << var6 & var8, var5, (byte) -15);
    }

    @OriginalMember(owner = "client!nk", name = "run", descriptor = "()V", line = 118)
    public final void run() {
        field411++;
        this.field421 = true;
        try {
            while (!this.field403) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class86 var2 = this.field420[var1];
                    if (var2 != null) {
                        var2.method743(false);
                    }
                }
                class204.method1510(10L, 1);
                class53.method443((Object) null, (byte) 42, this.field407);
            }
        } catch (Exception var7) {
            class94.method792(var7, (byte) -115, (String) null);
        } finally {
            this.field421 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 167)
    public static int method92(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lok;ZZLvi;Lok;)V", line = 178)
    public static final void method93(class149 arg0, boolean arg1, boolean arg2, class6 arg3, class149 arg4) {
        class191.field3438 = arg4;
        field408++;
        class54.field1187 = arg0;
        if (!arg2) {
            return;
        }
        class266.field4788 = arg1;
        int var5 = class54.field1187.method1181(-99) - 1;
        class321.field5614 = var5 * 256 + class54.field1187.method1174(var5, -17680);
        class217.field3846 = arg3;
        class240.field4219 = new class279[] { null, null, class33.field738, null, null };
        class57.field1217 = new class279[] { null, null, null, null, class102.field1907 };
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)Lwf;", line = 200)
    public static final class58 method94(int arg0, byte arg1) {
        class58 var2 = (class58) class54.field1183.method1336((long) arg0, 0);
        field416++;
        if (arg1 != 9) {
            return (class58) null;
        } else if (var2 == null) {
            byte[] var3 = class182.field3347.method1192(0, 33, arg0);
            class58 var4 = new class58();
            if (var3 != null) {
                var4.method524(new class53(var3), arg0, -1);
            }
            class54.field1183.method1331(var4, arg1 ^ 0x7614, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 223)
    public static void method95(boolean arg0) {
        if (!arg0) {
            method90(-80);
        }
        field412 = null;
        field415 = null;
        field414 = null;
        field409 = null;
        field400 = null;
        field401 = null;
        field406 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 239)
    public static final void method96(boolean arg0) {
        field413++;
        if (class141.field2557 == 5) {
            if (arg0) {
                field400 = (class279) null;
            }
            class141.field2557 = 6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 257)
    public static final void method97(int arg0) {
        field417++;
        for (int var1 = arg0; var1 < class103.field1931; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class252.field4503[var1];
            }
            class239 var3 = class96.field1780[var2];
            if (var3 != null && var3.field36 > 0) {
                var3.field36--;
                if (var3.field36 == 0) {
                    var3.field42 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class26.field626; var4++) {
            int var5 = class200.field3579[var4];
            class102 var6 = class122.field2196[var5];
            if (var6 != null && var6.field36 > 0) {
                var6.field36--;
                if (var6.field36 == 0) {
                    var6.field42 = null;
                }
            }
        }
    }
}
