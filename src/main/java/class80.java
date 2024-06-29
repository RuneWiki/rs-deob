import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class80 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field1093 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Z")
    public boolean field1100 = false;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private int field1088 = -1;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
    public boolean field1096 = true;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    private int field1105 = -1;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    private int field1097 = -1;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field1113 = 0;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
    public boolean field1101 = true;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public int field1116 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    public boolean field1107 = true;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field1110 = -1;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field1109 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public int field1119 = -1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    private int field1087 = -1;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[Ljava/lang/String;")
    public String[] field1102 = new String[5];

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    private int field1115 = -1;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public int field1123 = -1;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public int field1124 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1103 = "flash3:";

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Ljava/lang/String;")
    public String field1092;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
    public String field1099;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "[I")
    public int[] field1126;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLnr;)Lqa;")
    public final class243 method502(int arg0, boolean arg1, class437 arg2) {
        field1112++;
        int var4 = arg1 ? this.field1110 : this.field1123;
        int var5 = var4 | arg2.field6424 << 29;
        class243 var6 = (class243) class220.field3136.method209(122, (long) var5);
        if (arg0 != -4379) {
            return null;
        } else if (var6 != null) {
            return var6;
        } else if (class24.field420.method1451(arg0 + 4269, var4)) {
            class25 var7 = class25.method225(class24.field420, var4, 0);
            if (var7 != null) {
                var6 = arg2.method2166(var7, true);
                class220.field3136.method202(true, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method503(byte arg0) {
        if (this.field1126 != null) {
            for (int var2 = 0; var2 < this.field1126.length; var2 += 2) {
                if (this.field1126[var2] < this.field1124) {
                    this.field1124 = this.field1126[var2];
                } else if (this.field1093 < this.field1126[var2]) {
                    this.field1093 = this.field1126[var2];
                }
                if (this.field1126[var2 + 1] < this.field1109) {
                    this.field1109 = this.field1126[var2 + 1];
                } else if (this.field1116 < this.field1126[var2 + 1]) {
                    this.field1116 = this.field1126[var2 + 1];
                }
            }
        }
        field1108++;
        if (arg0 != -48) {
            this.field1119 = 85;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI)Z")
    public static final boolean method504(byte[] arg0, int arg1) {
        field1117++;
        class265 var2 = new class265(arg0);
        if (arg1 != 0) {
            field1103 = null;
        }
        int var3 = var2.method1697(-92);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1697(arg1 ^ 0x4C) == 1;
        if (var4) {
            class174.method1065(var2, 0);
        }
        class269.method1731((byte) -67, var2);
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLil;I)V")
    private final void method505(byte arg0, class265 arg1, int arg2) {
        field1095++;
        if (arg0 <= 29) {
            this.method508(-124);
        }
        if (arg2 == 1) {
            this.field1123 = arg1.method1685(8104);
        } else if (arg2 == 2) {
            this.field1110 = arg1.method1685(8104);
        } else if (arg2 == 3) {
            this.field1092 = arg1.method1712(false);
        } else if (arg2 == 4) {
            this.field1089 = arg1.method1691(false);
        } else if (arg2 == 5) {
            this.field1125 = arg1.method1691(false);
        } else if (arg2 == 6) {
            this.field1113 = arg1.method1697(-64);
        } else if (arg2 == 7) {
            int var4 = arg1.method1697(-52);
            if ((var4 & 0x2) == 2) {
                this.field1100 = true;
            }
            if ((var4 & 0x1) == 0) {
                this.field1101 = false;
                return;
            }
        } else if (arg2 == 8) {
            this.field1107 = arg1.method1697(-98) == 1;
        } else if (arg2 == 9) {
            this.field1097 = arg1.method1685(8104);
            if (this.field1097 == 65535) {
                this.field1097 = -1;
            }
            this.field1088 = arg1.method1685(8104);
            if (this.field1088 == 65535) {
                this.field1088 = -1;
            }
            this.field1106 = arg1.method1666(-2);
            this.field1121 = arg1.method1666(-2);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 != 16) {
                    if (arg2 != 17) {
                        if (arg2 == 18) {
                            this.field1115 = arg1.method1685(8104);
                            return;
                        }
                        if (arg2 == 19) {
                            this.field1119 = arg1.method1685(8104);
                            return;
                        }
                        if (arg2 == 20) {
                            this.field1087 = arg1.method1685(8104);
                            if (this.field1087 == 65535) {
                                this.field1087 = -1;
                            }
                            this.field1105 = arg1.method1685(8104);
                            if (this.field1105 == 65535) {
                                this.field1105 = -1;
                            }
                            this.field1091 = arg1.method1666(-2);
                            this.field1122 = arg1.method1666(-2);
                            return;
                        }
                        if (arg2 == 21) {
                            this.field1114 = arg1.method1666(-2);
                        } else if (arg2 == 22) {
                            this.field1111 = arg1.method1666(-2);
                            return;
                        }
                        return;
                    }
                    this.field1099 = arg1.method1712(false);
                    return;
                }
                this.field1096 = false;
                return;
            }
            int var5 = arg1.method1697(-22);
            this.field1126 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field1126[var6] = arg1.method1698(1625554944);
            }
            this.field1120 = arg1.method1666(-2);
            this.field1104 = arg1.method1666(-2);
            return;
        } else {
            this.field1102[arg2 - 10] = arg1.method1712(false);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lil;I)V")
    public final void method506(class265 arg0, int arg1) {
        field1098++;
        while (true) {
            int var3 = arg0.method1697(-122);
            if (var3 == 0) {
                if (arg1 > -86) {
                    method507(23, (short[]) null, (String[]) null);
                    return;
                } else {
                    return;
                }
            }
            this.method505((byte) 87, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
    public static final void method507(int arg0, short[] arg1, String[] arg2) {
        field1118++;
        class372.method2447(0, 91, arg2.length + arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
    public final boolean method508(int arg0) {
        field1094++;
        if (this.field1088 == arg0 && this.field1097 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field1088 == -1) {
            var3 = class312.method1952(this.field1097, arg0);
        } else {
            var3 = class192.field2668[this.field1088];
        }
        if (this.field1106 > var3 || var3 > this.field1121) {
            return false;
        } else if (this.field1105 == -1 && this.field1087 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field1105 == -1) {
                var5 = class312.method1952(this.field1087, -1);
            } else {
                var5 = class192.field2668[this.field1105];
            }
            return var5 >= this.field1091 && var5 <= this.field1122;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lnr;I)Lqa;")
    public final class243 method509(class437 arg0, int arg1) {
        field1127++;
        class243 var3 = (class243) class220.field3136.method209(arg1 + 127, (long) (this.field1115 | 0x20000 | arg0.field6424 << 29));
        if (arg1 != -1) {
            this.field1114 = 6;
        }
        if (var3 != null) {
            return var3;
        }
        class24.field420.method1451(-119, this.field1115);
        class25 var4 = class25.method225(class24.field420, this.field1115, 0);
        if (var4 != null) {
            var3 = arg0.method2166(var4, true);
            class220.field3136.method202(true, var3, (long) (arg0.field6424 << 29 | this.field1115 | 0x20000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method510(int arg0) {
        if (arg0 != 0) {
            field1103 = null;
        }
        field1103 = null;
    }
}
