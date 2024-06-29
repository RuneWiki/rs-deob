import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class99 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1550 = new String[100];

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILja;B)V", line = 7)
    public static final void method822(int arg0, class90 arg1, byte arg2) {
        class63.method483(arg1);
        field1552++;
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class183.field2703; var3++) {
                for (int var4 = 0; var4 < class66.field1056; var4++) {
                    if ((class278.field4176[1][var3][var4] & 0x2) == 2) {
                        class419.method2631(var3, var4);
                    }
                }
            }
        }
        if (arg2 < 100) {
            return;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class66.field1056; var6++) {
                for (int var7 = 0; var7 <= class183.field2703; var7++) {
                    if ((class390.field5615[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var9 < class66.field1056 && (class390.field5615[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        int var11 = var5;
                        while (var8 > 0 && (class390.field5615[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        label171: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class390.field5615[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label171;
                                }
                            }
                            var10--;
                        }
                        label160: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class390.field5615[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label160;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var11 + 1 - var10) * (var9 + 1 - var8);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class275.field4146[var11][var7][var8] - var15;
                            int var17 = class275.field4146[var10][var7][var8];
                            class350.method2246(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class390.field5615[var18][var7][var19] = (byte) class35.method254(class390.field5615[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class390.field5615[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (var20 > 0 && (class390.field5615[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        int var23 = var5;
                        while (class183.field2703 > var21 && (class390.field5615[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label225: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class390.field5615[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label225;
                                }
                            }
                            var22--;
                        }
                        label214: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class390.field5615[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label214;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class275.field4146[var23][var20][var6] - var27;
                            int var29 = class275.field4146[var22][var20][var6];
                            class350.method2246(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class390.field5615[var30][var31][var6] = (byte) class35.method254(class390.field5615[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class390.field5615[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class390.field5615[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (class66.field1056 > var35 && (class390.field5615[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label279: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class390.field5615[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label279;
                                }
                            }
                            var32--;
                        }
                        label268: while (class183.field2703 > var33) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class390.field5615[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label268;
                                }
                            }
                            var33++;
                        }
                        if ((var35 + 1 - var34) * (var33 + 1 - var32) >= 4) {
                            int var38 = class275.field4146[var5][var32][var34];
                            class350.method2246(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class390.field5615[var5][var39][var40] = (byte) class35.method254(class390.field5615[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Ljava/lang/String;", line = 292)
    public static final String method823(int arg0, int arg1, int arg2) {
        field1554++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            if (arg1 != 2) {
                field1551 = -44;
            }
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 344)
    public static void method824(int arg0) {
        field1550 = null;
        if (arg0 < 12) {
            field1550 = null;
        }
    }
}
