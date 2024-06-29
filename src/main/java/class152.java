import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class152 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
    public boolean field3181 = true;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lgg;")
    public static class63 field3188 = class116.method911(43, "<col=ffff00>");

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lgg;")
    public static class63 field3187 = class116.method911(43, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "[S")
    public static short[] field3192;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method1063(boolean arg0) {
        field3192 = null;
        field3188 = null;
        if (!arg0) {
            method1066(56, -45, -128);
        }
        field3187 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I")
    public static final int method1064(byte arg0, int arg1, int arg2) {
        field3183++;
        class90 var3 = (class90) class110.field2484.method694(-23979, (long) arg2);
        if (arg0 >= -120) {
            method1065(41, null, -7, -33);
        }
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field2099.length) {
            return var3.field2099[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILgf;II)V")
    public static final void method1065(int arg0, class62 arg1, int arg2, int arg3) {
        field3189++;
        if ((arg2 & 0x2) != 0) {
            int var4 = class167.field3437.method40(2);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class167.field3437.method33(80);
            class134.method976(arg3 + 15278, var4, arg1, var5);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field1165 = class167.field3437.method46((byte) 65);
            arg1.field1120 = class167.field3437.method31((byte) -127);
        }
        if ((arg2 & 0x40) != arg3) {
            int var6 = class167.field3437.method34(-857795632);
            int var7 = class167.field3437.method34(arg3 - 857795632);
            arg1.method469(var7, (byte) -39, var6, class173.field3571);
            arg1.field1156 = class173.field3571 + 300;
            arg1.field1137 = class167.field3437.method64(31790);
        }
        if ((arg2 & 0x400) != 0) {
            int var8 = class167.field3437.method34(arg3 ^ 0xCCDF13D0);
            int var9 = class167.field3437.method33(109);
            arg1.method469(var9, (byte) -39, var8, class173.field3571);
        }
        if ((arg2 & 0x1) != 0) {
            int var10 = class167.field3437.method69((byte) 52);
            byte[] var11 = new byte[var10];
            class3 var12 = new class3(var11);
            class167.field3437.method55(var11, var10, 0, -1);
            class89.field2089[arg0] = var12;
            arg1.method564(var12, 8144);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field1151 = class167.field3437.method28(~arg3);
            if (arg1.field1151.method573(255, 0) == 126) {
                arg1.field1151 = arg1.field1151.method592(false, 1);
                class100.method843((byte) -99, 2, arg1.field1552, arg1.field1151);
            } else if (class3.field72 == arg1) {
                class100.method843((byte) -120, 2, arg1.field1552, arg1.field1151);
            }
            arg1.field1138 = 0;
            arg1.field1127 = 0;
            arg1.field1147 = 150;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field1135 = class167.field3437.method31((byte) -127);
            int var13 = class167.field3437.method19(-1);
            arg1.field1114 = 0;
            if (arg1.field1135 == 65535) {
                arg1.field1135 = -1;
            }
            arg1.field1128 = 0;
            arg1.field1116 = var13 >> 16;
            arg1.field1150 = (var13 & 0xFFFF) + class173.field3571;
            if (arg1.field1150 > class173.field3571) {
                arg1.field1114 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field1153 = class167.field3437.method34(-857795632);
            arg1.field1098 = class167.field3437.method69((byte) 52);
            arg1.field1158 = class167.field3437.method64(arg3 + 31790);
            arg1.field1107 = class167.field3437.method33(79);
            arg1.field1126 = class167.field3437.method31((byte) -127) + class173.field3571;
            arg1.field1140 = class167.field3437.method40(2) + class173.field3571;
            arg1.field1166 = class167.field3437.method33(103);
            arg1.field1155 = 0;
            arg1.field1154 = 1;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field1132 = class167.field3437.method46((byte) 65);
            if (arg1.field1132 == 65535) {
                arg1.field1132 = -1;
            }
        }
        if ((arg2 & 0x20) == 0) {
            return;
        }
        int var14 = class167.field3437.method36((byte) -98);
        int var15 = class167.field3437.method64(31790);
        int var16 = class167.field3437.method34(arg3 - 857795632);
        int var17 = class167.field3437.field54;
        if (arg1.field1552 != null && arg1.field1559 != null) {
            boolean var18 = false;
            long var19 = arg1.field1552.method590(-98);
            if (var15 <= 1) {
                for (int var21 = 0; var21 < class99.field2338; var21++) {
                    if (class11.field264[var21] == var19) {
                        var18 = true;
                        break;
                    }
                }
            }
            if (!var18 && class69.field1733 == 0) {
                class166.field3399.field54 = 0;
                class167.field3437.method42((byte) -59, class166.field3399.field48, 0, var16);
                class166.field3399.field54 = 0;
                class63 var22 = class70.method660(class173.method1159(false, class166.field3399).method599(967));
                arg1.field1151 = var22.method578(false);
                arg1.field1138 = var14 >> 8;
                arg1.field1127 = var14 & 0xFF;
                arg1.field1147 = 150;
                if (var15 == 2 || var15 == 3) {
                    class100.method843((byte) -86, 1, class89.method772((byte) 72, new class63[] { class164.field3382, arg1.field1552 }), var22);
                } else if (var15 == 1) {
                    class100.method843((byte) -118, 1, class89.method772((byte) 54, new class63[] { class71.field1787, arg1.field1552 }), var22);
                } else {
                    class100.method843((byte) -94, 2, arg1.field1552, var22);
                }
            }
        }
        class167.field3437.field54 = var16 + var17;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public static final void method1066(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class168.field3469; var3++) {
            for (int var4 = 0; var4 < class199.field3979; var4++) {
                for (int var5 = 0; var5 < class13.field298; var5++) {
                    class96 var6 = class148.field3117[var3][var4][var5];
                    if (var6 != null) {
                        class116 var7 = var6.field2277;
                        if (var7 != null && var7.field2603 instanceof class92) {
                            class92 var8 = (class92) var7.field2603;
                            class136.method992(var8, var3, var4, var5, 1, 1);
                            if (var7.field2594 instanceof class92) {
                                class92 var9 = (class92) var7.field2594;
                                class136.method992(var9, var3, var4, var5, 1, 1);
                                class92.method797(var8, var9, 0, 0, 0, false);
                                var7.field2594 = var9.method798(var9.field2178, var9.field2164, arg0, arg1, arg2, false, false);
                            }
                            var7.field2603 = var8.method798(var8.field2178, var8.field2164, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field2272; var10++) {
                            class98 var13 = var6.field2284[var10];
                            if (var13 != null && var13.field2316 instanceof class92) {
                                class92 var14 = (class92) var13.field2316;
                                class136.method992(var14, var3, var4, var5, var13.field2324 + 1 - var13.field2330, var13.field2321 - var13.field2325 + 1);
                                var13.field2316 = var14.method798(var14.field2178, var14.field2164, arg0, arg1, arg2, false, false);
                            }
                        }
                        class41 var11 = var6.field2294;
                        if (var11 != null && var11.field953 instanceof class92) {
                            class92 var12 = (class92) var11.field953;
                            class118.method918(var12, var3, var4, var5);
                            var11.field953 = var12.method798(var12.field2178, var12.field2164, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3186 = arg1;
        this.field3191 = arg3;
        this.field3181 = arg6;
        this.field3185 = arg0;
        this.field3179 = arg2;
        this.field3184 = arg5;
        this.field3180 = arg4;
    }
}
