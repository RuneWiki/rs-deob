import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Laj;")
    private class71 field857 = new class71(256);

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Laj;")
    private class71 field873 = new class71(256);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lrk;")
    private class427 field865;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lrk;")
    private class427 field858;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
    public static boolean field866 = false;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field868 = -1;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field871;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field874;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
    public static int[] field872;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lkb;")
    public static class80[] field859;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static void method505(boolean arg0) {
        field872 = null;
        if (!arg0) {
            method507((class289) null, false);
        }
        field859 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lrk;I)V")
    public static final void method506(class427 arg0, int arg1) {
        field869++;
        class257.field3471 = 0;
        if (arg1 != -22825) {
            return;
        }
        class375.field5280 = 0;
        class428.field6084 = new class107();
        class356.field4845 = new class310[1024];
        class383.method2377((byte) 5, arg0);
        class305.method1971(arg1 ^ 0xFFFFD1B0, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lap;Z)V")
    public static final void method507(class289 arg0, boolean arg1) {
        field871++;
        if (arg0.field3882.length - arg0.field3938 < 1) {
            return;
        }
        int var2 = arg0.method1861((byte) -72);
        if (var2 < 0 || var2 > 1 || arg0.field3882.length - arg0.field3938 < 2) {
            return;
        }
        int var3 = arg0.method1853(-34);
        if (arg1) {
            field868 = 103;
        }
        if ((var3 * 6) != (arg0.field3882.length - arg0.field3938)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field3938 >= arg0.field3882.length) {
                            return;
                        }
                        var4 = arg0.method1853(103);
                        var5 = arg0.method1856((byte) 15);
                    } while (var4 >= class331.field4511.length);
                } while (!class257.field3475[var4]);
            } while (class131.method1024(false, var4).field4136 == '1' && (var5 < -1 || var5 > 1));
            class331.field4511[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[II)Lkf;")
    private final class294 method508(int arg0, int arg1, int[] arg2, int arg3) {
        field862++;
        int var5 = arg0 ^ (arg1 << 4 & 0xFFFC | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class294 var9 = (class294) this.field873.method614(-102, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class292 var10 = class292.method1892(this.field858, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            int var11 = 25 % ((arg3 - 24) / 62);
            class294 var12 = var10.method1891();
            this.field873.method612(var7, -1, var12);
            if (arg2 != null) {
                arg2[0] -= var12.field3966.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method509(int arg0) {
        field864++;
        int var1 = -116 / ((arg0 + 67) / 59);
        while (true) {
            class307 var2;
            class362 var4;
            do {
                var2 = (class307) class155.field2351.method1239(true);
                if (var2 == null) {
                    return;
                }
                if (var2.field4168 < 0) {
                    int var3 = -var2.field4168 - 1;
                    if (class401.field5606 == var3) {
                        var4 = class95.field1379;
                    } else {
                        var4 = class220.field3044[var3];
                    }
                } else {
                    int var5 = var2.field4168 - 1;
                    var4 = class298.field4012[var5];
                }
            } while (var4 == null);
            class372 var6 = class10.method53(var2.field4162, true);
            int var7;
            int var8;
            if (var2.field4152 == 1 || var2.field4152 == 3) {
                var7 = var6.field5206;
                var8 = var6.field5147;
            } else {
                var7 = var6.field5147;
                var8 = var6.field5206;
            }
            int var9 = var2.field4156 + (var8 >> 1);
            int var10 = (var8 + 1 >> 1) + var2.field4156;
            int var11 = (var7 >> 1) + var2.field4160;
            int var12 = (var7 + 1 >> 1) + var2.field4160;
            class411 var13 = class91.field1351[var4.field3170];
            int var14 = var13.method1509(var9, var11) + var13.method1509(var10, var11) + var13.method1509(var9, var12) + var13.method1509(var10, var12) >> 2;
            class111 var15 = null;
            int var16 = class420.field5884[var2.field4164];
            if (var16 == 0) {
                var15 = (class111) class194.method1394(var4.field3170, var2.field4156, var2.field4160);
            } else if (var16 == 1) {
                var15 = (class111) class434.method2691(var4.field3170, var2.field4156, var2.field4160);
            } else if (var16 == 2) {
                var15 = (class111) class95.method815(var4.field3170, var2.field4156, var2.field4160, field874 == null ? (field874 = method513("gd")) : field874);
            } else if (var16 == 3) {
                var15 = (class111) class314.method2001(var4.field3170, var2.field4156, var2.field4160);
            }
            if (var15 != null) {
                class154.method1184(var2.field4161 + 1, var16, var4.field3170, -103, 0, -1, var2.field4156, var2.field4160, var2.field4157, 0);
                var4.field4997 = var15;
                var4.field5016 = var2.field4156 * 128 + var8 * 64;
                var4.field5002 = class414.field5793 + var2.field4157;
                var4.field5000 = var14;
                var4.field5013 = var2.field4160 * 128 + (var7 * 64);
                var4.field5003 = class414.field5793 + var2.field4161;
                int var17 = var2.field4153;
                int var18 = var2.field4154;
                int var19 = var2.field4167;
                int var20 = var2.field4159;
                if (var18 < var17) {
                    int var21 = var17;
                    var17 = var18;
                    var18 = var21;
                }
                var4.field5012 = var2.field4156 + var18;
                var4.field5008 = var2.field4156 + var17;
                if (var20 < var19) {
                    int var22 = var19;
                    var19 = var20;
                    var20 = var22;
                }
                var4.field5007 = var2.field4160 + var20;
                var4.field5015 = var2.field4160 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II[II)Lkf;")
    private final class294 method510(int arg0, int arg1, int[] arg2, int arg3) {
        field867++;
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4);
        if (arg1 != 296230852) {
            return null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class294 var9 = (class294) this.field873.method614(-80, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class146 var10 = (class146) this.field857.method614(arg1 ^ 0xEE57E077, var7);
            if (var10 == null) {
                var10 = class146.method1130(this.field865, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field857.method612(var7, arg1 - 296230853, var10);
            }
            class294 var11 = var10.method1131(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method2367(5);
                this.field873.method612(var7, -1, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[I)Lkf;")
    public final class294 method511(int arg0, int arg1, int[] arg2) {
        field870++;
        int var4 = 75 / ((63 - arg1) / 41);
        if (this.field858.method2649((byte) -122) == 1) {
            return this.method508(arg0, 0, arg2, -55);
        } else if (this.field858.method2626(arg0, 101) == 1) {
            return this.method508(0, arg0, arg2, 115);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lrk;Lrk;)V")
    public class53(class427 arg0, class427 arg1) {
        this.field865 = arg1;
        this.field858 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[II)Lkf;")
    public final class294 method512(int arg0, int[] arg1, int arg2) {
        field861++;
        if (this.field865.method2649((byte) 9) == 1) {
            return this.method510(0, arg2 ^ 0x11A81FC4, arg1, arg0);
        } else if (this.field865.method2626(arg0, 26) == 1) {
            return this.method510(arg0, 296230852, arg1, 0);
        } else {
            if (arg2 != 0) {
                field860 = -44;
            }
            throw new RuntimeException();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method513(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
