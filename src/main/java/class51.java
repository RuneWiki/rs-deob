import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class51 extends class67 {

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "[Lfc;")
    public class51[] field1039;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
    public boolean field1029;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Led;")
    public static class43 field1020 = class191.method1219(" steht bereits auf Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field1024 = 0;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "[I")
    public static int[] field1033 = new int[2000];

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Led;")
    private static class43 field1035 = class191.method1219("green:", false);

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Led;")
    public static class43 field1042 = field1035;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Led;")
    public static class43 field1019 = field1035;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Led;")
    public static class43 field1036 = class191.method1219("Titelbild geladen)3", false);

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Led;")
    private static class43 field1031 = class191.method1219("No response from server)3", false);

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Led;")
    public static class43 field1021 = field1031;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "Led;")
    public static class43 field1048 = class191.method1219("Bitte benutzen Sie eine andere Welt)3", false);

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lsh;")
    public class171 field1027;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Laf;")
    public class7 field1025;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)[[I")
    public final int[][] method306(int arg0, int arg1, int arg2) {
        field1032++;
        if (arg0 != 0) {
            field1035 = null;
        }
        if (!this.field1039[arg2].field1029) {
            return this.field1039[arg2].method99(arg1, (byte) -94);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1039[arg2].method27(16, arg1);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
    public int method307(boolean arg0) {
        field1023++;
        if (!arg0) {
            method311(-103L, (byte) -83);
        }
        return -1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljg;II)V")
    public void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1033 = null;
        }
        field1045++;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)V")
    public static void method308(boolean arg0) {
        field1019 = null;
        field1020 = null;
        field1048 = null;
        field1036 = null;
        field1042 = null;
        field1031 = null;
        field1035 = null;
        field1021 = null;
        field1033 = null;
        if (arg0) {
            method310(true);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
    public int method309(byte arg0) {
        if (arg0 != 94) {
            field1048 = null;
        }
        field1030++;
        return -1;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)V")
    public static final void method310(boolean arg0) {
        field1018++;
        int var1 = 0;
        if (!arg0) {
            field1021 = null;
        }
        while (var1 < class115.field2241) {
            int var2 = class67.field1347[var1];
            class77 var3 = class172.field3433[var2];
            int var4 = class38.field723.method538((byte) -111);
            if ((var4 & 0x8) != 0) {
                var3.field2349 = class38.field723.method555(-1113627096);
                var3.field2339 = class38.field723.method563(-25695);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1539 = class2.method7(!arg0, class38.field723.method563(-25695));
                var3.field2320 = var3.field1539.field1197;
                var3.field2327 = var3.field1539.field1219;
                var3.field2361 = var3.field1539.field1207;
                var3.field2378 = var3.field1539.field1186;
                var3.field2334 = var3.field1539.field1200;
                var3.field2322 = var3.field1539.field1199;
                var3.field2323 = var3.field1539.field1222;
                var3.field2371 = var3.field1539.field1182;
                var3.field2326 = var3.field1539.field1175;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class38.field723.method543(-6);
                int var6 = class38.field723.method560((byte) -69);
                var3.method762(var5, var6, client.field559, -123);
                var3.field2312 = client.field559 + 300;
                var3.field2363 = class38.field723.method560((byte) -69);
                var3.field2337 = class38.field723.method538((byte) -80);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class38.field723.method578(0);
                int var8 = class38.field723.method543(-6);
                var3.method762(var7, var8, client.field559, 1);
                var3.field2312 = client.field559 + 300;
                var3.field2363 = class38.field723.method538((byte) 94);
                var3.field2337 = class38.field723.method578(0);
            }
            if ((var4 & 0x1) != 0) {
                int var9 = class38.field723.method563(-25695);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class38.field723.method560((byte) -69);
                if (var3.field2351 == var9 && var9 != -1) {
                    int var11 = class175.method1101(var9, true).field3997;
                    if (var11 == 1) {
                        var3.field2355 = var10;
                        var3.field2315 = 0;
                        var3.field2360 = 0;
                        var3.field2375 = 0;
                    }
                    if (var11 == 2) {
                        var3.field2315 = 0;
                    }
                } else if (var9 == -1 || var3.field2351 == -1 || class175.method1101(var9, true).field3983 >= class175.method1101(var3.field2351, true).field3983) {
                    var3.field2315 = 0;
                    var3.field2360 = 0;
                    var3.field2355 = var10;
                    var3.field2348 = var3.field2377;
                    var3.field2351 = var9;
                    var3.field2375 = 0;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field2340 = class38.field723.method541(936);
                var3.field2353 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field2380 = class38.field723.method579(96);
                if (var3.field2380 == 65535) {
                    var3.field2380 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field2364 = class38.field723.method579(112);
                int var12 = class38.field723.method545(-7436);
                if (var3.field2364 == 65535) {
                    var3.field2364 = -1;
                }
                var3.field2345 = (var12 & 0xFFFF) + client.field559;
                var3.field2324 = 0;
                var3.field2366 = var12 >> 16;
                var3.field2325 = 0;
                if (var3.field2345 > client.field559) {
                    var3.field2325 = -1;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)V")
    public static final void method311(long arg0, byte arg1) {
        field1028++;
        if (arg0 == 0L) {
            return;
        }
        if (class40.field778 >= 100 && class68.field1370 != 1 || class40.field778 >= 200) {
            class81.method504(class167.field3301, class110.field2127, 0, (byte) 41);
            return;
        }
        class43 var3 = class9.method47(arg0, (byte) -85).method273(46);
        for (int var4 = 0; var4 < class40.field778; var4++) {
            if (class117.field2286[var4] == arg0) {
                class81.method504(class167.method1036(new class43[] { var3, class84.field1653 }, true), class110.field2127, 0, (byte) 112);
                return;
            }
        }
        for (int var5 = 0; var5 < class73.field1457; var5++) {
            if (class78.field1546[var5] == arg0) {
                class81.method504(class167.method1036(new class43[] { class73.field1456, var3, class99.field1903 }, true), class110.field2127, 0, (byte) 113);
                return;
            }
        }
        if (var3.method257(class67.field1348.field23, 98)) {
            class81.method504(class2.field48, class110.field2127, 0, (byte) 73);
            return;
        }
        class148.field3018[class40.field778] = var3;
        class36.field693++;
        if (arg1 >= -11) {
            return;
        }
        class117.field2286[class40.field778] = arg0;
        class80.field1585[class40.field778] = 0;
        class78.field1545[class40.field778] = 0;
        class27.field479 = class200.field3940;
        class40.field778++;
        class29.field522.method338(253, 118);
        class29.field522.method550(-118, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public void method64(int arg0) {
        if (arg0 < -83) {
            field1037++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public int[] method27(int arg0, int arg1) {
        field1026++;
        if (arg0 == 16) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
    public final void method312(int arg0, int arg1, int arg2) {
        if (arg0 != -4503) {
            return;
        }
        field1022++;
        int var4 = this.field1043 == 255 ? arg2 : this.field1043;
        if (this.field1029) {
            this.field1025 = new class7(var4, arg2, arg1);
        } else {
            this.field1027 = new class171(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public final void method313(byte arg0) {
        field1040++;
        if (this.field1029) {
            this.field1025.method40(0);
            this.field1025 = null;
        } else {
            this.field1027.method1088(false);
            this.field1027 = null;
        }
        if (arg0 <= 65) {
            field1034 = 31;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[[I")
    public int[][] method99(int arg0, byte arg1) {
        field1046++;
        if (arg1 == -94) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)[I")
    public final int[] method314(int arg0, byte arg1, int arg2) {
        if (arg1 > -30) {
            return null;
        } else {
            field1047++;
            return this.field1039[arg0].field1029 ? this.field1039[arg0].method27(16, arg2) : this.field1039[arg0].method99(arg2, (byte) -94)[0];
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IZ)V")
    public class51(int arg0, boolean arg1) {
        this.field1039 = new class51[arg0];
        this.field1029 = arg1;
    }
}
