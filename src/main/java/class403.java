import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class403 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
    private int[] field6005 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6019 = new String[] { method3169(method3168("\r-\"\t")), method3169(method3168("\u0018v`Kt")), method3169(method3168("\u00162`-!")), method3169(method3168("\u00162` !")), method3169(method3168("\u00162`'!")), method3169(method3168("\u00162`\"!")), method3169(method3168("\u00162`&!")), method3169(method3168("\u00162`$!")), method3169(method3168("\u00162`!!")), method3169(method3168("\u00162`#!")) };

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[[S")
    private static short[][] field6000 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "[[S")
    private static short[][] field6001 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[[S")
    private static short[][] field6006 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[[[S")
    public static short[][][] field6009 = new short[][][] { field6000, field6001, field6006 };

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
    public static int[] field6014 = new int[128];

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lef;")
    public static class513 field6017;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lsn;")
    public class656 field6012;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[I")
    private int[] field6003;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[S")
    private short[] field5999;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "[S")
    private short[] field6010;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "[S")
    private short[] field6011;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "[S")
    private short[] field6013;

    static {
        for (int var0 = 0; var0 < field6014.length; var0++) {
            field6014[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field6014[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field6014[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field6014[var3] = var3 + 52 - 48;
        }
        field6014[42] = field6014[43] = 62;
        field6014[45] = field6014[47] = 63;
        field6017 = new class513();
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 6)
    public static void method3160(byte arg0) {
        try {
            field6009 = null;
            if (arg0 > 46) {
                field6001 = null;
                field6006 = null;
                field6000 = null;
                field6014 = null;
                field6017 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6019[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Z", line = 21)
    public final boolean method3161(boolean arg0) {
        try {
            field6018++;
            if (this.field6003 == null) {
                return true;
            }
            if (arg0) {
                this.method3164(-96);
            }
            boolean var2 = true;
            class476 var3 = this.field6012.field9475;
            synchronized (this.field6012.field9475) {
                for (int var4 = 0; var4 < this.field6003.length; var4++) {
                    if (!this.field6012.field9475.method3621(0, -127, this.field6003[var4])) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6019[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Z", line = 49)
    public final boolean method3162(int arg0) {
        try {
            field6016++;
            boolean var2 = true;
            class476 var3 = this.field6012.field9475;
            synchronized (this.field6012.field9475) {
                if (arg0 > -78) {
                    field6006 = null;
                }
                for (int var4 = 0; var4 < 5; var4++) {
                    if (this.field6005[var4] != -1 && !this.field6012.field9475.method3621(0, -120, this.field6005[var4])) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6019[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lib;B)V", line = 79)
    public final void method3163(class163 arg0, byte arg1) {
        try {
            field6002++;
            if (arg1 < 11) {
                field6009 = null;
            }
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    return;
                }
                this.method3165(var3, 9162, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6019[4] + (arg0 == null ? field6019[0] : field6019[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lju;", line = 105)
    public final class137 method3164(int arg0) {
        try {
            field6008++;
            class137[] var2 = new class137[5];
            int var3 = 0;
            class476 var4 = this.field6012.field9475;
            synchronized (this.field6012.field9475) {
                if (arg0 > -83) {
                    this.method3163(null, (byte) 45);
                }
                for (int var5 = 0; var5 < 5; var5++) {
                    if (this.field6005[var5] != -1) {
                        var2[var3++] = class772.method5596(0, 25329, this.field6012.field9475, this.field6005[var5]);
                    }
                }
            }
            for (int var6 = 0; var6 < 5; var6++) {
                if (var2[var6] != null && var2[var6].field1627 < 13) {
                    var2[var6].method1163(2, -1041);
                }
            }
            class137 var7 = new class137(var2, var3);
            if (this.field5999 != null) {
                for (int var8 = 0; var8 < this.field5999.length; var8++) {
                    var7.method1174(24133, this.field6013[var8], this.field5999[var8]);
                }
            }
            if (this.field6011 != null) {
                for (int var9 = 0; var9 < this.field6011.length; var9++) {
                    var7.method1165(this.field6011[var9], this.field6010[var9], (byte) 127);
                }
            }
            return var7;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6019[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILib;)V", line = 200)
    private final void method3165(int arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 9162) {
                this.field6013 = null;
            }
            if (arg0 == 1) {
                arg2.method1455((byte) 62);
            } else if (arg0 == 2) {
                int var4 = arg2.method1455((byte) 62);
                this.field6003 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6003[var5] = arg2.method1445((byte) 115);
                }
            } else if (arg0 != 3) {
                if (arg0 == 40) {
                    int var6 = arg2.method1455((byte) 62);
                    this.field5999 = new short[var6];
                    this.field6013 = new short[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field5999[var7] = (short) arg2.method1445((byte) 109);
                        this.field6013[var7] = (short) arg2.method1445((byte) 118);
                    }
                } else if (arg0 == 41) {
                    int var8 = arg2.method1455((byte) 62);
                    this.field6011 = new short[var8];
                    this.field6010 = new short[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field6011[var9] = (short) arg2.method1445((byte) 121);
                        this.field6010[var9] = (short) arg2.method1445((byte) 124);
                    }
                } else if (arg0 >= 60 && arg0 < 70) {
                    this.field6005[arg0 - 60] = arg2.method1445((byte) 101);
                }
            }
            field6004++;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6019[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6019[0] : field6019[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lju;", line = 321)
    public final class137 method3166(byte arg0) {
        try {
            field6015++;
            if (this.field6003 == null) {
                return null;
            }
            class137[] var2 = new class137[this.field6003.length];
            class476 var3 = this.field6012.field9475;
            synchronized (this.field6012.field9475) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field6003.length) {
                        break;
                    }
                    var2[var4] = class772.method5596(0, 25329, this.field6012.field9475, this.field6003[var4]);
                    var4++;
                }
            }
            int var5 = 0;
            int var6 = -36 / ((-arg0 - 14) / 52);
            while (this.field6003.length > var5) {
                if (var2[var5].field1627 < 13) {
                    var2[var5].method1163(2, -1041);
                }
                var5++;
            }
            class137 var7;
            if (var2.length == 1) {
                var7 = var2[0];
            } else {
                var7 = new class137(var2, var2.length);
            }
            if (var7 == null) {
                return null;
            }
            if (this.field5999 != null) {
                for (int var8 = 0; var8 < this.field5999.length; var8++) {
                    var7.method1174(24133, this.field6013[var8], this.field5999[var8]);
                }
            }
            if (this.field6011 != null) {
                for (int var9 = 0; var9 < this.field6011.length; var9++) {
                    var7.method1165(this.field6011[var9], this.field6010[var9], (byte) 116);
                }
            }
            return var7;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6019[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lffa;IIIIB)Lgda;", line = 398)
    public static final class61 method3167(class197 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        try {
            if (arg5 != 69) {
                method3167(null, -10, -126, -78, 64, (byte) -116);
            }
            field6007++;
            if (arg0.field2956 || class40.method269(arg3, arg5 ^ 0x1A) && class40.method269(arg2, arg5 ^ 0x3F)) {
                return new class61(arg0, 3553, arg4, arg1, arg3, arg2, true);
            } else if (arg0.field2964) {
                return new class61(arg0, 34037, arg4, arg1, arg3, arg2, true);
            } else {
                return new class61(arg0, arg4, arg1, arg3, arg2, class12.method83((byte) -1, arg3), class12.method83((byte) -1, arg2), true);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6019[5] + (arg0 == null ? field6019[0] : field6019[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3168(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3169(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
