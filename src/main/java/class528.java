import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class528 {

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    private int field7798 = -1;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Z")
    private boolean field7807 = true;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    private int field7788;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    private int field7790;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[Lte;")
    private class184[] field7796;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    private int field7794;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    private int field7803;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lte;")
    private class184[] field7802;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lte;")
    private class184 field7792;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field7799 = 0;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Z")
    public static boolean field7808;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    private int field7791;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    private int field7804;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lf;")
    private class191 field7795;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLqa;)Z")
    public final boolean method3118(int arg0, byte arg1, class496 arg2) {
        if (arg1 != -99) {
            return false;
        }
        if (this.field7798 != arg0) {
            this.field7798 = arg0;
            int var4 = class353.method2231(arg0, (byte) -84);
            if (arg0 < var4) {
                var4 = class412.method2505(17202, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field7791 != var4) {
                this.field7791 = var4;
                this.field7795 = null;
            }
            if (this.field7796 != null) {
                this.field7804 = 0;
                int[] var5 = new int[this.field7796.length];
                for (int var6 = 0; var6 < this.field7796.length; var6++) {
                    class184 var7 = this.field7796[var6];
                    if (var7.method1311(this.field7794, this.field7790, this.field7788, this.field7798)) {
                        var5[this.field7804] = var7.field2603;
                        this.field7802[this.field7804++] = var7;
                    }
                }
                class386.method2385(this.field7802, 0, var5, true, this.field7804 - 1);
            }
            this.field7807 = true;
        }
        field7806++;
        boolean var8 = false;
        if (this.field7807) {
            this.field7807 = false;
            for (int var9 = this.field7804 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field7802[var9].method1312(arg2, this.field7792);
                var8 |= var10;
                this.field7807 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public final void method3119(int arg0) {
        if (arg0 >= -18) {
            return;
        }
        field7797++;
        if (this.field7796 != null) {
            for (int var2 = 0; var2 < this.field7796.length; var2++) {
                this.field7796[var2].method1305();
            }
        }
        this.field7795 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIILhu;I)Ljava/awt/Frame;")
    public static final Frame method3120(boolean arg0, int arg1, int arg2, int arg3, class469 arg4, int arg5) {
        field7801++;
        if (!arg4.method2794((byte) 126)) {
            return null;
        }
        if (arg1 == 0) {
            class168[] var6 = class65.method436(arg4, -93);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2441 == arg5 && var6[var8].field2437 == arg3 && (arg2 == 0 || var6[var8].field2443 == arg2) && (!var7 || var6[var8].field2439 > arg1)) {
                    arg1 = var6[var8].field2439;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class125 var9 = arg4.method2810(arg2, arg5, arg3, (byte) -30, arg1);
        while (var9.field1791 == 0) {
            class106.method710(10L, (byte) 6);
        }
        Frame var10 = (Frame) var9.field1793;
        if (var10 == null) {
            return null;
        }
        if (arg0) {
            method3122((byte) 39, null);
        }
        if (var9.field1791 == 2) {
            class158.method1030(arg4, 0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILqa;IIII)V")
    public final void method3121(int arg0, int arg1, int arg2, int arg3, int arg4, class496 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg7 & 0x3FFF;
        field7805++;
        if (this.field7803 == -1) {
            arg5.method1112(arg9, arg4, arg1, arg6, arg3, 0);
        } else {
            class263 var12 = class359.field5552.method1558(this.field7803, (byte) 109);
            if (this.field7795 == null && class359.field5552.method1556(true, this.field7803)) {
                int[] var13 = var12.field3672 ? class359.field5552.method1552(0.7F, this.field7803, true, this.field7791, false, this.field7791) : class359.field5552.method1551(false, this.field7803, this.field7791, this.field7791, 0.7F, 19881);
                this.field7795 = arg5.method1097(var13, 0, this.field7791, this.field7791, this.field7791);
            }
            if (!var12.field3672) {
                arg5.method1112(arg9, arg4, arg1, arg6, arg3, 0);
            }
            if (this.field7795 != null) {
                int var14 = var12.field3672 ? 0 : 1;
                int var15 = arg2 * arg6 / -4096;
                int var16;
                for (var16 = (arg1 - arg6) / 2 + (arg6 * var11 / 4096); var16 > arg6; var16 -= arg6) {
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (arg6 < var15) {
                    var15 -= arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg1; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field7795.method34(arg9 + var17, arg4 + var18, arg6, arg6, 1, 0, var14);
                    }
                }
            }
        }
        if (arg8 >= -124) {
            field7808 = false;
        }
        for (int var19 = this.field7804 - 1; var19 >= 0; var19--) {
            this.field7802[var19].method1310(arg5, arg9, arg4, arg1, arg6, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLns;)V")
    public static final void method3122(byte arg0, class438 arg1) {
        int var2 = -7 / ((arg0 - 19) / 47);
        field7800++;
        class394.field5991 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3123(int arg0, String arg1) {
        field7789++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        if (arg0 != -28124) {
            field7799 = 20;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I[Lte;IIII)V")
    public class528(int arg0, class184[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7788 = arg5;
        this.field7790 = arg4;
        this.field7796 = arg1;
        this.field7794 = arg3;
        this.field7803 = arg0;
        if (arg1 == null) {
            this.field7792 = null;
            this.field7802 = null;
        } else {
            this.field7802 = new class184[arg1.length];
            this.field7792 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    static {
        new class375("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7809 = 0;
        field7808 = true;
    }
}
