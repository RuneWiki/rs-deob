import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class99 extends class107 {

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lpj;")
    public static class237 field1763 = class33.method353("m", 117);

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Lpj;")
    public static class237 field1764 = class33.method353("hint_mapedge", 101);

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Lci;")
    public static class233 field1765 = new class233(64);

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[[[I")
    public static int[][][] field1773;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
    public static void method757(int arg0) {
        field1765 = null;
        field1773 = null;
        field1764 = null;
        field1763 = null;
        if (arg0 != 0) {
            method757(-96);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field1767;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int[] var4 = this.method797(0, arg1, (byte) 118);
            int[] var5 = this.method797(1, arg1, (byte) -45);
            int[] var6 = this.method797(2, arg1, (byte) 106);
            for (int var7 = 0; class106.field1862 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        if (arg0 != -17) {
            method757(-70);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class99() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            super.field1897 = arg0.method316((byte) 114) == 1;
        }
        ++field1766;
        if (arg2 != -32513) {
            field1764 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
    public static final void method758(int arg0) {
        ++field1769;
        class65.field1288.method356(false);
        int var1 = class65.field1288.method358(200, 8);
        if (~var1 > ~class89.field1636) {
            for (int var2 = var1; ~var2 > ~class89.field1636; ++var2) {
                class15.field252[class124.field2179++] = class263.field4498[var2];
            }
        }
        if (var1 > class89.field1636) {
            throw new RuntimeException("gnpov1");
        } else {
            class89.field1636 = arg0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class263.field4498[var3];
                class210 var5 = class232.field4022[var4];
                int var6 = class65.field1288.method358(arg0 ^ 200, 1);
                if (~var6 == -1) {
                    class263.field4498[class89.field1636++] = var4;
                    var5.field3692 = class241.field4246;
                } else {
                    int var7 = class65.field1288.method358(200, 2);
                    if (var7 == 0) {
                        class263.field4498[class89.field1636++] = var4;
                        var5.field3692 = class241.field4246;
                        class117.field2062[class155.field2752++] = var4;
                    } else if (~var7 == -2) {
                        class263.field4498[class89.field1636++] = var4;
                        var5.field3692 = class241.field4246;
                        int var8 = class65.field1288.method358(200, 3);
                        var5.method1442(var8, 0, false);
                        int var9 = class65.field1288.method358(arg0 + 200, 1);
                        if (var9 == 1) {
                            class117.field2062[class155.field2752++] = var4;
                        }
                    } else if (var7 == 2) {
                        class263.field4498[class89.field1636++] = var4;
                        var5.field3692 = class241.field4246;
                        int var10 = class65.field1288.method358(200, 3);
                        var5.method1442(var10, 0, true);
                        int var11 = class65.field1288.method358(200, 3);
                        var5.method1442(var11, 0, true);
                        int var12 = class65.field1288.method358(arg0 + 200, 1);
                        if (~var12 == -2) {
                            class117.field2062[class155.field2752++] = var4;
                        }
                    } else if (var7 == 3) {
                        class15.field252[class124.field2179++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public static final void method759(int arg0, int arg1) {
        ++field1768;
        int var2 = -39 % ((arg1 - -55) / 58);
        class270 var3 = class202.method1368(-15, 3, arg0);
        var3.method1795(-2113);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int var3 = -49 % ((26 - arg0) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        ++field1771;
        if (super.field1903.field1551) {
            int[] var5 = this.method797(2, arg1, (byte) 127);
            int[][] var6 = this.method802(3, arg1, 0);
            int[][] var7 = this.method802(3, arg1, 1);
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var6[0];
            int[] var11 = var4[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class106.field1862 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var11[var17] = var10[var17];
                    var8[var17] = var12[var17];
                    var9[var17] = var13[var17];
                } else if (~var18 != -1) {
                    int var19 = -var18 + 4096;
                    var11[var17] = var10[var17] * var18 + var15[var17] * var19 >> 12;
                    var8[var17] = var12[var17] * var18 - -(var14[var17] * var19) >> 12;
                    var9[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                } else {
                    var11[var17] = var15[var17];
                    var8[var17] = var14[var17];
                    var9[var17] = var16[var17];
                }
            }
        }
        return var4;
    }
}
