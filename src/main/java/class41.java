import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class41 extends class273 {

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    private int field919 = 0;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    private int field932 = 4096;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "Ljd;")
    private static class86 field923 = class122.method868("scroll:", true);

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "Ljd;")
    public static class86 field925 = field923;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "Ljd;")
    public static class86 field930 = field923;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "Ljd;")
    private static class86 field929 = class122.method868("Please wait)3)3)3", true);

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "Ljd;")
    public static class86 field928 = field929;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "Ljd;")
    public static class86 field935 = class122.method868(" )2> <col=ff9040>", true);

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "Ljd;")
    public static class86 field933 = class122.method868("Lade Wordpack )2 ", true);

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field931 = 5063219;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "[[[B")
    public static byte[][][] field922;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static final void method335(int arg0) {
        class88.field1739.method702((byte) -88);
        ++field924;
        if (arg0 != -18727) {
            field929 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)V")
    public static final void method336(byte arg0) {
        for (class1 var1 = (class1) class1.field15.method1709(-14); var1 != null; var1 = (class1) class1.field15.method1704(-92)) {
            int var2 = var1.field2;
            if (class179.method1258(var2, (byte) -36)) {
                boolean var3 = true;
                class6[] var4 = class108.field2070[var2];
                for (int var5 = 0; var4.length > var5; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field217;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3759;
                    class6 var7 = class25.method178(98, var6);
                    if (var7 != null) {
                        class62.method441(arg0 ^ -29505, var7);
                    }
                }
            }
        }
        if (arg0 != 104) {
            field922 = null;
        }
        ++field927;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static void method337(int arg0) {
        field935 = null;
        field930 = null;
        field933 = null;
        field929 = null;
        field928 = null;
        if (arg0 == -1) {
            field923 = null;
            field922 = null;
            field925 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class41() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = 25 / ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -122);
        ++field926;
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var4[2];
            int[] var9 = var5[0];
            int[] var10 = var4[1];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class176.field3200; ++var12) {
                int var13 = var9[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (~this.field919 < ~var13) {
                    var11[var12] = this.field919;
                } else if (var13 <= this.field932) {
                    var11[var12] = var13;
                } else {
                    var11[var12] = this.field932;
                }
                if (var15 < this.field919) {
                    var10[var12] = this.field919;
                } else if (~this.field932 > ~var15) {
                    var10[var12] = this.field932;
                } else {
                    var10[var12] = var15;
                }
                if (~var14 > ~this.field919) {
                    var8[var12] = this.field919;
                } else if (this.field932 < var14) {
                    var8[var12] = this.field932;
                } else {
                    var8[var12] = var14;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (arg2 < -16) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        super.field4778 = arg1.method1408((byte) -31) == 1;
                    }
                } else {
                    this.field932 = arg1.method1410(-76);
                }
            } else {
                this.field919 = arg1.method1410(-115);
            }
            ++field920;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field921;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(-114, 0, arg1);
            for (int var5 = 0; ~class176.field3200 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field919) {
                    var3[var5] = this.field919;
                } else if (~var6 < ~this.field932) {
                    var3[var5] = this.field932;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != -7420) {
            field933 = null;
        }
        return var3;
    }
}
