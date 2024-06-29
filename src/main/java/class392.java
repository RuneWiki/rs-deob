import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class392 extends class29 {

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Lor;")
    public class305 field5702;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field5703 = -1;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field5704 = 0;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "[[[I")
    public static int[][][] field5706;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public static void method2465(int arg0) {
        field5706 = null;
        if (arg0 < 78) {
            field5703 = -96;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILfp;)V")
    public static final void method2466(int arg0, int arg1, class9 arg2) {
        field5705++;
        class83.method552(arg2);
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class195.field2745; var3++) {
                for (int var4 = 0; var4 < class78.field984; var4++) {
                    if ((class131.field1790[1][var3][var4] & 0x2) == 2) {
                        class451.method2801(var3, var4);
                    }
                }
            }
        }
        if (arg1 < 25) {
            field5703 = 126;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class78.field984; var6++) {
                for (int var7 = 0; var7 <= class195.field2745; var7++) {
                    if ((class282.field4150[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class282.field4150[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        while (class78.field984 > var9 && (class282.field4150[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        int var11 = var5;
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class282.field4150[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class282.field4150[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class264.field3910[var11][var7][var8] - var15;
                            int var17 = class264.field3910[var10][var7][var8];
                            class402.method2511(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class282.field4150[var18][var7][var19] = (byte) class386.method2438(class282.field4150[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class282.field4150[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class282.field4150[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (class195.field2745 > var21 && (class282.field4150[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class282.field4150[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label224;
                                }
                            }
                            var22--;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class282.field4150[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label213;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 - (var20 - 1)) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class264.field3910[var23][var20][var6] - var27;
                            int var29 = class264.field3910[var22][var20][var6];
                            class402.method2511(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class282.field4150[var30][var31][var6] = (byte) class386.method2438(class282.field4150[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class282.field4150[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class282.field4150[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (var35 < class78.field984 && (class282.field4150[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class282.field4150[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label277;
                                }
                            }
                            var32--;
                        }
                        label266: while (var33 < class195.field2745) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class282.field4150[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label266;
                                }
                            }
                            var33++;
                        }
                        if ((var33 + 1 - var32) * (var35 + 1 - var34) >= 4) {
                            int var38 = class264.field3910[var5][var32][var34];
                            class402.method2511(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class282.field4150[var5][var39][var40] = (byte) class386.method2438(class282.field4150[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lor;)V")
    public class392(class305 arg0) {
        this.field5702 = arg0;
    }
}
