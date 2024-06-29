import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class161 extends class202 {

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
    public static int[] field2559 = new int[32];

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2561 = 0;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2563 = -1;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "J")
    public static long field2574 = 0L;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
    public static int[] field2562 = new int[50];

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    public int[] field2565;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[I")
    public int[] field2566;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[I")
    public int[] field2570;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[Lsg;")
    public class163[] field2567;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[Lsg;")
    public class163[] field2571;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[[[B")
    public byte[][][] field2560;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Z)V")
    public static void method1118(boolean arg0) {
        field2559 = null;
        field2562 = null;
        if (!arg0) {
            method1120((byte) -5, (class221) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwk;IIIIIIZ)V")
    public static final void method1119(class272 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4287.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4287[var9] - class4.field47;
            int var23 = arg0.field4294[var9] - class11.field157;
            int var24 = arg0.field4300[var9] - class21.field353;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4296 != null) {
                class272.field4291[var9] = var25;
                class272.field4280[var9] = var28;
                class272.field4289[var9] = var29;
            }
            class272.field4283[var9] = (var25 << 9) / var29 + class69.field1145;
            class272.field4290[var9] = (var28 << 9) / var29 + class69.field1150;
        }
        class69.field1139 = 0;
        int var10 = arg0.field4286.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4286[var11];
            int var13 = arg0.field4292[var11];
            int var14 = arg0.field4288[var11];
            int var15 = class272.field4283[var12];
            int var16 = class272.field4283[var13];
            int var17 = class272.field4283[var14];
            int var18 = class272.field4290[var12];
            int var19 = class272.field4290[var13];
            int var20 = class272.field4290[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class5.field57 && class131.method925(class69.field1145 + class111.field1840, class69.field1150 + class189.field3067, var18, var19, var20, var15, var16, var17)) {
                    class32.field498 = arg5;
                    class40.field746 = arg6;
                }
                if (!arg7) {
                    class69.field1144 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class69.field1138 || var16 > class69.field1138 || var17 > class69.field1138) {
                        class69.field1144 = true;
                    }
                    if (arg0.field4296 == null || arg0.field4296[var11] == -1) {
                        if (arg0.field4285[var11] != 12345678) {
                            class69.method500(var18, var19, var20, var15, var16, var17, arg0.field4285[var11], arg0.field4298[var11], arg0.field4282[var11]);
                        }
                    } else if (!class281.field4459) {
                        int var21 = class69.field1140.method1113(arg0.field4296[var11], 65535);
                        class69.method500(var18, var19, var20, var15, var16, var17, class179.method1218(var21, arg0.field4285[var11]), class179.method1218(var21, arg0.field4298[var11]), class179.method1218(var21, arg0.field4282[var11]));
                    } else if (arg0.field4293) {
                        class69.method497(var18, var19, var20, var15, var16, var17, arg0.field4285[var11], arg0.field4298[var11], arg0.field4282[var11], class272.field4291[0], class272.field4291[1], class272.field4291[3], class272.field4280[0], class272.field4280[1], class272.field4280[3], class272.field4289[0], class272.field4289[1], class272.field4289[3], arg0.field4296[var11]);
                    } else {
                        class69.method497(var18, var19, var20, var15, var16, var17, arg0.field4285[var11], arg0.field4298[var11], arg0.field4282[var11], class272.field4291[var12], class272.field4291[var13], class272.field4291[var14], class272.field4280[var12], class272.field4280[var13], class272.field4280[var14], class272.field4289[var12], class272.field4289[var13], class272.field4289[var14], arg0.field4296[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLog;)V")
    public static final void method1120(byte arg0, class221 arg1) {
        if (arg0 != 92) {
            method1120((byte) 96, (class221) null);
        }
        field2569++;
        byte[] var2 = new byte[24];
        if (class274.field4341 != null) {
            try {
                int var3 = 0;
                class274.field4341.method815(0L, (byte) -2);
                class274.field4341.method821(var2, 0);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1537(var2, (byte) 20, 24, 0);
    }
}
