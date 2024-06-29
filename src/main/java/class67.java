import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class67 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lvq;")
    public static class24 field889 = new class24(1, 6);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lvq;")
    public static class24 field890 = new class24(28, -2);

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lwk;")
    public static class441 field891 = new class441();

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Ll;")
    public static class270 field893 = new class270();

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "[Z")
    public static boolean[] field895 = new boolean[100];

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "[S")
    public static short[] field896 = new short[256];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ji", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field884++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 18)
    public static void method499(byte arg0) {
        field895 = null;
        field890 = null;
        field891 = null;
        field896 = null;
        if (arg0 > -63) {
            method503(true);
        }
        field889 = null;
        field893 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;ILgt;)Llf;", line = 36)
    public static final class350 method500(boolean arg0, String arg1, int arg2, class341 arg3) {
        if (!arg0) {
            return null;
        }
        field886++;
        if (arg2 == 0) {
            return arg3.method2198(arg1, 0);
        } else if (arg2 == 1) {
            try {
                class73.method522("openjs", arg3.field5023, new Object[] { (new URL(arg3.field5023.getCodeBase(), arg1)).toString() }, 20406);
                class350 var4 = new class350();
                var4.field5134 = 1;
                return var4;
            } catch (Throwable var10) {
                class350 var5 = new class350();
                var5.field5134 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg3.field5023.getAppletContext().showDocument(new URL(arg3.field5023.getCodeBase(), arg1), "_blank");
                class350 var6 = new class350();
                var6.field5134 = 1;
                return var6;
            } catch (Exception var11) {
                class350 var7 = new class350();
                var7.field5134 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class73.method521(arg0, arg3.field5023, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg3.field5023.getAppletContext().showDocument(new URL(arg3.field5023.getCodeBase(), arg1), "_top");
                class350 var8 = new class350();
                var8.field5134 = 1;
                return var8;
            } catch (Exception var12) {
                class350 var9 = new class350();
                var9.field5134 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V", line = 113)
    public static final void method501(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5335 != null) {
            var3.field5335 = null;
        }
        if (var3.field5332 != null) {
            var3.field5332 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 126)
    public static final void method502(int arg0) {
        class125.field1668 = 1;
        class38.field539 = 0;
        class307.field4525 = -1;
        class92.field1150 = -3;
        class417.field6025 = false;
        class450.field6640 = arg0;
        field888++;
        class51.field641 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 140)
    public static final void method503(boolean arg0) {
        if (arg0) {
            field890 = null;
        }
        field882++;
        client.method1796(25, 77);
        class195.method1356(-124);
        System.gc();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfp;ILkg;II)V", line = 154)
    public static final void method504(class9 arg0, int arg1, class223 arg2, int arg3, int arg4) {
        field887++;
        class195 var5 = arg2.method1534((byte) -111, arg0);
        if (var5 == null) {
            return;
        }
        if (arg3 != -2) {
            method503(false);
        }
        arg0.method77(arg4, arg1, arg2.field3233 + arg4, arg2.field3352 + arg1);
        if (class164.field2169 == 2 || class164.field2169 == 5 || class241.field3571 == null) {
            arg0.method105(-16777216, var5, arg4, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class28.field402 == 4) {
            var8 = class152.field2056;
            var6 = (int) (-class1.field19) & 0x3FFF;
            var9 = class188.field2629;
            var7 = 4096;
        } else {
            var6 = (int) (-class1.field19) + class303.field4429 & 0x3FFF;
            var7 = 4096 - (class30.field422 * 16);
            var8 = class187.field2619.field4954;
            var9 = class187.field2619.field4951;
        }
        int var10 = var8 / 32 + 48 - ((class195.field2745 - 104) * 2);
        int var11 = class78.field984 * 4 + 48 + 208 - (class78.field984 * 2) - (var9 / 32);
        class241.field3571.method1918((float) arg2.field3233 / 2.0F + (float) arg4, (float) arg2.field3352 / 2.0F + (float) arg1, (float) var10, (float) var11, var7, var6 << 2, var5, arg4, arg1);
        for (class13 var12 = (class13) class5.field75.method2478(1603); var12 != null; var12 = (class13) class5.field75.method2486((byte) -82)) {
            int var52 = var12.field214;
            int var53 = ((class339.field5003.field1052[var52] & 0xFFFF41B) >> 14) - class28.field399;
            int var54 = (class339.field5003.field1052[var52] & 0x3FFF) - class134.field1846;
            int var55 = var53 * 4 + 2 - (var8 / 32);
            int var56 = var54 * 4 + 2 - (var9 / 32);
            client.method1814(var55, class339.field5003.field1053[var52], arg1, var56, arg2, arg4, arg0, arg3 + 3, var5);
        }
        for (int var13 = 0; var13 < class458.field6766; var13++) {
            int var49 = class346.field5103[var13] * 4 - ((var8 / 32) - 2);
            int var50 = class298.field4333[var13] * 4 + 2 - (var9 / 32);
            class178 var51 = class450.method2785(class316.field4619[var13], (byte) 121);
            if (var51.field2489 != null) {
                var51 = var51.method1240((byte) -116);
                if (var51 == null || var51.field2460 == -1) {
                    continue;
                }
            }
            client.method1814(var49, var51.field2460, arg1, var50, arg2, arg4, arg0, 1, var5);
        }
        for (class447 var14 = (class447) class200.field2828.method608((byte) 121); var14 != null; var14 = (class447) class200.field2828.method604(arg3 - 84)) {
            int var46 = (int) (var14.field3907 >> 28 & 0x3L);
            if (class212.field2993 == var46) {
                int var47 = (int) (var14.field3907 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var48 = (int) (var14.field3907 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class411.method2549(-1, var47, arg2, class249.field3666[0], var48, var5, arg4, arg1);
            }
        }
        for (int var15 = 0; var15 < class14.field231; var15++) {
            class26 var42 = class364.field5260[class301.field4380[var15]];
            if (var42 != null && var42.method266(arg3 - 126) && class187.field2619.field4960 == var42.field4960) {
                class327 var43 = var42.field369;
                if (var43 != null && var43.field4871 != null) {
                    var43 = var43.method2139(true);
                }
                if (var43 != null && var43.field4837 && var43.field4810) {
                    int var44 = var42.field4954 / 32 - (var8 / 32);
                    int var45 = var42.field4951 / 32 - (var9 / 32);
                    if (var43.field4854 == -1) {
                        class411.method2549(arg3 ^ 0x1, var44, arg2, class249.field3666[1], var45, var5, arg4, arg1);
                    } else {
                        client.method1814(var44, var43.field4854, arg1, var45, arg2, arg4, arg0, arg3 + 3, var5);
                    }
                }
            }
        }
        int var16 = class208.field2933;
        int[] var17 = class88.field1085;
        for (int var18 = 0; var18 < var16; var18++) {
            class380 var34 = class455.field6731[var17[var18]];
            if (var34 != null && var34.method2413(-124) && class187.field2619 != var34 && class187.field2619.field4960 == var34.field4960) {
                int var35 = var34.field4954 / 32 - (var8 / 32);
                int var36 = var34.field4951 / 32 - (var9 / 32);
                boolean var37 = false;
                for (int var38 = 0; var38 < class373.field5450; var38++) {
                    if (var34.field5587.equals(class271.field4015[var38]) && class57.field699[var38] != 0) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                for (int var40 = 0; var40 < class418.field6032; var40++) {
                    if (var34.field5587.equals(class253.field3720[var40].field3865)) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                if (class187.field2619.field5580 != 0 && var34.field5580 != 0 && class187.field2619.field5580 == var34.field5580) {
                    var41 = true;
                }
                if (var37) {
                    class411.method2549(-1, var35, arg2, class249.field3666[3], var36, var5, arg4, arg1);
                } else if (var39) {
                    class411.method2549(arg3 ^ 0x1, var35, arg2, class249.field3666[5], var36, var5, arg4, arg1);
                } else if (var41) {
                    class411.method2549(-1, var35, arg2, class249.field3666[4], var36, var5, arg4, arg1);
                } else {
                    class411.method2549(-1, var35, arg2, class249.field3666[2], var36, var5, arg4, arg1);
                }
            }
        }
        class99[] var19 = class331.field4910;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class99 var23 = var19[var20];
            if (var23 != null && var23.field1223 != 0 && (class388.field5665 % 20) < 10) {
                if (var23.field1223 == 1 && var23.field1230 >= 0 && var23.field1230 < class364.field5260.length) {
                    class26 var24 = class364.field5260[var23.field1230];
                    if (var24 != null) {
                        int var25 = var24.field4954 / 32 - (var8 / 32);
                        int var26 = var24.field4951 / 32 - (var9 / 32);
                        class153.method1048(110, arg4, var26, var25, 360000, arg2, arg1, var23.field1231, var5);
                    }
                }
                if (var23.field1223 == 2) {
                    int var27 = (var23.field1225 - class28.field399) * 4 + 2 - (var8 / 32);
                    int var28 = (var23.field1221 - class134.field1846) * 4 + 2 - (var9 / 32);
                    int var29 = var23.field1235 * 4;
                    int var30 = var29 * var29;
                    class153.method1048(97, arg4, var28, var27, var30, arg2, arg1, var23.field1231, var5);
                }
                if (var23.field1223 == 10 && var23.field1230 >= 0 && var23.field1230 < class455.field6731.length) {
                    class380 var31 = class455.field6731[var23.field1230];
                    if (var31 != null) {
                        int var32 = var31.field4954 / 32 - (var8 / 32);
                        int var33 = var31.field4951 / 32 - var9 / 32;
                        class153.method1048(arg3 - 92, arg4, var33, var32, 360000, arg2, arg1, var23.field1231, var5);
                    }
                }
            }
        }
        if (class28.field402 == 4) {
            return;
        }
        if (class36.field516 != 0) {
            int var21 = class36.field516 * 4 + ((class187.field2619.method446(10) + -1) * 2) - (var8 / 32 - 2);
            int var22 = (class247.field3647 * 4 - (var9 / 32 - (class187.field2619.method446(10) - 1) * 2)) + 2;
            class411.method2549(-1, var21, arg2, class163.field2157[class441.field6418 ? 1 : 0], var22, var5, arg4, arg1);
        }
        arg0.method150(arg3 ^ 0x68, arg1 + (arg2.field3352 / 2) - 1, arg2.field3233 / 2 + arg4 + -1, 3, -1, 3);
        return;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lct;Lct;Lrs;B)V", line = 447)
    public static final void method505(class104 arg0, class104 arg1, class246 arg2, byte arg3) {
        class251.field3689 = arg0;
        class404.field5854 = arg1;
        field885++;
        class408.field5876 = arg2;
        if (class404.field5854 != null) {
            class383.field5616 = class404.field5854.method734(100, 1);
        }
        if (arg3 != 108) {
            field891 = null;
        }
        if (class251.field3689 != null) {
            class270.field4000 = class251.field3689.method734(114, 1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(II)V", line = 475)
    public class67(int arg0, int arg1) {
        this.field892 = arg0;
    }
}
