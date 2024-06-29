import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class262 {

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "Lwia;")
    private class791 field3841;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "[Z")
    private boolean[] field3845;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "[[I")
    private int[][] field3849;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "[Lwr;")
    public static class481[] field3842 = new class481[50];

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "Lau;")
    public static class768 field3846;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I", line = 3)
    public static final int[] method1698(int arg0, int arg1) {
        field3844++;
        int[] var2 = new int[3];
        if (arg1 != 22772) {
            method1698(58, -112);
        }
        class193.method1338(class494.method2971(arg0, 11745), -14);
        var2[0] = class4.field30.get(5);
        var2[1] = class4.field30.get(2);
        var2[2] = class4.field30.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lha;B)V", line = 20)
    public static final void method1699(class65 arg0, byte arg1) {
        class718.field9945 = class31.method256(class523.field7389, false, arg0, true);
        field3847++;
        if (arg1 != 106) {
            field3842 = null;
        }
        class460.field6446 = class447.method2664(arg0, (byte) -124, class523.field7389);
        class449.field6148 = class31.method256(class502.field7113, false, arg0, true);
        class368.field5111 = class447.method2664(arg0, (byte) -124, class502.field7113);
        class269.field3907 = class31.method256(class220.field3416, false, arg0, true);
        class395.field5431 = class447.method2664(arg0, (byte) -124, class220.field3416);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)[I", line = 37)
    public final int[] method1700(int arg0, byte arg1) {
        field3839++;
        if (arg0 < 0 || this.field3849.length <= arg0) {
            return this.field3838 == -1 ? new int[0] : new int[] { this.field3838 };
        } else if (this.field3845[arg0] && this.field3849[arg0].length > 1) {
            int var3 = this.field3838 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field3849[arg0].length];
            class595.method3473(this.field3849[arg0], 0, var5, 0, var5.length);
            int var6 = var3;
            int var7 = 14 / ((32 - arg1) / 54);
            while (var5.length > var6) {
                int var8 = class7.method51(110, var4, var5.length - var3) + var3;
                int var9 = var5[var6];
                var5[var6] = var5[var8];
                var5[var8] = var9;
                var6++;
            }
            return var5;
        } else {
            return this.field3849[arg0];
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIILmea;)V", line = 82)
    public static final void method1701(int arg0, int arg1, int arg2, class451 arg3) {
        field3848++;
        if (arg0 != 0 || arg3 == null) {
            return;
        }
        if (arg3.field6321 != null) {
            class166 var4 = new class166();
            var4.field2619 = arg3.field6321;
            var4.field2627 = arg3;
            class379.method2349(var4);
        }
        class497.field7084 = arg3.field6222;
        class714.field9898 = arg3.field6246;
        class197.field3008 = arg1;
        class691.field9660 = true;
        class629.field8818 = arg3.field6183;
        class474.field6636 = arg2;
        class275.field3980 = arg3.field6281;
        class169.field2646 = arg3.field6207;
        class564.method3329(arg3, 8195);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(IB)Lkb;", line = 118)
    public final class718 method1702(int arg0, byte arg1) {
        field3850++;
        if (arg1 > -108) {
            method1701(-25, 94, 122, null);
        }
        byte[] var3 = this.field3841.method4339(arg0, 0, 1);
        class718 var4 = new class718();
        var4.method4024(new class494(var3), (byte) -115);
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ldt;ILwia;)V", line = 146)
    public class262(class252 arg0, int arg1, class791 arg2) {
        this.field3841 = arg2;
        this.field3841.method4353(1, true);
        class494 var4 = new class494(this.field3841.method4339(0, 0, 0));
        int var5 = var4.method2964((byte) 40);
        if (var5 > 3) {
            this.field3838 = -1;
            this.field3845 = new boolean[0];
            this.field3849 = new int[0][];
        } else {
            int var6 = var4.method2964((byte) 88);
            class345[] var7 = class673.method3825((byte) 115);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2964((byte) 38);
                    if (var7[var9].field4811 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2964((byte) 59);
                int var12 = var4.method2964((byte) 107);
                if (var5 <= 2) {
                    this.field3838 = -1;
                } else {
                    this.field3838 = var4.method2988(-3);
                }
                this.field3845 = new boolean[var12 + 1];
                this.field3849 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2964((byte) 115);
                    this.field3845[var15] = var4.method2964((byte) 69) == 1;
                    int var16 = var4.method2998(true);
                    if (this.field3838 == -1) {
                        this.field3849[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field3849[var15][var17] = var4.method2998(true);
                        }
                    } else {
                        this.field3849[var15] = new int[var16 + 1];
                        this.field3849[var15][0] = this.field3838;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field3849[var15][var18 + 1] = var4.method2998(true);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field3849[var14] == null) {
                        if (this.field3838 == -1) {
                            this.field3849[var14] = new int[0];
                        } else {
                            this.field3849[var14] = new int[] { this.field3838 };
                        }
                    }
                }
            } else {
                this.field3845 = new boolean[0];
                this.field3849 = new int[0][];
                this.field3838 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 287)
    public static void method1703(int arg0) {
        field3846 = null;
        int var1 = 58 / ((arg0 - 68) / 55);
        field3842 = null;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)Z", line = 297)
    public static final boolean method1704(int arg0, int arg1) {
        if (arg1 != 3) {
            method1698(75, 35);
        }
        field3843++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)Z", line = 308)
    public final boolean method1705(byte arg0) {
        if (arg0 != 14) {
            this.method1705((byte) -26);
        }
        field3840++;
        return this.field3838 != -1;
    }
}
