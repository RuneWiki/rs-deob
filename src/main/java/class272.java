import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class272 extends class86 {

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Z")
    public static boolean field4299 = true;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lfl;")
    public static class248 field4302;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lclient;")
    public static client field4303;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "[Lqd;")
    public static class3[] field4291;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[[I")
    public static int[][] field4297;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public static void method1834(int arg0) {
        if (arg0 >= -44) {
            field4297 = null;
        }
        field4302 = null;
        field4291 = null;
        field4303 = null;
        field4297 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[Lag;Z)V")
    public static final void method1835(int arg0, class188[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class188 var4 = arg1[var3];
            if (var4 != null && var4.field2870 == arg0 && (!var4.field2852 || !client.method1062(var4))) {
                if (var4.field2937 == 0) {
                    if (!var4.field2852 && client.method1062(var4) && class260.field3988 != var4) {
                        continue;
                    }
                    method1835(var4.field2977, arg1, false);
                    if (var4.field2968 != null) {
                        method1835(var4.field2977, var4.field2968, arg2);
                    }
                    class120 var5 = (class120) class13.field230.method1414(true, (long) var4.field2977);
                    if (var5 != null) {
                        class9.method102(var5.field1852, (byte) 79);
                    }
                }
                if (var4.field2937 == 6) {
                    if (var4.field2857 != -1 || var4.field2919 != -1) {
                        boolean var6 = class254.method1693(var4, (byte) 59);
                        int var7;
                        if (var6) {
                            var7 = var4.field2919;
                        } else {
                            var7 = var4.field2857;
                        }
                        if (var7 != -1) {
                            class223 var8 = class28.method224(var7, 122);
                            if (var8 != null) {
                                var4.field2974 += class127.field1996;
                                while (var4.field2974 > var8.field3488[var4.field2833]) {
                                    var4.field2974 -= var8.field3488[var4.field2833];
                                    var4.field2833++;
                                    if (var8.field3484.length <= var4.field2833) {
                                        var4.field2833 -= var8.field3487;
                                        if (var4.field2833 < 0 || var8.field3484.length <= var4.field2833) {
                                            var4.field2833 = 0;
                                        }
                                    }
                                    var4.field2868 = var4.field2833 + 1;
                                    if (var8.field3484.length <= var4.field2868) {
                                        var4.field2868 -= var8.field3487;
                                        if (var4.field2868 < 0 || var8.field3484.length <= var4.field2868) {
                                            var4.field2868 = -1;
                                        }
                                    }
                                    class246.method1663(255, var4);
                                }
                            }
                        }
                    }
                    if (var4.field2851 != 0 && !var4.field2852) {
                        int var9 = var4.field2851 >> 16;
                        int var10 = class127.field1996 * var9;
                        int var11 = var4.field2851 << 16 >> 16;
                        int var12 = class127.field1996 * var11;
                        var4.field2933 = var4.field2933 + var12 & 0x7FF;
                        var4.field2945 = var4.field2945 + var10 & 0x7FF;
                        class246.method1663(255, var4);
                    }
                }
            }
        }
        if (arg2) {
            method1835(72, (class188[]) null, true);
        }
        field4295++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1836(byte arg0) {
        field4301++;
        if (class126.field1981 == -1 || class1.field14 == -1) {
            return;
        }
        int var1 = class148.field2290 + ((class262.field4093 - class148.field2290) * class283.field4475 >> 16);
        class283.field4475 += var1;
        if (class283.field4475 < 65535) {
            class66.field1048 = false;
            class239.field3714 = false;
        } else {
            if (class239.field3714) {
                class66.field1048 = false;
            } else {
                class66.field1048 = true;
            }
            class283.field4475 = 65535;
            class239.field3714 = true;
        }
        float[] var2 = new float[3];
        float var3 = (float) class283.field4475 / 65535.0F;
        int var4 = class71.field1138 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class261.field4059[class126.field1981][var4 + 1][var5] * 3;
            int var23 = class261.field4059[class126.field1981][var4][var5] * 3;
            int var24 = (class261.field4059[class126.field1981][var4 + 2][var5] - (class261.field4059[class126.field1981][var4 + 3][var5] - class261.field4059[class126.field1981][var4 + 2][var5])) * 3;
            int var25 = var22 - var23;
            int var26 = class261.field4059[class126.field1981][var4][var5];
            int var27 = class261.field4059[class126.field1981][var4 + 2][var5] + var22 - var26 - var24;
            int var28 = var24 + var23 - (var22 * 2);
            var2[var5] = (((float) var27 * var3 + (float) var28) * var3 + (float) var25) * var3 + (float) var26;
        }
        class69.field1100 = (int) var2[2] - (class129.field2008 * 128);
        class266.field4245 = (int) var2[0] - (class118.field1828 * 128);
        class295.field4631 = (int) var2[1] * -1;
        int var6 = class113.field1781 * 2;
        float[] var7 = new float[3];
        int var8 = 34 % ((27 - arg0) / 42);
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class261.field4059[class1.field14][var6 + 1][var9] * 3;
            int var16 = class261.field4059[class1.field14][var6][var9] * 3;
            int var17 = (class261.field4059[class1.field14][var6 + 2][var9] + class261.field4059[class1.field14][var6 + 2][var9] - class261.field4059[class1.field14][var6 + 3][var9]) * 3;
            int var18 = class261.field4059[class1.field14][var6][var9];
            int var19 = var15 - var16;
            int var20 = var16 + var17 - (var15 * 2);
            int var21 = class261.field4059[class1.field14][var6 + 2][var9] - (var18 + var17 - var15);
            var7[var9] = (((float) var21 * var3 + (float) var20) * var3 + (float) var19) * var3 + (float) var18;
        }
        float var10 = var7[0] - var2[0];
        float var11 = (var7[1] - var2[1]) * -1.0F;
        float var12 = var7[2] - var2[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class165.field2501 = (float) Math.atan2((double) var11, var13);
        class263.field4115 = -((float) Math.atan2((double) var10, (double) var12));
        class142.field2182 = (int) ((double) class263.field4115 * 325.949D) & 0x7FF;
        class25.field373 = (int) ((double) class165.field2501 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(II)V")
    public class272(int arg0, int arg1) {
        this.field4296 = arg0;
        this.field4293 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V")
    public static final void method1837(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class201.method1351(arg4, arg2, arg3 + arg4, arg1 + arg2);
        class201.method1333(arg4, arg2, arg3, arg1, 0);
        field4294++;
        if (class122.field1874 < 100) {
            return;
        }
        if (class43.field698 == null || class43.field698.field54 != arg3 || class43.field698.field52 != arg1) {
            class49 var5 = new class49(arg3, arg1);
            class201.method1353(var5.field795, arg3, arg1);
            class68.method531(class188.field3010, arg1, class221.field3453, (byte) -42, arg3, 0, 0, 0, 0);
            class43.field698 = var5;
            class223.field3508.method1710(18814);
        }
        class43.field698.method38(arg4, arg2);
        int var6 = class77.field1305 * arg1 / class221.field3453 + arg2;
        int var7 = class69.field1098 * arg3 / class188.field3010;
        if (arg0 < 8) {
            method1836((byte) -81);
        }
        int var8 = class103.field1637 * arg3 / class188.field3010 + arg4;
        int var9 = class263.field4111 * arg1 / class221.field3453;
        int var10 = 16711680;
        if (class154.field2352 == 1) {
            var10 = 16777215;
        }
        class201.method1352(var8, var6, var7, var9, var10, 128);
        class201.method1340(var8, var6, var7, var9, var10);
        if (class217.field3414 <= 0) {
            return;
        }
        int var11;
        if (class242.field3748 > 10) {
            var11 = (20 - class242.field3748) * 25;
        } else {
            var11 = class242.field3748 * 25;
        }
        for (class26 var12 = (class26) class37.field639.method1010(126); var12 != null; var12 = (class26) class37.field639.method1008((byte) 88)) {
            if (class36.field578 == var12.field402) {
                int var13 = var12.field395 * arg3 / class188.field3010 + arg4;
                int var14 = var12.field404 * arg1 / class221.field3453 + arg2;
                class201.method1352(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }
}
