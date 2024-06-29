import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class248 extends class252 {

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3880 = "Loading sprites - ";

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljava/lang/String;")
    public String field3881;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "Ljava/lang/String;")
    public String field3886;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1618(byte arg0, String arg1) {
        ++field3887;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = arg1.length();
            if (var2 < 1) {
                return null;
            } else {
                if (~var2 < -21) {
                    var2 = 20;
                }
                StringBuffer var3 = new StringBuffer(var2);
                if (arg0 <= 8) {
                    field3880 = null;
                }
                for (int var4 = 0; var4 < var2; ++var4) {
                    char var5 = arg1.charAt(var4);
                    if (class186.method1183(var5, false)) {
                        if (~var5 != -92 && var5 != ']' && ~var5 != -36) {
                            if (var5 != '-') {
                                if (~var5 != -225 && ~var5 != -226 && ~var5 != -227 && var5 != 228 && var5 != 227 && var5 != 192 && ~var5 != -194 && ~var5 != -195 && var5 != 196 && var5 != 195) {
                                    if (~var5 != -233 && var5 != 233 && ~var5 != -235 && var5 != 235 && ~var5 != -201 && var5 != 201 && ~var5 != -203 && ~var5 != -204) {
                                        if (~var5 != -238 && var5 != 238 && ~var5 != -240 && ~var5 != -206 && ~var5 != -207 && var5 != 207) {
                                            if (~var5 != -243 && ~var5 != -244 && ~var5 != -245 && ~var5 != -247 && ~var5 != -246 && ~var5 != -211 && ~var5 != -212 && ~var5 != -213 && ~var5 != -215 && ~var5 != -214) {
                                                if (var5 != 249 && ~var5 != -251 && var5 != 251 && ~var5 != -253 && var5 != 217 && ~var5 != -219 && var5 != 219 && var5 != 220) {
                                                    if (var5 != 231 && var5 != 199) {
                                                        if (var5 != 255 && ~var5 != -377) {
                                                            if (var5 != 241 && ~var5 != -210) {
                                                                if (var5 != 223) {
                                                                    if (var5 != ' ' && ~var5 != -161) {
                                                                        var3.append(Character.toLowerCase(var5));
                                                                    } else {
                                                                        var3.append('_');
                                                                    }
                                                                } else {
                                                                    var3.append("b");
                                                                }
                                                            } else {
                                                                var3.append('n');
                                                            }
                                                        } else {
                                                            var3.append('y');
                                                        }
                                                    } else {
                                                        var3.append('c');
                                                    }
                                                } else {
                                                    var3.append('u');
                                                }
                                            } else {
                                                var3.append('o');
                                            }
                                        } else {
                                            var3.append('i');
                                        }
                                    } else {
                                        var3.append('e');
                                    }
                                } else {
                                    var3.append('a');
                                }
                            }
                        } else {
                            var3.append(var5);
                        }
                    }
                }
                if (~var3.length() == -1) {
                    return null;
                } else {
                    return var3.toString();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Lwh;")
    public final class250 method1619(byte arg0) {
        ++field3882;
        int var2 = 108 / ((arg0 - -60) / 51);
        return class89.field1282[super.field3946];
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static void method1620(int arg0) {
        if (arg0 != -211) {
            field3884 = 55;
        }
        field3880 = null;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
    public static final void method1621(int arg0) {
        if (class272.field4332 != null) {
            class272.field4332.method1211((byte) -47);
            class272.field4332 = null;
        }
        ++field3883;
        class15.method110((byte) -126);
        class89.method574();
        for (int var1 = 0; var1 < 4; ++var1) {
            class156.field2153[var1].method1326((byte) -89);
        }
        class108.method687(88, false);
        System.gc();
        class54.method346(2, 31058);
        class137.field1876 = false;
        class102.field1457 = -1;
        class206.method1289(true, (byte) 46);
        class200.field3045 = arg0;
        class228.field3570 = 0;
        class195.field2997 = false;
        class170.field2421 = 0;
        class281.field4460 = 0;
        for (int var2 = 0; var2 < class267.field4286.length; ++var2) {
            class267.field4286[var2] = null;
        }
        class171.field2437 = 0;
        class306.field4921 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class48.field689[var3] = null;
            class227.field3546[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class88.field1274[var4] = null;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var6 = 0; var6 < 104; ++var6) {
                for (int var7 = 0; ~var7 > -105; ++var7) {
                    class78.field1088[var5][var6][var7] = null;
                }
            }
        }
        class167.method1074((byte) 25);
        class305.field4880 = 0;
        class284.method1870((byte) 56);
        class110.method700(true, (byte) -104);
        try {
            class172.method1097("loggedout", true, class45.field667.field744);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static final void method1622(boolean arg0) {
        ++field3879;
        class103.field1475.method944(76);
        class105.field1509.method944(99);
        if (!arg0) {
            field3884 = -11;
        }
    }
}
