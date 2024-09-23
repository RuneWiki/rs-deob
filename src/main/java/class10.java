import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DIVYVFFL")
public class class10 extends class11 {

    @OriginalMember(owner = "DIVYVFFL", name = "z", descriptor = "I")
    private int field628 = 71;

    @OriginalMember(owner = "DIVYVFFL", name = "A", descriptor = "I")
    private int field629 = 2239;

    @OriginalMember(owner = "DIVYVFFL", name = "C", descriptor = "Z")
    private boolean field631 = false;

    @OriginalMember(owner = "DIVYVFFL", name = "D", descriptor = "Z")
    private boolean field632 = true;

    @OriginalMember(owner = "DIVYVFFL", name = "E", descriptor = "[[B")
    public byte[][] field633 = new byte[256][];

    @OriginalMember(owner = "DIVYVFFL", name = "F", descriptor = "[I")
    public int[] field634 = new int[256];

    @OriginalMember(owner = "DIVYVFFL", name = "G", descriptor = "[I")
    public int[] field635 = new int[256];

    @OriginalMember(owner = "DIVYVFFL", name = "H", descriptor = "[I")
    public int[] field636 = new int[256];

    @OriginalMember(owner = "DIVYVFFL", name = "I", descriptor = "[I")
    public int[] field637 = new int[256];

    @OriginalMember(owner = "DIVYVFFL", name = "J", descriptor = "[I")
    public int[] field638 = new int[256];

    @OriginalMember(owner = "DIVYVFFL", name = "L", descriptor = "Ljava/util/Random;")
    public Random field640 = new Random();

    @OriginalMember(owner = "DIVYVFFL", name = "M", descriptor = "Z")
    public boolean field641 = false;

