import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class222 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[[I")
    public int[][] field31;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    public int[] field29;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
    public int[] field30;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[Z")
    public boolean[] field20;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lcf;")
    public static class93 field24 = class147.method1066(":tradereq:", -48);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lcf;")
    public static class93 field27 = class147.method1066("Fallen lassen", -48);

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
    public static int[] field25 = new int[5];

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field22 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lcf;")
    public static class93 field33 = class147.method1066("Memory before cleanup=", -48);

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[J")
    public static long[] field34 = new long[100];

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field35 = 7759444;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Z")
    public static boolean field36 = false;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Lcf;")
    public static class93 field37 = class147.method1066("Speicher wird zugewiesen)3", -48);

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method9(int arg0, int arg1) {
        field28++;
        if (class166.field2927.field3868 - (class166.field2927.method1475(false) * 64 - 64) >> 7 == class55.field908 && class166.field2927.field3784 - (class166.field2927.method1475(false) - 1) * 64 >> 7 == class269.field4802) {
            class55.field908 = 0;
        }
        int var2 = class252.field4543;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class237 var20;
            if (arg0 == 0) {
                var20 = class166.field2927;
            } else {
                var20 = class224.field4031[class234.field4166[var3]];
            }
            if (var20 != null && var20.method1478((byte) 91)) {
                int var21 = var20.method1475(false);
                if (arg0 == 0 || arg0 == var21) {
                    if (var21 == 1) {
                        if ((var20.field3868 & 0x7F) == 64 && (var20.field3784 & 0x7F) == 64) {
                            int var28 = var20.field3868 >> 7;
                            int var29 = var20.field3784 >> 7;
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class104.field1804[var28][var29]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field3868 & 0x7F) == 0 && (var20.field3784 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field3868 & 0x7F) == 64 && (var20.field3784 & 0x7F) == 64)) {
                        int var22 = var20.field3868 - var21 * 64 >> 7;
                        int var23 = var20.field3784 - (var21 * 64) >> 7;
                        int var24 = var20.method1475(false) + var22;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var20.method1475(false) + var23;
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        for (int var26 = var22; var26 < var24; var26++) {
                            for (int var27 = var23; var27 < var25; var27++) {
                                var10002 = class104.field1804[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -105) {
            method11(67);
        }
        label223: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class237 var7;
            if (arg0 == 0) {
                var5 = 8791798054912L;
                var7 = class166.field2927;
            } else {
                var7 = class224.field4031[class234.field4166[var4]];
                var5 = (long) class234.field4166[var4] << 32;
            }
            if (var7 != null && var7.method1478((byte) 30)) {
                int var8 = var7.method1475(false);
                if (arg0 == 0 || arg0 == var8) {
                    var7.field4232 = false;
                    var7.field3801 = true;
                    if ((class230.field4124 && class252.field4543 > 200 || class252.field4543 > 50) && arg0 != 0 && var7.field3797 == var7.method1483(arg1 + 105).field800) {
                        var7.field4232 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field3868 & 0x7F) == 64 && (var7.field3784 & 0x7F) == 64) {
                            int var9 = var7.field3868 >> 7;
                            int var10 = var7.field3784 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class104.field1804[var9][var10] > 1) {
                                var10002 = class104.field1804[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field3868 & 0x7F) == 0 && (var7.field3784 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field3868 & 0x7F) == 64 && (var7.field3784 & 0x7F) == 0) {
                        int var11 = var7.field3784 - (var8 * 64) >> 7;
                        int var12 = var7.field3868 - (var8 * 64) >> 7;
                        int var13 = var8 + var11;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        int var14 = var8 + var12;
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        boolean var15 = true;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        for (int var16 = var12; var16 < var14; var16++) {
                            for (int var19 = var11; var19 < var13; var19++) {
                                if (class104.field1804[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var12;
                            while (true) {
                                if (var17 >= var14) {
                                    continue label223;
                                }
                                for (int var18 = var11; var18 < var13; var18++) {
                                    var10002 = class104.field1804[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var7.field3790 == null || var7.field3813 > class275.field4921 || class275.field4921 >= var7.field3839) {
                        var7.field3801 = false;
                        var7.field3859 = class13.method56(var7.field3784, var7.field3868, (byte) 114, class138.field2405);
                        class280.method1901(class138.field2405, var7.field3868, var7.field3784, var7.field3859, var8 * 64 + 60 - 64, var7, var7.field3807, var5, var7.field3795);
                    } else {
                        var7.field3801 = false;
                        var7.field4232 = false;
                        var7.field3859 = class13.method56(var7.field3784, var7.field3868, (byte) 92, class138.field2405);
                        class29.method163(class138.field2405, var7.field3868, var7.field3784, var7.field3859, var7, var7.field3807, var5, var7.field3822, var7.field3838, var7.field3849, var7.field3850);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)I")
    public static final int method10(int arg0, int arg1) {
        field21++;
        if (arg1 != -4124) {
            method12(13, -123);
        }
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method11(int arg0) {
        field27 = null;
        field22 = null;
        field33 = null;
        field34 = null;
        field24 = null;
        if (arg0 >= -73) {
            method12(9, 125);
        }
        field37 = null;
        field25 = null;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)Lcf;")
    public static final class93 method12(int arg0, int arg1) {
        field32++;
        int var2 = 27 % ((57 - arg1) / 34);
        return class86.field1553[arg0].method666(false) <= 0 ? class228.field4089[arg0] : class130.method949((byte) -77, new class93[] { class228.field4089[arg0], class31.field496, class86.field1553[arg0] });
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I[B)V")
    public class3(int arg0, byte[] arg1) {
        this.field26 = arg0;
        class280 var3 = new class280(arg1);
        this.field23 = var3.method1907(16832);
        this.field31 = new int[this.field23][];
        this.field29 = new int[this.field23];
        this.field30 = new int[this.field23];
        this.field20 = new boolean[this.field23];
        for (int var4 = 0; var4 < this.field23; var4++) {
            this.field29[var4] = var3.method1907(16832);
        }
        for (int var5 = 0; var5 < this.field23; var5++) {
            this.field20[var5] = var3.method1907(16832) == 1;
        }
        for (int var6 = 0; var6 < this.field23; var6++) {
            this.field30[var6] = var3.method1891(-123);
        }
        for (int var7 = 0; var7 < this.field23; var7++) {
            this.field31[var7] = new int[var3.method1907(16832)];
        }
        for (int var8 = 0; var8 < this.field23; var8++) {
            for (int var9 = 0; var9 < this.field31[var8].length; var9++) {
                this.field31[var8][var9] = var3.method1907(16832);
            }
        }
    }
}
