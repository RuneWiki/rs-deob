import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class88 extends class62 {

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field1317 = class136.method950((byte) 73, 1600);

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "Z")
    public static boolean field1318 = false;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "Lkda;")
    public static class328 field1321;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "Llp;")
    public static class331 field1315;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)Z")
    public static final boolean method661(int arg0, int arg1, int arg2) {
        ++field1319;
        if (arg0 != -6053) {
            method661(44, -84, 107);
        }
        return class222.method1436(arg2, arg1, (byte) 2) | ~(arg1 & 458752) != -1 || class647.method3728(arg1, arg2, (byte) -9);
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field1320;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            for (int var5 = 0; ~class438.field5847 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 != 656024161) {
            this.method13(42, -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field1316;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 >= -20) {
            field1321 = null;
        }
        if (super.field772.field6899) {
            int[][] var4 = this.method407(0, (byte) 41, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class438.field5847 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lmw;)V")
    public static final void method662(class420 arg0) {
        if (class495.field7041 < 65535) {
            class405 var1 = arg0.field5683;
            class148.field2163[class495.field7041] = arg0;
            class79.field1064[class495.field7041] = false;
            ++class495.field7041;
            int var2 = arg0.field5689;
            if (arg0.field5686) {
                var2 = 0;
            }
            int var3 = arg0.field5689;
            if (arg0.field5699) {
                var3 = class348.field4772 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2389(-10161) - var1.method2390(6042) + class402.field5500 >> class115.field1626;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2389(-10161) + var1.method2390(6042) - class402.field5500 >> class115.field1626;
                if (var7 >= class384.field5282) {
                    var7 = class384.field5282 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field5692[var5++];
                    int var10 = (var1.method2388((byte) 104) - var1.method2390(6042) + class402.field5500 >> class115.field1626) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class145.field2083) {
                        var11 = class145.field2083 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class22.field219[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class22.field219[var4][var12][var8] = var13 | (long) class495.field7041;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class22.field219[var4][var12][var8] = var13 | (long) class495.field7041 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class22.field219[var4][var12][var8] = var13 | (long) class495.field7041 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class22.field219[var4][var12][var8] = var13 | (long) class495.field7041 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            super.field788 = ~arg0.method1032((byte) -33) == -2;
        }
        ++field1322;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1321 = null;
        if (arg0 == 32) {
            field1315 = null;
        }
    }
}
