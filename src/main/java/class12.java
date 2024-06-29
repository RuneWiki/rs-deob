import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class12 extends class169 {

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public int field216 = -1;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public int field221 = 100;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public int field229 = -1;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public int field218 = -1;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[I")
    public int[] field230 = new int[10];

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "[Z")
    public boolean[] field212 = new boolean[10];

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public int field224 = 0;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    public int field237 = 0;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public int field217 = 0;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
    public int field236 = 0;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    public int field231 = 1;

    @OriginalMember(owner = "client!bb", name = "Gb", descriptor = "Lcd;")
    public class23 field256 = null;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public int field220 = 0;

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
    public int field247 = 0;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public int field222 = 0;

    @OriginalMember(owner = "client!bb", name = "Ib", descriptor = "[I")
    public int[] field258 = new int[4];

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
    public int[] field219 = new int[10];

    @OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
    public int field251 = -1;

    @OriginalMember(owner = "client!bb", name = "Mb", descriptor = "I")
    public int field262 = -1;

    @OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
    public int field255 = 0;

    @OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
    public int field250 = -1;

    @OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
    public int field253 = -1;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public int field226 = -1;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
    public int field244 = -1000;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "[I")
    public int[] field232 = new int[4];

    @OriginalMember(owner = "client!bb", name = "Eb", descriptor = "[I")
    public int[] field254 = new int[4];

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    public int field245 = 0;

    @OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
    public int field252 = 0;

    @OriginalMember(owner = "client!bb", name = "Tb", descriptor = "I")
    public int field269 = -1;

    @OriginalMember(owner = "client!bb", name = "Vb", descriptor = "I")
    public int field271 = 32;

    @OriginalMember(owner = "client!bb", name = "Qb", descriptor = "I")
    public int field266 = 0;

    @OriginalMember(owner = "client!bb", name = "dc", descriptor = "I")
    public int field279 = 0;

    @OriginalMember(owner = "client!bb", name = "hc", descriptor = "I")
    public int field283 = 200;

    @OriginalMember(owner = "client!bb", name = "Xb", descriptor = "I")
    public int field273 = 0;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
    public int field242 = 0;

    @OriginalMember(owner = "client!bb", name = "ac", descriptor = "Z")
    public boolean field276 = false;

    @OriginalMember(owner = "client!bb", name = "ic", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!bb", name = "cc", descriptor = "I")
    public int field278 = 0;

    @OriginalMember(owner = "client!bb", name = "lc", descriptor = "I")
    public int field287 = -1;

    @OriginalMember(owner = "client!bb", name = "jc", descriptor = "I")
    public int field285 = 0;

    @OriginalMember(owner = "client!bb", name = "Sb", descriptor = "I")
    public int field268 = -1;

    @OriginalMember(owner = "client!bb", name = "mc", descriptor = "I")
    public int field288 = -1;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "Lcd;")
    public static class23 field243 = class54.method414(")4lang)4de", -1);

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lcd;")
    public static class23 field235 = class54.method414("mod_icons", -1);

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "[Z")
    public static boolean[] field246 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Lcd;")
    private static class23 field257 = class54.method414("Your account has been disabled)3", -1);

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lcd;")
    public static class23 field228 = field257;

    @OriginalMember(owner = "client!bb", name = "Yb", descriptor = "Lcd;")
    public static class23 field274 = class54.method414("sl_back", -1);

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lcd;")
    public static class23 field238 = class54.method414("Spiel)2Engine wird gestartet)3)3)3", -1);

    @OriginalMember(owner = "client!bb", name = "gc", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!bb", name = "Lb", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!bb", name = "Nb", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!bb", name = "Ob", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!bb", name = "Pb", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!bb", name = "Rb", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!bb", name = "Ub", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!bb", name = "Zb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!bb", name = "bc", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!bb", name = "ec", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bb", name = "fc", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bb", name = "Wb", descriptor = "Lpc;")
    public static class137 field272;

    @OriginalMember(owner = "client!bb", name = "kc", descriptor = "Ljava/awt/Frame;")
    public static Frame field286;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "[I")
    public static int[] field241;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "[[[B")
    public static byte[][][] field233;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZBI)V")
    public final void method63(boolean arg0, byte arg1, int arg2) {
        field213++;
        int var4 = this.field230[0];
        int var5 = this.field219[0];
        if (this.field288 != -1 && class20.method128(this.field288, (byte) 117).field1968 == 1) {
            this.field288 = -1;
        }
        if (this.field247 < 9) {
            this.field247++;
        }
        if (arg2 == 0) {
            var4++;
            var5--;
        }
        for (int var6 = this.field247; var6 > 0; var6--) {
            this.field219[var6] = this.field219[var6 - 1];
            this.field230[var6] = this.field230[var6 - 1];
            this.field212[var6] = this.field212[var6 - 1];
        }
        this.field212[0] = arg0;
        if (arg2 == 1) {
            var4++;
        }
        if (arg2 == 2) {
            var4++;
            var5++;
        }
        if (arg2 == 3) {
            var5--;
        }
        if (arg2 == 4) {
            var5++;
        }
        if (arg2 == 5) {
            var4--;
            var5--;
        }
        if (arg2 == 6) {
            var4--;
        }
        if (arg2 == 7) {
            var4--;
            var5++;
        }
        if (arg1 < 122) {
            this.field220 = -38;
        }
        this.field219[0] = var5;
        this.field230[0] = var4;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method64(int arg0) {
        field246 = null;
        field286 = null;
        int var1 = 44 % ((arg0 + 59) / 44);
        field274 = null;
        field241 = null;
        field238 = null;
        field233 = null;
        field272 = null;
        field228 = null;
        field257 = null;
        field235 = null;
        field243 = null;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public final void method65(int arg0) {
        this.field236 = 0;
        field281++;
        this.field247 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIB)V")
    public final void method66(int arg0, int arg1, int arg2, byte arg3) {
        field275++;
        if (arg3 <= 6) {
            return;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            if (arg0 >= this.field254[var5]) {
                this.field232[var5] = arg2;
                this.field258[var5] = arg1;
                this.field254[var5] = arg0 + 70;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)V")
    public static final void method67(long arg0, int arg1) {
        field234++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class157.field3145; var3++) {
            if (class189.field3758[var3] == arg0) {
                class28.field597++;
                class157.field3145--;
                for (int var4 = var3; var4 < class157.field3145; var4++) {
                    class189.field3758[var4] = class189.field3758[var4 + 1];
                    class131.field2717[var4] = class131.field2717[var4 + 1];
                }
                class1.field7 = class13.field296;
                class159.field3190.method631(163, -1);
                class159.field3190.method1199(arg0, arg1 ^ 0x712DA1DE);
                break;
            }
        }
        if (arg1 != -28138) {
            method64(96);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method68(Throwable arg0, boolean arg1) throws IOException {
        String var2;
        if (arg0 instanceof class180) {
            class180 var3 = (class180) arg0;
            var2 = var3.field3565 + " | ";
            arg0 = var3.field3563;
        } else {
            var2 = "";
        }
        field248++;
        StringWriter var4 = new StringWriter();
        if (arg1) {
            field238 = null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)Z")
    public boolean method69(boolean arg0) {
        if (arg0) {
            field259++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBZI)V")
    public final void method70(int arg0, byte arg1, boolean arg2, int arg3) {
        field280++;
        if (this.field288 != -1 && class20.method128(this.field288, (byte) 55).field1968 == 1) {
            this.field288 = -1;
        }
        if (!arg2) {
            int var5 = arg0 - this.field219[0];
            int var6 = arg3 - this.field230[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field247 < 9) {
                    this.field247++;
                }
                for (int var7 = this.field247; var7 > 0; var7--) {
                    this.field219[var7] = this.field219[var7 - 1];
                    this.field230[var7] = this.field230[var7 - 1];
                    this.field212[var7] = this.field212[var7 - 1];
                }
                this.field219[0] = arg0;
                this.field212[0] = false;
                this.field230[0] = arg3;
                return;
            }
        }
        this.field284 = 0;
        if (arg1 < 122) {
            this.field227 = -81;
        }
        this.field247 = 0;
        this.field236 = 0;
        this.field219[0] = arg0;
        this.field230[0] = arg3;
        this.field215 = this.field219[0] * 128 + this.field231 * 64;
        this.field277 = this.field230[0] * 128 + this.field231 * 64;
    }
}
