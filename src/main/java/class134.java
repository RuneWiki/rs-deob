import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class134 {

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lsf;")
    public static class108 field2312 = class140.method973(255, "vert:");

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static volatile int field2315 = 0;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lsf;")
    public static class108 field2311 = class140.method973(255, "");

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lsf;")
    public static class108 field2302 = class140.method973(255, "Hierhin drehen");

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[[[I")
    public static int[][][] field2325 = new int[4][13][13];

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lnk;")
    public class13 field2313;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
    public int[] field2305;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "[I")
    public int[] field2307;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
    public int[] field2308;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[I")
    public int[] field2309;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[I")
    public int[] field2320;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
    public int[] field2323;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[Lnk;")
    public class13[] field2322;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[[I")
    public int[][] field2310;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[[I")
    public int[][] field2318;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I", line = 9)
    public static final int method917(byte arg0, int arg1) {
        if (arg0 >= -31) {
            return 40;
        } else {
            field2324++;
            return (arg1 & 0x3FC77) >> 11;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 21)
    public static void method918(boolean arg0) {
        field2311 = null;
        field2302 = null;
        field2325 = (int[][][]) null;
        field2312 = null;
        if (arg0) {
            field2311 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 40)
    public static final void method919(int arg0) {
        class211.field3766 = -3;
        field2303++;
        class96.field1556 = 0;
        class68.field1056 = false;
        class261.field4602 = 0;
        class166.field2988 = 1;
        class317.field5447 = 0;
        class183.field3365 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[B)V", line = 70)
    private final void method920(byte arg0, byte[] arg1) {
        class249 var3 = new class249(class79.method517(13456, arg1));
        field2304++;
        int var4 = var3.method1731(true);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2321 = 0;
        } else {
            this.field2321 = var3.method1738(-1756395344);
        }
        int var5 = 12 / ((-arg0 - 31) / 53);
        int var6 = 0;
        int var7 = var3.method1731(true);
        this.field2316 = var3.method1712(-1);
        this.field2307 = new int[this.field2316];
        int var8 = -1;
        for (int var9 = 0; var9 < this.field2316; var9++) {
            this.field2307[var9] = var6 += var3.method1712(-1);
            if (var8 < this.field2307[var9]) {
                var8 = this.field2307[var9];
            }
        }
        this.field2306 = var8 + 1;
        this.field2318 = new int[this.field2306][];
        this.field2305 = new int[this.field2306];
        this.field2323 = new int[this.field2306];
        this.field2309 = new int[this.field2306];
        this.field2308 = new int[this.field2306];
        if (var7 != 0) {
            this.field2320 = new int[this.field2306];
            for (int var10 = 0; var10 < this.field2306; var10++) {
                this.field2320[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field2316; var11++) {
                this.field2320[this.field2307[var11]] = var3.method1738(-1756395344);
            }
            this.field2313 = new class13(this.field2320);
        }
        for (int var12 = 0; var12 < this.field2316; var12++) {
            this.field2309[this.field2307[var12]] = var3.method1738(-1756395344);
        }
        for (int var13 = 0; var13 < this.field2316; var13++) {
            this.field2308[this.field2307[var13]] = var3.method1738(-1756395344);
        }
        for (int var14 = 0; var14 < this.field2316; var14++) {
            this.field2305[this.field2307[var14]] = var3.method1712(-1);
        }
        for (int var15 = 0; var15 < this.field2316; var15++) {
            int var16 = 0;
            int var17 = this.field2307[var15];
            int var18 = -1;
            int var19 = this.field2305[var17];
            this.field2318[var17] = new int[var19];
            for (int var20 = 0; var20 < var19; var20++) {
                int var21 = this.field2318[var17][var20] = var16 += var3.method1712(-1);
                if (var21 > var18) {
                    var18 = var21;
                }
            }
            this.field2323[var17] = var18 + 1;
            if ((var18 + 1) == var19) {
                this.field2318[var17] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field2322 = new class13[var8 + 1];
        this.field2310 = new int[var8 + 1][];
        for (int var22 = 0; var22 < this.field2316; var22++) {
            int var23 = this.field2307[var22];
            int var24 = this.field2305[var23];
            this.field2310[var23] = new int[this.field2323[var23]];
            for (int var25 = 0; var25 < this.field2323[var23]; var25++) {
                this.field2310[var23][var25] = -1;
            }
            for (int var26 = 0; var26 < var24; var26++) {
                int var27;
                if (this.field2318[var23] == null) {
                    var27 = var26;
                } else {
                    var27 = this.field2318[var23][var26];
                }
                this.field2310[var23][var27] = var3.method1738(-1756395344);
            }
            this.field2322[var23] = new class13(this.field2310[var23]);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILik;IIZI)V", line = 241)
    public static final void method921(int arg0, class262 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class269.field4724 = arg2;
        class223.field3951 = 10000;
        class1.field23 = arg1;
        class271.field4738 = arg5;
        if (arg3 == -8949) {
            class331.field5655 = arg0;
            class220.field3913 = arg4;
            field2317++;
            class305.field5312 = 1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([BI)V", line = 276)
    public class134(byte[] arg0, int arg1) {
        this.field2319 = class315.method2194(arg0, arg0.length, (byte) -126);
        if (this.field2319 != arg1) {
            throw new RuntimeException();
        }
        this.method920((byte) 85, arg0);
    }
}
