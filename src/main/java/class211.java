import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class211 extends class183 {

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field3625 = -1;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Ljf;")
    private static class229 field3632 = class212.method1457((byte) 122, "Continue");

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field3628 = -2;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Ljf;")
    public static class229 field3630 = field3632;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lbm;")
    public static class138 field3636;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lek;")
    public static class185 field3627;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "[S")
    public static short[] field3637;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 11)
    public class211() {
        this(4096);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V", line = 24)
    public static void method1449(byte arg0) {
        field3636 = null;
        field3630 = null;
        field3637 = null;
        int var1 = 83 / ((arg0 - 74) / 51);
        field3627 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)[I", line = 44)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            method1451(false, -101);
        }
        field3624++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            class36.method319(var3, 0, class22.field393, this.field3633);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)V", line = 78)
    public static final void method1450(byte arg0) {
        if (arg0 != -28) {
            field3637 = (short[]) null;
        }
        field3623++;
        class26.field469.method230(true);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I", line = 90)
    public static final int method1451(boolean arg0, int arg1) {
        long var2 = class153.method1032(108);
        field3635++;
        if (arg1 >= -82) {
            field3634 = 71;
        }
        for (class223 var4 = arg0 ? (class223) class298.field5082.method1884((byte) 122) : (class223) class298.field5082.method1886(-118); var4 != null; var4 = (class223) class298.field5082.method1886(-128)) {
            if (var2 > (var4.field3808 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3808 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4265;
                    class286.field4908[var5] = class28.field497[var5];
                    var4.method1747((byte) -125);
                    return var5;
                }
                var4.method1747((byte) -57);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V", line = 127)
    private class211(int arg0) {
        super(0, true);
        this.field3633 = 4096;
        this.field3633 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([IIIIII)V", line = 157)
    public static final void method1452(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class125 var6 = class312.field5246[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class102 var7 = var6.field2187;
        if (var7 != null) {
            int var8 = var7.field1770;
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
        class285 var10 = var6.field2188;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4891;
        int var12 = var10.field4902;
        int var13 = var10.field4892;
        int var14 = var10.field4898;
        int[] var15 = class142.field2461[var11];
        int[] var16 = class143.field2488[var12];
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

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILkh;I)V", line = 249)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field3629++;
        if (arg2 == 0) {
            this.field3633 = (arg1.method93(false) << 12) / 255;
        }
        if (arg0 > -43) {
            field3627 = (class185) null;
        }
    }
}
