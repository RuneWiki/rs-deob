import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class57 extends class138 {

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "Z")
    private boolean field1042 = false;

    @OriginalMember(owner = "client!nh", name = "Ab", descriptor = "I")
    private int field1055 = -1;

    @OriginalMember(owner = "client!nh", name = "Fb", descriptor = "Z")
    private volatile boolean field1060 = false;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "Ljk;")
    private class192 field1035;

    @OriginalMember(owner = "client!nh", name = "Gb", descriptor = "Ljk;")
    private class192 field1061;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lub;")
    private static class227 field1029 = class257.method1749("M", 17263);

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "Lub;")
    public static class227 field1032 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!nh", name = "tb", descriptor = "Lub;")
    public static class227 field1048 = field1029;

    @OriginalMember(owner = "client!nh", name = "vb", descriptor = "Z")
    public static boolean field1050 = false;

    @OriginalMember(owner = "client!nh", name = "zb", descriptor = "Lub;")
    private static class227 field1054 = class257.method1749("Attack", 17263);

    @OriginalMember(owner = "client!nh", name = "yb", descriptor = "Lub;")
    public static class227 field1053 = field1054;

    @OriginalMember(owner = "client!nh", name = "Db", descriptor = "Lub;")
    public static class227 field1058 = field1029;

    @OriginalMember(owner = "client!nh", name = "Eb", descriptor = "Lub;")
    public static class227 field1059 = class257.method1749("<col=ffff00>", 17263);

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!nh", name = "rb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!nh", name = "sb", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!nh", name = "wb", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!nh", name = "Bb", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!nh", name = "Cb", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "Ln;")
    public static class138 field1037;

    @OriginalMember(owner = "client!nh", name = "ub", descriptor = "Ln;")
    public static class138 field1049;

    @OriginalMember(owner = "client!nh", name = "xb", descriptor = "[Z")
    private volatile boolean[] field1052;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)I")
    public static final int method340(byte arg0, int arg1) {
        ++field1043;
        if (~class214.field3612 == -2) {
            return 7;
        } else if (arg1 != 77) {
            if (~arg1 != -39) {
                if (arg1 != 16) {
                    if (arg1 != 161) {
                        if (arg1 != 191) {
                            if (arg1 == 69) {
                                return 6;
                            } else {
                                int var3 = -100 % ((33 - arg0) / 53);
                                return 0;
                            }
                        } else {
                            return 5;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static void method341(int arg0) {
        field1032 = null;
        field1058 = null;
        if (arg0 < -127) {
            field1037 = null;
            field1049 = null;
            field1059 = null;
            field1048 = null;
            field1029 = null;
            field1054 = null;
            field1053 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljk;Ljk;IZZZ)V")
    public class57(class192 arg0, class192 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1040 = arg2;
        this.field1035 = arg1;
        this.field1042 = arg5;
        this.field1061 = arg0;
        class120.method753(this, (byte) -53, this.field1040);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)V")
    public final void method342(int arg0, int arg1) {
        ++field1031;
        if (this.method864(arg1 + -25223, arg0)) {
            class171.method1087(this.field1040, true, arg0);
            if (arg1 != 25114) {
                method341(-104);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
    public final int method343(boolean arg0) {
        if (arg0) {
            method345(52, -72, (class105) null, (byte) 118);
        }
        ++field1039;
        if (this.field1060) {
            return 100;
        } else if (super.field2400 != null) {
            return 99;
        } else {
            int var2 = class138.method878(this.field1040, 255, (byte) -24);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljk;IZI[B)V")
    public final void method344(class192 arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 == -2) {
            ++field1046;
            if (this.field1035 == arg0) {
                if (this.field1060) {
                    throw new RuntimeException();
                } else if (arg4 == null) {
                    class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
                } else {
                    class254.field4449.reset();
                    class254.field4449.update(arg4, 0, arg4.length);
                    int var6 = (int) class254.field4449.getValue();
                    if (this.field1047 != var6) {
                        class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
                    } else {
                        class226 var7;
                        try {
                            var7 = new class226(class11.method53(0, arg4));
                        } catch (RuntimeException var12) {
                            class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
                            return;
                        }
                        int var8 = var7.method1471(255);
                        if (~var8 != -6 && var8 != 6) {
                            class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
                        } else {
                            int var9 = 0;
                            if (var8 >= 6) {
                                var9 = var7.method1478(-32053);
                            }
                            if (this.field1028 != var9) {
                                class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
                            } else {
                                this.method886((byte) -115, arg4);
                                this.method348(21857);
                            }
                        }
                    }
                }
            } else {
                if (!arg2 && this.field1055 == arg3) {
                    this.field1060 = true;
                }
                if (arg4 != null && ~arg4.length < -3) {
                    class254.field4449.reset();
                    class254.field4449.update(arg4, 0, arg4.length - 2);
                    int var10 = (int) class254.field4449.getValue();
                    int var11 = (arg4[arg4.length + -2] << 8 & 65280) + (arg4[arg4.length + -1] & 255);
                    if (super.field2380[arg3] == var10 && ~super.field2371[arg3] == ~var11) {
                        this.field1052[arg3] = true;
                        if (arg2) {
                            super.field2400[arg3] = class221.method1398(136, arg4, false);
                        }
                    } else {
                        this.field1052[arg3] = false;
                        if (this.field1042 || arg2) {
                            class104.method638(arg3, (byte) 2, this.field1040, 1941235504, this, super.field2380[arg3], arg2);
                        }
                    }
                } else {
                    this.field1052[arg3] = false;
                    if (this.field1042 || arg2) {
                        class104.method638(arg3, (byte) 2, this.field1040, arg1 + 1941235506, this, super.field2380[arg3], arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILta;B)V")
    public static final void method345(int arg0, int arg1, class105 arg2, byte arg3) {
        if (~arg2.field1900 == -1) {
            arg2.field1941 = arg2.field1828;
        } else if (~arg2.field1900 == -2) {
            arg2.field1941 = (arg0 - arg2.field1977) / 2 - -arg2.field1828;
        } else if (~arg2.field1900 == -3) {
            arg2.field1941 = arg0 - (arg2.field1977 + arg2.field1828);
        } else if (arg2.field1900 == 3) {
            arg2.field1941 = arg2.field1828 * arg0 >> 14;
        } else if (~arg2.field1900 == -5) {
            arg2.field1941 = (arg2.field1828 * arg0 >> 14) + (-arg2.field1977 + arg0) / 2;
        } else {
            arg2.field1941 = -(arg2.field1828 * arg0 >> 14) + -arg2.field1977 + arg0;
        }
        if (arg3 <= 95) {
            field1032 = null;
        }
        ++field1056;
        if (~arg2.field1876 != -1) {
            if (~arg2.field1876 != -2) {
                if (~arg2.field1876 != -3) {
                    if (arg2.field1876 != 3) {
                        if (~arg2.field1876 != -5) {
                            arg2.field1950 = -(arg2.field1966 * arg1 >> 14) + arg1 - arg2.field1952;
                        } else {
                            arg2.field1950 = (arg1 - arg2.field1952) / 2 - -(arg2.field1966 * arg1 >> 14);
                        }
                    } else {
                        arg2.field1950 = arg2.field1966 * arg1 >> 14;
                    }
                } else {
                    arg2.field1950 = arg1 - arg2.field1952 + -arg2.field1966;
                }
            } else {
                arg2.field1950 = (arg1 - arg2.field1952) / 2 + arg2.field1966;
            }
        } else {
            arg2.field1950 = arg2.field1966;
        }
        if (class50.field882) {
            if (client.method494(arg2) != 0 || arg2.field1829 == 0) {
                if (arg2.field1950 < 0) {
                    arg2.field1950 = 0;
                } else if (~arg1 > ~(arg2.field1952 + arg2.field1950)) {
                    arg2.field1950 = -arg2.field1952 + arg1;
                }
                if (~arg2.field1941 <= -1) {
                    if (arg0 < arg2.field1977 + arg2.field1941) {
                        arg2.field1941 = -arg2.field1977 + arg0;
                        return;
                    }
                } else {
                    arg2.field1941 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V")
    public final void method346(byte arg0, int arg1, int arg2) {
        ++field1036;
        this.field1047 = arg2;
        this.field1028 = arg1;
        if (arg0 != 0) {
            this.method347((byte) 10, 111);
        }
        if (this.field1035 == null) {
            class104.method638(this.field1040, (byte) 0, 255, 1941235504, this, this.field1047, true);
        } else {
            class182.method1165(this.field1040, this, (byte) 119, this.field1035);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I")
    public final int method347(byte arg0, int arg1) {
        ++field1033;
        int var3 = 46 / ((arg0 - 18) / 60);
        if (!this.method864(-115, arg1)) {
            return 0;
        } else if (super.field2400[arg1] != null) {
            return 100;
        } else {
            return this.field1052[arg1] ? 100 : class138.method878(arg1, this.field1040, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    private final void method348(int arg0) {
        this.field1052 = new boolean[super.field2400.length];
        if (arg0 != 21857) {
            field1044 = -57;
        }
        for (int var2 = 0; var2 < this.field1052.length; ++var2) {
            this.field1052[var2] = false;
        }
        ++field1041;
        if (this.field1061 == null) {
            this.field1060 = true;
        } else {
            this.field1055 = -1;
            for (int var3 = 0; ~this.field1052.length < ~var3; ++var3) {
                if (~super.field2397[var3] < -1) {
                    class38.method198(this, arg0 ^ -21858, this.field1061, var3);
                    this.field1055 = var3;
                }
            }
            if (~this.field1055 == 0) {
                this.field1060 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BBZIZ)V")
    public final void method349(byte[] arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        ++field1051;
        if (arg1 != 2) {
            this.field1035 = null;
        }
        if (arg2) {
            if (this.field1060) {
                throw new RuntimeException();
            } else {
                if (this.field1035 != null) {
                    class24.method116(this.field1035, this.field1040, (byte) 108, arg0);
                }
                this.method886((byte) -82, arg0);
                this.method348(arg1 + 21855);
            }
        } else {
            arg0[arg0.length + -2] = (byte) (super.field2371[arg3] >> 8);
            arg0[arg0.length - 1] = (byte) super.field2371[arg3];
            if (this.field1061 != null) {
                class24.method116(this.field1061, arg3, (byte) -80, arg0);
                this.field1052[arg3] = true;
            }
            if (arg4) {
                super.field2400[arg3] = class221.method1398(136, arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static final void method350(byte arg0) {
        class63.field1153 = null;
        class177.field2982 = null;
        class26.field427 = null;
        class176.field2934 = null;
        ++field1038;
        if (arg0 > -74) {
            field1048 = null;
        }
        class58.field1068 = null;
        class214.field3613 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILnj;)V")
    public static final void method351(int arg0, class226 arg1) {
        ++field1057;
        if (arg1.field3901.length + -arg1.field3879 >= 1) {
            int var2 = arg1.method1471(arg0 ^ -255);
            if (~var2 <= -1 && ~var2 >= -3) {
                byte var3;
                if (~var2 != -3) {
                    if (~var2 != -2) {
                        var3 = 19;
                    } else {
                        var3 = 23;
                    }
                } else {
                    var3 = 22;
                }
                if (~(arg1.field3901.length + -arg1.field3879) <= ~var3) {
                    class125.field2242 = arg1.method1471(255);
                    if (~class125.field2242 <= -2) {
                        if (class125.field2242 > 4) {
                            class125.field2242 = 4;
                        }
                    } else {
                        class125.field2242 = 1;
                    }
                    class26.method133(512, arg1.method1471(255) == 1);
                    class95.field1645 = arg1.method1471(255) == 1;
                    class254.field4463 = arg1.method1471(255) == 1;
                    class186.field3168 = ~arg1.method1471(255) == -2;
                    class77.field1358 = arg1.method1471(arg0 ^ -255) == 1;
                    class70.field1234 = arg1.method1471(255) == 1;
                    class128.field2262 = arg1.method1471(255) == 1;
                    class220.field3721 = arg0 == ~arg1.method1471(255);
                    class221.field3753 = arg1.method1471(255);
                    if (class221.field3753 > 2) {
                        class221.field3753 = 2;
                    }
                    if (~var2 <= -3) {
                        class31.field492 = arg1.method1471(arg0 + 257) == 1;
                    } else {
                        class31.field492 = arg1.method1471(255) == 1;
                        arg1.method1471(255);
                    }
                    class13.field251 = arg1.method1471(255) == 1;
                    client.field1450 = ~arg1.method1471(255) == -2;
                    class14.field274 = arg1.method1471(255);
                    if (~class14.field274 < -3) {
                        class14.field274 = 2;
                    }
                    class71.field1256 = ~arg1.method1471(255) == -2;
                    class193.field3294 = arg1.method1471(arg0 + 257);
                    if (class193.field3294 > 127) {
                        class193.field3294 = 127;
                    }
                    class179.field3072 = arg1.method1471(arg0 ^ -255);
                    class248.field4311 = arg1.method1471(255);
                    if (~class248.field4311 < -128) {
                        class248.field4311 = 127;
                    }
                    if (var2 >= 1) {
                        class141.field2430 = arg1.method1447(0);
                        class173.field2899 = arg1.method1447(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
    public final void method352(int arg0, byte arg1) {
        if (arg1 != 2) {
            this.method352(-14, (byte) 75);
        }
        ++field1034;
        if (this.method864(-112, arg0)) {
            if (this.field1061 != null && this.field1052 != null && this.field1052[arg0]) {
                class182.method1165(arg0, this, (byte) -45, this.field1061);
            } else {
                class104.method638(arg0, (byte) 2, this.field1040, 1941235504, this, super.field2380[arg0], true);
            }
        }
    }
}
