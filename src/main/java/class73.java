import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class73 extends class135 {

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    private int field1053 = 4096;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    private int field1054 = 4096;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field1050 = 4096;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field1052 = 0;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "Lqj;")
    public static class196 field1055 = class80.method502("p12_full", -48);

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJ)V")
    public static final void method464(byte arg0, long arg1) {
        int var3 = 118 / ((arg0 - -35) / 57);
        ++field1051;
        if (arg1 > 0L) {
            if (arg1 % 10L != 0L) {
                class142.method879(arg1, 2);
            } else {
                class142.method879(arg1 - 1L, 2);
                class142.method879(1L, 2);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1054 = arg0.method318(true);
                }
            } else {
                this.field1053 = arg0.method318(true);
            }
        } else {
            this.field1050 = arg0.method318(true);
        }
        if (arg2 == -16231) {
            ++field1061;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            method467(-20, false, (class196) null);
        }
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(arg0 ^ 260028741, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class131.field1862; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field1050 * var12 >> 12;
                    var9[var11] = this.field1053 * var13 >> 12;
                    var10[var11] = this.field1054 * var14 >> 12;
                } else {
                    var8[var11] = this.field1050;
                    var9[var11] = this.field1053;
                    var10[var11] = this.field1054;
                }
            }
        }
        ++field1049;
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z[B)V")
    public static final void method465(boolean arg0, byte[] arg1) {
        ++field1056;
        class56 var2 = new class56(arg1);
        var2.field699 = arg1.length - 2;
        class76.field1102 = var2.method318(true);
        class30.field385 = new byte[class76.field1102][];
        class77.field1126 = new int[class76.field1102];
        class240.field4261 = new int[class76.field1102];
        class203.field3645 = new byte[class76.field1102][];
        class234.field4169 = new int[class76.field1102];
        class94.field1375 = new boolean[class76.field1102];
        class31.field392 = new int[class76.field1102];
        var2.field699 = -(class76.field1102 * 8) + -7 + arg1.length;
        class149.field2391 = var2.method318(true);
        class92.field1347 = var2.method318(true);
        int var3 = (255 & var2.method367(1)) + 1;
        for (int var4 = 0; ~class76.field1102 < ~var4; ++var4) {
            class234.field4169[var4] = var2.method318(!arg0);
        }
        for (int var5 = 0; var5 < class76.field1102; ++var5) {
            class240.field4261[var5] = var2.method318(!arg0);
        }
        for (int var6 = 0; var6 < class76.field1102; ++var6) {
            class77.field1126[var6] = var2.method318(true);
        }
        for (int var7 = 0; ~var7 > ~class76.field1102; ++var7) {
            class31.field392[var7] = var2.method318(true);
        }
        var2.field699 = arg1.length - 7 + -(class76.field1102 * 8) + 3 + -(var3 * 3);
        class84.field1237 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class84.field1237[var8] = var2.method328(-1974);
            if (class84.field1237[var8] == 0) {
                class84.field1237[var8] = 1;
            }
        }
        var2.field699 = 0;
        if (!arg0) {
            for (int var9 = 0; ~class76.field1102 < ~var9; ++var9) {
                int var10 = class77.field1126[var9];
                int var11 = class31.field392[var9];
                int var12 = var10 * var11;
                byte[] var13 = new byte[var12];
                byte[] var14 = new byte[var12];
                class203.field3645[var9] = var13;
                class30.field385[var9] = var14;
                boolean var15 = false;
                int var16 = var2.method367(1);
                if ((var16 & 1) == 0) {
                    for (int var17 = 0; ~var12 < ~var17; ++var17) {
                        var13[var17] = var2.method350(16);
                    }
                    if ((var16 & 2) != 0) {
                        for (int var18 = 0; var12 > var18; ++var18) {
                            byte var19 = var14[var18] = var2.method350(16);
                            var15 |= var19 != -1;
                        }
                    }
                } else {
                    int var20 = 0;
                    label111: while (true) {
                        if (var20 >= var10) {
                            if (~(2 & var16) == -1) {
                                break;
                            }
                            int var21 = 0;
                            while (true) {
                                if (var21 >= var10) {
                                    break label111;
                                }
                                for (int var22 = 0; var22 < var11; ++var22) {
                                    byte var23 = var14[var10 * var22 + var21] = var2.method350(16);
                                    var15 |= ~var23 != 0;
                                }
                                ++var21;
                            }
                        }
                        for (int var24 = 0; var11 > var24; ++var24) {
                            var13[var20 - -(var10 * var24)] = var2.method350(16);
                        }
                        ++var20;
                    }
                }
                class94.field1375[var9] = var15;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static void method466(byte arg0) {
        field1055 = null;
        if (arg0 < 17) {
            field1052 = 99;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZLqj;)V")
    public static final void method467(int arg0, boolean arg1, class196 arg2) {
        class196 var3 = arg2.method1292(32);
        ++field1059;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~class192.field3372; ++var6) {
            class202 var9 = class178.method1154(false, var6);
            if ((!arg1 || var9.field3573) && var9.field3640 == -1 && ~var9.field3619 == 0 && var9.field3583 == 0 && ~var9.field3613.method1292(32).method1333(var3, 0) != 0) {
                if (var5 >= 250) {
                    class210.field3781 = null;
                    class28.field346 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class136.field1976 = 0;
        class210.field3781 = var4;
        class28.field346 = var5;
        class196[] var7 = new class196[class28.field346];
        for (int var8 = 0; class28.field346 > var8; ++var8) {
            var7[var8] = class178.method1154(false, var4[var8]).field3613;
        }
        class113.method685((byte) -58, var7, class210.field3781);
        if (arg0 <= 92) {
            field1052 = 110;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILic;)V")
    public static final void method468(int arg0, class134 arg1) {
        ++field1058;
        class72 var2 = (class72) class35.field423.method1551(32768, arg1.field1924.method1330(arg0 + -4096));
        if (var2 != null) {
            if (var2.field1019 != null) {
                class161.field2589.method690(var2.field1019);
                var2.field1019 = null;
            }
            var2.method797((byte) 127);
        }
        if (arg0 != 4096) {
            method466((byte) -34);
        }
    }
}
