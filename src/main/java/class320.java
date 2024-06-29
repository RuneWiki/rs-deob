import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class320 {

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "J")
    public static long field5468 = 0L;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
    public static boolean field5462 = false;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lok;")
    public static class146 field5471 = class235.method1724(-12908, "<col=ff3000>");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    public static boolean field5479 = false;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lok;")
    public static class146 field5474 = class235.method1724(-12908, ":duelstake:");

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lii;")
    public class207 field5463;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
    public int[] field5464;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    public int[] field5469;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
    public int[] field5470;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[I")
    public int[] field5472;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    public int[] field5475;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
    public int[] field5482;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Lii;")
    public class207[] field5478;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "[[I")
    public int[][] field5473;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[[I")
    public int[][] field5477;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BB)V", line = 23)
    private final void method2228(byte[] arg0, byte arg1) {
        class47 var3 = new class47(class151.method1200(arg0, false));
        if (arg1 <= 79) {
            return;
        }
        int var4 = var3.method368(-117);
        field5480++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5466 = var3.method373((byte) 36);
        } else {
            this.field5466 = 0;
        }
        int var5 = var3.method368(58);
        int var6 = 0;
        int var7 = -1;
        this.field5465 = var3.method379(-2);
        this.field5464 = new int[this.field5465];
        for (int var8 = 0; var8 < this.field5465; var8++) {
            this.field5464[var8] = var6 += var3.method379(-2);
            if (var7 < this.field5464[var8]) {
                var7 = this.field5464[var8];
            }
        }
        this.field5467 = var7 + 1;
        this.field5470 = new int[this.field5467];
        this.field5477 = new int[this.field5467][];
        this.field5475 = new int[this.field5467];
        this.field5472 = new int[this.field5467];
        this.field5469 = new int[this.field5467];
        if (var5 != 0) {
            this.field5482 = new int[this.field5467];
            for (int var9 = 0; var9 < this.field5467; var9++) {
                this.field5482[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5465; var10++) {
                this.field5482[this.field5464[var10]] = var3.method373((byte) 36);
            }
            this.field5463 = new class207(this.field5482);
        }
        for (int var11 = 0; var11 < this.field5465; var11++) {
            this.field5470[this.field5464[var11]] = var3.method373((byte) 36);
        }
        for (int var12 = 0; var12 < this.field5465; var12++) {
            this.field5472[this.field5464[var12]] = var3.method373((byte) 36);
        }
        for (int var13 = 0; var13 < this.field5465; var13++) {
            this.field5475[this.field5464[var13]] = var3.method379(-2);
        }
        for (int var14 = 0; var14 < this.field5465; var14++) {
            int var15 = this.field5464[var14];
            int var16 = 0;
            int var17 = this.field5475[var15];
            int var18 = -1;
            this.field5477[var15] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field5477[var15][var19] = var16 += var3.method379(-2);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field5469[var15] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field5477[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5473 = new int[var7 + 1][];
        this.field5478 = new class207[var7 + 1];
        for (int var21 = 0; var21 < this.field5465; var21++) {
            int var22 = this.field5464[var21];
            int var23 = this.field5475[var22];
            this.field5473[var22] = new int[this.field5469[var22]];
            for (int var24 = 0; var24 < this.field5469[var22]; var24++) {
                this.field5473[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field5477[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field5477[var22][var25];
                }
                this.field5473[var22][var26] = var3.method373((byte) 36);
            }
            this.field5478[var22] = new class207(this.field5473[var22]);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z", line = 206)
    public static final boolean method2229(int arg0, int arg1) {
        field5481++;
        if (arg0 == 26002) {
            return arg1 >= 0 && class276.field4745.length > arg1 ? class276.field4745[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 221)
    public static void method2230(int arg0) {
        if (arg0 <= 84) {
            field5479 = true;
        }
        field5471 = null;
        field5474 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([BI)V", line = 256)
    public class320(byte[] arg0, int arg1) {
        this.field5476 = class224.method1658(22760, arg0, arg0.length);
        if (this.field5476 != arg1) {
            throw new RuntimeException();
        }
        this.method2228(arg0, (byte) 123);
    }
}
