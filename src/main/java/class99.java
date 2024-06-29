import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class99 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lqd;")
    public class261 field1247;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    public int[] field1246;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    public int[] field1248;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    public int[] field1249;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[I")
    public int[] field1256;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
    public int[] field1257;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[Lqd;")
    public class261[] field1252;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[[I")
    public int[][] field1243;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[[I")
    public int[][] field1253;

    static {
        new class349((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvq;I)V", line = 10)
    public static final void method578(class269 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (class19.field253) {
            class420.method2643(arg0, false);
        } else {
            class413.method2608((byte) 69, arg0);
        }
        field1244++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B[B)V", line = 37)
    private final void method579(byte arg0, byte[] arg1) {
        field1245++;
        class130 var3 = new class130(class316.method2106(-1, arg1));
        int var4 = var3.method837(true);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1258 = var3.method815(true);
        } else {
            this.field1258 = 0;
        }
        int var5 = var3.method837(true);
        this.field1251 = var3.method798(false);
        int var6 = 0;
        int var7 = -1;
        this.field1256 = new int[this.field1251];
        for (int var8 = 0; var8 < this.field1251; var8++) {
            this.field1256[var8] = var6 += var3.method798(false);
            if (var7 < this.field1256[var8]) {
                var7 = this.field1256[var8];
            }
        }
        this.field1255 = var7 + 1;
        this.field1253 = new int[this.field1255][];
        this.field1248 = new int[this.field1255];
        this.field1254 = new int[this.field1255];
        this.field1246 = new int[this.field1255];
        this.field1257 = new int[this.field1255];
        if (var5 != 0) {
            this.field1249 = new int[this.field1255];
            for (int var9 = 0; var9 < this.field1255; var9++) {
                this.field1249[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1251; var10++) {
                this.field1249[this.field1256[var10]] = var3.method815(true);
            }
            this.field1247 = new class261(this.field1249);
        }
        for (int var11 = 0; var11 < this.field1251; var11++) {
            this.field1246[this.field1256[var11]] = var3.method815(true);
        }
        for (int var12 = 0; var12 < this.field1251; var12++) {
            this.field1248[this.field1256[var12]] = var3.method815(true);
        }
        for (int var13 = 0; var13 < this.field1251; var13++) {
            this.field1254[this.field1256[var13]] = var3.method798(false);
        }
        if (arg0 >= -110) {
            this.method579((byte) -90, (byte[]) null);
        }
        for (int var14 = 0; var14 < this.field1251; var14++) {
            int var21 = this.field1256[var14];
            int var22 = this.field1254[var21];
            int var23 = 0;
            int var24 = -1;
            this.field1253[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field1253[var21][var25] = var23 += var3.method798(false);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1257[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field1253[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1252 = new class261[var7 + 1];
        this.field1243 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1251; var15++) {
            int var16 = this.field1256[var15];
            int var17 = this.field1254[var16];
            this.field1243[var16] = new int[this.field1257[var16]];
            for (int var18 = 0; var18 < this.field1257[var16]; var18++) {
                this.field1243[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1253[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1253[var16][var19];
                }
                this.field1243[var16][var20] = var3.method815(true);
            }
            this.field1252[var16] = new class261(this.field1243[var16]);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([BI)V", line = 209)
    public class99(byte[] arg0, int arg1) {
        this.field1250 = class341.method2241(0, arg0.length, arg0);
        if (this.field1250 != arg1) {
            throw new RuntimeException();
        }
        this.method579((byte) -125, arg0);
    }
}
