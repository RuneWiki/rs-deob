import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class8 extends class40 {

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    private int field99 = 2048;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    private int field111 = 10;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    private int field113 = 0;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "Lpm;")
    public static class349 field112 = new class349("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lpm;")
    public static class349 field114 = new class349("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "[I")
    private int[] field100;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "[I")
    private int[] field98;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Canvas;Lbk;II)Lvq;")
    public static final class269 method38(Canvas arg0, class211 arg1, int arg2, int arg3) {
        ++field105;
        int var4 = 82 % (-arg3 / 39);
        return new class416(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        if (arg0 == -23) {
            ++field103;
            this.method40(0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    private final void method40(int arg0) {
        ++field107;
        int var2 = 0;
        this.field100 = new int[this.field111 - -1];
        this.field98 = new int[this.field111 + 1];
        int var3 = 4096 / this.field111;
        int var4 = this.field99 * var3 >> 12;
        for (int var5 = 0; this.field111 > var5; ++var5) {
            this.field100[var5] = var2;
            this.field98[var5] = var2 + var4;
            var2 += var3;
        }
        this.field100[this.field111] = 4096;
        this.field98[this.field111] = this.field98[arg0] + 4096;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public static final void method41(int arg0) {
        ++field104;
        class15 var1 = class293.field4241;
        synchronized (class293.field4241) {
            int var2 = 59 / ((15 - arg0) / 37);
            class293.field4241.method102((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V")
    public static final void method42(int arg0, int arg1, int arg2) {
        ++field110;
        class361 var3 = class269.method1834(arg2, 0);
        int var4 = var3.field5206;
        int var5 = var3.field5199;
        int var6 = var3.field5205;
        int var7 = class136.field2107[-var5 + var6];
        if (arg0 < ~arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class446.method2783(arg1 << var5 & var8 | class169.field2397[var4] & ~var8, 92, var4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field108;
        if (arg1 < 79) {
            field114 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field113 = arg2.method837(true);
                }
            } else {
                this.field99 = arg2.method798(false);
            }
        } else {
            this.field111 = arg2.method837(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field109;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1];
            if (this.field113 != 0) {
                for (int var5 = 0; class410.field5886 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class9.field124[var5];
                    int var9 = this.field113;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 - (4096 - var4) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field111; ++var10) {
                        if (~var6 <= ~this.field100[var10] && this.field100[var10 - -1] > var6) {
                            if (this.field98[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field111; ++var12) {
                    if (this.field100[var12] <= var4 && ~this.field100[var12 - -1] < ~var4) {
                        if (~var4 > ~this.field98[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class271.method1855(var3, 0, class410.field5886, var11);
            }
        }
        if (arg0 >= -20) {
            method38((Canvas) null, (class211) null, -128, -18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static void method45(int arg0) {
        field114 = null;
        if (arg0 == 1) {
            field112 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method46(Throwable arg0, byte arg1) throws IOException {
        ++field102;
        String var2;
        if (!(arg0 instanceof class93)) {
            var2 = "";
        } else {
            class93 var3 = (class93) arg0;
            arg0 = var3.field1194;
            var2 = var3.field1191 + " | ";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 > -68) {
            method38((Canvas) null, (class211) null, 48, 91);
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 - -1);
            String var12;
            if (~var10 != 0) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var2 + var15;
            if (var10 != -1 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
