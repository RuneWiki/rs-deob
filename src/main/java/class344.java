import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class344 extends class513 {

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "Z")
    public static boolean field4631 = false;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field4633 = 0;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "Lmo;")
    public class780 field4623;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fp", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4638;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "Ljava/lang/String;")
    public String field4629;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "[I")
    public int[] field4625;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "[I")
    public int[] field4627;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[J")
    public long[] field4626;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "[Lcja;")
    public class46[] field4628;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field4634;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2133(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lcn;IIIII)V", line = 16)
    public static final void method2131(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class62.field856 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class441.field5980) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class375.field5083 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class549 var14 = class325.field4448[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class745.field10286[var11].method1897((byte) -34, var13, var12) + class745.field10286[var11].method1897((byte) -34, var13, var12 + 1) + class745.field10286[var11].method1897((byte) -34, var13 + 1, var12) + class745.field10286[var11].method1897((byte) -34, var13 + 1, var12 + 1)) / 4 - (class745.field10286[arg1].method1897((byte) -34, arg3, arg2) + class745.field10286[arg1].method1897((byte) -34, arg3, arg2 + 1) + class745.field10286[arg1].method1897((byte) -34, arg3 + 1, arg2) + class745.field10286[arg1].method1897((byte) -34, arg3 + 1, arg2 + 1)) / 4;
                                    class373 var16 = var14.field7462;
                                    class373 var17 = var14.field7463;
                                    if (var16 != null && var16.method904(0)) {
                                        arg0.method903(class112.field2107, var16, (var12 - arg2) * class365.field4955 + (1 - arg4) * class370.field5022, (var13 - arg3) * class365.field4955 + (1 - arg5) * class370.field5022, (byte) 114, var6, var15);
                                    }
                                    if (var17 != null && var17.method904(0)) {
                                        arg0.method903(class112.field2107, var17, (var12 - arg2) * class365.field4955 + (1 - arg4) * class370.field5022, (var13 - arg3) * class365.field4955 + (1 - arg5) * class370.field5022, (byte) 104, var6, var15);
                                    }
                                    for (class58 var18 = var14.field7466; var18 != null; var18 = var18.field811) {
                                        class597 var19 = var18.field815;
                                        if (var19 != null && var19.method904(0) && (var19.field8368 == var12 || var7 == var12) && (var19.field8369 == var13 || var9 == var13)) {
                                            int var20 = var19.field8372 + 1 - var19.field8368;
                                            int var21 = var19.field8365 + 1 - var19.field8369;
                                            arg0.method903(class112.field2107, var19, (var19.field8368 - arg2) * class365.field4955 + (var20 - arg4) * class370.field5022, (var19.field8369 - arg3) * class365.field4955 + (var21 - arg5) * class370.field5022, (byte) 59, var6, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILha;IIIII)V", line = 115)
    public static final void method2132(int arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4630++;
        class237 var9 = (class237) class454.method2624(arg0, arg5, arg1);
        if (var9 != null) {
            class445 var10 = class414.field5670.method2319(var9.method1032(false), false);
            int var11 = var9.method1033(-125) & 0x3;
            int var12 = var9.method1034(-128);
            if (var10.field6027 == -1) {
                int var13 = arg4;
                if (var10.field6050 > 0) {
                    var13 = arg7;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg3.method526(arg6, 4, var13, arg2, 1);
                    } else if (var11 == 1) {
                        arg3.method528(121, 4, var13, arg2, arg6);
                    } else if (var11 == 2) {
                        arg3.method526(arg6 + 3, 4, var13, arg2, 1);
                    } else if (var11 == 3) {
                        arg3.method528(-116, 4, var13, arg2 + 3, arg6);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg3.method472(25692, 1, arg6, 1, var13, arg2);
                    } else if (var11 == 1) {
                        arg3.method472(25692, 1, arg6 + 3, 1, var13, arg2);
                    } else if (var11 == 2) {
                        arg3.method472(25692, 1, arg6 + 3, 1, var13, arg2 + 3);
                    } else if (var11 == 3) {
                        arg3.method472(25692, 1, arg6, 1, var13, arg2 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg3.method528(85, 4, var13, arg2, arg6);
                    } else if (var11 == 1) {
                        arg3.method526(arg6 + 3, 4, var13, arg2, 1);
                    } else if (var11 == 2) {
                        arg3.method528(-127, 4, var13, arg2 + 3, arg6);
                    } else if (var11 == 3) {
                        arg3.method526(arg6, 4, var13, arg2, 1);
                    }
                }
            } else {
                class133.method1111(var10, var11, arg2, arg3, 90, arg6);
            }
        }
        class237 var14 = (class237) class614.method3480(arg0, arg5, arg1, field4638 == null ? (field4638 = method2133("bea")) : field4638);
        if (arg8 >= -95) {
            return;
        }
        if (var14 != null) {
            class445 var15 = class414.field5670.method2319(var14.method1032(false), false);
            int var16 = var14.method1033(-98) & 0x3;
            int var17 = var14.method1034(-128);
            if (var15.field6027 != -1) {
                class133.method1111(var15, var16, arg2, arg3, 88, arg6);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field6050 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg3.method510(arg2, arg6 + 3, arg2 + 3, arg6, 99, var18);
                } else {
                    arg3.method510(arg2 + 3, arg6 - -3, arg2, arg6, 62, var18);
                }
            }
        }
        class237 var19 = (class237) class572.method3313(arg0, arg5, arg1);
        if (var19 == null) {
            return;
        }
        class445 var20 = class414.field5670.method2319(var19.method1032(false), false);
        int var21 = var19.method1033(-75) & 0x3;
        if (var20.field6027 != -1) {
            class133.method1111(var20, var21, arg2, arg3, 76, arg6);
            return;
        }
    }
}
