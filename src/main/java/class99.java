import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class99 extends class120 {

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    private int field2205 = 0;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    private int field2198 = 128;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    private int field2208 = 128;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public int field2199 = -1;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "[I")
    private int[] field2210 = new int[6];

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "[I")
    private int[] field2213 = new int[6];

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    private int field2217 = 0;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lva;")
    public static class121 field2212 = class107.method797(":tradereq:", -10983);

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lva;")
    public static class121 field2215 = class107.method797("k", -10983);

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    private int field2209;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lfe;")
    public static class36 field2200;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lrb;", line = 7)
    public final class102 method666(byte arg0, int arg1) {
        field2211++;
        class102 var3 = (class102) class50.field1172.method345(106, (long) this.field2202);
        if (arg0 <= 118) {
            field2212 = null;
        }
        if (var3 == null) {
            var3 = class102.method711(class69.field1637, this.field2209, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2210[0] != 0) {
                    var3.method704(this.field2210[var4], this.field2213[var4]);
                }
            }
            var3.method686();
            var3.method700(this.field2217 + 64, this.field2205 + 850, -30, -50, -30, true);
            class50.field1172.method350((byte) 123, var3, (long) this.field2202);
        }
        class102 var5;
        if (this.field2199 == -1 || arg1 == -1) {
            var5 = var3.method690(true);
        } else {
            var5 = class5.method33(9, this.field2199).method279(var3, (byte) 51, arg1);
        }
        if (this.field2198 != 128 || this.field2208 != 128) {
            var5.method692(this.field2198, this.field2208, this.field2198);
        }
        if (this.field2216 != 0) {
            if (this.field2216 == 90) {
                var5.method688();
            }
            if (this.field2216 == 180) {
                var5.method688();
                var5.method688();
            }
            if (this.field2216 == 270) {
                var5.method688();
                var5.method688();
                var5.method688();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V", line = 79)
    public static final void method667(int arg0, boolean arg1) {
        if (class62.field1494.field750 >> 7 == class43.field988 && class62.field1494.field742 >> 7 == class60.field1444) {
            class43.field988 = 0;
        }
        if (arg0 != 6) {
            return;
        }
        field2206++;
        int var2 = class13.field231;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class77 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class62.field1494;
            } else {
                var5 = class127.field2895[class71.field1680[var3]];
                var4 = class71.field1680[var3] << 14;
            }
            if (var5 != null && var5.method232(-251272184)) {
                var5.field1775 = false;
                int var6 = var5.field750 >> 7;
                int var7 = var5.field742 >> 7;
                if ((class38.field879 && class13.field231 > 50 || class13.field231 > 200) && !arg1 && var5.field777 == var5.field740) {
                    var5.field1775 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field1778 == null || var5.field1761 > class115.field2614 || class115.field2614 >= var5.field1774) {
                        if ((var5.field750 & 0x7F) == 64 && (var5.field742 & 0x7F) == 64) {
                            if (class61.field1455[var6][var7] == class121.field2782) {
                                continue;
                            }
                            class61.field1455[var6][var7] = class121.field2782;
                        }
                        var5.field1758 = class47.method340(var5.field750, -6, class121.field2807, var5.field742);
                        class58.field1348.method730(class121.field2807, var5.field750, var5.field742, var5.field1758, 60, var5, var5.field739, var4, var5.field782);
                    } else {
                        var5.field1775 = false;
                        var5.field1758 = class47.method340(var5.field750, -6, class121.field2807, var5.field742);
                        class58.field1348.method742(class121.field2807, var5.field750, var5.field742, var5.field1758, 60, var5, var5.field739, var4, var5.field1773, var5.field1757, var5.field1765, var5.field1755);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Ltc;I)V", line = 181)
    public final void method668(class113 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method821(true);
            if (var3 == 0) {
                int var4 = -11 % ((arg1 + 22) / 55);
                field2207++;
                return;
            }
            this.method671(arg0, -51, var3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BII)Lva;", line = 223)
    public static final class121 method669(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field2215 = null;
        }
        class121 var4 = new class121();
        field2204++;
        var4.field2783 = arg2;
        var4.field2817 = new byte[arg2];
        class39.method263(arg1, arg3, var4.field2817, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 249)
    public static void method670(int arg0) {
        field2212 = null;
        if (arg0 != -1113687097) {
            field2200 = null;
        }
        field2200 = null;
        field2215 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ltc;II)V", line = 277)
    private final void method671(class113 arg0, int arg1, int arg2) {
        if (arg1 != -51) {
            return;
        }
        if (arg2 == 1) {
            this.field2209 = arg0.method870(-1);
        } else if (arg2 == 2) {
            this.field2199 = arg0.method870(-1);
        } else if (arg2 == 4) {
            this.field2198 = arg0.method870(-1);
        } else if (arg2 == 5) {
            this.field2208 = arg0.method870(-1);
        } else if (arg2 == 6) {
            this.field2216 = arg0.method870(-1);
        } else if (arg2 == 7) {
            this.field2217 = arg0.method821(true);
        } else if (arg2 == 8) {
            this.field2205 = arg0.method821(true);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2210[arg2 - 40] = arg0.method870(-1);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2213[arg2 - 50] = arg0.method870(class38.method261(arg1, 50));
        }
        field2203++;
    }
}
