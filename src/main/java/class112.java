import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class112 {

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    private int field1808 = -1;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
    private boolean field1812 = true;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[Lbm;")
    private class216[] field1809;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lbm;")
    private class216[] field1802;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lbm;")
    private class216 field1806;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lo;")
    private class359 field1815;

    static {
        new class157("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILza;IIIII)V", line = 10)
    public final void method844(int arg0, int arg1, int arg2, int arg3, class295 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg5 + arg6 & 0x3FFF;
        field1803++;
        if (this.field1801 == -1) {
            arg4.method508(arg0, arg2, arg7, arg9, arg8, 0);
        } else {
            class249 var12 = class423.field6147.method914(false, this.field1801);
            if (this.field1815 == null && class423.field6147.method918(this.field1801, 83)) {
                int[] var13 = var12.field3381 ? class423.field6147.method915(this.field1813, this.field1801, 0.7F, (byte) 43, false, this.field1813) : class423.field6147.method917(this.field1813, true, 0.7F, this.field1801, this.field1813, false);
                this.field1815 = arg4.method510(var13, 0, this.field1813, this.field1813, this.field1813);
            }
            if (!var12.field3381) {
                arg4.method508(arg0, arg2, arg7, arg9, arg8, 0);
            }
            if (this.field1815 != null) {
                int var14 = var12.field3381 ? 0 : 1;
                int var15 = arg3 * arg9 / -4096;
                int var16;
                for (var16 = (arg7 - arg9) / 2 + (arg9 * var11 / 4096); var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg7; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field1815.method206(arg0 + var17, arg2 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        if (arg1 != -4926) {
            method850(94, null);
        }
        for (int var19 = this.field1810 - 1; var19 >= 0; var19--) {
            this.field1802[var19].method1357(arg4, arg0, arg2, arg7, arg9, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 93)
    public static final void method845() {
        for (int var0 = 0; var0 < class265.field3572; var0++) {
            class434 var1 = class140.field2099[var0];
            class387.method2300(var1);
            class140.field2099[var0] = null;
        }
        class265.field3572 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 106)
    public final void method846(byte arg0) {
        if (this.field1809 != null) {
            for (int var2 = 0; var2 < this.field1809.length; var2++) {
                this.field1809[var2].method1360();
            }
        }
        if (arg0 > 33) {
            field1816++;
            this.field1815 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLza;)Z", line = 131)
    public final boolean method847(int arg0, boolean arg1, class295 arg2) {
        if (this.field1808 != arg0) {
            this.field1808 = arg0;
            int var4 = class274.method1604(arg0, (byte) -36);
            if (arg0 < var4) {
                var4 = class166.method1158(true, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1813 != var4) {
                this.field1813 = var4;
                this.field1815 = null;
            }
            if (this.field1809 != null) {
                this.field1810 = 0;
                int[] var5 = new int[this.field1809.length];
                for (int var6 = 0; var6 < this.field1809.length; var6++) {
                    class216 var7 = this.field1809[var6];
                    if (var7.method1361(this.field1807, this.field1814, this.field1804, this.field1808)) {
                        var5[this.field1810] = var7.field3071;
                        this.field1802[this.field1810++] = var7;
                    }
                }
                class84.method658(this.field1810 - 1, 0, (byte) -3, var5, this.field1802);
            }
            this.field1812 = true;
        }
        if (!arg1) {
            this.field1801 = -15;
        }
        field1811++;
        boolean var8 = false;
        if (this.field1812) {
            this.field1812 = false;
            for (int var9 = this.field1810 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1802[var9].method1354(arg2, this.field1806);
                var8 |= var10;
                this.field1812 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I[Lbm;IIII)V", line = 471)
    public class112(int arg0, class216[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1804 = arg5;
        this.field1807 = arg3;
        this.field1814 = arg4;
        this.field1801 = arg0;
        this.field1809 = arg1;
        if (arg1 == null) {
            this.field1806 = null;
            this.field1802 = null;
        } else {
            this.field1802 = new class216[arg1.length];
            this.field1806 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltn;Z)Z", line = 227)
    public static final boolean method848(class434 arg0, boolean arg1) {
        boolean var2 = class492.field7122 == class36.field554;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method100(0);
        if (arg0.field6290 < 0 || arg0.field6277 < 0 || arg0.field6288 >= class124.field1916 || arg0.field6282 >= class177.field2664) {
            return false;
        }
        for (int var6 = arg0.field6290; var6 <= arg0.field6288; var6++) {
            for (int var9 = arg0.field6277; var9 <= arg0.field6282; var9++) {
                class532 var10 = class307.method1778(arg0.field6279, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6290) {
                        var11++;
                    }
                    if (var6 < arg0.field6288) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6277) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6282) {
                        var11 += 2;
                    }
                    class201 var12 = class485.method2873(arg0, var11, 103);
                    class201 var13 = var10.field7828;
                    if (var13 == null) {
                        var10.field7828 = var12;
                    } else {
                        while (var13.field2918 != null) {
                            var13 = var13.field2918;
                        }
                        var13.field2918 = var12;
                    }
                    var10.field7826 = (byte) (var10.field7826 | var11);
                    if (var2 && (class436.field6304[var6][var9] & 0xFF000000) != 0) {
                        var3 = class436.field6304[var6][var9];
                        var4 = class92.field1512[var6][var9];
                        var5 = class34.field526[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6290; var7 <= arg0.field6288; var7++) {
                for (int var8 = arg0.field6277; var8 <= arg0.field6282; var8++) {
                    if ((class436.field6304[var7][var8] & 0xFF000000) == 0) {
                        class436.field6304[var7][var8] = var3;
                        class92.field1512[var7][var8] = var4;
                        class34.field526[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class140.field2099[class265.field3572++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lza;Llb;IIIII)V", line = 334)
    public static final void method849(class295 arg0, class186 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class265.field3571 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class124.field1916) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class177.field2664 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class532 var15 = class103.field1632[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class492.field7122[var12].method85(var13, var14) + class492.field7122[var12].method85(var13 + 1, var14) + class492.field7122[var12].method85(var13, var14 + 1) + class492.field7122[var12].method85(var13 + 1, var14 + 1)) / 4 - (class492.field7122[arg2].method85(arg3, arg4) + class492.field7122[arg2].method85(arg3 + 1, arg4) + class492.field7122[arg2].method85(arg3, arg4 + 1) + class492.field7122[arg2].method85(arg3 + 1, arg4 + 1)) / 4;
                                    class168 var17 = var15.field7830;
                                    class168 var18 = var15.field7822;
                                    if (var17 != null && var17.method169(-28206)) {
                                        arg1.method161(var17, (var13 - arg3) * class117.field1845 + (1 - arg5) * class392.field5656, var7, (var14 - arg4) * class117.field1845 + (1 - arg6) * class392.field5656, (byte) 123, var16, arg0);
                                    }
                                    if (var18 != null && var18.method169(-28206)) {
                                        arg1.method161(var18, (var13 - arg3) * class117.field1845 + (1 - arg5) * class392.field5656, var7, (var14 - arg4) * class117.field1845 + (1 - arg6) * class392.field5656, (byte) 124, var16, arg0);
                                    }
                                    for (class201 var19 = var15.field7828; var19 != null; var19 = var19.field2918) {
                                        class434 var20 = var19.field2915;
                                        if (var20 != null && var20.method169(-28206) && (var20.field6290 == var13 || var8 == var13) && (var20.field6277 == var14 || var10 == var14)) {
                                            int var21 = var20.field6288 + 1 - var20.field6290;
                                            int var22 = var20.field6282 + 1 - var20.field6277;
                                            arg1.method161(var20, (var20.field6290 - arg3) * class117.field1845 + (var21 - arg5) * class392.field5656, var7, (var20.field6277 - arg4) * class117.field1845 + (var22 - arg6) * class392.field5656, (byte) 56, var16, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 422)
    public static final String method850(int arg0, String arg1) {
        field1805++;
        int var2 = arg1.length();
        if (arg0 != -63) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}
