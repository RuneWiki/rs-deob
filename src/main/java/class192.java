import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class192 extends class304 {

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    private int field3001 = 0;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    private int field3002 = 4096;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "[J")
    public static long[] field2990 = new long[100];

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "Lmn;")
    public static class161 field2995;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[I")
    public static int[] field2992;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "[Lcn;")
    public static class228[] field2994;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZII)I", line = 6)
    public static final int method1409(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2997++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            if (!arg1) {
                field2994 = (class228[]) null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZC)I", line = 31)
    public static final int method1410(int arg0, boolean arg1, char arg2) {
        field2998++;
        if (arg1) {
            method1410(44, true, (char) 65409);
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)[[I", line = 55)
    public final int[][] method75(int arg0, int arg1) {
        field2993++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -120, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var14 < this.field3001) {
                    var8[var11] = this.field3001;
                } else if (var14 <= this.field3002) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field3002;
                }
                if (var12 < this.field3001) {
                    var9[var11] = this.field3001;
                } else if (var12 > this.field3002) {
                    var9[var11] = this.field3002;
                } else {
                    var9[var11] = var12;
                }
                if (this.field3001 > var13) {
                    var10[var11] = this.field3001;
                } else if (var13 <= this.field3002) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field3002;
                }
            }
        }
        if (arg1 != 0) {
            this.field3002 = 22;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwm;II)V", line = 141)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3001 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field3002 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field4652 = arg0.method1774((byte) 115) == 1;
        }
        if (arg2 != -2828) {
            this.method69((class254) null, -26, -65);
        }
        field2999++;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 175)
    public class192() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 180)
    public static final void method1411(int arg0) {
        field2996++;
        for (int var1 = 0; var1 < class67.field970; var1++) {
            int var2 = class219.field3351[var1];
            class76 var3 = class264.field4064[var2];
            int var4 = class204.field3136.method1774((byte) -103);
            if ((var4 & 0x20) != 0) {
                var4 += class204.field3136.method1774((byte) 68) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class204.field3136.method1774((byte) -124);
                int var6 = class204.field3136.method1760(-1);
                var3.method2093(var6, var5, (byte) 75, class233.field3542);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field1104.method2327((byte) 37)) {
                    class28.method208(true, var3);
                }
                var3.method597((byte) -127, class242.method1676(class204.field3136.method1770(-1909516320), 64));
                var3.method2094(var3.field1104.field5181, 7);
                var3.field4758 = var3.field1104.field5123;
                var3.field4767 = var3.field1104.field5138;
                if (var3.field1104.method2327((byte) 126)) {
                    class83.method635(var3, var3.field4676[0], (class270) null, -33, 0, class265.field4112, (class32) null, var3.field4744[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class204.field3136.method1755(false);
                int var8 = class204.field3136.method1740(false);
                boolean var9 = true;
                if (var7 == 65535) {
                    var7 = -1;
                }
                if (var7 != -1 && var3.field4750 != -1 && client.method1010(class265.method1866(var7, 11273).field547, (byte) 115).field314 < client.method1010(class265.method1866(var3.field4750, 11273).field547, (byte) 108).field314) {
                    var9 = false;
                }
                if (var9) {
                    var3.field4754 = 0;
                    var3.field4769 = 1;
                    var3.field4734 = (var8 & 0xFFFF) + class233.field3542;
                    var3.field4692 = 0;
                    var3.field4750 = var7;
                    if (class233.field3542 < var3.field4734) {
                        var3.field4754 = -1;
                    }
                    var3.field4759 = var8 >> 16;
                    if (var3.field4750 != -1 && class233.field3542 == var3.field4734) {
                        int var10 = class265.method1866(var3.field4750, 11273).field547;
                        if (var10 != -1) {
                            class28 var11 = client.method1010(var10, (byte) 106);
                            if (var11 != null && var11.field312 != null) {
                                class146.method1105(0, false, 6924, var3.field4731, var11, var3.field4713);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class204.field3136.method1760(-1);
                int var13 = class204.field3136.method1787(-92);
                var3.method2093(var13, var12, (byte) 127, class233.field3542);
                var3.field4677 = class233.field3542 + 300;
                var3.field4761 = class204.field3136.method1787(-89);
            }
            if ((var4 & 0x200) != 0) {
                int var14 = class204.field3136.method1760(-1);
                int[] var15 = new int[var14];
                int[] var16 = new int[var14];
                int[] var17 = new int[var14];
                for (int var18 = 0; var18 < var14; var18++) {
                    int var19 = class204.field3136.method1755(false);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    var15[var18] = var19;
                    var16[var18] = class204.field3136.method1746((byte) -74);
                    var17[var18] = class204.field3136.method1755(false);
                }
                class207.method1492(var16, 0, var15, var17, var3);
            }
            if ((var4 & 0x8) != 0) {
                var3.field4762 = class204.field3136.method1778(1258);
                var3.field4678 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var20 = class204.field3136.method1749((byte) 84);
                int var21 = class204.field3136.method1787(110);
                if (var20 == 65535) {
                    var20 = -1;
                }
                class72.method513(var3, 112, var21, var20);
            }
            if ((var4 & 0x100) != 0) {
                var3.field4740 = class204.field3136.method1749((byte) 113);
                var3.field4718 = class204.field3136.method1755(false);
            }
            if ((var4 & 0x80) != 0) {
                var3.field4671 = class204.field3136.method1755(false);
                if (var3.field4671 == 65535) {
                    var3.field4671 = -1;
                }
            }
        }
        int var22 = -23 / ((arg0 - 6) / 48);
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V", line = 368)
    public static void method1412(int arg0) {
        int var1 = -103 % ((arg0 - 57) / 60);
        field2990 = null;
        field2995 = null;
        field2992 = null;
        field2994 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I", line = 383)
    public final int[] method71(int arg0, int arg1) {
        field2991++;
        if (arg0 != 7) {
            this.field3002 = -102;
        }
        int[] var3 = this.field4669.method2342(arg0 - 28757, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                int var6 = var4[var5];
                if (this.field3001 > var6) {
                    var3[var5] = this.field3001;
                } else if (var6 > this.field3002) {
                    var3[var5] = this.field3002;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
