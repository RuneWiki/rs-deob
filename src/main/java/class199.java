import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class199 {

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Ld;")
    private class29 field3941 = new class29(256);

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Ld;")
    private class29 field3960 = new class29(256);

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lf;")
    private class47 field3950;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Lf;")
    private class47 field3952;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lsd;")
    private static class166 field3935 = class135.method935("This world is full)3", 0);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[S")
    public static short[] field3938 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lsd;")
    private static class166 field3944 = class135.method935("This computers address has been blocked", 0);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lsd;")
    public static class166 field3939 = class135.method935("scape main", 0);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lsd;")
    public static class166 field3937 = field3944;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lsd;")
    public static class166 field3946 = field3935;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lsd;")
    private static class166 field3957 = class135.method935("wave2:", 0);

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Lsd;")
    public static class166 field3953 = field3957;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lsd;")
    public static class166 field3940 = field3957;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lf;")
    public static class47 field3942;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
    public static int[] field3959;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "[S")
    public static short[] field3958;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[Z")
    public static boolean[] field3943;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIB)Lfg;")
    public static final class54 method1307(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 96) {
            return null;
        }
        class54 var4 = new class54();
        var4.field1021 = arg2;
        var4.field1023 = arg0;
        class103.field2017.method216(var4, 12682, (long) arg1);
        field3945++;
        class143.method978(arg0, (byte) 106);
        class131.method921(124, arg0);
        class193 var5 = class90.method701(-31355, arg1);
        if (var5 != null) {
            class68.method550(var5, 15);
        }
        if (class11.field201 != null) {
            class68.method550(class11.field201, 15);
            class11.field201 = null;
        }
        class160.field3064 = 0;
        class192.field3654 = false;
        class27.method201((byte) -127, class59.field1226, class128.field2510, class154.field2967, class146.field2873);
        if (class146.field2884 != -1) {
            class166.method1120(-65, 1, class146.field2884);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI[I)Lbb;")
    private final class13 method1308(int arg0, byte arg1, int arg2, int[] arg3) {
        field3936++;
        if (arg1 != 116) {
            this.method1314(null, (byte) -67, 39);
        }
        int var5 = arg2 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class13 var9 = (class13) this.field3960.method224(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class152 var10 = class152.method1030(this.field3950, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class13 var11 = var10.method1029();
            this.field3960.method216(var11, 12682, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field242.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static final void method1309(byte arg0) {
        int var1 = class125.field2464.method171(class114.field2214);
        for (int var2 = 0; var2 < class160.field3064; var2++) {
            int var6 = class125.field2464.method171(class56.method466(var2, 70));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        if (arg0 != 73) {
            return;
        }
        int var3 = class160.field3064 * 15 + 21;
        field3951++;
        var1 += 8;
        class59.field1226 = class160.field3064 * 15 + 22;
        class192.field3654 = true;
        int var4 = class69.field1409 - var1 / 2;
        class146.field2873 = var1;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        int var5 = class57.field1174;
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class154.field2967 = var5;
        if (var4 < 0) {
            var4 = 0;
        }
        class128.field2510 = var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIZ)Lbb;")
    public final class13 method1310(int[] arg0, int arg1, boolean arg2) {
        field3955++;
        if (this.field3950.method357((byte) -105) == 1) {
            return this.method1308(0, (byte) 116, arg1, arg0);
        } else if (this.field3950.method358(arg1, -1) == 1) {
            return this.method1308(arg1, (byte) 116, 0, arg0);
        } else if (arg2) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIII)Lbb;")
    private final class13 method1311(int[] arg0, int arg1, int arg2, int arg3) {
        field3954++;
        int var5 = ((arg1 & 0x30000FFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class13 var9 = (class13) this.field3960.method224(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class181 var10 = (class181) this.field3941.method224(~arg3, var7);
            if (var10 == null) {
                var10 = class181.method1228(this.field3952, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3941.method216(var10, 12682, var7);
            }
            class13 var11 = var10.method1224(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method915(arg3);
                this.field3960.method216(var11, 12682, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lkf;")
    public static final class96 method1312(boolean arg0) {
        field3949++;
        class96 var1 = new class96();
        var1.field1854 = class9.field176;
        var1.field1856 = class82.field1664[0];
        var1.field1850 = class98.field1870;
        var1.field1849 = class161.field3083[0];
        var1.field1853 = class47.field884[0];
        if (arg0) {
            return null;
        }
        var1.field1855 = class137.field2669[0];
        var1.field1851 = class63.field1315;
        var1.field1852 = class41.field723[0];
        class102.method773(63);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public static final void method1313(int arg0, int arg1) {
        field3956++;
        if (class153.field2952 == 0) {
            class165.field3139.method480(arg1, (byte) 97);
        } else {
            class81.field1657 = arg1;
        }
        int var2 = 105 / ((arg0 - 50) / 39);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IBI)Lbb;")
    public final class13 method1314(int[] arg0, byte arg1, int arg2) {
        field3948++;
        if (this.field3952.method357((byte) -105) == 1) {
            return this.method1311(arg0, 0, arg2, 0);
        } else if (arg1 < 48) {
            return null;
        } else if (this.field3952.method358(arg2, -1) == 1) {
            return this.method1311(arg0, arg2, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3944 = null;
        field3937 = null;
        field3946 = null;
        field3958 = null;
        field3959 = null;
        field3938 = null;
        field3942 = null;
        field3935 = null;
        field3940 = null;
        field3957 = null;
        field3953 = null;
        field3939 = null;
        if (arg0 != 5589) {
            field3953 = null;
        }
        field3943 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfa;")
    public static final class48 method1316(Throwable arg0, String arg1) {
        field3947++;
        class48 var2;
        if (arg0 instanceof class48) {
            var2 = (class48) arg0;
            var2.field890 = var2.field890 + ' ' + arg1;
        } else {
            var2 = new class48(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lf;Lsd;IILsd;IZ)V")
    public static final void method1317(class47 arg0, class166 arg1, int arg2, int arg3, class166 arg4, int arg5, boolean arg6) {
        if (arg5 != 7733) {
            field3938 = null;
        }
        field3934++;
        int var7 = arg0.method363(arg1, arg5 - 7733);
        int var8 = arg0.method362(var7, arg4, 108);
        class63.method527(var7, arg3, arg0, arg2, -99, arg6, var8);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lf;Lf;)V")
    public class199(class47 arg0, class47 arg1) {
        this.field3950 = arg0;
        this.field3952 = arg1;
    }
}
