import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class73 extends class83 {

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1207 = "Ok";

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Lvh;")
    public static class108 field1202;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lcj;")
    public static class74 field1199;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z")
    public final boolean method438(int arg0, int arg1, int arg2) {
        if (arg0 != -18355) {
            this.field1211 = 74;
        }
        field1194++;
        return arg1 >= this.field1193 && arg1 <= this.field1212 && this.field1196 <= arg2 && this.field1205 >= arg2;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)Z")
    public final boolean method439(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -121) {
            return true;
        } else {
            field1192++;
            return this.field1203 == arg2 && this.field1213 <= arg3 && this.field1211 >= arg3 && this.field1197 <= arg1 && this.field1198 >= arg1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method440(int arg0) {
        field1199 = null;
        field1207 = null;
        if (arg0 != -9207) {
            method440(45);
        }
        field1202 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V")
    public static final void method441(boolean arg0, int arg1) {
        field1210++;
        int var2 = 29 / ((32 - arg1) / 56);
        class216.field3649 = arg0;
        if (!class216.field3649) {
            int var3 = class248.field4058.method693(false);
            boolean var4 = class24.method166(-12414, class248.field4058.method670(28019224));
            int var5 = class248.field4058.method677(false);
            int var6 = (class101.field1747 - class248.field4058.field1762) / 16;
            class175.field2877 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var16 = 0; var16 < 4; var16++) {
                    class175.field2877[var7][var16] = class248.field4058.method666(-128);
                }
            }
            int var8 = class248.field4058.method641(2);
            int var9 = class248.field4058.method670(28019224);
            int var10 = class248.field4058.method693(false);
            boolean var11 = false;
            class61.field1059 = new byte[var6][];
            class89.field1583 = new int[var6];
            class163.field2697 = new int[var6];
            class37.field520 = null;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var5 / 8 == 48) {
                var11 = true;
            }
            if ((var3 / 8) == 48 && (var5 / 8) == 148) {
                var11 = true;
            }
            class69.field1139 = new int[var6];
            class220.field3686 = null;
            class276.field4405 = new int[var6];
            class166.field2714 = new int[var6];
            class163.field2695 = new byte[var6][];
            int var12 = 0;
            for (int var13 = (var3 - 6) / 8; var13 <= ((var3 + 6) / 8); var13++) {
                for (int var14 = (var5 - 6) / 8; var14 <= (var5 + 6) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class276.field4405[var12] = var15;
                        class166.field2714[var12] = -1;
                        class163.field2697[var12] = -1;
                        class89.field1583[var12] = -1;
                        class69.field1139[var12] = -1;
                    } else {
                        class276.field4405[var12] = var15;
                        class166.field2714[var12] = class198.field3197.method749("m" + var13 + "_" + var14, 1);
                        class163.field2697[var12] = class198.field3197.method749("l" + var13 + "_" + var14, 1);
                        class89.field1583[var12] = class198.field3197.method749("um" + var13 + "_" + var14, 1);
                        class69.field1139[var12] = class198.field3197.method749("ul" + var13 + "_" + var14, 1);
                    }
                    var12++;
                }
            }
            class223.method1502(false, var8, 0, var5, var4, var9, var10, var3);
            return;
        }
        int var17 = class248.field4058.method641(2);
        boolean var18 = class24.method166(-12414, class248.field4058.method657(0));
        class248.field4058.method200((byte) 118);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var38 = 0; var38 < 13; var38++) {
                for (int var39 = 0; var39 < 13; var39++) {
                    int var40 = class248.field4058.method198(1, (byte) 0);
                    if (var40 == 1) {
                        class290.field4634[var19][var38][var39] = class248.field4058.method198(26, (byte) 0);
                    } else {
                        class290.field4634[var19][var38][var39] = -1;
                    }
                }
            }
        }
        class248.field4058.method197((byte) -115);
        int var20 = (class101.field1747 - class248.field4058.field1762) / 16;
        class175.field2877 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var37 = 0; var37 < 4; var37++) {
                class175.field2877[var21][var37] = class248.field4058.method696((byte) 102);
            }
        }
        int var22 = class248.field4058.method641(2);
        int var23 = class248.field4058.method641(2);
        int var24 = class248.field4058.method691((byte) 109);
        int var25 = class248.field4058.method638(0);
        class69.field1139 = new int[var20];
        class89.field1583 = new int[var20];
        class61.field1059 = new byte[var20][];
        class220.field3686 = null;
        class166.field2714 = new int[var20];
        class37.field520 = null;
        class276.field4405 = new int[var20];
        class163.field2697 = new int[var20];
        class163.field2695 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = class290.field4634[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + (var32 / 8);
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (class276.field4405[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            class276.field4405[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            class166.field2714[var26] = class198.field3197.method749("m" + var35 + "_" + var36, 1);
                            class163.field2697[var26] = class198.field3197.method749("l" + var35 + "_" + var36, 1);
                            class89.field1583[var26] = class198.field3197.method749("um" + var35 + "_" + var36, 1);
                            class69.field1139[var26] = class198.field3197.method749("ul" + var35 + "_" + var36, 1);
                            var26++;
                        }
                    }
                }
            }
        }
        class223.method1502(false, var17, 0, var22, var18, var25, var24, var23);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)[I")
    public final int[] method442(int arg0, int arg1, int arg2) {
        field1206++;
        return arg1 == 26 ? new int[] { this.field1214, this.field1193 + arg0 - this.field1213, arg2 - (-this.field1196 - -this.field1197) } : null;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static final void method443(int arg0) {
        int var1 = -124 % ((-arg0 - 47) / 35);
        class204.field3333.method58(0);
        field1208++;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)Z")
    public final boolean method444(int arg0, int arg1, int arg2) {
        field1209++;
        if (arg1 != 0) {
            this.method438(-13, -51, -8);
        }
        return arg2 >= this.field1213 && arg2 <= this.field1211 && arg0 >= this.field1197 && this.field1198 >= arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBI)V")
    public static final void method445(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1204++;
        if (class57.field1011 == 1) {
            class37.field524[class225.field3781 / 100].method447(class241.field3964 - 8, class118.field2089 + -8);
        }
        if (class57.field1011 == 2) {
            class37.field524[(class225.field3781 / 100) + 4].method447(class241.field3964 - 8, class118.field2089 + -8);
        }
        int var5 = -52 % ((23 - arg3) / 44);
        class63.method398(3053);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(III)[I")
    public final int[] method446(int arg0, int arg1, int arg2) {
        field1195++;
        int var4 = 110 % ((arg1 - 63) / 37);
        return new int[] { this.field1203, this.field1213 + arg2 - this.field1193, this.field1197 - (this.field1196 - arg0) };
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1196 = arg7;
        this.field1211 = arg4;
        this.field1213 = arg2;
        this.field1197 = arg3;
        this.field1205 = arg9;
        this.field1198 = arg5;
        this.field1214 = arg1;
        this.field1203 = arg0;
        this.field1212 = arg8;
        this.field1193 = arg6;
    }
}
