import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class19 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field221 = -1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
    public static int[] field222;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Lrd;", line = 6)
    public static final class196 method87(byte arg0, int arg1) {
        int var2 = -44 % ((15 - arg0) / 36);
        field219++;
        class196 var3 = (class196) class267.field4500.method1424((long) arg1, (byte) 103);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class79.field1128.method1647(class295.method2023(-122, arg1), (byte) 120, class303.method2059(arg1, (byte) 110));
        class196 var5 = new class196();
        var5.field3210 = arg1;
        if (var4 != null) {
            var5.method1375(-19841, new class153(var4));
        }
        var5.method1381(-113);
        class267.field4500.method1430(var5, (long) arg1, 13487);
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 44)
    public static void method88(byte arg0) {
        field222 = null;
        if (arg0 != 104) {
            field221 = 103;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZIIIIIILj;)V", line = 65)
    public static final void method89(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class153 arg8) {
        if (arg7 != -65536) {
            return;
        }
        if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg1) {
                class159.field2520[arg4][arg3][arg0] = 0;
            }
            while (true) {
                int var9 = arg8.method1042((byte) -16);
                if (var9 == 0) {
                    if (arg1) {
                        class227.field3686[0][arg3][arg0] = class172.field2804[0][arg3][arg0];
                    } else if (arg4 == 0) {
                        class227.field3686[0][arg3][arg0] = -class15.method61(-82, arg3 + arg5 + 932731, arg6 + 556238 + arg0) * 8;
                    } else {
                        class227.field3686[arg4][arg3][arg0] = class227.field3686[arg4 - 1][arg3][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg8.method1042((byte) 95);
                    if (arg1) {
                        class227.field3686[0][arg3][arg0] = class172.field2804[0][arg3][arg0] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class227.field3686[0][arg3][arg0] = -var10 * 8;
                        } else {
                            class227.field3686[arg4][arg3][arg0] = class227.field3686[arg4 - 1][arg3][arg0] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class105.field1614[arg4][arg3][arg0] = arg8.method1078(-6338);
                    class153.field2389[arg4][arg3][arg0] = (byte) ((var9 - 2) / 4);
                    class291.field4912[arg4][arg3][arg0] = (byte) class159.method1119(var9 + arg2 - 2, 3);
                } else if (var9 > 81) {
                    class272.field4579[arg4][arg3][arg0] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class159.field2520[arg4][arg3][arg0] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg8.method1042((byte) 118);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg8.method1042((byte) 111);
                    break;
                }
                if (var11 <= 49) {
                    arg8.method1042((byte) 106);
                }
            }
        }
        field216++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 168)
    public static final void method90(byte arg0) {
        field220++;
        if (class134.field2102 == -1 || class293.field4977 == -1) {
            return;
        }
        int var1 = ((class168.field2714 - class241.field3936) * class252.field4288 >> 16) + class241.field3936;
        class252.field4288 += var1;
        float[] var2 = new float[3];
        int var3 = class289.field4858 * 2;
        if (class252.field4288 < 65535) {
            class153.field2369 = false;
            class259.field4394 = false;
        } else {
            class252.field4288 = 65535;
            if (class259.field4394) {
                class153.field2369 = false;
            } else {
                class153.field2369 = true;
            }
            class259.field4394 = true;
        }
        float var4 = (float) class252.field4288 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class195.field3166[class134.field2102][var3][var5] * 3;
            int var7 = class195.field3166[class134.field2102][var3 + 1][var5] * 3;
            int var8 = (class195.field3166[class134.field2102][var3 + 2][var5] + class195.field3166[class134.field2102][var3 + 2][var5] - class195.field3166[class134.field2102][var3 + 3][var5]) * 3;
            int var9 = class195.field3166[class134.field2102][var3][var5];
            int var10 = var7 - var6;
            int var11 = var8 + var6 - (var7 * 2);
            int var12 = class195.field3166[class134.field2102][var3 + 2][var5] + var7 - var9 - var8;
            var2[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var9;
        }
        if (class182.field2916 == 0 && class276.field4641 == 0) {
            class182.field2916 = (((int) var2[0] >> 10) - 6) * 8;
            class276.field4641 = ((int) var2[2] >> 10) * 8 - 48;
        }
        class143.field2208 = (int) var2[1] * -1;
        class248.field4249 = (int) var2[0] - (class182.field2916 * 128);
        int var13 = class130.field2027 * 2;
        float[] var14 = new float[3];
        class157.field2483 = (int) var2[2] - (class276.field4641 * 128);
        if (arg0 > -125) {
            field221 = 33;
        }
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = (class195.field3166[class293.field4977][var13 + 2][var15] + class195.field3166[class293.field4977][var13 + 2][var15] - class195.field3166[class293.field4977][var13 + 3][var15]) * 3;
            int var17 = class195.field3166[class293.field4977][var13 + 1][var15] * 3;
            int var18 = class195.field3166[class293.field4977][var13][var15] * 3;
            int var19 = class195.field3166[class293.field4977][var13][var15];
            int var20 = var16 + var18 - (var17 * 2);
            int var21 = var17 - var18;
            int var22 = class195.field3166[class293.field4977][var13 + 2][var15] + var17 - var19 - var16;
            var14[var15] = (((float) var22 * var4 + (float) var20) * var4 + (float) var21) * var4 + (float) var19;
        }
        float var23 = var14[0] - var2[0];
        float var24 = var14[2] - var2[2];
        float var25 = (var14[1] - var2[1]) * -1.0F;
        double var26 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        class297.field5016 = (float) Math.atan2((double) var25, var26);
        class142.field2187 = -((float) Math.atan2((double) var23, (double) var24));
        class105.field1624 = (int) ((double) class297.field5016 * 325.949D) & 0x7FF;
        class288.field4847 = (int) ((double) class142.field2187 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Lha;", line = 287)
    public static final class49 method91(byte arg0) {
        if (arg0 != 81) {
            return (class49) null;
        }
        field217++;
        int var1 = class214.field3490[0] * class205.field3374[0];
        byte[] var2 = class236.field3779[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class123.field1905[class159.method1119(255, var2[var4])];
        }
        class49 var5 = new class49(class56.field724, class206.field3381, class154.field2430[0], class254.field4341[0], class205.field3374[0], class214.field3490[0], var3);
        class244.method1679(arg0 - 14723);
        return var5;
    }
}
