import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class356 {

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
    private int[] field4586;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "[I")
    private int[] field4578;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "J")
    public static long field4576;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Lee;")
    public static class479 field4585;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public static void method2037(boolean arg0) {
        field4585 = null;
        if (arg0) {
            method2037(false);
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
    public final int method2038(boolean arg0) {
        if (this.field4575 == 0) {
            this.method2040(-165235550);
            this.field4575 = 256;
        }
        if (arg0) {
            this.field4581 = -22;
        }
        field4579++;
        return this.field4578[--this.field4575];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)I")
    public final int method2039(int arg0) {
        int var2 = -14 / ((-arg0 - 71) / 50);
        field4577++;
        if (this.field4575 == 0) {
            this.method2040(-165235550);
            this.field4575 = 256;
        }
        return this.field4578[this.field4575 - 1];
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    private final void method2040(int arg0) {
        field4574++;
        this.field4581 += ++this.field4587;
        if (arg0 != -165235550) {
            this.field4578 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4586[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4580 ^= this.field4580 << 13;
                } else {
                    this.field4580 ^= this.field4580 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4580 ^= this.field4580 << 2;
            } else {
                this.field4580 ^= this.field4580 >>> 16;
            }
            this.field4580 += this.field4586[var2 + 128 & 0xFF];
            int var4;
            this.field4586[var2] = var4 = this.field4586[class378.method2145(1020, var3) >> 2] + this.field4580 + this.field4581;
            this.field4578[var2] = this.field4581 = this.field4586[class378.method2145(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)B")
    public static final byte method2041(int arg0, int arg1, byte arg2) {
        field4582++;
        if (arg1 == 9) {
            if (arg2 != -79) {
                field4576 = -99L;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    private class356() {
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([I)V")
    public class356(int[] arg0) {
        this.field4586 = new int[256];
        this.field4578 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4578[var2] = arg0[var2];
        }
        this.method2042((byte) -18);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    private final void method2042(byte arg0) {
        field4583++;
        if (arg0 != -18) {
            this.method2038(false);
        }
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4578[var11 + 5] + var4;
            int var38 = this.field4578[var11 + 7] + var2;
            int var39 = this.field4578[var11 + 3] + var6;
            int var40 = this.field4578[var11 + 4] + var5;
            int var41 = this.field4578[var11 + 1] + var8;
            int var42 = this.field4578[var11 + 6] + var3;
            int var43 = this.field4578[var11 + 2] + var7;
            int var44 = this.field4578[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var39 + var45;
            int var47 = var41 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var38;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field4586[var11] = var9;
            this.field4586[var11 + 1] = var8;
            this.field4586[var11 + 2] = var7;
            this.field4586[var11 + 3] = var6;
            this.field4586[var11 + 4] = var5;
            this.field4586[var11 + 5] = var4;
            this.field4586[var11 + 6] = var3;
            this.field4586[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4586[var12 + 4] + var5;
            int var14 = this.field4586[var12 + 1] + var8;
            int var15 = this.field4586[var12 + 6] + var3;
            int var16 = this.field4586[var12] + var9;
            int var17 = this.field4586[var12 + 7] + var2;
            int var18 = this.field4586[var12 + 5] + var4;
            int var19 = this.field4586[var12 + 2] + var7;
            int var20 = this.field4586[var12 + 3] + var6;
            int var21 = var16 ^ var14 << 11;
            int var22 = var14 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var19 + var23;
            int var26 = var13 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var18 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var15;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4586[var12] = var9;
            this.field4586[var12 + 1] = var8;
            this.field4586[var12 + 2] = var7;
            this.field4586[var12 + 3] = var6;
            this.field4586[var12 + 4] = var5;
            this.field4586[var12 + 5] = var4;
            this.field4586[var12 + 6] = var3;
            this.field4586[var12 + 7] = var2;
        }
        this.method2040(arg0 - 165235532);
        this.field4575 = 256;
    }

    static {
        new class335("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4584 = 0;
        field4576 = 0L;
        field4585 = new class479();
        new class335("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
