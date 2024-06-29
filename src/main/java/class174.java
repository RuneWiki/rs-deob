import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class174 {

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field2885 = 0;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[F")
    public static float[] field2888 = new float[4];

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2893 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Ljj;")
    public static class168 field2892;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lqg;", line = 7)
    public static final class269 method1234(int arg0, int arg1) {
        field2882++;
        class269 var2 = (class269) class136.field2330.method487(124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class316.field5141.method1404(0, arg1 & 0x7FFF, (byte) -128);
        } else {
            var3 = class109.field2002.method1404(0, arg1, (byte) -109);
        }
        class269 var4 = new class269();
        if (var3 != null) {
            var4.method1882(new class146(var3), (byte) -104);
        }
        if (arg0 <= 76) {
            return (class269) null;
        }
        if (arg1 >= 32768) {
            var4.method1878((byte) -106);
        }
        class136.field2330.method491((long) arg1, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method1235(boolean arg0, int arg1) {
        field2889++;
        class199 var2 = class173.method1231(arg0, 3, arg1);
        var2.method1358(-1);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIII)V", line = 52)
    public static final void method1236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2884++;
        if (arg5 >= 0 && arg6 >= 0 && arg5 < 103 && arg6 < 103) {
            if (arg0 == 0) {
                class16 var8 = class75.method567(arg3, arg5, arg6);
                if (var8 != null) {
                    int var9 = (int) (var8.field469 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 == 2) {
                        var8.field473 = new class86(var9, 2, arg4 + 4, arg3, arg5, arg6, arg2, false, var8.field473);
                        var8.field465 = new class86(var9, 2, arg4 + 1 & 0x3, arg3, arg5, arg6, arg2, false, var8.field465);
                    } else {
                        var8.field473 = new class86(var9, arg7, arg4, arg3, arg5, arg6, arg2, false, var8.field473);
                    }
                }
            }
            if (arg0 == 1) {
                class332 var10 = class273.method1926(arg3, arg5, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field5299 >>> 32);
                    if (arg7 == 4 || arg7 == 5) {
                        var10.field5307 = new class86(var11, 4, arg4, arg3, arg5, arg6, arg2, false, var10.field5307);
                    } else if (arg7 == 6) {
                        var10.field5307 = new class86(var11, 4, arg4 + 4, arg3, arg5, arg6, arg2, false, var10.field5307);
                    } else if (arg7 == 7) {
                        var10.field5307 = new class86(var11, 4, (arg4 + 2 & 0x3) + 4, arg3, arg5, arg6, arg2, false, var10.field5307);
                    } else if (arg7 == 8) {
                        var10.field5307 = new class86(var11, 4, arg4 + 4, arg3, arg5, arg6, arg2, false, var10.field5307);
                        var10.field5305 = new class86(var11, 4, (arg4 + 2 & 0x3) + 4, arg3, arg5, arg6, arg2, false, var10.field5305);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                class278 var12 = class25.method209(arg3, arg5, arg6);
                if (var12 != null) {
                    var12.field4529 = new class86(Integer.MAX_VALUE & (int) (var12.field4527 >>> 32), arg7, arg4, arg3, arg5, arg6, arg2, false, var12.field4529);
                }
            }
            if (arg0 == 3) {
                class94 var13 = class252.method1780(arg3, arg5, arg6);
                if (var13 != null) {
                    var13.field1653 = new class86(Integer.MAX_VALUE & (int) (var13.field1652 >>> 32), 22, arg4, arg3, arg5, arg6, arg2, false, var13.field1653);
                }
            }
        }
        if (arg1 <= 82) {
            method1235(true, -38);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V", line = 143)
    public static final void method1237(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field2887++;
        if (arg0 >= -18) {
            method1240(-27);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 156)
    public static void method1238(byte arg0) {
        field2893 = null;
        field2888 = null;
        if (arg0 > -106) {
            field2893 = (String) null;
        }
        field2892 = null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIIII)V", line = 177)
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2891++;
        if (class267.method1874(arg2, (byte) 12)) {
            client.method1991(class178.field2938[arg2], -1, arg4, arg6, arg3, arg1, arg0, arg7);
            if (arg5 != -2) {
                field2893 = (String) null;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 198)
    public static final void method1240(int arg0) {
        field2883++;
        while (class342.field5413.method294(class205.field3414, false) >= 27) {
            int var1 = class342.field5413.method295((byte) 84, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class149.field2533[var1] == null) {
                class149.field2533[var1] = new class314();
                var2 = true;
            }
            class314 var3 = class149.field2533[var1];
            class23.field570[class255.field4184++] = var1;
            var3.field221 = class267.field4371;
            if (var3.field5107 != null && var3.field5107.method671(false)) {
                class224.method1566(arg0 ^ 0xE2, var3);
            }
            int var4 = class342.field5413.method295((byte) -101, 5);
            int var5 = class342.field5413.method295((byte) -119, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class34.field761[class91.field1613++] = var1;
            }
            var3.method2271(86, class133.method934(class342.field5413.method295((byte) -84, 14), (byte) 124));
            int var6 = class342.field5413.method295((byte) 107, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class250.field4096[class342.field5413.method295((byte) 17, 3)];
            if (var2) {
                var3.field144 = var3.field216 = var7;
            }
            int var8 = class342.field5413.method295((byte) 5, 1);
            var3.method48(var3.field5107.field1565, 0);
            var3.field175 = var3.field5107.field1534;
            var3.field135 = var3.field5107.field1546;
            if (var3.field135 == 0) {
                var3.field216 = 0;
            }
            var3.method50(class96.field1750.field139[0] + var4, -22748, class96.field1750.field170[0] + var6, var8 == 1, var3.method49((byte) 108));
            if (var3.field5107.method671(false)) {
                class124.method891((class238) null, class276.field4506, var3.field170[0], 0, var3.field139[0], arg0 ^ 0xE2, var3, (class98) null, 0);
            }
        }
        if (arg0 == 98) {
            class342.field5413.method298((byte) 41);
        }
    }
}
