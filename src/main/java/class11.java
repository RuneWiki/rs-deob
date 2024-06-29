import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class11 {

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lac;")
    private class198 field202 = new class198();

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ldf;")
    private class146 field189;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lmb;")
    public static class96 field182 = class243.method1708("<col=ffffff>", (byte) 111);

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lmb;")
    public static class96 field194 = class243.method1708(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 115);

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lmb;")
    public static class96 field192 = class243.method1708("welle:", (byte) 108);

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lmb;")
    public static class96 field196 = class243.method1708("hint_mapedge", (byte) 121);

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
    public static int[] field200 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lhk;")
    public static class33 field191;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Ljava/awt/Font;")
    public static Font field199;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public final void method82(byte arg0, int arg1) {
        field201++;
        if (arg0 != -109) {
            method90(-115, 46, 110, 31, -90, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 106, (byte) -34, 127, 16);
        }
        if (class23.field403 == null) {
            return;
        }
        for (class179 var3 = (class179) this.field202.method1391(arg0 ^ 0x1D); var3 != null; var3 = (class179) this.field202.method1382(-1)) {
            if (var3.method411((byte) 23)) {
                if (var3.method413((byte) -59) == null) {
                    var3.method1743((byte) 123);
                    var3.method740(-22949);
                    this.field184++;
                }
            } else if ((++var3.field1664) > ((long) arg1)) {
                class179 var4 = class23.field403.method306(var3, (byte) -31);
                this.field189.method1085(-1, var4, var3.field4304);
                class65.method455(var4, (byte) 127, var3);
                var3.method1743((byte) 40);
                var3.method740(-22949);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method83(int arg0) {
        this.field202.method1386(88);
        this.field189.method1088(arg0 ^ 0xFFFFFFC1);
        if (arg0 != 0) {
            field194 = null;
        }
        this.field184 = this.field181;
        field186++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method84(int arg0, long arg1) {
        class179 var4 = (class179) this.field189.method1081(0, arg1);
        field195++;
        if (var4 == null) {
            return null;
        }
        int var5 = 99 % ((arg0 + 66) / 33);
        Object var6 = var4.method413((byte) -32);
        if (var6 == null) {
            var4.method1743((byte) 42);
            var4.method740(-22949);
            this.field184++;
            return null;
        }
        if (var4.method411((byte) 23)) {
            class55 var7 = new class55(var6);
            this.field189.method1085(-1, var7, var4.field4304);
            this.field202.method1390(var7, -120);
            var7.field1664 = 0L;
            var4.method1743((byte) 67);
            var4.method740(-22949);
        } else {
            this.field202.method1390(var4, -116);
            var4.field1664 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    public static final int method85(int arg0, int arg1, int arg2) {
        if (arg1 != -12520) {
            field196 = null;
        }
        field204++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IJ)V")
    public final void method86(int arg0, long arg1) {
        field185++;
        class179 var4 = (class179) this.field189.method1081(arg0 ^ arg0, arg1);
        if (var4 != null) {
            var4.method1743((byte) 28);
            var4.method740(arg0 - 23076);
            this.field184++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lw;IIIIILmj;)V")
    public static final void method87(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class246 arg6) {
        field187++;
        if (arg6 == null) {
            return;
        }
        int var7 = class235.field4033 + class21.field343 & 0x7FF;
        int var8 = Math.max(arg0.field1856 / 2, arg0.field1919 / 2) + 10;
        if (arg2 != 128) {
            field191 = null;
        }
        int var9 = arg1 * arg1 + arg3 * arg3;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class240.field4162[var7];
        int var11 = var10 * 256 / (class222.field3800 + 256);
        int var12 = class240.field4176[var7];
        int var13 = var12 * 256 / (class222.field3800 + 256);
        int var14 = arg3 * var13 - (arg1 * var11) >> 16;
        int var15 = arg3 * var11 + (arg1 * var13) >> 16;
        ((class174) arg6).method1240(arg0.field1856 / 2 + arg5 + var15 - (arg6.field4269 / 2), arg0.field1919 / 2 + arg4 - var14 + -(arg6.field4268 / 2), arg0.field1891, arg0.field1973);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method88(Object arg0, int arg1, long arg2) {
        field179++;
        if (arg1 != 16518) {
            method95(false);
        }
        this.method86(127, arg2);
        if (this.field184 == 0) {
            class179 var5 = (class179) this.field202.method1385((byte) -49);
            var5.method1743((byte) 72);
            var5.method740(-22949);
        } else {
            this.field184--;
        }
        class55 var6 = new class55(arg0);
        this.field189.method1085(-1, var6, arg2);
        this.field202.method1390(var6, -78);
        var6.field1664 = 0L;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Lug;")
    public static final class208 method89(int arg0, boolean arg1) {
        field198++;
        class208 var2 = (class208) class57.field996.method158((long) arg0, (byte) -128);
        if (arg1) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class93.field1533.method23(arg0 & 0x7FFF, 103, 1);
            } else {
                var3 = class272.field4728.method23(arg0, 103, 1);
            }
            class208 var4 = new class208();
            if (var3 != null) {
                var4.method1457(-92, new class239(var3));
            }
            if (arg0 >= 32768) {
                var4.method1452(-7723);
            }
            class57.field996.method155((long) arg0, var4, (byte) 63);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class264.field4614 * 128) {
            arg0 = class264.field4614 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class17.field254 * 128) {
            arg2 = class17.field254 * 128 - 1;
        }
        class68.field1183 = class240.field4162[arg3];
        class80.field1360 = class240.field4176[arg3];
        class64.field1092 = class240.field4162[arg4];
        class128.field2337 = class240.field4176[arg4];
        class211.field3646 = arg0;
        class262.field4598 = arg1;
        class21.field350 = arg2;
        class14.field224 = arg0 / 128;
        class6.field120 = arg2 / 128;
        class239.field4109 = class14.field224 - class233.field3992;
        if (class239.field4109 < 0) {
            class239.field4109 = 0;
        }
        class161.field2847 = class6.field120 - class233.field3992;
        if (class161.field2847 < 0) {
            class161.field2847 = 0;
        }
        class231.field3971 = class233.field3992 + class14.field224;
        if (class231.field3971 > class264.field4614) {
            class231.field3971 = class264.field4614;
        }
        class78.field1325 = class6.field120 + class233.field3992;
        if (class78.field1325 > class17.field254) {
            class78.field1325 = class17.field254;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class233.field3992 + class233.field3992 + 2; var16++) {
            for (int var19 = 0; var19 < class233.field3992 + class233.field3992 + 2; var19++) {
                int var20 = (var16 - class233.field3992 << 7) - (class211.field3646 & 0x7F);
                int var21 = (var19 - class233.field3992 << 7) - (class21.field350 & 0x7F);
                int var22 = class14.field224 + var16 - class233.field3992;
                int var23 = class6.field120 + var19 - class233.field3992;
                if (var22 >= 0 && var23 >= 0 && var22 < class264.field4614 && var23 < class17.field254) {
                    int var24;
                    if (class25.field418 == null) {
                        var24 = class106.field1790[0][var22][var23] + 128 - class262.field4598;
                    } else {
                        var24 = class25.field418[0][var22][var23] + 128 - class262.field4598;
                    }
                    int var25 = class106.field1790[3][var22][var23] - class262.field4598 - 1000;
                    class146.field2603[var16][var19] = class17.method114(var20, var25, var24, var21, var15);
                } else {
                    class146.field2603[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class233.field3992 + class233.field3992 + 1; var17++) {
            for (int var18 = 0; var18 < class233.field3992 + class233.field3992 + 1; var18++) {
                class55.field946[var17][var18] = class146.field2603[var17][var18] || class146.field2603[var17 + 1][var18] || class146.field2603[var17][var18 + 1] || class146.field2603[var17 + 1][var18 + 1];
            }
        }
        class276.field4795 = arg6;
        class159.field2753 = arg7;
        class222.field3789 = arg8;
        class127.field2323 = arg9;
        class60.field1036 = arg10;
        class145.method1072();
        if (class159.field2828 != null) {
            class249.method1742(true);
            class234.method1584(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class249.method1742(false);
        }
        class234.method1584(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lmb;ILff;)Lle;")
    public static final class110 method91(class96 arg0, int arg1, class3 arg2) {
        int var3 = arg2.method41(arg0, false);
        field190++;
        int var4 = -8 % ((arg1 - 45) / 50);
        if (var3 == -1) {
            return new class110(0);
        }
        int[] var5 = arg2.method24(0, var3);
        class110 var6 = new class110(var5.length);
        for (int var7 = 0; var7 < var6.field2027; var7++) {
            class239 var8 = new class239(arg2.method23(var5[var7], 103, var3));
            var6.field2028[var7] = var8.method1634(-67);
            var6.field2031[var7] = var8.method1656(-120);
            var6.field2035[var7] = (short) var8.method1663((byte) 64);
            var6.field2029[var7] = (short) var8.method1663((byte) -58);
            var6.field2034[var7] = var8.method1617((byte) -43);
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lff;Lgh;ILff;)V")
    public static final void method92(class3 arg0, class204 arg1, int arg2, class3 arg3) {
        class77.field1314 = arg1;
        class272.field4728 = arg3;
        field180++;
        class93.field1533 = arg0;
        if (arg2 != 1) {
            return;
        }
        if (class272.field4728 != null) {
            class217.field3725 = class272.field4728.method37(1, (byte) -96);
        }
        if (class93.field1533 != null) {
            class256.field4455 = class93.field1533.method37(1, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method93(int arg0) {
        if (arg0 >= -32) {
            return;
        }
        field183++;
        if (class194.field3345 != null) {
            class210 var1 = class194.field3345;
            synchronized (class194.field3345) {
                class194.field3345 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method94(int arg0) {
        field200 = null;
        field191 = null;
        field182 = null;
        field192 = null;
        field196 = null;
        field199 = null;
        field194 = null;
        int var1 = 3 / ((38 - arg0) / 36);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method95(boolean arg0) {
        field193++;
        class31.field491.method83(0);
        if (!arg0) {
            field194 = null;
        }
        class91.field1504.method83(0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public final void method96(boolean arg0) {
        if (arg0) {
            this.field202 = null;
        }
        for (class179 var2 = (class179) this.field202.method1391(-76); var2 != null; var2 = (class179) this.field202.method1382(-1)) {
            if (var2.method411((byte) 23)) {
                var2.method1743((byte) 77);
                var2.method740(-22949);
                this.field184++;
            }
        }
        field188++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lff;Lff;Z)V")
    public static final void method97(class3 arg0, class3 arg1, boolean arg2) {
        field197++;
        if (!arg2) {
            method95(true);
        }
        class38.field648 = arg0;
        class159.field2802 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field184 = arg0;
        this.field181 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field189 = new class146(var2);
    }
}
