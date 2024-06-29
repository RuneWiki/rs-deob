import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 extends class332 {

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field738 = -1;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[I")
    public static int[] field740 = new int[256];

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field743 = 1;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field747 = "glow1:";

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Llc;")
    public static class175 field733;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[Loh;")
    public class18[] field730;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[Loh;")
    public class18[] field744;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[[[B")
    public byte[][][] field741;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIBIIIILcc;)V", line = 9)
    public static final void method350(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class263 arg7) {
        field729++;
        if (class47.field555) {
            class292.field4584 = 32;
        } else {
            class292.field4584 = 0;
        }
        class47.field555 = false;
        if (arg2 <= 112) {
            field747 = (String) null;
        }
        if (class261.field3953 != 0) {
            if (arg0 >= arg3 && (arg3 + 16) > arg0 && arg1 >= arg5 && (arg5 + 16) > arg1) {
                arg7.field3990 -= 4;
                class239.method1712(0, arg7);
            } else if (arg3 <= arg0 && arg0 < (arg3 + 16) && (arg5 - (16 - arg4)) <= arg1 && arg1 < (arg4 + arg5)) {
                arg7.field3990 += 4;
                class239.method1712(0, arg7);
            } else if (arg0 >= (arg3 - class292.field4584) && arg0 < (class292.field4584 + arg3 + 16) && arg1 >= arg5 + 16 && (arg4 + arg5 - 16) > arg1) {
                int var8 = (arg4 - 32) * arg4 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - var8 - 32;
                int var10 = arg1 - var8 / 2 - arg5 - 16;
                arg7.field3990 = (arg6 - arg4) * var10 / var9;
                class239.method1712(0, arg7);
                class47.field555 = true;
            }
        }
        if (class196.field2817 == 0) {
            return;
        }
        int var11 = arg7.field3989;
        if (arg0 >= arg3 - var11 && arg5 <= arg1 && (arg3 + 16) > arg0 && arg1 <= (arg4 + arg5)) {
            arg7.field3990 += class196.field2817 * 45;
            class239.method1712(0, arg7);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 75)
    public static final void method351(byte arg0) {
        class140.field1954.method573(116, 184);
        field727++;
        if (arg0 > -88) {
            field740 = (int[]) null;
        }
        class335.field5168++;
        class140.field1954.method678(0L, (byte) 105);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 94)
    public static void method352(int arg0) {
        field740 = null;
        if (arg0 != 4) {
            field733 = (class175) null;
        }
        field733 = null;
        field747 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)Lth;", line = 112)
    public static final class93 method353(int arg0, byte arg1) {
        field728++;
        class93 var2 = (class93) class35.field415.method1239((byte) -104, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1270.method1199(28815, class165.method1079((byte) 62, arg0), class109.method750(-32768, arg0));
        class93 var4 = new class93();
        var4.field1202 = arg0;
        if (var3 != null) {
            var4.method559((byte) 124, new class107(var3));
        }
        if (arg1 >= -38) {
            method351((byte) -79);
        }
        var4.method551(-1611850192);
        if (var4.field1164 != -1) {
            var4.method563(method353(var4.field1164, (byte) -104), method353(var4.field1203, (byte) -42), (byte) -83);
        }
        if (var4.field1194 != -1) {
            var4.method548(method353(var4.field1179, (byte) -43), method353(var4.field1194, (byte) -59), (byte) -110);
        }
        if (!class267.field4206 && var4.field1205) {
            var4.field1163 = class321.field4935;
            var4.field1172 = class41.field490;
            var4.field1187 = false;
            var4.field1184 = 0;
            var4.field1167 = class98.field1286;
        }
        class35.field415.method1243(var4, (long) arg0, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lcc;IZ)I", line = 177)
    public static final int method354(class263 arg0, int arg1, boolean arg2) {
        field734++;
        if (arg0.field4007 == null || arg1 >= arg0.field4007.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4007[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class97.field1260[var3[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class59.field723[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class286.field4499[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class263 var12 = class91.method530(var11, 10989328);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!method353(var13, (byte) -65).field1205 || class141.field1969)) {
                        for (int var14 = 0; var14 < var12.field4132.length; var14++) {
                            if ((var13 + 1) == var12.field4132[var14]) {
                                var9 += var12.field4047[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class226.field3235[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class129.field1790[class59.field723[var3[var5++]] - 1];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 7) {
                    var9 = class226.field3235[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class118.field1664.field1495;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class42.field499[var15]) {
                            var9 += class59.field723[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class263 var18 = class91.method530(var17, 10989328);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!method353(var19, (byte) -80).field1205 || class141.field1969)) {
                        for (int var20 = 0; var20 < var18.field4132.length; var20++) {
                            if (var19 + 1 == var18.field4132[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class14.field188;
                }
                if (var7 == 12) {
                    var9 = class223.field3154;
                }
                if (var7 == 13) {
                    int var21 = class226.field3235[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class292.method2080((byte) 91, var23);
                }
                if (var7 == 18) {
                    var9 = (class118.field1664.field2392 >> 7) + class142.field1992;
                }
                if (var7 == 19) {
                    var9 = (class118.field1664.field2357 >> 7) + class118.field1668;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            if (!arg2) {
                method354((class263) null, 46, true);
            }
            return -1;
        }
    }
}
