import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class13 extends class421 implements class210 {

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "B")
    private byte field118;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Z")
    private boolean field104;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "S")
    private short field105;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
    private boolean field100;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "B")
    private byte field103;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Z")
    private boolean field98;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "B")
    private byte field116;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Z")
    private boolean field107;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Ln;")
    public class468 field94;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Ldh;")
    private class183 field95;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
    public static int[] field108 = new int[32];

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "S")
    public static short field102 = 320;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[Lss;")
    public static class189[] field111 = new class189[29];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
    public static int[] field115 = new int[100];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field99;

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field108[var1] = var0 + -1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V", line = 4)
    public static void method66(int arg0) {
        field115 = null;
        field108 = null;
        if (arg0 != 28132) {
            method67((class435) null, (class435) null, (class435) null, (class435) null, (byte) -51);
        }
        field111 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lnl;Lnl;Lnl;Lnl;B)V", line = 21)
    public static final void method67(class435 arg0, class435 arg1, class435 arg2, class435 arg3, byte arg4) {
        ++field117;
        if (arg4 >= -26) {
            field108 = null;
        }
        class38.field479 = arg0;
        class36.field389 = arg1;
        class390.field5395 = arg2;
        class365.field5021 = arg3;
        class263.field3787 = new class172[class38.field479.method2658(-1)][];
        class340.field4698 = new boolean[class38.field479.method2658(-1)];
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lvc;Lnm;IIIIZIIZ)V", line = 39)
    public class13(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class83.method703((byte) -117, arg7, arg8));
        this.field118 = (byte) arg7;
        this.field104 = arg9;
        this.field105 = (short) arg1.field3887;
        this.field100 = arg6;
        this.field103 = (byte) arg8;
        this.field98 = arg1.field3902 != 0 && !arg6;
        super.field5833 = (short) arg3;
        this.field116 = (byte) arg2;
        super.field5831 = (short) arg5;
        this.field107 = arg0.method291() && arg1.field3876 && !this.field100 && ~class99.field1396 != -1;
        int var11 = 1024;
        if (this.field104) {
            var11 |= 32768;
        }
        class406 var12 = this.method72(false, this.field107, var11, arg0);
        if (var12 != null) {
            this.field94 = var12.field5545;
            this.field95 = var12.field5541;
            if (this.field104) {
                this.field94 = this.field94.method1600((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z", line = 76)
    public final boolean method68(int arg0) {
        int var2 = -110 / ((arg0 - 2) / 57);
        ++field123;
        return this.field104;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lvc;I)Lep;", line = 89)
    public final class309 method69(class89 arg0, int arg1) {
        ++field119;
        if (this.field94 == null) {
            return null;
        } else {
            class257 var3 = arg0.method306();
            var3.method96(super.field5833, super.field5830, super.field5831);
            class309 var4 = null;
            if (this.field98) {
                var4 = class163.method1205((byte) 40, 1);
            }
            if (arg1 != 10228) {
                return null;
            } else {
                this.field94.method1592(var3, var4 == null ? null : var4.field4383[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 117)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        if (arg1 <= 40) {
            field108 = null;
        }
        if (arg5 instanceof class13) {
            class13 var8 = (class13) arg5;
            if (this.field94 != null && var8.field94 != null) {
                this.field94.method1557(var8.field94, arg3, arg6, arg4, arg0);
            }
        } else if (arg5 instanceof class416) {
            class416 var9 = (class416) arg5;
            if (this.field94 != null && var9.field5693 != null) {
                this.field94.method1557(var9.field5693, arg3, arg6, arg4, arg0);
            }
        }
        ++field114;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I", line = 148)
    public final int method71(byte arg0) {
        if (arg0 < 81) {
            return 1;
        } else {
            ++field120;
            return this.field103;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZILvc;)Lco;", line = 161)
    private final class406 method72(boolean arg0, boolean arg1, int arg2, class89 arg3) {
        ++field101;
        if (arg0) {
            return null;
        } else {
            class267 var5 = class468.field6599.method506(-126, 65535 & this.field105);
            class241 var6;
            class241 var7;
            if (!this.field100) {
                if (~this.field116 <= -4) {
                    var6 = null;
                } else {
                    var6 = class190.field2858[this.field116 + 1];
                }
                var7 = class190.field2858[this.field116];
            } else {
                var6 = class190.field2858[0];
                var7 = class427.field5960[this.field116];
            }
            return var5.method1811(super.field5831, true, var6, arg1, this.field103, arg2, arg3, super.field5833, this.field118, super.field5830, var7);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILvc;I)Ln;", line = 191)
    private final class468 method73(int arg0, class89 arg1, int arg2) {
        ++field97;
        if (this.field94 != null && ~arg1.method362(this.field94.method1574(), arg2) == -1) {
            return this.field94;
        } else if (arg0 != -2096) {
            return null;
        } else {
            class406 var4 = this.method72(false, false, arg2, arg1);
            return var4 == null ? null : var4.field5545;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 213)
    public static final String method74(byte arg0, Throwable arg1) throws IOException {
        ++field112;
        String var3;
        if (arg1 instanceof class38) {
            class38 var2 = (class38) arg1;
            var3 = var2.field475 + " | ";
            arg1 = var2.field470;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        int var6 = 76 % ((-63 - arg0) / 58);
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var3 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (~var11 == 0) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(1 + var14.lastIndexOf(32));
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (~var18 <= -1) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V", line = 284)
    public final void method75(byte arg0) {
        this.field104 = false;
        ++field93;
        if (arg0 != 111) {
            method67((class435) null, (class435) null, (class435) null, (class435) null, (byte) 19);
        }
        if (this.field94 != null) {
            this.field94.method1588(-32769 & this.field94.method1574());
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BILvc;)Ln;", line = 300)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 != -106) {
            return null;
        } else {
            ++field121;
            return this.method73(-2096, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILvc;II)Z", line = 311)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field106;
        class468 var5 = this.method73(-2096, arg1, 65536);
        if (arg0 != 0) {
            this.field103 = 121;
        }
        if (var5 != null) {
            class257 var6 = arg1.method306();
            var6.method96(super.field5833, super.field5830, super.field5831);
            return var5.method1593(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLvc;)V", line = 335)
    public final void method78(boolean arg0, class89 arg1) {
        ++field125;
        Object var3 = null;
        if (!arg0) {
            this.method84(78);
        }
        class183 var5;
        if (this.field95 == null && this.field107) {
            class406 var4 = this.method72(false, true, 131072, arg1);
            var5 = var4 != null ? var4.field5541 : null;
        } else {
            var5 = this.field95;
            this.field95 = null;
        }
        if (var5 != null) {
            class141.method1021(var5, this.field116, super.field5833, super.field5831, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILae;II)V", line = 362)
    public static final void method79(int arg0, class172 arg1, int arg2, int arg3) {
        ++field113;
        if (class464.field6538 == null && !class205.field3005) {
            if (arg1 != null && class110.method872(25704, arg1) != null) {
                class464.field6538 = arg1;
                class86.field1215 = class110.method872(25704, arg1);
                class135.field1876 = arg2;
                class122.field1672 = false;
                class139.field1927 = arg0;
                class423.field5856 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I", line = 381)
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            this.field107 = false;
        }
        ++field110;
        return 65535 & this.field105;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V", line = 392)
    public static final void method81(byte arg0) {
        if (arg0 > 40) {
            ++field109;
            if (class65.field961 != 3) {
                class379.field5212 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z", line = 409)
    public final boolean method82(byte arg0) {
        ++field122;
        if (arg0 < 89) {
            this.field105 = -57;
        }
        return this.field107;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I", line = 420)
    public final int method83(byte arg0) {
        ++field92;
        return arg0 <= 70 ? 27 : this.field118;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 431)
    public final void method84(int arg0) {
        if (arg0 != 16805) {
            this.field98 = true;
        }
        ++field96;
        if (this.field94 != null) {
            this.field94.method1595();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lvc;B)V", line = 445)
    public final void method85(class89 arg0, byte arg1) {
        ++field124;
        Object var3 = null;
        class183 var5;
        if (this.field95 == null && this.field107) {
            class406 var4 = this.method72(false, true, 131072, arg0);
            var5 = var4 == null ? null : var4.field5541;
        } else {
            var5 = this.field95;
            this.field95 = null;
        }
        if (arg1 != -24) {
            field102 = 116;
        }
        if (var5 != null) {
            class404.method2425(var5, this.field116, super.field5833, super.field5831, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZLvc;)V", line = 476)
    public final void method86(boolean arg0, class89 arg1) {
        if (!arg0) {
            ++field99;
        }
    }
}
