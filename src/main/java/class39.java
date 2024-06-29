import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NIJEYEOX")
public class class39 {

    @OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "B")
    public byte field1211 = 1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "c", descriptor = "I")
    public int field1212 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "d", descriptor = "I")
    public int field1213 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "e", descriptor = "I")
    public int field1214 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "f", descriptor = "Ljava/lang/String;")
    public String field1215 = "null";

    @OriginalMember(owner = "client!NIJEYEOX", name = "j", descriptor = "J")
    public long field1219 = -1L;

    @OriginalMember(owner = "client!NIJEYEOX", name = "k", descriptor = "I")
    public int field1220 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "l", descriptor = "I")
    public int field1221 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "m", descriptor = "I")
    public int field1222 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "n", descriptor = "I")
    public int field1223 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "o", descriptor = "I")
    public int field1224 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "q", descriptor = "Z")
    private boolean field1226 = false;

    @OriginalMember(owner = "client!NIJEYEOX", name = "r", descriptor = "I")
    public int field1227 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "u", descriptor = "I")
    public int field1230 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "y", descriptor = "I")
    private int field1234 = 500;

    @OriginalMember(owner = "client!NIJEYEOX", name = "z", descriptor = "I")
    private int field1235 = 128;

    @OriginalMember(owner = "client!NIJEYEOX", name = "A", descriptor = "I")
    public int field1236 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "D", descriptor = "Z")
    public boolean field1239 = true;

    @OriginalMember(owner = "client!NIJEYEOX", name = "E", descriptor = "I")
    private int field1240 = 128;

    @OriginalMember(owner = "client!NIJEYEOX", name = "G", descriptor = "Z")
    private boolean field1242 = true;

    @OriginalMember(owner = "client!NIJEYEOX", name = "H", descriptor = "I")
    private int field1243 = 38776;

    @OriginalMember(owner = "client!NIJEYEOX", name = "I", descriptor = "Z")
    public boolean field1244 = false;

    @OriginalMember(owner = "client!NIJEYEOX", name = "J", descriptor = "I")
    public int field1245 = -1;

    @OriginalMember(owner = "client!NIJEYEOX", name = "K", descriptor = "Z")
    public boolean field1246 = true;

    @OriginalMember(owner = "client!NIJEYEOX", name = "N", descriptor = "I")
    public int field1249 = 32;

    @OriginalMember(owner = "client!NIJEYEOX", name = "C", descriptor = "LQASTZCLF;")
    public static class47 field1238 = new class47(30, false);

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!NIJEYEOX", name = "t", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client!NIJEYEOX", name = "x", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!NIJEYEOX", name = "O", descriptor = "I")
    private static int field1250;

    @OriginalMember(owner = "client!NIJEYEOX", name = "s", descriptor = "LIUVBENCV;")
    private static class25 field1228;

    @OriginalMember(owner = "client!NIJEYEOX", name = "B", descriptor = "Lclient;")
    public static client field1237;

    @OriginalMember(owner = "client!NIJEYEOX", name = "L", descriptor = "[B")
    public byte[] field1247;

    @OriginalMember(owner = "client!NIJEYEOX", name = "i", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "client!NIJEYEOX", name = "p", descriptor = "[I")
    private int[] field1225;

    @OriginalMember(owner = "client!NIJEYEOX", name = "v", descriptor = "[I")
    public int[] field1231;

    @OriginalMember(owner = "client!NIJEYEOX", name = "w", descriptor = "[I")
    private int[] field1232;

    @OriginalMember(owner = "client!NIJEYEOX", name = "F", descriptor = "[I")
    private static int[] field1241;

    @OriginalMember(owner = "client!NIJEYEOX", name = "M", descriptor = "[I")
    private int[] field1248;

    @OriginalMember(owner = "client!NIJEYEOX", name = "h", descriptor = "[LNIJEYEOX;")
    private static class39[] field1217;

    @OriginalMember(owner = "client!NIJEYEOX", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field1216;

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(I)LNIJEYEOX;")
    public final class39 method362(int arg0) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1224 != -1) {
            class13 var3 = class13.field697[this.field1224];
            int var4 = var3.field699;
            int var5 = var3.field700;
            int var6 = var3.field701;
            int var7 = client.field341[var6 - var5];
            var2 = field1237.field167[var4] >> var5 & var7;
        } else if (this.field1213 != -1) {
            var2 = field1237.field167[this.field1213];
        }
        return var2 < 0 || var2 >= this.field1231.length || this.field1231[var2] == -1 ? null : method363(this.field1231[var2]);
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "(I)LNIJEYEOX;")
    public static final class39 method363(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1217[var1].field1219) {
                return field1217[var1];
            }
        }
        field1250 = (field1250 + 1) % 20;
        class39 var2 = field1217[field1250] = new class39();
        field1228.field837 = field1241[arg0];
        var2.field1219 = arg0;
        var2.method367(field1228, (byte) 1);
        return var2;
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(Z)LJJMVUSJJ;")
    public final class29 method364(boolean arg0) {
        if (this.field1231 != null) {
            class39 var2 = this.method362(4);
            return var2 == null ? null : var2.method364(false);
        } else if (this.field1225 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0) {
                this.field1242 = !this.field1242;
            }
            for (int var4 = 0; var4 < this.field1225.length; var4++) {
                if (!class29.method301(this.field1225[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class29[] var5 = new class29[this.field1225.length];
            for (int var6 = 0; var6 < this.field1225.length; var6++) {
                var5[var6] = class29.method300(this.field1225[var6]);
            }
            class29 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class29(var5, var5.length, -41715);
            }
            if (this.field1248 != null) {
                for (int var8 = 0; var8 < this.field1248.length; var8++) {
                    var7.method314(this.field1248[var8], this.field1218[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(LAWEEREDT;)V")
    public static final void method365(class2 arg0) {
        field1228 = new class25(arg0.method14("npc.dat", null), 713);
        class25 var1 = new class25(arg0.method14("npc.idx", null), 713);
        field1233 = var1.method247();
        field1241 = new int[field1233];
        int var2 = 2;
        for (int var3 = 0; var3 < field1233; var3++) {
            field1241[var3] = var2;
            var2 += var1.method247();
        }
        field1217 = new class39[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1217[var4] = new class39();
        }
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "(Z)V")
    public static final void method366(boolean arg0) {
        field1238 = null;
        field1241 = null;
        field1217 = null;
        field1228 = null;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(LIUVBENCV;B)V")
    private final void method367(class25 arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg0.method245();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg0.method245();
                    this.field1232 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1232[var7] = arg0.method247();
                    }
                } else if (var5 == 2) {
                    this.field1215 = arg0.method252();
                } else if (var5 == 3) {
                    this.field1247 = arg0.method253((byte) 85);
                } else if (var5 == 12) {
                    this.field1211 = arg0.method246();
                } else if (var5 == 13) {
                    this.field1220 = arg0.method247();
                } else if (var5 == 14) {
                    this.field1221 = arg0.method247();
                } else if (var5 == 17) {
                    this.field1221 = arg0.method247();
                    this.field1214 = arg0.method247();
                    this.field1227 = arg0.method247();
                    this.field1223 = arg0.method247();
                } else if (var5 >= 30 && var5 < 40) {
                    if (this.field1216 == null) {
                        this.field1216 = new String[5];
                    }
                    this.field1216[var5 - 30] = arg0.method252();
                    if (this.field1216[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field1216[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg0.method245();
                    this.field1248 = new int[var8];
                    this.field1218 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1248[var9] = arg0.method247();
                        this.field1218[var9] = arg0.method247();
                    }
                } else if (var5 == 60) {
                    int var10 = arg0.method245();
                    this.field1225 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field1225[var11] = arg0.method247();
                    }
                } else if (var5 == 90) {
                    this.field1236 = arg0.method247();
                } else if (var5 == 91) {
                    this.field1222 = arg0.method247();
                } else if (var5 == 92) {
                    this.field1212 = arg0.method247();
                } else if (var5 == 93) {
                    this.field1246 = false;
                } else if (var5 == 95) {
                    this.field1245 = arg0.method247();
                } else if (var5 == 97) {
                    this.field1240 = arg0.method247();
                } else if (var5 == 98) {
                    this.field1235 = arg0.method247();
                } else if (var5 == 99) {
                    this.field1244 = true;
                } else if (var5 == 100) {
                    this.field1210 = arg0.method246();
                } else if (var5 == 101) {
                    this.field1229 = arg0.method246() * 5;
                } else if (var5 == 102) {
                    this.field1230 = arg0.method247();
                } else if (var5 == 103) {
                    this.field1249 = arg0.method247();
                } else if (var5 == 106) {
                    this.field1224 = arg0.method247();
                    if (this.field1224 == 65535) {
                        this.field1224 = -1;
                    }
                    this.field1213 = arg0.method247();
                    if (this.field1213 == 65535) {
                        this.field1213 = -1;
                    }
                    int var12 = arg0.method245();
                    this.field1231 = new int[var12 + 1];
                    for (int var13 = 0; var13 <= var12; var13++) {
                        this.field1231[var13] = arg0.method247();
                        if (this.field1231[var13] == 65535) {
                            this.field1231[var13] = -1;
                        }
                    }
                } else if (var5 == 107) {
                    this.field1239 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(III[I)LJJMVUSJJ;")
    public final class29 method368(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 >= 0) {
            this.field1234 = -77;
        }
        if (this.field1231 != null) {
            class39 var5 = this.method362(4);
            return var5 == null ? null : var5.method368(arg0, arg1, -768, arg3);
        }
        class29 var6 = (class29) field1238.method438(this.field1219);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1232.length; var8++) {
                if (!class29.method301(this.field1232[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class29[] var9 = new class29[this.field1232.length];
            for (int var10 = 0; var10 < this.field1232.length; var10++) {
                var9[var10] = class29.method300(this.field1232[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class29(var9, var9.length, -41715);
            }
            if (this.field1248 != null) {
                for (int var11 = 0; var11 < this.field1248.length; var11++) {
                    var6.method314(this.field1248[var11], this.field1218[var11]);
                }
            }
            var6.method307(979);
            var6.method317(this.field1210 + 64, this.field1229 + 850, -30, -50, -30, true);
            field1238.method439(var6, this.field1219, -27210);
        }
        class29 var12 = class29.field917;
        var12.method302(var6, this.field1243, class42.method382(arg0, 4) & class42.method382(arg1, 4));
        if (arg0 != -1 && arg1 != -1) {
            var12.method309(0, arg1, arg3, arg0);
        } else if (arg0 != -1) {
            var12.method308(arg0, 771);
        }
        if (this.field1240 != 128 || this.field1235 != 128) {
            var12.method316(this.field1235, this.field1240, this.field1240, true);
        }
        var12.method304(-810);
        var12.field953 = null;
        var12.field952 = null;
        if (this.field1211 == 1) {
            var12.field954 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!NIJEYEOX", name = "c", descriptor = "(I)Z")
    public boolean method369(int arg0) {
        if (this.field1231 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        if (this.field1224 != -1) {
            class13 var3 = class13.field697[this.field1224];
            int var4 = var3.field699;
            int var5 = var3.field700;
            int var6 = var3.field701;
            int var7 = client.field341[var6 - var5];
            var2 = field1237.field167[var4] >> var5 & var7;
        } else if (this.field1213 != -1) {
            var2 = field1237.field167[this.field1213];
        }
        return var2 >= 0 && var2 < this.field1231.length && this.field1231[var2] != -1;
    }
}
