import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class217 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lcm;")
    private class382 field3299 = new class382(256);

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lcm;")
    private class382 field3304 = new class382(256);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Liq;")
    private class134 field3291;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Liq;")
    private class134 field3302;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lpf;")
    public static class425 field3292 = new class425(43, 4);

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Liq;")
    public static class134 field3306;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field3307;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method1317(boolean arg0, byte[] arg1, int arg2) {
        field3293++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 != 9546) {
            method1323(58);
        }
        if (arg1.length > 136 && !class269.field4089) {
            try {
                class171 var3 = (class171) Class.forName("kj").getDeclaredConstructor().newInstance();
                var3.method1053((byte) 79, arg1);
                return var3;
            } catch (Throwable var4) {
                class269.field4089 = true;
            }
        }
        return arg0 ? class327.method2018(-1, arg1) : arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[II)Lar;")
    public final class2 method1318(byte arg0, int[] arg1, int arg2) {
        field3290++;
        if (this.field3302.method824(28970) == 1) {
            return this.method1319(arg2, arg1, (byte) 112, 0);
        } else if (this.field3302.method812(arg2, (byte) -41) == 1) {
            return this.method1319(0, arg1, (byte) 118, arg2);
        } else {
            if (arg0 <= 75) {
                method1323(41);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[IBI)Lar;")
    private final class2 method1319(int arg0, int[] arg1, byte arg2, int arg3) {
        field3297++;
        if (arg2 < 106) {
            field3301 = 113;
        }
        int var5 = arg0 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF8);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class2 var9 = (class2) this.field3304.method2302(var7, 23576);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class23 var10 = class23.method146(this.field3302, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class2 var11 = var10.method148();
            this.field3304.method2301(40, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field26.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([III)Lar;")
    public final class2 method1320(int[] arg0, int arg1, int arg2) {
        field3296++;
        if (this.field3291.method824(28970) == 1) {
            return this.method1324(0, arg0, arg1, 106);
        } else if (this.field3291.method812(arg1, (byte) -41) == 1) {
            return this.method1324(arg1, arg0, 0, 100);
        } else if (arg2 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILdr;IIIIIII)V")
    public static final void method1321(int arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -22165) {
            return;
        }
        field3295++;
        class18 var9 = (class18) class37.method211(arg6, arg2, arg7);
        if (var9 != null) {
            class85 var10 = class411.method2575(arg0 ^ 0xFFFFA96B, var9.method7(true));
            int var11 = var9.method3((byte) -15) & 0x3;
            int var12 = var9.method9(arg0 + 22267);
            if (var10.field1155 == -1) {
                int var13 = arg8;
                if (var10.field1184 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1622(arg5, var13, 4, arg3, true);
                    } else if (var11 == 1) {
                        arg1.method1611(4, arg5, false, arg3, var13);
                    } else if (var11 == 2) {
                        arg1.method1622(arg5, var13, 4, arg3 + 3, true);
                    } else if (var11 == 3) {
                        arg1.method1611(4, arg5 + 3, false, arg3, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method1615(1, var13, 1, arg3, arg5, (byte) -119);
                    } else if (var11 == 1) {
                        arg1.method1615(1, var13, 1, arg3 + 3, arg5, (byte) -119);
                    } else if (var11 == 2) {
                        arg1.method1615(1, var13, 1, arg3 + 3, arg5 + 3, (byte) -119);
                    } else if (var11 == 3) {
                        arg1.method1615(1, var13, 1, arg3, arg5 + 3, (byte) -119);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method1611(4, arg5, false, arg3, var13);
                    } else if (var11 == 1) {
                        arg1.method1622(arg5, var13, 4, arg3 + 3, true);
                    } else if (var11 == 2) {
                        arg1.method1611(4, arg5 + 3, false, arg3, var13);
                    } else if (var11 == 3) {
                        arg1.method1622(arg5, var13, 4, arg3, true);
                    }
                }
            } else {
                class414.method2586(var10, arg1, 55, var11, arg5, arg3);
            }
        }
        class18 var14 = (class18) class51.method293(arg6, arg2, arg7, field3307 == null ? (field3307 = method1325("rc")) : field3307);
        if (var14 != null) {
            class85 var15 = class411.method2575(arg0 + 22165, var14.method7(true));
            int var16 = var14.method3((byte) -20) & 0x3;
            int var17 = var14.method9(53);
            if (var15.field1155 != -1) {
                class414.method2586(var15, arg1, 44, var16, arg5, arg3);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1184 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method1612((byte) 13, arg5, arg5 + 3, arg3, var18, arg3 + 3);
                } else {
                    arg1.method1612((byte) 13, arg5 + 3, arg5, arg3, var18, arg3 + 3);
                }
            }
        }
        class18 var19 = (class18) class386.method2385(arg6, arg2, arg7);
        if (var19 == null) {
            return;
        }
        class85 var20 = class411.method2575(0, var19.method7(true));
        int var21 = var19.method3((byte) -14) & 0x3;
        if (var20.field1155 != -1) {
            class414.method2586(var20, arg1, arg0 ^ 0xFFFFA942, var21, arg5, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Llp;Ljava/lang/String;IZ)V")
    public static final void method1322(class137 arg0, String arg1, int arg2, boolean arg3) {
        field3300++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class458.field6795.method1700(arg1, -68, (class234[]) null, 250);
        int var8 = class458.field6795.method1701(250, (class234[]) null, -31755, arg1) * 13;
        class196.field2965.method358(var5 - var4, -var4 + var6, var7 + var4 + var4, var8 - (-var4 + -var4), -16777216, 0);
        class196.field2965.method422(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 - -var4, -1, 0);
        arg0.method871(var8, -1, -1, 0, 0, (int[]) null, var5, (class234[]) null, -1636, var6, var7, (class153) null, arg1, 0, 1, 1);
        if (arg2 <= 81) {
            field3303 = 63;
        }
        class238.method1436(var5 - var4, var4 + var8 + var4, var4 + var7 + var4, -var4 + var6, 39);
        if (arg3) {
            class196.field2965.method435();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        if (arg0 < 66) {
            field3292 = null;
        }
        field3306 = null;
        field3292 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[III)Lar;")
    private final class2 method1324(int arg0, int[] arg1, int arg2, int arg3) {
        field3294++;
        int var5 = arg2 ^ (arg0 << 4 & 0xFFF4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg3 <= 90) {
            method1321(-33, (class261) null, 79, 68, 43, -111, 35, -2, 17);
        }
        class2 var9 = (class2) this.field3304.method2302(var7, 23576);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class249 var10 = (class249) this.field3299.method2302(var7, 23576);
            if (var10 == null) {
                var10 = class249.method1512(this.field3291, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3299.method2301(41, var10, var7);
            }
            class2 var11 = var10.method1518(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method625((byte) -50);
                this.field3304.method2301(52, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Liq;Liq;)V")
    public class217(class134 arg0, class134 arg1) {
        this.field3291 = arg1;
        this.field3302 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1325(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
