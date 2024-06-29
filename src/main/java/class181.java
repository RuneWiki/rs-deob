import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class181 extends class128 {

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field2751 = 0;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "[I")
    public static int[] field2747 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "Lue;")
    private class222 field2748;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1151(int arg0, String arg1) {
        field2745++;
        if (arg1 == null) {
            return;
        }
        String var2 = class248.method1618((byte) 37, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class43.field643; var3++) {
            String var4 = class248.method1618((byte) 76, class206.field3081[var3]);
            if (var4 != null && var4.equals(var2)) {
                class43.field643--;
                class110.field1564++;
                for (int var5 = var3; var5 < class43.field643; var5++) {
                    class206.field3081[var5] = class206.field3081[var5 + 1];
                    class151.field2095[var5] = class151.field2095[var5 + 1];
                    class188.field2846[var5] = class188.field2846[var5 + 1];
                    class76.field1068[var5] = class76.field1068[var5 + 1];
                    class188.field2852[var5] = class188.field2852[var5 + 1];
                    class192.field2937[var5] = class192.field2937[var5 + 1];
                }
                class68.field964 = class142.field1953;
                class231.field3614.method809(74, 0);
                class231.field3614.method1363(class231.method1518(arg1, 67), -43);
                class231.field3614.method1384(arg1, -595448376);
                break;
            }
        }
        if (arg0 != -1697) {
            field2741 = 2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIIZLwk;)V")
    public static final void method1152(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, class195 arg5) {
        field2753++;
        if (class114.field1647 >= 50 || arg5 == null || arg5.field2986 == null || arg5.field2986.length <= arg2 || arg5.field2986[arg2] == null) {
            return;
        }
        int var6 = arg5.field2986[arg2][0];
        int var7 = (var6 & 0xEF) >> 5;
        int var8 = var6 >> 8;
        if (arg5.field2986[arg2].length > 1) {
            int var9 = (int) ((double) arg5.field2986[arg2].length * Math.random());
            if (var9 > 0) {
                var8 = arg5.field2986[arg2][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg0) {
                class291.method1955(var7, var8, 20683, 0, 255);
            }
        } else if (class209.field3110 != 0 && !arg4) {
            int var11 = (arg3 - 64) / 128;
            class167.field2389[class114.field1647] = var8;
            int var12 = (arg1 - 64) / 128;
            class106.field1515[class114.field1647] = var7;
            class191.field2910[class114.field1647] = 0;
            class128.field1791[class114.field1647] = null;
            class45.field670[class114.field1647] = 255;
            class200.field3044[class114.field1647] = (var12 << 16) + (var11 << 8) + var10;
            class114.field1647++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILbj;)V")
    public final void method1153(int arg0, class215 arg1) {
        if (arg0 != -1) {
            return;
        }
        field2742++;
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                return;
            }
            this.method1158(arg1, 99, var3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)I")
    public final int method1154(int arg0, int arg1, int arg2) {
        if (arg0 != 148) {
            method1151(25, (String) null);
        }
        field2746++;
        if (this.field2748 == null) {
            return arg2;
        } else {
            class313 var4 = (class313) this.field2748.method1453(true, (long) arg1);
            return var4 == null ? arg2 : var4.field5027;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method1155(byte arg0, String arg1, int arg2) {
        field2752++;
        if (this.field2748 == null) {
            return arg1;
        }
        class50 var4 = (class50) this.field2748.method1453(true, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 != -87) {
                this.method1153(-78, (class215) null);
            }
            return var4.field712;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        int var1 = -71 % ((15 - arg0) / 42);
        field2747 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public static final void method1157(boolean arg0) {
        class231.field3614.method809(148, 0);
        class231.field3614.method1385(class305.field4880, arg0);
        class9.field104++;
        field2743++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lbj;II)V")
    private final void method1158(class215 arg0, int arg1, int arg2) {
        field2750++;
        if (arg2 == 249) {
            int var4 = arg0.method1374((byte) -60);
            if (this.field2748 == null) {
                int var5 = class216.method1406(true, var4);
                this.field2748 = new class222(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1374((byte) -60) == 1;
                int var8 = arg0.method1403(6591);
                class154 var9;
                if (var7) {
                    var9 = new class50(arg0.method1376(-100));
                } else {
                    var9 = new class313(arg0.method1383((byte) 103));
                }
                this.field2748.method1452((long) var8, var9, 0);
            }
        }
        if (arg1 < 61) {
            this.method1153(-3, (class215) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)Ldc;")
    public static final class7 method1159(int arg0, int arg1) {
        field2744++;
        class7 var2 = (class7) class35.field531.method950((long) arg1, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2130.method2050(79, 33, arg1);
        class7 var4 = new class7();
        if (arg0 <= 58) {
            method1156((byte) 8);
        }
        if (var3 != null) {
            var4.method42(new class215(var3), 0, arg1);
        }
        class35.field531.method942((long) arg1, (byte) 44, var4);
        return var4;
    }
}
