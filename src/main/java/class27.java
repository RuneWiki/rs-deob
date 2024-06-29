import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class27 extends class418 {

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Z")
    public boolean field458 = false;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field462 = -1;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field463 = "Continue";

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field468 = -1;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field473 = new String[100];

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lni;")
    public static class279 field471 = new class279(5000);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 4)
    public static void method223(int arg0) {
        if (arg0 < 96) {
            method224(77, -68);
        }
        field463 = null;
        field471 = null;
        field473 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V", line = 430)
    public class27(int arg0) {
        this.field462 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Lsj;", line = 20)
    public static final class248 method224(int arg0, int arg1) {
        field474++;
        int var2 = arg1 >> 16;
        int var3 = arg0 & arg1;
        if (class4.field71[var2] == null || class4.field71[var2][var3] == null) {
            boolean var4 = class338.method2195(var2, arg0 - 59362);
            if (!var4) {
                return null;
            }
        }
        return class4.field71[var2][var3];
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 48)
    public static final void method225(int arg0) {
        class92.method744(20491, class171.field2342);
        field460++;
        class38.field570++;
        if (class96.field1304 && class77.field1057) {
            int var1 = class277.field4060;
            int var2 = var1 - class355.field5259;
            int var3 = class217.field3032;
            int var4 = var3 - class316.field4634;
            if (var2 < class377.field5521) {
                var2 = class377.field5521;
            }
            if (class164.field2235 > var4) {
                var4 = class164.field2235;
            }
            if (class377.field5521 + class268.field3967.field3531 < class171.field2342.field3531 + var2) {
                var2 = class377.field5521 + class268.field3967.field3531 - class171.field2342.field3531;
            }
            if ((class171.field2342.field3564 + var4) > (class164.field2235 + class268.field3967.field3564)) {
                var4 = class164.field2235 + class268.field3967.field3564 - class171.field2342.field3564;
            }
            int var5 = var2 - class383.field5610;
            int var6 = var4 - class361.field5350;
            int var7 = class171.field2342.field3650;
            if (class171.field2342.field3613 < class38.field570 && (var5 > var7 || var5 < -var7 || var7 < var6 || (-var7) > var6)) {
                class14.field215 = true;
            }
            int var8 = class268.field3967.field3559 + var2 - class377.field5521;
            int var9 = var4 + class268.field3967.field3499 - class164.field2235;
            if (class171.field2342.field3489 != null && class14.field215) {
                class452 var10 = new class452();
                var10.field6571 = class171.field2342;
                var10.field6570 = class171.field2342.field3489;
                var10.field6572 = var8;
                var10.field6565 = var9;
                class293.method1989(var10);
            }
            if (class21.field388 == 0) {
                if (class14.field215) {
                    if (class171.field2342.field3500 != null) {
                        class452 var11 = new class452();
                        var11.field6570 = class171.field2342.field3500;
                        var11.field6571 = class171.field2342;
                        var11.field6572 = var8;
                        var11.field6569 = class160.field2089;
                        var11.field6565 = var9;
                        class293.method1989(var11);
                    }
                    if (class160.field2089 != null && client.method408(class171.field2342) != null) {
                        class140.field1797.method1833(-20379, 204);
                        class184.field2472++;
                        class140.field1797.method2240((byte) -88, class171.field2342.field3636);
                        class140.field1797.method2250(false, class160.field2089.field3505);
                        class140.field1797.method2205(130574744, class160.field2089.field3636);
                        class140.field1797.method2254(class171.field2342.field3505, 1082506952);
                    }
                } else if ((class301.field4541 == 1 || class204.method1350((byte) 73)) && class402.field5874 > 2) {
                    class53.method385(2, -30679);
                } else if (class170.method1135(false)) {
                    class53.method385(1, -30679);
                }
                class171.field2342 = null;
            }
            if (arg0 <= 95) {
                field468 = -85;
            }
        } else if (class38.field570 > 1) {
            class171.field2342 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 166)
    public static final void method226(Component arg0, byte arg1) {
        field469++;
        if (arg1 < 56) {
            field475 = 24;
        }
        Method var2 = class364.field5394;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class254.field3706);
        arg0.addFocusListener(class254.field3706);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ltj;Lkm;IIIII)V", line = 195)
    public static final void method227(class298 arg0, class402 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class134.field1752 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class108.field1421) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class186.field2554 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class77 var15 = class106.field1405[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class266.field3950[var12].method722(var13, var14) + class266.field3950[var12].method722(var13 + 1, var14) + class266.field3950[var12].method722(var13, var14 + 1) + class266.field3950[var12].method722(var13 + 1, var14 + 1)) / 4 - (class266.field3950[arg2].method722(arg3, arg4) + class266.field3950[arg2].method722(arg3 + 1, arg4) + class266.field3950[arg2].method722(arg3, arg4 + 1) + class266.field3950[arg2].method722(arg3 + 1, arg4 + 1)) / 4;
                                    class400 var17 = var15.field1067;
                                    class400 var18 = var15.field1087;
                                    if (var17 != null && var17.method107((byte) 122)) {
                                        arg1.method112((var14 - arg4) * 128 + (1 - arg6) * 64, arg0, (byte) -45, var16, var7, var17, (var13 - arg3) * 128 + (1 - arg5) * 64);
                                    }
                                    if (var18 != null && var18.method107((byte) 120)) {
                                        arg1.method112((var14 - arg4) * 128 + (1 - arg6) * 64, arg0, (byte) -86, var16, var7, var18, (var13 - arg3) * 128 + (1 - arg5) * 64);
                                    }
                                    for (class356 var19 = var15.field1064; var19 != null; var19 = var19.field5275) {
                                        class407 var20 = var19.field5274;
                                        if (var20 != null && var20.method107((byte) 121) && (var20.field5917 == var13 || var8 == var13) && (var20.field5918 == var14 || var10 == var14)) {
                                            int var21 = var20.field5924 + 1 - var20.field5917;
                                            int var22 = var20.field5920 + 1 - var20.field5918;
                                            arg1.method112((var20.field5918 - arg4) * 128 + (var22 - arg6) * 64, arg0, (byte) -65, var16, var7, var20, (var20.field5917 - arg3) * 128 + (var21 - arg5) * 64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 286)
    public static final void method228(byte arg0) {
        field465++;
        class51 var1 = class424.field6173;
        synchronized (class424.field6173) {
            class424.field6173.method366(99);
            int var2 = 2 / ((75 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z", line = 309)
    public static final boolean method229(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class379.field5552; var3++) {
            class321 var4 = class242.field3396[var3];
            if (var4.field4784 == 1) {
                int var5 = var4.field4766 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4781 * var5 >> 8) + var4.field4778;
                    int var7 = (var4.field4788 * var5 >> 8) + var4.field4774;
                    int var8 = (var4.field4779 * var5 >> 8) + var4.field4765;
                    int var9 = (var4.field4782 * var5 >> 8) + var4.field4767;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4784 == 2) {
                int var10 = arg0 - var4.field4766;
                if (var10 > 0) {
                    int var11 = (var4.field4781 * var10 >> 8) + var4.field4778;
                    int var12 = (var4.field4788 * var10 >> 8) + var4.field4774;
                    int var13 = (var4.field4779 * var10 >> 8) + var4.field4765;
                    int var14 = (var4.field4782 * var10 >> 8) + var4.field4767;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4784 == 3) {
                int var15 = var4.field4778 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4763 * var15 >> 8) + var4.field4766;
                    int var17 = (var4.field4789 * var15 >> 8) + var4.field4787;
                    int var18 = (var4.field4779 * var15 >> 8) + var4.field4765;
                    int var19 = (var4.field4782 * var15 >> 8) + var4.field4767;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4784 == 4) {
                int var20 = arg2 - var4.field4778;
                if (var20 > 0) {
                    int var21 = (var4.field4763 * var20 >> 8) + var4.field4766;
                    int var22 = (var4.field4789 * var20 >> 8) + var4.field4787;
                    int var23 = (var4.field4779 * var20 >> 8) + var4.field4765;
                    int var24 = (var4.field4782 * var20 >> 8) + var4.field4767;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4784 == 5) {
                int var25 = arg1 - var4.field4765;
                if (var25 > 0) {
                    int var26 = (var4.field4763 * var25 >> 8) + var4.field4766;
                    int var27 = (var4.field4789 * var25 >> 8) + var4.field4787;
                    int var28 = (var4.field4781 * var25 >> 8) + var4.field4778;
                    int var29 = (var4.field4788 * var25 >> 8) + var4.field4774;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
