import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class324 extends class306 {

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "[Lvj;")
    public static class122[] field5211 = new class122[0];

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "Z")
    public static boolean field5210 = false;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "F")
    public static float field5204;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILlf;I)V", line = 4)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        if (arg0 != -15334) {
            field5208 = 95;
        }
        field5206++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I", line = 21)
    public final int[][] method681(int arg0, byte arg1) {
        field5209++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) -48, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                var8[var11] = 4096 - var10[var11];
                var7[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var5[var11];
            }
        }
        if (arg1 != -119) {
            field5204 = -0.0071218195F;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lhi;III)V", line = 64)
    public static final void method2256(class323 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5108 == 0) {
            arg0.field5104 = arg0.field5063;
        } else if (arg0.field5108 == 1) {
            arg0.field5104 = (arg3 - arg0.field5174) / 2 + arg0.field5063;
        } else if (arg0.field5108 == 2) {
            arg0.field5104 = arg3 - arg0.field5174 - arg0.field5063;
        } else if (arg0.field5108 == 3) {
            arg0.field5104 = arg0.field5063 * arg3 >> 14;
        } else if (arg0.field5108 == 4) {
            arg0.field5104 = (arg0.field5063 * arg3 >> 14) + (arg3 - arg0.field5174) / 2;
        } else {
            arg0.field5104 = arg3 - (arg0.field5174 + (arg0.field5063 * arg3 >> 14));
        }
        if (arg0.field5146 == 0) {
            arg0.field5029 = arg0.field5144;
        } else if (arg0.field5146 == 1) {
            arg0.field5029 = (arg2 - arg0.field5169) / 2 + arg0.field5144;
        } else if (arg0.field5146 == 2) {
            arg0.field5029 = arg2 - arg0.field5169 - arg0.field5144;
        } else if (arg0.field5146 == 3) {
            arg0.field5029 = arg0.field5144 * arg2 >> 14;
        } else if (arg0.field5146 == 4) {
            arg0.field5029 = (arg0.field5144 * arg2 >> 14) + (arg2 - arg0.field5169) / 2;
        } else {
            arg0.field5029 = arg2 - (arg0.field5144 * arg2 >> 14) - arg0.field5169;
        }
        int var4 = -49 % ((59 - arg1) / 37);
        field5207++;
        if (!class214.field3244 || !(client.method2013(arg0).field994 != 0 || arg0.field5107 == 0)) {
            return;
        }
        if (arg0.field5104 < 0) {
            arg0.field5104 = 0;
        } else if (arg0.field5174 + arg0.field5104 > arg3) {
            arg0.field5104 = arg3 - arg0.field5174;
        }
        if (arg0.field5029 < 0) {
            arg0.field5029 = 0;
        } else if (arg0.field5169 + arg0.field5029 > arg2) {
            arg0.field5029 = arg2 - arg0.field5169;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 134)
    public class324() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I", line = 144)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        field5203++;
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3C83);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 118, 0);
            for (int var5 = 0; var5 < class31.field367; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 178)
    public static void method2257(int arg0) {
        int var1 = 32 % ((arg0 + 55) / 55);
        field5211 = null;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 189)
    public static final void method2258(int arg0) {
        if (arg0 <= -83) {
            field5205++;
            class154.field2434.method383((byte) -48);
        }
    }
}
