import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 extends class105 {

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    private int field1119 = 0;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    private int field1125 = 2000;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    private int field1124 = 4096;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    private int field1130 = 16;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Leh;")
    public static class47 field1118 = class195.method1282((byte) -4, "http:)4)4");

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "[[[B")
    public static byte[][][] field1129;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lah;ZLah;Lah;Lah;)V")
    public static final void method492(class9 arg0, boolean arg1, class9 arg2, class9 arg3, class9 arg4) {
        class170.field3293 = arg0;
        ++field1120;
        if (!arg1) {
            method492((class9) null, true, (class9) null, (class9) null, (class9) null);
        }
        class108.field2246 = arg4;
        class106.field2218 = arg2;
        class91.field1918 = arg3;
        class51.field986 = new class61[class106.field2218.method71((byte) -17)][];
        class37.field733 = new boolean[class106.field2218.method71((byte) 96)];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field1131;
        int[] var3 = super.field2192.method336(-63, arg0);
        if (arg1 <= 78) {
            this.field1125 = 17;
        }
        if (super.field2192.field770) {
            int var4 = this.field1124 >> 1;
            int[][] var5 = super.field2192.method334(-115);
            Random var6 = new Random((long) this.field1121);
            for (int var7 = 0; ~var7 > ~this.field1125; ++var7) {
                int var8 = ~this.field1124 >= -1 ? this.field1119 : this.field1119 - var4 - -class51.method452(false, this.field1124, var6);
                int var9 = class51.method452(false, class149.field2928, var6);
                int var10 = class51.method452(false, class120.field2422, var6);
                int var11 = (4084 & var8) >> 4;
                int var12 = var9 - -(class72.field1551[var11] * this.field1130 >> 12);
                int var13 = (class192.field3717[var11] * this.field1130 >> 12) + var10;
                int var14 = -var10 + var13;
                int var15 = -var9 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var9;
                        var9 = var10;
                        var10 = var18;
                    }
                    if (~var9 < ~var12) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var10;
                        var10 = var13;
                        var13 = var20;
                    }
                    int var21 = -var9 + var12;
                    int var22 = var10;
                    int var23 = -var21 / 2;
                    int var24 = -var10 + var13;
                    int var25 = 2048 / var21;
                    int var26 = -(class51.method452(false, 4096, var6) >> 2) + 1024;
                    int var27 = ~var13 < ~var10 ? 1 : -1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    for (int var28 = var9; var28 < var12; ++var28) {
                        int var29 = (-var9 + var28) * var25 + var26 + 1024;
                        var23 += var24;
                        int var30 = class121.field2453 & var28;
                        int var31 = class122.field2468 & var22;
                        if (var23 > 0) {
                            var23 += -var21;
                            var22 += var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        class185.method1227((byte) -75);
        ++field1123;
        if (arg0 != -1) {
            this.field1125 = -125;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
    public static final boolean method493(int arg0, int arg1) {
        ++field1126;
        if (class37.field733[arg0]) {
            return true;
        } else if (!class106.field2218.method73(arg0, false)) {
            return false;
        } else {
            int var2 = class106.field2218.method68(arg1 ^ 2093369663, arg0);
            if (arg1 != 2093369712) {
                return true;
            } else if (var2 == 0) {
                class37.field733[arg0] = true;
                return true;
            } else {
                if (class51.field986[arg0] == null) {
                    class51.field986[arg0] = new class61[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class51.field986[arg0][var3] == null) {
                        byte[] var4 = class106.field2218.method67(arg0, arg1 ^ -2093369713, var3);
                        if (var4 != null) {
                            class51.field986[arg0][var3] = new class61();
                            class51.field986[arg0][var3].field1211 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                class51.field986[arg0][var3].method521((byte) 114, new class68(var4));
                            } else {
                                class51.field986[arg0][var3].method513(arg1 + -2093369689, new class68(var4));
                            }
                        }
                    }
                }
                class37.field733[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1118 = null;
        if (arg0 <= 8) {
            method492((class9) null, false, (class9) null, (class9) null, (class9) null);
        }
        field1129 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
    public static int method495(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            method493(-28, -68);
        }
        ++field1132;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field1124 = arg1.method569(26496);
                        }
                    } else {
                        this.field1119 = arg1.method569(26496);
                    }
                } else {
                    this.field1130 = arg1.method604((byte) 79);
                }
            } else {
                this.field1125 = arg1.method569(arg2 + 26752);
            }
        } else {
            this.field1121 = arg1.method604((byte) -125);
        }
    }
}
