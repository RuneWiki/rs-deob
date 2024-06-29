import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class217 extends class232 {

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
    private int field3769 = 0;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    private int field3765 = 4096;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "Lhi;")
    public static class82 field3767 = class95.method664((byte) -71, "clignotant1:");

    @OriginalMember(owner = "client!cn", name = "V", descriptor = "Lhi;")
    private static class82 field3771 = class95.method664((byte) -55, "Loading)3)3)3");

    @OriginalMember(owner = "client!cn", name = "Z", descriptor = "Lhi;")
    public static class82 field3775 = field3771;

    @OriginalMember(owner = "client!cn", name = "ab", descriptor = "Lhi;")
    public static class82 field3776 = class95.method664((byte) -63, "::cardmem");

    @OriginalMember(owner = "client!cn", name = "bb", descriptor = "Lhi;")
    public static class82 field3777 = class95.method664((byte) -37, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!cn", name = "X", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!cn", name = "cb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!cn", name = "db", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!cn", name = "eb", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "Lum;")
    public static class222 field3766;

    @OriginalMember(owner = "client!cn", name = "Y", descriptor = "Lum;")
    public static class222 field3774;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)V", line = 26)
    public static void method1544(int arg0) {
        field3775 = null;
        field3771 = null;
        field3777 = null;
        field3767 = null;
        if (arg0 >= 10) {
            field3774 = null;
            field3776 = null;
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 184)
    public class217() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)[[I", line = 49)
    public final int[][] method146(int arg0, byte arg1) {
        field3780++;
        if (arg1 != -82) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var12 < this.field3769) {
                    var8[var11] = this.field3769;
                } else if (this.field3765 < var12) {
                    var8[var11] = this.field3765;
                } else {
                    var8[var11] = var12;
                }
                if (this.field3769 > var13) {
                    var9[var11] = this.field3769;
                } else if (var13 <= this.field3765) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field3765;
                }
                if (var14 < this.field3769) {
                    var10[var11] = this.field3769;
                } else if (this.field3765 < var14) {
                    var10[var11] = this.field3765;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIBIII)V", line = 132)
    public static final void method1545(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3768++;
        int var7 = class163.method1179(arg1, class29.field399, class60.field931, (byte) -68);
        int var8 = class163.method1179(arg5, class29.field399, class60.field931, (byte) -76);
        int var9 = class163.method1179(arg2, class207.field3623, class200.field3443, (byte) -84);
        int var10 = class163.method1179(arg6, class207.field3623, class200.field3443, (byte) -111);
        int var11 = class163.method1179(arg0 + arg1, class29.field399, class60.field931, (byte) -69);
        int var12 = class163.method1179(arg5 - arg0, class29.field399, class60.field931, (byte) -70);
        for (int var13 = var7; var13 < var11; var13++) {
            class114.method780(-122, var9, var10, arg4, class73.field1117[var13]);
        }
        int var14 = var8;
        if (arg3 <= 84) {
            return;
        }
        while (var12 < var14) {
            class114.method780(123, var9, var10, arg4, class73.field1117[var14]);
            var14--;
        }
        int var15 = class163.method1179(arg2 + arg0, class207.field3623, class200.field3443, (byte) -116);
        int var16 = class163.method1179(arg6 - arg0, class207.field3623, class200.field3443, (byte) -87);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class73.field1117[var17];
            class114.method780(-33, var9, var15, arg4, var18);
            class114.method780(125, var16, var10, arg4, var18);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLbc;)V", line = 199)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            this.method80(48, (byte) 11);
        }
        field3773++;
        if (arg0 == 0) {
            this.field3769 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field3765 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field3990 = arg2.method1082(arg1 - 104) == 1;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IB)[I", line = 259)
    public final int[] method80(int arg0, byte arg1) {
        field3770++;
        int var3 = -22 / ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -101, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(0, (byte) 85, arg0);
            for (int var6 = 0; var6 < class54.field858; var6++) {
                int var7 = var5[var6];
                if (var7 < this.field3769) {
                    var4[var6] = this.field3769;
                } else if (this.field3765 >= var7) {
                    var4[var6] = var7;
                } else {
                    var4[var6] = this.field3765;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILhi;)I", line = 308)
    public static final int method1546(int arg0, class82 arg1) {
        field3779++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == 1) {
            for (int var2 = 0; var2 < class90.field1632; var2++) {
                if (arg1.method543(class222.field3882[var2], (byte) 88)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -79;
        }
    }
}
