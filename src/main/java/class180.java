import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class180 extends class135 {

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    private int field3175 = 409;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    private int field3182 = 4096;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    private int field3184 = 4096;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "[I")
    private int[] field3180 = new int[3];

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "I")
    private int field3187 = 4096;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "Z")
    public static volatile boolean field3179 = false;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLqj;I)V")
    public static final void method1179(byte arg0, class196 arg1, int arg2) {
        ++field3181;
        class172 var3 = class14.method62(-1204912992, 2, arg2);
        var3.method1125(0);
        var3.field2907 = arg1;
        if (arg0 >= -40) {
            method1183((byte) 125);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        ++field3178;
        if (class134.field1928 != null) {
            class134.field1928.detach();
        }
        class66.method425(class52.field643, -3408);
        class225.method1521((byte) -113, class52.field643);
        if (class104.field1506 != null) {
            class104.field1506.method14(true, class52.field643);
        }
        class86.method537(3);
        if (arg0 != 2) {
            field3179 = false;
        }
        class45.method237(class52.field643, false);
        class44.method233((byte) 126, class52.field643);
        if (class104.field1506 != null) {
            class104.field1506.method15(class52.field643, 0);
        }
        if (class134.field1928 != null && class206.field3704 != null) {
            class134.field1928.attach(class206.field3704);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I")
    public static final int method1181(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 11647) {
            method1183((byte) -80);
        }
        ++field3183;
        if (~(class88.field1300[arg1][arg3][arg2] & 8) != -1) {
            return 0;
        } else {
            return arg1 > 0 && (class88.field1300[1][arg3][arg2] & 2) != 0 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(BI)V")
    public static final void method1182(byte arg0, int arg1) {
        ++field3173;
        if (class56.field741 != arg1) {
            if (class56.field741 == 0) {
                class80.method500((byte) 114);
            }
            if (arg1 == 20 || arg1 == 40) {
                class229.field4075 = 0;
                class62.field859 = 0;
                class42.field484 = 0;
                class54.field681 = -4;
            }
            boolean var2 = arg1 == 5 || ~arg1 == -9 || arg1 == 10 || arg1 == 28;
            if (arg1 != 20 && ~arg1 != -41 && class142.field2179 != null) {
                class142.field2179.method481(true);
                class142.field2179 = null;
            }
            if (~arg1 == -26 || arg1 == 28) {
                class217.field3896 = 0;
                class187.field3287 = 1;
                class77.field1113 = 0;
                class64.field879 = 0;
                class71.field1008 = 1;
                class206.method1405((byte) 24);
            }
            if (arg0 != -101) {
                method1182((byte) 101, -69);
            }
            if (~arg1 == -6) {
                class227.method1534(class196.field3439, (byte) -105);
            } else {
                class12.method53(0);
            }
            boolean var3 = class56.field741 == 5 || ~class56.field741 == -9 || ~class56.field741 == -11 || ~class56.field741 == -29;
            if (!var2 == var3) {
                if (!var2) {
                    class150.method943(2, (byte) 90);
                    class244.method1666(true, 1517387372);
                } else {
                    class238.field4235 = class108.field1541;
                    if (class211.field3801 != 0) {
                        class153.method967(class62.field847, 2, (byte) 48, false, 0, class108.field1541, 255);
                    } else {
                        class150.method943(2, (byte) -69);
                    }
                    class244.method1666(false, 1517387372);
                }
            }
            if (arg1 == 8) {
                arg1 = class176.method1149(25052);
            }
            class56.field741 = arg1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)I")
    public static final int method1183(byte arg0) {
        ++field3185;
        if (arg0 < 46) {
            method1180(116);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field3177;
        if (arg0 != 260028743) {
            this.method97((class56) null, 92, -72);
        }
        int[][] var3 = super.field1947.method511(arg1, arg0 ^ -260028744);
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class131.field1862; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3180[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3175 < var13) {
                    var7[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3180[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field3175 > ~var15) {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field3180[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3175) {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var7[var11] = this.field3187 * var12 >> 12;
                            var10[var11] = this.field3184 * var14 >> 12;
                            var9[var11] = this.field3182 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            field3186 = 49;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method328(-1974);
                            this.field3180[2] = class65.method409(0, var5 >> 12);
                            this.field3180[0] = class65.method409(var5, 16711680) << 4;
                            this.field3180[1] = class65.method409(var5 >> 4, 4080);
                        }
                    } else {
                        this.field3187 = arg0.method318(true);
                    }
                } else {
                    this.field3184 = arg0.method318(true);
                }
            } else {
                this.field3182 = arg0.method318(true);
            }
        } else {
            this.field3175 = arg0.method318(true);
        }
        ++field3176;
    }
}
