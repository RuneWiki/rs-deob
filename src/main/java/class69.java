import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class124 {

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public int field1594 = 0;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "Lr;")
    public class118 field1613 = class126.field2882;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Lr;")
    public static class118 field1600 = class153.method1136(123, "gr-Un:");

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lr;")
    private static class118 field1607 = class153.method1136(103, "Loaded config");

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Lr;")
    public static class118 field1595 = field1607;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Lr;")
    private static class118 field1604 = class153.method1136(108, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Lr;")
    public static class118 field1608 = field1604;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public static volatile int field1614 = 0;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "[I")
    public static int[] field1615 = new int[4000];

    @OriginalMember(owner = "client!k", name = "W", descriptor = "Lr;")
    public static class118 field1601 = field1604;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public static int field1599 = 0;

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "Z")
    public static boolean field1617 = false;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lff;")
    public static class42 field1598;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "Lff;")
    public static class42 field1602;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "[I")
    public int[] field1610;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "[I")
    public int[] field1616;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "[Lr;")
    public class118[] field1603;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILff;ZIIII)V")
    public static final void method588(int arg0, class42 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1593 = arg3;
        class140.field3180 = arg4;
        class87.field2116 = arg6;
        class106.field2463 = arg2;
        class65.field1486 = arg5;
        class112.field2615 = arg1;
        field1618++;
        class118.field2767 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lue;")
    public static final class144 method589(int arg0, int arg1) {
        field1606++;
        class144 var2 = (class144) class136.field3082.method395((byte) -28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field3221.method350(arg0, -72, 0);
        if (var3 == null) {
            return null;
        }
        class144 var4 = new class144();
        class105 var5 = new class105(var3);
        int var6 = 0;
        var5.field2404 = var5.field2405.length - 12;
        int var7 = var5.method821((byte) 121);
        var4.field3247 = var5.method838((byte) 5);
        var4.field3244 = var5.method838((byte) 5);
        if (arg1 != 557) {
            return null;
        }
        var4.field3251 = var5.method838((byte) 5);
        var4.field3234 = var5.method838((byte) 5);
        var5.field2404 = 0;
        var4.field3248 = var5.method837(-1);
        var4.field3242 = new int[var7];
        var4.field3249 = new class118[var7];
        var4.field3239 = new int[var7];
        while (var5.field2404 < var5.field2405.length - 12) {
            int var8 = var5.method838((byte) 5);
            if (var8 == 3) {
                var4.field3249[var6] = var5.method810(class47.method392(arg1, 1347011077));
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3242[var6] = var5.method831((byte) 76);
            } else {
                var4.field3242[var6] = var5.method821((byte) 71);
            }
            var4.field3239[var6++] = var8;
        }
        class136.field3082.method391(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1607 = null;
        field1598 = null;
        int var1 = 42 % ((18 - arg0) / 58);
        field1602 = null;
        field1595 = null;
        field1604 = null;
        field1615 = null;
        field1608 = null;
        field1601 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLpa;)V")
    private final void method591(int arg0, byte arg1, class105 arg2) {
        field1597++;
        if (arg1 <= 46) {
            return;
        }
        if (arg0 == 1) {
            this.field1612 = arg2.method831((byte) 76);
        } else if (arg0 == 2) {
            this.field1605 = arg2.method831((byte) 76);
        } else if (arg0 == 3) {
            this.field1613 = arg2.method810(1347010600);
        } else if (arg0 == 4) {
            this.field1592 = arg2.method821((byte) 73);
        } else if (arg0 == 5) {
            this.field1594 = arg2.method838((byte) 5);
            this.field1610 = new int[this.field1594];
            this.field1603 = new class118[this.field1594];
            for (int var4 = 0; var4 < this.field1594; var4++) {
                this.field1610[var4] = arg2.method821((byte) 89);
                this.field1603[var4] = arg2.method810(1347010600);
            }
            return;
        } else if (arg0 == 6) {
            this.field1594 = arg2.method838((byte) 5);
            this.field1616 = new int[this.field1594];
            this.field1610 = new int[this.field1594];
            for (int var5 = 0; var5 < this.field1594; var5++) {
                this.field1610[var5] = arg2.method821((byte) 119);
                this.field1616[var5] = arg2.method821((byte) 65);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public static final void method592(byte arg0) {
        if (arg0 != -19) {
            method588(10, null, true, 54, 107, -9, -42);
        }
        field1596++;
        class68.field1582 = true;
        class154.field3504 = true;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lpa;I)V")
    public final void method593(class105 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method831((byte) 76);
            if (var3 == 0) {
                field1609++;
                if (arg1 != 0) {
                    method592((byte) -60);
                    return;
                }
                return;
            }
            this.method591(var3, (byte) 69, arg0);
        }
    }
}
