import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class568 {

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public int field8001 = 2048;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public int field8009 = 0;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public int field8010 = 0;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public int field8003 = 2048;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "Loe;")
    public static class15 field8007 = new class15();

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field8011 = 0;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "Ljn;")
    public static class134 field8012 = new class134(77, 8);

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "[[I")
    public static int[][] field8014 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
    public static boolean field8013;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lns;Z)I")
    public static final int method3343(class654 arg0, boolean arg1) {
        field8004++;
        if (arg1) {
            method3349(10);
        }
        if (arg0.field9118 == 0) {
            return 0;
        }
        if (arg0.field9137 != -1) {
            class654 var2 = null;
            if (arg0.field9137 < 32768) {
                class685 var3 = (class685) class450.field6288.method3669(arg1, (long) arg0.field9137);
                if (var3 != null) {
                    var2 = var3.field9573;
                }
            } else if (arg0.field9137 >= 32768) {
                var2 = class413.field5787[arg0.field9137 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field3470 - var2.field3470;
                int var5 = arg0.field3460 - var2.field3460;
                if (var4 != 0 || var5 != 0) {
                    arg0.method3745(0, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class723)) {
            class723 var9 = (class723) arg0;
            if (var9.field10013 != -1 && (var9.field9215 == 0 || var9.field9218 > 0)) {
                var9.method3745(0, var9.field10013);
                var9.field10013 = -1;
            }
        } else if (arg0 instanceof class359) {
            class359 var6 = (class359) arg0;
            if (var6.field5173 != -1 && (var6.field9215 == 0 || var6.field9218 > 0)) {
                int var7 = var6.field3470 - ((var6.field5173 - class444.field6151 - class444.field6151) * 256);
                int var8 = var6.field3460 - (var6.field5160 - class236.field3535 - class236.field3535) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method3745(0, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field5173 = -1;
            }
        }
        return arg0.method3751((byte) 107);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static final void method3344(int arg0) {
        field8002++;
        class447.method2710(-20466);
        if (arg0 == 0) {
            class55.field651 = false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    public static final void method3345(int arg0, int arg1) {
        field7999++;
        class17 var2 = class245.method1634(1, (long) arg0, 8);
        if (arg1 <= -54) {
            var2.method69(13);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLgga;)V")
    public final void method3346(byte arg0, class511 arg1) {
        if (arg0 != 127) {
            method3343(null, true);
        }
        field8005++;
        while (true) {
            int var3 = arg1.method3013(70);
            if (var3 == 0) {
                return;
            }
            this.method3347(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lgga;ZI)V")
    private final void method3347(class511 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field8009 = arg0.method3013(-123);
        } else if (arg2 == 2) {
            this.field8001 = arg0.method3002(-1);
        } else if (arg2 == 3) {
            this.field8003 = arg0.method3002(-1);
        } else if (arg2 == 4) {
            this.field8010 = arg0.method3034(1);
        }
        if (arg1) {
            this.method3346((byte) -115, null);
        }
        field8006++;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)Lqha;")
    public static final class396 method3348(int arg0, int arg1) {
        field8008++;
        class396[] var2 = class730.method4055(1);
        if (arg1 != 30474) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class396 var4 = var2[var3];
            if (var4.field5620 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public static void method3349(int arg0) {
        field8007 = null;
        field8012 = null;
        int var1 = 67 / ((arg0 + 77) / 46);
        field8014 = null;
    }
}
