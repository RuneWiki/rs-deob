import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class75 extends class167 {

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    private int field1422 = -1;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "Lkh;")
    private static class117 field1425 = class224.method1450((byte) 24, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
    public static int field1433 = 1;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lkh;")
    public static class117 field1416 = class224.method1450((byte) 127, "overlay)3dat");

    @OriginalMember(owner = "client!gi", name = "ob", descriptor = "Lkh;")
    private static class117 field1434 = class224.method1450((byte) 117, "Checking for updates )2 ");

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "Lkh;")
    public static class117 field1432 = field1434;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "Lkh;")
    public static class117 field1429 = field1425;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "[I")
    public static int[] field1427 = new int[5];

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "[I")
    private int[] field1424;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "[[[I")
    public static int[][][] field1423;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lcf;IIIIII)Lcf;")
    public static final class29 method522(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1413;
        if (arg5 != 23836) {
            field1427 = null;
        }
        long var7 = (long) arg6;
        class29 var9 = (class29) class26.field653.method412(arg5 + -23724, var7);
        if (var9 == null) {
            class15 var10 = class15.method143(class78.field1483, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method159(64, 768, -50, -10, -50);
            class26.field653.method408((byte) -57, var9, var7);
        }
        int var11 = arg0.method244();
        int var12 = arg0.method243();
        int var13 = arg0.method251();
        int var14 = arg0.method246();
        class29 var15 = var9.method250(true, true);
        if (~arg1 != -1) {
            var15.method242(arg1);
        }
        class107 var16 = (class107) var15;
        if (class186.method1265(true, arg4 - -var13, class203.field3675, arg2 + var11) != arg3 || class186.method1265(true, arg4 - -var14, class203.field3675, arg2 + var12) != arg3) {
            for (int var17 = 0; ~var17 > ~var16.field1970; ++var17) {
                var16.field1969[var17] += -arg3 + class186.method1265(true, var16.field1948[var17] + arg4, class203.field3675, var16.field1953[var17] + arg2);
            }
            var16.field1959 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957 && this.method524(3986)) {
            int var4 = (class57.field1185 != this.field1417 ? this.field1417 * arg0 / class57.field1185 : arg0) * this.field1415;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class115.field2146 == this.field1415) {
                for (int var8 = 0; ~class115.field2146 < ~var8; ++var8) {
                    int var9 = this.field1424[var4++];
                    var7[var8] = class209.method1370(4080, var9 << 4);
                    var6[var8] = class209.method1370(65280, var9) >> 4;
                    var5[var8] = class209.method1370(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class115.field2146; ++var10) {
                    int var11 = this.field1415 * var10 / class115.field2146;
                    int var12 = this.field1424[var4 + var11];
                    var7[var10] = class209.method1370(var12, 255) << 4;
                    var6[var10] = class209.method1370(var12 >> 4, 4080);
                    var5[var10] = class209.method1370(var12 >> 12, 4080);
                }
            }
        }
        ++field1420;
        if (arg1 != -9179) {
            field1429 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
    public final int method523(int arg0) {
        ++field1419;
        if (arg0 != 21556) {
            field1431 = -56;
        }
        return this.field1422;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Z")
    private final boolean method524(int arg0) {
        ++field1430;
        if (this.field1424 != null) {
            return true;
        } else if (~this.field1422 <= -1) {
            int var2 = class115.field2146;
            int var3 = class57.field1185;
            int var4 = !class114.field2124.method536(this.field1422, 32) ? 128 : 64;
            this.field1424 = class114.field2124.method537(this.field1422, arg0 ^ -3987);
            this.field1417 = var4;
            this.field1415 = var4;
            class25.method222(var2, -1, var3);
            return this.field1424 != null;
        } else {
            return arg0 != 3986;
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public final void method525(int arg0) {
        ++field1421;
        super.method525(arg0);
        this.field1424 = null;
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1434 = null;
        field1416 = null;
        field1429 = null;
        field1425 = null;
        field1432 = null;
        field1423 = null;
        if (arg0 != -4301) {
            field1432 = null;
        }
        field1427 = null;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        ++field1426;
        if (class82.field1543) {
            class9 var1 = class101.method686(127, class30.field717, class105.field1913);
            if (var1 != null && var1.field176 != null) {
                class51 var2 = new class51();
                var2.field1048 = var1.field176;
                var2.field1046 = var1;
                class102.method689(var2, arg0 + -146);
            }
            class82.field1543 = false;
            if (arg0 != 65) {
                method527((byte) 27);
            }
            class62.method457(var1, 0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1422 = arg0.method1049((byte) 97);
        }
        ++field1428;
        if (arg1) {
            this.method51((class145) null, false, -53);
        }
    }
}
