import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class62 extends class264 {

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "Z")
    public boolean field985 = false;

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "Z")
    public boolean field986 = false;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "Lpu;")
    public static class179 field980 = new class179("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ns", name = "eb", descriptor = "Lne;")
    public static class139 field991 = new class139("LIVE", 0);

    @OriginalMember(owner = "client!ns", name = "hb", descriptor = "[C")
    public static char[] field994 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ns", name = "gb", descriptor = "Lpn;")
    public static class49 field993 = new class49(7, 7);

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ns", name = "cb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ns", name = "db", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ns", name = "fb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static void method413(int arg0) {
        field991 = null;
        field980 = null;
        field993 = null;
        if (arg0 != 2) {
            method413(126);
        }
        field994 = null;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Z")
    public final boolean method414(int arg0, int arg1) {
        if (arg1 >= -22) {
            return false;
        } else {
            ++field983;
            return arg0 == 0 ? super.field4206 : true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public static final void method415(boolean arg0) {
        ++field992;
        if (class2.field17) {
            class38 var1 = class327.method2148(class442.field6585, -7153, class291.field4510);
            if (var1 != null && var1.field549 != null) {
                class510 var2 = new class510();
                var2.field7423 = var1;
                var2.field7413 = var1.field549;
                class152.method1090(var2);
            }
            class282.field4402 = -1;
            class2.field17 = arg0;
            class511.field7481 = -1;
            if (var1 != null) {
                class5.method27(var1, -208246073);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)Z")
    public final boolean method416(int arg0, int arg1) {
        if (arg0 <= 75) {
            field980 = null;
        }
        ++field990;
        return ~arg1 == -1 && !this.field986 ? super.field4206 : true;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(II)I")
    public static final int method417(int arg0, int arg1) {
        if (arg0 <= 65) {
            method417(60, 61);
        }
        ++field987;
        return ~arg1 == -16711936 ? -1 : class187.method1302(false, arg1);
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(II)I")
    public final int method418(int arg0, int arg1) {
        ++field988;
        if (arg0 >= -18) {
            method413(63);
        }
        if (this.field985) {
            return 0;
        } else if (!this.method416(109, arg1)) {
            return 1;
        } else {
            return super.field4215 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
    public final void method419(boolean arg0, int arg1) {
        ++field981;
        super.field4206 = arg0;
        if (arg1 < 11) {
            field993 = null;
        }
        if (class247.field3693 != null) {
            class247.field3693.method2278(!this.method416(119, class108.field1631), 0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lfh;Z)V")
    private final void method420(class194 arg0, boolean arg1) {
        ++field982;
        if (arg0.field2973.length + -arg0.field2982 >= 1) {
            int var3 = arg0.method1337((byte) 85);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (var3 != 17) {
                    if (~var3 != -17) {
                        if (var3 == 15) {
                            var4 = 37;
                        } else if (~var3 != -15) {
                            if (~var3 == -14) {
                                var4 = 35;
                            } else if (var3 != 12) {
                                if (~var3 == -12) {
                                    var4 = 33;
                                } else if (~var3 == -11) {
                                    var4 = 32;
                                } else if (var3 != 9) {
                                    if (~var3 != -9) {
                                        if (var3 != 7) {
                                            if (var3 != 6) {
                                                if (~var3 != -6) {
                                                    if (var3 == 4) {
                                                        var4 = 24;
                                                    } else if (~var3 == -4) {
                                                        var4 = 23;
                                                    } else if (var3 == 2) {
                                                        var4 = 22;
                                                    } else if (var3 == 1) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 30;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (~var4 >= ~(arg0.field2973.length + -arg0.field2982)) {
                    super.field4207 = arg0.method1337((byte) -111);
                    if (~super.field4207 <= -2) {
                        if (~super.field4207 < -5) {
                            super.field4207 = 4;
                        }
                    } else {
                        super.field4207 = 1;
                    }
                    this.method419(~arg0.method1337((byte) 46) == -2, 121);
                    super.field4215 = arg0.method1337((byte) -124) == 1;
                    super.field4195 = ~arg0.method1337((byte) -111) == -2;
                    super.field4220 = arg0.method1337((byte) 101) == 1;
                    super.field4182 = ~arg0.method1337((byte) 35) == -2 ? 1 : 0;
                    super.field4210 = arg0.method1337((byte) 104) == 1;
                    super.field4216 = arg0.method1337((byte) -118) == 1;
                    super.field4201 = ~arg0.method1337((byte) 40) == -2;
                    super.field4219 = arg0.method1337((byte) -115);
                    if (~super.field4219 < -3) {
                        super.field4219 = 2;
                    }
                    if (var3 >= 17) {
                        super.field4196 = arg0.method1337((byte) -117);
                    }
                    if (var3 < 2) {
                        super.field4189 = ~arg0.method1337((byte) 74) == -2;
                        arg0.method1337((byte) -119);
                    } else {
                        super.field4189 = arg0.method1337((byte) -111) == 1;
                        if (~var3 <= -18) {
                            super.field4194 = arg0.method1337((byte) -113) == 1;
                        }
                    }
                    super.field4205 = ~arg0.method1337((byte) -123) == -2;
                    super.field4218 = ~arg0.method1337((byte) 101) == -2;
                    super.field4184 = arg0.method1337((byte) 37);
                    if (~super.field4184 < -3) {
                        super.field4184 = 2;
                    }
                    super.field4212 = super.field4184;
                    super.field4203 = ~arg0.method1337((byte) 23) == -2;
                    super.field4199 = arg0.method1337((byte) -109);
                    if (~super.field4199 < -128) {
                        super.field4199 = 127;
                    }
                    super.field4192 = arg0.method1337((byte) -123);
                    super.field4222 = arg0.method1337((byte) 38);
                    if (super.field4222 > 127) {
                        super.field4222 = 127;
                    }
                    if (var3 >= 1) {
                        super.field4188 = arg0.method1396(-105);
                        super.field4191 = arg0.method1396(-6);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method1337((byte) -119);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method1337((byte) -123);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class360.field5314 > -97) {
                            var5 = 0;
                        }
                        class486.method2941(-81, var5);
                    }
                    if (var3 >= 5) {
                        super.field4209 = arg0.method1401(-11);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field4208 = var6 = arg0.method1337((byte) 107);
                    }
                    if (super.field4208 != 1 && ~super.field4208 != -3) {
                        super.field4208 = 2;
                    }
                    if (var3 >= 7) {
                        super.field4211 = arg0.method1337((byte) 122) == 1;
                    }
                    if (var3 >= 8) {
                        super.field4187 = arg0.method1337((byte) 115) == 1;
                    }
                    if (var3 >= 9) {
                        super.field4193 = arg0.method1337((byte) 40);
                    }
                    if (~super.field4193 > -1 || super.field4193 > class463.method2837(class360.field5314, (byte) 89)) {
                        super.field4193 = 0;
                    }
                    if (var3 >= 10) {
                        super.field4202 = arg0.method1337((byte) -124) != 0;
                    }
                    if (~var3 <= -12) {
                        super.field4197 = arg0.method1337((byte) -123) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field4182 = arg0.method1337((byte) -118);
                    }
                    if (~super.field4182 > -1 || super.field4182 > 2) {
                        super.field4182 = 1;
                    }
                    if (arg1) {
                        this.method414(-32, -37);
                    }
                    if (~var3 <= -14) {
                        super.field4198 = arg0.method1337((byte) 92) == 1;
                    }
                    if (~var3 <= -15) {
                        super.field4204 = arg0.method1337((byte) 97);
                    } else if (~var6 == -1) {
                        super.field4204 = 2;
                    } else {
                        super.field4204 = 1;
                    }
                    if (~super.field4204 > -1 || super.field4204 > 3) {
                        super.field4204 = 2;
                    }
                    if (var3 >= 15) {
                        super.field4183 = arg0.method1337((byte) -115);
                        if (super.field4183 < 0 || super.field4183 > 4) {
                            super.field4183 = class482.field7069 != 1 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4217 = ~arg0.method1337((byte) -111) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field4217 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field4204 == -1) {
                        super.field4204 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZBI)V")
    public static final void method421(int arg0, boolean arg1, byte arg2, int arg3) {
        ++field979;
        if (arg2 < -88) {
            if (~arg0 <= -8001 && arg0 <= 48000) {
                class285.field4446 = arg3;
                class193.field2961 = arg0;
                class162.field2453 = arg1;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lgt;I)V")
    public final void method422(class66 arg0, int arg1) {
        ++field989;
        class95 var3 = null;
        try {
            class329 var4 = arg0.method472("", true, (byte) 12);
            while (~var4.field4974 == -1) {
                class468.method2848(1L, (byte) -63);
            }
            if (var4.field4974 == arg1) {
                var3 = (class95) var4.field4975;
                class194 var5 = this.method423(0);
                var3.method805(var5.field2973, true, 0, var5.field2982);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method800(false);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lgt;)V")
    public class62(class66 arg0) {
        super.field4207 = 3;
        this.method419(true, 91);
        super.field4184 = 0;
        super.field4220 = true;
        super.field4194 = false;
        super.field4205 = true;
        super.field4216 = true;
        super.field4191 = 0;
        super.field4192 = 255;
        super.field4196 = 0;
        super.field4215 = true;
        super.field4201 = true;
        super.field4212 = 0;
        super.field4189 = true;
        super.field4203 = true;
        super.field4218 = true;
        super.field4199 = 127;
        super.field4219 = 2;
        super.field4188 = 0;
        super.field4210 = true;
        super.field4182 = 1;
        super.field4195 = true;
        super.field4222 = 127;
        if (~class360.field5314 > -97) {
            class486.method2941(-97, 0);
        } else {
            class486.method2941(-112, 2);
        }
        super.field4204 = 2;
        super.field4208 = 2;
        super.field4183 = ~class482.field7069 != -2 ? 4 : 2;
        super.field4187 = false;
        super.field4209 = 0;
        super.field4202 = false;
        super.field4193 = 0;
        super.field4197 = true;
        super.field4198 = true;
        super.field4211 = false;
        class95 var2 = null;
        try {
            class329 var3 = arg0.method472("", true, (byte) 12);
            while (~var3.field4974 == -1) {
                class468.method2848(1L, (byte) 93);
            }
            if (~var3.field4974 == -2) {
                var2 = (class95) var3.field4975;
                byte[] var4 = new byte[(int) var2.method803((byte) 78)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method801(var4.length + -var5, (byte) -6, var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method420(new class194(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method800(false);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Lfh;")
    public final class194 method423(int arg0) {
        ++field984;
        class194 var2 = new class194(41);
        var2.method1381(17, (byte) 85);
        var2.method1381(super.field4207, (byte) 120);
        var2.method1381(super.field4206 ? 1 : 0, (byte) 104);
        var2.method1381(!super.field4215 ? 0 : 1, (byte) 110);
        var2.method1381(super.field4195 ? 1 : 0, (byte) 122);
        var2.method1381(super.field4220 ? 1 : 0, (byte) 127);
        var2.method1381(arg0, (byte) 84);
        var2.method1381(!super.field4210 ? 0 : 1, (byte) 125);
        var2.method1381(!super.field4216 ? 0 : 1, (byte) 108);
        var2.method1381(super.field4201 ? 1 : 0, (byte) 110);
        var2.method1381(super.field4219, (byte) 118);
        var2.method1381(super.field4196, (byte) 109);
        var2.method1381(!super.field4189 ? 0 : 1, (byte) 88);
        var2.method1381(super.field4194 ? 1 : 0, (byte) 98);
        var2.method1381(super.field4205 ? 1 : 0, (byte) 98);
        var2.method1381(!super.field4218 ? 0 : 1, (byte) 96);
        var2.method1381(super.field4184, (byte) 112);
        var2.method1381(!super.field4203 ? 0 : 1, (byte) 105);
        var2.method1381(super.field4199, (byte) 114);
        var2.method1381(super.field4192, (byte) 100);
        var2.method1381(super.field4222, (byte) 89);
        var2.method1364(super.field4188, true);
        var2.method1364(super.field4191, true);
        var2.method1381(class463.method2835((byte) 107), (byte) 79);
        var2.method1348((byte) -65, super.field4209);
        var2.method1381(super.field4208, (byte) 81);
        var2.method1381(!super.field4211 ? 0 : 1, (byte) 98);
        var2.method1381(!super.field4187 ? 0 : 1, (byte) 122);
        var2.method1381(super.field4193, (byte) 99);
        var2.method1381(!super.field4202 ? 0 : 1, (byte) 85);
        var2.method1381(super.field4197 ? 1 : 0, (byte) 98);
        var2.method1381(super.field4182, (byte) 89);
        var2.method1381(super.field4198 ? 1 : 0, (byte) 94);
        var2.method1381(super.field4204, (byte) 112);
        var2.method1381(super.field4183, (byte) 125);
        var2.method1381(!super.field4217 ? 0 : 1, (byte) 105);
        return var2;
    }
}
