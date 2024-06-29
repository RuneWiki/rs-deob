import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class148 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    private int field2335 = 128;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field2339 = 0;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
    public boolean field2345 = false;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
    public boolean field2344 = false;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field2333 = 0;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field2347 = 0;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public int field2355 = -1;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field2352 = 128;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Z")
    public static boolean field2341 = false;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2348 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[I")
    public static int[] field2338;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[S")
    private short[] field2331;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[S")
    private short[] field2342;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[S")
    private short[] field2346;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[S")
    private short[] field2349;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Ljh;B)V", line = 17)
    public static final void method1041(int arg0, class207[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class207 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3273 == 0) {
                    if (var4.field3253 != null) {
                        method1041(arg0, var4.field3253, (byte) -106);
                    }
                    class45 var5 = (class45) class166.field2557.method1558((long) var4.field3250, false);
                    if (var5 != null) {
                        class288.method1874(8, arg0, var5.field640);
                    }
                }
                if (arg0 == 0 && var4.field3219 != null) {
                    class120 var6 = new class120();
                    var6.field1845 = var4;
                    var6.field1837 = var4.field3219;
                    class122.method834((byte) 93, var6);
                }
                if (arg0 == 1 && var4.field3127 != null) {
                    if (var4.field3283 >= 0) {
                        class207 var7 = class78.method547(var4.field3250, 112);
                        if (var7 == null || var7.field3253 == null || var7.field3253.length <= var4.field3283 || var7.field3253[var4.field3283] != var4) {
                            continue;
                        }
                    }
                    class120 var8 = new class120();
                    var8.field1845 = var4;
                    var8.field1837 = var4.field3127;
                    class122.method834((byte) 112, var8);
                }
            }
        }
        if (arg2 >= -21) {
            method1045(-9, (class306) null);
        }
        field2340++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z", line = 89)
    public static final boolean method1042(byte arg0) {
        if (arg0 == 54) {
            field2337++;
            return class333.field5166 ? true : class82.field1226;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lgn;I)V", line = 113)
    public final void method1043(class303 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2043((byte) -111);
            if (var3 == 0) {
                int var4 = -2 % ((arg1 + 51) / 42);
                field2330++;
                return;
            }
            this.method1049(17267, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;Ljh;I)Ljava/lang/String;", line = 146)
    public static final String method1044(String arg0, class207 arg1, int arg2) {
        if (arg0.indexOf("%") != arg2) {
            label53: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label53;
                                                        }
                                                        String var9 = "";
                                                        if (class266.field4106 != null) {
                                                            if (class266.field4106.field3929 == null) {
                                                                var9 = class345.method2396(class266.field4106.field3928, -89);
                                                            } else {
                                                                var9 = (String) class266.field4106.field3929;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class82.method568(class115.method797(4, (byte) -64, arg1), 999999999) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class82.method568(class115.method797(3, (byte) -87, arg1), 999999999) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class82.method568(class115.method797(2, (byte) -109, arg1), 999999999) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class82.method568(class115.method797(1, (byte) -66, arg1), 999999999) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class82.method568(class115.method797(0, (byte) -126, arg1), 999999999) + arg0.substring(var3 + 2);
            }
        }
        field2336++;
        return arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILwf;)V", line = 240)
    public static final void method1045(int arg0, class306 arg1) {
        if (arg0 != 128) {
            field2338 = (int[]) null;
        }
        field2353++;
        class284.field4358 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V", line = 251)
    public static void method1046(byte arg0) {
        if (arg0 >= -34) {
            method1046((byte) -31);
        }
        field2338 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)Lg;", line = 261)
    public final class295 method1047(int arg0, int arg1, int arg2, int arg3) {
        field2351++;
        class295 var5 = (class295) class242.field3826.method1294((long) this.field2343, 125);
        if (arg0 > -2) {
            method1044((String) null, (class207) null, 79);
        }
        if (var5 == null) {
            class114 var6 = class114.method782(class322.field5020, this.field2354, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2349 != null) {
                for (int var7 = 0; var7 < this.field2349.length; var7++) {
                    var6.method783(this.field2349[var7], this.field2331[var7]);
                }
            }
            if (this.field2346 != null) {
                for (int var8 = 0; var8 < this.field2346.length; var8++) {
                    var6.method764(this.field2346[var8], this.field2342[var8]);
                }
            }
            var5 = var6.method769(this.field2333 + 64, this.field2339 + 850, -30, -50, -30);
            class242.field3826.method1292((long) this.field2343, -80, var5);
        }
        class295 var9;
        if (this.field2355 == -1 || arg3 == -1) {
            var9 = var5.method981(true, true, true);
        } else {
            var9 = class118.method809((byte) 127, this.field2355).method1494(var5, arg3, (byte) 100, arg1, arg2);
        }
        if (this.field2335 != 128 || this.field2352 != 128) {
            var9.method964(this.field2335, this.field2352, this.field2335);
        }
        if (this.field2347 != 0) {
            if (this.field2347 == 90) {
                var9.method961();
            }
            if (this.field2347 == 180) {
                var9.method982();
            }
            if (this.field2347 == 270) {
                var9.method955();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 342)
    public static final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2334++;
        int var6 = arg0 - arg5;
        int var7 = arg3 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class322.method2178(true, arg3, arg5, arg2, arg4);
            }
        } else if (var7 == 0) {
            class246.method1662(arg0, arg5, arg4, arg1 + 2483, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg4;
                arg4 = var9;
                int var10 = arg0;
                arg0 = arg3;
                arg3 = var10;
            }
            if (arg0 < arg5) {
                int var11 = arg5;
                arg5 = arg0;
                arg0 = var11;
                int var12 = arg4;
                arg4 = arg3;
                arg3 = var12;
            }
            int var13 = arg4;
            int var14 = arg0 - arg5;
            int var15 = -(var14 >> 1);
            int var16 = arg3 - arg4;
            if (arg1 != -8241) {
                method1046((byte) 93);
            }
            int var17 = arg3 <= arg4 ? -1 : 1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var8) {
                for (int var18 = arg5; var18 <= arg0; var18++) {
                    class175.field2675[var18][var13] = arg2;
                    var15 += var16;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg0; var19++) {
                    class175.field2675[var13][var19] = arg2;
                    var15 += var16;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILgn;I)V", line = 460)
    private final void method1049(int arg0, class303 arg1, int arg2) {
        if (arg0 != 17267) {
            return;
        }
        if (arg2 == 1) {
            this.field2354 = arg1.method1994(false);
        } else if (arg2 == 2) {
            this.field2355 = arg1.method1994(false);
        } else if (arg2 == 4) {
            this.field2335 = arg1.method1994(false);
        } else if (arg2 == 5) {
            this.field2352 = arg1.method1994(false);
        } else if (arg2 == 6) {
            this.field2347 = arg1.method1994(false);
        } else if (arg2 == 7) {
            this.field2333 = arg1.method2043((byte) -112);
        } else if (arg2 == 8) {
            this.field2339 = arg1.method2043((byte) -111);
        } else if (arg2 == 9) {
            this.field2345 = true;
        } else if (arg2 == 10) {
            this.field2344 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method2043((byte) -116);
            this.field2331 = new short[var4];
            this.field2349 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2349[var5] = (short) arg1.method1994(false);
                this.field2331[var5] = (short) arg1.method1994(false);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2043((byte) -128);
            this.field2342 = new short[var6];
            this.field2346 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2346[var7] = (short) arg1.method1994(false);
                this.field2342[var7] = (short) arg1.method1994(false);
            }
        }
        field2350++;
    }
}
