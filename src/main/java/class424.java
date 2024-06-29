import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class424 extends class359 {

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public int field6078 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public int field6084 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public int field6085 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public int field6092 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field6093 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public int field6091 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public int field6082 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public int field6094 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Lgk;")
    public class278 field6088;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lfi;")
    public static class331 field6079 = new class331(64);

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field6086 = -1;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6087 = "green:";

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2626(byte arg0) {
        field6081++;
        class175.field2435.method2043(-106);
        if (arg0 == 23) {
            class72.field808.method2043(arg0 ^ 0xFFFFFF8D);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2627(boolean arg0) {
        field6079 = null;
        if (!arg0) {
            field6087 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILbb;IIZ)V", line = 28)
    public static final void method2628(int arg0, int arg1, class182 arg2, int arg3, int arg4, boolean arg5) {
        field6095++;
        if (class45.field544 >= 50 || arg2 == null || arg2.field2501 == null || arg2.field2501.length <= arg0 || arg2.field2501[arg0] == null) {
            return;
        }
        int var6 = arg2.field2501[arg0][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (arg2.field2501[arg0].length > 1) {
            int var9 = (int) ((double) arg2.field2501[arg0].length * Math.random());
            if (var9 > 0) {
                var7 = arg2.field2501[arg0][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg5) {
                class7.method67((byte) 106, 0, 255, var8, var7);
            }
        } else if (class308.field4405 != 0) {
            class116.field1373[class45.field544] = var7;
            class56.field632[class45.field544] = var8;
            class119.field1560[class45.field544] = arg3;
            class236.field3210[class45.field544] = null;
            class83.field932[class45.field544] = 255;
            int var11 = (arg1 - 64) / 128;
            int var12 = (arg4 - 64) / 128;
            class268.field3768[class45.field544] = (var11 << 16) + (var12 << 8) + var10;
            class45.field544++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V", line = 85)
    public static final void method2629(boolean arg0, byte arg1) {
        if (arg1 <= 84) {
            field6087 = null;
        }
        class150.field2108 = arg0;
        field6080++;
        if (!class150.field2108) {
            int var2 = class249.field3379.method1342((byte) -128);
            int var3 = class249.field3379.method1385(-118);
            int var4 = class249.field3379.method1342((byte) -127);
            int var5 = class249.field3379.method1355(32136);
            int var6 = class249.field3379.method1349(-95);
            int var7 = (class290.field4131 - class249.field3379.field2888) / 16;
            class315.field4489 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class315.field4489[var8][var16] = class249.field3379.method1363(97);
                }
            }
            int var9 = class249.field3379.method1377(29247);
            boolean var10 = class249.field3379.method1356((byte) -122) == 1;
            class350.method2232(27, var4);
            class239.field3252 = new byte[var7][];
            class98.field1109 = new byte[var7][];
            class291.field4182 = new int[var7];
            class246.field3338 = null;
            class237.field3226 = new int[var7];
            class71.field805 = new int[var7];
            class433.field6308 = null;
            class193.field2638 = new int[var7];
            class37.field382 = new byte[var7][];
            class157.field2234 = new int[var7];
            class349.field5097 = new byte[var7][];
            boolean var11 = false;
            if ((var3 / 8 == 48 || (var3 / 8) == 49) && var5 / 8 == 48) {
                var11 = true;
            }
            if ((var3 / 8) == 48 && (var5 / 8) == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var3 - (class279.field3935 >> 4)) / 8; var13 <= ((var3 + (class279.field3935 >> 4)) / 8); var13++) {
                for (int var14 = (var5 - (class164.field2287 >> 4)) / 8; var14 <= (var5 + (class164.field2287 >> 4)) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class71.field805[var12] = var15;
                        class291.field4182[var12] = -1;
                        class237.field3226[var12] = -1;
                        class157.field2234[var12] = -1;
                        class193.field2638[var12] = -1;
                    } else {
                        class71.field805[var12] = var15;
                        class291.field4182[var12] = class282.field3968.method332("m" + var13 + "_" + var14, -1);
                        class237.field3226[var12] = class282.field3968.method332("l" + var13 + "_" + var14, -1);
                        class157.field2234[var12] = class282.field3968.method332("um" + var13 + "_" + var14, -1);
                        class193.field2638[var12] = class282.field3968.method332("ul" + var13 + "_" + var14, -1);
                    }
                    var12++;
                }
            }
            class35.method201(var5, -30684, var6, false, var9, var10, var2, var3);
            return;
        }
        int var17 = class249.field3379.method1356((byte) 120);
        int var18 = class249.field3379.method1349(-48);
        boolean var19 = class249.field3379.method1356((byte) -47) == 1;
        int var20 = class249.field3379.method1385(-102);
        int var21 = class249.field3379.method1349(-45);
        int var22 = class249.field3379.method1355(32136);
        int var23 = class249.field3379.method1356((byte) 101);
        class350.method2232(23, var17);
        class249.field3379.method813((byte) -86);
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var39 = 0; var39 < (class279.field3935 >> 3); var39++) {
                for (int var40 = 0; var40 < (class164.field2287 >> 3); var40++) {
                    int var41 = class249.field3379.method817(77, 1);
                    if (var41 == 1) {
                        class311.field4449[var24][var39][var40] = class249.field3379.method817(23, 26);
                    } else {
                        class311.field4449[var24][var39][var40] = -1;
                    }
                }
            }
        }
        class249.field3379.method810(-1);
        int var25 = (class290.field4131 - class249.field3379.field2888) / 16;
        class315.field4489 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var38 = 0; var38 < 4; var38++) {
                class315.field4489[var26][var38] = class249.field3379.method1336((byte) -45);
            }
        }
        class193.field2638 = new int[var25];
        class98.field1109 = new byte[var25][];
        class246.field3338 = null;
        class349.field5097 = new byte[var25][];
        class157.field2234 = new int[var25];
        class239.field3252 = new byte[var25][];
        class237.field3226 = new int[var25];
        class71.field805 = new int[var25];
        class291.field4182 = new int[var25];
        class433.field6308 = null;
        class37.field382 = new byte[var25][];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < class279.field3935 >> 3; var29++) {
                for (int var30 = 0; var30 < class164.field2287 >> 3; var30++) {
                    int var31 = class311.field4449[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFC67E) >> 14;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class71.field805[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class71.field805[var27] = var34;
                            int var36 = (var34 & 0xFFA8) >> 8;
                            int var37 = var34 & 0xFF;
                            class291.field4182[var27] = class282.field3968.method332("m" + var36 + "_" + var37, -1);
                            class237.field3226[var27] = class282.field3968.method332("l" + var36 + "_" + var37, -1);
                            class157.field2234[var27] = class282.field3968.method332("um" + var36 + "_" + var37, -1);
                            class193.field2638[var27] = class282.field3968.method332("ul" + var36 + "_" + var37, -1);
                            var27++;
                        }
                    }
                }
            }
        }
        class35.method201(var20, -30684, var22, false, var21, var19, var23, var18);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)Ljava/lang/String;", line = 341)
    public static final String method2630(byte arg0) {
        field6083++;
        String var1 = "www";
        if (class213.field2908 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        int var3 = 3 % ((arg0 - 44) / 49);
        if (class100.field1130 != null) {
            var2 = "/p=" + class100.field1130;
        }
        return class136.field1912 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class297.field4234 + "/a=" + class404.field5884 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class297.field4234 + "/a=" + class404.field5884 + var2 + "/";
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lgk;)V", line = 448)
    public class424(class278 arg0) {
        this.field6088 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V", line = 383)
    public static final void method2631(int arg0, byte arg1) {
        field6089++;
        class412.field5955.method2054(-97, arg0);
        class396.field5782.method2054(96, arg0);
        class21.field216.method2054(arg1 ^ 0x62, arg0);
        if (arg1 != 61) {
            field6079 = null;
        }
        class252.field3405.method2054(88, arg0);
        class147.field2055.method2054(-83, arg0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z", line = 407)
    public final boolean method2632(int arg0, byte arg1, int arg2) {
        field6090++;
        if (this.field6084 <= arg0 && arg0 <= this.field6091 && this.field6082 <= arg2 && arg2 <= this.field6093) {
            return true;
        } else {
            if (arg1 > -30) {
                field6079 = null;
            }
            return this.field6078 <= arg0 && arg0 <= this.field6085 && arg2 >= this.field6092 && this.field6094 >= arg2;
        }
    }
}
