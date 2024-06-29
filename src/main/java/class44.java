import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PIPBZEOV")
public class class44 {

    @OriginalMember(owner = "client!PIPBZEOV", name = "c", descriptor = "I")
    private int field1209 = -22770;

    @OriginalMember(owner = "client!PIPBZEOV", name = "d", descriptor = "I")
    public int field1210 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "e", descriptor = "I")
    public int field1211 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "f", descriptor = "Z")
    public boolean field1212 = true;

    @OriginalMember(owner = "client!PIPBZEOV", name = "g", descriptor = "I")
    private int field1213 = 128;

    @OriginalMember(owner = "client!PIPBZEOV", name = "k", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "l", descriptor = "I")
    public int field1218 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "m", descriptor = "I")
    private int field1219 = 128;

    @OriginalMember(owner = "client!PIPBZEOV", name = "p", descriptor = "Ljava/lang/String;")
    public String field1222 = "null";

    @OriginalMember(owner = "client!PIPBZEOV", name = "s", descriptor = "Z")
    public boolean field1225 = true;

    @OriginalMember(owner = "client!PIPBZEOV", name = "t", descriptor = "I")
    public int field1226 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "u", descriptor = "J")
    public long field1227 = -1L;

    @OriginalMember(owner = "client!PIPBZEOV", name = "v", descriptor = "Z")
    private boolean field1228 = true;

    @OriginalMember(owner = "client!PIPBZEOV", name = "x", descriptor = "I")
    public int field1230 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "z", descriptor = "I")
    public int field1232 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "A", descriptor = "I")
    public int field1233 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "E", descriptor = "I")
    public int field1237 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "F", descriptor = "B")
    public byte field1238 = 1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "H", descriptor = "I")
    public int field1240 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "I", descriptor = "I")
    public int field1241 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "K", descriptor = "I")
    public int field1243 = -1;

    @OriginalMember(owner = "client!PIPBZEOV", name = "L", descriptor = "Z")
    public boolean field1244 = false;

    @OriginalMember(owner = "client!PIPBZEOV", name = "M", descriptor = "I")
    public int field1245 = 32;

    @OriginalMember(owner = "client!PIPBZEOV", name = "J", descriptor = "LEQSIBNHW;")
    public static class10 field1242 = new class10(30, 451);

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "I")
    private static int field1207;

    @OriginalMember(owner = "client!PIPBZEOV", name = "o", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!PIPBZEOV", name = "C", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!PIPBZEOV", name = "G", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!PIPBZEOV", name = "y", descriptor = "LSVWJKJVI;")
    private static class52 field1231;

    @OriginalMember(owner = "client!PIPBZEOV", name = "w", descriptor = "Lclient;")
    public static client field1229;

    @OriginalMember(owner = "client!PIPBZEOV", name = "b", descriptor = "[B")
    public byte[] field1208;

    @OriginalMember(owner = "client!PIPBZEOV", name = "h", descriptor = "[I")
    private int[] field1214;

    @OriginalMember(owner = "client!PIPBZEOV", name = "j", descriptor = "[I")
    private int[] field1216;

    @OriginalMember(owner = "client!PIPBZEOV", name = "n", descriptor = "[I")
    private int[] field1220;

    @OriginalMember(owner = "client!PIPBZEOV", name = "q", descriptor = "[I")
    private int[] field1223;

    @OriginalMember(owner = "client!PIPBZEOV", name = "r", descriptor = "[I")
    public int[] field1224;

    @OriginalMember(owner = "client!PIPBZEOV", name = "D", descriptor = "[I")
    private static int[] field1236;

    @OriginalMember(owner = "client!PIPBZEOV", name = "i", descriptor = "[LPIPBZEOV;")
    private static class44[] field1215;

    @OriginalMember(owner = "client!PIPBZEOV", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1234;

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(Z)Z")
    public boolean method394(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field1224 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1233 != -1) {
                class12 var3 = class12.field623[this.field1233];
                int var4 = var3.field625;
                int var5 = var3.field626;
                int var6 = var3.field627;
                int var7 = client.field211[var6 - var5];
                var2 = field1229.field197[var4] >> var5 & var7;
            } else if (this.field1240 != -1) {
                var2 = field1229.field197[this.field1240];
            }
            return var2 >= 0 && var2 < this.field1224.length && this.field1224[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(ILSVWJKJVI;)V")
    private final void method395(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method461();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method461();
                    this.field1214 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1214[var6] = arg1.method463();
                    }
                } else if (var4 == 2) {
                    this.field1222 = arg1.method468();
                } else if (var4 == 3) {
                    this.field1208 = arg1.method469(-721);
                } else if (var4 == 12) {
                    this.field1238 = arg1.method462();
                } else if (var4 == 13) {
                    this.field1217 = arg1.method463();
                } else if (var4 == 14) {
                    this.field1218 = arg1.method463();
                } else if (var4 == 17) {
                    this.field1218 = arg1.method463();
                    this.field1241 = arg1.method463();
                    this.field1243 = arg1.method463();
                    this.field1211 = arg1.method463();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1234 == null) {
                        this.field1234 = new String[5];
                    }
                    this.field1234[var4 - 30] = arg1.method468();
                    if (this.field1234[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1234[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method461();
                    this.field1223 = new int[var7];
                    this.field1220 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1223[var8] = arg1.method463();
                        this.field1220[var8] = arg1.method463();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method461();
                    this.field1216 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1216[var10] = arg1.method463();
                    }
                } else if (var4 == 90) {
                    this.field1226 = arg1.method463();
                } else if (var4 == 91) {
                    this.field1210 = arg1.method463();
                } else if (var4 == 92) {
                    this.field1230 = arg1.method463();
                } else if (var4 == 93) {
                    this.field1225 = false;
                } else if (var4 == 95) {
                    this.field1237 = arg1.method463();
                } else if (var4 == 97) {
                    this.field1213 = arg1.method463();
                } else if (var4 == 98) {
                    this.field1219 = arg1.method463();
                } else if (var4 == 99) {
                    this.field1244 = true;
                } else if (var4 == 100) {
                    this.field1239 = arg1.method462();
                } else if (var4 == 101) {
                    this.field1221 = arg1.method462() * 5;
                } else if (var4 == 102) {
                    this.field1232 = arg1.method463();
                } else if (var4 == 103) {
                    this.field1245 = arg1.method463();
                } else if (var4 == 106) {
                    this.field1233 = arg1.method463();
                    if (this.field1233 == 65535) {
                        this.field1233 = -1;
                    }
                    this.field1240 = arg1.method463();
                    if (this.field1240 == 65535) {
                        this.field1240 = -1;
                    }
                    int var11 = arg1.method461();
                    this.field1224 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1224[var12] = arg1.method463();
                        if (this.field1224[var12] == 65535) {
                            this.field1224[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1212 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(LWEMOPWVJ;)V")
    public static final void method396(class62 arg0) {
        field1231 = new class52(arg0.method559("npc.dat", null), true);
        class52 var1 = new class52(arg0.method559("npc.idx", null), true);
        field1235 = var1.method463();
        field1236 = new int[field1235];
        int var2 = 2;
        for (int var3 = 0; var3 < field1235; var3++) {
            field1236[var3] = var2;
            var2 += var1.method463();
        }
        field1215 = new class44[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1215[var4] = new class44();
        }
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(I)LPIPBZEOV;")
    public final class44 method397(int arg0) {
        int var2 = -1;
        if (arg0 < 1 || arg0 > 1) {
            this.field1209 = -138;
        }
        if (this.field1233 != -1) {
            class12 var3 = class12.field623[this.field1233];
            int var4 = var3.field625;
            int var5 = var3.field626;
            int var6 = var3.field627;
            int var7 = client.field211[var6 - var5];
            var2 = field1229.field197[var4] >> var5 & var7;
        } else if (this.field1240 != -1) {
            var2 = field1229.field197[this.field1240];
        }
        return var2 < 0 || var2 >= this.field1224.length || this.field1224[var2] == -1 ? null : method398(this.field1224[var2]);
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "b", descriptor = "(I)LPIPBZEOV;")
    public static final class44 method398(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1215[var1].field1227) {
                return field1215[var1];
            }
        }
        field1207 = (field1207 + 1) % 20;
        class44 var2 = field1215[field1207] = new class44();
        field1231.field1434 = field1236[arg0];
        var2.field1227 = arg0;
        var2.method395(-13096, field1231);
        return var2;
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "c", descriptor = "(I)LIYSWJGDE;")
    public final class19 method399(int arg0) {
        if (this.field1224 != null) {
            class44 var2 = this.method397(1);
            return var2 == null ? null : var2.method399(-491);
        } else if (this.field1216 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 >= 0) {
                this.field1228 = !this.field1228;
            }
            for (int var4 = 0; var4 < this.field1216.length; var4++) {
                if (!class19.method274(this.field1216[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class19[] var5 = new class19[this.field1216.length];
            for (int var6 = 0; var6 < this.field1216.length; var6++) {
                var5[var6] = class19.method273(this.field1216[var6]);
            }
            class19 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class19((byte) 9, var5.length, var5);
            }
            if (this.field1223 != null) {
                for (int var8 = 0; var8 < this.field1223.length; var8++) {
                    var7.method287(this.field1223[var8], this.field1220[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "d", descriptor = "(I)V")
    public static final void method400(int arg0) {
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1242 = null;
        field1236 = null;
        field1215 = null;
        field1231 = null;
    }

    @OriginalMember(owner = "client!PIPBZEOV", name = "a", descriptor = "(I[III)LIYSWJGDE;")
    public final class19 method401(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != -22770) {
            throw new NullPointerException();
        } else if (this.field1224 == null) {
            class19 var6 = (class19) field1242.method175(this.field1227);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < this.field1214.length; var8++) {
                    if (!class19.method274(this.field1214[var8])) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class19[] var9 = new class19[this.field1214.length];
                for (int var10 = 0; var10 < this.field1214.length; var10++) {
                    var9[var10] = class19.method273(this.field1214[var10]);
                }
                if (var9.length == 1) {
                    var6 = var9[0];
                } else {
                    var6 = new class19((byte) 9, var9.length, var9);
                }
                if (this.field1223 != null) {
                    for (int var11 = 0; var11 < this.field1223.length; var11++) {
                        var6.method287(this.field1223[var11], this.field1220[var11]);
                    }
                }
                var6.method280(true);
                var6.method290(this.field1239 + 64, this.field1221 + 850, -30, -50, -30, true);
                field1242.method176(825, this.field1227, var6);
            }
            class19 var12 = class19.field806;
            var12.method275(class45.method406(61, arg2) & class45.method406(61, arg3), 0, var6);
            if (arg2 != -1 && arg3 != -1) {
                var12.method282(arg3, arg2, arg1, (byte) 8);
            } else if (arg2 != -1) {
                var12.method281(true, arg2);
            }
            if (this.field1213 != 128 || this.field1219 != 128) {
                var12.method289(this.field1213, 471, this.field1213, this.field1219);
            }
            var12.method277(-367);
            var12.field842 = null;
            var12.field841 = null;
            if (this.field1238 == 1) {
                var12.field843 = true;
            }
            return var12;
        } else {
            class44 var5 = this.method397(1);
            return var5 == null ? null : var5.method401(this.field1209, arg1, arg2, arg3);
        }
    }
}
