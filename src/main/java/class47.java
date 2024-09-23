import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OMIIKHIV")
public class class47 {

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "I")
    private int field1172 = 128;

    @OriginalMember(owner = "OMIIKHIV", name = "b", descriptor = "I")
    public int field1173 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "c", descriptor = "I")
    public int field1174 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "f", descriptor = "B")
    private byte field1177 = 6;

    @OriginalMember(owner = "OMIIKHIV", name = "g", descriptor = "I")
    private int field1178 = 128;

    @OriginalMember(owner = "OMIIKHIV", name = "i", descriptor = "I")
    private int field1180 = 22486;

    @OriginalMember(owner = "OMIIKHIV", name = "j", descriptor = "J")
    public long field1181 = -1L;

    @OriginalMember(owner = "OMIIKHIV", name = "k", descriptor = "I")
    public int field1182 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "l", descriptor = "I")
    public int field1183 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "m", descriptor = "I")
    public int field1184 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "o", descriptor = "I")
    public int field1186 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "q", descriptor = "Z")
    public boolean field1188 = false;

    @OriginalMember(owner = "OMIIKHIV", name = "s", descriptor = "B")
    public byte field1190 = 1;

    @OriginalMember(owner = "OMIIKHIV", name = "t", descriptor = "Z")
    public boolean field1191 = true;

    @OriginalMember(owner = "OMIIKHIV", name = "v", descriptor = "I")
    public int field1193 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "w", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "z", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "C", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "F", descriptor = "Z")
    private boolean field1203 = false;

    @OriginalMember(owner = "OMIIKHIV", name = "I", descriptor = "I")
    public int field1206 = 32;

    @OriginalMember(owner = "OMIIKHIV", name = "J", descriptor = "I")
    public int field1207 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "M", descriptor = "Z")
    public boolean field1210 = true;

    @OriginalMember(owner = "OMIIKHIV", name = "O", descriptor = "I")
    public int field1212 = -1;

    @OriginalMember(owner = "OMIIKHIV", name = "L", descriptor = "LLSQNLJTA;")
    public static class42 field1209 = new class42(30, (byte) 17);

    @OriginalMember(owner = "OMIIKHIV", name = "h", descriptor = "I")
    private static int field1179;

    @OriginalMember(owner = "OMIIKHIV", name = "p", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "OMIIKHIV", name = "r", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "OMIIKHIV", name = "A", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "OMIIKHIV", name = "H", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "OMIIKHIV", name = "x", descriptor = "LCFARFRSG;")
    private static class8 field1195;

    @OriginalMember(owner = "OMIIKHIV", name = "y", descriptor = "Lclient;")
    public static client field1196;

    @OriginalMember(owner = "OMIIKHIV", name = "B", descriptor = "Ljava/lang/String;")
    public String field1199;

    @OriginalMember(owner = "OMIIKHIV", name = "N", descriptor = "[B")
    public byte[] field1211;

    @OriginalMember(owner = "OMIIKHIV", name = "d", descriptor = "[I")
    public int[] field1175;

    @OriginalMember(owner = "OMIIKHIV", name = "e", descriptor = "[I")
    private int[] field1176;

    @OriginalMember(owner = "OMIIKHIV", name = "u", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "OMIIKHIV", name = "D", descriptor = "[I")
    private int[] field1201;

    @OriginalMember(owner = "OMIIKHIV", name = "E", descriptor = "[I")
    private static int[] field1202;

    @OriginalMember(owner = "OMIIKHIV", name = "K", descriptor = "[I")
    private int[] field1208;

    @OriginalMember(owner = "OMIIKHIV", name = "n", descriptor = "[LOMIIKHIV;")
    private static class47[] field1185;

    @OriginalMember(owner = "OMIIKHIV", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field1204;

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "(LCFARFRSG;I)V")
    private final void method443(class8 arg0, int arg1) {
        if (this.field1180 != arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method30();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method30();
                    this.field1192 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1192[var5] = arg0.method32();
                    }
                } else if (var3 == 2) {
                    this.field1199 = arg0.method37();
                } else if (var3 == 3) {
                    this.field1211 = arg0.method38((byte) 5);
                } else if (var3 == 12) {
                    this.field1190 = arg0.method31();
                } else if (var3 == 13) {
                    this.field1197 = arg0.method32();
                } else if (var3 == 14) {
                    this.field1186 = arg0.method32();
                } else if (var3 == 17) {
                    this.field1186 = arg0.method32();
                    this.field1212 = arg0.method32();
                    this.field1182 = arg0.method32();
                    this.field1194 = arg0.method32();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1204 == null) {
                        this.field1204 = new String[5];
                    }
                    this.field1204[var3 - 30] = arg0.method37();
                    if (this.field1204[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1204[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method30();
                    this.field1208 = new int[var6];
                    this.field1176 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1208[var7] = arg0.method32();
                        this.field1176[var7] = arg0.method32();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method30();
                    this.field1201 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1201[var9] = arg0.method32();
                    }
                } else if (var3 == 90) {
                    this.field1207 = arg0.method32();
                } else if (var3 == 91) {
                    this.field1184 = arg0.method32();
                } else if (var3 == 92) {
                    this.field1183 = arg0.method32();
                } else if (var3 == 93) {
                    this.field1191 = false;
                } else if (var3 == 95) {
                    this.field1174 = arg0.method32();
                } else if (var3 == 97) {
                    this.field1172 = arg0.method32();
                } else if (var3 == 98) {
                    this.field1178 = arg0.method32();
                } else if (var3 == 99) {
                    this.field1188 = true;
                } else if (var3 == 100) {
                    this.field1198 = arg0.method31();
                } else if (var3 == 101) {
                    this.field1205 = arg0.method31() * 5;
                } else if (var3 == 102) {
                    this.field1193 = arg0.method32();
                } else if (var3 == 103) {
                    this.field1206 = arg0.method32();
                } else if (var3 == 106) {
                    this.field1200 = arg0.method32();
                    if (this.field1200 == 65535) {
                        this.field1200 = -1;
                    }
                    this.field1173 = arg0.method32();
                    if (this.field1173 == 65535) {
                        this.field1173 = -1;
                    }
                    int var10 = arg0.method30();
                    this.field1175 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1175[var11] = arg0.method32();
                        if (this.field1175[var11] == 65535) {
                            this.field1175[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1210 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "(I)LOMIIKHIV;")
    public static final class47 method444(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1185[var1].field1181) {
                return field1185[var1];
            }
        }
        field1179 = (field1179 + 1) % 20;
        class47 var2 = field1185[field1179] = new class47();
        field1195.field72 = field1202[arg0];
        var2.field1181 = arg0;
        var2.method443(field1195, 22486);
        return var2;
    }

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "([IZII)LLFTMDGKK;")
    public final class37 method445(int[] arg0, boolean arg1, int arg2, int arg3) {
        if (this.field1175 != null) {
            class47 var5 = this.method446(223);
            return var5 == null ? null : var5.method445(arg0, true, arg2, arg3);
        }
        class37 var6 = (class37) field1209.method369(this.field1181);
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1192.length; var9++) {
                if (!class37.method342(this.field1192[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class37[] var10 = new class37[this.field1192.length];
            for (int var11 = 0; var11 < this.field1192.length; var11++) {
                var10[var11] = class37.method341(this.field1192[var11], this.field1187);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class37(var10.length, 698, var10);
            }
            if (this.field1208 != null) {
                for (int var12 = 0; var12 < this.field1208.length; var12++) {
                    var6.method355(this.field1208[var12], this.field1176[var12]);
                }
            }
            var6.method348(false);
            var6.method358(this.field1198 + 64, this.field1205 + 850, -30, -50, -30, true);
            field1209.method370(var6, 0, this.field1181);
        }
        class37 var13 = class37.field962;
        var13.method343(var6, class7.method17(arg3, false) & class7.method17(arg2, false), 7);
        if (arg3 != -1 && arg2 != -1) {
            var13.method350(arg0, 460, arg2, arg3);
        } else if (arg3 != -1) {
            var13.method349(arg3, (byte) 89);
        }
        if (this.field1172 != 128 || this.field1178 != 128) {
            var13.method357(5, this.field1178, this.field1172, this.field1172);
        }
        var13.method345(false);
        var13.field999 = null;
        var13.field998 = null;
        if (this.field1190 == 1) {
            var13.field1000 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "OMIIKHIV", name = "b", descriptor = "(I)LOMIIKHIV;")
    public final class47 method446(int arg0) {
        if (arg0 <= 0) {
            this.field1203 = !this.field1203;
        }
        int var2 = -1;
        if (this.field1200 != -1) {
            class13 var3 = class13.field586[this.field1200];
            int var4 = var3.field588;
            int var5 = var3.field589;
            int var6 = var3.field590;
            int var7 = client.field534[var6 - var5];
            var2 = field1196.field414[var4] >> var5 & var7;
        } else if (this.field1173 != -1) {
            var2 = field1196.field414[this.field1173];
        }
        return var2 < 0 || var2 >= this.field1175.length || this.field1175[var2] == -1 ? null : method444(this.field1175[var2]);
    }

    @OriginalMember(owner = "OMIIKHIV", name = "c", descriptor = "(I)Z")
    public boolean method447(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1175 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1200 != -1) {
                class13 var3 = class13.field586[this.field1200];
                int var4 = var3.field588;
                int var5 = var3.field589;
                int var6 = var3.field590;
                int var7 = client.field534[var6 - var5];
                var2 = field1196.field414[var4] >> var5 & var7;
            } else if (this.field1173 != -1) {
                var2 = field1196.field414[this.field1173];
            }
            return var2 >= 0 && var2 < this.field1175.length && this.field1175[var2] != -1;
        }
    }

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "(LVSUYIIVA;)V")
    public static final void method448(class62 arg0) {
        field1195 = new class8(arg0.method570("npc.dat", null), 792);
        class8 var1 = new class8(arg0.method570("npc.idx", null), 792);
        field1189 = var1.method32();
        field1202 = new int[field1189];
        int var2 = 2;
        for (int var3 = 0; var3 < field1189; var3++) {
            field1202[var3] = var2;
            var2 += var1.method32();
        }
        field1185 = new class47[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1185[var4] = new class47();
        }
    }

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "(B)LLFTMDGKK;")
    public final class37 method449(byte arg0) {
        if (this.field1177 != arg0) {
            throw new NullPointerException();
        } else if (this.field1175 != null) {
            class47 var2 = this.method446(223);
            return var2 == null ? null : var2.method449((byte) 6);
        } else if (this.field1201 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1201.length; var4++) {
                if (!class37.method342(this.field1201[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class37[] var5 = new class37[this.field1201.length];
            for (int var6 = 0; var6 < this.field1201.length; var6++) {
                var5[var6] = class37.method341(this.field1201[var6], this.field1187);
            }
            class37 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class37(var5.length, 698, var5);
            }
            if (this.field1208 != null) {
                for (int var8 = 0; var8 < this.field1208.length; var8++) {
                    var7.method355(this.field1208[var8], this.field1176[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "OMIIKHIV", name = "a", descriptor = "(Z)V")
    public static final void method450(boolean arg0) {
        if (arg0) {
            field1209 = null;
            field1202 = null;
            field1185 = null;
            field1195 = null;
        }
    }
}
