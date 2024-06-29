import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 extends class124 {

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public int field2654 = 0;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lbc;")
    public static class11 field2652 = new class11(64);

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lpe;")
    public static class109 field2661 = class141.method1120("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 0);

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Z")
    public static boolean field2665 = false;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[Z")
    public static boolean[] field2663 = new boolean[100];

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lpe;")
    private static class109 field2667 = class141.method1120(" ", 0);

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Z")
    public static boolean field2664 = false;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Lpe;")
    public static class109 field2662 = field2667;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lpe;")
    public static class109 field2666 = class141.method1120("Titelbild geladen)3", 0);

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
    public static int[] field2668;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)I")
    public static final int method975(byte arg0, int arg1) {
        field2659++;
        class63 var2 = class128.method1035(arg1, 14);
        int var3 = var2.field1285;
        int var4 = var2.field1289;
        if (arg0 >= -27) {
            return 116;
        } else {
            int var5 = var2.field1298;
            int var6 = class53.field1092[var5 - var4];
            return var6 & class153.field3376[var3] >> var4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILbe;I)V")
    private final void method976(int arg0, class13 arg1, int arg2) {
        if (arg2 != 1) {
            this.method976(6, null, 17);
        }
        field2656++;
        if (arg0 == 5) {
            this.field2654 = arg1.method105(arg2 + 1375221239);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
    public static final int method977(int arg0, boolean arg1, int arg2, int arg3) {
        field2653++;
        if (!arg1) {
            method981(31);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        class82.field1733.method527((byte) -102);
        field2660++;
        int var1 = class82.field1733.method526((byte) 127, 8);
        if (arg0 != -72) {
            field2664 = false;
        }
        if (class131.field2885 > var1) {
            for (int var2 = var1; var2 < class131.field2885; var2++) {
                class118.field2626[class61.field1198++] = class139.field3035[var2];
            }
        }
        if (class131.field2885 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class131.field2885 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class139.field3035[var3];
            class108 var5 = class52.field1067[var4];
            int var6 = class82.field1733.method526((byte) 127, 1);
            if (var6 == 0) {
                class139.field3035[class131.field2885++] = var4;
                var5.field3119 = class12.field264;
            } else {
                int var7 = class82.field1733.method526((byte) 127, 2);
                if (var7 == 0) {
                    class139.field3035[class131.field2885++] = var4;
                    var5.field3119 = class12.field264;
                    class84.field1784[class42.field869++] = var4;
                } else if (var7 == 1) {
                    class139.field3035[class131.field2885++] = var4;
                    var5.field3119 = class12.field264;
                    int var8 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(-29576, false, var8);
                    int var9 = class82.field1733.method526((byte) 127, 1);
                    if (var9 == 1) {
                        class84.field1784[class42.field869++] = var4;
                    }
                } else if (var7 == 2) {
                    class139.field3035[class131.field2885++] = var4;
                    var5.field3119 = class12.field264;
                    int var10 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(-29576, true, var10);
                    int var11 = class82.field1733.method526((byte) 127, 3);
                    var5.method1127(arg0 ^ 0x73C0, true, var11);
                    int var12 = class82.field1733.method526((byte) 127, 1);
                    if (var12 == 1) {
                        class84.field1784[class42.field869++] = var4;
                    }
                } else if (var7 == 3) {
                    class118.field2626[class61.field1198++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lhf;")
    public static final class55 method979(int arg0, int arg1) {
        field2657++;
        class55 var2 = (class55) class154.field3397.method93((byte) 103, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field1030.method742(arg1, arg0 - 125, arg0);
        class55 var4 = new class55();
        if (var3 != null) {
            var4.method441(new class13(var3), arg0 ^ 0xFFFFFFFA);
        }
        class154.field3397.method97((long) arg1, (byte) -118, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILbe;)V")
    public final void method980(int arg0, class13 arg1) {
        while (true) {
            int var3 = arg1.method142(27467);
            if (var3 == 0) {
                if (arg0 > -4) {
                    return;
                }
                field2655++;
                return;
            }
            this.method976(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method981(int arg0) {
        if (arg0 != -2) {
            field2652 = null;
        }
        field2662 = null;
        field2652 = null;
        field2666 = null;
        field2663 = null;
        field2668 = null;
        field2667 = null;
        field2661 = null;
    }
}
