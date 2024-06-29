import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class128 extends class197 {

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Loh;")
    public static class258 field2275 = class153.method1046("leuchten3:", 111);

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "[[B")
    public static byte[][] field2279 = new byte[1000][];

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lha;")
    public static class194 field2267 = new class194();

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 5)
    public class128() {
        super(3, false);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lub;", line = 9)
    public static final class71 method922(int arg0, int arg1) {
        field2271++;
        class71 var2 = (class71) class29.field342.method1159((byte) 123, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 31532) {
            field2278 = 15;
        }
        byte[] var3 = class114.field1968.method1453(4, (byte) -127, arg0);
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method531(arg0, (byte) 127, new class235(var3));
        }
        class29.field342.method1163(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILva;I)V", line = 32)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3462 = arg1.method1589(97) == 1;
        }
        if (arg0 != 7955) {
            field2279 = (byte[][]) ((byte[][]) null);
        }
        field2280++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lgb;IIILgb;)Lqe;", line = 47)
    public static final class35 method923(class213 arg0, int arg1, int arg2, int arg3, class213 arg4) {
        field2270++;
        if (arg1 == 1) {
            return class162.method1086(arg1 - 1, arg0, arg2, arg3) ? class93.method690(arg1 + 49, arg4.method1453(arg3, (byte) -54, arg2)) : null;
        } else {
            return (class35) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[I", line = 63)
    public final int[] method96(int arg0, int arg1) {
        field2269++;
        if (arg0 != -16221) {
            field2279 = (byte[][]) ((byte[][]) null);
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -117, arg1);
            int[] var5 = this.method1327(1, -116, arg1);
            int[] var6 = this.method1327(2, arg0 ^ 0x3F2A, arg1);
            for (int var7 = 0; var7 < class190.field3362; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[[I", line = 121)
    public final int[][] method101(int arg0, byte arg1) {
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        int var4 = -109 / ((arg1 - 1) / 37);
        if (this.field3461.field4765) {
            int[] var5 = this.method1327(2, -121, arg0);
            int[][] var6 = this.method1322(0, arg0, 0);
            int[][] var7 = this.method1322(0, arg0, 1);
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var6[0];
            int[] var11 = var3[1];
            int[] var12 = var6[2];
            int[] var13 = var6[1];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class190.field3362; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var10[var17];
                    var11[var17] = var13[var17];
                    var9[var17] = var12[var17];
                } else if (var18 == 0) {
                    var8[var17] = var14[var17];
                    var11[var17] = var15[var17];
                    var9[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var8[var17] = var10[var17] * var18 + var14[var17] * var19 >> 12;
                    var11[var17] = var13[var17] * var18 + var15[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 + (var16[var17] * var19) >> 12;
                }
            }
        }
        field2273++;
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(B)V", line = 202)
    public static void method924(byte arg0) {
        field2279 = (byte[][]) null;
        field2267 = null;
        if (arg0 != 112) {
            method927((byte) 26);
        }
        field2275 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)Loh;", line = 215)
    public static final class258 method925(long arg0, int arg1) {
        field2268++;
        class113.field1946.setTime(new Date(arg0));
        int var3 = class113.field1946.get(7);
        int var4 = class113.field1946.get(5);
        int var5 = class113.field1946.get(2);
        int var6 = class113.field1946.get(1);
        int var7 = class113.field1946.get(11);
        int var8 = class113.field1946.get(12);
        if (arg1 != 10) {
            method926(-94);
        }
        int var9 = class113.field1946.get(13);
        return class100.method755(-6, new class258[] { class137.field2344[var3 - 1], class45.field673, class218.method1481(-111, var4 / 10), class218.method1481(58, var4 % 10), class191.field3374, class311.field5261[var5], class191.field3374, class218.method1481(105, var6), class217.field3747, class218.method1481(-108, var7 / 10), class218.method1481(-84, var7 % 10), class213.field3685, class218.method1481(96, var8 / 10), class218.method1481(-85, var8 % 10), class213.field3685, class218.method1481(-100, var9 / 10), class218.method1481(-86, var9 % 10), class292.field5025 });
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 245)
    public static final void method926(int arg0) {
        field2272++;
        int var1 = 0;
        if (arg0 != 11) {
            return;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class117.method870(class178.field3180, arg0 ^ 0xFFFFFFF4, var1, true, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(B)V", line = 293)
    public static final void method927(byte arg0) {
        field2276++;
        if (arg0 < 114) {
            field2267 = (class194) null;
        }
        class224.field3844.method822((byte) -127);
        class292.field5027 = 1;
        class272.field4706 = null;
    }
}
