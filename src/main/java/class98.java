import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class98 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "B")
    private byte field1481;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private static int field1475 = 0;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method697(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field1479++;
        if (arg1 != 36) {
            field1475 = 98;
        }
        int var4 = arg0 ? 32768 : 0;
        int var5 = var4 + (arg0 ? class64.field900 : class204.field3270);
        short[] var6 = new short[16];
        int var7 = 0;
        for (int var8 = var4; var8 < var5; var8++) {
            class245 var11 = class266.method1805((byte) -48, var8);
            if (var11.field3924 && var11.method1615(1).toLowerCase().indexOf(var3) != -1) {
                if (var7 >= 50) {
                    class197.field3177 = null;
                    class183.field2931 = -1;
                    return;
                }
                if (var6.length <= var7) {
                    short[] var12 = new short[var6.length * 2];
                    for (int var13 = 0; var13 < var7; var13++) {
                        var12[var13] = var6[var13];
                    }
                    var6 = var12;
                }
                var6[var7++] = (short) var8;
            }
        }
        class278.field4459 = 0;
        class197.field3177 = var6;
        class183.field2931 = var7;
        String[] var9 = new String[class183.field2931];
        for (int var10 = 0; var10 < class183.field2931; var10++) {
            var9[var10] = class266.method1805((byte) -76, var6[var10]).method1615(class223.method1477(arg1, 37));
        }
        class173.method1205(class197.field3177, var9, (byte) 22);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method698(int arg0, byte[] arg1) {
        field1478++;
        class264 var2 = new class264(arg1);
        if (arg0 > -20) {
            method697(true, (byte) -46, (String) null);
        }
        int var3 = var2.method1779(-95);
        int var4 = var2.method1765((byte) 93);
        if (var4 < 0 || !(field1475 == 0 || var4 <= field1475)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1754(var4, var5, 89, 0);
            return var5;
        } else {
            int var6 = var2.method1765((byte) 119);
            if (var6 < 0 || !(field1475 == 0 || var6 <= field1475)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class292.method1960(var7, var6, arg1, var4, 9);
            } else {
                class134.field2245.method818(true, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public final int method699(int arg0) {
        field1473++;
        if (arg0 != -1) {
            this.field1471 = 50;
        }
        return this.field1481 & 0x7;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method700(int arg0, int arg1) {
        if (arg1 >= 113) {
            field1482++;
            class283 var2 = class46.method360(3, -92, arg0);
            var2.method1900(true);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public final int method701(int arg0) {
        int var2 = 29 % ((-arg0 - 20) / 57);
        field1476++;
        return (this.field1481 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method702(byte arg0, Component arg1) {
        if (arg0 <= 46) {
            method702((byte) 17, (Component) null);
        }
        field1474++;
        arg1.addMouseListener(class9.field128);
        arg1.addMouseMotionListener(class9.field128);
        arg1.addFocusListener(class9.field128);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[BII)I")
    public static final int method703(byte arg0, byte[] arg1, int arg2, int arg3) {
        field1472++;
        int var4 = -1;
        int var5 = arg3;
        if (arg0 < 62) {
            return 113;
        }
        while (arg2 > var5) {
            var4 = class265.field4274[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method704(int arg0, int arg1, int arg2, long arg3) {
        class99 var5 = class273.field4415[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1502 != null && var5.field1502.field3719 == arg3) {
            return true;
        } else if (var5.field1494 != null && var5.field1494.field3157 == arg3) {
            return true;
        } else if (var5.field1491 != null && var5.field1491.field187 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1503; var6++) {
                if (var5.field1496[var6].field2275 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lhi;)V")
    public class98(class264 arg0) {
        this.field1481 = arg0.method1767(16711680);
        this.field1477 = arg0.method1777(-49);
        this.field1483 = arg0.method1765((byte) 123);
        this.field1471 = arg0.method1765((byte) 117);
        this.field1470 = arg0.method1765((byte) 104);
        this.field1480 = arg0.method1765((byte) 125);
    }
}
