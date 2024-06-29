import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class410 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "J")
    public static long field5722 = 0L;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5723 = new Rectangle[100];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lij;Lij;Lij;B)V")
    public static final void method2541(class316 arg0, class316 arg1, class316 arg2, byte arg3) {
        class282.field3843 = arg2;
        if (arg3 >= 33) {
            field5721++;
            class408.method2533(false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public static final void method2542(int arg0, byte arg1) {
        field5720++;
        class86.method687((byte) 105);
        int var2 = class109.method841((byte) 81, arg0).field727;
        if (var2 == 0) {
            return;
        }
        int var3 = class13.field121[arg0];
        if (var2 == 6) {
            class444.field6231 = var3;
        }
        if (var2 == 5) {
            class127.field1899 = var3;
        }
        if (arg1 < 18) {
            field5722 = -66L;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLea;)V")
    public static final void method2543(int arg0, boolean arg1, class58 arg2) {
        class284.method1776(arg2);
        field5725++;
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class11.field107; var3++) {
                for (int var4 = 0; var4 < class264.field3620; var4++) {
                    if ((class302.field4122[1][var3][var4] & 0x2) == 2) {
                        class232.method1512(var3, var4);
                    }
                }
            }
        }
        if (arg1) {
            method2541((class316) null, (class316) null, (class316) null, (byte) 103);
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class264.field3620; var6++) {
                for (int var7 = 0; var7 <= class11.field107; var7++) {
                    if ((class436.field6155[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class436.field6155[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        while (var9 < class264.field3620 && (class436.field6155[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        int var11 = var5;
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class436.field6155[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class436.field6155[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var9 + 1 - var8) * (var11 + 1 - var10);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class278.field3794[var11][var7][var8] - var15;
                            int var17 = class278.field3794[var10][var7][var8];
                            class102.method778(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class436.field6155[var18][var7][var19] = (byte) class187.method1301(class436.field6155[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class436.field6155[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class436.field6155[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (var21 < class11.field107 && (class436.field6155[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class436.field6155[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label224;
                                }
                            }
                            var22--;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class436.field6155[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label213;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var23 + 1 - var22) * (var21 + 1 - var20);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class278.field3794[var23][var20][var6] - var27;
                            int var29 = class278.field3794[var22][var20][var6];
                            class102.method778(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class436.field6155[var30][var31][var6] = (byte) class187.method1301(class436.field6155[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class436.field6155[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (var34 > 0 && (class436.field6155[var5][var7][var34 - 1] & 0x4) != 0) {
                            var34--;
                        }
                        while (var35 < class264.field3620 && (class436.field6155[var5][var7][var35 + 1] & 0x4) != 0) {
                            var35++;
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class436.field6155[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label277;
                                }
                            }
                            var32--;
                        }
                        label266: while (var33 < class11.field107) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class436.field6155[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label266;
                                }
                            }
                            var33++;
                        }
                        if ((var33 + 1 - var32) * (var35 + 1 - var34) >= 4) {
                            int var38 = class278.field3794[var5][var32][var34];
                            class102.method778(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class436.field6155[var5][var39][var40] = (byte) class187.method1301(class436.field6155[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2544(int arg0) {
        field5723 = null;
        if (arg0 != -1) {
            method2541((class316) null, (class316) null, (class316) null, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static final void method2545(int arg0) {
        class408 var1 = class323.field4386;
        synchronized (class323.field4386) {
            if (arg0 != -3) {
                method2542(-106, (byte) 77);
            }
            class323.field4386.method2522((byte) 106);
        }
        field5719++;
    }
}
