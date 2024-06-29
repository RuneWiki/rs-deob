import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class317 extends class445 {

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field4182 = 1337;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Lgd;")
    public static class206 field4181 = new class206("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class136.field1977 != null) {
            class136.field1977[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class246.field3284 != null) {
            class246.field3284[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class56.field768 != null) {
            class56.field768[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 30)
    public static void method1737(int arg0) {
        field4181 = null;
        if (arg0 != 16383) {
            method1736(-15, 22, 102, -107, 126);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V", line = 41)
    public static final void method1738(long[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        if (arg1 != 26085) {
            method1737(45);
        }
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg0[var10] < (var7 + ((long) (var10 & 0x1)))) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method1738(arg0, 26085, var6 - 1, arg3, arg4);
            method1738(arg0, arg1, arg2, arg3, var6 + 1);
        }
        field4185++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIIIII)V", line = 96)
    public static final void method1739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4186++;
        if (arg3 != -16516) {
            return;
        }
        if (class492.method2867(arg4, (byte) 94)) {
            if (class392.field5437[arg4] == null) {
                class244.method1360(arg1, -1, class146.field2099[arg4], (byte) -115, arg0, arg6, arg7, arg2, arg5, arg8);
            } else {
                class244.method1360(arg1, -1, class392.field5437[arg4], (byte) -114, arg0, arg6, arg7, arg2, arg5, arg8);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class102.field1468[var9] = true;
            }
        } else {
            class102.field1468[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V", line = 137)
    public static final void method1740(byte arg0) {
        if (arg0 != 85) {
            field4182 = -23;
        }
        field4184++;
        if (class358.field4957 == -1 || class26.field335 == -1) {
            return;
        }
        int var1 = class297.field3966 + ((class226.field2984 - class297.field3966) * class138.field2008 >> 16);
        class138.field2008 += var1;
        if (class138.field2008 < 65535) {
            class208.field2815 = false;
            class51.field682 = false;
        } else {
            class138.field2008 = 65535;
            if (class208.field2815) {
                class51.field682 = false;
            } else {
                class51.field682 = true;
            }
            class208.field2815 = true;
        }
        float var2 = (float) class138.field2008 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class110.field1660 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class37.field553[class358.field4957][var4][var5] * 3;
            int var22 = class37.field553[class358.field4957][var4 + 1][var5] * 3;
            int var23 = (class37.field553[class358.field4957][var4 + 2][var5] - (class37.field553[class358.field4957][var4 + 3][var5] - class37.field553[class358.field4957][var4 + 2][var5])) * 3;
            int var24 = class37.field553[class358.field4957][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class37.field553[class358.field4957][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class195.field2638 = (int) var3[1] * -1;
        class197.field2680 = (int) var3[0] - (class162.field2260 * 128);
        class412.field5637 = (int) var3[2] - (class266.field3511 * 128);
        float[] var6 = new float[3];
        int var7 = class343.field4600 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class37.field553[class26.field335][var7][var8] * 3;
            int var15 = class37.field553[class26.field335][var7 + 1][var8] * 3;
            int var16 = (class37.field553[class26.field335][var7 + 2][var8] + class37.field553[class26.field335][var7 + 2][var8] - class37.field553[class26.field335][var7 + 3][var8]) * 3;
            int var17 = class37.field553[class26.field335][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class37.field553[class26.field335][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class155.field2171 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class348.field4796 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class176.field2398 = ((class37.field553[class358.field4957][var4 + 2][3] - class37.field553[class358.field4957][var4][3]) * class138.field2008 >> 16) + class37.field553[class358.field4957][var4][3];
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
    public abstract int method1549(byte arg0);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
    public abstract int method1551(int arg0);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)I")
    public abstract int method1546(boolean arg0);

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)J")
    public abstract long method1554(byte arg0);
}
