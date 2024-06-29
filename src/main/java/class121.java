import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class121 extends class191 {

    @OriginalMember(owner = "client!me", name = "R", descriptor = "Ldd;")
    public static class35 field2658 = class180.method1196((byte) -98, "mapflag");

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2654 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Lld;")
    public static class111 field2659 = new class111(64);

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Ldd;")
    private static class35 field2661 = class180.method1196((byte) -10, "Please enter your username)3");

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Ldd;")
    public static class35 field2662 = field2661;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Lnd;")
    private static class129 field2660 = new class129();

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2663 = -1;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "[J")
    public static long[] field2665 = new long[256];

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "B")
    public byte field2653;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Lo;")
    public class134 field2657;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "Lag;")
    public static class8 field2666;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static final void method859(int arg0) {
        field2649++;
        class1.field11.method659(202, true);
        for (class195 var1 = (class195) class22.field445.method790(-120); var1 != null; var1 = (class195) class22.field445.method794((byte) 90)) {
            if (var1.field3886 == 0) {
                class4.method27(-817150687, true, var1);
            }
        }
        client.field618++;
        if (arg0 < 15) {
            method865(null, true, -59);
        }
        if (class101.field2218 != null) {
            class137.method937(class101.field2218, (byte) -85);
            class101.field2218 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static final void method860(int arg0) {
        field2646++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class59.field1469 - 1; var2++) {
                if (class165.field3340[var2] < 1000 && class165.field3340[var2 + 1] > 1000) {
                    class35 var3 = class183.field3756[var2];
                    var1 = false;
                    class183.field3756[var2] = class183.field3756[var2 + 1];
                    class183.field3756[var2 + 1] = var3;
                    class35 var4 = class64.field1541[var2];
                    class64.field1541[var2] = class64.field1541[var2 + 1];
                    class64.field1541[var2 + 1] = var4;
                    int var5 = class34.field701[var2];
                    class34.field701[var2] = class34.field701[var2 + 1];
                    class34.field701[var2 + 1] = var5;
                    int var6 = class72.field1709[var2];
                    class72.field1709[var2] = class72.field1709[var2 + 1];
                    class72.field1709[var2 + 1] = var6;
                    short var7 = class165.field3340[var2];
                    class165.field3340[var2] = class165.field3340[var2 + 1];
                    class165.field3340[var2 + 1] = var7;
                    long var8 = class143.field3001[var2];
                    class143.field3001[var2] = class143.field3001[var2 + 1];
                    class143.field3001[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -7438) {
            method866((byte) -82, null);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method861(int arg0, Component arg1) {
        arg1.addMouseListener(class158.field3210);
        field2650++;
        arg1.addMouseMotionListener(class158.field3210);
        arg1.addFocusListener(class158.field3210);
        if (arg0 != -1287) {
            field2668 = -89;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILdd;)V")
    public static final void method862(int arg0, int arg1, class35 arg2) {
        field2656++;
        class1.field11.method659(98, true);
        class1.field11.method260(arg2.method321(21830), 21730);
        class49.field1063++;
        if (arg0 == -1) {
            class1.field11.method218(arg1, true);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static final void method863(byte arg0) {
        field2648++;
        class44.field960.method813(-107);
        class105.field2353.method813(-121);
        if (arg0 < 64) {
            field2660 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static void method864(int arg0) {
        field2662 = null;
        field2666 = null;
        field2661 = null;
        field2659 = null;
        field2654 = null;
        field2658 = null;
        field2660 = null;
        if (arg0 != -29947) {
            field2664 = 66;
        }
        field2665 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ldd;ZI)V")
    public static final void method865(class35 arg0, boolean arg1, int arg2) {
        short[] var3 = new short[16];
        class35 var4 = arg0.method319((byte) 13);
        field2647++;
        int var5 = 0;
        for (int var6 = 0; var6 < field2664; var6++) {
            class46 var9 = class207.method1370((byte) -73, var6);
            if ((!arg1 || var9.field1029) && var9.field995.method319((byte) 13).method327((byte) 78, var4) != -1) {
                if (var5 >= 250) {
                    class190.field3832 = null;
                    class8.field165 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class8.field165 = var5;
        class190.field3832 = var3;
        if (arg2 != -1) {
            return;
        }
        class154.field3170 = 0;
        class35[] var7 = new class35[class8.field165];
        for (int var8 = 0; var8 < class8.field165; var8++) {
            var7[var8] = class207.method1370((byte) -73, var3[var8]).field995;
        }
        class22.method198(class190.field3832, var7, -16794);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method866(byte arg0, byte[] arg1) {
        class26 var2 = new class26(arg1);
        if (arg0 != -123) {
            field2662 = null;
        }
        int var3 = var2.method221(arg0 ^ 0x8);
        field2651++;
        int var4 = var2.method240(arg0 + 131);
        if (var4 < 0 || class101.field2222 != 0 && var4 > class101.field2222) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method255((byte) -125, 0, var5, var4);
            return var5;
        } else {
            int var6 = var2.method240(arg0 ^ 0xFFFFFF8D);
            if (var6 < 0 || class101.field2222 != 0 && var6 > class101.field2222) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class86.method642(var7, var6, arg1, var4, 9);
            } else {
                field2660.method895((byte) -99, var2, var7);
            }
            return var7;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2665[var0] = var1;
        }
    }
}
