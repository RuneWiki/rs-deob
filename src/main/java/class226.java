import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class226 {

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3550 = new String[500];

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "F")
    public static float field3554 = 128.0F;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lfm;")
    public class210 field3552;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Li;")
    public static class58 field3546;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[I")
    public int[] field3544;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
    public int[] field3549;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[I")
    public int[] field3553;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "[I")
    public int[] field3556;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[I")
    public int[] field3558;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[I")
    public int[] field3561;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "[Lfm;")
    public class210[] field3555;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[[I")
    public int[][] field3545;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[[I")
    public int[][] field3547;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([BB)V")
    private final void method1563(byte[] arg0, byte arg1) {
        field3559++;
        class274 var3 = new class274(class101.method722(99, arg0));
        int var4 = var3.method1849(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3557 = 0;
        } else {
            this.field3557 = var3.method1833((byte) -104);
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method1849(255);
        if (arg1 > -99) {
            this.method1563((byte[]) null, (byte) 60);
        }
        this.field3560 = var3.method1837(252);
        this.field3561 = new int[this.field3560];
        for (int var8 = 0; var8 < this.field3560; var8++) {
            this.field3561[var8] = var5 += var3.method1837(252);
            if (var6 < this.field3561[var8]) {
                var6 = this.field3561[var8];
            }
        }
        this.field3548 = var6 + 1;
        this.field3547 = new int[this.field3548][];
        this.field3556 = new int[this.field3548];
        this.field3544 = new int[this.field3548];
        this.field3553 = new int[this.field3548];
        this.field3549 = new int[this.field3548];
        if (var7 != 0) {
            this.field3558 = new int[this.field3548];
            for (int var9 = 0; var9 < this.field3548; var9++) {
                this.field3558[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3560; var10++) {
                this.field3558[this.field3561[var10]] = var3.method1833((byte) -104);
            }
            this.field3552 = new class210(this.field3558);
        }
        for (int var11 = 0; var11 < this.field3560; var11++) {
            this.field3553[this.field3561[var11]] = var3.method1833((byte) -104);
        }
        for (int var12 = 0; var12 < this.field3560; var12++) {
            this.field3556[this.field3561[var12]] = var3.method1833((byte) -104);
        }
        for (int var13 = 0; var13 < this.field3560; var13++) {
            this.field3544[this.field3561[var13]] = var3.method1837(252);
        }
        for (int var14 = 0; var14 < this.field3560; var14++) {
            int var21 = 0;
            int var22 = this.field3561[var14];
            int var23 = this.field3544[var22];
            this.field3547[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3547[var22][var25] = var21 += var3.method1837(252);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field3549[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field3547[var22] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field3545 = new int[var6 + 1][];
        this.field3555 = new class210[var6 + 1];
        for (int var15 = 0; var15 < this.field3560; var15++) {
            int var16 = this.field3561[var15];
            int var17 = this.field3544[var16];
            this.field3545[var16] = new int[this.field3549[var16]];
            for (int var18 = 0; var18 < this.field3549[var16]; var18++) {
                this.field3545[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3547[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3547[var16][var19];
                }
                this.field3545[var16][var20] = var3.method1833((byte) -104);
            }
            this.field3555[var16] = new class210(this.field3545[var16]);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static void method1564(byte arg0) {
        field3546 = null;
        field3550 = null;
        if (arg0 < 99) {
            field3550 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLgi;)V")
    public static final void method1565(byte arg0, class164 arg1) {
        int var2 = 62 / ((46 - arg0) / 58);
        class139.field2245 = arg1;
        field3551++;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "([BI)V")
    public class226(byte[] arg0, int arg1) {
        this.field3562 = class211.method1451(true, arg0, arg0.length);
        if (this.field3562 != arg1) {
            throw new RuntimeException();
        }
        this.method1563(arg0, (byte) -106);
    }
}
