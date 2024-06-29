import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class468 {

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Lfa;")
    private class156 field6933 = new class156(64);

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "Lfs;")
    private class387 field6927;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public int field6929;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "Lho;")
    public static class102 field6923 = new class102(12, 0, 1, 0);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2827(int arg0) {
        field6930++;
        if (!class232.field3415) {
            return;
        }
        if (arg0 != 0) {
            method2829(95, -66, 41, -128, -126, -58);
        }
        while (true) {
            while (class401.field5949 < class371.field5520.length) {
                class166 var1 = class371.field5520[class401.field5949];
                if (var1 != null && var1.field2360 == -1) {
                    if (class299.field4298 == null) {
                        class299.field4298 = class392.field5764.method261(109, var1.field2354);
                    }
                    int var2 = class299.field4298.field4733;
                    if (var2 == -1) {
                        return;
                    }
                    class401.field5949++;
                    class299.field4298 = null;
                    var1.field2360 = var2;
                } else {
                    class401.field5949++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([I[ILlh;I[I)V", line = 43)
    public static final void method2828(int[] arg0, int[] arg1, class364 arg2, int arg3, int[] arg4) {
        if (arg3 > -60) {
            field6923 = null;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field1760.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field1760[var9] = null;
                    } else {
                        class267 var10 = class153.field2169.method1585(3, var6);
                        int var11 = var10.field3932;
                        class287 var12 = arg2.field1760[var9];
                        if (var12 != null) {
                            if (var12.field4140 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field1760[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4138 = 0;
                                    var12.field4143 = 0;
                                    var12.field4141 = 1;
                                    var12.field4144 = 0;
                                    var12.field4142 = var8;
                                    class20.method183(arg2.field6335, 0, arg2.field6328, arg2.field6334, true, var10, class435.field6375 == arg2);
                                } else if (var11 == 2) {
                                    var12.field4144 = 0;
                                }
                            } else if (var10.field3942 >= class153.field2169.method1585(3, var12.field4140).field3942) {
                                var12 = arg2.field1760[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class287 var13 = arg2.field1760[var9] = new class287();
                            var13.field4138 = 0;
                            var13.field4144 = 0;
                            var13.field4140 = var6;
                            var13.field4143 = 0;
                            var13.field4141 = 1;
                            var13.field4142 = var8;
                            class20.method183(arg2.field6335, 0, arg2.field6328, arg2.field6334, true, var10, class435.field6375 == arg2);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field6928++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIII)V", line = 138)
    public static final void method2829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6924++;
        if (arg4 <= class401.field5947 && arg1 >= class471.field6963) {
            boolean var6;
            if (class72.field992 > arg5) {
                var6 = false;
                arg5 = class72.field992;
            } else if (arg5 > class126.field1842) {
                arg5 = class126.field1842;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg0 < class72.field992) {
                arg0 = class72.field992;
                var7 = false;
            } else if (class126.field1842 < arg0) {
                arg0 = class126.field1842;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class471.field6963 > arg4) {
                arg4 = class471.field6963;
            } else {
                class531.method3136(arg5, 123, arg2, arg0, class141.field1996[arg4++]);
            }
            if (arg1 > class401.field5947) {
                arg1 = class401.field5947;
            } else {
                class531.method3136(arg5, 121, arg2, arg0, class141.field1996[arg1--]);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class141.field1996[var8];
                    var9[arg5] = var9[arg0] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class141.field1996[var10][arg5] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class141.field1996[var11][arg0] = arg2;
                }
            }
        }
        if (arg3 > -47) {
            method2827(-81);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V", line = 243)
    public final void method2830(byte arg0) {
        field6932++;
        class156 var2 = this.field6933;
        synchronized (this.field6933) {
            this.field6933.method1105(false);
        }
        if (arg0 > -19) {
            method2828(null, null, null, -32, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V", line = 259)
    public final void method2831(int arg0) {
        field6922++;
        class156 var2 = this.field6933;
        synchronized (this.field6933) {
            this.field6933.method1119(104);
        }
        if (arg0 != 16) {
            field6923 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Liq;", line = 274)
    public final class429 method2832(int arg0, int arg1) {
        field6925++;
        class156 var3 = this.field6933;
        class429 var4;
        synchronized (this.field6933) {
            var4 = (class429) this.field6933.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6927.method2363(arg0, 16, 84);
        class429 var6 = new class429();
        if (var5 != null) {
            var6.method2611(new class65(var5), true);
        }
        class156 var7 = this.field6933;
        synchronized (this.field6933) {
            this.field6933.method1107(arg1 + 10232, (long) arg0, var6);
        }
        if (arg1 != -10231) {
            method2828(null, null, null, -95, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V", line = 303)
    public final void method2833(int arg0, int arg1) {
        class156 var3 = this.field6933;
        synchronized (this.field6933) {
            this.field6933.method1116(arg0, -50);
        }
        field6926++;
        if (arg1 != -3) {
            this.method2832(107, 18);
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V", line = 323)
    public static void method2834(int arg0) {
        field6923 = null;
        if (arg0 >= -79) {
            field6923 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljk;ILfs;)V", line = 337)
    public class468(class446 arg0, int arg1, class387 arg2) {
        this.field6927 = arg2;
        if (this.field6927 == null) {
            this.field6929 = 0;
        } else {
            this.field6929 = this.field6927.method2367(16, 28724);
        }
    }
}