    @OriginalMember(owner = "DIVYVFFL", name = "K", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "DIVYVFFL", name = "B", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "DIVYVFFL", name = "<init>", descriptor = "(ZLjava/lang/String;LBYZSQZUF;I)V")
    public class10(boolean arg0, String arg1, class7 arg2, int arg3) {
        class24 var5 = new class24(0, arg2.method29(arg1 + ".dat", null));
        class24 var6 = new class24(0, arg2.method29("index.dat", null));
        if (arg3 != 4348) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        boolean var8 = true;
        var6.field832 = var5.method240() + 4;
        int var9 = var6.method238();
        if (var9 > 0) {
            var6.field832 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field636[var10] = var6.method238();
            this.field637[var10] = var6.method238();
            int var12 = this.field634[var10] = var6.method240();
            int var13 = this.field635[var10] = var6.method240();
            int var14 = var6.method238();
            int var15 = var12 * var13;
            this.field633[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field633[var10][var16] = var5.method239();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field633[var10][var12 * var18 + var17] = var5.method239();
                    }
                }
            }
            if (var13 > this.field639 && var10 < 128) {
                this.field639 = var13;
            }
            this.field636[var10] = 1;
            this.field638[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field633[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field638[var10]--;
                this.field636[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field633[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field638[var10]--;
            }
        }
        if (arg0) {
            this.field638[32] = this.field638[73];
        } else {
            this.field638[32] = this.field638[105];
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method175(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            this.method180(arg4, arg0, -412, arg3 - this.method179(true, arg0), arg2);
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method176(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method180(arg1, arg4, -412, arg3 - this.method179(true, arg4) / 2, arg2);
        if (arg0 != -35924) {
            this.field631 = !this.field631;
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public void method177(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 >= 0) {
            this.field629 = 397;
        }
        this.method184(arg4, arg0, arg3, 0, arg2, arg1 - this.method178(47982, arg0) / 2);
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method178(int arg0, String arg1) {
        if (arg0 != 47982) {
            this.field628 = -176;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field638[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method179(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (!arg0) {
            this.field629 = 476;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field638[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method180(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field639;
        while (arg2 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method187(this.field633[var8], this.field636[var8] + arg3, this.field637[var8] + var6, this.field634[var8], this.field635[var8], arg4);
            }
            arg3 += this.field638[var8];
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public void method181(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg4 - this.method179(true, arg2) / 2;
        if (arg3 != 0) {
            return;
        }
        int var8 = arg0 - this.field639;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method187(this.field633[var10], this.field636[var10] + var7, this.field637[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field634[var10], this.field635[var10], arg5);
            }
            var7 += this.field638[var10];
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IBILjava/lang/String;II)V")
    public void method182(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg1 != -99 || arg3 == null) {
            return;
        }
        int var7 = arg4 - this.method179(true, arg3) / 2;
        int var8 = arg5 - this.field639;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method187(this.field633[var10], this.field636[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field637[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field634[var10], this.field635[var10], arg0);
            }
            var7 += this.field638[var10];
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public void method183(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (arg4 != 9) {
            return;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg3 - this.method179(true, arg2) / 2;
        int var11 = arg6 - this.field639;
        for (int var12 = 0; var12 < arg2.length(); var12++) {
            char var13 = arg2.charAt(var12);
            if (var13 != ' ') {
                this.method187(this.field633[var13], this.field636[var13] + var10, this.field637[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg0) * var8), this.field634[var13], this.field635[var13], arg5);
            }
            var10 += this.field638[var13];
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
    public void method184(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 0) {
            this.field632 = !this.field632;
        }
        this.field641 = false;
        int var7 = arg5;
        if (arg1 == null) {
            return;
        }
        int var8 = arg4 - this.field639;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var10 = this.method186(-563, arg1.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg1.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method187(this.field633[var11], this.field636[var11] + arg5 + 1, this.field637[var11] + var8 + 1, this.field634[var11], this.field635[var11], 0);
                    }
                    this.method187(this.field633[var11], this.field636[var11] + arg5, this.field637[var11] + var8, this.field634[var11], this.field635[var11], arg0);
                }
                arg5 += this.field638[var11];
            }
        }
        if (this.field641) {
            class11.method199(8388608, var7, (int) ((double) this.field639 * 0.7D) + var8, 0, arg5 - var7);
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;ZIII)V")
    public void method185(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        this.field640.setSeed((long) arg6);
        int var8 = (this.field640.nextInt() & 0x1F) + 192;
        if (arg5 != 36526) {
            this.field630 = 447;
        }
        int var9 = arg0 - this.field639;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method186(-563, arg2.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method189(-103, this.field633[var12], 192, 0, this.field636[var12] + arg1 + 1, this.field635[var12], this.field634[var12], this.field637[var12] + var9 + 1);
                    }
                    this.method189(-103, this.field633[var12], var8, arg4, this.field636[var12] + arg1, this.field635[var12], this.field634[var12], this.field637[var12] + var9);
                }
                arg1 += this.field638[var12];
                if ((this.field640.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method186(int arg0, String arg1) {
        if (arg0 >= 0) {
            return this.field628;
        } else if (arg1.equals("red")) {
            return 16711680;
        } else if (arg1.equals("gre")) {
            return 65280;
        } else if (arg1.equals("blu")) {
            return 255;
        } else if (arg1.equals("yel")) {
            return 16776960;
        } else if (arg1.equals("cya")) {
            return 65535;
        } else if (arg1.equals("mag")) {
            return 16711935;
        } else if (arg1.equals("whi")) {
            return 16777215;
        } else if (arg1.equals("bla")) {
            return 0;
        } else if (arg1.equals("lre")) {
            return 16748608;
        } else if (arg1.equals("dre")) {
            return 8388608;
        } else if (arg1.equals("dbl")) {
            return 128;
        } else if (arg1.equals("or1")) {
            return 16756736;
        } else if (arg1.equals("or2")) {
            return 16740352;
        } else if (arg1.equals("or3")) {
            return 16723968;
        } else if (arg1.equals("gr1")) {
            return 12648192;
        } else if (arg1.equals("gr2")) {
            return 8453888;
        } else if (arg1.equals("gr3")) {
            return 4259584;
        } else {
            if (arg1.equals("str")) {
                this.field641 = true;
            }
            if (arg1.equals("end")) {
                this.field641 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "([BIIIII)V")
    private void method187(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class11.field649 * arg2 + arg1;
        int var8 = class11.field649 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class11.field651) {
            int var11 = class11.field651 - arg2;
            arg4 -= var11;
            arg2 = class11.field651;
            var10 += arg3 * var11;
            var7 += class11.field649 * var11;
        }
        if (arg2 + arg4 >= class11.field652) {
            arg4 -= arg2 + arg4 + 1 - class11.field652;
        }
        if (arg1 < class11.field653) {
            int var12 = class11.field653 - arg1;
            arg3 -= var12;
            arg1 = class11.field653;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class11.field654) {
            int var13 = arg1 + arg3 + 1 - class11.field654;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method188(class11.field648, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method188(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(I[BIIIIII)V")
    private void method189(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class11.field649 * arg7 + arg4;
        int var10 = class11.field649 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg0 >= 0) {
            return;
        }
        if (arg7 < class11.field651) {
            int var13 = class11.field651 - arg7;
            arg5 -= var13;
            arg7 = class11.field651;
            var12 += arg6 * var13;
            var9 += class11.field649 * var13;
        }
        if (arg5 + arg7 >= class11.field652) {
            arg5 -= arg5 + arg7 + 1 - class11.field652;
        }
        if (arg4 < class11.field653) {
            int var14 = class11.field653 - arg4;
            arg6 -= var14;
            arg4 = class11.field653;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg6 >= class11.field654) {
            int var15 = arg4 + arg6 + 1 - class11.field654;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg5 > 0) {
            this.method190(var11, arg6, var10, var9, arg3, arg5, 0, arg1, var12, class11.field648, arg2);
        }
    }

    @OriginalMember(owner = "DIVYVFFL", name = "a", descriptor = "(IIIIIII[BI[II)V")
    private void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg4 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var13 = 256 - arg10;
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                if (arg7[arg8++] == 0) {
                    arg3++;
                } else {
                    int var16 = arg9[arg3];
                    arg9[arg3++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg2;
            arg8 += arg0;
        }
        if (arg6 == 0) {
            ;
        }
    }
}
