import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class118 extends class177 {

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "Lbe;")
    public static class283 field1989 = class153.method941(-126, "Lade)3)3)3");

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "Lbe;")
    public static class283 field1995 = class153.method941(125, "M");

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "Lbe;")
    public static class283 field1996 = class153.method941(125, "cookiehost");

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field1990 = 255;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Lbe;")
    public class283 field1991;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lkd;IB)V", line = 14)
    public static final void method753(class70 arg0, int arg1, byte arg2) {
        int var3 = -102 % ((42 - arg2) / 55);
        field1987++;
        if (class75.field1309 < arg0.field1166) {
            class261.method1764(-83, arg0);
        } else if (class75.field1309 > arg0.field1156) {
            class184.method1217((byte) 112, arg0);
        } else {
            class134.method834(arg0, (byte) -44);
        }
        if (arg0.field1193 < 128 || arg0.field1210 < 128 || arg0.field1193 >= 13184 || arg0.field1210 >= 13184) {
            arg0.field1192 = -1;
            arg0.field1156 = 0;
            arg0.field1166 = 0;
            arg0.field1211 = -1;
            arg0.field1193 = arg0.field1178[0] * 128 + arg0.method460((byte) -100) * 64;
            arg0.field1210 = arg0.field1150[0] * 128 + arg0.method460((byte) 116) * 64;
            arg0.method454(0);
        }
        if (class213.field3624 == arg0 && (arg0.field1193 < 1536 || arg0.field1210 < 1536 || arg0.field1193 >= 11776 || arg0.field1210 >= 11776)) {
            arg0.field1211 = -1;
            arg0.field1156 = 0;
            arg0.field1192 = -1;
            arg0.field1166 = 0;
            arg0.field1193 = arg0.field1178[0] * 128 + arg0.method460((byte) -49) * 64;
            arg0.field1210 = arg0.field1150[0] * 128 + (arg0.method460((byte) 112) * 64);
            arg0.method454(0);
        }
        class283.method1931(arg0, true);
        class19.method117(true, arg0);
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V", line = 69)
    public static void method754(int arg0) {
        field1995 = null;
        field1989 = null;
        field1996 = null;
        if (arg0 > -102) {
            field1990 = -60;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lek;Lub;Lek;ILek;)Z", line = 85)
    public static final boolean method755(class172 arg0, class20 arg1, class172 arg2, int arg3, class172 arg4) {
        field1985++;
        class236.field3950 = arg2;
        class254.field4298 = arg1;
        class243.field4107 = arg0;
        class140.field2336 = arg4;
        return arg3 >= 126;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLfe;I)V", line = 105)
    private final void method756(byte arg0, class229 arg1, int arg2) {
        if (arg0 > -35) {
            this.field1997 = -77;
        }
        field1992++;
        if (arg2 == 1) {
            this.field1997 = arg1.method1535((byte) 101);
        } else if (arg2 == 2) {
            this.field1983 = arg1.method1528(true);
        } else if (arg2 == 5) {
            this.field1991 = arg1.method1549(true);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V", line = 129)
    public static final void method757(int arg0, int arg1) {
        class237.field3962 = -1;
        class237.field3962 = -1;
        if (arg1 == 37) {
            class162.field2649 = 3.0F;
        } else if (arg1 == 50) {
            class162.field2649 = 4.0F;
        } else if (arg1 == 75) {
            class162.field2649 = 6.0F;
        } else {
            class162.field2649 = 8.0F;
        }
        field1993++;
        if (arg0 != 75) {
            field1990 = -112;
        }
    }

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "(I)Z", line = 154)
    public final boolean method758(int arg0) {
        if (arg0 == -5) {
            field1988++;
            return this.field1997 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lfe;I)V", line = 165)
    public final void method759(class229 arg0, int arg1) {
        field1994++;
        if (arg1 != -1) {
            field1989 = (class283) null;
        }
        while (true) {
            int var3 = arg0.method1535((byte) 95);
            if (var3 == 0) {
                return;
            }
            this.method756((byte) -108, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V", line = 194)
    public static final void method760(int arg0, int arg1, int arg2) {
        for (int var3 = arg0; var3 < class128.field2131; var3++) {
            class145 var4 = class174.method1135(var3, arg0 + 99);
            if (var4 != null) {
                int var5 = var4.field2397;
                if (var5 >= 0 && !class139.field2315.method652(var5, (byte) 65)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field2402 >= 0) {
                    int var10 = var4.field2402;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class139.field2317[class36.method230(96, var12, arg0 ^ 0x7E)];
                } else if (var5 >= 0) {
                    var6 = class139.field2317[class36.method230(96, class139.field2315.method641(var5, (byte) -92), arg0 + 126)];
                } else if (var4.field2405 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field2405;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (var7 + arg2 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class139.field2317[class36.method230(96, var9, 126)];
                }
                class163.field2686[var3 + 1] = var6;
            }
        }
        field1984++;
    }

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "(I)V", line = 275)
    public static final void method761(int arg0) {
        field1986++;
        class116.method751();
        for (int var1 = arg0; var1 < 4; var1++) {
            class180.field3102[var1].method688((byte) 32);
        }
        System.gc();
    }
}
