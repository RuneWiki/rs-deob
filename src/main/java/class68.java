import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lrd;")
    public static class173 field1313 = class133.method843("Bitte warten Sie)3)3)3", -82);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lrd;")
    private static class173 field1316 = class133.method843("Your profile will be transferred in:", -77);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lrd;")
    public static class173 field1319 = class133.method843("Ladevorgang )2 bitte warten Sie)3", -79);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[[I")
    public static int[][] field1314 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[S")
    public static short[] field1320 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lrd;")
    public static class173 field1321 = field1316;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)I")
    public static final int method421(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 92 % ((5 - arg2) / 41);
        field1315++;
        if (arg0 < arg1) {
            return arg1;
        } else if (arg0 <= arg3) {
            return arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method422(int arg0) {
        class195.field3792 = 0;
        class64.field1256 = 0;
        class165.field3175.field2222 = 0;
        class12.field199 = 0;
        class96.field1764 = -1;
        field1318++;
        class138.field2587 = 0;
        class55.field1094 = 0;
        class176.field3451 = -1;
        class66.field1278 = -1;
        class70.field1358.field2222 = 0;
        class45.field919 = 0;
        class84.field1663 = -1;
        class167.field3223 = false;
        for (int var1 = 0; var1 < class183.field3600.length; var1++) {
            if (class183.field3600[var1] != null) {
                class183.field3600[var1].field2818 = -1;
            }
        }
        if (arg0 != -1354) {
            return;
        }
        for (int var2 = 0; var2 < client.field632.length; var2++) {
            if (client.field632[var2] != null) {
                client.field632[var2].field2818 = -1;
            }
        }
        class215.method1411((byte) -31);
        class148.method978(30, arg0 + 10134);
        for (int var3 = 0; var3 < 100; var3++) {
            class70.field1373[var3] = true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "run", descriptor = "()V")
    public final void run() {
        field1317++;
        try {
            while (true) {
                class145 var1 = class131.field2479;
                class77 var2;
                synchronized (class131.field2479) {
                    var2 = (class77) class131.field2479.method915(-1);
                }
                if (var2 == null) {
                    class151.method996(12121, 100L);
                    Object var6 = class62.field1221;
                    synchronized (class62.field1221) {
                        if (class168.field3243 <= 1) {
                            class168.field3243 = 0;
                            class62.field1221.notifyAll();
                            return;
                        }
                        class168.field3243--;
                    }
                } else {
                    if (var2.field1498 == 0) {
                        var2.field1503.method673(var2.field1502, (int) var2.field2437, 0, var2.field1502.length);
                        class145 var4 = class131.field2479;
                        synchronized (class131.field2479) {
                            var2.method824((byte) -125);
                        }
                    } else if (var2.field1498 == 1) {
                        var2.field1502 = var2.field1503.method669((int) var2.field2437, 255);
                        class145 var3 = class131.field2479;
                        synchronized (class131.field2479) {
                            class135.field2551.method920(false, var2);
                        }
                    }
                    Object var5 = class62.field1221;
                    synchronized (class62.field1221) {
                        if (class168.field3243 <= 1) {
                            class168.field3243 = 0;
                            class62.field1221.notifyAll();
                            return;
                        }
                        class168.field3243 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class74.method461((byte) -115, var17, null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method423(int arg0) {
        field1316 = null;
        field1319 = null;
        if (arg0 == 1171) {
            field1314 = null;
            field1313 = null;
            field1321 = null;
            field1320 = null;
        }
    }
}
