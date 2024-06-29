import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class137 {

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Z")
    public boolean field2098 = false;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field2097 = 0;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public int field2095 = 128;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public int field2088 = -1;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Z")
    public boolean field2089 = true;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public int field2099 = 8;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Z")
    public boolean field2110 = true;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public int field2105 = 16;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public int field2107 = 1190717;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public int field2108 = -1;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "S")
    public static short field2094 = 320;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
    public static volatile boolean field2102 = false;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "Lwm;")
    public static class152 field2111 = class157.method1048("Chargement des fichiers config )2 ", 97);

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Lwm;")
    public static class152 field2109 = class157.method1048("zap", 102);

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "Lwm;")
    public static class152 field2104 = class157.method1048("Connexion au serveur de mise -9 jour en cours", 107);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Z")
    public static boolean field2091;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[[Laj;")
    public static class1[][] field2103;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBLah;)[Lbg;", line = 5)
    public static final class203[] method863(int arg0, int arg1, byte arg2, class205 arg3) {
        field2112++;
        if (class86.method566(arg0, arg3, arg1, 1)) {
            if (arg2 != -6) {
                method870((Random) null, -70, (byte) 24);
            }
            return class172.method1150(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILhi;I)V", line = 23)
    private final void method864(int arg0, int arg1, class291 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2097 = class254.method1766((byte) 89, arg2.method2009((byte) 64));
        } else if (arg0 == 2) {
            this.field2088 = arg2.method2011(arg3 ^ 0x4E);
        } else if (arg0 == 3) {
            this.field2088 = arg2.method2021((byte) 74);
            if (this.field2088 == 65535) {
                this.field2088 = -1;
            }
        } else if (arg0 == 5) {
            this.field2089 = false;
        } else if (arg0 == 7) {
            this.field2108 = class254.method1766((byte) 83, arg2.method2009((byte) 64));
        } else if (arg0 == 8) {
            class202.field3270 = arg1;
        } else if (arg0 == 9) {
            this.field2095 = arg2.method2021((byte) 74);
        } else if (arg0 == 10) {
            this.field2110 = false;
        } else if (arg0 == 11) {
            this.field2099 = arg2.method2011(-107);
        } else if (arg0 == 12) {
            this.field2098 = true;
        } else if (arg0 == 13) {
            this.field2107 = arg2.method2009((byte) 64);
        } else if (arg0 == 14) {
            this.field2105 = arg2.method2011(arg3 - 113);
        }
        if (arg3 != -1) {
            method866(-68);
        }
        field2092++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 93)
    public static final void method865(boolean arg0) {
        field2101++;
        for (class122 var1 = (class122) class107.field1519.method1585(-1506054736); var1 != null; var1 = (class122) class107.field1519.method1581((byte) -116)) {
            int var2 = var1.field1724;
            if (class197.method1315(71, var2)) {
                boolean var3 = true;
                class127[] var4 = class215.field3501[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1794;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4689;
                    class127 var7 = class11.method54(false, var6);
                    if (var7 != null) {
                        class272.method1868(22889, var7);
                    }
                }
            }
        }
        if (!arg0) {
            field2111 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 177)
    public static void method866(int arg0) {
        field2104 = null;
        if (arg0 == 5) {
            field2111 = null;
            field2109 = null;
            field2103 = (class1[][]) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Luk;", line = 195)
    public static final class93 method867(int arg0, byte arg1) {
        if (arg1 <= 28) {
            return (class93) null;
        }
        class93 var2 = (class93) class211.field3425.method1620(true, (long) arg0);
        field2106++;
        if (var2 != null) {
            return var2;
        }
        class93 var3 = class83.method539(class6.field88, arg0, class81.field1138, false, false);
        if (var3 != null) {
            class211.field3425.method1614(var3, (long) arg0, (byte) 78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lhi;II)V", line = 221)
    public final void method868(class291 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method2011(-34);
            if (var4 == 0) {
                field2090++;
                if (arg1 != 0) {
                    field2104 = (class152) null;
                }
                return;
            }
            this.method864(var4, arg2, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 244)
    public static final int method869(int arg0, int arg1) {
        field2113++;
        if (class265.field4477 != null) {
            class265.field4477.method1239((byte) -101);
            class265.field4477 = null;
        }
        class149.field2323++;
        if (class149.field2323 > 4) {
            class149.field2323 = 0;
            class193.field3078 = 0;
            return arg0;
        }
        if (class80.field1120 == class127.field1811) {
            class80.field1120 = class210.field3420;
        } else {
            class80.field1120 = class127.field1811;
        }
        if (arg1 == 5) {
            class193.field3078 = 0;
            return -1;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/util/Random;IB)I", line = 312)
    public static final int method870(Random arg0, int arg1, byte arg2) {
        field2093++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class135.method858(arg1, -17597)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else if (arg2 == -112) {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class306.method2132(true, arg1, var4);
        } else {
            return 14;
        }
    }
}
