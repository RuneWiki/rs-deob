import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class499 {

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public int field7621 = 0;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "B")
    public byte field7616 = 0;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public int field7615 = 12;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public int field7641 = 0;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public int field7624 = 0;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field7610 = 0;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "[B")
    public byte[] field7642;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[I")
    public int[] field7604;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
    public short[] field7628;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "[I")
    public int[] field7645;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "[I")
    public int[] field7630;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "[B")
    public byte[] field7633;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "[I")
    public int[] field7602;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "[I")
    public int[] field7629;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "[S")
    public short[] field7627;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[S")
    public short[] field7595;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[B")
    public byte[] field7619;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
    public int[] field7591;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
    public int[] field7594;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[B")
    public byte[] field7601;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "[S")
    public short[] field7637;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "[S")
    public short[] field7644;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "[I")
    public int[] field7620;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "[S")
    public short[] field7625;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[B")
    public byte[] field7600;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[B")
    public byte[] field7605;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[B")
    public byte[] field7599;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[S")
    public short[] field7613;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "[I")
    public int[] field7609;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
    public int[] field7612;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "[S")
    public short[] field7632;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "[I")
    public int[] field7617;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "[S")
    public short[] field7636;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "[Lgq;")
    public class339[] field7634;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[Lin;")
    public class56[] field7597;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[S")
    public short[] field7603;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "[Ldb;")
    public class202[] field7640;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "Lwt;")
    public static class194 field7639 = new class194("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Ltb;")
    public static class262 field7611;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V", line = 6)
    public final void method2993(int arg0, byte arg1) {
        field7626++;
        for (int var3 = 0; var3 < this.field7624; var3++) {
            this.field7594[var3] <<= arg0;
            this.field7612[var3] <<= arg0;
            this.field7620[var3] <<= arg0;
        }
        if (this.field7610 > 0 && this.field7645 != null) {
            for (int var4 = 0; var4 < this.field7645.length; var4++) {
                this.field7645[var4] <<= arg0;
                this.field7602[var4] <<= arg0;
                if (this.field7619[var4] != 1) {
                    this.field7630[var4] <<= arg0;
                }
            }
        }
        if (arg1 > -2) {
            this.field7617 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(SSB)V", line = 51)
    public final void method2994(short arg0, short arg1, byte arg2) {
        field7635++;
        if (this.field7637 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field7641; var4++) {
            if (this.field7637[var4] == arg1) {
                this.field7637[var4] = arg0;
            }
        }
        if (arg2 != 45) {
            this.field7630 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(SISBIBBBI)I", line = 77)
    public final int method2995(short arg0, int arg1, short arg2, byte arg3, int arg4, byte arg5, byte arg6, byte arg7, int arg8) {
        field7631++;
        this.field7632[this.field7641] = (short) arg4;
        this.field7644[this.field7641] = (short) arg8;
        this.field7613[this.field7641] = (short) arg1;
        this.field7601[this.field7641] = arg6;
        this.field7605[this.field7641] = arg7;
        this.field7625[this.field7641] = arg0;
        this.field7600[this.field7641] = arg3;
        if (arg5 != -86) {
            this.method2995((short) -89, -22, (short) 44, (byte) -52, 46, (byte) -38, (byte) -110, (byte) 58, -61);
        }
        this.field7637[this.field7641] = arg2;
        return this.field7641++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)I", line = 113)
    public final int method2996(int arg0, int arg1, int arg2, int arg3) {
        field7643++;
        if (arg1 <= 125) {
            this.field7624 = -79;
        }
        for (int var5 = 0; var5 < this.field7624; var5++) {
            if (this.field7594[var5] == arg2 && this.field7612[var5] == arg3 && this.field7620[var5] == arg0) {
                return var5;
            }
        }
        this.field7594[this.field7624] = arg2;
        this.field7612[this.field7624] = arg3;
        this.field7620[this.field7624] = arg0;
        this.field7621 = this.field7624 + 1;
        return this.field7624++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)[[I", line = 137)
    public final int[][] method2997(int arg0) {
        field7622++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7621; var4++) {
            int var9 = this.field7617[var4];
            if (var9 >= 0) {
                int var10002 = var2[var9]++;
                if (var3 < var9) {
                    var3 = var9;
                }
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = arg0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field7621; var7++) {
            int var8 = this.field7617[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ISS)V", line = 197)
    public final void method2998(int arg0, short arg1, short arg2) {
        int var4 = 123 % ((arg0 - 15) / 39);
        field7614++;
        for (int var5 = 0; var5 < this.field7641; var5++) {
            if (this.field7625[var5] == arg1) {
                this.field7625[var5] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[B)V", line = 226)
    private final void method2999(byte arg0, byte[] arg1) {
        field7618++;
        boolean var3 = false;
        boolean var4 = false;
        class156 var5 = new class156(arg1);
        class156 var6 = new class156(arg1);
        class156 var7 = new class156(arg1);
        class156 var8 = new class156(arg1);
        class156 var9 = new class156(arg1);
        var5.field2018 = arg1.length - 18;
        this.field7624 = var5.method993((byte) -57);
        this.field7641 = var5.method993((byte) -118);
        this.field7610 = var5.method941((byte) 126);
        int var10 = var5.method941((byte) 127);
        int var11 = var5.method941((byte) 123);
        int var12 = var5.method941((byte) 124);
        int var13 = var5.method941((byte) 124);
        int var14 = var5.method941((byte) 123);
        int var15 = var5.method993((byte) -126);
        int var16 = var5.method993((byte) -67);
        int var17 = var5.method993((byte) -104);
        int var18 = var5.method993((byte) -86);
        byte var19 = 0;
        int var21 = this.field7624 + var19;
        int var23 = this.field7641 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field7641;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field7641;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field7641;
        }
        int var27 = var23;
        int var28 = 77 % ((arg0 - 18) / 40);
        if (var14 == 1) {
            var23 += this.field7624;
        }
        int var29 = var23;
        if (var12 == 1) {
            var23 += this.field7641;
        }
        int var31 = var18 + var23;
        int var33 = this.field7641 * 2 + var31;
        int var35 = this.field7610 * 6 + var33;
        int var37 = var15 + var35;
        int var39 = var16 + var37;
        if (this.field7610 > 0) {
            this.field7595 = new short[this.field7610];
            this.field7627 = new short[this.field7610];
            this.field7628 = new short[this.field7610];
            this.field7619 = new byte[this.field7610];
        }
        if (var13 == 1) {
            this.field7609 = new int[this.field7641];
        }
        if (var12 == 1) {
            this.field7600 = new byte[this.field7641];
        }
        this.field7612 = new int[this.field7624];
        this.field7632 = new short[this.field7641];
        this.field7594 = new int[this.field7624];
        this.field7613 = new short[this.field7641];
        this.field7644 = new short[this.field7641];
        int var10000 = var17 + var39;
        this.field7620 = new int[this.field7624];
        if (var14 == 1) {
            this.field7617 = new int[this.field7624];
        }
        if (var11 == 255) {
            this.field7599 = new byte[this.field7641];
        } else {
            this.field7616 = (byte) var11;
        }
        var5.field2018 = var19;
        this.field7625 = new short[this.field7641];
        if (var10 == 1) {
            this.field7605 = new byte[this.field7641];
            this.field7601 = new byte[this.field7641];
            this.field7637 = new short[this.field7641];
        }
        var6.field2018 = var35;
        var7.field2018 = var37;
        var8.field2018 = var39;
        var9.field2018 = var27;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        for (int var45 = 0; var45 < this.field7624; var45++) {
            int var61 = var5.method941((byte) 127);
            int var62 = 0;
            if ((var61 & 0x1) != 0) {
                var62 = var6.method979((byte) 126);
            }
            int var63 = 0;
            if ((var61 & 0x2) != 0) {
                var63 = var7.method979((byte) 126);
            }
            int var64 = 0;
            if ((var61 & 0x4) != 0) {
                var64 = var8.method979((byte) 126);
            }
            this.field7594[var45] = var42 + var62;
            this.field7612[var45] = var43 + var63;
            this.field7620[var45] = var44 + var64;
            var43 = this.field7612[var45];
            var42 = this.field7594[var45];
            var44 = this.field7620[var45];
            if (var14 == 1) {
                this.field7617[var45] = var9.method941((byte) 124);
            }
        }
        var5.field2018 = var31;
        var6.field2018 = var26;
        var7.field2018 = var24;
        var8.field2018 = var29;
        var9.field2018 = var25;
        for (int var46 = 0; var46 < this.field7641; var46++) {
            this.field7625[var46] = (short) var5.method993((byte) -42);
            if (var10 == 1) {
                int var60 = var6.method941((byte) 123);
                if ((var60 & 0x1) == 1) {
                    this.field7601[var46] = 1;
                    var3 = true;
                } else {
                    this.field7601[var46] = 0;
                }
                if ((var60 & 0x2) == 2) {
                    this.field7605[var46] = (byte) (var60 >> 2);
                    this.field7637[var46] = this.field7625[var46];
                    this.field7625[var46] = 127;
                    if (this.field7637[var46] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field7605[var46] = -1;
                    this.field7637[var46] = -1;
                }
            }
            if (var11 == 255) {
                this.field7599[var46] = var7.method946(35);
            }
            if (var12 == 1) {
                this.field7600[var46] = var8.method946(61);
            }
            if (var13 == 1) {
                this.field7609[var46] = var9.method941((byte) 123);
            }
        }
        this.field7621 = -1;
        var5.field2018 = var23;
        var6.field2018 = var21;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        short var50 = 0;
        for (int var51 = 0; var51 < this.field7641; var51++) {
            int var56 = var6.method941((byte) 124);
            if (var56 == 1) {
                var47 = (short) (var5.method979((byte) 126) + var50);
                var48 = (short) (var5.method979((byte) 126) + var47);
                var49 = (short) (var5.method979((byte) 126) + var48);
                this.field7632[var51] = var47;
                var50 = var49;
                this.field7644[var51] = var48;
                this.field7613[var51] = var49;
                if (var47 > this.field7621) {
                    this.field7621 = var47;
                }
                if (var48 > this.field7621) {
                    this.field7621 = var48;
                }
                if (this.field7621 < var49) {
                    this.field7621 = var49;
                }
            }
            if (var56 == 2) {
                var48 = var49;
                var49 = (short) (var50 + var5.method979((byte) 126));
                this.field7632[var51] = var47;
                var50 = var49;
                this.field7644[var51] = var48;
                this.field7613[var51] = var49;
                if (var49 > this.field7621) {
                    this.field7621 = var49;
                }
            }
            if (var56 == 3) {
                var47 = var49;
                var49 = (short) (var50 + var5.method979((byte) 126));
                this.field7632[var51] = var47;
                var50 = var49;
                this.field7644[var51] = var48;
                this.field7613[var51] = var49;
                if (var49 > this.field7621) {
                    this.field7621 = var49;
                }
            }
            if (var56 == 4) {
                short var59 = var47;
                var47 = var48;
                var48 = var59;
                var49 = (short) (var5.method979((byte) 126) + var50);
                this.field7632[var51] = var47;
                var50 = var49;
                this.field7644[var51] = var59;
                this.field7613[var51] = var49;
                if (var49 > this.field7621) {
                    this.field7621 = var49;
                }
            }
        }
        var5.field2018 = var33;
        this.field7621++;
        for (int var52 = 0; var52 < this.field7610; var52++) {
            this.field7619[var52] = 0;
            this.field7628[var52] = (short) var5.method993((byte) -126);
            this.field7627[var52] = (short) var5.method993((byte) -52);
            this.field7595[var52] = (short) var5.method993((byte) -34);
        }
        if (this.field7605 != null) {
            boolean var53 = false;
            for (int var54 = 0; var54 < this.field7641; var54++) {
                int var55 = this.field7605[var54] & 0xFF;
                if (var55 != 255) {
                    if ((this.field7628[var55] & 0xFFFF) == this.field7632[var54] && (this.field7627[var55] & 0xFFFF) == this.field7644[var54] && (this.field7595[var55] & 0xFFFF) == this.field7613[var54]) {
                        this.field7605[var54] = -1;
                    } else {
                        var53 = true;
                    }
                }
            }
            if (!var53) {
                this.field7605 = null;
            }
        }
        if (!var4) {
            this.field7637 = null;
        }
        if (!var3) {
            this.field7601 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)[[I", line = 620)
    public final int[][] method3000(byte arg0) {
        field7608++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7640.length; var4++) {
            int var9 = this.field7640[var4].field2801;
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        if (arg0 != 59) {
            this.method2996(-66, 30, 25, 21);
        }
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field7640.length; var7++) {
            int var8 = this.field7640[var7].field2801;
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IIII)V", line = 680)
    public final void method3001(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            int var5 = class323.field4731[arg0];
            int var6 = class323.field4733[arg0];
            for (int var7 = 0; var7 < this.field7624; var7++) {
                int var8 = this.field7612[var7] * var5 + this.field7594[var7] * var6 >> 15;
                this.field7612[var7] = this.field7612[var7] * var6 - (this.field7594[var7] * var5) >> 15;
                this.field7594[var7] = var8;
            }
        }
        field7596++;
        if (arg1 != 332575631) {
            this.field7616 = -102;
        }
        if (arg3 != 0) {
            int var9 = class323.field4731[arg3];
            int var10 = class323.field4733[arg3];
            for (int var11 = 0; var11 < this.field7624; var11++) {
                int var12 = this.field7612[var11] * var10 - (this.field7620[var11] * var9) >> 15;
                this.field7620[var11] = this.field7612[var11] * var9 + (this.field7620[var11] * var10) >> 15;
                this.field7612[var11] = var12;
            }
        }
        if (arg2 == 0) {
            return;
        }
        int var13 = class323.field4731[arg2];
        int var14 = class323.field4733[arg2];
        for (int var15 = 0; var15 < this.field7624; var15++) {
            int var16 = this.field7620[var15] * var13 + (this.field7594[var15] * var14) >> 15;
            this.field7620[var15] = this.field7620[var15] * var14 - (this.field7594[var15] * var13) >> 15;
            this.field7594[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIII)V", line = 750)
    public final void method3002(byte arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7624; var5++) {
            this.field7594[var5] += arg3;
            this.field7612[var5] += arg2;
            this.field7620[var5] += arg1;
        }
        field7623++;
        if (arg0 != 118) {
            this.method3004((short) 61, 88, (short) 124, (short) -35, (byte) -77, (short) -114, (short) -12, (byte) 99, (byte) 18, (short) 52);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lfl;SII)I", line = 774)
    private final int method3003(class499 arg0, short arg1, int arg2, int arg3) {
        field7606++;
        int var5 = arg0.field7594[arg2];
        int var6 = arg0.field7612[arg2];
        int var7 = arg0.field7620[arg2];
        for (int var8 = 0; var8 < this.field7624; var8++) {
            if (this.field7594[var8] == var5 && this.field7612[var8] == var6 && this.field7620[var8] == var7) {
                this.field7603[var8] = (short) class51.method379(this.field7603[var8], arg1);
                return var8;
            }
        }
        this.field7594[this.field7624] = var5;
        this.field7612[this.field7624] = var6;
        this.field7620[this.field7624] = var7;
        if (arg3 == 14) {
            this.field7603[this.field7624] = arg1;
            this.field7617[this.field7624] = arg0.field7617 == null ? -1 : arg0.field7617[arg2];
            return this.field7624++;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(SISSBSSBBS)B", line = 817)
    public final byte method3004(short arg0, int arg1, short arg2, short arg3, byte arg4, short arg5, short arg6, byte arg7, byte arg8, short arg9) {
        field7638++;
        if (this.field7610 >= 255) {
            throw new IllegalStateException();
        }
        this.field7619[this.field7610] = 3;
        this.field7628[this.field7610] = arg6;
        if (arg1 != 17526) {
            this.field7645 = null;
        }
        this.field7627[this.field7610] = arg9;
        this.field7595[this.field7610] = arg0;
        this.field7645[this.field7610] = arg3;
        this.field7602[this.field7610] = arg5;
        this.field7630[this.field7610] = arg2;
        this.field7642[this.field7610] = arg8;
        this.field7633[this.field7610] = arg4;
        this.field7604[this.field7610] = arg7;
        return (byte) (this.field7610++);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B)V", line = 1683)
    public class499(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3008(69, arg0);
        } else {
            this.method2999((byte) -47, arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(III)V", line = 1694)
    public class499(int arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            this.field7642 = new byte[arg2];
            this.field7604 = new int[arg2];
            this.field7628 = new short[arg2];
            this.field7645 = new int[arg2];
            this.field7630 = new int[arg2];
            this.field7633 = new byte[arg2];
            this.field7602 = new int[arg2];
            this.field7629 = new int[arg2];
            this.field7627 = new short[arg2];
            this.field7595 = new short[arg2];
            this.field7619 = new byte[arg2];
            this.field7591 = new int[arg2];
        }
        this.field7594 = new int[arg0];
        this.field7601 = new byte[arg1];
        this.field7637 = new short[arg1];
        this.field7644 = new short[arg1];
        this.field7620 = new int[arg0];
        this.field7625 = new short[arg1];
        this.field7600 = new byte[arg1];
        this.field7605 = new byte[arg1];
        this.field7599 = new byte[arg1];
        this.field7613 = new short[arg1];
        this.field7609 = new int[arg1];
        this.field7612 = new int[arg0];
        this.field7632 = new short[arg1];
        this.field7617 = new int[arg0];
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([Lfl;I)V", line = 1731)
    public class499(class499[] arg0, int arg1) {
        this.field7624 = 0;
        this.field7641 = 0;
        this.field7610 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        this.field7616 = -1;
        for (int var12 = 0; var12 < arg1; var12++) {
            class499 var35 = arg0[var12];
            if (var35 != null) {
                this.field7641 += var35.field7641;
                this.field7624 += var35.field7624;
                this.field7610 += var35.field7610;
                if (var35.field7597 != null) {
                    var3 += var35.field7597.length;
                }
                var6 |= var35.field7601 != null;
                if (var35.field7634 != null) {
                    var4 += var35.field7634.length;
                }
                if (var35.field7640 != null) {
                    var5 += var35.field7640.length;
                }
                if (var35.field7599 == null) {
                    if (this.field7616 == -1) {
                        this.field7616 = var35.field7616;
                    }
                    if (this.field7616 != var35.field7616) {
                        var7 = true;
                    }
                } else {
                    var7 = true;
                }
                var8 |= var35.field7600 != null;
                var10 |= var35.field7637 != null;
                var11 |= var35.field7609 != null;
                var9 |= var35.field7605 != null;
            }
        }
        this.field7612 = new int[this.field7624];
        this.field7636 = new short[this.field7641];
        if (var10) {
            this.field7637 = new short[this.field7641];
        }
        this.field7620 = new int[this.field7624];
        this.field7644 = new short[this.field7641];
        this.field7625 = new short[this.field7641];
        if (this.field7610 > 0) {
            this.field7629 = new int[this.field7610];
            this.field7627 = new short[this.field7610];
            this.field7642 = new byte[this.field7610];
            this.field7595 = new short[this.field7610];
            this.field7633 = new byte[this.field7610];
            this.field7619 = new byte[this.field7610];
            this.field7630 = new int[this.field7610];
            this.field7628 = new short[this.field7610];
            this.field7604 = new int[this.field7610];
            this.field7602 = new int[this.field7610];
            this.field7645 = new int[this.field7610];
            this.field7591 = new int[this.field7610];
        }
        if (var4 > 0) {
            this.field7634 = new class339[var4];
        }
        if (var6) {
            this.field7601 = new byte[this.field7641];
        }
        if (var3 > 0) {
            this.field7597 = new class56[var3];
        }
        this.field7594 = new int[this.field7624];
        if (var7) {
            this.field7599 = new byte[this.field7641];
        }
        this.field7603 = new short[this.field7624];
        this.field7617 = new int[this.field7624];
        if (var11) {
            this.field7609 = new int[this.field7641];
        }
        this.field7632 = new short[this.field7641];
        if (var8) {
            this.field7600 = new byte[this.field7641];
        }
        if (var5 > 0) {
            this.field7640 = new class202[var5];
        }
        this.field7613 = new short[this.field7641];
        if (var9) {
            this.field7605 = new byte[this.field7641];
        }
        int var13 = 0;
        this.field7641 = 0;
        int var14 = 0;
        this.field7610 = 0;
        int var15 = 0;
        this.field7624 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var24 = (short) (0x1 << var16);
            class499 var25 = arg0[var16];
            if (var25 != null) {
                if (var25.field7640 != null) {
                    for (int var26 = 0; var26 < var25.field7640.length; var26++) {
                        class202 var27 = var25.field7640[var26];
                        this.field7640[var13++] = var27.method1245(var27.field2798 + this.field7641, -90);
                    }
                }
                for (int var28 = 0; var28 < var25.field7641; var28++) {
                    if (var6 && var25.field7601 != null) {
                        this.field7601[this.field7641] = var25.field7601[var28];
                    }
                    if (var7) {
                        if (var25.field7599 == null) {
                            this.field7599[this.field7641] = var25.field7616;
                        } else {
                            this.field7599[this.field7641] = var25.field7599[var28];
                        }
                    }
                    if (var8 && var25.field7600 != null) {
                        this.field7600[this.field7641] = var25.field7600[var28];
                    }
                    if (var10) {
                        if (var25.field7637 == null) {
                            this.field7637[this.field7641] = -1;
                        } else {
                            this.field7637[this.field7641] = var25.field7637[var28];
                        }
                    }
                    if (var11) {
                        if (var25.field7609 == null) {
                            this.field7609[this.field7641] = -1;
                        } else {
                            this.field7609[this.field7641] = var25.field7609[var28];
                        }
                    }
                    this.field7632[this.field7641] = (short) this.method3003(var25, var24, var25.field7632[var28], 14);
                    this.field7644[this.field7641] = (short) this.method3003(var25, var24, var25.field7644[var28], 14);
                    this.field7613[this.field7641] = (short) this.method3003(var25, var24, var25.field7613[var28], 14);
                    this.field7636[this.field7641] = var24;
                    this.field7625[this.field7641] = var25.field7625[var28];
                    this.field7641++;
                }
                if (var25.field7597 != null) {
                    for (int var29 = 0; var29 < var25.field7597.length; var29++) {
                        int var30 = this.method3003(var25, var24, var25.field7597[var29].field863, 14);
                        int var31 = this.method3003(var25, var24, var25.field7597[var29].field875, 14);
                        int var32 = this.method3003(var25, var24, var25.field7597[var29].field876, 14);
                        this.field7597[var14] = var25.field7597[var29].method417(var32, var30, var31, (byte) -10);
                        var14++;
                    }
                }
                if (var25.field7634 != null) {
                    for (int var33 = 0; var33 < var25.field7634.length; var33++) {
                        int var34 = this.method3003(var25, var24, var25.field7634[var33].field4933, 14);
                        this.field7634[var15] = var25.field7634[var33].method2058(var34, 126);
                        var15++;
                    }
                }
            }
        }
        int var17 = 0;
        this.field7621 = this.field7624;
        for (int var18 = 0; var18 < arg1; var18++) {
            short var19 = (short) (0x1 << var18);
            class499 var20 = arg0[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < var20.field7641; var21++) {
                    if (var9) {
                        this.field7605[var17++] = (byte) (var20.field7605 == null || var20.field7605[var21] == -1 ? -1 : var20.field7605[var21] + this.field7610);
                    }
                }
                for (int var22 = 0; var22 < var20.field7610; var22++) {
                    byte var23 = this.field7619[this.field7610] = var20.field7619[var22];
                    if (var23 == 0) {
                        this.field7628[this.field7610] = (short) this.method3003(var20, var19, var20.field7628[var22], 14);
                        this.field7627[this.field7610] = (short) this.method3003(var20, var19, var20.field7627[var22], 14);
                        this.field7595[this.field7610] = (short) this.method3003(var20, var19, var20.field7595[var22], 14);
                    }
                    if (var23 >= 1 && var23 <= 3) {
                        this.field7628[this.field7610] = var20.field7628[var22];
                        this.field7627[this.field7610] = var20.field7627[var22];
                        this.field7595[this.field7610] = var20.field7595[var22];
                        this.field7645[this.field7610] = var20.field7645[var22];
                        this.field7602[this.field7610] = var20.field7602[var22];
                        this.field7630[this.field7610] = var20.field7630[var22];
                        this.field7642[this.field7610] = var20.field7642[var22];
                        this.field7633[this.field7610] = var20.field7633[var22];
                        this.field7604[this.field7610] = var20.field7604[var22];
                    }
                    if (var23 == 2) {
                        this.field7591[this.field7610] = var20.field7591[var22];
                        this.field7629[this.field7610] = var20.field7629[var22];
                    }
                    this.field7610++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)[[I", line = 855)
    public final int[][] method3005(byte arg0) {
        field7593++;
        int[] var2 = new int[256];
        int var3 = 0;
        if (arg0 != 84) {
            this.field7616 = 74;
        }
        for (int var4 = 0; var4 < this.field7641; var4++) {
            int var9 = this.field7609[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field7641; var7++) {
            int var8 = this.field7609[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 917)
    public static void method3006(int arg0) {
        if (arg0 != 14739) {
            field7639 = null;
        }
        field7611 = null;
        field7639 = null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 934)
    public static final void method3007(byte arg0) {
        field7607++;
        if (class327.field4765 == 0) {
            return;
        }
        try {
            if ((++class7.field124) > 1500) {
                if (class22.field294 != null) {
                    class22.field294.method2123(120);
                    class22.field294 = null;
                }
                if (class115.field1485 >= 1) {
                    class384.field5705 = -5;
                    class327.field4765 = 0;
                    return;
                }
                class7.field124 = 0;
                if (class308.field4492 == class195.field2767) {
                    class195.field2767 = class35.field559;
                } else {
                    class195.field2767 = class308.field4492;
                }
                class115.field1485++;
                class327.field4765 = 1;
            }
            if (class327.field4765 == 1) {
                class293.field4177 = class86.field1182.method333(class195.field2767, (byte) 111, class437.field6397);
                class327.field4765 = 2;
            }
            if (class327.field4765 == 2) {
                if (class293.field4177.field6417 == 2) {
                    throw new IOException();
                }
                if (class293.field4177.field6417 != 1) {
                    return;
                }
                class22.field294 = new class350((Socket) class293.field4177.field6416, class86.field1182);
                class293.field4177 = null;
                class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                class53.method400((byte) -71);
                int var1 = class22.field294.method2122((byte) -37);
                class53.method400((byte) -71);
                if (var1 != 101) {
                    class384.field5705 = var1;
                    class327.field4765 = 0;
                    class22.field294.method2123(111);
                    class22.field294 = null;
                    return;
                }
                class327.field4765 = 3;
            }
            if (class327.field4765 == 3) {
                if (class22.field294.method2120(100) >= 2) {
                    int var2 = class22.field294.method2122((byte) -37) << 8 | class22.field294.method2122((byte) -37);
                    class355.method2150((byte) 67, var2);
                    if (class128.field1631 == -1) {
                        class384.field5705 = 6;
                        class327.field4765 = 0;
                        class22.field294.method2123(-103);
                        class22.field294 = null;
                    } else {
                        class327.field4765 = 0;
                        class22.field294.method2123(127);
                        class22.field294 = null;
                        class435.method2566(true);
                    }
                }
            } else if (arg0 > -51) {
                field7639 = null;
            }
        } catch (IOException var3) {
            if (class22.field294 != null) {
                class22.field294.method2123(117);
                class22.field294 = null;
            }
            if (class115.field1485 < 1) {
                class115.field1485++;
                class7.field124 = 0;
                class327.field4765 = 1;
                if (class308.field4492 == class195.field2767) {
                    class195.field2767 = class35.field559;
                } else {
                    class195.field2767 = class308.field4492;
                }
            } else {
                class327.field4765 = 0;
                class384.field5705 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[B)V", line = 1075)
    private final void method3008(int arg0, byte[] arg1) {
        field7592++;
        class156 var3 = new class156(arg1);
        class156 var4 = new class156(arg1);
        class156 var5 = new class156(arg1);
        class156 var6 = new class156(arg1);
        class156 var7 = new class156(arg1);
        class156 var8 = new class156(arg1);
        class156 var9 = new class156(arg1);
        var3.field2018 = arg1.length - 23;
        this.field7624 = var3.method993((byte) -68);
        this.field7641 = var3.method993((byte) -41);
        this.field7610 = var3.method941((byte) 125);
        int var10 = var3.method941((byte) 125);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        boolean var13 = (var10 & 0x4) == 4;
        boolean var14 = (var10 & 0x8) == 8;
        if (var14) {
            var3.field2018 -= 7;
            this.field7615 = var3.method941((byte) 126);
            var3.field2018 += 6;
        }
        int var15 = var3.method941((byte) 127);
        int var16 = var3.method941((byte) 124);
        int var17 = var3.method941((byte) 123);
        int var18 = var3.method941((byte) 125);
        int var19 = var3.method941((byte) 123);
        int var20 = var3.method993((byte) -65);
        int var21 = -95 % ((arg0 + 26) / 55);
        int var22 = var3.method993((byte) -73);
        int var23 = var3.method993((byte) -56);
        int var24 = var3.method993((byte) -105);
        int var25 = var3.method993((byte) -75);
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        if (this.field7610 > 0) {
            var3.field2018 = 0;
            this.field7619 = new byte[this.field7610];
            for (int var29 = 0; var29 < this.field7610; var29++) {
                byte var30 = this.field7619[var29] = var3.method946(57);
                if (var30 == 0) {
                    var26++;
                }
                if (var30 == 2) {
                    var28++;
                }
                if (var30 >= 1 && var30 <= 3) {
                    var27++;
                }
            }
        }
        int var31 = this.field7610;
        int var33 = this.field7624 + var31;
        int var34 = var33;
        if (var11) {
            var33 += this.field7641;
        }
        int var36 = this.field7641 + var33;
        int var37 = var36;
        if (var15 == 255) {
            var36 += this.field7641;
        }
        int var38 = var36;
        if (var17 == 1) {
            var36 += this.field7641;
        }
        int var39 = var36;
        if (var19 == 1) {
            var36 += this.field7624;
        }
        int var40 = var36;
        if (var16 == 1) {
            var36 += this.field7641;
        }
        int var42 = var24 + var36;
        int var43 = var42;
        if (var18 == 1) {
            var42 += this.field7641 * 2;
        }
        int var45 = var25 + var42;
        int var47 = this.field7641 * 2 + var45;
        int var49 = var20 + var47;
        int var51 = var22 + var49;
        int var53 = var23 + var51;
        int var55 = var26 * 6 + var53;
        int var57 = var27 * 6 + var55;
        int var58 = this.field7615 < 14 ? 6 : 7;
        int var60 = var27 * var58 + var57;
        int var62 = var27 + var60;
        int var64 = var27 + var62;
        int var66 = var28 * 2 + var27 + var64;
        if (var18 == 1 && this.field7610 > 0) {
            this.field7605 = new byte[this.field7641];
        }
        if (this.field7610 > 0) {
            this.field7628 = new short[this.field7610];
            if (var27 > 0) {
                this.field7630 = new int[var27];
                this.field7604 = new int[var27];
                this.field7633 = new byte[var27];
                this.field7602 = new int[var27];
                this.field7645 = new int[var27];
                this.field7642 = new byte[var27];
            }
            if (var28 > 0) {
                this.field7591 = new int[var28];
                this.field7629 = new int[var28];
            }
            this.field7595 = new short[this.field7610];
            this.field7627 = new short[this.field7610];
        }
        this.field7632 = new short[this.field7641];
        if (var16 == 1) {
            this.field7600 = new byte[this.field7641];
        }
        this.field7612 = new int[this.field7624];
        this.field7594 = new int[this.field7624];
        this.field7620 = new int[this.field7624];
        if (var18 == 1) {
            this.field7637 = new short[this.field7641];
        }
        this.field7625 = new short[this.field7641];
        this.field7613 = new short[this.field7641];
        if (var15 == 255) {
            this.field7599 = new byte[this.field7641];
        } else {
            this.field7616 = (byte) var15;
        }
        if (var11) {
            this.field7601 = new byte[this.field7641];
        }
        if (var19 == 1) {
            this.field7617 = new int[this.field7624];
        }
        if (var17 == 1) {
            this.field7609 = new int[this.field7641];
        }
        var3.field2018 = var31;
        this.field7644 = new short[this.field7641];
        var4.field2018 = var47;
        var5.field2018 = var49;
        var6.field2018 = var51;
        var7.field2018 = var39;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        for (int var71 = 0; var71 < this.field7624; var71++) {
            int var99 = var3.method941((byte) 124);
            int var100 = 0;
            if ((var99 & 0x1) != 0) {
                var100 = var4.method979((byte) 126);
            }
            int var101 = 0;
            if ((var99 & 0x2) != 0) {
                var101 = var5.method979((byte) 126);
            }
            int var102 = 0;
            if ((var99 & 0x4) != 0) {
                var102 = var6.method979((byte) 126);
            }
            this.field7594[var71] = var68 + var100;
            this.field7612[var71] = var69 + var101;
            this.field7620[var71] = var70 + var102;
            var69 = this.field7612[var71];
            var70 = this.field7620[var71];
            var68 = this.field7594[var71];
            if (var19 == 1) {
                this.field7617[var71] = var7.method941((byte) 127);
            }
        }
        var3.field2018 = var45;
        var4.field2018 = var34;
        var5.field2018 = var37;
        var6.field2018 = var40;
        var7.field2018 = var38;
        var8.field2018 = var43;
        var9.field2018 = var42;
        for (int var72 = 0; var72 < this.field7641; var72++) {
            this.field7625[var72] = (short) var3.method993((byte) -50);
            if (var11) {
                this.field7601[var72] = var4.method946(30);
            }
            if (var15 == 255) {
                this.field7599[var72] = var5.method946(27);
            }
            if (var16 == 1) {
                this.field7600[var72] = var6.method946(81);
            }
            if (var17 == 1) {
                this.field7609[var72] = var7.method941((byte) 124);
            }
            if (var18 == 1) {
                this.field7637[var72] = (short) (var8.method993((byte) -127) - 1);
            }
            if (this.field7605 != null) {
                if (this.field7637[var72] == -1) {
                    this.field7605[var72] = -1;
                } else {
                    this.field7605[var72] = (byte) (var9.method941((byte) 123) - 1);
                }
            }
        }
        var3.field2018 = var36;
        this.field7621 = -1;
        var4.field2018 = var33;
        short var73 = 0;
        short var74 = 0;
        short var75 = 0;
        short var76 = 0;
        for (int var77 = 0; var77 < this.field7641; var77++) {
            int var95 = var4.method941((byte) 126);
            if (var95 == 1) {
                var73 = (short) (var3.method979((byte) 126) + var76);
                var74 = (short) (var73 + var3.method979((byte) 126));
                var75 = (short) (var74 + var3.method979((byte) 126));
                var76 = var75;
                this.field7632[var77] = var73;
                this.field7644[var77] = var74;
                this.field7613[var77] = var75;
                if (var73 > this.field7621) {
                    this.field7621 = var73;
                }
                if (var74 > this.field7621) {
                    this.field7621 = var74;
                }
                if (var75 > this.field7621) {
                    this.field7621 = var75;
                }
            }
            if (var95 == 2) {
                var74 = var75;
                var75 = (short) (var3.method979((byte) 126) + var76);
                var76 = var75;
                this.field7632[var77] = var73;
                this.field7644[var77] = var74;
                this.field7613[var77] = var75;
                if (this.field7621 < var75) {
                    this.field7621 = var75;
                }
            }
            if (var95 == 3) {
                var73 = var75;
                var75 = (short) (var3.method979((byte) 126) + var76);
                var76 = var75;
                this.field7632[var77] = var73;
                this.field7644[var77] = var74;
                this.field7613[var77] = var75;
                if (var75 > this.field7621) {
                    this.field7621 = var75;
                }
            }
            if (var95 == 4) {
                short var98 = var73;
                var73 = var74;
                var74 = var98;
                var75 = (short) (var76 + var3.method979((byte) 126));
                var76 = var75;
                this.field7632[var77] = var73;
                this.field7644[var77] = var98;
                this.field7613[var77] = var75;
                if (this.field7621 < var75) {
                    this.field7621 = var75;
                }
            }
        }
        this.field7621++;
        var3.field2018 = var53;
        var4.field2018 = var55;
        var5.field2018 = var57;
        var6.field2018 = var60;
        var7.field2018 = var62;
        var8.field2018 = var64;
        for (int var78 = 0; var78 < this.field7610; var78++) {
            int var94 = this.field7619[var78] & 0xFF;
            if (var94 == 0) {
                this.field7628[var78] = (short) var3.method993((byte) -51);
                this.field7627[var78] = (short) var3.method993((byte) -37);
                this.field7595[var78] = (short) var3.method993((byte) -39);
            }
            if (var94 == 1) {
                this.field7628[var78] = (short) var4.method993((byte) -123);
                this.field7627[var78] = (short) var4.method993((byte) -96);
                this.field7595[var78] = (short) var4.method993((byte) -69);
                this.field7645[var78] = var5.method993((byte) -46);
                if (this.field7615 >= 14) {
                    this.field7602[var78] = var5.method943(1295851312);
                } else {
                    this.field7602[var78] = var5.method993((byte) -38);
                }
                this.field7630[var78] = var5.method993((byte) -52);
                this.field7642[var78] = var6.method946(43);
                this.field7633[var78] = var7.method946(120);
                this.field7604[var78] = var8.method946(82);
            }
            if (var94 == 2) {
                this.field7628[var78] = (short) var4.method993((byte) -86);
                this.field7627[var78] = (short) var4.method993((byte) -124);
                this.field7595[var78] = (short) var4.method993((byte) -114);
                this.field7645[var78] = var5.method993((byte) -65);
                if (this.field7615 >= 14) {
                    this.field7602[var78] = var5.method943(1295851312);
                } else {
                    this.field7602[var78] = var5.method993((byte) -53);
                }
                this.field7630[var78] = var5.method993((byte) -73);
                this.field7642[var78] = var6.method946(46);
                this.field7633[var78] = var7.method946(114);
                this.field7604[var78] = var8.method946(75);
                this.field7591[var78] = var8.method946(99);
                this.field7629[var78] = var8.method946(107);
            }
            if (var94 == 3) {
                this.field7628[var78] = (short) var4.method993((byte) -85);
                this.field7627[var78] = (short) var4.method993((byte) -44);
                this.field7595[var78] = (short) var4.method993((byte) -68);
                this.field7645[var78] = var5.method993((byte) -87);
                if (this.field7615 < 14) {
                    this.field7602[var78] = var5.method993((byte) -75);
                } else {
                    this.field7602[var78] = var5.method943(1295851312);
                }
                this.field7630[var78] = var5.method993((byte) -100);
                this.field7642[var78] = var6.method946(124);
                this.field7633[var78] = var7.method946(54);
                this.field7604[var78] = var8.method946(96);
            }
        }
        var3.field2018 = var66;
        if (var12) {
            int var79 = var3.method941((byte) 127);
            if (var79 > 0) {
                this.field7597 = new class56[var79];
                for (int var80 = 0; var80 < var79; var80++) {
                    int var81 = var3.method993((byte) -47);
                    int var82 = var3.method993((byte) -98);
                    byte var83;
                    if (var15 == 255) {
                        var83 = this.field7599[var82];
                    } else {
                        var83 = (byte) var15;
                    }
                    this.field7597[var80] = new class56(var81, this.field7632[var82], this.field7644[var82], this.field7613[var82], var83);
                }
            }
            int var84 = var3.method941((byte) 123);
            if (var84 > 0) {
                this.field7634 = new class339[var84];
                for (int var85 = 0; var85 < var84; var85++) {
                    int var86 = var3.method993((byte) -111);
                    int var87 = var3.method993((byte) -58);
                    this.field7634[var85] = new class339(var86, var87);
                }
            }
        }
        if (!var13) {
            return;
        }
        int var88 = var3.method941((byte) 124);
        if (var88 <= 0) {
            return;
        }
        this.field7640 = new class202[var88];
        for (int var89 = 0; var89 < var88; var89++) {
            int var90 = var3.method993((byte) -91);
            int var91 = var3.method993((byte) -54);
            int var92 = var3.method941((byte) 124);
            byte var93 = var3.method946(55);
            this.field7640[var89] = new class202(var90, var91, var92, var93);
        }
        return;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)I", line = 1652)
    public static final int method3009(int arg0, int arg1, int arg2) {
        field7598++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 28844) {
            method3006(76);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
