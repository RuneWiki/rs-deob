import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class157 extends class152 {

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Lhh;")
    private class163 field2895 = class103.field1974;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[I")
    public static int[] field2897 = new int[32];

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[B")
    public static byte[] field2911;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lhh;")
    public static class163 field2912;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lhh;")
    private static class163 field2915;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lhh;")
    public static class163 field2913;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field2898;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lpa;")
    public static class123 field2917;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "Lqc;")
    private class258 field2900;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Lqc;")
    private class258 field2906;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "[[[Leg;")
    public static class144[][][] field2909;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
    public final int method1154(byte arg0, int arg1) {
        field2904++;
        if (this.field2906 == null) {
            return this.field2898;
        } else {
            class129 var3 = (class129) this.field2906.method1743((long) arg1, false);
            int var4 = 9 / ((40 - arg0) / 52);
            return var3 == null ? this.field2898 : var3.field2503;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)Lhh;")
    public final class163 method1155(byte arg0, int arg1) {
        if (arg0 != 124) {
            field2909 = null;
        }
        field2894++;
        if (this.field2906 == null) {
            return this.field2895;
        } else {
            class119 var3 = (class119) this.field2906.method1743((long) arg1, false);
            return var3 == null ? this.field2895 : var3.field2239;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpg;I)V")
    public final void method1156(class81 arg0, int arg1) {
        if (arg1 != 8090) {
            this.method1160(10);
        }
        field2914++;
        while (true) {
            int var3 = arg0.method622(true);
            if (var3 == 0) {
                return;
            }
            this.method1164(arg0, var3, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public static void method1157(byte arg0) {
        field2911 = null;
        field2917 = null;
        field2912 = null;
        if (arg0 >= 61) {
            field2909 = null;
            field2915 = null;
            field2897 = null;
            field2913 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
    public final boolean method1158(int arg0, int arg1) {
        field2891++;
        if (this.field2906 == null) {
            return false;
        }
        if (arg1 != 32605) {
            method1163((Component) null, 66);
        }
        if (this.field2900 == null) {
            this.method1160(-122);
        }
        class129 var3 = (class129) this.field2900.method1743((long) arg0, false);
        return var3 != null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    private final void method1159(boolean arg0) {
        field2908++;
        this.field2900 = new class258(this.field2906.method1746(arg0));
        for (class119 var2 = (class119) this.field2906.method1747((byte) 122); var2 != null; var2 = (class119) this.field2906.method1745(-32496)) {
            class85 var3 = new class85(var2.field2239, (int) var2.field2641);
            this.field2900.method1741(var3, false, var2.field2239.method1217(35));
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    private final void method1160(int arg0) {
        field2907++;
        this.field2900 = new class258(this.field2906.method1746(true));
        for (class129 var2 = (class129) this.field2906.method1747((byte) 71); var2 != null; var2 = (class129) this.field2906.method1745(-32496)) {
            class129 var3 = new class129((int) var2.field2641);
            this.field2900.method1741(var3, false, (long) var2.field2503);
        }
        if (arg0 >= -120) {
            method1165(false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)[Lne;")
    public static final class94[] method1161(int arg0) {
        if (arg0 < 55) {
            field2917 = null;
        }
        field2893++;
        class94[] var1 = new class94[class84.field1594];
        for (int var2 = 0; var2 < class84.field1594; var2++) {
            var1[var2] = new class242(class107.field2043, class2.field36, class65.field1107[var2], class180.field3267[var2], class256.field4478[var2], class257.field4505[var2], class223.field4070[var2], class111.field2097);
        }
        class67.method463(-80);
        return var1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lhh;I)Z")
    public final boolean method1162(class163 arg0, int arg1) {
        field2903++;
        if (arg1 != 0) {
            return true;
        } else if (this.field2906 == null) {
            return false;
        } else {
            if (this.field2900 == null) {
                this.method1159(true);
            }
            for (class85 var3 = (class85) this.field2900.method1743(arg0.method1217(54), false); var3 != null; var3 = (class85) this.field2900.method1740(~arg1)) {
                if (var3.field1608.method1208(arg0, (byte) 27)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1163(Component arg0, int arg1) {
        arg0.removeKeyListener(class191.field3494);
        field2896++;
        arg0.removeFocusListener(class191.field3494);
        class30.field470 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpg;IB)V")
    private final void method1164(class81 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2905 = arg0.method622(true);
        } else if (arg1 == 2) {
            this.field2899 = arg0.method622(true);
        } else if (arg1 == 3) {
            this.field2895 = arg0.method605(true);
        } else if (arg1 == 4) {
            this.field2898 = arg0.method620((byte) -82);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method658(83);
            this.field2906 = new class258(class96.method762((byte) -27, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method620((byte) -82);
                class137 var7;
                if (arg1 == 5) {
                    var7 = new class119(arg0.method605(true));
                } else {
                    var7 = new class129(arg0.method620((byte) -82));
                }
                this.field2906.method1741(var7, false, (long) var6);
            }
        }
        if (arg2 != 94) {
            this.method1160(20);
        }
        field2902++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public static final void method1165(boolean arg0) {
        field2901++;
        class188.field3445.method842(-125);
        if (arg0) {
            field2919 = -9;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class115.field2171[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class7.field128[var2] = 0L;
        }
        class141.field2693 = 0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2897[var1] = var0 - 1;
            var0 += var0;
        }
        field2911 = new byte[520];
        field2912 = class137.method1065("; version=1; path=)4; domain=", 17);
        field2918 = 0;
        field2915 = class137.method1065("Drop", 17);
        field2913 = field2915;
        field2919 = 0;
    }
}
