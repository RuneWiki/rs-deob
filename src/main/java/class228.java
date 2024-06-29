import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class228 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lda;")
    public static class275 field3853 = class255.method1672(113, "weiss:");

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[I")
    public static int[] field3851 = new int[32768];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[Lrk;")
    public static class20[] field3855;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
    public static final void method1472(byte arg0, boolean arg1) {
        field3857++;
        class139.field2428 = arg1;
        if (class139.field2428) {
            int var15 = class196.field3351.method567(arg0 - 249);
            int var16 = class196.field3351.method562(-124);
            int var17 = class196.field3351.method566(arg0 - 126);
            int var18 = class196.field3351.method562(-126);
            int var19 = class196.field3351.method566(-1);
            class196.field3351.method522(arg0 - 1);
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class196.field3351.method525((byte) -101, 1);
                        if (var37 == 1) {
                            class90.field1536[var20][var35][var36] = class196.field3351.method525((byte) -54, 26);
                        } else {
                            class90.field1536[var20][var35][var36] = -1;
                        }
                    }
                }
            }
            class196.field3351.method515((byte) -128);
            int var21 = (class59.field1000 - class196.field3351.field1392) / 16;
            class39.field647 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class39.field647[var22][var34] = class196.field3351.method568(19845);
                }
            }
            class115.field2045 = new byte[var21][];
            class86.field1458 = new int[var21];
            class162.field2836 = new int[var21];
            class61.field1031 = new int[var21];
            class160.field2811 = null;
            class248.field4369 = new byte[var21][];
            class160.field2809 = new int[var21];
            class120.field2152 = null;
            class249.field4401 = new int[var21];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class90.field1536[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class61.field1031[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class61.field1031[var23] = var30;
                                int var32 = var30 & 0xFF;
                                int var33 = (var30 & 0xFF47) >> 8;
                                class86.field1458[var23] = class188.field3251.method767(arg0 + 524162, class197.method1291(new class275[] { class39.field644, class250.method1644(var33, (byte) -115), class96.field1637, class250.method1644(var32, (byte) -115) }, -30025));
                                class160.field2809[var23] = class188.field3251.method767(524287, class197.method1291(new class275[] { class247.field4361, class250.method1644(var33, (byte) -115), class96.field1637, class250.method1644(var32, (byte) -115) }, arg0 - 30150));
                                class249.field4401[var23] = class188.field3251.method767(arg0 + 524162, class197.method1291(new class275[] { class93.field1602, class250.method1644(var33, (byte) -115), class96.field1637, class250.method1644(var32, (byte) -115) }, arg0 + -30150));
                                class162.field2836[var23] = class188.field3251.method767(524287, class197.method1291(new class275[] { class197.field3365, class250.method1644(var33, (byte) -115), class96.field1637, class250.method1644(var32, (byte) -115) }, arg0 - 30150));
                                var23++;
                            }
                        }
                    }
                }
            }
            class77.method508(var18, false, var19, var16, var17, var15, 16055);
        } else {
            int var2 = class196.field3351.method562(-127);
            int var3 = (class59.field1000 - class196.field3351.field1392) / 16;
            class39.field647 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class39.field647[var4][var14] = class196.field3351.method611(arg0 - 241);
                }
            }
            int var5 = class196.field3351.method566(-1);
            int var6 = class196.field3351.method580(true);
            int var7 = class196.field3351.method559(0);
            int var8 = class196.field3351.method608(38);
            class248.field4369 = new byte[var3][];
            class115.field2045 = new byte[var3][];
            boolean var9 = false;
            class86.field1458 = new int[var3];
            class120.field2152 = null;
            class160.field2811 = null;
            class162.field2836 = new int[var3];
            class249.field4401 = new int[var3];
            if ((var2 / 8 == 48 || (var2 / 8) == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            class160.field2809 = new int[var3];
            class61.field1031 = new int[var3];
            if (var2 / 8 == 48 && (var6 / 8) == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= ((var2 + 6) / 8); var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (var9 && var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || !(var11 != 49 || var12 != 47)) {
                        class61.field1031[var10] = var13;
                        class86.field1458[var10] = -1;
                        class160.field2809[var10] = -1;
                        class249.field4401[var10] = -1;
                        class162.field2836[var10] = -1;
                    } else {
                        class61.field1031[var10] = var13;
                        class86.field1458[var10] = class188.field3251.method767(arg0 + 524162, class197.method1291(new class275[] { class39.field644, class250.method1644(var11, (byte) -115), class96.field1637, class250.method1644(var12, (byte) -115) }, -30025));
                        class160.field2809[var10] = class188.field3251.method767(524287, class197.method1291(new class275[] { class247.field4361, class250.method1644(var11, (byte) -115), class96.field1637, class250.method1644(var12, (byte) -115) }, -30025));
                        class249.field4401[var10] = class188.field3251.method767(524287, class197.method1291(new class275[] { class93.field1602, class250.method1644(var11, (byte) -115), class96.field1637, class250.method1644(var12, (byte) -115) }, class261.method1705(arg0, -30006)));
                        class162.field2836[var10] = class188.field3251.method767(arg0 + 524162, class197.method1291(new class275[] { class197.field3365, class250.method1644(var11, (byte) -115), class96.field1637, class250.method1644(var12, (byte) -115) }, arg0 + -30150));
                    }
                    var10++;
                }
            }
            class77.method508(var8, false, var5, var6, var2, var7, 16055);
        }
        if (arg0 != 125) {
            method1473(false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static final void method1473(boolean arg0) {
        field3856++;
        int[] var1 = new int[class11.field159];
        if (!arg0) {
            method1474(-57, false, 63, -127);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class11.field159; var3++) {
            class245 var5 = class210.method1352(109, var3);
            if (var5.field4291 >= 0 || var5.field4317 >= 0) {
                var1[var2++] = var3;
            }
        }
        class69.field1127 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class69.field1127[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZII)I")
    public static final int method1474(int arg0, boolean arg1, int arg2, int arg3) {
        field3850++;
        int var4 = arg3 & arg2 - 1;
        int var5 = arg0 / arg2;
        int var6 = arg2 - 1 & arg0;
        int var7 = arg3 / arg2;
        if (!arg1) {
            method1476(-47);
        }
        int var8 = class277.method1875(var5, var7, -73);
        int var9 = class277.method1875(var5, var7 + 1, -120);
        int var10 = class277.method1875(var5 + 1, var7, -122);
        int var11 = class277.method1875(var5 + 1, var7 - -1, -126);
        int var12 = class224.method1450(79, var4, var8, var9, arg2);
        int var13 = class224.method1450(-128, var4, var10, var11, arg2);
        return class224.method1450(-124, var6, var12, var13, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBIZIZI)V")
    public static final void method1475(int arg0, byte arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3849++;
        if (arg0 < arg6) {
            int var7 = arg0;
            int var8 = (arg0 + arg6) / 2;
            class270 var9 = class148.field2582[var8];
            class148.field2582[var8] = class148.field2582[arg6];
            class148.field2582[arg6] = var9;
            for (int var10 = arg0; var10 < arg6; var10++) {
                if (class148.method1055((byte) -108, arg3, arg4, class148.field2582[var10], arg5, arg2, var9) <= 0) {
                    class270 var11 = class148.field2582[var10];
                    class148.field2582[var10] = class148.field2582[var7];
                    class148.field2582[var7++] = var11;
                }
            }
            class148.field2582[arg6] = class148.field2582[var7];
            class148.field2582[var7] = var9;
            method1475(arg0, (byte) -27, arg2, arg3, arg4, arg5, var7 - 1);
            method1475(var7 + 1, (byte) -27, arg2, arg3, arg4, arg5, arg6);
        }
        if (arg1 != -27) {
            field3851 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1476(int arg0) {
        if (arg0 <= -70) {
            field3853 = null;
            field3851 = null;
            field3855 = null;
        }
    }
}
