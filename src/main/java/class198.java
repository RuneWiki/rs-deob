import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class198 extends class297 {

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[I")
    public int[] field3146 = new int[5];

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[Lkg;")
    public class107[] field3166 = new class107[5];

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public int field3168 = 0;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Lma;")
    public static class5 field3152 = class12.method119("<img=1>", (byte) 101);

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Lwj;")
    public static class153 field3159 = new class153(64);

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[I")
    public static int[] field3170 = new int[100];

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Lng;")
    public class133 field3144;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "Lrb;")
    public class139 field3156;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Lek;")
    public class198 field3160;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lnl;")
    public class220 field3154;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Lwf;")
    public class51 field3158;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Lue;")
    public class89 field3149;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Lqa;")
    public class96 field3161;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Z")
    public boolean field3143;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Z")
    public boolean field3157;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Z")
    public boolean field3163;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V", line = 8)
    public class198(int arg0, int arg1, int arg2) {
        this.field3148 = arg1;
        this.field3167 = this.field3155 = arg0;
        this.field3151 = arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZB)V", line = 35)
    public static final void method1307(boolean arg0, byte arg1) {
        if ((class151.field2183.field178 >> 7) == class213.field3383 && (class151.field2183.field211 >> 7) == class10.field153) {
            class213.field3383 = 0;
        }
        field3141++;
        int var2 = class175.field2675;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 != -108) {
            method1308(-117);
        }
        while (var3 < var2) {
            long var4;
            class91 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class151.field2183;
            } else {
                var4 = (long) class118.field1785[var3] << 32;
                var6 = class267.field4593[class118.field1785[var3]];
            }
            if (var6 != null && var6.method117((byte) -115)) {
                var6.field1366 = false;
                int var7 = var6.field178 >> 7;
                if ((class234.field3870 && class175.field2675 > 200 || class175.field2675 > 50) && !arg0 && var6.field202 == var6.field173) {
                    var6.field1366 = true;
                }
                int var8 = var6.field211 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field1385 == null || var6.field1375 > class50.field784 || var6.field1354 <= class50.field784) {
                        label100: {
                            if (var6.field226 == 1 && (var6.field178 & 0x7F) == 64 && (var6.field211 & 0x7F) == 64) {
                                if (class165.field2523[var7][var8] == class60.field938) {
                                    break label100;
                                }
                                class165.field2523[var7][var8] = class60.field938;
                            }
                            var6.field185 = class20.method161(var6.field211, var6.field178, 1, class276.field4701);
                            class11.method114(class276.field4701, var6.field178, var6.field211, var6.field185, var6.field226 * 64 + 60 - 64, var6, var6.field174, var4, var6.field225);
                        }
                    } else {
                        var6.field1366 = false;
                        var6.field185 = class20.method161(var6.field211, var6.field178, 1, class276.field4701);
                        class176.method1153(class276.field4701, var6.field178, var6.field211, var6.field185, var6, var6.field174, var4, var6.field1359, var6.field1373, var6.field1381, var6.field1388);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 138)
    public static void method1308(int arg0) {
        field3159 = null;
        field3152 = null;
        field3170 = null;
        if (arg0 < 114) {
            method1307(false, (byte) 71);
        }
    }
}
