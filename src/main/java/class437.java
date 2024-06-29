import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class437 extends class508 {

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "S")
    public short field5990;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "Lad;")
    public static class11 field5993 = new class11(8);

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field5995 = 0;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Z")
    public static boolean field5998 = false;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZIIIII)V")
    public static final void method2576(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5996++;
        class344.method2018(arg1, arg3);
        int var7 = 0;
        int var8 = arg3 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class418.field5559 <= arg5 && class456.field6365 >= arg5) {
            int[] var15 = class333.field4265[arg5];
            int var16 = class141.method970(arg4 - arg3, class281.field3589, 1150002076, class65.field827);
            int var17 = class141.method970(arg4 + arg3, class281.field3589, 1150002076, class65.field827);
            int var18 = class141.method970(arg4 - var8, class281.field3589, 1150002076, class65.field827);
            int var19 = class141.method970(arg4 + var8, class281.field3589, 1150002076, class65.field827);
            class183.method1212(arg6, var15, !arg1, var16, var18);
            class183.method1212(arg0, var15, true, var18, var19);
            class183.method1212(arg6, var15, true, var19, var17);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class210.field2711[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class418.field5559 && var20 <= class456.field6365) {
                    if (var8 <= var9) {
                        int var22 = class141.method970(arg4 + var7, class281.field3589, 1150002076, class65.field827);
                        int var23 = class141.method970(arg4 - var7, class281.field3589, 1150002076, class65.field827);
                        if (class456.field6365 >= var21) {
                            class183.method1212(arg6, class333.field4265[var21], !arg1, var23, var22);
                        }
                        if (var20 >= class418.field5559) {
                            class183.method1212(arg6, class333.field4265[var20], !arg1, var23, var22);
                        }
                    } else {
                        int var24 = class210.field2711[var9];
                        int var25 = class141.method970(arg4 + var7, class281.field3589, 1150002076, class65.field827);
                        int var26 = class141.method970(arg4 - var7, class281.field3589, 1150002076, class65.field827);
                        int var27 = class141.method970(arg4 + var24, class281.field3589, 1150002076, class65.field827);
                        int var28 = class141.method970(arg4 - var24, class281.field3589, 1150002076, class65.field827);
                        if (class456.field6365 >= var21) {
                            int[] var29 = class333.field4265[var21];
                            class183.method1212(arg6, var29, true, var26, var28);
                            class183.method1212(arg0, var29, true, var28, var27);
                            class183.method1212(arg6, var29, true, var27, var25);
                        }
                        if (class418.field5559 <= var20) {
                            int[] var30 = class333.field4265[var20];
                            class183.method1212(arg6, var30, true, var26, var28);
                            class183.method1212(arg0, var30, true, var28, var27);
                            class183.method1212(arg6, var30, true, var27, var25);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class418.field5559 <= var32 && class456.field6365 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class65.field827 <= var33 && var34 <= class281.field3589) {
                    int var35 = class141.method970(var33, class281.field3589, 1150002076, class65.field827);
                    int var36 = class141.method970(var34, class281.field3589, 1150002076, class65.field827);
                    if (var7 < var8) {
                        int var37 = var11 >= var7 ? var11 : class210.field2711[var7];
                        int var38 = class141.method970(arg4 + var37, class281.field3589, 1150002076, class65.field827);
                        int var39 = class141.method970(arg4 - var37, class281.field3589, 1150002076, class65.field827);
                        if (var32 <= class456.field6365) {
                            int[] var40 = class333.field4265[var32];
                            class183.method1212(arg6, var40, true, var36, var39);
                            class183.method1212(arg0, var40, true, var39, var38);
                            class183.method1212(arg6, var40, !arg1, var38, var35);
                        }
                        if (var31 >= class418.field5559) {
                            int[] var41 = class333.field4265[var31];
                            class183.method1212(arg6, var41, true, var36, var39);
                            class183.method1212(arg0, var41, true, var39, var38);
                            class183.method1212(arg6, var41, !arg1, var38, var35);
                        }
                    } else {
                        if (var32 <= class456.field6365) {
                            class183.method1212(arg6, class333.field4265[var32], true, var36, var35);
                        }
                        if (class418.field5559 <= var31) {
                            class183.method1212(arg6, class333.field4265[var31], true, var36, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class437() {
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
    public static void method2577(byte arg0) {
        field5993 = null;
        if (arg0 != -88) {
            field5993 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[Ljava/lang/String;ZI)Ljava/lang/String;")
    public static final String method2578(int arg0, String[] arg1, boolean arg2, int arg3) {
        field5991++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg2) {
                return null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(S)V")
    public class437(short arg0) {
        this.field5990 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static final void method2579(int arg0) {
        field5994++;
        int var1 = class206.field2684;
        int[] var2 = class143.field1892;
        if (arg0 != 4) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class518 var4 = class76.field952[var2[var3]];
            if (var4 != null) {
                class487.method2913(122, var4.method2342(10804), var4);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)B")
    public static final byte method2580(int arg0, int arg1, int arg2) {
        if (arg1 > -73) {
            method2579(-11);
        }
        field5992++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    static {
        new class169("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }
}
