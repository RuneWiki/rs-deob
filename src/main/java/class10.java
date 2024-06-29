import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class10 {

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "S")
    public static short field229 = 205;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "B")
    public byte field223;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "B")
    public byte field231;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "B")
    public byte field236;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "B")
    public byte field238;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Llg;")
    public static class132 field234;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "S")
    public short field233;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Z")
    public boolean field222;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Z")
    public boolean field227;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Z")
    public boolean field228;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Z")
    public boolean field230;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Z")
    public boolean field232;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 10)
    public static void method150(int arg0) {
        if (arg0 > -105) {
            field242 = 75;
        }
        field234 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I", line = 24)
    public static final int method151(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 106) {
            method152((Object[]) null, 4, -4, -38, (int[]) null);
        }
        field240++;
        return arg1 < arg3 ? arg3 : (arg1 > arg0 ? arg0 : arg1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Ljava/lang/Object;III[I)V", line = 42)
    public static final void method152(Object[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 <= 11) {
            return;
        }
        field239++;
        if (arg2 <= arg1) {
            return;
        }
        int var5 = arg1;
        int var6 = (arg1 + arg2) / 2;
        int var7 = arg4[var6];
        arg4[var6] = arg4[arg2];
        arg4[arg2] = var7;
        Object var8 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg1; var9 < arg2; var9++) {
            if ((var7 + (var9 & 0x1)) > arg4[var9]) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg4[arg2] = arg4[var5];
        arg4[var5] = var7;
        arg0[arg2] = arg0[var5];
        arg0[var5] = var8;
        method152(arg0, arg1, var5 - 1, 92, arg4);
        method152(arg0, var5 + 1, arg2, 77, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V", line = 100)
    public static final void method153(boolean arg0, int arg1) {
        if (!class52.field772) {
            arg1 = -1;
        }
        field226++;
        if (class232.field3541 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class321 var2 = class11.method155(arg1, false);
            class317 var3 = var2.method2262((byte) 41);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class92.field1484.method546(new Point(var2.field5029, var2.field5027), var3.field1422, var3.method1641(), arg0, var3.field1421, class334.field5197);
                class232.field3541 = arg1;
            }
        }
        if (arg1 == -1 && class232.field3541 != -1) {
            class92.field1484.method546(new Point(), -1, (int[]) null, arg0, -1, class334.field5197);
            class232.field3541 = -1;
        }
        if (arg0) {
            method151(-125, 18, 102, -97);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V", line = 144)
    public static final void method154(int arg0, int arg1) {
        field241++;
        int var2 = class45.field703;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 <= 111) {
            method153(false, -115);
        }
        int var10002;
        while (var3 < var2) {
            class92 var4;
            if (arg1 == 0) {
                var4 = class345.field5363;
            } else {
                var4 = class74.field1140[class325.field5068[var3]];
            }
            if (var4 != null && var4.method681(true)) {
                int var5 = var4.method738(-6421);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4671 & 0x7F) == 64 && (var4.field4672 & 0x7F) == 64) {
                            int var12 = var4.field4671 >> 7;
                            int var13 = var4.field4672 >> 7;
                            if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class171.field2755[var12][var13]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4671 & 0x7F) == 0 && (var4.field4672 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4671 & 0x7F) == 64 && (var4.field4672 & 0x7F) == 64)) {
                        int var6 = var4.field4671 - (var5 * 64) >> 7;
                        int var7 = var4.field4672 - (var5 * 64) >> 7;
                        int var8 = var6 + var4.method738(-6421);
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        if (var8 > 104) {
                            var8 = 104;
                        }
                        int var9 = var4.method738(-6421) + var7;
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        for (int var10 = var6; var10 < var8; var10++) {
                            for (int var11 = var7; var11 < var9; var11++) {
                                var10002 = class171.field2755[var10][var11]++;
                            }
                        }
                    }
                }
            }
            var3++;
        }
        label224: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class92 var17;
            if (arg1 == 0) {
                var15 = 8791798054912L;
                var17 = class345.field5363;
            } else {
                var15 = (long) class325.field5068[var14] << 32;
                var17 = class74.field1140[class325.field5068[var14]];
            }
            if (var17 != null && var17.method681(true)) {
                int var18 = var17.method738(-6421);
                if (arg1 == 0 || arg1 == var18) {
                    var17.field4659 = true;
                    var17.field1493 = false;
                    if ((class55.field846 && class45.field703 > 200 || class45.field703 > 50) && arg1 != 0 && var17.field4614 == var17.method2062((byte) -80).field1006) {
                        var17.field1493 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field4671 & 0x7F) == 64 && (var17.field4672 & 0x7F) == 64) {
                            int var28 = var17.field4671 >> 7;
                            int var29 = var17.field4672 >> 7;
                            if (var28 < 0 || var28 >= 104 || var29 < 0 || var29 >= 104) {
                                continue;
                            }
                            if (class171.field2755[var28][var29] > 1) {
                                var10002 = class171.field2755[var28][var29]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field4671 & 0x7F) == 0 && (var17.field4672 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field4671 & 0x7F) == 64 && (var17.field4672 & 0x7F) == 0) {
                        int var19 = var17.field4671 - var18 * 64 >> 7;
                        int var20 = var17.field4672 - (var18 * 64) >> 7;
                        int var21 = var18 + var19;
                        int var22 = var18 + var20;
                        boolean var23 = true;
                        if (var22 > 104) {
                            var22 = 104;
                        }
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        for (int var24 = var19; var24 < var21; var24++) {
                            for (int var25 = var20; var25 < var22; var25++) {
                                if (class171.field2755[var24][var25] <= 1) {
                                    var23 = false;
                                    break;
                                }
                            }
                        }
                        if (var23) {
                            int var26 = var19;
                            while (true) {
                                if (var21 <= var26) {
                                    continue label224;
                                }
                                for (int var27 = var20; var27 < var22; var27++) {
                                    var10002 = class171.field2755[var26][var27]--;
                                }
                                var26++;
                            }
                        }
                    }
                    if (var17.field4711 == null || class307.field4869 < var17.field4661 || class307.field4869 >= var17.field4618) {
                        var17.field4659 = false;
                        var17.field4635 = class170.method1265(var17.field4671, var17.field4672, class75.field1153, 1);
                        class149.method1132(class75.field1153, var17.field4671, var17.field4672, var17.field4635, var18 * 64 + 60 - 64, var17, var17.field4682, var15, var17.field4610);
                    } else {
                        var17.field4659 = false;
                        var17.field1493 = false;
                        var17.field4635 = class170.method1265(var17.field4671, var17.field4672, class75.field1153, 1);
                        class257.method1775(class75.field1153, var17.field4671, var17.field4672, var17.field4635, var17, var17.field4682, var15, var17.field4662, var17.field4624, var17.field4696, var17.field4629);
                    }
                }
            }
        }
    }
}
