import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class96 extends class23 {

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Z")
    public static boolean field1722 = false;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "[I")
    public static int[] field1729 = new int[128];

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "[Luk;")
    public static class87[] field1721 = new class87[27];

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "Z")
    public static boolean field1728 = true;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field1733 = -1;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "Lqd;")
    public static class40 field1725 = class147.method1106("<col=ffffff>", (byte) -57);

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "[S")
    public static short[] field1736 = new short[256];

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "[Lda;")
    public static class114[] field1724;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "[Lcm;")
    public static class185[] field1738;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V", line = 4)
    public static final void method717(int arg0) {
        field1732++;
        class60.method504(0, 0, 20789);
        int var1 = 76 / ((arg0 + 6) / 58);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[[I", line = 16)
    public final int[][] method17(int arg0, int arg1) {
        if (arg0 <= 30) {
            this.method718(false, 115);
        }
        field1730++;
        int[][] var3 = this.field417.method1251(arg1, 120);
        if (this.field417.field2751) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class52.field1007; var7++) {
                var4[var7] = this.field1735;
                var6[var7] = this.field1723;
                var5[var7] = this.field1737;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 56)
    private class96(int arg0) {
        super(0, false);
        this.method718(true, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V", line = 70)
    private final void method718(boolean arg0, int arg1) {
        this.field1723 = (arg1 & 0xFF00) >> 4;
        if (arg0) {
            field1731++;
            this.field1735 = arg1 >> 12 & 0xFF0;
            this.field1737 = (arg1 & 0xFF) << 4;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([IIIIII)V", line = 84)
    public static final void method719(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class14 var6 = class93.field1690[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class30 var7 = var6.field220;
        if (var7 != null) {
            int var8 = var7.field631;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class113 var10 = var6.field231;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1955;
        int var12 = var10.field1960;
        int var13 = var10.field1967;
        int var14 = var10.field1973;
        int[] var15 = class284.field4776[var11];
        int[] var16 = class43.field812[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V", line = 176)
    public static void method720(boolean arg0) {
        field1736 = null;
        field1725 = null;
        field1724 = null;
        if (!arg0) {
            field1729 = null;
            field1738 = null;
            field1721 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V", line = 221)
    public static final void method721(long arg0, int arg1) {
        field1726++;
        try {
            if (arg1 < 21) {
                return;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILsd;)V", line = 243)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field1734++;
        if (arg1 != 0) {
            field1721 = (class87[]) null;
        }
        if (arg0 == 0) {
            this.method718(true, arg2.method244(-26711));
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 268)
    public class96() {
        this(0);
    }
}
