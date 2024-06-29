import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class84 {

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!aa", name = "rb", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lae;")
    private class6 field34;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "[I")
    public static int[] field31 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lpe;")
    public static class109 field36 = class141.method1120("Wordpack geladen)3", 0);

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "Z")
    public static volatile boolean field33 = true;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Lpe;")
    public static class109 field30 = class141.method1120("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!aa", name = "vb", descriptor = "Z")
    public static boolean field48 = false;

    @OriginalMember(owner = "client!aa", name = "sb", descriptor = "Lpe;")
    private static class109 field45 = class141.method1120("This world is full)3", 0);

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Lpe;")
    public static class109 field29 = field45;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!aa", name = "qb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!aa", name = "xb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!aa", name = "tb", descriptor = "Lwf;")
    public static class159 field46;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILae;BI)V")
    public static final void method14(int arg0, int arg1, class6 arg2, byte arg3, int arg4) {
        field40++;
        if (class64.field1320 >= 50 || class8.field201 == 0 || (arg2.field137 == null || arg0 >= arg2.field137.length)) {
            return;
        }
        int var5 = arg2.field137[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class152.field3354[class64.field1320] = var6;
        int var7 = var5 >> 4 & 0x7;
        int var8 = (arg4 - 64) / 128;
        int var9 = var5 & 0xF;
        class43.field922[class64.field1320] = var7;
        int var10 = (arg1 - 64) / 128;
        class131.field2868[class64.field1320] = 0;
        if (arg3 >= -13) {
            method14(-66, -18, null, (byte) 31, 1);
        }
        class154.field3444[class64.field1320] = null;
        class137.field2998[class64.field1320] = (var8 << 16) + (var10 << 8) + var9;
        class64.field1320++;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field30 = null;
        field36 = null;
        field46 = null;
        field32 = null;
        field45 = null;
        field29 = null;
        int var1 = -6 / ((68 - arg0) / 51);
        field31 = null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)Lwb;")
    public final class155 method16(int arg0) {
        if (this.field34 != null) {
            int var2 = class12.field264 - this.field37;
            if (var2 > 100 && this.field34.field134 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field34.field164[this.field39]) {
                            break label51;
                        }
                        var2 -= this.field34.field164[this.field39];
                        this.field39++;
                    } while (this.field39 < this.field34.field144.length);
                    this.field39 -= this.field34.field134;
                } while (this.field39 >= 0 && this.field34.field144.length > this.field39);
                this.field34 = null;
            }
            this.field37 = class12.field264 - var2;
        }
        class148 var3 = class89.method736(this.field47, 11893);
        if (var3.field3229 != null) {
            var3 = var3.method1157(true);
        }
        field50++;
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field28 == 1 || this.field28 == 3) {
            var4 = var3.field3240;
            var5 = var3.field3268;
        } else {
            var4 = var3.field3268;
            var5 = var3.field3240;
        }
        int var6 = (var5 >> 1) + this.field44;
        int var7 = (var5 + 1 >> 1) + this.field44;
        int var8 = (var4 >> 1) + this.field38;
        int var9 = (var4 + 1 >> 1) + this.field38;
        int[][] var10 = class83.field1775[this.field41];
        int var11 = var10[var6][var9] + var10[var7][var8] + var10[var6][var8] + var10[var7][var9] >> 2;
        if (arg0 != 9698) {
            method14(-86, 90, null, (byte) 32, 91);
        }
        int var12 = (this.field38 << 7) + (var4 << 6);
        int var13 = (this.field44 << 7) + (var5 << 6);
        return var3.method1150(this.field39, this.field28, this.field34, -50, var13, var12, var11, this.field49, var10);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public static final void method17(int arg0, int arg1) {
        field51++;
        if (arg0 == -1) {
            return;
        }
        int var2 = -91 % ((-arg1 - 37) / 38);
        if (!class47.field981[arg0]) {
            return;
        }
        class108.field2263.method748(-41, arg0);
        if (class114.field2525[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class114.field2525[arg0].length; var4++) {
            if (class114.field2525[arg0][var4] != null) {
                if (class114.field2525[arg0][var4].field3476 == 2) {
                    var3 = false;
                } else {
                    class114.field2525[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class114.field2525[arg0] = null;
        }
        class47.field981[arg0] = false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)V")
    public static final void method18(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 != 19430) {
            method15((byte) -110);
        }
        field35++;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIIZLma;)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class84 arg8) {
        this.field38 = arg5;
        this.field47 = arg0;
        this.field28 = arg2;
        this.field41 = arg3;
        this.field49 = arg1;
        this.field44 = arg4;
        if (arg6 != -1) {
            this.field34 = class27.method238(8, arg6);
            this.field39 = 0;
            this.field37 = class12.field264 - 1;
            if (this.field34.field147 == 0 && arg8 != null && arg8 instanceof class2) {
                class2 var10 = (class2) arg8;
                if (this.field34 == var10.field34) {
                    this.field37 = var10.field37;
                    this.field39 = var10.field39;
                    return;
                }
            }
            if (arg7 && this.field34.field134 != -1) {
                this.field39 = (int) ((double) this.field34.field144.length * Math.random());
                this.field37 -= (int) (Math.random() * (double) this.field34.field164[this.field39]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILre;B)V")
    public static final void method19(int arg0, class123 arg1, byte arg2) {
        field43++;
        if (class124.field2752 != null) {
            class124.field2752.field309 = arg0 * 8 + 5;
            int var3 = class124.field2752.method112(false);
            int var4 = class124.field2752.method112(false);
            arg1.method993(true, var4, var3);
            return;
        }
        class38.method361(null, (byte) 124, 0, (byte) 0, 255, 255, true);
        if (arg2 != 80) {
            method14(14, -123, null, (byte) -45, -56);
        }
        class75.field1496[arg0] = arg1;
    }
}
