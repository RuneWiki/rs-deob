import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class65 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lsa;")
    private class163 field1203 = new class163(256);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lsa;")
    private class163 field1226 = new class163(256);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lke;")
    private class95 field1204;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lke;")
    private class95 field1225;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lsg;")
    public static class169 field1208 = class165.method1060("l", 1536);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[Lvg;")
    public static class196[] field1213 = new class196[2048];

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lsg;")
    public static class169 field1217 = class165.method1060("mn", 1536);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lsg;")
    public static class169 field1221 = class165.method1060("Spieler", 1536);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lsg;")
    public static class169 field1218 = class165.method1060(": ", 1536);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lsg;")
    public static class169 field1215 = class165.method1060(")3runescape)3com", 1536);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lbg;")
    public static class18 field1224;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lke;")
    public static class95 field1210;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method406(int arg0) {
        field1224 = null;
        field1218 = null;
        field1210 = null;
        field1215 = null;
        if (arg0 != -29176) {
            method411(-125, 105, 51, 63);
        }
        field1208 = null;
        field1217 = null;
        field1213 = null;
        field1221 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z[II)Ljb;")
    public final class83 method407(boolean arg0, int[] arg1, int arg2) {
        field1212++;
        if (arg0) {
            field1219 = 15;
        }
        if (this.field1204.method554(-26436) == 1) {
            return this.method408(65523, arg2, arg1, 0);
        } else if (this.field1204.method570((byte) 113, arg2) == 1) {
            return this.method408(65523, 0, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[II)Ljb;")
    private final class83 method408(int arg0, int arg1, int[] arg2, int arg3) {
        field1220++;
        int var5 = arg1 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF8);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class83 var9 = (class83) this.field1226.method1045(var7, (byte) -77);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class84 var10 = (class84) this.field1203.method1045(var7, (byte) -77);
            if (var10 == null) {
                var10 = class84.method507(this.field1204, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1203.method1044(var7, true, var10);
            }
            class83 var11 = var10.method502(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg0 != 65523) {
                field1213 = null;
            }
            var10.method1213(9104);
            this.field1226.method1044(var7, true, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lke;IIZII)V")
    public static final void method409(class95 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class115.field2133 = 10000;
        if (arg2 != -20801) {
            field1219 = -110;
        }
        field1214++;
        class201.field3927 = 1;
        class137.field2559 = arg3;
        class46.field860 = arg5;
        class81.field1494 = arg1;
        class3.field71 = arg0;
        field1222 = arg4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI[I)Ljb;")
    public final class83 method410(byte arg0, int arg1, int[] arg2) {
        field1207++;
        if (arg0 != -75) {
            field1222 = 122;
        }
        if (this.field1225.method554(-26436) == 1) {
            return this.method412(arg2, 0, arg1, -2);
        } else if (this.field1225.method570((byte) 113, arg1) == 1) {
            return this.method412(arg2, arg1, 0, arg0 ^ 0x4B);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lih;")
    public static final class80 method411(int arg0, int arg1, int arg2, int arg3) {
        field1227++;
        class80 var4 = new class80();
        var4.field1475 = arg1;
        var4.field1480 = arg0;
        class202.field3948.method1044((long) arg3, true, var4);
        class193.method1275(arg1, (byte) -113);
        class185.method1230(arg1, (byte) 7);
        class150 var5 = class62.method385((byte) 41, arg3);
        if (var5 != null) {
            class64.method404(99, var5);
        }
        if (class55.field999 != null) {
            class64.method404(116, class55.field999);
            class55.field999 = null;
        }
        class20.field436 = 0;
        class189.field3707 = false;
        class5.method35(class178.field3475, class73.field1388, true, class19.field422, class167.field3217);
        if (arg2 != -11368) {
            method414(-23, -46);
        }
        if (class106.field1943 != -1) {
            class200.method1310(class106.field1943, -7102, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIII)Ljb;")
    private final class83 method412(int[] arg0, int arg1, int arg2, int arg3) {
        field1216++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF3 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        if (arg3 != -2) {
            this.method407(false, null, 24);
        }
        long var7 = (long) var6;
        class83 var9 = (class83) this.field1226.method1045(var7, (byte) -77);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class166 var10 = class166.method1066(this.field1225, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class83 var11 = var10.method1064();
            this.field1226.method1044(var7, true, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field1521.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIII)Lsg;")
    public static final class169 method413(byte[] arg0, int arg1, int arg2, int arg3) {
        field1206++;
        class169 var4 = new class169();
        var4.field3253 = arg2;
        var4.field3248 = new byte[arg3];
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field3248[var4.field3253++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public static final void method414(int arg0, int arg1) {
        if (arg0 == -3) {
            class145.method954(class7.field175, 7791, class73.field1369, class115.field2130);
        } else if (arg0 == -2) {
            class145.method954(class7.field178, 7791, class7.field199, class42.field781);
        } else if (arg0 == -1) {
            class145.method954(class7.field211, 7791, class27.field556, class115.field2097);
        } else if (arg0 == 3) {
            class145.method954(class7.field169, arg1 + 7767, class7.field153, class73.field1361);
        } else if (arg0 == 4) {
            class145.method954(class7.field144, arg1 + 7767, class163.field3126, class98.field1835);
        } else if (arg0 == 5) {
            class145.method954(class7.field147, 7791, class90.field1646, class137.field2556);
        } else if (arg0 == 6) {
            class145.method954(class7.field194, 7791, class188.field3656, class8.field229);
        } else if (arg0 == 7) {
            class145.method954(class7.field210, 7791, class132.field2451, class22.field482);
        } else if (arg0 == 8) {
            class145.method954(class7.field170, 7791, class62.field1148, class205.field4025);
        } else if (arg0 == 9) {
            class145.method954(class7.field186, arg1 ^ 0x1E77, class156.field3001, class99.field1854);
        } else if (arg0 == 10) {
            class145.method954(class7.field150, 7791, class62.field1142, class11.field274);
        } else if (arg0 == 11) {
            class145.method954(class7.field200, 7791, class195.field3837, class63.field1162);
        } else if (arg0 == 12) {
            class145.method954(class7.field206, arg1 ^ 0x1E77, class176.field3453, class8.field218);
        } else if (arg0 == 13) {
            class145.method954(class7.field191, 7791, class127.field2373, class115.field2127);
        } else if (arg0 == 14) {
            class145.method954(class7.field177, arg1 + 7767, class155.field2982, class56.field1039);
        } else if (arg0 == 16) {
            class145.method954(class7.field166, 7791, class58.field1094, class145.field2697);
        } else if (arg0 == 17) {
            class145.method954(class7.field207, arg1 + 7767, class174.field3367, class135.field2528);
        } else if (arg0 == 18) {
            class145.method954(class7.field172, arg1 ^ 0x1E77, class3.field76, class104.field1904);
        } else if (arg0 == 19) {
            class145.method954(class22.field466, arg1 ^ 0x1E77, class104.field1906, class75.field1420);
        } else if (arg0 == 20) {
            class145.method954(class7.field158, 7791, class145.field2700, class115.field2095);
        } else if (arg0 == 22) {
            class145.method954(class7.field135, arg1 ^ 0x1E77, class121.field2227, class41.field775);
        } else if (arg0 == 23) {
            class145.method954(class7.field180, 7791, class42.field780, class56.field1041);
        } else if (arg0 == 24) {
            class145.method954(class7.field151, 7791, class98.field1844, class4.field94);
        } else if (arg0 == 25) {
            class145.method954(class7.field157, 7791, class138.field2571, class115.field2107);
        } else if (arg0 == 26) {
            class145.method954(class7.field163, 7791, class89.field1628, class94.field1762);
        } else if (arg0 == 27) {
            class145.method954(class7.field209, 7791, class7.field171, class132.field2454);
        } else {
            class145.method954(class7.field165, arg1 + 7767, class122.field2242, class115.field2134);
        }
        if (arg1 != 24) {
            method413(null, 55, -82, 62);
        }
        field1223++;
        class140.method933((byte) 126, 10);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lke;Lke;)V")
    public class65(class95 arg0, class95 arg1) {
        this.field1204 = arg1;
        this.field1225 = arg0;
    }
}
