import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class603 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lkf;")
    public class346 field8363 = new class346();

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lmq;")
    public static class78 field8368 = new class78(95, 10);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lkha;")
    public static class687 field8364;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
    public static final void method3315(int arg0, int arg1, int arg2, int arg3) {
        class215.field2728 = new byte[arg2][arg3][arg1];
        field8365++;
        int var4 = -59 % ((17 - arg0) / 45);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method3316(byte arg0) {
        field8368 = null;
        if (arg0 >= -45) {
            method3316((byte) 69);
        }
        field8364 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[II[JI)V")
    public static final void method3317(int arg0, int[] arg1, int arg2, long[] arg3, int arg4) {
        int var5 = -117 / (-arg0 / 63);
        field8367++;
        if (arg2 >= arg4) {
            return;
        }
        int var6 = (arg2 + arg4) / 2;
        int var7 = arg2;
        long var8 = arg3[var6];
        arg3[var6] = arg3[arg4];
        arg3[arg4] = var8;
        int var10 = arg1[var6];
        arg1[var6] = arg1[arg4];
        arg1[arg4] = var10;
        int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
        for (int var12 = arg2; var12 < arg4; var12++) {
            if ((long) (var12 & var11) + var8 > arg3[var12]) {
                long var13 = arg3[var12];
                arg3[var12] = arg3[var7];
                arg3[var7] = var13;
                int var15 = arg1[var12];
                arg1[var12] = arg1[var7];
                arg1[var7++] = var15;
            }
        }
        arg3[arg4] = arg3[var7];
        arg3[var7] = var8;
        arg1[arg4] = arg1[var7];
        arg1[var7] = var10;
        method3317(117, arg1, arg2, arg3, var7 - 1);
        method3317(66, arg1, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static final void method3318(boolean arg0) {
        if (!arg0) {
            field8368 = null;
        }
        field8366++;
        if (class522.field7390 == -1 || class737.field10329 == -1) {
            return;
        }
        int var1 = ((class130.field1564 - class374.field5256) * class261.field3317 >> 16) + class374.field5256;
        class261.field3317 += var1;
        if (class261.field3317 < 65535) {
            class534.field7498 = false;
            class716.field10094 = false;
        } else {
            class261.field3317 = 65535;
            if (class534.field7498) {
                class716.field10094 = false;
            } else {
                class716.field10094 = true;
            }
            class534.field7498 = true;
        }
        float var2 = (float) class261.field3317 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class448.field6295 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class93.field1189[class522.field7390][var4][var5] * 3;
            int var22 = class93.field1189[class522.field7390][var4 + 1][var5] * 3;
            int var23 = (class93.field1189[class522.field7390][var4 + 2][var5] + class93.field1189[class522.field7390][var4 - -2][var5] - class93.field1189[class522.field7390][var4 + 3][var5]) * 3;
            int var24 = class93.field1189[class522.field7390][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class93.field1189[class522.field7390][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class505.field7134 = (int) var3[0] - (class63.field851 * 512);
        class407.field5744 = (int) var3[2] - class753.field10509 * 512;
        class524.field7412 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class151.field1828 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class93.field1189[class737.field10329][var7][var8] * 3;
            int var15 = class93.field1189[class737.field10329][var7 + 1][var8] * 3;
            int var16 = (class93.field1189[class737.field10329][var7 + 2][var8] - (class93.field1189[class737.field10329][var7 + 3][var8] - class93.field1189[class737.field10329][var7 + 2][var8])) * 3;
            int var17 = class93.field1189[class737.field10329][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class93.field1189[class737.field10329][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class411.field5801 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class688.field9781 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class156.field1974 = ((class93.field1189[class522.field7390][var4 + 2][3] - class93.field1189[class522.field7390][var4][3]) * class261.field3317 >> 16) + class93.field1189[class522.field7390][var4][3];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static final void method3319() {
        for (int var0 = 0; var0 < class618.field8661; var0++) {
            class451 var1 = class102.field1257[var0];
            class293.method1760(var1, true);
            class102.field1257[var0] = null;
        }
        class618.field8661 = 0;
    }
}
