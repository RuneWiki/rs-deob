import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field1332 = new int[128];

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Laf;")
    private static class7 field1333 = class48.method406(40, "FULL");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Laf;")
    public static class7 field1331 = field1333;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[I")
    public static int[] field1338 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Laf;")
    public static class7 field1339 = class48.method406(40, "mapmarker");

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Laf;")
    public static class7 field1342 = class48.method406(40, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lkb;")
    public static class71 field1343;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method441(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field1334++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (arg0 <= ~var2 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method442(boolean arg0) {
        if (arg0) {
            method445(98);
        }
        field1341++;
        class19.field503.method391((byte) -73);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method443(byte arg0) {
        int var1 = class91.field2100.method1138(8, false);
        field1335++;
        if (class130.field3088 > var1) {
            for (int var2 = var1; var2 < class130.field3088; var2++) {
                class84.field1982[class120.field2837++] = class87.field2046[var2];
            }
        }
        if (class130.field3088 < var1) {
            throw new RuntimeException("gppov1");
        } else if (arg0 < -80) {
            class130.field3088 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class87.field2046[var3];
                class92 var5 = class18.field425[var4];
                int var6 = class91.field2100.method1138(1, false);
                if (var6 == 0) {
                    class87.field2046[class130.field3088++] = var4;
                    var5.field476 = class155.field3611;
                } else {
                    int var7 = class91.field2100.method1138(2, false);
                    if (var7 == 0) {
                        class87.field2046[class130.field3088++] = var4;
                        var5.field476 = class155.field3611;
                        class21.field537[class98.field2325++] = var4;
                    } else if (var7 == 1) {
                        class87.field2046[class130.field3088++] = var4;
                        var5.field476 = class155.field3611;
                        int var8 = class91.field2100.method1138(3, false);
                        var5.method182(false, var8, (byte) -57);
                        int var9 = class91.field2100.method1138(1, false);
                        if (var9 == 1) {
                            class21.field537[class98.field2325++] = var4;
                        }
                    } else if (var7 == 2) {
                        class87.field2046[class130.field3088++] = var4;
                        var5.field476 = class155.field3611;
                        int var10 = class91.field2100.method1138(3, false);
                        var5.method182(true, var10, (byte) -127);
                        int var11 = class91.field2100.method1138(3, false);
                        var5.method182(true, var11, (byte) 115);
                        int var12 = class91.field2100.method1138(1, false);
                        if (var12 == 1) {
                            class21.field537[class98.field2325++] = var4;
                        }
                    } else if (var7 == 3) {
                        class84.field1982[class120.field2837++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method444(int arg0) {
        field1342 = null;
        field1339 = null;
        field1343 = null;
        field1332 = null;
        if (arg0 == 28348) {
            field1338 = null;
            field1331 = null;
            field1333 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)J")
    public static final synchronized long method445(int arg0) {
        field1330++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 0) {
            return -128L;
        }
        if (var1 < class96.field2288) {
            class111.field2677 += class96.field2288 - var1;
        }
        class96.field2288 = var1;
        return class111.field2677 + var1;
    }
}
