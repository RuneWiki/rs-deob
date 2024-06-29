import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class226 extends class28 {

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "[B")
    public byte[] field4188;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "J")
    public static long field4187 = 0L;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    public static final int method1479(int arg0, int arg1) {
        field4181++;
        if (arg0 < 62) {
            method1484(null, (byte) 80);
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILae;I)I")
    public static final int method1480(int arg0, class6 arg1, int arg2) {
        field4182++;
        if (arg1.field72 == null || arg1.field72.length <= arg2) {
            return -2;
        }
        try {
            int var3 = -116 / ((arg0 - 76) / 45);
            int var4 = 0;
            int[] var5 = arg1.field72[arg2];
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = 0;
                int var9 = var5[var6++];
                byte var10 = 0;
                if (var9 == 0) {
                    return var4;
                }
                if (var9 == 1) {
                    var8 = class69.field1393[var5[var6++]];
                }
                if (var9 == 2) {
                    var8 = class178.field3237[var5[var6++]];
                }
                if (var9 == 3) {
                    var8 = class136.field2517[var5[var6++]];
                }
                if (var9 == 15) {
                    var10 = 1;
                }
                if (var9 == 16) {
                    var10 = 2;
                }
                if (var9 == 17) {
                    var10 = 3;
                }
                if (var9 == 4) {
                    int var11 = var5[var6++] << 16;
                    int var12 = var11 + var5[var6++];
                    class6 var13 = class87.method580(var12, 86);
                    int var14 = var5[var6++];
                    if (var14 != -1 && (!class131.method835((byte) -20, var14).field408 || class134.field2444)) {
                        for (int var15 = 0; var15 < var13.field111.length; var15++) {
                            if (var14 + 1 == var13.field111[var15]) {
                                var8 += var13.field68[var15];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var8 = class14.field355[var5[var6++]];
                }
                if (var9 == 6) {
                    var8 = class135.field2490[class178.field3237[var5[var6++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class14.field355[var5[var6++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class61.field1298.field2161;
                }
                if (var9 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class177.field3218[var16]) {
                            var8 += class178.field3237[var16];
                        }
                    }
                }
                if (var9 == 10) {
                    int var17 = var5[var6++] << 16;
                    int var18 = var17 + var5[var6++];
                    class6 var19 = class87.method580(var18, 84);
                    int var20 = var5[var6++];
                    if (var20 != -1 && (!class131.method835((byte) -20, var20).field408 || class134.field2444)) {
                        for (int var21 = 0; var21 < var19.field111.length; var21++) {
                            if (var20 + 1 == var19.field111[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class132.field2392;
                }
                if (var9 == 12) {
                    var8 = class36.field802;
                }
                if (var9 == 13) {
                    int var22 = class14.field355[var5[var6++]];
                    int var23 = var5[var6++];
                    var8 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var24 = var5[var6++];
                    var8 = class225.method1473(-13545, var24);
                }
                if (var9 == 18) {
                    var8 = (class61.field1298.field3159 >> 7) + class2.field26;
                }
                if (var9 == 19) {
                    var8 = (class61.field1298.field3198 >> 7) + class141.field2582;
                }
                if (var9 == 20) {
                    var8 = var5[var6++];
                }
                if (var10 == 0) {
                    if (var7 == 0) {
                        var4 += var8;
                    }
                    if (var7 == 1) {
                        var4 -= var8;
                    }
                    if (var7 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var7 == 3) {
                        var4 *= var8;
                    }
                    var7 = 0;
                } else {
                    var7 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIIILki;)V")
    public static final void method1481(boolean arg0, int arg1, int arg2, int arg3, int arg4, class117 arg5) {
        field4190++;
        if (class220.field4072 >= 50 || (arg5.field2206 == null || arg3 >= arg5.field2206.length)) {
            return;
        }
        int var6 = arg5.field2206[arg3];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 >> 8;
        int var9 = arg2 & var6;
        if (var9 == 0) {
            if (arg0) {
                class121.method777(var8, var7, 0, -128);
            }
        } else if (class102.field1963 != 0) {
            class148.field2669[class220.field4072] = var8;
            class161.field2914[class220.field4072] = var7;
            class92.field1739[class220.field4072] = 0;
            int var10 = (arg4 - 64) / 128;
            class99.field1847[class220.field4072] = null;
            int var11 = (arg1 - 64) / 128;
            class227.field4199[class220.field4072] = (var10 << 16) + (var11 << 8) + var9;
            class220.field4072++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)Lod;")
    public static final class156 method1482(byte[] arg0, int arg1) {
        field4185++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -2) {
            class65 var2 = new class65(arg0, class31.field674, class143.field2611, class187.field3493, class150.field2703, class173.field3102);
            class17.method129((byte) -86);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
    public class226(byte[] arg0) {
        this.field4188 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILae;)Z")
    public static final boolean method1483(int arg0, class6 arg1) {
        field4184++;
        if (arg0 <= 46) {
            return false;
        } else if (arg1.field220 == 205) {
            class129.field2356 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1484(byte[] arg0, byte arg1) {
        if (arg1 != 125) {
            method1483(74, null);
        }
        field4189++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class154.method989(arg0, 0, var3, 0, var2);
        return var3;
    }
}
