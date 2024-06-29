import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class115 {

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1957 = "K";

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1956 = "Loading title screen - ";

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[Lmd;")
    public static class273[] field1954;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method878(int arg0) {
        field1955++;
        int var1 = class136.field2239.method641(false, 8);
        if (class154.field2553 > var1) {
            for (int var2 = var1; var2 < class154.field2553; var2++) {
                class185.field2968[class268.field4456++] = class162.field2627[var2];
            }
        }
        int var3 = 77 % ((56 - arg0) / 42);
        if (var1 > class154.field2553) {
            throw new RuntimeException("gppov1");
        }
        class154.field2553 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class162.field2627[var4];
            class123 var6 = class15.field300[var5];
            int var7 = class136.field2239.method641(false, 1);
            if (var7 == 0) {
                class162.field2627[class154.field2553++] = var5;
                var6.field749 = class275.field4598;
            } else {
                int var8 = class136.field2239.method641(false, 2);
                if (var8 == 0) {
                    class162.field2627[class154.field2553++] = var5;
                    var6.field749 = class275.field4598;
                    class41.field619[class289.field4761++] = var5;
                } else if (var8 == 1) {
                    class162.field2627[class154.field2553++] = var5;
                    var6.field749 = class275.field4598;
                    int var9 = class136.field2239.method641(false, 3);
                    var6.method285(var9, (byte) -115, 1);
                    int var10 = class136.field2239.method641(false, 1);
                    if (var10 == 1) {
                        class41.field619[class289.field4761++] = var5;
                    }
                } else if (var8 == 2) {
                    class162.field2627[class154.field2553++] = var5;
                    var6.field749 = class275.field4598;
                    if (class136.field2239.method641(false, 1) == 1) {
                        int var12 = class136.field2239.method641(false, 3);
                        var6.method285(var12, (byte) -120, 2);
                        int var13 = class136.field2239.method641(false, 3);
                        var6.method285(var13, (byte) -126, 2);
                    } else {
                        int var11 = class136.field2239.method641(false, 3);
                        var6.method285(var11, (byte) -119, 0);
                    }
                    int var14 = class136.field2239.method641(false, 1);
                    if (var14 == 1) {
                        class41.field619[class289.field4761++] = var5;
                    }
                } else if (var8 == 3) {
                    class185.field2968[class268.field4456++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
    public static final void method879(byte arg0, int arg1) {
        class146.field2401 = 100;
        class271.field4507 = arg1;
        field1952++;
        class84.field1401 = -1;
        if (arg0 <= -75) {
            class118.field1984 = 3;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
    public final boolean method880(boolean arg0) {
        field1953++;
        if (!arg0) {
            this.field1951 = 72;
        }
        return (this.field1945 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLdl;II)V")
    public static final void method881(byte arg0, class123 arg1, int arg2, int arg3) {
        field1944++;
        if (arg0 != 13) {
            method881((byte) -12, (class123) null, 18, 110);
        }
        if (arg1.field761 == arg2 && arg2 != -1) {
            class163 var4 = class34.method211(arg2, 3);
            int var5 = var4.field2658;
            if (var5 == 1) {
                arg1.field719 = 0;
                arg1.field731 = 1;
                arg1.field791 = arg3;
                arg1.field804 = 0;
                arg1.field784 = 0;
                class131.method980(class16.field314 == arg1, arg1.field771, arg1.field715, arg1.field719, (byte) -70, var4);
            }
            if (var5 == 2) {
                arg1.field804 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field761 == -1 || class34.method211(arg2, 3).field2662 >= class34.method211(arg1.field761, arg0 - 10).field2662) {
            arg1.field784 = 0;
            arg1.field755 = arg1.field730;
            arg1.field791 = arg3;
            arg1.field719 = 0;
            arg1.field731 = 1;
            arg1.field761 = arg2;
            arg1.field804 = 0;
            if (arg1.field761 == -1) {
                return;
            }
            class131.method980(class16.field314 == arg1, arg1.field771, arg1.field715, arg1.field719, (byte) -80, class34.method211(arg1.field761, 3));
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvd;B)V")
    public static final void method882(class307 arg0, byte arg1) {
        field1948++;
        for (class253 var2 = (class253) class237.field3995.method309(0); var2 != null; var2 = (class253) class237.field3995.method312((byte) -117)) {
            if (var2.field4280 == arg0) {
                if (var2.field4289 != null) {
                    class278.field4627.method113(var2.field4289);
                    var2.field4289 = null;
                }
                var2.method993(32);
                return;
            }
        }
        if (arg1 >= -33) {
            field1956 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Z")
    public final boolean method883(int arg0) {
        field1947++;
        if (arg0 == 8) {
            return (this.field1945 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field1954 = null;
        int var1 = -47 / ((-arg0 - 53) / 36);
        field1957 = null;
        field1956 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILda;IJZ)Z")
    public static final boolean method885(int arg0, int arg1, int arg2, int arg3, int arg4, class312 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class42.method250(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Z")
    public final boolean method886(byte arg0) {
        if (arg0 != -86) {
            method881((byte) 122, (class123) null, 103, -13);
        }
        field1960++;
        return (this.field1945 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Z")
    public final boolean method887(int arg0) {
        if (arg0 != 2) {
            field1954 = null;
        }
        field1950++;
        return (this.field1945 & 0x4) != 0;
    }
}
