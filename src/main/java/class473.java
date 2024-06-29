import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class473 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    private int[] field6679;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
    private int[] field6678;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Lh;")
    public static class572 field6676 = new class572("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
    public static boolean field6689;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "Lada;")
    public static class144 field6688;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Lh;")
    public static class572 field6691;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    private int field6677;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private int field6681;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    private int field6683;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    private int field6684;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field6687;

    static {
        new class572("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field6689 = true;
        field6690 = 0;
        field6688 = new class144(9, 20);
        field6691 = new class572("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 9)
    public static void method2846(byte arg0) {
        field6688 = null;
        if (arg0 >= 65) {
            field6691 = null;
            field6676 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I", line = 24)
    public static int method2847(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIBI)V", line = 32)
    public static final void method2848(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6675++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg4 != 32) {
            method2848(-23, -35, 57, 101, (byte) 11, 87);
        }
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg2 >= class3.field25 && class100.field1452 >= arg2) {
            int var20 = class36.method223(class130.field1801, (byte) 50, arg3 + arg5, class14.field136);
            int var21 = class36.method223(class130.field1801, (byte) 50, arg3 - arg5, class14.field136);
            class140.method969(var21, 15888, arg1, var20, class604.field8993[arg2]);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var22 -= var15;
            var18 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (class3.field25 <= var24 && class100.field1452 >= var23) {
                int var25 = class36.method223(class130.field1801, (byte) 50, arg3 + var6, class14.field136);
                int var26 = class36.method223(class130.field1801, (byte) 50, arg3 - var6, class14.field136);
                if (var23 >= class3.field25) {
                    class140.method969(var26, arg4 + 15856, arg1, var25, class604.field8993[var23]);
                }
                if (class100.field1452 >= var24) {
                    class140.method969(var26, 15888, arg1, var25, class604.field8993[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 138)
    private final void method2849(int arg0) {
        field6685++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6679[var11 + 2] + var7;
            int var38 = this.field6679[var11 + 4] + var5;
            int var39 = this.field6679[var11 + 5] + var4;
            int var40 = this.field6679[var11 + 6] + var3;
            int var41 = this.field6679[var11 + 7] + var2;
            int var42 = this.field6679[var11] + var9;
            int var43 = this.field6679[var11 + 3] + var6;
            int var44 = this.field6679[var11 + 1] + var8;
            int var45 = var42 ^ var44 << 11;
            int var46 = var37 + var44;
            int var47 = var43 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var38 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var39 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var40;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field6678[var11] = var9;
            this.field6678[var11 + 1] = var8;
            this.field6678[var11 + 2] = var7;
            this.field6678[var11 + 3] = var6;
            this.field6678[var11 + 4] = var5;
            this.field6678[var11 + 5] = var4;
            this.field6678[var11 + 6] = var3;
            this.field6678[var11 + 7] = var2;
        }
        if (arg0 != 15904) {
            field6689 = false;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6678[var12 + 1] + var8;
            int var14 = this.field6678[var12 + 2] + var7;
            int var15 = this.field6678[var12 + 6] + var3;
            int var16 = this.field6678[var12 + 5] + var4;
            int var17 = this.field6678[var12 + 4] + var5;
            int var18 = this.field6678[var12] + var9;
            int var19 = this.field6678[var12 + 3] + var6;
            int var20 = this.field6678[var12 + 7] + var2;
            int var21 = var18 ^ var13 << 11;
            int var22 = var13 + var14;
            int var23 = var19 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var17 + var24;
            int var26 = var14 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var15;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var20;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field6678[var12] = var9;
            this.field6678[var12 + 1] = var8;
            this.field6678[var12 + 2] = var7;
            this.field6678[var12 + 3] = var6;
            this.field6678[var12 + 4] = var5;
            this.field6678[var12 + 5] = var4;
            this.field6678[var12 + 6] = var3;
            this.field6678[var12 + 7] = var2;
        }
        this.method2851(true);
        this.field6683 = 256;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I", line = 285)
    public final int method2850(int arg0) {
        if (arg0 != 8) {
            return -67;
        }
        if (this.field6683 == 0) {
            this.method2851(true);
            this.field6683 = 256;
        }
        field6686++;
        return this.field6679[--this.field6683];
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 302)
    private class473() {
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([I)V", line = 304)
    public class473(int[] arg0) {
        this.field6679 = new int[256];
        this.field6678 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6679[var2] = arg0[var2];
        }
        this.method2849(15904);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 323)
    private final void method2851(boolean arg0) {
        field6680++;
        this.field6681 += ++this.field6677;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field6678[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6684 ^= this.field6684 << 13;
                } else {
                    this.field6684 ^= this.field6684 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6684 ^= this.field6684 << 2;
            } else {
                this.field6684 ^= this.field6684 >>> 16;
            }
            this.field6684 += this.field6678[var2 + 128 & 0xFF];
            int var4;
            this.field6678[var2] = var4 = this.field6684 + this.field6678[class37.method245(var3 >> 2, 255)] + this.field6681;
            this.field6679[var2] = this.field6681 = this.field6678[class37.method245(var4, 261161) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)I", line = 365)
    public final int method2852(byte arg0) {
        field6682++;
        if (arg0 != -98) {
            field6688 = null;
        }
        if (this.field6683 == 0) {
            this.method2851(true);
            this.field6683 = 256;
        }
        return this.field6679[this.field6683 - 1];
    }
}
