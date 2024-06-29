import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class562 {

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public int field8201;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "[B")
    private byte[] field8196;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8210 = new String[] { method4210(method4209("O\u000b?|h\u000b")), method4210(method4209("XFp|W")), method4210(method4209("O\u000b?|k\u000b")), method4210(method4209("M\u001d2>")), method4210(method4209("O\u000b?|\u0016J\u00067&\u0014\u000b")) };

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Lsb;")
    public static class261 field8207 = new class261(55, 6);

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public int field8193;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public int field8205;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public int field8208;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "Lcs;")
    public class110 field8199;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "[I")
    public int[] field8191;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "[I")
    public int[] field8194;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "[I")
    public int[] field8197;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "[I")
    public int[] field8198;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "[I")
    public int[] field8200;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "[I")
    public int[] field8203;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "[Lcs;")
    public class110[] field8204;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "[[B")
    public byte[][] field8206;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "[[I")
    public int[][] field8192;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "[[I")
    public int[][] field8195;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
    public static void method4207(boolean arg0) {
        try {
            field8207 = null;
            if (arg0) {
                field8209 = 5;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8210[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "([BI[B)V")
    public class562(byte[] arg0, int arg1, byte[] arg2) {
        try {
            this.field8201 = class651.method4737(arg0, true, arg0.length);
            if (this.field8201 != arg1) {
                throw new RuntimeException();
            }
            if (arg2 != null) {
                if (arg2.length != 64) {
                    throw new RuntimeException();
                }
                this.field8196 = class204.method1750(arg0.length, 0, arg0, 17887);
                for (int var4 = 0; var4 < 64; var4++) {
                    if (this.field8196[var4] != arg2[var4]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.method4208((byte) 75, arg0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8210[4] + (arg0 == null ? field8210[3] : field8210[1]) + ',' + arg1 + ',' + (arg2 == null ? field8210[3] : field8210[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B[B)V")
    private final void method4208(byte arg0, byte[] arg1) {
        try {
            field8202++;
            class711 var3 = new class711(class71.method746(-87, arg1));
            int var4 = var3.method5128(0);
            if (var4 < 5 || var4 > 6) {
                throw new RuntimeException();
            }
            if (var4 < 6) {
                this.field8208 = 0;
            } else {
                this.field8208 = var3.method5113(18443);
            }
            int var5 = var3.method5128(0);
            boolean var6 = (var5 & 0x1) != 0;
            boolean var7 = (var5 & 0x2) != 0;
            this.field8205 = var3.method5116((byte) -112);
            int var8 = 0;
            this.field8197 = new int[this.field8205];
            int var9 = -1;
            for (int var10 = 0; var10 < this.field8205; var10++) {
                this.field8197[var10] = var8 += var3.method5116((byte) -121);
                if (var9 < this.field8197[var10]) {
                    var9 = this.field8197[var10];
                }
            }
            this.field8193 = var9 + 1;
            this.field8194 = new int[this.field8193];
            this.field8200 = new int[this.field8193];
            if (var7) {
                this.field8206 = new byte[this.field8193][];
            }
            this.field8191 = new int[this.field8193];
            this.field8192 = new int[this.field8193][];
            this.field8203 = new int[this.field8193];
            if (var6) {
                this.field8198 = new int[this.field8193];
                for (int var11 = 0; var11 < this.field8193; var11++) {
                    this.field8198[var11] = -1;
                }
                for (int var12 = 0; var12 < this.field8205; var12++) {
                    this.field8198[this.field8197[var12]] = var3.method5113(18443);
                }
                this.field8199 = new class110(this.field8198);
            }
            for (int var13 = 0; var13 < this.field8205; var13++) {
                this.field8203[this.field8197[var13]] = var3.method5113(18443);
            }
            if (var7) {
                for (int var14 = 0; var14 < this.field8205; var14++) {
                    byte[] var15 = new byte[64];
                    var3.method5117(64, 0, var15, -120);
                    this.field8206[this.field8197[var14]] = var15;
                }
            }
            for (int var16 = 0; var16 < this.field8205; var16++) {
                this.field8194[this.field8197[var16]] = var3.method5113(18443);
            }
            if (arg0 > 45) {
                for (int var17 = 0; var17 < this.field8205; var17++) {
                    this.field8200[this.field8197[var17]] = var3.method5116((byte) -128);
                }
                for (int var18 = 0; var18 < this.field8205; var18++) {
                    int var19 = this.field8197[var18];
                    int var20 = 0;
                    int var21 = this.field8200[var19];
                    this.field8192[var19] = new int[var21];
                    int var22 = -1;
                    for (int var23 = 0; var23 < var21; var23++) {
                        int var24 = this.field8192[var19][var23] = var20 += var3.method5116((byte) -109);
                        if (var24 > var22) {
                            var22 = var24;
                        }
                    }
                    this.field8191[var19] = var22 + 1;
                    if (var21 == (var22 + 1)) {
                        this.field8192[var19] = null;
                    }
                }
                if (var6) {
                    this.field8195 = new int[var9 + 1][];
                    this.field8204 = new class110[var9 + 1];
                    for (int var25 = 0; var25 < this.field8205; var25++) {
                        int var26 = this.field8197[var25];
                        int var27 = this.field8200[var26];
                        this.field8195[var26] = new int[this.field8191[var26]];
                        for (int var28 = 0; var28 < this.field8191[var26]; var28++) {
                            this.field8195[var26][var28] = -1;
                        }
                        for (int var29 = 0; var29 < var27; var29++) {
                            int var30;
                            if (this.field8192[var26] == null) {
                                var30 = var29;
                            } else {
                                var30 = this.field8192[var26][var29];
                            }
                            this.field8195[var26][var30] = var3.method5113(18443);
                        }
                        this.field8204[var26] = new class110(this.field8195[var26]);
                    }
                }
            }
        } catch (RuntimeException var32) {
            throw class665.method4799(var32, field8210[2] + arg0 + ',' + (arg1 == null ? field8210[3] : field8210[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4209(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4210(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
