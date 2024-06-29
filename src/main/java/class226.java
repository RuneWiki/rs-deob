import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class226 extends class232 {

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "Lhd;")
    public static class117 field3765 = new class117(64);

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "Lok;")
    public static class146 field3777 = class235.method1724(-12908, "Cache:");

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "Lhd;")
    public static class117 field3775 = new class117(50);

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "Lok;")
    public class146 field3760;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "Loh;")
    public static class15 field3778;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "Lqj;")
    public static class246 field3774;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "[I")
    public int[] field3763;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "[I")
    public int[] field3766;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "[I")
    public int[] field3768;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "[I")
    public int[] field3770;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "[I")
    public static int[] field3776;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILwe;I)V", line = 7)
    private final void method1666(int arg0, class47 arg1, int arg2) {
        field3767++;
        if (arg2 != 0) {
            field3776 = (int[]) null;
        }
        if (arg0 == 1) {
            this.field3760 = arg1.method337(arg2 - 1);
        } else if (arg0 == 2) {
            int var4 = arg1.method368(arg2 - 122);
            this.field3763 = new int[var4];
            this.field3766 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3763[var5] = arg1.method379(class35.method255(arg2, -2));
                int var6 = arg1.method368(-98);
                if (var6 == 0) {
                    this.field3766[var5] = -1;
                } else {
                    this.field3766[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method368(arg2 - 120);
            this.field3768 = new int[var7];
            this.field3770 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3768[var8] = arg1.method379(arg2 - 2);
                int var9 = arg1.method368(arg2 ^ 0x33);
                if (var9 == 0) {
                    this.field3770[var8] = -1;
                } else {
                    this.field3770[var8] = var9;
                }
            }
        } else if (arg0 == 4) {
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I", line = 78)
    public final int method1667(int arg0, int arg1) {
        field3764++;
        if (this.field3768 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -20325) {
            return 118;
        }
        while (var3 < this.field3768.length) {
            if (this.field3770[var3] == arg0) {
                return this.field3768[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 116)
    public static final void method1668(long[] arg0, int arg1, Object[] arg2) {
        class300.method2115(arg0.length - 1, 17965, arg0, arg1, arg2);
        field3759++;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 125)
    public static void method1669(int arg0) {
        field3774 = null;
        if (arg0 != -5) {
            field3765 = (class117) null;
        }
        field3765 = null;
        field3775 = null;
        field3777 = null;
        field3778 = null;
        field3776 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIII)V", line = 140)
    public static final void method1670(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3771++;
        if (class151.field2564 <= arg3 && arg3 <= class126.field2058) {
            int var5 = class21.method153(-119, arg4, class123.field2008, class318.field5394);
            int var6 = class21.method153(-119, arg2, class123.field2008, class318.field5394);
            class25.method170(arg3, arg0, var6, -1, var5);
        }
        if (arg1 <= 67) {
            field3772 = -110;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)I", line = 159)
    public final int method1671(int arg0, int arg1) {
        field3762++;
        if (this.field3763 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -1) {
            field3774 = (class246) null;
        }
        while (var3 < this.field3763.length) {
            if (this.field3766[var3] == arg0) {
                return this.field3763[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLwe;)V", line = 191)
    public final void method1672(byte arg0, class47 arg1) {
        while (true) {
            int var3 = arg1.method368(-101);
            if (var3 == 0) {
                field3761++;
                int var4 = -18 / ((arg0) / 46);
                return;
            }
            this.method1666(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 208)
    public final void method1673(int arg0) {
        if (this.field3768 != null) {
            for (int var2 = 0; var2 < this.field3768.length; var2++) {
                this.field3768[var2] = class138.method1013(this.field3768[var2], 32768);
            }
        }
        if (this.field3763 != null) {
            for (int var3 = 0; var3 < this.field3763.length; var3++) {
                this.field3763[var3] = class138.method1013(this.field3763[var3], 32768);
            }
        }
        field3769++;
        if (arg0 != 64) {
            field3772 = 114;
        }
    }
}
