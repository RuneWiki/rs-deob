import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class189 {

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field2902 = new String[0];

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Z")
    private boolean field2909 = false;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    private int field2912 = -1;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "D")
    public static double field2915;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "J")
    public static long field2905;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I", line = 4)
    private final int method1386(int arg0, int arg1) {
        field2916++;
        if (arg0 != 1) {
            this.field2902 = null;
        }
        int var3 = this.field2902.length;
        while (arg1 >= var3) {
            if (!this.field2909) {
                var3 += this.field2910;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field2910 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IZ)V", line = 311)
    public class189(int arg0, boolean arg1) {
        this.field2909 = arg1;
        this.field2910 = arg0;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 39)
    private final void method1387(byte arg0, String arg1, int arg2) {
        field2914++;
        if (this.field2912 < arg2) {
            this.field2912 = arg2;
        }
        if (arg0 >= -72) {
            this.method1387((byte) -116, null, -91);
        }
        if (arg2 >= this.field2902.length) {
            this.method1392(true, arg2);
        }
        this.field2902[arg2] = arg1;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 61)
    public final void method1388(String arg0, int arg1) {
        this.method1387((byte) -91, arg0, this.field2912 + 1);
        field2911++;
        if (arg1 != 0) {
            field2915 = -1.3456305905823907D;
        }
    }

    @OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
    public final String toString() {
        field2907++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field2912; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field2902[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 106)
    public static final void method1389(int arg0) {
        class523.field7116.method237(true);
        field2901++;
        class713.field9818.method248((byte) -36);
        class178.field2808.method2696(-58);
        class414.field5670.method2317(arg0 - 13533);
        class495.field6783.method2001(true);
        class143.field2427.method1412(-125);
        class108.field1696.method1278((byte) -24);
        class707.field9727.method2141(0);
        class201.field3056.method1924(1031);
        class637.field8794.method4318((byte) -106);
        class624.field8698.method4266(-81);
        class706.field9695.method96(64);
        class636.field8785.method2121((byte) 127);
        if (arg0 != 13534) {
            return;
        }
        class430.field5863.method4033((byte) -117);
        class769.field10604.method3679(0);
        class117.field2153.method1160((byte) -128);
        class780.field10746.method1654(arg0 ^ 0x34C3);
        class498.field6811.method4021(-31181);
        class526.field7142.method1725(arg0 ^ 0x349E);
        class345.field4639.method2643((byte) 59);
        class770.field10616.method66(7766);
        class399.field5506.method3327((byte) 97);
        class766.method4220(106);
        class355.method2192(-3);
        class608.method3454(arg0 ^ 0x34B4);
        class178.method1346(-109);
        class715.method3979(1);
        class737.field10182.method272(20);
        class482.field6502.method272(20);
        class30.field545.method272(20);
        class287.field3962.method272(20);
        class76.field1092.method272(20);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)[Ljava/lang/String;", line = 149)
    public final String[] method1390(byte arg0) {
        int var2 = 62 / ((arg0 - 71) / 40);
        field2904++;
        String[] var3 = new String[this.field2912 + 1];
        class275.method1769(this.field2902, 0, var3, 0, this.field2912 + 1);
        return var3;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lc;II)V", line = 163)
    public static final void method1391(class200 arg0, int arg1, int arg2) {
        field2908++;
        if (class57.field806 >= 50 || arg0 == null || arg0.field3043 == null || arg2 >= arg0.field3043.length || arg0.field3043[arg2] == null) {
            return;
        }
        int var3 = arg0.field3043[arg2][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg0.field3043[arg2].length > 1) {
            int var6 = (int) (Math.random() * (double) arg0.field3043[arg2].length);
            if (var6 > 0) {
                var4 = arg0.field3043[arg2][var6];
            }
        }
        int var7 = 256;
        if (arg1 <= 29) {
            field2915 = -0.7541735196003229D;
        }
        if (arg0.field3030 != null && arg0.field3027 != null) {
            var7 = class1.method10(arg0.field3027[arg2], false, arg0.field3030[arg2]);
        }
        if (arg0.field3023) {
            class47.method345(255, var5, var4, 0, -87, var7, false);
        } else {
            class16.method95(true, var5, var4, 0, 255, var7);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V", line = 206)
    private final void method1392(boolean arg0, int arg1) {
        field2913++;
        if (arg0) {
            String[] var3 = new String[this.method1386(1, arg1)];
            class275.method1769(this.field2902, 0, var3, 0, this.field2902.length);
            this.field2902 = var3;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)[Lfja;", line = 229)
    public static final class783[] method1393(int arg0) {
        if (arg0 <= 85) {
            return null;
        } else {
            field2906++;
            return new class783[] { class519.field7047, class415.field5680, class648.field8958, class644.field8900, class654.field9058, class592.field8324, class576.field8173, class273.field3803, class342.field4608, class469.field6339, class522.field7074, class501.field6853, class601.field8409, class375.field5084, class299.field4110, class619.field8621, class341.field4599, class70.field1027, class241.field3433, class509.field6987, class260.field3644, class127.field2238, class234.field3368, class332.field4496, class357.field4864, class388.field5338, class591.field8313, class298.field4108, class60.field833, class707.field9725, class60.field831, class523.field7113, class97.field1532, class138.field2358, class583.field8250, class759.field10454, class37.field628, class764.field10546, class536.field7290, class102.field1644, class635.field8782, class337.field4568, class99.field1616, class241.field3431, class425.field5811, class562.field7963, class495.field6781, class164.field2638, class754.field10409, class666.field9249, class223.field3252, class28.field518, class610.field8519, class342.field4612, class450.field6165, class187.field2887, class143.field2419, class70.field1042, class633.field8763, class367.field4985, class494.field6777, class348.field4692, class367.field4981, class521.field7062, class791.field10836, class343.field4614, class422.field5785, class157.field2547, class14.field212, class536.field7288, class248.field3497, class431.field5876, class93.field1451, class422.field5786, class224.field3274, class387.field5325, class478.field6461, class160.field2573, class315.field4308, class689.field9560, class61.field845, class279.field3849, class90.field1365, class254.field3579, class410.field5611, class733.field10108, class611.field8526, class85.field1163, class303.field4166, class548.field7452, class204.field3081, class324.field4434, class24.field493, class616.field8575, class676.field9421, class112.field2103, class735.field10151, class206.field3107, class500.field6841, class146.field2455, class504.field6874, class505.field6881, class249.field3515, class16.field227, class617.field8594, class619.field8620, class680.field9460, class10.field170, class730.field10078, class443.field5994, class258.field3616, class373.field5067, class119.field2176, class191.field2935, class524.field7119, class297.field4047, class391.field5353, class429.field5859, class590.field8310, class686.field9538, class413.field5658, class236.field3388, class270.field3784, class347.field4675, class198.field2997, class556.field7852, class586.field8292, class620.field8630, class264.field3717, class773.field10702, class201.field3053, class230.field3353, class539.field7321 };
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lcn;ILc;I)V", line = 245)
    public static final void method1394(class543 arg0, int arg1, class200 arg2, int arg3) {
        field2903++;
        if (class57.field806 >= 50 || arg2 == null || arg2.field3043 == null || arg3 >= arg2.field3043.length || arg2.field3043[arg3] == null) {
            return;
        }
        int var4 = arg2.field3043[arg3][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        int var7 = var4 & 0x1F;
        if (arg2.field3043[arg3].length > 1) {
            int var8 = (int) ((double) arg2.field3043[arg3].length * Math.random());
            if (var8 > 0) {
                var5 = arg2.field3043[arg3][var8];
            }
        }
        int var9 = 256;
        if (arg2.field3030 != null && arg2.field3027 != null) {
            var9 = arg2.field3030[arg3] + (int) ((double) (arg2.field3027[arg3] - arg2.field3030[arg3]) * Math.random());
        }
        int var10 = arg2.field3035 == null ? 255 : arg2.field3035[arg3];
        if (var7 == 0) {
            if (class235.field3379 == arg0) {
                if (!arg2.field3023) {
                    class16.method95(true, var6, var5, 0, var10, var9);
                    return;
                }
                class47.method345(var10, var6, var5, 0, -85, var9, false);
            }
        } else if (class111.field1911.field6766.method925((byte) 74) != 0) {
            int var11 = arg0.field7396 - 256 >> 9;
            int var12 = arg0.field7398 - arg1 >> 9;
            int var13 = class235.field3379 == arg0 ? 0 : (var12 << 8) + (arg0.field7391 << 24) + (var11 << 16) + var7;
            class531.field7189[class57.field806++] = new class481((byte) (arg2.field3023 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
        }
    }
}
