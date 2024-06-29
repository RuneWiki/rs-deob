import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class178 {

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "[B")
    private byte[] field2247;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "Ljia;")
    public class707 field2250;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "[I")
    public int[] field2241;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "[I")
    public int[] field2245;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "[I")
    public int[] field2248;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "[I")
    public int[] field2253;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "[I")
    public int[] field2255;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "[I")
    public int[] field2257;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "[Ljia;")
    public class707[] field2249;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "[[B")
    public byte[][] field2240;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "[[I")
    public int[][] field2239;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "[[I")
    public int[][] field2252;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2254++;
        class17 var5 = class245.method1634(arg0 ^ 0xFFFFFFFE, (long) arg4, 10);
        var5.method66((byte) -114);
        var5.field104 = arg3;
        if (arg0 == -1) {
            var5.field107 = arg2;
            var5.field105 = arg1;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([BI)V", line = 31)
    private final void method1133(byte[] arg0, int arg1) {
        field2242++;
        class511 var3 = new class511(class244.method1630(arg0, (byte) -23));
        int var4 = var3.method3013(-125);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2256 = 0;
        } else {
            this.field2256 = var3.method3008(64);
        }
        int var5 = var3.method3013(119);
        boolean var6 = (var5 & 0x1) != 0;
        this.field2243 = var3.method3002(arg1);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = arg1;
        this.field2245 = new int[this.field2243];
        for (int var10 = 0; var10 < this.field2243; var10++) {
            this.field2245[var10] = var8 += var3.method3002(-1);
            if (this.field2245[var10] > var9) {
                var9 = this.field2245[var10];
            }
        }
        this.field2251 = var9 + 1;
        this.field2252 = new int[this.field2251][];
        this.field2248 = new int[this.field2251];
        if (var7) {
            this.field2240 = new byte[this.field2251][];
        }
        this.field2257 = new int[this.field2251];
        this.field2255 = new int[this.field2251];
        this.field2241 = new int[this.field2251];
        if (var6) {
            this.field2253 = new int[this.field2251];
            for (int var11 = 0; var11 < this.field2251; var11++) {
                this.field2253[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field2243; var12++) {
                this.field2253[this.field2245[var12]] = var3.method3008(64);
            }
            this.field2250 = new class707(this.field2253);
        }
        for (int var13 = 0; var13 < this.field2243; var13++) {
            this.field2257[this.field2245[var13]] = var3.method3008(64);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field2243; var14++) {
                byte[] var15 = new byte[64];
                var3.method3014(64, var15, 75212712, 0);
                this.field2240[this.field2245[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field2243; var16++) {
            this.field2248[this.field2245[var16]] = var3.method3008(64);
        }
        for (int var17 = 0; var17 < this.field2243; var17++) {
            this.field2255[this.field2245[var17]] = var3.method3002(-1);
        }
        for (int var18 = 0; var18 < this.field2243; var18++) {
            int var25 = this.field2245[var18];
            int var26 = this.field2255[var25];
            int var27 = 0;
            this.field2252[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field2252[var25][var29] = var27 += var3.method3002(arg1);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field2241[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field2252[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field2249 = new class707[var9 + 1];
        this.field2239 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field2243; var19++) {
            int var20 = this.field2245[var19];
            int var21 = this.field2255[var20];
            this.field2239[var20] = new int[this.field2241[var20]];
            for (int var22 = 0; var22 < this.field2241[var20]; var22++) {
                this.field2239[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field2252[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field2252[var20][var23];
                }
                this.field2239[var20][var24] = var3.method3008(class475.method2835(arg1, -65));
            }
            this.field2249[var20] = new class707(this.field2239[var20]);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 226)
    public static final void method1134(String arg0, byte arg1, int arg2) {
        field2246++;
        int var3 = class783.field10748;
        int[] var4 = class244.field3610;
        boolean var5 = false;
        if (arg1 < 7) {
            return;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class723 var7 = class413.field5787[var4[var6]];
            if (var7 != null && class724.field10031 != var7 && var7.field9965 != null && var7.field9965.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class95.field1110++;
                    class116 var13 = class248.method1672(class84.field1023, class59.field683, -20647);
                    var13.field1575.method3005(255, 0);
                    var13.field1575.method3044(var4[var6], -122);
                    class443.method2655(0, var13);
                } else if (arg2 == 4) {
                    class473.field6574++;
                    class116 var12 = class248.method1672(class84.field1023, class76.field852, -20647);
                    var12.field1575.method2977(false, var4[var6]);
                    var12.field1575.method3001(0, 1719860128);
                    class443.method2655(0, var12);
                } else if (arg2 == 5) {
                    class213.field2930++;
                    class116 var8 = class248.method1672(class84.field1023, class357.field5142, -20647);
                    var8.field1575.method2986(var4[var6], 116);
                    var8.field1575.method3035(0, (byte) 116);
                    class443.method2655(0, var8);
                } else if (arg2 == 6) {
                    class1.field9++;
                    class116 var11 = class248.method1672(class84.field1023, class769.field10587, -20647);
                    var11.field1575.method2981(var4[var6], 128);
                    var11.field1575.method3035(0, (byte) 28);
                    class443.method2655(0, var11);
                } else if (arg2 == 7) {
                    class461.field6450++;
                    class116 var10 = class248.method1672(class84.field1023, class603.field8456, -20647);
                    var10.field1575.method3005(255, 0);
                    var10.field1575.method3044(var4[var6], -126);
                    class443.method2655(0, var10);
                } else if (arg2 == 9) {
                    class116 var9 = class248.method1672(class84.field1023, class245.field3631, -20647);
                    var9.field1575.method2977(false, var4[var6]);
                    var9.field1575.method2988((byte) -85, 0);
                    class443.method2655(0, var9);
                }
                break;
            }
        }
        if (!var5) {
            class128.method876(4, (byte) 115, class712.field9874.method3999(class553.field7667, (byte) -72) + arg0);
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "([BI[B)V", line = 330)
    public class178(byte[] arg0, int arg1, byte[] arg2) {
        this.field2244 = class510.method2969(arg0, 0, arg0.length);
        if (this.field2244 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field2247 = class353.method2222(arg0.length, 0, 64, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field2247[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method1133(arg0, -1);
    }
}
