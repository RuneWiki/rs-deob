import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class161 extends class264 {

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "I")
    private int field2457 = 4096;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "Lma;")
    private static class5 field2456 = class12.method119("Select", (byte) 52);

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Lma;")
    public static class5 field2451 = field2456;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "Lbf;")
    public static class209 field2453 = new class209(16);

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "I")
    public static int field2460 = -1;

    @OriginalMember(owner = "client!we", name = "qb", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!we", name = "pb", descriptor = "Lel;")
    public static class218 field2461 = new class218();

    @OriginalMember(owner = "client!we", name = "sb", descriptor = "Lma;")
    public static class5 field2464 = class12.method119(")3", (byte) 92);

    @OriginalMember(owner = "client!we", name = "rb", descriptor = "F")
    public static float field2463;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!we", name = "tb", descriptor = "[[B")
    public static byte[][] field2465;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILii;)V", line = 16)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            field2464 = (class5) null;
        }
        if (arg0 == 0) {
            this.field2452 = arg2.method1524((byte) 61);
        } else if (arg0 == 1) {
            this.field2457 = arg2.method1524((byte) 95);
        } else if (arg0 == 2) {
            this.field4496 = arg2.method1509(true) == 1;
        }
        field2454++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I", line = 65)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            return (int[]) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 125);
        field2455++;
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, 110);
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                int var6 = var4[var5];
                if (this.field2452 > var6) {
                    var3[var5] = this.field2452;
                } else if (this.field2457 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field2457;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V", line = 106)
    public static void method1063(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2464 = null;
        field2453 = null;
        field2461 = null;
        field2451 = null;
        field2456 = null;
        field2465 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 136)
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(BI)[[I", line = 140)
    public final int[][] method138(byte arg0, int arg1) {
        field2459++;
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        int var4 = 110 % ((arg0 + 43) / 55);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-71, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            for (int var12 = 0; var12 < class226.field3716; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var11[var12];
                if (var13 < this.field2452) {
                    var9[var12] = this.field2452;
                } else if (var13 > this.field2457) {
                    var9[var12] = this.field2457;
                } else {
                    var9[var12] = var13;
                }
                if (var14 < this.field2452) {
                    var8[var12] = this.field2452;
                } else if (var14 > this.field2457) {
                    var8[var12] = this.field2457;
                } else {
                    var8[var12] = var14;
                }
                if (var15 < this.field2452) {
                    var10[var12] = this.field2452;
                } else if (var15 <= this.field2457) {
                    var10[var12] = var15;
                } else {
                    var10[var12] = this.field2457;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Lcd;", line = 228)
    public static final class122 method1064(int arg0, int arg1) {
        field2458++;
        class122 var2 = (class122) class206.field3277.method521((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        int var3 = -47 % ((-arg1 - 42) / 45);
        byte[] var4 = class37.field586.method1342(-100, 3, arg0);
        class122 var5 = new class122();
        if (var4 != null) {
            var5.method803(120, new class221(var4));
        }
        class206.field3277.method519((byte) -95, var5, (long) arg0);
        return var5;
    }
}
