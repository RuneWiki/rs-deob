import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class17 extends class23 {

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    private int field292 = -1;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Llc;")
    public static class143 field306 = class66.method374("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", -1);

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Llc;")
    private static class143 field310 = class66.method374("You can(Wt add yourself to your own ignore list)3", -1);

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Llc;")
    public static class143 field302 = field310;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "Llc;")
    public static class143 field309 = class66.method374("runes", -1);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Lmk;")
    public static class255 field298;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lgf;")
    public static class7 field297;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[I")
    private int[] field304;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)[Lvg;")
    public static final class230[] method124(byte arg0) {
        ++field307;
        class230[] var1 = new class230[class167.field2986];
        if (arg0 != -34) {
            field306 = null;
        }
        for (int var2 = 0; var2 < class167.field2986; ++var2) {
            int var3 = class41.field697[var2] * class153.field2766[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class282.field4961[var2];
            for (int var6 = 0; ~var3 < ~var6; ++var6) {
                var4[var6] = class111.field1961[class129.method777(255, var5[var6])];
            }
            var1[var2] = new class160(class257.field4628, class70.field1332, class126.field2226[var2], class32.field536[var2], class41.field697[var2], class153.field2766[var2], var4);
        }
        class258.method1708(0);
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)Lfe;")
    public static final class212 method125(byte arg0) {
        int var1 = -79 / ((arg0 - -64) / 51);
        ++field299;
        class100 var2 = new class100(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], class282.field4961[0], class111.field1961);
        class258.method1708(0);
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public final void method126(byte arg0) {
        super.method126((byte) 121);
        if (arg0 >= 90) {
            ++field303;
            this.field304 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Z")
    private final boolean method127(int arg0) {
        ++field300;
        if (arg0 > -116) {
            field310 = null;
        }
        if (this.field304 != null) {
            return true;
        } else if (~this.field292 <= -1) {
            int var2 = class72.field1359;
            int var3 = class9.field179;
            int var4 = class228.field4122.method373((byte) 12, this.field292) ? 64 : 128;
            this.field304 = class228.field4122.method376(121, this.field292);
            this.field295 = var4;
            this.field308 = var4;
            class204.method1397(var2, (byte) -91, var3);
            return this.field304 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZLme;)V")
    public static final void method128(int arg0, boolean arg1, class163 arg2) {
        int var3 = arg2.field2929;
        ++field289;
        int var4 = (int) arg2.field1162;
        arg2.method349(0);
        if (arg1) {
            class170.method1117(var3, (byte) -34);
        }
        class110.method662(var3, -102);
        class43 var5 = class27.method186(1341, var4);
        if (var5 != null) {
            class141.method844((byte) 30, var5);
        }
        int var6 = class257.field4625;
        for (int var7 = arg0; var6 > var7; ++var7) {
            if (class56.method335(true, class122.field2147[var7])) {
                class95.method561(-72, var7);
            }
        }
        if (~class257.field4625 != -2) {
            class235.method1588(123, class24.field417, class52.field1023, class128.field2271, class176.field3167);
            int var8 = class239.field4326.method1308(class130.field2307);
            for (int var9 = 0; ~var9 > ~class257.field4625; ++var9) {
                int var10 = class239.field4326.method1308(class263.method1752(7021, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class176.field3167 = class257.field4625 * 15 + 22;
            class52.field1023 = var8 + 8;
        } else {
            class139.field2415 = false;
            class235.method1588(92, class24.field417, class52.field1023, class128.field2271, class176.field3167);
        }
        if (~class7.field138 != 0) {
            class114.method692(1, class7.field138, arg0 ^ 1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)I")
    public final int method129(int arg0) {
        ++field305;
        if (arg0 != 19275) {
            this.method127(14);
        }
        return this.field292;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)V")
    public static void method130(byte arg0) {
        field298 = null;
        field310 = null;
        if (arg0 >= 16) {
            field306 = null;
            field302 = null;
            field309 = null;
            field297 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field293;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508 && this.method127(arg1 ^ -124)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = this.field308 * (~class9.field179 != ~this.field295 ? this.field295 * arg0 / class9.field179 : arg0);
            int[] var7 = var3[2];
            if (class72.field1359 != this.field308) {
                for (int var8 = 0; ~class72.field1359 < ~var8; ++var8) {
                    int var9 = this.field308 * var8 / class72.field1359;
                    int var10 = this.field304[var6 + var9];
                    var7[var8] = class129.method777(var10, 255) << 4;
                    var4[var8] = class129.method777(var10 >> 4, 4080);
                    var5[var8] = class129.method777(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class72.field1359; ++var11) {
                    int var12 = this.field304[var6++];
                    var7[var11] = class129.method777(4080, var12 << 4);
                    var4[var11] = class129.method777(var12, 65280) >> 4;
                    var5[var11] = class129.method777(16711680, var12) >> 12;
                }
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field294;
        if (!arg2) {
            this.method129(123);
        }
        if (~arg1 == -1) {
            this.field292 = arg0.method1275(128);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Z")
    public static final boolean method132(int arg0, int arg1, int arg2) {
        if (arg0 >= -94) {
            field306 = null;
        }
        if (~arg2 == -12) {
            arg2 = 10;
        }
        ++field296;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class209 var3 = class34.method232(167, arg1);
        return var3.method1458(arg2, false);
    }
}
