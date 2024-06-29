import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class329 {

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
    public boolean field4657 = false;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public int field4655 = -1;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Z")
    public boolean field4659 = false;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field4658 = -1;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public int field4660 = 99;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Z")
    public boolean field4675 = false;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public int field4668 = 2;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public int field4676 = -1;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
    public boolean field4666 = false;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field4667 = -1;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public int field4677 = -1;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public int field4680 = 5;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lri;")
    public static class73 field4674 = new class73(76, -1);

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Lki;")
    public static class498 field4678 = new class498(24, -1);

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    public static boolean field4683;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "Z")
    public static boolean field4686;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lrh;")
    public class172 field4673;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
    private int[] field4661;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "[I")
    public int[] field4665;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[I")
    public int[] field4670;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "[Lpp;")
    public static class267[] field4681;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "[Z")
    public boolean[] field4671;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[[I")
    public int[][] field4663;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "[[Z")
    public static boolean[][] field4682;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILc;III)Lc;")
    public final class121 method2018(int arg0, int arg1, class121 arg2, int arg3, int arg4, int arg5) {
        field4654++;
        int var7 = this.field4665[arg4];
        int var8 = this.field4670[arg4];
        class528 var9 = this.field4673.method1184(-117, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method723((byte) 1, arg0, true);
        }
        class528 var11 = null;
        if ((this.field4666 || class307.field4418) && arg3 != -1 && this.field4670.length > arg3) {
            int var12 = this.field4670[arg3];
            var11 = this.field4673.method1184(-90, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class528 var13 = null;
        if (arg5 != -2227) {
            this.field4667 = 57;
        }
        class528 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4661 != null) {
            if (arg4 < this.field4661.length) {
                var15 = this.field4661[arg4];
                if (var15 != 65535) {
                    var13 = this.field4673.method1184(106, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4666 || class307.field4418) && arg3 != -1 && this.field4661.length > arg3) {
                var16 = this.field4661[arg3];
                if (var16 != 65535) {
                    var14 = this.field4673.method1184(arg5 ^ 0xFFFFF719, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4675) {
            arg0 |= 0x200;
        }
        if (var9.method3117(var10, arg5 + 2313)) {
            arg0 |= 0x80;
        }
        if (var9.method3116(-128, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method3119(-1956869444, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3117(var15, 37)) {
                arg0 |= 0x80;
            }
            if (var13.method3116(-111, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method3119(-1956869444, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3117(arg3, arg5 + 2278)) {
                arg0 |= 0x80;
            }
            if (var11.method3116(-128, arg3)) {
                arg0 |= 0x100;
            }
            if (var11.method3119(-1956869444, arg3)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3117(var16, arg5 ^ 0xFFFFF774)) {
                arg0 |= 0x80;
            }
            if (var14.method3116(-128, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method3119(-1956869444, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class121 var18 = arg2.method723((byte) 1, var17, true);
        var18.method795(var9, 0, this.field4675, arg1 - 1, var7, var11, (byte) -68, var10, arg3);
        if (var13 != null) {
            var18.method795(var13, 0, this.field4675, arg1 - 1, var7, var14, (byte) -111, var15, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZI)I")
    public final int method2019(int arg0, int arg1, boolean arg2, int arg3) {
        field4669++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4670[arg0];
        if (arg3 != -65536) {
            return 105;
        }
        class528 var8 = null;
        class528 var9 = this.field4673.method1184(93, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4666 || class307.field4418) && arg1 != -1 && arg1 < this.field4670.length) {
            int var11 = this.field4670[arg1];
            var8 = this.field4673.method1184(86, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4675) {
            var5 |= 0x200;
        }
        if (var9.method3117(var10, arg3 ^ 0xFFFF003F)) {
            var5 |= 0x80;
        }
        if (var9.method3116(arg3 ^ 0xFF81, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3119(-1956869444, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3117(var6, 50)) {
                var5 |= 0x80;
            }
            if (var8.method3116(-112, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3119(arg3 - 1956803908, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field4661 != null && arg2) {
            if (arg0 < this.field4661.length) {
                int var12 = this.field4661[arg0];
                if (var12 != 65535) {
                    class528 var13 = this.field4673.method1184(-105, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3117(var14, 37)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3116(-124, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3119(arg3 - 1956803908, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4666 || class307.field4418) && arg1 != -1 && arg1 < this.field4661.length) {
                int var15 = this.field4661[arg1];
                if (var15 != 65535) {
                    class528 var16 = this.field4673.method1184(-59, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3117(var17, 116)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3116(arg3 + 65423, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3119(-1956869444, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ldh;I)V")
    public final void method2020(class209 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                if (arg1 <= 125) {
                    this.field4670 = null;
                }
                field4679++;
                return;
            }
            this.method2021(arg0, var3, 256);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ldh;II)V")
    private final void method2021(class209 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var13 = arg0.method1450((byte) 80);
            this.field4665 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4665[var14] = arg0.method1450((byte) 59);
            }
            this.field4670 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4670[var15] = arg0.method1450((byte) 120);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4670[var16] = (arg0.method1450((byte) 41) << 16) + this.field4670[var16];
            }
        } else if (arg1 == 2) {
            this.field4658 = arg0.method1450((byte) 94);
        } else if (arg1 == 3) {
            this.field4671 = new boolean[256];
            int var11 = arg0.method1428(32122);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field4671[arg0.method1428(32122)] = true;
            }
        } else if (arg1 == 4) {
            this.field4659 = true;
        } else if (arg1 == 5) {
            this.field4680 = arg0.method1428(32122);
        } else if (arg1 == 6) {
            this.field4655 = arg0.method1450((byte) 124);
        } else if (arg1 == 7) {
            this.field4667 = arg0.method1450((byte) 100);
        } else if (arg1 == 8) {
            this.field4660 = arg0.method1428(arg2 ^ 0x7C7A);
        } else if (arg1 == 9) {
            this.field4677 = arg0.method1428(32122);
        } else if (arg1 == 10) {
            this.field4676 = arg0.method1428(32122);
        } else if (arg1 == 11) {
            this.field4668 = arg0.method1428(32122);
        } else if (arg1 == 12) {
            int var4 = arg0.method1428(arg2 ^ 0x7C7A);
            this.field4661 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4661[var5] = arg0.method1450((byte) 40);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4661[var6] += arg0.method1450((byte) 72) << 16;
            }
        } else if (arg1 == 13) {
            int var7 = arg0.method1450((byte) 75);
            this.field4663 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method1428(32122);
                if (var9 > 0) {
                    this.field4663[var8] = new int[var9];
                    this.field4663[var8][0] = arg0.method1458((byte) -10);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field4663[var8][var10] = arg0.method1450((byte) 28);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4675 = true;
        } else if (arg1 == 15) {
            this.field4666 = true;
        } else if (arg1 == 16) {
            this.field4657 = true;
        }
        field4664++;
        if (arg2 != 256) {
            this.method2022(11, 88, 53, (byte) 115, 69, -58, null, -78);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIBIILc;I)Lc;")
    public final class121 method2022(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class121 arg6, int arg7) {
        field4662++;
        int var9 = this.field4665[arg7];
        int var10 = this.field4670[arg7];
        if (arg2 >= -122) {
            this.method2021(null, -35, -27);
        }
        class528 var11 = this.field4673.method1184(109, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method723(arg3, arg1, true);
        }
        class528 var13 = null;
        if ((this.field4666 || class307.field4418) && arg0 != -1 && arg0 < this.field4670.length) {
            int var14 = this.field4670[arg0];
            var13 = this.field4673.method1184(-39, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field4675) {
            arg1 |= 0x200;
        }
        if (var11.method3117(var12, 48)) {
            arg1 |= 0x80;
        }
        if (var11.method3116(-112, var12)) {
            arg1 |= 0x100;
        }
        if (var11.method3119(-1956869444, var12)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3117(arg0, 84)) {
                arg1 |= 0x80;
            }
            if (var13.method3116(-116, arg0)) {
                arg1 |= 0x100;
            }
            if (var13.method3119(-1956869444, arg0)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class121 var16 = arg6.method723(arg3, var15, true);
        var16.method795(var11, arg4, this.field4675, arg5 - 1, var9, var13, (byte) -108, var12, arg0);
        return var16;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static void method2023(byte arg0) {
        field4674 = null;
        field4678 = null;
        if (arg0 == -26) {
            field4682 = null;
            field4681 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public final void method2024(int arg0) {
        if (arg0 < 38) {
            return;
        }
        field4672++;
        if (this.field4676 == -1) {
            if (this.field4671 == null) {
                this.field4676 = 0;
            } else {
                this.field4676 = 2;
            }
        }
        if (this.field4677 != -1) {
            return;
        }
        if (this.field4671 == null) {
            this.field4677 = 0;
        } else {
            this.field4677 = 2;
        }
    }

    static {
        new class475("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field4683 = false;
        field4686 = false;
    }
}
