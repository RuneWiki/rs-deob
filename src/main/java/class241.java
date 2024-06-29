import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class241 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lla;")
    public static class319 field3382 = new class319(3, -2);

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[I")
    public static int[] field3394 = new int[200];

    @OriginalMember(owner = "client!km", name = "u", descriptor = "[Lwk;")
    public static class96[] field3398 = new class96[2048];

    @OriginalMember(owner = "client!km", name = "s", descriptor = "F")
    public static float field3396;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Ltc;")
    public class239 field3395;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[I")
    public int[] field3378;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[I")
    public int[] field3380;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    public int[] field3386;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
    public int[] field3389;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
    public int[] field3390;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[I")
    public int[] field3391;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[Ltc;")
    public class239[] field3381;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[[I")
    public int[][] field3385;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[[I")
    public int[][] field3397;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(CI)Z")
    public static final boolean method1584(char arg0, int arg1) {
        field3387++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg1 <= 39) {
            method1585((byte) 22);
        }
        if (arg0 != '\u0000') {
            char[] var2 = class513.field7546;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method1585(byte arg0) {
        int var1 = -96 / ((-arg0 - 24) / 57);
        field3394 = null;
        field3398 = null;
        field3382 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BI)V")
    private final void method1586(byte[] arg0, int arg1) {
        field3383++;
        class164 var3 = new class164(class221.method1492(arg1 ^ 0xFFFFFF92, arg0));
        int var4 = var3.method1087(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3393 = var3.method1099(125);
        } else {
            this.field3393 = 0;
        }
        int var5 = var3.method1087(false);
        this.field3392 = var3.method1074(arg1 ^ 0xDA179360);
        int var6 = arg1;
        int var7 = -1;
        this.field3390 = new int[this.field3392];
        for (int var8 = 0; var8 < this.field3392; var8++) {
            this.field3390[var8] = var6 += var3.method1074(-635989152);
            if (var7 < this.field3390[var8]) {
                var7 = this.field3390[var8];
            }
        }
        this.field3388 = var7 + 1;
        this.field3386 = new int[this.field3388];
        this.field3391 = new int[this.field3388];
        this.field3380 = new int[this.field3388];
        this.field3378 = new int[this.field3388];
        this.field3397 = new int[this.field3388][];
        if (var5 != 0) {
            this.field3389 = new int[this.field3388];
            for (int var9 = 0; var9 < this.field3388; var9++) {
                this.field3389[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3392; var10++) {
                this.field3389[this.field3390[var10]] = var3.method1099(-112);
            }
            this.field3395 = new class239(this.field3389);
        }
        for (int var11 = 0; var11 < this.field3392; var11++) {
            this.field3380[this.field3390[var11]] = var3.method1099(arg1 + 92);
        }
        for (int var12 = 0; var12 < this.field3392; var12++) {
            this.field3391[this.field3390[var12]] = var3.method1099(48);
        }
        for (int var13 = 0; var13 < this.field3392; var13++) {
            this.field3386[this.field3390[var13]] = var3.method1074(-635989152);
        }
        for (int var14 = 0; var14 < this.field3392; var14++) {
            int var21 = this.field3390[var14];
            int var22 = 0;
            int var23 = this.field3386[var21];
            this.field3397[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3397[var21][var25] = var22 += var3.method1074(-635989152);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3378[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3397[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3381 = new class239[var7 + 1];
        this.field3385 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3392; var15++) {
            int var16 = this.field3390[var15];
            int var17 = this.field3386[var16];
            this.field3385[var16] = new int[this.field3378[var16]];
            for (int var18 = 0; var18 < this.field3378[var16]; var18++) {
                this.field3385[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3397[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3397[var16][var19];
                }
                this.field3385[var16][var20] = var3.method1099(84);
            }
            this.field3381[var16] = new class239(this.field3385[var16]);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static final void method1587(byte arg0) {
        field3384++;
        class456.field6845.method829(((float) class203.field2716.field1166 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 == 64) {
            class456.field6845.method759(class1.field7, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class456.field6845.method760(class27.field385, -1, 256);
            class456.field6845.method799(class230.field3296);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([BI)V")
    public class241(byte[] arg0, int arg1) {
        this.field3379 = class408.method2520(8679, arg0.length, arg0);
        if (this.field3379 != arg1) {
            throw new RuntimeException();
        }
        this.method1586(arg0, 0);
    }

    static {
        new class508("", 76);
    }
}
