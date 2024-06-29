import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class187 extends class33 implements class438 {

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
    private boolean field2827;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "B")
    private byte field2830;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
    private boolean field2835;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "B")
    private byte field2844;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "S")
    private short field2841;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "Z")
    private boolean field2849;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
    private boolean field2845;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "Lr;")
    private class520 field2843;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Lk;")
    private class88 field2832;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "Z")
    public static boolean field2854;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "Led;")
    private class115 field2831;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1225(Throwable arg0, int arg1) throws IOException {
        ++field2848;
        String var3;
        if (arg0 instanceof class519) {
            class519 var2 = (class519) arg0;
            var3 = var2.field7713 + " | ";
            arg0 = var2.field7711;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 1) {
            return null;
        } else {
            PrintWriter var5 = new PrintWriter(var4);
            arg0.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                String var12;
                if (var10 == -1) {
                    var12 = var9;
                } else {
                    var12 = var9.substring(0, var10);
                }
                String var13 = var12.trim();
                String var14 = var13.substring(1 + var13.lastIndexOf(32));
                String var15 = var14.substring(var14.lastIndexOf(9) + 1);
                String var16 = var3 + var15;
                if (~var10 != 0 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (~var17 <= -1) {
                        var16 = var16 + var9.substring(var17 + 5, var11);
                    }
                }
                var3 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 < 30) {
            return -58;
        } else {
            ++field2840;
            return 65535 & this.field2841;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Lqa;B)V")
    public final void method174(class167 arg0, byte arg1) {
        ++field2846;
        Object var3 = null;
        class88 var5;
        if (this.field2832 == null && this.field2845) {
            class342 var4 = this.method1226(65535, 262144, arg0, true);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field2832;
            this.field2832 = null;
        }
        if (arg1 != 2) {
            field2854 = true;
        }
        if (var5 != null) {
            class639.method3698(var5, this.field2844, super.field362, super.field366, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        this.field2827 = false;
        if (arg0 != -33) {
            this.field2832 = null;
        }
        ++field2837;
        if (this.field2843 != null) {
            this.field2843.method1973(this.field2843.method1950() & -65537);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILqa;Z)Lrp;")
    private final class342 method1226(int arg0, int arg1, class167 arg2, boolean arg3) {
        ++field2838;
        class158 var5 = class312.field4690.method2004(false, this.field2841 & arg0);
        class543 var6;
        class543 var7;
        if (!this.field2835) {
            var6 = class562.field8337[this.field2844];
            if (~this.field2844 > -4) {
                var7 = class562.field8337[this.field2844 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class562.field8337[0];
            var6 = class287.field4219[this.field2844];
        }
        return var5.method918(super.field363, super.field362, var6, super.field366, 0, 22, arg3, arg1, this.field2830, var7, arg2);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            return true;
        } else {
            ++field2825;
            class520 var5 = this.method1227(arg1, 131072, (byte) 27);
            if (var5 != null) {
                class105 var6 = arg1.method1038();
                var6.method613(super.field362, super.field363, super.field366);
                return var5.method1963(arg0, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        ++field2828;
        if (arg0 != -5527) {
            this.field2844 = 92;
        }
        return this.field2830;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        ++field2853;
        if (this.field2843 == null) {
            return null;
        } else {
            class105 var3 = arg1.method1038();
            if (arg0 != -911932384) {
                this.method154((byte) -87);
            }
            var3.method613(super.field362, super.field363, super.field366);
            class239 var4 = null;
            if (this.field2849) {
                var4 = class210.method1365(false, 1);
            }
            this.field2843.method1965(var3, var4 == null ? null : var4.field3503[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        if (!arg0) {
            return -60;
        } else {
            ++field2851;
            return 22;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        int var3 = 43 / ((14 - arg0) / 48);
        ++field2836;
        if (this.field2831 == null) {
            this.field2831 = class411.method2443(-27621, super.field363, super.field362, super.field366, this.method1227(arg1, 0, (byte) 64));
        }
        return this.field2831;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        ++field2829;
        if (!arg0) {
            this.method164(-102, (class167) null, -101, (byte) -12);
        }
        return this.field2827;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;IB)Lr;")
    private final class520 method1227(class167 arg0, int arg1, byte arg2) {
        ++field2852;
        if (this.field2843 != null && arg0.method1026(this.field2843.method1950(), arg1) == 0) {
            return this.field2843;
        } else {
            class342 var4 = this.method1226(65535, arg1, arg0, false);
            if (arg2 < 21) {
                this.field2831 = null;
            }
            return var4 != null ? var4.field4999 : null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field2833;
        if (arg0 != -74) {
            this.method160(-51, (class167) null, -48, -113, true, (class198) null, 97);
        }
        if (this.field2843 != null) {
            this.field2843.method1961();
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BILqa;)Lr;")
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        if (arg0 != -127) {
            this.method174((class167) null, (byte) -22);
        }
        ++field2839;
        return this.method1227(arg2, arg1, (byte) 44);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field2847;
        if (!arg1) {
            this.method166((class167) null, false);
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lqa;Lih;IIIIZIZ)V")
    public class187(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2011, arg1.field2074, arg1.field2062);
        this.field2827 = arg8;
        this.field2830 = (byte) arg7;
        this.field2835 = arg6;
        super.field366 = arg5;
        this.field2844 = (byte) arg2;
        this.field2841 = (short) arg1.field2010;
        super.field362 = arg3;
        this.field2849 = arg1.field2028 != 0 && !arg6;
        this.field2845 = arg0.method1007() && arg1.field2078 && !this.field2835 && class94.field1158.method131(false, class239.field3499) != 0;
        int var10 = 2048;
        if (this.field2827) {
            var10 |= 65536;
        }
        class342 var11 = this.method1226(65535, var10, arg0, this.field2845);
        if (var11 != null) {
            this.field2843 = var11.field4999;
            this.field2832 = var11.field5001;
            if (this.field2827) {
                this.field2843 = this.field2843.method369((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        ++field2842;
        if (arg2 == -4) {
            if (arg5 instanceof class187) {
                class187 var8 = (class187) arg5;
                if (this.field2843 != null && var8.field2843 != null) {
                    this.field2843.method1952(var8.field2843, arg6, arg3, arg0, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z")
    public final boolean method162(int arg0) {
        ++field2834;
        return arg0 != -177 ? true : this.field2845;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;B)V")
    public final void method158(class167 arg0, byte arg1) {
        ++field2826;
        Object var3 = null;
        class88 var5;
        if (this.field2832 == null && this.field2845) {
            class342 var4 = this.method1226(65535, 262144, arg0, true);
            var5 = var4 == null ? null : var4.field5001;
        } else {
            var5 = this.field2832;
            this.field2832 = null;
        }
        if (var5 != null) {
            class253.method1607(var5, this.field2844, super.field362, super.field366, (boolean[]) null);
        }
        if (arg1 > -76) {
            this.method164(-14, (class167) null, 107, (byte) -52);
        }
    }

    static {
        new class487("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        new class487("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field2854 = false;
    }
}
