import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class196 {

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field387 = 1;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field390 = 20;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lvh;")
    public static class252 field391 = new class252();

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Ldf;")
    public static class51 field396 = class46.method233("overlay2", 100);

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "[[[Lqg;")
    public static class97[][][] field395;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field393;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -106);
        if (super.field3285.field3963) {
            int[] var4 = this.method1390(arg1, 2, -121);
            int[][] var5 = this.method1387(92, 0, arg1);
            int[][] var6 = this.method1387(arg0 + 66, 1, arg1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[2];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class49.field767; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var8[var16] = var11[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var7[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var8[var16] = var13[var16];
                        var7[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var8[var16] = var11[var16];
                    var7[var16] = var12[var16];
                    var9[var16] = var10[var16];
                }
            }
        }
        return arg0 != 11 ? null : var3;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field394;
        if (arg1 != 10565) {
            method142((byte) -5);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, -126);
            int[] var5 = this.method1390(arg0, 1, -101);
            int[] var6 = this.method1390(arg0, 2, arg1 + -10661);
            for (int var7 = 0; ~class49.field767 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 == 82) {
            if (arg0 == 0) {
                super.field3291 = arg1.method897(-21) == 1;
            }
            ++field386;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lfd;ZI)V")
    public static final void method141(class114 arg0, boolean arg1, int arg2) {
        if (class247.field4276 != null) {
            try {
                class247.field4276.method838(-122);
            } catch (Exception var8) {
            }
            class247.field4276 = null;
        }
        class247.field4276 = arg0;
        ++field392;
        class35.method180(arg1, arg2 ^ -28603);
        class129.field2156 = null;
        class237.field4139 = null;
        class142.field2388 = 0;
        class138.field2319.field2026 = arg2;
        while (true) {
            class228 var3 = (class228) class135.field2244.method1451(92);
            if (var3 == null) {
                while (true) {
                    class228 var4 = (class228) class233.field4058.method1451(arg2 + 120);
                    if (var4 == null) {
                        if (~class50.field804 != -1) {
                            try {
                                class121 var5 = new class121(4);
                                var5.method919(-4742, 4);
                                var5.method919(-4742, class50.field804);
                                var5.method895(-6, 0);
                                class247.field4276.method840(0, -782, var5.field2014, 4);
                            } catch (IOException var7) {
                                try {
                                    class247.field4276.method838(-122);
                                } catch (Exception var6) {
                                }
                                class247.field4276 = null;
                                ++class22.field332;
                            }
                        }
                        class201.field3364 = 0;
                        class75.field1189 = class7.method31((byte) -88);
                        return;
                    }
                    class169.field2752.method403(var4, -48);
                    class201.field3353.method1447(-103, var4.field1760, var4);
                    --class182.field2999;
                    ++class131.field2194;
                }
            }
            class202.field3366.method1447(-102, var3.field1760, var3);
            ++class146.field2439;
            --class195.field3270;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public static void method142(byte arg0) {
        if (arg0 != -76) {
            field391 = null;
        }
        field396 = null;
        field395 = null;
        field391 = null;
    }
}
