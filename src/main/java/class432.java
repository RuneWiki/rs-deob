import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class432 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6227 = 0;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6225 = "white:";

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static volatile int field6230 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lrg;")
    public static class364 field6229;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lpf;ZI)Lwd;")
    public static final class36 method2681(class447 arg0, boolean arg1, int arg2) {
        field6228++;
        class36 var3;
        if (class256.field3703 == null) {
            var3 = new class36();
        } else {
            var3 = class256.field3703;
            class256.field3703 = class256.field3703.field505;
            var3.field505 = null;
            class428.field6205--;
        }
        var3.field510 = arg2;
        if (arg1) {
            method2683(52, -109, true, true, 104, 71, 108, -99, -66, -83, (class37) null, 15);
        }
        var3.field511 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)Leq;")
    public static final class140 method2682(int arg0, int arg1, byte arg2, int arg3) {
        field6224++;
        int var4 = arg1 << 8 | arg3;
        class140 var5 = (class140) class7.field89.method2228(-1, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class132.field2126.method1336(-108, class132.field2126.method1351(var4, -1));
        if (var6 == null) {
            int var8 = arg0 + 65536 << 8 | arg3;
            class140 var9 = (class140) class7.field89.method2228(-1, (long) var8 << 16);
            if (arg2 > -126) {
                method2685((byte) -84);
            }
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class132.field2126.method1336(-86, class132.field2126.method1351(var8, -1));
            if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class140 var13 = (class140) class7.field89.method2228(-1, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class132.field2126.method1336(-111, class132.field2126.method1351(var12, -1));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class140 var15 = class303.method2076(var14, true);
                    var15.field2219 = arg3;
                    class7.field89.method2226((long) var12 << 16, var15, (byte) -108);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class140 var11 = class303.method2076(var10, true);
                var11.field2219 = arg3;
                class7.field89.method2226((long) var8 << 16, var11, (byte) -108);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class140 var7 = class303.method2076(var6, true);
            var7.field2219 = arg3;
            class7.field89.method2226((long) var4 << 16, var7, (byte) -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZZIIIIIILec;I)V")
    public static final void method2683(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class37 arg10, int arg11) {
        if (arg6 == 1) {
            arg0 = 1;
        } else if (arg6 == 2) {
            arg4 = 1;
            arg0 = 1;
        } else if (arg6 == 3) {
            arg4 = 1;
        }
        field6223++;
        if (arg8 != -2222) {
            method2685((byte) -128);
        }
        if (arg1 < 0 || class183.field2703 <= arg1 || arg7 < 0 || arg7 >= class66.field1056) {
            while (true) {
                int var14 = arg10.method271((byte) 110);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method271((byte) 121);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method271((byte) 126);
                }
            }
        }
        if (!arg2 && !arg3) {
            class278.field4176[arg9][arg1][arg7] = 0;
        }
        while (true) {
            int var12 = arg10.method271((byte) 100);
            if (var12 == 0) {
                if (arg2) {
                    class275.field4146[0][arg1 + arg4][arg0 + arg7] = class311.field4527[0].method794(arg1 + arg4, arg0 + arg7);
                    return;
                } else if (arg9 == 0) {
                    class275.field4146[0][arg1 + arg4][arg0 + arg7] = -class245.method1779(arg11 + 556238, arg5 + 932731, (byte) 123) * 8;
                    return;
                } else {
                    class275.field4146[arg9][arg1 + arg4][arg7 + arg0] = class275.field4146[arg9 - 1][arg1 + arg4][arg0 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method271((byte) 121);
                if (!arg2) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg9 != 0) {
                        class275.field4146[arg9][arg1 + arg4][arg7 + arg0] = class275.field4146[arg9 - 1][arg1 + arg4][arg0 + arg7] - (var13 * 8);
                        return;
                    }
                    class275.field4146[0][arg1 + arg4][arg0 + arg7] = -var13 * 8;
                    return;
                }
                class275.field4146[0][arg1 + arg4][arg0 + arg7] = var13 * 8 + class311.field4527[0].method794(arg1 + arg4, arg0 + arg7);
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg10.method271((byte) 116);
                } else {
                    class182.field2691[arg9][arg1][arg7] = arg10.method291(0);
                    class275.field4140[arg9][arg1][arg7] = (byte) ((var12 - 2) / 4);
                    class383.field5481[arg9][arg1][arg7] = (byte) class35.method254(3, var12 + arg6 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg2 && !arg3) {
                    class278.field4176[arg9][arg1][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                class375.field5316[arg9][arg1][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BJ)V")
    public static final void method2684(byte arg0, long arg1) {
        field6226++;
        int var3 = class369.field5238;
        int var4 = class263.field3956;
        if (class99.field1551 != var3) {
            int var5 = var3 - class99.field1551;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class99.field1551 += var6;
        }
        if (arg0 != -96) {
            return;
        }
        if (!class324.field4673) {
            class436.field6359 += (float) arg1 * class247.field3586 / 40.0F * 8.0F;
            class106.field1756 += (float) arg1 * class278.field4183 / 40.0F * 8.0F;
        }
        if (class392.field5729 != var4) {
            int var7 = var4 - class392.field5729;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class392.field5729 += var8;
        }
        class169.method1292((byte) 113);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method2685(byte arg0) {
        field6225 = null;
        field6229 = null;
        if (arg0 <= 14) {
            field6225 = null;
        }
    }
}
