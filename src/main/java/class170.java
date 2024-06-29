import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class170 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lkr;")
    public static class486 field2480 = new class486();

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lus;")
    public static class1 field2482;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Ldk;")
    public static class326 field2483;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lus;")
    public static class1 field2484;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1053(int arg0) {
        if (arg0 != 2) {
            method1053(75);
        }
        field2482 = null;
        field2483 = null;
        field2480 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lmj;Ljava/lang/Object;I)V")
    public static final void method1054(class430 arg0, Object arg1, int arg2) {
        field2481++;
        if (arg0.field6014 == null) {
            return;
        }
        int var3 = 0;
        int var4 = -98 / ((32 - arg2) / 54);
        while (var3 < 50 && arg0.field6014.peekEvent() != null) {
            class111.method713(18, 1L);
            var3++;
        }
        if (arg1 != null) {
            arg0.field6014.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method1055(byte arg0) {
        field2478++;
        int var1 = 100 / ((38 - arg0) / 43);
        int var2 = 0;
        if (class314.field4438.field5779) {
            int var3 = var2 | 0x1;
            int var4 = var3 | 0x10;
            int var5 = var4 | 0x20;
            int var6 = var5 | 0x2;
            var2 = var6 | 0x4;
        }
        class361.method2231(var2, -23955);
        class156.field2325.method803(var2, 0);
        class64.field834.method2130(var2, -80);
        class265.field3859.method2807(107, var2);
        class324.field4674.method1276(var2, (byte) -39);
        class306.method1896(var2, (byte) -118);
        class206.method1353(var2, (byte) -80);
        class126.method797(var2, 23743);
        class338.method2132(23333, var2);
        if (class363.field5227 == 10) {
            class211.method1368((byte) -71, 28);
        } else if (class363.field5227 == 30) {
            class211.method1368((byte) -95, 25);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2477++;
        class424.method2489(arg2, 1);
        int var7 = 0;
        int var8 = arg2 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg0 != 8553) {
            return;
        }
        if (arg6 >= class345.field5011 && arg6 <= class485.field6827) {
            int[] var14 = class128.field1676[arg6];
            int var15 = class156.method978(0, arg4 - arg2, class94.field1209, class168.field2449);
            int var16 = class156.method978(0, arg4 + arg2, class94.field1209, class168.field2449);
            int var17 = class156.method978(0, arg4 - var8, class94.field1209, class168.field2449);
            int var18 = class156.method978(0, arg4 + var8, class94.field1209, class168.field2449);
            class103.method579((byte) 115, var15, var17, arg5, var14);
            class103.method579((byte) 115, var17, var18, arg3, var14);
            class103.method579((byte) 115, var18, var16, arg5, var14);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class171.field2491[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (var21 >= class345.field5011 && class485.field6827 >= var20) {
                    if (var9 < var8) {
                        int var22 = class171.field2491[var9];
                        int var23 = class156.method978(0, arg4 + var7, class94.field1209, class168.field2449);
                        int var24 = class156.method978(0, arg4 - var7, class94.field1209, class168.field2449);
                        int var25 = class156.method978(0, arg4 + var22, class94.field1209, class168.field2449);
                        int var26 = class156.method978(0, arg4 - var22, class94.field1209, class168.field2449);
                        if (var21 <= class485.field6827) {
                            int[] var27 = class128.field1676[var21];
                            class103.method579((byte) 115, var24, var26, arg5, var27);
                            class103.method579((byte) 115, var26, var25, arg3, var27);
                            class103.method579((byte) 115, var25, var23, arg5, var27);
                        }
                        if (class345.field5011 <= var20) {
                            int[] var28 = class128.field1676[var20];
                            class103.method579((byte) 115, var24, var26, arg5, var28);
                            class103.method579((byte) 115, var26, var25, arg3, var28);
                            class103.method579((byte) 115, var25, var23, arg5, var28);
                        }
                    } else {
                        int var29 = class156.method978(0, arg4 + var7, class94.field1209, class168.field2449);
                        int var30 = class156.method978(0, arg4 - var7, class94.field1209, class168.field2449);
                        if (var21 <= class485.field6827) {
                            class103.method579((byte) 115, var30, var29, arg5, class128.field1676[var21]);
                        }
                        if (var20 >= class345.field5011) {
                            class103.method579((byte) 115, var30, var29, arg5, class128.field1676[var20]);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class345.field5011 <= var32 && var31 <= class485.field6827) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class168.field2449 <= var33 && class94.field1209 >= var34) {
                    int var35 = class156.method978(0, var33, class94.field1209, class168.field2449);
                    int var36 = class156.method978(0, var34, class94.field1209, class168.field2449);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class171.field2491[var7] : var11;
                        int var38 = class156.method978(0, arg4 + var37, class94.field1209, class168.field2449);
                        int var39 = class156.method978(0, arg4 - var37, class94.field1209, class168.field2449);
                        if (class485.field6827 >= var32) {
                            int[] var40 = class128.field1676[var32];
                            class103.method579((byte) 115, var36, var39, arg5, var40);
                            class103.method579((byte) 115, var39, var38, arg3, var40);
                            class103.method579((byte) 115, var38, var35, arg5, var40);
                        }
                        if (var31 >= class345.field5011) {
                            int[] var41 = class128.field1676[var31];
                            class103.method579((byte) 115, var36, var39, arg5, var41);
                            class103.method579((byte) 115, var39, var38, arg3, var41);
                            class103.method579((byte) 115, var38, var35, arg5, var41);
                        }
                    } else {
                        if (var32 <= class485.field6827) {
                            class103.method579((byte) 115, var36, var35, arg5, class128.field1676[var32]);
                        }
                        if (class345.field5011 <= var31) {
                            class103.method579((byte) 115, var36, var35, arg5, class128.field1676[var31]);
                        }
                    }
                }
            }
        }
    }

    static {
        new class326((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field2482 = new class1(71, 8);
        field2483 = new class326("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
        field2484 = new class1(40, 10);
    }
}
