import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class231 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field3245 = 0;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field3247 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljo;")
    private class382 field3239 = new class382(64);

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lqo;")
    private class423 field3250 = null;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lok;")
    private class74 field3238;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lok;")
    private class74 field3242;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lgn;")
    public static class526 field3249 = new class526(6, 2);

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[F")
    public static float[] field3251 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public static final int method1431(int arg0, int arg1, int arg2) {
        field3241++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < arg0) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method1432(boolean arg0) {
        field3249 = null;
        field3251 = null;
        if (!arg0) {
            method1435((byte) -107, null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Lqf;")
    public final class145 method1433(boolean arg0, int arg1) {
        field3243++;
        class145 var3 = (class145) this.field3239.method2288((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field3238.method541(arg1 & 0x7FFF, 1, (byte) -122);
        } else {
            var4 = this.field3242.method541(arg1, 1, (byte) -122);
        }
        class145 var5 = new class145();
        var5.field2169 = this;
        if (arg0) {
            method1434(-32, 67, -53, -24, 39, -32, -20);
        }
        if (var4 != null) {
            var5.method1057(new class468(var4), -504);
        }
        if (arg1 >= 32768) {
            var5.method1053((byte) -84);
        }
        this.field3239.method2290((long) arg1, var5, 110);
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 8313) {
            field3248 = 10;
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg0;
            arg0 = var7;
        }
        field3246++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 1 - (arg4 - (7 - arg6));
        } else if (var8 == 2) {
            return 1 + 7 - arg0 - arg3;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLkh;)V")
    public static final void method1435(byte arg0, class400 arg1) {
        field3237++;
        arg1.field6018 = false;
        if (arg1.field6043 != -1) {
            class520 var2 = class510.field7490.method575(arg1.field6043, -110);
            if (var2 == null || var2.field7630 == null) {
                arg1.field5979 = false;
                arg1.field6043 = -1;
            } else {
                label403: {
                    arg1.field6044++;
                    if (arg1.field5999 < var2.field7630.length && var2.field7645[arg1.field5999] < arg1.field6044) {
                        arg1.field5999++;
                        arg1.field5985++;
                        arg1.field6044 = 1;
                        class283.method1761(var2, class410.field6198 == arg1, arg1.field7671, -91, arg1.field7686, arg1.field7681, arg1.field5999);
                    }
                    if (arg1.field5999 >= var2.field7630.length) {
                        arg1.field6044 = 0;
                        arg1.field5999 = 0;
                        if (arg1.field5979) {
                            arg1.field6043 = arg1.method2415(0).method1281(false);
                            if (arg1.field6043 == -1) {
                                arg1.field5979 = false;
                                break label403;
                            }
                            var2 = class510.field7490.method575(arg1.field6043, -84);
                        }
                        class283.method1761(var2, class410.field6198 == arg1, arg1.field7671, -48, arg1.field7686, arg1.field7681, arg1.field5999);
                    }
                    arg1.field5985 = arg1.field5999 + 1;
                    if (var2.field7630.length <= arg1.field5985) {
                        arg1.field5985 = 0;
                    }
                }
            }
        }
        if (arg1.field5998 != -1 && class86.field1350 >= arg1.field6035) {
            class270 var3 = class443.field6509.method2022(30, arg1.field5998);
            int var4 = var3.field4013;
            if (var4 == -1) {
                arg1.field5998 = -1;
            } else {
                label405: {
                    class520 var5 = class510.field7490.method575(var4, -122);
                    if (var3.field4014) {
                        if (var5.field7643 == 3) {
                            if (arg1.field6064 > 0 && arg1.field6054 <= class86.field1350 && class86.field1350 > arg1.field6051) {
                                arg1.field5998 = -1;
                                break label405;
                            }
                        } else if (var5.field7643 == 1 && arg1.field6064 > 0 && arg1.field6054 <= class86.field1350 && class86.field1350 > arg1.field6051) {
                            arg1.field6035 = class86.field1350 + 1;
                            break label405;
                        }
                    }
                    if (var5 == null || var5.field7630 == null) {
                        arg1.field5998 = -1;
                    } else {
                        if (arg1.field6039 < 0) {
                            arg1.field6039 = 0;
                            class283.method1761(var5, class410.field6198 == arg1, arg1.field7671, -98, arg1.field7686, arg1.field7681, 0);
                        }
                        arg1.field5969++;
                        if (arg1.field6039 < var5.field7630.length && arg1.field5969 > var5.field7645[arg1.field6039]) {
                            arg1.field5969 = 1;
                            arg1.field6039++;
                            class283.method1761(var5, class410.field6198 == arg1, arg1.field7671, -61, arg1.field7686, arg1.field7681, arg1.field6039);
                        }
                        if (var5.field7630.length <= arg1.field6039) {
                            if (var3.field4014) {
                                arg1.field6039 -= var5.field7632;
                                arg1.field6050++;
                                if (arg1.field6050 >= var5.field7620) {
                                    arg1.field5998 = -1;
                                } else if (arg1.field6039 >= 0 && arg1.field6039 < var5.field7630.length) {
                                    class283.method1761(var5, class410.field6198 == arg1, arg1.field7671, -35, arg1.field7686, arg1.field7681, arg1.field6039);
                                } else {
                                    arg1.field5998 = -1;
                                }
                            } else {
                                arg1.field5998 = -1;
                            }
                        }
                        arg1.field5986 = arg1.field6039 + 1;
                        if (arg1.field5986 >= var5.field7630.length) {
                            if (var3.field4014) {
                                arg1.field5986 -= var5.field7632;
                                if (var5.field7620 <= (arg1.field6050 + 1)) {
                                    arg1.field5986 = -1;
                                } else if (arg1.field5986 < 0 || var5.field7630.length <= arg1.field5986) {
                                    arg1.field5986 = -1;
                                }
                            } else {
                                arg1.field5986 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -57) {
            return;
        }
        if (arg1.field5997 != -1 && arg1.field5980 <= class86.field1350) {
            class270 var6 = class443.field6509.method2022(30, arg1.field5997);
            int var7 = var6.field4013;
            if (var7 == -1) {
                arg1.field5997 = -1;
            } else {
                label409: {
                    class520 var8 = class510.field7490.method575(var7, -122);
                    if (var6.field4014) {
                        if (var8.field7643 == 3) {
                            if (arg1.field6064 > 0 && arg1.field6054 <= class86.field1350 && arg1.field6051 < class86.field1350) {
                                arg1.field5997 = -1;
                                break label409;
                            }
                        } else if (var8.field7643 == 1 && arg1.field6064 > 0 && class86.field1350 >= arg1.field6054 && arg1.field6051 < class86.field1350) {
                            arg1.field5980 = class86.field1350 + 1;
                            break label409;
                        }
                    }
                    if (var8 == null || var8.field7630 == null) {
                        arg1.field5997 = -1;
                    } else {
                        if (arg1.field5962 < 0) {
                            arg1.field5962 = 0;
                            class283.method1761(var8, class410.field6198 == arg1, arg1.field7671, -20, arg1.field7686, arg1.field7681, 0);
                        }
                        arg1.field5968++;
                        if (var8.field7630.length > arg1.field5962 && arg1.field5968 > var8.field7645[arg1.field5962]) {
                            arg1.field5962++;
                            arg1.field5968 = 1;
                            class283.method1761(var8, class410.field6198 == arg1, arg1.field7671, -89, arg1.field7686, arg1.field7681, arg1.field5962);
                        }
                        if (var8.field7630.length <= arg1.field5962) {
                            if (var6.field4014) {
                                arg1.field5987++;
                                arg1.field5962 -= var8.field7632;
                                if (var8.field7620 <= arg1.field5987) {
                                    arg1.field5997 = -1;
                                } else if (arg1.field5962 >= 0 && arg1.field5962 < var8.field7630.length) {
                                    class283.method1761(var8, class410.field6198 == arg1, arg1.field7671, -97, arg1.field7686, arg1.field7681, arg1.field5962);
                                } else {
                                    arg1.field5997 = -1;
                                }
                            } else {
                                arg1.field5997 = -1;
                            }
                        }
                        arg1.field6006 = arg1.field5962 + 1;
                        if (var8.field7630.length <= arg1.field6006) {
                            if (var6.field4014) {
                                arg1.field6006 -= var8.field7632;
                                if ((arg1.field5987 + 1) >= var8.field7620) {
                                    arg1.field6006 = -1;
                                } else if (arg1.field6006 < 0 || arg1.field6006 >= var8.field7630.length) {
                                    arg1.field6006 = -1;
                                }
                            } else {
                                arg1.field6006 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5973 != -1 && arg1.field6002 <= 1) {
            class520 var9 = class510.field7490.method575(arg1.field5973, -111);
            if (var9.field7643 == 3) {
                if (arg1.field6064 > 0 && arg1.field6054 <= class86.field1350 && class86.field1350 > arg1.field6051) {
                    arg1.field5973 = -1;
                }
            } else if (var9.field7643 == 1 && arg1.field6064 > 0 && class86.field1350 >= arg1.field6054 && arg1.field6051 < class86.field1350) {
                arg1.field6002 = 2;
            }
        }
        if (arg1.field5973 != -1 && arg1.field6002 == 0) {
            class520 var10 = class510.field7490.method575(arg1.field5973, -108);
            if (var10 == null || var10.field7630 == null) {
                arg1.field5973 = -1;
            } else {
                arg1.field5977++;
                if (arg1.field5992 < var10.field7630.length && arg1.field5977 > var10.field7645[arg1.field5992]) {
                    arg1.field5992++;
                    arg1.field5977 = 1;
                    class283.method1761(var10, class410.field6198 == arg1, arg1.field7671, -52, arg1.field7686, arg1.field7681, arg1.field5992);
                }
                if (var10.field7630.length <= arg1.field5992) {
                    arg1.field5992 -= var10.field7632;
                    arg1.field6009++;
                    if (arg1.field6009 >= var10.field7620) {
                        arg1.field5973 = -1;
                    } else if (arg1.field5992 >= 0 && var10.field7630.length > arg1.field5992) {
                        class283.method1761(var10, class410.field6198 == arg1, arg1.field7671, -33, arg1.field7686, arg1.field7681, arg1.field5992);
                    } else {
                        arg1.field5973 = -1;
                    }
                }
                arg1.field6011 = arg1.field5992 + 1;
                if (var10.field7630.length <= arg1.field6011) {
                    arg1.field6011 -= var10.field7632;
                    if ((arg1.field6009 + 1) >= var10.field7620) {
                        arg1.field6011 = -1;
                    } else if (arg1.field6011 < 0 || arg1.field6011 >= var10.field7630.length) {
                        arg1.field6011 = -1;
                    }
                }
                arg1.field6018 = var10.field7619;
            }
        }
        if (arg1.field6002 > 0) {
            arg1.field6002--;
        }
        for (int var11 = 0; var11 < arg1.field6029.length; var11++) {
            class357 var12 = arg1.field6029[var11];
            if (var12 != null) {
                if (var12.field5472 > 0) {
                    var12.field5472--;
                } else {
                    class520 var13 = class510.field7490.method575(var12.field5474, -71);
                    if (var13 == null || var13.field7630 == null) {
                        arg1.field6029[var11] = null;
                    } else {
                        var12.field5468++;
                        if (var12.field5467 < var13.field7630.length && var12.field5468 > var13.field7645[var12.field5467]) {
                            var12.field5467++;
                            var12.field5468 = 1;
                            class283.method1761(var13, class410.field6198 == arg1, arg1.field7671, -120, arg1.field7686, arg1.field7681, var12.field5467);
                        }
                        if (var12.field5467 >= var13.field7630.length) {
                            var12.field5473++;
                            var12.field5467 -= var13.field7632;
                            if (var12.field5473 >= var13.field7620) {
                                arg1.field6029[var11] = null;
                            } else if (var12.field5467 >= 0 && var13.field7630.length > var12.field5467) {
                                class283.method1761(var13, class410.field6198 == arg1, arg1.field7671, -62, arg1.field7686, arg1.field7681, var12.field5467);
                            } else {
                                arg1.field6029[var11] = null;
                            }
                        }
                        var12.field5470 = var12.field5467 + 1;
                        if (var12.field5470 >= var13.field7630.length) {
                            var12.field5470 -= var13.field7632;
                            if (var13.field7620 <= var12.field5473 + 1) {
                                var12.field5470 = -1;
                            } else if (var12.field5470 < 0 || var13.field7630.length <= var12.field5470) {
                                var12.field5470 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JBLfp;[I)Ljava/lang/String;")
    public final String method1436(long arg0, byte arg1, class437 arg2, int[] arg3) {
        field3244++;
        if (this.field3250 != null) {
            String var6 = this.field3250.method562(arg3, arg0, arg2, 126);
            if (var6 != null) {
                return var6;
            }
        }
        return arg1 == -29 ? Long.toString(arg0) : null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILok;Lok;Lqo;)V")
    public class231(int arg0, class74 arg1, class74 arg2, class423 arg3) {
        this.field3238 = arg2;
        this.field3250 = arg3;
        this.field3242 = arg1;
        if (this.field3242 != null) {
            this.field3247 = this.field3242.method536(false, 1);
        }
        if (this.field3238 != null) {
            this.field3245 = this.field3238.method536(false, 1);
        }
    }
}
