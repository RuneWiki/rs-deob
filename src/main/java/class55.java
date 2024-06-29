import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class55 extends class117 {

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Ljava/lang/String;")
    public String field805;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Ljava/lang/String;")
    public static String field801 = "purple:";

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILqf;Ljava/lang/String;)Ljava/lang/String;", line = 7)
    public static final String method449(int arg0, class359 arg1, String arg2) {
        if (arg0 != 4) {
            field801 = (String) null;
        }
        if (arg2.indexOf("%") != -1) {
            label57: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label57;
                                                        }
                                                        String var9 = "";
                                                        if (class255.field3806 != null) {
                                                            if (class255.field3806.field3058 == null) {
                                                                var9 = class332.method2339(false, class255.field3806.field3057);
                                                            } else {
                                                                var9 = (String) class255.field3806.field3058;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class361.method2521(class94.method735(4, 13013, arg1), (byte) -80) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class361.method2521(class94.method735(3, 13013, arg1), (byte) -80) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class361.method2521(class94.method735(2, arg0 ^ 0x32D1, arg1), (byte) -80) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class361.method2521(class94.method735(1, 13013, arg1), (byte) -80) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class361.method2521(class94.method735(0, 13013, arg1), (byte) -80) + arg2.substring(var3 + 2);
            }
        }
        field803++;
        return arg2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 97)
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        field806++;
        int var6 = arg1;
        int var7 = -arg1;
        if (arg2 != 8257) {
            field801 = (String) null;
        }
        int var8 = -1;
        int var9 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + arg4);
        int var10 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 - arg1);
        class329.method2285(var10, class274.field4158[arg3], (byte) -113, var9, arg0);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 + var6;
                int var12 = arg3 - var6;
                if (var11 >= class326.field4901 && class261.field3911 >= var12) {
                    int var13 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 + var5);
                    int var14 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 - var5);
                    if (var11 <= class261.field3911) {
                        class329.method2285(var14, class274.field4158[var11], (byte) 73, var13, arg0);
                    }
                    if (class326.field4901 <= var12) {
                        class329.method2285(var14, class274.field4158[var12], (byte) 91, var13, arg0);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class326.field4901 <= var16 && class261.field3911 >= var15) {
                int var17 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 + var6);
                int var18 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4 - var6);
                if (var16 <= class261.field3911) {
                    class329.method2285(var18, class274.field4158[var16], (byte) -103, var17, arg0);
                }
                if (class326.field4901 <= var15) {
                    class329.method2285(var18, class274.field4158[var15], (byte) -113, var17, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 176)
    public static void method451(byte arg0) {
        if (arg0 != 63) {
            field802 = -31;
        }
        field801 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lno;[I[IB[I)V", line = 187)
    public static final void method452(class181 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        field804++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field5185.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field5185[var9] = null;
                    } else {
                        class248 var10 = class119.method893(var6, (byte) -41);
                        class124 var11 = arg0.field5185[var9];
                        int var12 = var10.field3691;
                        if (var11 != null) {
                            if (var11.field1796 == var6) {
                                if (var12 == 0) {
                                    var11 = arg0.field5185[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field1800 = 0;
                                    var11.field1804 = var8;
                                    var11.field1799 = 0;
                                    var11.field1798 = 1;
                                    var11.field1802 = 0;
                                    class361.method2512(-29521, arg0.field5137, false, 0, var10, arg0.field5165);
                                } else if (var12 == 2) {
                                    var11.field1800 = 0;
                                }
                            } else if (var10.field3666 >= class119.method893(var11.field1796, (byte) -41).field3666) {
                                var11 = arg0.field5185[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class124 var13 = arg0.field5185[var9] = new class124();
                            var13.field1804 = var8;
                            var13.field1800 = 0;
                            var13.field1802 = 0;
                            var13.field1799 = 0;
                            var13.field1798 = 1;
                            var13.field1796 = var6;
                            class361.method2512(-29521, arg0.field5137, false, 0, var10, arg0.field5165);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg3 > -39) {
            field801 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 285)
    public class55() {
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 291)
    public class55(String arg0, int arg1) {
        this.field805 = arg0;
    }
}
