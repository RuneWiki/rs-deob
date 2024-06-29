import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class288 extends class241 {

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    public int[] field4051;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[I")
    public int[] field4054;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public static boolean field4044 = true;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4045 = new String[200];

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4050 = -1;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    public static boolean field4049 = false;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lbj;")
    public static class131 field4047 = new class131(256);

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lnq;")
    public static class268 field4048;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[I")
    public static int[] field4053;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method1874(byte arg0) {
        field4055++;
        if (class282.field3996 == -1 || class18.field322 == -1) {
            return;
        }
        int var1 = ((class453.field6466 - class346.field4727) * class146.field2082 >> 16) + class346.field4727;
        class146.field2082 += var1;
        if (class146.field2082 < 65535) {
            class204.field2814 = false;
            class388.field5579 = false;
        } else {
            class146.field2082 = 65535;
            if (class388.field5579) {
                class204.field2814 = false;
            } else {
                class204.field2814 = true;
            }
            class388.field5579 = true;
        }
        float var2 = (float) class146.field2082 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class77.field1105 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class5.field89[class282.field3996][var4][var5] * 3;
            int var23 = class5.field89[class282.field3996][var4 + 1][var5] * 3;
            int var24 = (class5.field89[class282.field3996][var4 + 2][var5] + class5.field89[class282.field3996][var4 + 2][var5] - class5.field89[class282.field3996][var4 + 3][var5]) * 3;
            int var25 = class5.field89[class282.field3996][var4][var5];
            int var26 = var23 - var22;
            int var27 = var24 + var22 - (var23 * 2);
            int var28 = class5.field89[class282.field3996][var4 + 2][var5] - (var24 - var23) - var25;
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class20.field376 = (int) var3[2] - (class447.field6269 * 128);
        class106.field1447 = (int) var3[0] - class212.field2968 * 128;
        class7.field107 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class187.field2522 * 2;
        int var8 = 58 / ((arg0 - 52) / 46);
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class5.field89[class18.field322][var7][var9] * 3;
            int var16 = class5.field89[class18.field322][var7 + 1][var9] * 3;
            int var17 = (class5.field89[class18.field322][var7 + 2][var9] - (class5.field89[class18.field322][var7 + 3][var9] - class5.field89[class18.field322][var7 + 2][var9])) * 3;
            int var18 = class5.field89[class18.field322][var7][var9];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = var16 + class5.field89[class18.field322][var7 + 2][var9] - var18 - var17;
            var6[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var6[0] - var3[0];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        float var12 = var6[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class329.field4568 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class369.field5199 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class155.field2192 = ((class5.field89[class282.field3996][var4 + 2][3] - class5.field89[class282.field3996][var4][3]) * class146.field2082 >> 16) + class5.field89[class282.field3996][var4][3];
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method1875(byte arg0) {
        if (arg0 <= 16) {
            method1876(false);
        }
        field4047 = null;
        field4053 = null;
        field4048 = null;
        field4045 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public static final void method1876(boolean arg0) {
        class416 var1 = class63.field867;
        synchronized (class63.field867) {
            class63.field867.method2611((byte) -20);
            if (arg0) {
                method1875((byte) -44);
            }
        }
        field4046++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lnq;ILja;)V")
    public static final void method1877(class268 arg0, int arg1, class152 arg2) {
        field4048 = arg0;
        class291.field4080 = arg2;
        field4052++;
        if (arg1 <= 97) {
            method1874((byte) 75);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II[I[I)V")
    public class288(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4051 = arg3;
        this.field4054 = arg2;
    }
}
