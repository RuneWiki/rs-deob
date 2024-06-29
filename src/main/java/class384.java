import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class384 extends class47 {

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
    public boolean field5271 = true;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "J")
    public static long field5270 = 0L;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lrc;")
    public static class108 field5259 = new class108(7, 3);

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Lmb;")
    public static class262 field5274;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "[I")
    public int[] field5262;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "[I")
    private int[] field5273;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "[Ljava/lang/String;")
    private String[] field5272;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "[[I")
    private int[][] field5269;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBLkk;)V")
    private final void method2335(int arg0, byte arg1, class161 arg2) {
        field5265++;
        if (arg0 == 1) {
            this.field5272 = class237.method1645('<', arg2.method1186(-1), arg1 + 3);
        } else if (arg0 == 2) {
            int var4 = arg2.method1172((byte) -121);
            this.field5262 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5262[var5] = arg2.method1134(-16848);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method1172((byte) -2);
            this.field5273 = new int[var6];
            this.field5269 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1134(arg1 - 16845);
                this.field5273[var7] = var8;
                this.field5269[var7] = new int[class213.field3100[var8]];
                for (int var9 = 0; var9 < class213.field3100[var8]; var9++) {
                    this.field5269[var7][var9] = arg2.method1134(-16848);
                }
            }
        } else if (arg0 == 4) {
            this.field5271 = false;
        }
        if (arg1 != -3) {
            this.field5271 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public final void method2336(byte arg0) {
        if (arg0 > -73) {
            return;
        }
        field5260++;
        if (this.field5262 != null) {
            for (int var2 = 0; var2 < this.field5262.length; var2++) {
                this.field5262[var2] = class142.method1024(this.field5262[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)I")
    public final int method2337(int arg0, byte arg1, int arg2) {
        field5275++;
        if (this.field5273 == null || arg2 < 0 || arg2 > this.field5273.length) {
            return -1;
        } else if (arg1 == 89) {
            return this.field5269[arg2] == null || arg0 < 0 || arg0 > this.field5269[arg2].length ? -1 : this.field5269[arg2][arg0];
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
    public final int method2338(int arg0) {
        field5258++;
        if (this.field5273 == null) {
            return 0;
        } else {
            int var2 = 69 / ((arg0 - 56) / 58);
            return this.field5273.length;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkk;I)V")
    public final void method2339(class161 arg0, int arg1) {
        field5267++;
        if (arg1 != 0) {
            this.method2341((byte) -121, (int[]) null, (class161) null);
        }
        while (true) {
            int var3 = arg0.method1172((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method2335(var3, (byte) -3, arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method2340(byte arg0) {
        if (arg0 >= -85) {
            return null;
        }
        field5266++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5272 == null) {
            return "";
        }
        var2.append(this.field5272[0]);
        for (int var3 = 1; var3 < this.field5272.length; var3++) {
            var2.append("...");
            var2.append(this.field5272[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B[ILkk;)V")
    public final void method2341(byte arg0, int[] arg1, class161 arg2) {
        field5261++;
        if (this.field5273 == null) {
            return;
        }
        if (arg0 <= 0) {
            this.method2341((byte) 36, (int[]) null, (class161) null);
        }
        for (int var4 = 0; var4 < this.field5273.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class389.field5341[this.method2343(108, var4)];
            if (var5 > 0) {
                arg2.method1182(8, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILkk;)Ljava/lang/String;")
    public final String method2342(int arg0, class161 arg1) {
        if (arg0 < 64) {
            this.method2339((class161) null, 21);
        }
        field5268++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5273 != null) {
            for (int var4 = 0; var4 < this.field5273.length; var4++) {
                var3.append(this.field5272[var4]);
                var3.append(class106.method845(6, arg1.method1144(class377.field5196[this.field5273[var4]], (byte) -45), this.field5269[var4], this.field5273[var4]));
            }
        }
        var3.append(this.field5272[this.field5272.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public final int method2343(int arg0, int arg1) {
        field5263++;
        if (this.field5273 == null || arg1 < 0 || arg1 > this.field5273.length) {
            return -1;
        } else if (arg0 < 96) {
            return -100;
        } else {
            return this.field5273[arg1];
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)V")
    public static void method2344(byte arg0) {
        field5259 = null;
        if (arg0 != 63) {
            method2344((byte) 81);
        }
        field5274 = null;
    }

    static {
        new class151("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class30("", 76);
    }
}
