import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class89 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    public static int[] field1065 = new int[5];

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lka;")
    public static class331 field1067 = new class331(0);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lho;")
    public static class103 field1070 = new class103(57, 4);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([[[Lno;IIIZI)Z")
    public static final boolean method491(class498[][][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1068++;
        byte var6 = arg4 ? 1 : (byte) (class431.field6268 & 0xFF);
        if (class33.field339[class210.field2808][arg3][arg5] == var6) {
            return false;
        } else if ((class252.field3358[class210.field2808][arg3][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class334.field4433[var7] = arg3;
            if (arg1 != -1) {
                method493(-4, (byte) -4);
            }
            int var35 = var7 + 1;
            class469.field6962[var7] = arg5;
            class33.field339[class210.field2808][arg3][arg5] = var6;
            while (var35 != var8) {
                int var9 = class334.field4433[var8] & 0xFFFF;
                int var10 = (class334.field4433[var8] & 0xFF8708) >> 16;
                int var11 = class334.field4433[var8] >> 24 & 0xFF;
                int var12 = class469.field6962[var8] & 0xFFFF;
                int var13 = (class469.field6962[var8] & 0xFF6D71) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class252.field3358[class210.field2808][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class210.field2808 + 1; var16 <= 3; var16++) {
                    if ((class252.field3358[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field7264 != null) {
                                int var20 = class152.method909(var10, arg1 ^ 0xE631993);
                                if (arg0[var16][var9][var12].field7264.field3511 == var20 || arg0[var16][var9][var12].field7257 != null && arg0[var16][var9][var12].field7257.field3511 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class152.method909(var11, arg1 ^ 0xE631993);
                                    if (arg0[var16][var9][var12].field7264.field3511 == var21 || arg0[var16][var9][var12].field7257 != null && arg0[var16][var9][var12].field7257.field3511 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class152.method909(var13, -241375636);
                                    if (arg0[var16][var9][var12].field7264.field3511 == var22 || arg0[var16][var9][var12].field7257 != null && arg0[var16][var9][var12].field7257.field3511 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class498 var23 = arg0[var16][var9][var12];
                            if (var23.field7263 != null) {
                                for (class192 var24 = var23.field7263; var24 != null; var24 = var24.field2469) {
                                    class279 var25 = var24.field2466;
                                    if (var25 instanceof class448) {
                                        class448 var26 = (class448) var25;
                                        int var27 = var26.method48((byte) -70);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method47(-15774);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class498 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field7263 != null) {
                            for (class192 var31 = var30.field7263; var31 != null; var31 = var31.field2469) {
                                class279 var32 = var31.field2466;
                                if (var32.field3698 != var32.field3697 || var32.field3691 != var32.field3688) {
                                    for (int var33 = var32.field3698; var33 <= var32.field3697; var33++) {
                                        for (int var34 = var32.field3688; var34 <= var32.field3691; var34++) {
                                            class33.field339[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class33.field339[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class152.field1993[class210.field2808 + 1].method217(var9, var12);
                    if (class113.field1486[arg2] < var17) {
                        class113.field1486[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class371.field5043[arg2] > var18) {
                        class371.field5043[arg2] = var18;
                    } else if (var18 > class430.field6256[arg2]) {
                        class430.field6256[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class96.field1184[arg2]) {
                        class96.field1184[arg2] = var19;
                    } else if (var19 > class225.field3027[arg2]) {
                        class225.field3027[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class33.field339[class210.field2808][var9 - 1][var12] != var6) {
                        class334.field4433[var35] = class219.method1381(-754974720, class219.method1381(var9 - 1, 1179648));
                        class469.field6962[var35] = class219.method1381(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class33.field339[class210.field2808][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class426.field6200 > var12) {
                        if ((var9 - 1) >= 0 && class33.field339[class210.field2808][var9 - 1][var12] != var6 && (class252.field3358[class210.field2808][var9][var12] & 0x4) == 0 && (class252.field3358[class210.field2808][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class334.field4433[var35] = class219.method1381(1375731712, class219.method1381(1179648, var9 - 1));
                            class469.field6962[var35] = class219.method1381(var12, 1245184);
                            class33.field339[class210.field2808][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class33.field339[class210.field2808][var9][var12] != var6) {
                            class334.field4433[var35] = class219.method1381(318767104, class219.method1381(5373952, var9));
                            class469.field6962[var35] = class219.method1381(5439488, var12);
                            class33.field339[class210.field2808][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class308.field4128 > var9 + 1 && class33.field339[class210.field2808][var9 + 1][var12] != var6 && (class252.field3358[class210.field2808][var9][var12] & 0x4) == 0 && (class252.field3358[class210.field2808][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class334.field4433[var35] = class219.method1381(class219.method1381(5373952, var9 + 1), -1845493760);
                            class469.field6962[var35] = class219.method1381(var12, 5439488);
                            class33.field339[class210.field2808][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class308.field4128 > var9 + 1 && class33.field339[class210.field2808][var9 + 1][var12] != var6) {
                        class334.field4433[var35] = class219.method1381(1392508928, class219.method1381(var9 + 1, 9568256));
                        class469.field6962[var35] = class219.method1381(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class33.field339[class210.field2808][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class33.field339[class210.field2808][var9 - 1][var12] != var6 && (class252.field3358[class210.field2808][var9][var12] & 0x4) == 0 && (class252.field3358[class210.field2808][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class334.field4433[var35] = class219.method1381(301989888, class219.method1381(13762560, var9 - 1));
                            class469.field6962[var35] = class219.method1381(var12, 13828096);
                            class33.field339[class210.field2808][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class33.field339[class210.field2808][var9][var12] != var6) {
                            class334.field4433[var35] = class219.method1381(-1828716544, class219.method1381(var9, 13762560));
                            class469.field6962[var35] = class219.method1381(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class33.field339[class210.field2808][var9][var12] = var6;
                        }
                        if (var9 + 1 < class308.field4128 && class33.field339[class210.field2808][var9 + 1][var12] != var6 && (class252.field3358[class210.field2808][var9][var12] & 0x4) == 0 && (class252.field3358[class210.field2808][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class334.field4433[var35] = class219.method1381(class219.method1381(var9 + 1, 9568256), -771751936);
                            class469.field6962[var35] = class219.method1381(9633792, var12);
                            class33.field339[class210.field2808][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class113.field1486[arg2] != -1000000) {
                class113.field1486[arg2] += 10;
                class371.field5043[arg2] -= 50;
                class430.field6256[arg2] += 50;
                class225.field3027[arg2] += 50;
                class96.field1184[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method492(byte arg0) {
        field1067 = null;
        field1070 = null;
        if (arg0 < 111) {
            method493(80, (byte) -9);
        }
        field1065 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
    public static final void method493(int arg0, byte arg1) {
        field1069++;
        class184 var2 = class277.method1682(arg0, 12, -74);
        int var3 = -22 % ((-arg1 - 19) / 63);
        var2.method1075((byte) 110);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/String;)Z")
    public static final boolean method494(byte arg0, int arg1, String arg2) {
        field1066++;
        if (class137.field1839 != 3) {
            class255.field3395 = new class266();
            class255.field3395.field3559 = arg1;
            class255.field3395.field3564 = arg2;
            if (class401.field5807 != class287.field3779) {
                class255.field3395.field3570 = class255.field3395.field3559 + 40000;
                class255.field3395.field3566 = class255.field3395.field3559 + 50000;
            }
            return true;
        }
        String var3 = "";
        if (class401.field5807 != class287.field3779) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class339.field4485 != null) {
            var4 = "/p=" + class339.field4485;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class374.field5072 + "/a=" + class385.field5601 + var4 + "/j" + (class14.field147 ? "1" : "0") + ",o" + (class41.field446 ? "1" : "0") + ",a2";
        int var6 = 121 % ((arg0 - 34) / 33);
        try {
            class216.field2949.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)Z")
    public static boolean method495(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
