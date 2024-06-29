import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class317 extends class472 {

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "Lbg;")
    public class278 field4829;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field4834 = 0;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "Ld;")
    public static class242 field4831 = new class242(10);

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "Lmu;")
    public static class346 field4836;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "Lru;")
    public static class379 field4837;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "[[[I")
    public static int[][][] field4835;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method1411(boolean arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)I")
    public static final int method2105(int arg0, int arg1, byte arg2) {
        field4827++;
        if (arg2 < 27) {
            return -9;
        } else if (arg1 == 1 || arg1 == 3) {
            return class350.field5226[arg0 & 0x3];
        } else {
            return class193.field2958[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method2106(int arg0) {
        field4837 = null;
        field4831 = null;
        if (arg0 != 9022) {
            field4835 = null;
        }
        field4836 = null;
        field4835 = null;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)Ldk;")
    public static final class424 method2107(int arg0) {
        field4830++;
        int var1 = -128 / ((21 - arg0) / 47);
        return class205.field3154.length > class191.field2927 ? class205.field3154[class191.field2927++] : null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lbg;I)V")
    public class317(class278 arg0, int arg1) {
        this.field4832 = arg1;
        this.field4829 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
    public static final int method2108(int arg0, int arg1) {
        if (arg0 != -25147) {
            method2107(-80);
        }
        field4826++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V")
    public static final void method2109(int arg0) {
        field4833++;
        int var1 = 85 % ((arg0 - 30) / 59);
        for (int var2 = 0; var2 < class20.field220; var2++) {
            int var3 = class471.field6917[var2];
            class46 var4 = ((class5) class366.field5398.method358((byte) -119, (long) var3)).field65;
            int var5 = class424.field6231.method1337((byte) -123);
            if ((var5 & 0x20) != 0) {
                var5 += class424.field6231.method1337((byte) 107) << 8;
            }
            if ((var5 & 0x8) != 0) {
                var4.field7608 = class424.field6231.method1347(-122);
                var4.field7570 = 100;
            }
            if ((var5 & 0x40) != 0) {
                if (var4.field718.method1219(true)) {
                    class150.method1078(var4, true);
                }
                var4.method315(32841, class462.field6842.method1229(-21382, class424.field6231.method1396(91)));
                var4.method3095((byte) -88, var4.field718.field2594);
                var4.field7572 = var4.field718.field2588 << 3;
                if (var4.field718.method1219(true)) {
                    class200.method1413(var4, var4.field7654[0], null, var4.field1274, (byte) 122, null, var4.field7653[0], 0);
                }
            }
            if ((var5 & 0x4) != 0) {
                int var6 = class424.field6231.method1340(-118);
                int var7 = class424.field6231.method1383(12504);
                var4.method3096(class446.field6625, var7, 0, var6);
            }
            if ((var5 & 0x100) != 0) {
                var4.field7576 = class424.field6231.method1346((byte) -119);
                var4.field7573 = class424.field6231.method1368((byte) -68);
                var4.field7640 = class424.field6231.method1368((byte) -68);
                var4.field7638 = (byte) class424.field6231.method1383(12504);
                var4.field7555 = class446.field6625 + class424.field6231.method1391(-74);
                var4.field7615 = class446.field6625 + class424.field6231.method1389(255);
            }
            if ((var5 & 0x1000) != 0) {
                int var8 = class424.field6231.method1337((byte) 37);
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                for (int var12 = 0; var12 < var8; var12++) {
                    int var13 = class424.field6231.method1344(false);
                    if (var13 == 65535) {
                        var13 = -1;
                    }
                    var9[var12] = var13;
                    var10[var12] = class424.field6231.method1376(255);
                    var11[var12] = class424.field6231.method1391(-85);
                }
                class36.method236(var4, var9, var10, (byte) 108, var11);
            }
            if ((var5 & 0x800) != 0) {
                var4.field707 = class424.field6231.method1391(-107);
                var4.field723 = class424.field6231.method1389(255);
            }
            if ((var5 & 0x2000) != 0) {
                int var14 = class424.field6231.method1391(-119);
                var4.field7569 = class424.field6231.method1337((byte) 64);
                var4.field7632 = class424.field6231.method1376(255);
                var4.field7583 = var14 & 0x7FFF;
                var4.field7560 = (var14 & 0x8000) != 0;
                var4.field7571 = class446.field6625 + var4.field7583 + var4.field7569;
            }
            if ((var5 & 0x2) != 0) {
                int var15 = class424.field6231.method1396(40);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class424.field6231.method1383(12504);
                class411.method2585(var15, var16, 15101, var4);
            }
            if ((var5 & 0x80) != 0) {
                int var17 = class424.field6231.method1340(-84);
                int var18 = class424.field6231.method1392(0);
                var4.method3096(class446.field6625, var18, 0, var17);
                var4.field7634 = class446.field6625 + 300;
                var4.field7600 = class424.field6231.method1337((byte) 125);
            }
            if ((var5 & 0x400) != 0) {
                int var19 = class424.field6231.method1389(255);
                int var20 = class424.field6231.method1357(false);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var21 = class424.field6231.method1383(12504);
                var4.method3099(true, var19, var20, 281, var21);
            }
            if ((var5 & 0x10) != 0) {
                var4.field7624 = class424.field6231.method1344(false);
                if (var4.field7624 == 65535) {
                    var4.field7624 = -1;
                }
            }
            if ((var5 & 0x200) != 0) {
                var4.field7565 = class424.field6231.method1368((byte) -68);
                var4.field7616 = class424.field6231.method1380(57);
                var4.field7627 = class424.field6231.method1368((byte) -68);
                var4.field7614 = class424.field6231.method1368((byte) -68);
                var4.field7589 = class424.field6231.method1344(false) + class446.field6625;
                var4.field7585 = class424.field6231.method1391(-23) + class446.field6625;
                var4.field7620 = class424.field6231.method1383(12504);
                var4.field7614 += var4.field7653[0];
                var4.field7652 = 0;
                var4.field7658 = 1;
                var4.field7627 += var4.field7654[0];
                var4.field7616 += var4.field7653[0];
                var4.field7565 += var4.field7654[0];
            }
            if ((var5 & 0x1) != 0) {
                int var22 = class424.field6231.method1344(false);
                int var23 = class424.field6231.method1401(-102);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var24 = class424.field6231.method1392(0);
                var4.method3099(false, var22, var23, 281, var24);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)Z")
    public abstract boolean method1410(int arg0);
}
